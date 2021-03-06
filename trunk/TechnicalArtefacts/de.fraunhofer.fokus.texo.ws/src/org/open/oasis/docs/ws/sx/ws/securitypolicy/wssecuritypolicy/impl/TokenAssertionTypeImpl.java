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
package org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package;

import org.w3._2005._08.wsaddressing.EndpointReferenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Assertion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.TokenAssertionTypeImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.TokenAssertionTypeImpl#getIssuerName <em>Issuer Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.TokenAssertionTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.TokenAssertionTypeImpl#getIncludeToken <em>Include Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.TokenAssertionTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenAssertionTypeImpl extends EObjectImpl implements TokenAssertionType {
	/**
	 * The cached value of the '{@link #getIssuer() <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected EndpointReferenceType issuer;

	/**
	 * The default value of the '{@link #getIssuerName() <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerName()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuerName() <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerName()
	 * @generated
	 * @ordered
	 */
	protected String issuerName = ISSUER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getIncludeToken() <em>Include Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeToken()
	 * @generated
	 * @ordered
	 */
	protected static final Object INCLUDE_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeToken() <em>Include Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeToken()
	 * @generated
	 * @ordered
	 */
	protected Object includeToken = INCLUDE_TOKEN_EDEFAULT;

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
	protected TokenAssertionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _200702Package.Literals.TOKEN_ASSERTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType getIssuer() {
		return issuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuer(EndpointReferenceType newIssuer, NotificationChain msgs) {
		EndpointReferenceType oldIssuer = issuer;
		issuer = newIssuer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _200702Package.TOKEN_ASSERTION_TYPE__ISSUER, oldIssuer, newIssuer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuer(EndpointReferenceType newIssuer) {
		if (newIssuer != issuer) {
			NotificationChain msgs = null;
			if (issuer != null)
				msgs = ((InternalEObject)issuer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _200702Package.TOKEN_ASSERTION_TYPE__ISSUER, null, msgs);
			if (newIssuer != null)
				msgs = ((InternalEObject)newIssuer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _200702Package.TOKEN_ASSERTION_TYPE__ISSUER, null, msgs);
			msgs = basicSetIssuer(newIssuer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _200702Package.TOKEN_ASSERTION_TYPE__ISSUER, newIssuer, newIssuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssuerName() {
		return issuerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuerName(String newIssuerName) {
		String oldIssuerName = issuerName;
		issuerName = newIssuerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _200702Package.TOKEN_ASSERTION_TYPE__ISSUER_NAME, oldIssuerName, issuerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _200702Package.TOKEN_ASSERTION_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIncludeToken() {
		return includeToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeToken(Object newIncludeToken) {
		Object oldIncludeToken = includeToken;
		includeToken = newIncludeToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _200702Package.TOKEN_ASSERTION_TYPE__INCLUDE_TOKEN, oldIncludeToken, includeToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _200702Package.TOKEN_ASSERTION_TYPE__ANY_ATTRIBUTE);
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
			case _200702Package.TOKEN_ASSERTION_TYPE__ISSUER:
				return basicSetIssuer(null, msgs);
			case _200702Package.TOKEN_ASSERTION_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _200702Package.TOKEN_ASSERTION_TYPE__ANY_ATTRIBUTE:
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
			case _200702Package.TOKEN_ASSERTION_TYPE__ISSUER:
				return getIssuer();
			case _200702Package.TOKEN_ASSERTION_TYPE__ISSUER_NAME:
				return getIssuerName();
			case _200702Package.TOKEN_ASSERTION_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _200702Package.TOKEN_ASSERTION_TYPE__INCLUDE_TOKEN:
				return getIncludeToken();
			case _200702Package.TOKEN_ASSERTION_TYPE__ANY_ATTRIBUTE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _200702Package.TOKEN_ASSERTION_TYPE__ISSUER:
				setIssuer((EndpointReferenceType)newValue);
				return;
			case _200702Package.TOKEN_ASSERTION_TYPE__ISSUER_NAME:
				setIssuerName((String)newValue);
				return;
			case _200702Package.TOKEN_ASSERTION_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _200702Package.TOKEN_ASSERTION_TYPE__INCLUDE_TOKEN:
				setIncludeToken(newValue);
				return;
			case _200702Package.TOKEN_ASSERTION_TYPE__ANY_ATTRIBUTE:
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
			case _200702Package.TOKEN_ASSERTION_TYPE__ISSUER:
				setIssuer((EndpointReferenceType)null);
				return;
			case _200702Package.TOKEN_ASSERTION_TYPE__ISSUER_NAME:
				setIssuerName(ISSUER_NAME_EDEFAULT);
				return;
			case _200702Package.TOKEN_ASSERTION_TYPE__ANY:
				getAny().clear();
				return;
			case _200702Package.TOKEN_ASSERTION_TYPE__INCLUDE_TOKEN:
				setIncludeToken(INCLUDE_TOKEN_EDEFAULT);
				return;
			case _200702Package.TOKEN_ASSERTION_TYPE__ANY_ATTRIBUTE:
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
			case _200702Package.TOKEN_ASSERTION_TYPE__ISSUER:
				return issuer != null;
			case _200702Package.TOKEN_ASSERTION_TYPE__ISSUER_NAME:
				return ISSUER_NAME_EDEFAULT == null ? issuerName != null : !ISSUER_NAME_EDEFAULT.equals(issuerName);
			case _200702Package.TOKEN_ASSERTION_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _200702Package.TOKEN_ASSERTION_TYPE__INCLUDE_TOKEN:
				return INCLUDE_TOKEN_EDEFAULT == null ? includeToken != null : !INCLUDE_TOKEN_EDEFAULT.equals(includeToken);
			case _200702Package.TOKEN_ASSERTION_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (issuerName: ");
		result.append(issuerName);
		result.append(", any: ");
		result.append(any);
		result.append(", includeToken: ");
		result.append(includeToken);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //TokenAssertionTypeImpl
