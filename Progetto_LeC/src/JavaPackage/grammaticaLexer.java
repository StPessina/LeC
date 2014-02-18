// $ANTLR 3.4 C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g 2014-02-18 19:15:35

  package JavaPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class grammaticaLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public grammaticaLexer() {} 
    public grammaticaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public grammaticaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g"; }

    // $ANTLR start "VERTEX"
    public final void mVERTEX() throws RecognitionException {
        try {
            int _type = VERTEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:146:9: ( 'vertex' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:146:11: 'vertex'
            {
            match("vertex"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VERTEX"

    // $ANTLR start "VERTEXSET"
    public final void mVERTEXSET() throws RecognitionException {
        try {
            int _type = VERTEXSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:147:12: ( 'vertexset' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:147:14: 'vertexset'
            {
            match("vertexset"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VERTEXSET"

    // $ANTLR start "VTEXTURE"
    public final void mVTEXTURE() throws RecognitionException {
        try {
            int _type = VTEXTURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:148:11: ( 'vtexture' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:148:13: 'vtexture'
            {
            match("vtexture"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VTEXTURE"

    // $ANTLR start "TEXTURESET"
    public final void mTEXTURESET() throws RecognitionException {
        try {
            int _type = TEXTURESET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:149:13: ( 'textureset' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:149:15: 'textureset'
            {
            match("textureset"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXTURESET"

    // $ANTLR start "VNORMAL"
    public final void mVNORMAL() throws RecognitionException {
        try {
            int _type = VNORMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:150:10: ( 'vnormal' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:150:12: 'vnormal'
            {
            match("vnormal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VNORMAL"

    // $ANTLR start "NORMALSET"
    public final void mNORMALSET() throws RecognitionException {
        try {
            int _type = NORMALSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:151:12: ( 'normalset' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:151:14: 'normalset'
            {
            match("normalset"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NORMALSET"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:152:8: ( 'point' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:152:10: 'point'
            {
            match("point"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "LINE"
    public final void mLINE() throws RecognitionException {
        try {
            int _type = LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:153:6: ( 'line' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:153:8: 'line'
            {
            match("line"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE"

    // $ANTLR start "FACE"
    public final void mFACE() throws RecognitionException {
        try {
            int _type = FACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:154:6: ( 'face' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:154:8: 'face'
            {
            match("face"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FACE"

    // $ANTLR start "SMOOTHING"
    public final void mSMOOTHING() throws RecognitionException {
        try {
            int _type = SMOOTHING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:155:11: ( 'smoothing' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:155:13: 'smoothing'
            {
            match("smoothing"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SMOOTHING"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:156:7: ( 'group' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:156:9: 'group'
            {
            match("group"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:157:5: ( 'add' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:157:7: 'add'
            {
            match("add"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "DEFTEX"
    public final void mDEFTEX() throws RecognitionException {
        try {
            int _type = DEFTEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:158:8: ( 'deftex' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:158:10: 'deftex'
            {
            match("deftex"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFTEX"

    // $ANTLR start "DEFNORM"
    public final void mDEFNORM() throws RecognitionException {
        try {
            int _type = DEFNORM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:159:9: ( 'defnorm' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:159:11: 'defnorm'
            {
            match("defnorm"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFNORM"

    // $ANTLR start "BOX"
    public final void mBOX() throws RecognitionException {
        try {
            int _type = BOX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:160:5: ( 'box' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:160:7: 'box'
            {
            match("box"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOX"

    // $ANTLR start "SCALE"
    public final void mSCALE() throws RecognitionException {
        try {
            int _type = SCALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:163:7: ( 'scale' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:163:9: 'scale'
            {
            match("scale"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCALE"

    // $ANTLR start "ROTATE"
    public final void mROTATE() throws RecognitionException {
        try {
            int _type = ROTATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:164:8: ( 'rotate' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:164:10: 'rotate'
            {
            match("rotate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROTATE"

    // $ANTLR start "TRASLATE"
    public final void mTRASLATE() throws RecognitionException {
        try {
            int _type = TRASLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:165:10: ( 'traslate' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:165:12: 'traslate'
            {
            match("traslate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRASLATE"

    // $ANTLR start "LB"
    public final void mLB() throws RecognitionException {
        try {
            int _type = LB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:166:4: ( '{' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:166:6: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LB"

    // $ANTLR start "RB"
    public final void mRB() throws RecognitionException {
        try {
            int _type = RB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:167:4: ( '}' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:167:6: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RB"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:168:7: ( ',' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:168:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:169:4: ( '=' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:169:6: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "SC"
    public final void mSC() throws RecognitionException {
        try {
            int _type = SC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:170:4: ( ';' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:170:6: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SC"

    // $ANTLR start "CM"
    public final void mCM() throws RecognitionException {
        try {
            int _type = CM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:171:4: ( '//' )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:171:6: '//'
            {
            match("//"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CM"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:173:7: ( ( '0' .. '9' )+ )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:173:9: ( '0' .. '9' )+
            {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:173:9: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:174:7: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:174:9: ( '0' .. '9' )* '.' ( '0' .. '9' )+
            {
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:174:9: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match('.'); 

            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:174:25: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:175:7: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:175:9: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:176:9: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:177:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:177:7: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ERROR"
    public final void mERROR() throws RecognitionException {
        try {
            int _type = ERROR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:183:7: ( . )
            // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:183:9: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ERROR"

    public void mTokens() throws RecognitionException {
        // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:8: ( VERTEX | VERTEXSET | VTEXTURE | TEXTURESET | VNORMAL | NORMALSET | POINT | LINE | FACE | SMOOTHING | GROUP | ADD | DEFTEX | DEFNORM | BOX | SCALE | ROTATE | TRASLATE | LB | RB | COMMA | EQ | SC | CM | INT | FLOAT | ID | WS | ERROR )
        int alt5=29;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:10: VERTEX
                {
                mVERTEX(); 


                }
                break;
            case 2 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:17: VERTEXSET
                {
                mVERTEXSET(); 


                }
                break;
            case 3 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:27: VTEXTURE
                {
                mVTEXTURE(); 


                }
                break;
            case 4 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:36: TEXTURESET
                {
                mTEXTURESET(); 


                }
                break;
            case 5 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:47: VNORMAL
                {
                mVNORMAL(); 


                }
                break;
            case 6 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:55: NORMALSET
                {
                mNORMALSET(); 


                }
                break;
            case 7 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:65: POINT
                {
                mPOINT(); 


                }
                break;
            case 8 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:71: LINE
                {
                mLINE(); 


                }
                break;
            case 9 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:76: FACE
                {
                mFACE(); 


                }
                break;
            case 10 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:81: SMOOTHING
                {
                mSMOOTHING(); 


                }
                break;
            case 11 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:91: GROUP
                {
                mGROUP(); 


                }
                break;
            case 12 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:97: ADD
                {
                mADD(); 


                }
                break;
            case 13 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:101: DEFTEX
                {
                mDEFTEX(); 


                }
                break;
            case 14 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:108: DEFNORM
                {
                mDEFNORM(); 


                }
                break;
            case 15 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:116: BOX
                {
                mBOX(); 


                }
                break;
            case 16 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:120: SCALE
                {
                mSCALE(); 


                }
                break;
            case 17 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:126: ROTATE
                {
                mROTATE(); 


                }
                break;
            case 18 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:133: TRASLATE
                {
                mTRASLATE(); 


                }
                break;
            case 19 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:142: LB
                {
                mLB(); 


                }
                break;
            case 20 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:145: RB
                {
                mRB(); 


                }
                break;
            case 21 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:148: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 22 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:154: EQ
                {
                mEQ(); 


                }
                break;
            case 23 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:157: SC
                {
                mSC(); 


                }
                break;
            case 24 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:160: CM
                {
                mCM(); 


                }
                break;
            case 25 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:163: INT
                {
                mINT(); 


                }
                break;
            case 26 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:167: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 27 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:173: ID
                {
                mID(); 


                }
                break;
            case 28 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:176: WS
                {
                mWS(); 


                }
                break;
            case 29 :
                // C:\\SPB_Data\\git\\LeC\\Progetto_LeC\\src\\grammatica.g:1:179: ERROR
                {
                mERROR(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\14\33\5\uffff\1\27\1\57\1\27\3\uffff\3\33\1\uffff\15\33"+
        "\7\uffff\1\57\2\uffff\14\33\1\117\1\33\1\122\10\33\1\133\1\134\3"+
        "\33\1\uffff\2\33\1\uffff\7\33\1\151\2\uffff\1\33\1\153\1\154\3\33"+
        "\1\161\5\33\1\uffff\1\33\2\uffff\1\170\1\33\1\172\1\33\1\uffff\1"+
        "\33\1\175\4\33\1\uffff\1\u0082\1\uffff\1\33\1\u0084\1\uffff\1\33"+
        "\1\u0086\2\33\1\uffff\1\u0089\1\uffff\1\33\1\uffff\1\u008b\1\u008c"+
        "\1\uffff\1\u008d\3\uffff";
    static final String DFA5_eofS =
        "\u008e\uffff";
    static final String DFA5_minS =
        "\1\0\2\145\2\157\1\151\1\141\1\143\1\162\1\144\1\145\2\157\5\uffff"+
        "\1\57\1\56\1\60\3\uffff\1\162\1\145\1\157\1\uffff\1\170\1\141\1"+
        "\162\1\151\1\156\1\143\1\157\1\141\1\157\1\144\1\146\1\170\1\164"+
        "\7\uffff\1\56\2\uffff\1\164\1\170\1\162\1\164\1\163\1\155\1\156"+
        "\2\145\1\157\1\154\1\165\1\60\1\156\1\60\1\141\1\145\1\164\1\155"+
        "\1\165\1\154\1\141\1\164\2\60\1\164\1\145\1\160\1\uffff\1\145\1"+
        "\157\1\uffff\1\164\1\170\1\165\1\141\1\162\1\141\1\154\1\60\2\uffff"+
        "\1\150\2\60\1\170\1\162\1\145\1\60\1\162\1\154\1\145\1\164\1\163"+
        "\1\uffff\1\151\2\uffff\1\60\1\155\1\60\1\145\1\uffff\1\145\1\60"+
        "\1\163\2\145\1\156\1\uffff\1\60\1\uffff\1\164\1\60\1\uffff\1\145"+
        "\1\60\1\164\1\147\1\uffff\1\60\1\uffff\1\164\1\uffff\2\60\1\uffff"+
        "\1\60\3\uffff";
    static final String DFA5_maxS =
        "\1\uffff\1\164\1\162\2\157\1\151\1\141\1\155\1\162\1\144\1\145\2"+
        "\157\5\uffff\1\57\2\71\3\uffff\1\162\1\145\1\157\1\uffff\1\170\1"+
        "\141\1\162\1\151\1\156\1\143\1\157\1\141\1\157\1\144\1\146\1\170"+
        "\1\164\7\uffff\1\71\2\uffff\1\164\1\170\1\162\1\164\1\163\1\155"+
        "\1\156\2\145\1\157\1\154\1\165\1\172\1\164\1\172\1\141\1\145\1\164"+
        "\1\155\1\165\1\154\1\141\1\164\2\172\1\164\1\145\1\160\1\uffff\1"+
        "\145\1\157\1\uffff\1\164\1\170\1\165\1\141\1\162\1\141\1\154\1\172"+
        "\2\uffff\1\150\2\172\1\170\1\162\1\145\1\172\1\162\1\154\1\145\1"+
        "\164\1\163\1\uffff\1\151\2\uffff\1\172\1\155\1\172\1\145\1\uffff"+
        "\1\145\1\172\1\163\2\145\1\156\1\uffff\1\172\1\uffff\1\164\1\172"+
        "\1\uffff\1\145\1\172\1\164\1\147\1\uffff\1\172\1\uffff\1\164\1\uffff"+
        "\2\172\1\uffff\1\172\3\uffff";
    static final String DFA5_acceptS =
        "\15\uffff\1\23\1\24\1\25\1\26\1\27\3\uffff\1\33\1\34\1\35\3\uffff"+
        "\1\33\15\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\uffff\1\32\1"+
        "\34\34\uffff\1\14\2\uffff\1\17\10\uffff\1\10\1\11\14\uffff\1\7\1"+
        "\uffff\1\20\1\13\4\uffff\1\1\6\uffff\1\15\1\uffff\1\21\2\uffff\1"+
        "\5\4\uffff\1\16\1\uffff\1\3\1\uffff\1\22\2\uffff\1\2\1\uffff\1\6"+
        "\1\12\1\4";
    static final String DFA5_specialS =
        "\1\0\u008d\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\13\27\1\17\1\27\1\24\1\22\12"+
            "\23\1\27\1\21\1\27\1\20\3\27\32\25\6\27\1\11\1\13\1\25\1\12"+
            "\1\25\1\6\1\10\4\25\1\5\1\25\1\3\1\25\1\4\1\25\1\14\1\7\1\2"+
            "\1\25\1\1\4\25\1\15\1\27\1\16\uff82\27",
            "\1\30\10\uffff\1\32\5\uffff\1\31",
            "\1\34\14\uffff\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\43\11\uffff\1\42",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "\1\56",
            "\1\61\1\uffff\12\60",
            "\12\61",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61\1\uffff\12\60",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\121\5\uffff\1\120",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\152",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\160\7\33",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\171",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\173",
            "",
            "\1\174",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u0083",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u0085",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0087",
            "\1\u0088",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u008a",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( VERTEX | VERTEXSET | VTEXTURE | TEXTURESET | VNORMAL | NORMALSET | POINT | LINE | FACE | SMOOTHING | GROUP | ADD | DEFTEX | DEFNORM | BOX | SCALE | ROTATE | TRASLATE | LB | RB | COMMA | EQ | SC | CM | INT | FLOAT | ID | WS | ERROR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='v') ) {s = 1;}

                        else if ( (LA5_0=='t') ) {s = 2;}

                        else if ( (LA5_0=='n') ) {s = 3;}

                        else if ( (LA5_0=='p') ) {s = 4;}

                        else if ( (LA5_0=='l') ) {s = 5;}

                        else if ( (LA5_0=='f') ) {s = 6;}

                        else if ( (LA5_0=='s') ) {s = 7;}

                        else if ( (LA5_0=='g') ) {s = 8;}

                        else if ( (LA5_0=='a') ) {s = 9;}

                        else if ( (LA5_0=='d') ) {s = 10;}

                        else if ( (LA5_0=='b') ) {s = 11;}

                        else if ( (LA5_0=='r') ) {s = 12;}

                        else if ( (LA5_0=='{') ) {s = 13;}

                        else if ( (LA5_0=='}') ) {s = 14;}

                        else if ( (LA5_0==',') ) {s = 15;}

                        else if ( (LA5_0=='=') ) {s = 16;}

                        else if ( (LA5_0==';') ) {s = 17;}

                        else if ( (LA5_0=='/') ) {s = 18;}

                        else if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {s = 19;}

                        else if ( (LA5_0=='.') ) {s = 20;}

                        else if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='c'||LA5_0=='e'||(LA5_0 >= 'h' && LA5_0 <= 'k')||LA5_0=='m'||LA5_0=='o'||LA5_0=='q'||LA5_0=='u'||(LA5_0 >= 'w' && LA5_0 <= 'z')) ) {s = 21;}

                        else if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {s = 22;}

                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\b')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\u001F')||(LA5_0 >= '!' && LA5_0 <= '+')||LA5_0=='-'||LA5_0==':'||LA5_0=='<'||(LA5_0 >= '>' && LA5_0 <= '@')||(LA5_0 >= '[' && LA5_0 <= '`')||LA5_0=='|'||(LA5_0 >= '~' && LA5_0 <= '\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}