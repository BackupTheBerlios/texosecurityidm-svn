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

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.NestedPolicyType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.QNameAssertionType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getAbsXPath <em>Abs XPath</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getAlgorithmSuite <em>Algorithm Suite</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getAsymmetricBinding <em>Asymmetric Binding</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic128 <em>Basic128</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic128Rsa15 <em>Basic128 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic128Sha256 <em>Basic128 Sha256</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic128Sha256Rsa15 <em>Basic128 Sha256 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic192 <em>Basic192</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic192Rsa15 <em>Basic192 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic192Sha256 <em>Basic192 Sha256</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic192Sha256Rsa15 <em>Basic192 Sha256 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic256 <em>Basic256</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic256Rsa15 <em>Basic256 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic256Sha256 <em>Basic256 Sha256</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBasic256Sha256Rsa15 <em>Basic256 Sha256 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getBootstrapPolicy <em>Bootstrap Policy</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getEncryptBeforeSigning <em>Encrypt Before Signing</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getEncryptedElements <em>Encrypted Elements</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getEncryptedParts <em>Encrypted Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getEncryptedSupportingTokens <em>Encrypted Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getEncryptionToken <em>Encryption Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getEncryptSignature <em>Encrypt Signature</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getEndorsingEncryptedSupportingTokens <em>Endorsing Encrypted Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getEndorsingSupportingTokens <em>Endorsing Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getHashPassword <em>Hash Password</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getHttpBasicAuthentication <em>Http Basic Authentication</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getHttpDigestAuthentication <em>Http Digest Authentication</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getHttpsToken <em>Https Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getIncludeTimestamp <em>Include Timestamp</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getInclusiveC14N <em>Inclusive C14N</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getInitiatorEncryptionToken <em>Initiator Encryption Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getInitiatorSignatureToken <em>Initiator Signature Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getInitiatorToken <em>Initiator Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getIssuedToken <em>Issued Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getKerberosToken <em>Kerberos Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getKeyValueToken <em>Key Value Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getLax <em>Lax</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getLaxTsFirst <em>Lax Ts First</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getLaxTsLast <em>Lax Ts Last</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustNotSendAmend <em>Must Not Send Amend</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustNotSendCancel <em>Must Not Send Cancel</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustNotSendRenew <em>Must Not Send Renew</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustSupportClientChallenge <em>Must Support Client Challenge</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustSupportIssuedTokens <em>Must Support Issued Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustSupportRefEmbeddedToken <em>Must Support Ref Embedded Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustSupportRefEncryptedKey <em>Must Support Ref Encrypted Key</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustSupportRefExternalURI <em>Must Support Ref External URI</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustSupportRefIssuerSerial <em>Must Support Ref Issuer Serial</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustSupportRefKeyIdentifier <em>Must Support Ref Key Identifier</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustSupportRefThumbprint <em>Must Support Ref Thumbprint</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getMustSupportServerChallenge <em>Must Support Server Challenge</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getNoPassword <em>No Password</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getOnlySignEntireHeadersAndBody <em>Only Sign Entire Headers And Body</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getProtectionToken <em>Protection Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getProtectTokens <em>Protect Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRecipientEncryptionToken <em>Recipient Encryption Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRecipientSignatureToken <em>Recipient Signature Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRecipientToken <em>Recipient Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRelToken <em>Rel Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireAppiesTo <em>Require Appies To</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireClientCertificate <em>Require Client Certificate</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireClientEntropy <em>Require Client Entropy</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequiredElements <em>Required Elements</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireDerivedKeys <em>Require Derived Keys</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireEmbeddedTokenReference <em>Require Embedded Token Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireExplicitDerivedKeys <em>Require Explicit Derived Keys</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireExternalReference <em>Require External Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireExternalUriReference <em>Require External Uri Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireImpliedDerivedKeys <em>Require Implied Derived Keys</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireInternalReference <em>Require Internal Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireIssuerSerialReference <em>Require Issuer Serial Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireKeyIdentifierReference <em>Require Key Identifier Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireRequestSecurityTokenCollection <em>Require Request Security Token Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireServerEntropy <em>Require Server Entropy</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireSignatureConfirmation <em>Require Signature Confirmation</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRequireThumbprintReference <em>Require Thumbprint Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getRsaKeyValue <em>Rsa Key Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSamlToken <em>Saml Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSC13SecurityContextToken <em>SC13 Security Context Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSecureConversationToken <em>Secure Conversation Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSecurityContextToken <em>Security Context Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSignatureToken <em>Signature Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSignedElements <em>Signed Elements</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSignedEncryptedSupportingTokens <em>Signed Encrypted Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSignedEndorsingEncryptedSupportingTokens <em>Signed Endorsing Encrypted Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSignedEndorsingSupportingTokens <em>Signed Endorsing Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSignedParts <em>Signed Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSignedSupportingTokens <em>Signed Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSOAPNormalization10 <em>SOAP Normalization10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSpnegoContextToken <em>Spnego Context Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getStrict <em>Strict</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSTRTransform10 <em>STR Transform10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSupportingTokens <em>Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getSymmetricBinding <em>Symmetric Binding</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getTransportBinding <em>Transport Binding</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getTransportToken <em>Transport Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getTripleDes <em>Triple Des</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getTripleDesRsa15 <em>Triple Des Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getTripleDesSha256 <em>Triple Des Sha256</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getTripleDesSha256Rsa15 <em>Triple Des Sha256 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getTrust13 <em>Trust13</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getUsernameToken <em>Username Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWss10 <em>Wss10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWss11 <em>Wss11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssGssKerberosV5ApReqToken11 <em>Wss Gss Kerberos V5 Ap Req Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssKerberosV5ApReqToken11 <em>Wss Kerberos V5 Ap Req Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssRelV10Token10 <em>Wss Rel V10 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssRelV10Token11 <em>Wss Rel V10 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssRelV20Token10 <em>Wss Rel V20 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssRelV20Token11 <em>Wss Rel V20 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssSamlV11Token10 <em>Wss Saml V11 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssSamlV11Token11 <em>Wss Saml V11 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssSamlV20Token11 <em>Wss Saml V20 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssUsernameToken10 <em>Wss Username Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssUsernameToken11 <em>Wss Username Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssX509Pkcs7Token10 <em>Wss X509 Pkcs7 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssX509Pkcs7Token11 <em>Wss X509 Pkcs7 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssX509PkiPathV1Token10 <em>Wss X509 Pki Path V1 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssX509PkiPathV1Token11 <em>Wss X509 Pki Path V1 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssX509V1Token11 <em>Wss X509V1 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssX509V3Token10 <em>Wss X509V3 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getWssX509V3Token11 <em>Wss X509V3 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getX509Token <em>X509 Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getXPath10 <em>XPath10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getXPathFilter20 <em>XPath Filter20</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl#getIncludeToken <em>Include Token</em>}</li>
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
		return _200702Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _200702Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _200702Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _200702Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getAbsXPath() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ABS_XPATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbsXPath(QNameAssertionType newAbsXPath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ABS_XPATH, newAbsXPath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsXPath(QNameAssertionType newAbsXPath) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ABS_XPATH, newAbsXPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getAlgorithmSuite() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ALGORITHM_SUITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithmSuite(NestedPolicyType newAlgorithmSuite, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ALGORITHM_SUITE, newAlgorithmSuite, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmSuite(NestedPolicyType newAlgorithmSuite) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ALGORITHM_SUITE, newAlgorithmSuite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getAsymmetricBinding() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ASYMMETRIC_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsymmetricBinding(NestedPolicyType newAsymmetricBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ASYMMETRIC_BINDING, newAsymmetricBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsymmetricBinding(NestedPolicyType newAsymmetricBinding) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ASYMMETRIC_BINDING, newAsymmetricBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic128() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC128, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic128(QNameAssertionType newBasic128, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC128, newBasic128, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic128(QNameAssertionType newBasic128) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC128, newBasic128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic128Rsa15() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_RSA15, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic128Rsa15(QNameAssertionType newBasic128Rsa15, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_RSA15, newBasic128Rsa15, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic128Rsa15(QNameAssertionType newBasic128Rsa15) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_RSA15, newBasic128Rsa15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic128Sha256() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic128Sha256(QNameAssertionType newBasic128Sha256, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256, newBasic128Sha256, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic128Sha256(QNameAssertionType newBasic128Sha256) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256, newBasic128Sha256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic128Sha256Rsa15() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256_RSA15, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic128Sha256Rsa15(QNameAssertionType newBasic128Sha256Rsa15, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256_RSA15, newBasic128Sha256Rsa15, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic128Sha256Rsa15(QNameAssertionType newBasic128Sha256Rsa15) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256_RSA15, newBasic128Sha256Rsa15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic192() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC192, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic192(QNameAssertionType newBasic192, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC192, newBasic192, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic192(QNameAssertionType newBasic192) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC192, newBasic192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic192Rsa15() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_RSA15, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic192Rsa15(QNameAssertionType newBasic192Rsa15, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_RSA15, newBasic192Rsa15, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic192Rsa15(QNameAssertionType newBasic192Rsa15) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_RSA15, newBasic192Rsa15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic192Sha256() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic192Sha256(QNameAssertionType newBasic192Sha256, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256, newBasic192Sha256, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic192Sha256(QNameAssertionType newBasic192Sha256) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256, newBasic192Sha256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic192Sha256Rsa15() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256_RSA15, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic192Sha256Rsa15(QNameAssertionType newBasic192Sha256Rsa15, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256_RSA15, newBasic192Sha256Rsa15, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic192Sha256Rsa15(QNameAssertionType newBasic192Sha256Rsa15) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256_RSA15, newBasic192Sha256Rsa15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic256() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC256, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic256(QNameAssertionType newBasic256, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC256, newBasic256, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic256(QNameAssertionType newBasic256) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC256, newBasic256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic256Rsa15() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_RSA15, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic256Rsa15(QNameAssertionType newBasic256Rsa15, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_RSA15, newBasic256Rsa15, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic256Rsa15(QNameAssertionType newBasic256Rsa15) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_RSA15, newBasic256Rsa15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic256Sha256() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic256Sha256(QNameAssertionType newBasic256Sha256, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256, newBasic256Sha256, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic256Sha256(QNameAssertionType newBasic256Sha256) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256, newBasic256Sha256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getBasic256Sha256Rsa15() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256_RSA15, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic256Sha256Rsa15(QNameAssertionType newBasic256Sha256Rsa15, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256_RSA15, newBasic256Sha256Rsa15, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic256Sha256Rsa15(QNameAssertionType newBasic256Sha256Rsa15) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256_RSA15, newBasic256Sha256Rsa15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getBootstrapPolicy() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__BOOTSTRAP_POLICY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBootstrapPolicy(NestedPolicyType newBootstrapPolicy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__BOOTSTRAP_POLICY, newBootstrapPolicy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBootstrapPolicy(NestedPolicyType newBootstrapPolicy) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__BOOTSTRAP_POLICY, newBootstrapPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getEncryptBeforeSigning() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptBeforeSigning(QNameAssertionType newEncryptBeforeSigning, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING, newEncryptBeforeSigning, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptBeforeSigning(QNameAssertionType newEncryptBeforeSigning) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING, newEncryptBeforeSigning);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerElementsType getEncryptedElements() {
		return (SerElementsType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptedElements(SerElementsType newEncryptedElements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS, newEncryptedElements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptedElements(SerElementsType newEncryptedElements) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS, newEncryptedElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SePartsType getEncryptedParts() {
		return (SePartsType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_PARTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptedParts(SePartsType newEncryptedParts, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_PARTS, newEncryptedParts, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptedParts(SePartsType newEncryptedParts) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_PARTS, newEncryptedParts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getEncryptedSupportingTokens() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptedSupportingTokens(NestedPolicyType newEncryptedSupportingTokens, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS, newEncryptedSupportingTokens, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptedSupportingTokens(NestedPolicyType newEncryptedSupportingTokens) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS, newEncryptedSupportingTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getEncryptionToken() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTION_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptionToken(NestedPolicyType newEncryptionToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTION_TOKEN, newEncryptionToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptionToken(NestedPolicyType newEncryptionToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTION_TOKEN, newEncryptionToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getEncryptSignature() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_SIGNATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptSignature(QNameAssertionType newEncryptSignature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_SIGNATURE, newEncryptSignature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptSignature(QNameAssertionType newEncryptSignature) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_SIGNATURE, newEncryptSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getEndorsingEncryptedSupportingTokens() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndorsingEncryptedSupportingTokens(NestedPolicyType newEndorsingEncryptedSupportingTokens, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS, newEndorsingEncryptedSupportingTokens, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndorsingEncryptedSupportingTokens(NestedPolicyType newEndorsingEncryptedSupportingTokens) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS, newEndorsingEncryptedSupportingTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getEndorsingSupportingTokens() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndorsingSupportingTokens(NestedPolicyType newEndorsingSupportingTokens, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS, newEndorsingSupportingTokens, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndorsingSupportingTokens(NestedPolicyType newEndorsingSupportingTokens) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS, newEndorsingSupportingTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getHashPassword() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__HASH_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHashPassword(QNameAssertionType newHashPassword, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__HASH_PASSWORD, newHashPassword, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashPassword(QNameAssertionType newHashPassword) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__HASH_PASSWORD, newHashPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getHttpBasicAuthentication() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHttpBasicAuthentication(QNameAssertionType newHttpBasicAuthentication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION, newHttpBasicAuthentication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBasicAuthentication(QNameAssertionType newHttpBasicAuthentication) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION, newHttpBasicAuthentication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getHttpDigestAuthentication() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHttpDigestAuthentication(QNameAssertionType newHttpDigestAuthentication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION, newHttpDigestAuthentication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpDigestAuthentication(QNameAssertionType newHttpDigestAuthentication) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION, newHttpDigestAuthentication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAssertionType getHttpsToken() {
		return (TokenAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__HTTPS_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHttpsToken(TokenAssertionType newHttpsToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__HTTPS_TOKEN, newHttpsToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpsToken(TokenAssertionType newHttpsToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__HTTPS_TOKEN, newHttpsToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getIncludeTimestamp() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__INCLUDE_TIMESTAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludeTimestamp(QNameAssertionType newIncludeTimestamp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__INCLUDE_TIMESTAMP, newIncludeTimestamp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeTimestamp(QNameAssertionType newIncludeTimestamp) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__INCLUDE_TIMESTAMP, newIncludeTimestamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getInclusiveC14N() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__INCLUSIVE_C14N, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclusiveC14N(QNameAssertionType newInclusiveC14N, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__INCLUSIVE_C14N, newInclusiveC14N, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclusiveC14N(QNameAssertionType newInclusiveC14N) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__INCLUSIVE_C14N, newInclusiveC14N);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getInitiatorEncryptionToken() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiatorEncryptionToken(NestedPolicyType newInitiatorEncryptionToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN, newInitiatorEncryptionToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatorEncryptionToken(NestedPolicyType newInitiatorEncryptionToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN, newInitiatorEncryptionToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getInitiatorSignatureToken() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiatorSignatureToken(NestedPolicyType newInitiatorSignatureToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN, newInitiatorSignatureToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatorSignatureToken(NestedPolicyType newInitiatorSignatureToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN, newInitiatorSignatureToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getInitiatorToken() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiatorToken(NestedPolicyType newInitiatorToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_TOKEN, newInitiatorToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatorToken(NestedPolicyType newInitiatorToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_TOKEN, newInitiatorToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuedTokenType getIssuedToken() {
		return (IssuedTokenType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ISSUED_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuedToken(IssuedTokenType newIssuedToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ISSUED_TOKEN, newIssuedToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuedToken(IssuedTokenType newIssuedToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ISSUED_TOKEN, newIssuedToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAssertionType getKerberosToken() {
		return (TokenAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__KERBEROS_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKerberosToken(TokenAssertionType newKerberosToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__KERBEROS_TOKEN, newKerberosToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKerberosToken(TokenAssertionType newKerberosToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__KERBEROS_TOKEN, newKerberosToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueTokenType getKeyValueToken() {
		return (KeyValueTokenType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__KEY_VALUE_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyValueToken(KeyValueTokenType newKeyValueToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__KEY_VALUE_TOKEN, newKeyValueToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyValueToken(KeyValueTokenType newKeyValueToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__KEY_VALUE_TOKEN, newKeyValueToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getLax() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__LAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLax(QNameAssertionType newLax, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__LAX, newLax, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLax(QNameAssertionType newLax) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__LAX, newLax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getLaxTsFirst() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__LAX_TS_FIRST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaxTsFirst(QNameAssertionType newLaxTsFirst, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__LAX_TS_FIRST, newLaxTsFirst, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaxTsFirst(QNameAssertionType newLaxTsFirst) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__LAX_TS_FIRST, newLaxTsFirst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getLaxTsLast() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__LAX_TS_LAST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaxTsLast(QNameAssertionType newLaxTsLast, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__LAX_TS_LAST, newLaxTsLast, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaxTsLast(QNameAssertionType newLaxTsLast) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__LAX_TS_LAST, newLaxTsLast);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getLayout() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__LAYOUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(NestedPolicyType newLayout, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__LAYOUT, newLayout, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(NestedPolicyType newLayout) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__LAYOUT, newLayout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustNotSendAmend() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustNotSendAmend(QNameAssertionType newMustNotSendAmend, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND, newMustNotSendAmend, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustNotSendAmend(QNameAssertionType newMustNotSendAmend) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND, newMustNotSendAmend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustNotSendCancel() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustNotSendCancel(QNameAssertionType newMustNotSendCancel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL, newMustNotSendCancel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustNotSendCancel(QNameAssertionType newMustNotSendCancel) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL, newMustNotSendCancel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustNotSendRenew() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustNotSendRenew(QNameAssertionType newMustNotSendRenew, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW, newMustNotSendRenew, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustNotSendRenew(QNameAssertionType newMustNotSendRenew) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW, newMustNotSendRenew);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustSupportClientChallenge() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupportClientChallenge(QNameAssertionType newMustSupportClientChallenge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE, newMustSupportClientChallenge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupportClientChallenge(QNameAssertionType newMustSupportClientChallenge) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE, newMustSupportClientChallenge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustSupportIssuedTokens() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupportIssuedTokens(QNameAssertionType newMustSupportIssuedTokens, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS, newMustSupportIssuedTokens, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupportIssuedTokens(QNameAssertionType newMustSupportIssuedTokens) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS, newMustSupportIssuedTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustSupportRefEmbeddedToken() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupportRefEmbeddedToken(QNameAssertionType newMustSupportRefEmbeddedToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN, newMustSupportRefEmbeddedToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupportRefEmbeddedToken(QNameAssertionType newMustSupportRefEmbeddedToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN, newMustSupportRefEmbeddedToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustSupportRefEncryptedKey() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupportRefEncryptedKey(QNameAssertionType newMustSupportRefEncryptedKey, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY, newMustSupportRefEncryptedKey, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupportRefEncryptedKey(QNameAssertionType newMustSupportRefEncryptedKey) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY, newMustSupportRefEncryptedKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustSupportRefExternalURI() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupportRefExternalURI(QNameAssertionType newMustSupportRefExternalURI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI, newMustSupportRefExternalURI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupportRefExternalURI(QNameAssertionType newMustSupportRefExternalURI) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI, newMustSupportRefExternalURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustSupportRefIssuerSerial() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupportRefIssuerSerial(QNameAssertionType newMustSupportRefIssuerSerial, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL, newMustSupportRefIssuerSerial, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupportRefIssuerSerial(QNameAssertionType newMustSupportRefIssuerSerial) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL, newMustSupportRefIssuerSerial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustSupportRefKeyIdentifier() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupportRefKeyIdentifier(QNameAssertionType newMustSupportRefKeyIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER, newMustSupportRefKeyIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupportRefKeyIdentifier(QNameAssertionType newMustSupportRefKeyIdentifier) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER, newMustSupportRefKeyIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustSupportRefThumbprint() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupportRefThumbprint(QNameAssertionType newMustSupportRefThumbprint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT, newMustSupportRefThumbprint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupportRefThumbprint(QNameAssertionType newMustSupportRefThumbprint) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT, newMustSupportRefThumbprint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getMustSupportServerChallenge() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupportServerChallenge(QNameAssertionType newMustSupportServerChallenge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE, newMustSupportServerChallenge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupportServerChallenge(QNameAssertionType newMustSupportServerChallenge) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE, newMustSupportServerChallenge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getNoPassword() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__NO_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoPassword(QNameAssertionType newNoPassword, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__NO_PASSWORD, newNoPassword, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoPassword(QNameAssertionType newNoPassword) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__NO_PASSWORD, newNoPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getOnlySignEntireHeadersAndBody() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnlySignEntireHeadersAndBody(QNameAssertionType newOnlySignEntireHeadersAndBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY, newOnlySignEntireHeadersAndBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlySignEntireHeadersAndBody(QNameAssertionType newOnlySignEntireHeadersAndBody) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY, newOnlySignEntireHeadersAndBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getProtectionToken() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__PROTECTION_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtectionToken(NestedPolicyType newProtectionToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__PROTECTION_TOKEN, newProtectionToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionToken(NestedPolicyType newProtectionToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__PROTECTION_TOKEN, newProtectionToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getProtectTokens() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__PROTECT_TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtectTokens(QNameAssertionType newProtectTokens, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__PROTECT_TOKENS, newProtectTokens, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectTokens(QNameAssertionType newProtectTokens) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__PROTECT_TOKENS, newProtectTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getRecipientEncryptionToken() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipientEncryptionToken(NestedPolicyType newRecipientEncryptionToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN, newRecipientEncryptionToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientEncryptionToken(NestedPolicyType newRecipientEncryptionToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN, newRecipientEncryptionToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getRecipientSignatureToken() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipientSignatureToken(NestedPolicyType newRecipientSignatureToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN, newRecipientSignatureToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientSignatureToken(NestedPolicyType newRecipientSignatureToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN, newRecipientSignatureToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getRecipientToken() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipientToken(NestedPolicyType newRecipientToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_TOKEN, newRecipientToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientToken(NestedPolicyType newRecipientToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_TOKEN, newRecipientToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAssertionType getRelToken() {
		return (TokenAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REL_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelToken(TokenAssertionType newRelToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REL_TOKEN, newRelToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelToken(TokenAssertionType newRelToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REL_TOKEN, newRelToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireAppiesTo() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_APPIES_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireAppiesTo(QNameAssertionType newRequireAppiesTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_APPIES_TO, newRequireAppiesTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireAppiesTo(QNameAssertionType newRequireAppiesTo) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_APPIES_TO, newRequireAppiesTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireClientCertificate() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireClientCertificate(QNameAssertionType newRequireClientCertificate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE, newRequireClientCertificate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireClientCertificate(QNameAssertionType newRequireClientCertificate) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE, newRequireClientCertificate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireClientEntropy() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireClientEntropy(QNameAssertionType newRequireClientEntropy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY, newRequireClientEntropy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireClientEntropy(QNameAssertionType newRequireClientEntropy) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY, newRequireClientEntropy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerElementsType getRequiredElements() {
		return (SerElementsType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRED_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredElements(SerElementsType newRequiredElements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRED_ELEMENTS, newRequiredElements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredElements(SerElementsType newRequiredElements) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRED_ELEMENTS, newRequiredElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireDerivedKeys() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireDerivedKeys(QNameAssertionType newRequireDerivedKeys, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS, newRequireDerivedKeys, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireDerivedKeys(QNameAssertionType newRequireDerivedKeys) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS, newRequireDerivedKeys);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireEmbeddedTokenReference() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireEmbeddedTokenReference(QNameAssertionType newRequireEmbeddedTokenReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE, newRequireEmbeddedTokenReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireEmbeddedTokenReference(QNameAssertionType newRequireEmbeddedTokenReference) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE, newRequireEmbeddedTokenReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireExplicitDerivedKeys() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireExplicitDerivedKeys(QNameAssertionType newRequireExplicitDerivedKeys, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS, newRequireExplicitDerivedKeys, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireExplicitDerivedKeys(QNameAssertionType newRequireExplicitDerivedKeys) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS, newRequireExplicitDerivedKeys);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireExternalReference() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireExternalReference(QNameAssertionType newRequireExternalReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE, newRequireExternalReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireExternalReference(QNameAssertionType newRequireExternalReference) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE, newRequireExternalReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireExternalUriReference() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireExternalUriReference(QNameAssertionType newRequireExternalUriReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE, newRequireExternalUriReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireExternalUriReference(QNameAssertionType newRequireExternalUriReference) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE, newRequireExternalUriReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireImpliedDerivedKeys() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireImpliedDerivedKeys(QNameAssertionType newRequireImpliedDerivedKeys, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS, newRequireImpliedDerivedKeys, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireImpliedDerivedKeys(QNameAssertionType newRequireImpliedDerivedKeys) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS, newRequireImpliedDerivedKeys);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireInternalReference() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireInternalReference(QNameAssertionType newRequireInternalReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE, newRequireInternalReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireInternalReference(QNameAssertionType newRequireInternalReference) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE, newRequireInternalReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireIssuerSerialReference() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireIssuerSerialReference(QNameAssertionType newRequireIssuerSerialReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE, newRequireIssuerSerialReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireIssuerSerialReference(QNameAssertionType newRequireIssuerSerialReference) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE, newRequireIssuerSerialReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireKeyIdentifierReference() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireKeyIdentifierReference(QNameAssertionType newRequireKeyIdentifierReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE, newRequireKeyIdentifierReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireKeyIdentifierReference(QNameAssertionType newRequireKeyIdentifierReference) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE, newRequireKeyIdentifierReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireRequestSecurityTokenCollection() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireRequestSecurityTokenCollection(QNameAssertionType newRequireRequestSecurityTokenCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION, newRequireRequestSecurityTokenCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireRequestSecurityTokenCollection(QNameAssertionType newRequireRequestSecurityTokenCollection) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION, newRequireRequestSecurityTokenCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireServerEntropy() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireServerEntropy(QNameAssertionType newRequireServerEntropy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY, newRequireServerEntropy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireServerEntropy(QNameAssertionType newRequireServerEntropy) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY, newRequireServerEntropy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireSignatureConfirmation() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireSignatureConfirmation(QNameAssertionType newRequireSignatureConfirmation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION, newRequireSignatureConfirmation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireSignatureConfirmation(QNameAssertionType newRequireSignatureConfirmation) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION, newRequireSignatureConfirmation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRequireThumbprintReference() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireThumbprintReference(QNameAssertionType newRequireThumbprintReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE, newRequireThumbprintReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireThumbprintReference(QNameAssertionType newRequireThumbprintReference) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE, newRequireThumbprintReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getRsaKeyValue() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRsaKeyValue(QNameAssertionType newRsaKeyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE, newRsaKeyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRsaKeyValue(QNameAssertionType newRsaKeyValue) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE, newRsaKeyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAssertionType getSamlToken() {
		return (TokenAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SAML_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSamlToken(TokenAssertionType newSamlToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SAML_TOKEN, newSamlToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamlToken(TokenAssertionType newSamlToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SAML_TOKEN, newSamlToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getSC13SecurityContextToken() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSC13SecurityContextToken(QNameAssertionType newSC13SecurityContextToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN, newSC13SecurityContextToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSC13SecurityContextToken(QNameAssertionType newSC13SecurityContextToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN, newSC13SecurityContextToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecureConversationTokenType getSecureConversationToken() {
		return (SecureConversationTokenType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecureConversationToken(SecureConversationTokenType newSecureConversationToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN, newSecureConversationToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecureConversationToken(SecureConversationTokenType newSecureConversationToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN, newSecureConversationToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAssertionType getSecurityContextToken() {
		return (TokenAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityContextToken(TokenAssertionType newSecurityContextToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN, newSecurityContextToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityContextToken(TokenAssertionType newSecurityContextToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN, newSecurityContextToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getSignatureToken() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SIGNATURE_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureToken(NestedPolicyType newSignatureToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SIGNATURE_TOKEN, newSignatureToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureToken(NestedPolicyType newSignatureToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SIGNATURE_TOKEN, newSignatureToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerElementsType getSignedElements() {
		return (SerElementsType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignedElements(SerElementsType newSignedElements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ELEMENTS, newSignedElements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedElements(SerElementsType newSignedElements) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ELEMENTS, newSignedElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getSignedEncryptedSupportingTokens() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignedEncryptedSupportingTokens(NestedPolicyType newSignedEncryptedSupportingTokens, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS, newSignedEncryptedSupportingTokens, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedEncryptedSupportingTokens(NestedPolicyType newSignedEncryptedSupportingTokens) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS, newSignedEncryptedSupportingTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getSignedEndorsingEncryptedSupportingTokens() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignedEndorsingEncryptedSupportingTokens(NestedPolicyType newSignedEndorsingEncryptedSupportingTokens, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS, newSignedEndorsingEncryptedSupportingTokens, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedEndorsingEncryptedSupportingTokens(NestedPolicyType newSignedEndorsingEncryptedSupportingTokens) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS, newSignedEndorsingEncryptedSupportingTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getSignedEndorsingSupportingTokens() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignedEndorsingSupportingTokens(NestedPolicyType newSignedEndorsingSupportingTokens, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS, newSignedEndorsingSupportingTokens, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedEndorsingSupportingTokens(NestedPolicyType newSignedEndorsingSupportingTokens) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS, newSignedEndorsingSupportingTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SePartsType getSignedParts() {
		return (SePartsType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_PARTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignedParts(SePartsType newSignedParts, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_PARTS, newSignedParts, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedParts(SePartsType newSignedParts) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_PARTS, newSignedParts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getSignedSupportingTokens() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignedSupportingTokens(NestedPolicyType newSignedSupportingTokens, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS, newSignedSupportingTokens, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedSupportingTokens(NestedPolicyType newSignedSupportingTokens) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS, newSignedSupportingTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getSOAPNormalization10() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SOAP_NORMALIZATION10, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSOAPNormalization10(QNameAssertionType newSOAPNormalization10, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SOAP_NORMALIZATION10, newSOAPNormalization10, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSOAPNormalization10(QNameAssertionType newSOAPNormalization10) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SOAP_NORMALIZATION10, newSOAPNormalization10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpnegoContextTokenType getSpnegoContextToken() {
		return (SpnegoContextTokenType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpnegoContextToken(SpnegoContextTokenType newSpnegoContextToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN, newSpnegoContextToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpnegoContextToken(SpnegoContextTokenType newSpnegoContextToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN, newSpnegoContextToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getStrict() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__STRICT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrict(QNameAssertionType newStrict, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__STRICT, newStrict, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrict(QNameAssertionType newStrict) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__STRICT, newStrict);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getSTRTransform10() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__STR_TRANSFORM10, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTRTransform10(QNameAssertionType newSTRTransform10, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__STR_TRANSFORM10, newSTRTransform10, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTRTransform10(QNameAssertionType newSTRTransform10) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__STR_TRANSFORM10, newSTRTransform10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getSupportingTokens() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SUPPORTING_TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportingTokens(NestedPolicyType newSupportingTokens, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SUPPORTING_TOKENS, newSupportingTokens, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportingTokens(NestedPolicyType newSupportingTokens) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SUPPORTING_TOKENS, newSupportingTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getSymmetricBinding() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__SYMMETRIC_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymmetricBinding(NestedPolicyType newSymmetricBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__SYMMETRIC_BINDING, newSymmetricBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymmetricBinding(NestedPolicyType newSymmetricBinding) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__SYMMETRIC_BINDING, newSymmetricBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getTransportBinding() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportBinding(NestedPolicyType newTransportBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_BINDING, newTransportBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportBinding(NestedPolicyType newTransportBinding) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_BINDING, newTransportBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getTransportToken() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportToken(NestedPolicyType newTransportToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_TOKEN, newTransportToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportToken(NestedPolicyType newTransportToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_TOKEN, newTransportToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getTripleDes() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripleDes(QNameAssertionType newTripleDes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES, newTripleDes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTripleDes(QNameAssertionType newTripleDes) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES, newTripleDes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getTripleDesRsa15() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_RSA15, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripleDesRsa15(QNameAssertionType newTripleDesRsa15, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_RSA15, newTripleDesRsa15, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTripleDesRsa15(QNameAssertionType newTripleDesRsa15) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_RSA15, newTripleDesRsa15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getTripleDesSha256() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripleDesSha256(QNameAssertionType newTripleDesSha256, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256, newTripleDesSha256, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTripleDesSha256(QNameAssertionType newTripleDesSha256) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256, newTripleDesSha256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getTripleDesSha256Rsa15() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripleDesSha256Rsa15(QNameAssertionType newTripleDesSha256Rsa15, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15, newTripleDesSha256Rsa15, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTripleDesSha256Rsa15(QNameAssertionType newTripleDesSha256Rsa15) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15, newTripleDesSha256Rsa15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getTrust13() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__TRUST13, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrust13(NestedPolicyType newTrust13, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__TRUST13, newTrust13, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrust13(NestedPolicyType newTrust13) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__TRUST13, newTrust13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAssertionType getUsernameToken() {
		return (TokenAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsernameToken(TokenAssertionType newUsernameToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN, newUsernameToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsernameToken(TokenAssertionType newUsernameToken) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN, newUsernameToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getWss10() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS10, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWss10(NestedPolicyType newWss10, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS10, newWss10, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWss10(NestedPolicyType newWss10) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS10, newWss10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType getWss11() {
		return (NestedPolicyType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWss11(NestedPolicyType newWss11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS11, newWss11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWss11(NestedPolicyType newWss11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS11, newWss11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssGssKerberosV5ApReqToken11() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssGssKerberosV5ApReqToken11(QNameAssertionType newWssGssKerberosV5ApReqToken11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11, newWssGssKerberosV5ApReqToken11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssGssKerberosV5ApReqToken11(QNameAssertionType newWssGssKerberosV5ApReqToken11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11, newWssGssKerberosV5ApReqToken11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssKerberosV5ApReqToken11() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssKerberosV5ApReqToken11(QNameAssertionType newWssKerberosV5ApReqToken11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11, newWssKerberosV5ApReqToken11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssKerberosV5ApReqToken11(QNameAssertionType newWssKerberosV5ApReqToken11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11, newWssKerberosV5ApReqToken11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssRelV10Token10() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssRelV10Token10(QNameAssertionType newWssRelV10Token10, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10, newWssRelV10Token10, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssRelV10Token10(QNameAssertionType newWssRelV10Token10) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10, newWssRelV10Token10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssRelV10Token11() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssRelV10Token11(QNameAssertionType newWssRelV10Token11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11, newWssRelV10Token11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssRelV10Token11(QNameAssertionType newWssRelV10Token11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11, newWssRelV10Token11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssRelV20Token10() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssRelV20Token10(QNameAssertionType newWssRelV20Token10, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10, newWssRelV20Token10, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssRelV20Token10(QNameAssertionType newWssRelV20Token10) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10, newWssRelV20Token10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssRelV20Token11() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssRelV20Token11(QNameAssertionType newWssRelV20Token11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11, newWssRelV20Token11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssRelV20Token11(QNameAssertionType newWssRelV20Token11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11, newWssRelV20Token11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssSamlV11Token10() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssSamlV11Token10(QNameAssertionType newWssSamlV11Token10, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10, newWssSamlV11Token10, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssSamlV11Token10(QNameAssertionType newWssSamlV11Token10) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10, newWssSamlV11Token10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssSamlV11Token11() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssSamlV11Token11(QNameAssertionType newWssSamlV11Token11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11, newWssSamlV11Token11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssSamlV11Token11(QNameAssertionType newWssSamlV11Token11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11, newWssSamlV11Token11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssSamlV20Token11() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssSamlV20Token11(QNameAssertionType newWssSamlV20Token11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11, newWssSamlV20Token11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssSamlV20Token11(QNameAssertionType newWssSamlV20Token11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11, newWssSamlV20Token11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssUsernameToken10() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssUsernameToken10(QNameAssertionType newWssUsernameToken10, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10, newWssUsernameToken10, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssUsernameToken10(QNameAssertionType newWssUsernameToken10) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10, newWssUsernameToken10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssUsernameToken11() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssUsernameToken11(QNameAssertionType newWssUsernameToken11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11, newWssUsernameToken11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssUsernameToken11(QNameAssertionType newWssUsernameToken11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11, newWssUsernameToken11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssX509Pkcs7Token10() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssX509Pkcs7Token10(QNameAssertionType newWssX509Pkcs7Token10, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10, newWssX509Pkcs7Token10, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssX509Pkcs7Token10(QNameAssertionType newWssX509Pkcs7Token10) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10, newWssX509Pkcs7Token10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssX509Pkcs7Token11() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssX509Pkcs7Token11(QNameAssertionType newWssX509Pkcs7Token11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11, newWssX509Pkcs7Token11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssX509Pkcs7Token11(QNameAssertionType newWssX509Pkcs7Token11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11, newWssX509Pkcs7Token11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssX509PkiPathV1Token10() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssX509PkiPathV1Token10(QNameAssertionType newWssX509PkiPathV1Token10, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10, newWssX509PkiPathV1Token10, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssX509PkiPathV1Token10(QNameAssertionType newWssX509PkiPathV1Token10) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10, newWssX509PkiPathV1Token10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssX509PkiPathV1Token11() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssX509PkiPathV1Token11(QNameAssertionType newWssX509PkiPathV1Token11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11, newWssX509PkiPathV1Token11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssX509PkiPathV1Token11(QNameAssertionType newWssX509PkiPathV1Token11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11, newWssX509PkiPathV1Token11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssX509V1Token11() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V1_TOKEN11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssX509V1Token11(QNameAssertionType newWssX509V1Token11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V1_TOKEN11, newWssX509V1Token11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssX509V1Token11(QNameAssertionType newWssX509V1Token11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V1_TOKEN11, newWssX509V1Token11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssX509V3Token10() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN10, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssX509V3Token10(QNameAssertionType newWssX509V3Token10, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN10, newWssX509V3Token10, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssX509V3Token10(QNameAssertionType newWssX509V3Token10) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN10, newWssX509V3Token10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getWssX509V3Token11() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN11, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWssX509V3Token11(QNameAssertionType newWssX509V3Token11, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN11, newWssX509V3Token11, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWssX509V3Token11(QNameAssertionType newWssX509V3Token11) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN11, newWssX509V3Token11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAssertionType getX509Token() {
		return (TokenAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__X509_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX509Token(TokenAssertionType newX509Token, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__X509_TOKEN, newX509Token, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX509Token(TokenAssertionType newX509Token) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__X509_TOKEN, newX509Token);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getXPath10() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__XPATH10, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPath10(QNameAssertionType newXPath10, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__XPATH10, newXPath10, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPath10(QNameAssertionType newXPath10) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__XPATH10, newXPath10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType getXPathFilter20() {
		return (QNameAssertionType)getMixed().get(_200702Package.Literals.DOCUMENT_ROOT__XPATH_FILTER20, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPathFilter20(QNameAssertionType newXPathFilter20, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200702Package.Literals.DOCUMENT_ROOT__XPATH_FILTER20, newXPathFilter20, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPathFilter20(QNameAssertionType newXPathFilter20) {
		((FeatureMap.Internal)getMixed()).set(_200702Package.Literals.DOCUMENT_ROOT__XPATH_FILTER20, newXPathFilter20);
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
			eNotify(new ENotificationImpl(this, Notification.SET, _200702Package.DOCUMENT_ROOT__INCLUDE_TOKEN, oldIncludeToken, includeToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _200702Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _200702Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _200702Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _200702Package.DOCUMENT_ROOT__ABS_XPATH:
				return basicSetAbsXPath(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ALGORITHM_SUITE:
				return basicSetAlgorithmSuite(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ASYMMETRIC_BINDING:
				return basicSetAsymmetricBinding(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC128:
				return basicSetBasic128(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC128_RSA15:
				return basicSetBasic128Rsa15(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256:
				return basicSetBasic128Sha256(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256_RSA15:
				return basicSetBasic128Sha256Rsa15(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC192:
				return basicSetBasic192(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC192_RSA15:
				return basicSetBasic192Rsa15(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256:
				return basicSetBasic192Sha256(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256_RSA15:
				return basicSetBasic192Sha256Rsa15(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC256:
				return basicSetBasic256(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC256_RSA15:
				return basicSetBasic256Rsa15(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256:
				return basicSetBasic256Sha256(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256_RSA15:
				return basicSetBasic256Sha256Rsa15(null, msgs);
			case _200702Package.DOCUMENT_ROOT__BOOTSTRAP_POLICY:
				return basicSetBootstrapPolicy(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING:
				return basicSetEncryptBeforeSigning(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS:
				return basicSetEncryptedElements(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_PARTS:
				return basicSetEncryptedParts(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS:
				return basicSetEncryptedSupportingTokens(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ENCRYPTION_TOKEN:
				return basicSetEncryptionToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_SIGNATURE:
				return basicSetEncryptSignature(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
				return basicSetEndorsingEncryptedSupportingTokens(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS:
				return basicSetEndorsingSupportingTokens(null, msgs);
			case _200702Package.DOCUMENT_ROOT__HASH_PASSWORD:
				return basicSetHashPassword(null, msgs);
			case _200702Package.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION:
				return basicSetHttpBasicAuthentication(null, msgs);
			case _200702Package.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION:
				return basicSetHttpDigestAuthentication(null, msgs);
			case _200702Package.DOCUMENT_ROOT__HTTPS_TOKEN:
				return basicSetHttpsToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__INCLUDE_TIMESTAMP:
				return basicSetIncludeTimestamp(null, msgs);
			case _200702Package.DOCUMENT_ROOT__INCLUSIVE_C14N:
				return basicSetInclusiveC14N(null, msgs);
			case _200702Package.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN:
				return basicSetInitiatorEncryptionToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN:
				return basicSetInitiatorSignatureToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__INITIATOR_TOKEN:
				return basicSetInitiatorToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ISSUED_TOKEN:
				return basicSetIssuedToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__KERBEROS_TOKEN:
				return basicSetKerberosToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__KEY_VALUE_TOKEN:
				return basicSetKeyValueToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__LAX:
				return basicSetLax(null, msgs);
			case _200702Package.DOCUMENT_ROOT__LAX_TS_FIRST:
				return basicSetLaxTsFirst(null, msgs);
			case _200702Package.DOCUMENT_ROOT__LAX_TS_LAST:
				return basicSetLaxTsLast(null, msgs);
			case _200702Package.DOCUMENT_ROOT__LAYOUT:
				return basicSetLayout(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND:
				return basicSetMustNotSendAmend(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL:
				return basicSetMustNotSendCancel(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW:
				return basicSetMustNotSendRenew(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE:
				return basicSetMustSupportClientChallenge(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS:
				return basicSetMustSupportIssuedTokens(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN:
				return basicSetMustSupportRefEmbeddedToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY:
				return basicSetMustSupportRefEncryptedKey(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI:
				return basicSetMustSupportRefExternalURI(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL:
				return basicSetMustSupportRefIssuerSerial(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER:
				return basicSetMustSupportRefKeyIdentifier(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT:
				return basicSetMustSupportRefThumbprint(null, msgs);
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE:
				return basicSetMustSupportServerChallenge(null, msgs);
			case _200702Package.DOCUMENT_ROOT__NO_PASSWORD:
				return basicSetNoPassword(null, msgs);
			case _200702Package.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY:
				return basicSetOnlySignEntireHeadersAndBody(null, msgs);
			case _200702Package.DOCUMENT_ROOT__PROTECTION_TOKEN:
				return basicSetProtectionToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__PROTECT_TOKENS:
				return basicSetProtectTokens(null, msgs);
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN:
				return basicSetRecipientEncryptionToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN:
				return basicSetRecipientSignatureToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_TOKEN:
				return basicSetRecipientToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REL_TOKEN:
				return basicSetRelToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_APPIES_TO:
				return basicSetRequireAppiesTo(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE:
				return basicSetRequireClientCertificate(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY:
				return basicSetRequireClientEntropy(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRED_ELEMENTS:
				return basicSetRequiredElements(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS:
				return basicSetRequireDerivedKeys(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE:
				return basicSetRequireEmbeddedTokenReference(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS:
				return basicSetRequireExplicitDerivedKeys(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE:
				return basicSetRequireExternalReference(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE:
				return basicSetRequireExternalUriReference(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS:
				return basicSetRequireImpliedDerivedKeys(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE:
				return basicSetRequireInternalReference(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE:
				return basicSetRequireIssuerSerialReference(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE:
				return basicSetRequireKeyIdentifierReference(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION:
				return basicSetRequireRequestSecurityTokenCollection(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY:
				return basicSetRequireServerEntropy(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION:
				return basicSetRequireSignatureConfirmation(null, msgs);
			case _200702Package.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE:
				return basicSetRequireThumbprintReference(null, msgs);
			case _200702Package.DOCUMENT_ROOT__RSA_KEY_VALUE:
				return basicSetRsaKeyValue(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SAML_TOKEN:
				return basicSetSamlToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN:
				return basicSetSC13SecurityContextToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN:
				return basicSetSecureConversationToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN:
				return basicSetSecurityContextToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SIGNATURE_TOKEN:
				return basicSetSignatureToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SIGNED_ELEMENTS:
				return basicSetSignedElements(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS:
				return basicSetSignedEncryptedSupportingTokens(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
				return basicSetSignedEndorsingEncryptedSupportingTokens(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS:
				return basicSetSignedEndorsingSupportingTokens(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SIGNED_PARTS:
				return basicSetSignedParts(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS:
				return basicSetSignedSupportingTokens(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SOAP_NORMALIZATION10:
				return basicSetSOAPNormalization10(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN:
				return basicSetSpnegoContextToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__STRICT:
				return basicSetStrict(null, msgs);
			case _200702Package.DOCUMENT_ROOT__STR_TRANSFORM10:
				return basicSetSTRTransform10(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SUPPORTING_TOKENS:
				return basicSetSupportingTokens(null, msgs);
			case _200702Package.DOCUMENT_ROOT__SYMMETRIC_BINDING:
				return basicSetSymmetricBinding(null, msgs);
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_BINDING:
				return basicSetTransportBinding(null, msgs);
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_TOKEN:
				return basicSetTransportToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES:
				return basicSetTripleDes(null, msgs);
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_RSA15:
				return basicSetTripleDesRsa15(null, msgs);
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256:
				return basicSetTripleDesSha256(null, msgs);
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15:
				return basicSetTripleDesSha256Rsa15(null, msgs);
			case _200702Package.DOCUMENT_ROOT__TRUST13:
				return basicSetTrust13(null, msgs);
			case _200702Package.DOCUMENT_ROOT__USERNAME_TOKEN:
				return basicSetUsernameToken(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS10:
				return basicSetWss10(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS11:
				return basicSetWss11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11:
				return basicSetWssGssKerberosV5ApReqToken11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11:
				return basicSetWssKerberosV5ApReqToken11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10:
				return basicSetWssRelV10Token10(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11:
				return basicSetWssRelV10Token11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10:
				return basicSetWssRelV20Token10(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11:
				return basicSetWssRelV20Token11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10:
				return basicSetWssSamlV11Token10(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11:
				return basicSetWssSamlV11Token11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11:
				return basicSetWssSamlV20Token11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10:
				return basicSetWssUsernameToken10(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11:
				return basicSetWssUsernameToken11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10:
				return basicSetWssX509Pkcs7Token10(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11:
				return basicSetWssX509Pkcs7Token11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10:
				return basicSetWssX509PkiPathV1Token10(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11:
				return basicSetWssX509PkiPathV1Token11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_X509V1_TOKEN11:
				return basicSetWssX509V1Token11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN10:
				return basicSetWssX509V3Token10(null, msgs);
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN11:
				return basicSetWssX509V3Token11(null, msgs);
			case _200702Package.DOCUMENT_ROOT__X509_TOKEN:
				return basicSetX509Token(null, msgs);
			case _200702Package.DOCUMENT_ROOT__XPATH10:
				return basicSetXPath10(null, msgs);
			case _200702Package.DOCUMENT_ROOT__XPATH_FILTER20:
				return basicSetXPathFilter20(null, msgs);
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
			case _200702Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _200702Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _200702Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _200702Package.DOCUMENT_ROOT__ABS_XPATH:
				return getAbsXPath();
			case _200702Package.DOCUMENT_ROOT__ALGORITHM_SUITE:
				return getAlgorithmSuite();
			case _200702Package.DOCUMENT_ROOT__ASYMMETRIC_BINDING:
				return getAsymmetricBinding();
			case _200702Package.DOCUMENT_ROOT__BASIC128:
				return getBasic128();
			case _200702Package.DOCUMENT_ROOT__BASIC128_RSA15:
				return getBasic128Rsa15();
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256:
				return getBasic128Sha256();
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256_RSA15:
				return getBasic128Sha256Rsa15();
			case _200702Package.DOCUMENT_ROOT__BASIC192:
				return getBasic192();
			case _200702Package.DOCUMENT_ROOT__BASIC192_RSA15:
				return getBasic192Rsa15();
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256:
				return getBasic192Sha256();
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256_RSA15:
				return getBasic192Sha256Rsa15();
			case _200702Package.DOCUMENT_ROOT__BASIC256:
				return getBasic256();
			case _200702Package.DOCUMENT_ROOT__BASIC256_RSA15:
				return getBasic256Rsa15();
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256:
				return getBasic256Sha256();
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256_RSA15:
				return getBasic256Sha256Rsa15();
			case _200702Package.DOCUMENT_ROOT__BOOTSTRAP_POLICY:
				return getBootstrapPolicy();
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING:
				return getEncryptBeforeSigning();
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS:
				return getEncryptedElements();
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_PARTS:
				return getEncryptedParts();
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS:
				return getEncryptedSupportingTokens();
			case _200702Package.DOCUMENT_ROOT__ENCRYPTION_TOKEN:
				return getEncryptionToken();
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_SIGNATURE:
				return getEncryptSignature();
			case _200702Package.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
				return getEndorsingEncryptedSupportingTokens();
			case _200702Package.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS:
				return getEndorsingSupportingTokens();
			case _200702Package.DOCUMENT_ROOT__HASH_PASSWORD:
				return getHashPassword();
			case _200702Package.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION:
				return getHttpBasicAuthentication();
			case _200702Package.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION:
				return getHttpDigestAuthentication();
			case _200702Package.DOCUMENT_ROOT__HTTPS_TOKEN:
				return getHttpsToken();
			case _200702Package.DOCUMENT_ROOT__INCLUDE_TIMESTAMP:
				return getIncludeTimestamp();
			case _200702Package.DOCUMENT_ROOT__INCLUSIVE_C14N:
				return getInclusiveC14N();
			case _200702Package.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN:
				return getInitiatorEncryptionToken();
			case _200702Package.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN:
				return getInitiatorSignatureToken();
			case _200702Package.DOCUMENT_ROOT__INITIATOR_TOKEN:
				return getInitiatorToken();
			case _200702Package.DOCUMENT_ROOT__ISSUED_TOKEN:
				return getIssuedToken();
			case _200702Package.DOCUMENT_ROOT__KERBEROS_TOKEN:
				return getKerberosToken();
			case _200702Package.DOCUMENT_ROOT__KEY_VALUE_TOKEN:
				return getKeyValueToken();
			case _200702Package.DOCUMENT_ROOT__LAX:
				return getLax();
			case _200702Package.DOCUMENT_ROOT__LAX_TS_FIRST:
				return getLaxTsFirst();
			case _200702Package.DOCUMENT_ROOT__LAX_TS_LAST:
				return getLaxTsLast();
			case _200702Package.DOCUMENT_ROOT__LAYOUT:
				return getLayout();
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND:
				return getMustNotSendAmend();
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL:
				return getMustNotSendCancel();
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW:
				return getMustNotSendRenew();
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE:
				return getMustSupportClientChallenge();
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS:
				return getMustSupportIssuedTokens();
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN:
				return getMustSupportRefEmbeddedToken();
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY:
				return getMustSupportRefEncryptedKey();
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI:
				return getMustSupportRefExternalURI();
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL:
				return getMustSupportRefIssuerSerial();
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER:
				return getMustSupportRefKeyIdentifier();
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT:
				return getMustSupportRefThumbprint();
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE:
				return getMustSupportServerChallenge();
			case _200702Package.DOCUMENT_ROOT__NO_PASSWORD:
				return getNoPassword();
			case _200702Package.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY:
				return getOnlySignEntireHeadersAndBody();
			case _200702Package.DOCUMENT_ROOT__PROTECTION_TOKEN:
				return getProtectionToken();
			case _200702Package.DOCUMENT_ROOT__PROTECT_TOKENS:
				return getProtectTokens();
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN:
				return getRecipientEncryptionToken();
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN:
				return getRecipientSignatureToken();
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_TOKEN:
				return getRecipientToken();
			case _200702Package.DOCUMENT_ROOT__REL_TOKEN:
				return getRelToken();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_APPIES_TO:
				return getRequireAppiesTo();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE:
				return getRequireClientCertificate();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY:
				return getRequireClientEntropy();
			case _200702Package.DOCUMENT_ROOT__REQUIRED_ELEMENTS:
				return getRequiredElements();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS:
				return getRequireDerivedKeys();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE:
				return getRequireEmbeddedTokenReference();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS:
				return getRequireExplicitDerivedKeys();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE:
				return getRequireExternalReference();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE:
				return getRequireExternalUriReference();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS:
				return getRequireImpliedDerivedKeys();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE:
				return getRequireInternalReference();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE:
				return getRequireIssuerSerialReference();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE:
				return getRequireKeyIdentifierReference();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION:
				return getRequireRequestSecurityTokenCollection();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY:
				return getRequireServerEntropy();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION:
				return getRequireSignatureConfirmation();
			case _200702Package.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE:
				return getRequireThumbprintReference();
			case _200702Package.DOCUMENT_ROOT__RSA_KEY_VALUE:
				return getRsaKeyValue();
			case _200702Package.DOCUMENT_ROOT__SAML_TOKEN:
				return getSamlToken();
			case _200702Package.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN:
				return getSC13SecurityContextToken();
			case _200702Package.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN:
				return getSecureConversationToken();
			case _200702Package.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN:
				return getSecurityContextToken();
			case _200702Package.DOCUMENT_ROOT__SIGNATURE_TOKEN:
				return getSignatureToken();
			case _200702Package.DOCUMENT_ROOT__SIGNED_ELEMENTS:
				return getSignedElements();
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS:
				return getSignedEncryptedSupportingTokens();
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
				return getSignedEndorsingEncryptedSupportingTokens();
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS:
				return getSignedEndorsingSupportingTokens();
			case _200702Package.DOCUMENT_ROOT__SIGNED_PARTS:
				return getSignedParts();
			case _200702Package.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS:
				return getSignedSupportingTokens();
			case _200702Package.DOCUMENT_ROOT__SOAP_NORMALIZATION10:
				return getSOAPNormalization10();
			case _200702Package.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN:
				return getSpnegoContextToken();
			case _200702Package.DOCUMENT_ROOT__STRICT:
				return getStrict();
			case _200702Package.DOCUMENT_ROOT__STR_TRANSFORM10:
				return getSTRTransform10();
			case _200702Package.DOCUMENT_ROOT__SUPPORTING_TOKENS:
				return getSupportingTokens();
			case _200702Package.DOCUMENT_ROOT__SYMMETRIC_BINDING:
				return getSymmetricBinding();
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_BINDING:
				return getTransportBinding();
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_TOKEN:
				return getTransportToken();
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES:
				return getTripleDes();
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_RSA15:
				return getTripleDesRsa15();
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256:
				return getTripleDesSha256();
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15:
				return getTripleDesSha256Rsa15();
			case _200702Package.DOCUMENT_ROOT__TRUST13:
				return getTrust13();
			case _200702Package.DOCUMENT_ROOT__USERNAME_TOKEN:
				return getUsernameToken();
			case _200702Package.DOCUMENT_ROOT__WSS10:
				return getWss10();
			case _200702Package.DOCUMENT_ROOT__WSS11:
				return getWss11();
			case _200702Package.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11:
				return getWssGssKerberosV5ApReqToken11();
			case _200702Package.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11:
				return getWssKerberosV5ApReqToken11();
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10:
				return getWssRelV10Token10();
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11:
				return getWssRelV10Token11();
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10:
				return getWssRelV20Token10();
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11:
				return getWssRelV20Token11();
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10:
				return getWssSamlV11Token10();
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11:
				return getWssSamlV11Token11();
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11:
				return getWssSamlV20Token11();
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10:
				return getWssUsernameToken10();
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11:
				return getWssUsernameToken11();
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10:
				return getWssX509Pkcs7Token10();
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11:
				return getWssX509Pkcs7Token11();
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10:
				return getWssX509PkiPathV1Token10();
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11:
				return getWssX509PkiPathV1Token11();
			case _200702Package.DOCUMENT_ROOT__WSS_X509V1_TOKEN11:
				return getWssX509V1Token11();
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN10:
				return getWssX509V3Token10();
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN11:
				return getWssX509V3Token11();
			case _200702Package.DOCUMENT_ROOT__X509_TOKEN:
				return getX509Token();
			case _200702Package.DOCUMENT_ROOT__XPATH10:
				return getXPath10();
			case _200702Package.DOCUMENT_ROOT__XPATH_FILTER20:
				return getXPathFilter20();
			case _200702Package.DOCUMENT_ROOT__INCLUDE_TOKEN:
				return getIncludeToken();
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
			case _200702Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ABS_XPATH:
				setAbsXPath((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ALGORITHM_SUITE:
				setAlgorithmSuite((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ASYMMETRIC_BINDING:
				setAsymmetricBinding((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC128:
				setBasic128((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC128_RSA15:
				setBasic128Rsa15((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256:
				setBasic128Sha256((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256_RSA15:
				setBasic128Sha256Rsa15((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC192:
				setBasic192((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC192_RSA15:
				setBasic192Rsa15((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256:
				setBasic192Sha256((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256_RSA15:
				setBasic192Sha256Rsa15((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC256:
				setBasic256((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC256_RSA15:
				setBasic256Rsa15((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256:
				setBasic256Sha256((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256_RSA15:
				setBasic256Sha256Rsa15((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__BOOTSTRAP_POLICY:
				setBootstrapPolicy((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING:
				setEncryptBeforeSigning((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS:
				setEncryptedElements((SerElementsType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_PARTS:
				setEncryptedParts((SePartsType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS:
				setEncryptedSupportingTokens((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTION_TOKEN:
				setEncryptionToken((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_SIGNATURE:
				setEncryptSignature((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
				setEndorsingEncryptedSupportingTokens((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS:
				setEndorsingSupportingTokens((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__HASH_PASSWORD:
				setHashPassword((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION:
				setHttpBasicAuthentication((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION:
				setHttpDigestAuthentication((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__HTTPS_TOKEN:
				setHttpsToken((TokenAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__INCLUDE_TIMESTAMP:
				setIncludeTimestamp((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__INCLUSIVE_C14N:
				setInclusiveC14N((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN:
				setInitiatorEncryptionToken((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN:
				setInitiatorSignatureToken((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__INITIATOR_TOKEN:
				setInitiatorToken((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ISSUED_TOKEN:
				setIssuedToken((IssuedTokenType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__KERBEROS_TOKEN:
				setKerberosToken((TokenAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__KEY_VALUE_TOKEN:
				setKeyValueToken((KeyValueTokenType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__LAX:
				setLax((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__LAX_TS_FIRST:
				setLaxTsFirst((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__LAX_TS_LAST:
				setLaxTsLast((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__LAYOUT:
				setLayout((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND:
				setMustNotSendAmend((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL:
				setMustNotSendCancel((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW:
				setMustNotSendRenew((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE:
				setMustSupportClientChallenge((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS:
				setMustSupportIssuedTokens((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN:
				setMustSupportRefEmbeddedToken((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY:
				setMustSupportRefEncryptedKey((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI:
				setMustSupportRefExternalURI((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL:
				setMustSupportRefIssuerSerial((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER:
				setMustSupportRefKeyIdentifier((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT:
				setMustSupportRefThumbprint((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE:
				setMustSupportServerChallenge((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__NO_PASSWORD:
				setNoPassword((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY:
				setOnlySignEntireHeadersAndBody((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__PROTECTION_TOKEN:
				setProtectionToken((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__PROTECT_TOKENS:
				setProtectTokens((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN:
				setRecipientEncryptionToken((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN:
				setRecipientSignatureToken((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_TOKEN:
				setRecipientToken((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REL_TOKEN:
				setRelToken((TokenAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_APPIES_TO:
				setRequireAppiesTo((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE:
				setRequireClientCertificate((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY:
				setRequireClientEntropy((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRED_ELEMENTS:
				setRequiredElements((SerElementsType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS:
				setRequireDerivedKeys((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE:
				setRequireEmbeddedTokenReference((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS:
				setRequireExplicitDerivedKeys((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE:
				setRequireExternalReference((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE:
				setRequireExternalUriReference((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS:
				setRequireImpliedDerivedKeys((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE:
				setRequireInternalReference((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE:
				setRequireIssuerSerialReference((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE:
				setRequireKeyIdentifierReference((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION:
				setRequireRequestSecurityTokenCollection((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY:
				setRequireServerEntropy((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION:
				setRequireSignatureConfirmation((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE:
				setRequireThumbprintReference((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__RSA_KEY_VALUE:
				setRsaKeyValue((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SAML_TOKEN:
				setSamlToken((TokenAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN:
				setSC13SecurityContextToken((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN:
				setSecureConversationToken((SecureConversationTokenType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN:
				setSecurityContextToken((TokenAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNATURE_TOKEN:
				setSignatureToken((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ELEMENTS:
				setSignedElements((SerElementsType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS:
				setSignedEncryptedSupportingTokens((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
				setSignedEndorsingEncryptedSupportingTokens((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS:
				setSignedEndorsingSupportingTokens((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_PARTS:
				setSignedParts((SePartsType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS:
				setSignedSupportingTokens((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SOAP_NORMALIZATION10:
				setSOAPNormalization10((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN:
				setSpnegoContextToken((SpnegoContextTokenType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__STRICT:
				setStrict((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__STR_TRANSFORM10:
				setSTRTransform10((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SUPPORTING_TOKENS:
				setSupportingTokens((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__SYMMETRIC_BINDING:
				setSymmetricBinding((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_BINDING:
				setTransportBinding((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_TOKEN:
				setTransportToken((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES:
				setTripleDes((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_RSA15:
				setTripleDesRsa15((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256:
				setTripleDesSha256((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15:
				setTripleDesSha256Rsa15((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__TRUST13:
				setTrust13((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__USERNAME_TOKEN:
				setUsernameToken((TokenAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS10:
				setWss10((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS11:
				setWss11((NestedPolicyType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11:
				setWssGssKerberosV5ApReqToken11((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11:
				setWssKerberosV5ApReqToken11((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10:
				setWssRelV10Token10((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11:
				setWssRelV10Token11((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10:
				setWssRelV20Token10((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11:
				setWssRelV20Token11((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10:
				setWssSamlV11Token10((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11:
				setWssSamlV11Token11((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11:
				setWssSamlV20Token11((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10:
				setWssUsernameToken10((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11:
				setWssUsernameToken11((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10:
				setWssX509Pkcs7Token10((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11:
				setWssX509Pkcs7Token11((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10:
				setWssX509PkiPathV1Token10((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11:
				setWssX509PkiPathV1Token11((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509V1_TOKEN11:
				setWssX509V1Token11((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN10:
				setWssX509V3Token10((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN11:
				setWssX509V3Token11((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__X509_TOKEN:
				setX509Token((TokenAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__XPATH10:
				setXPath10((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__XPATH_FILTER20:
				setXPathFilter20((QNameAssertionType)newValue);
				return;
			case _200702Package.DOCUMENT_ROOT__INCLUDE_TOKEN:
				setIncludeToken(newValue);
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
			case _200702Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _200702Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _200702Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _200702Package.DOCUMENT_ROOT__ABS_XPATH:
				setAbsXPath((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ALGORITHM_SUITE:
				setAlgorithmSuite((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ASYMMETRIC_BINDING:
				setAsymmetricBinding((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC128:
				setBasic128((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC128_RSA15:
				setBasic128Rsa15((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256:
				setBasic128Sha256((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256_RSA15:
				setBasic128Sha256Rsa15((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC192:
				setBasic192((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC192_RSA15:
				setBasic192Rsa15((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256:
				setBasic192Sha256((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256_RSA15:
				setBasic192Sha256Rsa15((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC256:
				setBasic256((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC256_RSA15:
				setBasic256Rsa15((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256:
				setBasic256Sha256((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256_RSA15:
				setBasic256Sha256Rsa15((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__BOOTSTRAP_POLICY:
				setBootstrapPolicy((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING:
				setEncryptBeforeSigning((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS:
				setEncryptedElements((SerElementsType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_PARTS:
				setEncryptedParts((SePartsType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS:
				setEncryptedSupportingTokens((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTION_TOKEN:
				setEncryptionToken((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_SIGNATURE:
				setEncryptSignature((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
				setEndorsingEncryptedSupportingTokens((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS:
				setEndorsingSupportingTokens((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__HASH_PASSWORD:
				setHashPassword((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION:
				setHttpBasicAuthentication((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION:
				setHttpDigestAuthentication((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__HTTPS_TOKEN:
				setHttpsToken((TokenAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__INCLUDE_TIMESTAMP:
				setIncludeTimestamp((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__INCLUSIVE_C14N:
				setInclusiveC14N((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN:
				setInitiatorEncryptionToken((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN:
				setInitiatorSignatureToken((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__INITIATOR_TOKEN:
				setInitiatorToken((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ISSUED_TOKEN:
				setIssuedToken((IssuedTokenType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__KERBEROS_TOKEN:
				setKerberosToken((TokenAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__KEY_VALUE_TOKEN:
				setKeyValueToken((KeyValueTokenType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__LAX:
				setLax((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__LAX_TS_FIRST:
				setLaxTsFirst((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__LAX_TS_LAST:
				setLaxTsLast((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__LAYOUT:
				setLayout((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND:
				setMustNotSendAmend((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL:
				setMustNotSendCancel((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW:
				setMustNotSendRenew((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE:
				setMustSupportClientChallenge((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS:
				setMustSupportIssuedTokens((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN:
				setMustSupportRefEmbeddedToken((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY:
				setMustSupportRefEncryptedKey((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI:
				setMustSupportRefExternalURI((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL:
				setMustSupportRefIssuerSerial((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER:
				setMustSupportRefKeyIdentifier((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT:
				setMustSupportRefThumbprint((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE:
				setMustSupportServerChallenge((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__NO_PASSWORD:
				setNoPassword((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY:
				setOnlySignEntireHeadersAndBody((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__PROTECTION_TOKEN:
				setProtectionToken((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__PROTECT_TOKENS:
				setProtectTokens((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN:
				setRecipientEncryptionToken((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN:
				setRecipientSignatureToken((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_TOKEN:
				setRecipientToken((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REL_TOKEN:
				setRelToken((TokenAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_APPIES_TO:
				setRequireAppiesTo((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE:
				setRequireClientCertificate((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY:
				setRequireClientEntropy((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRED_ELEMENTS:
				setRequiredElements((SerElementsType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS:
				setRequireDerivedKeys((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE:
				setRequireEmbeddedTokenReference((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS:
				setRequireExplicitDerivedKeys((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE:
				setRequireExternalReference((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE:
				setRequireExternalUriReference((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS:
				setRequireImpliedDerivedKeys((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE:
				setRequireInternalReference((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE:
				setRequireIssuerSerialReference((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE:
				setRequireKeyIdentifierReference((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION:
				setRequireRequestSecurityTokenCollection((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY:
				setRequireServerEntropy((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION:
				setRequireSignatureConfirmation((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE:
				setRequireThumbprintReference((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__RSA_KEY_VALUE:
				setRsaKeyValue((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SAML_TOKEN:
				setSamlToken((TokenAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN:
				setSC13SecurityContextToken((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN:
				setSecureConversationToken((SecureConversationTokenType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN:
				setSecurityContextToken((TokenAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNATURE_TOKEN:
				setSignatureToken((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ELEMENTS:
				setSignedElements((SerElementsType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS:
				setSignedEncryptedSupportingTokens((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
				setSignedEndorsingEncryptedSupportingTokens((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS:
				setSignedEndorsingSupportingTokens((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_PARTS:
				setSignedParts((SePartsType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS:
				setSignedSupportingTokens((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SOAP_NORMALIZATION10:
				setSOAPNormalization10((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN:
				setSpnegoContextToken((SpnegoContextTokenType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__STRICT:
				setStrict((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__STR_TRANSFORM10:
				setSTRTransform10((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SUPPORTING_TOKENS:
				setSupportingTokens((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__SYMMETRIC_BINDING:
				setSymmetricBinding((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_BINDING:
				setTransportBinding((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_TOKEN:
				setTransportToken((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES:
				setTripleDes((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_RSA15:
				setTripleDesRsa15((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256:
				setTripleDesSha256((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15:
				setTripleDesSha256Rsa15((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__TRUST13:
				setTrust13((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__USERNAME_TOKEN:
				setUsernameToken((TokenAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS10:
				setWss10((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS11:
				setWss11((NestedPolicyType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11:
				setWssGssKerberosV5ApReqToken11((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11:
				setWssKerberosV5ApReqToken11((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10:
				setWssRelV10Token10((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11:
				setWssRelV10Token11((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10:
				setWssRelV20Token10((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11:
				setWssRelV20Token11((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10:
				setWssSamlV11Token10((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11:
				setWssSamlV11Token11((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11:
				setWssSamlV20Token11((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10:
				setWssUsernameToken10((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11:
				setWssUsernameToken11((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10:
				setWssX509Pkcs7Token10((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11:
				setWssX509Pkcs7Token11((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10:
				setWssX509PkiPathV1Token10((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11:
				setWssX509PkiPathV1Token11((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509V1_TOKEN11:
				setWssX509V1Token11((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN10:
				setWssX509V3Token10((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN11:
				setWssX509V3Token11((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__X509_TOKEN:
				setX509Token((TokenAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__XPATH10:
				setXPath10((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__XPATH_FILTER20:
				setXPathFilter20((QNameAssertionType)null);
				return;
			case _200702Package.DOCUMENT_ROOT__INCLUDE_TOKEN:
				setIncludeToken(INCLUDE_TOKEN_EDEFAULT);
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
			case _200702Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _200702Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _200702Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _200702Package.DOCUMENT_ROOT__ABS_XPATH:
				return getAbsXPath() != null;
			case _200702Package.DOCUMENT_ROOT__ALGORITHM_SUITE:
				return getAlgorithmSuite() != null;
			case _200702Package.DOCUMENT_ROOT__ASYMMETRIC_BINDING:
				return getAsymmetricBinding() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC128:
				return getBasic128() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC128_RSA15:
				return getBasic128Rsa15() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256:
				return getBasic128Sha256() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256_RSA15:
				return getBasic128Sha256Rsa15() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC192:
				return getBasic192() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC192_RSA15:
				return getBasic192Rsa15() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256:
				return getBasic192Sha256() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256_RSA15:
				return getBasic192Sha256Rsa15() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC256:
				return getBasic256() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC256_RSA15:
				return getBasic256Rsa15() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256:
				return getBasic256Sha256() != null;
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256_RSA15:
				return getBasic256Sha256Rsa15() != null;
			case _200702Package.DOCUMENT_ROOT__BOOTSTRAP_POLICY:
				return getBootstrapPolicy() != null;
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING:
				return getEncryptBeforeSigning() != null;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS:
				return getEncryptedElements() != null;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_PARTS:
				return getEncryptedParts() != null;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS:
				return getEncryptedSupportingTokens() != null;
			case _200702Package.DOCUMENT_ROOT__ENCRYPTION_TOKEN:
				return getEncryptionToken() != null;
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_SIGNATURE:
				return getEncryptSignature() != null;
			case _200702Package.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
				return getEndorsingEncryptedSupportingTokens() != null;
			case _200702Package.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS:
				return getEndorsingSupportingTokens() != null;
			case _200702Package.DOCUMENT_ROOT__HASH_PASSWORD:
				return getHashPassword() != null;
			case _200702Package.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION:
				return getHttpBasicAuthentication() != null;
			case _200702Package.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION:
				return getHttpDigestAuthentication() != null;
			case _200702Package.DOCUMENT_ROOT__HTTPS_TOKEN:
				return getHttpsToken() != null;
			case _200702Package.DOCUMENT_ROOT__INCLUDE_TIMESTAMP:
				return getIncludeTimestamp() != null;
			case _200702Package.DOCUMENT_ROOT__INCLUSIVE_C14N:
				return getInclusiveC14N() != null;
			case _200702Package.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN:
				return getInitiatorEncryptionToken() != null;
			case _200702Package.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN:
				return getInitiatorSignatureToken() != null;
			case _200702Package.DOCUMENT_ROOT__INITIATOR_TOKEN:
				return getInitiatorToken() != null;
			case _200702Package.DOCUMENT_ROOT__ISSUED_TOKEN:
				return getIssuedToken() != null;
			case _200702Package.DOCUMENT_ROOT__KERBEROS_TOKEN:
				return getKerberosToken() != null;
			case _200702Package.DOCUMENT_ROOT__KEY_VALUE_TOKEN:
				return getKeyValueToken() != null;
			case _200702Package.DOCUMENT_ROOT__LAX:
				return getLax() != null;
			case _200702Package.DOCUMENT_ROOT__LAX_TS_FIRST:
				return getLaxTsFirst() != null;
			case _200702Package.DOCUMENT_ROOT__LAX_TS_LAST:
				return getLaxTsLast() != null;
			case _200702Package.DOCUMENT_ROOT__LAYOUT:
				return getLayout() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND:
				return getMustNotSendAmend() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL:
				return getMustNotSendCancel() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW:
				return getMustNotSendRenew() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE:
				return getMustSupportClientChallenge() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS:
				return getMustSupportIssuedTokens() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN:
				return getMustSupportRefEmbeddedToken() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY:
				return getMustSupportRefEncryptedKey() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI:
				return getMustSupportRefExternalURI() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL:
				return getMustSupportRefIssuerSerial() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER:
				return getMustSupportRefKeyIdentifier() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT:
				return getMustSupportRefThumbprint() != null;
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE:
				return getMustSupportServerChallenge() != null;
			case _200702Package.DOCUMENT_ROOT__NO_PASSWORD:
				return getNoPassword() != null;
			case _200702Package.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY:
				return getOnlySignEntireHeadersAndBody() != null;
			case _200702Package.DOCUMENT_ROOT__PROTECTION_TOKEN:
				return getProtectionToken() != null;
			case _200702Package.DOCUMENT_ROOT__PROTECT_TOKENS:
				return getProtectTokens() != null;
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN:
				return getRecipientEncryptionToken() != null;
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN:
				return getRecipientSignatureToken() != null;
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_TOKEN:
				return getRecipientToken() != null;
			case _200702Package.DOCUMENT_ROOT__REL_TOKEN:
				return getRelToken() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_APPIES_TO:
				return getRequireAppiesTo() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE:
				return getRequireClientCertificate() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY:
				return getRequireClientEntropy() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRED_ELEMENTS:
				return getRequiredElements() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS:
				return getRequireDerivedKeys() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE:
				return getRequireEmbeddedTokenReference() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS:
				return getRequireExplicitDerivedKeys() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE:
				return getRequireExternalReference() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE:
				return getRequireExternalUriReference() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS:
				return getRequireImpliedDerivedKeys() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE:
				return getRequireInternalReference() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE:
				return getRequireIssuerSerialReference() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE:
				return getRequireKeyIdentifierReference() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION:
				return getRequireRequestSecurityTokenCollection() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY:
				return getRequireServerEntropy() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION:
				return getRequireSignatureConfirmation() != null;
			case _200702Package.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE:
				return getRequireThumbprintReference() != null;
			case _200702Package.DOCUMENT_ROOT__RSA_KEY_VALUE:
				return getRsaKeyValue() != null;
			case _200702Package.DOCUMENT_ROOT__SAML_TOKEN:
				return getSamlToken() != null;
			case _200702Package.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN:
				return getSC13SecurityContextToken() != null;
			case _200702Package.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN:
				return getSecureConversationToken() != null;
			case _200702Package.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN:
				return getSecurityContextToken() != null;
			case _200702Package.DOCUMENT_ROOT__SIGNATURE_TOKEN:
				return getSignatureToken() != null;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ELEMENTS:
				return getSignedElements() != null;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS:
				return getSignedEncryptedSupportingTokens() != null;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
				return getSignedEndorsingEncryptedSupportingTokens() != null;
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS:
				return getSignedEndorsingSupportingTokens() != null;
			case _200702Package.DOCUMENT_ROOT__SIGNED_PARTS:
				return getSignedParts() != null;
			case _200702Package.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS:
				return getSignedSupportingTokens() != null;
			case _200702Package.DOCUMENT_ROOT__SOAP_NORMALIZATION10:
				return getSOAPNormalization10() != null;
			case _200702Package.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN:
				return getSpnegoContextToken() != null;
			case _200702Package.DOCUMENT_ROOT__STRICT:
				return getStrict() != null;
			case _200702Package.DOCUMENT_ROOT__STR_TRANSFORM10:
				return getSTRTransform10() != null;
			case _200702Package.DOCUMENT_ROOT__SUPPORTING_TOKENS:
				return getSupportingTokens() != null;
			case _200702Package.DOCUMENT_ROOT__SYMMETRIC_BINDING:
				return getSymmetricBinding() != null;
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_BINDING:
				return getTransportBinding() != null;
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_TOKEN:
				return getTransportToken() != null;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES:
				return getTripleDes() != null;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_RSA15:
				return getTripleDesRsa15() != null;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256:
				return getTripleDesSha256() != null;
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15:
				return getTripleDesSha256Rsa15() != null;
			case _200702Package.DOCUMENT_ROOT__TRUST13:
				return getTrust13() != null;
			case _200702Package.DOCUMENT_ROOT__USERNAME_TOKEN:
				return getUsernameToken() != null;
			case _200702Package.DOCUMENT_ROOT__WSS10:
				return getWss10() != null;
			case _200702Package.DOCUMENT_ROOT__WSS11:
				return getWss11() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11:
				return getWssGssKerberosV5ApReqToken11() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11:
				return getWssKerberosV5ApReqToken11() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10:
				return getWssRelV10Token10() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11:
				return getWssRelV10Token11() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10:
				return getWssRelV20Token10() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11:
				return getWssRelV20Token11() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10:
				return getWssSamlV11Token10() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11:
				return getWssSamlV11Token11() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11:
				return getWssSamlV20Token11() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10:
				return getWssUsernameToken10() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11:
				return getWssUsernameToken11() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10:
				return getWssX509Pkcs7Token10() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11:
				return getWssX509Pkcs7Token11() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10:
				return getWssX509PkiPathV1Token10() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11:
				return getWssX509PkiPathV1Token11() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_X509V1_TOKEN11:
				return getWssX509V1Token11() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN10:
				return getWssX509V3Token10() != null;
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN11:
				return getWssX509V3Token11() != null;
			case _200702Package.DOCUMENT_ROOT__X509_TOKEN:
				return getX509Token() != null;
			case _200702Package.DOCUMENT_ROOT__XPATH10:
				return getXPath10() != null;
			case _200702Package.DOCUMENT_ROOT__XPATH_FILTER20:
				return getXPathFilter20() != null;
			case _200702Package.DOCUMENT_ROOT__INCLUDE_TOKEN:
				return INCLUDE_TOKEN_EDEFAULT == null ? includeToken != null : !INCLUDE_TOKEN_EDEFAULT.equals(includeToken);
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
		result.append(", includeToken: ");
		result.append(includeToken);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
