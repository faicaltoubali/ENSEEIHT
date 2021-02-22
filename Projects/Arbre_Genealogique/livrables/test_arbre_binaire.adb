with arbre_binaire; 
with Ada.Text_IO ; use Ada.Text_IO;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;
       
procedure test_arbre_binaire is 
   
procedure Afficher_Entier ( entier : Integer) is
   begin
       Put( entier );
   end Afficher_Entier ;
   
package arbre_binaire_entier is
      new arbre_binaire( Integer, Afficher_Entier );
   use arbre_binaire_entier ;



   Arbre : T_Abr;
   
   -- Construire un arbre binaire, l'arbre à construire est le suivant :
   -- 
   --                                     1
   --                         3  	 	      2
   --                   7            6            5          4
   -- Afficher l'arbre binaire après construction

    
    procedure Construire_Arbre_Binaire ( Arbre : out T_Abr ) is 
    begin
	Put("Construire l'arbre");New_Line;
	Initialiser ( Arbre );
	Pragma Assert (  Vide ( Arbre ) );
	Pragma Assert ( Taille ( Arbre ) = 0 );
	Creer_Arbre ( Arbre , 1 );
    Ajouter_Fils_Droit ( Arbre , 1, 2 );
	Ajouter_Fils_Gauche ( Arbre , 1,3 );
	Ajouter_Fils_Droit ( Arbre,2, 4);
	Ajouter_Fils_Gauche ( Arbre,2, 5);
	Ajouter_Fils_Droit (Arbre , 3 , 6);
	Ajouter_Fils_Gauche ( Arbre , 3 , 7);
	Pragma Assert ( Not Vide ( Arbre ) );
	Pragma Assert ( Taille ( Arbre ) = 7 );

	Afficher_Arbre_Binaire ( Arbre , 1 );
	New_Line;

    end Construire_Arbre_Binaire;

    -- Vider l'arbre binaire construit
    procedure Vider_Arbre_Binaire_Test is 
    begin
	Put ("Tester Vider_Arbre_Test");New_Line;
	Construire_Arbre_Binaire ( Arbre );
	Vider_Arbre ( Arbre );
	Pragma Assert ( Vide ( Arbre ));
	Pragma Assert ( Taille ( Arbre ) = 0 );
	Afficher_Arbre_Binaire ( Arbre , 1 );New_Line;
	Put_line ("=> Succès : Fin du test de Vider_Arbre_Test");New_Line;
    end Vider_Arbre_Binaire_Test;
    
    -- Modifier l'arbre binaire construit par le suivant :
    --
    --                                     1
    --                         3  	 	      15
    --                   0            8            10          4
    -- Afficher l'arbre binaire après construction
    -- Vider l'arbre après la fin du test 

    procedure Modifier_Arbre_Binaire_Test is 
    begin
	Put ( "Tester Modifier Arbre_Binaire_Test");New_Line;
	Construire_Arbre_Binaire ( Arbre );
	Modifier ( Arbre , 2 , 15 );
	Modifier ( Arbre , 5 , 10 );
	Modifier ( Arbre , 6 , 8 );
	Modifier ( Arbre , 7 , 0 );
	Pragma Assert ( Not Vide( Arbre ) );
	Pragma Assert ( Taille ( Arbre ) = 7 );
	Afficher_Arbre_Binaire ( Arbre , 1 ); New_Line ;
	Pragma Assert ( Avoir_Cle ( Arbre_Cle ( Arbre , 15 ),15) = 15 );
	Pragma Assert ( Avoir_Cle ( Arbre_Cle ( Arbre , 1 ),1) = 1 );
	Pragma Assert ( Avoir_Cle ( Arbre_Cle ( Arbre , 3 ),3) = 3 );
	Put_line ("=> Succès : Fin du test de Modifier_Arbre_Binaire_Test"); New_Line;
	Vider_Arbre ( Arbre );
	Pragma Assert ( Vide ( Arbre ));
	New_Line;
    end Modifier_Arbre_Binaire_Test ;

    -- Modifier l'arbre binaire construit en supprimant quelques clés .
    --
    --                                     1
    --                         3  	 	      2
    --                   7                                   4
    -- Afficher l'arbre binaire après construction
    -- Vider l'arbre après la fin du test 

    procedure Supprimer_Arbre_Binaire_Test is
    begin
	Put ("Tester Supprimer_Arbre_Binaire_Test" );New_line;
	Construire_Arbre_Binaire ( Arbre );
	Supprimer ( Arbre , 5  );
	Pragma Assert ( Taille ( Arbre ) = 6 );
	Supprimer ( Arbre , 6  );
	Pragma Assert ( Taille ( Arbre ) = 5 );
	Afficher_Arbre_Binaire ( Arbre , 1 );
	Vider_Arbre ( Arbre );
	Pragma Assert ( Vide ( Arbre ) );
	New_line;
	Put_line ("=> Succès : Fin du test Supprimer_Arbre_Binaire_Test" );New_line;
   end Supprimer_Arbre_Binaire_Test;

    -- Modifier l'arbre binaire construit en supprimant quelques clés .
    --
    --                                     1
    --                         3  	 	      2
    --                                          5           10
    --
    -- Verifier si les clés 4 ,6 et 7 existe encore après la modification                                          
    -- Afficher l'arbre binaire après construction
    -- Vider l'arbre après la fin du test 
   procedure Existe_Arbre_Binaire_Test is
   begin
       Put ("Tester Existe_Arbre_Binaire_Test ");New_Line;
       Construire_Arbre_Binaire ( Arbre );
       Modifier ( Arbre , 4 , 10 );
       Pragma Assert ( not Existe ( Arbre , 4 ));
       Pragma Assert ( Existe ( Arbre , 10 ));
       Supprimer ( Arbre , 6 );
       Supprimer ( Arbre , 7 );
       Pragma Assert ( not Existe ( Arbre , 6 ));
       Pragma Assert ( not Existe ( Arbre , 7 ));
       Afficher_Arbre_Binaire ( Arbre , 1 );New_Line;
       Vider_Arbre ( Arbre );
       Pragma Assert ( Taille ( Arbre ) = 0 );
       Put_line ("=> Succès : Fin du test de Existe_Arbre_Binaire");New_Line;
  end Existe_Arbre_Binaire_Test;
begin
    
 Construire_Arbre_Binaire ( Arbre );
 Vider_Arbre_Binaire_Test;
 Modifier_Arbre_Binaire_Test;
 Supprimer_Arbre_Binaire_Test;
 Existe_Arbre_Binaire_Test;

end test_arbre_binaire;
