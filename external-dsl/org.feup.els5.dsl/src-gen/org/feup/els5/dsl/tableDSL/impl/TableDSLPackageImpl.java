/**
 * generated by Xtext 2.32.0
 */
package org.feup.els5.dsl.tableDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.feup.els5.dsl.tableDSL.ColumnName;
import org.feup.els5.dsl.tableDSL.Comparator;
import org.feup.els5.dsl.tableDSL.CreateTable;
import org.feup.els5.dsl.tableDSL.Extract;
import org.feup.els5.dsl.tableDSL.ExtractColumnMapping;
import org.feup.els5.dsl.tableDSL.Filter;
import org.feup.els5.dsl.tableDSL.FilterColumnRule;
import org.feup.els5.dsl.tableDSL.FilterDenylist;
import org.feup.els5.dsl.tableDSL.FilterExceptlist;
import org.feup.els5.dsl.tableDSL.FilterObjectTypeRule;
import org.feup.els5.dsl.tableDSL.FilterRule;
import org.feup.els5.dsl.tableDSL.KeySelector;
import org.feup.els5.dsl.tableDSL.LoadData;
import org.feup.els5.dsl.tableDSL.ObjectTypeSelector;
import org.feup.els5.dsl.tableDSL.Operation;
import org.feup.els5.dsl.tableDSL.Output;
import org.feup.els5.dsl.tableDSL.Reduce;
import org.feup.els5.dsl.tableDSL.RenameColumn;
import org.feup.els5.dsl.tableDSL.RenameColumnAppendPair;
import org.feup.els5.dsl.tableDSL.RenameColumnPair;
import org.feup.els5.dsl.tableDSL.RenameColumnPrependPair;
import org.feup.els5.dsl.tableDSL.RenameColumnReplacePair;
import org.feup.els5.dsl.tableDSL.RenameColumnToPair;
import org.feup.els5.dsl.tableDSL.Select;
import org.feup.els5.dsl.tableDSL.Selector;
import org.feup.els5.dsl.tableDSL.SquashRows;
import org.feup.els5.dsl.tableDSL.Start;
import org.feup.els5.dsl.tableDSL.TableAction;
import org.feup.els5.dsl.tableDSL.TableDSLFactory;
import org.feup.els5.dsl.tableDSL.TableDSLPackage;
import org.feup.els5.dsl.tableDSL.TableInputPath;
import org.feup.els5.dsl.tableDSL.TopNSelector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableDSLPackageImpl extends EPackageImpl implements TableDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableInputPathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass renameColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass renameColumnPairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass renameColumnToPairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass renameColumnPrependPairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass renameColumnAppendPairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass renameColumnReplacePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extractEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extractColumnMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keySelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topNSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass squashRowsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterDenylistEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterExceptlistEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterColumnRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterObjectTypeRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reduceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectTypeSelectorEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.feup.els5.dsl.tableDSL.TableDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TableDSLPackageImpl()
  {
    super(eNS_URI, TableDSLFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link TableDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TableDSLPackage init()
  {
    if (isInited) return (TableDSLPackage)EPackage.Registry.INSTANCE.getEPackage(TableDSLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTableDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TableDSLPackageImpl theTableDSLPackage = registeredTableDSLPackage instanceof TableDSLPackageImpl ? (TableDSLPackageImpl)registeredTableDSLPackage : new TableDSLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTableDSLPackage.createPackageContents();

    // Initialize created meta-data
    theTableDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTableDSLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TableDSLPackage.eNS_URI, theTableDSLPackage);
    return theTableDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStart()
  {
    return startEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStart_Actions()
  {
    return (EReference)startEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCreateTable()
  {
    return createTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTableAction()
  {
    return tableActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLoadData()
  {
    return loadDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTableInputPath()
  {
    return tableInputPathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTableInputPath_PathPatterns()
  {
    return (EAttribute)tableInputPathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOutput()
  {
    return outputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOutput_OutputPaths()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSelect()
  {
    return selectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSelect_ColumnPatterns()
  {
    return (EReference)selectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRenameColumn()
  {
    return renameColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRenameColumn_RenameTuples()
  {
    return (EReference)renameColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRenameColumnPair()
  {
    return renameColumnPairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRenameColumnPair_OldName()
  {
    return (EAttribute)renameColumnPairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRenameColumnToPair()
  {
    return renameColumnToPairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRenameColumnToPair_NewName()
  {
    return (EAttribute)renameColumnToPairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRenameColumnPrependPair()
  {
    return renameColumnPrependPairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRenameColumnPrependPair_Prefix()
  {
    return (EAttribute)renameColumnPrependPairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRenameColumnAppendPair()
  {
    return renameColumnAppendPairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRenameColumnAppendPair_Suffix()
  {
    return (EAttribute)renameColumnAppendPairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRenameColumnReplacePair()
  {
    return renameColumnReplacePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRenameColumnReplacePair_Replacement()
  {
    return (EAttribute)renameColumnReplacePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExtract()
  {
    return extractEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExtract_Targets()
  {
    return (EReference)extractEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExtract_SourceColumn()
  {
    return (EAttribute)extractEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExtract_Selector()
  {
    return (EReference)extractEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExtract_Comparator()
  {
    return (EReference)extractEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExtractColumnMapping()
  {
    return extractColumnMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExtractColumnMapping_TargetColumn()
  {
    return (EAttribute)extractColumnMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExtractColumnMapping_NewName()
  {
    return (EAttribute)extractColumnMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSelector()
  {
    return selectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getKeySelector()
  {
    return keySelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getKeySelector_Key()
  {
    return (EAttribute)keySelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTopNSelector()
  {
    return topNSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTopNSelector_N()
  {
    return (EAttribute)topNSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComparator()
  {
    return comparatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComparator_Keys()
  {
    return (EReference)comparatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSquashRows()
  {
    return squashRowsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSquashRows_Columns()
  {
    return (EReference)squashRowsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFilter()
  {
    return filterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFilter_Denylist()
  {
    return (EReference)filterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFilter_Exceptlist()
  {
    return (EReference)filterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFilterDenylist()
  {
    return filterDenylistEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFilterDenylist_Denylist()
  {
    return (EReference)filterDenylistEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFilterExceptlist()
  {
    return filterExceptlistEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFilterExceptlist_Exceptlist()
  {
    return (EReference)filterExceptlistEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFilterRule()
  {
    return filterRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFilterColumnRule()
  {
    return filterColumnRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFilterColumnRule_ColumnPatterns()
  {
    return (EReference)filterColumnRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFilterObjectTypeRule()
  {
    return filterObjectTypeRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFilterObjectTypeRule_ObjectClasses()
  {
    return (EReference)filterObjectTypeRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReduce()
  {
    return reduceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getReduce_ObjectClass()
  {
    return (EReference)reduceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReduce_Functions()
  {
    return (EAttribute)reduceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getColumnName()
  {
    return columnNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getColumnName_ColumnName()
  {
    return (EAttribute)columnNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getObjectTypeSelector()
  {
    return objectTypeSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getObjectTypeSelector_ObjectType()
  {
    return (EAttribute)objectTypeSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableDSLFactory getTableDSLFactory()
  {
    return (TableDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    startEClass = createEClass(START);
    createEReference(startEClass, START__ACTIONS);

    createTableEClass = createEClass(CREATE_TABLE);

    tableActionEClass = createEClass(TABLE_ACTION);

    loadDataEClass = createEClass(LOAD_DATA);

    tableInputPathEClass = createEClass(TABLE_INPUT_PATH);
    createEAttribute(tableInputPathEClass, TABLE_INPUT_PATH__PATH_PATTERNS);

    outputEClass = createEClass(OUTPUT);
    createEAttribute(outputEClass, OUTPUT__OUTPUT_PATHS);

    operationEClass = createEClass(OPERATION);

    selectEClass = createEClass(SELECT);
    createEReference(selectEClass, SELECT__COLUMN_PATTERNS);

    renameColumnEClass = createEClass(RENAME_COLUMN);
    createEReference(renameColumnEClass, RENAME_COLUMN__RENAME_TUPLES);

    renameColumnPairEClass = createEClass(RENAME_COLUMN_PAIR);
    createEAttribute(renameColumnPairEClass, RENAME_COLUMN_PAIR__OLD_NAME);

    renameColumnToPairEClass = createEClass(RENAME_COLUMN_TO_PAIR);
    createEAttribute(renameColumnToPairEClass, RENAME_COLUMN_TO_PAIR__NEW_NAME);

    renameColumnPrependPairEClass = createEClass(RENAME_COLUMN_PREPEND_PAIR);
    createEAttribute(renameColumnPrependPairEClass, RENAME_COLUMN_PREPEND_PAIR__PREFIX);

    renameColumnAppendPairEClass = createEClass(RENAME_COLUMN_APPEND_PAIR);
    createEAttribute(renameColumnAppendPairEClass, RENAME_COLUMN_APPEND_PAIR__SUFFIX);

    renameColumnReplacePairEClass = createEClass(RENAME_COLUMN_REPLACE_PAIR);
    createEAttribute(renameColumnReplacePairEClass, RENAME_COLUMN_REPLACE_PAIR__REPLACEMENT);

    extractEClass = createEClass(EXTRACT);
    createEReference(extractEClass, EXTRACT__TARGETS);
    createEAttribute(extractEClass, EXTRACT__SOURCE_COLUMN);
    createEReference(extractEClass, EXTRACT__SELECTOR);
    createEReference(extractEClass, EXTRACT__COMPARATOR);

    extractColumnMappingEClass = createEClass(EXTRACT_COLUMN_MAPPING);
    createEAttribute(extractColumnMappingEClass, EXTRACT_COLUMN_MAPPING__TARGET_COLUMN);
    createEAttribute(extractColumnMappingEClass, EXTRACT_COLUMN_MAPPING__NEW_NAME);

    selectorEClass = createEClass(SELECTOR);

    keySelectorEClass = createEClass(KEY_SELECTOR);
    createEAttribute(keySelectorEClass, KEY_SELECTOR__KEY);

    topNSelectorEClass = createEClass(TOP_NSELECTOR);
    createEAttribute(topNSelectorEClass, TOP_NSELECTOR__N);

    comparatorEClass = createEClass(COMPARATOR);
    createEReference(comparatorEClass, COMPARATOR__KEYS);

    squashRowsEClass = createEClass(SQUASH_ROWS);
    createEReference(squashRowsEClass, SQUASH_ROWS__COLUMNS);

    filterEClass = createEClass(FILTER);
    createEReference(filterEClass, FILTER__DENYLIST);
    createEReference(filterEClass, FILTER__EXCEPTLIST);

    filterDenylistEClass = createEClass(FILTER_DENYLIST);
    createEReference(filterDenylistEClass, FILTER_DENYLIST__DENYLIST);

    filterExceptlistEClass = createEClass(FILTER_EXCEPTLIST);
    createEReference(filterExceptlistEClass, FILTER_EXCEPTLIST__EXCEPTLIST);

    filterRuleEClass = createEClass(FILTER_RULE);

    filterColumnRuleEClass = createEClass(FILTER_COLUMN_RULE);
    createEReference(filterColumnRuleEClass, FILTER_COLUMN_RULE__COLUMN_PATTERNS);

    filterObjectTypeRuleEClass = createEClass(FILTER_OBJECT_TYPE_RULE);
    createEReference(filterObjectTypeRuleEClass, FILTER_OBJECT_TYPE_RULE__OBJECT_CLASSES);

    reduceEClass = createEClass(REDUCE);
    createEReference(reduceEClass, REDUCE__OBJECT_CLASS);
    createEAttribute(reduceEClass, REDUCE__FUNCTIONS);

    columnNameEClass = createEClass(COLUMN_NAME);
    createEAttribute(columnNameEClass, COLUMN_NAME__COLUMN_NAME);

    objectTypeSelectorEClass = createEClass(OBJECT_TYPE_SELECTOR);
    createEAttribute(objectTypeSelectorEClass, OBJECT_TYPE_SELECTOR__OBJECT_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    loadDataEClass.getESuperTypes().add(this.getTableAction());
    tableInputPathEClass.getESuperTypes().add(this.getCreateTable());
    tableInputPathEClass.getESuperTypes().add(this.getLoadData());
    outputEClass.getESuperTypes().add(this.getTableAction());
    operationEClass.getESuperTypes().add(this.getTableAction());
    selectEClass.getESuperTypes().add(this.getOperation());
    renameColumnEClass.getESuperTypes().add(this.getOperation());
    renameColumnToPairEClass.getESuperTypes().add(this.getRenameColumnPair());
    renameColumnPrependPairEClass.getESuperTypes().add(this.getRenameColumnPair());
    renameColumnAppendPairEClass.getESuperTypes().add(this.getRenameColumnPair());
    renameColumnReplacePairEClass.getESuperTypes().add(this.getRenameColumnPair());
    extractEClass.getESuperTypes().add(this.getOperation());
    keySelectorEClass.getESuperTypes().add(this.getSelector());
    topNSelectorEClass.getESuperTypes().add(this.getSelector());
    squashRowsEClass.getESuperTypes().add(this.getOperation());
    filterEClass.getESuperTypes().add(this.getOperation());
    filterColumnRuleEClass.getESuperTypes().add(this.getFilterRule());
    filterObjectTypeRuleEClass.getESuperTypes().add(this.getFilterRule());
    reduceEClass.getESuperTypes().add(this.getOperation());

    // Initialize classes and features; add operations and parameters
    initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStart_Actions(), ecorePackage.getEObject(), null, "actions", null, 0, -1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createTableEClass, CreateTable.class, "CreateTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tableActionEClass, TableAction.class, "TableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(loadDataEClass, LoadData.class, "LoadData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tableInputPathEClass, TableInputPath.class, "TableInputPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableInputPath_PathPatterns(), ecorePackage.getEString(), "pathPatterns", null, 0, -1, TableInputPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutput_OutputPaths(), ecorePackage.getEString(), "outputPaths", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelect_ColumnPatterns(), this.getColumnName(), null, "columnPatterns", null, 0, -1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renameColumnEClass, RenameColumn.class, "RenameColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRenameColumn_RenameTuples(), this.getRenameColumnPair(), null, "renameTuples", null, 0, -1, RenameColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renameColumnPairEClass, RenameColumnPair.class, "RenameColumnPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRenameColumnPair_OldName(), ecorePackage.getEString(), "oldName", null, 0, 1, RenameColumnPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renameColumnToPairEClass, RenameColumnToPair.class, "RenameColumnToPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRenameColumnToPair_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, RenameColumnToPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renameColumnPrependPairEClass, RenameColumnPrependPair.class, "RenameColumnPrependPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRenameColumnPrependPair_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, RenameColumnPrependPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renameColumnAppendPairEClass, RenameColumnAppendPair.class, "RenameColumnAppendPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRenameColumnAppendPair_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, RenameColumnAppendPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renameColumnReplacePairEClass, RenameColumnReplacePair.class, "RenameColumnReplacePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRenameColumnReplacePair_Replacement(), ecorePackage.getEString(), "replacement", null, 0, 1, RenameColumnReplacePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extractEClass, Extract.class, "Extract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtract_Targets(), this.getExtractColumnMapping(), null, "targets", null, 0, -1, Extract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtract_SourceColumn(), ecorePackage.getEString(), "sourceColumn", null, 0, 1, Extract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtract_Selector(), this.getSelector(), null, "selector", null, 0, 1, Extract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtract_Comparator(), this.getComparator(), null, "comparator", null, 0, 1, Extract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extractColumnMappingEClass, ExtractColumnMapping.class, "ExtractColumnMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExtractColumnMapping_TargetColumn(), ecorePackage.getEString(), "targetColumn", null, 0, 1, ExtractColumnMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtractColumnMapping_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, ExtractColumnMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(keySelectorEClass, KeySelector.class, "KeySelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKeySelector_Key(), ecorePackage.getEString(), "key", null, 0, 1, KeySelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topNSelectorEClass, TopNSelector.class, "TopNSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTopNSelector_N(), ecorePackage.getEInt(), "n", null, 0, 1, TopNSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparatorEClass, Comparator.class, "Comparator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComparator_Keys(), this.getColumnName(), null, "keys", null, 0, -1, Comparator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(squashRowsEClass, SquashRows.class, "SquashRows", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSquashRows_Columns(), this.getColumnName(), null, "columns", null, 0, -1, SquashRows.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilter_Denylist(), this.getFilterDenylist(), null, "denylist", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilter_Exceptlist(), this.getFilterExceptlist(), null, "exceptlist", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterDenylistEClass, FilterDenylist.class, "FilterDenylist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterDenylist_Denylist(), this.getFilterRule(), null, "denylist", null, 0, -1, FilterDenylist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterExceptlistEClass, FilterExceptlist.class, "FilterExceptlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterExceptlist_Exceptlist(), this.getFilterRule(), null, "exceptlist", null, 0, -1, FilterExceptlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterRuleEClass, FilterRule.class, "FilterRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(filterColumnRuleEClass, FilterColumnRule.class, "FilterColumnRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterColumnRule_ColumnPatterns(), this.getColumnName(), null, "columnPatterns", null, 0, -1, FilterColumnRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterObjectTypeRuleEClass, FilterObjectTypeRule.class, "FilterObjectTypeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterObjectTypeRule_ObjectClasses(), this.getObjectTypeSelector(), null, "objectClasses", null, 0, -1, FilterObjectTypeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reduceEClass, Reduce.class, "Reduce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReduce_ObjectClass(), this.getObjectTypeSelector(), null, "objectClass", null, 0, 1, Reduce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReduce_Functions(), ecorePackage.getEString(), "functions", null, 0, -1, Reduce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnNameEClass, ColumnName.class, "ColumnName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnName_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, ColumnName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectTypeSelectorEClass, ObjectTypeSelector.class, "ObjectTypeSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectTypeSelector_ObjectType(), ecorePackage.getEString(), "objectType", null, 0, 1, ObjectTypeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TableDSLPackageImpl
