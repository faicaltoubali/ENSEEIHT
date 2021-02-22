with registre ; 
with Ada.Strings.Unbounded ; use Ada.Strings.Unbounded ;
with Ada.Text_IO ; use Ada.Text_IO ; 
procedure test_registre is 

     package test_registre_100 is
         new registre(Capacite => 100);
     use test_registre_100 ; 

R : T_Registre ; 
D : T_Dictionnaire ; 

procedure Test_Registre_Vide is 
begin
  Initialiser(R);
  Pragma Assert(Est_vide(R));
  Put_line("Test_Regsitre_Vide est verifié");
end Test_Registre_Vide ; 

procedure Test_Creer_et_ajouter_dictionnaire is 
begin
     D := Creer_Dictionnaire( To_Unbounded_String("aassou") , To_Unbounded_String("ayoub") , 20 , Janvier , 2000 , To_Unbounded_String("NADOR") ) ;
     Put_line("Test_Registre_Creer_et_ajouter_dictionnaire est verifié");
end Test_Creer_et_ajouter_dictionnaire ; 

procedure Test_Ajouter_1_Dictionnaire is 
begin
     Initialiser(R);
     D := Creer_Dictionnaire( To_Unbounded_String("aassou") , To_Unbounded_String("ayoub") , 20 , Janvier , 2000 , To_Unbounded_String("NADOR") ) ;
     Ajouter_Identifiant_Dictionnaire( R , 1 , D);
     pragma Assert( not Est_Vide(R));
     Put_line("Test_Ajouter_1_Dictionnaire");
end Test_Ajouter_1_Dictionnaire ;

begin
  Test_Registre_Vide ;
  Test_Creer_et_ajouter_dictionnaire ;
  Test_Ajouter_1_Dictionnaire ; 
end test_registre ; 
