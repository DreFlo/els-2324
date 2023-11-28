/*
 * generated by Xtext 2.32.0
 */
package org.feup.els5.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.feup.els5.dsl.services.TableDSLGrammarAccess;

@SuppressWarnings("all")
public class TableDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TableDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CreateTable_CreateKeyword_0_q;
	protected AbstractElementAlias match_Extract_ByKeyword_8_q;
	protected AbstractElementAlias match_FilterColumnRule_ColumnKeyword_0_0_or_ColumnsKeyword_0_1;
	protected AbstractElementAlias match_FilterObjectTypeRule_ObjectKeyword_0_0_or_ObjectsKeyword_0_1;
	protected AbstractElementAlias match_FilterObjectTypeRule_OfKeyword_1_q;
	protected AbstractElementAlias match_RenameColumn_ColumnKeyword_1_q;
	protected AbstractElementAlias match_SquashRows_RowsKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TableDSLGrammarAccess) access;
		match_CreateTable_CreateKeyword_0_q = new TokenAlias(false, true, grammarAccess.getCreateTableAccess().getCreateKeyword_0());
		match_Extract_ByKeyword_8_q = new TokenAlias(false, true, grammarAccess.getExtractAccess().getByKeyword_8());
		match_FilterColumnRule_ColumnKeyword_0_0_or_ColumnsKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFilterColumnRuleAccess().getColumnKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getFilterColumnRuleAccess().getColumnsKeyword_0_1()));
		match_FilterObjectTypeRule_ObjectKeyword_0_0_or_ObjectsKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFilterObjectTypeRuleAccess().getObjectKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getFilterObjectTypeRuleAccess().getObjectsKeyword_0_1()));
		match_FilterObjectTypeRule_OfKeyword_1_q = new TokenAlias(false, true, grammarAccess.getFilterObjectTypeRuleAccess().getOfKeyword_1());
		match_RenameColumn_ColumnKeyword_1_q = new TokenAlias(false, true, grammarAccess.getRenameColumnAccess().getColumnKeyword_1());
		match_SquashRows_RowsKeyword_1_q = new TokenAlias(false, true, grammarAccess.getSquashRowsAccess().getRowsKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getANY_OTHERRule())
			return getANY_OTHERToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSELECTOR_KEYWORDSRule())
			return getSELECTOR_KEYWORDSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ANY_OTHER: .;
	 */
	protected String getANY_OTHERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal SELECTOR_KEYWORDS returns ecore::EString:
	 * 	"MAX" | "MIN" | "MEDIAN"
	 * ;
	 */
	protected String getSELECTOR_KEYWORDSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "MAX";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_CreateTable_CreateKeyword_0_q.equals(syntax))
				emit_CreateTable_CreateKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Extract_ByKeyword_8_q.equals(syntax))
				emit_Extract_ByKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FilterColumnRule_ColumnKeyword_0_0_or_ColumnsKeyword_0_1.equals(syntax))
				emit_FilterColumnRule_ColumnKeyword_0_0_or_ColumnsKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FilterObjectTypeRule_ObjectKeyword_0_0_or_ObjectsKeyword_0_1.equals(syntax))
				emit_FilterObjectTypeRule_ObjectKeyword_0_0_or_ObjectsKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FilterObjectTypeRule_OfKeyword_1_q.equals(syntax))
				emit_FilterObjectTypeRule_OfKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RenameColumn_ColumnKeyword_1_q.equals(syntax))
				emit_RenameColumn_ColumnKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SquashRows_RowsKeyword_1_q.equals(syntax))
				emit_SquashRows_RowsKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'create'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'table' 'from' pathPatterns+=STRING
	 
	 * </pre>
	 */
	protected void emit_CreateTable_CreateKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'by'?
	 *
	 * This ambiguous syntax occurs at:
	 *     selector=Selector 'sort' (ambiguity) comparator=Comparator
	 
	 * </pre>
	 */
	protected void emit_Extract_ByKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'column' | 'columns'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) columnPatterns+=ColumnName
	 
	 * </pre>
	 */
	protected void emit_FilterColumnRule_ColumnKeyword_0_0_or_ColumnsKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'object' | 'objects'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'of'? objectClasses+=STRING
	 
	 * </pre>
	 */
	protected void emit_FilterObjectTypeRule_ObjectKeyword_0_0_or_ObjectsKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'of'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('object' | 'objects') (ambiguity) objectClasses+=STRING
	 
	 * </pre>
	 */
	protected void emit_FilterObjectTypeRule_OfKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'column'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'rename' (ambiguity) renameTuples+=RenameColumnPair
	 
	 * </pre>
	 */
	protected void emit_RenameColumn_ColumnKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'rows'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'squash' (ambiguity) 'by' columns+=ColumnName
	 
	 * </pre>
	 */
	protected void emit_SquashRows_RowsKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
