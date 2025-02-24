/*
 * generated by Xtext 2.33.0
 */
package org.feup.els5.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.feup.els5.dsl.services.TableDSLGrammarAccess;
import org.feup.els5.dsl.tableDSL.ColumnName;
import org.feup.els5.dsl.tableDSL.Comparator;
import org.feup.els5.dsl.tableDSL.Extract;
import org.feup.els5.dsl.tableDSL.ExtractColumnMapping;
import org.feup.els5.dsl.tableDSL.Filter;
import org.feup.els5.dsl.tableDSL.FilterColumnRule;
import org.feup.els5.dsl.tableDSL.FilterDenylist;
import org.feup.els5.dsl.tableDSL.FilterExceptlist;
import org.feup.els5.dsl.tableDSL.FilterObjectTypeRule;
import org.feup.els5.dsl.tableDSL.KeySelector;
import org.feup.els5.dsl.tableDSL.ObjectTypeSelector;
import org.feup.els5.dsl.tableDSL.Output;
import org.feup.els5.dsl.tableDSL.Reduce;
import org.feup.els5.dsl.tableDSL.RenameColumn;
import org.feup.els5.dsl.tableDSL.RenameColumnAppendPair;
import org.feup.els5.dsl.tableDSL.RenameColumnPrependPair;
import org.feup.els5.dsl.tableDSL.RenameColumnReplacePair;
import org.feup.els5.dsl.tableDSL.RenameColumnToPair;
import org.feup.els5.dsl.tableDSL.Select;
import org.feup.els5.dsl.tableDSL.SquashRows;
import org.feup.els5.dsl.tableDSL.Start;
import org.feup.els5.dsl.tableDSL.TableDSLPackage;
import org.feup.els5.dsl.tableDSL.TableInputPath;
import org.feup.els5.dsl.tableDSL.TopNSelector;

@SuppressWarnings("all")
public class TableDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TableDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TableDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TableDSLPackage.COLUMN_NAME:
				sequence_ColumnName(context, (ColumnName) semanticObject); 
				return; 
			case TableDSLPackage.COMPARATOR:
				sequence_Comparator(context, (Comparator) semanticObject); 
				return; 
			case TableDSLPackage.EXTRACT:
				sequence_Extract(context, (Extract) semanticObject); 
				return; 
			case TableDSLPackage.EXTRACT_COLUMN_MAPPING:
				sequence_ExtractColumnMapping(context, (ExtractColumnMapping) semanticObject); 
				return; 
			case TableDSLPackage.FILTER:
				sequence_Filter(context, (Filter) semanticObject); 
				return; 
			case TableDSLPackage.FILTER_COLUMN_RULE:
				sequence_FilterColumnRule(context, (FilterColumnRule) semanticObject); 
				return; 
			case TableDSLPackage.FILTER_DENYLIST:
				sequence_FilterDenylist(context, (FilterDenylist) semanticObject); 
				return; 
			case TableDSLPackage.FILTER_EXCEPTLIST:
				sequence_FilterExceptlist(context, (FilterExceptlist) semanticObject); 
				return; 
			case TableDSLPackage.FILTER_OBJECT_TYPE_RULE:
				sequence_FilterObjectTypeRule(context, (FilterObjectTypeRule) semanticObject); 
				return; 
			case TableDSLPackage.KEY_SELECTOR:
				sequence_KeySelector(context, (KeySelector) semanticObject); 
				return; 
			case TableDSLPackage.OBJECT_TYPE_SELECTOR:
				sequence_ObjectTypeSelector(context, (ObjectTypeSelector) semanticObject); 
				return; 
			case TableDSLPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case TableDSLPackage.REDUCE:
				sequence_Reduce(context, (Reduce) semanticObject); 
				return; 
			case TableDSLPackage.RENAME_COLUMN:
				sequence_RenameColumn(context, (RenameColumn) semanticObject); 
				return; 
			case TableDSLPackage.RENAME_COLUMN_APPEND_PAIR:
				sequence_RenameColumnAppendPair(context, (RenameColumnAppendPair) semanticObject); 
				return; 
			case TableDSLPackage.RENAME_COLUMN_PREPEND_PAIR:
				sequence_RenameColumnPrependPair(context, (RenameColumnPrependPair) semanticObject); 
				return; 
			case TableDSLPackage.RENAME_COLUMN_REPLACE_PAIR:
				sequence_RenameColumnReplacePair(context, (RenameColumnReplacePair) semanticObject); 
				return; 
			case TableDSLPackage.RENAME_COLUMN_TO_PAIR:
				sequence_RenameColumnToPair(context, (RenameColumnToPair) semanticObject); 
				return; 
			case TableDSLPackage.SELECT:
				sequence_Select(context, (Select) semanticObject); 
				return; 
			case TableDSLPackage.SQUASH_ROWS:
				sequence_SquashRows(context, (SquashRows) semanticObject); 
				return; 
			case TableDSLPackage.START:
				sequence_Start(context, (Start) semanticObject); 
				return; 
			case TableDSLPackage.TABLE_INPUT_PATH:
				sequence_TableInputPath(context, (TableInputPath) semanticObject); 
				return; 
			case TableDSLPackage.TOP_NSELECTOR:
				sequence_TopNSelector(context, (TopNSelector) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ColumnName returns ColumnName
	 *
	 * Constraint:
	 *     (columnName=COLUMN_NAME_KEYWORDS | columnName=STRING)
	 * </pre>
	 */
	protected void sequence_ColumnName(ISerializationContext context, ColumnName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Comparator returns Comparator
	 *
	 * Constraint:
	 *     (keys+=ColumnName keys+=ColumnName*)
	 * </pre>
	 */
	protected void sequence_Comparator(ISerializationContext context, Comparator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ExtractColumnMapping returns ExtractColumnMapping
	 *
	 * Constraint:
	 *     (targetColumn=STRING newName=STRING?)
	 * </pre>
	 */
	protected void sequence_ExtractColumnMapping(ISerializationContext context, ExtractColumnMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TableAction returns Extract
	 *     Operation returns Extract
	 *     Extract returns Extract
	 *
	 * Constraint:
	 *     (targets+=ExtractColumnMapping targets+=ExtractColumnMapping* sourceColumn=STRING selector=Selector comparator=Comparator)
	 * </pre>
	 */
	protected void sequence_Extract(ISerializationContext context, Extract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FilterRule returns FilterColumnRule
	 *     FilterColumnRule returns FilterColumnRule
	 *
	 * Constraint:
	 *     (columnPatterns+=ColumnName columnPatterns+=ColumnName*)
	 * </pre>
	 */
	protected void sequence_FilterColumnRule(ISerializationContext context, FilterColumnRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FilterDenylist returns FilterDenylist
	 *
	 * Constraint:
	 *     (denylist+=FilterRule denylist+=FilterRule*)
	 * </pre>
	 */
	protected void sequence_FilterDenylist(ISerializationContext context, FilterDenylist semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FilterExceptlist returns FilterExceptlist
	 *
	 * Constraint:
	 *     (exceptlist+=FilterRule exceptlist+=FilterRule*)
	 * </pre>
	 */
	protected void sequence_FilterExceptlist(ISerializationContext context, FilterExceptlist semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FilterRule returns FilterObjectTypeRule
	 *     FilterObjectTypeRule returns FilterObjectTypeRule
	 *
	 * Constraint:
	 *     (objectClasses+=ObjectTypeSelector objectClasses+=ObjectTypeSelector*)
	 * </pre>
	 */
	protected void sequence_FilterObjectTypeRule(ISerializationContext context, FilterObjectTypeRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TableAction returns Filter
	 *     Operation returns Filter
	 *     Filter returns Filter
	 *
	 * Constraint:
	 *     (denylist=FilterDenylist exceptlist=FilterExceptlist?)
	 * </pre>
	 */
	protected void sequence_Filter(ISerializationContext context, Filter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Selector returns KeySelector
	 *     KeySelector returns KeySelector
	 *
	 * Constraint:
	 *     key=SELECTOR_KEYWORDS
	 * </pre>
	 */
	protected void sequence_KeySelector(ISerializationContext context, KeySelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TableDSLPackage.Literals.KEY_SELECTOR__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TableDSLPackage.Literals.KEY_SELECTOR__KEY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKeySelectorAccess().getKeySELECTOR_KEYWORDSTerminalRuleCall_0(), semanticObject.getKey());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ObjectTypeSelector returns ObjectTypeSelector
	 *
	 * Constraint:
	 *     (objectType=OBJECT_TYPES | objectType=STRING)
	 * </pre>
	 */
	protected void sequence_ObjectTypeSelector(ISerializationContext context, ObjectTypeSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TableAction returns Output
	 *     Output returns Output
	 *
	 * Constraint:
	 *     (outputPaths+=STRING outputPaths+=STRING*)
	 * </pre>
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TableAction returns Reduce
	 *     Operation returns Reduce
	 *     Reduce returns Reduce
	 *
	 * Constraint:
	 *     (objectClass=ObjectTypeSelector functions+=SELECTOR_KEYWORDS functions+=SELECTOR_KEYWORDS*)
	 * </pre>
	 */
	protected void sequence_Reduce(ISerializationContext context, Reduce semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RenameColumnPair returns RenameColumnAppendPair
	 *     RenameColumnAppendPair returns RenameColumnAppendPair
	 *
	 * Constraint:
	 *     (oldName=STRING suffix=STRING)
	 * </pre>
	 */
	protected void sequence_RenameColumnAppendPair(ISerializationContext context, RenameColumnAppendPair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_PAIR__OLD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_PAIR__OLD_NAME));
			if (transientValues.isValueTransient(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_APPEND_PAIR__SUFFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_APPEND_PAIR__SUFFIX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRenameColumnAppendPairAccess().getOldNameSTRINGTerminalRuleCall_0_0(), semanticObject.getOldName());
		feeder.accept(grammarAccess.getRenameColumnAppendPairAccess().getSuffixSTRINGTerminalRuleCall_2_0(), semanticObject.getSuffix());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RenameColumnPair returns RenameColumnPrependPair
	 *     RenameColumnPrependPair returns RenameColumnPrependPair
	 *
	 * Constraint:
	 *     (oldName=STRING prefix=STRING)
	 * </pre>
	 */
	protected void sequence_RenameColumnPrependPair(ISerializationContext context, RenameColumnPrependPair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_PAIR__OLD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_PAIR__OLD_NAME));
			if (transientValues.isValueTransient(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_PREPEND_PAIR__PREFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_PREPEND_PAIR__PREFIX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRenameColumnPrependPairAccess().getOldNameSTRINGTerminalRuleCall_0_0(), semanticObject.getOldName());
		feeder.accept(grammarAccess.getRenameColumnPrependPairAccess().getPrefixSTRINGTerminalRuleCall_2_0(), semanticObject.getPrefix());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RenameColumnPair returns RenameColumnReplacePair
	 *     RenameColumnReplacePair returns RenameColumnReplacePair
	 *
	 * Constraint:
	 *     (oldName=STRING replacement=STRING)
	 * </pre>
	 */
	protected void sequence_RenameColumnReplacePair(ISerializationContext context, RenameColumnReplacePair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_PAIR__OLD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_PAIR__OLD_NAME));
			if (transientValues.isValueTransient(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_REPLACE_PAIR__REPLACEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_REPLACE_PAIR__REPLACEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRenameColumnReplacePairAccess().getOldNameSTRINGTerminalRuleCall_0_0(), semanticObject.getOldName());
		feeder.accept(grammarAccess.getRenameColumnReplacePairAccess().getReplacementSTRINGTerminalRuleCall_3_0(), semanticObject.getReplacement());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RenameColumnPair returns RenameColumnToPair
	 *     RenameColumnToPair returns RenameColumnToPair
	 *
	 * Constraint:
	 *     (oldName=STRING newName=STRING)
	 * </pre>
	 */
	protected void sequence_RenameColumnToPair(ISerializationContext context, RenameColumnToPair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_PAIR__OLD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_PAIR__OLD_NAME));
			if (transientValues.isValueTransient(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_TO_PAIR__NEW_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TableDSLPackage.Literals.RENAME_COLUMN_TO_PAIR__NEW_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRenameColumnToPairAccess().getOldNameSTRINGTerminalRuleCall_0_0(), semanticObject.getOldName());
		feeder.accept(grammarAccess.getRenameColumnToPairAccess().getNewNameSTRINGTerminalRuleCall_2_0(), semanticObject.getNewName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TableAction returns RenameColumn
	 *     Operation returns RenameColumn
	 *     RenameColumn returns RenameColumn
	 *
	 * Constraint:
	 *     (renameTuples+=RenameColumnPair renameTuples+=RenameColumnPair*)
	 * </pre>
	 */
	protected void sequence_RenameColumn(ISerializationContext context, RenameColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TableAction returns Select
	 *     Operation returns Select
	 *     Select returns Select
	 *
	 * Constraint:
	 *     (columnPatterns+=ColumnName columnPatterns+=ColumnName*)
	 * </pre>
	 */
	protected void sequence_Select(ISerializationContext context, Select semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TableAction returns SquashRows
	 *     Operation returns SquashRows
	 *     SquashRows returns SquashRows
	 *
	 * Constraint:
	 *     (columns+=ColumnName columns+=ColumnName*)
	 * </pre>
	 */
	protected void sequence_SquashRows(ISerializationContext context, SquashRows semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Start returns Start
	 *
	 * Constraint:
	 *     ((actions+=CreateTable actions+=TableAction+) | actions+=TableAction+)?
	 * </pre>
	 */
	protected void sequence_Start(ISerializationContext context, Start semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CreateTable returns TableInputPath
	 *     TableAction returns TableInputPath
	 *     LoadData returns TableInputPath
	 *     TableInputPath returns TableInputPath
	 *
	 * Constraint:
	 *     (pathPatterns+=STRING pathPatterns+=STRING*)
	 * </pre>
	 */
	protected void sequence_TableInputPath(ISerializationContext context, TableInputPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Selector returns TopNSelector
	 *     TopNSelector returns TopNSelector
	 *
	 * Constraint:
	 *     n=INT
	 * </pre>
	 */
	protected void sequence_TopNSelector(ISerializationContext context, TopNSelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TableDSLPackage.Literals.TOP_NSELECTOR__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TableDSLPackage.Literals.TOP_NSELECTOR__N));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTopNSelectorAccess().getNINTTerminalRuleCall_1_0(), semanticObject.getN());
		feeder.finish();
	}
	
	
}
