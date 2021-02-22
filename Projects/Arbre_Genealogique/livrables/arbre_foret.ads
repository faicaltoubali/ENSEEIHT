generic 

Capacite : integer;

package Arbre_Foret is 

	type T_Abr_Foret is private;
	type T_Tableau is private;
	
	Capacite_Tableau_Compagnon_Maximale : Exception;
	Compagnon_Existe : Exception;
	Epoux_Existe : Exception;
	Pere_Existe : Exception;
	Mere_Existe : Exception;
	Cle_Absente : Exception;


	procedure Initialiser(Abr : out T_Abr_Foret) with
		Post => Vide(Abr);

	function Vide (Abr : in T_Abr_Foret) return Boolean;

	procedure Creer_Minimal (Abr : out T_Abr_Foret; Cle : in integer) with
			Post => not Vide(Abr);

	Procedure Ajouter_Pere ( Abr : in out T_Abr_Foret ; Cle : in integer; Cle_Pere : in integer);

	Procedure Ajouter_Mere ( Abr : in out T_Abr_Foret ; Cle : in integer ; Cle_Mere : in integer);

	procedure Ajouter_Epoux ( Abr : in out T_Abr_Foret ; Cle : in integer; Cle_Epoux : in integer);

	procedure Ajouter_Compagnon ( Abr : in out T_Abr_Foret ; Cle : in integer; Cle_Compagnon : in integer);


	function Existe ( Abr : in T_Abr_Foret ; Cle : in integer) return Boolean;

	procedure Demis_Soeurs_Freres_Pere ( Abr : in T_Abr_Foret ) ;

    procedure Afficher_Fils_Pere ( Abr : in T_Abr_Foret ; Cle_Pere : in  integer; Cle_Mere : in integer) ;

	procedure Demis_Soeurs_Freres_Mere ( Abr : in T_Abr_Foret ) ;

    procedure Afficher_Fils_Mere ( Abr : in T_Abr_Foret ; Cle_Mere : in  integer; Cle_Pere : in integer) ;

	procedure Avoir_Arbre (Abr : in T_Abr_Foret ; Cle : in integer ; Curseur : in out T_Abr_Foret ) with 
    Pre => Existe ( Abr , Cle );

	function Existe_Compagnon (TableauCompagnon : in T_Tableau; Cle_Compagnon : in integer) return Boolean; 




private

	type T_Cellule;
	type T_Abr_Foret is access T_Cellule;
	type T_Tab is array(1..Capacite) of T_Abr_Foret;
	type T_Tableau is
		record
			Taille : integer;
			Tableau :  T_Tab;
		end record;
	type T_Cellule is 
		record
						Cle : integer;
						Pere : T_Abr_Foret;
						Mere : T_Abr_Foret;
						Epoux : T_Abr_Foret;
						Tableau_Compagnons : T_Tableau;
		end record;

end Arbre_Foret;




