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

import org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentType1Impl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentType1Impl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentType1Impl#getPolicyReference <em>Policy Reference</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentType1Impl#getAny <em>Any</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentType1Impl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyAttachmentType1Impl extends EObjectImpl implements PolicyAttachmentType1 {
	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected AppliesToType1 appliesTo;

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
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

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
	protected PolicyAttachmentType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyPackage.Literals.POLICY_ATTACHMENT_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliesToType1 getAppliesTo() {
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliesTo(AppliesToType1 newAppliesTo, NotificationChain msgs) {
		AppliesToType1 oldAppliesTo = appliesTo;
		appliesTo = newAppliesTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY_ATTACHMENT_TYPE1__APPLIES_TO, oldAppliesTo, newAppliesTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesTo(AppliesToType1 newAppliesTo) {
		if (newAppliesTo != appliesTo) {
			NotificationChain msgs = null;
			if (appliesTo != null)
				msgs = ((InternalEObject)appliesTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyPackage.POLICY_ATTACHMENT_TYPE1__APPLIES_TO, null, msgs);
			if (newAppliesTo != null)
				msgs = ((InternalEObject)newAppliesTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyPackage.POLICY_ATTACHMENT_TYPE1__APPLIES_TO, null, msgs);
			msgs = basicSetAppliesTo(newAppliesTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY_ATTACHMENT_TYPE1__APPLIES_TO, newAppliesTo, newAppliesTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, PolicyPackage.POLICY_ATTACHMENT_TYPE1__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyType1> getPolicy() {
		return getGroup().list(PolicyPackage.Literals.POLICY_ATTACHMENT_TYPE1__POLICY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyReferenceType1> getPolicyReference() {
		return getGroup().list(PolicyPackage.Literals.POLICY_ATTACHMENT_TYPE1__POLICY_REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY_ATTRIBUTE);
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
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__APPLIES_TO:
				return basicSetAppliesTo(null, msgs);
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__POLICY_REFERENCE:
				return ((InternalEList<?>)getPolicyReference()).basicRemove(otherEnd, msgs);
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY_ATTRIBUTE:
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
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__APPLIES_TO:
				return getAppliesTo();
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__POLICY:
				return getPolicy();
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__POLICY_REFERENCE:
				return getPolicyReference();
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY_ATTRIBUTE:
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
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__APPLIES_TO:
				setAppliesTo((AppliesToType1)newValue);
				return;
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyType1>)newValue);
				return;
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__POLICY_REFERENCE:
				getPolicyReference().clear();
				getPolicyReference().addAll((Collection<? extends PolicyReferenceType1>)newValue);
				return;
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY_ATTRIBUTE:
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
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__APPLIES_TO:
				setAppliesTo((AppliesToType1)null);
				return;
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__GROUP:
				getGroup().clear();
				return;
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__POLICY:
				getPolicy().clear();
				return;
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__POLICY_REFERENCE:
				getPolicyReference().clear();
				return;
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY:
				getAny().clear();
				return;
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY_ATTRIBUTE:
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
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__APPLIES_TO:
				return appliesTo != null;
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__GROUP:
				return group != null && !group.isEmpty();
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__POLICY:
				return !getPolicy().isEmpty();
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__POLICY_REFERENCE:
				return !getPolicyReference().isEmpty();
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY:
				return any != null && !any.isEmpty();
			case PolicyPackage.POLICY_ATTACHMENT_TYPE1__ANY_ATTRIBUTE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", any: ");
		result.append(any);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PolicyAttachmentType1Impl
