/**
* This file is part of WSSecurityPolicyEditor.
* Copyright (c) 2011 Fraunhofer FOKUS. All Rights Reserved
* Authors: Tom Sattler
* 
* WSSecurityPolicyEditor is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* any later version.
*
* WSSecurityPolicyEditor is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero General Public License for more details.
* 
* You should have received a copy of the GNU Affero General Public License
* along with WSSecurityPolicyEditor.  If not, see <http://www.gnu.org/licenses/>.
* 
* For more information, please contact Fraunhofer FOKUS at this
* address: elankontakt [at] fokus [dot] fraunhofer [dot] de
* http://www.fokus.fraunhofer.de
*/
package org.xmlsoap.schemas.ws._2004._09.wspolicy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Content Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentType1Impl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentType1Impl#getAll <em>All</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentType1Impl#getExactlyOne <em>Exactly One</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentType1Impl#getPolicyReference <em>Policy Reference</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentType1Impl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorContentType1Impl extends EObjectImpl implements OperatorContentType1 {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorContentType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyPackage.Literals.OPERATOR_CONTENT_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, PolicyPackage.OPERATOR_CONTENT_TYPE1__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyType1> getPolicy() {
		return getGroup().list(PolicyPackage.Literals.OPERATOR_CONTENT_TYPE1__POLICY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatorContentType1> getAll() {
		return getGroup().list(PolicyPackage.Literals.OPERATOR_CONTENT_TYPE1__ALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatorContentType1> getExactlyOne() {
		return getGroup().list(PolicyPackage.Literals.OPERATOR_CONTENT_TYPE1__EXACTLY_ONE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyReferenceType1> getPolicyReference() {
		return getGroup().list(PolicyPackage.Literals.OPERATOR_CONTENT_TYPE1__POLICY_REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(PolicyPackage.Literals.OPERATOR_CONTENT_TYPE1__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__ALL:
				return ((InternalEList<?>)getAll()).basicRemove(otherEnd, msgs);
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__EXACTLY_ONE:
				return ((InternalEList<?>)getExactlyOne()).basicRemove(otherEnd, msgs);
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__POLICY_REFERENCE:
				return ((InternalEList<?>)getPolicyReference()).basicRemove(otherEnd, msgs);
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__POLICY:
				return getPolicy();
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__ALL:
				return getAll();
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__EXACTLY_ONE:
				return getExactlyOne();
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__POLICY_REFERENCE:
				return getPolicyReference();
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyType1>)newValue);
				return;
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__ALL:
				getAll().clear();
				getAll().addAll((Collection<? extends OperatorContentType1>)newValue);
				return;
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__EXACTLY_ONE:
				getExactlyOne().clear();
				getExactlyOne().addAll((Collection<? extends OperatorContentType1>)newValue);
				return;
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__POLICY_REFERENCE:
				getPolicyReference().clear();
				getPolicyReference().addAll((Collection<? extends PolicyReferenceType1>)newValue);
				return;
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__GROUP:
				getGroup().clear();
				return;
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__POLICY:
				getPolicy().clear();
				return;
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__ALL:
				getAll().clear();
				return;
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__EXACTLY_ONE:
				getExactlyOne().clear();
				return;
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__POLICY_REFERENCE:
				getPolicyReference().clear();
				return;
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__ANY:
				getAny().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__GROUP:
				return group != null && !group.isEmpty();
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__POLICY:
				return !getPolicy().isEmpty();
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__ALL:
				return !getAll().isEmpty();
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__EXACTLY_ONE:
				return !getExactlyOne().isEmpty();
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__POLICY_REFERENCE:
				return !getPolicyReference().isEmpty();
			case PolicyPackage.OPERATOR_CONTENT_TYPE1__ANY:
				return !getAny().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //OperatorContentType1Impl
