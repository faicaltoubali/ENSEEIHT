@doc doc"""
Minimise le problème : ``min_{||s||< \delta_{k}} q_k(s) = s^{t}g + (1/2)s^{t}Hs``
                        pour la ``k^{ème}`` itération de l'algorithme des régions de confiance

# Syntaxe
```julia
sk = Gradient_Conjugue_Tronque(fk,gradfk,hessfk,option)
```

# Entrées :
   * **gradfk**           : (Array{Float,1}) le gradient de la fonction f appliqué au point xk
   * **hessfk**           : (Array{Float,2}) la Hessienne de la fonction f appliqué au point xk
   * **options**          : (Array{Float,1})
      - **delta**    : le rayon de la région de confiance
      - **max_iter** : le nombre maximal d'iterations
      - **tol**      : la tolérance pour la condition d'arrêt sur le gradient


# Sorties:
   * **s** : (Array{Float,1}) le pas s qui approche la solution du problème : ``min_{||s||< \delta_{k}} q(s)``

# Exemple d'appel:
```julia
gradf(x)=[-400*x[1]*(x[2]-x[1]^2)-2*(1-x[1]) ; 200*(x[2]-x[1]^2)]
hessf(x)=[-400*(x[2]-3*x[1]^2)+2  -400*x[1];-400*x[1]  200]
xk = [1; 0]
options = []
s = Gradient_Conjugue_Tronque(gradf(xk),hessf(xk),options)
```
"""
function Gradient_Conjugue_Tronque(gradfk,hessfk,options)

    "# Si option est vide on initialise les 3 paramètres par défaut"
    if options == []
        deltak = 2
        max_iter = 50
        tol = 1e-6
    else
        deltak = options[1]
        max_iter = options[2]
        tol = options[3]
    end

   n = length(gradfk)
   s = zeros(n)
   sortir = false

#Initisalisation
j = 0
sj = zeros(n)
s = zeros(n)
gj = gradfk
pj = -gj
q(s) = transpose(gradfk)*s + (1/2) * transpose(s)*hessfk*s


while j <= max_iter && sortir == false

 if norm(gj) != 0
    kj = transpose(pj)*hessfk*pj

    discriminant = (transpose(pj)*sj)^2 + (norm(pj)^2)*(deltak^2 - norm(sj)^2)
    sigma1 = ((-transpose(sj)*pj)+sqrt(discriminant))/(norm(pj)^2)
    sigma2 = ((-transpose(sj)*pj)-sqrt(discriminant))/(norm(pj)^2)


    if kj <= 0
        if q(sj + sigma1*pj) <= q(sj + sigma2*pj)
            s = sj + sigma1 * pj
            #s = sj
        else
            s = sj + sigma2 * pj
            #s = sj
        end
        sortir = true
    end


  if sortir == false
    alphaj = (transpose(gj)*gj)/kj
    if norm(sj + alphaj * pj) >= deltak
        if sigma1 >= 0
            s = sj + sigma1 * pj
        elseif sigma2 >= 0
            s = sj + sigma2 * pj
        end
        sortir = true
    end
  end


  if sortir == false

        sj += alphaj * pj
        gj0 =  gj
        gj += alphaj * hessfk * pj
        betaj = (transpose(gj)*gj)/(transpose(gj0)*gj0)
        pj  = -gj + betaj * pj

        if norm(gj) < tol * norm(gradfk)
            s = sj
            sortir = true
        end
  end

 end
  j = j + 1
end
   return s
end
