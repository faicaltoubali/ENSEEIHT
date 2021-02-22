With Ada.Text_IO ; use Ada.Text_IO ; 
package body registre is 

    ------------------------------------------------------------------
    function Hashage ( Identifiant : in Integer ) return integer is 
    begin 
    return (Identifiant mod Capacite) ;
    end Hashage ; 
    ------------------------------------------------------------------


    ------------------------------------------------------------------
    procedure Initialiser( Registre : out T_Registre) is
	begin 
        Registre.Taille :=0 ;
    end Initialiser ; 
    -------------------------------------------------------------------


    ----------------------------------------------------------------------------------------    
    function Est_Vide(Registre : in T_Registre) return boolean is 
    begin 
        return Registre.Taille = 0 ;
    end Est_Vide  ; 
    ----------------------------------------------------------------------------------------
 

    ----------------------------------------------------------------------------------------
    function Appartient(Registre : in T_Registre ; Id : in integer ) return Boolean is
    Index : integer ;
    begin   
          Index := hashage( Id );
          return Registre.elements(index).Identifiant = Id ; 
    end Appartient ;  
    -----------------------------------------------------------------------------------------


    -----------------------------------------------------------------------------------------
    function Creer_Dictionnaire ( Nom : Unbounded_String ; Prenom : Unbounded_String ; Jour : Integer ; Mois : T_Mois ; Annee : Integer ; Lieu_De_Naissance : Unbounded_String ) return T_Dictionnaire is
    Date : T_Date ;
    Dico : T_Dictionnaire ;
    begin
        Date.Jour := Jour;
        Date.Mois := Mois;
        Date.Annee := Annee ;
    Dico.Nom := Nom ;
    Dico.Prenom := Prenom ;
    Dico.Date_De_Naissance := Date ;
    Dico.Lieu_De_Naissance := Lieu_De_Naissance ;
    return Dico ;
    end Creer_Dictionnaire;

    -------------------------------------------------------------------------------------------------------------------------------------------------
    Procedure Ajouter_Identifiant_Dictionnaire( Registre : in out T_Registre ; Identifiant : in Integer ; Dictionnaire : in T_Dictionnaire ) is
    Petit_Cellule : T_Cellule ; 
    Index : Integer ;
    begin
        if not Appartient(Registre , Identifiant) then
               Index := Hashage( Identifiant)          ; 
               Petit_Cellule.Identifiant  := Identifiant  ;
               Petit_Cellule.Dictionnaire := Dictionnaire ; 
               Registre.elements(index) := Petit_Cellule           ;       
        else
                raise Identifiant_Absent_Exception    ;
        end if ;
        Exception 
               when Identifiant_Absent_Exception => Put_Line("l'identifiant est déja existant");            
    end Ajouter_Identifiant_Dictionnaire ; 
	------------------------------------------------------------------------------------------------------------------------------------------------------


    ------------------------------------------------------------------------------------------------------------------------------------------------------
    procedure Enregistrer_Dictionnaire_Identifiant ( Registre : in out T_Registre ; Identifiant : in Integer ; Dictionnaire : in T_Dictionnaire ) is 
    Index : Integer ;
    begin 
          if   Appartient(Registre , Identifiant) then 
               Index := Hashage(Identifiant)                ;
               Registre.elements(Index).Dictionnaire := Dictionnaire ; 
          else 
               raise Identifiant_Present_Exception ;
          end if ;
          Exception 
               when Identifiant_Present_Exception => Put_Line("l'identifiant n'existe pas");
    end Enregistrer_Dictionnaire_Identifiant ; 
    --------------------------------------------------------------------------------------------------------------------------------------------------------


    -------------------------------------------------------------------------------------------------------------------------------------------------------- 
    procedure Supprimer_Identifiant ( Registre : in out T_Registre ; Identifiant : in Integer ) is
    Index : Integer ; 
    begin 
        if Appartient(Registre , Identifiant) then

           Index := Hashage(Identifiant)                   ;
           Registre.elements(Index) := Registre.elements(Taille_Registre(Registre)) ;
           Registre.taille := Registre.taille -1 ;
     
        else 
            Null ; 
        end if ;     
    end Supprimer_Identifiant ;
    --------------------------------------------------------------------------------------------------------------------------------------------------------

 
    --------------------------------------------------------------------------------------------------------------------------------------------------------
    function Dictionnaire_Identifiant ( Registre : in T_Registre ; Identifiant : in Integer ) return T_Dictionnaire is
    D: T_Dictionnaire ;
    Index : Integer   ;
    begin 
        if Appartient(Registre , Identifiant) then 
               Index := hashage(Identifiant);
               D := Registre.elements(index).Dictionnaire ; 
               return D ;
        else 
               raise Identifiant_Absent_Exception;
        end if;
    end Dictionnaire_Identifiant ; 
    --------------------------------------------------------------------------------------------------------------------------------------------------------


    --------------------------------------------------------------------------------------------------------------------------------------------------------
    function Taille_Registre ( Rg : in T_Registre ) return Integer is
    begin 
        if Est_vide(Rg) then 
               return 0; 
        else 
           return Rg.Taille ;
        end if ; 
    end Taille_Registre ;
    -----------------------------------------------------------------------------------------------------------------------------------------------------------

end registre ;
	 
