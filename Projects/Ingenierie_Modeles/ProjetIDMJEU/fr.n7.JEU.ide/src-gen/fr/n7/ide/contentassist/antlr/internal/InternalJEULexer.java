package fr.n7.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJEULexer extends Lexer {
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

    public InternalJEULexer() {;} 
    public InternalJEULexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJEULexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalJEU.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:11:7: ( '<=' )
            // InternalJEU.g:11:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:12:7: ( '=' )
            // InternalJEU.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:13:7: ( '>=' )
            // InternalJEU.g:13:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:14:7: ( 'visible' )
            // InternalJEU.g:14:9: 'visible'
            {
            match("visible"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:15:7: ( 'invisible' )
            // InternalJEU.g:15:9: 'invisible'
            {
            match("invisible"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:16:7: ( 'debut' )
            // InternalJEU.g:16:9: 'debut'
            {
            match("debut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:17:7: ( 'normal' )
            // InternalJEU.g:17:9: 'normal'
            {
            match("normal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:18:7: ( 'fin' )
            // InternalJEU.g:18:9: 'fin'
            {
            match("fin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:19:7: ( 'ouvert' )
            // InternalJEU.g:19:9: 'ouvert'
            {
            match("ouvert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:20:7: ( 'ferme' )
            // InternalJEU.g:20:9: 'ferme'
            {
            match("ferme"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:21:7: ( 'actif' )
            // InternalJEU.g:21:9: 'actif'
            {
            match("actif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:22:7: ( 'inactif' )
            // InternalJEU.g:22:9: 'inactif'
            {
            match("inactif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:23:7: ( 'Jeu' )
            // InternalJEU.g:23:9: 'Jeu'
            {
            match("Jeu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:24:7: ( '{' )
            // InternalJEU.g:24:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:25:7: ( '}' )
            // InternalJEU.g:25:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:26:7: ( ',' )
            // InternalJEU.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:27:7: ( 'Joueur' )
            // InternalJEU.g:27:9: 'Joueur'
            {
            match("Joueur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:28:7: ( 'inventaire' )
            // InternalJEU.g:28:9: 'inventaire'
            {
            match("inventaire"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:29:7: ( 'lieu' )
            // InternalJEU.g:29:9: 'lieu'
            {
            match("lieu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:30:7: ( 'connaissance' )
            // InternalJEU.g:30:9: 'connaissance'
            {
            match("connaissance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:31:7: ( 'objet' )
            // InternalJEU.g:31:9: 'objet'
            {
            match("objet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:32:7: ( 'Chemin' )
            // InternalJEU.g:32:9: 'Chemin'
            {
            match("Chemin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:33:7: ( 'de' )
            // InternalJEU.g:33:9: 'de'
            {
            match("de"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:34:7: ( 'a' )
            // InternalJEU.g:34:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:35:7: ( 'ouvertOuferme' )
            // InternalJEU.g:35:9: 'ouvertOuferme'
            {
            match("ouvertOuferme"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:36:7: ( 'visibilite' )
            // InternalJEU.g:36:9: 'visibilite'
            {
            match("visibilite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:37:7: ( 'accescondition' )
            // InternalJEU.g:37:9: 'accescondition'
            {
            match("accescondition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:38:7: ( 'visiblecondition' )
            // InternalJEU.g:38:9: 'visiblecondition'
            {
            match("visiblecondition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:39:7: ( 'description' )
            // InternalJEU.g:39:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:40:7: ( 'Lieu' )
            // InternalJEU.g:40:9: 'Lieu'
            {
            match("Lieu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:41:7: ( 'type' )
            // InternalJEU.g:41:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:42:7: ( 'personne' )
            // InternalJEU.g:42:9: 'personne'
            {
            match("personne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:43:7: ( 'Connaissance' )
            // InternalJEU.g:43:9: 'Connaissance'
            {
            match("Connaissance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:44:7: ( 'activite' )
            // InternalJEU.g:44:9: 'activite'
            {
            match("activite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:45:7: ( 'actifcondition' )
            // InternalJEU.g:45:9: 'actifcondition'
            {
            match("actifcondition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:46:7: ( 'Objet' )
            // InternalJEU.g:46:9: 'Objet'
            {
            match("Objet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:47:7: ( 'taille' )
            // InternalJEU.g:47:9: 'taille'
            {
            match("taille"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:48:7: ( 'quantite' )
            // InternalJEU.g:48:9: 'quantite'
            {
            match("quantite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:49:7: ( 'deposersi' )
            // InternalJEU.g:49:9: 'deposersi'
            {
            match("deposersi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:50:7: ( 'Interaction' )
            // InternalJEU.g:50:9: 'Interaction'
            {
            match("Interaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:51:7: ( 'question' )
            // InternalJEU.g:51:9: 'question'
            {
            match("question"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:52:7: ( 'choix' )
            // InternalJEU.g:52:9: 'choix'
            {
            match("choix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:53:7: ( 'ChoixJoueur' )
            // InternalJEU.g:53:9: 'ChoixJoueur'
            {
            match("ChoixJoueur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:54:7: ( 'nom' )
            // InternalJEU.g:54:9: 'nom'
            {
            match("nom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:55:7: ( 'comparateur' )
            // InternalJEU.g:55:9: 'comparateur'
            {
            match("comparateur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:56:7: ( 'reference' )
            // InternalJEU.g:56:9: 'reference'
            {
            match("reference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:57:7: ( 'interaction' )
            // InternalJEU.g:57:9: 'interaction'
            {
            match("interaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:58:7: ( 'actions' )
            // InternalJEU.g:58:9: 'actions'
            {
            match("actions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:59:7: ( '(' )
            // InternalJEU.g:59:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:60:7: ( ')' )
            // InternalJEU.g:60:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:61:7: ( 'condition' )
            // InternalJEU.g:61:9: 'condition'
            {
            match("condition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:62:7: ( 'action' )
            // InternalJEU.g:62:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:63:7: ( 'choixsuivants' )
            // InternalJEU.g:63:9: 'choixsuivants'
            {
            match("choixsuivants"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:64:7: ( 'consomme' )
            // InternalJEU.g:64:9: 'consomme'
            {
            match("consomme"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:65:7: ( 'possede' )
            // InternalJEU.g:65:9: 'possede'
            {
            match("possede"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:66:7: ( 'danslelieu' )
            // InternalJEU.g:66:9: 'danslelieu'
            {
            match("danslelieu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:67:7: ( 'presente' )
            // InternalJEU.g:67:9: 'presente'
            {
            match("presente"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:68:7: ( 'finale' )
            // InternalJEU.g:68:9: 'finale'
            {
            match("finale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:8696:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJEU.g:8696:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJEU.g:8696:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJEU.g:8696:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalJEU.g:8696:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJEU.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:8698:10: ( ( '0' .. '9' )+ )
            // InternalJEU.g:8698:12: ( '0' .. '9' )+
            {
            // InternalJEU.g:8698:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJEU.g:8698:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:8700:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJEU.g:8700:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJEU.g:8700:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJEU.g:8700:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJEU.g:8700:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJEU.g:8700:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJEU.g:8700:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalJEU.g:8700:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJEU.g:8700:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalJEU.g:8700:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJEU.g:8700:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:8702:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJEU.g:8702:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJEU.g:8702:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJEU.g:8702:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:8704:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJEU.g:8704:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJEU.g:8704:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJEU.g:8704:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalJEU.g:8704:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJEU.g:8704:41: ( '\\r' )? '\\n'
                    {
                    // InternalJEU.g:8704:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalJEU.g:8704:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:8706:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJEU.g:8706:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJEU.g:8706:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJEU.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJEU.g:8708:16: ( . )
            // InternalJEU.g:8708:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalJEU.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=65;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalJEU.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalJEU.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalJEU.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalJEU.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalJEU.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalJEU.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalJEU.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalJEU.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalJEU.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalJEU.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalJEU.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalJEU.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalJEU.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalJEU.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalJEU.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalJEU.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalJEU.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalJEU.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalJEU.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalJEU.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalJEU.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalJEU.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalJEU.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalJEU.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalJEU.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalJEU.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalJEU.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalJEU.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalJEU.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalJEU.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalJEU.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalJEU.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalJEU.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalJEU.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalJEU.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalJEU.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalJEU.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalJEU.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalJEU.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalJEU.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalJEU.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalJEU.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalJEU.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalJEU.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalJEU.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalJEU.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalJEU.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalJEU.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalJEU.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalJEU.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalJEU.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalJEU.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalJEU.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalJEU.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalJEU.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalJEU.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalJEU.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalJEU.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalJEU.g:1:358: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 60 :
                // InternalJEU.g:1:366: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 61 :
                // InternalJEU.g:1:375: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 62 :
                // InternalJEU.g:1:387: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 63 :
                // InternalJEU.g:1:403: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 64 :
                // InternalJEU.g:1:419: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 65 :
                // InternalJEU.g:1:427: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\42\1\uffff\1\42\6\47\1\61\1\47\3\uffff\12\47\2\uffff\1\42\2\uffff\3\42\5\uffff\1\47\1\uffff\1\47\1\124\7\47\1\uffff\2\47\3\uffff\17\47\7\uffff\7\47\1\uffff\2\47\1\174\1\176\5\47\1\u0084\35\47\1\uffff\1\47\1\uffff\5\47\1\uffff\1\47\1\u00ad\10\47\1\u00b6\1\u00b7\16\47\1\u00c7\5\47\1\u00cd\1\47\1\u00cf\1\u00d1\4\47\1\uffff\4\47\1\u00db\3\47\2\uffff\4\47\1\u00e3\12\47\1\uffff\3\47\1\u00f1\1\u00f2\1\uffff\1\u00f4\1\uffff\1\47\1\uffff\1\47\1\u00f8\1\47\1\u00fa\5\47\1\uffff\1\u0100\2\47\1\u0103\3\47\1\uffff\4\47\1\u010c\3\47\1\u0110\4\47\2\uffff\1\47\1\uffff\2\47\1\u0118\1\uffff\1\47\1\uffff\5\47\1\uffff\2\47\1\uffff\1\47\1\u0122\6\47\1\uffff\3\47\1\uffff\6\47\1\u0132\1\uffff\3\47\1\u0136\4\47\1\u013b\1\uffff\1\u013c\1\u013d\1\u013e\4\47\1\u0143\3\47\1\u0147\3\47\1\uffff\2\47\1\u014d\1\uffff\4\47\4\uffff\1\47\1\u0153\1\47\1\u0155\1\uffff\1\u0156\2\47\1\uffff\1\u0159\4\47\1\uffff\5\47\1\uffff\1\47\2\uffff\1\u0164\1\u0165\1\uffff\4\47\1\u016a\1\47\1\u016c\1\47\1\u016e\1\47\2\uffff\3\47\1\u0173\1\uffff\1\47\1\uffff\1\u0175\1\uffff\1\47\1\u0177\2\47\1\uffff\1\u017a\1\uffff\1\47\1\uffff\1\u017c\1\u017d\1\uffff\1\47\2\uffff\1\u017f\1\uffff";
    static final String DFA12_eofS =
        "\u0180\uffff";
    static final String DFA12_minS =
        "\1\0\1\75\1\uffff\1\75\1\151\1\156\1\141\1\157\1\145\1\142\1\60\1\145\3\uffff\1\151\2\150\1\151\1\141\1\145\1\142\1\165\1\156\1\145\2\uffff\1\101\2\uffff\2\0\1\52\5\uffff\1\163\1\uffff\1\141\1\60\1\156\1\155\1\156\1\162\1\166\1\152\1\143\1\uffff\2\165\3\uffff\1\145\1\155\1\157\1\145\1\156\1\145\1\160\1\151\1\162\1\163\1\145\1\152\1\141\1\164\1\146\7\uffff\1\151\1\145\1\143\1\145\1\165\1\143\1\157\1\uffff\1\163\1\155\2\60\1\155\2\145\1\151\1\145\1\60\1\145\1\165\1\144\1\160\1\151\1\155\1\151\1\156\1\165\1\145\1\154\3\163\1\145\1\156\1\163\2\145\1\142\1\163\1\156\1\164\1\162\1\164\1\162\1\163\1\154\1\141\1\uffff\1\154\1\uffff\1\145\1\162\1\164\1\146\1\163\1\uffff\1\165\1\60\1\141\1\151\1\157\1\141\1\170\1\151\1\170\1\141\2\60\1\154\1\157\2\145\3\164\2\162\2\151\1\164\1\151\1\141\1\60\1\151\2\145\1\154\1\145\1\60\1\164\2\60\1\151\1\156\1\143\1\162\1\uffff\1\151\1\164\1\155\1\162\1\60\1\156\1\112\1\151\2\uffff\1\145\1\156\1\144\1\156\1\60\2\151\1\141\2\145\1\154\1\142\1\141\1\146\1\143\1\uffff\1\160\1\162\1\154\2\60\1\uffff\1\60\1\uffff\1\157\1\uffff\1\164\1\60\1\157\1\60\1\163\1\151\1\155\1\141\1\165\1\uffff\1\60\1\157\1\163\1\60\1\156\1\145\1\164\1\uffff\1\164\1\157\1\143\1\156\1\60\1\151\1\154\1\151\1\60\2\164\1\163\1\151\2\uffff\1\165\1\uffff\1\156\1\145\1\60\1\uffff\1\156\1\uffff\1\163\1\157\1\145\1\164\1\151\1\uffff\1\165\1\163\1\uffff\1\145\1\60\2\145\1\156\1\164\1\143\1\157\1\uffff\1\164\1\145\1\162\1\uffff\3\151\1\145\1\146\1\144\1\60\1\uffff\1\144\1\141\1\156\1\60\1\145\1\166\1\145\1\141\1\60\1\uffff\3\60\1\151\1\145\1\156\1\145\1\60\1\145\2\157\1\60\1\165\1\145\1\151\1\uffff\1\151\1\156\1\60\1\uffff\1\165\1\141\1\165\1\156\4\uffff\1\157\1\60\1\144\1\60\1\uffff\1\60\2\156\1\uffff\1\60\1\162\2\164\1\143\1\uffff\1\162\1\156\1\162\1\143\1\156\1\uffff\1\151\2\uffff\2\60\1\uffff\1\155\2\151\1\145\1\60\1\164\1\60\1\145\1\60\1\164\2\uffff\1\145\2\157\1\60\1\uffff\1\163\1\uffff\1\60\1\uffff\1\151\1\60\2\156\1\uffff\1\60\1\uffff\1\157\1\uffff\2\60\1\uffff\1\156\2\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\75\1\uffff\1\75\1\151\1\156\1\145\1\157\1\151\1\165\1\172\1\157\3\uffff\1\151\2\157\1\151\1\171\1\162\1\142\1\165\1\156\1\145\2\uffff\1\172\2\uffff\2\uffff\1\57\5\uffff\1\163\1\uffff\1\166\1\172\1\156\1\162\1\156\1\162\1\166\1\152\1\164\1\uffff\2\165\3\uffff\1\145\1\156\2\157\1\156\1\145\1\160\1\151\1\162\1\163\1\145\1\152\1\145\1\164\1\146\7\uffff\2\151\1\143\1\145\1\165\1\143\1\157\1\uffff\1\163\1\155\2\172\1\155\2\145\1\151\1\145\1\172\1\145\1\165\1\163\1\160\1\151\1\155\1\151\1\156\1\165\1\145\1\154\3\163\1\145\1\156\1\163\2\145\1\142\1\163\1\156\1\164\1\162\1\164\1\162\1\163\1\154\1\141\1\uffff\1\154\1\uffff\1\145\1\162\1\164\1\166\1\163\1\uffff\1\165\1\172\1\141\1\151\1\157\1\141\1\170\1\151\1\170\1\141\2\172\1\154\1\157\2\145\3\164\2\162\1\154\1\151\1\164\1\151\1\141\1\172\1\151\2\145\1\154\1\145\1\172\1\164\2\172\1\151\1\156\1\143\1\162\1\uffff\1\151\1\164\1\155\1\162\1\172\1\156\1\112\1\151\2\uffff\1\145\1\156\1\144\1\156\1\172\2\151\1\141\2\145\1\154\1\142\1\141\1\146\1\143\1\uffff\1\160\1\162\1\154\2\172\1\uffff\1\172\1\uffff\1\157\1\uffff\1\164\1\172\1\157\1\172\1\163\1\151\1\155\1\141\1\165\1\uffff\1\172\1\157\1\163\1\172\1\156\1\145\1\164\1\uffff\1\164\1\157\1\143\1\156\1\172\1\151\1\154\1\151\1\172\2\164\1\163\1\151\2\uffff\1\165\1\uffff\1\156\1\145\1\172\1\uffff\1\156\1\uffff\1\163\1\157\1\145\1\164\1\151\1\uffff\1\165\1\163\1\uffff\1\145\1\172\2\145\1\156\1\164\1\143\1\157\1\uffff\1\164\1\145\1\162\1\uffff\3\151\1\145\1\146\1\144\1\172\1\uffff\1\144\1\141\1\156\1\172\1\145\1\166\1\145\1\141\1\172\1\uffff\3\172\1\151\1\145\1\156\1\145\1\172\1\145\2\157\1\172\1\165\1\145\1\151\1\uffff\1\151\1\156\1\172\1\uffff\1\165\1\141\1\165\1\156\4\uffff\1\157\1\172\1\144\1\172\1\uffff\1\172\2\156\1\uffff\1\172\1\162\2\164\1\143\1\uffff\1\162\1\156\1\162\1\143\1\156\1\uffff\1\151\2\uffff\2\172\1\uffff\1\155\2\151\1\145\1\172\1\164\1\172\1\145\1\172\1\164\2\uffff\1\145\2\157\1\172\1\uffff\1\163\1\uffff\1\172\1\uffff\1\151\1\172\2\156\1\uffff\1\172\1\uffff\1\157\1\uffff\2\172\1\uffff\1\156\2\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\11\uffff\1\16\1\17\1\20\12\uffff\1\61\1\62\1\uffff\1\73\1\74\3\uffff\1\100\1\101\1\1\1\2\1\3\1\uffff\1\73\11\uffff\1\30\2\uffff\1\16\1\17\1\20\17\uffff\1\61\1\62\1\74\1\75\1\76\1\77\1\100\7\uffff\1\27\47\uffff\1\54\1\uffff\1\10\5\uffff\1\15\50\uffff\1\23\10\uffff\1\36\1\37\17\uffff\1\6\5\uffff\1\12\1\uffff\1\25\1\uffff\1\13\11\uffff\1\52\7\uffff\1\44\15\uffff\1\7\1\72\1\uffff\1\11\3\uffff\1\64\1\uffff\1\21\5\uffff\1\26\2\uffff\1\45\10\uffff\1\4\3\uffff\1\14\7\uffff\1\60\11\uffff\1\67\17\uffff\1\42\3\uffff\1\66\4\uffff\1\40\1\71\1\46\1\51\4\uffff\1\5\3\uffff\1\47\5\uffff\1\63\5\uffff\1\56\1\uffff\1\32\1\22\2\uffff\1\70\12\uffff\1\57\1\35\4\uffff\1\55\1\uffff\1\53\1\uffff\1\50\4\uffff\1\24\1\uffff\1\41\1\uffff\1\31\2\uffff\1\65\1\uffff\1\43\1\33\1\uffff\1\34";
    static final String DFA12_specialS =
        "\1\1\35\uffff\1\0\1\2\u0160\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\36\4\42\1\37\1\31\1\32\2\42\1\16\2\42\1\40\12\35\2\42\1\1\1\2\1\3\2\42\2\34\1\21\5\34\1\27\1\13\1\34\1\22\2\34\1\25\13\34\3\42\1\33\1\34\1\42\1\12\1\34\1\20\1\6\1\34\1\10\2\34\1\5\2\34\1\17\1\34\1\7\1\11\1\24\1\26\1\30\1\34\1\23\1\34\1\4\4\34\1\14\1\42\1\15\uff82\42",
            "\1\43",
            "",
            "\1\45",
            "\1\46",
            "\1\50",
            "\1\52\3\uffff\1\51",
            "\1\53",
            "\1\55\3\uffff\1\54",
            "\1\57\22\uffff\1\56",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\60\27\47",
            "\1\62\11\uffff\1\63",
            "",
            "",
            "",
            "\1\67",
            "\1\71\6\uffff\1\70",
            "\1\72\6\uffff\1\73",
            "\1\74",
            "\1\76\27\uffff\1\75",
            "\1\77\11\uffff\1\100\2\uffff\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\0\111",
            "\0\111",
            "\1\112\4\uffff\1\113",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "",
            "\1\117\22\uffff\1\120\1\uffff\1\116",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\121\15\47\1\123\2\47\1\122\7\47",
            "\1\125",
            "\1\127\4\uffff\1\126",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\135\20\uffff\1\134",
            "",
            "\1\136",
            "\1\137",
            "",
            "",
            "",
            "\1\140",
            "\1\142\1\141",
            "\1\143",
            "\1\144\11\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156\3\uffff\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\164\3\uffff\1\163",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\175\31\47",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0085",
            "\1\u0086",
            "\1\u0088\11\uffff\1\u0087\4\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8\10\uffff\1\u00aa\6\uffff\1\u00a9",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c2\2\uffff\1\u00c1",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ce",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00d0\27\47",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00da\7\47",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\16\47\1\u00f3\13\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00f7\7\47",
            "\1\u00f9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0101",
            "\1\u0102",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u010b\27\47",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "",
            "\1\u0121",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "",
            "",
            "",
            "\1\u0152",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0154",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0157",
            "\1\u0158",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "",
            "\1\u0163",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u016b",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u016d",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u016f",
            "",
            "",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0174",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0176",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0178",
            "\1\u0179",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u017b",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u017e",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 73;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='<') ) {s = 1;}

                        else if ( (LA12_0=='=') ) {s = 2;}

                        else if ( (LA12_0=='>') ) {s = 3;}

                        else if ( (LA12_0=='v') ) {s = 4;}

                        else if ( (LA12_0=='i') ) {s = 5;}

                        else if ( (LA12_0=='d') ) {s = 6;}

                        else if ( (LA12_0=='n') ) {s = 7;}

                        else if ( (LA12_0=='f') ) {s = 8;}

                        else if ( (LA12_0=='o') ) {s = 9;}

                        else if ( (LA12_0=='a') ) {s = 10;}

                        else if ( (LA12_0=='J') ) {s = 11;}

                        else if ( (LA12_0=='{') ) {s = 12;}

                        else if ( (LA12_0=='}') ) {s = 13;}

                        else if ( (LA12_0==',') ) {s = 14;}

                        else if ( (LA12_0=='l') ) {s = 15;}

                        else if ( (LA12_0=='c') ) {s = 16;}

                        else if ( (LA12_0=='C') ) {s = 17;}

                        else if ( (LA12_0=='L') ) {s = 18;}

                        else if ( (LA12_0=='t') ) {s = 19;}

                        else if ( (LA12_0=='p') ) {s = 20;}

                        else if ( (LA12_0=='O') ) {s = 21;}

                        else if ( (LA12_0=='q') ) {s = 22;}

                        else if ( (LA12_0=='I') ) {s = 23;}

                        else if ( (LA12_0=='r') ) {s = 24;}

                        else if ( (LA12_0=='(') ) {s = 25;}

                        else if ( (LA12_0==')') ) {s = 26;}

                        else if ( (LA12_0=='^') ) {s = 27;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='H')||LA12_0=='K'||(LA12_0>='M' && LA12_0<='N')||(LA12_0>='P' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='e'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='m'||LA12_0=='s'||LA12_0=='u'||(LA12_0>='w' && LA12_0<='z')) ) {s = 28;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 29;}

                        else if ( (LA12_0=='\"') ) {s = 30;}

                        else if ( (LA12_0=='\'') ) {s = 31;}

                        else if ( (LA12_0=='/') ) {s = 32;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 33;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 73;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}