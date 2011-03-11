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
package org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext;

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
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getBinarySecurityToken <em>Binary Security Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getKeyIdentifier <em>Key Identifier</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getNonce <em>Nonce</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getPassword <em>Password</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getReference <em>Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getSecurityTokenReference <em>Security Token Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getTransformationParameters <em>Transformation Parameters</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getUsernameToken <em>Username Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getBinarySecurityToken1 <em>Binary Security Token1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getEmbedded1 <em>Embedded1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getKeyIdentifier1 <em>Key Identifier1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getNonce1 <em>Nonce1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getPassword1 <em>Password1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getReference1 <em>Reference1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getSecurity1 <em>Security1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getSecurityTokenReference1 <em>Security Token Reference1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getTransformationParameters1 <em>Transformation Parameters1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getUsernameToken1 <em>Username Token1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getUsage1 <em>Usage1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot()
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
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Mixed()
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
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Binary Security Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines the wsse:BinarySecurityToken element per Section 4.2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Security Token</em>' containment reference.
	 * @see #setBinarySecurityToken(BinarySecurityTokenType1)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_BinarySecurityToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinarySecurityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	BinarySecurityTokenType1 getBinarySecurityToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getBinarySecurityToken <em>Binary Security Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Security Token</em>' containment reference.
	 * @see #getBinarySecurityToken()
	 * @generated
	 */
	void setBinarySecurityToken(BinarySecurityTokenType1 value);

	/**
	 * Returns the value of the '<em><b>Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines a security token embedded reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded</em>' containment reference.
	 * @see #setEmbedded(EmbeddedType1)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Embedded()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Embedded' namespace='##targetNamespace'"
	 * @generated
	 */
	EmbeddedType1 getEmbedded();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getEmbedded <em>Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded</em>' containment reference.
	 * @see #getEmbedded()
	 * @generated
	 */
	void setEmbedded(EmbeddedType1 value);

	/**
	 * Returns the value of the '<em><b>Key Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines a key identifier reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Identifier</em>' containment reference.
	 * @see #setKeyIdentifier(KeyIdentifierType1)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_KeyIdentifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyIdentifierType1 getKeyIdentifier();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getKeyIdentifier <em>Key Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Identifier</em>' containment reference.
	 * @see #getKeyIdentifier()
	 * @generated
	 */
	void setKeyIdentifier(KeyIdentifierType1 value);

	/**
	 * Returns the value of the '<em><b>Nonce</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonce</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonce</em>' containment reference.
	 * @see #setNonce(EncodedString1)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Nonce()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Nonce' namespace='##targetNamespace'"
	 * @generated
	 */
	EncodedString1 getNonce();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getNonce <em>Nonce</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonce</em>' containment reference.
	 * @see #getNonce()
	 * @generated
	 */
	void setNonce(EncodedString1 value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' containment reference.
	 * @see #setPassword(PasswordString1)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Password()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Password' namespace='##targetNamespace'"
	 * @generated
	 */
	PasswordString1 getPassword();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getPassword <em>Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' containment reference.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(PasswordString1 value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines a security token reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType1)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Reference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType1 getReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceType1 value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines the wsse:Security SOAP header element per Section 4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(SecurityHeaderType1)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Security()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Security' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityHeaderType1 getSecurity();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(SecurityHeaderType1 value);

	/**
	 * Returns the value of the '<em><b>Security Token Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines the wsse:SecurityTokenReference per Section 4.3.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Token Reference</em>' containment reference.
	 * @see #setSecurityTokenReference(SecurityTokenReferenceType1)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_SecurityTokenReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecurityTokenReference' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityTokenReferenceType1 getSecurityTokenReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getSecurityTokenReference <em>Security Token Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Token Reference</em>' containment reference.
	 * @see #getSecurityTokenReference()
	 * @generated
	 */
	void setSecurityTokenReference(SecurityTokenReferenceType1 value);

	/**
	 * Returns the value of the '<em><b>Transformation Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element contains properties for transformations from any namespace, including DSIG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation Parameters</em>' containment reference.
	 * @see #setTransformationParameters(TransformationParametersType1)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_TransformationParameters()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransformationParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationParametersType1 getTransformationParameters();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getTransformationParameters <em>Transformation Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Parameters</em>' containment reference.
	 * @see #getTransformationParameters()
	 * @generated
	 */
	void setTransformationParameters(TransformationParametersType1 value);

	/**
	 * Returns the value of the '<em><b>Username Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines the wsse:UsernameToken element per Section 4.1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username Token</em>' containment reference.
	 * @see #setUsernameToken(UsernameTokenType1)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_UsernameToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UsernameToken' namespace='##targetNamespace'"
	 * @generated
	 */
	UsernameTokenType1 getUsernameToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getUsernameToken <em>Username Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username Token</em>' containment reference.
	 * @see #getUsernameToken()
	 * @generated
	 */
	void setUsernameToken(UsernameTokenType1 value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This global attribute is used to indicate the usage of a referenced or indicated token within the containing context
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(List)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Usage()
	 * @model dataType="org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.TUsage1" many="false"
	 *        extendedMetaData="kind='attribute' name='Usage' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getUsage();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(List<String> value);

	/**
	 * Returns the value of the '<em><b>Binary Security Token1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines the wsse:BinarySecurityToken element per Section 4.2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Security Token1</em>' containment reference.
	 * @see #setBinarySecurityToken1(BinarySecurityTokenType)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_BinarySecurityToken1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinarySecurityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	BinarySecurityTokenType getBinarySecurityToken1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getBinarySecurityToken1 <em>Binary Security Token1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Security Token1</em>' containment reference.
	 * @see #getBinarySecurityToken1()
	 * @generated
	 */
	void setBinarySecurityToken1(BinarySecurityTokenType value);

	/**
	 * Returns the value of the '<em><b>Embedded1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines a security token embedded reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded1</em>' containment reference.
	 * @see #setEmbedded1(EmbeddedType)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Embedded1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Embedded' namespace='##targetNamespace'"
	 * @generated
	 */
	EmbeddedType getEmbedded1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getEmbedded1 <em>Embedded1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded1</em>' containment reference.
	 * @see #getEmbedded1()
	 * @generated
	 */
	void setEmbedded1(EmbeddedType value);

	/**
	 * Returns the value of the '<em><b>Key Identifier1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines a key identifier reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Identifier1</em>' containment reference.
	 * @see #setKeyIdentifier1(KeyIdentifierType)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_KeyIdentifier1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyIdentifierType getKeyIdentifier1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getKeyIdentifier1 <em>Key Identifier1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Identifier1</em>' containment reference.
	 * @see #getKeyIdentifier1()
	 * @generated
	 */
	void setKeyIdentifier1(KeyIdentifierType value);

	/**
	 * Returns the value of the '<em><b>Nonce1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonce1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonce1</em>' containment reference.
	 * @see #setNonce1(EncodedString)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Nonce1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Nonce' namespace='##targetNamespace'"
	 * @generated
	 */
	EncodedString getNonce1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getNonce1 <em>Nonce1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonce1</em>' containment reference.
	 * @see #getNonce1()
	 * @generated
	 */
	void setNonce1(EncodedString value);

	/**
	 * Returns the value of the '<em><b>Password1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password1</em>' containment reference.
	 * @see #setPassword1(PasswordString)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Password1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Password' namespace='##targetNamespace'"
	 * @generated
	 */
	PasswordString getPassword1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getPassword1 <em>Password1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password1</em>' containment reference.
	 * @see #getPassword1()
	 * @generated
	 */
	void setPassword1(PasswordString value);

	/**
	 * Returns the value of the '<em><b>Reference1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines a security token reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference1</em>' containment reference.
	 * @see #setReference1(ReferenceType)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Reference1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getReference1 <em>Reference1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference1</em>' containment reference.
	 * @see #getReference1()
	 * @generated
	 */
	void setReference1(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Security1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines the wsse:Security SOAP header element per Section 4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security1</em>' containment reference.
	 * @see #setSecurity1(SecurityHeaderType)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Security1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Security' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityHeaderType getSecurity1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getSecurity1 <em>Security1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security1</em>' containment reference.
	 * @see #getSecurity1()
	 * @generated
	 */
	void setSecurity1(SecurityHeaderType value);

	/**
	 * Returns the value of the '<em><b>Security Token Reference1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines the wsse:SecurityTokenReference per Section 4.3.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Token Reference1</em>' containment reference.
	 * @see #setSecurityTokenReference1(SecurityTokenReferenceType)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_SecurityTokenReference1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecurityTokenReference' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityTokenReferenceType getSecurityTokenReference1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getSecurityTokenReference1 <em>Security Token Reference1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Token Reference1</em>' containment reference.
	 * @see #getSecurityTokenReference1()
	 * @generated
	 */
	void setSecurityTokenReference1(SecurityTokenReferenceType value);

	/**
	 * Returns the value of the '<em><b>Transformation Parameters1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element contains properties for transformations from any namespace, including DSIG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation Parameters1</em>' containment reference.
	 * @see #setTransformationParameters1(TransformationParametersType)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_TransformationParameters1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransformationParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationParametersType getTransformationParameters1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getTransformationParameters1 <em>Transformation Parameters1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Parameters1</em>' containment reference.
	 * @see #getTransformationParameters1()
	 * @generated
	 */
	void setTransformationParameters1(TransformationParametersType value);

	/**
	 * Returns the value of the '<em><b>Username Token1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines the wsse:UsernameToken element per Section 4.1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username Token1</em>' containment reference.
	 * @see #setUsernameToken1(UsernameTokenType)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_UsernameToken1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UsernameToken' namespace='##targetNamespace'"
	 * @generated
	 */
	UsernameTokenType getUsernameToken1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getUsernameToken1 <em>Username Token1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username Token1</em>' containment reference.
	 * @see #getUsernameToken1()
	 * @generated
	 */
	void setUsernameToken1(UsernameTokenType value);

	/**
	 * Returns the value of the '<em><b>Usage1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This global attribute is used to indicate the usage of a referenced or indicated token within the containing context
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage1</em>' attribute.
	 * @see #setUsage1(List)
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#getDocumentRoot_Usage1()
	 * @model dataType="org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.TUsage" many="false"
	 *        extendedMetaData="kind='attribute' name='Usage' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getUsage1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot#getUsage1 <em>Usage1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage1</em>' attribute.
	 * @see #getUsage1()
	 * @generated
	 */
	void setUsage1(List<String> value);

} // DocumentRoot
