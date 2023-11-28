package org.feup.els5.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.feup.els5.dsl.services.TableDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTableDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COLUMN_NAME_KEYWORDS", "RULE_STRING", "RULE_ANY_OTHER", "RULE_SELECTOR_KEYWORDS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'column'", "'columns'", "'object'", "'objects'", "'create'", "'table'", "'from'", "'load'", "','", "'output'", "'to'", "'select'", "'rename'", "'prepend'", "'append'", "'extract'", "'sort'", "'by'", "'TOP'", "'squash'", "'rows'", "'filter'", "'deny'", "'except'", "'of'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_COLUMN_NAME_KEYWORDS=4;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
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
    public static final int RULE_ANY_OTHER=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_SELECTOR_KEYWORDS=7;
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

    	public void setGrammarAccess(TableDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleStart"
    // InternalTableDSL.g:53:1: entryRuleStart : ruleStart EOF ;
    public final void entryRuleStart() throws RecognitionException {
        try {
            // InternalTableDSL.g:54:1: ( ruleStart EOF )
            // InternalTableDSL.g:55:1: ruleStart EOF
            {
             before(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            ruleStart();

            state._fsp--;

             after(grammarAccess.getStartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalTableDSL.g:62:1: ruleStart : ( ( rule__Start__Group__0 ) ) ;
    public final void ruleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:66:2: ( ( ( rule__Start__Group__0 ) ) )
            // InternalTableDSL.g:67:2: ( ( rule__Start__Group__0 ) )
            {
            // InternalTableDSL.g:67:2: ( ( rule__Start__Group__0 ) )
            // InternalTableDSL.g:68:3: ( rule__Start__Group__0 )
            {
             before(grammarAccess.getStartAccess().getGroup()); 
            // InternalTableDSL.g:69:3: ( rule__Start__Group__0 )
            // InternalTableDSL.g:69:4: rule__Start__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Start__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleCreateTable"
    // InternalTableDSL.g:78:1: entryRuleCreateTable : ruleCreateTable EOF ;
    public final void entryRuleCreateTable() throws RecognitionException {
        try {
            // InternalTableDSL.g:79:1: ( ruleCreateTable EOF )
            // InternalTableDSL.g:80:1: ruleCreateTable EOF
            {
             before(grammarAccess.getCreateTableRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateTable();

            state._fsp--;

             after(grammarAccess.getCreateTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreateTable"


    // $ANTLR start "ruleCreateTable"
    // InternalTableDSL.g:87:1: ruleCreateTable : ( ( rule__CreateTable__Group__0 ) ) ;
    public final void ruleCreateTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:91:2: ( ( ( rule__CreateTable__Group__0 ) ) )
            // InternalTableDSL.g:92:2: ( ( rule__CreateTable__Group__0 ) )
            {
            // InternalTableDSL.g:92:2: ( ( rule__CreateTable__Group__0 ) )
            // InternalTableDSL.g:93:3: ( rule__CreateTable__Group__0 )
            {
             before(grammarAccess.getCreateTableAccess().getGroup()); 
            // InternalTableDSL.g:94:3: ( rule__CreateTable__Group__0 )
            // InternalTableDSL.g:94:4: rule__CreateTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateTable"


    // $ANTLR start "entryRuleTableAction"
    // InternalTableDSL.g:103:1: entryRuleTableAction : ruleTableAction EOF ;
    public final void entryRuleTableAction() throws RecognitionException {
        try {
            // InternalTableDSL.g:104:1: ( ruleTableAction EOF )
            // InternalTableDSL.g:105:1: ruleTableAction EOF
            {
             before(grammarAccess.getTableActionRule()); 
            pushFollow(FOLLOW_1);
            ruleTableAction();

            state._fsp--;

             after(grammarAccess.getTableActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableAction"


    // $ANTLR start "ruleTableAction"
    // InternalTableDSL.g:112:1: ruleTableAction : ( ( rule__TableAction__Group__0 ) ) ;
    public final void ruleTableAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:116:2: ( ( ( rule__TableAction__Group__0 ) ) )
            // InternalTableDSL.g:117:2: ( ( rule__TableAction__Group__0 ) )
            {
            // InternalTableDSL.g:117:2: ( ( rule__TableAction__Group__0 ) )
            // InternalTableDSL.g:118:3: ( rule__TableAction__Group__0 )
            {
             before(grammarAccess.getTableActionAccess().getGroup()); 
            // InternalTableDSL.g:119:3: ( rule__TableAction__Group__0 )
            // InternalTableDSL.g:119:4: rule__TableAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableAction"


    // $ANTLR start "entryRuleLoadData"
    // InternalTableDSL.g:128:1: entryRuleLoadData : ruleLoadData EOF ;
    public final void entryRuleLoadData() throws RecognitionException {
        try {
            // InternalTableDSL.g:129:1: ( ruleLoadData EOF )
            // InternalTableDSL.g:130:1: ruleLoadData EOF
            {
             before(grammarAccess.getLoadDataRule()); 
            pushFollow(FOLLOW_1);
            ruleLoadData();

            state._fsp--;

             after(grammarAccess.getLoadDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoadData"


    // $ANTLR start "ruleLoadData"
    // InternalTableDSL.g:137:1: ruleLoadData : ( ( rule__LoadData__Group__0 ) ) ;
    public final void ruleLoadData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:141:2: ( ( ( rule__LoadData__Group__0 ) ) )
            // InternalTableDSL.g:142:2: ( ( rule__LoadData__Group__0 ) )
            {
            // InternalTableDSL.g:142:2: ( ( rule__LoadData__Group__0 ) )
            // InternalTableDSL.g:143:3: ( rule__LoadData__Group__0 )
            {
             before(grammarAccess.getLoadDataAccess().getGroup()); 
            // InternalTableDSL.g:144:3: ( rule__LoadData__Group__0 )
            // InternalTableDSL.g:144:4: rule__LoadData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoadData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoadData"


    // $ANTLR start "entryRuleTableInputPath"
    // InternalTableDSL.g:153:1: entryRuleTableInputPath : ruleTableInputPath EOF ;
    public final void entryRuleTableInputPath() throws RecognitionException {
        try {
            // InternalTableDSL.g:154:1: ( ruleTableInputPath EOF )
            // InternalTableDSL.g:155:1: ruleTableInputPath EOF
            {
             before(grammarAccess.getTableInputPathRule()); 
            pushFollow(FOLLOW_1);
            ruleTableInputPath();

            state._fsp--;

             after(grammarAccess.getTableInputPathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableInputPath"


    // $ANTLR start "ruleTableInputPath"
    // InternalTableDSL.g:162:1: ruleTableInputPath : ( ( rule__TableInputPath__Group__0 ) ) ;
    public final void ruleTableInputPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:166:2: ( ( ( rule__TableInputPath__Group__0 ) ) )
            // InternalTableDSL.g:167:2: ( ( rule__TableInputPath__Group__0 ) )
            {
            // InternalTableDSL.g:167:2: ( ( rule__TableInputPath__Group__0 ) )
            // InternalTableDSL.g:168:3: ( rule__TableInputPath__Group__0 )
            {
             before(grammarAccess.getTableInputPathAccess().getGroup()); 
            // InternalTableDSL.g:169:3: ( rule__TableInputPath__Group__0 )
            // InternalTableDSL.g:169:4: rule__TableInputPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableInputPath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableInputPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableInputPath"


    // $ANTLR start "entryRuleOutput"
    // InternalTableDSL.g:178:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalTableDSL.g:179:1: ( ruleOutput EOF )
            // InternalTableDSL.g:180:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalTableDSL.g:187:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:191:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalTableDSL.g:192:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalTableDSL.g:192:2: ( ( rule__Output__Group__0 ) )
            // InternalTableDSL.g:193:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalTableDSL.g:194:3: ( rule__Output__Group__0 )
            // InternalTableDSL.g:194:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleOperation"
    // InternalTableDSL.g:203:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalTableDSL.g:204:1: ( ruleOperation EOF )
            // InternalTableDSL.g:205:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalTableDSL.g:212:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:216:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalTableDSL.g:217:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalTableDSL.g:217:2: ( ( rule__Operation__Alternatives ) )
            // InternalTableDSL.g:218:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalTableDSL.g:219:3: ( rule__Operation__Alternatives )
            // InternalTableDSL.g:219:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelect"
    // InternalTableDSL.g:228:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalTableDSL.g:229:1: ( ruleSelect EOF )
            // InternalTableDSL.g:230:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalTableDSL.g:237:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:241:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalTableDSL.g:242:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalTableDSL.g:242:2: ( ( rule__Select__Group__0 ) )
            // InternalTableDSL.g:243:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalTableDSL.g:244:3: ( rule__Select__Group__0 )
            // InternalTableDSL.g:244:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleRenameColumn"
    // InternalTableDSL.g:253:1: entryRuleRenameColumn : ruleRenameColumn EOF ;
    public final void entryRuleRenameColumn() throws RecognitionException {
        try {
            // InternalTableDSL.g:254:1: ( ruleRenameColumn EOF )
            // InternalTableDSL.g:255:1: ruleRenameColumn EOF
            {
             before(grammarAccess.getRenameColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameColumn();

            state._fsp--;

             after(grammarAccess.getRenameColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameColumn"


    // $ANTLR start "ruleRenameColumn"
    // InternalTableDSL.g:262:1: ruleRenameColumn : ( ( rule__RenameColumn__Group__0 ) ) ;
    public final void ruleRenameColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:266:2: ( ( ( rule__RenameColumn__Group__0 ) ) )
            // InternalTableDSL.g:267:2: ( ( rule__RenameColumn__Group__0 ) )
            {
            // InternalTableDSL.g:267:2: ( ( rule__RenameColumn__Group__0 ) )
            // InternalTableDSL.g:268:3: ( rule__RenameColumn__Group__0 )
            {
             before(grammarAccess.getRenameColumnAccess().getGroup()); 
            // InternalTableDSL.g:269:3: ( rule__RenameColumn__Group__0 )
            // InternalTableDSL.g:269:4: rule__RenameColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameColumn"


    // $ANTLR start "entryRuleRenameColumnPair"
    // InternalTableDSL.g:278:1: entryRuleRenameColumnPair : ruleRenameColumnPair EOF ;
    public final void entryRuleRenameColumnPair() throws RecognitionException {
        try {
            // InternalTableDSL.g:279:1: ( ruleRenameColumnPair EOF )
            // InternalTableDSL.g:280:1: ruleRenameColumnPair EOF
            {
             before(grammarAccess.getRenameColumnPairRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameColumnPair();

            state._fsp--;

             after(grammarAccess.getRenameColumnPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameColumnPair"


    // $ANTLR start "ruleRenameColumnPair"
    // InternalTableDSL.g:287:1: ruleRenameColumnPair : ( ( rule__RenameColumnPair__Alternatives ) ) ;
    public final void ruleRenameColumnPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:291:2: ( ( ( rule__RenameColumnPair__Alternatives ) ) )
            // InternalTableDSL.g:292:2: ( ( rule__RenameColumnPair__Alternatives ) )
            {
            // InternalTableDSL.g:292:2: ( ( rule__RenameColumnPair__Alternatives ) )
            // InternalTableDSL.g:293:3: ( rule__RenameColumnPair__Alternatives )
            {
             before(grammarAccess.getRenameColumnPairAccess().getAlternatives()); 
            // InternalTableDSL.g:294:3: ( rule__RenameColumnPair__Alternatives )
            // InternalTableDSL.g:294:4: rule__RenameColumnPair__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnPair__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnPairAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameColumnPair"


    // $ANTLR start "entryRuleRenameColumnToPair"
    // InternalTableDSL.g:303:1: entryRuleRenameColumnToPair : ruleRenameColumnToPair EOF ;
    public final void entryRuleRenameColumnToPair() throws RecognitionException {
        try {
            // InternalTableDSL.g:304:1: ( ruleRenameColumnToPair EOF )
            // InternalTableDSL.g:305:1: ruleRenameColumnToPair EOF
            {
             before(grammarAccess.getRenameColumnToPairRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameColumnToPair();

            state._fsp--;

             after(grammarAccess.getRenameColumnToPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameColumnToPair"


    // $ANTLR start "ruleRenameColumnToPair"
    // InternalTableDSL.g:312:1: ruleRenameColumnToPair : ( ( rule__RenameColumnToPair__Group__0 ) ) ;
    public final void ruleRenameColumnToPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:316:2: ( ( ( rule__RenameColumnToPair__Group__0 ) ) )
            // InternalTableDSL.g:317:2: ( ( rule__RenameColumnToPair__Group__0 ) )
            {
            // InternalTableDSL.g:317:2: ( ( rule__RenameColumnToPair__Group__0 ) )
            // InternalTableDSL.g:318:3: ( rule__RenameColumnToPair__Group__0 )
            {
             before(grammarAccess.getRenameColumnToPairAccess().getGroup()); 
            // InternalTableDSL.g:319:3: ( rule__RenameColumnToPair__Group__0 )
            // InternalTableDSL.g:319:4: rule__RenameColumnToPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnToPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameColumnToPair"


    // $ANTLR start "entryRuleRenameColumnPrependPair"
    // InternalTableDSL.g:328:1: entryRuleRenameColumnPrependPair : ruleRenameColumnPrependPair EOF ;
    public final void entryRuleRenameColumnPrependPair() throws RecognitionException {
        try {
            // InternalTableDSL.g:329:1: ( ruleRenameColumnPrependPair EOF )
            // InternalTableDSL.g:330:1: ruleRenameColumnPrependPair EOF
            {
             before(grammarAccess.getRenameColumnPrependPairRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameColumnPrependPair();

            state._fsp--;

             after(grammarAccess.getRenameColumnPrependPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameColumnPrependPair"


    // $ANTLR start "ruleRenameColumnPrependPair"
    // InternalTableDSL.g:337:1: ruleRenameColumnPrependPair : ( ( rule__RenameColumnPrependPair__Group__0 ) ) ;
    public final void ruleRenameColumnPrependPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:341:2: ( ( ( rule__RenameColumnPrependPair__Group__0 ) ) )
            // InternalTableDSL.g:342:2: ( ( rule__RenameColumnPrependPair__Group__0 ) )
            {
            // InternalTableDSL.g:342:2: ( ( rule__RenameColumnPrependPair__Group__0 ) )
            // InternalTableDSL.g:343:3: ( rule__RenameColumnPrependPair__Group__0 )
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getGroup()); 
            // InternalTableDSL.g:344:3: ( rule__RenameColumnPrependPair__Group__0 )
            // InternalTableDSL.g:344:4: rule__RenameColumnPrependPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnPrependPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameColumnPrependPair"


    // $ANTLR start "entryRuleRenameColumnAppendPair"
    // InternalTableDSL.g:353:1: entryRuleRenameColumnAppendPair : ruleRenameColumnAppendPair EOF ;
    public final void entryRuleRenameColumnAppendPair() throws RecognitionException {
        try {
            // InternalTableDSL.g:354:1: ( ruleRenameColumnAppendPair EOF )
            // InternalTableDSL.g:355:1: ruleRenameColumnAppendPair EOF
            {
             before(grammarAccess.getRenameColumnAppendPairRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameColumnAppendPair();

            state._fsp--;

             after(grammarAccess.getRenameColumnAppendPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameColumnAppendPair"


    // $ANTLR start "ruleRenameColumnAppendPair"
    // InternalTableDSL.g:362:1: ruleRenameColumnAppendPair : ( ( rule__RenameColumnAppendPair__Group__0 ) ) ;
    public final void ruleRenameColumnAppendPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:366:2: ( ( ( rule__RenameColumnAppendPair__Group__0 ) ) )
            // InternalTableDSL.g:367:2: ( ( rule__RenameColumnAppendPair__Group__0 ) )
            {
            // InternalTableDSL.g:367:2: ( ( rule__RenameColumnAppendPair__Group__0 ) )
            // InternalTableDSL.g:368:3: ( rule__RenameColumnAppendPair__Group__0 )
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getGroup()); 
            // InternalTableDSL.g:369:3: ( rule__RenameColumnAppendPair__Group__0 )
            // InternalTableDSL.g:369:4: rule__RenameColumnAppendPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAppendPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameColumnAppendPair"


    // $ANTLR start "entryRuleExtract"
    // InternalTableDSL.g:378:1: entryRuleExtract : ruleExtract EOF ;
    public final void entryRuleExtract() throws RecognitionException {
        try {
            // InternalTableDSL.g:379:1: ( ruleExtract EOF )
            // InternalTableDSL.g:380:1: ruleExtract EOF
            {
             before(grammarAccess.getExtractRule()); 
            pushFollow(FOLLOW_1);
            ruleExtract();

            state._fsp--;

             after(grammarAccess.getExtractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtract"


    // $ANTLR start "ruleExtract"
    // InternalTableDSL.g:387:1: ruleExtract : ( ( rule__Extract__Group__0 ) ) ;
    public final void ruleExtract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:391:2: ( ( ( rule__Extract__Group__0 ) ) )
            // InternalTableDSL.g:392:2: ( ( rule__Extract__Group__0 ) )
            {
            // InternalTableDSL.g:392:2: ( ( rule__Extract__Group__0 ) )
            // InternalTableDSL.g:393:3: ( rule__Extract__Group__0 )
            {
             before(grammarAccess.getExtractAccess().getGroup()); 
            // InternalTableDSL.g:394:3: ( rule__Extract__Group__0 )
            // InternalTableDSL.g:394:4: rule__Extract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Extract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtract"


    // $ANTLR start "entryRuleSelector"
    // InternalTableDSL.g:403:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalTableDSL.g:404:1: ( ruleSelector EOF )
            // InternalTableDSL.g:405:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalTableDSL.g:412:1: ruleSelector : ( ( rule__Selector__Alternatives ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:416:2: ( ( ( rule__Selector__Alternatives ) ) )
            // InternalTableDSL.g:417:2: ( ( rule__Selector__Alternatives ) )
            {
            // InternalTableDSL.g:417:2: ( ( rule__Selector__Alternatives ) )
            // InternalTableDSL.g:418:3: ( rule__Selector__Alternatives )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives()); 
            // InternalTableDSL.g:419:3: ( rule__Selector__Alternatives )
            // InternalTableDSL.g:419:4: rule__Selector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleComparator"
    // InternalTableDSL.g:428:1: entryRuleComparator : ruleComparator EOF ;
    public final void entryRuleComparator() throws RecognitionException {
        try {
            // InternalTableDSL.g:429:1: ( ruleComparator EOF )
            // InternalTableDSL.g:430:1: ruleComparator EOF
            {
             before(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getComparatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalTableDSL.g:437:1: ruleComparator : ( ( rule__Comparator__Group__0 ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:441:2: ( ( ( rule__Comparator__Group__0 ) ) )
            // InternalTableDSL.g:442:2: ( ( rule__Comparator__Group__0 ) )
            {
            // InternalTableDSL.g:442:2: ( ( rule__Comparator__Group__0 ) )
            // InternalTableDSL.g:443:3: ( rule__Comparator__Group__0 )
            {
             before(grammarAccess.getComparatorAccess().getGroup()); 
            // InternalTableDSL.g:444:3: ( rule__Comparator__Group__0 )
            // InternalTableDSL.g:444:4: rule__Comparator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleSquashRows"
    // InternalTableDSL.g:453:1: entryRuleSquashRows : ruleSquashRows EOF ;
    public final void entryRuleSquashRows() throws RecognitionException {
        try {
            // InternalTableDSL.g:454:1: ( ruleSquashRows EOF )
            // InternalTableDSL.g:455:1: ruleSquashRows EOF
            {
             before(grammarAccess.getSquashRowsRule()); 
            pushFollow(FOLLOW_1);
            ruleSquashRows();

            state._fsp--;

             after(grammarAccess.getSquashRowsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSquashRows"


    // $ANTLR start "ruleSquashRows"
    // InternalTableDSL.g:462:1: ruleSquashRows : ( ( rule__SquashRows__Group__0 ) ) ;
    public final void ruleSquashRows() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:466:2: ( ( ( rule__SquashRows__Group__0 ) ) )
            // InternalTableDSL.g:467:2: ( ( rule__SquashRows__Group__0 ) )
            {
            // InternalTableDSL.g:467:2: ( ( rule__SquashRows__Group__0 ) )
            // InternalTableDSL.g:468:3: ( rule__SquashRows__Group__0 )
            {
             before(grammarAccess.getSquashRowsAccess().getGroup()); 
            // InternalTableDSL.g:469:3: ( rule__SquashRows__Group__0 )
            // InternalTableDSL.g:469:4: rule__SquashRows__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSquashRowsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSquashRows"


    // $ANTLR start "entryRuleFilter"
    // InternalTableDSL.g:478:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalTableDSL.g:479:1: ( ruleFilter EOF )
            // InternalTableDSL.g:480:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalTableDSL.g:487:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:491:2: ( ( ( rule__Filter__Group__0 ) ) )
            // InternalTableDSL.g:492:2: ( ( rule__Filter__Group__0 ) )
            {
            // InternalTableDSL.g:492:2: ( ( rule__Filter__Group__0 ) )
            // InternalTableDSL.g:493:3: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // InternalTableDSL.g:494:3: ( rule__Filter__Group__0 )
            // InternalTableDSL.g:494:4: rule__Filter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleFilterDenylist"
    // InternalTableDSL.g:503:1: entryRuleFilterDenylist : ruleFilterDenylist EOF ;
    public final void entryRuleFilterDenylist() throws RecognitionException {
        try {
            // InternalTableDSL.g:504:1: ( ruleFilterDenylist EOF )
            // InternalTableDSL.g:505:1: ruleFilterDenylist EOF
            {
             before(grammarAccess.getFilterDenylistRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterDenylist();

            state._fsp--;

             after(grammarAccess.getFilterDenylistRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterDenylist"


    // $ANTLR start "ruleFilterDenylist"
    // InternalTableDSL.g:512:1: ruleFilterDenylist : ( ( rule__FilterDenylist__Group__0 ) ) ;
    public final void ruleFilterDenylist() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:516:2: ( ( ( rule__FilterDenylist__Group__0 ) ) )
            // InternalTableDSL.g:517:2: ( ( rule__FilterDenylist__Group__0 ) )
            {
            // InternalTableDSL.g:517:2: ( ( rule__FilterDenylist__Group__0 ) )
            // InternalTableDSL.g:518:3: ( rule__FilterDenylist__Group__0 )
            {
             before(grammarAccess.getFilterDenylistAccess().getGroup()); 
            // InternalTableDSL.g:519:3: ( rule__FilterDenylist__Group__0 )
            // InternalTableDSL.g:519:4: rule__FilterDenylist__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterDenylistAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterDenylist"


    // $ANTLR start "entryRuleFilterExceptlist"
    // InternalTableDSL.g:528:1: entryRuleFilterExceptlist : ruleFilterExceptlist EOF ;
    public final void entryRuleFilterExceptlist() throws RecognitionException {
        try {
            // InternalTableDSL.g:529:1: ( ruleFilterExceptlist EOF )
            // InternalTableDSL.g:530:1: ruleFilterExceptlist EOF
            {
             before(grammarAccess.getFilterExceptlistRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterExceptlist();

            state._fsp--;

             after(grammarAccess.getFilterExceptlistRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterExceptlist"


    // $ANTLR start "ruleFilterExceptlist"
    // InternalTableDSL.g:537:1: ruleFilterExceptlist : ( ( rule__FilterExceptlist__Group__0 ) ) ;
    public final void ruleFilterExceptlist() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:541:2: ( ( ( rule__FilterExceptlist__Group__0 ) ) )
            // InternalTableDSL.g:542:2: ( ( rule__FilterExceptlist__Group__0 ) )
            {
            // InternalTableDSL.g:542:2: ( ( rule__FilterExceptlist__Group__0 ) )
            // InternalTableDSL.g:543:3: ( rule__FilterExceptlist__Group__0 )
            {
             before(grammarAccess.getFilterExceptlistAccess().getGroup()); 
            // InternalTableDSL.g:544:3: ( rule__FilterExceptlist__Group__0 )
            // InternalTableDSL.g:544:4: rule__FilterExceptlist__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterExceptlistAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterExceptlist"


    // $ANTLR start "entryRuleFilterRule"
    // InternalTableDSL.g:553:1: entryRuleFilterRule : ruleFilterRule EOF ;
    public final void entryRuleFilterRule() throws RecognitionException {
        try {
            // InternalTableDSL.g:554:1: ( ruleFilterRule EOF )
            // InternalTableDSL.g:555:1: ruleFilterRule EOF
            {
             before(grammarAccess.getFilterRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterRule();

            state._fsp--;

             after(grammarAccess.getFilterRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterRule"


    // $ANTLR start "ruleFilterRule"
    // InternalTableDSL.g:562:1: ruleFilterRule : ( ( rule__FilterRule__Alternatives ) ) ;
    public final void ruleFilterRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:566:2: ( ( ( rule__FilterRule__Alternatives ) ) )
            // InternalTableDSL.g:567:2: ( ( rule__FilterRule__Alternatives ) )
            {
            // InternalTableDSL.g:567:2: ( ( rule__FilterRule__Alternatives ) )
            // InternalTableDSL.g:568:3: ( rule__FilterRule__Alternatives )
            {
             before(grammarAccess.getFilterRuleAccess().getAlternatives()); 
            // InternalTableDSL.g:569:3: ( rule__FilterRule__Alternatives )
            // InternalTableDSL.g:569:4: rule__FilterRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilterRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterRule"


    // $ANTLR start "entryRuleFilterColumnRule"
    // InternalTableDSL.g:578:1: entryRuleFilterColumnRule : ruleFilterColumnRule EOF ;
    public final void entryRuleFilterColumnRule() throws RecognitionException {
        try {
            // InternalTableDSL.g:579:1: ( ruleFilterColumnRule EOF )
            // InternalTableDSL.g:580:1: ruleFilterColumnRule EOF
            {
             before(grammarAccess.getFilterColumnRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterColumnRule();

            state._fsp--;

             after(grammarAccess.getFilterColumnRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterColumnRule"


    // $ANTLR start "ruleFilterColumnRule"
    // InternalTableDSL.g:587:1: ruleFilterColumnRule : ( ( rule__FilterColumnRule__Group__0 ) ) ;
    public final void ruleFilterColumnRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:591:2: ( ( ( rule__FilterColumnRule__Group__0 ) ) )
            // InternalTableDSL.g:592:2: ( ( rule__FilterColumnRule__Group__0 ) )
            {
            // InternalTableDSL.g:592:2: ( ( rule__FilterColumnRule__Group__0 ) )
            // InternalTableDSL.g:593:3: ( rule__FilterColumnRule__Group__0 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getGroup()); 
            // InternalTableDSL.g:594:3: ( rule__FilterColumnRule__Group__0 )
            // InternalTableDSL.g:594:4: rule__FilterColumnRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterColumnRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterColumnRule"


    // $ANTLR start "entryRuleFilterObjectTypeRule"
    // InternalTableDSL.g:603:1: entryRuleFilterObjectTypeRule : ruleFilterObjectTypeRule EOF ;
    public final void entryRuleFilterObjectTypeRule() throws RecognitionException {
        try {
            // InternalTableDSL.g:604:1: ( ruleFilterObjectTypeRule EOF )
            // InternalTableDSL.g:605:1: ruleFilterObjectTypeRule EOF
            {
             before(grammarAccess.getFilterObjectTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterObjectTypeRule();

            state._fsp--;

             after(grammarAccess.getFilterObjectTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterObjectTypeRule"


    // $ANTLR start "ruleFilterObjectTypeRule"
    // InternalTableDSL.g:612:1: ruleFilterObjectTypeRule : ( ( rule__FilterObjectTypeRule__Group__0 ) ) ;
    public final void ruleFilterObjectTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:616:2: ( ( ( rule__FilterObjectTypeRule__Group__0 ) ) )
            // InternalTableDSL.g:617:2: ( ( rule__FilterObjectTypeRule__Group__0 ) )
            {
            // InternalTableDSL.g:617:2: ( ( rule__FilterObjectTypeRule__Group__0 ) )
            // InternalTableDSL.g:618:3: ( rule__FilterObjectTypeRule__Group__0 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getGroup()); 
            // InternalTableDSL.g:619:3: ( rule__FilterObjectTypeRule__Group__0 )
            // InternalTableDSL.g:619:4: rule__FilterObjectTypeRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterObjectTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterObjectTypeRule"


    // $ANTLR start "entryRuleColumnName"
    // InternalTableDSL.g:628:1: entryRuleColumnName : ruleColumnName EOF ;
    public final void entryRuleColumnName() throws RecognitionException {
        try {
            // InternalTableDSL.g:629:1: ( ruleColumnName EOF )
            // InternalTableDSL.g:630:1: ruleColumnName EOF
            {
             before(grammarAccess.getColumnNameRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getColumnNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnName"


    // $ANTLR start "ruleColumnName"
    // InternalTableDSL.g:637:1: ruleColumnName : ( ( rule__ColumnName__ColumnNameAssignment ) ) ;
    public final void ruleColumnName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:641:2: ( ( ( rule__ColumnName__ColumnNameAssignment ) ) )
            // InternalTableDSL.g:642:2: ( ( rule__ColumnName__ColumnNameAssignment ) )
            {
            // InternalTableDSL.g:642:2: ( ( rule__ColumnName__ColumnNameAssignment ) )
            // InternalTableDSL.g:643:3: ( rule__ColumnName__ColumnNameAssignment )
            {
             before(grammarAccess.getColumnNameAccess().getColumnNameAssignment()); 
            // InternalTableDSL.g:644:3: ( rule__ColumnName__ColumnNameAssignment )
            // InternalTableDSL.g:644:4: rule__ColumnName__ColumnNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColumnName__ColumnNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnNameAccess().getColumnNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnName"


    // $ANTLR start "rule__TableAction__Alternatives_0"
    // InternalTableDSL.g:652:1: rule__TableAction__Alternatives_0 : ( ( ruleLoadData ) | ( ruleOperation ) | ( ruleOutput ) );
    public final void rule__TableAction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:656:1: ( ( ruleLoadData ) | ( ruleOperation ) | ( ruleOutput ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 24:
            case 25:
            case 28:
            case 32:
            case 34:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTableDSL.g:657:2: ( ruleLoadData )
                    {
                    // InternalTableDSL.g:657:2: ( ruleLoadData )
                    // InternalTableDSL.g:658:3: ruleLoadData
                    {
                     before(grammarAccess.getTableActionAccess().getLoadDataParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoadData();

                    state._fsp--;

                     after(grammarAccess.getTableActionAccess().getLoadDataParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:663:2: ( ruleOperation )
                    {
                    // InternalTableDSL.g:663:2: ( ruleOperation )
                    // InternalTableDSL.g:664:3: ruleOperation
                    {
                     before(grammarAccess.getTableActionAccess().getOperationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getTableActionAccess().getOperationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:669:2: ( ruleOutput )
                    {
                    // InternalTableDSL.g:669:2: ( ruleOutput )
                    // InternalTableDSL.g:670:3: ruleOutput
                    {
                     before(grammarAccess.getTableActionAccess().getOutputParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOutput();

                    state._fsp--;

                     after(grammarAccess.getTableActionAccess().getOutputParserRuleCall_0_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Alternatives_0"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalTableDSL.g:679:1: rule__Operation__Alternatives : ( ( ruleSelect ) | ( ruleRenameColumn ) | ( ruleExtract ) | ( ruleSquashRows ) | ( ruleFilter ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:683:1: ( ( ruleSelect ) | ( ruleRenameColumn ) | ( ruleExtract ) | ( ruleSquashRows ) | ( ruleFilter ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            case 34:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTableDSL.g:684:2: ( ruleSelect )
                    {
                    // InternalTableDSL.g:684:2: ( ruleSelect )
                    // InternalTableDSL.g:685:3: ruleSelect
                    {
                     before(grammarAccess.getOperationAccess().getSelectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getSelectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:690:2: ( ruleRenameColumn )
                    {
                    // InternalTableDSL.g:690:2: ( ruleRenameColumn )
                    // InternalTableDSL.g:691:3: ruleRenameColumn
                    {
                     before(grammarAccess.getOperationAccess().getRenameColumnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameColumn();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getRenameColumnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:696:2: ( ruleExtract )
                    {
                    // InternalTableDSL.g:696:2: ( ruleExtract )
                    // InternalTableDSL.g:697:3: ruleExtract
                    {
                     before(grammarAccess.getOperationAccess().getExtractParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExtract();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getExtractParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTableDSL.g:702:2: ( ruleSquashRows )
                    {
                    // InternalTableDSL.g:702:2: ( ruleSquashRows )
                    // InternalTableDSL.g:703:3: ruleSquashRows
                    {
                     before(grammarAccess.getOperationAccess().getSquashRowsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSquashRows();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getSquashRowsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTableDSL.g:708:2: ( ruleFilter )
                    {
                    // InternalTableDSL.g:708:2: ( ruleFilter )
                    // InternalTableDSL.g:709:3: ruleFilter
                    {
                     before(grammarAccess.getOperationAccess().getFilterParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFilter();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getFilterParserRuleCall_4()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__RenameColumnPair__Alternatives"
    // InternalTableDSL.g:718:1: rule__RenameColumnPair__Alternatives : ( ( ruleRenameColumnToPair ) | ( ruleRenameColumnAppendPair ) | ( ruleRenameColumnPrependPair ) );
    public final void rule__RenameColumnPair__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:722:1: ( ( ruleRenameColumnToPair ) | ( ruleRenameColumnAppendPair ) | ( ruleRenameColumnPrependPair ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt3=2;
                    }
                    break;
                case 23:
                    {
                    alt3=1;
                    }
                    break;
                case 26:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTableDSL.g:723:2: ( ruleRenameColumnToPair )
                    {
                    // InternalTableDSL.g:723:2: ( ruleRenameColumnToPair )
                    // InternalTableDSL.g:724:3: ruleRenameColumnToPair
                    {
                     before(grammarAccess.getRenameColumnPairAccess().getRenameColumnToPairParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameColumnToPair();

                    state._fsp--;

                     after(grammarAccess.getRenameColumnPairAccess().getRenameColumnToPairParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:729:2: ( ruleRenameColumnAppendPair )
                    {
                    // InternalTableDSL.g:729:2: ( ruleRenameColumnAppendPair )
                    // InternalTableDSL.g:730:3: ruleRenameColumnAppendPair
                    {
                     before(grammarAccess.getRenameColumnPairAccess().getRenameColumnAppendPairParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameColumnAppendPair();

                    state._fsp--;

                     after(grammarAccess.getRenameColumnPairAccess().getRenameColumnAppendPairParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:735:2: ( ruleRenameColumnPrependPair )
                    {
                    // InternalTableDSL.g:735:2: ( ruleRenameColumnPrependPair )
                    // InternalTableDSL.g:736:3: ruleRenameColumnPrependPair
                    {
                     before(grammarAccess.getRenameColumnPairAccess().getRenameColumnPrependPairParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameColumnPrependPair();

                    state._fsp--;

                     after(grammarAccess.getRenameColumnPairAccess().getRenameColumnPrependPairParserRuleCall_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPair__Alternatives"


    // $ANTLR start "rule__Selector__Alternatives"
    // InternalTableDSL.g:745:1: rule__Selector__Alternatives : ( ( ( rule__Selector__Group_0__0 ) ) | ( ( rule__Selector__Group_1__0 ) ) );
    public final void rule__Selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:749:1: ( ( ( rule__Selector__Group_0__0 ) ) | ( ( rule__Selector__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SELECTOR_KEYWORDS) ) {
                alt4=1;
            }
            else if ( (LA4_0==31) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTableDSL.g:750:2: ( ( rule__Selector__Group_0__0 ) )
                    {
                    // InternalTableDSL.g:750:2: ( ( rule__Selector__Group_0__0 ) )
                    // InternalTableDSL.g:751:3: ( rule__Selector__Group_0__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_0()); 
                    // InternalTableDSL.g:752:3: ( rule__Selector__Group_0__0 )
                    // InternalTableDSL.g:752:4: rule__Selector__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:756:2: ( ( rule__Selector__Group_1__0 ) )
                    {
                    // InternalTableDSL.g:756:2: ( ( rule__Selector__Group_1__0 ) )
                    // InternalTableDSL.g:757:3: ( rule__Selector__Group_1__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1()); 
                    // InternalTableDSL.g:758:3: ( rule__Selector__Group_1__0 )
                    // InternalTableDSL.g:758:4: rule__Selector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Alternatives"


    // $ANTLR start "rule__FilterRule__Alternatives"
    // InternalTableDSL.g:766:1: rule__FilterRule__Alternatives : ( ( ruleFilterColumnRule ) | ( ruleFilterObjectTypeRule ) );
    public final void rule__FilterRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:770:1: ( ( ruleFilterColumnRule ) | ( ruleFilterObjectTypeRule ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTableDSL.g:771:2: ( ruleFilterColumnRule )
                    {
                    // InternalTableDSL.g:771:2: ( ruleFilterColumnRule )
                    // InternalTableDSL.g:772:3: ruleFilterColumnRule
                    {
                     before(grammarAccess.getFilterRuleAccess().getFilterColumnRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFilterColumnRule();

                    state._fsp--;

                     after(grammarAccess.getFilterRuleAccess().getFilterColumnRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:777:2: ( ruleFilterObjectTypeRule )
                    {
                    // InternalTableDSL.g:777:2: ( ruleFilterObjectTypeRule )
                    // InternalTableDSL.g:778:3: ruleFilterObjectTypeRule
                    {
                     before(grammarAccess.getFilterRuleAccess().getFilterObjectTypeRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFilterObjectTypeRule();

                    state._fsp--;

                     after(grammarAccess.getFilterRuleAccess().getFilterObjectTypeRuleParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterRule__Alternatives"


    // $ANTLR start "rule__FilterColumnRule__Alternatives_0"
    // InternalTableDSL.g:787:1: rule__FilterColumnRule__Alternatives_0 : ( ( 'column' ) | ( 'columns' ) );
    public final void rule__FilterColumnRule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:791:1: ( ( 'column' ) | ( 'columns' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTableDSL.g:792:2: ( 'column' )
                    {
                    // InternalTableDSL.g:792:2: ( 'column' )
                    // InternalTableDSL.g:793:3: 'column'
                    {
                     before(grammarAccess.getFilterColumnRuleAccess().getColumnKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getFilterColumnRuleAccess().getColumnKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:798:2: ( 'columns' )
                    {
                    // InternalTableDSL.g:798:2: ( 'columns' )
                    // InternalTableDSL.g:799:3: 'columns'
                    {
                     before(grammarAccess.getFilterColumnRuleAccess().getColumnsKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFilterColumnRuleAccess().getColumnsKeyword_0_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Alternatives_0"


    // $ANTLR start "rule__FilterObjectTypeRule__Alternatives_0"
    // InternalTableDSL.g:808:1: rule__FilterObjectTypeRule__Alternatives_0 : ( ( 'object' ) | ( 'objects' ) );
    public final void rule__FilterObjectTypeRule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:812:1: ( ( 'object' ) | ( 'objects' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTableDSL.g:813:2: ( 'object' )
                    {
                    // InternalTableDSL.g:813:2: ( 'object' )
                    // InternalTableDSL.g:814:3: 'object'
                    {
                     before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:819:2: ( 'objects' )
                    {
                    // InternalTableDSL.g:819:2: ( 'objects' )
                    // InternalTableDSL.g:820:3: 'objects'
                    {
                     before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectsKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectsKeyword_0_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Alternatives_0"


    // $ANTLR start "rule__ColumnName__ColumnNameAlternatives_0"
    // InternalTableDSL.g:829:1: rule__ColumnName__ColumnNameAlternatives_0 : ( ( RULE_COLUMN_NAME_KEYWORDS ) | ( RULE_STRING ) );
    public final void rule__ColumnName__ColumnNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:833:1: ( ( RULE_COLUMN_NAME_KEYWORDS ) | ( RULE_STRING ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_COLUMN_NAME_KEYWORDS) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTableDSL.g:834:2: ( RULE_COLUMN_NAME_KEYWORDS )
                    {
                    // InternalTableDSL.g:834:2: ( RULE_COLUMN_NAME_KEYWORDS )
                    // InternalTableDSL.g:835:3: RULE_COLUMN_NAME_KEYWORDS
                    {
                     before(grammarAccess.getColumnNameAccess().getColumnNameCOLUMN_NAME_KEYWORDSTerminalRuleCall_0_0()); 
                    match(input,RULE_COLUMN_NAME_KEYWORDS,FOLLOW_2); 
                     after(grammarAccess.getColumnNameAccess().getColumnNameCOLUMN_NAME_KEYWORDSTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:840:2: ( RULE_STRING )
                    {
                    // InternalTableDSL.g:840:2: ( RULE_STRING )
                    // InternalTableDSL.g:841:3: RULE_STRING
                    {
                     before(grammarAccess.getColumnNameAccess().getColumnNameSTRINGTerminalRuleCall_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getColumnNameAccess().getColumnNameSTRINGTerminalRuleCall_0_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnName__ColumnNameAlternatives_0"


    // $ANTLR start "rule__Start__Group__0"
    // InternalTableDSL.g:850:1: rule__Start__Group__0 : rule__Start__Group__0__Impl rule__Start__Group__1 ;
    public final void rule__Start__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:854:1: ( rule__Start__Group__0__Impl rule__Start__Group__1 )
            // InternalTableDSL.g:855:2: rule__Start__Group__0__Impl rule__Start__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Start__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Start__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__Group__0"


    // $ANTLR start "rule__Start__Group__0__Impl"
    // InternalTableDSL.g:862:1: rule__Start__Group__0__Impl : ( ( rule__Start__ActionsAssignment_0 )? ) ;
    public final void rule__Start__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:866:1: ( ( ( rule__Start__ActionsAssignment_0 )? ) )
            // InternalTableDSL.g:867:1: ( ( rule__Start__ActionsAssignment_0 )? )
            {
            // InternalTableDSL.g:867:1: ( ( rule__Start__ActionsAssignment_0 )? )
            // InternalTableDSL.g:868:2: ( rule__Start__ActionsAssignment_0 )?
            {
             before(grammarAccess.getStartAccess().getActionsAssignment_0()); 
            // InternalTableDSL.g:869:2: ( rule__Start__ActionsAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=17 && LA9_0<=18)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTableDSL.g:869:3: rule__Start__ActionsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Start__ActionsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartAccess().getActionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__Group__0__Impl"


    // $ANTLR start "rule__Start__Group__1"
    // InternalTableDSL.g:877:1: rule__Start__Group__1 : rule__Start__Group__1__Impl ;
    public final void rule__Start__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:881:1: ( rule__Start__Group__1__Impl )
            // InternalTableDSL.g:882:2: rule__Start__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Start__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__Group__1"


    // $ANTLR start "rule__Start__Group__1__Impl"
    // InternalTableDSL.g:888:1: rule__Start__Group__1__Impl : ( ( rule__Start__ActionsAssignment_1 )* ) ;
    public final void rule__Start__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:892:1: ( ( ( rule__Start__ActionsAssignment_1 )* ) )
            // InternalTableDSL.g:893:1: ( ( rule__Start__ActionsAssignment_1 )* )
            {
            // InternalTableDSL.g:893:1: ( ( rule__Start__ActionsAssignment_1 )* )
            // InternalTableDSL.g:894:2: ( rule__Start__ActionsAssignment_1 )*
            {
             before(grammarAccess.getStartAccess().getActionsAssignment_1()); 
            // InternalTableDSL.g:895:2: ( rule__Start__ActionsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20||LA10_0==22||(LA10_0>=24 && LA10_0<=25)||LA10_0==28||LA10_0==32||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTableDSL.g:895:3: rule__Start__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Start__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStartAccess().getActionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__Group__1__Impl"


    // $ANTLR start "rule__CreateTable__Group__0"
    // InternalTableDSL.g:904:1: rule__CreateTable__Group__0 : rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1 ;
    public final void rule__CreateTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:908:1: ( rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1 )
            // InternalTableDSL.g:909:2: rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CreateTable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__0"


    // $ANTLR start "rule__CreateTable__Group__0__Impl"
    // InternalTableDSL.g:916:1: rule__CreateTable__Group__0__Impl : ( ( 'create' )? ) ;
    public final void rule__CreateTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:920:1: ( ( ( 'create' )? ) )
            // InternalTableDSL.g:921:1: ( ( 'create' )? )
            {
            // InternalTableDSL.g:921:1: ( ( 'create' )? )
            // InternalTableDSL.g:922:2: ( 'create' )?
            {
             before(grammarAccess.getCreateTableAccess().getCreateKeyword_0()); 
            // InternalTableDSL.g:923:2: ( 'create' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTableDSL.g:923:3: 'create'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCreateTableAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__0__Impl"


    // $ANTLR start "rule__CreateTable__Group__1"
    // InternalTableDSL.g:931:1: rule__CreateTable__Group__1 : rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2 ;
    public final void rule__CreateTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:935:1: ( rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2 )
            // InternalTableDSL.g:936:2: rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CreateTable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__1"


    // $ANTLR start "rule__CreateTable__Group__1__Impl"
    // InternalTableDSL.g:943:1: rule__CreateTable__Group__1__Impl : ( 'table' ) ;
    public final void rule__CreateTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:947:1: ( ( 'table' ) )
            // InternalTableDSL.g:948:1: ( 'table' )
            {
            // InternalTableDSL.g:948:1: ( 'table' )
            // InternalTableDSL.g:949:2: 'table'
            {
             before(grammarAccess.getCreateTableAccess().getTableKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCreateTableAccess().getTableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__1__Impl"


    // $ANTLR start "rule__CreateTable__Group__2"
    // InternalTableDSL.g:958:1: rule__CreateTable__Group__2 : rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3 ;
    public final void rule__CreateTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:962:1: ( rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3 )
            // InternalTableDSL.g:963:2: rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__CreateTable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__2"


    // $ANTLR start "rule__CreateTable__Group__2__Impl"
    // InternalTableDSL.g:970:1: rule__CreateTable__Group__2__Impl : ( 'from' ) ;
    public final void rule__CreateTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:974:1: ( ( 'from' ) )
            // InternalTableDSL.g:975:1: ( 'from' )
            {
            // InternalTableDSL.g:975:1: ( 'from' )
            // InternalTableDSL.g:976:2: 'from'
            {
             before(grammarAccess.getCreateTableAccess().getFromKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCreateTableAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__2__Impl"


    // $ANTLR start "rule__CreateTable__Group__3"
    // InternalTableDSL.g:985:1: rule__CreateTable__Group__3 : rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4 ;
    public final void rule__CreateTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:989:1: ( rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4 )
            // InternalTableDSL.g:990:2: rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__CreateTable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__3"


    // $ANTLR start "rule__CreateTable__Group__3__Impl"
    // InternalTableDSL.g:997:1: rule__CreateTable__Group__3__Impl : ( ruleTableInputPath ) ;
    public final void rule__CreateTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1001:1: ( ( ruleTableInputPath ) )
            // InternalTableDSL.g:1002:1: ( ruleTableInputPath )
            {
            // InternalTableDSL.g:1002:1: ( ruleTableInputPath )
            // InternalTableDSL.g:1003:2: ruleTableInputPath
            {
             before(grammarAccess.getCreateTableAccess().getTableInputPathParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleTableInputPath();

            state._fsp--;

             after(grammarAccess.getCreateTableAccess().getTableInputPathParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__3__Impl"


    // $ANTLR start "rule__CreateTable__Group__4"
    // InternalTableDSL.g:1012:1: rule__CreateTable__Group__4 : rule__CreateTable__Group__4__Impl ;
    public final void rule__CreateTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1016:1: ( rule__CreateTable__Group__4__Impl )
            // InternalTableDSL.g:1017:2: rule__CreateTable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__4"


    // $ANTLR start "rule__CreateTable__Group__4__Impl"
    // InternalTableDSL.g:1023:1: rule__CreateTable__Group__4__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__CreateTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1027:1: ( ( RULE_ANY_OTHER ) )
            // InternalTableDSL.g:1028:1: ( RULE_ANY_OTHER )
            {
            // InternalTableDSL.g:1028:1: ( RULE_ANY_OTHER )
            // InternalTableDSL.g:1029:2: RULE_ANY_OTHER
            {
             before(grammarAccess.getCreateTableAccess().getANY_OTHERTerminalRuleCall_4()); 
            match(input,RULE_ANY_OTHER,FOLLOW_2); 
             after(grammarAccess.getCreateTableAccess().getANY_OTHERTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__4__Impl"


    // $ANTLR start "rule__TableAction__Group__0"
    // InternalTableDSL.g:1039:1: rule__TableAction__Group__0 : rule__TableAction__Group__0__Impl rule__TableAction__Group__1 ;
    public final void rule__TableAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1043:1: ( rule__TableAction__Group__0__Impl rule__TableAction__Group__1 )
            // InternalTableDSL.g:1044:2: rule__TableAction__Group__0__Impl rule__TableAction__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__TableAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Group__0"


    // $ANTLR start "rule__TableAction__Group__0__Impl"
    // InternalTableDSL.g:1051:1: rule__TableAction__Group__0__Impl : ( ( rule__TableAction__Alternatives_0 ) ) ;
    public final void rule__TableAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1055:1: ( ( ( rule__TableAction__Alternatives_0 ) ) )
            // InternalTableDSL.g:1056:1: ( ( rule__TableAction__Alternatives_0 ) )
            {
            // InternalTableDSL.g:1056:1: ( ( rule__TableAction__Alternatives_0 ) )
            // InternalTableDSL.g:1057:2: ( rule__TableAction__Alternatives_0 )
            {
             before(grammarAccess.getTableActionAccess().getAlternatives_0()); 
            // InternalTableDSL.g:1058:2: ( rule__TableAction__Alternatives_0 )
            // InternalTableDSL.g:1058:3: rule__TableAction__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__TableAction__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTableActionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Group__0__Impl"


    // $ANTLR start "rule__TableAction__Group__1"
    // InternalTableDSL.g:1066:1: rule__TableAction__Group__1 : rule__TableAction__Group__1__Impl ;
    public final void rule__TableAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1070:1: ( rule__TableAction__Group__1__Impl )
            // InternalTableDSL.g:1071:2: rule__TableAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Group__1"


    // $ANTLR start "rule__TableAction__Group__1__Impl"
    // InternalTableDSL.g:1077:1: rule__TableAction__Group__1__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__TableAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1081:1: ( ( RULE_ANY_OTHER ) )
            // InternalTableDSL.g:1082:1: ( RULE_ANY_OTHER )
            {
            // InternalTableDSL.g:1082:1: ( RULE_ANY_OTHER )
            // InternalTableDSL.g:1083:2: RULE_ANY_OTHER
            {
             before(grammarAccess.getTableActionAccess().getANY_OTHERTerminalRuleCall_1()); 
            match(input,RULE_ANY_OTHER,FOLLOW_2); 
             after(grammarAccess.getTableActionAccess().getANY_OTHERTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Group__1__Impl"


    // $ANTLR start "rule__LoadData__Group__0"
    // InternalTableDSL.g:1093:1: rule__LoadData__Group__0 : rule__LoadData__Group__0__Impl rule__LoadData__Group__1 ;
    public final void rule__LoadData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1097:1: ( rule__LoadData__Group__0__Impl rule__LoadData__Group__1 )
            // InternalTableDSL.g:1098:2: rule__LoadData__Group__0__Impl rule__LoadData__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LoadData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadData__Group__0"


    // $ANTLR start "rule__LoadData__Group__0__Impl"
    // InternalTableDSL.g:1105:1: rule__LoadData__Group__0__Impl : ( 'load' ) ;
    public final void rule__LoadData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1109:1: ( ( 'load' ) )
            // InternalTableDSL.g:1110:1: ( 'load' )
            {
            // InternalTableDSL.g:1110:1: ( 'load' )
            // InternalTableDSL.g:1111:2: 'load'
            {
             before(grammarAccess.getLoadDataAccess().getLoadKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLoadDataAccess().getLoadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadData__Group__0__Impl"


    // $ANTLR start "rule__LoadData__Group__1"
    // InternalTableDSL.g:1120:1: rule__LoadData__Group__1 : rule__LoadData__Group__1__Impl ;
    public final void rule__LoadData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1124:1: ( rule__LoadData__Group__1__Impl )
            // InternalTableDSL.g:1125:2: rule__LoadData__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadData__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadData__Group__1"


    // $ANTLR start "rule__LoadData__Group__1__Impl"
    // InternalTableDSL.g:1131:1: rule__LoadData__Group__1__Impl : ( ruleTableInputPath ) ;
    public final void rule__LoadData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1135:1: ( ( ruleTableInputPath ) )
            // InternalTableDSL.g:1136:1: ( ruleTableInputPath )
            {
            // InternalTableDSL.g:1136:1: ( ruleTableInputPath )
            // InternalTableDSL.g:1137:2: ruleTableInputPath
            {
             before(grammarAccess.getLoadDataAccess().getTableInputPathParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleTableInputPath();

            state._fsp--;

             after(grammarAccess.getLoadDataAccess().getTableInputPathParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadData__Group__1__Impl"


    // $ANTLR start "rule__TableInputPath__Group__0"
    // InternalTableDSL.g:1147:1: rule__TableInputPath__Group__0 : rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1 ;
    public final void rule__TableInputPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1151:1: ( rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1 )
            // InternalTableDSL.g:1152:2: rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TableInputPath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableInputPath__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group__0"


    // $ANTLR start "rule__TableInputPath__Group__0__Impl"
    // InternalTableDSL.g:1159:1: rule__TableInputPath__Group__0__Impl : ( ( rule__TableInputPath__PathPatternsAssignment_0 ) ) ;
    public final void rule__TableInputPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1163:1: ( ( ( rule__TableInputPath__PathPatternsAssignment_0 ) ) )
            // InternalTableDSL.g:1164:1: ( ( rule__TableInputPath__PathPatternsAssignment_0 ) )
            {
            // InternalTableDSL.g:1164:1: ( ( rule__TableInputPath__PathPatternsAssignment_0 ) )
            // InternalTableDSL.g:1165:2: ( rule__TableInputPath__PathPatternsAssignment_0 )
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_0()); 
            // InternalTableDSL.g:1166:2: ( rule__TableInputPath__PathPatternsAssignment_0 )
            // InternalTableDSL.g:1166:3: rule__TableInputPath__PathPatternsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TableInputPath__PathPatternsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group__0__Impl"


    // $ANTLR start "rule__TableInputPath__Group__1"
    // InternalTableDSL.g:1174:1: rule__TableInputPath__Group__1 : rule__TableInputPath__Group__1__Impl ;
    public final void rule__TableInputPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1178:1: ( rule__TableInputPath__Group__1__Impl )
            // InternalTableDSL.g:1179:2: rule__TableInputPath__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableInputPath__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group__1"


    // $ANTLR start "rule__TableInputPath__Group__1__Impl"
    // InternalTableDSL.g:1185:1: rule__TableInputPath__Group__1__Impl : ( ( rule__TableInputPath__Group_1__0 )* ) ;
    public final void rule__TableInputPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1189:1: ( ( ( rule__TableInputPath__Group_1__0 )* ) )
            // InternalTableDSL.g:1190:1: ( ( rule__TableInputPath__Group_1__0 )* )
            {
            // InternalTableDSL.g:1190:1: ( ( rule__TableInputPath__Group_1__0 )* )
            // InternalTableDSL.g:1191:2: ( rule__TableInputPath__Group_1__0 )*
            {
             before(grammarAccess.getTableInputPathAccess().getGroup_1()); 
            // InternalTableDSL.g:1192:2: ( rule__TableInputPath__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTableDSL.g:1192:3: rule__TableInputPath__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TableInputPath__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTableInputPathAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group__1__Impl"


    // $ANTLR start "rule__TableInputPath__Group_1__0"
    // InternalTableDSL.g:1201:1: rule__TableInputPath__Group_1__0 : rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1 ;
    public final void rule__TableInputPath__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1205:1: ( rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1 )
            // InternalTableDSL.g:1206:2: rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__TableInputPath__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableInputPath__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group_1__0"


    // $ANTLR start "rule__TableInputPath__Group_1__0__Impl"
    // InternalTableDSL.g:1213:1: rule__TableInputPath__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TableInputPath__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1217:1: ( ( ',' ) )
            // InternalTableDSL.g:1218:1: ( ',' )
            {
            // InternalTableDSL.g:1218:1: ( ',' )
            // InternalTableDSL.g:1219:2: ','
            {
             before(grammarAccess.getTableInputPathAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTableInputPathAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group_1__0__Impl"


    // $ANTLR start "rule__TableInputPath__Group_1__1"
    // InternalTableDSL.g:1228:1: rule__TableInputPath__Group_1__1 : rule__TableInputPath__Group_1__1__Impl ;
    public final void rule__TableInputPath__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1232:1: ( rule__TableInputPath__Group_1__1__Impl )
            // InternalTableDSL.g:1233:2: rule__TableInputPath__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableInputPath__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group_1__1"


    // $ANTLR start "rule__TableInputPath__Group_1__1__Impl"
    // InternalTableDSL.g:1239:1: rule__TableInputPath__Group_1__1__Impl : ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) ) ;
    public final void rule__TableInputPath__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1243:1: ( ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) ) )
            // InternalTableDSL.g:1244:1: ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) )
            {
            // InternalTableDSL.g:1244:1: ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) )
            // InternalTableDSL.g:1245:2: ( rule__TableInputPath__PathPatternsAssignment_1_1 )
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_1_1()); 
            // InternalTableDSL.g:1246:2: ( rule__TableInputPath__PathPatternsAssignment_1_1 )
            // InternalTableDSL.g:1246:3: rule__TableInputPath__PathPatternsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TableInputPath__PathPatternsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group_1__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalTableDSL.g:1255:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1259:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalTableDSL.g:1260:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalTableDSL.g:1267:1: rule__Output__Group__0__Impl : ( 'output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1271:1: ( ( 'output' ) )
            // InternalTableDSL.g:1272:1: ( 'output' )
            {
            // InternalTableDSL.g:1272:1: ( 'output' )
            // InternalTableDSL.g:1273:2: 'output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalTableDSL.g:1282:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1286:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalTableDSL.g:1287:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalTableDSL.g:1294:1: rule__Output__Group__1__Impl : ( 'to' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1298:1: ( ( 'to' ) )
            // InternalTableDSL.g:1299:1: ( 'to' )
            {
            // InternalTableDSL.g:1299:1: ( 'to' )
            // InternalTableDSL.g:1300:2: 'to'
            {
             before(grammarAccess.getOutputAccess().getToKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalTableDSL.g:1309:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1313:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalTableDSL.g:1314:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalTableDSL.g:1321:1: rule__Output__Group__2__Impl : ( ( rule__Output__OutputPathsAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1325:1: ( ( ( rule__Output__OutputPathsAssignment_2 ) ) )
            // InternalTableDSL.g:1326:1: ( ( rule__Output__OutputPathsAssignment_2 ) )
            {
            // InternalTableDSL.g:1326:1: ( ( rule__Output__OutputPathsAssignment_2 ) )
            // InternalTableDSL.g:1327:2: ( rule__Output__OutputPathsAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getOutputPathsAssignment_2()); 
            // InternalTableDSL.g:1328:2: ( rule__Output__OutputPathsAssignment_2 )
            // InternalTableDSL.g:1328:3: rule__Output__OutputPathsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Output__OutputPathsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getOutputPathsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalTableDSL.g:1336:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1340:1: ( rule__Output__Group__3__Impl )
            // InternalTableDSL.g:1341:2: rule__Output__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalTableDSL.g:1347:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )* ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1351:1: ( ( ( rule__Output__Group_3__0 )* ) )
            // InternalTableDSL.g:1352:1: ( ( rule__Output__Group_3__0 )* )
            {
            // InternalTableDSL.g:1352:1: ( ( rule__Output__Group_3__0 )* )
            // InternalTableDSL.g:1353:2: ( rule__Output__Group_3__0 )*
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalTableDSL.g:1354:2: ( rule__Output__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTableDSL.g:1354:3: rule__Output__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Output__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOutputAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group_3__0"
    // InternalTableDSL.g:1363:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1367:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalTableDSL.g:1368:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Output__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__0"


    // $ANTLR start "rule__Output__Group_3__0__Impl"
    // InternalTableDSL.g:1375:1: rule__Output__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1379:1: ( ( ',' ) )
            // InternalTableDSL.g:1380:1: ( ',' )
            {
            // InternalTableDSL.g:1380:1: ( ',' )
            // InternalTableDSL.g:1381:2: ','
            {
             before(grammarAccess.getOutputAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__0__Impl"


    // $ANTLR start "rule__Output__Group_3__1"
    // InternalTableDSL.g:1390:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1394:1: ( rule__Output__Group_3__1__Impl )
            // InternalTableDSL.g:1395:2: rule__Output__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__1"


    // $ANTLR start "rule__Output__Group_3__1__Impl"
    // InternalTableDSL.g:1401:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__OutputPathsAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1405:1: ( ( ( rule__Output__OutputPathsAssignment_3_1 ) ) )
            // InternalTableDSL.g:1406:1: ( ( rule__Output__OutputPathsAssignment_3_1 ) )
            {
            // InternalTableDSL.g:1406:1: ( ( rule__Output__OutputPathsAssignment_3_1 ) )
            // InternalTableDSL.g:1407:2: ( rule__Output__OutputPathsAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getOutputPathsAssignment_3_1()); 
            // InternalTableDSL.g:1408:2: ( rule__Output__OutputPathsAssignment_3_1 )
            // InternalTableDSL.g:1408:3: rule__Output__OutputPathsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__OutputPathsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getOutputPathsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__1__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalTableDSL.g:1417:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1421:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalTableDSL.g:1422:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalTableDSL.g:1429:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1433:1: ( ( 'select' ) )
            // InternalTableDSL.g:1434:1: ( 'select' )
            {
            // InternalTableDSL.g:1434:1: ( 'select' )
            // InternalTableDSL.g:1435:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalTableDSL.g:1444:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1448:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalTableDSL.g:1449:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalTableDSL.g:1456:1: rule__Select__Group__1__Impl : ( ( rule__Select__ColumnsPatternsAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1460:1: ( ( ( rule__Select__ColumnsPatternsAssignment_1 ) ) )
            // InternalTableDSL.g:1461:1: ( ( rule__Select__ColumnsPatternsAssignment_1 ) )
            {
            // InternalTableDSL.g:1461:1: ( ( rule__Select__ColumnsPatternsAssignment_1 ) )
            // InternalTableDSL.g:1462:2: ( rule__Select__ColumnsPatternsAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getColumnsPatternsAssignment_1()); 
            // InternalTableDSL.g:1463:2: ( rule__Select__ColumnsPatternsAssignment_1 )
            // InternalTableDSL.g:1463:3: rule__Select__ColumnsPatternsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ColumnsPatternsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getColumnsPatternsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // InternalTableDSL.g:1471:1: rule__Select__Group__2 : rule__Select__Group__2__Impl ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1475:1: ( rule__Select__Group__2__Impl )
            // InternalTableDSL.g:1476:2: rule__Select__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // InternalTableDSL.g:1482:1: rule__Select__Group__2__Impl : ( ( rule__Select__Group_2__0 )* ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1486:1: ( ( ( rule__Select__Group_2__0 )* ) )
            // InternalTableDSL.g:1487:1: ( ( rule__Select__Group_2__0 )* )
            {
            // InternalTableDSL.g:1487:1: ( ( rule__Select__Group_2__0 )* )
            // InternalTableDSL.g:1488:2: ( rule__Select__Group_2__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_2()); 
            // InternalTableDSL.g:1489:2: ( rule__Select__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTableDSL.g:1489:3: rule__Select__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Select__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group_2__0"
    // InternalTableDSL.g:1498:1: rule__Select__Group_2__0 : rule__Select__Group_2__0__Impl rule__Select__Group_2__1 ;
    public final void rule__Select__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1502:1: ( rule__Select__Group_2__0__Impl rule__Select__Group_2__1 )
            // InternalTableDSL.g:1503:2: rule__Select__Group_2__0__Impl rule__Select__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Select__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__0"


    // $ANTLR start "rule__Select__Group_2__0__Impl"
    // InternalTableDSL.g:1510:1: rule__Select__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1514:1: ( ( ',' ) )
            // InternalTableDSL.g:1515:1: ( ',' )
            {
            // InternalTableDSL.g:1515:1: ( ',' )
            // InternalTableDSL.g:1516:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__0__Impl"


    // $ANTLR start "rule__Select__Group_2__1"
    // InternalTableDSL.g:1525:1: rule__Select__Group_2__1 : rule__Select__Group_2__1__Impl ;
    public final void rule__Select__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1529:1: ( rule__Select__Group_2__1__Impl )
            // InternalTableDSL.g:1530:2: rule__Select__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__1"


    // $ANTLR start "rule__Select__Group_2__1__Impl"
    // InternalTableDSL.g:1536:1: rule__Select__Group_2__1__Impl : ( ( rule__Select__ColumnPatternsAssignment_2_1 ) ) ;
    public final void rule__Select__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1540:1: ( ( ( rule__Select__ColumnPatternsAssignment_2_1 ) ) )
            // InternalTableDSL.g:1541:1: ( ( rule__Select__ColumnPatternsAssignment_2_1 ) )
            {
            // InternalTableDSL.g:1541:1: ( ( rule__Select__ColumnPatternsAssignment_2_1 ) )
            // InternalTableDSL.g:1542:2: ( rule__Select__ColumnPatternsAssignment_2_1 )
            {
             before(grammarAccess.getSelectAccess().getColumnPatternsAssignment_2_1()); 
            // InternalTableDSL.g:1543:2: ( rule__Select__ColumnPatternsAssignment_2_1 )
            // InternalTableDSL.g:1543:3: rule__Select__ColumnPatternsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ColumnPatternsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getColumnPatternsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__1__Impl"


    // $ANTLR start "rule__RenameColumn__Group__0"
    // InternalTableDSL.g:1552:1: rule__RenameColumn__Group__0 : rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1 ;
    public final void rule__RenameColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1556:1: ( rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1 )
            // InternalTableDSL.g:1557:2: rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RenameColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__0"


    // $ANTLR start "rule__RenameColumn__Group__0__Impl"
    // InternalTableDSL.g:1564:1: rule__RenameColumn__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1568:1: ( ( 'rename' ) )
            // InternalTableDSL.g:1569:1: ( 'rename' )
            {
            // InternalTableDSL.g:1569:1: ( 'rename' )
            // InternalTableDSL.g:1570:2: 'rename'
            {
             before(grammarAccess.getRenameColumnAccess().getRenameKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAccess().getRenameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__0__Impl"


    // $ANTLR start "rule__RenameColumn__Group__1"
    // InternalTableDSL.g:1579:1: rule__RenameColumn__Group__1 : rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2 ;
    public final void rule__RenameColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1583:1: ( rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2 )
            // InternalTableDSL.g:1584:2: rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RenameColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__1"


    // $ANTLR start "rule__RenameColumn__Group__1__Impl"
    // InternalTableDSL.g:1591:1: rule__RenameColumn__Group__1__Impl : ( ( 'column' )? ) ;
    public final void rule__RenameColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1595:1: ( ( ( 'column' )? ) )
            // InternalTableDSL.g:1596:1: ( ( 'column' )? )
            {
            // InternalTableDSL.g:1596:1: ( ( 'column' )? )
            // InternalTableDSL.g:1597:2: ( 'column' )?
            {
             before(grammarAccess.getRenameColumnAccess().getColumnKeyword_1()); 
            // InternalTableDSL.g:1598:2: ( 'column' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTableDSL.g:1598:3: 'column'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRenameColumnAccess().getColumnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__1__Impl"


    // $ANTLR start "rule__RenameColumn__Group__2"
    // InternalTableDSL.g:1606:1: rule__RenameColumn__Group__2 : rule__RenameColumn__Group__2__Impl ;
    public final void rule__RenameColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1610:1: ( rule__RenameColumn__Group__2__Impl )
            // InternalTableDSL.g:1611:2: rule__RenameColumn__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__2"


    // $ANTLR start "rule__RenameColumn__Group__2__Impl"
    // InternalTableDSL.g:1617:1: rule__RenameColumn__Group__2__Impl : ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) ) ;
    public final void rule__RenameColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1621:1: ( ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) ) )
            // InternalTableDSL.g:1622:1: ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) )
            {
            // InternalTableDSL.g:1622:1: ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) )
            // InternalTableDSL.g:1623:2: ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* )
            {
            // InternalTableDSL.g:1623:2: ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) )
            // InternalTableDSL.g:1624:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )
            {
             before(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 
            // InternalTableDSL.g:1625:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )
            // InternalTableDSL.g:1625:4: rule__RenameColumn__RenameTuplesAssignment_2
            {
            pushFollow(FOLLOW_14);
            rule__RenameColumn__RenameTuplesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 

            }

            // InternalTableDSL.g:1628:2: ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* )
            // InternalTableDSL.g:1629:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )*
            {
             before(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 
            // InternalTableDSL.g:1630:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTableDSL.g:1630:4: rule__RenameColumn__RenameTuplesAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__RenameColumn__RenameTuplesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__2__Impl"


    // $ANTLR start "rule__RenameColumnToPair__Group__0"
    // InternalTableDSL.g:1640:1: rule__RenameColumnToPair__Group__0 : rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1 ;
    public final void rule__RenameColumnToPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1644:1: ( rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1 )
            // InternalTableDSL.g:1645:2: rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RenameColumnToPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__0"


    // $ANTLR start "rule__RenameColumnToPair__Group__0__Impl"
    // InternalTableDSL.g:1652:1: rule__RenameColumnToPair__Group__0__Impl : ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnToPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1656:1: ( ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:1657:1: ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:1657:1: ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:1658:2: ( rule__RenameColumnToPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnToPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:1659:2: ( rule__RenameColumnToPair__OldNameAssignment_0 )
            // InternalTableDSL.g:1659:3: rule__RenameColumnToPair__OldNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__OldNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnToPairAccess().getOldNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__0__Impl"


    // $ANTLR start "rule__RenameColumnToPair__Group__1"
    // InternalTableDSL.g:1667:1: rule__RenameColumnToPair__Group__1 : rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2 ;
    public final void rule__RenameColumnToPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1671:1: ( rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2 )
            // InternalTableDSL.g:1672:2: rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RenameColumnToPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__1"


    // $ANTLR start "rule__RenameColumnToPair__Group__1__Impl"
    // InternalTableDSL.g:1679:1: rule__RenameColumnToPair__Group__1__Impl : ( 'to' ) ;
    public final void rule__RenameColumnToPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1683:1: ( ( 'to' ) )
            // InternalTableDSL.g:1684:1: ( 'to' )
            {
            // InternalTableDSL.g:1684:1: ( 'to' )
            // InternalTableDSL.g:1685:2: 'to'
            {
             before(grammarAccess.getRenameColumnToPairAccess().getToKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRenameColumnToPairAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__1__Impl"


    // $ANTLR start "rule__RenameColumnToPair__Group__2"
    // InternalTableDSL.g:1694:1: rule__RenameColumnToPair__Group__2 : rule__RenameColumnToPair__Group__2__Impl ;
    public final void rule__RenameColumnToPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1698:1: ( rule__RenameColumnToPair__Group__2__Impl )
            // InternalTableDSL.g:1699:2: rule__RenameColumnToPair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__2"


    // $ANTLR start "rule__RenameColumnToPair__Group__2__Impl"
    // InternalTableDSL.g:1705:1: rule__RenameColumnToPair__Group__2__Impl : ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) ) ;
    public final void rule__RenameColumnToPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1709:1: ( ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) ) )
            // InternalTableDSL.g:1710:1: ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) )
            {
            // InternalTableDSL.g:1710:1: ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) )
            // InternalTableDSL.g:1711:2: ( rule__RenameColumnToPair__NewNameAssignment_2 )
            {
             before(grammarAccess.getRenameColumnToPairAccess().getNewNameAssignment_2()); 
            // InternalTableDSL.g:1712:2: ( rule__RenameColumnToPair__NewNameAssignment_2 )
            // InternalTableDSL.g:1712:3: rule__RenameColumnToPair__NewNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__NewNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnToPairAccess().getNewNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__2__Impl"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__0"
    // InternalTableDSL.g:1721:1: rule__RenameColumnPrependPair__Group__0 : rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1 ;
    public final void rule__RenameColumnPrependPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1725:1: ( rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1 )
            // InternalTableDSL.g:1726:2: rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__RenameColumnPrependPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__0"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__0__Impl"
    // InternalTableDSL.g:1733:1: rule__RenameColumnPrependPair__Group__0__Impl : ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnPrependPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1737:1: ( ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:1738:1: ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:1738:1: ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:1739:2: ( rule__RenameColumnPrependPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:1740:2: ( rule__RenameColumnPrependPair__OldNameAssignment_0 )
            // InternalTableDSL.g:1740:3: rule__RenameColumnPrependPair__OldNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__OldNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnPrependPairAccess().getOldNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__0__Impl"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__1"
    // InternalTableDSL.g:1748:1: rule__RenameColumnPrependPair__Group__1 : rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2 ;
    public final void rule__RenameColumnPrependPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1752:1: ( rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2 )
            // InternalTableDSL.g:1753:2: rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RenameColumnPrependPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__1"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__1__Impl"
    // InternalTableDSL.g:1760:1: rule__RenameColumnPrependPair__Group__1__Impl : ( 'prepend' ) ;
    public final void rule__RenameColumnPrependPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1764:1: ( ( 'prepend' ) )
            // InternalTableDSL.g:1765:1: ( 'prepend' )
            {
            // InternalTableDSL.g:1765:1: ( 'prepend' )
            // InternalTableDSL.g:1766:2: 'prepend'
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getPrependKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRenameColumnPrependPairAccess().getPrependKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__1__Impl"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__2"
    // InternalTableDSL.g:1775:1: rule__RenameColumnPrependPair__Group__2 : rule__RenameColumnPrependPair__Group__2__Impl ;
    public final void rule__RenameColumnPrependPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1779:1: ( rule__RenameColumnPrependPair__Group__2__Impl )
            // InternalTableDSL.g:1780:2: rule__RenameColumnPrependPair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__2"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__2__Impl"
    // InternalTableDSL.g:1786:1: rule__RenameColumnPrependPair__Group__2__Impl : ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) ) ;
    public final void rule__RenameColumnPrependPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1790:1: ( ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) ) )
            // InternalTableDSL.g:1791:1: ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) )
            {
            // InternalTableDSL.g:1791:1: ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) )
            // InternalTableDSL.g:1792:2: ( rule__RenameColumnPrependPair__PrefixAssignment_2 )
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getPrefixAssignment_2()); 
            // InternalTableDSL.g:1793:2: ( rule__RenameColumnPrependPair__PrefixAssignment_2 )
            // InternalTableDSL.g:1793:3: rule__RenameColumnPrependPair__PrefixAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__PrefixAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnPrependPairAccess().getPrefixAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__2__Impl"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__0"
    // InternalTableDSL.g:1802:1: rule__RenameColumnAppendPair__Group__0 : rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1 ;
    public final void rule__RenameColumnAppendPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1806:1: ( rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1 )
            // InternalTableDSL.g:1807:2: rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RenameColumnAppendPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__0"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__0__Impl"
    // InternalTableDSL.g:1814:1: rule__RenameColumnAppendPair__Group__0__Impl : ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnAppendPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1818:1: ( ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:1819:1: ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:1819:1: ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:1820:2: ( rule__RenameColumnAppendPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:1821:2: ( rule__RenameColumnAppendPair__OldNameAssignment_0 )
            // InternalTableDSL.g:1821:3: rule__RenameColumnAppendPair__OldNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__OldNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAppendPairAccess().getOldNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__0__Impl"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__1"
    // InternalTableDSL.g:1829:1: rule__RenameColumnAppendPair__Group__1 : rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2 ;
    public final void rule__RenameColumnAppendPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1833:1: ( rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2 )
            // InternalTableDSL.g:1834:2: rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RenameColumnAppendPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__1"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__1__Impl"
    // InternalTableDSL.g:1841:1: rule__RenameColumnAppendPair__Group__1__Impl : ( 'append' ) ;
    public final void rule__RenameColumnAppendPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1845:1: ( ( 'append' ) )
            // InternalTableDSL.g:1846:1: ( 'append' )
            {
            // InternalTableDSL.g:1846:1: ( 'append' )
            // InternalTableDSL.g:1847:2: 'append'
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getAppendKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAppendPairAccess().getAppendKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__1__Impl"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__2"
    // InternalTableDSL.g:1856:1: rule__RenameColumnAppendPair__Group__2 : rule__RenameColumnAppendPair__Group__2__Impl ;
    public final void rule__RenameColumnAppendPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1860:1: ( rule__RenameColumnAppendPair__Group__2__Impl )
            // InternalTableDSL.g:1861:2: rule__RenameColumnAppendPair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__2"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__2__Impl"
    // InternalTableDSL.g:1867:1: rule__RenameColumnAppendPair__Group__2__Impl : ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) ) ;
    public final void rule__RenameColumnAppendPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1871:1: ( ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) ) )
            // InternalTableDSL.g:1872:1: ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) )
            {
            // InternalTableDSL.g:1872:1: ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) )
            // InternalTableDSL.g:1873:2: ( rule__RenameColumnAppendPair__SuffixAssignment_2 )
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getSuffixAssignment_2()); 
            // InternalTableDSL.g:1874:2: ( rule__RenameColumnAppendPair__SuffixAssignment_2 )
            // InternalTableDSL.g:1874:3: rule__RenameColumnAppendPair__SuffixAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__SuffixAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAppendPairAccess().getSuffixAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__2__Impl"


    // $ANTLR start "rule__Extract__Group__0"
    // InternalTableDSL.g:1883:1: rule__Extract__Group__0 : rule__Extract__Group__0__Impl rule__Extract__Group__1 ;
    public final void rule__Extract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1887:1: ( rule__Extract__Group__0__Impl rule__Extract__Group__1 )
            // InternalTableDSL.g:1888:2: rule__Extract__Group__0__Impl rule__Extract__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Extract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__0"


    // $ANTLR start "rule__Extract__Group__0__Impl"
    // InternalTableDSL.g:1895:1: rule__Extract__Group__0__Impl : ( 'extract' ) ;
    public final void rule__Extract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1899:1: ( ( 'extract' ) )
            // InternalTableDSL.g:1900:1: ( 'extract' )
            {
            // InternalTableDSL.g:1900:1: ( 'extract' )
            // InternalTableDSL.g:1901:2: 'extract'
            {
             before(grammarAccess.getExtractAccess().getExtractKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getExtractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__0__Impl"


    // $ANTLR start "rule__Extract__Group__1"
    // InternalTableDSL.g:1910:1: rule__Extract__Group__1 : rule__Extract__Group__1__Impl rule__Extract__Group__2 ;
    public final void rule__Extract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1914:1: ( rule__Extract__Group__1__Impl rule__Extract__Group__2 )
            // InternalTableDSL.g:1915:2: rule__Extract__Group__1__Impl rule__Extract__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Extract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__1"


    // $ANTLR start "rule__Extract__Group__1__Impl"
    // InternalTableDSL.g:1922:1: rule__Extract__Group__1__Impl : ( ( rule__Extract__TargetColumnsAssignment_1 ) ) ;
    public final void rule__Extract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1926:1: ( ( ( rule__Extract__TargetColumnsAssignment_1 ) ) )
            // InternalTableDSL.g:1927:1: ( ( rule__Extract__TargetColumnsAssignment_1 ) )
            {
            // InternalTableDSL.g:1927:1: ( ( rule__Extract__TargetColumnsAssignment_1 ) )
            // InternalTableDSL.g:1928:2: ( rule__Extract__TargetColumnsAssignment_1 )
            {
             before(grammarAccess.getExtractAccess().getTargetColumnsAssignment_1()); 
            // InternalTableDSL.g:1929:2: ( rule__Extract__TargetColumnsAssignment_1 )
            // InternalTableDSL.g:1929:3: rule__Extract__TargetColumnsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Extract__TargetColumnsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getTargetColumnsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__1__Impl"


    // $ANTLR start "rule__Extract__Group__2"
    // InternalTableDSL.g:1937:1: rule__Extract__Group__2 : rule__Extract__Group__2__Impl rule__Extract__Group__3 ;
    public final void rule__Extract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1941:1: ( rule__Extract__Group__2__Impl rule__Extract__Group__3 )
            // InternalTableDSL.g:1942:2: rule__Extract__Group__2__Impl rule__Extract__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Extract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__2"


    // $ANTLR start "rule__Extract__Group__2__Impl"
    // InternalTableDSL.g:1949:1: rule__Extract__Group__2__Impl : ( ( rule__Extract__Group_2__0 )* ) ;
    public final void rule__Extract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1953:1: ( ( ( rule__Extract__Group_2__0 )* ) )
            // InternalTableDSL.g:1954:1: ( ( rule__Extract__Group_2__0 )* )
            {
            // InternalTableDSL.g:1954:1: ( ( rule__Extract__Group_2__0 )* )
            // InternalTableDSL.g:1955:2: ( rule__Extract__Group_2__0 )*
            {
             before(grammarAccess.getExtractAccess().getGroup_2()); 
            // InternalTableDSL.g:1956:2: ( rule__Extract__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTableDSL.g:1956:3: rule__Extract__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Extract__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getExtractAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__2__Impl"


    // $ANTLR start "rule__Extract__Group__3"
    // InternalTableDSL.g:1964:1: rule__Extract__Group__3 : rule__Extract__Group__3__Impl rule__Extract__Group__4 ;
    public final void rule__Extract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1968:1: ( rule__Extract__Group__3__Impl rule__Extract__Group__4 )
            // InternalTableDSL.g:1969:2: rule__Extract__Group__3__Impl rule__Extract__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Extract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__3"


    // $ANTLR start "rule__Extract__Group__3__Impl"
    // InternalTableDSL.g:1976:1: rule__Extract__Group__3__Impl : ( 'from' ) ;
    public final void rule__Extract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1980:1: ( ( 'from' ) )
            // InternalTableDSL.g:1981:1: ( 'from' )
            {
            // InternalTableDSL.g:1981:1: ( 'from' )
            // InternalTableDSL.g:1982:2: 'from'
            {
             before(grammarAccess.getExtractAccess().getFromKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__3__Impl"


    // $ANTLR start "rule__Extract__Group__4"
    // InternalTableDSL.g:1991:1: rule__Extract__Group__4 : rule__Extract__Group__4__Impl rule__Extract__Group__5 ;
    public final void rule__Extract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1995:1: ( rule__Extract__Group__4__Impl rule__Extract__Group__5 )
            // InternalTableDSL.g:1996:2: rule__Extract__Group__4__Impl rule__Extract__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Extract__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__4"


    // $ANTLR start "rule__Extract__Group__4__Impl"
    // InternalTableDSL.g:2003:1: rule__Extract__Group__4__Impl : ( ( rule__Extract__SourceColumnAssignment_4 ) ) ;
    public final void rule__Extract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2007:1: ( ( ( rule__Extract__SourceColumnAssignment_4 ) ) )
            // InternalTableDSL.g:2008:1: ( ( rule__Extract__SourceColumnAssignment_4 ) )
            {
            // InternalTableDSL.g:2008:1: ( ( rule__Extract__SourceColumnAssignment_4 ) )
            // InternalTableDSL.g:2009:2: ( rule__Extract__SourceColumnAssignment_4 )
            {
             before(grammarAccess.getExtractAccess().getSourceColumnAssignment_4()); 
            // InternalTableDSL.g:2010:2: ( rule__Extract__SourceColumnAssignment_4 )
            // InternalTableDSL.g:2010:3: rule__Extract__SourceColumnAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Extract__SourceColumnAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getSourceColumnAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__4__Impl"


    // $ANTLR start "rule__Extract__Group__5"
    // InternalTableDSL.g:2018:1: rule__Extract__Group__5 : rule__Extract__Group__5__Impl rule__Extract__Group__6 ;
    public final void rule__Extract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2022:1: ( rule__Extract__Group__5__Impl rule__Extract__Group__6 )
            // InternalTableDSL.g:2023:2: rule__Extract__Group__5__Impl rule__Extract__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Extract__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__5"


    // $ANTLR start "rule__Extract__Group__5__Impl"
    // InternalTableDSL.g:2030:1: rule__Extract__Group__5__Impl : ( 'select' ) ;
    public final void rule__Extract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2034:1: ( ( 'select' ) )
            // InternalTableDSL.g:2035:1: ( 'select' )
            {
            // InternalTableDSL.g:2035:1: ( 'select' )
            // InternalTableDSL.g:2036:2: 'select'
            {
             before(grammarAccess.getExtractAccess().getSelectKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getSelectKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__5__Impl"


    // $ANTLR start "rule__Extract__Group__6"
    // InternalTableDSL.g:2045:1: rule__Extract__Group__6 : rule__Extract__Group__6__Impl rule__Extract__Group__7 ;
    public final void rule__Extract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2049:1: ( rule__Extract__Group__6__Impl rule__Extract__Group__7 )
            // InternalTableDSL.g:2050:2: rule__Extract__Group__6__Impl rule__Extract__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Extract__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__6"


    // $ANTLR start "rule__Extract__Group__6__Impl"
    // InternalTableDSL.g:2057:1: rule__Extract__Group__6__Impl : ( ( rule__Extract__SelectorAssignment_6 ) ) ;
    public final void rule__Extract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2061:1: ( ( ( rule__Extract__SelectorAssignment_6 ) ) )
            // InternalTableDSL.g:2062:1: ( ( rule__Extract__SelectorAssignment_6 ) )
            {
            // InternalTableDSL.g:2062:1: ( ( rule__Extract__SelectorAssignment_6 ) )
            // InternalTableDSL.g:2063:2: ( rule__Extract__SelectorAssignment_6 )
            {
             before(grammarAccess.getExtractAccess().getSelectorAssignment_6()); 
            // InternalTableDSL.g:2064:2: ( rule__Extract__SelectorAssignment_6 )
            // InternalTableDSL.g:2064:3: rule__Extract__SelectorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Extract__SelectorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getSelectorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__6__Impl"


    // $ANTLR start "rule__Extract__Group__7"
    // InternalTableDSL.g:2072:1: rule__Extract__Group__7 : rule__Extract__Group__7__Impl rule__Extract__Group__8 ;
    public final void rule__Extract__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2076:1: ( rule__Extract__Group__7__Impl rule__Extract__Group__8 )
            // InternalTableDSL.g:2077:2: rule__Extract__Group__7__Impl rule__Extract__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Extract__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__7"


    // $ANTLR start "rule__Extract__Group__7__Impl"
    // InternalTableDSL.g:2084:1: rule__Extract__Group__7__Impl : ( 'sort' ) ;
    public final void rule__Extract__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2088:1: ( ( 'sort' ) )
            // InternalTableDSL.g:2089:1: ( 'sort' )
            {
            // InternalTableDSL.g:2089:1: ( 'sort' )
            // InternalTableDSL.g:2090:2: 'sort'
            {
             before(grammarAccess.getExtractAccess().getSortKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getSortKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__7__Impl"


    // $ANTLR start "rule__Extract__Group__8"
    // InternalTableDSL.g:2099:1: rule__Extract__Group__8 : rule__Extract__Group__8__Impl rule__Extract__Group__9 ;
    public final void rule__Extract__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2103:1: ( rule__Extract__Group__8__Impl rule__Extract__Group__9 )
            // InternalTableDSL.g:2104:2: rule__Extract__Group__8__Impl rule__Extract__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Extract__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__8"


    // $ANTLR start "rule__Extract__Group__8__Impl"
    // InternalTableDSL.g:2111:1: rule__Extract__Group__8__Impl : ( ( 'by' )? ) ;
    public final void rule__Extract__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2115:1: ( ( ( 'by' )? ) )
            // InternalTableDSL.g:2116:1: ( ( 'by' )? )
            {
            // InternalTableDSL.g:2116:1: ( ( 'by' )? )
            // InternalTableDSL.g:2117:2: ( 'by' )?
            {
             before(grammarAccess.getExtractAccess().getByKeyword_8()); 
            // InternalTableDSL.g:2118:2: ( 'by' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTableDSL.g:2118:3: 'by'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExtractAccess().getByKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__8__Impl"


    // $ANTLR start "rule__Extract__Group__9"
    // InternalTableDSL.g:2126:1: rule__Extract__Group__9 : rule__Extract__Group__9__Impl ;
    public final void rule__Extract__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2130:1: ( rule__Extract__Group__9__Impl )
            // InternalTableDSL.g:2131:2: rule__Extract__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extract__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__9"


    // $ANTLR start "rule__Extract__Group__9__Impl"
    // InternalTableDSL.g:2137:1: rule__Extract__Group__9__Impl : ( ( rule__Extract__ComparatorAssignment_9 ) ) ;
    public final void rule__Extract__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2141:1: ( ( ( rule__Extract__ComparatorAssignment_9 ) ) )
            // InternalTableDSL.g:2142:1: ( ( rule__Extract__ComparatorAssignment_9 ) )
            {
            // InternalTableDSL.g:2142:1: ( ( rule__Extract__ComparatorAssignment_9 ) )
            // InternalTableDSL.g:2143:2: ( rule__Extract__ComparatorAssignment_9 )
            {
             before(grammarAccess.getExtractAccess().getComparatorAssignment_9()); 
            // InternalTableDSL.g:2144:2: ( rule__Extract__ComparatorAssignment_9 )
            // InternalTableDSL.g:2144:3: rule__Extract__ComparatorAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Extract__ComparatorAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getComparatorAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__9__Impl"


    // $ANTLR start "rule__Extract__Group_2__0"
    // InternalTableDSL.g:2153:1: rule__Extract__Group_2__0 : rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1 ;
    public final void rule__Extract__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2157:1: ( rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1 )
            // InternalTableDSL.g:2158:2: rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Extract__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group_2__0"


    // $ANTLR start "rule__Extract__Group_2__0__Impl"
    // InternalTableDSL.g:2165:1: rule__Extract__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Extract__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2169:1: ( ( ',' ) )
            // InternalTableDSL.g:2170:1: ( ',' )
            {
            // InternalTableDSL.g:2170:1: ( ',' )
            // InternalTableDSL.g:2171:2: ','
            {
             before(grammarAccess.getExtractAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group_2__0__Impl"


    // $ANTLR start "rule__Extract__Group_2__1"
    // InternalTableDSL.g:2180:1: rule__Extract__Group_2__1 : rule__Extract__Group_2__1__Impl ;
    public final void rule__Extract__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2184:1: ( rule__Extract__Group_2__1__Impl )
            // InternalTableDSL.g:2185:2: rule__Extract__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extract__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group_2__1"


    // $ANTLR start "rule__Extract__Group_2__1__Impl"
    // InternalTableDSL.g:2191:1: rule__Extract__Group_2__1__Impl : ( ( rule__Extract__TargetColumnsAssignment_2_1 ) ) ;
    public final void rule__Extract__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2195:1: ( ( ( rule__Extract__TargetColumnsAssignment_2_1 ) ) )
            // InternalTableDSL.g:2196:1: ( ( rule__Extract__TargetColumnsAssignment_2_1 ) )
            {
            // InternalTableDSL.g:2196:1: ( ( rule__Extract__TargetColumnsAssignment_2_1 ) )
            // InternalTableDSL.g:2197:2: ( rule__Extract__TargetColumnsAssignment_2_1 )
            {
             before(grammarAccess.getExtractAccess().getTargetColumnsAssignment_2_1()); 
            // InternalTableDSL.g:2198:2: ( rule__Extract__TargetColumnsAssignment_2_1 )
            // InternalTableDSL.g:2198:3: rule__Extract__TargetColumnsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Extract__TargetColumnsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getTargetColumnsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group_2__1__Impl"


    // $ANTLR start "rule__Selector__Group_0__0"
    // InternalTableDSL.g:2207:1: rule__Selector__Group_0__0 : rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1 ;
    public final void rule__Selector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2211:1: ( rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1 )
            // InternalTableDSL.g:2212:2: rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__Selector__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_0__0"


    // $ANTLR start "rule__Selector__Group_0__0__Impl"
    // InternalTableDSL.g:2219:1: rule__Selector__Group_0__0__Impl : ( () ) ;
    public final void rule__Selector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2223:1: ( ( () ) )
            // InternalTableDSL.g:2224:1: ( () )
            {
            // InternalTableDSL.g:2224:1: ( () )
            // InternalTableDSL.g:2225:2: ()
            {
             before(grammarAccess.getSelectorAccess().getSelectorAction_0_0()); 
            // InternalTableDSL.g:2226:2: ()
            // InternalTableDSL.g:2226:3: 
            {
            }

             after(grammarAccess.getSelectorAccess().getSelectorAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_0__0__Impl"


    // $ANTLR start "rule__Selector__Group_0__1"
    // InternalTableDSL.g:2234:1: rule__Selector__Group_0__1 : rule__Selector__Group_0__1__Impl ;
    public final void rule__Selector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2238:1: ( rule__Selector__Group_0__1__Impl )
            // InternalTableDSL.g:2239:2: rule__Selector__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_0__1"


    // $ANTLR start "rule__Selector__Group_0__1__Impl"
    // InternalTableDSL.g:2245:1: rule__Selector__Group_0__1__Impl : ( RULE_SELECTOR_KEYWORDS ) ;
    public final void rule__Selector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2249:1: ( ( RULE_SELECTOR_KEYWORDS ) )
            // InternalTableDSL.g:2250:1: ( RULE_SELECTOR_KEYWORDS )
            {
            // InternalTableDSL.g:2250:1: ( RULE_SELECTOR_KEYWORDS )
            // InternalTableDSL.g:2251:2: RULE_SELECTOR_KEYWORDS
            {
             before(grammarAccess.getSelectorAccess().getSELECTOR_KEYWORDSTerminalRuleCall_0_1()); 
            match(input,RULE_SELECTOR_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getSELECTOR_KEYWORDSTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_0__1__Impl"


    // $ANTLR start "rule__Selector__Group_1__0"
    // InternalTableDSL.g:2261:1: rule__Selector__Group_1__0 : rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 ;
    public final void rule__Selector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2265:1: ( rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 )
            // InternalTableDSL.g:2266:2: rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Selector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__0"


    // $ANTLR start "rule__Selector__Group_1__0__Impl"
    // InternalTableDSL.g:2273:1: rule__Selector__Group_1__0__Impl : ( 'TOP' ) ;
    public final void rule__Selector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2277:1: ( ( 'TOP' ) )
            // InternalTableDSL.g:2278:1: ( 'TOP' )
            {
            // InternalTableDSL.g:2278:1: ( 'TOP' )
            // InternalTableDSL.g:2279:2: 'TOP'
            {
             before(grammarAccess.getSelectorAccess().getTOPKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getTOPKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1__1"
    // InternalTableDSL.g:2288:1: rule__Selector__Group_1__1 : rule__Selector__Group_1__1__Impl ;
    public final void rule__Selector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2292:1: ( rule__Selector__Group_1__1__Impl )
            // InternalTableDSL.g:2293:2: rule__Selector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__1"


    // $ANTLR start "rule__Selector__Group_1__1__Impl"
    // InternalTableDSL.g:2299:1: rule__Selector__Group_1__1__Impl : ( ( rule__Selector__NAssignment_1_1 ) ) ;
    public final void rule__Selector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2303:1: ( ( ( rule__Selector__NAssignment_1_1 ) ) )
            // InternalTableDSL.g:2304:1: ( ( rule__Selector__NAssignment_1_1 ) )
            {
            // InternalTableDSL.g:2304:1: ( ( rule__Selector__NAssignment_1_1 ) )
            // InternalTableDSL.g:2305:2: ( rule__Selector__NAssignment_1_1 )
            {
             before(grammarAccess.getSelectorAccess().getNAssignment_1_1()); 
            // InternalTableDSL.g:2306:2: ( rule__Selector__NAssignment_1_1 )
            // InternalTableDSL.g:2306:3: rule__Selector__NAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__NAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getNAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__1__Impl"


    // $ANTLR start "rule__Comparator__Group__0"
    // InternalTableDSL.g:2315:1: rule__Comparator__Group__0 : rule__Comparator__Group__0__Impl rule__Comparator__Group__1 ;
    public final void rule__Comparator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2319:1: ( rule__Comparator__Group__0__Impl rule__Comparator__Group__1 )
            // InternalTableDSL.g:2320:2: rule__Comparator__Group__0__Impl rule__Comparator__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Comparator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group__0"


    // $ANTLR start "rule__Comparator__Group__0__Impl"
    // InternalTableDSL.g:2327:1: rule__Comparator__Group__0__Impl : ( ( rule__Comparator__KeysAssignment_0 ) ) ;
    public final void rule__Comparator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2331:1: ( ( ( rule__Comparator__KeysAssignment_0 ) ) )
            // InternalTableDSL.g:2332:1: ( ( rule__Comparator__KeysAssignment_0 ) )
            {
            // InternalTableDSL.g:2332:1: ( ( rule__Comparator__KeysAssignment_0 ) )
            // InternalTableDSL.g:2333:2: ( rule__Comparator__KeysAssignment_0 )
            {
             before(grammarAccess.getComparatorAccess().getKeysAssignment_0()); 
            // InternalTableDSL.g:2334:2: ( rule__Comparator__KeysAssignment_0 )
            // InternalTableDSL.g:2334:3: rule__Comparator__KeysAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__KeysAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComparatorAccess().getKeysAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group__0__Impl"


    // $ANTLR start "rule__Comparator__Group__1"
    // InternalTableDSL.g:2342:1: rule__Comparator__Group__1 : rule__Comparator__Group__1__Impl ;
    public final void rule__Comparator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2346:1: ( rule__Comparator__Group__1__Impl )
            // InternalTableDSL.g:2347:2: rule__Comparator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group__1"


    // $ANTLR start "rule__Comparator__Group__1__Impl"
    // InternalTableDSL.g:2353:1: rule__Comparator__Group__1__Impl : ( ( rule__Comparator__Group_1__0 )* ) ;
    public final void rule__Comparator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2357:1: ( ( ( rule__Comparator__Group_1__0 )* ) )
            // InternalTableDSL.g:2358:1: ( ( rule__Comparator__Group_1__0 )* )
            {
            // InternalTableDSL.g:2358:1: ( ( rule__Comparator__Group_1__0 )* )
            // InternalTableDSL.g:2359:2: ( rule__Comparator__Group_1__0 )*
            {
             before(grammarAccess.getComparatorAccess().getGroup_1()); 
            // InternalTableDSL.g:2360:2: ( rule__Comparator__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTableDSL.g:2360:3: rule__Comparator__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Comparator__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getComparatorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group__1__Impl"


    // $ANTLR start "rule__Comparator__Group_1__0"
    // InternalTableDSL.g:2369:1: rule__Comparator__Group_1__0 : rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 ;
    public final void rule__Comparator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2373:1: ( rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 )
            // InternalTableDSL.g:2374:2: rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Comparator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__0"


    // $ANTLR start "rule__Comparator__Group_1__0__Impl"
    // InternalTableDSL.g:2381:1: rule__Comparator__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Comparator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2385:1: ( ( ',' ) )
            // InternalTableDSL.g:2386:1: ( ',' )
            {
            // InternalTableDSL.g:2386:1: ( ',' )
            // InternalTableDSL.g:2387:2: ','
            {
             before(grammarAccess.getComparatorAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__0__Impl"


    // $ANTLR start "rule__Comparator__Group_1__1"
    // InternalTableDSL.g:2396:1: rule__Comparator__Group_1__1 : rule__Comparator__Group_1__1__Impl ;
    public final void rule__Comparator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2400:1: ( rule__Comparator__Group_1__1__Impl )
            // InternalTableDSL.g:2401:2: rule__Comparator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__1"


    // $ANTLR start "rule__Comparator__Group_1__1__Impl"
    // InternalTableDSL.g:2407:1: rule__Comparator__Group_1__1__Impl : ( ( rule__Comparator__KeysAssignment_1_1 ) ) ;
    public final void rule__Comparator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2411:1: ( ( ( rule__Comparator__KeysAssignment_1_1 ) ) )
            // InternalTableDSL.g:2412:1: ( ( rule__Comparator__KeysAssignment_1_1 ) )
            {
            // InternalTableDSL.g:2412:1: ( ( rule__Comparator__KeysAssignment_1_1 ) )
            // InternalTableDSL.g:2413:2: ( rule__Comparator__KeysAssignment_1_1 )
            {
             before(grammarAccess.getComparatorAccess().getKeysAssignment_1_1()); 
            // InternalTableDSL.g:2414:2: ( rule__Comparator__KeysAssignment_1_1 )
            // InternalTableDSL.g:2414:3: rule__Comparator__KeysAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__KeysAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparatorAccess().getKeysAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__1__Impl"


    // $ANTLR start "rule__SquashRows__Group__0"
    // InternalTableDSL.g:2423:1: rule__SquashRows__Group__0 : rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1 ;
    public final void rule__SquashRows__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2427:1: ( rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1 )
            // InternalTableDSL.g:2428:2: rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__SquashRows__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__0"


    // $ANTLR start "rule__SquashRows__Group__0__Impl"
    // InternalTableDSL.g:2435:1: rule__SquashRows__Group__0__Impl : ( 'squash' ) ;
    public final void rule__SquashRows__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2439:1: ( ( 'squash' ) )
            // InternalTableDSL.g:2440:1: ( 'squash' )
            {
            // InternalTableDSL.g:2440:1: ( 'squash' )
            // InternalTableDSL.g:2441:2: 'squash'
            {
             before(grammarAccess.getSquashRowsAccess().getSquashKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSquashRowsAccess().getSquashKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__0__Impl"


    // $ANTLR start "rule__SquashRows__Group__1"
    // InternalTableDSL.g:2450:1: rule__SquashRows__Group__1 : rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2 ;
    public final void rule__SquashRows__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2454:1: ( rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2 )
            // InternalTableDSL.g:2455:2: rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__SquashRows__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__1"


    // $ANTLR start "rule__SquashRows__Group__1__Impl"
    // InternalTableDSL.g:2462:1: rule__SquashRows__Group__1__Impl : ( ( 'rows' )? ) ;
    public final void rule__SquashRows__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2466:1: ( ( ( 'rows' )? ) )
            // InternalTableDSL.g:2467:1: ( ( 'rows' )? )
            {
            // InternalTableDSL.g:2467:1: ( ( 'rows' )? )
            // InternalTableDSL.g:2468:2: ( 'rows' )?
            {
             before(grammarAccess.getSquashRowsAccess().getRowsKeyword_1()); 
            // InternalTableDSL.g:2469:2: ( 'rows' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTableDSL.g:2469:3: 'rows'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSquashRowsAccess().getRowsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__1__Impl"


    // $ANTLR start "rule__SquashRows__Group__2"
    // InternalTableDSL.g:2477:1: rule__SquashRows__Group__2 : rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3 ;
    public final void rule__SquashRows__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2481:1: ( rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3 )
            // InternalTableDSL.g:2482:2: rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SquashRows__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__2"


    // $ANTLR start "rule__SquashRows__Group__2__Impl"
    // InternalTableDSL.g:2489:1: rule__SquashRows__Group__2__Impl : ( 'by' ) ;
    public final void rule__SquashRows__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2493:1: ( ( 'by' ) )
            // InternalTableDSL.g:2494:1: ( 'by' )
            {
            // InternalTableDSL.g:2494:1: ( 'by' )
            // InternalTableDSL.g:2495:2: 'by'
            {
             before(grammarAccess.getSquashRowsAccess().getByKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSquashRowsAccess().getByKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__2__Impl"


    // $ANTLR start "rule__SquashRows__Group__3"
    // InternalTableDSL.g:2504:1: rule__SquashRows__Group__3 : rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4 ;
    public final void rule__SquashRows__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2508:1: ( rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4 )
            // InternalTableDSL.g:2509:2: rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SquashRows__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__3"


    // $ANTLR start "rule__SquashRows__Group__3__Impl"
    // InternalTableDSL.g:2516:1: rule__SquashRows__Group__3__Impl : ( ( rule__SquashRows__ColumnsAssignment_3 ) ) ;
    public final void rule__SquashRows__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2520:1: ( ( ( rule__SquashRows__ColumnsAssignment_3 ) ) )
            // InternalTableDSL.g:2521:1: ( ( rule__SquashRows__ColumnsAssignment_3 ) )
            {
            // InternalTableDSL.g:2521:1: ( ( rule__SquashRows__ColumnsAssignment_3 ) )
            // InternalTableDSL.g:2522:2: ( rule__SquashRows__ColumnsAssignment_3 )
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsAssignment_3()); 
            // InternalTableDSL.g:2523:2: ( rule__SquashRows__ColumnsAssignment_3 )
            // InternalTableDSL.g:2523:3: rule__SquashRows__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSquashRowsAccess().getColumnsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__3__Impl"


    // $ANTLR start "rule__SquashRows__Group__4"
    // InternalTableDSL.g:2531:1: rule__SquashRows__Group__4 : rule__SquashRows__Group__4__Impl ;
    public final void rule__SquashRows__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2535:1: ( rule__SquashRows__Group__4__Impl )
            // InternalTableDSL.g:2536:2: rule__SquashRows__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__4"


    // $ANTLR start "rule__SquashRows__Group__4__Impl"
    // InternalTableDSL.g:2542:1: rule__SquashRows__Group__4__Impl : ( ( rule__SquashRows__Group_4__0 )* ) ;
    public final void rule__SquashRows__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2546:1: ( ( ( rule__SquashRows__Group_4__0 )* ) )
            // InternalTableDSL.g:2547:1: ( ( rule__SquashRows__Group_4__0 )* )
            {
            // InternalTableDSL.g:2547:1: ( ( rule__SquashRows__Group_4__0 )* )
            // InternalTableDSL.g:2548:2: ( rule__SquashRows__Group_4__0 )*
            {
             before(grammarAccess.getSquashRowsAccess().getGroup_4()); 
            // InternalTableDSL.g:2549:2: ( rule__SquashRows__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTableDSL.g:2549:3: rule__SquashRows__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SquashRows__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSquashRowsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__4__Impl"


    // $ANTLR start "rule__SquashRows__Group_4__0"
    // InternalTableDSL.g:2558:1: rule__SquashRows__Group_4__0 : rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1 ;
    public final void rule__SquashRows__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2562:1: ( rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1 )
            // InternalTableDSL.g:2563:2: rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__SquashRows__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquashRows__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group_4__0"


    // $ANTLR start "rule__SquashRows__Group_4__0__Impl"
    // InternalTableDSL.g:2570:1: rule__SquashRows__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SquashRows__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2574:1: ( ( ',' ) )
            // InternalTableDSL.g:2575:1: ( ',' )
            {
            // InternalTableDSL.g:2575:1: ( ',' )
            // InternalTableDSL.g:2576:2: ','
            {
             before(grammarAccess.getSquashRowsAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSquashRowsAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group_4__0__Impl"


    // $ANTLR start "rule__SquashRows__Group_4__1"
    // InternalTableDSL.g:2585:1: rule__SquashRows__Group_4__1 : rule__SquashRows__Group_4__1__Impl ;
    public final void rule__SquashRows__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2589:1: ( rule__SquashRows__Group_4__1__Impl )
            // InternalTableDSL.g:2590:2: rule__SquashRows__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group_4__1"


    // $ANTLR start "rule__SquashRows__Group_4__1__Impl"
    // InternalTableDSL.g:2596:1: rule__SquashRows__Group_4__1__Impl : ( ( rule__SquashRows__ColumnsAssignment_4_1 ) ) ;
    public final void rule__SquashRows__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2600:1: ( ( ( rule__SquashRows__ColumnsAssignment_4_1 ) ) )
            // InternalTableDSL.g:2601:1: ( ( rule__SquashRows__ColumnsAssignment_4_1 ) )
            {
            // InternalTableDSL.g:2601:1: ( ( rule__SquashRows__ColumnsAssignment_4_1 ) )
            // InternalTableDSL.g:2602:2: ( rule__SquashRows__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsAssignment_4_1()); 
            // InternalTableDSL.g:2603:2: ( rule__SquashRows__ColumnsAssignment_4_1 )
            // InternalTableDSL.g:2603:3: rule__SquashRows__ColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__ColumnsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSquashRowsAccess().getColumnsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group_4__1__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // InternalTableDSL.g:2612:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2616:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalTableDSL.g:2617:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Filter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0"


    // $ANTLR start "rule__Filter__Group__0__Impl"
    // InternalTableDSL.g:2624:1: rule__Filter__Group__0__Impl : ( 'filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2628:1: ( ( 'filter' ) )
            // InternalTableDSL.g:2629:1: ( 'filter' )
            {
            // InternalTableDSL.g:2629:1: ( 'filter' )
            // InternalTableDSL.g:2630:2: 'filter'
            {
             before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0__Impl"


    // $ANTLR start "rule__Filter__Group__1"
    // InternalTableDSL.g:2639:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2643:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalTableDSL.g:2644:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Filter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1"


    // $ANTLR start "rule__Filter__Group__1__Impl"
    // InternalTableDSL.g:2651:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__DenylistAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2655:1: ( ( ( rule__Filter__DenylistAssignment_1 ) ) )
            // InternalTableDSL.g:2656:1: ( ( rule__Filter__DenylistAssignment_1 ) )
            {
            // InternalTableDSL.g:2656:1: ( ( rule__Filter__DenylistAssignment_1 ) )
            // InternalTableDSL.g:2657:2: ( rule__Filter__DenylistAssignment_1 )
            {
             before(grammarAccess.getFilterAccess().getDenylistAssignment_1()); 
            // InternalTableDSL.g:2658:2: ( rule__Filter__DenylistAssignment_1 )
            // InternalTableDSL.g:2658:3: rule__Filter__DenylistAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__DenylistAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getDenylistAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1__Impl"


    // $ANTLR start "rule__Filter__Group__2"
    // InternalTableDSL.g:2666:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2670:1: ( rule__Filter__Group__2__Impl )
            // InternalTableDSL.g:2671:2: rule__Filter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__2"


    // $ANTLR start "rule__Filter__Group__2__Impl"
    // InternalTableDSL.g:2677:1: rule__Filter__Group__2__Impl : ( ( rule__Filter__ExceptlistAssignment_2 )? ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2681:1: ( ( ( rule__Filter__ExceptlistAssignment_2 )? ) )
            // InternalTableDSL.g:2682:1: ( ( rule__Filter__ExceptlistAssignment_2 )? )
            {
            // InternalTableDSL.g:2682:1: ( ( rule__Filter__ExceptlistAssignment_2 )? )
            // InternalTableDSL.g:2683:2: ( rule__Filter__ExceptlistAssignment_2 )?
            {
             before(grammarAccess.getFilterAccess().getExceptlistAssignment_2()); 
            // InternalTableDSL.g:2684:2: ( rule__Filter__ExceptlistAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTableDSL.g:2684:3: rule__Filter__ExceptlistAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__ExceptlistAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterAccess().getExceptlistAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__2__Impl"


    // $ANTLR start "rule__FilterDenylist__Group__0"
    // InternalTableDSL.g:2693:1: rule__FilterDenylist__Group__0 : rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1 ;
    public final void rule__FilterDenylist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2697:1: ( rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1 )
            // InternalTableDSL.g:2698:2: rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__FilterDenylist__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__0"


    // $ANTLR start "rule__FilterDenylist__Group__0__Impl"
    // InternalTableDSL.g:2705:1: rule__FilterDenylist__Group__0__Impl : ( 'deny' ) ;
    public final void rule__FilterDenylist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2709:1: ( ( 'deny' ) )
            // InternalTableDSL.g:2710:1: ( 'deny' )
            {
            // InternalTableDSL.g:2710:1: ( 'deny' )
            // InternalTableDSL.g:2711:2: 'deny'
            {
             before(grammarAccess.getFilterDenylistAccess().getDenyKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFilterDenylistAccess().getDenyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__0__Impl"


    // $ANTLR start "rule__FilterDenylist__Group__1"
    // InternalTableDSL.g:2720:1: rule__FilterDenylist__Group__1 : rule__FilterDenylist__Group__1__Impl rule__FilterDenylist__Group__2 ;
    public final void rule__FilterDenylist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2724:1: ( rule__FilterDenylist__Group__1__Impl rule__FilterDenylist__Group__2 )
            // InternalTableDSL.g:2725:2: rule__FilterDenylist__Group__1__Impl rule__FilterDenylist__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__FilterDenylist__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__1"


    // $ANTLR start "rule__FilterDenylist__Group__1__Impl"
    // InternalTableDSL.g:2732:1: rule__FilterDenylist__Group__1__Impl : ( ( rule__FilterDenylist__DenylistAssignment_1 ) ) ;
    public final void rule__FilterDenylist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2736:1: ( ( ( rule__FilterDenylist__DenylistAssignment_1 ) ) )
            // InternalTableDSL.g:2737:1: ( ( rule__FilterDenylist__DenylistAssignment_1 ) )
            {
            // InternalTableDSL.g:2737:1: ( ( rule__FilterDenylist__DenylistAssignment_1 ) )
            // InternalTableDSL.g:2738:2: ( rule__FilterDenylist__DenylistAssignment_1 )
            {
             before(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_1()); 
            // InternalTableDSL.g:2739:2: ( rule__FilterDenylist__DenylistAssignment_1 )
            // InternalTableDSL.g:2739:3: rule__FilterDenylist__DenylistAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterDenylist__DenylistAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__1__Impl"


    // $ANTLR start "rule__FilterDenylist__Group__2"
    // InternalTableDSL.g:2747:1: rule__FilterDenylist__Group__2 : rule__FilterDenylist__Group__2__Impl ;
    public final void rule__FilterDenylist__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2751:1: ( rule__FilterDenylist__Group__2__Impl )
            // InternalTableDSL.g:2752:2: rule__FilterDenylist__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__2"


    // $ANTLR start "rule__FilterDenylist__Group__2__Impl"
    // InternalTableDSL.g:2758:1: rule__FilterDenylist__Group__2__Impl : ( ( rule__FilterDenylist__Group_2__0 )* ) ;
    public final void rule__FilterDenylist__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2762:1: ( ( ( rule__FilterDenylist__Group_2__0 )* ) )
            // InternalTableDSL.g:2763:1: ( ( rule__FilterDenylist__Group_2__0 )* )
            {
            // InternalTableDSL.g:2763:1: ( ( rule__FilterDenylist__Group_2__0 )* )
            // InternalTableDSL.g:2764:2: ( rule__FilterDenylist__Group_2__0 )*
            {
             before(grammarAccess.getFilterDenylistAccess().getGroup_2()); 
            // InternalTableDSL.g:2765:2: ( rule__FilterDenylist__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTableDSL.g:2765:3: rule__FilterDenylist__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterDenylist__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFilterDenylistAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__2__Impl"


    // $ANTLR start "rule__FilterDenylist__Group_2__0"
    // InternalTableDSL.g:2774:1: rule__FilterDenylist__Group_2__0 : rule__FilterDenylist__Group_2__0__Impl rule__FilterDenylist__Group_2__1 ;
    public final void rule__FilterDenylist__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2778:1: ( rule__FilterDenylist__Group_2__0__Impl rule__FilterDenylist__Group_2__1 )
            // InternalTableDSL.g:2779:2: rule__FilterDenylist__Group_2__0__Impl rule__FilterDenylist__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__FilterDenylist__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group_2__0"


    // $ANTLR start "rule__FilterDenylist__Group_2__0__Impl"
    // InternalTableDSL.g:2786:1: rule__FilterDenylist__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FilterDenylist__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2790:1: ( ( ',' ) )
            // InternalTableDSL.g:2791:1: ( ',' )
            {
            // InternalTableDSL.g:2791:1: ( ',' )
            // InternalTableDSL.g:2792:2: ','
            {
             before(grammarAccess.getFilterDenylistAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFilterDenylistAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group_2__0__Impl"


    // $ANTLR start "rule__FilterDenylist__Group_2__1"
    // InternalTableDSL.g:2801:1: rule__FilterDenylist__Group_2__1 : rule__FilterDenylist__Group_2__1__Impl ;
    public final void rule__FilterDenylist__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2805:1: ( rule__FilterDenylist__Group_2__1__Impl )
            // InternalTableDSL.g:2806:2: rule__FilterDenylist__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group_2__1"


    // $ANTLR start "rule__FilterDenylist__Group_2__1__Impl"
    // InternalTableDSL.g:2812:1: rule__FilterDenylist__Group_2__1__Impl : ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) ) ;
    public final void rule__FilterDenylist__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2816:1: ( ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) ) )
            // InternalTableDSL.g:2817:1: ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) )
            {
            // InternalTableDSL.g:2817:1: ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) )
            // InternalTableDSL.g:2818:2: ( rule__FilterDenylist__DenylistAssignment_2_1 )
            {
             before(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_2_1()); 
            // InternalTableDSL.g:2819:2: ( rule__FilterDenylist__DenylistAssignment_2_1 )
            // InternalTableDSL.g:2819:3: rule__FilterDenylist__DenylistAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterDenylist__DenylistAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group_2__1__Impl"


    // $ANTLR start "rule__FilterExceptlist__Group__0"
    // InternalTableDSL.g:2828:1: rule__FilterExceptlist__Group__0 : rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1 ;
    public final void rule__FilterExceptlist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2832:1: ( rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1 )
            // InternalTableDSL.g:2833:2: rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__FilterExceptlist__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__0"


    // $ANTLR start "rule__FilterExceptlist__Group__0__Impl"
    // InternalTableDSL.g:2840:1: rule__FilterExceptlist__Group__0__Impl : ( 'except' ) ;
    public final void rule__FilterExceptlist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2844:1: ( ( 'except' ) )
            // InternalTableDSL.g:2845:1: ( 'except' )
            {
            // InternalTableDSL.g:2845:1: ( 'except' )
            // InternalTableDSL.g:2846:2: 'except'
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFilterExceptlistAccess().getExceptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__0__Impl"


    // $ANTLR start "rule__FilterExceptlist__Group__1"
    // InternalTableDSL.g:2855:1: rule__FilterExceptlist__Group__1 : rule__FilterExceptlist__Group__1__Impl rule__FilterExceptlist__Group__2 ;
    public final void rule__FilterExceptlist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2859:1: ( rule__FilterExceptlist__Group__1__Impl rule__FilterExceptlist__Group__2 )
            // InternalTableDSL.g:2860:2: rule__FilterExceptlist__Group__1__Impl rule__FilterExceptlist__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__FilterExceptlist__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__1"


    // $ANTLR start "rule__FilterExceptlist__Group__1__Impl"
    // InternalTableDSL.g:2867:1: rule__FilterExceptlist__Group__1__Impl : ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) ) ;
    public final void rule__FilterExceptlist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2871:1: ( ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) ) )
            // InternalTableDSL.g:2872:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) )
            {
            // InternalTableDSL.g:2872:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) )
            // InternalTableDSL.g:2873:2: ( rule__FilterExceptlist__ExceptlistAssignment_1 )
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_1()); 
            // InternalTableDSL.g:2874:2: ( rule__FilterExceptlist__ExceptlistAssignment_1 )
            // InternalTableDSL.g:2874:3: rule__FilterExceptlist__ExceptlistAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__ExceptlistAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__1__Impl"


    // $ANTLR start "rule__FilterExceptlist__Group__2"
    // InternalTableDSL.g:2882:1: rule__FilterExceptlist__Group__2 : rule__FilterExceptlist__Group__2__Impl ;
    public final void rule__FilterExceptlist__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2886:1: ( rule__FilterExceptlist__Group__2__Impl )
            // InternalTableDSL.g:2887:2: rule__FilterExceptlist__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__2"


    // $ANTLR start "rule__FilterExceptlist__Group__2__Impl"
    // InternalTableDSL.g:2893:1: rule__FilterExceptlist__Group__2__Impl : ( ( rule__FilterExceptlist__Group_2__0 )* ) ;
    public final void rule__FilterExceptlist__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2897:1: ( ( ( rule__FilterExceptlist__Group_2__0 )* ) )
            // InternalTableDSL.g:2898:1: ( ( rule__FilterExceptlist__Group_2__0 )* )
            {
            // InternalTableDSL.g:2898:1: ( ( rule__FilterExceptlist__Group_2__0 )* )
            // InternalTableDSL.g:2899:2: ( rule__FilterExceptlist__Group_2__0 )*
            {
             before(grammarAccess.getFilterExceptlistAccess().getGroup_2()); 
            // InternalTableDSL.g:2900:2: ( rule__FilterExceptlist__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTableDSL.g:2900:3: rule__FilterExceptlist__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterExceptlist__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFilterExceptlistAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__2__Impl"


    // $ANTLR start "rule__FilterExceptlist__Group_2__0"
    // InternalTableDSL.g:2909:1: rule__FilterExceptlist__Group_2__0 : rule__FilterExceptlist__Group_2__0__Impl rule__FilterExceptlist__Group_2__1 ;
    public final void rule__FilterExceptlist__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2913:1: ( rule__FilterExceptlist__Group_2__0__Impl rule__FilterExceptlist__Group_2__1 )
            // InternalTableDSL.g:2914:2: rule__FilterExceptlist__Group_2__0__Impl rule__FilterExceptlist__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__FilterExceptlist__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group_2__0"


    // $ANTLR start "rule__FilterExceptlist__Group_2__0__Impl"
    // InternalTableDSL.g:2921:1: rule__FilterExceptlist__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FilterExceptlist__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2925:1: ( ( ',' ) )
            // InternalTableDSL.g:2926:1: ( ',' )
            {
            // InternalTableDSL.g:2926:1: ( ',' )
            // InternalTableDSL.g:2927:2: ','
            {
             before(grammarAccess.getFilterExceptlistAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFilterExceptlistAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group_2__0__Impl"


    // $ANTLR start "rule__FilterExceptlist__Group_2__1"
    // InternalTableDSL.g:2936:1: rule__FilterExceptlist__Group_2__1 : rule__FilterExceptlist__Group_2__1__Impl ;
    public final void rule__FilterExceptlist__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2940:1: ( rule__FilterExceptlist__Group_2__1__Impl )
            // InternalTableDSL.g:2941:2: rule__FilterExceptlist__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group_2__1"


    // $ANTLR start "rule__FilterExceptlist__Group_2__1__Impl"
    // InternalTableDSL.g:2947:1: rule__FilterExceptlist__Group_2__1__Impl : ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) ) ;
    public final void rule__FilterExceptlist__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2951:1: ( ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) ) )
            // InternalTableDSL.g:2952:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) )
            {
            // InternalTableDSL.g:2952:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) )
            // InternalTableDSL.g:2953:2: ( rule__FilterExceptlist__ExceptlistAssignment_2_1 )
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_2_1()); 
            // InternalTableDSL.g:2954:2: ( rule__FilterExceptlist__ExceptlistAssignment_2_1 )
            // InternalTableDSL.g:2954:3: rule__FilterExceptlist__ExceptlistAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__ExceptlistAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group_2__1__Impl"


    // $ANTLR start "rule__FilterColumnRule__Group__0"
    // InternalTableDSL.g:2963:1: rule__FilterColumnRule__Group__0 : rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1 ;
    public final void rule__FilterColumnRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2967:1: ( rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1 )
            // InternalTableDSL.g:2968:2: rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FilterColumnRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__0"


    // $ANTLR start "rule__FilterColumnRule__Group__0__Impl"
    // InternalTableDSL.g:2975:1: rule__FilterColumnRule__Group__0__Impl : ( ( rule__FilterColumnRule__Alternatives_0 ) ) ;
    public final void rule__FilterColumnRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2979:1: ( ( ( rule__FilterColumnRule__Alternatives_0 ) ) )
            // InternalTableDSL.g:2980:1: ( ( rule__FilterColumnRule__Alternatives_0 ) )
            {
            // InternalTableDSL.g:2980:1: ( ( rule__FilterColumnRule__Alternatives_0 ) )
            // InternalTableDSL.g:2981:2: ( rule__FilterColumnRule__Alternatives_0 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getAlternatives_0()); 
            // InternalTableDSL.g:2982:2: ( rule__FilterColumnRule__Alternatives_0 )
            // InternalTableDSL.g:2982:3: rule__FilterColumnRule__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFilterColumnRuleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__0__Impl"


    // $ANTLR start "rule__FilterColumnRule__Group__1"
    // InternalTableDSL.g:2990:1: rule__FilterColumnRule__Group__1 : rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2 ;
    public final void rule__FilterColumnRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2994:1: ( rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2 )
            // InternalTableDSL.g:2995:2: rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__FilterColumnRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__1"


    // $ANTLR start "rule__FilterColumnRule__Group__1__Impl"
    // InternalTableDSL.g:3002:1: rule__FilterColumnRule__Group__1__Impl : ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) ) ;
    public final void rule__FilterColumnRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3006:1: ( ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) ) )
            // InternalTableDSL.g:3007:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) )
            {
            // InternalTableDSL.g:3007:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) )
            // InternalTableDSL.g:3008:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_1 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsAssignment_1()); 
            // InternalTableDSL.g:3009:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_1 )
            // InternalTableDSL.g:3009:3: rule__FilterColumnRule__ColumnPatternsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__ColumnPatternsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__1__Impl"


    // $ANTLR start "rule__FilterColumnRule__Group__2"
    // InternalTableDSL.g:3017:1: rule__FilterColumnRule__Group__2 : rule__FilterColumnRule__Group__2__Impl ;
    public final void rule__FilterColumnRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3021:1: ( rule__FilterColumnRule__Group__2__Impl )
            // InternalTableDSL.g:3022:2: rule__FilterColumnRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__2"


    // $ANTLR start "rule__FilterColumnRule__Group__2__Impl"
    // InternalTableDSL.g:3028:1: rule__FilterColumnRule__Group__2__Impl : ( ( rule__FilterColumnRule__Group_2__0 )* ) ;
    public final void rule__FilterColumnRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3032:1: ( ( ( rule__FilterColumnRule__Group_2__0 )* ) )
            // InternalTableDSL.g:3033:1: ( ( rule__FilterColumnRule__Group_2__0 )* )
            {
            // InternalTableDSL.g:3033:1: ( ( rule__FilterColumnRule__Group_2__0 )* )
            // InternalTableDSL.g:3034:2: ( rule__FilterColumnRule__Group_2__0 )*
            {
             before(grammarAccess.getFilterColumnRuleAccess().getGroup_2()); 
            // InternalTableDSL.g:3035:2: ( rule__FilterColumnRule__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    int LA25_2 = input.LA(2);

                    if ( ((LA25_2>=RULE_COLUMN_NAME_KEYWORDS && LA25_2<=RULE_STRING)) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalTableDSL.g:3035:3: rule__FilterColumnRule__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterColumnRule__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFilterColumnRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__2__Impl"


    // $ANTLR start "rule__FilterColumnRule__Group_2__0"
    // InternalTableDSL.g:3044:1: rule__FilterColumnRule__Group_2__0 : rule__FilterColumnRule__Group_2__0__Impl rule__FilterColumnRule__Group_2__1 ;
    public final void rule__FilterColumnRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3048:1: ( rule__FilterColumnRule__Group_2__0__Impl rule__FilterColumnRule__Group_2__1 )
            // InternalTableDSL.g:3049:2: rule__FilterColumnRule__Group_2__0__Impl rule__FilterColumnRule__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__FilterColumnRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group_2__0"


    // $ANTLR start "rule__FilterColumnRule__Group_2__0__Impl"
    // InternalTableDSL.g:3056:1: rule__FilterColumnRule__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FilterColumnRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3060:1: ( ( ',' ) )
            // InternalTableDSL.g:3061:1: ( ',' )
            {
            // InternalTableDSL.g:3061:1: ( ',' )
            // InternalTableDSL.g:3062:2: ','
            {
             before(grammarAccess.getFilterColumnRuleAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFilterColumnRuleAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group_2__0__Impl"


    // $ANTLR start "rule__FilterColumnRule__Group_2__1"
    // InternalTableDSL.g:3071:1: rule__FilterColumnRule__Group_2__1 : rule__FilterColumnRule__Group_2__1__Impl ;
    public final void rule__FilterColumnRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3075:1: ( rule__FilterColumnRule__Group_2__1__Impl )
            // InternalTableDSL.g:3076:2: rule__FilterColumnRule__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group_2__1"


    // $ANTLR start "rule__FilterColumnRule__Group_2__1__Impl"
    // InternalTableDSL.g:3082:1: rule__FilterColumnRule__Group_2__1__Impl : ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) ) ;
    public final void rule__FilterColumnRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3086:1: ( ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) ) )
            // InternalTableDSL.g:3087:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) )
            {
            // InternalTableDSL.g:3087:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) )
            // InternalTableDSL.g:3088:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsAssignment_2_1()); 
            // InternalTableDSL.g:3089:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 )
            // InternalTableDSL.g:3089:3: rule__FilterColumnRule__ColumnPatternsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__ColumnPatternsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group_2__1__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__0"
    // InternalTableDSL.g:3098:1: rule__FilterObjectTypeRule__Group__0 : rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1 ;
    public final void rule__FilterObjectTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3102:1: ( rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1 )
            // InternalTableDSL.g:3103:2: rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__FilterObjectTypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__0"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__0__Impl"
    // InternalTableDSL.g:3110:1: rule__FilterObjectTypeRule__Group__0__Impl : ( ( rule__FilterObjectTypeRule__Alternatives_0 ) ) ;
    public final void rule__FilterObjectTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3114:1: ( ( ( rule__FilterObjectTypeRule__Alternatives_0 ) ) )
            // InternalTableDSL.g:3115:1: ( ( rule__FilterObjectTypeRule__Alternatives_0 ) )
            {
            // InternalTableDSL.g:3115:1: ( ( rule__FilterObjectTypeRule__Alternatives_0 ) )
            // InternalTableDSL.g:3116:2: ( rule__FilterObjectTypeRule__Alternatives_0 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getAlternatives_0()); 
            // InternalTableDSL.g:3117:2: ( rule__FilterObjectTypeRule__Alternatives_0 )
            // InternalTableDSL.g:3117:3: rule__FilterObjectTypeRule__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFilterObjectTypeRuleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__0__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__1"
    // InternalTableDSL.g:3125:1: rule__FilterObjectTypeRule__Group__1 : rule__FilterObjectTypeRule__Group__1__Impl rule__FilterObjectTypeRule__Group__2 ;
    public final void rule__FilterObjectTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3129:1: ( rule__FilterObjectTypeRule__Group__1__Impl rule__FilterObjectTypeRule__Group__2 )
            // InternalTableDSL.g:3130:2: rule__FilterObjectTypeRule__Group__1__Impl rule__FilterObjectTypeRule__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__FilterObjectTypeRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__1"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__1__Impl"
    // InternalTableDSL.g:3137:1: rule__FilterObjectTypeRule__Group__1__Impl : ( ( 'of' )? ) ;
    public final void rule__FilterObjectTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3141:1: ( ( ( 'of' )? ) )
            // InternalTableDSL.g:3142:1: ( ( 'of' )? )
            {
            // InternalTableDSL.g:3142:1: ( ( 'of' )? )
            // InternalTableDSL.g:3143:2: ( 'of' )?
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getOfKeyword_1()); 
            // InternalTableDSL.g:3144:2: ( 'of' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTableDSL.g:3144:3: 'of'
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFilterObjectTypeRuleAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__1__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__2"
    // InternalTableDSL.g:3152:1: rule__FilterObjectTypeRule__Group__2 : rule__FilterObjectTypeRule__Group__2__Impl rule__FilterObjectTypeRule__Group__3 ;
    public final void rule__FilterObjectTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3156:1: ( rule__FilterObjectTypeRule__Group__2__Impl rule__FilterObjectTypeRule__Group__3 )
            // InternalTableDSL.g:3157:2: rule__FilterObjectTypeRule__Group__2__Impl rule__FilterObjectTypeRule__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__FilterObjectTypeRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__2"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__2__Impl"
    // InternalTableDSL.g:3164:1: rule__FilterObjectTypeRule__Group__2__Impl : ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) ) ;
    public final void rule__FilterObjectTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3168:1: ( ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) ) )
            // InternalTableDSL.g:3169:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) )
            {
            // InternalTableDSL.g:3169:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) )
            // InternalTableDSL.g:3170:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesAssignment_2()); 
            // InternalTableDSL.g:3171:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 )
            // InternalTableDSL.g:3171:3: rule__FilterObjectTypeRule__ObjectClassesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__ObjectClassesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__2__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__3"
    // InternalTableDSL.g:3179:1: rule__FilterObjectTypeRule__Group__3 : rule__FilterObjectTypeRule__Group__3__Impl ;
    public final void rule__FilterObjectTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3183:1: ( rule__FilterObjectTypeRule__Group__3__Impl )
            // InternalTableDSL.g:3184:2: rule__FilterObjectTypeRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__3"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__3__Impl"
    // InternalTableDSL.g:3190:1: rule__FilterObjectTypeRule__Group__3__Impl : ( ( rule__FilterObjectTypeRule__Group_3__0 )* ) ;
    public final void rule__FilterObjectTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3194:1: ( ( ( rule__FilterObjectTypeRule__Group_3__0 )* ) )
            // InternalTableDSL.g:3195:1: ( ( rule__FilterObjectTypeRule__Group_3__0 )* )
            {
            // InternalTableDSL.g:3195:1: ( ( rule__FilterObjectTypeRule__Group_3__0 )* )
            // InternalTableDSL.g:3196:2: ( rule__FilterObjectTypeRule__Group_3__0 )*
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getGroup_3()); 
            // InternalTableDSL.g:3197:2: ( rule__FilterObjectTypeRule__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_STRING) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalTableDSL.g:3197:3: rule__FilterObjectTypeRule__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterObjectTypeRule__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getFilterObjectTypeRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__3__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group_3__0"
    // InternalTableDSL.g:3206:1: rule__FilterObjectTypeRule__Group_3__0 : rule__FilterObjectTypeRule__Group_3__0__Impl rule__FilterObjectTypeRule__Group_3__1 ;
    public final void rule__FilterObjectTypeRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3210:1: ( rule__FilterObjectTypeRule__Group_3__0__Impl rule__FilterObjectTypeRule__Group_3__1 )
            // InternalTableDSL.g:3211:2: rule__FilterObjectTypeRule__Group_3__0__Impl rule__FilterObjectTypeRule__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__FilterObjectTypeRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group_3__0"


    // $ANTLR start "rule__FilterObjectTypeRule__Group_3__0__Impl"
    // InternalTableDSL.g:3218:1: rule__FilterObjectTypeRule__Group_3__0__Impl : ( ',' ) ;
    public final void rule__FilterObjectTypeRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3222:1: ( ( ',' ) )
            // InternalTableDSL.g:3223:1: ( ',' )
            {
            // InternalTableDSL.g:3223:1: ( ',' )
            // InternalTableDSL.g:3224:2: ','
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFilterObjectTypeRuleAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group_3__0__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group_3__1"
    // InternalTableDSL.g:3233:1: rule__FilterObjectTypeRule__Group_3__1 : rule__FilterObjectTypeRule__Group_3__1__Impl ;
    public final void rule__FilterObjectTypeRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3237:1: ( rule__FilterObjectTypeRule__Group_3__1__Impl )
            // InternalTableDSL.g:3238:2: rule__FilterObjectTypeRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group_3__1"


    // $ANTLR start "rule__FilterObjectTypeRule__Group_3__1__Impl"
    // InternalTableDSL.g:3244:1: rule__FilterObjectTypeRule__Group_3__1__Impl : ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) ) ;
    public final void rule__FilterObjectTypeRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3248:1: ( ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) ) )
            // InternalTableDSL.g:3249:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) )
            {
            // InternalTableDSL.g:3249:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) )
            // InternalTableDSL.g:3250:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesAssignment_3_1()); 
            // InternalTableDSL.g:3251:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 )
            // InternalTableDSL.g:3251:3: rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group_3__1__Impl"


    // $ANTLR start "rule__Start__ActionsAssignment_0"
    // InternalTableDSL.g:3260:1: rule__Start__ActionsAssignment_0 : ( ruleCreateTable ) ;
    public final void rule__Start__ActionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3264:1: ( ( ruleCreateTable ) )
            // InternalTableDSL.g:3265:2: ( ruleCreateTable )
            {
            // InternalTableDSL.g:3265:2: ( ruleCreateTable )
            // InternalTableDSL.g:3266:3: ruleCreateTable
            {
             before(grammarAccess.getStartAccess().getActionsCreateTableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCreateTable();

            state._fsp--;

             after(grammarAccess.getStartAccess().getActionsCreateTableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__ActionsAssignment_0"


    // $ANTLR start "rule__Start__ActionsAssignment_1"
    // InternalTableDSL.g:3275:1: rule__Start__ActionsAssignment_1 : ( ruleTableAction ) ;
    public final void rule__Start__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3279:1: ( ( ruleTableAction ) )
            // InternalTableDSL.g:3280:2: ( ruleTableAction )
            {
            // InternalTableDSL.g:3280:2: ( ruleTableAction )
            // InternalTableDSL.g:3281:3: ruleTableAction
            {
             before(grammarAccess.getStartAccess().getActionsTableActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableAction();

            state._fsp--;

             after(grammarAccess.getStartAccess().getActionsTableActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__ActionsAssignment_1"


    // $ANTLR start "rule__TableInputPath__PathPatternsAssignment_0"
    // InternalTableDSL.g:3290:1: rule__TableInputPath__PathPatternsAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TableInputPath__PathPatternsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3294:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3295:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3295:2: ( RULE_STRING )
            // InternalTableDSL.g:3296:3: RULE_STRING
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__PathPatternsAssignment_0"


    // $ANTLR start "rule__TableInputPath__PathPatternsAssignment_1_1"
    // InternalTableDSL.g:3305:1: rule__TableInputPath__PathPatternsAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TableInputPath__PathPatternsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3309:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3310:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3310:2: ( RULE_STRING )
            // InternalTableDSL.g:3311:3: RULE_STRING
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__PathPatternsAssignment_1_1"


    // $ANTLR start "rule__Output__OutputPathsAssignment_2"
    // InternalTableDSL.g:3320:1: rule__Output__OutputPathsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__OutputPathsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3324:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3325:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3325:2: ( RULE_STRING )
            // InternalTableDSL.g:3326:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__OutputPathsAssignment_2"


    // $ANTLR start "rule__Output__OutputPathsAssignment_3_1"
    // InternalTableDSL.g:3335:1: rule__Output__OutputPathsAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Output__OutputPathsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3339:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3340:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3340:2: ( RULE_STRING )
            // InternalTableDSL.g:3341:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__OutputPathsAssignment_3_1"


    // $ANTLR start "rule__Select__ColumnsPatternsAssignment_1"
    // InternalTableDSL.g:3350:1: rule__Select__ColumnsPatternsAssignment_1 : ( ruleColumnName ) ;
    public final void rule__Select__ColumnsPatternsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3354:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3355:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3355:2: ( ruleColumnName )
            // InternalTableDSL.g:3356:3: ruleColumnName
            {
             before(grammarAccess.getSelectAccess().getColumnsPatternsColumnNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getColumnsPatternsColumnNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ColumnsPatternsAssignment_1"


    // $ANTLR start "rule__Select__ColumnPatternsAssignment_2_1"
    // InternalTableDSL.g:3365:1: rule__Select__ColumnPatternsAssignment_2_1 : ( ruleColumnName ) ;
    public final void rule__Select__ColumnPatternsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3369:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3370:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3370:2: ( ruleColumnName )
            // InternalTableDSL.g:3371:3: ruleColumnName
            {
             before(grammarAccess.getSelectAccess().getColumnPatternsColumnNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getColumnPatternsColumnNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ColumnPatternsAssignment_2_1"


    // $ANTLR start "rule__RenameColumn__RenameTuplesAssignment_2"
    // InternalTableDSL.g:3380:1: rule__RenameColumn__RenameTuplesAssignment_2 : ( ruleRenameColumnPair ) ;
    public final void rule__RenameColumn__RenameTuplesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3384:1: ( ( ruleRenameColumnPair ) )
            // InternalTableDSL.g:3385:2: ( ruleRenameColumnPair )
            {
            // InternalTableDSL.g:3385:2: ( ruleRenameColumnPair )
            // InternalTableDSL.g:3386:3: ruleRenameColumnPair
            {
             before(grammarAccess.getRenameColumnAccess().getRenameTuplesRenameColumnPairParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRenameColumnPair();

            state._fsp--;

             after(grammarAccess.getRenameColumnAccess().getRenameTuplesRenameColumnPairParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__RenameTuplesAssignment_2"


    // $ANTLR start "rule__RenameColumnToPair__OldNameAssignment_0"
    // InternalTableDSL.g:3395:1: rule__RenameColumnToPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnToPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3399:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3400:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3400:2: ( RULE_STRING )
            // InternalTableDSL.g:3401:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnToPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnToPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__OldNameAssignment_0"


    // $ANTLR start "rule__RenameColumnToPair__NewNameAssignment_2"
    // InternalTableDSL.g:3410:1: rule__RenameColumnToPair__NewNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnToPair__NewNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3414:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3415:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3415:2: ( RULE_STRING )
            // InternalTableDSL.g:3416:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnToPairAccess().getNewNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnToPairAccess().getNewNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__NewNameAssignment_2"


    // $ANTLR start "rule__RenameColumnPrependPair__OldNameAssignment_0"
    // InternalTableDSL.g:3425:1: rule__RenameColumnPrependPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnPrependPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3429:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3430:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3430:2: ( RULE_STRING )
            // InternalTableDSL.g:3431:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnPrependPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__OldNameAssignment_0"


    // $ANTLR start "rule__RenameColumnPrependPair__PrefixAssignment_2"
    // InternalTableDSL.g:3440:1: rule__RenameColumnPrependPair__PrefixAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnPrependPair__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3444:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3445:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3445:2: ( RULE_STRING )
            // InternalTableDSL.g:3446:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getPrefixSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnPrependPairAccess().getPrefixSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__PrefixAssignment_2"


    // $ANTLR start "rule__RenameColumnAppendPair__OldNameAssignment_0"
    // InternalTableDSL.g:3455:1: rule__RenameColumnAppendPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnAppendPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3459:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3460:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3460:2: ( RULE_STRING )
            // InternalTableDSL.g:3461:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAppendPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__OldNameAssignment_0"


    // $ANTLR start "rule__RenameColumnAppendPair__SuffixAssignment_2"
    // InternalTableDSL.g:3470:1: rule__RenameColumnAppendPair__SuffixAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnAppendPair__SuffixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3474:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3475:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3475:2: ( RULE_STRING )
            // InternalTableDSL.g:3476:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getSuffixSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAppendPairAccess().getSuffixSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__SuffixAssignment_2"


    // $ANTLR start "rule__Extract__TargetColumnsAssignment_1"
    // InternalTableDSL.g:3485:1: rule__Extract__TargetColumnsAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Extract__TargetColumnsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3489:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3490:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3490:2: ( RULE_STRING )
            // InternalTableDSL.g:3491:3: RULE_STRING
            {
             before(grammarAccess.getExtractAccess().getTargetColumnsSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getTargetColumnsSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__TargetColumnsAssignment_1"


    // $ANTLR start "rule__Extract__TargetColumnsAssignment_2_1"
    // InternalTableDSL.g:3500:1: rule__Extract__TargetColumnsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Extract__TargetColumnsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3504:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3505:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3505:2: ( RULE_STRING )
            // InternalTableDSL.g:3506:3: RULE_STRING
            {
             before(grammarAccess.getExtractAccess().getTargetColumnsSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getTargetColumnsSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__TargetColumnsAssignment_2_1"


    // $ANTLR start "rule__Extract__SourceColumnAssignment_4"
    // InternalTableDSL.g:3515:1: rule__Extract__SourceColumnAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Extract__SourceColumnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3519:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3520:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3520:2: ( RULE_STRING )
            // InternalTableDSL.g:3521:3: RULE_STRING
            {
             before(grammarAccess.getExtractAccess().getSourceColumnSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getSourceColumnSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__SourceColumnAssignment_4"


    // $ANTLR start "rule__Extract__SelectorAssignment_6"
    // InternalTableDSL.g:3530:1: rule__Extract__SelectorAssignment_6 : ( ruleSelector ) ;
    public final void rule__Extract__SelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3534:1: ( ( ruleSelector ) )
            // InternalTableDSL.g:3535:2: ( ruleSelector )
            {
            // InternalTableDSL.g:3535:2: ( ruleSelector )
            // InternalTableDSL.g:3536:3: ruleSelector
            {
             before(grammarAccess.getExtractAccess().getSelectorSelectorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getExtractAccess().getSelectorSelectorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__SelectorAssignment_6"


    // $ANTLR start "rule__Extract__ComparatorAssignment_9"
    // InternalTableDSL.g:3545:1: rule__Extract__ComparatorAssignment_9 : ( ruleComparator ) ;
    public final void rule__Extract__ComparatorAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3549:1: ( ( ruleComparator ) )
            // InternalTableDSL.g:3550:2: ( ruleComparator )
            {
            // InternalTableDSL.g:3550:2: ( ruleComparator )
            // InternalTableDSL.g:3551:3: ruleComparator
            {
             before(grammarAccess.getExtractAccess().getComparatorComparatorParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getExtractAccess().getComparatorComparatorParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__ComparatorAssignment_9"


    // $ANTLR start "rule__Selector__NAssignment_1_1"
    // InternalTableDSL.g:3560:1: rule__Selector__NAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Selector__NAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3564:1: ( ( RULE_INT ) )
            // InternalTableDSL.g:3565:2: ( RULE_INT )
            {
            // InternalTableDSL.g:3565:2: ( RULE_INT )
            // InternalTableDSL.g:3566:3: RULE_INT
            {
             before(grammarAccess.getSelectorAccess().getNINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getNINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__NAssignment_1_1"


    // $ANTLR start "rule__Comparator__KeysAssignment_0"
    // InternalTableDSL.g:3575:1: rule__Comparator__KeysAssignment_0 : ( ruleColumnName ) ;
    public final void rule__Comparator__KeysAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3579:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3580:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3580:2: ( ruleColumnName )
            // InternalTableDSL.g:3581:3: ruleColumnName
            {
             before(grammarAccess.getComparatorAccess().getKeysColumnNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getComparatorAccess().getKeysColumnNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__KeysAssignment_0"


    // $ANTLR start "rule__Comparator__KeysAssignment_1_1"
    // InternalTableDSL.g:3590:1: rule__Comparator__KeysAssignment_1_1 : ( ruleColumnName ) ;
    public final void rule__Comparator__KeysAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3594:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3595:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3595:2: ( ruleColumnName )
            // InternalTableDSL.g:3596:3: ruleColumnName
            {
             before(grammarAccess.getComparatorAccess().getKeysColumnNameParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getComparatorAccess().getKeysColumnNameParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__KeysAssignment_1_1"


    // $ANTLR start "rule__SquashRows__ColumnsAssignment_3"
    // InternalTableDSL.g:3605:1: rule__SquashRows__ColumnsAssignment_3 : ( ruleColumnName ) ;
    public final void rule__SquashRows__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3609:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3610:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3610:2: ( ruleColumnName )
            // InternalTableDSL.g:3611:3: ruleColumnName
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsColumnNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getSquashRowsAccess().getColumnsColumnNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__ColumnsAssignment_3"


    // $ANTLR start "rule__SquashRows__ColumnsAssignment_4_1"
    // InternalTableDSL.g:3620:1: rule__SquashRows__ColumnsAssignment_4_1 : ( ruleColumnName ) ;
    public final void rule__SquashRows__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3624:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3625:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3625:2: ( ruleColumnName )
            // InternalTableDSL.g:3626:3: ruleColumnName
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsColumnNameParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getSquashRowsAccess().getColumnsColumnNameParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__ColumnsAssignment_4_1"


    // $ANTLR start "rule__Filter__DenylistAssignment_1"
    // InternalTableDSL.g:3635:1: rule__Filter__DenylistAssignment_1 : ( ruleFilterDenylist ) ;
    public final void rule__Filter__DenylistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3639:1: ( ( ruleFilterDenylist ) )
            // InternalTableDSL.g:3640:2: ( ruleFilterDenylist )
            {
            // InternalTableDSL.g:3640:2: ( ruleFilterDenylist )
            // InternalTableDSL.g:3641:3: ruleFilterDenylist
            {
             before(grammarAccess.getFilterAccess().getDenylistFilterDenylistParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterDenylist();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getDenylistFilterDenylistParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__DenylistAssignment_1"


    // $ANTLR start "rule__Filter__ExceptlistAssignment_2"
    // InternalTableDSL.g:3650:1: rule__Filter__ExceptlistAssignment_2 : ( ruleFilterExceptlist ) ;
    public final void rule__Filter__ExceptlistAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3654:1: ( ( ruleFilterExceptlist ) )
            // InternalTableDSL.g:3655:2: ( ruleFilterExceptlist )
            {
            // InternalTableDSL.g:3655:2: ( ruleFilterExceptlist )
            // InternalTableDSL.g:3656:3: ruleFilterExceptlist
            {
             before(grammarAccess.getFilterAccess().getExceptlistFilterExceptlistParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterExceptlist();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getExceptlistFilterExceptlistParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__ExceptlistAssignment_2"


    // $ANTLR start "rule__FilterDenylist__DenylistAssignment_1"
    // InternalTableDSL.g:3665:1: rule__FilterDenylist__DenylistAssignment_1 : ( ruleFilterRule ) ;
    public final void rule__FilterDenylist__DenylistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3669:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:3670:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:3670:2: ( ruleFilterRule )
            // InternalTableDSL.g:3671:3: ruleFilterRule
            {
             before(grammarAccess.getFilterDenylistAccess().getDenylistFilterRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterRule();

            state._fsp--;

             after(grammarAccess.getFilterDenylistAccess().getDenylistFilterRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__DenylistAssignment_1"


    // $ANTLR start "rule__FilterDenylist__DenylistAssignment_2_1"
    // InternalTableDSL.g:3680:1: rule__FilterDenylist__DenylistAssignment_2_1 : ( ruleFilterRule ) ;
    public final void rule__FilterDenylist__DenylistAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3684:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:3685:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:3685:2: ( ruleFilterRule )
            // InternalTableDSL.g:3686:3: ruleFilterRule
            {
             before(grammarAccess.getFilterDenylistAccess().getDenylistFilterRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterRule();

            state._fsp--;

             after(grammarAccess.getFilterDenylistAccess().getDenylistFilterRuleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__DenylistAssignment_2_1"


    // $ANTLR start "rule__FilterExceptlist__ExceptlistAssignment_1"
    // InternalTableDSL.g:3695:1: rule__FilterExceptlist__ExceptlistAssignment_1 : ( ruleFilterRule ) ;
    public final void rule__FilterExceptlist__ExceptlistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3699:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:3700:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:3700:2: ( ruleFilterRule )
            // InternalTableDSL.g:3701:3: ruleFilterRule
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptlistFilterRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterRule();

            state._fsp--;

             after(grammarAccess.getFilterExceptlistAccess().getExceptlistFilterRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__ExceptlistAssignment_1"


    // $ANTLR start "rule__FilterExceptlist__ExceptlistAssignment_2_1"
    // InternalTableDSL.g:3710:1: rule__FilterExceptlist__ExceptlistAssignment_2_1 : ( ruleFilterRule ) ;
    public final void rule__FilterExceptlist__ExceptlistAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3714:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:3715:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:3715:2: ( ruleFilterRule )
            // InternalTableDSL.g:3716:3: ruleFilterRule
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptlistFilterRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterRule();

            state._fsp--;

             after(grammarAccess.getFilterExceptlistAccess().getExceptlistFilterRuleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__ExceptlistAssignment_2_1"


    // $ANTLR start "rule__FilterColumnRule__ColumnPatternsAssignment_1"
    // InternalTableDSL.g:3725:1: rule__FilterColumnRule__ColumnPatternsAssignment_1 : ( ruleColumnName ) ;
    public final void rule__FilterColumnRule__ColumnPatternsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3729:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3730:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3730:2: ( ruleColumnName )
            // InternalTableDSL.g:3731:3: ruleColumnName
            {
             before(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsColumnNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsColumnNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__ColumnPatternsAssignment_1"


    // $ANTLR start "rule__FilterColumnRule__ColumnPatternsAssignment_2_1"
    // InternalTableDSL.g:3740:1: rule__FilterColumnRule__ColumnPatternsAssignment_2_1 : ( ruleColumnName ) ;
    public final void rule__FilterColumnRule__ColumnPatternsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3744:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3745:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3745:2: ( ruleColumnName )
            // InternalTableDSL.g:3746:3: ruleColumnName
            {
             before(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsColumnNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsColumnNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__ColumnPatternsAssignment_2_1"


    // $ANTLR start "rule__FilterObjectTypeRule__ObjectClassesAssignment_2"
    // InternalTableDSL.g:3755:1: rule__FilterObjectTypeRule__ObjectClassesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FilterObjectTypeRule__ObjectClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3759:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3760:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3760:2: ( RULE_STRING )
            // InternalTableDSL.g:3761:3: RULE_STRING
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__ObjectClassesAssignment_2"


    // $ANTLR start "rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1"
    // InternalTableDSL.g:3770:1: rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3774:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3775:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3775:2: ( RULE_STRING )
            // InternalTableDSL.g:3776:3: RULE_STRING
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1"


    // $ANTLR start "rule__ColumnName__ColumnNameAssignment"
    // InternalTableDSL.g:3785:1: rule__ColumnName__ColumnNameAssignment : ( ( rule__ColumnName__ColumnNameAlternatives_0 ) ) ;
    public final void rule__ColumnName__ColumnNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3789:1: ( ( ( rule__ColumnName__ColumnNameAlternatives_0 ) ) )
            // InternalTableDSL.g:3790:2: ( ( rule__ColumnName__ColumnNameAlternatives_0 ) )
            {
            // InternalTableDSL.g:3790:2: ( ( rule__ColumnName__ColumnNameAlternatives_0 ) )
            // InternalTableDSL.g:3791:3: ( rule__ColumnName__ColumnNameAlternatives_0 )
            {
             before(grammarAccess.getColumnNameAccess().getColumnNameAlternatives_0()); 
            // InternalTableDSL.g:3792:3: ( rule__ColumnName__ColumnNameAlternatives_0 )
            // InternalTableDSL.g:3792:4: rule__ColumnName__ColumnNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnName__ColumnNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnNameAccess().getColumnNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnName__ColumnNameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000513500000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000513500002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000020L});

}