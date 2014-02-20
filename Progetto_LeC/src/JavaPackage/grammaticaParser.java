// $ANTLR 3.4 /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g 2014-02-20 14:38:42

  package JavaPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class grammaticaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "BOX", "COMMA", "DEFNORM", "DEFTEX", "EQ", "FACE", "FLOAT", "GROUP", "ID", "INT", "LB", "LINE", "MULTILINETEXTCM", "NORMALSET", "POINT", "RB", "ROTATE", "SC", "SCALE", "SINGLELINECM", "SMOOTHING", "TEXTURESET", "TRASLATE", "VERTEX", "VERTEXSET", "VNORMAL", "VTEXTURE", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BOX=5;
    public static final int COMMA=6;
    public static final int DEFNORM=7;
    public static final int DEFTEX=8;
    public static final int EQ=9;
    public static final int FACE=10;
    public static final int FLOAT=11;
    public static final int GROUP=12;
    public static final int ID=13;
    public static final int INT=14;
    public static final int LB=15;
    public static final int LINE=16;
    public static final int MULTILINETEXTCM=17;
    public static final int NORMALSET=18;
    public static final int POINT=19;
    public static final int RB=20;
    public static final int ROTATE=21;
    public static final int SC=22;
    public static final int SCALE=23;
    public static final int SINGLELINECM=24;
    public static final int SMOOTHING=25;
    public static final int TEXTURESET=26;
    public static final int TRASLATE=27;
    public static final int VERTEX=28;
    public static final int VERTEXSET=29;
    public static final int VNORMAL=30;
    public static final int VTEXTURE=31;
    public static final int WS=32;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public grammaticaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public grammaticaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return grammaticaParser.tokenNames; }
    public String getGrammarFileName() { return "/media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g"; }





    // $ANTLR start "start"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:21:1: start : ( istruction )* ;
    public final void start() throws RecognitionException {
        System.out.println("Start parsing EBNF\n");
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:23:5: ( ( istruction )* )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:23:7: ( istruction )*
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:23:7: ( istruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FACE||(LA1_0 >= LINE && LA1_0 <= POINT)||LA1_0==SINGLELINECM||LA1_0==TEXTURESET||(LA1_0 >= VERTEX && LA1_0 <= VTEXTURE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:23:7: istruction
            	    {
            	    pushFollow(FOLLOW_istruction_in_start68);
            	    istruction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "istruction"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:29:1: istruction : ( vertexInfo | graphElement | comment ) ;
    public final void istruction() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:29:12: ( ( vertexInfo | graphElement | comment ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:29:14: ( vertexInfo | graphElement | comment )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:29:14: ( vertexInfo | graphElement | comment )
            int alt2=3;
            switch ( input.LA(1) ) {
            case NORMALSET:
            case TEXTURESET:
            case VERTEX:
            case VERTEXSET:
            case VNORMAL:
            case VTEXTURE:
                {
                alt2=1;
                }
                break;
            case FACE:
            case LINE:
            case POINT:
                {
                alt2=2;
                }
                break;
            case MULTILINETEXTCM:
            case SINGLELINECM:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:30:11: vertexInfo
                    {
                    pushFollow(FOLLOW_vertexInfo_in_istruction93);
                    vertexInfo();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:31:11: graphElement
                    {
                    pushFollow(FOLLOW_graphElement_in_istruction105);
                    graphElement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:35:11: comment
                    {
                    pushFollow(FOLLOW_comment_in_istruction120);
                    comment();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "istruction"



    // $ANTLR start "assignTag"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:41:1: assignTag : ( tagname equal ) ;
    public final void assignTag() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:41:11: ( ( tagname equal ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:41:13: ( tagname equal )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:41:13: ( tagname equal )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:41:14: tagname equal
            {
            pushFollow(FOLLOW_tagname_in_assignTag133);
            tagname();

            state._fsp--;


            pushFollow(FOLLOW_equal_in_assignTag135);
            equal();

            state._fsp--;


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignTag"



    // $ANTLR start "equal"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:42:1: equal : EQ ;
    public final void equal() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:42:7: ( EQ )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:42:9: EQ
            {
            match(input,EQ,FOLLOW_EQ_in_equal143); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "equal"



    // $ANTLR start "tagname"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:43:1: tagname : ID ;
    public final void tagname() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:43:9: ( ID )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:43:11: ID
            {
            match(input,ID,FOLLOW_ID_in_tagname150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "tagname"



    // $ANTLR start "vDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:44:1: vDef : ( num num num ) ;
    public final void vDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:44:6: ( ( num num num ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:44:8: ( num num num )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:44:8: ( num num num )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:44:9: num num num
            {
            pushFollow(FOLLOW_num_in_vDef158);
            num();

            state._fsp--;


            pushFollow(FOLLOW_num_in_vDef160);
            num();

            state._fsp--;


            pushFollow(FOLLOW_num_in_vDef162);
            num();

            state._fsp--;


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vDef"



    // $ANTLR start "num"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:45:1: num : ( INT | FLOAT ) ;
    public final void num() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:45:5: ( ( INT | FLOAT ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
            {
            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "num"



    // $ANTLR start "vertexInfo"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:50:1: vertexInfo : ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule ) ;
    public final void vertexInfo() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:50:12: ( ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:50:14: ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:50:14: ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule )
            int alt3=6;
            switch ( input.LA(1) ) {
            case VERTEX:
                {
                alt3=1;
                }
                break;
            case VERTEXSET:
                {
                alt3=2;
                }
                break;
            case VTEXTURE:
                {
                alt3=3;
                }
                break;
            case TEXTURESET:
                {
                alt3=4;
                }
                break;
            case VNORMAL:
                {
                alt3=5;
                }
                break;
            case NORMALSET:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:51:16: vertexRule
                    {
                    pushFollow(FOLLOW_vertexRule_in_vertexInfo201);
                    vertexRule();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:52:16: vertexSetRule
                    {
                    pushFollow(FOLLOW_vertexSetRule_in_vertexInfo218);
                    vertexSetRule();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:53:16: vTextureRule
                    {
                    pushFollow(FOLLOW_vTextureRule_in_vertexInfo235);
                    vTextureRule();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:54:16: textureSetRule
                    {
                    pushFollow(FOLLOW_textureSetRule_in_vertexInfo252);
                    textureSetRule();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:55:16: vNormalRule
                    {
                    pushFollow(FOLLOW_vNormalRule_in_vertexInfo269);
                    vNormalRule();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:56:16: normalSetRule
                    {
                    pushFollow(FOLLOW_normalSetRule_in_vertexInfo286);
                    normalSetRule();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vertexInfo"



    // $ANTLR start "singleDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:61:1: singleDef : assignTag vDef ;
    public final void singleDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:61:11: ( assignTag vDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:61:13: assignTag vDef
            {
            pushFollow(FOLLOW_assignTag_in_singleDef298);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_vDef_in_singleDef300);
            vDef();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "singleDef"



    // $ANTLR start "multipleDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:62:1: multipleDef : LB ( singleDef ) ( COMMA singleDef )* RB ;
    public final void multipleDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:62:13: ( LB ( singleDef ) ( COMMA singleDef )* RB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:62:15: LB ( singleDef ) ( COMMA singleDef )* RB
            {
            match(input,LB,FOLLOW_LB_in_multipleDef307); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:62:18: ( singleDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:62:19: singleDef
            {
            pushFollow(FOLLOW_singleDef_in_multipleDef310);
            singleDef();

            state._fsp--;


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:62:30: ( COMMA singleDef )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:62:31: COMMA singleDef
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multipleDef314); 

            	    pushFollow(FOLLOW_singleDef_in_multipleDef316);
            	    singleDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,RB,FOLLOW_RB_in_multipleDef320); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multipleDef"



    // $ANTLR start "setDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:1: setDef : LB ( tagname ( equal vDef )? ) ( COMMA tagname ( equal vDef )? )* RB ;
    public final void setDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:8: ( LB ( tagname ( equal vDef )? ) ( COMMA tagname ( equal vDef )? )* RB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:10: LB ( tagname ( equal vDef )? ) ( COMMA tagname ( equal vDef )? )* RB
            {
            match(input,LB,FOLLOW_LB_in_setDef329); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:13: ( tagname ( equal vDef )? )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:14: tagname ( equal vDef )?
            {
            pushFollow(FOLLOW_tagname_in_setDef332);
            tagname();

            state._fsp--;


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:21: ( equal vDef )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EQ) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:22: equal vDef
                    {
                    pushFollow(FOLLOW_equal_in_setDef334);
                    equal();

                    state._fsp--;


                    pushFollow(FOLLOW_vDef_in_setDef336);
                    vDef();

                    state._fsp--;


                    }
                    break;

            }


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:36: ( COMMA tagname ( equal vDef )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:37: COMMA tagname ( equal vDef )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_setDef342); 

            	    pushFollow(FOLLOW_tagname_in_setDef344);
            	    tagname();

            	    state._fsp--;


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:50: ( equal vDef )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==EQ) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:51: equal vDef
            	            {
            	            pushFollow(FOLLOW_equal_in_setDef346);
            	            equal();

            	            state._fsp--;


            	            pushFollow(FOLLOW_vDef_in_setDef348);
            	            vDef();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,RB,FOLLOW_RB_in_setDef354); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "setDef"



    // $ANTLR start "vertexRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:68:1: vertexRule : VERTEX ( multipleDef | singleDef ) SC ;
    public final void vertexRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:68:12: ( VERTEX ( multipleDef | singleDef ) SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:68:14: VERTEX ( multipleDef | singleDef ) SC
            {
            match(input,VERTEX,FOLLOW_VERTEX_in_vertexRule363); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:68:21: ( multipleDef | singleDef )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LB) ) {
                alt8=1;
            }
            else if ( (LA8_0==ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:68:22: multipleDef
                    {
                    pushFollow(FOLLOW_multipleDef_in_vertexRule366);
                    multipleDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:68:34: singleDef
                    {
                    pushFollow(FOLLOW_singleDef_in_vertexRule368);
                    singleDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_vertexRule370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vertexRule"



    // $ANTLR start "vertexInline"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:69:1: vertexInline : VERTEX ( assignTag )? vDef ;
    public final void vertexInline() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:69:14: ( VERTEX ( assignTag )? vDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:69:16: VERTEX ( assignTag )? vDef
            {
            match(input,VERTEX,FOLLOW_VERTEX_in_vertexInline377); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:69:23: ( assignTag )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:69:23: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_vertexInline379);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_vDef_in_vertexInline382);
            vDef();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vertexInline"



    // $ANTLR start "vertexSetRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:70:1: vertexSetRule : VERTEXSET assignTag setDef SC ;
    public final void vertexSetRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:70:15: ( VERTEXSET assignTag setDef SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:70:17: VERTEXSET assignTag setDef SC
            {
            match(input,VERTEXSET,FOLLOW_VERTEXSET_in_vertexSetRule390); 

            pushFollow(FOLLOW_assignTag_in_vertexSetRule392);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_vertexSetRule394);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_vertexSetRule396); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vertexSetRule"



    // $ANTLR start "vTextureRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:73:1: vTextureRule : VTEXTURE ( multipleDef | singleDef ) SC ;
    public final void vTextureRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:73:14: ( VTEXTURE ( multipleDef | singleDef ) SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:73:16: VTEXTURE ( multipleDef | singleDef ) SC
            {
            match(input,VTEXTURE,FOLLOW_VTEXTURE_in_vTextureRule405); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:73:25: ( multipleDef | singleDef )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LB) ) {
                alt10=1;
            }
            else if ( (LA10_0==ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:73:26: multipleDef
                    {
                    pushFollow(FOLLOW_multipleDef_in_vTextureRule408);
                    multipleDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:73:38: singleDef
                    {
                    pushFollow(FOLLOW_singleDef_in_vTextureRule410);
                    singleDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_vTextureRule412); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vTextureRule"



    // $ANTLR start "vTextureInline"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:1: vTextureInline : VTEXTURE ( assignTag )? vDef ;
    public final void vTextureInline() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:16: ( VTEXTURE ( assignTag )? vDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:18: VTEXTURE ( assignTag )? vDef
            {
            match(input,VTEXTURE,FOLLOW_VTEXTURE_in_vTextureInline419); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:27: ( assignTag )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:27: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_vTextureInline421);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_vDef_in_vTextureInline424);
            vDef();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vTextureInline"



    // $ANTLR start "textureSetRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:75:1: textureSetRule : TEXTURESET assignTag setDef SC ;
    public final void textureSetRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:75:16: ( TEXTURESET assignTag setDef SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:75:18: TEXTURESET assignTag setDef SC
            {
            match(input,TEXTURESET,FOLLOW_TEXTURESET_in_textureSetRule432); 

            pushFollow(FOLLOW_assignTag_in_textureSetRule434);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_textureSetRule436);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_textureSetRule438); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "textureSetRule"



    // $ANTLR start "vNormalRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:78:1: vNormalRule : VNORMAL ( multipleDef | singleDef ) SC ;
    public final void vNormalRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:78:13: ( VNORMAL ( multipleDef | singleDef ) SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:78:15: VNORMAL ( multipleDef | singleDef ) SC
            {
            match(input,VNORMAL,FOLLOW_VNORMAL_in_vNormalRule447); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:78:23: ( multipleDef | singleDef )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LB) ) {
                alt12=1;
            }
            else if ( (LA12_0==ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:78:24: multipleDef
                    {
                    pushFollow(FOLLOW_multipleDef_in_vNormalRule450);
                    multipleDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:78:36: singleDef
                    {
                    pushFollow(FOLLOW_singleDef_in_vNormalRule452);
                    singleDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_vNormalRule454); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vNormalRule"



    // $ANTLR start "vNormalInline"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:79:1: vNormalInline : VNORMAL ( assignTag )? vDef ;
    public final void vNormalInline() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:79:15: ( VNORMAL ( assignTag )? vDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:79:17: VNORMAL ( assignTag )? vDef
            {
            match(input,VNORMAL,FOLLOW_VNORMAL_in_vNormalInline461); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:79:25: ( assignTag )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:79:25: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_vNormalInline463);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_vDef_in_vNormalInline466);
            vDef();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vNormalInline"



    // $ANTLR start "normalSetRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:80:1: normalSetRule : NORMALSET assignTag setDef SC ;
    public final void normalSetRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:80:15: ( NORMALSET assignTag setDef SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:80:17: NORMALSET assignTag setDef SC
            {
            match(input,NORMALSET,FOLLOW_NORMALSET_in_normalSetRule474); 

            pushFollow(FOLLOW_assignTag_in_normalSetRule476);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_normalSetRule478);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_normalSetRule480); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "normalSetRule"



    // $ANTLR start "graphElement"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:85:1: graphElement : ( pointRule | lineRule | faceRule ) ;
    public final void graphElement() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:85:14: ( ( pointRule | lineRule | faceRule ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:85:16: ( pointRule | lineRule | faceRule )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:85:16: ( pointRule | lineRule | faceRule )
            int alt14=3;
            switch ( input.LA(1) ) {
            case POINT:
                {
                alt14=1;
                }
                break;
            case LINE:
                {
                alt14=2;
                }
                break;
            case FACE:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:86:18: pointRule
                    {
                    pushFollow(FOLLOW_pointRule_in_graphElement509);
                    pointRule();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:87:18: lineRule
                    {
                    pushFollow(FOLLOW_lineRule_in_graphElement528);
                    lineRule();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:88:18: faceRule
                    {
                    pushFollow(FOLLOW_faceRule_in_graphElement547);
                    faceRule();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "graphElement"



    // $ANTLR start "pointRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:92:1: pointRule : POINT ( singlePointDef | multiplePointDef ) SC ;
    public final void pointRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:92:11: ( POINT ( singlePointDef | multiplePointDef ) SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:92:13: POINT ( singlePointDef | multiplePointDef ) SC
            {
            match(input,POINT,FOLLOW_POINT_in_pointRule559); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:92:19: ( singlePointDef | multiplePointDef )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID||LA15_0==VERTEX) ) {
                alt15=1;
            }
            else if ( (LA15_0==LB) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:92:20: singlePointDef
                    {
                    pushFollow(FOLLOW_singlePointDef_in_pointRule562);
                    singlePointDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:92:35: multiplePointDef
                    {
                    pushFollow(FOLLOW_multiplePointDef_in_pointRule564);
                    multiplePointDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_pointRule567); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pointRule"



    // $ANTLR start "singlePointDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:1: singlePointDef : ( ( tagname ( equal ( tagname | vertexInline ) )? ) | ( vertexInline ) );
    public final void singlePointDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:16: ( ( tagname ( equal ( tagname | vertexInline ) )? ) | ( vertexInline ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==VERTEX) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:18: ( tagname ( equal ( tagname | vertexInline ) )? )
                    {
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:18: ( tagname ( equal ( tagname | vertexInline ) )? )
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:19: tagname ( equal ( tagname | vertexInline ) )?
                    {
                    pushFollow(FOLLOW_tagname_in_singlePointDef575);
                    tagname();

                    state._fsp--;


                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:27: ( equal ( tagname | vertexInline ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==EQ) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:28: equal ( tagname | vertexInline )
                            {
                            pushFollow(FOLLOW_equal_in_singlePointDef578);
                            equal();

                            state._fsp--;


                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:34: ( tagname | vertexInline )
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==ID) ) {
                                alt16=1;
                            }
                            else if ( (LA16_0==VERTEX) ) {
                                alt16=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 0, input);

                                throw nvae;

                            }
                            switch (alt16) {
                                case 1 :
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:35: tagname
                                    {
                                    pushFollow(FOLLOW_tagname_in_singlePointDef581);
                                    tagname();

                                    state._fsp--;


                                    }
                                    break;
                                case 2 :
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:43: vertexInline
                                    {
                                    pushFollow(FOLLOW_vertexInline_in_singlePointDef583);
                                    vertexInline();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:60: ( vertexInline )
                    {
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:60: ( vertexInline )
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:61: vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_singlePointDef590);
                    vertexInline();

                    state._fsp--;


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "singlePointDef"



    // $ANTLR start "multiplePointDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:94:1: multiplePointDef : LB ( singlePointDef ) ( COMMA singlePointDef )* RB ;
    public final void multiplePointDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:94:18: ( LB ( singlePointDef ) ( COMMA singlePointDef )* RB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:94:20: LB ( singlePointDef ) ( COMMA singlePointDef )* RB
            {
            match(input,LB,FOLLOW_LB_in_multiplePointDef598); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:94:23: ( singlePointDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:94:24: singlePointDef
            {
            pushFollow(FOLLOW_singlePointDef_in_multiplePointDef601);
            singlePointDef();

            state._fsp--;


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:95:20: ( COMMA singlePointDef )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:95:21: COMMA singlePointDef
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplePointDef624); 

            	    pushFollow(FOLLOW_singlePointDef_in_multiplePointDef626);
            	    singlePointDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match(input,RB,FOLLOW_RB_in_multiplePointDef630); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multiplePointDef"



    // $ANTLR start "lineRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:1: lineRule : LINE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? )+ RB SC ;
    public final void lineRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:10: ( LINE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? )+ RB SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:12: LINE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? )+ RB SC
            {
            match(input,LINE,FOLLOW_LINE_in_lineRule639); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:17: ( assignTag )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:17: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_lineRule641);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,LB,FOLLOW_LB_in_lineRule644); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:31: ( ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:32: ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )?
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:32: ( tagname | vertexInline )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==VERTEX) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:33: tagname
                    {
                    pushFollow(FOLLOW_tagname_in_lineRule648);
                    tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:41: vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_lineRule650);
                    vertexInline();

                    state._fsp--;


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:33: ( DEFTEX ( tagname | vTextureInline ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DEFTEX) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:34: DEFTEX ( tagname | vTextureInline )
                    {
                    match(input,DEFTEX,FOLLOW_DEFTEX_in_lineRule687); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:41: ( tagname | vTextureInline )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==ID) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==VTEXTURE) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }
                    switch (alt22) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:42: tagname
                            {
                            pushFollow(FOLLOW_tagname_in_lineRule690);
                            tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:50: vTextureInline
                            {
                            pushFollow(FOLLOW_vTextureInline_in_lineRule692);
                            vTextureInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:100:29: ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==COMMA) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:100:30: COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_lineRule727); 

            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:100:36: ( tagname | vertexInline )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==ID) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==VERTEX) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:100:37: tagname
            	            {
            	            pushFollow(FOLLOW_tagname_in_lineRule730);
            	            tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:100:45: vertexInline
            	            {
            	            pushFollow(FOLLOW_vertexInline_in_lineRule732);
            	            vertexInline();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:33: ( DEFTEX ( tagname | vTextureInline ) )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==DEFTEX) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:34: DEFTEX ( tagname | vTextureInline )
            	            {
            	            match(input,DEFTEX,FOLLOW_DEFTEX_in_lineRule769); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:41: ( tagname | vTextureInline )
            	            int alt25=2;
            	            int LA25_0 = input.LA(1);

            	            if ( (LA25_0==ID) ) {
            	                alt25=1;
            	            }
            	            else if ( (LA25_0==VTEXTURE) ) {
            	                alt25=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 25, 0, input);

            	                throw nvae;

            	            }
            	            switch (alt25) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:42: tagname
            	                    {
            	                    pushFollow(FOLLOW_tagname_in_lineRule772);
            	                    tagname();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:50: vTextureInline
            	                    {
            	                    pushFollow(FOLLOW_vTextureInline_in_lineRule774);
            	                    vTextureInline();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            match(input,RB,FOLLOW_RB_in_lineRule807); 

            match(input,SC,FOLLOW_SC_in_lineRule809); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lineRule"



    // $ANTLR start "faceRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:1: faceRule : FACE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ( DEFNORM ( tagname | vNormalInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ( DEFNORM ( tagname | vNormalInline ) )? )* RB SC ;
    public final void faceRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:10: ( FACE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ( DEFNORM ( tagname | vNormalInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ( DEFNORM ( tagname | vNormalInline ) )? )* RB SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:12: FACE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ( DEFNORM ( tagname | vNormalInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ( DEFNORM ( tagname | vNormalInline ) )? )* RB SC
            {
            match(input,FACE,FOLLOW_FACE_in_faceRule830); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:17: ( assignTag )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:17: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_faceRule832);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,LB,FOLLOW_LB_in_faceRule835); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:31: ( ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ( DEFNORM ( tagname | vNormalInline ) )? )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:32: ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ( DEFNORM ( tagname | vNormalInline ) )?
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:32: ( tagname | vertexInline )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==VERTEX) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:33: tagname
                    {
                    pushFollow(FOLLOW_tagname_in_faceRule839);
                    tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:41: vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_faceRule841);
                    vertexInline();

                    state._fsp--;


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:33: ( DEFTEX ( tagname | vTextureInline ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==DEFTEX) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:34: DEFTEX ( tagname | vTextureInline )
                    {
                    match(input,DEFTEX,FOLLOW_DEFTEX_in_faceRule878); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:41: ( tagname | vTextureInline )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==ID) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==VTEXTURE) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;

                    }
                    switch (alt30) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:42: tagname
                            {
                            pushFollow(FOLLOW_tagname_in_faceRule881);
                            tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:50: vTextureInline
                            {
                            pushFollow(FOLLOW_vTextureInline_in_faceRule883);
                            vTextureInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:33: ( DEFNORM ( tagname | vNormalInline ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==DEFNORM) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:34: DEFNORM ( tagname | vNormalInline )
                    {
                    match(input,DEFNORM,FOLLOW_DEFNORM_in_faceRule922); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:42: ( tagname | vNormalInline )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==ID) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==VNORMAL) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }
                    switch (alt32) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:43: tagname
                            {
                            pushFollow(FOLLOW_tagname_in_faceRule925);
                            tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:51: vNormalInline
                            {
                            pushFollow(FOLLOW_vNormalInline_in_faceRule927);
                            vNormalInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:29: ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ( DEFNORM ( tagname | vNormalInline ) )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==COMMA) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:30: COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname | vTextureInline ) )? ( DEFNORM ( tagname | vNormalInline ) )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_faceRule993); 

            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:36: ( tagname | vertexInline )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==ID) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==VERTEX) ) {
            	        alt34=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:37: tagname
            	            {
            	            pushFollow(FOLLOW_tagname_in_faceRule996);
            	            tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:45: vertexInline
            	            {
            	            pushFollow(FOLLOW_vertexInline_in_faceRule998);
            	            vertexInline();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:33: ( DEFTEX ( tagname | vTextureInline ) )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==DEFTEX) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:34: DEFTEX ( tagname | vTextureInline )
            	            {
            	            match(input,DEFTEX,FOLLOW_DEFTEX_in_faceRule1035); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:41: ( tagname | vTextureInline )
            	            int alt35=2;
            	            int LA35_0 = input.LA(1);

            	            if ( (LA35_0==ID) ) {
            	                alt35=1;
            	            }
            	            else if ( (LA35_0==VTEXTURE) ) {
            	                alt35=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 35, 0, input);

            	                throw nvae;

            	            }
            	            switch (alt35) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:42: tagname
            	                    {
            	                    pushFollow(FOLLOW_tagname_in_faceRule1038);
            	                    tagname();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:50: vTextureInline
            	                    {
            	                    pushFollow(FOLLOW_vTextureInline_in_faceRule1040);
            	                    vTextureInline();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:33: ( DEFNORM ( tagname | vNormalInline ) )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==DEFNORM) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:34: DEFNORM ( tagname | vNormalInline )
            	            {
            	            match(input,DEFNORM,FOLLOW_DEFNORM_in_faceRule1078); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:42: ( tagname | vNormalInline )
            	            int alt37=2;
            	            int LA37_0 = input.LA(1);

            	            if ( (LA37_0==ID) ) {
            	                alt37=1;
            	            }
            	            else if ( (LA37_0==VNORMAL) ) {
            	                alt37=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 37, 0, input);

            	                throw nvae;

            	            }
            	            switch (alt37) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:43: tagname
            	                    {
            	                    pushFollow(FOLLOW_tagname_in_faceRule1081);
            	                    tagname();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:51: vNormalInline
            	                    {
            	                    pushFollow(FOLLOW_vNormalInline_in_faceRule1083);
            	                    vNormalInline();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            match(input,RB,FOLLOW_RB_in_faceRule1116); 

            match(input,SC,FOLLOW_SC_in_faceRule1118); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "faceRule"



    // $ANTLR start "primitive"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:117:1: primitive : () ;
    public final void primitive() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:117:11: ( () )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:117:13: ()
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:117:13: ()
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:119:13: 
            {
            }


            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "primitive"



    // $ANTLR start "grouping"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:124:1: grouping : () ;
    public final void grouping() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:124:10: ( () )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:124:12: ()
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:124:12: ()
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:127:12: 
            {
            }


            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "grouping"



    // $ANTLR start "functional"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:141:1: functional : () ;
    public final void functional() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:141:12: ( () )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:141:14: ()
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:141:14: ()
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:143:14: 
            {
            }


            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functional"



    // $ANTLR start "comment"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:145:1: comment : ( SINGLELINECM | MULTILINETEXTCM );
    public final void comment() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:145:9: ( SINGLELINECM | MULTILINETEXTCM )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
            {
            if ( input.LA(1)==MULTILINETEXTCM||input.LA(1)==SINGLELINECM ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "comment"

    // Delegated rules


 

    public static final BitSet FOLLOW_istruction_in_start68 = new BitSet(new long[]{0x00000000F50F0402L});
    public static final BitSet FOLLOW_vertexInfo_in_istruction93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphElement_in_istruction105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_istruction120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tagname_in_assignTag133 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_equal_in_assignTag135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_equal143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_tagname150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_in_vDef158 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_num_in_vDef160 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_num_in_vDef162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexRule_in_vertexInfo201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexSetRule_in_vertexInfo218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vTextureRule_in_vertexInfo235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textureSetRule_in_vertexInfo252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vNormalRule_in_vertexInfo269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalSetRule_in_vertexInfo286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignTag_in_singleDef298 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_singleDef300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LB_in_multipleDef307 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_singleDef_in_multipleDef310 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_COMMA_in_multipleDef314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_singleDef_in_multipleDef316 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_RB_in_multipleDef320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LB_in_setDef329 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_tagname_in_setDef332 = new BitSet(new long[]{0x0000000000100240L});
    public static final BitSet FOLLOW_equal_in_setDef334 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_setDef336 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_COMMA_in_setDef342 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_tagname_in_setDef344 = new BitSet(new long[]{0x0000000000100240L});
    public static final BitSet FOLLOW_equal_in_setDef346 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_setDef348 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_RB_in_setDef354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTEX_in_vertexRule363 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_multipleDef_in_vertexRule366 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_singleDef_in_vertexRule368 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_vertexRule370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTEX_in_vertexInline377 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_assignTag_in_vertexInline379 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_vertexInline382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTEXSET_in_vertexSetRule390 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_assignTag_in_vertexSetRule392 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_setDef_in_vertexSetRule394 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_vertexSetRule396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VTEXTURE_in_vTextureRule405 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_multipleDef_in_vTextureRule408 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_singleDef_in_vTextureRule410 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_vTextureRule412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VTEXTURE_in_vTextureInline419 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_assignTag_in_vTextureInline421 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_vTextureInline424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTURESET_in_textureSetRule432 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_assignTag_in_textureSetRule434 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_setDef_in_textureSetRule436 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_textureSetRule438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VNORMAL_in_vNormalRule447 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_multipleDef_in_vNormalRule450 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_singleDef_in_vNormalRule452 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_vNormalRule454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VNORMAL_in_vNormalInline461 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_assignTag_in_vNormalInline463 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_vNormalInline466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMALSET_in_normalSetRule474 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_assignTag_in_normalSetRule476 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_setDef_in_normalSetRule478 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_normalSetRule480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointRule_in_graphElement509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineRule_in_graphElement528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_faceRule_in_graphElement547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_pointRule559 = new BitSet(new long[]{0x000000001000A000L});
    public static final BitSet FOLLOW_singlePointDef_in_pointRule562 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_multiplePointDef_in_pointRule564 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_pointRule567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tagname_in_singlePointDef575 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_equal_in_singlePointDef578 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_tagname_in_singlePointDef581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexInline_in_singlePointDef583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexInline_in_singlePointDef590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LB_in_multiplePointDef598 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_singlePointDef_in_multiplePointDef601 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_COMMA_in_multiplePointDef624 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_singlePointDef_in_multiplePointDef626 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_RB_in_multiplePointDef630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_lineRule639 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_assignTag_in_lineRule641 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LB_in_lineRule644 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_tagname_in_lineRule648 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_vertexInline_in_lineRule650 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_DEFTEX_in_lineRule687 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_tagname_in_lineRule690 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_vTextureInline_in_lineRule692 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_lineRule727 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_tagname_in_lineRule730 = new BitSet(new long[]{0x0000000000100140L});
    public static final BitSet FOLLOW_vertexInline_in_lineRule732 = new BitSet(new long[]{0x0000000000100140L});
    public static final BitSet FOLLOW_DEFTEX_in_lineRule769 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_tagname_in_lineRule772 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_vTextureInline_in_lineRule774 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_RB_in_lineRule807 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_lineRule809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FACE_in_faceRule830 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_assignTag_in_faceRule832 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LB_in_faceRule835 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_tagname_in_faceRule839 = new BitSet(new long[]{0x00000000001001C0L});
    public static final BitSet FOLLOW_vertexInline_in_faceRule841 = new BitSet(new long[]{0x00000000001001C0L});
    public static final BitSet FOLLOW_DEFTEX_in_faceRule878 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_tagname_in_faceRule881 = new BitSet(new long[]{0x00000000001000C0L});
    public static final BitSet FOLLOW_vTextureInline_in_faceRule883 = new BitSet(new long[]{0x00000000001000C0L});
    public static final BitSet FOLLOW_DEFNORM_in_faceRule922 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_tagname_in_faceRule925 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_vNormalInline_in_faceRule927 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_COMMA_in_faceRule993 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_tagname_in_faceRule996 = new BitSet(new long[]{0x00000000001001C0L});
    public static final BitSet FOLLOW_vertexInline_in_faceRule998 = new BitSet(new long[]{0x00000000001001C0L});
    public static final BitSet FOLLOW_DEFTEX_in_faceRule1035 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_tagname_in_faceRule1038 = new BitSet(new long[]{0x00000000001000C0L});
    public static final BitSet FOLLOW_vTextureInline_in_faceRule1040 = new BitSet(new long[]{0x00000000001000C0L});
    public static final BitSet FOLLOW_DEFNORM_in_faceRule1078 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_tagname_in_faceRule1081 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_vNormalInline_in_faceRule1083 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_RB_in_faceRule1116 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_faceRule1118 = new BitSet(new long[]{0x0000000000000002L});

}