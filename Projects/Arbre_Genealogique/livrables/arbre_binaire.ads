-- Spécification du module Arbre_binaire

generic 
	Type T_Cle is private; 
 
     with procedure Afficher_Cle (Cle : in T_Cle);

package Arbre_Binaire is

    Cle_Absente_Exception  : Exception;
    Cle_Existe_Exception  : Exception;   
    Existe_Fils_Droit : Exception ;
    Existe_Fils_Gauche : Exception ;

    Type T_Abr is private;

    
    --Initialiser un arbre vide
    procedure Initialiser ( Abr : out T_Abr) with
	Post => Vide (Abr);
   
    -- Verifier si un arbre est vide 
    function Vide ( Abr : in T_Abr ) return boolean;

    -- Obtenir la taille d'un arbre 
    function Taille ( Abr : in T_Abr ) return Integer with
	Post => Taille'Result >= 0 and ( Taille'Result = 0 ) = Vide (Abr) ;

    --Creer un arbre binaire
    procedure Creer_Arbre (Abr : out T_Abr ; Cle : in T_Cle ) with
	Post => Avoir_Cle ( Abr , Cle ) = Cle ;


    --Ajouter un fils droit
    -- Exception : Cle_Absente_Exception si la clé Cle_Donnee n'existe pas
    -- Exception : Existe_Fils_Droit si le fils droit existe déjà
    -- Exception : Cle_Presente_Exception si la clé Cle existe déjà ( Unicité de la clé Cle )
    procedure Ajouter_Fils_Droit ( Abr : in out T_Abr ; Cle_Donnee : in T_Cle ; Cle : in T_Cle  ) with
        Post => Avoir_Cle ( Arbre_Cle (Abr,Cle) , Cle) = Cle ;

    --Ajouter un fils gauche
    -- Exception : Cle_Absente_Exception si la clé Cle_Donnee n'existe pas
    -- Exception : Existe_Fils_Gauche si le fils gauche existe déjà
    -- Exception : Cle_Presente_Exception si la clé Cle existe déjà ( Unicité de la clé Cle )
    procedure Ajouter_Fils_Gauche ( Abr : in out T_Abr ; Cle_Donnee : in T_Cle ; Cle : in T_Cle ) with
	post => Avoir_Cle ( Arbre_Cle (Abr,Cle) , Cle) = Cle ;


    -- Modifier une clé
    -- Exception : Cle_Absente_Exception si Clé n'existe pas 
    procedure Modifier (Abr : in out T_Abr ; Cle_Donnee : in T_Cle ; Cle : in T_Cle ) with 
	Post => Avoir_Cle (Arbre_Cle(Abr, Cle) , Cle) = Cle ;
	

    -- Supprimer l'arbre associée à la clé Cle dans l'arbre 
    -- Exception : Cle_Absente_Exception si Clé n'est pas utilisée dans l'Abr
    procedure Supprimer (Abr : in out T_Abr ; Cle : in T_Cle) with
	Post => not Existe ( Abr , Cle );

	
    --Obtenir l'arbre associée à une clé 
    -- Exception : Cle_Absente_Exception si la clé Cle_Donnee n'existe pas
    function Arbre_Cle ( Abr : in T_Abr ; Cle_Donnee : in T_Cle) return T_Abr;

    --Verifier si un noeud existe
    function Existe ( Abr : in T_Abr ; Cle_Donnee : in T_Cle ) return Boolean with
	Pre => Not Vide(Abr);


    -- Vider l'arbre
    procedure Vider_Arbre ( Abr : out T_Abr ) with 
	Post => Vide(Abr);

    -- Afficher un arbre binaire par paroucrs préfixe
 
    procedure Afficher_Arbre_Binaire (Abr : in T_Abr ;n : in integer);

    -- Retourner la clé d'un arbre binaire associé à la clé Cle 
    -- Cette fonction est utile pour décrire les préconditions et les postconditions
    function Avoir_Cle ( Abr : in T_Abr ; Cle : in T_Cle ) return T_Cle ;

    -- Retourer la clé d'un arbre binaire
    function Avoir_Cle_Arbre ( Abr : in T_Abr ) return T_Cle with
	pre => Not Vide( Abr ) ;

    -- Avoir le sous arbre gauche d'un arbre Abr
    function Avoir_Sous_Arbre_Droit ( Abr : in T_Abr ) return T_Abr ;
    
    -- Avoir le sous arbre droit d'un arbre Abr
    function Avoir_Sous_Arbre_Gauche ( Abr : in T_Abr ) return T_Abr ; 

	

 
private 

    type T_Noeud;
    type T_Abr is access T_Noeud;
    type T_Noeud is
	record
		Cle: T_Cle;
		Sous_Arbre_Gauche : T_Abr;
		Sous_Arbre_Droit : T_Abr;
	end record;
    
end Arbre_Binaire;
