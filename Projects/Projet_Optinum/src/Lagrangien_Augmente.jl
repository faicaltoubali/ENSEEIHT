@doc doc"""
Résolution des problèmes de minimisation sous contraintes d'égalités

# Syntaxe
```julia
Lagrangien_Augmente(algo,fonc,contrainte,gradfonc,hessfonc,grad_contrainte,
			hess_contrainte,x0,options)
```

# Entrées
  * **algo** 		   : (String) l'algorithme sans contraintes à utiliser:
    - **"newton"**  : pour l'algorithme de Newton
    - **"cauchy"**  : pour le pas de Cauchy
    - **"gct"**     : pour le gradient conjugué tronqué
  * **fonc** 		   : (Function) la fonction à minimiser
  * **contrainte**	   : (Function) la contrainte [x est dans le domaine des contraintes ssi ``c(x)=0``]
  * **gradfonc**       : (Function) le gradient de la fonction
  * **hessfonc** 	   : (Function) la hessienne de la fonction
  * **grad_contrainte** : (Function) le gradient de la contrainte
  * **hess_contrainte** : (Function) la hessienne de la contrainte
  * **x0** 			   : (Array{Float,1}) la première composante du point de départ du Lagrangien
  * **options**		   : (Array{Float,1})
    1. **epsilon** 	   : utilisé dans les critères d'arrêt
    2. **tol**         : la tolérance utilisée dans les critères d'arrêt
    3. **itermax** 	   : nombre maximal d'itération dans la boucle principale
    4. **lambda0**	   : la deuxième composante du point de départ du Lagrangien
    5. **mu0,tho** 	   : valeurs initiales des variables de l'algorithme

# Sorties
* **xmin**		   : (Array{Float,1}) une approximation de la solution du problème avec contraintes
* **fxmin** 	   : (Float) ``f(x_{min})``
* **flag**		   : (Integer) indicateur du déroulement de l'algorithme
   - **0**    : convergence
   - **1**    : nombre maximal d'itération atteint
   - **(-1)** : une erreur s'est produite
* **niters** 	   : (Integer) nombre d'itérations réalisées

# Exemple d'appel
```julia
using LinearAlgebra
f(x)=100*(x[2]-x[1]^2)^2+(1-x[1])^2
gradf(x)=[-400*x[1]*(x[2]-x[1]^2)-2*(1-x[1]) ; 200*(x[2]-x[1]^2)]
hessf(x)=[-400*(x[2]-3*x[1]^2)+2  -400*x[1];-400*x[1]  200]
algo = "gct" # ou newton|gct
x0 = [1; 0]
options = []
contrainte(x) =  (x[1]^2) + (x[2]^2) -1.5
grad_contrainte(x) = [2*x[1] ;2*x[2]]
hess_contrainte(x) = [2 0;0 2]
output = Lagrangien_Augmente(algo,f,contrainte,gradf,hessf,grad_contrainte,hess_contrainte,x0,options)
```
"""
function Lagrangien_Augmente(algo,fonc::Function,contrainte::Function,gradfonc::Function,
	hessfonc::Function,grad_contrainte::Function,hess_contrainte::Function,x0,options)

	if options == []
		epsilon = 1e-8
		tol = 1e-5
		itermax = 50
		lambda0 = 2
		mu0 = 100
		tho = 2
	else
		epsilon = options[1]
		tol = options[2]
		itermax = options[3]
		lambda0 = options[4]
		mu0 = options[5]
		tho = options[6]
	end

	#Definitions des données
    n = length(x0)
    xmin = zeros(n)
	fxmin = 0
	flag = -2
	iter = 0
	alpha = 0.1
	beta = 0.9
	epsilon0 = 1/mu0
	ethachapeau = 0.1258925

	#Definitions des variables
	etha_k = ethachapeau / (mu0^alpha)
	x_k = x0
	mu_k = mu0
	lambda_k = lambda0
	epsilon_k = epsilon0

	La(x) = fonc(x) + transpose(lambda_k) * contrainte(x) + (mu_k/2) * norm(contrainte(x))^2
	grad_La(x) = gradfonc(x) + (lambda_k)'*grad_contrainte(x) + (mu_k)*grad_contrainte(x)*contrainte(x)
	Hess_La(x) = hessfonc(x) + (lambda_k)'*hess_contrainte(x) + (mu_k)*hess_contrainte(x)*contrainte(x) + (mu_k)*grad_contrainte(x)*grad_contrainte(x)'

	grad_Lac(x,y) = gradfonc(x) + (y)'*grad_contrainte(x)

while flag == -2

		iter += 1
		iter_while = 0

		if algo == "newton"
			while norm(grad_La(x_k)) > epsilon_k && iter_while <= itermax
				x_k,f_minN,flagN,iterN = Algorithme_De_Newton(La,grad_La,Hess_La,x_k,[])
				iter_while += 1
        	end

		elseif algo == "cauchy"
			while norm(grad_La(x_k)) > epsilon_k && iter_while <= itermax
				x_k,f_minC,flagC,iterC = Regions_De_Confiance("cauchy", La,grad_La,Hess_La,x_k,[])
				iter_while += 1
			end

		elseif algo == "gct"
			while norm(grad_La(x_k)) > epsilon_k && iter_while <= itermax
				x_k,f_minG,flagG,iterG = Regions_De_Confiance("gct", La,grad_La,Hess_La,x_k,[])
				iter_while += 1
			end
		end

        if iter_while == itermax
			flag = -1
		elseif  norm(grad_Lac(x_k, lambda_k)) <= max(tol*norm(grad_Lac(x0, lambda0)), epsilon) && norm(contrainte(x_k)) <= max(tol*norm(contrainte(x0)), epsilon)
			flag = 0
		elseif iter == itermax
			flag = 1

		else
				if norm(contrainte(x_k)) <= etha_k
					lambda_k += mu_k*contrainte(x_k)
					epsilon_k = epsilon_k/mu_k
					etha_k = etha_k/(mu_k^(beta))
	  			else
		  			mu_k = tho*mu_k
		  			epsilon_k = epsilon0/mu_k
		  			etha_k = ethachapeau/(mu_k^(alpha))
	  			end

		end
end

xmin = x_k
fxmin = fonc(x_k)

	return xmin,fxmin,flag,iter
end
