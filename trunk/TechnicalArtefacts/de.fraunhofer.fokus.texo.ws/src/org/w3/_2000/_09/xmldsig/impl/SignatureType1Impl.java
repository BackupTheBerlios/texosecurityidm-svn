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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.KeyInfoType1;
import org.w3._2000._09.xmldsig.ObjectType1;
import org.w3._2000._09.xmldsig.SignatureType1;
import org.w3._2000._09.xmldsig.SignatureValueType1;
import org.w3._2000._09.xmldsig.SignedInfoType1;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignatureType1Impl#getSignedInfo <em>Signed Info</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignatureType1Impl#getSignatureValue <em>Signature Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignatureType1Impl#getKeyInfo <em>Key Info</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignatureType1Impl#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignatureType1Impl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureType1Impl extends EObjectImpl implements SignatureType1 {
	/**
	 * The cached value of the '{@link #getSignedInfo() <em>Signed Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignedInfo()
	 * @generated
	 * @ordered
	 */
	protected SignedInfoType1 signedInfo;

	/**
	 * The cached value of the '{@link #getSignatureValue() <em>Signature Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureValue()
	 * @generated
	 * @ordered
	 */
	protected SignatureValueType1 signatureValue;

	/**
	 * The cached value of the '{@link #getKeyInfo() <em>Key Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyInfo()
	 * @generated
	 * @ordered
	 */
	protected KeyInfoType1 keyInfo;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectType1> object;

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
	protected SignatureType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.SIGNATURE_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedInfoType1 getSignedInfo() {
		return signedInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignedInfo(SignedInfoType1 newSignedInfo, NotificationChain msgs) {
		SignedInfoType1 oldSignedInfo = signedInfo;
		signedInfo = newSignedInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNATURE_TYPE1__SIGNED_INFO, oldSignedInfo, newSignedInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedInfo(SignedInfoType1 newSignedInfo) {
		if (newSignedInfo != signedInfo) {
			NotificationChain msgs = null;
			if (signedInfo != null)
				msgs = ((InternalEObject)signedInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmldsigPackage.SIGNATURE_TYPE1__SIGNED_INFO, null, msgs);
			if (newSignedInfo != null)
				msgs = ((InternalEObject)newSignedInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmldsigPackage.SIGNATURE_TYPE1__SIGNED_INFO, null, msgs);
			msgs = basicSetSignedInfo(newSignedInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNATURE_TYPE1__SIGNED_INFO, newSignedInfo, newSignedInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureValueType1 getSignatureValue() {
		return signatureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureValue(SignatureValueType1 newSignatureValue, NotificationChain msgs) {
		SignatureValueType1 oldSignatureValue = signatureValue;
		signatureValue = newSignatureValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNATURE_TYPE1__SIGNATURE_VALUE, oldSignatureValue, newSignatureValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureValue(SignatureValueType1 newSignatureValue) {
		if (newSignatureValue != signatureValue) {
			NotificationChain msgs = null;
			if (signatureValue != null)
				msgs = ((InternalEObject)signatureValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmldsigPackage.SIGNATURE_TYPE1__SIGNATURE_VALUE, null, msgs);
			if (newSignatureValue != null)
				msgs = ((InternalEObject)newSignatureValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmldsigPackage.SIGNATURE_TYPE1__SIGNATURE_VALUE, null, msgs);
			msgs = basicSetSignatureValue(newSignatureValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNATURE_TYPE1__SIGNATURE_VALUE, newSignatureValue, newSignatureValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyInfoType1 getKeyInfo() {
		return keyInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyInfo(KeyInfoType1 newKeyInfo, NotificationChain msgs) {
		KeyInfoType1 oldKeyInfo = keyInfo;
		keyInfo = newKeyInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNATURE_TYPE1__KEY_INFO, oldKeyInfo, newKeyInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyInfo(KeyInfoType1 newKeyInfo) {
		if (newKeyInfo != keyInfo) {
			NotificationChain msgs = null;
			if (keyInfo != null)
				msgs = ((InternalEObject)keyInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmldsigPackage.SIGNATURE_TYPE1__KEY_INFO, null, msgs);
			if (newKeyInfo != null)
				msgs = ((InternalEObject)newKeyInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmldsigPackage.SIGNATURE_TYPE1__KEY_INFO, null, msgs);
			msgs = basicSetKeyInfo(newKeyInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNATURE_TYPE1__KEY_INFO, newKeyInfo, newKeyInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectType1> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<ObjectType1>(ObjectType1.class, this, XmldsigPackage.SIGNATURE_TYPE1__OBJECT);
		}
		return object;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNATURE_TYPE1__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmldsigPackage.SIGNATURE_TYPE1__SIGNED_INFO:
				return basicSetSignedInfo(null, msgs);
			case XmldsigPackage.SIGNATURE_TYPE1__SIGNATURE_VALUE:
				return basicSetSignatureValue(null, msgs);
			case XmldsigPackage.SIGNATURE_TYPE1__KEY_INFO:
				return basicSetKeyInfo(null, msgs);
			case XmldsigPackage.SIGNATURE_TYPE1__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
			case XmldsigPackage.SIGNATURE_TYPE1__SIGNED_INFO:
				return getSignedInfo();
			case XmldsigPackage.SIGNATURE_TYPE1__SIGNATURE_VALUE:
				return getSignatureValue();
			case XmldsigPackage.SIGNATURE_TYPE1__KEY_INFO:
				return getKeyInfo();
			case XmldsigPackage.SIGNATURE_TYPE1__OBJECT:
				return getObject();
			case XmldsigPackage.SIGNATURE_TYPE1__ID:
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
			case XmldsigPackage.SIGNATURE_TYPE1__SIGNED_INFO:
				setSignedInfo((SignedInfoType1)newValue);
				return;
			case XmldsigPackage.SIGNATURE_TYPE1__SIGNATURE_VALUE:
				setSignatureValue((SignatureValueType1)newValue);
				return;
			case XmldsigPackage.SIGNATURE_TYPE1__KEY_INFO:
				setKeyInfo((KeyInfoType1)newValue);
				return;
			case XmldsigPackage.SIGNATURE_TYPE1__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends ObjectType1>)newValue);
				return;
			case XmldsigPackage.SIGNATURE_TYPE1__ID:
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
			case XmldsigPackage.SIGNATURE_TYPE1__SIGNED_INFO:
				setSignedInfo((SignedInfoType1)null);
				return;
			case XmldsigPackage.SIGNATURE_TYPE1__SIGNATURE_VALUE:
				setSignatureValue((SignatureValueType1)null);
				return;
			case XmldsigPackage.SIGNATURE_TYPE1__KEY_INFO:
				setKeyInfo((KeyInfoType1)null);
				return;
			case XmldsigPackage.SIGNATURE_TYPE1__OBJECT:
				getObject().clear();
				return;
			case XmldsigPackage.SIGNATURE_TYPE1__ID:
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
			case XmldsigPackage.SIGNATURE_TYPE1__SIGNED_INFO:
				return signedInfo != null;
			case XmldsigPackage.SIGNATURE_TYPE1__SIGNATURE_VALUE:
				return signatureValue != null;
			case XmldsigPackage.SIGNATURE_TYPE1__KEY_INFO:
				return keyInfo != null;
			case XmldsigPackage.SIGNATURE_TYPE1__OBJECT:
				return object != null && !object.isEmpty();
			case XmldsigPackage.SIGNATURE_TYPE1__ID:
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SignatureType1Impl
