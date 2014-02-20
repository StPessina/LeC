// $ANTLR 3.4 /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g 2014-02-20 14:38:43

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
    public String getGrammarFileName() { return "/media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g"; }

    // $ANTLR start "VERTEX"
    public final void mVERTEX() throws RecognitionException {
        try {
            int _type = VERTEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:151:9: ( 'vertex' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:151:11: 'vertex'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:152:12: ( 'vertexset' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:152:14: 'vertexset'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:153:11: ( 'vtexture' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:153:13: 'vtexture'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:154:13: ( 'textureset' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:154:15: 'textureset'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:155:10: ( 'vnormal' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:155:12: 'vnormal'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:156:12: ( 'normalset' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:156:14: 'normalset'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:157:8: ( 'point' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:157:10: 'point'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:158:6: ( 'line' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:158:8: 'line'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:159:6: ( 'face' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:159:8: 'face'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:160:11: ( 'smoothing' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:160:13: 'smoothing'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:161:7: ( 'group' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:161:9: 'group'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:162:5: ( 'add' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:162:7: 'add'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:163:8: ( 'deftex' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:163:10: 'deftex'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:164:9: ( 'defnorm' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:164:11: 'defnorm'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:165:5: ( 'box' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:165:7: 'box'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:168:7: ( 'scale' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:168:9: 'scale'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:169:8: ( 'rotate' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:169:10: 'rotate'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:170:10: ( 'traslate' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:170:12: 'traslate'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:171:4: ( '{' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:171:6: '{'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:172:4: ( '}' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:172:6: '}'
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:173:7: ( ',' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:173:9: ','
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:174:4: ( '=' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:174:6: '='
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:175:4: ( ';' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:175:6: ';'
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

    // $ANTLR start "SINGLELINECM"
    public final void mSINGLELINECM() throws RecognitionException {
        try {
            int _type = SINGLELINECM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:178:14: ( '//' ( . )* ( '\\r' | '\\n' ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:178:16: '//' ( . )* ( '\\r' | '\\n' )
            {
            match("//"); 



            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:178:21: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\n'||LA1_0=='\r') ) {
                    alt1=2;
                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:178:21: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLELINECM"

    // $ANTLR start "MULTILINETEXTCM"
    public final void mMULTILINETEXTCM() throws RecognitionException {
        try {
            int _type = MULTILINETEXTCM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:179:17: ( '/*' ( . )* '*/' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:179:19: '/*' ( . )* '*/'
            {
            match("/*"); 



            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:179:24: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:179:24: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match("*/"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTILINETEXTCM"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:182:7: ( ( '0' .. '9' )+ )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:182:9: ( '0' .. '9' )+
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:182:9: ( '0' .. '9' )+
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
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
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
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:183:7: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:183:9: ( '0' .. '9' )* '.' ( '0' .. '9' )+
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:183:9: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
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
            	    break loop4;
                }
            } while (true);


            match('.'); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:183:25: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:184:7: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:184:9: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:185:9: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
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
            	    break loop6;
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:186:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:186:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:186:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:8: ( VERTEX | VERTEXSET | VTEXTURE | TEXTURESET | VNORMAL | NORMALSET | POINT | LINE | FACE | SMOOTHING | GROUP | ADD | DEFTEX | DEFNORM | BOX | SCALE | ROTATE | TRASLATE | LB | RB | COMMA | EQ | SC | SINGLELINECM | MULTILINETEXTCM | INT | FLOAT | ID | WS )
        int alt8=29;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:10: VERTEX
                {
                mVERTEX(); 


                }
                break;
            case 2 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:17: VERTEXSET
                {
                mVERTEXSET(); 


                }
                break;
            case 3 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:27: VTEXTURE
                {
                mVTEXTURE(); 


                }
                break;
            case 4 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:36: TEXTURESET
                {
                mTEXTURESET(); 


                }
                break;
            case 5 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:47: VNORMAL
                {
                mVNORMAL(); 


                }
                break;
            case 6 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:55: NORMALSET
                {
                mNORMALSET(); 


                }
                break;
            case 7 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:65: POINT
                {
                mPOINT(); 


                }
                break;
            case 8 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:71: LINE
                {
                mLINE(); 


                }
                break;
            case 9 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:76: FACE
                {
                mFACE(); 


                }
                break;
            case 10 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:81: SMOOTHING
                {
                mSMOOTHING(); 


                }
                break;
            case 11 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:91: GROUP
                {
                mGROUP(); 


                }
                break;
            case 12 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:97: ADD
                {
                mADD(); 


                }
                break;
            case 13 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:101: DEFTEX
                {
                mDEFTEX(); 


                }
                break;
            case 14 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:108: DEFNORM
                {
                mDEFNORM(); 


                }
                break;
            case 15 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:116: BOX
                {
                mBOX(); 


                }
                break;
            case 16 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:120: SCALE
                {
                mSCALE(); 


                }
                break;
            case 17 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:126: ROTATE
                {
                mROTATE(); 


                }
                break;
            case 18 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:133: TRASLATE
                {
                mTRASLATE(); 


                }
                break;
            case 19 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:142: LB
                {
                mLB(); 


                }
                break;
            case 20 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:145: RB
                {
                mRB(); 


                }
                break;
            case 21 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:148: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 22 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:154: EQ
                {
                mEQ(); 


                }
                break;
            case 23 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:157: SC
                {
                mSC(); 


                }
                break;
            case 24 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:160: SINGLELINECM
                {
                mSINGLELINECM(); 


                }
                break;
            case 25 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:173: MULTILINETEXTCM
                {
                mMULTILINETEXTCM(); 


                }
                break;
            case 26 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:189: INT
                {
                mINT(); 


                }
                break;
            case 27 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:193: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 28 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:199: ID
                {
                mID(); 


                }
                break;
            case 29 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:202: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\14\25\6\uffff\1\51\3\uffff\20\25\3\uffff\14\25\1\106\1"+
        "\25\1\111\10\25\1\122\1\123\3\25\1\uffff\2\25\1\uffff\7\25\1\140"+
        "\2\uffff\1\25\1\142\1\143\3\25\1\150\5\25\1\uffff\1\25\2\uffff\1"+
        "\157\1\25\1\161\1\25\1\uffff\1\25\1\164\4\25\1\uffff\1\171\1\uffff"+
        "\1\25\1\173\1\uffff\1\25\1\175\2\25\1\uffff\1\u0080\1\uffff\1\25"+
        "\1\uffff\1\u0082\1\u0083\1\uffff\1\u0084\3\uffff";
    static final String DFA8_eofS =
        "\u0085\uffff";
    static final String DFA8_minS =
        "\1\11\2\145\2\157\1\151\1\141\1\143\1\162\1\144\1\145\2\157\5\uffff"+
        "\1\52\1\56\3\uffff\1\162\1\145\1\157\1\170\1\141\1\162\1\151\1\156"+
        "\1\143\1\157\1\141\1\157\1\144\1\146\1\170\1\164\3\uffff\1\164\1"+
        "\170\1\162\1\164\1\163\1\155\1\156\2\145\1\157\1\154\1\165\1\60"+
        "\1\156\1\60\1\141\1\145\1\164\1\155\1\165\1\154\1\141\1\164\2\60"+
        "\1\164\1\145\1\160\1\uffff\1\145\1\157\1\uffff\1\164\1\170\1\165"+
        "\1\141\1\162\1\141\1\154\1\60\2\uffff\1\150\2\60\1\170\1\162\1\145"+
        "\1\60\1\162\1\154\1\145\1\164\1\163\1\uffff\1\151\2\uffff\1\60\1"+
        "\155\1\60\1\145\1\uffff\1\145\1\60\1\163\2\145\1\156\1\uffff\1\60"+
        "\1\uffff\1\164\1\60\1\uffff\1\145\1\60\1\164\1\147\1\uffff\1\60"+
        "\1\uffff\1\164\1\uffff\2\60\1\uffff\1\60\3\uffff";
    static final String DFA8_maxS =
        "\1\175\1\164\1\162\2\157\1\151\1\141\1\155\1\162\1\144\1\145\2\157"+
        "\5\uffff\1\57\1\71\3\uffff\1\162\1\145\1\157\1\170\1\141\1\162\1"+
        "\151\1\156\1\143\1\157\1\141\1\157\1\144\1\146\1\170\1\164\3\uffff"+
        "\1\164\1\170\1\162\1\164\1\163\1\155\1\156\2\145\1\157\1\154\1\165"+
        "\1\172\1\164\1\172\1\141\1\145\1\164\1\155\1\165\1\154\1\141\1\164"+
        "\2\172\1\164\1\145\1\160\1\uffff\1\145\1\157\1\uffff\1\164\1\170"+
        "\1\165\1\141\1\162\1\141\1\154\1\172\2\uffff\1\150\2\172\1\170\1"+
        "\162\1\145\1\172\1\162\1\154\1\145\1\164\1\163\1\uffff\1\151\2\uffff"+
        "\1\172\1\155\1\172\1\145\1\uffff\1\145\1\172\1\163\2\145\1\156\1"+
        "\uffff\1\172\1\uffff\1\164\1\172\1\uffff\1\145\1\172\1\164\1\147"+
        "\1\uffff\1\172\1\uffff\1\164\1\uffff\2\172\1\uffff\1\172\3\uffff";
    static final String DFA8_acceptS =
        "\15\uffff\1\23\1\24\1\25\1\26\1\27\2\uffff\1\33\1\34\1\35\20\uffff"+
        "\1\30\1\31\1\32\34\uffff\1\14\2\uffff\1\17\10\uffff\1\10\1\11\14"+
        "\uffff\1\7\1\uffff\1\20\1\13\4\uffff\1\1\6\uffff\1\15\1\uffff\1"+
        "\21\2\uffff\1\5\4\uffff\1\16\1\uffff\1\3\1\uffff\1\22\2\uffff\1"+
        "\2\1\uffff\1\6\1\12\1\4";
    static final String DFA8_specialS =
        "\u0085\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\26\2\uffff\1\26\22\uffff\1\26\13\uffff\1\17\1\uffff\1\24"+
            "\1\22\12\23\1\uffff\1\21\1\uffff\1\20\3\uffff\32\25\6\uffff"+
            "\1\11\1\13\1\25\1\12\1\25\1\6\1\10\4\25\1\5\1\25\1\3\1\25\1"+
            "\4\1\25\1\14\1\7\1\2\1\25\1\1\4\25\1\15\1\uffff\1\16",
            "\1\27\10\uffff\1\31\5\uffff\1\30",
            "\1\32\14\uffff\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\41\11\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "",
            "",
            "",
            "",
            "\1\50\4\uffff\1\47",
            "\1\24\1\uffff\12\23",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\110\5\uffff\1\107",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\1\141",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\22\25\1\147\7\25",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\160",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\162",
            "",
            "\1\163",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\172",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\174",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\176",
            "\1\177",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u0081",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( VERTEX | VERTEXSET | VTEXTURE | TEXTURESET | VNORMAL | NORMALSET | POINT | LINE | FACE | SMOOTHING | GROUP | ADD | DEFTEX | DEFNORM | BOX | SCALE | ROTATE | TRASLATE | LB | RB | COMMA | EQ | SC | SINGLELINECM | MULTILINETEXTCM | INT | FLOAT | ID | WS );";
        }
    }
 

}