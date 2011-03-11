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
package org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedReferenceType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.SecurityTokenReferenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requested Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedReferenceTypeImpl#getSecurityTokenReference <em>Security Token Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequestedReferenceTypeImpl extends EObjectImpl implements RequestedReferenceType {
	/**
	 * The cached value of the '{@link #getSecurityTokenReference() <em>Security Token Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityTokenReference()
	 * @generated
	 * @ordered
	 */
	protected SecurityTokenReferenceType securityTokenReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestedReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _200512Package.Literals.REQUESTED_REFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityTokenReferenceType getSecurityTokenReference() {
		return securityTokenReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityTokenReference(SecurityTokenReferenceType newSecurityTokenReference, NotificationChain msgs) {
		SecurityTokenReferenceType oldSecurityTokenReference = securityTokenReference;
		securityTokenReference = newSecurityTokenReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _200512Package.REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE, oldSecurityTokenReference, newSecurityTokenReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityTokenReference(SecurityTokenReferenceType newSecurityTokenReference) {
		if (newSecurityTokenReference != securityTokenReference) {
			NotificationChain msgs = null;
			if (securityTokenReference != null)
				msgs = ((InternalEObject)securityTokenReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _200512Package.REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE, null, msgs);
			if (newSecurityTokenReference != null)
				msgs = ((InternalEObject)newSecurityTokenReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _200512Package.REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE, null, msgs);
			msgs = basicSetSecurityTokenReference(newSecurityTokenReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _200512Package.REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE, newSecurityTokenReference, newSecurityTokenReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _200512Package.REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE:
				return basicSetSecurityTokenReference(null, msgs);
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
			case _200512Package.REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE:
				return getSecurityTokenReference();
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
			case _200512Package.REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE:
				setSecurityTokenReference((SecurityTokenReferenceType)newValue);
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
			case _200512Package.REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE:
				setSecurityTokenReference((SecurityTokenReferenceType)null);
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
			case _200512Package.REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE:
				return securityTokenReference != null;
		}
		return super.eIsSet(featureID);
	}

} //RequestedReferenceTypeImpl
