/**
 * generated by Xtext 2.32.0
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

import org.feup.els5.dsl.tableDSL.FilterDenylist;
import org.feup.els5.dsl.tableDSL.FilterRule;
import org.feup.els5.dsl.tableDSL.TableDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Denylist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.feup.els5.dsl.tableDSL.impl.FilterDenylistImpl#getDenylist <em>Denylist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterDenylistImpl extends MinimalEObjectImpl.Container implements FilterDenylist
{
  /**
   * The cached value of the '{@link #getDenylist() <em>Denylist</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDenylist()
   * @generated
   * @ordered
   */
  protected EList<FilterRule> denylist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterDenylistImpl()
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
    return TableDSLPackage.Literals.FILTER_DENYLIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FilterRule> getDenylist()
  {
    if (denylist == null)
    {
      denylist = new EObjectContainmentEList<FilterRule>(FilterRule.class, this, TableDSLPackage.FILTER_DENYLIST__DENYLIST);
    }
    return denylist;
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
      case TableDSLPackage.FILTER_DENYLIST__DENYLIST:
        return ((InternalEList<?>)getDenylist()).basicRemove(otherEnd, msgs);
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
      case TableDSLPackage.FILTER_DENYLIST__DENYLIST:
        return getDenylist();
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
      case TableDSLPackage.FILTER_DENYLIST__DENYLIST:
        getDenylist().clear();
        getDenylist().addAll((Collection<? extends FilterRule>)newValue);
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
      case TableDSLPackage.FILTER_DENYLIST__DENYLIST:
        getDenylist().clear();
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
      case TableDSLPackage.FILTER_DENYLIST__DENYLIST:
        return denylist != null && !denylist.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FilterDenylistImpl
