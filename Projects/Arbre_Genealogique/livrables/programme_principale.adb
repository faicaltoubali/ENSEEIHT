with Ada.text_IO ; use Ada.text_IO ;
with Ada.integer_text_IO ; use Ada.integer_text_IO  ;
with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;
with Ada.Strings.Unbounded.Text_IO ; use Ada.Strings.Unbounded.Text_IO;
with arbre_genealogique;


procedure programme_principale is 
taillearbre : integer;
procedure programme_principale1 (c : in Integer)  is
 

    package arbre_gen is 
        new arbre_genealogique( Registre_Taille => c );
    use arbre_gen ;
    
   package Mois_IO is new Enumeration_IO (T_Mois_Gen); use Mois_IO;

Abr : T_Abr_Genea ; 
T : T_Ensemble_Identifiant   ;
reponse  : Integer := 1      ; 
reponse1 : Integer           ;
reponse2 : Integer           ;
reponse3 : Integer           ;
Identifiant_racine : Integer ;
Identifiant_Pere   : Integer ;
Lieu_Naissance : Unbounded_String ;
Nom_racine : Unbounded_String ; 
Nom_pere : Unbounded_String ;
Prenom_racine : Unbounded_String ;
Prenom_pere : Unbounded_String ;  
Jour : Integer ;
Annee : Integer ;
Mois : T_Mois_Gen ;
n : Integer ;
m : Integer ;
alpha : Integer ;
Betta : Integer ;
Reponse_Mere_Pere : Integer ;
registre : T_Registre_Genea ;

begin 
Initialiser(registre);
Put_Line("Veuillez choisir la procédure que vous voulez opérer"                                           );
Put_Line(" -1 - Veuillez initialiser votre arbre par un individu."               );
Put_Line(" -2 - Ajouter un parent d'un individu"                                                                        ); 
Put_Line(" -3 - Obtenir le nombre d'ancêtres connus d'un individu donné,lui aussi compris ."              );
Put_Line(" -4 - Afficher l'arbre genealogique d'un individu donné ."                                                      );
Put_Line(" -5 - Supprimer , pour un arbre genealogique, un individu et ses ancêtres ."                                   );
Put_Line(" -6 - Obtenir l'ensemble des individus qui n'ont qu'un seul parent connu ."                           );
Put_Line(" -7 - Obtenir l'ensemble des individus qui ont deux parents connus ."                            );
Put_Line(" -8 - Obtenir l'ensemble des individus dont les deux parents sont inconnus."                     );
Put_Line(" -9 - Identifier les ancêtres d'un individu sur n donné générations données pour un individu donné.");                        
Put_Line(" -10- Verifier que deux individus n et m ont un ou plusieurs ancêtres homonymes ."              );
Put_Line(" -11- Verifier si un individu existe " );
get(reponse2);


if reponse2 = 1 then   
                                 Put_Line            ("Vous avez choisi d'initialiser un arbre genealogique par un individu ");
                                 Put_Line            ("veuillez entrer donc l'identifiant de votre individu                 ");
                                 Get                 (Identifiant_racine                                                   );
                                 Put_Line            ("quel est le nom de votre individu                                    ");
                                 Nom_racine := Get_Line;Skip_line;
                                 Put_Line            ("quel est le prenom de votre racine                                 ");
                                 Prenom_racine := Get_Line;
                                 Put_Line            ("quel est sa date de naissance ? ( le jour )                        ");
                                 Get                 (Jour                                                                 );Skip_line;
                                 Put_Line            ("quel est sa date de naissance ? ( le mois )                        ");
                                 Get(Mois) ; Skip_line;
                                 Put_Line            ("quel est sa date de naissance ? ( l'année )                        ");
                                 Get                 (Annee                                                                );
                                 Put_Line            ("quel est son lieu de naissance ?                                   ");
                                 Lieu_Naissance := Get_Line ;Skip_line;
                                 Creer_Minimal(Abr ,Identifiant_racine, registre , Nom_racine , Prenom_racine , Jour ,Janvier ,Annee, Lieu_Naissance);
                                 Put_Line            ("Merci pour votre saisi , Vous voulez continuer le programme ?"      );
                                 Put_Line            ("Si oui , tapez 1 . Si non , tapez 2"                                );
                                 Get                 (reponse1                                                             );

else   
                                                     Put("Vous n'avez pas encore creer un arbre genealogique");
                                 Put_Line            ("Vous voulez continuer le programme ?"      );
                                 Put_Line            ("Si oui , tapez 1 . Si non , tapez 2"                                );
                                 Get                 (reponse1                                                             );

end if ;

while reponse=1 loop 

Put_Line("Veuillez choisir la procédure que vous voulez opérer                                           ");
Put_Line(" -1 - Ajouter un parent                                                                        "); 
Put_Line(" -2 - Obtenir le nombre d'ancêtres connus d'un individu donné,lui aussi compris .               ");
Put_Line(" -3 - Afficher l'arbre d'individu donné .                                                      ");
Put_Line(" -4 - Supprimer , pour un arbre , un individu et ses ancêtres .                                   ");
Put_Line(" -5 - Obtenir l'ensemble des individu qui n'ont qu'un parent connu .                           ");
Put_Line(" -6 - Obtenir l'ensemble des individu qui ont deux parents connus .                            ");
Put_Line(" -7 - Obtenir l'ensemble des individu dont les deux parents sont inconnus.                     ");
Put_Line(" -8 - Identifier les ancêtres d'un individu sur n donné générations données pour un noeud donné.");                        
Put_Line(" -9 - Verifier que deux individus n et m ont un ou plusieurs ancêtres homonymes .               ");
Put_Line(" -10- Verifier si un individu existe                                                              ");
get(reponse3);
 
if reponse3 = 1 then 
               Put_Line            ("Vous avez choisi d'ajouter un parent");
               Put_Line            ("Vous voulez ajouter une mère ou un pére ? 1 pour père / 2 pour mère");
               Get(Reponse_Mere_Pere);
               if Reponse_Mere_Pere = 1 then 
                      Put_Line            ("Pour quel identifiant voulez vous ajouter un père?");
                      Get(Identifiant_racine);
                      Put_Line            ("quel est l'identifiant du parent ajouté?");
                      Get(Identifiant_Pere);
                      Put_Line("Quel est son nom");
                      Nom_pere := Get_Line;Skip_line;
                      Put_Line("Quel est son prenom");
                      Prenom_pere := Get_Line;
                      Put_Line            ("quel est sa date de naissance ? ( le jour )                        ");
                      Get   (Jour                                                                               );Skip_line;
                      Put_Line            ("quel est sa date de naissance ? ( le mois )                        ");
                      Get(Mois);Skip_Line;
                      Put_Line            ("quel est sa date de naissance ? ( l'année )                        ");
                      Get                  (Annee                                                               );
                      Put_Line            ("quel est son lieu de naissance ?                                   ");
                                 Lieu_Naissance := Get_Line ;Skip_line;
                      Ajouter_Pere (Abr,Identifiant_racine,Identifiant_Pere,Registre,Nom_pere,Prenom_pere,Jour,Janvier,Annee,Lieu_Naissance);
               elsif Reponse_Mere_Pere = 2 then 
                      Put_Line            ("Pour quel identifiant voulez vous ajouter une mère?");
                      Get(Identifiant_racine);
                      Put_Line            ("quel est l'identifiant du parent ajouté?");
                      Get(Identifiant_Pere);
                      Put_Line("Quel est son nom");
                      Nom_pere := Get_Line;Skip_Line;
                      Put_Line("Quel est son prenom");
                      Prenom_pere := Get_Line;
                      Put_Line            ("quel est sa date de naissance ? ( le jour )                        ");
                      Get (Jour                                                                                 );Skip_line;
                      Put_Line            ("quel est sa date de naissance ? ( le mois )                        ");
                      Get                 (Mois                                                                 );Skip_Line;
                      Put_Line            ("quel est sa date de naissance ? ( l'année )                        ");
                      Get (Annee                                                                                );
                      Put_Line            ("quel est son lieu de naissance ?                                   ");
                                 Lieu_Naissance := Get_Line ;Skip_Line;
                      Ajouter_Mere (Abr,Identifiant_racine,Identifiant_Pere,Registre,Nom_pere,Prenom_pere,Jour,Janvier,Annee,Lieu_Naissance );
               end if ;
               Put_Line            ("Merci pour votre saisi , Vous voulez continuer le programme ?");
               Put_Line            ("Si oui , tapez 1 . Si non , tapez 2");
               get(reponse);
          
elsif reponse3 =2 then  
             Put_Line       ("Vous avez choisi d'obtenir le nombre d'ancetres d'un individu , veuillez entrer l'identifiant de votre individu ");
             Get(Identifiant_racine);
             n := Nombre_Ancetre ( Abr  , Identifiant_racine ) ;
             Put_Line("le nombre d'ancetres de votre individu est");
             Put(n);New_Line;
             skip_line;
             Put_Line            ("Merci pour votre saisi , Vous voulez continuer le programme ?");
             Put_Line            ("Si oui , tapez 1 . Si non , tapez 2");
             get(reponse);
             skip_line;
elsif reponse3 =3 then  
             Put_Line      ("Vous avez choisi d'afficher l'arbre d'un noeud donné , veuillez entrer l'identifiant de votre noeud");
             Get(Identifiant_racine);
             skip_line;
             Afficher_Arbre_Noeud ( Abr  , Identifiant_racine , 1);New_line;
             Put_Line            ("Merci pour votre saisi , Vous voulez continuer le programme ?");
             Put_Line            ("Si oui , tapez 1 . Si non , tapez 2");
             get(reponse) ;
             skip_line; 
elsif reponse3 =4 then 
             Put_Line("Vous avez choisi de supprimer un individu et ses ancetres");
             Put_Line("Vous entrer l'identifiant de votre individu");
             get(Identifiant_racine);
             skip_line;
             Supprimer_Noeud_Ancetres ( Abr  , Identifiant_racine );
             Put_Line("Votre identifiant est bien supprimé avec succes");
             Put_Line            ("Merci pour votre saisi , Vous voulez continuer le programme ?");
             Put_Line            ("Si oui , tapez 1 . Si non , tapez 2");
             get(reponse);
             skip_line;
elsif reponse3 =5 then 
             Put_Line("Vous avez choisi d'obtenir l'ensemble des individus dont un seul parent est connu");
             T := Un_Seul_Parent ( Abr );
             Put_Line("L'ensemble est obtenu par succes , Voulez-vous l'afficher ? 1 : oui , 0 : Non ");
             get(Betta);
             skip_line;
             if Betta = 1 then 
                while T /= Null loop 
                      Put(T.all.Identifiant);New_Line;
                      T := T.all.suivant ; 
                end loop ; 
             end if ;New_Line;
             Put_Line            ("Merci pour votre saisi , Vous voulez continuer le programme ?");
             Put_Line            ("Si oui , tapez 1 . Si non , tapez 2");
             get(reponse);
             skip_line;
elsif reponse3= 6 then 
             Put_Line("Vous avez choisi d'obtenir l'ensemble des individus qui ont deux parents");
             T := Deux_parent( Abr ) ;
             Put_Line("L'ensemble est obtenu par succes , Voulez-vous l'afficher ? 1 : oui , 0 : Non ");
             get(Betta);
             skip_line;
             if Betta = 1 then 
                while T /= Null loop 
                      Put( Avoir_Identifiant (T) );New_Line;
                      T := Avoir_Suivant (  T ) ; 
                end loop ; 
             end if ;New_Line;
             Put_Line            ("Merci pour votre saisi , Vous voulez continuer le programme ?");
             Put_Line            ("Si oui , tapez 1 . Si non , tapez 2");
             get(reponse);
             skip_line;
elsif reponse3=7 then
             Put_Line("Vous avez choisi d'Obtenir l'ensemble des individu qui n'ont aucun parent");
             T := Aucun_Parent ( Abr );
             Put_Line("L'ensemble est obtenu par succes , Voulez-vous l'afficher ? 1 : oui , 0 : Non ");
             get(Betta);
             if Betta = 1 then 
                while T /= Null loop 
                      Put(T.all.Identifiant);New_Line;
                      T := T.all.suivant ; 
                end loop ; 
             end if ;New_Line;
             Put_Line            ("Merci pour votre saisi , Vous voulez continuer le programme ?");
             Put_Line            ("Si oui , tapez 1 . Si non , tapez 2");
             get(reponse);
             skip_line;
elsif reponse3=8 then  
             Put_Line("Vous avez choisi d'identifier les ancêtres d'un individu sur n donné générations données pour un noeud donné");
             Put_Line("Veuillez entrer le nombre n");
             get(n);
             skip_line;
             Put("Veuillez entrer votre identifiant");
             get(Identifiant_racine);
             T := Ancetres_Plusieurs_Generation ( Abr , Identifiant_racine  , n );
             if Betta = 1 then 
                while T /= Null loop 
                      Put(T.all.Identifiant);New_Line;
                      T := T.all.suivant ; 
                end loop ; 
             end if ;New_Line;
             Put_Line            ("Merci pour votre saisi , Vous voulez continuer le programme ?");
             Put_Line            ("Si oui , tapez 1 . Si non , tapez 2");
             get(reponse);
             skip_line;
elsif reponse3=9 then 
             Put_Line("Vous avez choisi de verifier que si deux identifant n et m ont un ancetre commun");
             Put_Line("Veuillez entrer l'identifiant n");
             get(n);
             skip_line;
             Put_Line("Veuillez entrer l'identifiant m");
             get(m);
             skip_line;
             if m > n then 
                 alpha := Verifier_Ancetres ( Abr  , m , n );
             else 
                 alpha := Verifier_Ancetres ( Abr  , n , m );
             end if;
             if alpha = 0 then 
                Put_Line("Les deux identifiants ne possedent pas un ancetre commun");
             elsif alpha = 1 then 
                Put_Line("Les deux identifiants possedent un ancetre commun");
             end if ;
             Put_Line            ("Merci pour votre saisi , Vous voulez continuer le programme ?");
             Put_Line            ("Si oui , tapez 1 . Si non , tapez 2");
             get(reponse);
             skip_line;
elsif reponse3=10 then  
             Put_Line("Vous avez choisi de verifier si un individu existe ou non");
             Put_Line("Veuillez entrer l'identifiant de votre individu");
             Get(Identifiant_racine); 
             skip_line;
             Put_Line("La reponse à votre demande est");
             if Existe_Noeud ( Abr , Identifiant_racine ) = True then 
                    Put_Line("Vrai");
             else 
                    Put_Line("Faux");
             end if ; 
             Put_Line            ("Merci pour votre saisi , Vous voulez continuer le programme ?");
             Put_Line            ("Si oui , tapez 1 . Si non , tapez 2");
             get(reponse);
             skip_line;

end if ;
end loop ;
 


if reponse=2 then
 
   Put_Line("vous avez choisi de quitter le programme , Merci ");

end if ; 
end programme_principale1;
begin 
Put ("Veuillez entrer le nombre de personnes ques vous voulez ajouter dans votre arbre genealogique : ");
Get(taillearbre);
programme_principale1( taillearbre + 1);
end programme_principale ;
