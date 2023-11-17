/**
 * generated by Xtext 2.32.0
 */
package org.feup.els5.dsl.tableDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.feup.els5.dsl.tableDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableDSLFactoryImpl extends EFactoryImpl implements TableDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TableDSLFactory init()
  {
    try
    {
      TableDSLFactory theTableDSLFactory = (TableDSLFactory)EPackage.Registry.INSTANCE.getEFactory(TableDSLPackage.eNS_URI);
      if (theTableDSLFactory != null)
      {
        return theTableDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TableDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TableDSLPackage.START: return createStart();
      case TableDSLPackage.CREATE_TABLE: return createCreateTable();
      case TableDSLPackage.TABLE_ACTION: return createTableAction();
      case TableDSLPackage.LOAD_DATA: return createLoadData();
      case TableDSLPackage.TABLE_INPUT_PATH: return createTableInputPath();
      case TableDSLPackage.OUTPUT: return createOutput();
      case TableDSLPackage.OPERATION: return createOperation();
      case TableDSLPackage.SELECT: return createSelect();
      case TableDSLPackage.RENAME_COLUMN: return createRenameColumn();
      case TableDSLPackage.EXTRACT: return createExtract();
      case TableDSLPackage.SQUASH_ROWS: return createSquashRows();
      case TableDSLPackage.FILTER: return createFilter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Start createStart()
  {
    StartImpl start = new StartImpl();
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateTable createCreateTable()
  {
    CreateTableImpl createTable = new CreateTableImpl();
    return createTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableAction createTableAction()
  {
    TableActionImpl tableAction = new TableActionImpl();
    return tableAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LoadData createLoadData()
  {
    LoadDataImpl loadData = new LoadDataImpl();
    return loadData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableInputPath createTableInputPath()
  {
    TableInputPathImpl tableInputPath = new TableInputPathImpl();
    return tableInputPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RenameColumn createRenameColumn()
  {
    RenameColumnImpl renameColumn = new RenameColumnImpl();
    return renameColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Extract createExtract()
  {
    ExtractImpl extract = new ExtractImpl();
    return extract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SquashRows createSquashRows()
  {
    SquashRowsImpl squashRows = new SquashRowsImpl();
    return squashRows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Filter createFilter()
  {
    FilterImpl filter = new FilterImpl();
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableDSLPackage getTableDSLPackage()
  {
    return (TableDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TableDSLPackage getPackage()
  {
    return TableDSLPackage.eINSTANCE;
  }

} //TableDSLFactoryImpl
