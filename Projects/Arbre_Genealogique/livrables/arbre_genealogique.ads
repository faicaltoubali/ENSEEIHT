--Specification du module arbre_genealogique
with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;
with arbre_binaire;
with registre;
generic 
    
    Registre_Taille : Integer ;

package arbre_genealogique is 
      
  package new_registre is
	      new registre ( Capacite => Registre_Taille );
  use new_registre;

  Type T_Abr_Genea is private;
   
  Type T_Registre_Genea is new T_Registre ;

  Type T_Mois_Gen is new T_Mois ;
  
  Type T_Cellule_Identifiant;
  Type T_Ensemble_Identifiant is Access T_Cellule_Identifiant;
  Type T_Cellule_Identifiant is 
	 record 
	      Identifiant : Integer ;
	        Suivant     : T_Ensemble_Identifiant ;
	 end record;
     



    -- Creer un arbre minimal contenant le seul noeud racine 
    procedure Creer_Minimal ( Abr : out T_Abr_Genea ; Racine : Integer ; Registre : out T_Registre_Genea; Nom : in Unbounded_String ; Prenom : in Unbounded_string ; Jour : in Integer ; Mois : in T_Mois_Gen ; Annee : in Integer ; Lieu_Naissance : in Unbounded_string) with 
	Post => Taille_Genealogique(Abr) = 1 ;

    function Taille_Genealogique ( Abr : in T_Abr_Genea ) return Integer ;

    procedure Vider_Genealogique ( Abr : out T_Abr_Genea );

    function Vide_Genealogique ( Abr : in T_Abr_Genea ) return boolean ;

    
    -- Ajouter un père ( Le père sera en sous arbre droit )
    Procedure Ajouter_Pere ( Abr : in out T_Abr_Genea ; Identifiant_Donnee : in Integer; Pere : in Integer; Registre : out T_Registre_Genea; Nom : in Unbounded_String ; Prenom : in Unbounded_String ; Jour : in Integer ; Mois : in T_Mois_Gen ; Annee : in Integer ; Lieu_Naissance : in Unbounded_String);
 


    -- Ajouter une mère ( La mère sera en sous arbre gauche )
    Procedure Ajouter_Mere ( Abr : in out T_Abr_Genea ;Identifiant_Donnee : in Integer ;  Mere : in Integer; Registre : out T_Registre_Genea; Nom : in Unbounded_String ; Prenom : in Unbounded_String ; Jour : in Integer ; Mois : in T_Mois_Gen ; Annee : in Integer ; Lieu_Naissance : in Unbounded_String);
 

    --procedure Modifier_Genea (Abr : in out T_Abr_Genea ; Identifiant_Donnee : in Integer ; Identifiant  : in  Integer )

    procedure Supprimer_Genea ( Abr : in out T_Abr_Genea ; Identifiant : in Integer ) ;

    function Arbre_Cle_Genea ( Abr : in T_Abr_Genea ; Identifiant : in Integer )  return T_Abr_Genea ;

    function Avoir_Cle_Arbre_Genea ( Abr : in T_Abr_Genea )  return Integer ;

    function Sous_Arbre_Gauche ( Abr :in T_Abr_Genea ) return T_Abr_Genea ;

    function Sous_Arbre_Droit ( Abr : in T_Abr_Genea ) return T_Abr_Genea ;

    -- Obtenir le nombre d'ancetres d'un noeud donnée
    function Nombre_Ancetre ( Abr : in T_Abr_Genea ; Identifiant_Donnee : in Integer ) return Integer;
    
    -- Obtenir les ancetres situés à une génération donnée
    function Ancetres_Generation (Abr : in T_Abr_Genea ; Identifiant_Donnee : in Integer ; Nb_Generation : in Integer ) return T_Ensemble_Identifiant ;

    -- Afficher l'arbre a partir d'un noeud donnee ( s'appuie sur Afficher_Arbre_Binaire)
    procedure Afficher_Arbre_Noeud ( Abr : in T_Abr_Genea ; Noeud : in Integer ;n : in integer) ;

    procedure Afficher_Entier_Arbre ( Entier : Integer ) ;

    -- Supprimer pour un arbre un noeud et ses ancetres 
    procedure Supprimer_Noeud_Ancetres ( Abr : in out T_Abr_Genea ; Noeud : in Integer ) ;


    -- Obtenir l'ensemble des individus dont un seul parent est connu
    function Un_Seul_Parent ( Abr : in T_Abr_Genea ) return T_Ensemble_Identifiant  ;

    -- Obtenir l'ensemble des individus dont les deux parents sont connus
    function Deux_Parent ( Abr : in T_Abr_Genea ) return T_Ensemble_Identifiant ;

    -- Obtenir l'ensemble des individus dont aucun parent n'est connu
    function Aucun_Parent ( Abr : in T_Abr_Genea ) return T_Ensemble_Identifiant ;

    -- Identifier les ancetres d'un individu sur n générations
    function Ancetres_Plusieurs_Generation ( Abr : in T_Abr_Genea ; Identifiant_Donnee : in Integer ; n : in Integer ) return T_Ensemble_Identifiant ; 

    -- Retourner la profondeur d'un arbre donné
    function profondeur ( Abr : in T_Abr_Genea ) return Integer ;

    -- Verifier que deux individus n et m ont un ou plusieurs ancetres homonymes
    function Verifier_Ancetres ( Abr : in T_Abr_Genea ; n : in Integer ; m : in Integer ) return Integer ;

    --Verifier si un noeud existe dans l'arbre genealogique
    function Existe_Noeud ( Abr : in T_Abr_Genea ; Identifiant_Donnee : in Integer ) return Boolean with
	Pre => Not Vide_Genealogique(Abr);

    function Avoir_Identifiant ( Liste : in T_Ensemble_Identifiant ) return Integer ;

    function Avoir_Suivant ( Liste : in T_Ensemble_Identifiant ) return  T_Ensemble_Identifiant ;


private
	  package abr_genea is
        new arbre_binaire( Integer , Afficher_Entier_Arbre);
  use abr_genea;
  
 type T_Abr_Genea is new T_Abr ;
  

end arbre_genealogique;
