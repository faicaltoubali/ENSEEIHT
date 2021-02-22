--Spécification du module registre
with Ada.Strings.Unbounded ; use Ada.Strings.Unbounded ;

generic 

    Capacite : Integer ;     

package registre is 

     Identifiant_Absent_Exception   : Exception ;
     Identifiant_Present_Exception  : Exception ;     
    type T_Mois is (Janvier, Fevrier, Mars , Avril , Mai , Juin , Juillet , Aout, Septembre , Octobre , Novembre , Decembre);   

    type T_Date is
	record
	    Jour : Integer ;
	    Mois : T_Mois ;
	    Annee : Integer ;
	end record ;

    type T_Dictionnaire is 
	record
	       Prenom : unbounded_string ;
	       Nom :    unbounded_string ;
	       Date_De_Naissance : T_Date ;
	       Lieu_De_Naissance : unbounded_string ;
	end record ;
    
   type T_Cellule is
       record
	   Identifiant  : Integer    ;
	   Dictionnaire : T_Dictionnaire ;
       end record;

   type T_Tab_Registre is array(1..Capacite) of T_Cellule;

   type T_Registre is 
        record 
        Elements : T_Tab_Registre ;  
        Taille : integer ; 
        end record ; 
    
    --Definition de la fonction de hachage
    function Hashage ( Identifiant : in Integer ) return integer with  
    post => 1 <= Hashage'Result and Hashage'Result<= Capacite ; 


    --Initialiser un registre
    procedure Initialiser( Registre : out T_Registre) with
	post => Est_Vide(Registre);
   

    --Verifier si un registre est vide
    function Est_Vide(Registre : in T_Registre) return boolean ;
    
    --Verfier si un identifiant existe dans un regitre ou non 
    function Appartient(Registre : in T_Registre ; Id : in Integer ) return Boolean ;
    
    --Ajouter un identifiant dans un registre
    --Exception : Identifiant_Present_Exception , si l'identifiant existe deja .
    Procedure Ajouter_Identifiant_Dictionnaire( Registre : in out T_Registre ; Identifiant : in Integer ; Dictionnaire : in T_Dictionnaire ) with
	Pre => Not Est_vide (Registre);

    --Enregistrer un dictionnaire en un identifiant donné
    --Exception : Identifiant_Absent_Exception , si l'Identifiant n'existe pas .
    procedure Enregistrer_Dictionnaire_Identifiant( Registre : in out T_Registre ; Identifiant : in Integer ; Dictionnaire : in T_Dictionnaire ) ;


    --Supprimer un dictionnaire associé à un identifiant 
    --Exception : Ideunbounded_stringntifiant_Absent_Exception , si l'identifiant n'existe pas . 
    procedure Supprimer_Identifiant ( Registre : in out T_Registre ; Identifiant : in Integer ) with 
	Post =>  Taille_Registre(Registre) = Taille_Registre(Registre)'Old - 1;


    --Obtenir le dictionnaire associé à un identifiant
    --Exception : Identifiant_Absent_Exception , si l'identifiant n'existe pas .
    function Dictionnaire_Identifiant ( Registre : in T_Registre ; Identifiant : in Integer ) return T_Dictionnaire ;

    --Obtenir la taille d'un registre
    function Taille_Registre ( Rg : in T_Registre ) return Integer with
	Post => Capacite >= Taille_Registre'Result and Taille_Registre'Result>=0 and ((Taille_Registre'Result = 0 ) = Est_Vide(Rg));

    function Creer_Dictionnaire ( Nom : Unbounded_String ; Prenom : Unbounded_String ; Jour : Integer ; Mois : T_Mois ; Annee : Integer ; Lieu_De_Naissance : Unbounded_String ) return T_Dictionnaire ;

end registre;
