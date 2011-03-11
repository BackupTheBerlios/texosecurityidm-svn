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
package org.xmlsoap.schemas.ws._2004._09.wspolicy;

import java.util.List;

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
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAll <em>All</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getExactlyOne <em>Exactly One</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyAttachment <em>Policy Attachment</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyReference <em>Policy Reference</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyURIs <em>Policy UR Is</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAll1 <em>All1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAppliesTo1 <em>Applies To1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getExactlyOne1 <em>Exactly One1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicy1 <em>Policy1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyAttachment1 <em>Policy Attachment1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyReference1 <em>Policy Reference1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional1 <em>Optional1</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyURIs1 <em>Policy UR Is1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot()
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
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_Mixed()
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
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All</em>' containment reference.
	 * @see #setAll(OperatorContentType1)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_All()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='All' namespace='##targetNamespace'"
	 * @generated
	 */
	OperatorContentType1 getAll();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAll <em>All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All</em>' containment reference.
	 * @see #getAll()
	 * @generated
	 */
	void setAll(OperatorContentType1 value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference.
	 * @see #setAppliesTo(AppliesToType1)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_AppliesTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AppliesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	AppliesToType1 getAppliesTo();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAppliesTo <em>Applies To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To</em>' containment reference.
	 * @see #getAppliesTo()
	 * @generated
	 */
	void setAppliesTo(AppliesToType1 value);

	/**
	 * Returns the value of the '<em><b>Exactly One</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exactly One</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exactly One</em>' containment reference.
	 * @see #setExactlyOne(OperatorContentType1)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_ExactlyOne()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExactlyOne' namespace='##targetNamespace'"
	 * @generated
	 */
	OperatorContentType1 getExactlyOne();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getExactlyOne <em>Exactly One</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exactly One</em>' containment reference.
	 * @see #getExactlyOne()
	 * @generated
	 */
	void setExactlyOne(OperatorContentType1 value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(PolicyType1)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_Policy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Policy' namespace='##targetNamespace'"
	 * @generated
	 */
	PolicyType1 getPolicy();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicy <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' containment reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(PolicyType1 value);

	/**
	 * Returns the value of the '<em><b>Policy Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Attachment</em>' containment reference.
	 * @see #setPolicyAttachment(PolicyAttachmentType1)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_PolicyAttachment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolicyAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	PolicyAttachmentType1 getPolicyAttachment();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyAttachment <em>Policy Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Attachment</em>' containment reference.
	 * @see #getPolicyAttachment()
	 * @generated
	 */
	void setPolicyAttachment(PolicyAttachmentType1 value);

	/**
	 * Returns the value of the '<em><b>Policy Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Reference</em>' containment reference.
	 * @see #setPolicyReference(PolicyReferenceType1)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_PolicyReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolicyReference' namespace='##targetNamespace'"
	 * @generated
	 */
	PolicyReferenceType1 getPolicyReference();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyReference <em>Policy Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Reference</em>' containment reference.
	 * @see #getPolicyReference()
	 * @generated
	 */
	void setPolicyReference(PolicyReferenceType1 value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #isSetOptional()
	 * @see #unsetOptional()
	 * @see #setOptional(boolean)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_Optional()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Optional' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isSetOptional()
	 * @see #unsetOptional()
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Unsets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptional()
	 * @see #isOptional()
	 * @see #setOptional(boolean)
	 * @generated
	 */
	void unsetOptional();

	/**
	 * Returns whether the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional <em>Optional</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Optional</em>' attribute is set.
	 * @see #unsetOptional()
	 * @see #isOptional()
	 * @see #setOptional(boolean)
	 * @generated
	 */
	boolean isSetOptional();

	/**
	 * Returns the value of the '<em><b>Policy UR Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy UR Is</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy UR Is</em>' attribute.
	 * @see #setPolicyURIs(List)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_PolicyURIs()
	 * @model dataType="org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyURIsType1" many="false"
	 *        extendedMetaData="kind='attribute' name='PolicyURIs' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getPolicyURIs();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyURIs <em>Policy UR Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy UR Is</em>' attribute.
	 * @see #getPolicyURIs()
	 * @generated
	 */
	void setPolicyURIs(List<String> value);

	/**
	 * Returns the value of the '<em><b>All1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All1</em>' containment reference.
	 * @see #setAll1(OperatorContentType)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_All1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='All' namespace='##targetNamespace'"
	 * @generated
	 */
	OperatorContentType getAll1();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAll1 <em>All1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All1</em>' containment reference.
	 * @see #getAll1()
	 * @generated
	 */
	void setAll1(OperatorContentType value);

	/**
	 * Returns the value of the '<em><b>Applies To1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To1</em>' containment reference.
	 * @see #setAppliesTo1(AppliesToType)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_AppliesTo1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AppliesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	AppliesToType getAppliesTo1();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAppliesTo1 <em>Applies To1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To1</em>' containment reference.
	 * @see #getAppliesTo1()
	 * @generated
	 */
	void setAppliesTo1(AppliesToType value);

	/**
	 * Returns the value of the '<em><b>Exactly One1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exactly One1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exactly One1</em>' containment reference.
	 * @see #setExactlyOne1(OperatorContentType)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_ExactlyOne1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExactlyOne' namespace='##targetNamespace'"
	 * @generated
	 */
	OperatorContentType getExactlyOne1();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getExactlyOne1 <em>Exactly One1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exactly One1</em>' containment reference.
	 * @see #getExactlyOne1()
	 * @generated
	 */
	void setExactlyOne1(OperatorContentType value);

	/**
	 * Returns the value of the '<em><b>Policy1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy1</em>' containment reference.
	 * @see #setPolicy1(PolicyType)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_Policy1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Policy' namespace='##targetNamespace'"
	 * @generated
	 */
	PolicyType getPolicy1();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicy1 <em>Policy1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy1</em>' containment reference.
	 * @see #getPolicy1()
	 * @generated
	 */
	void setPolicy1(PolicyType value);

	/**
	 * Returns the value of the '<em><b>Policy Attachment1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Attachment1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Attachment1</em>' containment reference.
	 * @see #setPolicyAttachment1(PolicyAttachmentType)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_PolicyAttachment1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolicyAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	PolicyAttachmentType getPolicyAttachment1();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyAttachment1 <em>Policy Attachment1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Attachment1</em>' containment reference.
	 * @see #getPolicyAttachment1()
	 * @generated
	 */
	void setPolicyAttachment1(PolicyAttachmentType value);

	/**
	 * Returns the value of the '<em><b>Policy Reference1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Reference1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Reference1</em>' containment reference.
	 * @see #setPolicyReference1(PolicyReferenceType)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_PolicyReference1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolicyReference' namespace='##targetNamespace'"
	 * @generated
	 */
	PolicyReferenceType getPolicyReference1();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyReference1 <em>Policy Reference1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Reference1</em>' containment reference.
	 * @see #getPolicyReference1()
	 * @generated
	 */
	void setPolicyReference1(PolicyReferenceType value);

	/**
	 * Returns the value of the '<em><b>Optional1</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional1</em>' attribute.
	 * @see #isSetOptional1()
	 * @see #unsetOptional1()
	 * @see #setOptional1(boolean)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_Optional1()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Optional' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOptional1();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional1 <em>Optional1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional1</em>' attribute.
	 * @see #isSetOptional1()
	 * @see #unsetOptional1()
	 * @see #isOptional1()
	 * @generated
	 */
	void setOptional1(boolean value);

	/**
	 * Unsets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional1 <em>Optional1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptional1()
	 * @see #isOptional1()
	 * @see #setOptional1(boolean)
	 * @generated
	 */
	void unsetOptional1();

	/**
	 * Returns whether the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional1 <em>Optional1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Optional1</em>' attribute is set.
	 * @see #unsetOptional1()
	 * @see #isOptional1()
	 * @see #setOptional1(boolean)
	 * @generated
	 */
	boolean isSetOptional1();

	/**
	 * Returns the value of the '<em><b>Policy UR Is1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy UR Is1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy UR Is1</em>' attribute.
	 * @see #setPolicyURIs1(List)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getDocumentRoot_PolicyURIs1()
	 * @model dataType="org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyURIsType" many="false"
	 *        extendedMetaData="kind='attribute' name='PolicyURIs' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getPolicyURIs1();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyURIs1 <em>Policy UR Is1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy UR Is1</em>' attribute.
	 * @see #getPolicyURIs1()
	 * @generated
	 */
	void setPolicyURIs1(List<String> value);

} // DocumentRoot
