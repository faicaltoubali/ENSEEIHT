with arbre_foret;
with Ada.Text_IO ; use Ada.Text_IO;

procedure test_arbre_foret is 

    package arbre_foret_100 is
	new arbre_foret ( Capacite => 100 );
    use arbre_foret_100 ; 

    Arbre : T_Abr_Foret;

    procedure Construire_Arbre_Foret ( Abr : out T_Abr_Foret ) is 
    begin
	initialiser ( Abr );
	Pragma Assert ( Vide (Abr) ) ;
	Creer_Minimal ( Abr , 1 ) ;
	Ajouter_Pere ( Abr , 1 , 2 );
	Ajouter_Mere ( Abr , 1 , 100 );
	Ajouter_Epoux ( Abr , 1 , 4 ) ;
	Ajouter_Compagnon ( Abr , 1 , 5);
	Ajouter_Compagnon ( Abr , 1 , 6);
	Ajouter_Compagnon ( Abr , 1 , 7);
	Ajouter_Compagnon ( Abr , 1 , 20 );
	Ajouter_Compagnon ( Abr , 1 , 22 ) ;
	Ajouter_Mere ( Abr , 22 , 100);
	Ajouter_Pere (Abr , 22 , 23);
	Ajouter_Pere ( Abr , 20 , 2 );
	Ajouter_Mere ( Abr , 20 , 80 ) ;
	Ajouter_Pere ( Abr , 2 , 8 );
	Ajouter_Mere ( Abr , 2 , 9 );
	Ajouter_Pere ( Abr , 5 , 2 );
	Ajouter_Mere ( Abr , 5 , 11 );
	Ajouter_Mere ( Abr , 7, 13 );
	Ajouter_Compagnon ( Abr , 100 , 14 );
	Ajouter_Pere ( Abr , 100 , 15 ) ;
	Ajouter_Mere ( Abr , 100 , 16 ) ;
	Ajouter_Pere ( Abr , 15 , 17 );
	Ajouter_Mere ( Abr , 15 , 18);
	Ajouter_Pere ( Abr , 6 , 26);
	Ajouter_Mere ( Abr , 6 , 27);
	Ajouter_Compagnon ( Abr , 6 , 80);	
	New_Line;
    end Construire_Arbre_Foret;

    procedure Existe_Arbre_Foret_Test is
    begin 
	Put ("Tester Existe Arbre_Foret : ");New_Line;
	Construire_Arbre_Foret ( Arbre ) ;
	Pragma assert ( Existe ( Arbre, 1));
	Pragma assert ( Existe ( Arbre, 4));
	Pragma assert ( Existe ( Arbre, 13));
	Pragma assert ( not Existe ( Arbre, 14));
	Pragma assert ( not Existe ( Arbre, 15));
	Pragma assert ( Existe ( Arbre , 7));
	put ("Succès : Existe_Arbre_Foret ");New_Line;
    end Existe_Arbre_Foret_Test;

    procedure Tester_Demis_Soeurs_Freres_Pere is
    begin
	Put ( "Tester Demis_Soeurs_Freres_Pere ");New_Line;
	Construire_Arbre_Foret ( Arbre ) ;
	Demis_Soeurs_Freres_Pere ( Arbre );New_Line;
    end Tester_Demis_Soeurs_Freres_Pere ;

    procedure Tester_Demis_Soeurs_Freres_Mere is
    begin
	Put ("Tester Demis_Soeurs_Freres_Mere ");New_Line;
	Construire_Arbre_Foret ( Arbre ) ;
	Demis_Soeurs_Freres_Mere ( Arbre );
    end Tester_Demis_Soeurs_Freres_Mere ;


begin
    Put ("Construction de l'arbre : ");New_Line;
    Construire_Arbre_Foret ( Arbre ) ;
    Put ("Succès : Constuire_Arbre_Foret ");New_Line;
    Existe_Arbre_Foret_Test;
    Tester_Demis_Soeurs_Freres_Pere ;
    Tester_Demis_Soeurs_Freres_Mere ;
end test_arbre_foret;
