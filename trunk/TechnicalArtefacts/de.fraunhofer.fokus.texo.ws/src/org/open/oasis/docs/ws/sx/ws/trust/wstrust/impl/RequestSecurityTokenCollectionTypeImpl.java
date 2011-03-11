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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenCollectionType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Security Token Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenCollectionTypeImpl#getRequestSecurityToken <em>Request Security Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequestSecurityTokenCollectionTypeImpl extends EObjectImpl implements RequestSecurityTokenCollectionType {
	/**
	 * The cached value of the '{@link #getRequestSecurityToken() <em>Request Security Token</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestSecurityToken()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestSecurityTokenType> requestSecurityToken;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestSecurityTokenCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _200512Package.Literals.REQUEST_SECURITY_TOKEN_COLLECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestSecurityTokenType> getRequestSecurityToken() {
		if (requestSecurityToken == null) {
			requestSecurityToken = new EObjectContainmentEList<RequestSecurityTokenType>(RequestSecurityTokenType.class, this, _200512Package.REQUEST_SECURITY_TOKEN_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN);
		}
		return requestSecurityToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _200512Package.REQUEST_SECURITY_TOKEN_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN:
				return ((InternalEList<?>)getRequestSecurityToken()).basicRemove(otherEnd, msgs);
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
			case _200512Package.REQUEST_SECURITY_TOKEN_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN:
				return getRequestSecurityToken();
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
			case _200512Package.REQUEST_SECURITY_TOKEN_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN:
				getRequestSecurityToken().clear();
				getRequestSecurityToken().addAll((Collection<? extends RequestSecurityTokenType>)newValue);
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
			case _200512Package.REQUEST_SECURITY_TOKEN_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN:
				getRequestSecurityToken().clear();
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
			case _200512Package.REQUEST_SECURITY_TOKEN_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN:
				return requestSecurityToken != null && !requestSecurityToken.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequestSecurityTokenCollectionTypeImpl
