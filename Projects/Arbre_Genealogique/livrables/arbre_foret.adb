with Ada.integer_Text_IO; use Ada.integer_Text_IO;
with Ada.Text_IO ; use Ada.Text_IO;


package body Arbre_Foret is



	procedure Initialiser(Abr : out T_Abr_Foret) is   
	begin
		Abr := New T_Cellule;
		Abr.all.Tableau_Compagnons.Taille := 0;
	end Initialiser;

------------------------------------------------------------------------------------------------------

	function Vide (Abr : in T_Abr_Foret ) return Boolean is    
	begin
		return Abr = null;
	end Vide;

-------------------------------------------------------------------------------------------------------

	procedure Creer_Minimal (Abr : out T_Abr_Foret ; Cle : in integer) is   
	begin
		Abr := New T_Cellule;
		Abr.all.Cle := Cle;
		Abr.all.Tableau_Compagnons.Taille := 0;
	end Creer_Minimal;

-------------------------------------------------------------------------------------------------------
	
    Procedure Ajouter_Pere (Abr : in out T_Abr_Foret ; Cle : in integer; Cle_Pere : in integer) is  
		Curseur : T_Abr_Foret ;
	begin
		    Avoir_Arbre (Abr, Cle, Curseur); 
			if Vide(Curseur.all.Pere) then
				Creer_Minimal(Curseur.all.Pere,Cle_Pere);
			else
		     	raise Pere_Existe;
			end if;

	end Ajouter_Pere;

--------------------------------------------------------------------------------------------------------
	
    Procedure Ajouter_Mere ( Abr : in out T_Abr_Foret ; Cle : in integer ; Cle_Mere : in integer) is    
		Curseur : T_Abr_Foret;
	begin
		Avoir_Arbre(Abr , Cle, Curseur); 
		if Vide(Curseur.all.Mere) then
			Creer_Minimal(Curseur.all.Mere, Cle_Mere);
		else
			Raise Mere_Existe;
		end if;
	end Ajouter_Mere;

--------------------------------------------------------------------------------------------------------

	procedure Ajouter_Epoux ( Abr : in out T_Abr_Foret ; Cle : in integer; Cle_Epoux : in integer) is   
		Curseur : T_Abr_Foret;
	begin
		Avoir_Arbre(Abr,Cle,Curseur); 
		if Vide(Curseur.all.Epoux) then
			Creer_Minimal(Curseur.all.Epoux,Cle_Epoux);
		else
			Raise Epoux_Existe;
		end if;
	end Ajouter_Epoux;

--------------------------------------------------------------------------------------------------------

	procedure Ajouter_Compagnon( Abr : in out T_Abr_Foret ; Cle : in integer; Cle_Compagnon : in integer) is    
	Curseur : T_Abr_Foret;
    I : Integer := 1 ;
	begin
		Avoir_Arbre(Abr,Cle,Curseur); 
		if Existe_Compagnon (Curseur.All.Tableau_Compagnons,Cle_Compagnon) then
			raise Compagnon_Existe;
		end if;
            While not Vide ( Curseur.all.Tableau_Compagnons.Tableau(I) ) and I <= Capacite loop
                        I := I+1;
            end loop;
            Curseur.all.Tableau_Compagnons.Taille := Curseur.all.Tableau_Compagnons.Taille + 1;
			Creer_Minimal (Curseur.All.Tableau_Compagnons.Tableau(I), Cle_Compagnon);
	end Ajouter_Compagnon;

-------------------------------------------------------------------------------------------------------

	function Existe_Compagnon (TableauCompagnon : in T_Tableau; Cle_Compagnon : in integer) return Boolean is       
		I : integer := 1;
	begin
		while I <= TableauCompagnon.Taille and then TableauCompagnon.Tableau(I).All.Cle /= Cle_Compagnon loop
			I := I + 1;
		end loop;
		return (I <= TableauCompagnon.Taille);
	end Existe_Compagnon;

-------------------------------------------------------------------------------------------------------

	function Existe (Abr : in T_Abr_Foret ; Cle : in integer) return Boolean is     
		S : Boolean := False;
		I : integer :=1;
	begin
		if Abr = null then
			return False;
		elsif Abr.all.Cle = Cle then
			return True;
		else
			while I <= Abr.all.Tableau_Compagnons.Taille loop
				S := S or Existe(Abr.all.Tableau_Compagnons.Tableau(I),Cle);	
				I := I + 1 ;
			end loop;
			return Existe(Abr.all.Pere, Cle) or Existe(Abr.all.Mere,Cle) or Existe(Abr.all.Epoux,Cle) or S;
		end if;
	end Existe;

-----------------------------------------------------------------------------------------------------

	Procedure Avoir_Arbre (Abr : in T_Abr_Foret ; Cle : in integer; Curseur : in out T_Abr_Foret) is            
		I : integer := 1;
		begin
		if Vide(Abr) then
			null;
		elsif Abr.all.Cle = Cle then
			Curseur := Abr;
		elsif Existe (Abr.All.Pere , Cle ) then
                Avoir_Arbre ( Abr.All.Pere, Cle , Curseur );
        elsif Existe (Abr.All.Mere , Cle) then 
                Avoir_Arbre ( Abr.All.Mere, Cle , Curseur );
        elsif Existe (Abr.All.Epoux ,Cle) then 
                 Avoir_Arbre ( Abr.All.Epoux, Cle , Curseur );
        end if;
		while I <= Abr.All.Tableau_Compagnons.Taille loop
                if not Vide(Abr.All.Tableau_Compagnons.Tableau(i)) then
				     Avoir_Arbre(Abr.All.Tableau_Compagnons.Tableau(I),Cle,Curseur);
				     I := I + 1 ;
                end if;
		end loop;
       
	end Avoir_Arbre;


----------------------------------------------------------------------------------------------------

Procedure Demis_Soeurs_Freres_Pere (Abr : in T_Abr_Foret ) is
I_1 : integer := 1;
I_2 : integer := 1;
I_3 : integer := 1;
s : boolean := false ;
begin
if Vide(Abr) then
	null;
else
		while I_1 <= Abr.all.Tableau_Compagnons.Taille loop
			s := s or Existe (Abr.all.Tableau_Compagnons.Tableau(I_1),Abr.all.Pere.Cle); 
			I_1 := I_1 + 1;
		end loop;
		if s = True then
            Put ( " => Les demis freres de l'individu  :" & Integer'Image(Abr.All.Cle)  & "  de la part de son pere sont : ");
			while I_2 <= Abr.all.Tableau_Compagnons.Taille loop
				Afficher_Fils_Pere(Abr.all.Tableau_Compagnons.Tableau(I_2),Abr.all.Pere.Cle,Abr.all.Mere.Cle);
				I_2 := I_2 +1;
			end loop;
		end if; 
				while I_3 <= Abr.all.Tableau_Compagnons.Taille loop
					Demis_Soeurs_Freres_Pere(Abr.all.Tableau_Compagnons.Tableau(I_3));
					I_3 := I_3 + 1;
				end loop;
end if;
end Demis_Soeurs_Freres_Pere;

---------------------------------------------------------------------------------------------


procedure Afficher_Fils_Pere (Abr : in T_Abr_Foret ; Cle_Pere : in  integer; Cle_Mere : in integer) is
I : Integer := 1 ;
begin
	if Vide(Abr) then
		null;
	else
		if not Vide(Abr.All.Pere) and then Abr.All.Pere.Cle = Cle_Pere then
			if not Vide(Abr.all.Mere) and then Abr.all.Mere.Cle /= Cle_Mere then
                Put(Abr.all.Cle,width => 2);Put (" - " );               
			else
				null;
			end if;
		end if;
	   while I <= Abr.all.Tableau_Compagnons.Taille loop
				Afficher_Fils_Pere(Abr.all.Tableau_Compagnons.Tableau(I),Cle_Pere,Cle_Mere);
				I := I + 1;
		end loop;
	end if;
end Afficher_Fils_Pere;

----------------------------------------------------------------------------------------------------

Procedure Demis_Soeurs_Freres_Mere (Abr : in T_Abr_Foret ) is
I_1 : integer := 1;
I_2 : integer := 1;
I_3 : integer := 1;
s : boolean := false ;
begin
if Vide(Abr) then
	null;
else
		while I_1 <= Abr.all.Tableau_Compagnons.Taille loop
			s := s or Existe (Abr.all.Tableau_Compagnons.Tableau(I_1),Abr.all.Mere.Cle); 
			I_1 := I_1 + 1;
		end loop;
		if s = True then
            Put ( " => Les demis freres de l'individu  :" & Integer'Image(Abr.All.Cle)  & "  de la part de sa mere sont : ");
			while I_2 <= Abr.all.Tableau_Compagnons.Taille loop
				Afficher_Fils_Mere(Abr.all.Tableau_Compagnons.Tableau(I_2),Abr.all.Mere.Cle,Abr.all.Pere.Cle);
				I_2 := I_2 +1;
			end loop;
		else
				while I_3 <= Abr.all.Tableau_Compagnons.Taille loop
					Demis_Soeurs_Freres_Mere(Abr.all.Tableau_Compagnons.Tableau(I_3));
					I_3 := I_3 + 1;
				end loop;
		end if;
end if;
end Demis_Soeurs_Freres_Mere;

---------------------------------------------------------------------------------------------


procedure Afficher_Fils_Mere (Abr : in T_Abr_Foret ; Cle_Mere : in  integer; Cle_Pere : in integer) is
I : Integer := 1 ;
begin
	if Vide(Abr) then
		null;
	else
		if not Vide(Abr.All.Mere) and then Abr.All.Mere.Cle = Cle_Mere then
			if not Vide(Abr.all.Pere) and then Abr.all.Pere.Cle /= Cle_Pere then
                Put(Abr.all.Cle,width => 2);Put (" - " );               
			else
				null;
			end if;
		end if;
	   while I <= Abr.all.Tableau_Compagnons.Taille loop
				Afficher_Fils_Mere(Abr.all.Tableau_Compagnons.Tableau(I),Cle_Mere,Cle_Pere);
				I := I + 1;
		end loop;
	end if;
end Afficher_Fils_Mere;


---------------------------------------------------------------------------------------------
end Arbre_Foret;



















	






		
	
