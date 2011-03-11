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

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getAll <em>All</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getExactlyOne <em>Exactly One</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getPolicyAttachment <em>Policy Attachment</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getPolicyReference <em>Policy Reference</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getPolicyURIs <em>Policy UR Is</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getAll1 <em>All1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getAppliesTo1 <em>Applies To1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getExactlyOne1 <em>Exactly One1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getPolicy1 <em>Policy1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getPolicyAttachment1 <em>Policy Attachment1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getPolicyReference1 <em>Policy Reference1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#isOptional1 <em>Optional1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl#getPolicyURIs1 <em>Policy UR Is1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
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
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * This is true if the Optional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optionalESet;

	/**
	 * The default value of the '{@link #getPolicyURIs() <em>Policy UR Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyURIs()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> POLICY_UR_IS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyURIs() <em>Policy UR Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyURIs()
	 * @generated
	 * @ordered
	 */
	protected List<String> policyURIs = POLICY_UR_IS_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional1() <em>Optional1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional1() <em>Optional1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional1()
	 * @generated
	 * @ordered
	 */
	protected boolean optional1 = OPTIONAL1_EDEFAULT;

	/**
	 * This is true if the Optional1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optional1ESet;

	/**
	 * The default value of the '{@link #getPolicyURIs1() <em>Policy UR Is1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyURIs1()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> POLICY_UR_IS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyURIs1() <em>Policy UR Is1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyURIs1()
	 * @generated
	 * @ordered
	 */
	protected List<String> policyURIs1 = POLICY_UR_IS1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, PolicyPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorContentType1 getAll() {
		return (OperatorContentType1)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__ALL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAll(OperatorContentType1 newAll, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__ALL, newAll, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(OperatorContentType1 newAll) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__ALL, newAll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliesToType1 getAppliesTo() {
		return (AppliesToType1)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__APPLIES_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliesTo(AppliesToType1 newAppliesTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__APPLIES_TO, newAppliesTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesTo(AppliesToType1 newAppliesTo) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__APPLIES_TO, newAppliesTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorContentType1 getExactlyOne() {
		return (OperatorContentType1)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExactlyOne(OperatorContentType1 newExactlyOne, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE, newExactlyOne, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExactlyOne(OperatorContentType1 newExactlyOne) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE, newExactlyOne);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyType1 getPolicy() {
		return (PolicyType1)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicy(PolicyType1 newPolicy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY, newPolicy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(PolicyType1 newPolicy) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY, newPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyAttachmentType1 getPolicyAttachment() {
		return (PolicyAttachmentType1)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_ATTACHMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyAttachment(PolicyAttachmentType1 newPolicyAttachment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_ATTACHMENT, newPolicyAttachment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyAttachment(PolicyAttachmentType1 newPolicyAttachment) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_ATTACHMENT, newPolicyAttachment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyReferenceType1 getPolicyReference() {
		return (PolicyReferenceType1)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyReference(PolicyReferenceType1 newPolicyReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_REFERENCE, newPolicyReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyReference(PolicyReferenceType1 newPolicyReference) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_REFERENCE, newPolicyReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		boolean oldOptionalESet = optionalESet;
		optionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.DOCUMENT_ROOT__OPTIONAL, oldOptional, optional, !oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptional() {
		boolean oldOptional = optional;
		boolean oldOptionalESet = optionalESet;
		optional = OPTIONAL_EDEFAULT;
		optionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PolicyPackage.DOCUMENT_ROOT__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptional() {
		return optionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getPolicyURIs() {
		return policyURIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyURIs(List<String> newPolicyURIs) {
		List<String> oldPolicyURIs = policyURIs;
		policyURIs = newPolicyURIs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS, oldPolicyURIs, policyURIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorContentType getAll1() {
		return (OperatorContentType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__ALL1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAll1(OperatorContentType newAll1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__ALL1, newAll1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll1(OperatorContentType newAll1) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__ALL1, newAll1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliesToType getAppliesTo1() {
		return (AppliesToType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__APPLIES_TO1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliesTo1(AppliesToType newAppliesTo1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__APPLIES_TO1, newAppliesTo1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesTo1(AppliesToType newAppliesTo1) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__APPLIES_TO1, newAppliesTo1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorContentType getExactlyOne1() {
		return (OperatorContentType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExactlyOne1(OperatorContentType newExactlyOne1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE1, newExactlyOne1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExactlyOne1(OperatorContentType newExactlyOne1) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE1, newExactlyOne1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyType getPolicy1() {
		return (PolicyType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicy1(PolicyType newPolicy1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY1, newPolicy1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy1(PolicyType newPolicy1) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY1, newPolicy1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyAttachmentType getPolicyAttachment1() {
		return (PolicyAttachmentType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_ATTACHMENT1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyAttachment1(PolicyAttachmentType newPolicyAttachment1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_ATTACHMENT1, newPolicyAttachment1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyAttachment1(PolicyAttachmentType newPolicyAttachment1) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_ATTACHMENT1, newPolicyAttachment1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyReferenceType getPolicyReference1() {
		return (PolicyReferenceType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_REFERENCE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyReference1(PolicyReferenceType newPolicyReference1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_REFERENCE1, newPolicyReference1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyReference1(PolicyReferenceType newPolicyReference1) {
		((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_REFERENCE1, newPolicyReference1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional1() {
		return optional1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional1(boolean newOptional1) {
		boolean oldOptional1 = optional1;
		optional1 = newOptional1;
		boolean oldOptional1ESet = optional1ESet;
		optional1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.DOCUMENT_ROOT__OPTIONAL1, oldOptional1, optional1, !oldOptional1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptional1() {
		boolean oldOptional1 = optional1;
		boolean oldOptional1ESet = optional1ESet;
		optional1 = OPTIONAL1_EDEFAULT;
		optional1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PolicyPackage.DOCUMENT_ROOT__OPTIONAL1, oldOptional1, OPTIONAL1_EDEFAULT, oldOptional1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptional1() {
		return optional1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getPolicyURIs1() {
		return policyURIs1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyURIs1(List<String> newPolicyURIs1) {
		List<String> oldPolicyURIs1 = policyURIs1;
		policyURIs1 = newPolicyURIs1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS1, oldPolicyURIs1, policyURIs1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case PolicyPackage.DOCUMENT_ROOT__ALL:
				return basicSetAll(null, msgs);
			case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO:
				return basicSetAppliesTo(null, msgs);
			case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE:
				return basicSetExactlyOne(null, msgs);
			case PolicyPackage.DOCUMENT_ROOT__POLICY:
				return basicSetPolicy(null, msgs);
			case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT:
				return basicSetPolicyAttachment(null, msgs);
			case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE:
				return basicSetPolicyReference(null, msgs);
			case PolicyPackage.DOCUMENT_ROOT__ALL1:
				return basicSetAll1(null, msgs);
			case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO1:
				return basicSetAppliesTo1(null, msgs);
			case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE1:
				return basicSetExactlyOne1(null, msgs);
			case PolicyPackage.DOCUMENT_ROOT__POLICY1:
				return basicSetPolicy1(null, msgs);
			case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT1:
				return basicSetPolicyAttachment1(null, msgs);
			case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE1:
				return basicSetPolicyReference1(null, msgs);
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
			case PolicyPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case PolicyPackage.DOCUMENT_ROOT__ALL:
				return getAll();
			case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO:
				return getAppliesTo();
			case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE:
				return getExactlyOne();
			case PolicyPackage.DOCUMENT_ROOT__POLICY:
				return getPolicy();
			case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT:
				return getPolicyAttachment();
			case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE:
				return getPolicyReference();
			case PolicyPackage.DOCUMENT_ROOT__OPTIONAL:
				return isOptional();
			case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS:
				return getPolicyURIs();
			case PolicyPackage.DOCUMENT_ROOT__ALL1:
				return getAll1();
			case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO1:
				return getAppliesTo1();
			case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE1:
				return getExactlyOne1();
			case PolicyPackage.DOCUMENT_ROOT__POLICY1:
				return getPolicy1();
			case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT1:
				return getPolicyAttachment1();
			case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE1:
				return getPolicyReference1();
			case PolicyPackage.DOCUMENT_ROOT__OPTIONAL1:
				return isOptional1();
			case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS1:
				return getPolicyURIs1();
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
			case PolicyPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__ALL:
				setAll((OperatorContentType1)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO:
				setAppliesTo((AppliesToType1)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE:
				setExactlyOne((OperatorContentType1)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY:
				setPolicy((PolicyType1)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT:
				setPolicyAttachment((PolicyAttachmentType1)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE:
				setPolicyReference((PolicyReferenceType1)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS:
				setPolicyURIs((List<String>)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__ALL1:
				setAll1((OperatorContentType)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO1:
				setAppliesTo1((AppliesToType)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE1:
				setExactlyOne1((OperatorContentType)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY1:
				setPolicy1((PolicyType)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT1:
				setPolicyAttachment1((PolicyAttachmentType)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE1:
				setPolicyReference1((PolicyReferenceType)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__OPTIONAL1:
				setOptional1((Boolean)newValue);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS1:
				setPolicyURIs1((List<String>)newValue);
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
			case PolicyPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case PolicyPackage.DOCUMENT_ROOT__ALL:
				setAll((OperatorContentType1)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO:
				setAppliesTo((AppliesToType1)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE:
				setExactlyOne((OperatorContentType1)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY:
				setPolicy((PolicyType1)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT:
				setPolicyAttachment((PolicyAttachmentType1)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE:
				setPolicyReference((PolicyReferenceType1)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__OPTIONAL:
				unsetOptional();
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS:
				setPolicyURIs(POLICY_UR_IS_EDEFAULT);
				return;
			case PolicyPackage.DOCUMENT_ROOT__ALL1:
				setAll1((OperatorContentType)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO1:
				setAppliesTo1((AppliesToType)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE1:
				setExactlyOne1((OperatorContentType)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY1:
				setPolicy1((PolicyType)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT1:
				setPolicyAttachment1((PolicyAttachmentType)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE1:
				setPolicyReference1((PolicyReferenceType)null);
				return;
			case PolicyPackage.DOCUMENT_ROOT__OPTIONAL1:
				unsetOptional1();
				return;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS1:
				setPolicyURIs1(POLICY_UR_IS1_EDEFAULT);
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
			case PolicyPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case PolicyPackage.DOCUMENT_ROOT__ALL:
				return getAll() != null;
			case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO:
				return getAppliesTo() != null;
			case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE:
				return getExactlyOne() != null;
			case PolicyPackage.DOCUMENT_ROOT__POLICY:
				return getPolicy() != null;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT:
				return getPolicyAttachment() != null;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE:
				return getPolicyReference() != null;
			case PolicyPackage.DOCUMENT_ROOT__OPTIONAL:
				return isSetOptional();
			case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS:
				return POLICY_UR_IS_EDEFAULT == null ? policyURIs != null : !POLICY_UR_IS_EDEFAULT.equals(policyURIs);
			case PolicyPackage.DOCUMENT_ROOT__ALL1:
				return getAll1() != null;
			case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO1:
				return getAppliesTo1() != null;
			case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE1:
				return getExactlyOne1() != null;
			case PolicyPackage.DOCUMENT_ROOT__POLICY1:
				return getPolicy1() != null;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT1:
				return getPolicyAttachment1() != null;
			case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE1:
				return getPolicyReference1() != null;
			case PolicyPackage.DOCUMENT_ROOT__OPTIONAL1:
				return isSetOptional1();
			case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS1:
				return POLICY_UR_IS1_EDEFAULT == null ? policyURIs1 != null : !POLICY_UR_IS1_EDEFAULT.equals(policyURIs1);
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
		result.append(", optional: ");
		if (optionalESet) result.append(optional); else result.append("<unset>");
		result.append(", policyURIs: ");
		result.append(policyURIs);
		result.append(", optional1: ");
		if (optional1ESet) result.append(optional1); else result.append("<unset>");
		result.append(", policyURIs1: ");
		result.append(policyURIs1);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
