// $ANTLR 3.4 C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g 2014-02-18 19:15:35

  package JavaPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class grammaticaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "BOX", "CM", "COMMA", "DEFNORM", "DEFTEX", "EQ", "ERROR", "FACE", "FLOAT", "GROUP", "ID", "INT", "LB", "LINE", "NORMALSET", "POINT", "RB", "ROTATE", "SC", "SCALE", "SMOOTHING", "TEXTURESET", "TRASLATE", "VERTEX", "VERTEXSET", "VNORMAL", "VTEXTURE", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BOX=5;
    public static final int CM=6;
    public static final int COMMA=7;
    public static final int DEFNORM=8;
    public static final int DEFTEX=9;
    public static final int EQ=10;
    public static final int ERROR=11;
    public static final int FACE=12;
    public static final int FLOAT=13;
    public static final int GROUP=14;
    public static final int ID=15;
    public static final int INT=16;
    public static final int LB=17;
    public static final int LINE=18;
    public static final int NORMALSET=19;
    public static final int POINT=20;
    public static final int RB=21;
    public static final int ROTATE=22;
    public static final int SC=23;
    public static final int SCALE=24;
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
    public String getGrammarFileName() { return "C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g"; }





    // $ANTLR start "start"
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:25:1: start : ( vertexInfo | graphElement ) ;
    public final void start() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:25:7: ( ( vertexInfo | graphElement ) )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:25:9: ( vertexInfo | graphElement )
            {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:25:9: ( vertexInfo | graphElement )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==NORMALSET||LA1_0==TEXTURESET||(LA1_0 >= VERTEX && LA1_0 <= VTEXTURE)) ) {
                alt1=1;
            }
            else if ( (LA1_0==FACE||LA1_0==LINE||LA1_0==POINT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:26:11: vertexInfo
                    {
                    pushFollow(FOLLOW_vertexInfo_in_start75);
                    vertexInfo();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:27:11: graphElement
                    {
                    pushFollow(FOLLOW_graphElement_in_start87);
                    graphElement();

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
    // $ANTLR end "start"



    // $ANTLR start "assignTag"
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:36:1: assignTag : ( tagname equal ) ;
    public final void assignTag() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:36:11: ( ( tagname equal ) )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:36:13: ( tagname equal )
            {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:36:13: ( tagname equal )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:36:14: tagname equal
            {
            pushFollow(FOLLOW_tagname_in_assignTag103);
            tagname();

            state._fsp--;


            pushFollow(FOLLOW_equal_in_assignTag105);
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:37:1: equal : EQ ;
    public final void equal() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:37:7: ( EQ )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:37:9: EQ
            {
            match(input,EQ,FOLLOW_EQ_in_equal113); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:38:1: tagname : ID ;
    public final void tagname() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:38:9: ( ID )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:38:11: ID
            {
            match(input,ID,FOLLOW_ID_in_tagname120); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:39:1: vDef : ( num num num ) ;
    public final void vDef() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:39:6: ( ( num num num ) )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:39:8: ( num num num )
            {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:39:8: ( num num num )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:39:9: num num num
            {
            pushFollow(FOLLOW_num_in_vDef128);
            num();

            state._fsp--;


            pushFollow(FOLLOW_num_in_vDef130);
            num();

            state._fsp--;


            pushFollow(FOLLOW_num_in_vDef132);
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:40:1: num : ( INT | FLOAT ) ;
    public final void num() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:40:5: ( ( INT | FLOAT ) )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:45:1: vertexInfo : ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule ) ;
    public final void vertexInfo() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:45:12: ( ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule ) )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:45:14: ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule )
            {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:45:14: ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule )
            int alt2=6;
            switch ( input.LA(1) ) {
            case VERTEX:
                {
                alt2=1;
                }
                break;
            case VERTEXSET:
                {
                alt2=2;
                }
                break;
            case VTEXTURE:
                {
                alt2=3;
                }
                break;
            case TEXTURESET:
                {
                alt2=4;
                }
                break;
            case VNORMAL:
                {
                alt2=5;
                }
                break;
            case NORMALSET:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:46:16: vertexRule
                    {
                    pushFollow(FOLLOW_vertexRule_in_vertexInfo171);
                    vertexRule();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:47:16: vertexSetRule
                    {
                    pushFollow(FOLLOW_vertexSetRule_in_vertexInfo188);
                    vertexSetRule();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:48:16: vTextureRule
                    {
                    pushFollow(FOLLOW_vTextureRule_in_vertexInfo205);
                    vTextureRule();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:49:16: textureSetRule
                    {
                    pushFollow(FOLLOW_textureSetRule_in_vertexInfo222);
                    textureSetRule();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:50:16: vNormalRule
                    {
                    pushFollow(FOLLOW_vNormalRule_in_vertexInfo239);
                    vNormalRule();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:51:16: normalSetRule
                    {
                    pushFollow(FOLLOW_normalSetRule_in_vertexInfo256);
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:56:1: singleDef : assignTag vDef ;
    public final void singleDef() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:56:11: ( assignTag vDef )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:56:13: assignTag vDef
            {
            pushFollow(FOLLOW_assignTag_in_singleDef268);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_vDef_in_singleDef270);
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:57:1: multipleDef : LB ( assignTag vDef ) ( COMMA assignTag vDef )* RB ;
    public final void multipleDef() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:57:13: ( LB ( assignTag vDef ) ( COMMA assignTag vDef )* RB )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:57:15: LB ( assignTag vDef ) ( COMMA assignTag vDef )* RB
            {
            match(input,LB,FOLLOW_LB_in_multipleDef277); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:57:18: ( assignTag vDef )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:57:19: assignTag vDef
            {
            pushFollow(FOLLOW_assignTag_in_multipleDef280);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_vDef_in_multipleDef282);
            vDef();

            state._fsp--;


            }


            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:57:35: ( COMMA assignTag vDef )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:57:36: COMMA assignTag vDef
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multipleDef286); 

            	    pushFollow(FOLLOW_assignTag_in_multipleDef288);
            	    assignTag();

            	    state._fsp--;


            	    pushFollow(FOLLOW_vDef_in_multipleDef290);
            	    vDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,RB,FOLLOW_RB_in_multipleDef294); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:60:1: setDef : LB ( tagname ( equal vDef )? ) ( COMMA tagname ( equal vDef )? )* RB ;
    public final void setDef() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:60:8: ( LB ( tagname ( equal vDef )? ) ( COMMA tagname ( equal vDef )? )* RB )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:60:10: LB ( tagname ( equal vDef )? ) ( COMMA tagname ( equal vDef )? )* RB
            {
            match(input,LB,FOLLOW_LB_in_setDef303); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:60:13: ( tagname ( equal vDef )? )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:60:14: tagname ( equal vDef )?
            {
            pushFollow(FOLLOW_tagname_in_setDef306);
            tagname();

            state._fsp--;


            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:60:21: ( equal vDef )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EQ) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:60:22: equal vDef
                    {
                    pushFollow(FOLLOW_equal_in_setDef308);
                    equal();

                    state._fsp--;


                    pushFollow(FOLLOW_vDef_in_setDef310);
                    vDef();

                    state._fsp--;


                    }
                    break;

            }


            }


            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:60:36: ( COMMA tagname ( equal vDef )? )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:60:37: COMMA tagname ( equal vDef )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_setDef316); 

            	    pushFollow(FOLLOW_tagname_in_setDef318);
            	    tagname();

            	    state._fsp--;


            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:60:50: ( equal vDef )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==EQ) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:60:51: equal vDef
            	            {
            	            pushFollow(FOLLOW_equal_in_setDef320);
            	            equal();

            	            state._fsp--;


            	            pushFollow(FOLLOW_vDef_in_setDef322);
            	            vDef();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,RB,FOLLOW_RB_in_setDef328); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:63:1: vertexRule : VERTEX ( multipleDef | singleDef ) SC ;
    public final void vertexRule() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:63:12: ( VERTEX ( multipleDef | singleDef ) SC )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:63:14: VERTEX ( multipleDef | singleDef ) SC
            {
            match(input,VERTEX,FOLLOW_VERTEX_in_vertexRule337); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:63:21: ( multipleDef | singleDef )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LB) ) {
                alt7=1;
            }
            else if ( (LA7_0==ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:63:22: multipleDef
                    {
                    pushFollow(FOLLOW_multipleDef_in_vertexRule340);
                    multipleDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:63:34: singleDef
                    {
                    pushFollow(FOLLOW_singleDef_in_vertexRule342);
                    singleDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_vertexRule344); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:64:1: vertexInline : VERTEX ( assignTag )? vDef ;
    public final void vertexInline() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:64:14: ( VERTEX ( assignTag )? vDef )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:64:16: VERTEX ( assignTag )? vDef
            {
            match(input,VERTEX,FOLLOW_VERTEX_in_vertexInline351); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:64:23: ( assignTag )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:64:23: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_vertexInline353);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_vDef_in_vertexInline356);
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:65:1: vertexSetRule : VERTEXSET assignTag setDef SC ;
    public final void vertexSetRule() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:65:15: ( VERTEXSET assignTag setDef SC )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:65:17: VERTEXSET assignTag setDef SC
            {
            match(input,VERTEXSET,FOLLOW_VERTEXSET_in_vertexSetRule364); 

            pushFollow(FOLLOW_assignTag_in_vertexSetRule366);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_vertexSetRule368);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_vertexSetRule370); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:68:1: vTextureRule : VTEXTURE ( multipleDef | singleDef ) SC ;
    public final void vTextureRule() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:68:14: ( VTEXTURE ( multipleDef | singleDef ) SC )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:68:16: VTEXTURE ( multipleDef | singleDef ) SC
            {
            match(input,VTEXTURE,FOLLOW_VTEXTURE_in_vTextureRule379); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:68:25: ( multipleDef | singleDef )
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
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:68:26: multipleDef
                    {
                    pushFollow(FOLLOW_multipleDef_in_vTextureRule382);
                    multipleDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:68:38: singleDef
                    {
                    pushFollow(FOLLOW_singleDef_in_vTextureRule384);
                    singleDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_vTextureRule386); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:69:1: vTextureInline : VTEXTURE ( assignTag )? vDef ;
    public final void vTextureInline() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:69:16: ( VTEXTURE ( assignTag )? vDef )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:69:18: VTEXTURE ( assignTag )? vDef
            {
            match(input,VTEXTURE,FOLLOW_VTEXTURE_in_vTextureInline393); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:69:27: ( assignTag )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:69:27: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_vTextureInline395);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_vDef_in_vTextureInline398);
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:70:1: textureSetRule : TEXTURESET assignTag setDef SC ;
    public final void textureSetRule() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:70:16: ( TEXTURESET assignTag setDef SC )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:70:18: TEXTURESET assignTag setDef SC
            {
            match(input,TEXTURESET,FOLLOW_TEXTURESET_in_textureSetRule406); 

            pushFollow(FOLLOW_assignTag_in_textureSetRule408);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_textureSetRule410);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_textureSetRule412); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:73:1: vNormalRule : VNORMAL ( multipleDef | singleDef ) SC ;
    public final void vNormalRule() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:73:13: ( VNORMAL ( multipleDef | singleDef ) SC )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:73:15: VNORMAL ( multipleDef | singleDef ) SC
            {
            match(input,VNORMAL,FOLLOW_VNORMAL_in_vNormalRule421); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:73:23: ( multipleDef | singleDef )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LB) ) {
                alt11=1;
            }
            else if ( (LA11_0==ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:73:24: multipleDef
                    {
                    pushFollow(FOLLOW_multipleDef_in_vNormalRule424);
                    multipleDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:73:36: singleDef
                    {
                    pushFollow(FOLLOW_singleDef_in_vNormalRule426);
                    singleDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_vNormalRule428); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:74:1: vNormalInline : VNORMAL ( assignTag )? vDef ;
    public final void vNormalInline() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:74:15: ( VNORMAL ( assignTag )? vDef )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:74:17: VNORMAL ( assignTag )? vDef
            {
            match(input,VNORMAL,FOLLOW_VNORMAL_in_vNormalInline435); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:74:25: ( assignTag )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:74:25: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_vNormalInline437);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_vDef_in_vNormalInline440);
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:75:1: normalSetRule : NORMALSET assignTag setDef SC ;
    public final void normalSetRule() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:75:15: ( NORMALSET assignTag setDef SC )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:75:17: NORMALSET assignTag setDef SC
            {
            match(input,NORMALSET,FOLLOW_NORMALSET_in_normalSetRule448); 

            pushFollow(FOLLOW_assignTag_in_normalSetRule450);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_normalSetRule452);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_normalSetRule454); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:80:1: graphElement : ( pointRule | lineRule | faceRule ) ;
    public final void graphElement() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:80:14: ( ( pointRule | lineRule | faceRule ) )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:80:16: ( pointRule | lineRule | faceRule )
            {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:80:16: ( pointRule | lineRule | faceRule )
            int alt13=3;
            switch ( input.LA(1) ) {
            case POINT:
                {
                alt13=1;
                }
                break;
            case LINE:
                {
                alt13=2;
                }
                break;
            case FACE:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:81:18: pointRule
                    {
                    pushFollow(FOLLOW_pointRule_in_graphElement483);
                    pointRule();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:82:18: lineRule
                    {
                    pushFollow(FOLLOW_lineRule_in_graphElement502);
                    lineRule();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:83:18: faceRule
                    {
                    pushFollow(FOLLOW_faceRule_in_graphElement521);
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:87:1: pointRule : POINT ( singlePointDef | multiplePointDef ) SC ;
    public final void pointRule() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:87:11: ( POINT ( singlePointDef | multiplePointDef ) SC )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:87:13: POINT ( singlePointDef | multiplePointDef ) SC
            {
            match(input,POINT,FOLLOW_POINT_in_pointRule533); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:87:19: ( singlePointDef | multiplePointDef )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID||LA14_0==VERTEX) ) {
                alt14=1;
            }
            else if ( (LA14_0==LB) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:87:20: singlePointDef
                    {
                    pushFollow(FOLLOW_singlePointDef_in_pointRule536);
                    singlePointDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:87:35: multiplePointDef
                    {
                    pushFollow(FOLLOW_multiplePointDef_in_pointRule538);
                    multiplePointDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_pointRule541); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:1: singlePointDef : ( ( tagname ( equal ( tagname | vertexInline ) )? ) | ( vertexInline ) );
    public final void singlePointDef() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:16: ( ( tagname ( equal ( tagname | vertexInline ) )? ) | ( vertexInline ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==VERTEX) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:18: ( tagname ( equal ( tagname | vertexInline ) )? )
                    {
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:18: ( tagname ( equal ( tagname | vertexInline ) )? )
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:19: tagname ( equal ( tagname | vertexInline ) )?
                    {
                    pushFollow(FOLLOW_tagname_in_singlePointDef549);
                    tagname();

                    state._fsp--;


                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:27: ( equal ( tagname | vertexInline ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==EQ) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:28: equal ( tagname | vertexInline )
                            {
                            pushFollow(FOLLOW_equal_in_singlePointDef552);
                            equal();

                            state._fsp--;


                            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:34: ( tagname | vertexInline )
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==ID) ) {
                                alt15=1;
                            }
                            else if ( (LA15_0==VERTEX) ) {
                                alt15=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 0, input);

                                throw nvae;

                            }
                            switch (alt15) {
                                case 1 :
                                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:35: tagname
                                    {
                                    pushFollow(FOLLOW_tagname_in_singlePointDef555);
                                    tagname();

                                    state._fsp--;


                                    }
                                    break;
                                case 2 :
                                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:43: vertexInline
                                    {
                                    pushFollow(FOLLOW_vertexInline_in_singlePointDef557);
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
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:60: ( vertexInline )
                    {
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:60: ( vertexInline )
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:88:61: vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_singlePointDef564);
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:89:1: multiplePointDef : LB ( singlePointDef ) ( COMMA singlePointDef )* RB ;
    public final void multiplePointDef() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:89:18: ( LB ( singlePointDef ) ( COMMA singlePointDef )* RB )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:89:20: LB ( singlePointDef ) ( COMMA singlePointDef )* RB
            {
            match(input,LB,FOLLOW_LB_in_multiplePointDef572); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:89:23: ( singlePointDef )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:89:24: singlePointDef
            {
            pushFollow(FOLLOW_singlePointDef_in_multiplePointDef575);
            singlePointDef();

            state._fsp--;


            }


            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:90:20: ( COMMA singlePointDef )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:90:21: COMMA singlePointDef
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplePointDef598); 

            	    pushFollow(FOLLOW_singlePointDef_in_multiplePointDef600);
            	    singlePointDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match(input,RB,FOLLOW_RB_in_multiplePointDef604); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:93:1: lineRule : LINE ( assignTag )? LB ( tagname | vertexInline ( DEFTEX tagname | vTextureInline )? ) ( COMMA tagname | vertexInline ( DEFTEX tagname | vTextureInline )? )+ RB SC ;
    public final void lineRule() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:93:10: ( LINE ( assignTag )? LB ( tagname | vertexInline ( DEFTEX tagname | vTextureInline )? ) ( COMMA tagname | vertexInline ( DEFTEX tagname | vTextureInline )? )+ RB SC )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:93:12: LINE ( assignTag )? LB ( tagname | vertexInline ( DEFTEX tagname | vTextureInline )? ) ( COMMA tagname | vertexInline ( DEFTEX tagname | vTextureInline )? )+ RB SC
            {
            match(input,LINE,FOLLOW_LINE_in_lineRule613); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:93:17: ( assignTag )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:93:17: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_lineRule615);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,LB,FOLLOW_LB_in_lineRule618); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:93:31: ( tagname | vertexInline ( DEFTEX tagname | vTextureInline )? )
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
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:93:32: tagname
                    {
                    pushFollow(FOLLOW_tagname_in_lineRule621);
                    tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:93:40: vertexInline ( DEFTEX tagname | vTextureInline )?
                    {
                    pushFollow(FOLLOW_vertexInline_in_lineRule623);
                    vertexInline();

                    state._fsp--;


                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:94:33: ( DEFTEX tagname | vTextureInline )?
                    int alt20=3;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==DEFTEX) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==VTEXTURE) ) {
                        alt20=2;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:94:34: DEFTEX tagname
                            {
                            match(input,DEFTEX,FOLLOW_DEFTEX_in_lineRule659); 

                            pushFollow(FOLLOW_tagname_in_lineRule661);
                            tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:94:49: vTextureInline
                            {
                            pushFollow(FOLLOW_vTextureInline_in_lineRule663);
                            vTextureInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:95:29: ( COMMA tagname | vertexInline ( DEFTEX tagname | vTextureInline )? )+
            int cnt23=0;
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }
                else if ( (LA23_0==VERTEX) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:95:30: COMMA tagname
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_lineRule697); 

            	    pushFollow(FOLLOW_tagname_in_lineRule699);
            	    tagname();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:95:44: vertexInline ( DEFTEX tagname | vTextureInline )?
            	    {
            	    pushFollow(FOLLOW_vertexInline_in_lineRule701);
            	    vertexInline();

            	    state._fsp--;


            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:96:33: ( DEFTEX tagname | vTextureInline )?
            	    int alt22=3;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==DEFTEX) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==VTEXTURE) ) {
            	        alt22=2;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:96:34: DEFTEX tagname
            	            {
            	            match(input,DEFTEX,FOLLOW_DEFTEX_in_lineRule737); 

            	            pushFollow(FOLLOW_tagname_in_lineRule739);
            	            tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:96:49: vTextureInline
            	            {
            	            pushFollow(FOLLOW_vTextureInline_in_lineRule741);
            	            vTextureInline();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            match(input,RB,FOLLOW_RB_in_lineRule773); 

            match(input,SC,FOLLOW_SC_in_lineRule775); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:100:1: faceRule : FACE ( assignTag )? LB ( tagname | vertexInline ( DEFTEX tagname | vTextureInline )? ( DEFNORM tagname | vNormalInline )? ) ( COMMA tagname | vertexInline ( DEFTEX tagname | vTextureInline )? ( DEFNORM tagname | vNormalInline )? )* RB SC ;
    public final void faceRule() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:100:10: ( FACE ( assignTag )? LB ( tagname | vertexInline ( DEFTEX tagname | vTextureInline )? ( DEFNORM tagname | vNormalInline )? ) ( COMMA tagname | vertexInline ( DEFTEX tagname | vTextureInline )? ( DEFNORM tagname | vNormalInline )? )* RB SC )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:100:12: FACE ( assignTag )? LB ( tagname | vertexInline ( DEFTEX tagname | vTextureInline )? ( DEFNORM tagname | vNormalInline )? ) ( COMMA tagname | vertexInline ( DEFTEX tagname | vTextureInline )? ( DEFNORM tagname | vNormalInline )? )* RB SC
            {
            match(input,FACE,FOLLOW_FACE_in_faceRule796); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:100:17: ( assignTag )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:100:17: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_faceRule798);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,LB,FOLLOW_LB_in_faceRule801); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:100:31: ( tagname | vertexInline ( DEFTEX tagname | vTextureInline )? ( DEFNORM tagname | vNormalInline )? )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==VERTEX) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:100:32: tagname
                    {
                    pushFollow(FOLLOW_tagname_in_faceRule804);
                    tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:100:40: vertexInline ( DEFTEX tagname | vTextureInline )? ( DEFNORM tagname | vNormalInline )?
                    {
                    pushFollow(FOLLOW_vertexInline_in_faceRule806);
                    vertexInline();

                    state._fsp--;


                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:101:33: ( DEFTEX tagname | vTextureInline )?
                    int alt25=3;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==DEFTEX) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==VTEXTURE) ) {
                        alt25=2;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:101:34: DEFTEX tagname
                            {
                            match(input,DEFTEX,FOLLOW_DEFTEX_in_faceRule842); 

                            pushFollow(FOLLOW_tagname_in_faceRule844);
                            tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:101:49: vTextureInline
                            {
                            pushFollow(FOLLOW_vTextureInline_in_faceRule846);
                            vTextureInline();

                            state._fsp--;


                            }
                            break;

                    }


                    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:102:33: ( DEFNORM tagname | vNormalInline )?
                    int alt26=3;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==DEFNORM) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==VNORMAL) ) {
                        alt26=2;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:102:34: DEFNORM tagname
                            {
                            match(input,DEFNORM,FOLLOW_DEFNORM_in_faceRule884); 

                            pushFollow(FOLLOW_tagname_in_faceRule886);
                            tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:102:50: vNormalInline
                            {
                            pushFollow(FOLLOW_vNormalInline_in_faceRule888);
                            vNormalInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:104:29: ( COMMA tagname | vertexInline ( DEFTEX tagname | vTextureInline )? ( DEFNORM tagname | vNormalInline )? )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==COMMA) ) {
                    alt30=1;
                }
                else if ( (LA30_0==VERTEX) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:104:30: COMMA tagname
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_faceRule953); 

            	    pushFollow(FOLLOW_tagname_in_faceRule955);
            	    tagname();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:104:44: vertexInline ( DEFTEX tagname | vTextureInline )? ( DEFNORM tagname | vNormalInline )?
            	    {
            	    pushFollow(FOLLOW_vertexInline_in_faceRule957);
            	    vertexInline();

            	    state._fsp--;


            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:105:33: ( DEFTEX tagname | vTextureInline )?
            	    int alt28=3;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==DEFTEX) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==VTEXTURE) ) {
            	        alt28=2;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:105:34: DEFTEX tagname
            	            {
            	            match(input,DEFTEX,FOLLOW_DEFTEX_in_faceRule993); 

            	            pushFollow(FOLLOW_tagname_in_faceRule995);
            	            tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:105:49: vTextureInline
            	            {
            	            pushFollow(FOLLOW_vTextureInline_in_faceRule997);
            	            vTextureInline();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:106:33: ( DEFNORM tagname | vNormalInline )?
            	    int alt29=3;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==DEFNORM) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==VNORMAL) ) {
            	        alt29=2;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:106:34: DEFNORM tagname
            	            {
            	            match(input,DEFNORM,FOLLOW_DEFNORM_in_faceRule1034); 

            	            pushFollow(FOLLOW_tagname_in_faceRule1036);
            	            tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:106:50: vNormalInline
            	            {
            	            pushFollow(FOLLOW_vNormalInline_in_faceRule1038);
            	            vNormalInline();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            match(input,RB,FOLLOW_RB_in_faceRule1070); 

            match(input,SC,FOLLOW_SC_in_faceRule1072); 

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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:112:1: primitive : () ;
    public final void primitive() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:112:11: ( () )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:112:13: ()
            {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:112:13: ()
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:114:13: 
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:119:1: grouping : () ;
    public final void grouping() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:119:10: ( () )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:119:12: ()
            {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:119:12: ()
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:122:12: 
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
    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:136:1: functional : () ;
    public final void functional() throws RecognitionException {
        try {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:136:12: ( () )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:136:14: ()
            {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:136:14: ()
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:138:14: 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_vertexInfo_in_start75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphElement_in_start87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tagname_in_assignTag103 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_equal_in_assignTag105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_equal113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_tagname120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_in_vDef128 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_num_in_vDef130 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_num_in_vDef132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexRule_in_vertexInfo171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexSetRule_in_vertexInfo188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vTextureRule_in_vertexInfo205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textureSetRule_in_vertexInfo222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vNormalRule_in_vertexInfo239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalSetRule_in_vertexInfo256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignTag_in_singleDef268 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_vDef_in_singleDef270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LB_in_multipleDef277 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_assignTag_in_multipleDef280 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_vDef_in_multipleDef282 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_COMMA_in_multipleDef286 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_assignTag_in_multipleDef288 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_vDef_in_multipleDef290 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_RB_in_multipleDef294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LB_in_setDef303 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_tagname_in_setDef306 = new BitSet(new long[]{0x0000000000200480L});
    public static final BitSet FOLLOW_equal_in_setDef308 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_vDef_in_setDef310 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_COMMA_in_setDef316 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_tagname_in_setDef318 = new BitSet(new long[]{0x0000000000200480L});
    public static final BitSet FOLLOW_equal_in_setDef320 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_vDef_in_setDef322 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_RB_in_setDef328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTEX_in_vertexRule337 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_multipleDef_in_vertexRule340 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_singleDef_in_vertexRule342 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SC_in_vertexRule344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTEX_in_vertexInline351 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_assignTag_in_vertexInline353 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_vDef_in_vertexInline356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTEXSET_in_vertexSetRule364 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_assignTag_in_vertexSetRule366 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_setDef_in_vertexSetRule368 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SC_in_vertexSetRule370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VTEXTURE_in_vTextureRule379 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_multipleDef_in_vTextureRule382 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_singleDef_in_vTextureRule384 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SC_in_vTextureRule386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VTEXTURE_in_vTextureInline393 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_assignTag_in_vTextureInline395 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_vDef_in_vTextureInline398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTURESET_in_textureSetRule406 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_assignTag_in_textureSetRule408 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_setDef_in_textureSetRule410 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SC_in_textureSetRule412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VNORMAL_in_vNormalRule421 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_multipleDef_in_vNormalRule424 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_singleDef_in_vNormalRule426 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SC_in_vNormalRule428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VNORMAL_in_vNormalInline435 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_assignTag_in_vNormalInline437 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_vDef_in_vNormalInline440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMALSET_in_normalSetRule448 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_assignTag_in_normalSetRule450 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_setDef_in_normalSetRule452 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SC_in_normalSetRule454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointRule_in_graphElement483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineRule_in_graphElement502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_faceRule_in_graphElement521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_pointRule533 = new BitSet(new long[]{0x0000000010028000L});
    public static final BitSet FOLLOW_singlePointDef_in_pointRule536 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_multiplePointDef_in_pointRule538 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SC_in_pointRule541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tagname_in_singlePointDef549 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_equal_in_singlePointDef552 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_tagname_in_singlePointDef555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexInline_in_singlePointDef557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexInline_in_singlePointDef564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LB_in_multiplePointDef572 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_singlePointDef_in_multiplePointDef575 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_COMMA_in_multiplePointDef598 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_singlePointDef_in_multiplePointDef600 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_RB_in_multiplePointDef604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_lineRule613 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_assignTag_in_lineRule615 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LB_in_lineRule618 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_tagname_in_lineRule621 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_vertexInline_in_lineRule623 = new BitSet(new long[]{0x0000000090000280L});
    public static final BitSet FOLLOW_DEFTEX_in_lineRule659 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_tagname_in_lineRule661 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_vTextureInline_in_lineRule663 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_COMMA_in_lineRule697 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_tagname_in_lineRule699 = new BitSet(new long[]{0x0000000010200080L});
    public static final BitSet FOLLOW_vertexInline_in_lineRule701 = new BitSet(new long[]{0x0000000090200280L});
    public static final BitSet FOLLOW_DEFTEX_in_lineRule737 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_tagname_in_lineRule739 = new BitSet(new long[]{0x0000000010200080L});
    public static final BitSet FOLLOW_vTextureInline_in_lineRule741 = new BitSet(new long[]{0x0000000010200080L});
    public static final BitSet FOLLOW_RB_in_lineRule773 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SC_in_lineRule775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FACE_in_faceRule796 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_assignTag_in_faceRule798 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LB_in_faceRule801 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_tagname_in_faceRule804 = new BitSet(new long[]{0x0000000010200080L});
    public static final BitSet FOLLOW_vertexInline_in_faceRule806 = new BitSet(new long[]{0x00000000D0200380L});
    public static final BitSet FOLLOW_DEFTEX_in_faceRule842 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_tagname_in_faceRule844 = new BitSet(new long[]{0x0000000050200180L});
    public static final BitSet FOLLOW_vTextureInline_in_faceRule846 = new BitSet(new long[]{0x0000000050200180L});
    public static final BitSet FOLLOW_DEFNORM_in_faceRule884 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_tagname_in_faceRule886 = new BitSet(new long[]{0x0000000010200080L});
    public static final BitSet FOLLOW_vNormalInline_in_faceRule888 = new BitSet(new long[]{0x0000000010200080L});
    public static final BitSet FOLLOW_COMMA_in_faceRule953 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_tagname_in_faceRule955 = new BitSet(new long[]{0x0000000010200080L});
    public static final BitSet FOLLOW_vertexInline_in_faceRule957 = new BitSet(new long[]{0x00000000D0200380L});
    public static final BitSet FOLLOW_DEFTEX_in_faceRule993 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_tagname_in_faceRule995 = new BitSet(new long[]{0x0000000050200180L});
    public static final BitSet FOLLOW_vTextureInline_in_faceRule997 = new BitSet(new long[]{0x0000000050200180L});
    public static final BitSet FOLLOW_DEFNORM_in_faceRule1034 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_tagname_in_faceRule1036 = new BitSet(new long[]{0x0000000010200080L});
    public static final BitSet FOLLOW_vNormalInline_in_faceRule1038 = new BitSet(new long[]{0x0000000010200080L});
    public static final BitSet FOLLOW_RB_in_faceRule1070 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SC_in_faceRule1072 = new BitSet(new long[]{0x0000000000000002L});

}