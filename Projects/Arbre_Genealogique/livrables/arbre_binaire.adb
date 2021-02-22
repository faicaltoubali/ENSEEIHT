-- Implantation du module Arbre_Binaire
with Ada.Text_IO ; use Ada.Text_IO;
with Ada.Unchecked_Deallocation;

package body Arbre_Binaire is 	

    procedure Free is
	new Ada.Unchecked_Deallocation (Object => T_Noeud, Name => T_Abr);


    procedure Initialiser ( Abr : out T_Abr ) is
    begin
	Abr := Null ;
    end Initialiser; 

    function Vide( Abr : in T_Abr ) return boolean is
    begin 
	return Abr = Null;
    end Vide;

    function Taille ( Abr : in T_Abr ) return Integer is
    begin
	if Vide ( Abr ) then 
	    return 0 ;
	else 
	    return (1 + Taille ( Abr.All.Sous_Arbre_Droit ) + Taille ( Abr.All.Sous_Arbre_Gauche ) );
	end if;
    end Taille;

    procedure Creer_Arbre ( Abr : out T_Abr ; Cle : T_Cle ) is 
    begin 
	Abr := new T_Noeud'(Cle , null , null);
    end Creer_Arbre ; 


    procedure Ajouter_Fils_Droit ( Abr : in out T_Abr ; Cle_Donnee : in T_Cle ; Cle : in T_Cle ) is 
	Arbre : T_Abr;
    begin
	Arbre := Arbre_Cle (Abr ,Cle_Donnee );
	if Existe(Abr , Cle_Donnee) then 
	    if not Existe (Abr , Cle ) then
		if Arbre.All.Sous_Arbre_Droit = Null then 
		    Arbre.all.Sous_Arbre_Droit := new T_Noeud'(Cle , null , null);
		else 
		    raise Existe_Fils_Droit ;
		end if;
	    else 
		raise Cle_Existe_Exception ;
	    end if;
	else
	    raise Cle_Absente_Exception ;
	end if;
    exception
	when Existe_Fils_Droit => Put_line ("Le fils droit est déja existant");
	when Cle_Existe_Exception => Put_Line ("La clé est déja existante ");
	when Cle_Absente_Exception => Put_Line ("La clé est absente");
    end Ajouter_Fils_Droit ;

    procedure Ajouter_Fils_Gauche ( Abr : in out T_Abr ; Cle_Donnee : in T_Cle ; Cle : in T_Cle ) is 
	Arbre : T_Abr;
    begin
	Arbre := Arbre_Cle (Abr ,Cle_Donnee );
	if Existe(Abr , Cle_Donnee) then 
	    if not Existe (Abr , Cle ) then
		if Arbre.All.Sous_Arbre_Gauche = Null then 
		    Arbre.all.Sous_Arbre_Gauche:=new T_Noeud'(Cle , null , null);
		else 
		    raise Existe_Fils_Gauche ;
		end if;
	    else 
		raise Cle_Existe_Exception ;
	    end if;
	else
	    raise Cle_Absente_Exception ;
	end if;
    exception
	when Existe_Fils_Droit => Put_line ("Le fils droit est déja existant");
	when Cle_Existe_Exception => Put_Line ("La clé est déja existante ");
	when Cle_Absente_Exception => Put_Line ("La clé est absente");


    end Ajouter_Fils_Gauche;


    function Arbre_Cle ( Abr : in T_Abr ; Cle_Donnee : in T_Cle) return T_Abr is
    begin 
	if Abr.all.Cle = Cle_Donnee then 
	    return Abr ;
	elsif Existe (Abr.All.Sous_Arbre_Droit, Cle_Donnee ) then
	    return Arbre_Cle( Abr.all.Sous_Arbre_Droit , Cle_Donnee );
	elsif Existe ( Abr.All.Sous_Arbre_Gauche ,Cle_Donnee  ) then
	    return Arbre_Cle (Abr.All.Sous_Arbre_Gauche , Cle_Donnee) ;
	else
	    raise Cle_Absente_Exception ;
	end if;
    end Arbre_Cle;



    function Existe ( Abr : in T_Abr ; Cle_Donnee : in T_Cle ) return Boolean is
    begin
	if Vide (Abr) then 
	    return False ;
	elsif Abr.All.Cle = Cle_Donnee then 
	    return True ;
	else 
	    return ( Existe(Abr.All.Sous_Arbre_Droit, Cle_Donnee) or Existe ( Abr.All.Sous_Arbre_Gauche, Cle_Donnee ));
	end if;
    end Existe ;

    --Une autre solution possible pour la fonction existe 
    -- function Existe( Abr : in T_Abr ; Cle_Donnee : in T_Cle ) return Boolean is 
    --i : Integer := 0 ;

    --        procedure ajouter_1(Abr : in T_Abr ; Cle_Donnee : in T_Cle ) is
    --
    --         begin 
    --	if Abr.all.Cle = Cle_Donnee then 
    -- 		 i:=i+1; 
    --	else 
    -- 		 ajouter_1(Abr.all.Sous_Arbre_Gauche , Cle_Donnee);
    --		 ajouter_1(Abr.all.Sous_Arbre_Droit , Cle_Donnee);
    --	end if ;    
    --   end ajouter_1;	
    -- begin 
    --	ajouter_1 ( Abr , Cle_Donnee );
    --	return i=1 ; 
    --end Existe ; 	



    procedure Modifier ( Abr : in out T_Abr ; Cle_Donnee : in T_Cle ; Cle : in T_Cle ) is 
	Arbreamodifier : T_Abr ;
    begin 
	if Existe ( Abr , Cle_Donnee) then 
	    Arbreamodifier := Arbre_Cle ( Abr , Cle_Donnee) ;
	    Arbreamodifier.All.Cle := Cle ;
	else 
	    raise Cle_Absente_Exception ; 
	end if;
    exception 
	when Cle_Absente_Exception => Put_Line(" La clé est absente");
    end Modifier ;

    procedure Supprimer ( Abr : in out T_Abr ; Cle : in T_Cle ) is
    begin	
	    if Vide(Abr) then 
		null;
	    elsif Abr.All.Cle = Cle then 
		Free(Abr);
	    else 
		Supprimer(Abr.All.Sous_Arbre_Droit , Cle );
		Supprimer(Abr.All.Sous_Arbre_Gauche , Cle );
	    end if;
    end Supprimer;


    procedure Vider_Arbre ( Abr : out T_Abr ) is
    begin
	if Vide(Abr) then
	    null;
	else    
	    Supprimer( Abr , Abr.All.Cle);
	end if; 
    end Vider_Arbre ;


    procedure Afficher_Arbre_Binaire ( Abr : in T_Abr ;n : in integer) is
    begin 
	if Vide( Abr ) then 
	    null;
	else        
	    Afficher_Cle ( Abr.All.Cle);New_Line;
        if not Vide(Abr.All.Sous_Arbre_Droit) then
        for i in 1..n loop
            put(' ');
        end loop;
        put ("--père : ");
	    Afficher_Arbre_Binaire ( Abr.All.Sous_Arbre_Droit,5+n);New_Line;
        end if;
        if not Vide(Abr.All.Sous_Arbre_Gauche) then
        for i in 1..n loop
            put(' ');
        end loop;
        put ("--mère : ");
	    Afficher_Arbre_Binaire ( Abr.All.Sous_Arbre_Gauche,5+n);New_Line;
        end if;
	end if;
    end Afficher_Arbre_Binaire;

    function Avoir_Cle ( Abr : in T_Abr ; Cle : in T_Cle ) return T_Cle is 
	Arbre : T_Abr;
    begin 
	if Existe ( Abr , Cle ) then
	    Arbre := Arbre_Cle ( Abr , Cle );
	    return Arbre.All.Cle ;
	else 
	    raise Cle_Absente_Exception ;

	end if;
    end Avoir_Cle ;


    function Avoir_Cle_Arbre ( Abr : T_Abr ) return T_Cle is 
    begin
	return Abr.All.Cle;
    end Avoir_Cle_Arbre;


    function Avoir_Sous_Arbre_Droit ( Abr : in T_Abr ) return T_Abr is
    begin
	return Abr.All.Sous_Arbre_Droit ;
    end Avoir_Sous_Arbre_Droit;


    function Avoir_Sous_Arbre_Gauche ( Abr : in T_Abr ) return T_Abr is
    begin
	return Abr.All.Sous_Arbre_Gauche ;
    end Avoir_Sous_Arbre_Gauche;





end Arbre_Binaire;
