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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'create'", "'table'", "'from'", "'load'", "','", "'output'", "'to'", "'select'", "'rename'", "'column'", "'prepend'", "'append'", "'extract'", "'sort'", "'by'", "'MAX'", "'MIN'", "'MEDIAN'", "'TOP'", "'squash'", "'rows'", "'filter'", "'deny'", "'except'", "'object'", "'of'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
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
    // InternalTableDSL.g:112:1: ruleTableAction : ( ( rule__TableAction__Alternatives ) ) ;
    public final void ruleTableAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:116:2: ( ( ( rule__TableAction__Alternatives ) ) )
            // InternalTableDSL.g:117:2: ( ( rule__TableAction__Alternatives ) )
            {
            // InternalTableDSL.g:117:2: ( ( rule__TableAction__Alternatives ) )
            // InternalTableDSL.g:118:3: ( rule__TableAction__Alternatives )
            {
             before(grammarAccess.getTableActionAccess().getAlternatives()); 
            // InternalTableDSL.g:119:3: ( rule__TableAction__Alternatives )
            // InternalTableDSL.g:119:4: rule__TableAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TableAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTableActionAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleFilterObjectTypeRule"
    // InternalTableDSL.g:578:1: entryRuleFilterObjectTypeRule : ruleFilterObjectTypeRule EOF ;
    public final void entryRuleFilterObjectTypeRule() throws RecognitionException {
        try {
            // InternalTableDSL.g:579:1: ( ruleFilterObjectTypeRule EOF )
            // InternalTableDSL.g:580:1: ruleFilterObjectTypeRule EOF
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
    // InternalTableDSL.g:587:1: ruleFilterObjectTypeRule : ( ( rule__FilterObjectTypeRule__Group__0 ) ) ;
    public final void ruleFilterObjectTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:591:2: ( ( ( rule__FilterObjectTypeRule__Group__0 ) ) )
            // InternalTableDSL.g:592:2: ( ( rule__FilterObjectTypeRule__Group__0 ) )
            {
            // InternalTableDSL.g:592:2: ( ( rule__FilterObjectTypeRule__Group__0 ) )
            // InternalTableDSL.g:593:3: ( rule__FilterObjectTypeRule__Group__0 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getGroup()); 
            // InternalTableDSL.g:594:3: ( rule__FilterObjectTypeRule__Group__0 )
            // InternalTableDSL.g:594:4: rule__FilterObjectTypeRule__Group__0
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


    // $ANTLR start "entryRuleFilterColumnRule"
    // InternalTableDSL.g:603:1: entryRuleFilterColumnRule : ruleFilterColumnRule EOF ;
    public final void entryRuleFilterColumnRule() throws RecognitionException {
        try {
            // InternalTableDSL.g:604:1: ( ruleFilterColumnRule EOF )
            // InternalTableDSL.g:605:1: ruleFilterColumnRule EOF
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
    // InternalTableDSL.g:612:1: ruleFilterColumnRule : ( ( rule__FilterColumnRule__Group__0 ) ) ;
    public final void ruleFilterColumnRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:616:2: ( ( ( rule__FilterColumnRule__Group__0 ) ) )
            // InternalTableDSL.g:617:2: ( ( rule__FilterColumnRule__Group__0 ) )
            {
            // InternalTableDSL.g:617:2: ( ( rule__FilterColumnRule__Group__0 ) )
            // InternalTableDSL.g:618:3: ( rule__FilterColumnRule__Group__0 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getGroup()); 
            // InternalTableDSL.g:619:3: ( rule__FilterColumnRule__Group__0 )
            // InternalTableDSL.g:619:4: rule__FilterColumnRule__Group__0
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


    // $ANTLR start "rule__TableAction__Alternatives"
    // InternalTableDSL.g:627:1: rule__TableAction__Alternatives : ( ( ruleLoadData ) | ( ruleOperation ) | ( ( rule__TableAction__Group_2__0 ) ) );
    public final void rule__TableAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:631:1: ( ( ruleLoadData ) | ( ruleOperation ) | ( ( rule__TableAction__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 18:
            case 19:
            case 23:
            case 30:
            case 32:
                {
                alt1=2;
                }
                break;
            case 16:
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
                    // InternalTableDSL.g:632:2: ( ruleLoadData )
                    {
                    // InternalTableDSL.g:632:2: ( ruleLoadData )
                    // InternalTableDSL.g:633:3: ruleLoadData
                    {
                     before(grammarAccess.getTableActionAccess().getLoadDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoadData();

                    state._fsp--;

                     after(grammarAccess.getTableActionAccess().getLoadDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:638:2: ( ruleOperation )
                    {
                    // InternalTableDSL.g:638:2: ( ruleOperation )
                    // InternalTableDSL.g:639:3: ruleOperation
                    {
                     before(grammarAccess.getTableActionAccess().getOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getTableActionAccess().getOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:644:2: ( ( rule__TableAction__Group_2__0 ) )
                    {
                    // InternalTableDSL.g:644:2: ( ( rule__TableAction__Group_2__0 ) )
                    // InternalTableDSL.g:645:3: ( rule__TableAction__Group_2__0 )
                    {
                     before(grammarAccess.getTableActionAccess().getGroup_2()); 
                    // InternalTableDSL.g:646:3: ( rule__TableAction__Group_2__0 )
                    // InternalTableDSL.g:646:4: rule__TableAction__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableAction__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTableActionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__TableAction__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalTableDSL.g:654:1: rule__Operation__Alternatives : ( ( ruleSelect ) | ( ruleRenameColumn ) | ( ruleExtract ) | ( ruleSquashRows ) | ( ruleFilter ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:658:1: ( ( ruleSelect ) | ( ruleRenameColumn ) | ( ruleExtract ) | ( ruleSquashRows ) | ( ruleFilter ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 32:
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
                    // InternalTableDSL.g:659:2: ( ruleSelect )
                    {
                    // InternalTableDSL.g:659:2: ( ruleSelect )
                    // InternalTableDSL.g:660:3: ruleSelect
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
                    // InternalTableDSL.g:665:2: ( ruleRenameColumn )
                    {
                    // InternalTableDSL.g:665:2: ( ruleRenameColumn )
                    // InternalTableDSL.g:666:3: ruleRenameColumn
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
                    // InternalTableDSL.g:671:2: ( ruleExtract )
                    {
                    // InternalTableDSL.g:671:2: ( ruleExtract )
                    // InternalTableDSL.g:672:3: ruleExtract
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
                    // InternalTableDSL.g:677:2: ( ruleSquashRows )
                    {
                    // InternalTableDSL.g:677:2: ( ruleSquashRows )
                    // InternalTableDSL.g:678:3: ruleSquashRows
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
                    // InternalTableDSL.g:683:2: ( ruleFilter )
                    {
                    // InternalTableDSL.g:683:2: ( ruleFilter )
                    // InternalTableDSL.g:684:3: ruleFilter
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
    // InternalTableDSL.g:693:1: rule__RenameColumnPair__Alternatives : ( ( ruleRenameColumnToPair ) | ( ruleRenameColumnAppendPair ) | ( ruleRenameColumnPrependPair ) );
    public final void rule__RenameColumnPair__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:697:1: ( ( ruleRenameColumnToPair ) | ( ruleRenameColumnAppendPair ) | ( ruleRenameColumnPrependPair ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt3=1;
                    }
                    break;
                case 21:
                    {
                    alt3=3;
                    }
                    break;
                case 22:
                    {
                    alt3=2;
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
                    // InternalTableDSL.g:698:2: ( ruleRenameColumnToPair )
                    {
                    // InternalTableDSL.g:698:2: ( ruleRenameColumnToPair )
                    // InternalTableDSL.g:699:3: ruleRenameColumnToPair
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
                    // InternalTableDSL.g:704:2: ( ruleRenameColumnAppendPair )
                    {
                    // InternalTableDSL.g:704:2: ( ruleRenameColumnAppendPair )
                    // InternalTableDSL.g:705:3: ruleRenameColumnAppendPair
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
                    // InternalTableDSL.g:710:2: ( ruleRenameColumnPrependPair )
                    {
                    // InternalTableDSL.g:710:2: ( ruleRenameColumnPrependPair )
                    // InternalTableDSL.g:711:3: ruleRenameColumnPrependPair
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
    // InternalTableDSL.g:720:1: rule__Selector__Alternatives : ( ( ( rule__Selector__Group_0__0 ) ) | ( ( rule__Selector__Group_1__0 ) ) | ( ( rule__Selector__Group_2__0 ) ) | ( ( rule__Selector__Group_3__0 ) ) );
    public final void rule__Selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:724:1: ( ( ( rule__Selector__Group_0__0 ) ) | ( ( rule__Selector__Group_1__0 ) ) | ( ( rule__Selector__Group_2__0 ) ) | ( ( rule__Selector__Group_3__0 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTableDSL.g:725:2: ( ( rule__Selector__Group_0__0 ) )
                    {
                    // InternalTableDSL.g:725:2: ( ( rule__Selector__Group_0__0 ) )
                    // InternalTableDSL.g:726:3: ( rule__Selector__Group_0__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_0()); 
                    // InternalTableDSL.g:727:3: ( rule__Selector__Group_0__0 )
                    // InternalTableDSL.g:727:4: rule__Selector__Group_0__0
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
                    // InternalTableDSL.g:731:2: ( ( rule__Selector__Group_1__0 ) )
                    {
                    // InternalTableDSL.g:731:2: ( ( rule__Selector__Group_1__0 ) )
                    // InternalTableDSL.g:732:3: ( rule__Selector__Group_1__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1()); 
                    // InternalTableDSL.g:733:3: ( rule__Selector__Group_1__0 )
                    // InternalTableDSL.g:733:4: rule__Selector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:737:2: ( ( rule__Selector__Group_2__0 ) )
                    {
                    // InternalTableDSL.g:737:2: ( ( rule__Selector__Group_2__0 ) )
                    // InternalTableDSL.g:738:3: ( rule__Selector__Group_2__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_2()); 
                    // InternalTableDSL.g:739:3: ( rule__Selector__Group_2__0 )
                    // InternalTableDSL.g:739:4: rule__Selector__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTableDSL.g:743:2: ( ( rule__Selector__Group_3__0 ) )
                    {
                    // InternalTableDSL.g:743:2: ( ( rule__Selector__Group_3__0 ) )
                    // InternalTableDSL.g:744:3: ( rule__Selector__Group_3__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_3()); 
                    // InternalTableDSL.g:745:3: ( rule__Selector__Group_3__0 )
                    // InternalTableDSL.g:745:4: rule__Selector__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_3()); 

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
    // InternalTableDSL.g:753:1: rule__FilterRule__Alternatives : ( ( ruleFilterColumnRule ) | ( ruleFilterObjectTypeRule ) );
    public final void rule__FilterRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:757:1: ( ( ruleFilterColumnRule ) | ( ruleFilterObjectTypeRule ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTableDSL.g:758:2: ( ruleFilterColumnRule )
                    {
                    // InternalTableDSL.g:758:2: ( ruleFilterColumnRule )
                    // InternalTableDSL.g:759:3: ruleFilterColumnRule
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
                    // InternalTableDSL.g:764:2: ( ruleFilterObjectTypeRule )
                    {
                    // InternalTableDSL.g:764:2: ( ruleFilterObjectTypeRule )
                    // InternalTableDSL.g:765:3: ruleFilterObjectTypeRule
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


    // $ANTLR start "rule__Start__Group__0"
    // InternalTableDSL.g:774:1: rule__Start__Group__0 : rule__Start__Group__0__Impl rule__Start__Group__1 ;
    public final void rule__Start__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:778:1: ( rule__Start__Group__0__Impl rule__Start__Group__1 )
            // InternalTableDSL.g:779:2: rule__Start__Group__0__Impl rule__Start__Group__1
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
    // InternalTableDSL.g:786:1: rule__Start__Group__0__Impl : ( ( rule__Start__ActionsAssignment_0 )? ) ;
    public final void rule__Start__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:790:1: ( ( ( rule__Start__ActionsAssignment_0 )? ) )
            // InternalTableDSL.g:791:1: ( ( rule__Start__ActionsAssignment_0 )? )
            {
            // InternalTableDSL.g:791:1: ( ( rule__Start__ActionsAssignment_0 )? )
            // InternalTableDSL.g:792:2: ( rule__Start__ActionsAssignment_0 )?
            {
             before(grammarAccess.getStartAccess().getActionsAssignment_0()); 
            // InternalTableDSL.g:793:2: ( rule__Start__ActionsAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTableDSL.g:793:3: rule__Start__ActionsAssignment_0
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
    // InternalTableDSL.g:801:1: rule__Start__Group__1 : rule__Start__Group__1__Impl ;
    public final void rule__Start__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:805:1: ( rule__Start__Group__1__Impl )
            // InternalTableDSL.g:806:2: rule__Start__Group__1__Impl
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
    // InternalTableDSL.g:812:1: rule__Start__Group__1__Impl : ( ( rule__Start__ActionsAssignment_1 )* ) ;
    public final void rule__Start__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:816:1: ( ( ( rule__Start__ActionsAssignment_1 )* ) )
            // InternalTableDSL.g:817:1: ( ( rule__Start__ActionsAssignment_1 )* )
            {
            // InternalTableDSL.g:817:1: ( ( rule__Start__ActionsAssignment_1 )* )
            // InternalTableDSL.g:818:2: ( rule__Start__ActionsAssignment_1 )*
            {
             before(grammarAccess.getStartAccess().getActionsAssignment_1()); 
            // InternalTableDSL.g:819:2: ( rule__Start__ActionsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14||LA7_0==16||(LA7_0>=18 && LA7_0<=19)||LA7_0==23||LA7_0==30||LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTableDSL.g:819:3: rule__Start__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Start__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalTableDSL.g:828:1: rule__CreateTable__Group__0 : rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1 ;
    public final void rule__CreateTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:832:1: ( rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1 )
            // InternalTableDSL.g:833:2: rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1
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
    // InternalTableDSL.g:840:1: rule__CreateTable__Group__0__Impl : ( ( 'create' )? ) ;
    public final void rule__CreateTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:844:1: ( ( ( 'create' )? ) )
            // InternalTableDSL.g:845:1: ( ( 'create' )? )
            {
            // InternalTableDSL.g:845:1: ( ( 'create' )? )
            // InternalTableDSL.g:846:2: ( 'create' )?
            {
             before(grammarAccess.getCreateTableAccess().getCreateKeyword_0()); 
            // InternalTableDSL.g:847:2: ( 'create' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTableDSL.g:847:3: 'create'
                    {
                    match(input,11,FOLLOW_2); 

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
    // InternalTableDSL.g:855:1: rule__CreateTable__Group__1 : rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2 ;
    public final void rule__CreateTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:859:1: ( rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2 )
            // InternalTableDSL.g:860:2: rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2
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
    // InternalTableDSL.g:867:1: rule__CreateTable__Group__1__Impl : ( 'table' ) ;
    public final void rule__CreateTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:871:1: ( ( 'table' ) )
            // InternalTableDSL.g:872:1: ( 'table' )
            {
            // InternalTableDSL.g:872:1: ( 'table' )
            // InternalTableDSL.g:873:2: 'table'
            {
             before(grammarAccess.getCreateTableAccess().getTableKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalTableDSL.g:882:1: rule__CreateTable__Group__2 : rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3 ;
    public final void rule__CreateTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:886:1: ( rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3 )
            // InternalTableDSL.g:887:2: rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3
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
    // InternalTableDSL.g:894:1: rule__CreateTable__Group__2__Impl : ( 'from' ) ;
    public final void rule__CreateTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:898:1: ( ( 'from' ) )
            // InternalTableDSL.g:899:1: ( 'from' )
            {
            // InternalTableDSL.g:899:1: ( 'from' )
            // InternalTableDSL.g:900:2: 'from'
            {
             before(grammarAccess.getCreateTableAccess().getFromKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalTableDSL.g:909:1: rule__CreateTable__Group__3 : rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4 ;
    public final void rule__CreateTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:913:1: ( rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4 )
            // InternalTableDSL.g:914:2: rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4
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
    // InternalTableDSL.g:921:1: rule__CreateTable__Group__3__Impl : ( ruleTableInputPath ) ;
    public final void rule__CreateTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:925:1: ( ( ruleTableInputPath ) )
            // InternalTableDSL.g:926:1: ( ruleTableInputPath )
            {
            // InternalTableDSL.g:926:1: ( ruleTableInputPath )
            // InternalTableDSL.g:927:2: ruleTableInputPath
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
    // InternalTableDSL.g:936:1: rule__CreateTable__Group__4 : rule__CreateTable__Group__4__Impl ;
    public final void rule__CreateTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:940:1: ( rule__CreateTable__Group__4__Impl )
            // InternalTableDSL.g:941:2: rule__CreateTable__Group__4__Impl
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
    // InternalTableDSL.g:947:1: rule__CreateTable__Group__4__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__CreateTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:951:1: ( ( RULE_ANY_OTHER ) )
            // InternalTableDSL.g:952:1: ( RULE_ANY_OTHER )
            {
            // InternalTableDSL.g:952:1: ( RULE_ANY_OTHER )
            // InternalTableDSL.g:953:2: RULE_ANY_OTHER
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


    // $ANTLR start "rule__TableAction__Group_2__0"
    // InternalTableDSL.g:963:1: rule__TableAction__Group_2__0 : rule__TableAction__Group_2__0__Impl rule__TableAction__Group_2__1 ;
    public final void rule__TableAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:967:1: ( rule__TableAction__Group_2__0__Impl rule__TableAction__Group_2__1 )
            // InternalTableDSL.g:968:2: rule__TableAction__Group_2__0__Impl rule__TableAction__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__TableAction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableAction__Group_2__1();

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
    // $ANTLR end "rule__TableAction__Group_2__0"


    // $ANTLR start "rule__TableAction__Group_2__0__Impl"
    // InternalTableDSL.g:975:1: rule__TableAction__Group_2__0__Impl : ( ruleOutput ) ;
    public final void rule__TableAction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:979:1: ( ( ruleOutput ) )
            // InternalTableDSL.g:980:1: ( ruleOutput )
            {
            // InternalTableDSL.g:980:1: ( ruleOutput )
            // InternalTableDSL.g:981:2: ruleOutput
            {
             before(grammarAccess.getTableActionAccess().getOutputParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getTableActionAccess().getOutputParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TableAction__Group_2__0__Impl"


    // $ANTLR start "rule__TableAction__Group_2__1"
    // InternalTableDSL.g:990:1: rule__TableAction__Group_2__1 : rule__TableAction__Group_2__1__Impl ;
    public final void rule__TableAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:994:1: ( rule__TableAction__Group_2__1__Impl )
            // InternalTableDSL.g:995:2: rule__TableAction__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableAction__Group_2__1__Impl();

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
    // $ANTLR end "rule__TableAction__Group_2__1"


    // $ANTLR start "rule__TableAction__Group_2__1__Impl"
    // InternalTableDSL.g:1001:1: rule__TableAction__Group_2__1__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__TableAction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1005:1: ( ( RULE_ANY_OTHER ) )
            // InternalTableDSL.g:1006:1: ( RULE_ANY_OTHER )
            {
            // InternalTableDSL.g:1006:1: ( RULE_ANY_OTHER )
            // InternalTableDSL.g:1007:2: RULE_ANY_OTHER
            {
             before(grammarAccess.getTableActionAccess().getANY_OTHERTerminalRuleCall_2_1()); 
            match(input,RULE_ANY_OTHER,FOLLOW_2); 
             after(grammarAccess.getTableActionAccess().getANY_OTHERTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__TableAction__Group_2__1__Impl"


    // $ANTLR start "rule__LoadData__Group__0"
    // InternalTableDSL.g:1017:1: rule__LoadData__Group__0 : rule__LoadData__Group__0__Impl rule__LoadData__Group__1 ;
    public final void rule__LoadData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1021:1: ( rule__LoadData__Group__0__Impl rule__LoadData__Group__1 )
            // InternalTableDSL.g:1022:2: rule__LoadData__Group__0__Impl rule__LoadData__Group__1
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
    // InternalTableDSL.g:1029:1: rule__LoadData__Group__0__Impl : ( 'load' ) ;
    public final void rule__LoadData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1033:1: ( ( 'load' ) )
            // InternalTableDSL.g:1034:1: ( 'load' )
            {
            // InternalTableDSL.g:1034:1: ( 'load' )
            // InternalTableDSL.g:1035:2: 'load'
            {
             before(grammarAccess.getLoadDataAccess().getLoadKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalTableDSL.g:1044:1: rule__LoadData__Group__1 : rule__LoadData__Group__1__Impl ;
    public final void rule__LoadData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1048:1: ( rule__LoadData__Group__1__Impl )
            // InternalTableDSL.g:1049:2: rule__LoadData__Group__1__Impl
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
    // InternalTableDSL.g:1055:1: rule__LoadData__Group__1__Impl : ( ruleTableInputPath ) ;
    public final void rule__LoadData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1059:1: ( ( ruleTableInputPath ) )
            // InternalTableDSL.g:1060:1: ( ruleTableInputPath )
            {
            // InternalTableDSL.g:1060:1: ( ruleTableInputPath )
            // InternalTableDSL.g:1061:2: ruleTableInputPath
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
    // InternalTableDSL.g:1071:1: rule__TableInputPath__Group__0 : rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1 ;
    public final void rule__TableInputPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1075:1: ( rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1 )
            // InternalTableDSL.g:1076:2: rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1
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
    // InternalTableDSL.g:1083:1: rule__TableInputPath__Group__0__Impl : ( ( rule__TableInputPath__PathPatternsAssignment_0 ) ) ;
    public final void rule__TableInputPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1087:1: ( ( ( rule__TableInputPath__PathPatternsAssignment_0 ) ) )
            // InternalTableDSL.g:1088:1: ( ( rule__TableInputPath__PathPatternsAssignment_0 ) )
            {
            // InternalTableDSL.g:1088:1: ( ( rule__TableInputPath__PathPatternsAssignment_0 ) )
            // InternalTableDSL.g:1089:2: ( rule__TableInputPath__PathPatternsAssignment_0 )
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_0()); 
            // InternalTableDSL.g:1090:2: ( rule__TableInputPath__PathPatternsAssignment_0 )
            // InternalTableDSL.g:1090:3: rule__TableInputPath__PathPatternsAssignment_0
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
    // InternalTableDSL.g:1098:1: rule__TableInputPath__Group__1 : rule__TableInputPath__Group__1__Impl ;
    public final void rule__TableInputPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1102:1: ( rule__TableInputPath__Group__1__Impl )
            // InternalTableDSL.g:1103:2: rule__TableInputPath__Group__1__Impl
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
    // InternalTableDSL.g:1109:1: rule__TableInputPath__Group__1__Impl : ( ( rule__TableInputPath__Group_1__0 )* ) ;
    public final void rule__TableInputPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1113:1: ( ( ( rule__TableInputPath__Group_1__0 )* ) )
            // InternalTableDSL.g:1114:1: ( ( rule__TableInputPath__Group_1__0 )* )
            {
            // InternalTableDSL.g:1114:1: ( ( rule__TableInputPath__Group_1__0 )* )
            // InternalTableDSL.g:1115:2: ( rule__TableInputPath__Group_1__0 )*
            {
             before(grammarAccess.getTableInputPathAccess().getGroup_1()); 
            // InternalTableDSL.g:1116:2: ( rule__TableInputPath__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTableDSL.g:1116:3: rule__TableInputPath__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TableInputPath__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalTableDSL.g:1125:1: rule__TableInputPath__Group_1__0 : rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1 ;
    public final void rule__TableInputPath__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1129:1: ( rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1 )
            // InternalTableDSL.g:1130:2: rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1
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
    // InternalTableDSL.g:1137:1: rule__TableInputPath__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TableInputPath__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1141:1: ( ( ',' ) )
            // InternalTableDSL.g:1142:1: ( ',' )
            {
            // InternalTableDSL.g:1142:1: ( ',' )
            // InternalTableDSL.g:1143:2: ','
            {
             before(grammarAccess.getTableInputPathAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTableDSL.g:1152:1: rule__TableInputPath__Group_1__1 : rule__TableInputPath__Group_1__1__Impl ;
    public final void rule__TableInputPath__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1156:1: ( rule__TableInputPath__Group_1__1__Impl )
            // InternalTableDSL.g:1157:2: rule__TableInputPath__Group_1__1__Impl
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
    // InternalTableDSL.g:1163:1: rule__TableInputPath__Group_1__1__Impl : ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) ) ;
    public final void rule__TableInputPath__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1167:1: ( ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) ) )
            // InternalTableDSL.g:1168:1: ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) )
            {
            // InternalTableDSL.g:1168:1: ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) )
            // InternalTableDSL.g:1169:2: ( rule__TableInputPath__PathPatternsAssignment_1_1 )
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_1_1()); 
            // InternalTableDSL.g:1170:2: ( rule__TableInputPath__PathPatternsAssignment_1_1 )
            // InternalTableDSL.g:1170:3: rule__TableInputPath__PathPatternsAssignment_1_1
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
    // InternalTableDSL.g:1179:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1183:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalTableDSL.g:1184:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalTableDSL.g:1191:1: rule__Output__Group__0__Impl : ( 'output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1195:1: ( ( 'output' ) )
            // InternalTableDSL.g:1196:1: ( 'output' )
            {
            // InternalTableDSL.g:1196:1: ( 'output' )
            // InternalTableDSL.g:1197:2: 'output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTableDSL.g:1206:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1210:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalTableDSL.g:1211:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalTableDSL.g:1218:1: rule__Output__Group__1__Impl : ( 'to' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1222:1: ( ( 'to' ) )
            // InternalTableDSL.g:1223:1: ( 'to' )
            {
            // InternalTableDSL.g:1223:1: ( 'to' )
            // InternalTableDSL.g:1224:2: 'to'
            {
             before(grammarAccess.getOutputAccess().getToKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTableDSL.g:1233:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1237:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalTableDSL.g:1238:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalTableDSL.g:1245:1: rule__Output__Group__2__Impl : ( ( rule__Output__OutputPathsAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1249:1: ( ( ( rule__Output__OutputPathsAssignment_2 ) ) )
            // InternalTableDSL.g:1250:1: ( ( rule__Output__OutputPathsAssignment_2 ) )
            {
            // InternalTableDSL.g:1250:1: ( ( rule__Output__OutputPathsAssignment_2 ) )
            // InternalTableDSL.g:1251:2: ( rule__Output__OutputPathsAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getOutputPathsAssignment_2()); 
            // InternalTableDSL.g:1252:2: ( rule__Output__OutputPathsAssignment_2 )
            // InternalTableDSL.g:1252:3: rule__Output__OutputPathsAssignment_2
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
    // InternalTableDSL.g:1260:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1264:1: ( rule__Output__Group__3__Impl )
            // InternalTableDSL.g:1265:2: rule__Output__Group__3__Impl
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
    // InternalTableDSL.g:1271:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )* ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1275:1: ( ( ( rule__Output__Group_3__0 )* ) )
            // InternalTableDSL.g:1276:1: ( ( rule__Output__Group_3__0 )* )
            {
            // InternalTableDSL.g:1276:1: ( ( rule__Output__Group_3__0 )* )
            // InternalTableDSL.g:1277:2: ( rule__Output__Group_3__0 )*
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalTableDSL.g:1278:2: ( rule__Output__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTableDSL.g:1278:3: rule__Output__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Output__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalTableDSL.g:1287:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1291:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalTableDSL.g:1292:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
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
    // InternalTableDSL.g:1299:1: rule__Output__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1303:1: ( ( ',' ) )
            // InternalTableDSL.g:1304:1: ( ',' )
            {
            // InternalTableDSL.g:1304:1: ( ',' )
            // InternalTableDSL.g:1305:2: ','
            {
             before(grammarAccess.getOutputAccess().getCommaKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTableDSL.g:1314:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1318:1: ( rule__Output__Group_3__1__Impl )
            // InternalTableDSL.g:1319:2: rule__Output__Group_3__1__Impl
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
    // InternalTableDSL.g:1325:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__OutputPathsAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1329:1: ( ( ( rule__Output__OutputPathsAssignment_3_1 ) ) )
            // InternalTableDSL.g:1330:1: ( ( rule__Output__OutputPathsAssignment_3_1 ) )
            {
            // InternalTableDSL.g:1330:1: ( ( rule__Output__OutputPathsAssignment_3_1 ) )
            // InternalTableDSL.g:1331:2: ( rule__Output__OutputPathsAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getOutputPathsAssignment_3_1()); 
            // InternalTableDSL.g:1332:2: ( rule__Output__OutputPathsAssignment_3_1 )
            // InternalTableDSL.g:1332:3: rule__Output__OutputPathsAssignment_3_1
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
    // InternalTableDSL.g:1341:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1345:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalTableDSL.g:1346:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTableDSL.g:1353:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1357:1: ( ( 'select' ) )
            // InternalTableDSL.g:1358:1: ( 'select' )
            {
            // InternalTableDSL.g:1358:1: ( 'select' )
            // InternalTableDSL.g:1359:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalTableDSL.g:1368:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1372:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalTableDSL.g:1373:2: rule__Select__Group__1__Impl rule__Select__Group__2
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
    // InternalTableDSL.g:1380:1: rule__Select__Group__1__Impl : ( ( rule__Select__ColumnsPatternsAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1384:1: ( ( ( rule__Select__ColumnsPatternsAssignment_1 ) ) )
            // InternalTableDSL.g:1385:1: ( ( rule__Select__ColumnsPatternsAssignment_1 ) )
            {
            // InternalTableDSL.g:1385:1: ( ( rule__Select__ColumnsPatternsAssignment_1 ) )
            // InternalTableDSL.g:1386:2: ( rule__Select__ColumnsPatternsAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getColumnsPatternsAssignment_1()); 
            // InternalTableDSL.g:1387:2: ( rule__Select__ColumnsPatternsAssignment_1 )
            // InternalTableDSL.g:1387:3: rule__Select__ColumnsPatternsAssignment_1
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
    // InternalTableDSL.g:1395:1: rule__Select__Group__2 : rule__Select__Group__2__Impl ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1399:1: ( rule__Select__Group__2__Impl )
            // InternalTableDSL.g:1400:2: rule__Select__Group__2__Impl
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
    // InternalTableDSL.g:1406:1: rule__Select__Group__2__Impl : ( ( rule__Select__Group_2__0 )* ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1410:1: ( ( ( rule__Select__Group_2__0 )* ) )
            // InternalTableDSL.g:1411:1: ( ( rule__Select__Group_2__0 )* )
            {
            // InternalTableDSL.g:1411:1: ( ( rule__Select__Group_2__0 )* )
            // InternalTableDSL.g:1412:2: ( rule__Select__Group_2__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_2()); 
            // InternalTableDSL.g:1413:2: ( rule__Select__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTableDSL.g:1413:3: rule__Select__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Select__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalTableDSL.g:1422:1: rule__Select__Group_2__0 : rule__Select__Group_2__0__Impl rule__Select__Group_2__1 ;
    public final void rule__Select__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1426:1: ( rule__Select__Group_2__0__Impl rule__Select__Group_2__1 )
            // InternalTableDSL.g:1427:2: rule__Select__Group_2__0__Impl rule__Select__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTableDSL.g:1434:1: rule__Select__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1438:1: ( ( ',' ) )
            // InternalTableDSL.g:1439:1: ( ',' )
            {
            // InternalTableDSL.g:1439:1: ( ',' )
            // InternalTableDSL.g:1440:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTableDSL.g:1449:1: rule__Select__Group_2__1 : rule__Select__Group_2__1__Impl ;
    public final void rule__Select__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1453:1: ( rule__Select__Group_2__1__Impl )
            // InternalTableDSL.g:1454:2: rule__Select__Group_2__1__Impl
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
    // InternalTableDSL.g:1460:1: rule__Select__Group_2__1__Impl : ( ( rule__Select__ColumnPatternsAssignment_2_1 ) ) ;
    public final void rule__Select__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1464:1: ( ( ( rule__Select__ColumnPatternsAssignment_2_1 ) ) )
            // InternalTableDSL.g:1465:1: ( ( rule__Select__ColumnPatternsAssignment_2_1 ) )
            {
            // InternalTableDSL.g:1465:1: ( ( rule__Select__ColumnPatternsAssignment_2_1 ) )
            // InternalTableDSL.g:1466:2: ( rule__Select__ColumnPatternsAssignment_2_1 )
            {
             before(grammarAccess.getSelectAccess().getColumnPatternsAssignment_2_1()); 
            // InternalTableDSL.g:1467:2: ( rule__Select__ColumnPatternsAssignment_2_1 )
            // InternalTableDSL.g:1467:3: rule__Select__ColumnPatternsAssignment_2_1
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
    // InternalTableDSL.g:1476:1: rule__RenameColumn__Group__0 : rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1 ;
    public final void rule__RenameColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1480:1: ( rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1 )
            // InternalTableDSL.g:1481:2: rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalTableDSL.g:1488:1: rule__RenameColumn__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1492:1: ( ( 'rename' ) )
            // InternalTableDSL.g:1493:1: ( 'rename' )
            {
            // InternalTableDSL.g:1493:1: ( 'rename' )
            // InternalTableDSL.g:1494:2: 'rename'
            {
             before(grammarAccess.getRenameColumnAccess().getRenameKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTableDSL.g:1503:1: rule__RenameColumn__Group__1 : rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2 ;
    public final void rule__RenameColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1507:1: ( rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2 )
            // InternalTableDSL.g:1508:2: rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTableDSL.g:1515:1: rule__RenameColumn__Group__1__Impl : ( ( 'column' )? ) ;
    public final void rule__RenameColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1519:1: ( ( ( 'column' )? ) )
            // InternalTableDSL.g:1520:1: ( ( 'column' )? )
            {
            // InternalTableDSL.g:1520:1: ( ( 'column' )? )
            // InternalTableDSL.g:1521:2: ( 'column' )?
            {
             before(grammarAccess.getRenameColumnAccess().getColumnKeyword_1()); 
            // InternalTableDSL.g:1522:2: ( 'column' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTableDSL.g:1522:3: 'column'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalTableDSL.g:1530:1: rule__RenameColumn__Group__2 : rule__RenameColumn__Group__2__Impl ;
    public final void rule__RenameColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1534:1: ( rule__RenameColumn__Group__2__Impl )
            // InternalTableDSL.g:1535:2: rule__RenameColumn__Group__2__Impl
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
    // InternalTableDSL.g:1541:1: rule__RenameColumn__Group__2__Impl : ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) ) ;
    public final void rule__RenameColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1545:1: ( ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) ) )
            // InternalTableDSL.g:1546:1: ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) )
            {
            // InternalTableDSL.g:1546:1: ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) )
            // InternalTableDSL.g:1547:2: ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* )
            {
            // InternalTableDSL.g:1547:2: ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) )
            // InternalTableDSL.g:1548:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )
            {
             before(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 
            // InternalTableDSL.g:1549:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )
            // InternalTableDSL.g:1549:4: rule__RenameColumn__RenameTuplesAssignment_2
            {
            pushFollow(FOLLOW_13);
            rule__RenameColumn__RenameTuplesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 

            }

            // InternalTableDSL.g:1552:2: ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* )
            // InternalTableDSL.g:1553:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )*
            {
             before(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 
            // InternalTableDSL.g:1554:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTableDSL.g:1554:4: rule__RenameColumn__RenameTuplesAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RenameColumn__RenameTuplesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalTableDSL.g:1564:1: rule__RenameColumnToPair__Group__0 : rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1 ;
    public final void rule__RenameColumnToPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1568:1: ( rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1 )
            // InternalTableDSL.g:1569:2: rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1
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
    // InternalTableDSL.g:1576:1: rule__RenameColumnToPair__Group__0__Impl : ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnToPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1580:1: ( ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:1581:1: ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:1581:1: ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:1582:2: ( rule__RenameColumnToPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnToPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:1583:2: ( rule__RenameColumnToPair__OldNameAssignment_0 )
            // InternalTableDSL.g:1583:3: rule__RenameColumnToPair__OldNameAssignment_0
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
    // InternalTableDSL.g:1591:1: rule__RenameColumnToPair__Group__1 : rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2 ;
    public final void rule__RenameColumnToPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1595:1: ( rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2 )
            // InternalTableDSL.g:1596:2: rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2
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
    // InternalTableDSL.g:1603:1: rule__RenameColumnToPair__Group__1__Impl : ( 'to' ) ;
    public final void rule__RenameColumnToPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1607:1: ( ( 'to' ) )
            // InternalTableDSL.g:1608:1: ( 'to' )
            {
            // InternalTableDSL.g:1608:1: ( 'to' )
            // InternalTableDSL.g:1609:2: 'to'
            {
             before(grammarAccess.getRenameColumnToPairAccess().getToKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTableDSL.g:1618:1: rule__RenameColumnToPair__Group__2 : rule__RenameColumnToPair__Group__2__Impl ;
    public final void rule__RenameColumnToPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1622:1: ( rule__RenameColumnToPair__Group__2__Impl )
            // InternalTableDSL.g:1623:2: rule__RenameColumnToPair__Group__2__Impl
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
    // InternalTableDSL.g:1629:1: rule__RenameColumnToPair__Group__2__Impl : ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) ) ;
    public final void rule__RenameColumnToPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1633:1: ( ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) ) )
            // InternalTableDSL.g:1634:1: ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) )
            {
            // InternalTableDSL.g:1634:1: ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) )
            // InternalTableDSL.g:1635:2: ( rule__RenameColumnToPair__NewNameAssignment_2 )
            {
             before(grammarAccess.getRenameColumnToPairAccess().getNewNameAssignment_2()); 
            // InternalTableDSL.g:1636:2: ( rule__RenameColumnToPair__NewNameAssignment_2 )
            // InternalTableDSL.g:1636:3: rule__RenameColumnToPair__NewNameAssignment_2
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
    // InternalTableDSL.g:1645:1: rule__RenameColumnPrependPair__Group__0 : rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1 ;
    public final void rule__RenameColumnPrependPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1649:1: ( rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1 )
            // InternalTableDSL.g:1650:2: rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalTableDSL.g:1657:1: rule__RenameColumnPrependPair__Group__0__Impl : ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnPrependPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1661:1: ( ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:1662:1: ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:1662:1: ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:1663:2: ( rule__RenameColumnPrependPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:1664:2: ( rule__RenameColumnPrependPair__OldNameAssignment_0 )
            // InternalTableDSL.g:1664:3: rule__RenameColumnPrependPair__OldNameAssignment_0
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
    // InternalTableDSL.g:1672:1: rule__RenameColumnPrependPair__Group__1 : rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2 ;
    public final void rule__RenameColumnPrependPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1676:1: ( rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2 )
            // InternalTableDSL.g:1677:2: rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2
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
    // InternalTableDSL.g:1684:1: rule__RenameColumnPrependPair__Group__1__Impl : ( 'prepend' ) ;
    public final void rule__RenameColumnPrependPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1688:1: ( ( 'prepend' ) )
            // InternalTableDSL.g:1689:1: ( 'prepend' )
            {
            // InternalTableDSL.g:1689:1: ( 'prepend' )
            // InternalTableDSL.g:1690:2: 'prepend'
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getPrependKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalTableDSL.g:1699:1: rule__RenameColumnPrependPair__Group__2 : rule__RenameColumnPrependPair__Group__2__Impl ;
    public final void rule__RenameColumnPrependPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1703:1: ( rule__RenameColumnPrependPair__Group__2__Impl )
            // InternalTableDSL.g:1704:2: rule__RenameColumnPrependPair__Group__2__Impl
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
    // InternalTableDSL.g:1710:1: rule__RenameColumnPrependPair__Group__2__Impl : ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) ) ;
    public final void rule__RenameColumnPrependPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1714:1: ( ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) ) )
            // InternalTableDSL.g:1715:1: ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) )
            {
            // InternalTableDSL.g:1715:1: ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) )
            // InternalTableDSL.g:1716:2: ( rule__RenameColumnPrependPair__PrefixAssignment_2 )
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getPrefixAssignment_2()); 
            // InternalTableDSL.g:1717:2: ( rule__RenameColumnPrependPair__PrefixAssignment_2 )
            // InternalTableDSL.g:1717:3: rule__RenameColumnPrependPair__PrefixAssignment_2
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
    // InternalTableDSL.g:1726:1: rule__RenameColumnAppendPair__Group__0 : rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1 ;
    public final void rule__RenameColumnAppendPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1730:1: ( rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1 )
            // InternalTableDSL.g:1731:2: rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalTableDSL.g:1738:1: rule__RenameColumnAppendPair__Group__0__Impl : ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnAppendPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1742:1: ( ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:1743:1: ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:1743:1: ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:1744:2: ( rule__RenameColumnAppendPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:1745:2: ( rule__RenameColumnAppendPair__OldNameAssignment_0 )
            // InternalTableDSL.g:1745:3: rule__RenameColumnAppendPair__OldNameAssignment_0
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
    // InternalTableDSL.g:1753:1: rule__RenameColumnAppendPair__Group__1 : rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2 ;
    public final void rule__RenameColumnAppendPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1757:1: ( rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2 )
            // InternalTableDSL.g:1758:2: rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2
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
    // InternalTableDSL.g:1765:1: rule__RenameColumnAppendPair__Group__1__Impl : ( 'append' ) ;
    public final void rule__RenameColumnAppendPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1769:1: ( ( 'append' ) )
            // InternalTableDSL.g:1770:1: ( 'append' )
            {
            // InternalTableDSL.g:1770:1: ( 'append' )
            // InternalTableDSL.g:1771:2: 'append'
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getAppendKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:1780:1: rule__RenameColumnAppendPair__Group__2 : rule__RenameColumnAppendPair__Group__2__Impl ;
    public final void rule__RenameColumnAppendPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1784:1: ( rule__RenameColumnAppendPair__Group__2__Impl )
            // InternalTableDSL.g:1785:2: rule__RenameColumnAppendPair__Group__2__Impl
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
    // InternalTableDSL.g:1791:1: rule__RenameColumnAppendPair__Group__2__Impl : ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) ) ;
    public final void rule__RenameColumnAppendPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1795:1: ( ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) ) )
            // InternalTableDSL.g:1796:1: ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) )
            {
            // InternalTableDSL.g:1796:1: ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) )
            // InternalTableDSL.g:1797:2: ( rule__RenameColumnAppendPair__SuffixAssignment_2 )
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getSuffixAssignment_2()); 
            // InternalTableDSL.g:1798:2: ( rule__RenameColumnAppendPair__SuffixAssignment_2 )
            // InternalTableDSL.g:1798:3: rule__RenameColumnAppendPair__SuffixAssignment_2
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
    // InternalTableDSL.g:1807:1: rule__Extract__Group__0 : rule__Extract__Group__0__Impl rule__Extract__Group__1 ;
    public final void rule__Extract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1811:1: ( rule__Extract__Group__0__Impl rule__Extract__Group__1 )
            // InternalTableDSL.g:1812:2: rule__Extract__Group__0__Impl rule__Extract__Group__1
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
    // InternalTableDSL.g:1819:1: rule__Extract__Group__0__Impl : ( 'extract' ) ;
    public final void rule__Extract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1823:1: ( ( 'extract' ) )
            // InternalTableDSL.g:1824:1: ( 'extract' )
            {
            // InternalTableDSL.g:1824:1: ( 'extract' )
            // InternalTableDSL.g:1825:2: 'extract'
            {
             before(grammarAccess.getExtractAccess().getExtractKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalTableDSL.g:1834:1: rule__Extract__Group__1 : rule__Extract__Group__1__Impl rule__Extract__Group__2 ;
    public final void rule__Extract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1838:1: ( rule__Extract__Group__1__Impl rule__Extract__Group__2 )
            // InternalTableDSL.g:1839:2: rule__Extract__Group__1__Impl rule__Extract__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalTableDSL.g:1846:1: rule__Extract__Group__1__Impl : ( ( rule__Extract__TargetColumnsAssignment_1 ) ) ;
    public final void rule__Extract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1850:1: ( ( ( rule__Extract__TargetColumnsAssignment_1 ) ) )
            // InternalTableDSL.g:1851:1: ( ( rule__Extract__TargetColumnsAssignment_1 ) )
            {
            // InternalTableDSL.g:1851:1: ( ( rule__Extract__TargetColumnsAssignment_1 ) )
            // InternalTableDSL.g:1852:2: ( rule__Extract__TargetColumnsAssignment_1 )
            {
             before(grammarAccess.getExtractAccess().getTargetColumnsAssignment_1()); 
            // InternalTableDSL.g:1853:2: ( rule__Extract__TargetColumnsAssignment_1 )
            // InternalTableDSL.g:1853:3: rule__Extract__TargetColumnsAssignment_1
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
    // InternalTableDSL.g:1861:1: rule__Extract__Group__2 : rule__Extract__Group__2__Impl rule__Extract__Group__3 ;
    public final void rule__Extract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1865:1: ( rule__Extract__Group__2__Impl rule__Extract__Group__3 )
            // InternalTableDSL.g:1866:2: rule__Extract__Group__2__Impl rule__Extract__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTableDSL.g:1873:1: rule__Extract__Group__2__Impl : ( ( rule__Extract__Group_2__0 )* ) ;
    public final void rule__Extract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1877:1: ( ( ( rule__Extract__Group_2__0 )* ) )
            // InternalTableDSL.g:1878:1: ( ( rule__Extract__Group_2__0 )* )
            {
            // InternalTableDSL.g:1878:1: ( ( rule__Extract__Group_2__0 )* )
            // InternalTableDSL.g:1879:2: ( rule__Extract__Group_2__0 )*
            {
             before(grammarAccess.getExtractAccess().getGroup_2()); 
            // InternalTableDSL.g:1880:2: ( rule__Extract__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTableDSL.g:1880:3: rule__Extract__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Extract__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalTableDSL.g:1888:1: rule__Extract__Group__3 : rule__Extract__Group__3__Impl rule__Extract__Group__4 ;
    public final void rule__Extract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1892:1: ( rule__Extract__Group__3__Impl rule__Extract__Group__4 )
            // InternalTableDSL.g:1893:2: rule__Extract__Group__3__Impl rule__Extract__Group__4
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
    // InternalTableDSL.g:1900:1: rule__Extract__Group__3__Impl : ( 'from' ) ;
    public final void rule__Extract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1904:1: ( ( 'from' ) )
            // InternalTableDSL.g:1905:1: ( 'from' )
            {
            // InternalTableDSL.g:1905:1: ( 'from' )
            // InternalTableDSL.g:1906:2: 'from'
            {
             before(grammarAccess.getExtractAccess().getFromKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalTableDSL.g:1915:1: rule__Extract__Group__4 : rule__Extract__Group__4__Impl rule__Extract__Group__5 ;
    public final void rule__Extract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1919:1: ( rule__Extract__Group__4__Impl rule__Extract__Group__5 )
            // InternalTableDSL.g:1920:2: rule__Extract__Group__4__Impl rule__Extract__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalTableDSL.g:1927:1: rule__Extract__Group__4__Impl : ( ( rule__Extract__SourceColumnAssignment_4 ) ) ;
    public final void rule__Extract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1931:1: ( ( ( rule__Extract__SourceColumnAssignment_4 ) ) )
            // InternalTableDSL.g:1932:1: ( ( rule__Extract__SourceColumnAssignment_4 ) )
            {
            // InternalTableDSL.g:1932:1: ( ( rule__Extract__SourceColumnAssignment_4 ) )
            // InternalTableDSL.g:1933:2: ( rule__Extract__SourceColumnAssignment_4 )
            {
             before(grammarAccess.getExtractAccess().getSourceColumnAssignment_4()); 
            // InternalTableDSL.g:1934:2: ( rule__Extract__SourceColumnAssignment_4 )
            // InternalTableDSL.g:1934:3: rule__Extract__SourceColumnAssignment_4
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
    // InternalTableDSL.g:1942:1: rule__Extract__Group__5 : rule__Extract__Group__5__Impl rule__Extract__Group__6 ;
    public final void rule__Extract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1946:1: ( rule__Extract__Group__5__Impl rule__Extract__Group__6 )
            // InternalTableDSL.g:1947:2: rule__Extract__Group__5__Impl rule__Extract__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalTableDSL.g:1954:1: rule__Extract__Group__5__Impl : ( 'select' ) ;
    public final void rule__Extract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1958:1: ( ( 'select' ) )
            // InternalTableDSL.g:1959:1: ( 'select' )
            {
            // InternalTableDSL.g:1959:1: ( 'select' )
            // InternalTableDSL.g:1960:2: 'select'
            {
             before(grammarAccess.getExtractAccess().getSelectKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalTableDSL.g:1969:1: rule__Extract__Group__6 : rule__Extract__Group__6__Impl rule__Extract__Group__7 ;
    public final void rule__Extract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1973:1: ( rule__Extract__Group__6__Impl rule__Extract__Group__7 )
            // InternalTableDSL.g:1974:2: rule__Extract__Group__6__Impl rule__Extract__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalTableDSL.g:1981:1: rule__Extract__Group__6__Impl : ( ( rule__Extract__SelectorAssignment_6 ) ) ;
    public final void rule__Extract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1985:1: ( ( ( rule__Extract__SelectorAssignment_6 ) ) )
            // InternalTableDSL.g:1986:1: ( ( rule__Extract__SelectorAssignment_6 ) )
            {
            // InternalTableDSL.g:1986:1: ( ( rule__Extract__SelectorAssignment_6 ) )
            // InternalTableDSL.g:1987:2: ( rule__Extract__SelectorAssignment_6 )
            {
             before(grammarAccess.getExtractAccess().getSelectorAssignment_6()); 
            // InternalTableDSL.g:1988:2: ( rule__Extract__SelectorAssignment_6 )
            // InternalTableDSL.g:1988:3: rule__Extract__SelectorAssignment_6
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
    // InternalTableDSL.g:1996:1: rule__Extract__Group__7 : rule__Extract__Group__7__Impl rule__Extract__Group__8 ;
    public final void rule__Extract__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2000:1: ( rule__Extract__Group__7__Impl rule__Extract__Group__8 )
            // InternalTableDSL.g:2001:2: rule__Extract__Group__7__Impl rule__Extract__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalTableDSL.g:2008:1: rule__Extract__Group__7__Impl : ( 'sort' ) ;
    public final void rule__Extract__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2012:1: ( ( 'sort' ) )
            // InternalTableDSL.g:2013:1: ( 'sort' )
            {
            // InternalTableDSL.g:2013:1: ( 'sort' )
            // InternalTableDSL.g:2014:2: 'sort'
            {
             before(grammarAccess.getExtractAccess().getSortKeyword_7()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTableDSL.g:2023:1: rule__Extract__Group__8 : rule__Extract__Group__8__Impl rule__Extract__Group__9 ;
    public final void rule__Extract__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2027:1: ( rule__Extract__Group__8__Impl rule__Extract__Group__9 )
            // InternalTableDSL.g:2028:2: rule__Extract__Group__8__Impl rule__Extract__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalTableDSL.g:2035:1: rule__Extract__Group__8__Impl : ( ( 'by' )? ) ;
    public final void rule__Extract__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2039:1: ( ( ( 'by' )? ) )
            // InternalTableDSL.g:2040:1: ( ( 'by' )? )
            {
            // InternalTableDSL.g:2040:1: ( ( 'by' )? )
            // InternalTableDSL.g:2041:2: ( 'by' )?
            {
             before(grammarAccess.getExtractAccess().getByKeyword_8()); 
            // InternalTableDSL.g:2042:2: ( 'by' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTableDSL.g:2042:3: 'by'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalTableDSL.g:2050:1: rule__Extract__Group__9 : rule__Extract__Group__9__Impl ;
    public final void rule__Extract__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2054:1: ( rule__Extract__Group__9__Impl )
            // InternalTableDSL.g:2055:2: rule__Extract__Group__9__Impl
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
    // InternalTableDSL.g:2061:1: rule__Extract__Group__9__Impl : ( ( rule__Extract__ComparatorAssignment_9 ) ) ;
    public final void rule__Extract__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2065:1: ( ( ( rule__Extract__ComparatorAssignment_9 ) ) )
            // InternalTableDSL.g:2066:1: ( ( rule__Extract__ComparatorAssignment_9 ) )
            {
            // InternalTableDSL.g:2066:1: ( ( rule__Extract__ComparatorAssignment_9 ) )
            // InternalTableDSL.g:2067:2: ( rule__Extract__ComparatorAssignment_9 )
            {
             before(grammarAccess.getExtractAccess().getComparatorAssignment_9()); 
            // InternalTableDSL.g:2068:2: ( rule__Extract__ComparatorAssignment_9 )
            // InternalTableDSL.g:2068:3: rule__Extract__ComparatorAssignment_9
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
    // InternalTableDSL.g:2077:1: rule__Extract__Group_2__0 : rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1 ;
    public final void rule__Extract__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2081:1: ( rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1 )
            // InternalTableDSL.g:2082:2: rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1
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
    // InternalTableDSL.g:2089:1: rule__Extract__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Extract__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2093:1: ( ( ',' ) )
            // InternalTableDSL.g:2094:1: ( ',' )
            {
            // InternalTableDSL.g:2094:1: ( ',' )
            // InternalTableDSL.g:2095:2: ','
            {
             before(grammarAccess.getExtractAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTableDSL.g:2104:1: rule__Extract__Group_2__1 : rule__Extract__Group_2__1__Impl ;
    public final void rule__Extract__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2108:1: ( rule__Extract__Group_2__1__Impl )
            // InternalTableDSL.g:2109:2: rule__Extract__Group_2__1__Impl
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
    // InternalTableDSL.g:2115:1: rule__Extract__Group_2__1__Impl : ( ( rule__Extract__TargetColumnsAssignment_2_1 ) ) ;
    public final void rule__Extract__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2119:1: ( ( ( rule__Extract__TargetColumnsAssignment_2_1 ) ) )
            // InternalTableDSL.g:2120:1: ( ( rule__Extract__TargetColumnsAssignment_2_1 ) )
            {
            // InternalTableDSL.g:2120:1: ( ( rule__Extract__TargetColumnsAssignment_2_1 ) )
            // InternalTableDSL.g:2121:2: ( rule__Extract__TargetColumnsAssignment_2_1 )
            {
             before(grammarAccess.getExtractAccess().getTargetColumnsAssignment_2_1()); 
            // InternalTableDSL.g:2122:2: ( rule__Extract__TargetColumnsAssignment_2_1 )
            // InternalTableDSL.g:2122:3: rule__Extract__TargetColumnsAssignment_2_1
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
    // InternalTableDSL.g:2131:1: rule__Selector__Group_0__0 : rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1 ;
    public final void rule__Selector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2135:1: ( rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1 )
            // InternalTableDSL.g:2136:2: rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalTableDSL.g:2143:1: rule__Selector__Group_0__0__Impl : ( () ) ;
    public final void rule__Selector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2147:1: ( ( () ) )
            // InternalTableDSL.g:2148:1: ( () )
            {
            // InternalTableDSL.g:2148:1: ( () )
            // InternalTableDSL.g:2149:2: ()
            {
             before(grammarAccess.getSelectorAccess().getSelectorAction_0_0()); 
            // InternalTableDSL.g:2150:2: ()
            // InternalTableDSL.g:2150:3: 
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
    // InternalTableDSL.g:2158:1: rule__Selector__Group_0__1 : rule__Selector__Group_0__1__Impl ;
    public final void rule__Selector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2162:1: ( rule__Selector__Group_0__1__Impl )
            // InternalTableDSL.g:2163:2: rule__Selector__Group_0__1__Impl
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
    // InternalTableDSL.g:2169:1: rule__Selector__Group_0__1__Impl : ( 'MAX' ) ;
    public final void rule__Selector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2173:1: ( ( 'MAX' ) )
            // InternalTableDSL.g:2174:1: ( 'MAX' )
            {
            // InternalTableDSL.g:2174:1: ( 'MAX' )
            // InternalTableDSL.g:2175:2: 'MAX'
            {
             before(grammarAccess.getSelectorAccess().getMAXKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getMAXKeyword_0_1()); 

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
    // InternalTableDSL.g:2185:1: rule__Selector__Group_1__0 : rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 ;
    public final void rule__Selector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2189:1: ( rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 )
            // InternalTableDSL.g:2190:2: rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTableDSL.g:2197:1: rule__Selector__Group_1__0__Impl : ( () ) ;
    public final void rule__Selector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2201:1: ( ( () ) )
            // InternalTableDSL.g:2202:1: ( () )
            {
            // InternalTableDSL.g:2202:1: ( () )
            // InternalTableDSL.g:2203:2: ()
            {
             before(grammarAccess.getSelectorAccess().getSelectorAction_1_0()); 
            // InternalTableDSL.g:2204:2: ()
            // InternalTableDSL.g:2204:3: 
            {
            }

             after(grammarAccess.getSelectorAccess().getSelectorAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1__1"
    // InternalTableDSL.g:2212:1: rule__Selector__Group_1__1 : rule__Selector__Group_1__1__Impl ;
    public final void rule__Selector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2216:1: ( rule__Selector__Group_1__1__Impl )
            // InternalTableDSL.g:2217:2: rule__Selector__Group_1__1__Impl
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
    // InternalTableDSL.g:2223:1: rule__Selector__Group_1__1__Impl : ( 'MIN' ) ;
    public final void rule__Selector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2227:1: ( ( 'MIN' ) )
            // InternalTableDSL.g:2228:1: ( 'MIN' )
            {
            // InternalTableDSL.g:2228:1: ( 'MIN' )
            // InternalTableDSL.g:2229:2: 'MIN'
            {
             before(grammarAccess.getSelectorAccess().getMINKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getMINKeyword_1_1()); 

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


    // $ANTLR start "rule__Selector__Group_2__0"
    // InternalTableDSL.g:2239:1: rule__Selector__Group_2__0 : rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1 ;
    public final void rule__Selector__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2243:1: ( rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1 )
            // InternalTableDSL.g:2244:2: rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Selector__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_2__1();

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
    // $ANTLR end "rule__Selector__Group_2__0"


    // $ANTLR start "rule__Selector__Group_2__0__Impl"
    // InternalTableDSL.g:2251:1: rule__Selector__Group_2__0__Impl : ( () ) ;
    public final void rule__Selector__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2255:1: ( ( () ) )
            // InternalTableDSL.g:2256:1: ( () )
            {
            // InternalTableDSL.g:2256:1: ( () )
            // InternalTableDSL.g:2257:2: ()
            {
             before(grammarAccess.getSelectorAccess().getSelectorAction_2_0()); 
            // InternalTableDSL.g:2258:2: ()
            // InternalTableDSL.g:2258:3: 
            {
            }

             after(grammarAccess.getSelectorAccess().getSelectorAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_2__0__Impl"


    // $ANTLR start "rule__Selector__Group_2__1"
    // InternalTableDSL.g:2266:1: rule__Selector__Group_2__1 : rule__Selector__Group_2__1__Impl ;
    public final void rule__Selector__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2270:1: ( rule__Selector__Group_2__1__Impl )
            // InternalTableDSL.g:2271:2: rule__Selector__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_2__1__Impl();

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
    // $ANTLR end "rule__Selector__Group_2__1"


    // $ANTLR start "rule__Selector__Group_2__1__Impl"
    // InternalTableDSL.g:2277:1: rule__Selector__Group_2__1__Impl : ( 'MEDIAN' ) ;
    public final void rule__Selector__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2281:1: ( ( 'MEDIAN' ) )
            // InternalTableDSL.g:2282:1: ( 'MEDIAN' )
            {
            // InternalTableDSL.g:2282:1: ( 'MEDIAN' )
            // InternalTableDSL.g:2283:2: 'MEDIAN'
            {
             before(grammarAccess.getSelectorAccess().getMEDIANKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getMEDIANKeyword_2_1()); 

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
    // $ANTLR end "rule__Selector__Group_2__1__Impl"


    // $ANTLR start "rule__Selector__Group_3__0"
    // InternalTableDSL.g:2293:1: rule__Selector__Group_3__0 : rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 ;
    public final void rule__Selector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2297:1: ( rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 )
            // InternalTableDSL.g:2298:2: rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Selector__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_3__1();

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
    // $ANTLR end "rule__Selector__Group_3__0"


    // $ANTLR start "rule__Selector__Group_3__0__Impl"
    // InternalTableDSL.g:2305:1: rule__Selector__Group_3__0__Impl : ( 'TOP' ) ;
    public final void rule__Selector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2309:1: ( ( 'TOP' ) )
            // InternalTableDSL.g:2310:1: ( 'TOP' )
            {
            // InternalTableDSL.g:2310:1: ( 'TOP' )
            // InternalTableDSL.g:2311:2: 'TOP'
            {
             before(grammarAccess.getSelectorAccess().getTOPKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getTOPKeyword_3_0()); 

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
    // $ANTLR end "rule__Selector__Group_3__0__Impl"


    // $ANTLR start "rule__Selector__Group_3__1"
    // InternalTableDSL.g:2320:1: rule__Selector__Group_3__1 : rule__Selector__Group_3__1__Impl ;
    public final void rule__Selector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2324:1: ( rule__Selector__Group_3__1__Impl )
            // InternalTableDSL.g:2325:2: rule__Selector__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_3__1__Impl();

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
    // $ANTLR end "rule__Selector__Group_3__1"


    // $ANTLR start "rule__Selector__Group_3__1__Impl"
    // InternalTableDSL.g:2331:1: rule__Selector__Group_3__1__Impl : ( ( rule__Selector__NAssignment_3_1 ) ) ;
    public final void rule__Selector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2335:1: ( ( ( rule__Selector__NAssignment_3_1 ) ) )
            // InternalTableDSL.g:2336:1: ( ( rule__Selector__NAssignment_3_1 ) )
            {
            // InternalTableDSL.g:2336:1: ( ( rule__Selector__NAssignment_3_1 ) )
            // InternalTableDSL.g:2337:2: ( rule__Selector__NAssignment_3_1 )
            {
             before(grammarAccess.getSelectorAccess().getNAssignment_3_1()); 
            // InternalTableDSL.g:2338:2: ( rule__Selector__NAssignment_3_1 )
            // InternalTableDSL.g:2338:3: rule__Selector__NAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__NAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getNAssignment_3_1()); 

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
    // $ANTLR end "rule__Selector__Group_3__1__Impl"


    // $ANTLR start "rule__Comparator__Group__0"
    // InternalTableDSL.g:2347:1: rule__Comparator__Group__0 : rule__Comparator__Group__0__Impl rule__Comparator__Group__1 ;
    public final void rule__Comparator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2351:1: ( rule__Comparator__Group__0__Impl rule__Comparator__Group__1 )
            // InternalTableDSL.g:2352:2: rule__Comparator__Group__0__Impl rule__Comparator__Group__1
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
    // InternalTableDSL.g:2359:1: rule__Comparator__Group__0__Impl : ( ( rule__Comparator__KeysAssignment_0 ) ) ;
    public final void rule__Comparator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2363:1: ( ( ( rule__Comparator__KeysAssignment_0 ) ) )
            // InternalTableDSL.g:2364:1: ( ( rule__Comparator__KeysAssignment_0 ) )
            {
            // InternalTableDSL.g:2364:1: ( ( rule__Comparator__KeysAssignment_0 ) )
            // InternalTableDSL.g:2365:2: ( rule__Comparator__KeysAssignment_0 )
            {
             before(grammarAccess.getComparatorAccess().getKeysAssignment_0()); 
            // InternalTableDSL.g:2366:2: ( rule__Comparator__KeysAssignment_0 )
            // InternalTableDSL.g:2366:3: rule__Comparator__KeysAssignment_0
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
    // InternalTableDSL.g:2374:1: rule__Comparator__Group__1 : rule__Comparator__Group__1__Impl ;
    public final void rule__Comparator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2378:1: ( rule__Comparator__Group__1__Impl )
            // InternalTableDSL.g:2379:2: rule__Comparator__Group__1__Impl
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
    // InternalTableDSL.g:2385:1: rule__Comparator__Group__1__Impl : ( ( rule__Comparator__Group_1__0 )* ) ;
    public final void rule__Comparator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2389:1: ( ( ( rule__Comparator__Group_1__0 )* ) )
            // InternalTableDSL.g:2390:1: ( ( rule__Comparator__Group_1__0 )* )
            {
            // InternalTableDSL.g:2390:1: ( ( rule__Comparator__Group_1__0 )* )
            // InternalTableDSL.g:2391:2: ( rule__Comparator__Group_1__0 )*
            {
             before(grammarAccess.getComparatorAccess().getGroup_1()); 
            // InternalTableDSL.g:2392:2: ( rule__Comparator__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTableDSL.g:2392:3: rule__Comparator__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Comparator__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalTableDSL.g:2401:1: rule__Comparator__Group_1__0 : rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 ;
    public final void rule__Comparator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2405:1: ( rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 )
            // InternalTableDSL.g:2406:2: rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTableDSL.g:2413:1: rule__Comparator__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Comparator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2417:1: ( ( ',' ) )
            // InternalTableDSL.g:2418:1: ( ',' )
            {
            // InternalTableDSL.g:2418:1: ( ',' )
            // InternalTableDSL.g:2419:2: ','
            {
             before(grammarAccess.getComparatorAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTableDSL.g:2428:1: rule__Comparator__Group_1__1 : rule__Comparator__Group_1__1__Impl ;
    public final void rule__Comparator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2432:1: ( rule__Comparator__Group_1__1__Impl )
            // InternalTableDSL.g:2433:2: rule__Comparator__Group_1__1__Impl
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
    // InternalTableDSL.g:2439:1: rule__Comparator__Group_1__1__Impl : ( ( rule__Comparator__KeysAssignment_1_1 ) ) ;
    public final void rule__Comparator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2443:1: ( ( ( rule__Comparator__KeysAssignment_1_1 ) ) )
            // InternalTableDSL.g:2444:1: ( ( rule__Comparator__KeysAssignment_1_1 ) )
            {
            // InternalTableDSL.g:2444:1: ( ( rule__Comparator__KeysAssignment_1_1 ) )
            // InternalTableDSL.g:2445:2: ( rule__Comparator__KeysAssignment_1_1 )
            {
             before(grammarAccess.getComparatorAccess().getKeysAssignment_1_1()); 
            // InternalTableDSL.g:2446:2: ( rule__Comparator__KeysAssignment_1_1 )
            // InternalTableDSL.g:2446:3: rule__Comparator__KeysAssignment_1_1
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
    // InternalTableDSL.g:2455:1: rule__SquashRows__Group__0 : rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1 ;
    public final void rule__SquashRows__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2459:1: ( rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1 )
            // InternalTableDSL.g:2460:2: rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTableDSL.g:2467:1: rule__SquashRows__Group__0__Impl : ( 'squash' ) ;
    public final void rule__SquashRows__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2471:1: ( ( 'squash' ) )
            // InternalTableDSL.g:2472:1: ( 'squash' )
            {
            // InternalTableDSL.g:2472:1: ( 'squash' )
            // InternalTableDSL.g:2473:2: 'squash'
            {
             before(grammarAccess.getSquashRowsAccess().getSquashKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTableDSL.g:2482:1: rule__SquashRows__Group__1 : rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2 ;
    public final void rule__SquashRows__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2486:1: ( rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2 )
            // InternalTableDSL.g:2487:2: rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalTableDSL.g:2494:1: rule__SquashRows__Group__1__Impl : ( ( 'rows' )? ) ;
    public final void rule__SquashRows__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2498:1: ( ( ( 'rows' )? ) )
            // InternalTableDSL.g:2499:1: ( ( 'rows' )? )
            {
            // InternalTableDSL.g:2499:1: ( ( 'rows' )? )
            // InternalTableDSL.g:2500:2: ( 'rows' )?
            {
             before(grammarAccess.getSquashRowsAccess().getRowsKeyword_1()); 
            // InternalTableDSL.g:2501:2: ( 'rows' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTableDSL.g:2501:3: 'rows'
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalTableDSL.g:2509:1: rule__SquashRows__Group__2 : rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3 ;
    public final void rule__SquashRows__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2513:1: ( rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3 )
            // InternalTableDSL.g:2514:2: rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalTableDSL.g:2521:1: rule__SquashRows__Group__2__Impl : ( 'by' ) ;
    public final void rule__SquashRows__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2525:1: ( ( 'by' ) )
            // InternalTableDSL.g:2526:1: ( 'by' )
            {
            // InternalTableDSL.g:2526:1: ( 'by' )
            // InternalTableDSL.g:2527:2: 'by'
            {
             before(grammarAccess.getSquashRowsAccess().getByKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTableDSL.g:2536:1: rule__SquashRows__Group__3 : rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4 ;
    public final void rule__SquashRows__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2540:1: ( rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4 )
            // InternalTableDSL.g:2541:2: rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4
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
    // InternalTableDSL.g:2548:1: rule__SquashRows__Group__3__Impl : ( ( rule__SquashRows__ColumnsAssignment_3 ) ) ;
    public final void rule__SquashRows__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2552:1: ( ( ( rule__SquashRows__ColumnsAssignment_3 ) ) )
            // InternalTableDSL.g:2553:1: ( ( rule__SquashRows__ColumnsAssignment_3 ) )
            {
            // InternalTableDSL.g:2553:1: ( ( rule__SquashRows__ColumnsAssignment_3 ) )
            // InternalTableDSL.g:2554:2: ( rule__SquashRows__ColumnsAssignment_3 )
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsAssignment_3()); 
            // InternalTableDSL.g:2555:2: ( rule__SquashRows__ColumnsAssignment_3 )
            // InternalTableDSL.g:2555:3: rule__SquashRows__ColumnsAssignment_3
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
    // InternalTableDSL.g:2563:1: rule__SquashRows__Group__4 : rule__SquashRows__Group__4__Impl ;
    public final void rule__SquashRows__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2567:1: ( rule__SquashRows__Group__4__Impl )
            // InternalTableDSL.g:2568:2: rule__SquashRows__Group__4__Impl
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
    // InternalTableDSL.g:2574:1: rule__SquashRows__Group__4__Impl : ( ( rule__SquashRows__Group_4__0 )* ) ;
    public final void rule__SquashRows__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2578:1: ( ( ( rule__SquashRows__Group_4__0 )* ) )
            // InternalTableDSL.g:2579:1: ( ( rule__SquashRows__Group_4__0 )* )
            {
            // InternalTableDSL.g:2579:1: ( ( rule__SquashRows__Group_4__0 )* )
            // InternalTableDSL.g:2580:2: ( rule__SquashRows__Group_4__0 )*
            {
             before(grammarAccess.getSquashRowsAccess().getGroup_4()); 
            // InternalTableDSL.g:2581:2: ( rule__SquashRows__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTableDSL.g:2581:3: rule__SquashRows__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SquashRows__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalTableDSL.g:2590:1: rule__SquashRows__Group_4__0 : rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1 ;
    public final void rule__SquashRows__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2594:1: ( rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1 )
            // InternalTableDSL.g:2595:2: rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTableDSL.g:2602:1: rule__SquashRows__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SquashRows__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2606:1: ( ( ',' ) )
            // InternalTableDSL.g:2607:1: ( ',' )
            {
            // InternalTableDSL.g:2607:1: ( ',' )
            // InternalTableDSL.g:2608:2: ','
            {
             before(grammarAccess.getSquashRowsAccess().getCommaKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTableDSL.g:2617:1: rule__SquashRows__Group_4__1 : rule__SquashRows__Group_4__1__Impl ;
    public final void rule__SquashRows__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2621:1: ( rule__SquashRows__Group_4__1__Impl )
            // InternalTableDSL.g:2622:2: rule__SquashRows__Group_4__1__Impl
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
    // InternalTableDSL.g:2628:1: rule__SquashRows__Group_4__1__Impl : ( ( rule__SquashRows__ColumnsAssignment_4_1 ) ) ;
    public final void rule__SquashRows__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2632:1: ( ( ( rule__SquashRows__ColumnsAssignment_4_1 ) ) )
            // InternalTableDSL.g:2633:1: ( ( rule__SquashRows__ColumnsAssignment_4_1 ) )
            {
            // InternalTableDSL.g:2633:1: ( ( rule__SquashRows__ColumnsAssignment_4_1 ) )
            // InternalTableDSL.g:2634:2: ( rule__SquashRows__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsAssignment_4_1()); 
            // InternalTableDSL.g:2635:2: ( rule__SquashRows__ColumnsAssignment_4_1 )
            // InternalTableDSL.g:2635:3: rule__SquashRows__ColumnsAssignment_4_1
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
    // InternalTableDSL.g:2644:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2648:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalTableDSL.g:2649:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTableDSL.g:2656:1: rule__Filter__Group__0__Impl : ( 'filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2660:1: ( ( 'filter' ) )
            // InternalTableDSL.g:2661:1: ( 'filter' )
            {
            // InternalTableDSL.g:2661:1: ( 'filter' )
            // InternalTableDSL.g:2662:2: 'filter'
            {
             before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTableDSL.g:2671:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2675:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalTableDSL.g:2676:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTableDSL.g:2683:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__DenylistAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2687:1: ( ( ( rule__Filter__DenylistAssignment_1 ) ) )
            // InternalTableDSL.g:2688:1: ( ( rule__Filter__DenylistAssignment_1 ) )
            {
            // InternalTableDSL.g:2688:1: ( ( rule__Filter__DenylistAssignment_1 ) )
            // InternalTableDSL.g:2689:2: ( rule__Filter__DenylistAssignment_1 )
            {
             before(grammarAccess.getFilterAccess().getDenylistAssignment_1()); 
            // InternalTableDSL.g:2690:2: ( rule__Filter__DenylistAssignment_1 )
            // InternalTableDSL.g:2690:3: rule__Filter__DenylistAssignment_1
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
    // InternalTableDSL.g:2698:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2702:1: ( rule__Filter__Group__2__Impl )
            // InternalTableDSL.g:2703:2: rule__Filter__Group__2__Impl
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
    // InternalTableDSL.g:2709:1: rule__Filter__Group__2__Impl : ( ( rule__Filter__ExceptlistAssignment_2 )? ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2713:1: ( ( ( rule__Filter__ExceptlistAssignment_2 )? ) )
            // InternalTableDSL.g:2714:1: ( ( rule__Filter__ExceptlistAssignment_2 )? )
            {
            // InternalTableDSL.g:2714:1: ( ( rule__Filter__ExceptlistAssignment_2 )? )
            // InternalTableDSL.g:2715:2: ( rule__Filter__ExceptlistAssignment_2 )?
            {
             before(grammarAccess.getFilterAccess().getExceptlistAssignment_2()); 
            // InternalTableDSL.g:2716:2: ( rule__Filter__ExceptlistAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTableDSL.g:2716:3: rule__Filter__ExceptlistAssignment_2
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
    // InternalTableDSL.g:2725:1: rule__FilterDenylist__Group__0 : rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1 ;
    public final void rule__FilterDenylist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2729:1: ( rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1 )
            // InternalTableDSL.g:2730:2: rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalTableDSL.g:2737:1: rule__FilterDenylist__Group__0__Impl : ( 'deny' ) ;
    public final void rule__FilterDenylist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2741:1: ( ( 'deny' ) )
            // InternalTableDSL.g:2742:1: ( 'deny' )
            {
            // InternalTableDSL.g:2742:1: ( 'deny' )
            // InternalTableDSL.g:2743:2: 'deny'
            {
             before(grammarAccess.getFilterDenylistAccess().getDenyKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalTableDSL.g:2752:1: rule__FilterDenylist__Group__1 : rule__FilterDenylist__Group__1__Impl ;
    public final void rule__FilterDenylist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2756:1: ( rule__FilterDenylist__Group__1__Impl )
            // InternalTableDSL.g:2757:2: rule__FilterDenylist__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group__1__Impl();

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
    // InternalTableDSL.g:2763:1: rule__FilterDenylist__Group__1__Impl : ( ( rule__FilterDenylist__DenylistAssignment_1 ) ) ;
    public final void rule__FilterDenylist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2767:1: ( ( ( rule__FilterDenylist__DenylistAssignment_1 ) ) )
            // InternalTableDSL.g:2768:1: ( ( rule__FilterDenylist__DenylistAssignment_1 ) )
            {
            // InternalTableDSL.g:2768:1: ( ( rule__FilterDenylist__DenylistAssignment_1 ) )
            // InternalTableDSL.g:2769:2: ( rule__FilterDenylist__DenylistAssignment_1 )
            {
             before(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_1()); 
            // InternalTableDSL.g:2770:2: ( rule__FilterDenylist__DenylistAssignment_1 )
            // InternalTableDSL.g:2770:3: rule__FilterDenylist__DenylistAssignment_1
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


    // $ANTLR start "rule__FilterExceptlist__Group__0"
    // InternalTableDSL.g:2779:1: rule__FilterExceptlist__Group__0 : rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1 ;
    public final void rule__FilterExceptlist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2783:1: ( rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1 )
            // InternalTableDSL.g:2784:2: rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalTableDSL.g:2791:1: rule__FilterExceptlist__Group__0__Impl : ( 'except' ) ;
    public final void rule__FilterExceptlist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2795:1: ( ( 'except' ) )
            // InternalTableDSL.g:2796:1: ( 'except' )
            {
            // InternalTableDSL.g:2796:1: ( 'except' )
            // InternalTableDSL.g:2797:2: 'except'
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTableDSL.g:2806:1: rule__FilterExceptlist__Group__1 : rule__FilterExceptlist__Group__1__Impl ;
    public final void rule__FilterExceptlist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2810:1: ( rule__FilterExceptlist__Group__1__Impl )
            // InternalTableDSL.g:2811:2: rule__FilterExceptlist__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group__1__Impl();

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
    // InternalTableDSL.g:2817:1: rule__FilterExceptlist__Group__1__Impl : ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) ) ;
    public final void rule__FilterExceptlist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2821:1: ( ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) ) )
            // InternalTableDSL.g:2822:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) )
            {
            // InternalTableDSL.g:2822:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) )
            // InternalTableDSL.g:2823:2: ( rule__FilterExceptlist__ExceptlistAssignment_1 )
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_1()); 
            // InternalTableDSL.g:2824:2: ( rule__FilterExceptlist__ExceptlistAssignment_1 )
            // InternalTableDSL.g:2824:3: rule__FilterExceptlist__ExceptlistAssignment_1
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


    // $ANTLR start "rule__FilterObjectTypeRule__Group__0"
    // InternalTableDSL.g:2833:1: rule__FilterObjectTypeRule__Group__0 : rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1 ;
    public final void rule__FilterObjectTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2837:1: ( rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1 )
            // InternalTableDSL.g:2838:2: rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTableDSL.g:2845:1: rule__FilterObjectTypeRule__Group__0__Impl : ( 'column' ) ;
    public final void rule__FilterObjectTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2849:1: ( ( 'column' ) )
            // InternalTableDSL.g:2850:1: ( 'column' )
            {
            // InternalTableDSL.g:2850:1: ( 'column' )
            // InternalTableDSL.g:2851:2: 'column'
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getColumnKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFilterObjectTypeRuleAccess().getColumnKeyword_0()); 

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
    // InternalTableDSL.g:2860:1: rule__FilterObjectTypeRule__Group__1 : rule__FilterObjectTypeRule__Group__1__Impl ;
    public final void rule__FilterObjectTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2864:1: ( rule__FilterObjectTypeRule__Group__1__Impl )
            // InternalTableDSL.g:2865:2: rule__FilterObjectTypeRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group__1__Impl();

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
    // InternalTableDSL.g:2871:1: rule__FilterObjectTypeRule__Group__1__Impl : ( ( rule__FilterObjectTypeRule__ColumnPatternAssignment_1 ) ) ;
    public final void rule__FilterObjectTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2875:1: ( ( ( rule__FilterObjectTypeRule__ColumnPatternAssignment_1 ) ) )
            // InternalTableDSL.g:2876:1: ( ( rule__FilterObjectTypeRule__ColumnPatternAssignment_1 ) )
            {
            // InternalTableDSL.g:2876:1: ( ( rule__FilterObjectTypeRule__ColumnPatternAssignment_1 ) )
            // InternalTableDSL.g:2877:2: ( rule__FilterObjectTypeRule__ColumnPatternAssignment_1 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getColumnPatternAssignment_1()); 
            // InternalTableDSL.g:2878:2: ( rule__FilterObjectTypeRule__ColumnPatternAssignment_1 )
            // InternalTableDSL.g:2878:3: rule__FilterObjectTypeRule__ColumnPatternAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__ColumnPatternAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterObjectTypeRuleAccess().getColumnPatternAssignment_1()); 

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


    // $ANTLR start "rule__FilterColumnRule__Group__0"
    // InternalTableDSL.g:2887:1: rule__FilterColumnRule__Group__0 : rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1 ;
    public final void rule__FilterColumnRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2891:1: ( rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1 )
            // InternalTableDSL.g:2892:2: rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTableDSL.g:2899:1: rule__FilterColumnRule__Group__0__Impl : ( 'object' ) ;
    public final void rule__FilterColumnRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2903:1: ( ( 'object' ) )
            // InternalTableDSL.g:2904:1: ( 'object' )
            {
            // InternalTableDSL.g:2904:1: ( 'object' )
            // InternalTableDSL.g:2905:2: 'object'
            {
             before(grammarAccess.getFilterColumnRuleAccess().getObjectKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFilterColumnRuleAccess().getObjectKeyword_0()); 

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
    // InternalTableDSL.g:2914:1: rule__FilterColumnRule__Group__1 : rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2 ;
    public final void rule__FilterColumnRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2918:1: ( rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2 )
            // InternalTableDSL.g:2919:2: rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalTableDSL.g:2926:1: rule__FilterColumnRule__Group__1__Impl : ( ( 'of' )? ) ;
    public final void rule__FilterColumnRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2930:1: ( ( ( 'of' )? ) )
            // InternalTableDSL.g:2931:1: ( ( 'of' )? )
            {
            // InternalTableDSL.g:2931:1: ( ( 'of' )? )
            // InternalTableDSL.g:2932:2: ( 'of' )?
            {
             before(grammarAccess.getFilterColumnRuleAccess().getOfKeyword_1()); 
            // InternalTableDSL.g:2933:2: ( 'of' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTableDSL.g:2933:3: 'of'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFilterColumnRuleAccess().getOfKeyword_1()); 

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
    // InternalTableDSL.g:2941:1: rule__FilterColumnRule__Group__2 : rule__FilterColumnRule__Group__2__Impl ;
    public final void rule__FilterColumnRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2945:1: ( rule__FilterColumnRule__Group__2__Impl )
            // InternalTableDSL.g:2946:2: rule__FilterColumnRule__Group__2__Impl
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
    // InternalTableDSL.g:2952:1: rule__FilterColumnRule__Group__2__Impl : ( ( rule__FilterColumnRule__ObjectClassAssignment_2 ) ) ;
    public final void rule__FilterColumnRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2956:1: ( ( ( rule__FilterColumnRule__ObjectClassAssignment_2 ) ) )
            // InternalTableDSL.g:2957:1: ( ( rule__FilterColumnRule__ObjectClassAssignment_2 ) )
            {
            // InternalTableDSL.g:2957:1: ( ( rule__FilterColumnRule__ObjectClassAssignment_2 ) )
            // InternalTableDSL.g:2958:2: ( rule__FilterColumnRule__ObjectClassAssignment_2 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getObjectClassAssignment_2()); 
            // InternalTableDSL.g:2959:2: ( rule__FilterColumnRule__ObjectClassAssignment_2 )
            // InternalTableDSL.g:2959:3: rule__FilterColumnRule__ObjectClassAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__ObjectClassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterColumnRuleAccess().getObjectClassAssignment_2()); 

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


    // $ANTLR start "rule__Start__ActionsAssignment_0"
    // InternalTableDSL.g:2968:1: rule__Start__ActionsAssignment_0 : ( ruleCreateTable ) ;
    public final void rule__Start__ActionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2972:1: ( ( ruleCreateTable ) )
            // InternalTableDSL.g:2973:2: ( ruleCreateTable )
            {
            // InternalTableDSL.g:2973:2: ( ruleCreateTable )
            // InternalTableDSL.g:2974:3: ruleCreateTable
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
    // InternalTableDSL.g:2983:1: rule__Start__ActionsAssignment_1 : ( ruleTableAction ) ;
    public final void rule__Start__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2987:1: ( ( ruleTableAction ) )
            // InternalTableDSL.g:2988:2: ( ruleTableAction )
            {
            // InternalTableDSL.g:2988:2: ( ruleTableAction )
            // InternalTableDSL.g:2989:3: ruleTableAction
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
    // InternalTableDSL.g:2998:1: rule__TableInputPath__PathPatternsAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TableInputPath__PathPatternsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3002:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3003:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3003:2: ( RULE_STRING )
            // InternalTableDSL.g:3004:3: RULE_STRING
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
    // InternalTableDSL.g:3013:1: rule__TableInputPath__PathPatternsAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TableInputPath__PathPatternsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3017:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3018:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3018:2: ( RULE_STRING )
            // InternalTableDSL.g:3019:3: RULE_STRING
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
    // InternalTableDSL.g:3028:1: rule__Output__OutputPathsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__OutputPathsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3032:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3033:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3033:2: ( RULE_STRING )
            // InternalTableDSL.g:3034:3: RULE_STRING
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
    // InternalTableDSL.g:3043:1: rule__Output__OutputPathsAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Output__OutputPathsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3047:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3048:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3048:2: ( RULE_STRING )
            // InternalTableDSL.g:3049:3: RULE_STRING
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
    // InternalTableDSL.g:3058:1: rule__Select__ColumnsPatternsAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Select__ColumnsPatternsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3062:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3063:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3063:2: ( RULE_STRING )
            // InternalTableDSL.g:3064:3: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getColumnsPatternsSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getColumnsPatternsSTRINGTerminalRuleCall_1_0()); 

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
    // InternalTableDSL.g:3073:1: rule__Select__ColumnPatternsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Select__ColumnPatternsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3077:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3078:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3078:2: ( RULE_STRING )
            // InternalTableDSL.g:3079:3: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getColumnPatternsSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getColumnPatternsSTRINGTerminalRuleCall_2_1_0()); 

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
    // InternalTableDSL.g:3088:1: rule__RenameColumn__RenameTuplesAssignment_2 : ( ruleRenameColumnPair ) ;
    public final void rule__RenameColumn__RenameTuplesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3092:1: ( ( ruleRenameColumnPair ) )
            // InternalTableDSL.g:3093:2: ( ruleRenameColumnPair )
            {
            // InternalTableDSL.g:3093:2: ( ruleRenameColumnPair )
            // InternalTableDSL.g:3094:3: ruleRenameColumnPair
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
    // InternalTableDSL.g:3103:1: rule__RenameColumnToPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnToPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3107:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3108:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3108:2: ( RULE_STRING )
            // InternalTableDSL.g:3109:3: RULE_STRING
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
    // InternalTableDSL.g:3118:1: rule__RenameColumnToPair__NewNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnToPair__NewNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3122:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3123:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3123:2: ( RULE_STRING )
            // InternalTableDSL.g:3124:3: RULE_STRING
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
    // InternalTableDSL.g:3133:1: rule__RenameColumnPrependPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnPrependPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3137:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3138:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3138:2: ( RULE_STRING )
            // InternalTableDSL.g:3139:3: RULE_STRING
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
    // InternalTableDSL.g:3148:1: rule__RenameColumnPrependPair__PrefixAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnPrependPair__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3152:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3153:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3153:2: ( RULE_STRING )
            // InternalTableDSL.g:3154:3: RULE_STRING
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
    // InternalTableDSL.g:3163:1: rule__RenameColumnAppendPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnAppendPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3167:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3168:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3168:2: ( RULE_STRING )
            // InternalTableDSL.g:3169:3: RULE_STRING
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
    // InternalTableDSL.g:3178:1: rule__RenameColumnAppendPair__SuffixAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnAppendPair__SuffixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3182:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3183:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3183:2: ( RULE_STRING )
            // InternalTableDSL.g:3184:3: RULE_STRING
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
    // InternalTableDSL.g:3193:1: rule__Extract__TargetColumnsAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Extract__TargetColumnsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3197:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3198:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3198:2: ( RULE_STRING )
            // InternalTableDSL.g:3199:3: RULE_STRING
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
    // InternalTableDSL.g:3208:1: rule__Extract__TargetColumnsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Extract__TargetColumnsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3212:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3213:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3213:2: ( RULE_STRING )
            // InternalTableDSL.g:3214:3: RULE_STRING
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
    // InternalTableDSL.g:3223:1: rule__Extract__SourceColumnAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Extract__SourceColumnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3227:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3228:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3228:2: ( RULE_STRING )
            // InternalTableDSL.g:3229:3: RULE_STRING
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
    // InternalTableDSL.g:3238:1: rule__Extract__SelectorAssignment_6 : ( ruleSelector ) ;
    public final void rule__Extract__SelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3242:1: ( ( ruleSelector ) )
            // InternalTableDSL.g:3243:2: ( ruleSelector )
            {
            // InternalTableDSL.g:3243:2: ( ruleSelector )
            // InternalTableDSL.g:3244:3: ruleSelector
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
    // InternalTableDSL.g:3253:1: rule__Extract__ComparatorAssignment_9 : ( ruleComparator ) ;
    public final void rule__Extract__ComparatorAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3257:1: ( ( ruleComparator ) )
            // InternalTableDSL.g:3258:2: ( ruleComparator )
            {
            // InternalTableDSL.g:3258:2: ( ruleComparator )
            // InternalTableDSL.g:3259:3: ruleComparator
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


    // $ANTLR start "rule__Selector__NAssignment_3_1"
    // InternalTableDSL.g:3268:1: rule__Selector__NAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Selector__NAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3272:1: ( ( RULE_INT ) )
            // InternalTableDSL.g:3273:2: ( RULE_INT )
            {
            // InternalTableDSL.g:3273:2: ( RULE_INT )
            // InternalTableDSL.g:3274:3: RULE_INT
            {
             before(grammarAccess.getSelectorAccess().getNINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getNINTTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Selector__NAssignment_3_1"


    // $ANTLR start "rule__Comparator__KeysAssignment_0"
    // InternalTableDSL.g:3283:1: rule__Comparator__KeysAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Comparator__KeysAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3287:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3288:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3288:2: ( RULE_STRING )
            // InternalTableDSL.g:3289:3: RULE_STRING
            {
             before(grammarAccess.getComparatorAccess().getKeysSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getKeysSTRINGTerminalRuleCall_0_0()); 

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
    // InternalTableDSL.g:3298:1: rule__Comparator__KeysAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Comparator__KeysAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3302:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3303:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3303:2: ( RULE_STRING )
            // InternalTableDSL.g:3304:3: RULE_STRING
            {
             before(grammarAccess.getComparatorAccess().getKeysSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getKeysSTRINGTerminalRuleCall_1_1_0()); 

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
    // InternalTableDSL.g:3313:1: rule__SquashRows__ColumnsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SquashRows__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3317:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3318:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3318:2: ( RULE_STRING )
            // InternalTableDSL.g:3319:3: RULE_STRING
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSquashRowsAccess().getColumnsSTRINGTerminalRuleCall_3_0()); 

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
    // InternalTableDSL.g:3328:1: rule__SquashRows__ColumnsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SquashRows__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3332:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3333:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3333:2: ( RULE_STRING )
            // InternalTableDSL.g:3334:3: RULE_STRING
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSquashRowsAccess().getColumnsSTRINGTerminalRuleCall_4_1_0()); 

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
    // InternalTableDSL.g:3343:1: rule__Filter__DenylistAssignment_1 : ( ruleFilterDenylist ) ;
    public final void rule__Filter__DenylistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3347:1: ( ( ruleFilterDenylist ) )
            // InternalTableDSL.g:3348:2: ( ruleFilterDenylist )
            {
            // InternalTableDSL.g:3348:2: ( ruleFilterDenylist )
            // InternalTableDSL.g:3349:3: ruleFilterDenylist
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
    // InternalTableDSL.g:3358:1: rule__Filter__ExceptlistAssignment_2 : ( ruleFilterExceptlist ) ;
    public final void rule__Filter__ExceptlistAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3362:1: ( ( ruleFilterExceptlist ) )
            // InternalTableDSL.g:3363:2: ( ruleFilterExceptlist )
            {
            // InternalTableDSL.g:3363:2: ( ruleFilterExceptlist )
            // InternalTableDSL.g:3364:3: ruleFilterExceptlist
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
    // InternalTableDSL.g:3373:1: rule__FilterDenylist__DenylistAssignment_1 : ( ruleFilterRule ) ;
    public final void rule__FilterDenylist__DenylistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3377:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:3378:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:3378:2: ( ruleFilterRule )
            // InternalTableDSL.g:3379:3: ruleFilterRule
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


    // $ANTLR start "rule__FilterExceptlist__ExceptlistAssignment_1"
    // InternalTableDSL.g:3388:1: rule__FilterExceptlist__ExceptlistAssignment_1 : ( ruleFilterRule ) ;
    public final void rule__FilterExceptlist__ExceptlistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3392:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:3393:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:3393:2: ( ruleFilterRule )
            // InternalTableDSL.g:3394:3: ruleFilterRule
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


    // $ANTLR start "rule__FilterObjectTypeRule__ColumnPatternAssignment_1"
    // InternalTableDSL.g:3403:1: rule__FilterObjectTypeRule__ColumnPatternAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FilterObjectTypeRule__ColumnPatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3407:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3408:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3408:2: ( RULE_STRING )
            // InternalTableDSL.g:3409:3: RULE_STRING
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getColumnPatternSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterObjectTypeRuleAccess().getColumnPatternSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FilterObjectTypeRule__ColumnPatternAssignment_1"


    // $ANTLR start "rule__FilterColumnRule__ObjectClassAssignment_2"
    // InternalTableDSL.g:3418:1: rule__FilterColumnRule__ObjectClassAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FilterColumnRule__ObjectClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3422:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3423:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3423:2: ( RULE_STRING )
            // InternalTableDSL.g:3424:3: RULE_STRING
            {
             before(grammarAccess.getFilterColumnRuleAccess().getObjectClassSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterColumnRuleAccess().getObjectClassSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FilterColumnRule__ObjectClassAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001408D4000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000001408D4002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000020L});

}