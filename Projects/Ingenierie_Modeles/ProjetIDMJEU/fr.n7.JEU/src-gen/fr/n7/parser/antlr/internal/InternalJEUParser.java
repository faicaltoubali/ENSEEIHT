package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.JEUGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJEUParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Jeu'", "'{'", "','", "'}'", "'Joueur'", "'connaissance'", "'inventaire'", "'objet'", "'lieu'", "'Chemin'", "'de'", "'a'", "'ouvertOuferme'", "'visibilite'", "'accescondition'", "'visiblecondition'", "'description'", "'condition'", "'consomme'", "'Lieu'", "'type'", "'personne'", "'Connaissance'", "'activite'", "'possede'", "'actifcondition'", "'Objet'", "'taille'", "'quantite'", "'danslelieu'", "'deposersi'", "'Interaction'", "'question'", "'choix'", "'ChoixJoueur'", "'nom'", "'comparateur'", "'reference'", "'presente'", "'interaction'", "'actions'", "'('", "')'", "'fin'", "'action'", "'choixsuivants'", "'finale'", "'<='", "'='", "'>='", "'visible'", "'invisible'", "'debut'", "'normal'", "'ouvert'", "'ferme'", "'actif'", "'inactif'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalJEUParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJEUParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJEUParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJEU.g"; }



     	private JEUGrammarAccess grammarAccess;

        public InternalJEUParser(TokenStream input, JEUGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Jeu";
       	}

       	@Override
       	protected JEUGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJeu"
    // InternalJEU.g:65:1: entryRuleJeu returns [EObject current=null] : iv_ruleJeu= ruleJeu EOF ;
    public final EObject entryRuleJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJeu = null;


        try {
            // InternalJEU.g:65:44: (iv_ruleJeu= ruleJeu EOF )
            // InternalJEU.g:66:2: iv_ruleJeu= ruleJeu EOF
            {
             newCompositeNode(grammarAccess.getJeuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJeu=ruleJeu();

            state._fsp--;

             current =iv_ruleJeu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJeu"


    // $ANTLR start "ruleJeu"
    // InternalJEU.g:72:1: ruleJeu returns [EObject current=null] : (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_joueur_3_0= ruleJoueur ) ) ( ( (lv_jeuelement_4_0= ruleJeuElement ) ) (otherlv_5= ',' ( (lv_jeuelement_6_0= ruleJeuElement ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_joueur_3_0 = null;

        EObject lv_jeuelement_4_0 = null;

        EObject lv_jeuelement_6_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:78:2: ( (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_joueur_3_0= ruleJoueur ) ) ( ( (lv_jeuelement_4_0= ruleJeuElement ) ) (otherlv_5= ',' ( (lv_jeuelement_6_0= ruleJeuElement ) ) )* )? otherlv_7= '}' ) )
            // InternalJEU.g:79:2: (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_joueur_3_0= ruleJoueur ) ) ( ( (lv_jeuelement_4_0= ruleJeuElement ) ) (otherlv_5= ',' ( (lv_jeuelement_6_0= ruleJeuElement ) ) )* )? otherlv_7= '}' )
            {
            // InternalJEU.g:79:2: (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_joueur_3_0= ruleJoueur ) ) ( ( (lv_jeuelement_4_0= ruleJeuElement ) ) (otherlv_5= ',' ( (lv_jeuelement_6_0= ruleJeuElement ) ) )* )? otherlv_7= '}' )
            // InternalJEU.g:80:3: otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_joueur_3_0= ruleJoueur ) ) ( ( (lv_jeuelement_4_0= ruleJeuElement ) ) (otherlv_5= ',' ( (lv_jeuelement_6_0= ruleJeuElement ) ) )* )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJeuAccess().getJeuKeyword_0());
            		
            // InternalJEU.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJEU.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJEU.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalJEU.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJeuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJEU.g:106:3: ( (lv_joueur_3_0= ruleJoueur ) )
            // InternalJEU.g:107:4: (lv_joueur_3_0= ruleJoueur )
            {
            // InternalJEU.g:107:4: (lv_joueur_3_0= ruleJoueur )
            // InternalJEU.g:108:5: lv_joueur_3_0= ruleJoueur
            {

            					newCompositeNode(grammarAccess.getJeuAccess().getJoueurJoueurParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_joueur_3_0=ruleJoueur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJeuRule());
            					}
            					set(
            						current,
            						"joueur",
            						lv_joueur_3_0,
            						"fr.n7.JEU.Joueur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJEU.g:125:3: ( ( (lv_jeuelement_4_0= ruleJeuElement ) ) (otherlv_5= ',' ( (lv_jeuelement_6_0= ruleJeuElement ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20||LA2_0==30||LA2_0==33||LA2_0==37) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJEU.g:126:4: ( (lv_jeuelement_4_0= ruleJeuElement ) ) (otherlv_5= ',' ( (lv_jeuelement_6_0= ruleJeuElement ) ) )*
                    {
                    // InternalJEU.g:126:4: ( (lv_jeuelement_4_0= ruleJeuElement ) )
                    // InternalJEU.g:127:5: (lv_jeuelement_4_0= ruleJeuElement )
                    {
                    // InternalJEU.g:127:5: (lv_jeuelement_4_0= ruleJeuElement )
                    // InternalJEU.g:128:6: lv_jeuelement_4_0= ruleJeuElement
                    {

                    						newCompositeNode(grammarAccess.getJeuAccess().getJeuelementJeuElementParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_jeuelement_4_0=ruleJeuElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJeuRule());
                    						}
                    						add(
                    							current,
                    							"jeuelement",
                    							lv_jeuelement_4_0,
                    							"fr.n7.JEU.JeuElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJEU.g:145:4: (otherlv_5= ',' ( (lv_jeuelement_6_0= ruleJeuElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalJEU.g:146:5: otherlv_5= ',' ( (lv_jeuelement_6_0= ruleJeuElement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getJeuAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalJEU.g:150:5: ( (lv_jeuelement_6_0= ruleJeuElement ) )
                    	    // InternalJEU.g:151:6: (lv_jeuelement_6_0= ruleJeuElement )
                    	    {
                    	    // InternalJEU.g:151:6: (lv_jeuelement_6_0= ruleJeuElement )
                    	    // InternalJEU.g:152:7: lv_jeuelement_6_0= ruleJeuElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getJeuAccess().getJeuelementJeuElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_jeuelement_6_0=ruleJeuElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJeuRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"jeuelement",
                    	    								lv_jeuelement_6_0,
                    	    								"fr.n7.JEU.JeuElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJeu"


    // $ANTLR start "entryRuleJeuElement"
    // InternalJEU.g:179:1: entryRuleJeuElement returns [EObject current=null] : iv_ruleJeuElement= ruleJeuElement EOF ;
    public final EObject entryRuleJeuElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJeuElement = null;


        try {
            // InternalJEU.g:179:51: (iv_ruleJeuElement= ruleJeuElement EOF )
            // InternalJEU.g:180:2: iv_ruleJeuElement= ruleJeuElement EOF
            {
             newCompositeNode(grammarAccess.getJeuElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJeuElement=ruleJeuElement();

            state._fsp--;

             current =iv_ruleJeuElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJeuElement"


    // $ANTLR start "ruleJeuElement"
    // InternalJEU.g:186:1: ruleJeuElement returns [EObject current=null] : (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin | this_Objet_2= ruleObjet | this_Connaissance_3= ruleConnaissance ) ;
    public final EObject ruleJeuElement() throws RecognitionException {
        EObject current = null;

        EObject this_Lieu_0 = null;

        EObject this_Chemin_1 = null;

        EObject this_Objet_2 = null;

        EObject this_Connaissance_3 = null;



        	enterRule();

        try {
            // InternalJEU.g:192:2: ( (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin | this_Objet_2= ruleObjet | this_Connaissance_3= ruleConnaissance ) )
            // InternalJEU.g:193:2: (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin | this_Objet_2= ruleObjet | this_Connaissance_3= ruleConnaissance )
            {
            // InternalJEU.g:193:2: (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin | this_Objet_2= ruleObjet | this_Connaissance_3= ruleConnaissance )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 37:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalJEU.g:194:3: this_Lieu_0= ruleLieu
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getLieuParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lieu_0=ruleLieu();

                    state._fsp--;


                    			current = this_Lieu_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJEU.g:203:3: this_Chemin_1= ruleChemin
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getCheminParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Chemin_1=ruleChemin();

                    state._fsp--;


                    			current = this_Chemin_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJEU.g:212:3: this_Objet_2= ruleObjet
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getObjetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Objet_2=ruleObjet();

                    state._fsp--;


                    			current = this_Objet_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJEU.g:221:3: this_Connaissance_3= ruleConnaissance
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getConnaissanceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connaissance_3=ruleConnaissance();

                    state._fsp--;


                    			current = this_Connaissance_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJeuElement"


    // $ANTLR start "entryRuleJoueur"
    // InternalJEU.g:233:1: entryRuleJoueur returns [EObject current=null] : iv_ruleJoueur= ruleJoueur EOF ;
    public final EObject entryRuleJoueur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoueur = null;


        try {
            // InternalJEU.g:233:47: (iv_ruleJoueur= ruleJoueur EOF )
            // InternalJEU.g:234:2: iv_ruleJoueur= ruleJoueur EOF
            {
             newCompositeNode(grammarAccess.getJoueurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoueur=ruleJoueur();

            state._fsp--;

             current =iv_ruleJoueur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoueur"


    // $ANTLR start "ruleJoueur"
    // InternalJEU.g:240:1: ruleJoueur returns [EObject current=null] : (otherlv_0= 'Joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissance' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )? otherlv_9= 'inventaire' ( (lv_tailleinventaire_10_0= RULE_INT ) ) (otherlv_11= 'objet' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? otherlv_17= 'lieu' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' ) ;
    public final EObject ruleJoueur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_tailleinventaire_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;


        	enterRule();

        try {
            // InternalJEU.g:246:2: ( (otherlv_0= 'Joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissance' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )? otherlv_9= 'inventaire' ( (lv_tailleinventaire_10_0= RULE_INT ) ) (otherlv_11= 'objet' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? otherlv_17= 'lieu' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' ) )
            // InternalJEU.g:247:2: (otherlv_0= 'Joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissance' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )? otherlv_9= 'inventaire' ( (lv_tailleinventaire_10_0= RULE_INT ) ) (otherlv_11= 'objet' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? otherlv_17= 'lieu' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' )
            {
            // InternalJEU.g:247:2: (otherlv_0= 'Joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissance' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )? otherlv_9= 'inventaire' ( (lv_tailleinventaire_10_0= RULE_INT ) ) (otherlv_11= 'objet' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? otherlv_17= 'lieu' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' )
            // InternalJEU.g:248:3: otherlv_0= 'Joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissance' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )? otherlv_9= 'inventaire' ( (lv_tailleinventaire_10_0= RULE_INT ) ) (otherlv_11= 'objet' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? otherlv_17= 'lieu' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJoueurAccess().getJoueurKeyword_0());
            		
            // InternalJEU.g:252:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJEU.g:253:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJEU.g:253:4: (lv_name_1_0= RULE_ID )
            // InternalJEU.g:254:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJoueurAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoueurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJEU.g:274:3: (otherlv_3= 'connaissance' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJEU.g:275:4: otherlv_3= 'connaissance' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getJoueurAccess().getConnaissanceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalJEU.g:283:4: ( (otherlv_5= RULE_ID ) )
                    // InternalJEU.g:284:5: (otherlv_5= RULE_ID )
                    {
                    // InternalJEU.g:284:5: (otherlv_5= RULE_ID )
                    // InternalJEU.g:285:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJoueurRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_5, grammarAccess.getJoueurAccess().getConnaissanceConnaissanceCrossReference_3_2_0());
                    					

                    }


                    }

                    // InternalJEU.g:296:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJEU.g:297:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getJoueurAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalJEU.g:301:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalJEU.g:302:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalJEU.g:302:6: (otherlv_7= RULE_ID )
                    	    // InternalJEU.g:303:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJoueurRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getJoueurAccess().getConnaissanceConnaissanceCrossReference_3_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getJoueurAccess().getInventaireKeyword_4());
            		
            // InternalJEU.g:324:3: ( (lv_tailleinventaire_10_0= RULE_INT ) )
            // InternalJEU.g:325:4: (lv_tailleinventaire_10_0= RULE_INT )
            {
            // InternalJEU.g:325:4: (lv_tailleinventaire_10_0= RULE_INT )
            // InternalJEU.g:326:5: lv_tailleinventaire_10_0= RULE_INT
            {
            lv_tailleinventaire_10_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_tailleinventaire_10_0, grammarAccess.getJoueurAccess().getTailleinventaireINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoueurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tailleinventaire",
            						lv_tailleinventaire_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalJEU.g:342:3: (otherlv_11= 'objet' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJEU.g:343:4: otherlv_11= 'objet' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getJoueurAccess().getObjetKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalJEU.g:351:4: ( (otherlv_13= RULE_ID ) )
                    // InternalJEU.g:352:5: (otherlv_13= RULE_ID )
                    {
                    // InternalJEU.g:352:5: (otherlv_13= RULE_ID )
                    // InternalJEU.g:353:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJoueurRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_13, grammarAccess.getJoueurAccess().getObjetsObjetCrossReference_6_2_0());
                    					

                    }


                    }

                    // InternalJEU.g:364:4: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==13) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalJEU.g:365:5: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_14=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getJoueurAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalJEU.g:369:5: ( (otherlv_15= RULE_ID ) )
                    	    // InternalJEU.g:370:6: (otherlv_15= RULE_ID )
                    	    {
                    	    // InternalJEU.g:370:6: (otherlv_15= RULE_ID )
                    	    // InternalJEU.g:371:7: otherlv_15= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJoueurRule());
                    	    							}
                    	    						
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    							newLeafNode(otherlv_15, grammarAccess.getJoueurAccess().getObjetsObjetCrossReference_6_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getJoueurAccess().getLieuKeyword_7());
            		
            // InternalJEU.g:392:3: ( (otherlv_18= RULE_ID ) )
            // InternalJEU.g:393:4: (otherlv_18= RULE_ID )
            {
            // InternalJEU.g:393:4: (otherlv_18= RULE_ID )
            // InternalJEU.g:394:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoueurRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_18, grammarAccess.getJoueurAccess().getLieuLieuCrossReference_8_0());
            				

            }


            }

            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoueur"


    // $ANTLR start "entryRuleChemin"
    // InternalJEU.g:413:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalJEU.g:413:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalJEU.g:414:2: iv_ruleChemin= ruleChemin EOF
            {
             newCompositeNode(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChemin=ruleChemin();

            state._fsp--;

             current =iv_ruleChemin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalJEU.g:420:1: ruleChemin returns [EObject current=null] : (otherlv_0= 'Chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'de' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'a' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'ouvertOuferme' ( (lv_ouvertOUferme_8_0= ruleouvertOuferme ) ) otherlv_9= 'visibilite' ( (lv_visibilite_10_0= ruletypevisibilite ) ) (otherlv_11= 'accescondition' ( (lv_acces_12_0= rulecondition ) ) )? (otherlv_13= 'visiblecondition' ( (lv_visible_14_0= rulecondition ) ) )? (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )? (otherlv_17= 'connaissance' otherlv_18= '{' ( (lv_allocateursConnaissance_19_0= ruleAllocateurConnaissance ) ) (otherlv_20= ',' ( (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance ) ) )* otherlv_22= '}' )? (otherlv_23= 'objet' otherlv_24= '{' ( (lv_allocateursObjetLieu_25_0= ruleAllocateurObjet ) ) (otherlv_26= ',' ( (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleChemin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Enumerator lv_ouvertOUferme_8_0 = null;

        Enumerator lv_visibilite_10_0 = null;

        EObject lv_acces_12_0 = null;

        EObject lv_visible_14_0 = null;

        EObject lv_allocateursConnaissance_19_0 = null;

        EObject lv_allocateursConnaissance_21_0 = null;

        EObject lv_allocateursObjetLieu_25_0 = null;

        EObject lv_allocateursObjetLieu_27_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:426:2: ( (otherlv_0= 'Chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'de' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'a' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'ouvertOuferme' ( (lv_ouvertOUferme_8_0= ruleouvertOuferme ) ) otherlv_9= 'visibilite' ( (lv_visibilite_10_0= ruletypevisibilite ) ) (otherlv_11= 'accescondition' ( (lv_acces_12_0= rulecondition ) ) )? (otherlv_13= 'visiblecondition' ( (lv_visible_14_0= rulecondition ) ) )? (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )? (otherlv_17= 'connaissance' otherlv_18= '{' ( (lv_allocateursConnaissance_19_0= ruleAllocateurConnaissance ) ) (otherlv_20= ',' ( (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance ) ) )* otherlv_22= '}' )? (otherlv_23= 'objet' otherlv_24= '{' ( (lv_allocateursObjetLieu_25_0= ruleAllocateurObjet ) ) (otherlv_26= ',' ( (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalJEU.g:427:2: (otherlv_0= 'Chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'de' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'a' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'ouvertOuferme' ( (lv_ouvertOUferme_8_0= ruleouvertOuferme ) ) otherlv_9= 'visibilite' ( (lv_visibilite_10_0= ruletypevisibilite ) ) (otherlv_11= 'accescondition' ( (lv_acces_12_0= rulecondition ) ) )? (otherlv_13= 'visiblecondition' ( (lv_visible_14_0= rulecondition ) ) )? (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )? (otherlv_17= 'connaissance' otherlv_18= '{' ( (lv_allocateursConnaissance_19_0= ruleAllocateurConnaissance ) ) (otherlv_20= ',' ( (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance ) ) )* otherlv_22= '}' )? (otherlv_23= 'objet' otherlv_24= '{' ( (lv_allocateursObjetLieu_25_0= ruleAllocateurObjet ) ) (otherlv_26= ',' ( (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalJEU.g:427:2: (otherlv_0= 'Chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'de' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'a' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'ouvertOuferme' ( (lv_ouvertOUferme_8_0= ruleouvertOuferme ) ) otherlv_9= 'visibilite' ( (lv_visibilite_10_0= ruletypevisibilite ) ) (otherlv_11= 'accescondition' ( (lv_acces_12_0= rulecondition ) ) )? (otherlv_13= 'visiblecondition' ( (lv_visible_14_0= rulecondition ) ) )? (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )? (otherlv_17= 'connaissance' otherlv_18= '{' ( (lv_allocateursConnaissance_19_0= ruleAllocateurConnaissance ) ) (otherlv_20= ',' ( (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance ) ) )* otherlv_22= '}' )? (otherlv_23= 'objet' otherlv_24= '{' ( (lv_allocateursObjetLieu_25_0= ruleAllocateurObjet ) ) (otherlv_26= ',' ( (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalJEU.g:428:3: otherlv_0= 'Chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'de' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'a' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'ouvertOuferme' ( (lv_ouvertOUferme_8_0= ruleouvertOuferme ) ) otherlv_9= 'visibilite' ( (lv_visibilite_10_0= ruletypevisibilite ) ) (otherlv_11= 'accescondition' ( (lv_acces_12_0= rulecondition ) ) )? (otherlv_13= 'visiblecondition' ( (lv_visible_14_0= rulecondition ) ) )? (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )? (otherlv_17= 'connaissance' otherlv_18= '{' ( (lv_allocateursConnaissance_19_0= ruleAllocateurConnaissance ) ) (otherlv_20= ',' ( (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance ) ) )* otherlv_22= '}' )? (otherlv_23= 'objet' otherlv_24= '{' ( (lv_allocateursObjetLieu_25_0= ruleAllocateurObjet ) ) (otherlv_26= ',' ( (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminAccess().getCheminKeyword_0());
            		
            // InternalJEU.g:432:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJEU.g:433:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJEU.g:433:4: (lv_name_1_0= RULE_ID )
            // InternalJEU.g:434:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCheminAccess().getDeKeyword_3());
            		
            // InternalJEU.g:458:3: ( (otherlv_4= RULE_ID ) )
            // InternalJEU.g:459:4: (otherlv_4= RULE_ID )
            {
            // InternalJEU.g:459:4: (otherlv_4= RULE_ID )
            // InternalJEU.g:460:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_4, grammarAccess.getCheminAccess().getSourceLieuCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCheminAccess().getAKeyword_5());
            		
            // InternalJEU.g:475:3: ( (otherlv_6= RULE_ID ) )
            // InternalJEU.g:476:4: (otherlv_6= RULE_ID )
            {
            // InternalJEU.g:476:4: (otherlv_6= RULE_ID )
            // InternalJEU.g:477:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_6, grammarAccess.getCheminAccess().getDestinationLieuCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getCheminAccess().getOuvertOufermeKeyword_7());
            		
            // InternalJEU.g:492:3: ( (lv_ouvertOUferme_8_0= ruleouvertOuferme ) )
            // InternalJEU.g:493:4: (lv_ouvertOUferme_8_0= ruleouvertOuferme )
            {
            // InternalJEU.g:493:4: (lv_ouvertOUferme_8_0= ruleouvertOuferme )
            // InternalJEU.g:494:5: lv_ouvertOUferme_8_0= ruleouvertOuferme
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getOuvertOUfermeOuvertOufermeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_ouvertOUferme_8_0=ruleouvertOuferme();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheminRule());
            					}
            					set(
            						current,
            						"ouvertOUferme",
            						lv_ouvertOUferme_8_0,
            						"fr.n7.JEU.ouvertOuferme");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getCheminAccess().getVisibiliteKeyword_9());
            		
            // InternalJEU.g:515:3: ( (lv_visibilite_10_0= ruletypevisibilite ) )
            // InternalJEU.g:516:4: (lv_visibilite_10_0= ruletypevisibilite )
            {
            // InternalJEU.g:516:4: (lv_visibilite_10_0= ruletypevisibilite )
            // InternalJEU.g:517:5: lv_visibilite_10_0= ruletypevisibilite
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getVisibiliteTypevisibiliteEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_21);
            lv_visibilite_10_0=ruletypevisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheminRule());
            					}
            					set(
            						current,
            						"visibilite",
            						lv_visibilite_10_0,
            						"fr.n7.JEU.typevisibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJEU.g:534:3: (otherlv_11= 'accescondition' ( (lv_acces_12_0= rulecondition ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJEU.g:535:4: otherlv_11= 'accescondition' ( (lv_acces_12_0= rulecondition ) )
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getCheminAccess().getAccesconditionKeyword_11_0());
                    			
                    // InternalJEU.g:539:4: ( (lv_acces_12_0= rulecondition ) )
                    // InternalJEU.g:540:5: (lv_acces_12_0= rulecondition )
                    {
                    // InternalJEU.g:540:5: (lv_acces_12_0= rulecondition )
                    // InternalJEU.g:541:6: lv_acces_12_0= rulecondition
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getAccesConditionParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_acces_12_0=rulecondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    						}
                    						set(
                    							current,
                    							"acces",
                    							lv_acces_12_0,
                    							"fr.n7.JEU.condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJEU.g:559:3: (otherlv_13= 'visiblecondition' ( (lv_visible_14_0= rulecondition ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJEU.g:560:4: otherlv_13= 'visiblecondition' ( (lv_visible_14_0= rulecondition ) )
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getCheminAccess().getVisibleconditionKeyword_12_0());
                    			
                    // InternalJEU.g:564:4: ( (lv_visible_14_0= rulecondition ) )
                    // InternalJEU.g:565:5: (lv_visible_14_0= rulecondition )
                    {
                    // InternalJEU.g:565:5: (lv_visible_14_0= rulecondition )
                    // InternalJEU.g:566:6: lv_visible_14_0= rulecondition
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getVisibleConditionParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_visible_14_0=rulecondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    						}
                    						set(
                    							current,
                    							"visible",
                    							lv_visible_14_0,
                    							"fr.n7.JEU.condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJEU.g:584:3: (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJEU.g:585:4: otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getCheminAccess().getDescriptionKeyword_13_0());
                    			
                    // InternalJEU.g:589:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalJEU.g:590:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalJEU.g:590:5: (lv_description_16_0= RULE_STRING )
                    // InternalJEU.g:591:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_description_16_0, grammarAccess.getCheminAccess().getDescriptionSTRINGTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheminRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJEU.g:608:3: (otherlv_17= 'connaissance' otherlv_18= '{' ( (lv_allocateursConnaissance_19_0= ruleAllocateurConnaissance ) ) (otherlv_20= ',' ( (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance ) ) )* otherlv_22= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJEU.g:609:4: otherlv_17= 'connaissance' otherlv_18= '{' ( (lv_allocateursConnaissance_19_0= ruleAllocateurConnaissance ) ) (otherlv_20= ',' ( (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getCheminAccess().getConnaissanceKeyword_14_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalJEU.g:617:4: ( (lv_allocateursConnaissance_19_0= ruleAllocateurConnaissance ) )
                    // InternalJEU.g:618:5: (lv_allocateursConnaissance_19_0= ruleAllocateurConnaissance )
                    {
                    // InternalJEU.g:618:5: (lv_allocateursConnaissance_19_0= ruleAllocateurConnaissance )
                    // InternalJEU.g:619:6: lv_allocateursConnaissance_19_0= ruleAllocateurConnaissance
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getAllocateursConnaissanceAllocateurConnaissanceParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_allocateursConnaissance_19_0=ruleAllocateurConnaissance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    						}
                    						add(
                    							current,
                    							"allocateursConnaissance",
                    							lv_allocateursConnaissance_19_0,
                    							"fr.n7.JEU.AllocateurConnaissance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJEU.g:636:4: (otherlv_20= ',' ( (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==13) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalJEU.g:637:5: otherlv_20= ',' ( (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance ) )
                    	    {
                    	    otherlv_20=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getCheminAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalJEU.g:641:5: ( (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance ) )
                    	    // InternalJEU.g:642:6: (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance )
                    	    {
                    	    // InternalJEU.g:642:6: (lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance )
                    	    // InternalJEU.g:643:7: lv_allocateursConnaissance_21_0= ruleAllocateurConnaissance
                    	    {

                    	    							newCompositeNode(grammarAccess.getCheminAccess().getAllocateursConnaissanceAllocateurConnaissanceParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_allocateursConnaissance_21_0=ruleAllocateurConnaissance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCheminRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"allocateursConnaissance",
                    	    								lv_allocateursConnaissance_21_0,
                    	    								"fr.n7.JEU.AllocateurConnaissance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,14,FOLLOW_27); 

                    				newLeafNode(otherlv_22, grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalJEU.g:666:3: (otherlv_23= 'objet' otherlv_24= '{' ( (lv_allocateursObjetLieu_25_0= ruleAllocateurObjet ) ) (otherlv_26= ',' ( (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet ) ) )* otherlv_28= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJEU.g:667:4: otherlv_23= 'objet' otherlv_24= '{' ( (lv_allocateursObjetLieu_25_0= ruleAllocateurObjet ) ) (otherlv_26= ',' ( (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getCheminAccess().getObjetKeyword_15_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalJEU.g:675:4: ( (lv_allocateursObjetLieu_25_0= ruleAllocateurObjet ) )
                    // InternalJEU.g:676:5: (lv_allocateursObjetLieu_25_0= ruleAllocateurObjet )
                    {
                    // InternalJEU.g:676:5: (lv_allocateursObjetLieu_25_0= ruleAllocateurObjet )
                    // InternalJEU.g:677:6: lv_allocateursObjetLieu_25_0= ruleAllocateurObjet
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getAllocateursObjetLieuAllocateurObjetParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_allocateursObjetLieu_25_0=ruleAllocateurObjet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    						}
                    						add(
                    							current,
                    							"allocateursObjetLieu",
                    							lv_allocateursObjetLieu_25_0,
                    							"fr.n7.JEU.AllocateurObjet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJEU.g:694:4: (otherlv_26= ',' ( (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==13) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalJEU.g:695:5: otherlv_26= ',' ( (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet ) )
                    	    {
                    	    otherlv_26=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getCheminAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalJEU.g:699:5: ( (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet ) )
                    	    // InternalJEU.g:700:6: (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet )
                    	    {
                    	    // InternalJEU.g:700:6: (lv_allocateursObjetLieu_27_0= ruleAllocateurObjet )
                    	    // InternalJEU.g:701:7: lv_allocateursObjetLieu_27_0= ruleAllocateurObjet
                    	    {

                    	    							newCompositeNode(grammarAccess.getCheminAccess().getAllocateursObjetLieuAllocateurObjetParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_allocateursObjetLieu_27_0=ruleAllocateurObjet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCheminRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"allocateursObjetLieu",
                    	    								lv_allocateursObjetLieu_27_0,
                    	    								"fr.n7.JEU.AllocateurObjet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,14,FOLLOW_14); 

                    				newLeafNode(otherlv_28, grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRuleAllocateurConnaissance"
    // InternalJEU.g:732:1: entryRuleAllocateurConnaissance returns [EObject current=null] : iv_ruleAllocateurConnaissance= ruleAllocateurConnaissance EOF ;
    public final EObject entryRuleAllocateurConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocateurConnaissance = null;


        try {
            // InternalJEU.g:732:63: (iv_ruleAllocateurConnaissance= ruleAllocateurConnaissance EOF )
            // InternalJEU.g:733:2: iv_ruleAllocateurConnaissance= ruleAllocateurConnaissance EOF
            {
             newCompositeNode(grammarAccess.getAllocateurConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocateurConnaissance=ruleAllocateurConnaissance();

            state._fsp--;

             current =iv_ruleAllocateurConnaissance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllocateurConnaissance"


    // $ANTLR start "ruleAllocateurConnaissance"
    // InternalJEU.g:739:1: ruleAllocateurConnaissance returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( ( (lv_estConditionne_2_0= 'condition' ) ) ( (lv_conditionAllocution_3_0= rulecondition ) ) )? otherlv_4= '}' ) ;
    public final EObject ruleAllocateurConnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_estConditionne_2_0=null;
        Token otherlv_4=null;
        EObject lv_conditionAllocution_3_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:745:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( ( (lv_estConditionne_2_0= 'condition' ) ) ( (lv_conditionAllocution_3_0= rulecondition ) ) )? otherlv_4= '}' ) )
            // InternalJEU.g:746:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( ( (lv_estConditionne_2_0= 'condition' ) ) ( (lv_conditionAllocution_3_0= rulecondition ) ) )? otherlv_4= '}' )
            {
            // InternalJEU.g:746:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( ( (lv_estConditionne_2_0= 'condition' ) ) ( (lv_conditionAllocution_3_0= rulecondition ) ) )? otherlv_4= '}' )
            // InternalJEU.g:747:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( ( (lv_estConditionne_2_0= 'condition' ) ) ( (lv_conditionAllocution_3_0= rulecondition ) ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocateurConnaissanceAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalJEU.g:751:3: ( (otherlv_1= RULE_ID ) )
            // InternalJEU.g:752:4: (otherlv_1= RULE_ID )
            {
            // InternalJEU.g:752:4: (otherlv_1= RULE_ID )
            // InternalJEU.g:753:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocateurConnaissanceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getAllocateurConnaissanceAccess().getConnaissanceAlloueConnaissanceCrossReference_1_0());
            				

            }


            }

            // InternalJEU.g:764:3: ( ( (lv_estConditionne_2_0= 'condition' ) ) ( (lv_conditionAllocution_3_0= rulecondition ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJEU.g:765:4: ( (lv_estConditionne_2_0= 'condition' ) ) ( (lv_conditionAllocution_3_0= rulecondition ) )
                    {
                    // InternalJEU.g:765:4: ( (lv_estConditionne_2_0= 'condition' ) )
                    // InternalJEU.g:766:5: (lv_estConditionne_2_0= 'condition' )
                    {
                    // InternalJEU.g:766:5: (lv_estConditionne_2_0= 'condition' )
                    // InternalJEU.g:767:6: lv_estConditionne_2_0= 'condition'
                    {
                    lv_estConditionne_2_0=(Token)match(input,28,FOLLOW_22); 

                    						newLeafNode(lv_estConditionne_2_0, grammarAccess.getAllocateurConnaissanceAccess().getEstConditionneConditionKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllocateurConnaissanceRule());
                    						}
                    						setWithLastConsumed(current, "estConditionne", true, "condition");
                    					

                    }


                    }

                    // InternalJEU.g:779:4: ( (lv_conditionAllocution_3_0= rulecondition ) )
                    // InternalJEU.g:780:5: (lv_conditionAllocution_3_0= rulecondition )
                    {
                    // InternalJEU.g:780:5: (lv_conditionAllocution_3_0= rulecondition )
                    // InternalJEU.g:781:6: lv_conditionAllocution_3_0= rulecondition
                    {

                    						newCompositeNode(grammarAccess.getAllocateurConnaissanceAccess().getConditionAllocutionConditionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_conditionAllocution_3_0=rulecondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAllocateurConnaissanceRule());
                    						}
                    						set(
                    							current,
                    							"conditionAllocution",
                    							lv_conditionAllocution_3_0,
                    							"fr.n7.JEU.condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAllocateurConnaissanceAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllocateurConnaissance"


    // $ANTLR start "entryRuleAllocateurObjet"
    // InternalJEU.g:807:1: entryRuleAllocateurObjet returns [EObject current=null] : iv_ruleAllocateurObjet= ruleAllocateurObjet EOF ;
    public final EObject entryRuleAllocateurObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocateurObjet = null;


        try {
            // InternalJEU.g:807:56: (iv_ruleAllocateurObjet= ruleAllocateurObjet EOF )
            // InternalJEU.g:808:2: iv_ruleAllocateurObjet= ruleAllocateurObjet EOF
            {
             newCompositeNode(grammarAccess.getAllocateurObjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocateurObjet=ruleAllocateurObjet();

            state._fsp--;

             current =iv_ruleAllocateurObjet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllocateurObjet"


    // $ANTLR start "ruleAllocateurObjet"
    // InternalJEU.g:814:1: ruleAllocateurObjet returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_consomme_2_0= 'consomme' ) )? ( (lv_quantite_3_0= RULE_INT ) ) ( ( (lv_estConditionne_4_0= 'condition' ) ) ( (lv_conditionAllocution_5_0= rulecondition ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAllocateurObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_consomme_2_0=null;
        Token lv_quantite_3_0=null;
        Token lv_estConditionne_4_0=null;
        Token otherlv_6=null;
        EObject lv_conditionAllocution_5_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:820:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_consomme_2_0= 'consomme' ) )? ( (lv_quantite_3_0= RULE_INT ) ) ( ( (lv_estConditionne_4_0= 'condition' ) ) ( (lv_conditionAllocution_5_0= rulecondition ) ) )? otherlv_6= '}' ) )
            // InternalJEU.g:821:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_consomme_2_0= 'consomme' ) )? ( (lv_quantite_3_0= RULE_INT ) ) ( ( (lv_estConditionne_4_0= 'condition' ) ) ( (lv_conditionAllocution_5_0= rulecondition ) ) )? otherlv_6= '}' )
            {
            // InternalJEU.g:821:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_consomme_2_0= 'consomme' ) )? ( (lv_quantite_3_0= RULE_INT ) ) ( ( (lv_estConditionne_4_0= 'condition' ) ) ( (lv_conditionAllocution_5_0= rulecondition ) ) )? otherlv_6= '}' )
            // InternalJEU.g:822:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_consomme_2_0= 'consomme' ) )? ( (lv_quantite_3_0= RULE_INT ) ) ( ( (lv_estConditionne_4_0= 'condition' ) ) ( (lv_conditionAllocution_5_0= rulecondition ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocateurObjetAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalJEU.g:826:3: ( (otherlv_1= RULE_ID ) )
            // InternalJEU.g:827:4: (otherlv_1= RULE_ID )
            {
            // InternalJEU.g:827:4: (otherlv_1= RULE_ID )
            // InternalJEU.g:828:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocateurObjetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getAllocateurObjetAccess().getObjetAlloueObjetCrossReference_1_0());
            				

            }


            }

            // InternalJEU.g:839:3: ( (lv_consomme_2_0= 'consomme' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJEU.g:840:4: (lv_consomme_2_0= 'consomme' )
                    {
                    // InternalJEU.g:840:4: (lv_consomme_2_0= 'consomme' )
                    // InternalJEU.g:841:5: lv_consomme_2_0= 'consomme'
                    {
                    lv_consomme_2_0=(Token)match(input,29,FOLLOW_11); 

                    					newLeafNode(lv_consomme_2_0, grammarAccess.getAllocateurObjetAccess().getConsommeConsommeKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAllocateurObjetRule());
                    					}
                    					setWithLastConsumed(current, "consomme", true, "consomme");
                    				

                    }


                    }
                    break;

            }

            // InternalJEU.g:853:3: ( (lv_quantite_3_0= RULE_INT ) )
            // InternalJEU.g:854:4: (lv_quantite_3_0= RULE_INT )
            {
            // InternalJEU.g:854:4: (lv_quantite_3_0= RULE_INT )
            // InternalJEU.g:855:5: lv_quantite_3_0= RULE_INT
            {
            lv_quantite_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_quantite_3_0, grammarAccess.getAllocateurObjetAccess().getQuantiteINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocateurObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantite",
            						lv_quantite_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalJEU.g:871:3: ( ( (lv_estConditionne_4_0= 'condition' ) ) ( (lv_conditionAllocution_5_0= rulecondition ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJEU.g:872:4: ( (lv_estConditionne_4_0= 'condition' ) ) ( (lv_conditionAllocution_5_0= rulecondition ) )
                    {
                    // InternalJEU.g:872:4: ( (lv_estConditionne_4_0= 'condition' ) )
                    // InternalJEU.g:873:5: (lv_estConditionne_4_0= 'condition' )
                    {
                    // InternalJEU.g:873:5: (lv_estConditionne_4_0= 'condition' )
                    // InternalJEU.g:874:6: lv_estConditionne_4_0= 'condition'
                    {
                    lv_estConditionne_4_0=(Token)match(input,28,FOLLOW_22); 

                    						newLeafNode(lv_estConditionne_4_0, grammarAccess.getAllocateurObjetAccess().getEstConditionneConditionKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllocateurObjetRule());
                    						}
                    						setWithLastConsumed(current, "estConditionne", true, "condition");
                    					

                    }


                    }

                    // InternalJEU.g:886:4: ( (lv_conditionAllocution_5_0= rulecondition ) )
                    // InternalJEU.g:887:5: (lv_conditionAllocution_5_0= rulecondition )
                    {
                    // InternalJEU.g:887:5: (lv_conditionAllocution_5_0= rulecondition )
                    // InternalJEU.g:888:6: lv_conditionAllocution_5_0= rulecondition
                    {

                    						newCompositeNode(grammarAccess.getAllocateurObjetAccess().getConditionAllocutionConditionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_conditionAllocution_5_0=rulecondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAllocateurObjetRule());
                    						}
                    						set(
                    							current,
                    							"conditionAllocution",
                    							lv_conditionAllocution_5_0,
                    							"fr.n7.JEU.condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAllocateurObjetAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllocateurObjet"


    // $ANTLR start "entryRuleLieu"
    // InternalJEU.g:914:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalJEU.g:914:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalJEU.g:915:2: iv_ruleLieu= ruleLieu EOF
            {
             newCompositeNode(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLieu=ruleLieu();

            state._fsp--;

             current =iv_ruleLieu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalJEU.g:921:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'Lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruletypeLieu ) ) (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'connaissance' otherlv_8= '{' ( (lv_connaissance_9_0= ruleConnaissance ) ) (otherlv_10= ',' ( (lv_connaissance_11_0= ruleConnaissance ) ) )* otherlv_12= '}' )? (otherlv_13= 'objet' otherlv_14= '{' ( (lv_objetslieu_15_0= ruleObjet ) ) (otherlv_16= ',' ( (lv_objetslieu_17_0= ruleObjet ) ) )* otherlv_18= '}' )? (otherlv_19= 'personne' otherlv_20= '{' ( (lv_personnes_21_0= rulePersonne ) ) (otherlv_22= ',' ( (lv_personnes_23_0= rulePersonne ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_connaissance_9_0 = null;

        EObject lv_connaissance_11_0 = null;

        EObject lv_objetslieu_15_0 = null;

        EObject lv_objetslieu_17_0 = null;

        EObject lv_personnes_21_0 = null;

        EObject lv_personnes_23_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:927:2: ( (otherlv_0= 'Lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruletypeLieu ) ) (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'connaissance' otherlv_8= '{' ( (lv_connaissance_9_0= ruleConnaissance ) ) (otherlv_10= ',' ( (lv_connaissance_11_0= ruleConnaissance ) ) )* otherlv_12= '}' )? (otherlv_13= 'objet' otherlv_14= '{' ( (lv_objetslieu_15_0= ruleObjet ) ) (otherlv_16= ',' ( (lv_objetslieu_17_0= ruleObjet ) ) )* otherlv_18= '}' )? (otherlv_19= 'personne' otherlv_20= '{' ( (lv_personnes_21_0= rulePersonne ) ) (otherlv_22= ',' ( (lv_personnes_23_0= rulePersonne ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalJEU.g:928:2: (otherlv_0= 'Lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruletypeLieu ) ) (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'connaissance' otherlv_8= '{' ( (lv_connaissance_9_0= ruleConnaissance ) ) (otherlv_10= ',' ( (lv_connaissance_11_0= ruleConnaissance ) ) )* otherlv_12= '}' )? (otherlv_13= 'objet' otherlv_14= '{' ( (lv_objetslieu_15_0= ruleObjet ) ) (otherlv_16= ',' ( (lv_objetslieu_17_0= ruleObjet ) ) )* otherlv_18= '}' )? (otherlv_19= 'personne' otherlv_20= '{' ( (lv_personnes_21_0= rulePersonne ) ) (otherlv_22= ',' ( (lv_personnes_23_0= rulePersonne ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalJEU.g:928:2: (otherlv_0= 'Lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruletypeLieu ) ) (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'connaissance' otherlv_8= '{' ( (lv_connaissance_9_0= ruleConnaissance ) ) (otherlv_10= ',' ( (lv_connaissance_11_0= ruleConnaissance ) ) )* otherlv_12= '}' )? (otherlv_13= 'objet' otherlv_14= '{' ( (lv_objetslieu_15_0= ruleObjet ) ) (otherlv_16= ',' ( (lv_objetslieu_17_0= ruleObjet ) ) )* otherlv_18= '}' )? (otherlv_19= 'personne' otherlv_20= '{' ( (lv_personnes_21_0= rulePersonne ) ) (otherlv_22= ',' ( (lv_personnes_23_0= rulePersonne ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalJEU.g:929:3: otherlv_0= 'Lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruletypeLieu ) ) (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'connaissance' otherlv_8= '{' ( (lv_connaissance_9_0= ruleConnaissance ) ) (otherlv_10= ',' ( (lv_connaissance_11_0= ruleConnaissance ) ) )* otherlv_12= '}' )? (otherlv_13= 'objet' otherlv_14= '{' ( (lv_objetslieu_15_0= ruleObjet ) ) (otherlv_16= ',' ( (lv_objetslieu_17_0= ruleObjet ) ) )* otherlv_18= '}' )? (otherlv_19= 'personne' otherlv_20= '{' ( (lv_personnes_21_0= rulePersonne ) ) (otherlv_22= ',' ( (lv_personnes_23_0= rulePersonne ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuAccess().getLieuKeyword_0());
            		
            // InternalJEU.g:933:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJEU.g:934:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJEU.g:934:4: (lv_name_1_0= RULE_ID )
            // InternalJEU.g:935:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getLieuAccess().getTypeKeyword_3());
            		
            // InternalJEU.g:959:3: ( (lv_type_4_0= ruletypeLieu ) )
            // InternalJEU.g:960:4: (lv_type_4_0= ruletypeLieu )
            {
            // InternalJEU.g:960:4: (lv_type_4_0= ruletypeLieu )
            // InternalJEU.g:961:5: lv_type_4_0= ruletypeLieu
            {

            					newCompositeNode(grammarAccess.getLieuAccess().getTypeTypeLieuEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
            lv_type_4_0=ruletypeLieu();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLieuRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"fr.n7.JEU.typeLieu");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJEU.g:978:3: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJEU.g:979:4: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getLieuAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalJEU.g:983:4: ( (lv_description_6_0= RULE_STRING ) )
                    // InternalJEU.g:984:5: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalJEU.g:984:5: (lv_description_6_0= RULE_STRING )
                    // InternalJEU.g:985:6: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    						newLeafNode(lv_description_6_0, grammarAccess.getLieuAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLieuRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJEU.g:1002:3: (otherlv_7= 'connaissance' otherlv_8= '{' ( (lv_connaissance_9_0= ruleConnaissance ) ) (otherlv_10= ',' ( (lv_connaissance_11_0= ruleConnaissance ) ) )* otherlv_12= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJEU.g:1003:4: otherlv_7= 'connaissance' otherlv_8= '{' ( (lv_connaissance_9_0= ruleConnaissance ) ) (otherlv_10= ',' ( (lv_connaissance_11_0= ruleConnaissance ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getLieuAccess().getConnaissanceKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalJEU.g:1011:4: ( (lv_connaissance_9_0= ruleConnaissance ) )
                    // InternalJEU.g:1012:5: (lv_connaissance_9_0= ruleConnaissance )
                    {
                    // InternalJEU.g:1012:5: (lv_connaissance_9_0= ruleConnaissance )
                    // InternalJEU.g:1013:6: lv_connaissance_9_0= ruleConnaissance
                    {

                    						newCompositeNode(grammarAccess.getLieuAccess().getConnaissanceConnaissanceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_connaissance_9_0=ruleConnaissance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLieuRule());
                    						}
                    						add(
                    							current,
                    							"connaissance",
                    							lv_connaissance_9_0,
                    							"fr.n7.JEU.Connaissance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJEU.g:1030:4: (otherlv_10= ',' ( (lv_connaissance_11_0= ruleConnaissance ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==13) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalJEU.g:1031:5: otherlv_10= ',' ( (lv_connaissance_11_0= ruleConnaissance ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getLieuAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalJEU.g:1035:5: ( (lv_connaissance_11_0= ruleConnaissance ) )
                    	    // InternalJEU.g:1036:6: (lv_connaissance_11_0= ruleConnaissance )
                    	    {
                    	    // InternalJEU.g:1036:6: (lv_connaissance_11_0= ruleConnaissance )
                    	    // InternalJEU.g:1037:7: lv_connaissance_11_0= ruleConnaissance
                    	    {

                    	    							newCompositeNode(grammarAccess.getLieuAccess().getConnaissanceConnaissanceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_connaissance_11_0=ruleConnaissance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLieuRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"connaissance",
                    	    								lv_connaissance_11_0,
                    	    								"fr.n7.JEU.Connaissance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_34); 

                    				newLeafNode(otherlv_12, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalJEU.g:1060:3: (otherlv_13= 'objet' otherlv_14= '{' ( (lv_objetslieu_15_0= ruleObjet ) ) (otherlv_16= ',' ( (lv_objetslieu_17_0= ruleObjet ) ) )* otherlv_18= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJEU.g:1061:4: otherlv_13= 'objet' otherlv_14= '{' ( (lv_objetslieu_15_0= ruleObjet ) ) (otherlv_16= ',' ( (lv_objetslieu_17_0= ruleObjet ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getLieuAccess().getObjetKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_14, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalJEU.g:1069:4: ( (lv_objetslieu_15_0= ruleObjet ) )
                    // InternalJEU.g:1070:5: (lv_objetslieu_15_0= ruleObjet )
                    {
                    // InternalJEU.g:1070:5: (lv_objetslieu_15_0= ruleObjet )
                    // InternalJEU.g:1071:6: lv_objetslieu_15_0= ruleObjet
                    {

                    						newCompositeNode(grammarAccess.getLieuAccess().getObjetslieuObjetParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_objetslieu_15_0=ruleObjet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLieuRule());
                    						}
                    						add(
                    							current,
                    							"objetslieu",
                    							lv_objetslieu_15_0,
                    							"fr.n7.JEU.Objet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJEU.g:1088:4: (otherlv_16= ',' ( (lv_objetslieu_17_0= ruleObjet ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==13) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalJEU.g:1089:5: otherlv_16= ',' ( (lv_objetslieu_17_0= ruleObjet ) )
                    	    {
                    	    otherlv_16=(Token)match(input,13,FOLLOW_35); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getLieuAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalJEU.g:1093:5: ( (lv_objetslieu_17_0= ruleObjet ) )
                    	    // InternalJEU.g:1094:6: (lv_objetslieu_17_0= ruleObjet )
                    	    {
                    	    // InternalJEU.g:1094:6: (lv_objetslieu_17_0= ruleObjet )
                    	    // InternalJEU.g:1095:7: lv_objetslieu_17_0= ruleObjet
                    	    {

                    	    							newCompositeNode(grammarAccess.getLieuAccess().getObjetslieuObjetParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_objetslieu_17_0=ruleObjet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLieuRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objetslieu",
                    	    								lv_objetslieu_17_0,
                    	    								"fr.n7.JEU.Objet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,14,FOLLOW_36); 

                    				newLeafNode(otherlv_18, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalJEU.g:1118:3: (otherlv_19= 'personne' otherlv_20= '{' ( (lv_personnes_21_0= rulePersonne ) ) (otherlv_22= ',' ( (lv_personnes_23_0= rulePersonne ) ) )* otherlv_24= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJEU.g:1119:4: otherlv_19= 'personne' otherlv_20= '{' ( (lv_personnes_21_0= rulePersonne ) ) (otherlv_22= ',' ( (lv_personnes_23_0= rulePersonne ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getLieuAccess().getPersonneKeyword_8_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_20, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalJEU.g:1127:4: ( (lv_personnes_21_0= rulePersonne ) )
                    // InternalJEU.g:1128:5: (lv_personnes_21_0= rulePersonne )
                    {
                    // InternalJEU.g:1128:5: (lv_personnes_21_0= rulePersonne )
                    // InternalJEU.g:1129:6: lv_personnes_21_0= rulePersonne
                    {

                    						newCompositeNode(grammarAccess.getLieuAccess().getPersonnesPersonneParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_personnes_21_0=rulePersonne();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLieuRule());
                    						}
                    						add(
                    							current,
                    							"personnes",
                    							lv_personnes_21_0,
                    							"fr.n7.JEU.Personne");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJEU.g:1146:4: (otherlv_22= ',' ( (lv_personnes_23_0= rulePersonne ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==13) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalJEU.g:1147:5: otherlv_22= ',' ( (lv_personnes_23_0= rulePersonne ) )
                    	    {
                    	    otherlv_22=(Token)match(input,13,FOLLOW_22); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getLieuAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalJEU.g:1151:5: ( (lv_personnes_23_0= rulePersonne ) )
                    	    // InternalJEU.g:1152:6: (lv_personnes_23_0= rulePersonne )
                    	    {
                    	    // InternalJEU.g:1152:6: (lv_personnes_23_0= rulePersonne )
                    	    // InternalJEU.g:1153:7: lv_personnes_23_0= rulePersonne
                    	    {

                    	    							newCompositeNode(grammarAccess.getLieuAccess().getPersonnesPersonneParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_personnes_23_0=rulePersonne();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLieuRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"personnes",
                    	    								lv_personnes_23_0,
                    	    								"fr.n7.JEU.Personne");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,14,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLieu"


    // $ANTLR start "entryRuleConnaissance"
    // InternalJEU.g:1184:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalJEU.g:1184:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalJEU.g:1185:2: iv_ruleConnaissance= ruleConnaissance EOF
            {
             newCompositeNode(grammarAccess.getConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnaissance=ruleConnaissance();

            state._fsp--;

             current =iv_ruleConnaissance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnaissance"


    // $ANTLR start "ruleConnaissance"
    // InternalJEU.g:1191:1: ruleConnaissance returns [EObject current=null] : (otherlv_0= 'Connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visibilite' ( (lv_visibilite_4_0= ruletypevisibilite ) ) otherlv_5= 'activite' ( (lv_activite_6_0= ruletypeactivite ) ) ( (lv_estPossede_7_0= 'possede' ) )? (otherlv_8= 'actifcondition' ( (lv_acces_9_0= rulecondition ) ) )? (otherlv_10= 'visiblecondition' ( (lv_visible_11_0= rulecondition ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_estPossede_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_description_13_0=null;
        Token otherlv_14=null;
        Enumerator lv_visibilite_4_0 = null;

        Enumerator lv_activite_6_0 = null;

        EObject lv_acces_9_0 = null;

        EObject lv_visible_11_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:1197:2: ( (otherlv_0= 'Connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visibilite' ( (lv_visibilite_4_0= ruletypevisibilite ) ) otherlv_5= 'activite' ( (lv_activite_6_0= ruletypeactivite ) ) ( (lv_estPossede_7_0= 'possede' ) )? (otherlv_8= 'actifcondition' ( (lv_acces_9_0= rulecondition ) ) )? (otherlv_10= 'visiblecondition' ( (lv_visible_11_0= rulecondition ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )? otherlv_14= '}' ) )
            // InternalJEU.g:1198:2: (otherlv_0= 'Connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visibilite' ( (lv_visibilite_4_0= ruletypevisibilite ) ) otherlv_5= 'activite' ( (lv_activite_6_0= ruletypeactivite ) ) ( (lv_estPossede_7_0= 'possede' ) )? (otherlv_8= 'actifcondition' ( (lv_acces_9_0= rulecondition ) ) )? (otherlv_10= 'visiblecondition' ( (lv_visible_11_0= rulecondition ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )? otherlv_14= '}' )
            {
            // InternalJEU.g:1198:2: (otherlv_0= 'Connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visibilite' ( (lv_visibilite_4_0= ruletypevisibilite ) ) otherlv_5= 'activite' ( (lv_activite_6_0= ruletypeactivite ) ) ( (lv_estPossede_7_0= 'possede' ) )? (otherlv_8= 'actifcondition' ( (lv_acces_9_0= rulecondition ) ) )? (otherlv_10= 'visiblecondition' ( (lv_visible_11_0= rulecondition ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )? otherlv_14= '}' )
            // InternalJEU.g:1199:3: otherlv_0= 'Connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visibilite' ( (lv_visibilite_4_0= ruletypevisibilite ) ) otherlv_5= 'activite' ( (lv_activite_6_0= ruletypeactivite ) ) ( (lv_estPossede_7_0= 'possede' ) )? (otherlv_8= 'actifcondition' ( (lv_acces_9_0= rulecondition ) ) )? (otherlv_10= 'visiblecondition' ( (lv_visible_11_0= rulecondition ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0());
            		
            // InternalJEU.g:1203:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJEU.g:1204:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJEU.g:1204:4: (lv_name_1_0= RULE_ID )
            // InternalJEU.g:1205:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnaissanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getConnaissanceAccess().getVisibiliteKeyword_3());
            		
            // InternalJEU.g:1229:3: ( (lv_visibilite_4_0= ruletypevisibilite ) )
            // InternalJEU.g:1230:4: (lv_visibilite_4_0= ruletypevisibilite )
            {
            // InternalJEU.g:1230:4: (lv_visibilite_4_0= ruletypevisibilite )
            // InternalJEU.g:1231:5: lv_visibilite_4_0= ruletypevisibilite
            {

            					newCompositeNode(grammarAccess.getConnaissanceAccess().getVisibiliteTypevisibiliteEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_visibilite_4_0=ruletypevisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnaissanceRule());
            					}
            					set(
            						current,
            						"visibilite",
            						lv_visibilite_4_0,
            						"fr.n7.JEU.typevisibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getConnaissanceAccess().getActiviteKeyword_5());
            		
            // InternalJEU.g:1252:3: ( (lv_activite_6_0= ruletypeactivite ) )
            // InternalJEU.g:1253:4: (lv_activite_6_0= ruletypeactivite )
            {
            // InternalJEU.g:1253:4: (lv_activite_6_0= ruletypeactivite )
            // InternalJEU.g:1254:5: lv_activite_6_0= ruletypeactivite
            {

            					newCompositeNode(grammarAccess.getConnaissanceAccess().getActiviteTypeactiviteEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_39);
            lv_activite_6_0=ruletypeactivite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnaissanceRule());
            					}
            					set(
            						current,
            						"activite",
            						lv_activite_6_0,
            						"fr.n7.JEU.typeactivite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJEU.g:1271:3: ( (lv_estPossede_7_0= 'possede' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJEU.g:1272:4: (lv_estPossede_7_0= 'possede' )
                    {
                    // InternalJEU.g:1272:4: (lv_estPossede_7_0= 'possede' )
                    // InternalJEU.g:1273:5: lv_estPossede_7_0= 'possede'
                    {
                    lv_estPossede_7_0=(Token)match(input,35,FOLLOW_40); 

                    					newLeafNode(lv_estPossede_7_0, grammarAccess.getConnaissanceAccess().getEstPossedePossedeKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConnaissanceRule());
                    					}
                    					setWithLastConsumed(current, "estPossede", true, "possede");
                    				

                    }


                    }
                    break;

            }

            // InternalJEU.g:1285:3: (otherlv_8= 'actifcondition' ( (lv_acces_9_0= rulecondition ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJEU.g:1286:4: otherlv_8= 'actifcondition' ( (lv_acces_9_0= rulecondition ) )
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getConnaissanceAccess().getActifconditionKeyword_8_0());
                    			
                    // InternalJEU.g:1290:4: ( (lv_acces_9_0= rulecondition ) )
                    // InternalJEU.g:1291:5: (lv_acces_9_0= rulecondition )
                    {
                    // InternalJEU.g:1291:5: (lv_acces_9_0= rulecondition )
                    // InternalJEU.g:1292:6: lv_acces_9_0= rulecondition
                    {

                    						newCompositeNode(grammarAccess.getConnaissanceAccess().getAccesConditionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_acces_9_0=rulecondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnaissanceRule());
                    						}
                    						set(
                    							current,
                    							"acces",
                    							lv_acces_9_0,
                    							"fr.n7.JEU.condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJEU.g:1310:3: (otherlv_10= 'visiblecondition' ( (lv_visible_11_0= rulecondition ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJEU.g:1311:4: otherlv_10= 'visiblecondition' ( (lv_visible_11_0= rulecondition ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getConnaissanceAccess().getVisibleconditionKeyword_9_0());
                    			
                    // InternalJEU.g:1315:4: ( (lv_visible_11_0= rulecondition ) )
                    // InternalJEU.g:1316:5: (lv_visible_11_0= rulecondition )
                    {
                    // InternalJEU.g:1316:5: (lv_visible_11_0= rulecondition )
                    // InternalJEU.g:1317:6: lv_visible_11_0= rulecondition
                    {

                    						newCompositeNode(grammarAccess.getConnaissanceAccess().getVisibleConditionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_visible_11_0=rulecondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnaissanceRule());
                    						}
                    						set(
                    							current,
                    							"visible",
                    							lv_visible_11_0,
                    							"fr.n7.JEU.condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJEU.g:1335:3: (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJEU.g:1336:4: otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getConnaissanceAccess().getDescriptionKeyword_10_0());
                    			
                    // InternalJEU.g:1340:4: ( (lv_description_13_0= RULE_STRING ) )
                    // InternalJEU.g:1341:5: (lv_description_13_0= RULE_STRING )
                    {
                    // InternalJEU.g:1341:5: (lv_description_13_0= RULE_STRING )
                    // InternalJEU.g:1342:6: lv_description_13_0= RULE_STRING
                    {
                    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_description_13_0, grammarAccess.getConnaissanceAccess().getDescriptionSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnaissanceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnaissance"


    // $ANTLR start "entryRuleObjet"
    // InternalJEU.g:1367:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalJEU.g:1367:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalJEU.g:1368:2: iv_ruleObjet= ruleObjet EOF
            {
             newCompositeNode(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjet=ruleObjet();

            state._fsp--;

             current =iv_ruleObjet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalJEU.g:1374:1: ruleObjet returns [EObject current=null] : (otherlv_0= 'Objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'quantite' ( (lv_quantite_6_0= RULE_INT ) ) otherlv_7= 'visibilite' ( (lv_visibilite_8_0= ruletypevisibilite ) ) otherlv_9= 'activite' ( (lv_activite_10_0= ruletypeactivite ) ) ( ( (lv_dansLieu_11_0= 'danslelieu' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'deposersi' ( (lv_conditionDeposer_14_0= rulecondition ) ) )? )? (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_taille_4_0=null;
        Token otherlv_5=null;
        Token lv_quantite_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_dansLieu_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
        Token otherlv_17=null;
        Enumerator lv_visibilite_8_0 = null;

        Enumerator lv_activite_10_0 = null;

        EObject lv_conditionDeposer_14_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:1380:2: ( (otherlv_0= 'Objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'quantite' ( (lv_quantite_6_0= RULE_INT ) ) otherlv_7= 'visibilite' ( (lv_visibilite_8_0= ruletypevisibilite ) ) otherlv_9= 'activite' ( (lv_activite_10_0= ruletypeactivite ) ) ( ( (lv_dansLieu_11_0= 'danslelieu' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'deposersi' ( (lv_conditionDeposer_14_0= rulecondition ) ) )? )? (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )? otherlv_17= '}' ) )
            // InternalJEU.g:1381:2: (otherlv_0= 'Objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'quantite' ( (lv_quantite_6_0= RULE_INT ) ) otherlv_7= 'visibilite' ( (lv_visibilite_8_0= ruletypevisibilite ) ) otherlv_9= 'activite' ( (lv_activite_10_0= ruletypeactivite ) ) ( ( (lv_dansLieu_11_0= 'danslelieu' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'deposersi' ( (lv_conditionDeposer_14_0= rulecondition ) ) )? )? (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )? otherlv_17= '}' )
            {
            // InternalJEU.g:1381:2: (otherlv_0= 'Objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'quantite' ( (lv_quantite_6_0= RULE_INT ) ) otherlv_7= 'visibilite' ( (lv_visibilite_8_0= ruletypevisibilite ) ) otherlv_9= 'activite' ( (lv_activite_10_0= ruletypeactivite ) ) ( ( (lv_dansLieu_11_0= 'danslelieu' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'deposersi' ( (lv_conditionDeposer_14_0= rulecondition ) ) )? )? (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )? otherlv_17= '}' )
            // InternalJEU.g:1382:3: otherlv_0= 'Objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'quantite' ( (lv_quantite_6_0= RULE_INT ) ) otherlv_7= 'visibilite' ( (lv_visibilite_8_0= ruletypevisibilite ) ) otherlv_9= 'activite' ( (lv_activite_10_0= ruletypeactivite ) ) ( ( (lv_dansLieu_11_0= 'danslelieu' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'deposersi' ( (lv_conditionDeposer_14_0= rulecondition ) ) )? )? (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getObjetKeyword_0());
            		
            // InternalJEU.g:1386:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJEU.g:1387:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJEU.g:1387:4: (lv_name_1_0= RULE_ID )
            // InternalJEU.g:1388:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getObjetAccess().getTailleKeyword_3());
            		
            // InternalJEU.g:1412:3: ( (lv_taille_4_0= RULE_INT ) )
            // InternalJEU.g:1413:4: (lv_taille_4_0= RULE_INT )
            {
            // InternalJEU.g:1413:4: (lv_taille_4_0= RULE_INT )
            // InternalJEU.g:1414:5: lv_taille_4_0= RULE_INT
            {
            lv_taille_4_0=(Token)match(input,RULE_INT,FOLLOW_44); 

            					newLeafNode(lv_taille_4_0, grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getObjetAccess().getQuantiteKeyword_5());
            		
            // InternalJEU.g:1434:3: ( (lv_quantite_6_0= RULE_INT ) )
            // InternalJEU.g:1435:4: (lv_quantite_6_0= RULE_INT )
            {
            // InternalJEU.g:1435:4: (lv_quantite_6_0= RULE_INT )
            // InternalJEU.g:1436:5: lv_quantite_6_0= RULE_INT
            {
            lv_quantite_6_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_quantite_6_0, grammarAccess.getObjetAccess().getQuantiteINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantite",
            						lv_quantite_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getObjetAccess().getVisibiliteKeyword_7());
            		
            // InternalJEU.g:1456:3: ( (lv_visibilite_8_0= ruletypevisibilite ) )
            // InternalJEU.g:1457:4: (lv_visibilite_8_0= ruletypevisibilite )
            {
            // InternalJEU.g:1457:4: (lv_visibilite_8_0= ruletypevisibilite )
            // InternalJEU.g:1458:5: lv_visibilite_8_0= ruletypevisibilite
            {

            					newCompositeNode(grammarAccess.getObjetAccess().getVisibiliteTypevisibiliteEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_37);
            lv_visibilite_8_0=ruletypevisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjetRule());
            					}
            					set(
            						current,
            						"visibilite",
            						lv_visibilite_8_0,
            						"fr.n7.JEU.typevisibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,34,FOLLOW_38); 

            			newLeafNode(otherlv_9, grammarAccess.getObjetAccess().getActiviteKeyword_9());
            		
            // InternalJEU.g:1479:3: ( (lv_activite_10_0= ruletypeactivite ) )
            // InternalJEU.g:1480:4: (lv_activite_10_0= ruletypeactivite )
            {
            // InternalJEU.g:1480:4: (lv_activite_10_0= ruletypeactivite )
            // InternalJEU.g:1481:5: lv_activite_10_0= ruletypeactivite
            {

            					newCompositeNode(grammarAccess.getObjetAccess().getActiviteTypeactiviteEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_45);
            lv_activite_10_0=ruletypeactivite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjetRule());
            					}
            					set(
            						current,
            						"activite",
            						lv_activite_10_0,
            						"fr.n7.JEU.typeactivite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJEU.g:1498:3: ( ( (lv_dansLieu_11_0= 'danslelieu' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'deposersi' ( (lv_conditionDeposer_14_0= rulecondition ) ) )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJEU.g:1499:4: ( (lv_dansLieu_11_0= 'danslelieu' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'deposersi' ( (lv_conditionDeposer_14_0= rulecondition ) ) )?
                    {
                    // InternalJEU.g:1499:4: ( (lv_dansLieu_11_0= 'danslelieu' ) )
                    // InternalJEU.g:1500:5: (lv_dansLieu_11_0= 'danslelieu' )
                    {
                    // InternalJEU.g:1500:5: (lv_dansLieu_11_0= 'danslelieu' )
                    // InternalJEU.g:1501:6: lv_dansLieu_11_0= 'danslelieu'
                    {
                    lv_dansLieu_11_0=(Token)match(input,40,FOLLOW_3); 

                    						newLeafNode(lv_dansLieu_11_0, grammarAccess.getObjetAccess().getDansLieuDanslelieuKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjetRule());
                    						}
                    						setWithLastConsumed(current, "dansLieu", true, "danslelieu");
                    					

                    }


                    }

                    // InternalJEU.g:1513:4: ( (otherlv_12= RULE_ID ) )
                    // InternalJEU.g:1514:5: (otherlv_12= RULE_ID )
                    {
                    // InternalJEU.g:1514:5: (otherlv_12= RULE_ID )
                    // InternalJEU.g:1515:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjetRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_46); 

                    						newLeafNode(otherlv_12, grammarAccess.getObjetAccess().getLieuLieuCrossReference_11_1_0());
                    					

                    }


                    }

                    // InternalJEU.g:1526:4: (otherlv_13= 'deposersi' ( (lv_conditionDeposer_14_0= rulecondition ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==41) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalJEU.g:1527:5: otherlv_13= 'deposersi' ( (lv_conditionDeposer_14_0= rulecondition ) )
                            {
                            otherlv_13=(Token)match(input,41,FOLLOW_22); 

                            					newLeafNode(otherlv_13, grammarAccess.getObjetAccess().getDeposersiKeyword_11_2_0());
                            				
                            // InternalJEU.g:1531:5: ( (lv_conditionDeposer_14_0= rulecondition ) )
                            // InternalJEU.g:1532:6: (lv_conditionDeposer_14_0= rulecondition )
                            {
                            // InternalJEU.g:1532:6: (lv_conditionDeposer_14_0= rulecondition )
                            // InternalJEU.g:1533:7: lv_conditionDeposer_14_0= rulecondition
                            {

                            							newCompositeNode(grammarAccess.getObjetAccess().getConditionDeposerConditionParserRuleCall_11_2_1_0());
                            						
                            pushFollow(FOLLOW_42);
                            lv_conditionDeposer_14_0=rulecondition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getObjetRule());
                            							}
                            							set(
                            								current,
                            								"conditionDeposer",
                            								lv_conditionDeposer_14_0,
                            								"fr.n7.JEU.condition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalJEU.g:1552:3: (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJEU.g:1553:4: otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getObjetAccess().getDescriptionKeyword_12_0());
                    			
                    // InternalJEU.g:1557:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalJEU.g:1558:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalJEU.g:1558:5: (lv_description_16_0= RULE_STRING )
                    // InternalJEU.g:1559:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_description_16_0, grammarAccess.getObjetAccess().getDescriptionSTRINGTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjetRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleInteraction"
    // InternalJEU.g:1584:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalJEU.g:1584:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalJEU.g:1585:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalJEU.g:1591:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'Interaction' otherlv_1= '{' otherlv_2= 'personne' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'question' ( (lv_question_5_0= RULE_STRING ) ) otherlv_6= 'choix' otherlv_7= '{' ( (lv_choix_8_0= rulechoix ) ) (otherlv_9= ',' ( (lv_choix_10_0= rulechoix ) ) )* otherlv_11= '}' otherlv_12= 'ChoixJoueur' ( (lv_choixJoueur_13_0= rulechoix ) ) otherlv_14= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_question_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_choix_8_0 = null;

        EObject lv_choix_10_0 = null;

        EObject lv_choixJoueur_13_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:1597:2: ( (otherlv_0= 'Interaction' otherlv_1= '{' otherlv_2= 'personne' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'question' ( (lv_question_5_0= RULE_STRING ) ) otherlv_6= 'choix' otherlv_7= '{' ( (lv_choix_8_0= rulechoix ) ) (otherlv_9= ',' ( (lv_choix_10_0= rulechoix ) ) )* otherlv_11= '}' otherlv_12= 'ChoixJoueur' ( (lv_choixJoueur_13_0= rulechoix ) ) otherlv_14= '}' ) )
            // InternalJEU.g:1598:2: (otherlv_0= 'Interaction' otherlv_1= '{' otherlv_2= 'personne' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'question' ( (lv_question_5_0= RULE_STRING ) ) otherlv_6= 'choix' otherlv_7= '{' ( (lv_choix_8_0= rulechoix ) ) (otherlv_9= ',' ( (lv_choix_10_0= rulechoix ) ) )* otherlv_11= '}' otherlv_12= 'ChoixJoueur' ( (lv_choixJoueur_13_0= rulechoix ) ) otherlv_14= '}' )
            {
            // InternalJEU.g:1598:2: (otherlv_0= 'Interaction' otherlv_1= '{' otherlv_2= 'personne' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'question' ( (lv_question_5_0= RULE_STRING ) ) otherlv_6= 'choix' otherlv_7= '{' ( (lv_choix_8_0= rulechoix ) ) (otherlv_9= ',' ( (lv_choix_10_0= rulechoix ) ) )* otherlv_11= '}' otherlv_12= 'ChoixJoueur' ( (lv_choixJoueur_13_0= rulechoix ) ) otherlv_14= '}' )
            // InternalJEU.g:1599:3: otherlv_0= 'Interaction' otherlv_1= '{' otherlv_2= 'personne' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'question' ( (lv_question_5_0= RULE_STRING ) ) otherlv_6= 'choix' otherlv_7= '{' ( (lv_choix_8_0= rulechoix ) ) (otherlv_9= ',' ( (lv_choix_10_0= rulechoix ) ) )* otherlv_11= '}' otherlv_12= 'ChoixJoueur' ( (lv_choixJoueur_13_0= rulechoix ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getPersonneKeyword_2());
            		
            // InternalJEU.g:1611:3: ( (otherlv_3= RULE_ID ) )
            // InternalJEU.g:1612:4: (otherlv_3= RULE_ID )
            {
            // InternalJEU.g:1612:4: (otherlv_3= RULE_ID )
            // InternalJEU.g:1613:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_48); 

            					newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getPersonnePersonneCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getInteractionAccess().getQuestionKeyword_4());
            		
            // InternalJEU.g:1628:3: ( (lv_question_5_0= RULE_STRING ) )
            // InternalJEU.g:1629:4: (lv_question_5_0= RULE_STRING )
            {
            // InternalJEU.g:1629:4: (lv_question_5_0= RULE_STRING )
            // InternalJEU.g:1630:5: lv_question_5_0= RULE_STRING
            {
            lv_question_5_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

            					newLeafNode(lv_question_5_0, grammarAccess.getInteractionAccess().getQuestionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"question",
            						lv_question_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getInteractionAccess().getChoixKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalJEU.g:1654:3: ( (lv_choix_8_0= rulechoix ) )
            // InternalJEU.g:1655:4: (lv_choix_8_0= rulechoix )
            {
            // InternalJEU.g:1655:4: (lv_choix_8_0= rulechoix )
            // InternalJEU.g:1656:5: lv_choix_8_0= rulechoix
            {

            					newCompositeNode(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_choix_8_0=rulechoix();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionRule());
            					}
            					add(
            						current,
            						"choix",
            						lv_choix_8_0,
            						"fr.n7.JEU.choix");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJEU.g:1673:3: (otherlv_9= ',' ( (lv_choix_10_0= rulechoix ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==13) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalJEU.g:1674:4: otherlv_9= ',' ( (lv_choix_10_0= rulechoix ) )
            	    {
            	    otherlv_9=(Token)match(input,13,FOLLOW_22); 

            	    				newLeafNode(otherlv_9, grammarAccess.getInteractionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalJEU.g:1678:4: ( (lv_choix_10_0= rulechoix ) )
            	    // InternalJEU.g:1679:5: (lv_choix_10_0= rulechoix )
            	    {
            	    // InternalJEU.g:1679:5: (lv_choix_10_0= rulechoix )
            	    // InternalJEU.g:1680:6: lv_choix_10_0= rulechoix
            	    {

            	    						newCompositeNode(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_choix_10_0=rulechoix();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"choix",
            	    							lv_choix_10_0,
            	    							"fr.n7.JEU.choix");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_50); 

            			newLeafNode(otherlv_11, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,45,FOLLOW_22); 

            			newLeafNode(otherlv_12, grammarAccess.getInteractionAccess().getChoixJoueurKeyword_11());
            		
            // InternalJEU.g:1706:3: ( (lv_choixJoueur_13_0= rulechoix ) )
            // InternalJEU.g:1707:4: (lv_choixJoueur_13_0= rulechoix )
            {
            // InternalJEU.g:1707:4: (lv_choixJoueur_13_0= rulechoix )
            // InternalJEU.g:1708:5: lv_choixJoueur_13_0= rulechoix
            {

            					newCompositeNode(grammarAccess.getInteractionAccess().getChoixJoueurChoixParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_14);
            lv_choixJoueur_13_0=rulechoix();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionRule());
            					}
            					add(
            						current,
            						"choixJoueur",
            						lv_choixJoueur_13_0,
            						"fr.n7.JEU.choix");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRulecondition"
    // InternalJEU.g:1733:1: entryRulecondition returns [EObject current=null] : iv_rulecondition= rulecondition EOF ;
    public final EObject entryRulecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecondition = null;


        try {
            // InternalJEU.g:1733:50: (iv_rulecondition= rulecondition EOF )
            // InternalJEU.g:1734:2: iv_rulecondition= rulecondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecondition=rulecondition();

            state._fsp--;

             current =iv_rulecondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecondition"


    // $ANTLR start "rulecondition"
    // InternalJEU.g:1740:1: rulecondition returns [EObject current=null] : (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'objet' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'comparateur' ( (lv_comparaison_6_0= ruleComparateur ) ) otherlv_7= 'reference' ( (lv_reference_8_0= RULE_INT ) ) ) | (otherlv_9= 'connaissance' ( (otherlv_10= RULE_ID ) ) ( (lv_presente_11_0= 'presente' ) )? ) ) otherlv_12= '}' ) ;
    public final EObject rulecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_reference_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_presente_11_0=null;
        Token otherlv_12=null;
        Enumerator lv_comparaison_6_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:1746:2: ( (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'objet' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'comparateur' ( (lv_comparaison_6_0= ruleComparateur ) ) otherlv_7= 'reference' ( (lv_reference_8_0= RULE_INT ) ) ) | (otherlv_9= 'connaissance' ( (otherlv_10= RULE_ID ) ) ( (lv_presente_11_0= 'presente' ) )? ) ) otherlv_12= '}' ) )
            // InternalJEU.g:1747:2: (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'objet' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'comparateur' ( (lv_comparaison_6_0= ruleComparateur ) ) otherlv_7= 'reference' ( (lv_reference_8_0= RULE_INT ) ) ) | (otherlv_9= 'connaissance' ( (otherlv_10= RULE_ID ) ) ( (lv_presente_11_0= 'presente' ) )? ) ) otherlv_12= '}' )
            {
            // InternalJEU.g:1747:2: (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'objet' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'comparateur' ( (lv_comparaison_6_0= ruleComparateur ) ) otherlv_7= 'reference' ( (lv_reference_8_0= RULE_INT ) ) ) | (otherlv_9= 'connaissance' ( (otherlv_10= RULE_ID ) ) ( (lv_presente_11_0= 'presente' ) )? ) ) otherlv_12= '}' )
            // InternalJEU.g:1748:3: otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'objet' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'comparateur' ( (lv_comparaison_6_0= ruleComparateur ) ) otherlv_7= 'reference' ( (lv_reference_8_0= RULE_INT ) ) ) | (otherlv_9= 'connaissance' ( (otherlv_10= RULE_ID ) ) ( (lv_presente_11_0= 'presente' ) )? ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getNomKeyword_0());
            		
            // InternalJEU.g:1752:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJEU.g:1753:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJEU.g:1753:4: (lv_name_1_0= RULE_ID )
            // InternalJEU.g:1754:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJEU.g:1774:3: ( (otherlv_3= 'objet' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'comparateur' ( (lv_comparaison_6_0= ruleComparateur ) ) otherlv_7= 'reference' ( (lv_reference_8_0= RULE_INT ) ) ) | (otherlv_9= 'connaissance' ( (otherlv_10= RULE_ID ) ) ( (lv_presente_11_0= 'presente' ) )? ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            else if ( (LA34_0==16) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalJEU.g:1775:4: (otherlv_3= 'objet' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'comparateur' ( (lv_comparaison_6_0= ruleComparateur ) ) otherlv_7= 'reference' ( (lv_reference_8_0= RULE_INT ) ) )
                    {
                    // InternalJEU.g:1775:4: (otherlv_3= 'objet' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'comparateur' ( (lv_comparaison_6_0= ruleComparateur ) ) otherlv_7= 'reference' ( (lv_reference_8_0= RULE_INT ) ) )
                    // InternalJEU.g:1776:5: otherlv_3= 'objet' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'comparateur' ( (lv_comparaison_6_0= ruleComparateur ) ) otherlv_7= 'reference' ( (lv_reference_8_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getObjetKeyword_3_0_0());
                    				
                    // InternalJEU.g:1780:5: ( (otherlv_4= RULE_ID ) )
                    // InternalJEU.g:1781:6: (otherlv_4= RULE_ID )
                    {
                    // InternalJEU.g:1781:6: (otherlv_4= RULE_ID )
                    // InternalJEU.g:1782:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConditionRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_52); 

                    							newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getObjetObjetCrossReference_3_0_1_0());
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,47,FOLLOW_53); 

                    					newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getComparateurKeyword_3_0_2());
                    				
                    // InternalJEU.g:1797:5: ( (lv_comparaison_6_0= ruleComparateur ) )
                    // InternalJEU.g:1798:6: (lv_comparaison_6_0= ruleComparateur )
                    {
                    // InternalJEU.g:1798:6: (lv_comparaison_6_0= ruleComparateur )
                    // InternalJEU.g:1799:7: lv_comparaison_6_0= ruleComparateur
                    {

                    							newCompositeNode(grammarAccess.getConditionAccess().getComparaisonComparateurEnumRuleCall_3_0_3_0());
                    						
                    pushFollow(FOLLOW_54);
                    lv_comparaison_6_0=ruleComparateur();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConditionRule());
                    							}
                    							set(
                    								current,
                    								"comparaison",
                    								lv_comparaison_6_0,
                    								"fr.n7.JEU.Comparateur");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,48,FOLLOW_11); 

                    					newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getReferenceKeyword_3_0_4());
                    				
                    // InternalJEU.g:1820:5: ( (lv_reference_8_0= RULE_INT ) )
                    // InternalJEU.g:1821:6: (lv_reference_8_0= RULE_INT )
                    {
                    // InternalJEU.g:1821:6: (lv_reference_8_0= RULE_INT )
                    // InternalJEU.g:1822:7: lv_reference_8_0= RULE_INT
                    {
                    lv_reference_8_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    							newLeafNode(lv_reference_8_0, grammarAccess.getConditionAccess().getReferenceINTTerminalRuleCall_3_0_5_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConditionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"reference",
                    								lv_reference_8_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJEU.g:1840:4: (otherlv_9= 'connaissance' ( (otherlv_10= RULE_ID ) ) ( (lv_presente_11_0= 'presente' ) )? )
                    {
                    // InternalJEU.g:1840:4: (otherlv_9= 'connaissance' ( (otherlv_10= RULE_ID ) ) ( (lv_presente_11_0= 'presente' ) )? )
                    // InternalJEU.g:1841:5: otherlv_9= 'connaissance' ( (otherlv_10= RULE_ID ) ) ( (lv_presente_11_0= 'presente' ) )?
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getConnaissanceKeyword_3_1_0());
                    				
                    // InternalJEU.g:1845:5: ( (otherlv_10= RULE_ID ) )
                    // InternalJEU.g:1846:6: (otherlv_10= RULE_ID )
                    {
                    // InternalJEU.g:1846:6: (otherlv_10= RULE_ID )
                    // InternalJEU.g:1847:7: otherlv_10= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConditionRule());
                    							}
                    						
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_55); 

                    							newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getConnaissanceConnaissanceCrossReference_3_1_1_0());
                    						

                    }


                    }

                    // InternalJEU.g:1858:5: ( (lv_presente_11_0= 'presente' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==49) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalJEU.g:1859:6: (lv_presente_11_0= 'presente' )
                            {
                            // InternalJEU.g:1859:6: (lv_presente_11_0= 'presente' )
                            // InternalJEU.g:1860:7: lv_presente_11_0= 'presente'
                            {
                            lv_presente_11_0=(Token)match(input,49,FOLLOW_14); 

                            							newLeafNode(lv_presente_11_0, grammarAccess.getConditionAccess().getPresentePresenteKeyword_3_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "presente", true, "presente");
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecondition"


    // $ANTLR start "entryRulePersonne"
    // InternalJEU.g:1882:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalJEU.g:1882:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalJEU.g:1883:2: iv_rulePersonne= rulePersonne EOF
            {
             newCompositeNode(grammarAccess.getPersonneRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonne=rulePersonne();

            state._fsp--;

             current =iv_rulePersonne; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonne"


    // $ANTLR start "rulePersonne"
    // InternalJEU.g:1889:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visibilite' ( (lv_visibilite_4_0= ruletypevisibilite ) ) otherlv_5= 'activite' ( (lv_activite_6_0= ruletypeactivite ) ) otherlv_7= 'interaction' ( (lv_interaction_8_0= ruleInteraction ) ) otherlv_9= '}' ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_visibilite_4_0 = null;

        Enumerator lv_activite_6_0 = null;

        EObject lv_interaction_8_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:1895:2: ( (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visibilite' ( (lv_visibilite_4_0= ruletypevisibilite ) ) otherlv_5= 'activite' ( (lv_activite_6_0= ruletypeactivite ) ) otherlv_7= 'interaction' ( (lv_interaction_8_0= ruleInteraction ) ) otherlv_9= '}' ) )
            // InternalJEU.g:1896:2: (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visibilite' ( (lv_visibilite_4_0= ruletypevisibilite ) ) otherlv_5= 'activite' ( (lv_activite_6_0= ruletypeactivite ) ) otherlv_7= 'interaction' ( (lv_interaction_8_0= ruleInteraction ) ) otherlv_9= '}' )
            {
            // InternalJEU.g:1896:2: (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visibilite' ( (lv_visibilite_4_0= ruletypevisibilite ) ) otherlv_5= 'activite' ( (lv_activite_6_0= ruletypeactivite ) ) otherlv_7= 'interaction' ( (lv_interaction_8_0= ruleInteraction ) ) otherlv_9= '}' )
            // InternalJEU.g:1897:3: otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visibilite' ( (lv_visibilite_4_0= ruletypevisibilite ) ) otherlv_5= 'activite' ( (lv_activite_6_0= ruletypeactivite ) ) otherlv_7= 'interaction' ( (lv_interaction_8_0= ruleInteraction ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getNomKeyword_0());
            		
            // InternalJEU.g:1901:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJEU.g:1902:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJEU.g:1902:4: (lv_name_1_0= RULE_ID )
            // InternalJEU.g:1903:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonneAccess().getVisibiliteKeyword_3());
            		
            // InternalJEU.g:1927:3: ( (lv_visibilite_4_0= ruletypevisibilite ) )
            // InternalJEU.g:1928:4: (lv_visibilite_4_0= ruletypevisibilite )
            {
            // InternalJEU.g:1928:4: (lv_visibilite_4_0= ruletypevisibilite )
            // InternalJEU.g:1929:5: lv_visibilite_4_0= ruletypevisibilite
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getVisibiliteTypevisibiliteEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_visibilite_4_0=ruletypevisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"visibilite",
            						lv_visibilite_4_0,
            						"fr.n7.JEU.typevisibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonneAccess().getActiviteKeyword_5());
            		
            // InternalJEU.g:1950:3: ( (lv_activite_6_0= ruletypeactivite ) )
            // InternalJEU.g:1951:4: (lv_activite_6_0= ruletypeactivite )
            {
            // InternalJEU.g:1951:4: (lv_activite_6_0= ruletypeactivite )
            // InternalJEU.g:1952:5: lv_activite_6_0= ruletypeactivite
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getActiviteTypeactiviteEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_56);
            lv_activite_6_0=ruletypeactivite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"activite",
            						lv_activite_6_0,
            						"fr.n7.JEU.typeactivite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,50,FOLLOW_57); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonneAccess().getInteractionKeyword_7());
            		
            // InternalJEU.g:1973:3: ( (lv_interaction_8_0= ruleInteraction ) )
            // InternalJEU.g:1974:4: (lv_interaction_8_0= ruleInteraction )
            {
            // InternalJEU.g:1974:4: (lv_interaction_8_0= ruleInteraction )
            // InternalJEU.g:1975:5: lv_interaction_8_0= ruleInteraction
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_interaction_8_0=ruleInteraction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"interaction",
            						lv_interaction_8_0,
            						"fr.n7.JEU.Interaction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonne"


    // $ANTLR start "entryRulechoix"
    // InternalJEU.g:2000:1: entryRulechoix returns [EObject current=null] : iv_rulechoix= rulechoix EOF ;
    public final EObject entryRulechoix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulechoix = null;


        try {
            // InternalJEU.g:2000:46: (iv_rulechoix= rulechoix EOF )
            // InternalJEU.g:2001:2: iv_rulechoix= rulechoix EOF
            {
             newCompositeNode(grammarAccess.getChoixRule()); 
            pushFollow(FOLLOW_1);
            iv_rulechoix=rulechoix();

            state._fsp--;

             current =iv_rulechoix; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulechoix"


    // $ANTLR start "rulechoix"
    // InternalJEU.g:2007:1: rulechoix returns [EObject current=null] : (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'actions' otherlv_6= '(' ( (lv_actions_7_0= ruleaction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleaction ) ) )* otherlv_10= ')' )? ( ( (lv_estFin_11_0= 'fin' ) ) (otherlv_12= 'condition' ( (lv_conditionFin_13_0= rulecondition ) ) )? )? otherlv_14= '}' ) ;
    public final EObject rulechoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_estFin_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_actions_7_0 = null;

        EObject lv_actions_9_0 = null;

        EObject lv_conditionFin_13_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:2013:2: ( (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'actions' otherlv_6= '(' ( (lv_actions_7_0= ruleaction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleaction ) ) )* otherlv_10= ')' )? ( ( (lv_estFin_11_0= 'fin' ) ) (otherlv_12= 'condition' ( (lv_conditionFin_13_0= rulecondition ) ) )? )? otherlv_14= '}' ) )
            // InternalJEU.g:2014:2: (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'actions' otherlv_6= '(' ( (lv_actions_7_0= ruleaction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleaction ) ) )* otherlv_10= ')' )? ( ( (lv_estFin_11_0= 'fin' ) ) (otherlv_12= 'condition' ( (lv_conditionFin_13_0= rulecondition ) ) )? )? otherlv_14= '}' )
            {
            // InternalJEU.g:2014:2: (otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'actions' otherlv_6= '(' ( (lv_actions_7_0= ruleaction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleaction ) ) )* otherlv_10= ')' )? ( ( (lv_estFin_11_0= 'fin' ) ) (otherlv_12= 'condition' ( (lv_conditionFin_13_0= rulecondition ) ) )? )? otherlv_14= '}' )
            // InternalJEU.g:2015:3: otherlv_0= 'nom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'actions' otherlv_6= '(' ( (lv_actions_7_0= ruleaction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleaction ) ) )* otherlv_10= ')' )? ( ( (lv_estFin_11_0= 'fin' ) ) (otherlv_12= 'condition' ( (lv_conditionFin_13_0= rulecondition ) ) )? )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getNomKeyword_0());
            		
            // InternalJEU.g:2019:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJEU.g:2020:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJEU.g:2020:4: (lv_name_1_0= RULE_ID )
            // InternalJEU.g:2021:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJEU.g:2041:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJEU.g:2042:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getChoixAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalJEU.g:2046:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalJEU.g:2047:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalJEU.g:2047:5: (lv_description_4_0= RULE_STRING )
                    // InternalJEU.g:2048:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getChoixAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChoixRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJEU.g:2065:3: (otherlv_5= 'actions' otherlv_6= '(' ( (lv_actions_7_0= ruleaction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleaction ) ) )* otherlv_10= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalJEU.g:2066:4: otherlv_5= 'actions' otherlv_6= '(' ( (lv_actions_7_0= ruleaction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleaction ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_60); 

                    				newLeafNode(otherlv_5, grammarAccess.getChoixAccess().getActionsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,52,FOLLOW_61); 

                    				newLeafNode(otherlv_6, grammarAccess.getChoixAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalJEU.g:2074:4: ( (lv_actions_7_0= ruleaction ) )
                    // InternalJEU.g:2075:5: (lv_actions_7_0= ruleaction )
                    {
                    // InternalJEU.g:2075:5: (lv_actions_7_0= ruleaction )
                    // InternalJEU.g:2076:6: lv_actions_7_0= ruleaction
                    {

                    						newCompositeNode(grammarAccess.getChoixAccess().getActionsActionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_actions_7_0=ruleaction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChoixRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_7_0,
                    							"fr.n7.JEU.action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJEU.g:2093:4: (otherlv_8= ',' ( (lv_actions_9_0= ruleaction ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==13) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalJEU.g:2094:5: otherlv_8= ',' ( (lv_actions_9_0= ruleaction ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_61); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getChoixAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalJEU.g:2098:5: ( (lv_actions_9_0= ruleaction ) )
                    	    // InternalJEU.g:2099:6: (lv_actions_9_0= ruleaction )
                    	    {
                    	    // InternalJEU.g:2099:6: (lv_actions_9_0= ruleaction )
                    	    // InternalJEU.g:2100:7: lv_actions_9_0= ruleaction
                    	    {

                    	    							newCompositeNode(grammarAccess.getChoixAccess().getActionsActionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_62);
                    	    lv_actions_9_0=ruleaction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChoixRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_9_0,
                    	    								"fr.n7.JEU.action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,53,FOLLOW_63); 

                    				newLeafNode(otherlv_10, grammarAccess.getChoixAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalJEU.g:2123:3: ( ( (lv_estFin_11_0= 'fin' ) ) (otherlv_12= 'condition' ( (lv_conditionFin_13_0= rulecondition ) ) )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJEU.g:2124:4: ( (lv_estFin_11_0= 'fin' ) ) (otherlv_12= 'condition' ( (lv_conditionFin_13_0= rulecondition ) ) )?
                    {
                    // InternalJEU.g:2124:4: ( (lv_estFin_11_0= 'fin' ) )
                    // InternalJEU.g:2125:5: (lv_estFin_11_0= 'fin' )
                    {
                    // InternalJEU.g:2125:5: (lv_estFin_11_0= 'fin' )
                    // InternalJEU.g:2126:6: lv_estFin_11_0= 'fin'
                    {
                    lv_estFin_11_0=(Token)match(input,54,FOLLOW_28); 

                    						newLeafNode(lv_estFin_11_0, grammarAccess.getChoixAccess().getEstFinFinKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChoixRule());
                    						}
                    						setWithLastConsumed(current, "estFin", true, "fin");
                    					

                    }


                    }

                    // InternalJEU.g:2138:4: (otherlv_12= 'condition' ( (lv_conditionFin_13_0= rulecondition ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==28) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalJEU.g:2139:5: otherlv_12= 'condition' ( (lv_conditionFin_13_0= rulecondition ) )
                            {
                            otherlv_12=(Token)match(input,28,FOLLOW_22); 

                            					newLeafNode(otherlv_12, grammarAccess.getChoixAccess().getConditionKeyword_5_1_0());
                            				
                            // InternalJEU.g:2143:5: ( (lv_conditionFin_13_0= rulecondition ) )
                            // InternalJEU.g:2144:6: (lv_conditionFin_13_0= rulecondition )
                            {
                            // InternalJEU.g:2144:6: (lv_conditionFin_13_0= rulecondition )
                            // InternalJEU.g:2145:7: lv_conditionFin_13_0= rulecondition
                            {

                            							newCompositeNode(grammarAccess.getChoixAccess().getConditionFinConditionParserRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_conditionFin_13_0=rulecondition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getChoixRule());
                            							}
                            							set(
                            								current,
                            								"conditionFin",
                            								lv_conditionFin_13_0,
                            								"fr.n7.JEU.condition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulechoix"


    // $ANTLR start "entryRuleaction"
    // InternalJEU.g:2172:1: entryRuleaction returns [EObject current=null] : iv_ruleaction= ruleaction EOF ;
    public final EObject entryRuleaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaction = null;


        try {
            // InternalJEU.g:2172:47: (iv_ruleaction= ruleaction EOF )
            // InternalJEU.g:2173:2: iv_ruleaction= ruleaction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleaction=ruleaction();

            state._fsp--;

             current =iv_ruleaction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleaction"


    // $ANTLR start "ruleaction"
    // InternalJEU.g:2179:1: ruleaction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'connaissance' otherlv_6= '{' ( (lv_allocateursConnaissance_7_0= ruleAllocateurConnaissance ) ) (otherlv_8= ',' ( (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance ) ) )* otherlv_10= '}' )? (otherlv_11= 'objet' otherlv_12= '{' ( (lv_allocateursObjetLieu_13_0= ruleAllocateurObjet ) ) (otherlv_14= ',' ( (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet ) ) )* otherlv_16= '}' )? (otherlv_17= 'condition' ( (lv_conditionAction_18_0= rulecondition ) ) )? (otherlv_19= 'choixsuivants' ( (lv_choixSuivants_20_0= rulechoix ) ) )? ( (lv_estFinale_21_0= 'finale' ) )? otherlv_22= '}' ) ;
    public final EObject ruleaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_estFinale_21_0=null;
        Token otherlv_22=null;
        EObject lv_allocateursConnaissance_7_0 = null;

        EObject lv_allocateursConnaissance_9_0 = null;

        EObject lv_allocateursObjetLieu_13_0 = null;

        EObject lv_allocateursObjetLieu_15_0 = null;

        EObject lv_conditionAction_18_0 = null;

        EObject lv_choixSuivants_20_0 = null;



        	enterRule();

        try {
            // InternalJEU.g:2185:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'connaissance' otherlv_6= '{' ( (lv_allocateursConnaissance_7_0= ruleAllocateurConnaissance ) ) (otherlv_8= ',' ( (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance ) ) )* otherlv_10= '}' )? (otherlv_11= 'objet' otherlv_12= '{' ( (lv_allocateursObjetLieu_13_0= ruleAllocateurObjet ) ) (otherlv_14= ',' ( (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet ) ) )* otherlv_16= '}' )? (otherlv_17= 'condition' ( (lv_conditionAction_18_0= rulecondition ) ) )? (otherlv_19= 'choixsuivants' ( (lv_choixSuivants_20_0= rulechoix ) ) )? ( (lv_estFinale_21_0= 'finale' ) )? otherlv_22= '}' ) )
            // InternalJEU.g:2186:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'connaissance' otherlv_6= '{' ( (lv_allocateursConnaissance_7_0= ruleAllocateurConnaissance ) ) (otherlv_8= ',' ( (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance ) ) )* otherlv_10= '}' )? (otherlv_11= 'objet' otherlv_12= '{' ( (lv_allocateursObjetLieu_13_0= ruleAllocateurObjet ) ) (otherlv_14= ',' ( (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet ) ) )* otherlv_16= '}' )? (otherlv_17= 'condition' ( (lv_conditionAction_18_0= rulecondition ) ) )? (otherlv_19= 'choixsuivants' ( (lv_choixSuivants_20_0= rulechoix ) ) )? ( (lv_estFinale_21_0= 'finale' ) )? otherlv_22= '}' )
            {
            // InternalJEU.g:2186:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'connaissance' otherlv_6= '{' ( (lv_allocateursConnaissance_7_0= ruleAllocateurConnaissance ) ) (otherlv_8= ',' ( (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance ) ) )* otherlv_10= '}' )? (otherlv_11= 'objet' otherlv_12= '{' ( (lv_allocateursObjetLieu_13_0= ruleAllocateurObjet ) ) (otherlv_14= ',' ( (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet ) ) )* otherlv_16= '}' )? (otherlv_17= 'condition' ( (lv_conditionAction_18_0= rulecondition ) ) )? (otherlv_19= 'choixsuivants' ( (lv_choixSuivants_20_0= rulechoix ) ) )? ( (lv_estFinale_21_0= 'finale' ) )? otherlv_22= '}' )
            // InternalJEU.g:2187:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'connaissance' otherlv_6= '{' ( (lv_allocateursConnaissance_7_0= ruleAllocateurConnaissance ) ) (otherlv_8= ',' ( (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance ) ) )* otherlv_10= '}' )? (otherlv_11= 'objet' otherlv_12= '{' ( (lv_allocateursObjetLieu_13_0= ruleAllocateurObjet ) ) (otherlv_14= ',' ( (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet ) ) )* otherlv_16= '}' )? (otherlv_17= 'condition' ( (lv_conditionAction_18_0= rulecondition ) ) )? (otherlv_19= 'choixsuivants' ( (lv_choixSuivants_20_0= rulechoix ) ) )? ( (lv_estFinale_21_0= 'finale' ) )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalJEU.g:2191:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJEU.g:2192:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJEU.g:2192:4: (lv_name_1_0= RULE_ID )
            // InternalJEU.g:2193:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJEU.g:2213:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalJEU.g:2214:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalJEU.g:2218:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalJEU.g:2219:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalJEU.g:2219:5: (lv_description_4_0= RULE_STRING )
                    // InternalJEU.g:2220:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_65); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJEU.g:2237:3: (otherlv_5= 'connaissance' otherlv_6= '{' ( (lv_allocateursConnaissance_7_0= ruleAllocateurConnaissance ) ) (otherlv_8= ',' ( (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance ) ) )* otherlv_10= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==16) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalJEU.g:2238:4: otherlv_5= 'connaissance' otherlv_6= '{' ( (lv_allocateursConnaissance_7_0= ruleAllocateurConnaissance ) ) (otherlv_8= ',' ( (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getConnaissanceKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalJEU.g:2246:4: ( (lv_allocateursConnaissance_7_0= ruleAllocateurConnaissance ) )
                    // InternalJEU.g:2247:5: (lv_allocateursConnaissance_7_0= ruleAllocateurConnaissance )
                    {
                    // InternalJEU.g:2247:5: (lv_allocateursConnaissance_7_0= ruleAllocateurConnaissance )
                    // InternalJEU.g:2248:6: lv_allocateursConnaissance_7_0= ruleAllocateurConnaissance
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAllocateursConnaissanceAllocateurConnaissanceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_allocateursConnaissance_7_0=ruleAllocateurConnaissance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"allocateursConnaissance",
                    							lv_allocateursConnaissance_7_0,
                    							"fr.n7.JEU.AllocateurConnaissance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJEU.g:2265:4: (otherlv_8= ',' ( (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==13) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalJEU.g:2266:5: otherlv_8= ',' ( (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getActionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalJEU.g:2270:5: ( (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance ) )
                    	    // InternalJEU.g:2271:6: (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance )
                    	    {
                    	    // InternalJEU.g:2271:6: (lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance )
                    	    // InternalJEU.g:2272:7: lv_allocateursConnaissance_9_0= ruleAllocateurConnaissance
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAllocateursConnaissanceAllocateurConnaissanceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_allocateursConnaissance_9_0=ruleAllocateurConnaissance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"allocateursConnaissance",
                    	    								lv_allocateursConnaissance_9_0,
                    	    								"fr.n7.JEU.AllocateurConnaissance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_66); 

                    				newLeafNode(otherlv_10, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalJEU.g:2295:3: (otherlv_11= 'objet' otherlv_12= '{' ( (lv_allocateursObjetLieu_13_0= ruleAllocateurObjet ) ) (otherlv_14= ',' ( (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet ) ) )* otherlv_16= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalJEU.g:2296:4: otherlv_11= 'objet' otherlv_12= '{' ( (lv_allocateursObjetLieu_13_0= ruleAllocateurObjet ) ) (otherlv_14= ',' ( (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getObjetKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalJEU.g:2304:4: ( (lv_allocateursObjetLieu_13_0= ruleAllocateurObjet ) )
                    // InternalJEU.g:2305:5: (lv_allocateursObjetLieu_13_0= ruleAllocateurObjet )
                    {
                    // InternalJEU.g:2305:5: (lv_allocateursObjetLieu_13_0= ruleAllocateurObjet )
                    // InternalJEU.g:2306:6: lv_allocateursObjetLieu_13_0= ruleAllocateurObjet
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAllocateursObjetLieuAllocateurObjetParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_allocateursObjetLieu_13_0=ruleAllocateurObjet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"allocateursObjetLieu",
                    							lv_allocateursObjetLieu_13_0,
                    							"fr.n7.JEU.AllocateurObjet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJEU.g:2323:4: (otherlv_14= ',' ( (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==13) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalJEU.g:2324:5: otherlv_14= ',' ( (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet ) )
                    	    {
                    	    otherlv_14=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getActionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalJEU.g:2328:5: ( (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet ) )
                    	    // InternalJEU.g:2329:6: (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet )
                    	    {
                    	    // InternalJEU.g:2329:6: (lv_allocateursObjetLieu_15_0= ruleAllocateurObjet )
                    	    // InternalJEU.g:2330:7: lv_allocateursObjetLieu_15_0= ruleAllocateurObjet
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAllocateursObjetLieuAllocateurObjetParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_allocateursObjetLieu_15_0=ruleAllocateurObjet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"allocateursObjetLieu",
                    	    								lv_allocateursObjetLieu_15_0,
                    	    								"fr.n7.JEU.AllocateurObjet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,14,FOLLOW_67); 

                    				newLeafNode(otherlv_16, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalJEU.g:2353:3: (otherlv_17= 'condition' ( (lv_conditionAction_18_0= rulecondition ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalJEU.g:2354:4: otherlv_17= 'condition' ( (lv_conditionAction_18_0= rulecondition ) )
                    {
                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getActionAccess().getConditionKeyword_6_0());
                    			
                    // InternalJEU.g:2358:4: ( (lv_conditionAction_18_0= rulecondition ) )
                    // InternalJEU.g:2359:5: (lv_conditionAction_18_0= rulecondition )
                    {
                    // InternalJEU.g:2359:5: (lv_conditionAction_18_0= rulecondition )
                    // InternalJEU.g:2360:6: lv_conditionAction_18_0= rulecondition
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getConditionActionConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_conditionAction_18_0=rulecondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"conditionAction",
                    							lv_conditionAction_18_0,
                    							"fr.n7.JEU.condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJEU.g:2378:3: (otherlv_19= 'choixsuivants' ( (lv_choixSuivants_20_0= rulechoix ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalJEU.g:2379:4: otherlv_19= 'choixsuivants' ( (lv_choixSuivants_20_0= rulechoix ) )
                    {
                    otherlv_19=(Token)match(input,56,FOLLOW_22); 

                    				newLeafNode(otherlv_19, grammarAccess.getActionAccess().getChoixsuivantsKeyword_7_0());
                    			
                    // InternalJEU.g:2383:4: ( (lv_choixSuivants_20_0= rulechoix ) )
                    // InternalJEU.g:2384:5: (lv_choixSuivants_20_0= rulechoix )
                    {
                    // InternalJEU.g:2384:5: (lv_choixSuivants_20_0= rulechoix )
                    // InternalJEU.g:2385:6: lv_choixSuivants_20_0= rulechoix
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getChoixSuivantsChoixParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_choixSuivants_20_0=rulechoix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"choixSuivants",
                    							lv_choixSuivants_20_0,
                    							"fr.n7.JEU.choix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJEU.g:2403:3: ( (lv_estFinale_21_0= 'finale' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalJEU.g:2404:4: (lv_estFinale_21_0= 'finale' )
                    {
                    // InternalJEU.g:2404:4: (lv_estFinale_21_0= 'finale' )
                    // InternalJEU.g:2405:5: lv_estFinale_21_0= 'finale'
                    {
                    lv_estFinale_21_0=(Token)match(input,57,FOLLOW_14); 

                    					newLeafNode(lv_estFinale_21_0, grammarAccess.getActionAccess().getEstFinaleFinaleKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionRule());
                    					}
                    					setWithLastConsumed(current, "estFinale", true, "finale");
                    				

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleaction"


    // $ANTLR start "ruleComparateur"
    // InternalJEU.g:2425:1: ruleComparateur returns [Enumerator current=null] : ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>=' ) ) ;
    public final Enumerator ruleComparateur() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJEU.g:2431:2: ( ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>=' ) ) )
            // InternalJEU.g:2432:2: ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>=' ) )
            {
            // InternalJEU.g:2432:2: ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>=' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt48=1;
                }
                break;
            case 59:
                {
                alt48=2;
                }
                break;
            case 60:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalJEU.g:2433:3: (enumLiteral_0= '<=' )
                    {
                    // InternalJEU.g:2433:3: (enumLiteral_0= '<=' )
                    // InternalJEU.g:2434:4: enumLiteral_0= '<='
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getComparateurAccess().getLeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparateurAccess().getLeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJEU.g:2441:3: (enumLiteral_1= '=' )
                    {
                    // InternalJEU.g:2441:3: (enumLiteral_1= '=' )
                    // InternalJEU.g:2442:4: enumLiteral_1= '='
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getComparateurAccess().getEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparateurAccess().getEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJEU.g:2449:3: (enumLiteral_2= '>=' )
                    {
                    // InternalJEU.g:2449:3: (enumLiteral_2= '>=' )
                    // InternalJEU.g:2450:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getComparateurAccess().getFinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparateurAccess().getFinEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparateur"


    // $ANTLR start "ruletypevisibilite"
    // InternalJEU.g:2460:1: ruletypevisibilite returns [Enumerator current=null] : ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) ) ;
    public final Enumerator ruletypevisibilite() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJEU.g:2466:2: ( ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) ) )
            // InternalJEU.g:2467:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) )
            {
            // InternalJEU.g:2467:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==61) ) {
                alt49=1;
            }
            else if ( (LA49_0==62) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalJEU.g:2468:3: (enumLiteral_0= 'visible' )
                    {
                    // InternalJEU.g:2468:3: (enumLiteral_0= 'visible' )
                    // InternalJEU.g:2469:4: enumLiteral_0= 'visible'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTypevisibiliteAccess().getVisibleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypevisibiliteAccess().getVisibleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJEU.g:2476:3: (enumLiteral_1= 'invisible' )
                    {
                    // InternalJEU.g:2476:3: (enumLiteral_1= 'invisible' )
                    // InternalJEU.g:2477:4: enumLiteral_1= 'invisible'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTypevisibiliteAccess().getInvisibleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypevisibiliteAccess().getInvisibleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletypevisibilite"


    // $ANTLR start "ruletypeLieu"
    // InternalJEU.g:2487:1: ruletypeLieu returns [Enumerator current=null] : ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'normal' ) | (enumLiteral_2= 'fin' ) ) ;
    public final Enumerator ruletypeLieu() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJEU.g:2493:2: ( ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'normal' ) | (enumLiteral_2= 'fin' ) ) )
            // InternalJEU.g:2494:2: ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'normal' ) | (enumLiteral_2= 'fin' ) )
            {
            // InternalJEU.g:2494:2: ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'normal' ) | (enumLiteral_2= 'fin' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt50=1;
                }
                break;
            case 64:
                {
                alt50=2;
                }
                break;
            case 54:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalJEU.g:2495:3: (enumLiteral_0= 'debut' )
                    {
                    // InternalJEU.g:2495:3: (enumLiteral_0= 'debut' )
                    // InternalJEU.g:2496:4: enumLiteral_0= 'debut'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getTypeLieuAccess().getDebutEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeLieuAccess().getDebutEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJEU.g:2503:3: (enumLiteral_1= 'normal' )
                    {
                    // InternalJEU.g:2503:3: (enumLiteral_1= 'normal' )
                    // InternalJEU.g:2504:4: enumLiteral_1= 'normal'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getTypeLieuAccess().getNormalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeLieuAccess().getNormalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJEU.g:2511:3: (enumLiteral_2= 'fin' )
                    {
                    // InternalJEU.g:2511:3: (enumLiteral_2= 'fin' )
                    // InternalJEU.g:2512:4: enumLiteral_2= 'fin'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTypeLieuAccess().getFinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeLieuAccess().getFinEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletypeLieu"


    // $ANTLR start "ruleouvertOuferme"
    // InternalJEU.g:2522:1: ruleouvertOuferme returns [Enumerator current=null] : ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) ) ;
    public final Enumerator ruleouvertOuferme() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJEU.g:2528:2: ( ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) ) )
            // InternalJEU.g:2529:2: ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) )
            {
            // InternalJEU.g:2529:2: ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==65) ) {
                alt51=1;
            }
            else if ( (LA51_0==66) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalJEU.g:2530:3: (enumLiteral_0= 'ouvert' )
                    {
                    // InternalJEU.g:2530:3: (enumLiteral_0= 'ouvert' )
                    // InternalJEU.g:2531:4: enumLiteral_0= 'ouvert'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getOuvertOufermeAccess().getOuvertEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOuvertOufermeAccess().getOuvertEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJEU.g:2538:3: (enumLiteral_1= 'ferme' )
                    {
                    // InternalJEU.g:2538:3: (enumLiteral_1= 'ferme' )
                    // InternalJEU.g:2539:4: enumLiteral_1= 'ferme'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getOuvertOufermeAccess().getFermeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOuvertOufermeAccess().getFermeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleouvertOuferme"


    // $ANTLR start "ruletypeactivite"
    // InternalJEU.g:2549:1: ruletypeactivite returns [Enumerator current=null] : ( (enumLiteral_0= 'actif' ) | (enumLiteral_1= 'inactif' ) ) ;
    public final Enumerator ruletypeactivite() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJEU.g:2555:2: ( ( (enumLiteral_0= 'actif' ) | (enumLiteral_1= 'inactif' ) ) )
            // InternalJEU.g:2556:2: ( (enumLiteral_0= 'actif' ) | (enumLiteral_1= 'inactif' ) )
            {
            // InternalJEU.g:2556:2: ( (enumLiteral_0= 'actif' ) | (enumLiteral_1= 'inactif' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==67) ) {
                alt52=1;
            }
            else if ( (LA52_0==68) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalJEU.g:2557:3: (enumLiteral_0= 'actif' )
                    {
                    // InternalJEU.g:2557:3: (enumLiteral_0= 'actif' )
                    // InternalJEU.g:2558:4: enumLiteral_0= 'actif'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getTypeactiviteAccess().getActifEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeactiviteAccess().getActifEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJEU.g:2565:3: (enumLiteral_1= 'inactif' )
                    {
                    // InternalJEU.g:2565:3: (enumLiteral_1= 'inactif' )
                    // InternalJEU.g:2566:4: enumLiteral_1= 'inactif'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getTypeactiviteAccess().getInactifEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeactiviteAccess().getInactifEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletypeactivite"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002240104000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002240100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000E054000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C054000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008054000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x8040000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000108054000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100054000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100044000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000180C004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000100C004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000000C004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010008004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020008004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0048000008004000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0048000000004000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0020000000002000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0300000018054000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0300000010054000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0300000010044000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0300000010004000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0300000000004000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0200000000004000L});

}