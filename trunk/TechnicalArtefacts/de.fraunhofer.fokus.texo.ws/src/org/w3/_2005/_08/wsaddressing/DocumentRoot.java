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
package org.w3._2005._08.wsaddressing;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getAction <em>Action</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFaultTo <em>Fault To</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFrom <em>From</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemAction <em>Problem Action</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemHeaderQName <em>Problem Header QName</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemIRI <em>Problem IRI</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReferenceParameters <em>Reference Parameters</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReplyTo <em>Reply To</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRetryAfter <em>Retry After</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getTo <em>To</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter <em>Is Reference Parameter</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getAction1 <em>Action1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getEndpointReference1 <em>Endpoint Reference1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFaultTo1 <em>Fault To1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFrom1 <em>From1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMessageID1 <em>Message ID1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMetadata1 <em>Metadata1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemAction1 <em>Problem Action1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemHeaderQName1 <em>Problem Header QName1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemIRI1 <em>Problem IRI1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReferenceParameters1 <em>Reference Parameters1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRelatesTo1 <em>Relates To1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReplyTo1 <em>Reply To1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRetryAfter1 <em>Retry After1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#getTo1 <em>To1</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter1 <em>Is Reference Parameter1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(AttributedURIType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_Action()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType1 getAction();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AttributedURIType1 value);

	/**
	 * Returns the value of the '<em><b>Endpoint Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Reference</em>' containment reference.
	 * @see #setEndpointReference(EndpointReferenceType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_EndpointReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndpointReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType1 getEndpointReference();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getEndpointReference <em>Endpoint Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Reference</em>' containment reference.
	 * @see #getEndpointReference()
	 * @generated
	 */
	void setEndpointReference(EndpointReferenceType1 value);

	/**
	 * Returns the value of the '<em><b>Fault To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault To</em>' containment reference.
	 * @see #setFaultTo(EndpointReferenceType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_FaultTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FaultTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType1 getFaultTo();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFaultTo <em>Fault To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault To</em>' containment reference.
	 * @see #getFaultTo()
	 * @generated
	 */
	void setFaultTo(EndpointReferenceType1 value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(EndpointReferenceType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_From()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='From' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType1 getFrom();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(EndpointReferenceType1 value);

	/**
	 * Returns the value of the '<em><b>Message ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message ID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message ID</em>' containment reference.
	 * @see #setMessageID(AttributedURIType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_MessageID()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageID' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType1 getMessageID();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMessageID <em>Message ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message ID</em>' containment reference.
	 * @see #getMessageID()
	 * @generated
	 */
	void setMessageID(AttributedURIType1 value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(MetadataType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_Metadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	MetadataType1 getMetadata();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(MetadataType1 value);

	/**
	 * Returns the value of the '<em><b>Problem Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Action</em>' containment reference.
	 * @see #setProblemAction(ProblemActionType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_ProblemAction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProblemAction' namespace='##targetNamespace'"
	 * @generated
	 */
	ProblemActionType1 getProblemAction();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemAction <em>Problem Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Action</em>' containment reference.
	 * @see #getProblemAction()
	 * @generated
	 */
	void setProblemAction(ProblemActionType1 value);

	/**
	 * Returns the value of the '<em><b>Problem Header QName</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Header QName</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Header QName</em>' containment reference.
	 * @see #setProblemHeaderQName(AttributedQNameType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_ProblemHeaderQName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProblemHeaderQName' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedQNameType1 getProblemHeaderQName();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemHeaderQName <em>Problem Header QName</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Header QName</em>' containment reference.
	 * @see #getProblemHeaderQName()
	 * @generated
	 */
	void setProblemHeaderQName(AttributedQNameType1 value);

	/**
	 * Returns the value of the '<em><b>Problem IRI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem IRI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem IRI</em>' containment reference.
	 * @see #setProblemIRI(AttributedURIType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_ProblemIRI()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProblemIRI' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType1 getProblemIRI();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemIRI <em>Problem IRI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem IRI</em>' containment reference.
	 * @see #getProblemIRI()
	 * @generated
	 */
	void setProblemIRI(AttributedURIType1 value);

	/**
	 * Returns the value of the '<em><b>Reference Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Parameters</em>' containment reference.
	 * @see #setReferenceParameters(ReferenceParametersType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_ReferenceParameters()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferenceParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceParametersType1 getReferenceParameters();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReferenceParameters <em>Reference Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Parameters</em>' containment reference.
	 * @see #getReferenceParameters()
	 * @generated
	 */
	void setReferenceParameters(ReferenceParametersType1 value);

	/**
	 * Returns the value of the '<em><b>Relates To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates To</em>' containment reference.
	 * @see #setRelatesTo(RelatesToType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_RelatesTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelatesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatesToType1 getRelatesTo();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRelatesTo <em>Relates To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relates To</em>' containment reference.
	 * @see #getRelatesTo()
	 * @generated
	 */
	void setRelatesTo(RelatesToType1 value);

	/**
	 * Returns the value of the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply To</em>' containment reference.
	 * @see #setReplyTo(EndpointReferenceType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_ReplyTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReplyTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType1 getReplyTo();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReplyTo <em>Reply To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply To</em>' containment reference.
	 * @see #getReplyTo()
	 * @generated
	 */
	void setReplyTo(EndpointReferenceType1 value);

	/**
	 * Returns the value of the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry After</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry After</em>' containment reference.
	 * @see #setRetryAfter(AttributedUnsignedLongType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_RetryAfter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RetryAfter' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedUnsignedLongType1 getRetryAfter();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRetryAfter <em>Retry After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry After</em>' containment reference.
	 * @see #getRetryAfter()
	 * @generated
	 */
	void setRetryAfter(AttributedUnsignedLongType1 value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(AttributedURIType1)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_To()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='To' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType1 getTo();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(AttributedURIType1 value);

	/**
	 * Returns the value of the '<em><b>Is Reference Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reference Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reference Parameter</em>' attribute.
	 * @see #isSetIsReferenceParameter()
	 * @see #unsetIsReferenceParameter()
	 * @see #setIsReferenceParameter(boolean)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_IsReferenceParameter()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsReferenceParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsReferenceParameter();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter <em>Is Reference Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reference Parameter</em>' attribute.
	 * @see #isSetIsReferenceParameter()
	 * @see #unsetIsReferenceParameter()
	 * @see #isIsReferenceParameter()
	 * @generated
	 */
	void setIsReferenceParameter(boolean value);

	/**
	 * Unsets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter <em>Is Reference Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsReferenceParameter()
	 * @see #isIsReferenceParameter()
	 * @see #setIsReferenceParameter(boolean)
	 * @generated
	 */
	void unsetIsReferenceParameter();

	/**
	 * Returns whether the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter <em>Is Reference Parameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Reference Parameter</em>' attribute is set.
	 * @see #unsetIsReferenceParameter()
	 * @see #isIsReferenceParameter()
	 * @see #setIsReferenceParameter(boolean)
	 * @generated
	 */
	boolean isSetIsReferenceParameter();

	/**
	 * Returns the value of the '<em><b>Action1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action1</em>' containment reference.
	 * @see #setAction1(AttributedURIType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_Action1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType getAction1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getAction1 <em>Action1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action1</em>' containment reference.
	 * @see #getAction1()
	 * @generated
	 */
	void setAction1(AttributedURIType value);

	/**
	 * Returns the value of the '<em><b>Endpoint Reference1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Reference1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Reference1</em>' containment reference.
	 * @see #setEndpointReference1(EndpointReferenceType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_EndpointReference1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndpointReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType getEndpointReference1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getEndpointReference1 <em>Endpoint Reference1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Reference1</em>' containment reference.
	 * @see #getEndpointReference1()
	 * @generated
	 */
	void setEndpointReference1(EndpointReferenceType value);

	/**
	 * Returns the value of the '<em><b>Fault To1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault To1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault To1</em>' containment reference.
	 * @see #setFaultTo1(EndpointReferenceType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_FaultTo1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FaultTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType getFaultTo1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFaultTo1 <em>Fault To1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault To1</em>' containment reference.
	 * @see #getFaultTo1()
	 * @generated
	 */
	void setFaultTo1(EndpointReferenceType value);

	/**
	 * Returns the value of the '<em><b>From1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From1</em>' containment reference.
	 * @see #setFrom1(EndpointReferenceType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_From1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='From' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType getFrom1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFrom1 <em>From1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From1</em>' containment reference.
	 * @see #getFrom1()
	 * @generated
	 */
	void setFrom1(EndpointReferenceType value);

	/**
	 * Returns the value of the '<em><b>Message ID1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message ID1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message ID1</em>' containment reference.
	 * @see #setMessageID1(AttributedURIType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_MessageID1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageID' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType getMessageID1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMessageID1 <em>Message ID1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message ID1</em>' containment reference.
	 * @see #getMessageID1()
	 * @generated
	 */
	void setMessageID1(AttributedURIType value);

	/**
	 * Returns the value of the '<em><b>Metadata1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata1</em>' containment reference.
	 * @see #setMetadata1(MetadataType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_Metadata1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	MetadataType getMetadata1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMetadata1 <em>Metadata1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata1</em>' containment reference.
	 * @see #getMetadata1()
	 * @generated
	 */
	void setMetadata1(MetadataType value);

	/**
	 * Returns the value of the '<em><b>Problem Action1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Action1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Action1</em>' containment reference.
	 * @see #setProblemAction1(ProblemActionType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_ProblemAction1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProblemAction' namespace='##targetNamespace'"
	 * @generated
	 */
	ProblemActionType getProblemAction1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemAction1 <em>Problem Action1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Action1</em>' containment reference.
	 * @see #getProblemAction1()
	 * @generated
	 */
	void setProblemAction1(ProblemActionType value);

	/**
	 * Returns the value of the '<em><b>Problem Header QName1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Header QName1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Header QName1</em>' containment reference.
	 * @see #setProblemHeaderQName1(AttributedQNameType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_ProblemHeaderQName1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProblemHeaderQName' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedQNameType getProblemHeaderQName1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemHeaderQName1 <em>Problem Header QName1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Header QName1</em>' containment reference.
	 * @see #getProblemHeaderQName1()
	 * @generated
	 */
	void setProblemHeaderQName1(AttributedQNameType value);

	/**
	 * Returns the value of the '<em><b>Problem IRI1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem IRI1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem IRI1</em>' containment reference.
	 * @see #setProblemIRI1(AttributedURIType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_ProblemIRI1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProblemIRI' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType getProblemIRI1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemIRI1 <em>Problem IRI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem IRI1</em>' containment reference.
	 * @see #getProblemIRI1()
	 * @generated
	 */
	void setProblemIRI1(AttributedURIType value);

	/**
	 * Returns the value of the '<em><b>Reference Parameters1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Parameters1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Parameters1</em>' containment reference.
	 * @see #setReferenceParameters1(ReferenceParametersType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_ReferenceParameters1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferenceParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceParametersType getReferenceParameters1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReferenceParameters1 <em>Reference Parameters1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Parameters1</em>' containment reference.
	 * @see #getReferenceParameters1()
	 * @generated
	 */
	void setReferenceParameters1(ReferenceParametersType value);

	/**
	 * Returns the value of the '<em><b>Relates To1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates To1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates To1</em>' containment reference.
	 * @see #setRelatesTo1(RelatesToType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_RelatesTo1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelatesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatesToType getRelatesTo1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRelatesTo1 <em>Relates To1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relates To1</em>' containment reference.
	 * @see #getRelatesTo1()
	 * @generated
	 */
	void setRelatesTo1(RelatesToType value);

	/**
	 * Returns the value of the '<em><b>Reply To1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply To1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply To1</em>' containment reference.
	 * @see #setReplyTo1(EndpointReferenceType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_ReplyTo1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReplyTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType getReplyTo1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReplyTo1 <em>Reply To1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply To1</em>' containment reference.
	 * @see #getReplyTo1()
	 * @generated
	 */
	void setReplyTo1(EndpointReferenceType value);

	/**
	 * Returns the value of the '<em><b>Retry After1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry After1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry After1</em>' containment reference.
	 * @see #setRetryAfter1(AttributedUnsignedLongType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_RetryAfter1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RetryAfter' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedUnsignedLongType getRetryAfter1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRetryAfter1 <em>Retry After1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry After1</em>' containment reference.
	 * @see #getRetryAfter1()
	 * @generated
	 */
	void setRetryAfter1(AttributedUnsignedLongType value);

	/**
	 * Returns the value of the '<em><b>To1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To1</em>' containment reference.
	 * @see #setTo1(AttributedURIType)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_To1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='To' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType getTo1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getTo1 <em>To1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To1</em>' containment reference.
	 * @see #getTo1()
	 * @generated
	 */
	void setTo1(AttributedURIType value);

	/**
	 * Returns the value of the '<em><b>Is Reference Parameter1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reference Parameter1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reference Parameter1</em>' attribute.
	 * @see #isSetIsReferenceParameter1()
	 * @see #unsetIsReferenceParameter1()
	 * @see #setIsReferenceParameter1(boolean)
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#getDocumentRoot_IsReferenceParameter1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsReferenceParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsReferenceParameter1();

	/**
	 * Sets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter1 <em>Is Reference Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reference Parameter1</em>' attribute.
	 * @see #isSetIsReferenceParameter1()
	 * @see #unsetIsReferenceParameter1()
	 * @see #isIsReferenceParameter1()
	 * @generated
	 */
	void setIsReferenceParameter1(boolean value);

	/**
	 * Unsets the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter1 <em>Is Reference Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsReferenceParameter1()
	 * @see #isIsReferenceParameter1()
	 * @see #setIsReferenceParameter1(boolean)
	 * @generated
	 */
	void unsetIsReferenceParameter1();

	/**
	 * Returns whether the value of the '{@link org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter1 <em>Is Reference Parameter1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Reference Parameter1</em>' attribute is set.
	 * @see #unsetIsReferenceParameter1()
	 * @see #isIsReferenceParameter1()
	 * @see #setIsReferenceParameter1(boolean)
	 * @generated
	 */
	boolean isSetIsReferenceParameter1();

} // DocumentRoot
