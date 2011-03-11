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

import org.w3._2000._09.xmldsig.DSAKeyValueType;
import org.w3._2000._09.xmldsig.KeyValueType;
import org.w3._2000._09.xmldsig.RSAKeyValueType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyValueTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyValueTypeImpl#getDSAKeyValue <em>DSA Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyValueTypeImpl#getRSAKeyValue <em>RSA Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyValueTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyValueTypeImpl extends EObjectImpl implements KeyValueType {
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
	protected KeyValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.KEY_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmldsigPackage.KEY_VALUE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAKeyValueType getDSAKeyValue() {
		return (DSAKeyValueType)getMixed().get(XmldsigPackage.Literals.KEY_VALUE_TYPE__DSA_KEY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSAKeyValue(DSAKeyValueType newDSAKeyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.KEY_VALUE_TYPE__DSA_KEY_VALUE, newDSAKeyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSAKeyValue(DSAKeyValueType newDSAKeyValue) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.KEY_VALUE_TYPE__DSA_KEY_VALUE, newDSAKeyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSAKeyValueType getRSAKeyValue() {
		return (RSAKeyValueType)getMixed().get(XmldsigPackage.Literals.KEY_VALUE_TYPE__RSA_KEY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRSAKeyValue(RSAKeyValueType newRSAKeyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.KEY_VALUE_TYPE__RSA_KEY_VALUE, newRSAKeyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSAKeyValue(RSAKeyValueType newRSAKeyValue) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.KEY_VALUE_TYPE__RSA_KEY_VALUE, newRSAKeyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XmldsigPackage.Literals.KEY_VALUE_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmldsigPackage.KEY_VALUE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.KEY_VALUE_TYPE__DSA_KEY_VALUE:
				return basicSetDSAKeyValue(null, msgs);
			case XmldsigPackage.KEY_VALUE_TYPE__RSA_KEY_VALUE:
				return basicSetRSAKeyValue(null, msgs);
			case XmldsigPackage.KEY_VALUE_TYPE__ANY:
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
			case XmldsigPackage.KEY_VALUE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XmldsigPackage.KEY_VALUE_TYPE__DSA_KEY_VALUE:
				return getDSAKeyValue();
			case XmldsigPackage.KEY_VALUE_TYPE__RSA_KEY_VALUE:
				return getRSAKeyValue();
			case XmldsigPackage.KEY_VALUE_TYPE__ANY:
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
			case XmldsigPackage.KEY_VALUE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XmldsigPackage.KEY_VALUE_TYPE__DSA_KEY_VALUE:
				setDSAKeyValue((DSAKeyValueType)newValue);
				return;
			case XmldsigPackage.KEY_VALUE_TYPE__RSA_KEY_VALUE:
				setRSAKeyValue((RSAKeyValueType)newValue);
				return;
			case XmldsigPackage.KEY_VALUE_TYPE__ANY:
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
			case XmldsigPackage.KEY_VALUE_TYPE__MIXED:
				getMixed().clear();
				return;
			case XmldsigPackage.KEY_VALUE_TYPE__DSA_KEY_VALUE:
				setDSAKeyValue((DSAKeyValueType)null);
				return;
			case XmldsigPackage.KEY_VALUE_TYPE__RSA_KEY_VALUE:
				setRSAKeyValue((RSAKeyValueType)null);
				return;
			case XmldsigPackage.KEY_VALUE_TYPE__ANY:
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
			case XmldsigPackage.KEY_VALUE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XmldsigPackage.KEY_VALUE_TYPE__DSA_KEY_VALUE:
				return getDSAKeyValue() != null;
			case XmldsigPackage.KEY_VALUE_TYPE__RSA_KEY_VALUE:
				return getRSAKeyValue() != null;
			case XmldsigPackage.KEY_VALUE_TYPE__ANY:
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

} //KeyValueTypeImpl
