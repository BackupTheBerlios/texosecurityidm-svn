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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Security Token Response Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenResponseCollectionTypeImpl#getRequestSecurityTokenResponse <em>Request Security Token Response</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenResponseCollectionTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequestSecurityTokenResponseCollectionTypeImpl extends EObjectImpl implements RequestSecurityTokenResponseCollectionType {
	/**
	 * The cached value of the '{@link #getRequestSecurityTokenResponse() <em>Request Security Token Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestSecurityTokenResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestSecurityTokenResponseType> requestSecurityTokenResponse;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestSecurityTokenResponseCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _200512Package.Literals.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestSecurityTokenResponseType> getRequestSecurityTokenResponse() {
		if (requestSecurityTokenResponse == null) {
			requestSecurityTokenResponse = new EObjectContainmentEList<RequestSecurityTokenResponseType>(RequestSecurityTokenResponseType.class, this, _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN_RESPONSE);
		}
		return requestSecurityTokenResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN_RESPONSE:
				return ((InternalEList<?>)getRequestSecurityTokenResponse()).basicRemove(otherEnd, msgs);
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN_RESPONSE:
				return getRequestSecurityTokenResponse();
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN_RESPONSE:
				getRequestSecurityTokenResponse().clear();
				getRequestSecurityTokenResponse().addAll((Collection<? extends RequestSecurityTokenResponseType>)newValue);
				return;
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN_RESPONSE:
				getRequestSecurityTokenResponse().clear();
				return;
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN_RESPONSE:
				return requestSecurityTokenResponse != null && !requestSecurityTokenResponse.isEmpty();
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //RequestSecurityTokenResponseCollectionTypeImpl
