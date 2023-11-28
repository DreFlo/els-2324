package org.feup.els5.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTableDSLLexer extends Lexer {
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=8;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_RESERVED_KEYWORDS=4;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalTableDSLLexer() {;} 
    public InternalTableDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTableDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTableDSL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:11:7: ( 'create' )
            // InternalTableDSL.g:11:9: 'create'
            {
            match("create"); 


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
            // InternalTableDSL.g:12:7: ( 'table' )
            // InternalTableDSL.g:12:9: 'table'
            {
            match("table"); 


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
            // InternalTableDSL.g:13:7: ( 'from' )
            // InternalTableDSL.g:13:9: 'from'
            {
            match("from"); 


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
            // InternalTableDSL.g:14:7: ( 'load' )
            // InternalTableDSL.g:14:9: 'load'
            {
            match("load"); 


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
            // InternalTableDSL.g:15:7: ( ',' )
            // InternalTableDSL.g:15:9: ','
            {
            match(','); 

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
            // InternalTableDSL.g:16:7: ( 'output' )
            // InternalTableDSL.g:16:9: 'output'
            {
            match("output"); 


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
            // InternalTableDSL.g:17:7: ( 'to' )
            // InternalTableDSL.g:17:9: 'to'
            {
            match("to"); 


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
            // InternalTableDSL.g:18:7: ( 'select' )
            // InternalTableDSL.g:18:9: 'select'
            {
            match("select"); 


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
            // InternalTableDSL.g:19:7: ( 'rename' )
            // InternalTableDSL.g:19:9: 'rename'
            {
            match("rename"); 


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
            // InternalTableDSL.g:20:7: ( 'column' )
            // InternalTableDSL.g:20:9: 'column'
            {
            match("column"); 


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
            // InternalTableDSL.g:21:7: ( 'prepend' )
            // InternalTableDSL.g:21:9: 'prepend'
            {
            match("prepend"); 


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
            // InternalTableDSL.g:22:7: ( 'append' )
            // InternalTableDSL.g:22:9: 'append'
            {
            match("append"); 


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
            // InternalTableDSL.g:23:7: ( 'extract' )
            // InternalTableDSL.g:23:9: 'extract'
            {
            match("extract"); 


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
            // InternalTableDSL.g:24:7: ( 'sort' )
            // InternalTableDSL.g:24:9: 'sort'
            {
            match("sort"); 


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
            // InternalTableDSL.g:25:7: ( 'by' )
            // InternalTableDSL.g:25:9: 'by'
            {
            match("by"); 


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
            // InternalTableDSL.g:26:7: ( 'MAX' )
            // InternalTableDSL.g:26:9: 'MAX'
            {
            match("MAX"); 


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
            // InternalTableDSL.g:27:7: ( 'MIN' )
            // InternalTableDSL.g:27:9: 'MIN'
            {
            match("MIN"); 


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
            // InternalTableDSL.g:28:7: ( 'MEDIAN' )
            // InternalTableDSL.g:28:9: 'MEDIAN'
            {
            match("MEDIAN"); 


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
            // InternalTableDSL.g:29:7: ( 'TOP' )
            // InternalTableDSL.g:29:9: 'TOP'
            {
            match("TOP"); 


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
            // InternalTableDSL.g:30:7: ( 'squash' )
            // InternalTableDSL.g:30:9: 'squash'
            {
            match("squash"); 


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
            // InternalTableDSL.g:31:7: ( 'rows' )
            // InternalTableDSL.g:31:9: 'rows'
            {
            match("rows"); 


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
            // InternalTableDSL.g:32:7: ( 'filter' )
            // InternalTableDSL.g:32:9: 'filter'
            {
            match("filter"); 


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
            // InternalTableDSL.g:33:7: ( 'deny' )
            // InternalTableDSL.g:33:9: 'deny'
            {
            match("deny"); 


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
            // InternalTableDSL.g:34:7: ( 'except' )
            // InternalTableDSL.g:34:9: 'except'
            {
            match("except"); 


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
            // InternalTableDSL.g:35:7: ( 'object' )
            // InternalTableDSL.g:35:9: 'object'
            {
            match("object"); 


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
            // InternalTableDSL.g:36:7: ( 'of' )
            // InternalTableDSL.g:36:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_RESERVED_KEYWORDS"
    public final void mRULE_RESERVED_KEYWORDS() throws RecognitionException {
        try {
            int _type = RULE_RESERVED_KEYWORDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:3494:24: ( ( 'FILENAME' | 'DIRECTORY' ) )
            // InternalTableDSL.g:3494:26: ( 'FILENAME' | 'DIRECTORY' )
            {
            // InternalTableDSL.g:3494:26: ( 'FILENAME' | 'DIRECTORY' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='F') ) {
                alt1=1;
            }
            else if ( (LA1_0=='D') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTableDSL.g:3494:27: 'FILENAME'
                    {
                    match("FILENAME"); 


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:3494:38: 'DIRECTORY'
                    {
                    match("DIRECTORY"); 


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
    // $ANTLR end "RULE_RESERVED_KEYWORDS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:3496:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTableDSL.g:3496:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTableDSL.g:3496:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTableDSL.g:3496:11: '^'
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

            // InternalTableDSL.g:3496:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTableDSL.g:
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
            	    break loop3;
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
            // InternalTableDSL.g:3498:10: ( ( '0' .. '9' )+ )
            // InternalTableDSL.g:3498:12: ( '0' .. '9' )+
            {
            // InternalTableDSL.g:3498:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTableDSL.g:3498:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalTableDSL.g:3500:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTableDSL.g:3500:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTableDSL.g:3500:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTableDSL.g:3500:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTableDSL.g:3500:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTableDSL.g:3500:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTableDSL.g:3500:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:3500:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTableDSL.g:3500:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTableDSL.g:3500:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTableDSL.g:3500:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalTableDSL.g:3502:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTableDSL.g:3502:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTableDSL.g:3502:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTableDSL.g:3502:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalTableDSL.g:3504:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTableDSL.g:3504:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTableDSL.g:3504:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTableDSL.g:3504:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalTableDSL.g:3504:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTableDSL.g:3504:41: ( '\\r' )? '\\n'
                    {
                    // InternalTableDSL.g:3504:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalTableDSL.g:3504:41: '\\r'
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
            // InternalTableDSL.g:3506:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTableDSL.g:3506:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTableDSL.g:3506:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTableDSL.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalTableDSL.g:3508:16: ( . )
            // InternalTableDSL.g:3508:18: .
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
        // InternalTableDSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_RESERVED_KEYWORDS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=34;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalTableDSL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalTableDSL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalTableDSL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalTableDSL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalTableDSL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalTableDSL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalTableDSL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalTableDSL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalTableDSL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalTableDSL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalTableDSL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalTableDSL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalTableDSL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalTableDSL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalTableDSL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalTableDSL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalTableDSL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalTableDSL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalTableDSL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalTableDSL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalTableDSL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalTableDSL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalTableDSL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalTableDSL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalTableDSL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalTableDSL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalTableDSL.g:1:166: RULE_RESERVED_KEYWORDS
                {
                mRULE_RESERVED_KEYWORDS(); 

                }
                break;
            case 28 :
                // InternalTableDSL.g:1:189: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalTableDSL.g:1:197: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalTableDSL.g:1:206: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // InternalTableDSL.g:1:218: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalTableDSL.g:1:234: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalTableDSL.g:1:250: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalTableDSL.g:1:258: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\4\34\1\uffff\14\34\1\31\2\uffff\3\31\2\uffff\2\34\1\uffff\1\34\1\76\3\34\1\uffff\2\34\1\104\10\34\1\116\7\34\5\uffff\3\34\1\uffff\5\34\1\uffff\11\34\1\uffff\1\147\1\150\1\34\1\152\6\34\1\161\1\34\1\163\3\34\1\167\2\34\1\172\4\34\2\uffff\1\34\1\uffff\1\u0080\4\34\1\u0085\1\uffff\1\34\1\uffff\3\34\1\uffff\2\34\1\uffff\5\34\1\uffff\2\34\1\u0093\1\u0094\1\uffff\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\34\1\u009c\1\34\1\u009e\1\u009f\2\34\10\uffff\1\u00a2\1\uffff\1\u00a3\2\uffff\2\34\2\uffff\1\u00a6\1\34\1\uffff\1\u00a6";
    static final String DFA13_eofS =
        "\u00a8\uffff";
    static final String DFA13_minS =
        "\1\0\1\157\1\141\1\151\1\157\1\uffff\1\142\2\145\1\162\1\160\1\170\1\171\1\101\1\117\1\145\2\111\1\101\2\uffff\2\0\1\52\2\uffff\1\145\1\154\1\uffff\1\142\1\60\1\157\1\154\1\141\1\uffff\1\164\1\152\1\60\1\154\1\162\1\165\1\156\1\167\1\145\1\160\1\143\1\60\1\130\1\116\1\104\1\120\1\156\1\114\1\122\5\uffff\1\141\1\165\1\154\1\uffff\1\155\1\164\1\144\1\160\1\145\1\uffff\1\145\1\164\2\141\1\163\1\160\1\145\1\162\1\145\1\uffff\2\60\1\111\1\60\1\171\2\105\1\164\1\155\1\145\1\60\1\145\1\60\1\165\2\143\1\60\1\163\1\155\1\60\1\145\1\156\1\141\1\160\2\uffff\1\101\1\uffff\1\60\1\116\1\103\1\145\1\156\1\60\1\uffff\1\162\1\uffff\3\164\1\uffff\1\150\1\145\1\uffff\1\156\1\144\1\143\1\164\1\116\1\uffff\1\101\1\124\2\60\1\uffff\6\60\1\144\1\60\1\164\2\60\1\115\1\117\10\uffff\1\60\1\uffff\1\60\2\uffff\1\105\1\122\2\uffff\1\60\1\131\1\uffff\1\60";
    static final String DFA13_maxS =
        "\1\uffff\1\162\1\157\1\162\1\157\1\uffff\1\165\1\161\1\157\1\162\1\160\1\170\1\171\1\111\1\117\1\145\2\111\1\172\2\uffff\2\uffff\1\57\2\uffff\1\145\1\154\1\uffff\1\142\1\172\1\157\1\154\1\141\1\uffff\1\164\1\152\1\172\1\154\1\162\1\165\1\156\1\167\1\145\1\160\1\164\1\172\1\130\1\116\1\104\1\120\1\156\1\114\1\122\5\uffff\1\141\1\165\1\154\1\uffff\1\155\1\164\1\144\1\160\1\145\1\uffff\1\145\1\164\2\141\1\163\1\160\1\145\1\162\1\145\1\uffff\2\172\1\111\1\172\1\171\2\105\1\164\1\155\1\145\1\172\1\145\1\172\1\165\2\143\1\172\1\163\1\155\1\172\1\145\1\156\1\141\1\160\2\uffff\1\101\1\uffff\1\172\1\116\1\103\1\145\1\156\1\172\1\uffff\1\162\1\uffff\3\164\1\uffff\1\150\1\145\1\uffff\1\156\1\144\1\143\1\164\1\116\1\uffff\1\101\1\124\2\172\1\uffff\6\172\1\144\1\172\1\164\2\172\1\115\1\117\10\uffff\1\172\1\uffff\1\172\2\uffff\1\105\1\122\2\uffff\1\172\1\131\1\uffff\1\172";
    static final String DFA13_acceptS =
        "\5\uffff\1\5\15\uffff\1\34\1\35\3\uffff\1\41\1\42\2\uffff\1\34\5\uffff\1\5\23\uffff\1\35\1\36\1\37\1\40\1\41\3\uffff\1\7\5\uffff\1\32\11\uffff\1\17\30\uffff\1\20\1\21\1\uffff\1\23\6\uffff\1\3\1\uffff\1\4\3\uffff\1\16\2\uffff\1\25\5\uffff\1\27\4\uffff\1\2\15\uffff\1\1\1\12\1\26\1\6\1\31\1\10\1\24\1\11\1\uffff\1\14\1\uffff\1\30\1\22\2\uffff\1\13\1\15\2\uffff\1\33\1\uffff";
    static final String DFA13_specialS =
        "\1\0\24\uffff\1\1\1\2\u0091\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\4\31\1\26\4\31\1\5\2\31\1\27\12\24\7\31\3\23\1\21\1\23\1\20\6\23\1\15\6\23\1\16\6\23\3\31\1\22\1\23\1\31\1\12\1\14\1\1\1\17\1\13\1\3\5\23\1\4\2\23\1\6\1\11\1\23\1\10\1\7\1\2\6\23\uff85\31",
            "\1\33\2\uffff\1\32",
            "\1\35\15\uffff\1\36",
            "\1\40\10\uffff\1\37",
            "\1\41",
            "",
            "\1\44\3\uffff\1\45\16\uffff\1\43",
            "\1\46\11\uffff\1\47\1\uffff\1\50",
            "\1\51\11\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57\3\uffff\1\61\3\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\0\67",
            "\0\67",
            "\1\70\4\uffff\1\71",
            "",
            "",
            "\1\73",
            "\1\74",
            "",
            "\1\75",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\20\uffff\1\114",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\151",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\162",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\170",
            "\1\171",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "",
            "\1\177",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u009b",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u009d",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00a7",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_RESERVED_KEYWORDS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='c') ) {s = 1;}

                        else if ( (LA13_0=='t') ) {s = 2;}

                        else if ( (LA13_0=='f') ) {s = 3;}

                        else if ( (LA13_0=='l') ) {s = 4;}

                        else if ( (LA13_0==',') ) {s = 5;}

                        else if ( (LA13_0=='o') ) {s = 6;}

                        else if ( (LA13_0=='s') ) {s = 7;}

                        else if ( (LA13_0=='r') ) {s = 8;}

                        else if ( (LA13_0=='p') ) {s = 9;}

                        else if ( (LA13_0=='a') ) {s = 10;}

                        else if ( (LA13_0=='e') ) {s = 11;}

                        else if ( (LA13_0=='b') ) {s = 12;}

                        else if ( (LA13_0=='M') ) {s = 13;}

                        else if ( (LA13_0=='T') ) {s = 14;}

                        else if ( (LA13_0=='d') ) {s = 15;}

                        else if ( (LA13_0=='F') ) {s = 16;}

                        else if ( (LA13_0=='D') ) {s = 17;}

                        else if ( (LA13_0=='^') ) {s = 18;}

                        else if ( ((LA13_0>='A' && LA13_0<='C')||LA13_0=='E'||(LA13_0>='G' && LA13_0<='L')||(LA13_0>='N' && LA13_0<='S')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='g' && LA13_0<='k')||(LA13_0>='m' && LA13_0<='n')||LA13_0=='q'||(LA13_0>='u' && LA13_0<='z')) ) {s = 19;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 20;}

                        else if ( (LA13_0=='\"') ) {s = 21;}

                        else if ( (LA13_0=='\'') ) {s = 22;}

                        else if ( (LA13_0=='/') ) {s = 23;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 24;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFF')) ) {s = 55;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_22 = input.LA(1);

                        s = -1;
                        if ( ((LA13_22>='\u0000' && LA13_22<='\uFFFF')) ) {s = 55;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}