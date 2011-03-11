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
package org.w3._2000._09.xmldsig.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.DSAKeyValueType1;
import org.w3._2000._09.xmldsig.KeyValueType1;
import org.w3._2000._09.xmldsig.RSAKeyValueType1;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Value Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyValueType1Impl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyValueType1Impl#getDSAKeyValue <em>DSA Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyValueType1Impl#getRSAKeyValue <em>RSA Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyValueType1Impl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyValueType1Impl extends EObjectImpl implements KeyValueType1 {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyValueType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.KEY_VALUE_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmldsigPackage.KEY_VALUE_TYPE1__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAKeyValueType1 getDSAKeyValue() {
		return (DSAKeyValueType1)getMixed().get(XmldsigPackage.Literals.KEY_VALUE_TYPE1__DSA_KEY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSAKeyValue(DSAKeyValueType1 newDSAKeyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.KEY_VALUE_TYPE1__DSA_KEY_VALUE, newDSAKeyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSAKeyValue(DSAKeyValueType1 newDSAKeyValue) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.KEY_VALUE_TYPE1__DSA_KEY_VALUE, newDSAKeyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSAKeyValueType1 getRSAKeyValue() {
		return (RSAKeyValueType1)getMixed().get(XmldsigPackage.Literals.KEY_VALUE_TYPE1__RSA_KEY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRSAKeyValue(RSAKeyValueType1 newRSAKeyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.KEY_VALUE_TYPE1__RSA_KEY_VALUE, newRSAKeyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSAKeyValue(RSAKeyValueType1 newRSAKeyValue) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.KEY_VALUE_TYPE1__RSA_KEY_VALUE, newRSAKeyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XmldsigPackage.Literals.KEY_VALUE_TYPE1__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmldsigPackage.KEY_VALUE_TYPE1__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.KEY_VALUE_TYPE1__DSA_KEY_VALUE:
				return basicSetDSAKeyValue(null, msgs);
			case XmldsigPackage.KEY_VALUE_TYPE1__RSA_KEY_VALUE:
				return basicSetRSAKeyValue(null, msgs);
			case XmldsigPackage.KEY_VALUE_TYPE1__ANY:
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
			case XmldsigPackage.KEY_VALUE_TYPE1__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XmldsigPackage.KEY_VALUE_TYPE1__DSA_KEY_VALUE:
				return getDSAKeyValue();
			case XmldsigPackage.KEY_VALUE_TYPE1__RSA_KEY_VALUE:
				return getRSAKeyValue();
			case XmldsigPackage.KEY_VALUE_TYPE1__ANY:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmldsigPackage.KEY_VALUE_TYPE1__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XmldsigPackage.KEY_VALUE_TYPE1__DSA_KEY_VALUE:
				setDSAKeyValue((DSAKeyValueType1)newValue);
				return;
			case XmldsigPackage.KEY_VALUE_TYPE1__RSA_KEY_VALUE:
				setRSAKeyValue((RSAKeyValueType1)newValue);
				return;
			case XmldsigPackage.KEY_VALUE_TYPE1__ANY:
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
			case XmldsigPackage.KEY_VALUE_TYPE1__MIXED:
				getMixed().clear();
				return;
			case XmldsigPackage.KEY_VALUE_TYPE1__DSA_KEY_VALUE:
				setDSAKeyValue((DSAKeyValueType1)null);
				return;
			case XmldsigPackage.KEY_VALUE_TYPE1__RSA_KEY_VALUE:
				setRSAKeyValue((RSAKeyValueType1)null);
				return;
			case XmldsigPackage.KEY_VALUE_TYPE1__ANY:
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
			case XmldsigPackage.KEY_VALUE_TYPE1__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XmldsigPackage.KEY_VALUE_TYPE1__DSA_KEY_VALUE:
				return getDSAKeyValue() != null;
			case XmldsigPackage.KEY_VALUE_TYPE1__RSA_KEY_VALUE:
				return getRSAKeyValue() != null;
			case XmldsigPackage.KEY_VALUE_TYPE1__ANY:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //KeyValueType1Impl
