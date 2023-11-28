/**
 * generated by Xtext 2.32.0
 */
package org.feup.els5.dsl.tableDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.feup.els5.dsl.tableDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.feup.els5.dsl.tableDSL.TableDSLPackage
 * @generated
 */
public class TableDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TableDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TableDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableDSLSwitch<Adapter> modelSwitch =
    new TableDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseStart(Start object)
      {
        return createStartAdapter();
      }
      @Override
      public Adapter caseCreateTable(CreateTable object)
      {
        return createCreateTableAdapter();
      }
      @Override
      public Adapter caseTableAction(TableAction object)
      {
        return createTableActionAdapter();
      }
      @Override
      public Adapter caseLoadData(LoadData object)
      {
        return createLoadDataAdapter();
      }
      @Override
      public Adapter caseTableInputPath(TableInputPath object)
      {
        return createTableInputPathAdapter();
      }
      @Override
      public Adapter caseOutput(Output object)
      {
        return createOutputAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseSelect(Select object)
      {
        return createSelectAdapter();
      }
      @Override
      public Adapter caseRenameColumn(RenameColumn object)
      {
        return createRenameColumnAdapter();
      }
      @Override
      public Adapter caseRenameColumnPair(RenameColumnPair object)
      {
        return createRenameColumnPairAdapter();
      }
      @Override
      public Adapter caseRenameColumnToPair(RenameColumnToPair object)
      {
        return createRenameColumnToPairAdapter();
      }
      @Override
      public Adapter caseRenameColumnPrependPair(RenameColumnPrependPair object)
      {
        return createRenameColumnPrependPairAdapter();
      }
      @Override
      public Adapter caseRenameColumnAppendPair(RenameColumnAppendPair object)
      {
        return createRenameColumnAppendPairAdapter();
      }
      @Override
      public Adapter caseExtract(Extract object)
      {
        return createExtractAdapter();
      }
      @Override
      public Adapter caseSelector(Selector object)
      {
        return createSelectorAdapter();
      }
      @Override
      public Adapter caseComparator(Comparator object)
      {
        return createComparatorAdapter();
      }
      @Override
      public Adapter caseSquashRows(SquashRows object)
      {
        return createSquashRowsAdapter();
      }
      @Override
      public Adapter caseFilter(Filter object)
      {
        return createFilterAdapter();
      }
      @Override
      public Adapter caseFilterDenylist(FilterDenylist object)
      {
        return createFilterDenylistAdapter();
      }
      @Override
      public Adapter caseFilterExceptlist(FilterExceptlist object)
      {
        return createFilterExceptlistAdapter();
      }
      @Override
      public Adapter caseFilterRule(FilterRule object)
      {
        return createFilterRuleAdapter();
      }
      @Override
      public Adapter caseFilterObjectTypeRule(FilterObjectTypeRule object)
      {
        return createFilterObjectTypeRuleAdapter();
      }
      @Override
      public Adapter caseFilterColumnRule(FilterColumnRule object)
      {
        return createFilterColumnRuleAdapter();
      }
      @Override
      public Adapter caseColumnName(ColumnName object)
      {
        return createColumnNameAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.Start
   * @generated
   */
  public Adapter createStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.CreateTable <em>Create Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.CreateTable
   * @generated
   */
  public Adapter createCreateTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.TableAction <em>Table Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.TableAction
   * @generated
   */
  public Adapter createTableActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.LoadData <em>Load Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.LoadData
   * @generated
   */
  public Adapter createLoadDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.TableInputPath <em>Table Input Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.TableInputPath
   * @generated
   */
  public Adapter createTableInputPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.Output
   * @generated
   */
  public Adapter createOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.Select
   * @generated
   */
  public Adapter createSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.RenameColumn <em>Rename Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.RenameColumn
   * @generated
   */
  public Adapter createRenameColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.RenameColumnPair <em>Rename Column Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.RenameColumnPair
   * @generated
   */
  public Adapter createRenameColumnPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.RenameColumnToPair <em>Rename Column To Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.RenameColumnToPair
   * @generated
   */
  public Adapter createRenameColumnToPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.RenameColumnPrependPair <em>Rename Column Prepend Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.RenameColumnPrependPair
   * @generated
   */
  public Adapter createRenameColumnPrependPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.RenameColumnAppendPair <em>Rename Column Append Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.RenameColumnAppendPair
   * @generated
   */
  public Adapter createRenameColumnAppendPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.Extract <em>Extract</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.Extract
   * @generated
   */
  public Adapter createExtractAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.Selector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.Selector
   * @generated
   */
  public Adapter createSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.Comparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.Comparator
   * @generated
   */
  public Adapter createComparatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.SquashRows <em>Squash Rows</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.SquashRows
   * @generated
   */
  public Adapter createSquashRowsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.Filter
   * @generated
   */
  public Adapter createFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.FilterDenylist <em>Filter Denylist</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.FilterDenylist
   * @generated
   */
  public Adapter createFilterDenylistAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.FilterExceptlist <em>Filter Exceptlist</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.FilterExceptlist
   * @generated
   */
  public Adapter createFilterExceptlistAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.FilterRule <em>Filter Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.FilterRule
   * @generated
   */
  public Adapter createFilterRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.FilterObjectTypeRule <em>Filter Object Type Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.FilterObjectTypeRule
   * @generated
   */
  public Adapter createFilterObjectTypeRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.FilterColumnRule <em>Filter Column Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.FilterColumnRule
   * @generated
   */
  public Adapter createFilterColumnRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.feup.els5.dsl.tableDSL.ColumnName <em>Column Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.feup.els5.dsl.tableDSL.ColumnName
   * @generated
   */
  public Adapter createColumnNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TableDSLAdapterFactory
