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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceType1Impl#getDigest <em>Digest</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceType1Impl#getDigestAlgorithm <em>Digest Algorithm</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceType1Impl#getURI <em>URI</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceType1Impl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyReferenceType1Impl extends EObjectImpl implements PolicyReferenceType1 {
	/**
	 * The default value of the '{@link #getDigest() <em>Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigest()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DIGEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDigest() <em>Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigest()
	 * @generated
	 * @ordered
	 */
	protected byte[] digest = DIGEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDigestAlgorithm() <em>Digest Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigestAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String DIGEST_ALGORITHM_EDEFAULT = "http://schemas.xmlsoap.org/ws/2004/09/policy/Sha1Exc";

	/**
	 * The cached value of the '{@link #getDigestAlgorithm() <em>Digest Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigestAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String digestAlgorithm = DIGEST_ALGORITHM_EDEFAULT;

	/**
	 * This is true if the Digest Algorithm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean digestAlgorithmESet;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uRI = URI_EDEFAULT;

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
	protected PolicyReferenceType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyPackage.Literals.POLICY_REFERENCE_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getDigest() {
		return digest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigest(byte[] newDigest) {
		byte[] oldDigest = digest;
		digest = newDigest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY_REFERENCE_TYPE1__DIGEST, oldDigest, digest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDigestAlgorithm() {
		return digestAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigestAlgorithm(String newDigestAlgorithm) {
		String oldDigestAlgorithm = digestAlgorithm;
		digestAlgorithm = newDigestAlgorithm;
		boolean oldDigestAlgorithmESet = digestAlgorithmESet;
		digestAlgorithmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY_REFERENCE_TYPE1__DIGEST_ALGORITHM, oldDigestAlgorithm, digestAlgorithm, !oldDigestAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDigestAlgorithm() {
		String oldDigestAlgorithm = digestAlgorithm;
		boolean oldDigestAlgorithmESet = digestAlgorithmESet;
		digestAlgorithm = DIGEST_ALGORITHM_EDEFAULT;
		digestAlgorithmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PolicyPackage.POLICY_REFERENCE_TYPE1__DIGEST_ALGORITHM, oldDigestAlgorithm, DIGEST_ALGORITHM_EDEFAULT, oldDigestAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDigestAlgorithm() {
		return digestAlgorithmESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return uRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uRI;
		uRI = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY_REFERENCE_TYPE1__URI, oldURI, uRI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, PolicyPackage.POLICY_REFERENCE_TYPE1__ANY_ATTRIBUTE);
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
			case PolicyPackage.POLICY_REFERENCE_TYPE1__ANY_ATTRIBUTE:
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
			case PolicyPackage.POLICY_REFERENCE_TYPE1__DIGEST:
				return getDigest();
			case PolicyPackage.POLICY_REFERENCE_TYPE1__DIGEST_ALGORITHM:
				return getDigestAlgorithm();
			case PolicyPackage.POLICY_REFERENCE_TYPE1__URI:
				return getURI();
			case PolicyPackage.POLICY_REFERENCE_TYPE1__ANY_ATTRIBUTE:
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
			case PolicyPackage.POLICY_REFERENCE_TYPE1__DIGEST:
				setDigest((byte[])newValue);
				return;
			case PolicyPackage.POLICY_REFERENCE_TYPE1__DIGEST_ALGORITHM:
				setDigestAlgorithm((String)newValue);
				return;
			case PolicyPackage.POLICY_REFERENCE_TYPE1__URI:
				setURI((String)newValue);
				return;
			case PolicyPackage.POLICY_REFERENCE_TYPE1__ANY_ATTRIBUTE:
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
			case PolicyPackage.POLICY_REFERENCE_TYPE1__DIGEST:
				setDigest(DIGEST_EDEFAULT);
				return;
			case PolicyPackage.POLICY_REFERENCE_TYPE1__DIGEST_ALGORITHM:
				unsetDigestAlgorithm();
				return;
			case PolicyPackage.POLICY_REFERENCE_TYPE1__URI:
				setURI(URI_EDEFAULT);
				return;
			case PolicyPackage.POLICY_REFERENCE_TYPE1__ANY_ATTRIBUTE:
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
			case PolicyPackage.POLICY_REFERENCE_TYPE1__DIGEST:
				return DIGEST_EDEFAULT == null ? digest != null : !DIGEST_EDEFAULT.equals(digest);
			case PolicyPackage.POLICY_REFERENCE_TYPE1__DIGEST_ALGORITHM:
				return isSetDigestAlgorithm();
			case PolicyPackage.POLICY_REFERENCE_TYPE1__URI:
				return URI_EDEFAULT == null ? uRI != null : !URI_EDEFAULT.equals(uRI);
			case PolicyPackage.POLICY_REFERENCE_TYPE1__ANY_ATTRIBUTE:
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
		result.append(" (digest: ");
		result.append(digest);
		result.append(", digestAlgorithm: ");
		if (digestAlgorithmESet) result.append(digestAlgorithm); else result.append("<unset>");
		result.append(", uRI: ");
		result.append(uRI);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PolicyReferenceType1Impl
