package org.feup.els5.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.feup.els5.dsl.services.TableDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTableDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_STRING", "RULE_SELECTOR_KEYWORDS", "RULE_INT", "RULE_COLUMN_NAME_KEYWORDS", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'create'", "'table'", "'from'", "'load'", "','", "'output'", "'to'", "'select'", "'rename'", "'column'", "'prepend'", "'append'", "'extract'", "'sort'", "'by'", "'as'", "'TOP'", "'squash'", "'rows'", "'filter'", "'deny'", "'except'", "'columns'", "'object'", "'objects'", "'of'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_COLUMN_NAME_KEYWORDS=8;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=9;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int RULE_SELECTOR_KEYWORDS=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTableDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTableDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTableDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTableDSL.g"; }



     	private TableDSLGrammarAccess grammarAccess;

        public InternalTableDSLParser(TokenStream input, TableDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Start";
       	}

       	@Override
       	protected TableDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStart"
    // InternalTableDSL.g:64:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // InternalTableDSL.g:64:46: (iv_ruleStart= ruleStart EOF )
            // InternalTableDSL.g:65:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart; 
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
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalTableDSL.g:71:1: ruleStart returns [EObject current=null] : ( ( (lv_actions_0_0= ruleCreateTable ) )? ( (lv_actions_1_0= ruleTableAction ) )* ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_0 = null;

        EObject lv_actions_1_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:77:2: ( ( ( (lv_actions_0_0= ruleCreateTable ) )? ( (lv_actions_1_0= ruleTableAction ) )* ) )
            // InternalTableDSL.g:78:2: ( ( (lv_actions_0_0= ruleCreateTable ) )? ( (lv_actions_1_0= ruleTableAction ) )* )
            {
            // InternalTableDSL.g:78:2: ( ( (lv_actions_0_0= ruleCreateTable ) )? ( (lv_actions_1_0= ruleTableAction ) )* )
            // InternalTableDSL.g:79:3: ( (lv_actions_0_0= ruleCreateTable ) )? ( (lv_actions_1_0= ruleTableAction ) )*
            {
            // InternalTableDSL.g:79:3: ( (lv_actions_0_0= ruleCreateTable ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTableDSL.g:80:4: (lv_actions_0_0= ruleCreateTable )
                    {
                    // InternalTableDSL.g:80:4: (lv_actions_0_0= ruleCreateTable )
                    // InternalTableDSL.g:81:5: lv_actions_0_0= ruleCreateTable
                    {

                    					newCompositeNode(grammarAccess.getStartAccess().getActionsCreateTableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_actions_0_0=ruleCreateTable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStartRule());
                    					}
                    					add(
                    						current,
                    						"actions",
                    						lv_actions_0_0,
                    						"org.feup.els5.dsl.TableDSL.CreateTable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTableDSL.g:98:3: ( (lv_actions_1_0= ruleTableAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==18||(LA2_0>=20 && LA2_0<=21)||LA2_0==25||LA2_0==30||LA2_0==32) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTableDSL.g:99:4: (lv_actions_1_0= ruleTableAction )
            	    {
            	    // InternalTableDSL.g:99:4: (lv_actions_1_0= ruleTableAction )
            	    // InternalTableDSL.g:100:5: lv_actions_1_0= ruleTableAction
            	    {

            	    					newCompositeNode(grammarAccess.getStartAccess().getActionsTableActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_actions_1_0=ruleTableAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStartRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_1_0,
            	    						"org.feup.els5.dsl.TableDSL.TableAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleCreateTable"
    // InternalTableDSL.g:121:1: entryRuleCreateTable returns [EObject current=null] : iv_ruleCreateTable= ruleCreateTable EOF ;
    public final EObject entryRuleCreateTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTable = null;


        try {
            // InternalTableDSL.g:121:52: (iv_ruleCreateTable= ruleCreateTable EOF )
            // InternalTableDSL.g:122:2: iv_ruleCreateTable= ruleCreateTable EOF
            {
             newCompositeNode(grammarAccess.getCreateTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateTable=ruleCreateTable();

            state._fsp--;

             current =iv_ruleCreateTable; 
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
    // $ANTLR end "entryRuleCreateTable"


    // $ANTLR start "ruleCreateTable"
    // InternalTableDSL.g:128:1: ruleCreateTable returns [EObject current=null] : ( (otherlv_0= 'create' )? otherlv_1= 'table' otherlv_2= 'from' this_TableInputPath_3= ruleTableInputPath this_ANY_OTHER_4= RULE_ANY_OTHER ) ;
    public final EObject ruleCreateTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_ANY_OTHER_4=null;
        EObject this_TableInputPath_3 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:134:2: ( ( (otherlv_0= 'create' )? otherlv_1= 'table' otherlv_2= 'from' this_TableInputPath_3= ruleTableInputPath this_ANY_OTHER_4= RULE_ANY_OTHER ) )
            // InternalTableDSL.g:135:2: ( (otherlv_0= 'create' )? otherlv_1= 'table' otherlv_2= 'from' this_TableInputPath_3= ruleTableInputPath this_ANY_OTHER_4= RULE_ANY_OTHER )
            {
            // InternalTableDSL.g:135:2: ( (otherlv_0= 'create' )? otherlv_1= 'table' otherlv_2= 'from' this_TableInputPath_3= ruleTableInputPath this_ANY_OTHER_4= RULE_ANY_OTHER )
            // InternalTableDSL.g:136:3: (otherlv_0= 'create' )? otherlv_1= 'table' otherlv_2= 'from' this_TableInputPath_3= ruleTableInputPath this_ANY_OTHER_4= RULE_ANY_OTHER
            {
            // InternalTableDSL.g:136:3: (otherlv_0= 'create' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTableDSL.g:137:4: otherlv_0= 'create'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getCreateTableAccess().getCreateKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateTableAccess().getTableKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateTableAccess().getFromKeyword_2());
            		

            			newCompositeNode(grammarAccess.getCreateTableAccess().getTableInputPathParserRuleCall_3());
            		
            pushFollow(FOLLOW_7);
            this_TableInputPath_3=ruleTableInputPath();

            state._fsp--;


            			current = this_TableInputPath_3;
            			afterParserOrEnumRuleCall();
            		
            this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

            			newLeafNode(this_ANY_OTHER_4, grammarAccess.getCreateTableAccess().getANY_OTHERTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleCreateTable"


    // $ANTLR start "entryRuleTableAction"
    // InternalTableDSL.g:166:1: entryRuleTableAction returns [EObject current=null] : iv_ruleTableAction= ruleTableAction EOF ;
    public final EObject entryRuleTableAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableAction = null;


        try {
            // InternalTableDSL.g:166:52: (iv_ruleTableAction= ruleTableAction EOF )
            // InternalTableDSL.g:167:2: iv_ruleTableAction= ruleTableAction EOF
            {
             newCompositeNode(grammarAccess.getTableActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableAction=ruleTableAction();

            state._fsp--;

             current =iv_ruleTableAction; 
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
    // $ANTLR end "entryRuleTableAction"


    // $ANTLR start "ruleTableAction"
    // InternalTableDSL.g:173:1: ruleTableAction returns [EObject current=null] : ( (this_LoadData_0= ruleLoadData | this_Operation_1= ruleOperation | this_Output_2= ruleOutput ) this_ANY_OTHER_3= RULE_ANY_OTHER ) ;
    public final EObject ruleTableAction() throws RecognitionException {
        EObject current = null;

        Token this_ANY_OTHER_3=null;
        EObject this_LoadData_0 = null;

        EObject this_Operation_1 = null;

        EObject this_Output_2 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:179:2: ( ( (this_LoadData_0= ruleLoadData | this_Operation_1= ruleOperation | this_Output_2= ruleOutput ) this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            // InternalTableDSL.g:180:2: ( (this_LoadData_0= ruleLoadData | this_Operation_1= ruleOperation | this_Output_2= ruleOutput ) this_ANY_OTHER_3= RULE_ANY_OTHER )
            {
            // InternalTableDSL.g:180:2: ( (this_LoadData_0= ruleLoadData | this_Operation_1= ruleOperation | this_Output_2= ruleOutput ) this_ANY_OTHER_3= RULE_ANY_OTHER )
            // InternalTableDSL.g:181:3: (this_LoadData_0= ruleLoadData | this_Operation_1= ruleOperation | this_Output_2= ruleOutput ) this_ANY_OTHER_3= RULE_ANY_OTHER
            {
            // InternalTableDSL.g:181:3: (this_LoadData_0= ruleLoadData | this_Operation_1= ruleOperation | this_Output_2= ruleOutput )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 20:
            case 21:
            case 25:
            case 30:
            case 32:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTableDSL.g:182:4: this_LoadData_0= ruleLoadData
                    {

                    				newCompositeNode(grammarAccess.getTableActionAccess().getLoadDataParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_LoadData_0=ruleLoadData();

                    state._fsp--;


                    				current = this_LoadData_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:191:4: this_Operation_1= ruleOperation
                    {

                    				newCompositeNode(grammarAccess.getTableActionAccess().getOperationParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_Operation_1=ruleOperation();

                    state._fsp--;


                    				current = this_Operation_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:200:4: this_Output_2= ruleOutput
                    {

                    				newCompositeNode(grammarAccess.getTableActionAccess().getOutputParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_7);
                    this_Output_2=ruleOutput();

                    state._fsp--;


                    				current = this_Output_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            this_ANY_OTHER_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

            			newLeafNode(this_ANY_OTHER_3, grammarAccess.getTableActionAccess().getANY_OTHERTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleTableAction"


    // $ANTLR start "entryRuleLoadData"
    // InternalTableDSL.g:217:1: entryRuleLoadData returns [EObject current=null] : iv_ruleLoadData= ruleLoadData EOF ;
    public final EObject entryRuleLoadData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadData = null;


        try {
            // InternalTableDSL.g:217:49: (iv_ruleLoadData= ruleLoadData EOF )
            // InternalTableDSL.g:218:2: iv_ruleLoadData= ruleLoadData EOF
            {
             newCompositeNode(grammarAccess.getLoadDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadData=ruleLoadData();

            state._fsp--;

             current =iv_ruleLoadData; 
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
    // $ANTLR end "entryRuleLoadData"


    // $ANTLR start "ruleLoadData"
    // InternalTableDSL.g:224:1: ruleLoadData returns [EObject current=null] : (otherlv_0= 'load' this_TableInputPath_1= ruleTableInputPath ) ;
    public final EObject ruleLoadData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TableInputPath_1 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:230:2: ( (otherlv_0= 'load' this_TableInputPath_1= ruleTableInputPath ) )
            // InternalTableDSL.g:231:2: (otherlv_0= 'load' this_TableInputPath_1= ruleTableInputPath )
            {
            // InternalTableDSL.g:231:2: (otherlv_0= 'load' this_TableInputPath_1= ruleTableInputPath )
            // InternalTableDSL.g:232:3: otherlv_0= 'load' this_TableInputPath_1= ruleTableInputPath
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadDataAccess().getLoadKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLoadDataAccess().getTableInputPathParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_TableInputPath_1=ruleTableInputPath();

            state._fsp--;


            			current = this_TableInputPath_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleLoadData"


    // $ANTLR start "entryRuleTableInputPath"
    // InternalTableDSL.g:248:1: entryRuleTableInputPath returns [EObject current=null] : iv_ruleTableInputPath= ruleTableInputPath EOF ;
    public final EObject entryRuleTableInputPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableInputPath = null;


        try {
            // InternalTableDSL.g:248:55: (iv_ruleTableInputPath= ruleTableInputPath EOF )
            // InternalTableDSL.g:249:2: iv_ruleTableInputPath= ruleTableInputPath EOF
            {
             newCompositeNode(grammarAccess.getTableInputPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableInputPath=ruleTableInputPath();

            state._fsp--;

             current =iv_ruleTableInputPath; 
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
    // $ANTLR end "entryRuleTableInputPath"


    // $ANTLR start "ruleTableInputPath"
    // InternalTableDSL.g:255:1: ruleTableInputPath returns [EObject current=null] : ( ( (lv_pathPatterns_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleTableInputPath() throws RecognitionException {
        EObject current = null;

        Token lv_pathPatterns_0_0=null;
        Token otherlv_1=null;
        Token lv_pathPatterns_2_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:261:2: ( ( ( (lv_pathPatterns_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )* ) )
            // InternalTableDSL.g:262:2: ( ( (lv_pathPatterns_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )* )
            {
            // InternalTableDSL.g:262:2: ( ( (lv_pathPatterns_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )* )
            // InternalTableDSL.g:263:3: ( (lv_pathPatterns_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )*
            {
            // InternalTableDSL.g:263:3: ( (lv_pathPatterns_0_0= RULE_STRING ) )
            // InternalTableDSL.g:264:4: (lv_pathPatterns_0_0= RULE_STRING )
            {
            // InternalTableDSL.g:264:4: (lv_pathPatterns_0_0= RULE_STRING )
            // InternalTableDSL.g:265:5: lv_pathPatterns_0_0= RULE_STRING
            {
            lv_pathPatterns_0_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_pathPatterns_0_0, grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableInputPathRule());
            					}
            					addWithLastConsumed(
            						current,
            						"pathPatterns",
            						lv_pathPatterns_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTableDSL.g:281:3: (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTableDSL.g:282:4: otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTableInputPathAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTableDSL.g:286:4: ( (lv_pathPatterns_2_0= RULE_STRING ) )
            	    // InternalTableDSL.g:287:5: (lv_pathPatterns_2_0= RULE_STRING )
            	    {
            	    // InternalTableDSL.g:287:5: (lv_pathPatterns_2_0= RULE_STRING )
            	    // InternalTableDSL.g:288:6: lv_pathPatterns_2_0= RULE_STRING
            	    {
            	    lv_pathPatterns_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    						newLeafNode(lv_pathPatterns_2_0, grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTableInputPathRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"pathPatterns",
            	    							lv_pathPatterns_2_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleTableInputPath"


    // $ANTLR start "entryRuleOutput"
    // InternalTableDSL.g:309:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalTableDSL.g:309:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalTableDSL.g:310:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalTableDSL.g:316:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'output' otherlv_1= 'to' ( (lv_outputPaths_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_outputPaths_2_0=null;
        Token otherlv_3=null;
        Token lv_outputPaths_4_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:322:2: ( (otherlv_0= 'output' otherlv_1= 'to' ( (lv_outputPaths_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )* ) )
            // InternalTableDSL.g:323:2: (otherlv_0= 'output' otherlv_1= 'to' ( (lv_outputPaths_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )* )
            {
            // InternalTableDSL.g:323:2: (otherlv_0= 'output' otherlv_1= 'to' ( (lv_outputPaths_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )* )
            // InternalTableDSL.g:324:3: otherlv_0= 'output' otherlv_1= 'to' ( (lv_outputPaths_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getToKeyword_1());
            		
            // InternalTableDSL.g:332:3: ( (lv_outputPaths_2_0= RULE_STRING ) )
            // InternalTableDSL.g:333:4: (lv_outputPaths_2_0= RULE_STRING )
            {
            // InternalTableDSL.g:333:4: (lv_outputPaths_2_0= RULE_STRING )
            // InternalTableDSL.g:334:5: lv_outputPaths_2_0= RULE_STRING
            {
            lv_outputPaths_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_outputPaths_2_0, grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					addWithLastConsumed(
            						current,
            						"outputPaths",
            						lv_outputPaths_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTableDSL.g:350:3: (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTableDSL.g:351:4: otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTableDSL.g:355:4: ( (lv_outputPaths_4_0= RULE_STRING ) )
            	    // InternalTableDSL.g:356:5: (lv_outputPaths_4_0= RULE_STRING )
            	    {
            	    // InternalTableDSL.g:356:5: (lv_outputPaths_4_0= RULE_STRING )
            	    // InternalTableDSL.g:357:6: lv_outputPaths_4_0= RULE_STRING
            	    {
            	    lv_outputPaths_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    						newLeafNode(lv_outputPaths_4_0, grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOutputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"outputPaths",
            	    							lv_outputPaths_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleOperation"
    // InternalTableDSL.g:378:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalTableDSL.g:378:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalTableDSL.g:379:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalTableDSL.g:385:1: ruleOperation returns [EObject current=null] : (this_Select_0= ruleSelect | this_RenameColumn_1= ruleRenameColumn | this_Extract_2= ruleExtract | this_SquashRows_3= ruleSquashRows | this_Filter_4= ruleFilter ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Select_0 = null;

        EObject this_RenameColumn_1 = null;

        EObject this_Extract_2 = null;

        EObject this_SquashRows_3 = null;

        EObject this_Filter_4 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:391:2: ( (this_Select_0= ruleSelect | this_RenameColumn_1= ruleRenameColumn | this_Extract_2= ruleExtract | this_SquashRows_3= ruleSquashRows | this_Filter_4= ruleFilter ) )
            // InternalTableDSL.g:392:2: (this_Select_0= ruleSelect | this_RenameColumn_1= ruleRenameColumn | this_Extract_2= ruleExtract | this_SquashRows_3= ruleSquashRows | this_Filter_4= ruleFilter )
            {
            // InternalTableDSL.g:392:2: (this_Select_0= ruleSelect | this_RenameColumn_1= ruleRenameColumn | this_Extract_2= ruleExtract | this_SquashRows_3= ruleSquashRows | this_Filter_4= ruleFilter )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 30:
                {
                alt7=4;
                }
                break;
            case 32:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTableDSL.g:393:3: this_Select_0= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getSelectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_0=ruleSelect();

                    state._fsp--;


                    			current = this_Select_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:402:3: this_RenameColumn_1= ruleRenameColumn
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getRenameColumnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameColumn_1=ruleRenameColumn();

                    state._fsp--;


                    			current = this_RenameColumn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:411:3: this_Extract_2= ruleExtract
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getExtractParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extract_2=ruleExtract();

                    state._fsp--;


                    			current = this_Extract_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTableDSL.g:420:3: this_SquashRows_3= ruleSquashRows
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getSquashRowsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SquashRows_3=ruleSquashRows();

                    state._fsp--;


                    			current = this_SquashRows_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTableDSL.g:429:3: this_Filter_4= ruleFilter
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getFilterParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Filter_4=ruleFilter();

                    state._fsp--;


                    			current = this_Filter_4;
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelect"
    // InternalTableDSL.g:441:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalTableDSL.g:441:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalTableDSL.g:442:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalTableDSL.g:448:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_columnsPatterns_1_0= ruleColumnName ) ) (otherlv_2= ',' ( (lv_columnPatterns_3_0= ruleColumnName ) ) )* ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_columnsPatterns_1_0 = null;

        EObject lv_columnPatterns_3_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:454:2: ( (otherlv_0= 'select' ( (lv_columnsPatterns_1_0= ruleColumnName ) ) (otherlv_2= ',' ( (lv_columnPatterns_3_0= ruleColumnName ) ) )* ) )
            // InternalTableDSL.g:455:2: (otherlv_0= 'select' ( (lv_columnsPatterns_1_0= ruleColumnName ) ) (otherlv_2= ',' ( (lv_columnPatterns_3_0= ruleColumnName ) ) )* )
            {
            // InternalTableDSL.g:455:2: (otherlv_0= 'select' ( (lv_columnsPatterns_1_0= ruleColumnName ) ) (otherlv_2= ',' ( (lv_columnPatterns_3_0= ruleColumnName ) ) )* )
            // InternalTableDSL.g:456:3: otherlv_0= 'select' ( (lv_columnsPatterns_1_0= ruleColumnName ) ) (otherlv_2= ',' ( (lv_columnPatterns_3_0= ruleColumnName ) ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalTableDSL.g:460:3: ( (lv_columnsPatterns_1_0= ruleColumnName ) )
            // InternalTableDSL.g:461:4: (lv_columnsPatterns_1_0= ruleColumnName )
            {
            // InternalTableDSL.g:461:4: (lv_columnsPatterns_1_0= ruleColumnName )
            // InternalTableDSL.g:462:5: lv_columnsPatterns_1_0= ruleColumnName
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getColumnsPatternsColumnNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_columnsPatterns_1_0=ruleColumnName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					add(
            						current,
            						"columnsPatterns",
            						lv_columnsPatterns_1_0,
            						"org.feup.els5.dsl.TableDSL.ColumnName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTableDSL.g:479:3: (otherlv_2= ',' ( (lv_columnPatterns_3_0= ruleColumnName ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTableDSL.g:480:4: otherlv_2= ',' ( (lv_columnPatterns_3_0= ruleColumnName ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalTableDSL.g:484:4: ( (lv_columnPatterns_3_0= ruleColumnName ) )
            	    // InternalTableDSL.g:485:5: (lv_columnPatterns_3_0= ruleColumnName )
            	    {
            	    // InternalTableDSL.g:485:5: (lv_columnPatterns_3_0= ruleColumnName )
            	    // InternalTableDSL.g:486:6: lv_columnPatterns_3_0= ruleColumnName
            	    {

            	    						newCompositeNode(grammarAccess.getSelectAccess().getColumnPatternsColumnNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_columnPatterns_3_0=ruleColumnName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columnPatterns",
            	    							lv_columnPatterns_3_0,
            	    							"org.feup.els5.dsl.TableDSL.ColumnName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleRenameColumn"
    // InternalTableDSL.g:508:1: entryRuleRenameColumn returns [EObject current=null] : iv_ruleRenameColumn= ruleRenameColumn EOF ;
    public final EObject entryRuleRenameColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameColumn = null;


        try {
            // InternalTableDSL.g:508:53: (iv_ruleRenameColumn= ruleRenameColumn EOF )
            // InternalTableDSL.g:509:2: iv_ruleRenameColumn= ruleRenameColumn EOF
            {
             newCompositeNode(grammarAccess.getRenameColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameColumn=ruleRenameColumn();

            state._fsp--;

             current =iv_ruleRenameColumn; 
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
    // $ANTLR end "entryRuleRenameColumn"


    // $ANTLR start "ruleRenameColumn"
    // InternalTableDSL.g:515:1: ruleRenameColumn returns [EObject current=null] : (otherlv_0= 'rename' (otherlv_1= 'column' )? ( (lv_renameTuples_2_0= ruleRenameColumnPair ) )+ ) ;
    public final EObject ruleRenameColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_renameTuples_2_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:521:2: ( (otherlv_0= 'rename' (otherlv_1= 'column' )? ( (lv_renameTuples_2_0= ruleRenameColumnPair ) )+ ) )
            // InternalTableDSL.g:522:2: (otherlv_0= 'rename' (otherlv_1= 'column' )? ( (lv_renameTuples_2_0= ruleRenameColumnPair ) )+ )
            {
            // InternalTableDSL.g:522:2: (otherlv_0= 'rename' (otherlv_1= 'column' )? ( (lv_renameTuples_2_0= ruleRenameColumnPair ) )+ )
            // InternalTableDSL.g:523:3: otherlv_0= 'rename' (otherlv_1= 'column' )? ( (lv_renameTuples_2_0= ruleRenameColumnPair ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameColumnAccess().getRenameKeyword_0());
            		
            // InternalTableDSL.g:527:3: (otherlv_1= 'column' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTableDSL.g:528:4: otherlv_1= 'column'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getRenameColumnAccess().getColumnKeyword_1());
                    			

                    }
                    break;

            }

            // InternalTableDSL.g:533:3: ( (lv_renameTuples_2_0= ruleRenameColumnPair ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTableDSL.g:534:4: (lv_renameTuples_2_0= ruleRenameColumnPair )
            	    {
            	    // InternalTableDSL.g:534:4: (lv_renameTuples_2_0= ruleRenameColumnPair )
            	    // InternalTableDSL.g:535:5: lv_renameTuples_2_0= ruleRenameColumnPair
            	    {

            	    					newCompositeNode(grammarAccess.getRenameColumnAccess().getRenameTuplesRenameColumnPairParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_renameTuples_2_0=ruleRenameColumnPair();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRenameColumnRule());
            	    					}
            	    					add(
            	    						current,
            	    						"renameTuples",
            	    						lv_renameTuples_2_0,
            	    						"org.feup.els5.dsl.TableDSL.RenameColumnPair");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


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
    // $ANTLR end "ruleRenameColumn"


    // $ANTLR start "entryRuleRenameColumnPair"
    // InternalTableDSL.g:556:1: entryRuleRenameColumnPair returns [EObject current=null] : iv_ruleRenameColumnPair= ruleRenameColumnPair EOF ;
    public final EObject entryRuleRenameColumnPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameColumnPair = null;


        try {
            // InternalTableDSL.g:556:57: (iv_ruleRenameColumnPair= ruleRenameColumnPair EOF )
            // InternalTableDSL.g:557:2: iv_ruleRenameColumnPair= ruleRenameColumnPair EOF
            {
             newCompositeNode(grammarAccess.getRenameColumnPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameColumnPair=ruleRenameColumnPair();

            state._fsp--;

             current =iv_ruleRenameColumnPair; 
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
    // $ANTLR end "entryRuleRenameColumnPair"


    // $ANTLR start "ruleRenameColumnPair"
    // InternalTableDSL.g:563:1: ruleRenameColumnPair returns [EObject current=null] : (this_RenameColumnToPair_0= ruleRenameColumnToPair | this_RenameColumnAppendPair_1= ruleRenameColumnAppendPair | this_RenameColumnPrependPair_2= ruleRenameColumnPrependPair ) ;
    public final EObject ruleRenameColumnPair() throws RecognitionException {
        EObject current = null;

        EObject this_RenameColumnToPair_0 = null;

        EObject this_RenameColumnAppendPair_1 = null;

        EObject this_RenameColumnPrependPair_2 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:569:2: ( (this_RenameColumnToPair_0= ruleRenameColumnToPair | this_RenameColumnAppendPair_1= ruleRenameColumnAppendPair | this_RenameColumnPrependPair_2= ruleRenameColumnPrependPair ) )
            // InternalTableDSL.g:570:2: (this_RenameColumnToPair_0= ruleRenameColumnToPair | this_RenameColumnAppendPair_1= ruleRenameColumnAppendPair | this_RenameColumnPrependPair_2= ruleRenameColumnPrependPair )
            {
            // InternalTableDSL.g:570:2: (this_RenameColumnToPair_0= ruleRenameColumnToPair | this_RenameColumnAppendPair_1= ruleRenameColumnAppendPair | this_RenameColumnPrependPair_2= ruleRenameColumnPrependPair )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt11=3;
                    }
                    break;
                case 19:
                    {
                    alt11=1;
                    }
                    break;
                case 24:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTableDSL.g:571:3: this_RenameColumnToPair_0= ruleRenameColumnToPair
                    {

                    			newCompositeNode(grammarAccess.getRenameColumnPairAccess().getRenameColumnToPairParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameColumnToPair_0=ruleRenameColumnToPair();

                    state._fsp--;


                    			current = this_RenameColumnToPair_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:580:3: this_RenameColumnAppendPair_1= ruleRenameColumnAppendPair
                    {

                    			newCompositeNode(grammarAccess.getRenameColumnPairAccess().getRenameColumnAppendPairParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameColumnAppendPair_1=ruleRenameColumnAppendPair();

                    state._fsp--;


                    			current = this_RenameColumnAppendPair_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:589:3: this_RenameColumnPrependPair_2= ruleRenameColumnPrependPair
                    {

                    			newCompositeNode(grammarAccess.getRenameColumnPairAccess().getRenameColumnPrependPairParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameColumnPrependPair_2=ruleRenameColumnPrependPair();

                    state._fsp--;


                    			current = this_RenameColumnPrependPair_2;
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
    // $ANTLR end "ruleRenameColumnPair"


    // $ANTLR start "entryRuleRenameColumnToPair"
    // InternalTableDSL.g:601:1: entryRuleRenameColumnToPair returns [EObject current=null] : iv_ruleRenameColumnToPair= ruleRenameColumnToPair EOF ;
    public final EObject entryRuleRenameColumnToPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameColumnToPair = null;


        try {
            // InternalTableDSL.g:601:59: (iv_ruleRenameColumnToPair= ruleRenameColumnToPair EOF )
            // InternalTableDSL.g:602:2: iv_ruleRenameColumnToPair= ruleRenameColumnToPair EOF
            {
             newCompositeNode(grammarAccess.getRenameColumnToPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameColumnToPair=ruleRenameColumnToPair();

            state._fsp--;

             current =iv_ruleRenameColumnToPair; 
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
    // $ANTLR end "entryRuleRenameColumnToPair"


    // $ANTLR start "ruleRenameColumnToPair"
    // InternalTableDSL.g:608:1: ruleRenameColumnToPair returns [EObject current=null] : ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'to' ( (lv_newName_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleRenameColumnToPair() throws RecognitionException {
        EObject current = null;

        Token lv_oldName_0_0=null;
        Token otherlv_1=null;
        Token lv_newName_2_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:614:2: ( ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'to' ( (lv_newName_2_0= RULE_STRING ) ) ) )
            // InternalTableDSL.g:615:2: ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'to' ( (lv_newName_2_0= RULE_STRING ) ) )
            {
            // InternalTableDSL.g:615:2: ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'to' ( (lv_newName_2_0= RULE_STRING ) ) )
            // InternalTableDSL.g:616:3: ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'to' ( (lv_newName_2_0= RULE_STRING ) )
            {
            // InternalTableDSL.g:616:3: ( (lv_oldName_0_0= RULE_STRING ) )
            // InternalTableDSL.g:617:4: (lv_oldName_0_0= RULE_STRING )
            {
            // InternalTableDSL.g:617:4: (lv_oldName_0_0= RULE_STRING )
            // InternalTableDSL.g:618:5: lv_oldName_0_0= RULE_STRING
            {
            lv_oldName_0_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_oldName_0_0, grammarAccess.getRenameColumnToPairAccess().getOldNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnToPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"oldName",
            						lv_oldName_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameColumnToPairAccess().getToKeyword_1());
            		
            // InternalTableDSL.g:638:3: ( (lv_newName_2_0= RULE_STRING ) )
            // InternalTableDSL.g:639:4: (lv_newName_2_0= RULE_STRING )
            {
            // InternalTableDSL.g:639:4: (lv_newName_2_0= RULE_STRING )
            // InternalTableDSL.g:640:5: lv_newName_2_0= RULE_STRING
            {
            lv_newName_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_newName_2_0, grammarAccess.getRenameColumnToPairAccess().getNewNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnToPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newName",
            						lv_newName_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleRenameColumnToPair"


    // $ANTLR start "entryRuleRenameColumnPrependPair"
    // InternalTableDSL.g:660:1: entryRuleRenameColumnPrependPair returns [EObject current=null] : iv_ruleRenameColumnPrependPair= ruleRenameColumnPrependPair EOF ;
    public final EObject entryRuleRenameColumnPrependPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameColumnPrependPair = null;


        try {
            // InternalTableDSL.g:660:64: (iv_ruleRenameColumnPrependPair= ruleRenameColumnPrependPair EOF )
            // InternalTableDSL.g:661:2: iv_ruleRenameColumnPrependPair= ruleRenameColumnPrependPair EOF
            {
             newCompositeNode(grammarAccess.getRenameColumnPrependPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameColumnPrependPair=ruleRenameColumnPrependPair();

            state._fsp--;

             current =iv_ruleRenameColumnPrependPair; 
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
    // $ANTLR end "entryRuleRenameColumnPrependPair"


    // $ANTLR start "ruleRenameColumnPrependPair"
    // InternalTableDSL.g:667:1: ruleRenameColumnPrependPair returns [EObject current=null] : ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'prepend' ( (lv_prefix_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleRenameColumnPrependPair() throws RecognitionException {
        EObject current = null;

        Token lv_oldName_0_0=null;
        Token otherlv_1=null;
        Token lv_prefix_2_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:673:2: ( ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'prepend' ( (lv_prefix_2_0= RULE_STRING ) ) ) )
            // InternalTableDSL.g:674:2: ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'prepend' ( (lv_prefix_2_0= RULE_STRING ) ) )
            {
            // InternalTableDSL.g:674:2: ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'prepend' ( (lv_prefix_2_0= RULE_STRING ) ) )
            // InternalTableDSL.g:675:3: ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'prepend' ( (lv_prefix_2_0= RULE_STRING ) )
            {
            // InternalTableDSL.g:675:3: ( (lv_oldName_0_0= RULE_STRING ) )
            // InternalTableDSL.g:676:4: (lv_oldName_0_0= RULE_STRING )
            {
            // InternalTableDSL.g:676:4: (lv_oldName_0_0= RULE_STRING )
            // InternalTableDSL.g:677:5: lv_oldName_0_0= RULE_STRING
            {
            lv_oldName_0_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_oldName_0_0, grammarAccess.getRenameColumnPrependPairAccess().getOldNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnPrependPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"oldName",
            						lv_oldName_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameColumnPrependPairAccess().getPrependKeyword_1());
            		
            // InternalTableDSL.g:697:3: ( (lv_prefix_2_0= RULE_STRING ) )
            // InternalTableDSL.g:698:4: (lv_prefix_2_0= RULE_STRING )
            {
            // InternalTableDSL.g:698:4: (lv_prefix_2_0= RULE_STRING )
            // InternalTableDSL.g:699:5: lv_prefix_2_0= RULE_STRING
            {
            lv_prefix_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_prefix_2_0, grammarAccess.getRenameColumnPrependPairAccess().getPrefixSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnPrependPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prefix",
            						lv_prefix_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleRenameColumnPrependPair"


    // $ANTLR start "entryRuleRenameColumnAppendPair"
    // InternalTableDSL.g:719:1: entryRuleRenameColumnAppendPair returns [EObject current=null] : iv_ruleRenameColumnAppendPair= ruleRenameColumnAppendPair EOF ;
    public final EObject entryRuleRenameColumnAppendPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameColumnAppendPair = null;


        try {
            // InternalTableDSL.g:719:63: (iv_ruleRenameColumnAppendPair= ruleRenameColumnAppendPair EOF )
            // InternalTableDSL.g:720:2: iv_ruleRenameColumnAppendPair= ruleRenameColumnAppendPair EOF
            {
             newCompositeNode(grammarAccess.getRenameColumnAppendPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameColumnAppendPair=ruleRenameColumnAppendPair();

            state._fsp--;

             current =iv_ruleRenameColumnAppendPair; 
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
    // $ANTLR end "entryRuleRenameColumnAppendPair"


    // $ANTLR start "ruleRenameColumnAppendPair"
    // InternalTableDSL.g:726:1: ruleRenameColumnAppendPair returns [EObject current=null] : ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'append' ( (lv_suffix_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleRenameColumnAppendPair() throws RecognitionException {
        EObject current = null;

        Token lv_oldName_0_0=null;
        Token otherlv_1=null;
        Token lv_suffix_2_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:732:2: ( ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'append' ( (lv_suffix_2_0= RULE_STRING ) ) ) )
            // InternalTableDSL.g:733:2: ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'append' ( (lv_suffix_2_0= RULE_STRING ) ) )
            {
            // InternalTableDSL.g:733:2: ( ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'append' ( (lv_suffix_2_0= RULE_STRING ) ) )
            // InternalTableDSL.g:734:3: ( (lv_oldName_0_0= RULE_STRING ) ) otherlv_1= 'append' ( (lv_suffix_2_0= RULE_STRING ) )
            {
            // InternalTableDSL.g:734:3: ( (lv_oldName_0_0= RULE_STRING ) )
            // InternalTableDSL.g:735:4: (lv_oldName_0_0= RULE_STRING )
            {
            // InternalTableDSL.g:735:4: (lv_oldName_0_0= RULE_STRING )
            // InternalTableDSL.g:736:5: lv_oldName_0_0= RULE_STRING
            {
            lv_oldName_0_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_oldName_0_0, grammarAccess.getRenameColumnAppendPairAccess().getOldNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnAppendPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"oldName",
            						lv_oldName_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameColumnAppendPairAccess().getAppendKeyword_1());
            		
            // InternalTableDSL.g:756:3: ( (lv_suffix_2_0= RULE_STRING ) )
            // InternalTableDSL.g:757:4: (lv_suffix_2_0= RULE_STRING )
            {
            // InternalTableDSL.g:757:4: (lv_suffix_2_0= RULE_STRING )
            // InternalTableDSL.g:758:5: lv_suffix_2_0= RULE_STRING
            {
            lv_suffix_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_suffix_2_0, grammarAccess.getRenameColumnAppendPairAccess().getSuffixSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnAppendPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"suffix",
            						lv_suffix_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleRenameColumnAppendPair"


    // $ANTLR start "entryRuleExtract"
    // InternalTableDSL.g:778:1: entryRuleExtract returns [EObject current=null] : iv_ruleExtract= ruleExtract EOF ;
    public final EObject entryRuleExtract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtract = null;


        try {
            // InternalTableDSL.g:778:48: (iv_ruleExtract= ruleExtract EOF )
            // InternalTableDSL.g:779:2: iv_ruleExtract= ruleExtract EOF
            {
             newCompositeNode(grammarAccess.getExtractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtract=ruleExtract();

            state._fsp--;

             current =iv_ruleExtract; 
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
    // $ANTLR end "entryRuleExtract"


    // $ANTLR start "ruleExtract"
    // InternalTableDSL.g:785:1: ruleExtract returns [EObject current=null] : (otherlv_0= 'extract' ( (lv_targets_1_0= ruleExtractColumnMapping ) ) (otherlv_2= ',' ( (lv_targets_3_0= ruleExtractColumnMapping ) ) )* otherlv_4= 'from' ( (lv_sourceColumn_5_0= RULE_STRING ) ) otherlv_6= 'select' ( (lv_selector_7_0= ruleSelector ) ) otherlv_8= 'sort' (otherlv_9= 'by' )? ( (lv_comparator_10_0= ruleComparator ) ) ) ;
    public final EObject ruleExtract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_sourceColumn_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_targets_1_0 = null;

        EObject lv_targets_3_0 = null;

        EObject lv_selector_7_0 = null;

        EObject lv_comparator_10_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:791:2: ( (otherlv_0= 'extract' ( (lv_targets_1_0= ruleExtractColumnMapping ) ) (otherlv_2= ',' ( (lv_targets_3_0= ruleExtractColumnMapping ) ) )* otherlv_4= 'from' ( (lv_sourceColumn_5_0= RULE_STRING ) ) otherlv_6= 'select' ( (lv_selector_7_0= ruleSelector ) ) otherlv_8= 'sort' (otherlv_9= 'by' )? ( (lv_comparator_10_0= ruleComparator ) ) ) )
            // InternalTableDSL.g:792:2: (otherlv_0= 'extract' ( (lv_targets_1_0= ruleExtractColumnMapping ) ) (otherlv_2= ',' ( (lv_targets_3_0= ruleExtractColumnMapping ) ) )* otherlv_4= 'from' ( (lv_sourceColumn_5_0= RULE_STRING ) ) otherlv_6= 'select' ( (lv_selector_7_0= ruleSelector ) ) otherlv_8= 'sort' (otherlv_9= 'by' )? ( (lv_comparator_10_0= ruleComparator ) ) )
            {
            // InternalTableDSL.g:792:2: (otherlv_0= 'extract' ( (lv_targets_1_0= ruleExtractColumnMapping ) ) (otherlv_2= ',' ( (lv_targets_3_0= ruleExtractColumnMapping ) ) )* otherlv_4= 'from' ( (lv_sourceColumn_5_0= RULE_STRING ) ) otherlv_6= 'select' ( (lv_selector_7_0= ruleSelector ) ) otherlv_8= 'sort' (otherlv_9= 'by' )? ( (lv_comparator_10_0= ruleComparator ) ) )
            // InternalTableDSL.g:793:3: otherlv_0= 'extract' ( (lv_targets_1_0= ruleExtractColumnMapping ) ) (otherlv_2= ',' ( (lv_targets_3_0= ruleExtractColumnMapping ) ) )* otherlv_4= 'from' ( (lv_sourceColumn_5_0= RULE_STRING ) ) otherlv_6= 'select' ( (lv_selector_7_0= ruleSelector ) ) otherlv_8= 'sort' (otherlv_9= 'by' )? ( (lv_comparator_10_0= ruleComparator ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExtractAccess().getExtractKeyword_0());
            		
            // InternalTableDSL.g:797:3: ( (lv_targets_1_0= ruleExtractColumnMapping ) )
            // InternalTableDSL.g:798:4: (lv_targets_1_0= ruleExtractColumnMapping )
            {
            // InternalTableDSL.g:798:4: (lv_targets_1_0= ruleExtractColumnMapping )
            // InternalTableDSL.g:799:5: lv_targets_1_0= ruleExtractColumnMapping
            {

            					newCompositeNode(grammarAccess.getExtractAccess().getTargetsExtractColumnMappingParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_targets_1_0=ruleExtractColumnMapping();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtractRule());
            					}
            					add(
            						current,
            						"targets",
            						lv_targets_1_0,
            						"org.feup.els5.dsl.TableDSL.ExtractColumnMapping");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTableDSL.g:816:3: (otherlv_2= ',' ( (lv_targets_3_0= ruleExtractColumnMapping ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTableDSL.g:817:4: otherlv_2= ',' ( (lv_targets_3_0= ruleExtractColumnMapping ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExtractAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalTableDSL.g:821:4: ( (lv_targets_3_0= ruleExtractColumnMapping ) )
            	    // InternalTableDSL.g:822:5: (lv_targets_3_0= ruleExtractColumnMapping )
            	    {
            	    // InternalTableDSL.g:822:5: (lv_targets_3_0= ruleExtractColumnMapping )
            	    // InternalTableDSL.g:823:6: lv_targets_3_0= ruleExtractColumnMapping
            	    {

            	    						newCompositeNode(grammarAccess.getExtractAccess().getTargetsExtractColumnMappingParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_targets_3_0=ruleExtractColumnMapping();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExtractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targets",
            	    							lv_targets_3_0,
            	    							"org.feup.els5.dsl.TableDSL.ExtractColumnMapping");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getExtractAccess().getFromKeyword_3());
            		
            // InternalTableDSL.g:845:3: ( (lv_sourceColumn_5_0= RULE_STRING ) )
            // InternalTableDSL.g:846:4: (lv_sourceColumn_5_0= RULE_STRING )
            {
            // InternalTableDSL.g:846:4: (lv_sourceColumn_5_0= RULE_STRING )
            // InternalTableDSL.g:847:5: lv_sourceColumn_5_0= RULE_STRING
            {
            lv_sourceColumn_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_sourceColumn_5_0, grammarAccess.getExtractAccess().getSourceColumnSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtractRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceColumn",
            						lv_sourceColumn_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getExtractAccess().getSelectKeyword_5());
            		
            // InternalTableDSL.g:867:3: ( (lv_selector_7_0= ruleSelector ) )
            // InternalTableDSL.g:868:4: (lv_selector_7_0= ruleSelector )
            {
            // InternalTableDSL.g:868:4: (lv_selector_7_0= ruleSelector )
            // InternalTableDSL.g:869:5: lv_selector_7_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getExtractAccess().getSelectorSelectorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_selector_7_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtractRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_7_0,
            						"org.feup.els5.dsl.TableDSL.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getExtractAccess().getSortKeyword_7());
            		
            // InternalTableDSL.g:890:3: (otherlv_9= 'by' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTableDSL.g:891:4: otherlv_9= 'by'
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getExtractAccess().getByKeyword_8());
                    			

                    }
                    break;

            }

            // InternalTableDSL.g:896:3: ( (lv_comparator_10_0= ruleComparator ) )
            // InternalTableDSL.g:897:4: (lv_comparator_10_0= ruleComparator )
            {
            // InternalTableDSL.g:897:4: (lv_comparator_10_0= ruleComparator )
            // InternalTableDSL.g:898:5: lv_comparator_10_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getExtractAccess().getComparatorComparatorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_comparator_10_0=ruleComparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtractRule());
            					}
            					set(
            						current,
            						"comparator",
            						lv_comparator_10_0,
            						"org.feup.els5.dsl.TableDSL.Comparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleExtract"


    // $ANTLR start "entryRuleExtractColumnMapping"
    // InternalTableDSL.g:919:1: entryRuleExtractColumnMapping returns [EObject current=null] : iv_ruleExtractColumnMapping= ruleExtractColumnMapping EOF ;
    public final EObject entryRuleExtractColumnMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractColumnMapping = null;


        try {
            // InternalTableDSL.g:919:61: (iv_ruleExtractColumnMapping= ruleExtractColumnMapping EOF )
            // InternalTableDSL.g:920:2: iv_ruleExtractColumnMapping= ruleExtractColumnMapping EOF
            {
             newCompositeNode(grammarAccess.getExtractColumnMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtractColumnMapping=ruleExtractColumnMapping();

            state._fsp--;

             current =iv_ruleExtractColumnMapping; 
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
    // $ANTLR end "entryRuleExtractColumnMapping"


    // $ANTLR start "ruleExtractColumnMapping"
    // InternalTableDSL.g:926:1: ruleExtractColumnMapping returns [EObject current=null] : ( ( (lv_targetColumn_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_newName_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleExtractColumnMapping() throws RecognitionException {
        EObject current = null;

        Token lv_targetColumn_0_0=null;
        Token otherlv_1=null;
        Token lv_newName_2_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:932:2: ( ( ( (lv_targetColumn_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_newName_2_0= RULE_STRING ) ) )? ) )
            // InternalTableDSL.g:933:2: ( ( (lv_targetColumn_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_newName_2_0= RULE_STRING ) ) )? )
            {
            // InternalTableDSL.g:933:2: ( ( (lv_targetColumn_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_newName_2_0= RULE_STRING ) ) )? )
            // InternalTableDSL.g:934:3: ( (lv_targetColumn_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_newName_2_0= RULE_STRING ) ) )?
            {
            // InternalTableDSL.g:934:3: ( (lv_targetColumn_0_0= RULE_STRING ) )
            // InternalTableDSL.g:935:4: (lv_targetColumn_0_0= RULE_STRING )
            {
            // InternalTableDSL.g:935:4: (lv_targetColumn_0_0= RULE_STRING )
            // InternalTableDSL.g:936:5: lv_targetColumn_0_0= RULE_STRING
            {
            lv_targetColumn_0_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_targetColumn_0_0, grammarAccess.getExtractColumnMappingAccess().getTargetColumnSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtractColumnMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"targetColumn",
            						lv_targetColumn_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTableDSL.g:952:3: (otherlv_1= 'as' ( (lv_newName_2_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTableDSL.g:953:4: otherlv_1= 'as' ( (lv_newName_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getExtractColumnMappingAccess().getAsKeyword_1_0());
                    			
                    // InternalTableDSL.g:957:4: ( (lv_newName_2_0= RULE_STRING ) )
                    // InternalTableDSL.g:958:5: (lv_newName_2_0= RULE_STRING )
                    {
                    // InternalTableDSL.g:958:5: (lv_newName_2_0= RULE_STRING )
                    // InternalTableDSL.g:959:6: lv_newName_2_0= RULE_STRING
                    {
                    lv_newName_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_newName_2_0, grammarAccess.getExtractColumnMappingAccess().getNewNameSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtractColumnMappingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"newName",
                    							lv_newName_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleExtractColumnMapping"


    // $ANTLR start "entryRuleSelector"
    // InternalTableDSL.g:980:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalTableDSL.g:980:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalTableDSL.g:981:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalTableDSL.g:987:1: ruleSelector returns [EObject current=null] : (this_KeySelector_0= ruleKeySelector | this_TopNSelector_1= ruleTopNSelector ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        EObject this_KeySelector_0 = null;

        EObject this_TopNSelector_1 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:993:2: ( (this_KeySelector_0= ruleKeySelector | this_TopNSelector_1= ruleTopNSelector ) )
            // InternalTableDSL.g:994:2: (this_KeySelector_0= ruleKeySelector | this_TopNSelector_1= ruleTopNSelector )
            {
            // InternalTableDSL.g:994:2: (this_KeySelector_0= ruleKeySelector | this_TopNSelector_1= ruleTopNSelector )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_SELECTOR_KEYWORDS) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalTableDSL.g:995:3: this_KeySelector_0= ruleKeySelector
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getKeySelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeySelector_0=ruleKeySelector();

                    state._fsp--;


                    			current = this_KeySelector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:1004:3: this_TopNSelector_1= ruleTopNSelector
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getTopNSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TopNSelector_1=ruleTopNSelector();

                    state._fsp--;


                    			current = this_TopNSelector_1;
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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleKeySelector"
    // InternalTableDSL.g:1016:1: entryRuleKeySelector returns [EObject current=null] : iv_ruleKeySelector= ruleKeySelector EOF ;
    public final EObject entryRuleKeySelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeySelector = null;


        try {
            // InternalTableDSL.g:1016:52: (iv_ruleKeySelector= ruleKeySelector EOF )
            // InternalTableDSL.g:1017:2: iv_ruleKeySelector= ruleKeySelector EOF
            {
             newCompositeNode(grammarAccess.getKeySelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeySelector=ruleKeySelector();

            state._fsp--;

             current =iv_ruleKeySelector; 
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
    // $ANTLR end "entryRuleKeySelector"


    // $ANTLR start "ruleKeySelector"
    // InternalTableDSL.g:1023:1: ruleKeySelector returns [EObject current=null] : ( (lv_key_0_0= RULE_SELECTOR_KEYWORDS ) ) ;
    public final EObject ruleKeySelector() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:1029:2: ( ( (lv_key_0_0= RULE_SELECTOR_KEYWORDS ) ) )
            // InternalTableDSL.g:1030:2: ( (lv_key_0_0= RULE_SELECTOR_KEYWORDS ) )
            {
            // InternalTableDSL.g:1030:2: ( (lv_key_0_0= RULE_SELECTOR_KEYWORDS ) )
            // InternalTableDSL.g:1031:3: (lv_key_0_0= RULE_SELECTOR_KEYWORDS )
            {
            // InternalTableDSL.g:1031:3: (lv_key_0_0= RULE_SELECTOR_KEYWORDS )
            // InternalTableDSL.g:1032:4: lv_key_0_0= RULE_SELECTOR_KEYWORDS
            {
            lv_key_0_0=(Token)match(input,RULE_SELECTOR_KEYWORDS,FOLLOW_2); 

            				newLeafNode(lv_key_0_0, grammarAccess.getKeySelectorAccess().getKeySELECTOR_KEYWORDSTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getKeySelectorRule());
            				}
            				setWithLastConsumed(
            					current,
            					"key",
            					lv_key_0_0,
            					"org.feup.els5.dsl.TableDSL.SELECTOR_KEYWORDS");
            			

            }


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
    // $ANTLR end "ruleKeySelector"


    // $ANTLR start "entryRuleTopNSelector"
    // InternalTableDSL.g:1051:1: entryRuleTopNSelector returns [EObject current=null] : iv_ruleTopNSelector= ruleTopNSelector EOF ;
    public final EObject entryRuleTopNSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopNSelector = null;


        try {
            // InternalTableDSL.g:1051:53: (iv_ruleTopNSelector= ruleTopNSelector EOF )
            // InternalTableDSL.g:1052:2: iv_ruleTopNSelector= ruleTopNSelector EOF
            {
             newCompositeNode(grammarAccess.getTopNSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopNSelector=ruleTopNSelector();

            state._fsp--;

             current =iv_ruleTopNSelector; 
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
    // $ANTLR end "entryRuleTopNSelector"


    // $ANTLR start "ruleTopNSelector"
    // InternalTableDSL.g:1058:1: ruleTopNSelector returns [EObject current=null] : (otherlv_0= 'TOP' ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTopNSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:1064:2: ( (otherlv_0= 'TOP' ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalTableDSL.g:1065:2: (otherlv_0= 'TOP' ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalTableDSL.g:1065:2: (otherlv_0= 'TOP' ( (lv_n_1_0= RULE_INT ) ) )
            // InternalTableDSL.g:1066:3: otherlv_0= 'TOP' ( (lv_n_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTopNSelectorAccess().getTOPKeyword_0());
            		
            // InternalTableDSL.g:1070:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalTableDSL.g:1071:4: (lv_n_1_0= RULE_INT )
            {
            // InternalTableDSL.g:1071:4: (lv_n_1_0= RULE_INT )
            // InternalTableDSL.g:1072:5: lv_n_1_0= RULE_INT
            {
            lv_n_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_n_1_0, grammarAccess.getTopNSelectorAccess().getNINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopNSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


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
    // $ANTLR end "ruleTopNSelector"


    // $ANTLR start "entryRuleComparator"
    // InternalTableDSL.g:1092:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // InternalTableDSL.g:1092:51: (iv_ruleComparator= ruleComparator EOF )
            // InternalTableDSL.g:1093:2: iv_ruleComparator= ruleComparator EOF
            {
             newCompositeNode(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparator=ruleComparator();

            state._fsp--;

             current =iv_ruleComparator; 
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
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalTableDSL.g:1099:1: ruleComparator returns [EObject current=null] : ( ( (lv_keys_0_0= ruleColumnName ) ) (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )* ) ;
    public final EObject ruleComparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_keys_0_0 = null;

        EObject lv_keys_2_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1105:2: ( ( ( (lv_keys_0_0= ruleColumnName ) ) (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )* ) )
            // InternalTableDSL.g:1106:2: ( ( (lv_keys_0_0= ruleColumnName ) ) (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )* )
            {
            // InternalTableDSL.g:1106:2: ( ( (lv_keys_0_0= ruleColumnName ) ) (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )* )
            // InternalTableDSL.g:1107:3: ( (lv_keys_0_0= ruleColumnName ) ) (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )*
            {
            // InternalTableDSL.g:1107:3: ( (lv_keys_0_0= ruleColumnName ) )
            // InternalTableDSL.g:1108:4: (lv_keys_0_0= ruleColumnName )
            {
            // InternalTableDSL.g:1108:4: (lv_keys_0_0= ruleColumnName )
            // InternalTableDSL.g:1109:5: lv_keys_0_0= ruleColumnName
            {

            					newCompositeNode(grammarAccess.getComparatorAccess().getKeysColumnNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_keys_0_0=ruleColumnName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparatorRule());
            					}
            					add(
            						current,
            						"keys",
            						lv_keys_0_0,
            						"org.feup.els5.dsl.TableDSL.ColumnName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTableDSL.g:1126:3: (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTableDSL.g:1127:4: otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getComparatorAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTableDSL.g:1131:4: ( (lv_keys_2_0= ruleColumnName ) )
            	    // InternalTableDSL.g:1132:5: (lv_keys_2_0= ruleColumnName )
            	    {
            	    // InternalTableDSL.g:1132:5: (lv_keys_2_0= ruleColumnName )
            	    // InternalTableDSL.g:1133:6: lv_keys_2_0= ruleColumnName
            	    {

            	    						newCompositeNode(grammarAccess.getComparatorAccess().getKeysColumnNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_keys_2_0=ruleColumnName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"keys",
            	    							lv_keys_2_0,
            	    							"org.feup.els5.dsl.TableDSL.ColumnName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleSquashRows"
    // InternalTableDSL.g:1155:1: entryRuleSquashRows returns [EObject current=null] : iv_ruleSquashRows= ruleSquashRows EOF ;
    public final EObject entryRuleSquashRows() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquashRows = null;


        try {
            // InternalTableDSL.g:1155:51: (iv_ruleSquashRows= ruleSquashRows EOF )
            // InternalTableDSL.g:1156:2: iv_ruleSquashRows= ruleSquashRows EOF
            {
             newCompositeNode(grammarAccess.getSquashRowsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSquashRows=ruleSquashRows();

            state._fsp--;

             current =iv_ruleSquashRows; 
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
    // $ANTLR end "entryRuleSquashRows"


    // $ANTLR start "ruleSquashRows"
    // InternalTableDSL.g:1162:1: ruleSquashRows returns [EObject current=null] : (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= ruleColumnName ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )* ) ;
    public final EObject ruleSquashRows() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_columns_3_0 = null;

        EObject lv_columns_5_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1168:2: ( (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= ruleColumnName ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )* ) )
            // InternalTableDSL.g:1169:2: (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= ruleColumnName ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )* )
            {
            // InternalTableDSL.g:1169:2: (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= ruleColumnName ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )* )
            // InternalTableDSL.g:1170:3: otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= ruleColumnName ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSquashRowsAccess().getSquashKeyword_0());
            		
            // InternalTableDSL.g:1174:3: (otherlv_1= 'rows' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTableDSL.g:1175:4: otherlv_1= 'rows'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getSquashRowsAccess().getRowsKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSquashRowsAccess().getByKeyword_2());
            		
            // InternalTableDSL.g:1184:3: ( (lv_columns_3_0= ruleColumnName ) )
            // InternalTableDSL.g:1185:4: (lv_columns_3_0= ruleColumnName )
            {
            // InternalTableDSL.g:1185:4: (lv_columns_3_0= ruleColumnName )
            // InternalTableDSL.g:1186:5: lv_columns_3_0= ruleColumnName
            {

            					newCompositeNode(grammarAccess.getSquashRowsAccess().getColumnsColumnNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_columns_3_0=ruleColumnName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSquashRowsRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_3_0,
            						"org.feup.els5.dsl.TableDSL.ColumnName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTableDSL.g:1203:3: (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTableDSL.g:1204:4: otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSquashRowsAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalTableDSL.g:1208:4: ( (lv_columns_5_0= ruleColumnName ) )
            	    // InternalTableDSL.g:1209:5: (lv_columns_5_0= ruleColumnName )
            	    {
            	    // InternalTableDSL.g:1209:5: (lv_columns_5_0= ruleColumnName )
            	    // InternalTableDSL.g:1210:6: lv_columns_5_0= ruleColumnName
            	    {

            	    						newCompositeNode(grammarAccess.getSquashRowsAccess().getColumnsColumnNameParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_columns_5_0=ruleColumnName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSquashRowsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_5_0,
            	    							"org.feup.els5.dsl.TableDSL.ColumnName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleSquashRows"


    // $ANTLR start "entryRuleFilter"
    // InternalTableDSL.g:1232:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalTableDSL.g:1232:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalTableDSL.g:1233:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalTableDSL.g:1239:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_denylist_1_0= ruleFilterDenylist ) ) ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )? ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_denylist_1_0 = null;

        EObject lv_exceptlist_2_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1245:2: ( (otherlv_0= 'filter' ( (lv_denylist_1_0= ruleFilterDenylist ) ) ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )? ) )
            // InternalTableDSL.g:1246:2: (otherlv_0= 'filter' ( (lv_denylist_1_0= ruleFilterDenylist ) ) ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )? )
            {
            // InternalTableDSL.g:1246:2: (otherlv_0= 'filter' ( (lv_denylist_1_0= ruleFilterDenylist ) ) ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )? )
            // InternalTableDSL.g:1247:3: otherlv_0= 'filter' ( (lv_denylist_1_0= ruleFilterDenylist ) ) ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            // InternalTableDSL.g:1251:3: ( (lv_denylist_1_0= ruleFilterDenylist ) )
            // InternalTableDSL.g:1252:4: (lv_denylist_1_0= ruleFilterDenylist )
            {
            // InternalTableDSL.g:1252:4: (lv_denylist_1_0= ruleFilterDenylist )
            // InternalTableDSL.g:1253:5: lv_denylist_1_0= ruleFilterDenylist
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getDenylistFilterDenylistParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_denylist_1_0=ruleFilterDenylist();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"denylist",
            						lv_denylist_1_0,
            						"org.feup.els5.dsl.TableDSL.FilterDenylist");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTableDSL.g:1270:3: ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTableDSL.g:1271:4: (lv_exceptlist_2_0= ruleFilterExceptlist )
                    {
                    // InternalTableDSL.g:1271:4: (lv_exceptlist_2_0= ruleFilterExceptlist )
                    // InternalTableDSL.g:1272:5: lv_exceptlist_2_0= ruleFilterExceptlist
                    {

                    					newCompositeNode(grammarAccess.getFilterAccess().getExceptlistFilterExceptlistParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exceptlist_2_0=ruleFilterExceptlist();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFilterRule());
                    					}
                    					set(
                    						current,
                    						"exceptlist",
                    						lv_exceptlist_2_0,
                    						"org.feup.els5.dsl.TableDSL.FilterExceptlist");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleFilterDenylist"
    // InternalTableDSL.g:1293:1: entryRuleFilterDenylist returns [EObject current=null] : iv_ruleFilterDenylist= ruleFilterDenylist EOF ;
    public final EObject entryRuleFilterDenylist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterDenylist = null;


        try {
            // InternalTableDSL.g:1293:55: (iv_ruleFilterDenylist= ruleFilterDenylist EOF )
            // InternalTableDSL.g:1294:2: iv_ruleFilterDenylist= ruleFilterDenylist EOF
            {
             newCompositeNode(grammarAccess.getFilterDenylistRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterDenylist=ruleFilterDenylist();

            state._fsp--;

             current =iv_ruleFilterDenylist; 
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
    // $ANTLR end "entryRuleFilterDenylist"


    // $ANTLR start "ruleFilterDenylist"
    // InternalTableDSL.g:1300:1: ruleFilterDenylist returns [EObject current=null] : (otherlv_0= 'deny' ( (lv_denylist_1_0= ruleFilterRule ) ) (otherlv_2= ',' ( (lv_denylist_3_0= ruleFilterRule ) ) )* ) ;
    public final EObject ruleFilterDenylist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_denylist_1_0 = null;

        EObject lv_denylist_3_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1306:2: ( (otherlv_0= 'deny' ( (lv_denylist_1_0= ruleFilterRule ) ) (otherlv_2= ',' ( (lv_denylist_3_0= ruleFilterRule ) ) )* ) )
            // InternalTableDSL.g:1307:2: (otherlv_0= 'deny' ( (lv_denylist_1_0= ruleFilterRule ) ) (otherlv_2= ',' ( (lv_denylist_3_0= ruleFilterRule ) ) )* )
            {
            // InternalTableDSL.g:1307:2: (otherlv_0= 'deny' ( (lv_denylist_1_0= ruleFilterRule ) ) (otherlv_2= ',' ( (lv_denylist_3_0= ruleFilterRule ) ) )* )
            // InternalTableDSL.g:1308:3: otherlv_0= 'deny' ( (lv_denylist_1_0= ruleFilterRule ) ) (otherlv_2= ',' ( (lv_denylist_3_0= ruleFilterRule ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterDenylistAccess().getDenyKeyword_0());
            		
            // InternalTableDSL.g:1312:3: ( (lv_denylist_1_0= ruleFilterRule ) )
            // InternalTableDSL.g:1313:4: (lv_denylist_1_0= ruleFilterRule )
            {
            // InternalTableDSL.g:1313:4: (lv_denylist_1_0= ruleFilterRule )
            // InternalTableDSL.g:1314:5: lv_denylist_1_0= ruleFilterRule
            {

            					newCompositeNode(grammarAccess.getFilterDenylistAccess().getDenylistFilterRuleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_denylist_1_0=ruleFilterRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterDenylistRule());
            					}
            					add(
            						current,
            						"denylist",
            						lv_denylist_1_0,
            						"org.feup.els5.dsl.TableDSL.FilterRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTableDSL.g:1331:3: (otherlv_2= ',' ( (lv_denylist_3_0= ruleFilterRule ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTableDSL.g:1332:4: otherlv_2= ',' ( (lv_denylist_3_0= ruleFilterRule ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFilterDenylistAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalTableDSL.g:1336:4: ( (lv_denylist_3_0= ruleFilterRule ) )
            	    // InternalTableDSL.g:1337:5: (lv_denylist_3_0= ruleFilterRule )
            	    {
            	    // InternalTableDSL.g:1337:5: (lv_denylist_3_0= ruleFilterRule )
            	    // InternalTableDSL.g:1338:6: lv_denylist_3_0= ruleFilterRule
            	    {

            	    						newCompositeNode(grammarAccess.getFilterDenylistAccess().getDenylistFilterRuleParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_denylist_3_0=ruleFilterRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFilterDenylistRule());
            	    						}
            	    						add(
            	    							current,
            	    							"denylist",
            	    							lv_denylist_3_0,
            	    							"org.feup.els5.dsl.TableDSL.FilterRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "ruleFilterDenylist"


    // $ANTLR start "entryRuleFilterExceptlist"
    // InternalTableDSL.g:1360:1: entryRuleFilterExceptlist returns [EObject current=null] : iv_ruleFilterExceptlist= ruleFilterExceptlist EOF ;
    public final EObject entryRuleFilterExceptlist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExceptlist = null;


        try {
            // InternalTableDSL.g:1360:57: (iv_ruleFilterExceptlist= ruleFilterExceptlist EOF )
            // InternalTableDSL.g:1361:2: iv_ruleFilterExceptlist= ruleFilterExceptlist EOF
            {
             newCompositeNode(grammarAccess.getFilterExceptlistRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterExceptlist=ruleFilterExceptlist();

            state._fsp--;

             current =iv_ruleFilterExceptlist; 
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
    // $ANTLR end "entryRuleFilterExceptlist"


    // $ANTLR start "ruleFilterExceptlist"
    // InternalTableDSL.g:1367:1: ruleFilterExceptlist returns [EObject current=null] : (otherlv_0= 'except' ( (lv_exceptlist_1_0= ruleFilterRule ) ) (otherlv_2= ',' ( (lv_exceptlist_3_0= ruleFilterRule ) ) )* ) ;
    public final EObject ruleFilterExceptlist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exceptlist_1_0 = null;

        EObject lv_exceptlist_3_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1373:2: ( (otherlv_0= 'except' ( (lv_exceptlist_1_0= ruleFilterRule ) ) (otherlv_2= ',' ( (lv_exceptlist_3_0= ruleFilterRule ) ) )* ) )
            // InternalTableDSL.g:1374:2: (otherlv_0= 'except' ( (lv_exceptlist_1_0= ruleFilterRule ) ) (otherlv_2= ',' ( (lv_exceptlist_3_0= ruleFilterRule ) ) )* )
            {
            // InternalTableDSL.g:1374:2: (otherlv_0= 'except' ( (lv_exceptlist_1_0= ruleFilterRule ) ) (otherlv_2= ',' ( (lv_exceptlist_3_0= ruleFilterRule ) ) )* )
            // InternalTableDSL.g:1375:3: otherlv_0= 'except' ( (lv_exceptlist_1_0= ruleFilterRule ) ) (otherlv_2= ',' ( (lv_exceptlist_3_0= ruleFilterRule ) ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterExceptlistAccess().getExceptKeyword_0());
            		
            // InternalTableDSL.g:1379:3: ( (lv_exceptlist_1_0= ruleFilterRule ) )
            // InternalTableDSL.g:1380:4: (lv_exceptlist_1_0= ruleFilterRule )
            {
            // InternalTableDSL.g:1380:4: (lv_exceptlist_1_0= ruleFilterRule )
            // InternalTableDSL.g:1381:5: lv_exceptlist_1_0= ruleFilterRule
            {

            					newCompositeNode(grammarAccess.getFilterExceptlistAccess().getExceptlistFilterRuleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_exceptlist_1_0=ruleFilterRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterExceptlistRule());
            					}
            					add(
            						current,
            						"exceptlist",
            						lv_exceptlist_1_0,
            						"org.feup.els5.dsl.TableDSL.FilterRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTableDSL.g:1398:3: (otherlv_2= ',' ( (lv_exceptlist_3_0= ruleFilterRule ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTableDSL.g:1399:4: otherlv_2= ',' ( (lv_exceptlist_3_0= ruleFilterRule ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFilterExceptlistAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalTableDSL.g:1403:4: ( (lv_exceptlist_3_0= ruleFilterRule ) )
            	    // InternalTableDSL.g:1404:5: (lv_exceptlist_3_0= ruleFilterRule )
            	    {
            	    // InternalTableDSL.g:1404:5: (lv_exceptlist_3_0= ruleFilterRule )
            	    // InternalTableDSL.g:1405:6: lv_exceptlist_3_0= ruleFilterRule
            	    {

            	    						newCompositeNode(grammarAccess.getFilterExceptlistAccess().getExceptlistFilterRuleParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_exceptlist_3_0=ruleFilterRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFilterExceptlistRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exceptlist",
            	    							lv_exceptlist_3_0,
            	    							"org.feup.els5.dsl.TableDSL.FilterRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleFilterExceptlist"


    // $ANTLR start "entryRuleFilterRule"
    // InternalTableDSL.g:1427:1: entryRuleFilterRule returns [EObject current=null] : iv_ruleFilterRule= ruleFilterRule EOF ;
    public final EObject entryRuleFilterRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterRule = null;


        try {
            // InternalTableDSL.g:1427:51: (iv_ruleFilterRule= ruleFilterRule EOF )
            // InternalTableDSL.g:1428:2: iv_ruleFilterRule= ruleFilterRule EOF
            {
             newCompositeNode(grammarAccess.getFilterRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterRule=ruleFilterRule();

            state._fsp--;

             current =iv_ruleFilterRule; 
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
    // $ANTLR end "entryRuleFilterRule"


    // $ANTLR start "ruleFilterRule"
    // InternalTableDSL.g:1434:1: ruleFilterRule returns [EObject current=null] : (this_FilterColumnRule_0= ruleFilterColumnRule | this_FilterObjectTypeRule_1= ruleFilterObjectTypeRule ) ;
    public final EObject ruleFilterRule() throws RecognitionException {
        EObject current = null;

        EObject this_FilterColumnRule_0 = null;

        EObject this_FilterObjectTypeRule_1 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1440:2: ( (this_FilterColumnRule_0= ruleFilterColumnRule | this_FilterObjectTypeRule_1= ruleFilterObjectTypeRule ) )
            // InternalTableDSL.g:1441:2: (this_FilterColumnRule_0= ruleFilterColumnRule | this_FilterObjectTypeRule_1= ruleFilterObjectTypeRule )
            {
            // InternalTableDSL.g:1441:2: (this_FilterColumnRule_0= ruleFilterColumnRule | this_FilterObjectTypeRule_1= ruleFilterObjectTypeRule )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22||LA22_0==35) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=36 && LA22_0<=37)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalTableDSL.g:1442:3: this_FilterColumnRule_0= ruleFilterColumnRule
                    {

                    			newCompositeNode(grammarAccess.getFilterRuleAccess().getFilterColumnRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FilterColumnRule_0=ruleFilterColumnRule();

                    state._fsp--;


                    			current = this_FilterColumnRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:1451:3: this_FilterObjectTypeRule_1= ruleFilterObjectTypeRule
                    {

                    			newCompositeNode(grammarAccess.getFilterRuleAccess().getFilterObjectTypeRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FilterObjectTypeRule_1=ruleFilterObjectTypeRule();

                    state._fsp--;


                    			current = this_FilterObjectTypeRule_1;
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
    // $ANTLR end "ruleFilterRule"


    // $ANTLR start "entryRuleFilterColumnRule"
    // InternalTableDSL.g:1463:1: entryRuleFilterColumnRule returns [EObject current=null] : iv_ruleFilterColumnRule= ruleFilterColumnRule EOF ;
    public final EObject entryRuleFilterColumnRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterColumnRule = null;


        try {
            // InternalTableDSL.g:1463:57: (iv_ruleFilterColumnRule= ruleFilterColumnRule EOF )
            // InternalTableDSL.g:1464:2: iv_ruleFilterColumnRule= ruleFilterColumnRule EOF
            {
             newCompositeNode(grammarAccess.getFilterColumnRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterColumnRule=ruleFilterColumnRule();

            state._fsp--;

             current =iv_ruleFilterColumnRule; 
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
    // $ANTLR end "entryRuleFilterColumnRule"


    // $ANTLR start "ruleFilterColumnRule"
    // InternalTableDSL.g:1470:1: ruleFilterColumnRule returns [EObject current=null] : ( (otherlv_0= 'column' | otherlv_1= 'columns' ) ( (lv_columnPatterns_2_0= ruleColumnName ) ) (otherlv_3= ',' ( (lv_columnPatterns_4_0= ruleColumnName ) ) )* ) ;
    public final EObject ruleFilterColumnRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_columnPatterns_2_0 = null;

        EObject lv_columnPatterns_4_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1476:2: ( ( (otherlv_0= 'column' | otherlv_1= 'columns' ) ( (lv_columnPatterns_2_0= ruleColumnName ) ) (otherlv_3= ',' ( (lv_columnPatterns_4_0= ruleColumnName ) ) )* ) )
            // InternalTableDSL.g:1477:2: ( (otherlv_0= 'column' | otherlv_1= 'columns' ) ( (lv_columnPatterns_2_0= ruleColumnName ) ) (otherlv_3= ',' ( (lv_columnPatterns_4_0= ruleColumnName ) ) )* )
            {
            // InternalTableDSL.g:1477:2: ( (otherlv_0= 'column' | otherlv_1= 'columns' ) ( (lv_columnPatterns_2_0= ruleColumnName ) ) (otherlv_3= ',' ( (lv_columnPatterns_4_0= ruleColumnName ) ) )* )
            // InternalTableDSL.g:1478:3: (otherlv_0= 'column' | otherlv_1= 'columns' ) ( (lv_columnPatterns_2_0= ruleColumnName ) ) (otherlv_3= ',' ( (lv_columnPatterns_4_0= ruleColumnName ) ) )*
            {
            // InternalTableDSL.g:1478:3: (otherlv_0= 'column' | otherlv_1= 'columns' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            else if ( (LA23_0==35) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalTableDSL.g:1479:4: otherlv_0= 'column'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getFilterColumnRuleAccess().getColumnKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:1484:4: otherlv_1= 'columns'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getFilterColumnRuleAccess().getColumnsKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalTableDSL.g:1489:3: ( (lv_columnPatterns_2_0= ruleColumnName ) )
            // InternalTableDSL.g:1490:4: (lv_columnPatterns_2_0= ruleColumnName )
            {
            // InternalTableDSL.g:1490:4: (lv_columnPatterns_2_0= ruleColumnName )
            // InternalTableDSL.g:1491:5: lv_columnPatterns_2_0= ruleColumnName
            {

            					newCompositeNode(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsColumnNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_columnPatterns_2_0=ruleColumnName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterColumnRuleRule());
            					}
            					add(
            						current,
            						"columnPatterns",
            						lv_columnPatterns_2_0,
            						"org.feup.els5.dsl.TableDSL.ColumnName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTableDSL.g:1508:3: (otherlv_3= ',' ( (lv_columnPatterns_4_0= ruleColumnName ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==17) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_STRING||LA24_1==RULE_COLUMN_NAME_KEYWORDS) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalTableDSL.g:1509:4: otherlv_3= ',' ( (lv_columnPatterns_4_0= ruleColumnName ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFilterColumnRuleAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalTableDSL.g:1513:4: ( (lv_columnPatterns_4_0= ruleColumnName ) )
            	    // InternalTableDSL.g:1514:5: (lv_columnPatterns_4_0= ruleColumnName )
            	    {
            	    // InternalTableDSL.g:1514:5: (lv_columnPatterns_4_0= ruleColumnName )
            	    // InternalTableDSL.g:1515:6: lv_columnPatterns_4_0= ruleColumnName
            	    {

            	    						newCompositeNode(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsColumnNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_columnPatterns_4_0=ruleColumnName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFilterColumnRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columnPatterns",
            	    							lv_columnPatterns_4_0,
            	    							"org.feup.els5.dsl.TableDSL.ColumnName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


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
    // $ANTLR end "ruleFilterColumnRule"


    // $ANTLR start "entryRuleFilterObjectTypeRule"
    // InternalTableDSL.g:1537:1: entryRuleFilterObjectTypeRule returns [EObject current=null] : iv_ruleFilterObjectTypeRule= ruleFilterObjectTypeRule EOF ;
    public final EObject entryRuleFilterObjectTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterObjectTypeRule = null;


        try {
            // InternalTableDSL.g:1537:61: (iv_ruleFilterObjectTypeRule= ruleFilterObjectTypeRule EOF )
            // InternalTableDSL.g:1538:2: iv_ruleFilterObjectTypeRule= ruleFilterObjectTypeRule EOF
            {
             newCompositeNode(grammarAccess.getFilterObjectTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterObjectTypeRule=ruleFilterObjectTypeRule();

            state._fsp--;

             current =iv_ruleFilterObjectTypeRule; 
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
    // $ANTLR end "entryRuleFilterObjectTypeRule"


    // $ANTLR start "ruleFilterObjectTypeRule"
    // InternalTableDSL.g:1544:1: ruleFilterObjectTypeRule returns [EObject current=null] : ( (otherlv_0= 'object' | otherlv_1= 'objects' ) (otherlv_2= 'of' )? ( (lv_objectClasses_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_objectClasses_5_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleFilterObjectTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_objectClasses_3_0=null;
        Token otherlv_4=null;
        Token lv_objectClasses_5_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:1550:2: ( ( (otherlv_0= 'object' | otherlv_1= 'objects' ) (otherlv_2= 'of' )? ( (lv_objectClasses_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_objectClasses_5_0= RULE_STRING ) ) )* ) )
            // InternalTableDSL.g:1551:2: ( (otherlv_0= 'object' | otherlv_1= 'objects' ) (otherlv_2= 'of' )? ( (lv_objectClasses_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_objectClasses_5_0= RULE_STRING ) ) )* )
            {
            // InternalTableDSL.g:1551:2: ( (otherlv_0= 'object' | otherlv_1= 'objects' ) (otherlv_2= 'of' )? ( (lv_objectClasses_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_objectClasses_5_0= RULE_STRING ) ) )* )
            // InternalTableDSL.g:1552:3: (otherlv_0= 'object' | otherlv_1= 'objects' ) (otherlv_2= 'of' )? ( (lv_objectClasses_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_objectClasses_5_0= RULE_STRING ) ) )*
            {
            // InternalTableDSL.g:1552:3: (otherlv_0= 'object' | otherlv_1= 'objects' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            else if ( (LA25_0==37) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalTableDSL.g:1553:4: otherlv_0= 'object'
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getFilterObjectTypeRuleAccess().getObjectKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:1558:4: otherlv_1= 'objects'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getFilterObjectTypeRuleAccess().getObjectsKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalTableDSL.g:1563:3: (otherlv_2= 'of' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTableDSL.g:1564:4: otherlv_2= 'of'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getFilterObjectTypeRuleAccess().getOfKeyword_1());
                    			

                    }
                    break;

            }

            // InternalTableDSL.g:1569:3: ( (lv_objectClasses_3_0= RULE_STRING ) )
            // InternalTableDSL.g:1570:4: (lv_objectClasses_3_0= RULE_STRING )
            {
            // InternalTableDSL.g:1570:4: (lv_objectClasses_3_0= RULE_STRING )
            // InternalTableDSL.g:1571:5: lv_objectClasses_3_0= RULE_STRING
            {
            lv_objectClasses_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_objectClasses_3_0, grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterObjectTypeRuleRule());
            					}
            					addWithLastConsumed(
            						current,
            						"objectClasses",
            						lv_objectClasses_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTableDSL.g:1587:3: (otherlv_4= ',' ( (lv_objectClasses_5_0= RULE_STRING ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==17) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_STRING) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalTableDSL.g:1588:4: otherlv_4= ',' ( (lv_objectClasses_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getFilterObjectTypeRuleAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTableDSL.g:1592:4: ( (lv_objectClasses_5_0= RULE_STRING ) )
            	    // InternalTableDSL.g:1593:5: (lv_objectClasses_5_0= RULE_STRING )
            	    {
            	    // InternalTableDSL.g:1593:5: (lv_objectClasses_5_0= RULE_STRING )
            	    // InternalTableDSL.g:1594:6: lv_objectClasses_5_0= RULE_STRING
            	    {
            	    lv_objectClasses_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    						newLeafNode(lv_objectClasses_5_0, grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFilterObjectTypeRuleRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"objectClasses",
            	    							lv_objectClasses_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


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
    // $ANTLR end "ruleFilterObjectTypeRule"


    // $ANTLR start "entryRuleColumnName"
    // InternalTableDSL.g:1615:1: entryRuleColumnName returns [EObject current=null] : iv_ruleColumnName= ruleColumnName EOF ;
    public final EObject entryRuleColumnName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnName = null;


        try {
            // InternalTableDSL.g:1615:51: (iv_ruleColumnName= ruleColumnName EOF )
            // InternalTableDSL.g:1616:2: iv_ruleColumnName= ruleColumnName EOF
            {
             newCompositeNode(grammarAccess.getColumnNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnName=ruleColumnName();

            state._fsp--;

             current =iv_ruleColumnName; 
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
    // $ANTLR end "entryRuleColumnName"


    // $ANTLR start "ruleColumnName"
    // InternalTableDSL.g:1622:1: ruleColumnName returns [EObject current=null] : ( ( (lv_columnName_0_1= RULE_COLUMN_NAME_KEYWORDS | lv_columnName_0_2= RULE_STRING ) ) ) ;
    public final EObject ruleColumnName() throws RecognitionException {
        EObject current = null;

        Token lv_columnName_0_1=null;
        Token lv_columnName_0_2=null;


        	enterRule();

        try {
            // InternalTableDSL.g:1628:2: ( ( ( (lv_columnName_0_1= RULE_COLUMN_NAME_KEYWORDS | lv_columnName_0_2= RULE_STRING ) ) ) )
            // InternalTableDSL.g:1629:2: ( ( (lv_columnName_0_1= RULE_COLUMN_NAME_KEYWORDS | lv_columnName_0_2= RULE_STRING ) ) )
            {
            // InternalTableDSL.g:1629:2: ( ( (lv_columnName_0_1= RULE_COLUMN_NAME_KEYWORDS | lv_columnName_0_2= RULE_STRING ) ) )
            // InternalTableDSL.g:1630:3: ( (lv_columnName_0_1= RULE_COLUMN_NAME_KEYWORDS | lv_columnName_0_2= RULE_STRING ) )
            {
            // InternalTableDSL.g:1630:3: ( (lv_columnName_0_1= RULE_COLUMN_NAME_KEYWORDS | lv_columnName_0_2= RULE_STRING ) )
            // InternalTableDSL.g:1631:4: (lv_columnName_0_1= RULE_COLUMN_NAME_KEYWORDS | lv_columnName_0_2= RULE_STRING )
            {
            // InternalTableDSL.g:1631:4: (lv_columnName_0_1= RULE_COLUMN_NAME_KEYWORDS | lv_columnName_0_2= RULE_STRING )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_COLUMN_NAME_KEYWORDS) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_STRING) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalTableDSL.g:1632:5: lv_columnName_0_1= RULE_COLUMN_NAME_KEYWORDS
                    {
                    lv_columnName_0_1=(Token)match(input,RULE_COLUMN_NAME_KEYWORDS,FOLLOW_2); 

                    					newLeafNode(lv_columnName_0_1, grammarAccess.getColumnNameAccess().getColumnNameCOLUMN_NAME_KEYWORDSTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"columnName",
                    						lv_columnName_0_1,
                    						"org.feup.els5.dsl.TableDSL.COLUMN_NAME_KEYWORDS");
                    				

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:1647:5: lv_columnName_0_2= RULE_STRING
                    {
                    lv_columnName_0_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_columnName_0_2, grammarAccess.getColumnNameAccess().getColumnNameSTRINGTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"columnName",
                    						lv_columnName_0_2,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleColumnName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000142350002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000120L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003800400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000020L});

}