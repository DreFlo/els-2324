/**
 * generated by Xtext 2.33.0
 */
package org.feup.els5.dsl.tableDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.feup.els5.dsl.tableDSL.ColumnName;
import org.feup.els5.dsl.tableDSL.Comparator;
import org.feup.els5.dsl.tableDSL.TableDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.feup.els5.dsl.tableDSL.impl.ComparatorImpl#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparatorImpl extends MinimalEObjectImpl.Container implements Comparator
{
  /**
   * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeys()
   * @generated
   * @ordered
   */
  protected EList<ColumnName> keys;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComparatorImpl()
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
    return TableDSLPackage.Literals.COMPARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ColumnName> getKeys()
  {
    if (keys == null)
    {
      keys = new EObjectContainmentEList<ColumnName>(ColumnName.class, this, TableDSLPackage.COMPARATOR__KEYS);
    }
    return keys;
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
      case TableDSLPackage.COMPARATOR__KEYS:
        return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
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
      case TableDSLPackage.COMPARATOR__KEYS:
        return getKeys();
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
      case TableDSLPackage.COMPARATOR__KEYS:
        getKeys().clear();
        getKeys().addAll((Collection<? extends ColumnName>)newValue);
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
      case TableDSLPackage.COMPARATOR__KEYS:
        getKeys().clear();
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
      case TableDSLPackage.COMPARATOR__KEYS:
        return keys != null && !keys.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComparatorImpl
