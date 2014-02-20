// $ANTLR 3.4 /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g 2014-02-20 16:06:28

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:69:1: vertexInline : vDef ;
    public final void vertexInline() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:69:14: ( vDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:69:16: vDef
            {
            pushFollow(FOLLOW_vDef_in_vertexInline377);
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
            match(input,VERTEXSET,FOLLOW_VERTEXSET_in_vertexSetRule384); 

            pushFollow(FOLLOW_assignTag_in_vertexSetRule386);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_vertexSetRule388);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_vertexSetRule390); 

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
            match(input,VTEXTURE,FOLLOW_VTEXTURE_in_vTextureRule399); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:73:25: ( multipleDef | singleDef )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LB) ) {
                alt9=1;
            }
            else if ( (LA9_0==ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:73:26: multipleDef
                    {
                    pushFollow(FOLLOW_multipleDef_in_vTextureRule402);
                    multipleDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:73:38: singleDef
                    {
                    pushFollow(FOLLOW_singleDef_in_vTextureRule404);
                    singleDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_vTextureRule406); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:1: vTextureInline : vDef ;
    public final void vTextureInline() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:16: ( vDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:18: vDef
            {
            pushFollow(FOLLOW_vDef_in_vTextureInline413);
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
            match(input,TEXTURESET,FOLLOW_TEXTURESET_in_textureSetRule421); 

            pushFollow(FOLLOW_assignTag_in_textureSetRule423);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_textureSetRule425);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_textureSetRule427); 

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
            match(input,VNORMAL,FOLLOW_VNORMAL_in_vNormalRule436); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:78:23: ( multipleDef | singleDef )
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
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:78:24: multipleDef
                    {
                    pushFollow(FOLLOW_multipleDef_in_vNormalRule439);
                    multipleDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:78:36: singleDef
                    {
                    pushFollow(FOLLOW_singleDef_in_vNormalRule441);
                    singleDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_vNormalRule443); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:79:1: vNormalInline : vDef ;
    public final void vNormalInline() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:79:15: ( vDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:79:17: vDef
            {
            pushFollow(FOLLOW_vDef_in_vNormalInline450);
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
            match(input,NORMALSET,FOLLOW_NORMALSET_in_normalSetRule458); 

            pushFollow(FOLLOW_assignTag_in_normalSetRule460);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_normalSetRule462);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_normalSetRule464); 

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
            int alt11=3;
            switch ( input.LA(1) ) {
            case POINT:
                {
                alt11=1;
                }
                break;
            case LINE:
                {
                alt11=2;
                }
                break;
            case FACE:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:86:18: pointRule
                    {
                    pushFollow(FOLLOW_pointRule_in_graphElement493);
                    pointRule();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:87:18: lineRule
                    {
                    pushFollow(FOLLOW_lineRule_in_graphElement512);
                    lineRule();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:88:18: faceRule
                    {
                    pushFollow(FOLLOW_faceRule_in_graphElement531);
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
            match(input,POINT,FOLLOW_POINT_in_pointRule543); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:92:19: ( singlePointDef | multiplePointDef )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==FLOAT||(LA12_0 >= ID && LA12_0 <= INT)) ) {
                alt12=1;
            }
            else if ( (LA12_0==LB) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:92:20: singlePointDef
                    {
                    pushFollow(FOLLOW_singlePointDef_in_pointRule546);
                    singlePointDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:92:35: multiplePointDef
                    {
                    pushFollow(FOLLOW_multiplePointDef_in_pointRule548);
                    multiplePointDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_pointRule551); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:1: singlePointDef : ( ( tagname ( equal ( tagname | vertexInline ) )? ) | vertexInline ) ;
    public final void singlePointDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:16: ( ( ( tagname ( equal ( tagname | vertexInline ) )? ) | vertexInline ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:18: ( ( tagname ( equal ( tagname | vertexInline ) )? ) | vertexInline )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:18: ( ( tagname ( equal ( tagname | vertexInline ) )? ) | vertexInline )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==FLOAT||LA15_0==INT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:19: ( tagname ( equal ( tagname | vertexInline ) )? )
                    {
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:19: ( tagname ( equal ( tagname | vertexInline ) )? )
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:20: tagname ( equal ( tagname | vertexInline ) )?
                    {
                    pushFollow(FOLLOW_tagname_in_singlePointDef560);
                    tagname();

                    state._fsp--;


                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:28: ( equal ( tagname | vertexInline ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==EQ) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:29: equal ( tagname | vertexInline )
                            {
                            pushFollow(FOLLOW_equal_in_singlePointDef563);
                            equal();

                            state._fsp--;


                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:35: ( tagname | vertexInline )
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==ID) ) {
                                alt13=1;
                            }
                            else if ( (LA13_0==FLOAT||LA13_0==INT) ) {
                                alt13=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 0, input);

                                throw nvae;

                            }
                            switch (alt13) {
                                case 1 :
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:36: tagname
                                    {
                                    pushFollow(FOLLOW_tagname_in_singlePointDef566);
                                    tagname();

                                    state._fsp--;


                                    }
                                    break;
                                case 2 :
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:44: vertexInline
                                    {
                                    pushFollow(FOLLOW_vertexInline_in_singlePointDef568);
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
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:93:62: vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_singlePointDef575);
                    vertexInline();

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
    // $ANTLR end "singlePointDef"



    // $ANTLR start "multiplePointDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:94:1: multiplePointDef : LB ( singlePointDef ) ( COMMA singlePointDef )* RB ;
    public final void multiplePointDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:94:18: ( LB ( singlePointDef ) ( COMMA singlePointDef )* RB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:94:20: LB ( singlePointDef ) ( COMMA singlePointDef )* RB
            {
            match(input,LB,FOLLOW_LB_in_multiplePointDef583); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:94:23: ( singlePointDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:94:24: singlePointDef
            {
            pushFollow(FOLLOW_singlePointDef_in_multiplePointDef586);
            singlePointDef();

            state._fsp--;


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:95:20: ( COMMA singlePointDef )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:95:21: COMMA singlePointDef
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplePointDef609); 

            	    pushFollow(FOLLOW_singlePointDef_in_multiplePointDef611);
            	    singlePointDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match(input,RB,FOLLOW_RB_in_multiplePointDef615); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:1: lineRule : LINE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )? )+ RB SC ;
    public final void lineRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:10: ( LINE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )? )+ RB SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:12: LINE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )? )+ RB SC
            {
            match(input,LINE,FOLLOW_LINE_in_lineRule624); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:17: ( assignTag )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:17: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_lineRule626);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,LB,FOLLOW_LB_in_lineRule629); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:31: ( ( tagname | vertexInline ) ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )? )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:32: ( tagname | vertexInline ) ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )?
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:32: ( tagname | vertexInline )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==FLOAT||LA18_0==INT) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:33: tagname
                    {
                    pushFollow(FOLLOW_tagname_in_lineRule633);
                    tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:98:41: vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_lineRule635);
                    vertexInline();

                    state._fsp--;


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:33: ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==DEFTEX) ) {
                alt20=1;
            }
            else if ( (LA20_0==FLOAT||LA20_0==INT) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:34: DEFTEX ( tagname ( equal vertexInline ) )?
                    {
                    match(input,DEFTEX,FOLLOW_DEFTEX_in_lineRule672); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:41: ( tagname ( equal vertexInline ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ID) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:42: tagname ( equal vertexInline )
                            {
                            pushFollow(FOLLOW_tagname_in_lineRule675);
                            tagname();

                            state._fsp--;


                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:50: ( equal vertexInline )
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:51: equal vertexInline
                            {
                            pushFollow(FOLLOW_equal_in_lineRule678);
                            equal();

                            state._fsp--;


                            pushFollow(FOLLOW_vertexInline_in_lineRule680);
                            vertexInline();

                            state._fsp--;


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:73: ( vTextureInline )
                    {
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:73: ( vTextureInline )
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:99:74: vTextureInline
                    {
                    pushFollow(FOLLOW_vTextureInline_in_lineRule686);
                    vTextureInline();

                    state._fsp--;


                    }


                    }
                    break;

            }


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:100:29: ( COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )? )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:100:30: COMMA ( tagname | vertexInline ) ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_lineRule721); 

            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:100:36: ( tagname | vertexInline )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==ID) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==FLOAT||LA21_0==INT) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:100:37: tagname
            	            {
            	            pushFollow(FOLLOW_tagname_in_lineRule724);
            	            tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:100:45: vertexInline
            	            {
            	            pushFollow(FOLLOW_vertexInline_in_lineRule726);
            	            vertexInline();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:33: ( DEFTEX ( tagname ( equal vertexInline ) )? | ( vTextureInline ) )?
            	    int alt23=3;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==DEFTEX) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==FLOAT||LA23_0==INT) ) {
            	        alt23=2;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:34: DEFTEX ( tagname ( equal vertexInline ) )?
            	            {
            	            match(input,DEFTEX,FOLLOW_DEFTEX_in_lineRule763); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:41: ( tagname ( equal vertexInline ) )?
            	            int alt22=2;
            	            int LA22_0 = input.LA(1);

            	            if ( (LA22_0==ID) ) {
            	                alt22=1;
            	            }
            	            switch (alt22) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:42: tagname ( equal vertexInline )
            	                    {
            	                    pushFollow(FOLLOW_tagname_in_lineRule766);
            	                    tagname();

            	                    state._fsp--;


            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:50: ( equal vertexInline )
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:51: equal vertexInline
            	                    {
            	                    pushFollow(FOLLOW_equal_in_lineRule769);
            	                    equal();

            	                    state._fsp--;


            	                    pushFollow(FOLLOW_vertexInline_in_lineRule771);
            	                    vertexInline();

            	                    state._fsp--;


            	                    }


            	                    }
            	                    break;

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:73: ( vTextureInline )
            	            {
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:73: ( vTextureInline )
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:74: vTextureInline
            	            {
            	            pushFollow(FOLLOW_vTextureInline_in_lineRule777);
            	            vTextureInline();

            	            state._fsp--;


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            match(input,RB,FOLLOW_RB_in_lineRule810); 

            match(input,SC,FOLLOW_SC_in_lineRule812); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:1: faceRule : FACE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( ( tagname ( equal vertexInline ) )? | vTextureInline ) )? ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( ( tagname ( equal vTextureInline ) )? | vTextureInline ) )? ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )? )* RB SC ;
    public final void faceRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:10: ( FACE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( ( tagname ( equal vertexInline ) )? | vTextureInline ) )? ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( ( tagname ( equal vTextureInline ) )? | vTextureInline ) )? ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )? )* RB SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:12: FACE ( assignTag )? LB ( ( tagname | vertexInline ) ( DEFTEX ( ( tagname ( equal vertexInline ) )? | vTextureInline ) )? ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )? ) ( COMMA ( tagname | vertexInline ) ( DEFTEX ( ( tagname ( equal vTextureInline ) )? | vTextureInline ) )? ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )? )* RB SC
            {
            match(input,FACE,FOLLOW_FACE_in_faceRule833); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:17: ( assignTag )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:17: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_faceRule835);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,LB,FOLLOW_LB_in_faceRule838); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:31: ( ( tagname | vertexInline ) ( DEFTEX ( ( tagname ( equal vertexInline ) )? | vTextureInline ) )? ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )? )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:32: ( tagname | vertexInline ) ( DEFTEX ( ( tagname ( equal vertexInline ) )? | vTextureInline ) )? ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )?
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:32: ( tagname | vertexInline )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==FLOAT||LA26_0==INT) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:33: tagname
                    {
                    pushFollow(FOLLOW_tagname_in_faceRule842);
                    tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:105:41: vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_faceRule844);
                    vertexInline();

                    state._fsp--;


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:33: ( DEFTEX ( ( tagname ( equal vertexInline ) )? | vTextureInline ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==DEFTEX) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:34: DEFTEX ( ( tagname ( equal vertexInline ) )? | vTextureInline )
                    {
                    match(input,DEFTEX,FOLLOW_DEFTEX_in_faceRule881); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:41: ( ( tagname ( equal vertexInline ) )? | vTextureInline )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0 >= COMMA && LA28_0 <= DEFNORM)||LA28_0==ID||LA28_0==RB) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==FLOAT||LA28_0==INT) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;

                    }
                    switch (alt28) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:42: ( tagname ( equal vertexInline ) )?
                            {
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:42: ( tagname ( equal vertexInline ) )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==ID) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:43: tagname ( equal vertexInline )
                                    {
                                    pushFollow(FOLLOW_tagname_in_faceRule885);
                                    tagname();

                                    state._fsp--;


                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:51: ( equal vertexInline )
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:52: equal vertexInline
                                    {
                                    pushFollow(FOLLOW_equal_in_faceRule888);
                                    equal();

                                    state._fsp--;


                                    pushFollow(FOLLOW_vertexInline_in_faceRule890);
                                    vertexInline();

                                    state._fsp--;


                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:74: vTextureInline
                            {
                            pushFollow(FOLLOW_vTextureInline_in_faceRule895);
                            vTextureInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:33: ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==DEFNORM) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:34: DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline )
                    {
                    match(input,DEFNORM,FOLLOW_DEFNORM_in_faceRule934); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:42: ( ( tagname ( equal vNormalInline ) )? | vNormalInline )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==COMMA||LA31_0==ID||LA31_0==RB) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==FLOAT||LA31_0==INT) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;

                    }
                    switch (alt31) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:43: ( tagname ( equal vNormalInline ) )?
                            {
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:43: ( tagname ( equal vNormalInline ) )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==ID) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:44: tagname ( equal vNormalInline )
                                    {
                                    pushFollow(FOLLOW_tagname_in_faceRule938);
                                    tagname();

                                    state._fsp--;


                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:52: ( equal vNormalInline )
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:53: equal vNormalInline
                                    {
                                    pushFollow(FOLLOW_equal_in_faceRule941);
                                    equal();

                                    state._fsp--;


                                    pushFollow(FOLLOW_vNormalInline_in_faceRule943);
                                    vNormalInline();

                                    state._fsp--;


                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:107:76: vNormalInline
                            {
                            pushFollow(FOLLOW_vNormalInline_in_faceRule948);
                            vNormalInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:29: ( COMMA ( tagname | vertexInline ) ( DEFTEX ( ( tagname ( equal vTextureInline ) )? | vTextureInline ) )? ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )? )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:30: COMMA ( tagname | vertexInline ) ( DEFTEX ( ( tagname ( equal vTextureInline ) )? | vTextureInline ) )? ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_faceRule1014); 

            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:36: ( tagname | vertexInline )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==ID) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==FLOAT||LA33_0==INT) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:37: tagname
            	            {
            	            pushFollow(FOLLOW_tagname_in_faceRule1017);
            	            tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:45: vertexInline
            	            {
            	            pushFollow(FOLLOW_vertexInline_in_faceRule1019);
            	            vertexInline();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:33: ( DEFTEX ( ( tagname ( equal vTextureInline ) )? | vTextureInline ) )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==DEFTEX) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:34: DEFTEX ( ( tagname ( equal vTextureInline ) )? | vTextureInline )
            	            {
            	            match(input,DEFTEX,FOLLOW_DEFTEX_in_faceRule1056); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:41: ( ( tagname ( equal vTextureInline ) )? | vTextureInline )
            	            int alt35=2;
            	            int LA35_0 = input.LA(1);

            	            if ( ((LA35_0 >= COMMA && LA35_0 <= DEFNORM)||LA35_0==ID||LA35_0==RB) ) {
            	                alt35=1;
            	            }
            	            else if ( (LA35_0==FLOAT||LA35_0==INT) ) {
            	                alt35=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 35, 0, input);

            	                throw nvae;

            	            }
            	            switch (alt35) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:42: ( tagname ( equal vTextureInline ) )?
            	                    {
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:42: ( tagname ( equal vTextureInline ) )?
            	                    int alt34=2;
            	                    int LA34_0 = input.LA(1);

            	                    if ( (LA34_0==ID) ) {
            	                        alt34=1;
            	                    }
            	                    switch (alt34) {
            	                        case 1 :
            	                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:43: tagname ( equal vTextureInline )
            	                            {
            	                            pushFollow(FOLLOW_tagname_in_faceRule1060);
            	                            tagname();

            	                            state._fsp--;


            	                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:51: ( equal vTextureInline )
            	                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:52: equal vTextureInline
            	                            {
            	                            pushFollow(FOLLOW_equal_in_faceRule1063);
            	                            equal();

            	                            state._fsp--;


            	                            pushFollow(FOLLOW_vTextureInline_in_faceRule1065);
            	                            vTextureInline();

            	                            state._fsp--;


            	                            }


            	                            }
            	                            break;

            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:76: vTextureInline
            	                    {
            	                    pushFollow(FOLLOW_vTextureInline_in_faceRule1070);
            	                    vTextureInline();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:33: ( DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline ) )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==DEFNORM) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:34: DEFNORM ( ( tagname ( equal vNormalInline ) )? | vNormalInline )
            	            {
            	            match(input,DEFNORM,FOLLOW_DEFNORM_in_faceRule1108); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:42: ( ( tagname ( equal vNormalInline ) )? | vNormalInline )
            	            int alt38=2;
            	            int LA38_0 = input.LA(1);

            	            if ( (LA38_0==COMMA||LA38_0==ID||LA38_0==RB) ) {
            	                alt38=1;
            	            }
            	            else if ( (LA38_0==FLOAT||LA38_0==INT) ) {
            	                alt38=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 38, 0, input);

            	                throw nvae;

            	            }
            	            switch (alt38) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:43: ( tagname ( equal vNormalInline ) )?
            	                    {
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:43: ( tagname ( equal vNormalInline ) )?
            	                    int alt37=2;
            	                    int LA37_0 = input.LA(1);

            	                    if ( (LA37_0==ID) ) {
            	                        alt37=1;
            	                    }
            	                    switch (alt37) {
            	                        case 1 :
            	                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:44: tagname ( equal vNormalInline )
            	                            {
            	                            pushFollow(FOLLOW_tagname_in_faceRule1112);
            	                            tagname();

            	                            state._fsp--;


            	                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:52: ( equal vNormalInline )
            	                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:53: equal vNormalInline
            	                            {
            	                            pushFollow(FOLLOW_equal_in_faceRule1115);
            	                            equal();

            	                            state._fsp--;


            	                            pushFollow(FOLLOW_vNormalInline_in_faceRule1117);
            	                            vNormalInline();

            	                            state._fsp--;


            	                            }


            	                            }
            	                            break;

            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:76: vNormalInline
            	                    {
            	                    pushFollow(FOLLOW_vNormalInline_in_faceRule1122);
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
            	    break loop40;
                }
            } while (true);


            match(input,RB,FOLLOW_RB_in_faceRule1155); 

            match(input,SC,FOLLOW_SC_in_faceRule1157); 

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
    public static final BitSet FOLLOW_vDef_in_vertexInline377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTEXSET_in_vertexSetRule384 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_assignTag_in_vertexSetRule386 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_setDef_in_vertexSetRule388 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_vertexSetRule390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VTEXTURE_in_vTextureRule399 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_multipleDef_in_vTextureRule402 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_singleDef_in_vTextureRule404 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_vTextureRule406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vDef_in_vTextureInline413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTURESET_in_textureSetRule421 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_assignTag_in_textureSetRule423 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_setDef_in_textureSetRule425 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_textureSetRule427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VNORMAL_in_vNormalRule436 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_multipleDef_in_vNormalRule439 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_singleDef_in_vNormalRule441 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_vNormalRule443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vDef_in_vNormalInline450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMALSET_in_normalSetRule458 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_assignTag_in_normalSetRule460 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_setDef_in_normalSetRule462 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_normalSetRule464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointRule_in_graphElement493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineRule_in_graphElement512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_faceRule_in_graphElement531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_pointRule543 = new BitSet(new long[]{0x000000000000E800L});
    public static final BitSet FOLLOW_singlePointDef_in_pointRule546 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_multiplePointDef_in_pointRule548 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_pointRule551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tagname_in_singlePointDef560 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_equal_in_singlePointDef563 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_tagname_in_singlePointDef566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexInline_in_singlePointDef568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexInline_in_singlePointDef575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LB_in_multiplePointDef583 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_singlePointDef_in_multiplePointDef586 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_COMMA_in_multiplePointDef609 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_singlePointDef_in_multiplePointDef611 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_RB_in_multiplePointDef615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_lineRule624 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_assignTag_in_lineRule626 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LB_in_lineRule629 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_tagname_in_lineRule633 = new BitSet(new long[]{0x0000000000004940L});
    public static final BitSet FOLLOW_vertexInline_in_lineRule635 = new BitSet(new long[]{0x0000000000004940L});
    public static final BitSet FOLLOW_DEFTEX_in_lineRule672 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_tagname_in_lineRule675 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_equal_in_lineRule678 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vertexInline_in_lineRule680 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_vTextureInline_in_lineRule686 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_lineRule721 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_tagname_in_lineRule724 = new BitSet(new long[]{0x0000000000104940L});
    public static final BitSet FOLLOW_vertexInline_in_lineRule726 = new BitSet(new long[]{0x0000000000104940L});
    public static final BitSet FOLLOW_DEFTEX_in_lineRule763 = new BitSet(new long[]{0x0000000000102040L});
    public static final BitSet FOLLOW_tagname_in_lineRule766 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_equal_in_lineRule769 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vertexInline_in_lineRule771 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_vTextureInline_in_lineRule777 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_RB_in_lineRule810 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_lineRule812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FACE_in_faceRule833 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_assignTag_in_faceRule835 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LB_in_faceRule838 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_tagname_in_faceRule842 = new BitSet(new long[]{0x00000000001001C0L});
    public static final BitSet FOLLOW_vertexInline_in_faceRule844 = new BitSet(new long[]{0x00000000001001C0L});
    public static final BitSet FOLLOW_DEFTEX_in_faceRule881 = new BitSet(new long[]{0x00000000001068C0L});
    public static final BitSet FOLLOW_tagname_in_faceRule885 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_equal_in_faceRule888 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vertexInline_in_faceRule890 = new BitSet(new long[]{0x00000000001000C0L});
    public static final BitSet FOLLOW_vTextureInline_in_faceRule895 = new BitSet(new long[]{0x00000000001000C0L});
    public static final BitSet FOLLOW_DEFNORM_in_faceRule934 = new BitSet(new long[]{0x0000000000106840L});
    public static final BitSet FOLLOW_tagname_in_faceRule938 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_equal_in_faceRule941 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vNormalInline_in_faceRule943 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_vNormalInline_in_faceRule948 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_COMMA_in_faceRule1014 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_tagname_in_faceRule1017 = new BitSet(new long[]{0x00000000001001C0L});
    public static final BitSet FOLLOW_vertexInline_in_faceRule1019 = new BitSet(new long[]{0x00000000001001C0L});
    public static final BitSet FOLLOW_DEFTEX_in_faceRule1056 = new BitSet(new long[]{0x00000000001068C0L});
    public static final BitSet FOLLOW_tagname_in_faceRule1060 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_equal_in_faceRule1063 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vTextureInline_in_faceRule1065 = new BitSet(new long[]{0x00000000001000C0L});
    public static final BitSet FOLLOW_vTextureInline_in_faceRule1070 = new BitSet(new long[]{0x00000000001000C0L});
    public static final BitSet FOLLOW_DEFNORM_in_faceRule1108 = new BitSet(new long[]{0x0000000000106840L});
    public static final BitSet FOLLOW_tagname_in_faceRule1112 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_equal_in_faceRule1115 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vNormalInline_in_faceRule1117 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_vNormalInline_in_faceRule1122 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_RB_in_faceRule1155 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SC_in_faceRule1157 = new BitSet(new long[]{0x0000000000000002L});

}