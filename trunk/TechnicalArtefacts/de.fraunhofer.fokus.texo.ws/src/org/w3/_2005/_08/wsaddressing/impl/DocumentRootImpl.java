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
package org.w3._2005._08.wsaddressing.impl;

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

import org.w3._2005._08.wsaddressing.AddressingPackage;
import org.w3._2005._08.wsaddressing.AttributedQNameType;
import org.w3._2005._08.wsaddressing.AttributedQNameType1;
import org.w3._2005._08.wsaddressing.AttributedURIType;
import org.w3._2005._08.wsaddressing.AttributedURIType1;
import org.w3._2005._08.wsaddressing.AttributedUnsignedLongType;
import org.w3._2005._08.wsaddressing.AttributedUnsignedLongType1;
import org.w3._2005._08.wsaddressing.DocumentRoot;
import org.w3._2005._08.wsaddressing.EndpointReferenceType;
import org.w3._2005._08.wsaddressing.EndpointReferenceType1;
import org.w3._2005._08.wsaddressing.MetadataType;
import org.w3._2005._08.wsaddressing.MetadataType1;
import org.w3._2005._08.wsaddressing.ProblemActionType;
import org.w3._2005._08.wsaddressing.ProblemActionType1;
import org.w3._2005._08.wsaddressing.ReferenceParametersType;
import org.w3._2005._08.wsaddressing.ReferenceParametersType1;
import org.w3._2005._08.wsaddressing.RelatesToType;
import org.w3._2005._08.wsaddressing.RelatesToType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getFaultTo <em>Fault To</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getProblemAction <em>Problem Action</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getProblemHeaderQName <em>Problem Header QName</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getProblemIRI <em>Problem IRI</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getReferenceParameters <em>Reference Parameters</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getReplyTo <em>Reply To</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getRetryAfter <em>Retry After</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#isIsReferenceParameter <em>Is Reference Parameter</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getAction1 <em>Action1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getEndpointReference1 <em>Endpoint Reference1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getFaultTo1 <em>Fault To1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getFrom1 <em>From1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getMessageID1 <em>Message ID1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getMetadata1 <em>Metadata1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getProblemAction1 <em>Problem Action1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getProblemHeaderQName1 <em>Problem Header QName1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getProblemIRI1 <em>Problem IRI1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getReferenceParameters1 <em>Reference Parameters1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getRelatesTo1 <em>Relates To1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getReplyTo1 <em>Reply To1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getRetryAfter1 <em>Retry After1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#getTo1 <em>To1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl#isIsReferenceParameter1 <em>Is Reference Parameter1</em>}</li>
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
	 * The default value of the '{@link #isIsReferenceParameter() <em>Is Reference Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReferenceParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REFERENCE_PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReferenceParameter() <em>Is Reference Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReferenceParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean isReferenceParameter = IS_REFERENCE_PARAMETER_EDEFAULT;

	/**
	 * This is true if the Is Reference Parameter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isReferenceParameterESet;

	/**
	 * The default value of the '{@link #isIsReferenceParameter1() <em>Is Reference Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReferenceParameter1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REFERENCE_PARAMETER1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReferenceParameter1() <em>Is Reference Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReferenceParameter1()
	 * @generated
	 * @ordered
	 */
	protected boolean isReferenceParameter1 = IS_REFERENCE_PARAMETER1_EDEFAULT;

	/**
	 * This is true if the Is Reference Parameter1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isReferenceParameter1ESet;

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
		return AddressingPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, AddressingPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType1 getAction() {
		return (AttributedURIType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(AttributedURIType1 newAction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION, newAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(AttributedURIType1 newAction) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType1 getEndpointReference() {
		return (EndpointReferenceType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointReference(EndpointReferenceType1 newEndpointReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE, newEndpointReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointReference(EndpointReferenceType1 newEndpointReference) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE, newEndpointReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType1 getFaultTo() {
		return (EndpointReferenceType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaultTo(EndpointReferenceType1 newFaultTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO, newFaultTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultTo(EndpointReferenceType1 newFaultTo) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO, newFaultTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType1 getFrom() {
		return (EndpointReferenceType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(EndpointReferenceType1 newFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__FROM, newFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(EndpointReferenceType1 newFrom) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType1 getMessageID() {
		return (AttributedURIType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageID(AttributedURIType1 newMessageID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID, newMessageID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageID(AttributedURIType1 newMessageID) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID, newMessageID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType1 getMetadata() {
		return (MetadataType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(MetadataType1 newMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA, newMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(MetadataType1 newMetadata) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemActionType1 getProblemAction() {
		return (ProblemActionType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblemAction(ProblemActionType1 newProblemAction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION, newProblemAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemAction(ProblemActionType1 newProblemAction) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION, newProblemAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedQNameType1 getProblemHeaderQName() {
		return (AttributedQNameType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblemHeaderQName(AttributedQNameType1 newProblemHeaderQName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME, newProblemHeaderQName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemHeaderQName(AttributedQNameType1 newProblemHeaderQName) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME, newProblemHeaderQName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType1 getProblemIRI() {
		return (AttributedURIType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblemIRI(AttributedURIType1 newProblemIRI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI, newProblemIRI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemIRI(AttributedURIType1 newProblemIRI) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI, newProblemIRI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceParametersType1 getReferenceParameters() {
		return (ReferenceParametersType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceParameters(ReferenceParametersType1 newReferenceParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS, newReferenceParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceParameters(ReferenceParametersType1 newReferenceParameters) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS, newReferenceParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatesToType1 getRelatesTo() {
		return (RelatesToType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatesTo(RelatesToType1 newRelatesTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO, newRelatesTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatesTo(RelatesToType1 newRelatesTo) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO, newRelatesTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType1 getReplyTo() {
		return (EndpointReferenceType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplyTo(EndpointReferenceType1 newReplyTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO, newReplyTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyTo(EndpointReferenceType1 newReplyTo) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO, newReplyTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedUnsignedLongType1 getRetryAfter() {
		return (AttributedUnsignedLongType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetryAfter(AttributedUnsignedLongType1 newRetryAfter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER, newRetryAfter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryAfter(AttributedUnsignedLongType1 newRetryAfter) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER, newRetryAfter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType1 getTo() {
		return (AttributedURIType1)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(AttributedURIType1 newTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__TO, newTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(AttributedURIType1 newTo) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReferenceParameter() {
		return isReferenceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReferenceParameter(boolean newIsReferenceParameter) {
		boolean oldIsReferenceParameter = isReferenceParameter;
		isReferenceParameter = newIsReferenceParameter;
		boolean oldIsReferenceParameterESet = isReferenceParameterESet;
		isReferenceParameterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER, oldIsReferenceParameter, isReferenceParameter, !oldIsReferenceParameterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsReferenceParameter() {
		boolean oldIsReferenceParameter = isReferenceParameter;
		boolean oldIsReferenceParameterESet = isReferenceParameterESet;
		isReferenceParameter = IS_REFERENCE_PARAMETER_EDEFAULT;
		isReferenceParameterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER, oldIsReferenceParameter, IS_REFERENCE_PARAMETER_EDEFAULT, oldIsReferenceParameterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsReferenceParameter() {
		return isReferenceParameterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType getAction1() {
		return (AttributedURIType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction1(AttributedURIType newAction1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION1, newAction1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction1(AttributedURIType newAction1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION1, newAction1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType getEndpointReference1() {
		return (EndpointReferenceType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointReference1(EndpointReferenceType newEndpointReference1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE1, newEndpointReference1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointReference1(EndpointReferenceType newEndpointReference1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE1, newEndpointReference1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType getFaultTo1() {
		return (EndpointReferenceType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaultTo1(EndpointReferenceType newFaultTo1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO1, newFaultTo1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultTo1(EndpointReferenceType newFaultTo1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO1, newFaultTo1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType getFrom1() {
		return (EndpointReferenceType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__FROM1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom1(EndpointReferenceType newFrom1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__FROM1, newFrom1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom1(EndpointReferenceType newFrom1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__FROM1, newFrom1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType getMessageID1() {
		return (AttributedURIType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageID1(AttributedURIType newMessageID1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID1, newMessageID1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageID1(AttributedURIType newMessageID1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID1, newMessageID1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType getMetadata1() {
		return (MetadataType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata1(MetadataType newMetadata1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA1, newMetadata1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata1(MetadataType newMetadata1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA1, newMetadata1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemActionType getProblemAction1() {
		return (ProblemActionType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblemAction1(ProblemActionType newProblemAction1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION1, newProblemAction1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemAction1(ProblemActionType newProblemAction1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION1, newProblemAction1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedQNameType getProblemHeaderQName1() {
		return (AttributedQNameType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblemHeaderQName1(AttributedQNameType newProblemHeaderQName1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1, newProblemHeaderQName1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemHeaderQName1(AttributedQNameType newProblemHeaderQName1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1, newProblemHeaderQName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType getProblemIRI1() {
		return (AttributedURIType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblemIRI1(AttributedURIType newProblemIRI1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI1, newProblemIRI1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemIRI1(AttributedURIType newProblemIRI1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI1, newProblemIRI1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceParametersType getReferenceParameters1() {
		return (ReferenceParametersType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceParameters1(ReferenceParametersType newReferenceParameters1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS1, newReferenceParameters1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceParameters1(ReferenceParametersType newReferenceParameters1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS1, newReferenceParameters1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatesToType getRelatesTo1() {
		return (RelatesToType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatesTo1(RelatesToType newRelatesTo1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO1, newRelatesTo1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatesTo1(RelatesToType newRelatesTo1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO1, newRelatesTo1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType getReplyTo1() {
		return (EndpointReferenceType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplyTo1(EndpointReferenceType newReplyTo1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO1, newReplyTo1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyTo1(EndpointReferenceType newReplyTo1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO1, newReplyTo1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedUnsignedLongType getRetryAfter1() {
		return (AttributedUnsignedLongType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetryAfter1(AttributedUnsignedLongType newRetryAfter1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER1, newRetryAfter1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryAfter1(AttributedUnsignedLongType newRetryAfter1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER1, newRetryAfter1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType getTo1() {
		return (AttributedURIType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__TO1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo1(AttributedURIType newTo1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__TO1, newTo1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo1(AttributedURIType newTo1) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__TO1, newTo1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReferenceParameter1() {
		return isReferenceParameter1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReferenceParameter1(boolean newIsReferenceParameter1) {
		boolean oldIsReferenceParameter1 = isReferenceParameter1;
		isReferenceParameter1 = newIsReferenceParameter1;
		boolean oldIsReferenceParameter1ESet = isReferenceParameter1ESet;
		isReferenceParameter1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER1, oldIsReferenceParameter1, isReferenceParameter1, !oldIsReferenceParameter1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsReferenceParameter1() {
		boolean oldIsReferenceParameter1 = isReferenceParameter1;
		boolean oldIsReferenceParameter1ESet = isReferenceParameter1ESet;
		isReferenceParameter1 = IS_REFERENCE_PARAMETER1_EDEFAULT;
		isReferenceParameter1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER1, oldIsReferenceParameter1, IS_REFERENCE_PARAMETER1_EDEFAULT, oldIsReferenceParameter1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsReferenceParameter1() {
		return isReferenceParameter1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddressingPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case AddressingPackage.DOCUMENT_ROOT__ACTION:
				return basicSetAction(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE:
				return basicSetEndpointReference(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO:
				return basicSetFaultTo(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__FROM:
				return basicSetFrom(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID:
				return basicSetMessageID(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__METADATA:
				return basicSetMetadata(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION:
				return basicSetProblemAction(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME:
				return basicSetProblemHeaderQName(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI:
				return basicSetProblemIRI(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS:
				return basicSetReferenceParameters(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO:
				return basicSetRelatesTo(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO:
				return basicSetReplyTo(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER:
				return basicSetRetryAfter(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__TO:
				return basicSetTo(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__ACTION1:
				return basicSetAction1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE1:
				return basicSetEndpointReference1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO1:
				return basicSetFaultTo1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__FROM1:
				return basicSetFrom1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID1:
				return basicSetMessageID1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__METADATA1:
				return basicSetMetadata1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION1:
				return basicSetProblemAction1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1:
				return basicSetProblemHeaderQName1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI1:
				return basicSetProblemIRI1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS1:
				return basicSetReferenceParameters1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO1:
				return basicSetRelatesTo1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO1:
				return basicSetReplyTo1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER1:
				return basicSetRetryAfter1(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__TO1:
				return basicSetTo1(null, msgs);
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
			case AddressingPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case AddressingPackage.DOCUMENT_ROOT__ACTION:
				return getAction();
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE:
				return getEndpointReference();
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO:
				return getFaultTo();
			case AddressingPackage.DOCUMENT_ROOT__FROM:
				return getFrom();
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID:
				return getMessageID();
			case AddressingPackage.DOCUMENT_ROOT__METADATA:
				return getMetadata();
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION:
				return getProblemAction();
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME:
				return getProblemHeaderQName();
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI:
				return getProblemIRI();
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS:
				return getReferenceParameters();
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO:
				return getRelatesTo();
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO:
				return getReplyTo();
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER:
				return getRetryAfter();
			case AddressingPackage.DOCUMENT_ROOT__TO:
				return getTo();
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER:
				return isIsReferenceParameter();
			case AddressingPackage.DOCUMENT_ROOT__ACTION1:
				return getAction1();
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE1:
				return getEndpointReference1();
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO1:
				return getFaultTo1();
			case AddressingPackage.DOCUMENT_ROOT__FROM1:
				return getFrom1();
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID1:
				return getMessageID1();
			case AddressingPackage.DOCUMENT_ROOT__METADATA1:
				return getMetadata1();
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION1:
				return getProblemAction1();
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1:
				return getProblemHeaderQName1();
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI1:
				return getProblemIRI1();
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS1:
				return getReferenceParameters1();
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO1:
				return getRelatesTo1();
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO1:
				return getReplyTo1();
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER1:
				return getRetryAfter1();
			case AddressingPackage.DOCUMENT_ROOT__TO1:
				return getTo1();
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER1:
				return isIsReferenceParameter1();
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
			case AddressingPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__ACTION:
				setAction((AttributedURIType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE:
				setEndpointReference((EndpointReferenceType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO:
				setFaultTo((EndpointReferenceType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FROM:
				setFrom((EndpointReferenceType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID:
				setMessageID((AttributedURIType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__METADATA:
				setMetadata((MetadataType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION:
				setProblemAction((ProblemActionType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME:
				setProblemHeaderQName((AttributedQNameType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI:
				setProblemIRI((AttributedURIType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS:
				setReferenceParameters((ReferenceParametersType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO:
				setRelatesTo((RelatesToType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO:
				setReplyTo((EndpointReferenceType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER:
				setRetryAfter((AttributedUnsignedLongType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__TO:
				setTo((AttributedURIType1)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER:
				setIsReferenceParameter((Boolean)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__ACTION1:
				setAction1((AttributedURIType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE1:
				setEndpointReference1((EndpointReferenceType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO1:
				setFaultTo1((EndpointReferenceType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FROM1:
				setFrom1((EndpointReferenceType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID1:
				setMessageID1((AttributedURIType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__METADATA1:
				setMetadata1((MetadataType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION1:
				setProblemAction1((ProblemActionType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1:
				setProblemHeaderQName1((AttributedQNameType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI1:
				setProblemIRI1((AttributedURIType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS1:
				setReferenceParameters1((ReferenceParametersType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO1:
				setRelatesTo1((RelatesToType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO1:
				setReplyTo1((EndpointReferenceType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER1:
				setRetryAfter1((AttributedUnsignedLongType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__TO1:
				setTo1((AttributedURIType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER1:
				setIsReferenceParameter1((Boolean)newValue);
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
			case AddressingPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case AddressingPackage.DOCUMENT_ROOT__ACTION:
				setAction((AttributedURIType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE:
				setEndpointReference((EndpointReferenceType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO:
				setFaultTo((EndpointReferenceType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FROM:
				setFrom((EndpointReferenceType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID:
				setMessageID((AttributedURIType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__METADATA:
				setMetadata((MetadataType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION:
				setProblemAction((ProblemActionType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME:
				setProblemHeaderQName((AttributedQNameType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI:
				setProblemIRI((AttributedURIType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS:
				setReferenceParameters((ReferenceParametersType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO:
				setRelatesTo((RelatesToType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO:
				setReplyTo((EndpointReferenceType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER:
				setRetryAfter((AttributedUnsignedLongType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__TO:
				setTo((AttributedURIType1)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER:
				unsetIsReferenceParameter();
				return;
			case AddressingPackage.DOCUMENT_ROOT__ACTION1:
				setAction1((AttributedURIType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE1:
				setEndpointReference1((EndpointReferenceType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO1:
				setFaultTo1((EndpointReferenceType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FROM1:
				setFrom1((EndpointReferenceType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID1:
				setMessageID1((AttributedURIType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__METADATA1:
				setMetadata1((MetadataType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION1:
				setProblemAction1((ProblemActionType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1:
				setProblemHeaderQName1((AttributedQNameType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI1:
				setProblemIRI1((AttributedURIType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS1:
				setReferenceParameters1((ReferenceParametersType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO1:
				setRelatesTo1((RelatesToType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO1:
				setReplyTo1((EndpointReferenceType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER1:
				setRetryAfter1((AttributedUnsignedLongType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__TO1:
				setTo1((AttributedURIType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER1:
				unsetIsReferenceParameter1();
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
			case AddressingPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case AddressingPackage.DOCUMENT_ROOT__ACTION:
				return getAction() != null;
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE:
				return getEndpointReference() != null;
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO:
				return getFaultTo() != null;
			case AddressingPackage.DOCUMENT_ROOT__FROM:
				return getFrom() != null;
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID:
				return getMessageID() != null;
			case AddressingPackage.DOCUMENT_ROOT__METADATA:
				return getMetadata() != null;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION:
				return getProblemAction() != null;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME:
				return getProblemHeaderQName() != null;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI:
				return getProblemIRI() != null;
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS:
				return getReferenceParameters() != null;
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO:
				return getRelatesTo() != null;
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO:
				return getReplyTo() != null;
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER:
				return getRetryAfter() != null;
			case AddressingPackage.DOCUMENT_ROOT__TO:
				return getTo() != null;
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER:
				return isSetIsReferenceParameter();
			case AddressingPackage.DOCUMENT_ROOT__ACTION1:
				return getAction1() != null;
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE1:
				return getEndpointReference1() != null;
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO1:
				return getFaultTo1() != null;
			case AddressingPackage.DOCUMENT_ROOT__FROM1:
				return getFrom1() != null;
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID1:
				return getMessageID1() != null;
			case AddressingPackage.DOCUMENT_ROOT__METADATA1:
				return getMetadata1() != null;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION1:
				return getProblemAction1() != null;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1:
				return getProblemHeaderQName1() != null;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI1:
				return getProblemIRI1() != null;
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS1:
				return getReferenceParameters1() != null;
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO1:
				return getRelatesTo1() != null;
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO1:
				return getReplyTo1() != null;
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER1:
				return getRetryAfter1() != null;
			case AddressingPackage.DOCUMENT_ROOT__TO1:
				return getTo1() != null;
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER1:
				return isSetIsReferenceParameter1();
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
		result.append(", isReferenceParameter: ");
		if (isReferenceParameterESet) result.append(isReferenceParameter); else result.append("<unset>");
		result.append(", isReferenceParameter1: ");
		if (isReferenceParameter1ESet) result.append(isReferenceParameter1); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
