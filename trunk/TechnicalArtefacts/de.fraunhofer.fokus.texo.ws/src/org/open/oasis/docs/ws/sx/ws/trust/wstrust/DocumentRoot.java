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
package org.open.oasis.docs.ws.sx.ws.trust.wstrust;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._2005._08.wsaddressing.EndpointReferenceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAllowPostdating <em>Allow Postdating</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAuthenticationType <em>Authentication Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAuthenticator <em>Authenticator</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getBinaryExchange <em>Binary Exchange</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getBinarySecret <em>Binary Secret</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCancelTarget <em>Cancel Target</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCanonicalizationAlgorithm <em>Canonicalization Algorithm</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getChallenge <em>Challenge</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getClaims <em>Claims</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCombinedHash <em>Combined Hash</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getComputedKey <em>Computed Key</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getComputedKeyAlgorithm <em>Computed Key Algorithm</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#isDelegatable <em>Delegatable</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getDelegateTo <em>Delegate To</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryptWith <em>Encrypt With</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEntropy <em>Entropy</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#isForwardable <em>Forwardable</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getIssuedTokens <em>Issued Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyExchangeToken <em>Key Exchange Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeySize <em>Key Size</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyWrapAlgorithm <em>Key Wrap Algorithm</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getLifetime <em>Lifetime</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getProofEncryption <em>Proof Encryption</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRenewing <em>Renewing</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRenewTarget <em>Renew Target</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedAttachedReference <em>Requested Attached Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedProofToken <em>Requested Proof Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedSecurityToken <em>Requested Security Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedTokenCancelled <em>Requested Token Cancelled</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedUnattachedReference <em>Requested Unattached Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestKET <em>Request KET</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityToken <em>Request Security Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenCollection <em>Request Security Token Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenResponse <em>Request Security Token Response</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenResponseCollection <em>Request Security Token Response Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignChallenge <em>Sign Challenge</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignChallengeResponse <em>Sign Challenge Response</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignWith <em>Sign With</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getStatus <em>Status</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getTokenType <em>Token Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getUseKey <em>Use Key</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getValidateTarget <em>Validate Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot()
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
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Mixed()
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
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Allow Postdating</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Postdating</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Postdating</em>' containment reference.
	 * @see #setAllowPostdating(AllowPostdatingType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_AllowPostdating()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AllowPostdating' namespace='##targetNamespace'"
	 * @generated
	 */
	AllowPostdatingType getAllowPostdating();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAllowPostdating <em>Allow Postdating</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Postdating</em>' containment reference.
	 * @see #getAllowPostdating()
	 * @generated
	 */
	void setAllowPostdating(AllowPostdatingType value);

	/**
	 * Returns the value of the '<em><b>Authentication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Type</em>' attribute.
	 * @see #setAuthenticationType(String)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_AuthenticationType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuthenticationType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthenticationType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAuthenticationType <em>Authentication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Type</em>' attribute.
	 * @see #getAuthenticationType()
	 * @generated
	 */
	void setAuthenticationType(String value);

	/**
	 * Returns the value of the '<em><b>Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authenticator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticator</em>' containment reference.
	 * @see #setAuthenticator(AuthenticatorType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Authenticator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Authenticator' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthenticatorType getAuthenticator();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAuthenticator <em>Authenticator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticator</em>' containment reference.
	 * @see #getAuthenticator()
	 * @generated
	 */
	void setAuthenticator(AuthenticatorType value);

	/**
	 * Returns the value of the '<em><b>Binary Exchange</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Exchange</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Exchange</em>' containment reference.
	 * @see #setBinaryExchange(BinaryExchangeType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_BinaryExchange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinaryExchange' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryExchangeType getBinaryExchange();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getBinaryExchange <em>Binary Exchange</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Exchange</em>' containment reference.
	 * @see #getBinaryExchange()
	 * @generated
	 */
	void setBinaryExchange(BinaryExchangeType value);

	/**
	 * Returns the value of the '<em><b>Binary Secret</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Secret</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Secret</em>' containment reference.
	 * @see #setBinarySecret(BinarySecretType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_BinarySecret()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinarySecret' namespace='##targetNamespace'"
	 * @generated
	 */
	BinarySecretType getBinarySecret();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getBinarySecret <em>Binary Secret</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Secret</em>' containment reference.
	 * @see #getBinarySecret()
	 * @generated
	 */
	void setBinarySecret(BinarySecretType value);

	/**
	 * Returns the value of the '<em><b>Cancel Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Target</em>' containment reference.
	 * @see #setCancelTarget(CancelTargetType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_CancelTarget()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CancelTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	CancelTargetType getCancelTarget();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCancelTarget <em>Cancel Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Target</em>' containment reference.
	 * @see #getCancelTarget()
	 * @generated
	 */
	void setCancelTarget(CancelTargetType value);

	/**
	 * Returns the value of the '<em><b>Canonicalization Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonicalization Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canonicalization Algorithm</em>' attribute.
	 * @see #setCanonicalizationAlgorithm(String)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_CanonicalizationAlgorithm()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CanonicalizationAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCanonicalizationAlgorithm();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCanonicalizationAlgorithm <em>Canonicalization Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonicalization Algorithm</em>' attribute.
	 * @see #getCanonicalizationAlgorithm()
	 * @generated
	 */
	void setCanonicalizationAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Challenge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Challenge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Challenge</em>' attribute.
	 * @see #setChallenge(String)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Challenge()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Challenge' namespace='##targetNamespace'"
	 * @generated
	 */
	String getChallenge();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getChallenge <em>Challenge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Challenge</em>' attribute.
	 * @see #getChallenge()
	 * @generated
	 */
	void setChallenge(String value);

	/**
	 * Returns the value of the '<em><b>Claims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claims</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claims</em>' containment reference.
	 * @see #setClaims(ClaimsType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Claims()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Claims' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimsType getClaims();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getClaims <em>Claims</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claims</em>' containment reference.
	 * @see #getClaims()
	 * @generated
	 */
	void setClaims(ClaimsType value);

	/**
	 * Returns the value of the '<em><b>Combined Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combined Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined Hash</em>' attribute.
	 * @see #setCombinedHash(byte[])
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_CombinedHash()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CombinedHash' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getCombinedHash();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCombinedHash <em>Combined Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Hash</em>' attribute.
	 * @see #getCombinedHash()
	 * @generated
	 */
	void setCombinedHash(byte[] value);

	/**
	 * Returns the value of the '<em><b>Computed Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computed Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Key</em>' attribute.
	 * @see #setComputedKey(Object)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_ComputedKey()
	 * @model unique="false" dataType="org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyOpenEnum" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ComputedKey' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getComputedKey();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getComputedKey <em>Computed Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Key</em>' attribute.
	 * @see #getComputedKey()
	 * @generated
	 */
	void setComputedKey(Object value);

	/**
	 * Returns the value of the '<em><b>Computed Key Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computed Key Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Key Algorithm</em>' attribute.
	 * @see #setComputedKeyAlgorithm(String)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_ComputedKeyAlgorithm()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ComputedKeyAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComputedKeyAlgorithm();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getComputedKeyAlgorithm <em>Computed Key Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Key Algorithm</em>' attribute.
	 * @see #getComputedKeyAlgorithm()
	 * @generated
	 */
	void setComputedKeyAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Delegatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegatable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegatable</em>' attribute.
	 * @see #setDelegatable(boolean)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Delegatable()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Delegatable' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDelegatable();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#isDelegatable <em>Delegatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegatable</em>' attribute.
	 * @see #isDelegatable()
	 * @generated
	 */
	void setDelegatable(boolean value);

	/**
	 * Returns the value of the '<em><b>Delegate To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate To</em>' containment reference.
	 * @see #setDelegateTo(DelegateToType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_DelegateTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DelegateTo' namespace='##targetNamespace'"
	 * @generated
	 */
	DelegateToType getDelegateTo();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getDelegateTo <em>Delegate To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate To</em>' containment reference.
	 * @see #getDelegateTo()
	 * @generated
	 */
	void setDelegateTo(DelegateToType value);

	/**
	 * Returns the value of the '<em><b>Encryption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encryption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption</em>' containment reference.
	 * @see #setEncryption(EncryptionType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Encryption()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Encryption' namespace='##targetNamespace'"
	 * @generated
	 */
	EncryptionType getEncryption();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryption <em>Encryption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption</em>' containment reference.
	 * @see #getEncryption()
	 * @generated
	 */
	void setEncryption(EncryptionType value);

	/**
	 * Returns the value of the '<em><b>Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encryption Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #setEncryptionAlgorithm(String)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_EncryptionAlgorithm()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptionAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryptionAlgorithm <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 */
	void setEncryptionAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Encrypt With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypt With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypt With</em>' attribute.
	 * @see #setEncryptWith(String)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_EncryptWith()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptWith' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEncryptWith();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryptWith <em>Encrypt With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypt With</em>' attribute.
	 * @see #getEncryptWith()
	 * @generated
	 */
	void setEncryptWith(String value);

	/**
	 * Returns the value of the '<em><b>Entropy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entropy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entropy</em>' containment reference.
	 * @see #setEntropy(EntropyType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Entropy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Entropy' namespace='##targetNamespace'"
	 * @generated
	 */
	EntropyType getEntropy();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEntropy <em>Entropy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entropy</em>' containment reference.
	 * @see #getEntropy()
	 * @generated
	 */
	void setEntropy(EntropyType value);

	/**
	 * Returns the value of the '<em><b>Forwardable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forwardable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forwardable</em>' attribute.
	 * @see #setForwardable(boolean)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Forwardable()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Forwardable' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isForwardable();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#isForwardable <em>Forwardable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forwardable</em>' attribute.
	 * @see #isForwardable()
	 * @generated
	 */
	void setForwardable(boolean value);

	/**
	 * Returns the value of the '<em><b>Issued Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issued Tokens</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued Tokens</em>' containment reference.
	 * @see #setIssuedTokens(RequestSecurityTokenResponseCollectionType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_IssuedTokens()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IssuedTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestSecurityTokenResponseCollectionType getIssuedTokens();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getIssuedTokens <em>Issued Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued Tokens</em>' containment reference.
	 * @see #getIssuedTokens()
	 * @generated
	 */
	void setIssuedTokens(RequestSecurityTokenResponseCollectionType value);

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issuer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer</em>' containment reference.
	 * @see #setIssuer(EndpointReferenceType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Issuer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Issuer' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType getIssuer();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getIssuer <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' containment reference.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(EndpointReferenceType value);

	/**
	 * Returns the value of the '<em><b>Key Exchange Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Exchange Token</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Exchange Token</em>' containment reference.
	 * @see #setKeyExchangeToken(KeyExchangeTokenType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_KeyExchangeToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyExchangeToken' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyExchangeTokenType getKeyExchangeToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyExchangeToken <em>Key Exchange Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Exchange Token</em>' containment reference.
	 * @see #getKeyExchangeToken()
	 * @generated
	 */
	void setKeyExchangeToken(KeyExchangeTokenType value);

	/**
	 * Returns the value of the '<em><b>Key Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Size</em>' attribute.
	 * @see #setKeySize(long)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_KeySize()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeySize' namespace='##targetNamespace'"
	 * @generated
	 */
	long getKeySize();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeySize <em>Key Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Size</em>' attribute.
	 * @see #getKeySize()
	 * @generated
	 */
	void setKeySize(long value);

	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' attribute.
	 * @see #setKeyType(Object)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_KeyType()
	 * @model unique="false" dataType="org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeOpenEnum" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyType' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getKeyType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyType <em>Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' attribute.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(Object value);

	/**
	 * Returns the value of the '<em><b>Key Wrap Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Wrap Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Wrap Algorithm</em>' attribute.
	 * @see #setKeyWrapAlgorithm(String)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_KeyWrapAlgorithm()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyWrapAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKeyWrapAlgorithm();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyWrapAlgorithm <em>Key Wrap Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Wrap Algorithm</em>' attribute.
	 * @see #getKeyWrapAlgorithm()
	 * @generated
	 */
	void setKeyWrapAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Lifetime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifetime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifetime</em>' containment reference.
	 * @see #setLifetime(LifetimeType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Lifetime()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Lifetime' namespace='##targetNamespace'"
	 * @generated
	 */
	LifetimeType getLifetime();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getLifetime <em>Lifetime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifetime</em>' containment reference.
	 * @see #getLifetime()
	 * @generated
	 */
	void setLifetime(LifetimeType value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Behalf Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #setOnBehalfOf(OnBehalfOfType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_OnBehalfOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OnBehalfOf' namespace='##targetNamespace'"
	 * @generated
	 */
	OnBehalfOfType getOnBehalfOf();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getOnBehalfOf <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(OnBehalfOfType value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference.
	 * @see #setParticipants(ParticipantsType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Participants()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Participants' namespace='##targetNamespace'"
	 * @generated
	 */
	ParticipantsType getParticipants();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getParticipants <em>Participants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participants</em>' containment reference.
	 * @see #getParticipants()
	 * @generated
	 */
	void setParticipants(ParticipantsType value);

	/**
	 * Returns the value of the '<em><b>Proof Encryption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proof Encryption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proof Encryption</em>' containment reference.
	 * @see #setProofEncryption(ProofEncryptionType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_ProofEncryption()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProofEncryption' namespace='##targetNamespace'"
	 * @generated
	 */
	ProofEncryptionType getProofEncryption();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getProofEncryption <em>Proof Encryption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proof Encryption</em>' containment reference.
	 * @see #getProofEncryption()
	 * @generated
	 */
	void setProofEncryption(ProofEncryptionType value);

	/**
	 * Returns the value of the '<em><b>Renewing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renewing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renewing</em>' containment reference.
	 * @see #setRenewing(RenewingType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Renewing()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Renewing' namespace='##targetNamespace'"
	 * @generated
	 */
	RenewingType getRenewing();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRenewing <em>Renewing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renewing</em>' containment reference.
	 * @see #getRenewing()
	 * @generated
	 */
	void setRenewing(RenewingType value);

	/**
	 * Returns the value of the '<em><b>Renew Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renew Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renew Target</em>' containment reference.
	 * @see #setRenewTarget(RenewTargetType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RenewTarget()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RenewTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	RenewTargetType getRenewTarget();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRenewTarget <em>Renew Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renew Target</em>' containment reference.
	 * @see #getRenewTarget()
	 * @generated
	 */
	void setRenewTarget(RenewTargetType value);

	/**
	 * Returns the value of the '<em><b>Requested Attached Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Attached Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Attached Reference</em>' containment reference.
	 * @see #setRequestedAttachedReference(RequestedReferenceType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RequestedAttachedReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestedAttachedReference' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestedReferenceType getRequestedAttachedReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedAttachedReference <em>Requested Attached Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Attached Reference</em>' containment reference.
	 * @see #getRequestedAttachedReference()
	 * @generated
	 */
	void setRequestedAttachedReference(RequestedReferenceType value);

	/**
	 * Returns the value of the '<em><b>Requested Proof Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Proof Token</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Proof Token</em>' containment reference.
	 * @see #setRequestedProofToken(RequestedProofTokenType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RequestedProofToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestedProofToken' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestedProofTokenType getRequestedProofToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedProofToken <em>Requested Proof Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Proof Token</em>' containment reference.
	 * @see #getRequestedProofToken()
	 * @generated
	 */
	void setRequestedProofToken(RequestedProofTokenType value);

	/**
	 * Returns the value of the '<em><b>Requested Security Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Security Token</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Security Token</em>' containment reference.
	 * @see #setRequestedSecurityToken(RequestedSecurityTokenType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RequestedSecurityToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestedSecurityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestedSecurityTokenType getRequestedSecurityToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedSecurityToken <em>Requested Security Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Security Token</em>' containment reference.
	 * @see #getRequestedSecurityToken()
	 * @generated
	 */
	void setRequestedSecurityToken(RequestedSecurityTokenType value);

	/**
	 * Returns the value of the '<em><b>Requested Token Cancelled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Token Cancelled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Token Cancelled</em>' containment reference.
	 * @see #setRequestedTokenCancelled(RequestedTokenCancelledType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RequestedTokenCancelled()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestedTokenCancelled' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestedTokenCancelledType getRequestedTokenCancelled();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedTokenCancelled <em>Requested Token Cancelled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Token Cancelled</em>' containment reference.
	 * @see #getRequestedTokenCancelled()
	 * @generated
	 */
	void setRequestedTokenCancelled(RequestedTokenCancelledType value);

	/**
	 * Returns the value of the '<em><b>Requested Unattached Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Unattached Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Unattached Reference</em>' containment reference.
	 * @see #setRequestedUnattachedReference(RequestedReferenceType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RequestedUnattachedReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestedUnattachedReference' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestedReferenceType getRequestedUnattachedReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedUnattachedReference <em>Requested Unattached Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Unattached Reference</em>' containment reference.
	 * @see #getRequestedUnattachedReference()
	 * @generated
	 */
	void setRequestedUnattachedReference(RequestedReferenceType value);

	/**
	 * Returns the value of the '<em><b>Request KET</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request KET</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request KET</em>' containment reference.
	 * @see #setRequestKET(RequestKETType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RequestKET()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestKET' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestKETType getRequestKET();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestKET <em>Request KET</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request KET</em>' containment reference.
	 * @see #getRequestKET()
	 * @generated
	 */
	void setRequestKET(RequestKETType value);

	/**
	 * Returns the value of the '<em><b>Request Security Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Security Token</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Security Token</em>' containment reference.
	 * @see #setRequestSecurityToken(RequestSecurityTokenType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RequestSecurityToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestSecurityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestSecurityTokenType getRequestSecurityToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityToken <em>Request Security Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Security Token</em>' containment reference.
	 * @see #getRequestSecurityToken()
	 * @generated
	 */
	void setRequestSecurityToken(RequestSecurityTokenType value);

	/**
	 * Returns the value of the '<em><b>Request Security Token Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Security Token Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Security Token Collection</em>' containment reference.
	 * @see #setRequestSecurityTokenCollection(RequestSecurityTokenCollectionType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RequestSecurityTokenCollection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestSecurityTokenCollection' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestSecurityTokenCollectionType getRequestSecurityTokenCollection();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenCollection <em>Request Security Token Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Security Token Collection</em>' containment reference.
	 * @see #getRequestSecurityTokenCollection()
	 * @generated
	 */
	void setRequestSecurityTokenCollection(RequestSecurityTokenCollectionType value);

	/**
	 * Returns the value of the '<em><b>Request Security Token Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Security Token Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Security Token Response</em>' containment reference.
	 * @see #setRequestSecurityTokenResponse(RequestSecurityTokenResponseType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RequestSecurityTokenResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestSecurityTokenResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestSecurityTokenResponseType getRequestSecurityTokenResponse();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenResponse <em>Request Security Token Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Security Token Response</em>' containment reference.
	 * @see #getRequestSecurityTokenResponse()
	 * @generated
	 */
	void setRequestSecurityTokenResponse(RequestSecurityTokenResponseType value);

	/**
	 * Returns the value of the '<em><b>Request Security Token Response Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Security Token Response Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Security Token Response Collection</em>' containment reference.
	 * @see #setRequestSecurityTokenResponseCollection(RequestSecurityTokenResponseCollectionType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RequestSecurityTokenResponseCollection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestSecurityTokenResponseCollection' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestSecurityTokenResponseCollectionType getRequestSecurityTokenResponseCollection();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenResponseCollection <em>Request Security Token Response Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Security Token Response Collection</em>' containment reference.
	 * @see #getRequestSecurityTokenResponseCollection()
	 * @generated
	 */
	void setRequestSecurityTokenResponseCollection(RequestSecurityTokenResponseCollectionType value);

	/**
	 * Returns the value of the '<em><b>Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Type</em>' attribute.
	 * @see #setRequestType(Object)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_RequestType()
	 * @model unique="false" dataType="org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeOpenEnum" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestType' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getRequestType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestType <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Type</em>' attribute.
	 * @see #getRequestType()
	 * @generated
	 */
	void setRequestType(Object value);

	/**
	 * Returns the value of the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #setSignatureAlgorithm(String)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_SignatureAlgorithm()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSignatureAlgorithm();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignatureAlgorithm <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #getSignatureAlgorithm()
	 * @generated
	 */
	void setSignatureAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Sign Challenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Challenge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Challenge</em>' containment reference.
	 * @see #setSignChallenge(SignChallengeType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_SignChallenge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignChallenge' namespace='##targetNamespace'"
	 * @generated
	 */
	SignChallengeType getSignChallenge();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignChallenge <em>Sign Challenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Challenge</em>' containment reference.
	 * @see #getSignChallenge()
	 * @generated
	 */
	void setSignChallenge(SignChallengeType value);

	/**
	 * Returns the value of the '<em><b>Sign Challenge Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Challenge Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Challenge Response</em>' containment reference.
	 * @see #setSignChallengeResponse(SignChallengeType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_SignChallengeResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignChallengeResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	SignChallengeType getSignChallengeResponse();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignChallengeResponse <em>Sign Challenge Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Challenge Response</em>' containment reference.
	 * @see #getSignChallengeResponse()
	 * @generated
	 */
	void setSignChallengeResponse(SignChallengeType value);

	/**
	 * Returns the value of the '<em><b>Sign With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign With</em>' attribute.
	 * @see #setSignWith(String)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_SignWith()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignWith' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSignWith();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignWith <em>Sign With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign With</em>' attribute.
	 * @see #getSignWith()
	 * @generated
	 */
	void setSignWith(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(StatusType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_Status()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Status' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Returns the value of the '<em><b>Token Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Type</em>' attribute.
	 * @see #setTokenType(String)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_TokenType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TokenType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTokenType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getTokenType <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Type</em>' attribute.
	 * @see #getTokenType()
	 * @generated
	 */
	void setTokenType(String value);

	/**
	 * Returns the value of the '<em><b>Use Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Key</em>' containment reference.
	 * @see #setUseKey(UseKeyType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_UseKey()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UseKey' namespace='##targetNamespace'"
	 * @generated
	 */
	UseKeyType getUseKey();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getUseKey <em>Use Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Key</em>' containment reference.
	 * @see #getUseKey()
	 * @generated
	 */
	void setUseKey(UseKeyType value);

	/**
	 * Returns the value of the '<em><b>Validate Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Target</em>' containment reference.
	 * @see #setValidateTarget(ValidateTargetType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getDocumentRoot_ValidateTarget()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValidateTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidateTargetType getValidateTarget();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getValidateTarget <em>Validate Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Target</em>' containment reference.
	 * @see #getValidateTarget()
	 * @generated
	 */
	void setValidateTarget(ValidateTargetType value);

} // DocumentRoot
