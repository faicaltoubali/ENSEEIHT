with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;
package body arbre_genealogique is 

    
    procedure Creer_Minimal ( Abr : out T_Abr_Genea ; Racine : Integer ; Registre : out T_Registre_Genea; Nom : in unbounded_string ; Prenom : in unbounded_string ; Jour : Integer ; Mois : T_Mois_Gen ; Annee : in Integer ; Lieu_Naissance : unbounded_string) is
    Dico : T_Dictionnaire ;
    begin 
	Dico := Creer_Dictionnaire ( Nom , Prenom , Jour , Mois , Annee , Lieu_Naissance ) ;
	Ajouter_Identifiant_Dictionnaire(Registre, Racine,Dico);
        Creer_Arbre(Abr,Racine);

    end Creer_Minimal ;
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   
    function Taille_Genealogique ( Abr : in T_Abr_Genea ) return Integer is
    begin
	 return Taille ( Abr );
    end Taille_Genealogique ;
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    procedure Vider_Genealogique ( Abr : out T_Abr_Genea ) is
    begin
	Vider_Arbre ( Abr );
    end Vider_Genealogique;

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    function Vide_Genealogique ( Abr : in T_Abr_Genea ) return boolean is 
    begin 
	return Vide(Abr);
    end Vide_Genealogique ;

 -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   
    Procedure Ajouter_Pere (Abr : in out T_Abr_Genea ; Identifiant_Donnee : in Integer; Pere : in Integer ; Registre : out T_Registre_Genea; Nom : in unbounded_string ; Prenom : in unbounded_string ; Jour : Integer ; Mois : T_Mois_Gen ; Annee : in Integer ; Lieu_Naissance : unbounded_string) is

    Dico : T_Dictionnaire;
    begin
	Dico := Creer_Dictionnaire ( Nom , Prenom , Jour , Mois , Annee , Lieu_Naissance ) ;
	Ajouter_Identifiant_Dictionnaire(Registre, Pere,Dico);
        Ajouter_Fils_Droit ( Abr , Identifiant_Donnee , Pere); 
    end Ajouter_Pere ;
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
    Procedure Ajouter_Mere (Abr : in out T_Abr_Genea ; Identifiant_Donnee : in Integer; Mere : in Integer; Registre : out T_Registre_Genea; Nom : in unbounded_string ; Prenom : in unbounded_string ; Jour : Integer ; Mois : T_Mois_Gen ; Annee : in Integer ; Lieu_Naissance : unbounded_string) is

	Dico : T_Dictionnaire ;
    begin 
	Dico := Creer_Dictionnaire ( Nom , Prenom , Jour , Mois , Annee , Lieu_Naissance ) ;
	Ajouter_Identifiant_Dictionnaire(Registre, Mere ,Dico);
        Ajouter_Fils_Gauche ( Abr , Identifiant_Donnee , Mere);   
    end Ajouter_Mere ; 
    
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
procedure Supprimer_Genea ( Abr : in out T_Abr_Genea ; Identifiant : in Integer ) is
begin
     Supprimer ( Abr , Identifiant );
end Supprimer_Genea ;


-----------------------------------------------------------------------------
function Arbre_Cle_Genea ( Abr : in T_Abr_Genea ; Identifiant : in Integer )  return T_Abr_Genea is
begin
     return Arbre_Cle ( Abr , Identifiant ) ;
end Arbre_Cle_Genea ;

---------------------------------------------------------------------
function Avoir_Cle_Arbre_Genea ( Abr : in T_Abr_Genea )  return Integer is
begin 
        return Avoir_Cle_Arbre ( Abr ) ;
end Avoir_Cle_Arbre_Genea;

-----------------------------------------------------------------
function Sous_Arbre_Gauche ( Abr :in T_Abr_Genea ) return T_Abr_Genea is
begin
    return  Avoir_Sous_Arbre_Gauche ( Abr );
end Sous_Arbre_Gauche ;

----------------------------------------------------------------------
function Sous_Arbre_Droit ( Abr : in T_Abr_Genea ) return T_Abr_Genea is
begin
    return  Avoir_Sous_Arbre_Droit ( Abr );
end Sous_Arbre_Droit ;


------------------------------------------------------------------------------------
    function Nombre_Ancetre ( Abr : in T_Abr_Genea ; Identifiant_Donnee : in Integer ) return Integer is  
    begin 
        return Taille_Genealogique( Arbre_Cle_Genea ( Abr , Identifiant_Donnee )); 
    end Nombre_Ancetre ;
      

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    function Ancetres_Generation (Abr : in T_Abr_Genea ; Identifiant_Donnee : in Integer ; Nb_Generation : in Integer ) return T_Ensemble_Identifiant is
        T :  T_Ensemble_Identifiant ; 
    	procedure Ajouter ( Abr : in T_Abr_Genea ; T: in out T_Ensemble_Identifiant ; i : in Integer ) is
	T1 : T_Ensemble_Identifiant ;
	begin
	    
      if not Vide ( Abr ) then 
	    if i = 0 then
		    T1 := new T_Cellule_Identifiant'( Avoir_Cle_Arbre_Genea ( Abr ) , Null );
            T1.All.Suivant := T;
            T := T1 ;
	    end if;
		    if Not Vide ( Avoir_Sous_Arbre_Droit ( Abr ) ) and Not Vide ( Avoir_Sous_Arbre_Gauche ( Abr ) ) then
		        Ajouter ( Avoir_Sous_Arbre_Droit ( Abr ) , T, i-1 );
		        Ajouter ( Avoir_Sous_Arbre_Gauche (Abr ) , T, i-1 );
		    elsif Not Vide ( Avoir_Sous_Arbre_Droit ( Abr ) ) and Vide ( Avoir_Sous_Arbre_Gauche ( Abr ) ) then
		         Ajouter ( Avoir_Sous_Arbre_Droit ( Abr )  ,T, i-1 );
		    elsif Vide ( Avoir_Sous_Arbre_Droit ( Abr ) ) and Not Vide ( Avoir_Sous_Arbre_Gauche ( Abr ) ) then
		         Ajouter ( Avoir_Sous_Arbre_Gauche ( Abr ) ,T, i-1 );
		    else 
		         null ;
		    end if;
      else
            Null;
      end if;

	end Ajouter;
   
   begin 
       Ajouter ( Arbre_Cle_Genea ( Abr, Identifiant_Donnee) ,T, Nb_Generation );
       return T ;
   end Ancetres_Generation ; 

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
procedure Afficher_Entier_Arbre ( entier : in  Integer ) is
begin
        put ( entier, width =>0) ;
end Afficher_Entier_Arbre;

    procedure Afficher_Arbre_Noeud ( Abr : in T_Abr_Genea ; Noeud : in Integer ;n : in integer) is 
    begin 
       Afficher_Arbre_Binaire ( Arbre_Cle ( Abr , Noeud ), n ); 
    end Afficher_Arbre_Noeud ; 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    procedure Supprimer_Noeud_Ancetres ( Abr : in out T_Abr_Genea ; Noeud : in Integer ) is 
    begin 
        Supprimer ( Abr , Noeud );
    end Supprimer_Noeud_Ancetres ;
  
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

     function Un_Seul_Parent (Abr : in T_Abr_Genea) return T_Ensemble_Identifiant is 
      T : T_Ensemble_Identifiant ;
         procedure Ajouter ( Abr : in T_Abr_Genea ; T : in out T_Ensemble_Identifiant ) is
	     T1 : T_Ensemble_Identifiant;
         begin
	       if not Vide (Abr) then  
             if Vide ( Avoir_Sous_Arbre_Droit ( Abr ) ) xor Vide ( Avoir_Sous_Arbre_Gauche ( Abr )) then 
	            T1 := new T_Cellule_Identifiant'( Avoir_Cle_Arbre_Genea ( Abr ) , Null );
                T1.All.Suivant := T;
                T := T1 ;
             end if;
	         Ajouter ( Sous_Arbre_Droit(Abr) , T  );
		     Ajouter ( Sous_Arbre_Gauche(Abr) , T );
          else
             Null;
    end if;
	end Ajouter;

    begin 
         Ajouter ( Abr , T);
         return  T ;
    end Un_Seul_Parent ;
    
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    function  Deux_Parent ( Abr : in T_Abr_Genea ) return T_Ensemble_Identifiant is
    T : T_Ensemble_Identifiant;  
      procedure Ajouter ( Abr : in T_Abr_Genea ; T : in out T_Ensemble_Identifiant ) is 
      T1 : T_Ensemble_Identifiant ;
      begin
	   if not Vide ( Abr ) then
         if not Vide ( Avoir_Sous_Arbre_Droit ( Abr ) ) and not Vide ( Avoir_Sous_Arbre_Gauche ( Abr )) then 
	        T1 := new T_Cellule_Identifiant'( Avoir_Cle_Arbre_Genea ( Abr ) , Null); 
            T1.All.Suivant := T ;
            T := T1;        
	      end if;
	         Ajouter ( Sous_Arbre_Droit(Abr) , T );
	         Ajouter ( Sous_Arbre_Gauche(Abr) , T );
       else
           Null;
       end if;
	end Ajouter;
   begin 
        Ajouter ( Abr , T );
        return (T);
             
   end Deux_Parent ;

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    function Aucun_Parent ( Abr : in T_Abr_Genea ) return T_Ensemble_Identifiant is 
    T : T_Ensemble_Identifiant ;
       procedure Ajouter ( Abr : in T_Abr_Genea ; T : in out T_Ensemble_Identifiant ) is
       T1 : T_Ensemble_Identifiant ;
        begin
	     if not Vide (Abr) Then        
             if Vide ( Avoir_Sous_Arbre_Droit ( Abr ) ) and Vide (Avoir_Sous_Arbre_Gauche ( Abr ) ) then 
	            T1 := new T_Cellule_Identifiant'( Avoir_Cle_Arbre_Genea ( Abr ) , Null );
                T1.All.Suivant := T;
                T := T1 ;
	        end if; 
		         Ajouter ( Sous_Arbre_Droit(Abr) , T );
		         Ajouter ( Sous_Arbre_Gauche(Abr) , T);
         else
            Null;
         end if;
	end Ajouter;

    begin 
	Ajouter ( Abr , T);
       return T ;
    end Aucun_Parent ;

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    function Ancetres_Plusieurs_Generation ( Abr : in T_Abr_Genea ; Identifiant_Donnee : in Integer ; n : in Integer ) return T_Ensemble_Identifiant is 
    T : T_Ensemble_Identifiant ;
    	procedure Ajouter ( Abr : in T_Abr_Genea  ; T : in out T_Ensemble_Identifiant ; i : in Integer ) is
	T1 : T_Ensemble_Identifiant ;
    begin
	  if i <= n then   
	      
	      if Vide ( Abr ) then 
		      null;
	      else 
	            T1 := new T_Cellule_Identifiant'( Avoir_Cle_Arbre ( Abr ) , Null );
                T1.All.Suivant := T;
                T := T1 ;
                
		        Ajouter ( Avoir_Sous_Arbre_Droit (Abr)  , T , i+1 );
		        Ajouter ( Avoir_Sous_Arbre_Gauche (Abr)  , T , i+1 );
		 
	      end if;
	  else
	      null ;
	  end if;
	  end Ajouter ;	    
	    
    begin
       Ajouter ( Arbre_Cle_Genea ( Abr , Identifiant_Donnee) , T , 0 );
       return T;
    end Ancetres_Plusieurs_Generation ;
  
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 
    function profondeur ( Abr : in T_Abr_Genea ) return Integer is
    a : Integer ;
    b : Integer ;
    begin
	if Vide ( Abr ) then 
	    return 0 ;
	else
	    a := profondeur ( Avoir_Sous_Arbre_Droit( Abr ) );
	    b := profondeur ( Avoir_Sous_Arbre_Gauche( Abr ) );
	    if a >= b then
		return 1 + a ;
	    else 
		return 1 + b ;
	    end if;
	end if ;
    end profondeur;

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    function Verifier_Ancetres ( Abr : in T_Abr_Genea ; n : in Integer ; m : in Integer ) return Integer is 
    T: T_Ensemble_Identifiant := Null; 
    T1: T_Ensemble_Identifiant := Ancetres_Plusieurs_Generation ( Abr , n , profondeur ( Arbre_Cle_Genea ( Abr , n ) ) );
    T2: T_Ensemble_Identifiant := Ancetres_Plusieurs_Generation ( Abr , m , profondeur ( Arbre_Cle_Genea ( Abr , m ) ) ); 
            procedure Modifier ( T1 : out T_Ensemble_Identifiant ; T2 : out T_Ensemble_Identifiant ; T : out T_Ensemble_Identifiant ) is
            T3: T_Ensemble_Identifiant;
            begin
                while T1 /= Null loop
		            while T2 /= Null loop
		                  if T1.All.Identifiant = T2.All.Identifiant then
			                  T3 := new T_Cellule_Identifiant'(T2.All.Identifiant, Null);
			                  T3.All.Suivant := T ;
			                  T := T3;
                          end if;
			                       T2 := T2.All.Suivant ;
  
		           end loop;
		           T1 := T1.All.Suivant ;
	            end loop;
        end Modifier;
    begin 
        Modifier ( T1 , T2 , T );
        if  T = Null then
            return 0 ;
        else 
            return 1 ;
        end if;
    end Verifier_Ancetres;

-----------------------------------------------------------------------------------------------------------
    function Existe_Noeud ( Abr : in T_Abr_Genea ; Identifiant_Donnee : in Integer ) return Boolean is 
    begin 
	return Existe ( Abr , Identifiant_Donnee );
    end Existe_Noeud;
------------------------------------------------------------------------------------------------------------
function Avoir_Identifiant ( Liste : in T_Ensemble_Identifiant ) return Integer is

begin
  return Liste.All.Identifiant ;
end Avoir_Identifiant ;


function Avoir_Suivant ( Liste : in T_Ensemble_Identifiant ) return T_Ensemble_Identifiant is 
begin
    return Liste.All.Suivant;
end Avoir_Suivant ;


end arbre_genealogique ; 
