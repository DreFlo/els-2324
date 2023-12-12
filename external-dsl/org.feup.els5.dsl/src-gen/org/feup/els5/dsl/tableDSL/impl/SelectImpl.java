/**
 * generated by Xtext 2.33.0
 */
package org.feup.els5.dsl.tableDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.feup.els5.dsl.tableDSL.ColumnName;
import org.feup.els5.dsl.tableDSL.Select;
import org.feup.els5.dsl.tableDSL.TableDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.feup.els5.dsl.tableDSL.impl.SelectImpl#getColumnPatterns <em>Column Patterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectImpl extends OperationImpl implements Select
{
  /**
   * The cached value of the '{@link #getColumnPatterns() <em>Column Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnPatterns()
   * @generated
   * @ordered
   */
  protected EList<ColumnName> columnPatterns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TableDSLPackage.Literals.SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ColumnName> getColumnPatterns()
  {
    if (columnPatterns == null)
    {
      columnPatterns = new EObjectContainmentEList<ColumnName>(ColumnName.class, this, TableDSLPackage.SELECT__COLUMN_PATTERNS);
    }
    return columnPatterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TableDSLPackage.SELECT__COLUMN_PATTERNS:
        return ((InternalEList<?>)getColumnPatterns()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TableDSLPackage.SELECT__COLUMN_PATTERNS:
        return getColumnPatterns();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TableDSLPackage.SELECT__COLUMN_PATTERNS:
        getColumnPatterns().clear();
        getColumnPatterns().addAll((Collection<? extends ColumnName>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TableDSLPackage.SELECT__COLUMN_PATTERNS:
        getColumnPatterns().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TableDSLPackage.SELECT__COLUMN_PATTERNS:
        return columnPatterns != null && !columnPatterns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectImpl
