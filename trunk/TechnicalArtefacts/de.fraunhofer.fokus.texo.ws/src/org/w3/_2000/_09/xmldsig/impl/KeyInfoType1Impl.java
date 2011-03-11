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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.KeyInfoType1;
import org.w3._2000._09.xmldsig.KeyValueType1;
import org.w3._2000._09.xmldsig.PGPDataType1;
import org.w3._2000._09.xmldsig.RetrievalMethodType1;
import org.w3._2000._09.xmldsig.SPKIDataType1;
import org.w3._2000._09.xmldsig.X509DataType1;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Info Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl#getKeyValue <em>Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl#getRetrievalMethod <em>Retrieval Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl#getX509Data <em>X509 Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl#getPGPData <em>PGP Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl#getSPKIData <em>SPKI Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl#getMgmtData <em>Mgmt Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyInfoType1Impl extends EObjectImpl implements KeyInfoType1 {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyInfoType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.KEY_INFO_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmldsigPackage.KEY_INFO_TYPE1__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XmldsigPackage.Literals.KEY_INFO_TYPE1__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeyName() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE1__KEY_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValueType1> getKeyValue() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE1__KEY_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RetrievalMethodType1> getRetrievalMethod() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE1__RETRIEVAL_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<X509DataType1> getX509Data() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE1__X509_DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PGPDataType1> getPGPData() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE1__PGP_DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPKIDataType1> getSPKIData() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE1__SPKI_DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMgmtData() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE1__MGMT_DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(XmldsigPackage.Literals.KEY_INFO_TYPE1__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.KEY_INFO_TYPE1__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmldsigPackage.KEY_INFO_TYPE1__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.KEY_INFO_TYPE1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.KEY_INFO_TYPE1__KEY_VALUE:
				return ((InternalEList<?>)getKeyValue()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.KEY_INFO_TYPE1__RETRIEVAL_METHOD:
				return ((InternalEList<?>)getRetrievalMethod()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.KEY_INFO_TYPE1__X509_DATA:
				return ((InternalEList<?>)getX509Data()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.KEY_INFO_TYPE1__PGP_DATA:
				return ((InternalEList<?>)getPGPData()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.KEY_INFO_TYPE1__SPKI_DATA:
				return ((InternalEList<?>)getSPKIData()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.KEY_INFO_TYPE1__ANY:
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
			case XmldsigPackage.KEY_INFO_TYPE1__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XmldsigPackage.KEY_INFO_TYPE1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XmldsigPackage.KEY_INFO_TYPE1__KEY_NAME:
				return getKeyName();
			case XmldsigPackage.KEY_INFO_TYPE1__KEY_VALUE:
				return getKeyValue();
			case XmldsigPackage.KEY_INFO_TYPE1__RETRIEVAL_METHOD:
				return getRetrievalMethod();
			case XmldsigPackage.KEY_INFO_TYPE1__X509_DATA:
				return getX509Data();
			case XmldsigPackage.KEY_INFO_TYPE1__PGP_DATA:
				return getPGPData();
			case XmldsigPackage.KEY_INFO_TYPE1__SPKI_DATA:
				return getSPKIData();
			case XmldsigPackage.KEY_INFO_TYPE1__MGMT_DATA:
				return getMgmtData();
			case XmldsigPackage.KEY_INFO_TYPE1__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XmldsigPackage.KEY_INFO_TYPE1__ID:
				return getId();
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
			case XmldsigPackage.KEY_INFO_TYPE1__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__KEY_NAME:
				getKeyName().clear();
				getKeyName().addAll((Collection<? extends String>)newValue);
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__KEY_VALUE:
				getKeyValue().clear();
				getKeyValue().addAll((Collection<? extends KeyValueType1>)newValue);
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__RETRIEVAL_METHOD:
				getRetrievalMethod().clear();
				getRetrievalMethod().addAll((Collection<? extends RetrievalMethodType1>)newValue);
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__X509_DATA:
				getX509Data().clear();
				getX509Data().addAll((Collection<? extends X509DataType1>)newValue);
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__PGP_DATA:
				getPGPData().clear();
				getPGPData().addAll((Collection<? extends PGPDataType1>)newValue);
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__SPKI_DATA:
				getSPKIData().clear();
				getSPKIData().addAll((Collection<? extends SPKIDataType1>)newValue);
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__MGMT_DATA:
				getMgmtData().clear();
				getMgmtData().addAll((Collection<? extends String>)newValue);
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__ID:
				setId((String)newValue);
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
			case XmldsigPackage.KEY_INFO_TYPE1__MIXED:
				getMixed().clear();
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__GROUP:
				getGroup().clear();
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__KEY_NAME:
				getKeyName().clear();
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__KEY_VALUE:
				getKeyValue().clear();
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__RETRIEVAL_METHOD:
				getRetrievalMethod().clear();
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__X509_DATA:
				getX509Data().clear();
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__PGP_DATA:
				getPGPData().clear();
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__SPKI_DATA:
				getSPKIData().clear();
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__MGMT_DATA:
				getMgmtData().clear();
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__ANY:
				getAny().clear();
				return;
			case XmldsigPackage.KEY_INFO_TYPE1__ID:
				setId(ID_EDEFAULT);
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
			case XmldsigPackage.KEY_INFO_TYPE1__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XmldsigPackage.KEY_INFO_TYPE1__GROUP:
				return !getGroup().isEmpty();
			case XmldsigPackage.KEY_INFO_TYPE1__KEY_NAME:
				return !getKeyName().isEmpty();
			case XmldsigPackage.KEY_INFO_TYPE1__KEY_VALUE:
				return !getKeyValue().isEmpty();
			case XmldsigPackage.KEY_INFO_TYPE1__RETRIEVAL_METHOD:
				return !getRetrievalMethod().isEmpty();
			case XmldsigPackage.KEY_INFO_TYPE1__X509_DATA:
				return !getX509Data().isEmpty();
			case XmldsigPackage.KEY_INFO_TYPE1__PGP_DATA:
				return !getPGPData().isEmpty();
			case XmldsigPackage.KEY_INFO_TYPE1__SPKI_DATA:
				return !getSPKIData().isEmpty();
			case XmldsigPackage.KEY_INFO_TYPE1__MGMT_DATA:
				return !getMgmtData().isEmpty();
			case XmldsigPackage.KEY_INFO_TYPE1__ANY:
				return !getAny().isEmpty();
			case XmldsigPackage.KEY_INFO_TYPE1__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //KeyInfoType1Impl
