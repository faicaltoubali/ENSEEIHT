with Ada.Text_IO ; use Ada.Text_IO;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;
with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;
with arbre_genealogique; 

procedure test_arbre_genealogique is
 

    package arbre_genea_100 is 
        new arbre_genealogique ( Registre_Taille => 100 );
use arbre_genea_100;

   Arbre : T_Abr_Genea ;
   Liste : T_Ensemble_Identifiant ;
   type T_Tableau is array (1..13) of Integer ;
   Tableau1 : T_Tableau;
   Registre : T_Registre_Genea;
   i : Integer ;

   -- Construire un arbre genealogique, l'arbre à construire est le suivant 
   -- 
   --                                     1
   --                         3  	 	        2
   --                   7                        5             4
   --                       12               11      10            8
   --
   -- Afficher l'arbre binaire après construction


   procedure Construire_Arbre_Genealogique ( Arbre : out T_Abr_Genea ) is
   begin
    Put("---------------------------------------------------");New_Line;
    Put ("=> Début du Test Constuire_Arbre_Genealogique"); New_Line;
       Creer_Minimal ( Arbre , 1 , Registre , To_Unbounded_String("Toubali"),To_Unbounded_String("Faical") , 7 , JUILLET , 1999 , To_Unbounded_String("Rabat") );
       Pragma Assert ( not Vide_Genealogique ( Arbre ) );
       Pragma Assert ( Taille_Genealogique ( Arbre ) = 1 );
       Ajouter_Pere ( Arbre , 1 , 2 ,  Registre , To_Unbounded_String("Aassou") , To_Unbounded_String("Ayoub") , 20 , Janvier , 2000, To_Unbounded_String("Nador")  );
       Ajouter_Mere ( Arbre , 1 , 3 , Registre , To_Unbounded_String("Palace") , To_Unbounded_String("William") , 1 , Juillet , 1985 , To_Unbounded_String("Grande Bretagne ") );
       Ajouter_Pere ( Arbre , 2 , 4 , Registre,To_Unbounded_String(" Francois"), To_Unbounded_String("Labeure") , 1 ,  Mars , 1995 , To_Unbounded_String("Toulouse") );
       Ajouter_Mere ( Arbre , 2 , 5 , Registre, To_Unbounded_String("Jackie "), To_Unbounded_String("Monier "), 26 , Octobre , 1985 ,To_Unbounded_String(" Frankfurt"));
       Ajouter_Pere ( Arbre , 4 , 8 , Registre , To_Unbounded_String("Mami") ,To_Unbounded_String(" Kirshoff" ), 16 , Novembre , 1984 , To_Unbounded_String("Algerie") );
       Ajouter_Pere ( Arbre , 5 , 10 , Registre , To_Unbounded_String("Muchos") , To_Unbounded_String("Colue") , 30 , Avril , 1994 , To_Unbounded_String("Senegal") );
       Ajouter_Mere ( Arbre , 5 , 11 , Registre ,To_Unbounded_String(" Marie") ,To_Unbounded_String(" LeBlanc") , 14 , Juin , 1994 ,To_Unbounded_String( "Paris")  );
       Ajouter_Mere ( Arbre , 3 , 7 , Registre , To_Unbounded_String("Stephan" ),To_Unbounded_String(" Bolois" ), 2 , Janvier , 1865 , To_Unbounded_String("Allemagne " ));
       Ajouter_Pere ( Arbre , 7 ,12 , Registre , To_Unbounded_String("Nora") , To_Unbounded_String("Kirma" ), 6 , Juin , 2002 ,To_Unbounded_String(" South Africa") );
        Pragma Assert ( Taille_Genealogique ( Arbre ) = 10 );
        Afficher_Arbre_Noeud (Arbre, Avoir_Cle_Arbre_Genea(Arbre),1);New_Line;
        Put("=> Succès : Fin du test Constuire_Arbre_Genealogique ");New_Line;
        put("---------------------------------------------------");
        New_Line;
    end Construire_Arbre_Genealogique;
    
    -- Creer une procedure qui teste toutes les procédures et fonction qui opèrent sur les parents des individus : 
    --  1- Savoir si un individu a uniquement un seul parent
    --  2- Savoir si un individu a deux parents
    --  3- Savoir si un individu n'a aucun parent 

    procedure Parents_Test is
    begin
    Put ("=> Debut du test Parents_Test");New_Line;New_Line;
    Liste := Un_Seul_Parent ( Arbre );
    Put_Line ("Les individus qui ont un seul parent sont : ");
    i := 1 ;
	while Liste /= Null loop
	  Tableau1(i) := Avoir_Identifiant ( Liste ) ;
	  Put ( Avoir_Identifiant ( Liste ));
      Liste := Avoir_Suivant ( Liste );
	  i := i+1;
	end loop;
    Pragma Assert ( Tableau1(1) = 7 );
    Pragma Assert ( Tableau1(2) = 3 );
    Pragma Assert ( Tableau1(3) = 4 );
    New_Line;


	put("Un_Seul_Parent est vérifié");New_Line;
    New_Line;
	i := 1 ;
	Liste := Deux_Parent ( Arbre );
    Put_Line ( "Les individus qui ont deux parents sont : ");
	while Liste /= Null loop
	  Tableau1(i) := Avoir_Identifiant ( Liste ) ;
	  Put ( Avoir_Identifiant ( Liste ));
      Liste := Avoir_Suivant ( Liste );
	  i := i+1;
	end loop;
    Pragma Assert ( Tableau1(1) = 5 );
    Pragma Assert ( Tableau1(2) = 2 );
    Pragma Assert ( Tableau1(3) = 1 );
    New_Line;



    Put ("Deux_Parent est vérifié ");New_Line;  
    New_Line;
	Liste := Aucun_Parent ( Arbre );
    i := 1 ;
    Put ("Les individus qui n'ont aucun parent sont :");New_Line;
	while Liste /= Null and i<=13 loop
	  Tableau1(i) := Avoir_Identifiant ( Liste ) ;
	  Put ( Avoir_Identifiant ( Liste ));
      Liste := Avoir_Suivant ( Liste );
	  i := i+1;
	end loop;
    Pragma Assert ( Tableau1(1) = 12 );
    Pragma Assert ( Tableau1(2) = 11 );
    Pragma Assert ( Tableau1(3) = 10 );
    Pragma Assert ( Tableau1(4) = 8 );

    New_Line;
	Put("Aucun Parent est vérifié ");New_line;
    New_Line;
	Put_Line ("=> Succès : Fin du test Parents_Test ");
    put("---------------------------------------------------");New_Line;
 end Parents_Test ;
    
       
    --Creer une procedure qui teste toutes les procédures et fonctions qui opèrent sur les ancetres des individus.
    procedure Ancetres_Test is 
    begin

    Put("---------------------------------------------------");New_Line;
	Put ( "=> Debut du test de Ancetres_Test");
    Tableau1(1) := Nombre_Ancetre ( Arbre, 1 ) ;
    Tableau1(2) := Nombre_Ancetre ( Arbre, 2 ) ;
    Tableau1(3) := Nombre_Ancetre ( Arbre, 3 ) ;
    Tableau1(4) := Nombre_Ancetre ( Arbre, 5 ) ;
    Tableau1(5) := Nombre_Ancetre ( Arbre, 7 ) ;
    Tableau1(6) := Nombre_Ancetre ( Arbre, 12 );
    Pragma Assert ( Tableau1(1) = 10);
    Pragma Assert ( Tableau1(2) = 6);
    Pragma Assert ( Tableau1(3) = 3);
    Pragma Assert ( Tableau1(4) = 3);
    Pragma Assert ( Tableau1(5) = 2);
    Pragma Assert ( Tableau1(6) = 1);
--Pragma Assert ( Tableau1 =  ( 10,6,3,3,2,1));
   Put ("Fin test Nombre_Ancetre : Succès");New_Line;
   Put ("Debut test Ancetres_Plusieurs_Generation");New_Line;
   Liste := Null ;
   i := 1;
   Liste := Ancetres_Plusieurs_Generation( Arbre , 1 , 1 ) ;
   while Liste /= Null loop
	  Tableau1(i) := Avoir_Identifiant ( Liste ) ;
      Put ( Avoir_Identifiant ( Liste ));
      Liste := Liste.All.Suivant;
	  i := i+1;
    end loop;
    New_Line ;
    Pragma Assert ( Tableau1(1) = 1);
    Pragma Assert ( Tableau1(2) = 2);
    Pragma Assert ( Tableau1(3) = 3);
--Pragma Assert ( Tableau1 = ( 1, 2 , 3 ));
	
   Liste := Null ;
   i := 1;
   Liste := Ancetres_Plusieurs_Generation( Arbre , 1 , 2 ) ;
   while Liste /= Null loop
	  Tableau1(i) := Avoir_Identifiant ( Liste ) ;
      Put ( Avoir_Identifiant ( Liste ));
      Liste := Liste.All.Suivant;
	  i := i+1;
   end loop;
    New_Line;
    Pragma Assert ( Tableau1(1) = 1);
    Pragma Assert ( Tableau1(2) = 2);
    Pragma Assert ( Tableau1(3) = 4);
    Pragma Assert ( Tableau1(4) = 5);
    Pragma Assert ( Tableau1(5) = 3);
    Pragma Assert ( Tableau1(6) = 7 );
--Pragma Assert ( Tableau1 = (1 ,2 , 4 ,5 ,3 ,7 ));
    Put ("Fin test Ancetres_Plusieurs_Generation ");New_Line;
    Put ("Debut test Ancetres_Generation");New_Line;  
    i:= 1 ;

    Liste := Null ;
    Liste := Ancetres_Generation ( Arbre , 1 , 3 );
   while Liste /= Null loop
	  Tableau1(i) := Avoir_Identifiant ( Liste ) ;
      Put ( Avoir_Identifiant ( Liste ));
      Liste := Liste.All.Suivant;
	  i := i+1;
   end loop;
    Pragma Assert ( Tableau1(1) = 8 );
    Pragma Assert ( Tableau1(2) = 10);
    Pragma Assert ( Tableau1(3) = 11);
    Pragma Assert ( Tableau1(4) = 12 ) ;
-- Tableau1 = ( 8 , 10 ,11 ,12 );

    i:= 1 ;
    New_Line; 
    Liste := Null ;
    Liste := Ancetres_Generation ( Arbre , 1 ,2 );
   while Liste /= Null loop
	  Tableau1(i) := Avoir_Identifiant ( Liste ) ;
      Put ( Avoir_Identifiant ( Liste ));
      Liste := Liste.All.Suivant;
	  i := i+1;
   end loop;
    New_Line;
    Pragma Assert ( Tableau1(1) = 4 );
    Pragma Assert ( Tableau1(2) = 5);
    Pragma Assert ( Tableau1(3) = 7);
-- Tableau1 = ( 4, 5,7 )

    Put ("Fin test Ancetres_Generation");New_Line;  
    Put ("Debut test Verifier_Ancetres");New_Line;  

    i := Verifier_Ancetres ( Arbre ,2 ,3); -- i = 0
    Put ( i) ;New_Line;
    Pragma Assert ( i = 0 );
   -- pragma assert ( i = 0 )  Vraie mais ne marche pas
    
    i := Verifier_Ancetres ( Arbre ,1 , 3); -- i = 1 
    Put (i);New_Line;
    Pragma Assert ( i = 1 );


    i:= Verifier_Ancetres ( Arbre,7 ,5 ); --i = 0
    Put (i ) ;New_Line;
    Pragma Assert ( i = 0 );
    Put ("Fin test Verifier_Ancetres");New_Line;  
	Put_Line ("=> Succès : Fin du test de Ancetres_Test");
  end Ancetres_Test;


begin 
	Construire_Arbre_Genealogique (Arbre);
	Parents_Test;
	Ancetres_Test;
end test_arbre_genealogique;

	
	
	
	
       
       
       
       
