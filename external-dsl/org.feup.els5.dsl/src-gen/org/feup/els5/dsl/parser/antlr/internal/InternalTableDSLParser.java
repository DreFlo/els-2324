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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_STRING", "RULE_INT", "RULE_RESERVED_KEYWORDS", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'create'", "'table'", "'from'", "'load'", "','", "'output'", "'to'", "'select'", "'rename'", "'column'", "'prepend'", "'append'", "'extract'", "'sort'", "'by'", "'MAX'", "'MIN'", "'MEDIAN'", "'TOP'", "'squash'", "'rows'", "'filter'", "'deny'", "'except'", "'object'", "'of'"
    };
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
    public static final int RULE_ANY_OTHER=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_RESERVED_KEYWORDS=7;
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

            if ( ((LA1_0>=12 && LA1_0<=13)) ) {
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

                if ( (LA2_0==15||LA2_0==17||(LA2_0>=19 && LA2_0<=20)||LA2_0==24||LA2_0==31||LA2_0==33) ) {
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

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTableDSL.g:137:4: otherlv_0= 'create'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getCreateTableAccess().getCreateKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateTableAccess().getTableKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_6); 

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
            case 15:
                {
                alt4=1;
                }
                break;
            case 19:
            case 20:
            case 24:
            case 31:
            case 33:
                {
                alt4=2;
                }
                break;
            case 17:
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
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

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

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTableDSL.g:282:4: otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_6); 

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
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_6); 

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

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTableDSL.g:351:4: otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_6); 

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
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            case 33:
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
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

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

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTableDSL.g:480:4: otherlv_2= ',' ( (lv_columnPatterns_3_0= ruleColumnName ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_10); 

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
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameColumnAccess().getRenameKeyword_0());
            		
            // InternalTableDSL.g:527:3: (otherlv_1= 'column' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTableDSL.g:528:4: otherlv_1= 'column'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_11); 

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
                    alt11=2;
                    }
                    break;
                case 22:
                    {
                    alt11=3;
                    }
                    break;
                case 18:
                    {
                    alt11=1;
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

            otherlv_1=(Token)match(input,18,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_6); 

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
    // InternalTableDSL.g:785:1: ruleExtract returns [EObject current=null] : (otherlv_0= 'extract' ( (lv_targetColumns_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_targetColumns_3_0= RULE_STRING ) ) )* otherlv_4= 'from' ( (lv_sourceColumn_5_0= RULE_STRING ) ) otherlv_6= 'select' ( (lv_selector_7_0= ruleSelector ) ) otherlv_8= 'sort' (otherlv_9= 'by' )? ( (lv_comparator_10_0= ruleComparator ) ) ) ;
    public final EObject ruleExtract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_targetColumns_1_0=null;
        Token otherlv_2=null;
        Token lv_targetColumns_3_0=null;
        Token otherlv_4=null;
        Token lv_sourceColumn_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_selector_7_0 = null;

        EObject lv_comparator_10_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:791:2: ( (otherlv_0= 'extract' ( (lv_targetColumns_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_targetColumns_3_0= RULE_STRING ) ) )* otherlv_4= 'from' ( (lv_sourceColumn_5_0= RULE_STRING ) ) otherlv_6= 'select' ( (lv_selector_7_0= ruleSelector ) ) otherlv_8= 'sort' (otherlv_9= 'by' )? ( (lv_comparator_10_0= ruleComparator ) ) ) )
            // InternalTableDSL.g:792:2: (otherlv_0= 'extract' ( (lv_targetColumns_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_targetColumns_3_0= RULE_STRING ) ) )* otherlv_4= 'from' ( (lv_sourceColumn_5_0= RULE_STRING ) ) otherlv_6= 'select' ( (lv_selector_7_0= ruleSelector ) ) otherlv_8= 'sort' (otherlv_9= 'by' )? ( (lv_comparator_10_0= ruleComparator ) ) )
            {
            // InternalTableDSL.g:792:2: (otherlv_0= 'extract' ( (lv_targetColumns_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_targetColumns_3_0= RULE_STRING ) ) )* otherlv_4= 'from' ( (lv_sourceColumn_5_0= RULE_STRING ) ) otherlv_6= 'select' ( (lv_selector_7_0= ruleSelector ) ) otherlv_8= 'sort' (otherlv_9= 'by' )? ( (lv_comparator_10_0= ruleComparator ) ) )
            // InternalTableDSL.g:793:3: otherlv_0= 'extract' ( (lv_targetColumns_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_targetColumns_3_0= RULE_STRING ) ) )* otherlv_4= 'from' ( (lv_sourceColumn_5_0= RULE_STRING ) ) otherlv_6= 'select' ( (lv_selector_7_0= ruleSelector ) ) otherlv_8= 'sort' (otherlv_9= 'by' )? ( (lv_comparator_10_0= ruleComparator ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExtractAccess().getExtractKeyword_0());
            		
            // InternalTableDSL.g:797:3: ( (lv_targetColumns_1_0= RULE_STRING ) )
            // InternalTableDSL.g:798:4: (lv_targetColumns_1_0= RULE_STRING )
            {
            // InternalTableDSL.g:798:4: (lv_targetColumns_1_0= RULE_STRING )
            // InternalTableDSL.g:799:5: lv_targetColumns_1_0= RULE_STRING
            {
            lv_targetColumns_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_targetColumns_1_0, grammarAccess.getExtractAccess().getTargetColumnsSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtractRule());
            					}
            					addWithLastConsumed(
            						current,
            						"targetColumns",
            						lv_targetColumns_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTableDSL.g:815:3: (otherlv_2= ',' ( (lv_targetColumns_3_0= RULE_STRING ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTableDSL.g:816:4: otherlv_2= ',' ( (lv_targetColumns_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExtractAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalTableDSL.g:820:4: ( (lv_targetColumns_3_0= RULE_STRING ) )
            	    // InternalTableDSL.g:821:5: (lv_targetColumns_3_0= RULE_STRING )
            	    {
            	    // InternalTableDSL.g:821:5: (lv_targetColumns_3_0= RULE_STRING )
            	    // InternalTableDSL.g:822:6: lv_targetColumns_3_0= RULE_STRING
            	    {
            	    lv_targetColumns_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    						newLeafNode(lv_targetColumns_3_0, grammarAccess.getExtractAccess().getTargetColumnsSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExtractRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"targetColumns",
            	    							lv_targetColumns_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getExtractAccess().getFromKeyword_3());
            		
            // InternalTableDSL.g:843:3: ( (lv_sourceColumn_5_0= RULE_STRING ) )
            // InternalTableDSL.g:844:4: (lv_sourceColumn_5_0= RULE_STRING )
            {
            // InternalTableDSL.g:844:4: (lv_sourceColumn_5_0= RULE_STRING )
            // InternalTableDSL.g:845:5: lv_sourceColumn_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getExtractAccess().getSelectKeyword_5());
            		
            // InternalTableDSL.g:865:3: ( (lv_selector_7_0= ruleSelector ) )
            // InternalTableDSL.g:866:4: (lv_selector_7_0= ruleSelector )
            {
            // InternalTableDSL.g:866:4: (lv_selector_7_0= ruleSelector )
            // InternalTableDSL.g:867:5: lv_selector_7_0= ruleSelector
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

            otherlv_8=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getExtractAccess().getSortKeyword_7());
            		
            // InternalTableDSL.g:888:3: (otherlv_9= 'by' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTableDSL.g:889:4: otherlv_9= 'by'
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getExtractAccess().getByKeyword_8());
                    			

                    }
                    break;

            }

            // InternalTableDSL.g:894:3: ( (lv_comparator_10_0= ruleComparator ) )
            // InternalTableDSL.g:895:4: (lv_comparator_10_0= ruleComparator )
            {
            // InternalTableDSL.g:895:4: (lv_comparator_10_0= ruleComparator )
            // InternalTableDSL.g:896:5: lv_comparator_10_0= ruleComparator
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


    // $ANTLR start "entryRuleSelector"
    // InternalTableDSL.g:917:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalTableDSL.g:917:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalTableDSL.g:918:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalTableDSL.g:924:1: ruleSelector returns [EObject current=null] : ( ( () otherlv_1= 'MAX' ) | ( () otherlv_3= 'MIN' ) | ( () otherlv_5= 'MEDIAN' ) | (otherlv_6= 'TOP' ( (lv_n_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_n_7_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:930:2: ( ( ( () otherlv_1= 'MAX' ) | ( () otherlv_3= 'MIN' ) | ( () otherlv_5= 'MEDIAN' ) | (otherlv_6= 'TOP' ( (lv_n_7_0= RULE_INT ) ) ) ) )
            // InternalTableDSL.g:931:2: ( ( () otherlv_1= 'MAX' ) | ( () otherlv_3= 'MIN' ) | ( () otherlv_5= 'MEDIAN' ) | (otherlv_6= 'TOP' ( (lv_n_7_0= RULE_INT ) ) ) )
            {
            // InternalTableDSL.g:931:2: ( ( () otherlv_1= 'MAX' ) | ( () otherlv_3= 'MIN' ) | ( () otherlv_5= 'MEDIAN' ) | (otherlv_6= 'TOP' ( (lv_n_7_0= RULE_INT ) ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 30:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTableDSL.g:932:3: ( () otherlv_1= 'MAX' )
                    {
                    // InternalTableDSL.g:932:3: ( () otherlv_1= 'MAX' )
                    // InternalTableDSL.g:933:4: () otherlv_1= 'MAX'
                    {
                    // InternalTableDSL.g:933:4: ()
                    // InternalTableDSL.g:934:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSelectorAccess().getSelectorAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSelectorAccess().getMAXKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:946:3: ( () otherlv_3= 'MIN' )
                    {
                    // InternalTableDSL.g:946:3: ( () otherlv_3= 'MIN' )
                    // InternalTableDSL.g:947:4: () otherlv_3= 'MIN'
                    {
                    // InternalTableDSL.g:947:4: ()
                    // InternalTableDSL.g:948:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSelectorAccess().getSelectorAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSelectorAccess().getMINKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:960:3: ( () otherlv_5= 'MEDIAN' )
                    {
                    // InternalTableDSL.g:960:3: ( () otherlv_5= 'MEDIAN' )
                    // InternalTableDSL.g:961:4: () otherlv_5= 'MEDIAN'
                    {
                    // InternalTableDSL.g:961:4: ()
                    // InternalTableDSL.g:962:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSelectorAccess().getSelectorAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectorAccess().getMEDIANKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTableDSL.g:974:3: (otherlv_6= 'TOP' ( (lv_n_7_0= RULE_INT ) ) )
                    {
                    // InternalTableDSL.g:974:3: (otherlv_6= 'TOP' ( (lv_n_7_0= RULE_INT ) ) )
                    // InternalTableDSL.g:975:4: otherlv_6= 'TOP' ( (lv_n_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getSelectorAccess().getTOPKeyword_3_0());
                    			
                    // InternalTableDSL.g:979:4: ( (lv_n_7_0= RULE_INT ) )
                    // InternalTableDSL.g:980:5: (lv_n_7_0= RULE_INT )
                    {
                    // InternalTableDSL.g:980:5: (lv_n_7_0= RULE_INT )
                    // InternalTableDSL.g:981:6: lv_n_7_0= RULE_INT
                    {
                    lv_n_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_n_7_0, grammarAccess.getSelectorAccess().getNINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"n",
                    							lv_n_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleComparator"
    // InternalTableDSL.g:1002:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // InternalTableDSL.g:1002:51: (iv_ruleComparator= ruleComparator EOF )
            // InternalTableDSL.g:1003:2: iv_ruleComparator= ruleComparator EOF
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
    // InternalTableDSL.g:1009:1: ruleComparator returns [EObject current=null] : ( ( (lv_keys_0_0= ruleColumnName ) ) (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )* ) ;
    public final EObject ruleComparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_keys_0_0 = null;

        EObject lv_keys_2_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1015:2: ( ( ( (lv_keys_0_0= ruleColumnName ) ) (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )* ) )
            // InternalTableDSL.g:1016:2: ( ( (lv_keys_0_0= ruleColumnName ) ) (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )* )
            {
            // InternalTableDSL.g:1016:2: ( ( (lv_keys_0_0= ruleColumnName ) ) (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )* )
            // InternalTableDSL.g:1017:3: ( (lv_keys_0_0= ruleColumnName ) ) (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )*
            {
            // InternalTableDSL.g:1017:3: ( (lv_keys_0_0= ruleColumnName ) )
            // InternalTableDSL.g:1018:4: (lv_keys_0_0= ruleColumnName )
            {
            // InternalTableDSL.g:1018:4: (lv_keys_0_0= ruleColumnName )
            // InternalTableDSL.g:1019:5: lv_keys_0_0= ruleColumnName
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

            // InternalTableDSL.g:1036:3: (otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTableDSL.g:1037:4: otherlv_1= ',' ( (lv_keys_2_0= ruleColumnName ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getComparatorAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTableDSL.g:1041:4: ( (lv_keys_2_0= ruleColumnName ) )
            	    // InternalTableDSL.g:1042:5: (lv_keys_2_0= ruleColumnName )
            	    {
            	    // InternalTableDSL.g:1042:5: (lv_keys_2_0= ruleColumnName )
            	    // InternalTableDSL.g:1043:6: lv_keys_2_0= ruleColumnName
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
            	    break loop15;
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
    // InternalTableDSL.g:1065:1: entryRuleSquashRows returns [EObject current=null] : iv_ruleSquashRows= ruleSquashRows EOF ;
    public final EObject entryRuleSquashRows() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquashRows = null;


        try {
            // InternalTableDSL.g:1065:51: (iv_ruleSquashRows= ruleSquashRows EOF )
            // InternalTableDSL.g:1066:2: iv_ruleSquashRows= ruleSquashRows EOF
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
    // InternalTableDSL.g:1072:1: ruleSquashRows returns [EObject current=null] : (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= ruleColumnName ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )* ) ;
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
            // InternalTableDSL.g:1078:2: ( (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= ruleColumnName ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )* ) )
            // InternalTableDSL.g:1079:2: (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= ruleColumnName ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )* )
            {
            // InternalTableDSL.g:1079:2: (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= ruleColumnName ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )* )
            // InternalTableDSL.g:1080:3: otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= ruleColumnName ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSquashRowsAccess().getSquashKeyword_0());
            		
            // InternalTableDSL.g:1084:3: (otherlv_1= 'rows' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTableDSL.g:1085:4: otherlv_1= 'rows'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getSquashRowsAccess().getRowsKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSquashRowsAccess().getByKeyword_2());
            		
            // InternalTableDSL.g:1094:3: ( (lv_columns_3_0= ruleColumnName ) )
            // InternalTableDSL.g:1095:4: (lv_columns_3_0= ruleColumnName )
            {
            // InternalTableDSL.g:1095:4: (lv_columns_3_0= ruleColumnName )
            // InternalTableDSL.g:1096:5: lv_columns_3_0= ruleColumnName
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

            // InternalTableDSL.g:1113:3: (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTableDSL.g:1114:4: otherlv_4= ',' ( (lv_columns_5_0= ruleColumnName ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSquashRowsAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalTableDSL.g:1118:4: ( (lv_columns_5_0= ruleColumnName ) )
            	    // InternalTableDSL.g:1119:5: (lv_columns_5_0= ruleColumnName )
            	    {
            	    // InternalTableDSL.g:1119:5: (lv_columns_5_0= ruleColumnName )
            	    // InternalTableDSL.g:1120:6: lv_columns_5_0= ruleColumnName
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
            	    break loop17;
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
    // InternalTableDSL.g:1142:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalTableDSL.g:1142:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalTableDSL.g:1143:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalTableDSL.g:1149:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_denylist_1_0= ruleFilterDenylist ) ) ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )? ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_denylist_1_0 = null;

        EObject lv_exceptlist_2_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1155:2: ( (otherlv_0= 'filter' ( (lv_denylist_1_0= ruleFilterDenylist ) ) ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )? ) )
            // InternalTableDSL.g:1156:2: (otherlv_0= 'filter' ( (lv_denylist_1_0= ruleFilterDenylist ) ) ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )? )
            {
            // InternalTableDSL.g:1156:2: (otherlv_0= 'filter' ( (lv_denylist_1_0= ruleFilterDenylist ) ) ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )? )
            // InternalTableDSL.g:1157:3: otherlv_0= 'filter' ( (lv_denylist_1_0= ruleFilterDenylist ) ) ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            // InternalTableDSL.g:1161:3: ( (lv_denylist_1_0= ruleFilterDenylist ) )
            // InternalTableDSL.g:1162:4: (lv_denylist_1_0= ruleFilterDenylist )
            {
            // InternalTableDSL.g:1162:4: (lv_denylist_1_0= ruleFilterDenylist )
            // InternalTableDSL.g:1163:5: lv_denylist_1_0= ruleFilterDenylist
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getDenylistFilterDenylistParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalTableDSL.g:1180:3: ( (lv_exceptlist_2_0= ruleFilterExceptlist ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTableDSL.g:1181:4: (lv_exceptlist_2_0= ruleFilterExceptlist )
                    {
                    // InternalTableDSL.g:1181:4: (lv_exceptlist_2_0= ruleFilterExceptlist )
                    // InternalTableDSL.g:1182:5: lv_exceptlist_2_0= ruleFilterExceptlist
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
    // InternalTableDSL.g:1203:1: entryRuleFilterDenylist returns [EObject current=null] : iv_ruleFilterDenylist= ruleFilterDenylist EOF ;
    public final EObject entryRuleFilterDenylist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterDenylist = null;


        try {
            // InternalTableDSL.g:1203:55: (iv_ruleFilterDenylist= ruleFilterDenylist EOF )
            // InternalTableDSL.g:1204:2: iv_ruleFilterDenylist= ruleFilterDenylist EOF
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
    // InternalTableDSL.g:1210:1: ruleFilterDenylist returns [EObject current=null] : (otherlv_0= 'deny' ( (lv_denylist_1_0= ruleFilterRule ) ) ) ;
    public final EObject ruleFilterDenylist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_denylist_1_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1216:2: ( (otherlv_0= 'deny' ( (lv_denylist_1_0= ruleFilterRule ) ) ) )
            // InternalTableDSL.g:1217:2: (otherlv_0= 'deny' ( (lv_denylist_1_0= ruleFilterRule ) ) )
            {
            // InternalTableDSL.g:1217:2: (otherlv_0= 'deny' ( (lv_denylist_1_0= ruleFilterRule ) ) )
            // InternalTableDSL.g:1218:3: otherlv_0= 'deny' ( (lv_denylist_1_0= ruleFilterRule ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterDenylistAccess().getDenyKeyword_0());
            		
            // InternalTableDSL.g:1222:3: ( (lv_denylist_1_0= ruleFilterRule ) )
            // InternalTableDSL.g:1223:4: (lv_denylist_1_0= ruleFilterRule )
            {
            // InternalTableDSL.g:1223:4: (lv_denylist_1_0= ruleFilterRule )
            // InternalTableDSL.g:1224:5: lv_denylist_1_0= ruleFilterRule
            {

            					newCompositeNode(grammarAccess.getFilterDenylistAccess().getDenylistFilterRuleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalTableDSL.g:1245:1: entryRuleFilterExceptlist returns [EObject current=null] : iv_ruleFilterExceptlist= ruleFilterExceptlist EOF ;
    public final EObject entryRuleFilterExceptlist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExceptlist = null;


        try {
            // InternalTableDSL.g:1245:57: (iv_ruleFilterExceptlist= ruleFilterExceptlist EOF )
            // InternalTableDSL.g:1246:2: iv_ruleFilterExceptlist= ruleFilterExceptlist EOF
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
    // InternalTableDSL.g:1252:1: ruleFilterExceptlist returns [EObject current=null] : (otherlv_0= 'except' ( (lv_exceptlist_1_0= ruleFilterRule ) ) ) ;
    public final EObject ruleFilterExceptlist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exceptlist_1_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1258:2: ( (otherlv_0= 'except' ( (lv_exceptlist_1_0= ruleFilterRule ) ) ) )
            // InternalTableDSL.g:1259:2: (otherlv_0= 'except' ( (lv_exceptlist_1_0= ruleFilterRule ) ) )
            {
            // InternalTableDSL.g:1259:2: (otherlv_0= 'except' ( (lv_exceptlist_1_0= ruleFilterRule ) ) )
            // InternalTableDSL.g:1260:3: otherlv_0= 'except' ( (lv_exceptlist_1_0= ruleFilterRule ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterExceptlistAccess().getExceptKeyword_0());
            		
            // InternalTableDSL.g:1264:3: ( (lv_exceptlist_1_0= ruleFilterRule ) )
            // InternalTableDSL.g:1265:4: (lv_exceptlist_1_0= ruleFilterRule )
            {
            // InternalTableDSL.g:1265:4: (lv_exceptlist_1_0= ruleFilterRule )
            // InternalTableDSL.g:1266:5: lv_exceptlist_1_0= ruleFilterRule
            {

            					newCompositeNode(grammarAccess.getFilterExceptlistAccess().getExceptlistFilterRuleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalTableDSL.g:1287:1: entryRuleFilterRule returns [EObject current=null] : iv_ruleFilterRule= ruleFilterRule EOF ;
    public final EObject entryRuleFilterRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterRule = null;


        try {
            // InternalTableDSL.g:1287:51: (iv_ruleFilterRule= ruleFilterRule EOF )
            // InternalTableDSL.g:1288:2: iv_ruleFilterRule= ruleFilterRule EOF
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
    // InternalTableDSL.g:1294:1: ruleFilterRule returns [EObject current=null] : (this_FilterColumnRule_0= ruleFilterColumnRule | this_FilterObjectTypeRule_1= ruleFilterObjectTypeRule ) ;
    public final EObject ruleFilterRule() throws RecognitionException {
        EObject current = null;

        EObject this_FilterColumnRule_0 = null;

        EObject this_FilterObjectTypeRule_1 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1300:2: ( (this_FilterColumnRule_0= ruleFilterColumnRule | this_FilterObjectTypeRule_1= ruleFilterObjectTypeRule ) )
            // InternalTableDSL.g:1301:2: (this_FilterColumnRule_0= ruleFilterColumnRule | this_FilterObjectTypeRule_1= ruleFilterObjectTypeRule )
            {
            // InternalTableDSL.g:1301:2: (this_FilterColumnRule_0= ruleFilterColumnRule | this_FilterObjectTypeRule_1= ruleFilterObjectTypeRule )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            else if ( (LA19_0==21) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalTableDSL.g:1302:3: this_FilterColumnRule_0= ruleFilterColumnRule
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
                    // InternalTableDSL.g:1311:3: this_FilterObjectTypeRule_1= ruleFilterObjectTypeRule
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


    // $ANTLR start "entryRuleFilterObjectTypeRule"
    // InternalTableDSL.g:1323:1: entryRuleFilterObjectTypeRule returns [EObject current=null] : iv_ruleFilterObjectTypeRule= ruleFilterObjectTypeRule EOF ;
    public final EObject entryRuleFilterObjectTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterObjectTypeRule = null;


        try {
            // InternalTableDSL.g:1323:61: (iv_ruleFilterObjectTypeRule= ruleFilterObjectTypeRule EOF )
            // InternalTableDSL.g:1324:2: iv_ruleFilterObjectTypeRule= ruleFilterObjectTypeRule EOF
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
    // InternalTableDSL.g:1330:1: ruleFilterObjectTypeRule returns [EObject current=null] : (otherlv_0= 'column' ( (lv_columnPattern_1_0= ruleColumnName ) ) ) ;
    public final EObject ruleFilterObjectTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_columnPattern_1_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:1336:2: ( (otherlv_0= 'column' ( (lv_columnPattern_1_0= ruleColumnName ) ) ) )
            // InternalTableDSL.g:1337:2: (otherlv_0= 'column' ( (lv_columnPattern_1_0= ruleColumnName ) ) )
            {
            // InternalTableDSL.g:1337:2: (otherlv_0= 'column' ( (lv_columnPattern_1_0= ruleColumnName ) ) )
            // InternalTableDSL.g:1338:3: otherlv_0= 'column' ( (lv_columnPattern_1_0= ruleColumnName ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterObjectTypeRuleAccess().getColumnKeyword_0());
            		
            // InternalTableDSL.g:1342:3: ( (lv_columnPattern_1_0= ruleColumnName ) )
            // InternalTableDSL.g:1343:4: (lv_columnPattern_1_0= ruleColumnName )
            {
            // InternalTableDSL.g:1343:4: (lv_columnPattern_1_0= ruleColumnName )
            // InternalTableDSL.g:1344:5: lv_columnPattern_1_0= ruleColumnName
            {

            					newCompositeNode(grammarAccess.getFilterObjectTypeRuleAccess().getColumnPatternColumnNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_columnPattern_1_0=ruleColumnName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterObjectTypeRuleRule());
            					}
            					set(
            						current,
            						"columnPattern",
            						lv_columnPattern_1_0,
            						"org.feup.els5.dsl.TableDSL.ColumnName");
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
    // $ANTLR end "ruleFilterObjectTypeRule"


    // $ANTLR start "entryRuleFilterColumnRule"
    // InternalTableDSL.g:1365:1: entryRuleFilterColumnRule returns [EObject current=null] : iv_ruleFilterColumnRule= ruleFilterColumnRule EOF ;
    public final EObject entryRuleFilterColumnRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterColumnRule = null;


        try {
            // InternalTableDSL.g:1365:57: (iv_ruleFilterColumnRule= ruleFilterColumnRule EOF )
            // InternalTableDSL.g:1366:2: iv_ruleFilterColumnRule= ruleFilterColumnRule EOF
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
    // InternalTableDSL.g:1372:1: ruleFilterColumnRule returns [EObject current=null] : (otherlv_0= 'object' (otherlv_1= 'of' )? ( (lv_objectClass_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFilterColumnRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_objectClass_2_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:1378:2: ( (otherlv_0= 'object' (otherlv_1= 'of' )? ( (lv_objectClass_2_0= RULE_STRING ) ) ) )
            // InternalTableDSL.g:1379:2: (otherlv_0= 'object' (otherlv_1= 'of' )? ( (lv_objectClass_2_0= RULE_STRING ) ) )
            {
            // InternalTableDSL.g:1379:2: (otherlv_0= 'object' (otherlv_1= 'of' )? ( (lv_objectClass_2_0= RULE_STRING ) ) )
            // InternalTableDSL.g:1380:3: otherlv_0= 'object' (otherlv_1= 'of' )? ( (lv_objectClass_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterColumnRuleAccess().getObjectKeyword_0());
            		
            // InternalTableDSL.g:1384:3: (otherlv_1= 'of' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTableDSL.g:1385:4: otherlv_1= 'of'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getFilterColumnRuleAccess().getOfKeyword_1());
                    			

                    }
                    break;

            }

            // InternalTableDSL.g:1390:3: ( (lv_objectClass_2_0= RULE_STRING ) )
            // InternalTableDSL.g:1391:4: (lv_objectClass_2_0= RULE_STRING )
            {
            // InternalTableDSL.g:1391:4: (lv_objectClass_2_0= RULE_STRING )
            // InternalTableDSL.g:1392:5: lv_objectClass_2_0= RULE_STRING
            {
            lv_objectClass_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_objectClass_2_0, grammarAccess.getFilterColumnRuleAccess().getObjectClassSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterColumnRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objectClass",
            						lv_objectClass_2_0,
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
    // $ANTLR end "ruleFilterColumnRule"


    // $ANTLR start "entryRuleColumnName"
    // InternalTableDSL.g:1412:1: entryRuleColumnName returns [EObject current=null] : iv_ruleColumnName= ruleColumnName EOF ;
    public final EObject entryRuleColumnName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnName = null;


        try {
            // InternalTableDSL.g:1412:51: (iv_ruleColumnName= ruleColumnName EOF )
            // InternalTableDSL.g:1413:2: iv_ruleColumnName= ruleColumnName EOF
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
    // InternalTableDSL.g:1419:1: ruleColumnName returns [EObject current=null] : ( ( (lv_columnName_0_1= RULE_RESERVED_KEYWORDS | lv_columnName_0_2= RULE_STRING ) ) ) ;
    public final EObject ruleColumnName() throws RecognitionException {
        EObject current = null;

        Token lv_columnName_0_1=null;
        Token lv_columnName_0_2=null;


        	enterRule();

        try {
            // InternalTableDSL.g:1425:2: ( ( ( (lv_columnName_0_1= RULE_RESERVED_KEYWORDS | lv_columnName_0_2= RULE_STRING ) ) ) )
            // InternalTableDSL.g:1426:2: ( ( (lv_columnName_0_1= RULE_RESERVED_KEYWORDS | lv_columnName_0_2= RULE_STRING ) ) )
            {
            // InternalTableDSL.g:1426:2: ( ( (lv_columnName_0_1= RULE_RESERVED_KEYWORDS | lv_columnName_0_2= RULE_STRING ) ) )
            // InternalTableDSL.g:1427:3: ( (lv_columnName_0_1= RULE_RESERVED_KEYWORDS | lv_columnName_0_2= RULE_STRING ) )
            {
            // InternalTableDSL.g:1427:3: ( (lv_columnName_0_1= RULE_RESERVED_KEYWORDS | lv_columnName_0_2= RULE_STRING ) )
            // InternalTableDSL.g:1428:4: (lv_columnName_0_1= RULE_RESERVED_KEYWORDS | lv_columnName_0_2= RULE_STRING )
            {
            // InternalTableDSL.g:1428:4: (lv_columnName_0_1= RULE_RESERVED_KEYWORDS | lv_columnName_0_2= RULE_STRING )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_RESERVED_KEYWORDS) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTableDSL.g:1429:5: lv_columnName_0_1= RULE_RESERVED_KEYWORDS
                    {
                    lv_columnName_0_1=(Token)match(input,RULE_RESERVED_KEYWORDS,FOLLOW_2); 

                    					newLeafNode(lv_columnName_0_1, grammarAccess.getColumnNameAccess().getColumnNameRESERVED_KEYWORDSTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"columnName",
                    						lv_columnName_0_1,
                    						"org.feup.els5.dsl.TableDSL.RESERVED_KEYWORDS");
                    				

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:1444:5: lv_columnName_0_2= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000002811A8002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000040000A0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000020L});

}