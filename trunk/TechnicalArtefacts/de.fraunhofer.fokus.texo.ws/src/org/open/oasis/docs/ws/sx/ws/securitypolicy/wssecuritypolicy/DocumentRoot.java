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
package org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy;

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
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAbsXPath <em>Abs XPath</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAlgorithmSuite <em>Algorithm Suite</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAsymmetricBinding <em>Asymmetric Binding</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128 <em>Basic128</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Rsa15 <em>Basic128 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Sha256 <em>Basic128 Sha256</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Sha256Rsa15 <em>Basic128 Sha256 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192 <em>Basic192</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Rsa15 <em>Basic192 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Sha256 <em>Basic192 Sha256</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Sha256Rsa15 <em>Basic192 Sha256 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256 <em>Basic256</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Rsa15 <em>Basic256 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Sha256 <em>Basic256 Sha256</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Sha256Rsa15 <em>Basic256 Sha256 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBootstrapPolicy <em>Bootstrap Policy</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptBeforeSigning <em>Encrypt Before Signing</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedElements <em>Encrypted Elements</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedParts <em>Encrypted Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedSupportingTokens <em>Encrypted Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptionToken <em>Encryption Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptSignature <em>Encrypt Signature</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEndorsingEncryptedSupportingTokens <em>Endorsing Encrypted Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEndorsingSupportingTokens <em>Endorsing Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHashPassword <em>Hash Password</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpBasicAuthentication <em>Http Basic Authentication</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpDigestAuthentication <em>Http Digest Authentication</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpsToken <em>Https Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIncludeTimestamp <em>Include Timestamp</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInclusiveC14N <em>Inclusive C14N</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorEncryptionToken <em>Initiator Encryption Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorSignatureToken <em>Initiator Signature Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorToken <em>Initiator Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIssuedToken <em>Issued Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getKerberosToken <em>Kerberos Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getKeyValueToken <em>Key Value Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLax <em>Lax</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLaxTsFirst <em>Lax Ts First</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLaxTsLast <em>Lax Ts Last</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendAmend <em>Must Not Send Amend</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendCancel <em>Must Not Send Cancel</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendRenew <em>Must Not Send Renew</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportClientChallenge <em>Must Support Client Challenge</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportIssuedTokens <em>Must Support Issued Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefEmbeddedToken <em>Must Support Ref Embedded Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefEncryptedKey <em>Must Support Ref Encrypted Key</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefExternalURI <em>Must Support Ref External URI</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefIssuerSerial <em>Must Support Ref Issuer Serial</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefKeyIdentifier <em>Must Support Ref Key Identifier</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefThumbprint <em>Must Support Ref Thumbprint</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportServerChallenge <em>Must Support Server Challenge</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getNoPassword <em>No Password</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getOnlySignEntireHeadersAndBody <em>Only Sign Entire Headers And Body</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getProtectionToken <em>Protection Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getProtectTokens <em>Protect Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientEncryptionToken <em>Recipient Encryption Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientSignatureToken <em>Recipient Signature Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientToken <em>Recipient Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRelToken <em>Rel Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireAppiesTo <em>Require Appies To</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireClientCertificate <em>Require Client Certificate</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireClientEntropy <em>Require Client Entropy</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequiredElements <em>Required Elements</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireDerivedKeys <em>Require Derived Keys</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireEmbeddedTokenReference <em>Require Embedded Token Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExplicitDerivedKeys <em>Require Explicit Derived Keys</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExternalReference <em>Require External Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExternalUriReference <em>Require External Uri Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireImpliedDerivedKeys <em>Require Implied Derived Keys</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireInternalReference <em>Require Internal Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireIssuerSerialReference <em>Require Issuer Serial Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireKeyIdentifierReference <em>Require Key Identifier Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireRequestSecurityTokenCollection <em>Require Request Security Token Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireServerEntropy <em>Require Server Entropy</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireSignatureConfirmation <em>Require Signature Confirmation</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireThumbprintReference <em>Require Thumbprint Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRsaKeyValue <em>Rsa Key Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSamlToken <em>Saml Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSC13SecurityContextToken <em>SC13 Security Context Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSecureConversationToken <em>Secure Conversation Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSecurityContextToken <em>Security Context Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignatureToken <em>Signature Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedElements <em>Signed Elements</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEncryptedSupportingTokens <em>Signed Encrypted Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEndorsingEncryptedSupportingTokens <em>Signed Endorsing Encrypted Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEndorsingSupportingTokens <em>Signed Endorsing Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedParts <em>Signed Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedSupportingTokens <em>Signed Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSOAPNormalization10 <em>SOAP Normalization10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSpnegoContextToken <em>Spnego Context Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getStrict <em>Strict</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSTRTransform10 <em>STR Transform10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSupportingTokens <em>Supporting Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSymmetricBinding <em>Symmetric Binding</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTransportBinding <em>Transport Binding</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTransportToken <em>Transport Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDes <em>Triple Des</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesRsa15 <em>Triple Des Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesSha256 <em>Triple Des Sha256</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesSha256Rsa15 <em>Triple Des Sha256 Rsa15</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTrust13 <em>Trust13</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getUsernameToken <em>Username Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWss10 <em>Wss10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWss11 <em>Wss11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssGssKerberosV5ApReqToken11 <em>Wss Gss Kerberos V5 Ap Req Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssKerberosV5ApReqToken11 <em>Wss Kerberos V5 Ap Req Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV10Token10 <em>Wss Rel V10 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV10Token11 <em>Wss Rel V10 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV20Token10 <em>Wss Rel V20 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV20Token11 <em>Wss Rel V20 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV11Token10 <em>Wss Saml V11 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV11Token11 <em>Wss Saml V11 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV20Token11 <em>Wss Saml V20 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssUsernameToken10 <em>Wss Username Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssUsernameToken11 <em>Wss Username Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509Pkcs7Token10 <em>Wss X509 Pkcs7 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509Pkcs7Token11 <em>Wss X509 Pkcs7 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509PkiPathV1Token10 <em>Wss X509 Pki Path V1 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509PkiPathV1Token11 <em>Wss X509 Pki Path V1 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V1Token11 <em>Wss X509V1 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V3Token10 <em>Wss X509V3 Token10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V3Token11 <em>Wss X509V3 Token11</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getX509Token <em>X509 Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXPath10 <em>XPath10</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXPathFilter20 <em>XPath Filter20</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIncludeToken <em>Include Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot()
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
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Mixed()
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
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abs XPath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abs XPath</em>' containment reference.
	 * @see #setAbsXPath(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_AbsXPath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbsXPath' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getAbsXPath();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAbsXPath <em>Abs XPath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abs XPath</em>' containment reference.
	 * @see #getAbsXPath()
	 * @generated
	 */
	void setAbsXPath(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Algorithm Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm Suite</em>' containment reference.
	 * @see #setAlgorithmSuite(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_AlgorithmSuite()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AlgorithmSuite' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getAlgorithmSuite();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAlgorithmSuite <em>Algorithm Suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Suite</em>' containment reference.
	 * @see #getAlgorithmSuite()
	 * @generated
	 */
	void setAlgorithmSuite(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Asymmetric Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.5 AsymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asymmetric Binding</em>' containment reference.
	 * @see #setAsymmetricBinding(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_AsymmetricBinding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AsymmetricBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getAsymmetricBinding();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAsymmetricBinding <em>Asymmetric Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asymmetric Binding</em>' containment reference.
	 * @see #getAsymmetricBinding()
	 * @generated
	 */
	void setAsymmetricBinding(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Basic128</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic128</em>' containment reference.
	 * @see #setBasic128(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic128()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic128' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic128();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128 <em>Basic128</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic128</em>' containment reference.
	 * @see #getBasic128()
	 * @generated
	 */
	void setBasic128(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Basic128 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic128 Rsa15</em>' containment reference.
	 * @see #setBasic128Rsa15(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic128Rsa15()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic128Rsa15' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic128Rsa15();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Rsa15 <em>Basic128 Rsa15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic128 Rsa15</em>' containment reference.
	 * @see #getBasic128Rsa15()
	 * @generated
	 */
	void setBasic128Rsa15(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Basic128 Sha256</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic128 Sha256</em>' containment reference.
	 * @see #setBasic128Sha256(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic128Sha256()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic128Sha256' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic128Sha256();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Sha256 <em>Basic128 Sha256</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic128 Sha256</em>' containment reference.
	 * @see #getBasic128Sha256()
	 * @generated
	 */
	void setBasic128Sha256(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Basic128 Sha256 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic128 Sha256 Rsa15</em>' containment reference.
	 * @see #setBasic128Sha256Rsa15(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic128Sha256Rsa15()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic128Sha256Rsa15' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic128Sha256Rsa15();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Sha256Rsa15 <em>Basic128 Sha256 Rsa15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic128 Sha256 Rsa15</em>' containment reference.
	 * @see #getBasic128Sha256Rsa15()
	 * @generated
	 */
	void setBasic128Sha256Rsa15(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Basic192</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic192</em>' containment reference.
	 * @see #setBasic192(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic192()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic192' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic192();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192 <em>Basic192</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic192</em>' containment reference.
	 * @see #getBasic192()
	 * @generated
	 */
	void setBasic192(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Basic192 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic192 Rsa15</em>' containment reference.
	 * @see #setBasic192Rsa15(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic192Rsa15()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic192Rsa15' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic192Rsa15();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Rsa15 <em>Basic192 Rsa15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic192 Rsa15</em>' containment reference.
	 * @see #getBasic192Rsa15()
	 * @generated
	 */
	void setBasic192Rsa15(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Basic192 Sha256</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic192 Sha256</em>' containment reference.
	 * @see #setBasic192Sha256(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic192Sha256()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic192Sha256' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic192Sha256();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Sha256 <em>Basic192 Sha256</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic192 Sha256</em>' containment reference.
	 * @see #getBasic192Sha256()
	 * @generated
	 */
	void setBasic192Sha256(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Basic192 Sha256 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic192 Sha256 Rsa15</em>' containment reference.
	 * @see #setBasic192Sha256Rsa15(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic192Sha256Rsa15()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic192Sha256Rsa15' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic192Sha256Rsa15();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Sha256Rsa15 <em>Basic192 Sha256 Rsa15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic192 Sha256 Rsa15</em>' containment reference.
	 * @see #getBasic192Sha256Rsa15()
	 * @generated
	 */
	void setBasic192Sha256Rsa15(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Basic256</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic256</em>' containment reference.
	 * @see #setBasic256(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic256()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic256' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic256();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256 <em>Basic256</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic256</em>' containment reference.
	 * @see #getBasic256()
	 * @generated
	 */
	void setBasic256(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Basic256 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic256 Rsa15</em>' containment reference.
	 * @see #setBasic256Rsa15(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic256Rsa15()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic256Rsa15' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic256Rsa15();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Rsa15 <em>Basic256 Rsa15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic256 Rsa15</em>' containment reference.
	 * @see #getBasic256Rsa15()
	 * @generated
	 */
	void setBasic256Rsa15(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Basic256 Sha256</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic256 Sha256</em>' containment reference.
	 * @see #setBasic256Sha256(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic256Sha256()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic256Sha256' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic256Sha256();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Sha256 <em>Basic256 Sha256</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic256 Sha256</em>' containment reference.
	 * @see #getBasic256Sha256()
	 * @generated
	 */
	void setBasic256Sha256(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Basic256 Sha256 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic256 Sha256 Rsa15</em>' containment reference.
	 * @see #setBasic256Sha256Rsa15(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Basic256Sha256Rsa15()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic256Sha256Rsa15' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getBasic256Sha256Rsa15();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Sha256Rsa15 <em>Basic256 Sha256 Rsa15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic256 Sha256 Rsa15</em>' containment reference.
	 * @see #getBasic256Sha256Rsa15()
	 * @generated
	 */
	void setBasic256Sha256Rsa15(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Bootstrap Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.7 SecureConversationToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bootstrap Policy</em>' containment reference.
	 * @see #setBootstrapPolicy(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_BootstrapPolicy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BootstrapPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getBootstrapPolicy();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBootstrapPolicy <em>Bootstrap Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bootstrap Policy</em>' containment reference.
	 * @see #getBootstrapPolicy()
	 * @generated
	 */
	void setBootstrapPolicy(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Encrypt Before Signing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.4 SymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encrypt Before Signing</em>' containment reference.
	 * @see #setEncryptBeforeSigning(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_EncryptBeforeSigning()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptBeforeSigning' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getEncryptBeforeSigning();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptBeforeSigning <em>Encrypt Before Signing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypt Before Signing</em>' containment reference.
	 * @see #getEncryptBeforeSigning()
	 * @generated
	 */
	void setEncryptBeforeSigning(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Encrypted Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         4.2.2 EncryptedElements Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encrypted Elements</em>' containment reference.
	 * @see #setEncryptedElements(SerElementsType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_EncryptedElements()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptedElements' namespace='##targetNamespace'"
	 * @generated
	 */
	SerElementsType getEncryptedElements();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedElements <em>Encrypted Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Elements</em>' containment reference.
	 * @see #getEncryptedElements()
	 * @generated
	 */
	void setEncryptedElements(SerElementsType value);

	/**
	 * Returns the value of the '<em><b>Encrypted Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         4.2.1 EncryptedParts Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encrypted Parts</em>' containment reference.
	 * @see #setEncryptedParts(SePartsType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_EncryptedParts()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptedParts' namespace='##targetNamespace'"
	 * @generated
	 */
	SePartsType getEncryptedParts();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedParts <em>Encrypted Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Parts</em>' containment reference.
	 * @see #getEncryptedParts()
	 * @generated
	 */
	void setEncryptedParts(SePartsType value);

	/**
	 * Returns the value of the '<em><b>Encrypted Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         8.6 EncryptedSupportingTokens Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encrypted Supporting Tokens</em>' containment reference.
	 * @see #setEncryptedSupportingTokens(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_EncryptedSupportingTokens()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptedSupportingTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getEncryptedSupportingTokens();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedSupportingTokens <em>Encrypted Supporting Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Supporting Tokens</em>' containment reference.
	 * @see #getEncryptedSupportingTokens()
	 * @generated
	 */
	void setEncryptedSupportingTokens(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Encryption Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.4 SymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encryption Token</em>' containment reference.
	 * @see #setEncryptionToken(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_EncryptionToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptionToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getEncryptionToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptionToken <em>Encryption Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Token</em>' containment reference.
	 * @see #getEncryptionToken()
	 * @generated
	 */
	void setEncryptionToken(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Encrypt Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.4 SymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encrypt Signature</em>' containment reference.
	 * @see #setEncryptSignature(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_EncryptSignature()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getEncryptSignature();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptSignature <em>Encrypt Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypt Signature</em>' containment reference.
	 * @see #getEncryptSignature()
	 * @generated
	 */
	void setEncryptSignature(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Endorsing Encrypted Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         8.7 EndorsingEncryptedSupportingTokens Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorsing Encrypted Supporting Tokens</em>' containment reference.
	 * @see #setEndorsingEncryptedSupportingTokens(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_EndorsingEncryptedSupportingTokens()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndorsingEncryptedSupportingTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getEndorsingEncryptedSupportingTokens();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEndorsingEncryptedSupportingTokens <em>Endorsing Encrypted Supporting Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endorsing Encrypted Supporting Tokens</em>' containment reference.
	 * @see #getEndorsingEncryptedSupportingTokens()
	 * @generated
	 */
	void setEndorsingEncryptedSupportingTokens(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Endorsing Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         8.3 EndorsingSupportingTokens Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorsing Supporting Tokens</em>' containment reference.
	 * @see #setEndorsingSupportingTokens(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_EndorsingSupportingTokens()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndorsingSupportingTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getEndorsingSupportingTokens();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEndorsingSupportingTokens <em>Endorsing Supporting Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endorsing Supporting Tokens</em>' containment reference.
	 * @see #getEndorsingSupportingTokens()
	 * @generated
	 */
	void setEndorsingSupportingTokens(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Hash Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.1 UsernameToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hash Password</em>' containment reference.
	 * @see #setHashPassword(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_HashPassword()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HashPassword' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getHashPassword();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHashPassword <em>Hash Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Password</em>' containment reference.
	 * @see #getHashPassword()
	 * @generated
	 */
	void setHashPassword(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Http Basic Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.10 HttpsToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Basic Authentication</em>' containment reference.
	 * @see #setHttpBasicAuthentication(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_HttpBasicAuthentication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HttpBasicAuthentication' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getHttpBasicAuthentication();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpBasicAuthentication <em>Http Basic Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Basic Authentication</em>' containment reference.
	 * @see #getHttpBasicAuthentication()
	 * @generated
	 */
	void setHttpBasicAuthentication(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Http Digest Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.10 HttpsToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Digest Authentication</em>' containment reference.
	 * @see #setHttpDigestAuthentication(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_HttpDigestAuthentication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HttpDigestAuthentication' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getHttpDigestAuthentication();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpDigestAuthentication <em>Http Digest Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Digest Authentication</em>' containment reference.
	 * @see #getHttpDigestAuthentication()
	 * @generated
	 */
	void setHttpDigestAuthentication(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Https Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.10 HttpsToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Https Token</em>' containment reference.
	 * @see #setHttpsToken(TokenAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_HttpsToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HttpsToken' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenAssertionType getHttpsToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpsToken <em>Https Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Https Token</em>' containment reference.
	 * @see #getHttpsToken()
	 * @generated
	 */
	void setHttpsToken(TokenAssertionType value);

	/**
	 * Returns the value of the '<em><b>Include Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.3 TransportBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Timestamp</em>' containment reference.
	 * @see #setIncludeTimestamp(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_IncludeTimestamp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IncludeTimestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getIncludeTimestamp();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIncludeTimestamp <em>Include Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Timestamp</em>' containment reference.
	 * @see #getIncludeTimestamp()
	 * @generated
	 */
	void setIncludeTimestamp(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Inclusive C14N</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inclusive C14N</em>' containment reference.
	 * @see #setInclusiveC14N(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_InclusiveC14N()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InclusiveC14N' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getInclusiveC14N();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInclusiveC14N <em>Inclusive C14N</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusive C14N</em>' containment reference.
	 * @see #getInclusiveC14N()
	 * @generated
	 */
	void setInclusiveC14N(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Initiator Encryption Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.5 AsymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator Encryption Token</em>' containment reference.
	 * @see #setInitiatorEncryptionToken(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_InitiatorEncryptionToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InitiatorEncryptionToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getInitiatorEncryptionToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorEncryptionToken <em>Initiator Encryption Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator Encryption Token</em>' containment reference.
	 * @see #getInitiatorEncryptionToken()
	 * @generated
	 */
	void setInitiatorEncryptionToken(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Initiator Signature Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.5 AsymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator Signature Token</em>' containment reference.
	 * @see #setInitiatorSignatureToken(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_InitiatorSignatureToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InitiatorSignatureToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getInitiatorSignatureToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorSignatureToken <em>Initiator Signature Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator Signature Token</em>' containment reference.
	 * @see #getInitiatorSignatureToken()
	 * @generated
	 */
	void setInitiatorSignatureToken(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Initiator Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.5 AsymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator Token</em>' containment reference.
	 * @see #setInitiatorToken(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_InitiatorToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InitiatorToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getInitiatorToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorToken <em>Initiator Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator Token</em>' containment reference.
	 * @see #getInitiatorToken()
	 * @generated
	 */
	void setInitiatorToken(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Issued Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.2 IssuedToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued Token</em>' containment reference.
	 * @see #setIssuedToken(IssuedTokenType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_IssuedToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IssuedToken' namespace='##targetNamespace'"
	 * @generated
	 */
	IssuedTokenType getIssuedToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIssuedToken <em>Issued Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued Token</em>' containment reference.
	 * @see #getIssuedToken()
	 * @generated
	 */
	void setIssuedToken(IssuedTokenType value);

	/**
	 * Returns the value of the '<em><b>Kerberos Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.4 KerberosToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kerberos Token</em>' containment reference.
	 * @see #setKerberosToken(TokenAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_KerberosToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KerberosToken' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenAssertionType getKerberosToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getKerberosToken <em>Kerberos Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kerberos Token</em>' containment reference.
	 * @see #getKerberosToken()
	 * @generated
	 */
	void setKerberosToken(TokenAssertionType value);

	/**
	 * Returns the value of the '<em><b>Key Value Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.11 KeyValueToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Value Token</em>' containment reference.
	 * @see #setKeyValueToken(KeyValueTokenType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_KeyValueToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyValueToken' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyValueTokenType getKeyValueToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getKeyValueToken <em>Key Value Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Value Token</em>' containment reference.
	 * @see #getKeyValueToken()
	 * @generated
	 */
	void setKeyValueToken(KeyValueTokenType value);

	/**
	 * Returns the value of the '<em><b>Lax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.2 Layout Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lax</em>' containment reference.
	 * @see #setLax(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Lax()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Lax' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getLax();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLax <em>Lax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lax</em>' containment reference.
	 * @see #getLax()
	 * @generated
	 */
	void setLax(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Lax Ts First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.2 Layout Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lax Ts First</em>' containment reference.
	 * @see #setLaxTsFirst(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_LaxTsFirst()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LaxTsFirst' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getLaxTsFirst();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLaxTsFirst <em>Lax Ts First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lax Ts First</em>' containment reference.
	 * @see #getLaxTsFirst()
	 * @generated
	 */
	void setLaxTsFirst(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Lax Ts Last</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.2 Layout Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lax Ts Last</em>' containment reference.
	 * @see #setLaxTsLast(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_LaxTsLast()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LaxTsLast' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getLaxTsLast();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLaxTsLast <em>Lax Ts Last</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lax Ts Last</em>' containment reference.
	 * @see #getLaxTsLast()
	 * @generated
	 */
	void setLaxTsLast(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.2 Layout Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Layout()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Layout' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getLayout();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Must Not Send Amend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.5 SpnegoContextToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Not Send Amend</em>' containment reference.
	 * @see #setMustNotSendAmend(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustNotSendAmend()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustNotSendAmend' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustNotSendAmend();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendAmend <em>Must Not Send Amend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Not Send Amend</em>' containment reference.
	 * @see #getMustNotSendAmend()
	 * @generated
	 */
	void setMustNotSendAmend(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Must Not Send Cancel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.5 SpnegoContextToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Not Send Cancel</em>' containment reference.
	 * @see #setMustNotSendCancel(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustNotSendCancel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustNotSendCancel' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustNotSendCancel();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendCancel <em>Must Not Send Cancel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Not Send Cancel</em>' containment reference.
	 * @see #getMustNotSendCancel()
	 * @generated
	 */
	void setMustNotSendCancel(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Must Not Send Renew</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.5 SpnegoContextToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Not Send Renew</em>' containment reference.
	 * @see #setMustNotSendRenew(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustNotSendRenew()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustNotSendRenew' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustNotSendRenew();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendRenew <em>Must Not Send Renew</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Not Send Renew</em>' containment reference.
	 * @see #getMustNotSendRenew()
	 * @generated
	 */
	void setMustNotSendRenew(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Must Support Client Challenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         10.1 Trust13 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support Client Challenge</em>' containment reference.
	 * @see #setMustSupportClientChallenge(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustSupportClientChallenge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustSupportClientChallenge' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustSupportClientChallenge();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportClientChallenge <em>Must Support Client Challenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support Client Challenge</em>' containment reference.
	 * @see #getMustSupportClientChallenge()
	 * @generated
	 */
	void setMustSupportClientChallenge(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Must Support Issued Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         10.1 Trust13 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support Issued Tokens</em>' containment reference.
	 * @see #setMustSupportIssuedTokens(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustSupportIssuedTokens()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustSupportIssuedTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustSupportIssuedTokens();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportIssuedTokens <em>Must Support Issued Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support Issued Tokens</em>' containment reference.
	 * @see #getMustSupportIssuedTokens()
	 * @generated
	 */
	void setMustSupportIssuedTokens(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Must Support Ref Embedded Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         9.1 Wss10 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support Ref Embedded Token</em>' containment reference.
	 * @see #setMustSupportRefEmbeddedToken(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustSupportRefEmbeddedToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustSupportRefEmbeddedToken' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustSupportRefEmbeddedToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefEmbeddedToken <em>Must Support Ref Embedded Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support Ref Embedded Token</em>' containment reference.
	 * @see #getMustSupportRefEmbeddedToken()
	 * @generated
	 */
	void setMustSupportRefEmbeddedToken(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Must Support Ref Encrypted Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         9.2 Wss11 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support Ref Encrypted Key</em>' containment reference.
	 * @see #setMustSupportRefEncryptedKey(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustSupportRefEncryptedKey()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustSupportRefEncryptedKey' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustSupportRefEncryptedKey();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefEncryptedKey <em>Must Support Ref Encrypted Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support Ref Encrypted Key</em>' containment reference.
	 * @see #getMustSupportRefEncryptedKey()
	 * @generated
	 */
	void setMustSupportRefEncryptedKey(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Must Support Ref External URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         9.1 Wss10 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support Ref External URI</em>' containment reference.
	 * @see #setMustSupportRefExternalURI(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustSupportRefExternalURI()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustSupportRefExternalURI' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustSupportRefExternalURI();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefExternalURI <em>Must Support Ref External URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support Ref External URI</em>' containment reference.
	 * @see #getMustSupportRefExternalURI()
	 * @generated
	 */
	void setMustSupportRefExternalURI(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Must Support Ref Issuer Serial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         9.1 Wss10 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support Ref Issuer Serial</em>' containment reference.
	 * @see #setMustSupportRefIssuerSerial(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustSupportRefIssuerSerial()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustSupportRefIssuerSerial' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustSupportRefIssuerSerial();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefIssuerSerial <em>Must Support Ref Issuer Serial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support Ref Issuer Serial</em>' containment reference.
	 * @see #getMustSupportRefIssuerSerial()
	 * @generated
	 */
	void setMustSupportRefIssuerSerial(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Must Support Ref Key Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         9.1 Wss10 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support Ref Key Identifier</em>' containment reference.
	 * @see #setMustSupportRefKeyIdentifier(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustSupportRefKeyIdentifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustSupportRefKeyIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustSupportRefKeyIdentifier();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefKeyIdentifier <em>Must Support Ref Key Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support Ref Key Identifier</em>' containment reference.
	 * @see #getMustSupportRefKeyIdentifier()
	 * @generated
	 */
	void setMustSupportRefKeyIdentifier(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Must Support Ref Thumbprint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         9.2 Wss11 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support Ref Thumbprint</em>' containment reference.
	 * @see #setMustSupportRefThumbprint(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustSupportRefThumbprint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustSupportRefThumbprint' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustSupportRefThumbprint();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefThumbprint <em>Must Support Ref Thumbprint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support Ref Thumbprint</em>' containment reference.
	 * @see #getMustSupportRefThumbprint()
	 * @generated
	 */
	void setMustSupportRefThumbprint(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Must Support Server Challenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         10.1 Trust13 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support Server Challenge</em>' containment reference.
	 * @see #setMustSupportServerChallenge(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_MustSupportServerChallenge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MustSupportServerChallenge' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getMustSupportServerChallenge();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportServerChallenge <em>Must Support Server Challenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support Server Challenge</em>' containment reference.
	 * @see #getMustSupportServerChallenge()
	 * @generated
	 */
	void setMustSupportServerChallenge(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>No Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.1 UsernameToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Password</em>' containment reference.
	 * @see #setNoPassword(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_NoPassword()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NoPassword' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getNoPassword();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getNoPassword <em>No Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Password</em>' containment reference.
	 * @see #getNoPassword()
	 * @generated
	 */
	void setNoPassword(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Only Sign Entire Headers And Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.4 SymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Only Sign Entire Headers And Body</em>' containment reference.
	 * @see #setOnlySignEntireHeadersAndBody(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_OnlySignEntireHeadersAndBody()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OnlySignEntireHeadersAndBody' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getOnlySignEntireHeadersAndBody();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getOnlySignEntireHeadersAndBody <em>Only Sign Entire Headers And Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Sign Entire Headers And Body</em>' containment reference.
	 * @see #getOnlySignEntireHeadersAndBody()
	 * @generated
	 */
	void setOnlySignEntireHeadersAndBody(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Protection Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.4 SymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protection Token</em>' containment reference.
	 * @see #setProtectionToken(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_ProtectionToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProtectionToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getProtectionToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getProtectionToken <em>Protection Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Token</em>' containment reference.
	 * @see #getProtectionToken()
	 * @generated
	 */
	void setProtectionToken(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Protect Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.4 SymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protect Tokens</em>' containment reference.
	 * @see #setProtectTokens(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_ProtectTokens()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProtectTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getProtectTokens();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getProtectTokens <em>Protect Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protect Tokens</em>' containment reference.
	 * @see #getProtectTokens()
	 * @generated
	 */
	void setProtectTokens(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Recipient Encryption Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.5 AsymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient Encryption Token</em>' containment reference.
	 * @see #setRecipientEncryptionToken(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RecipientEncryptionToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RecipientEncryptionToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getRecipientEncryptionToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientEncryptionToken <em>Recipient Encryption Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Encryption Token</em>' containment reference.
	 * @see #getRecipientEncryptionToken()
	 * @generated
	 */
	void setRecipientEncryptionToken(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Recipient Signature Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.5 AsymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient Signature Token</em>' containment reference.
	 * @see #setRecipientSignatureToken(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RecipientSignatureToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RecipientSignatureToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getRecipientSignatureToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientSignatureToken <em>Recipient Signature Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Signature Token</em>' containment reference.
	 * @see #getRecipientSignatureToken()
	 * @generated
	 */
	void setRecipientSignatureToken(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Recipient Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.5 AsymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient Token</em>' containment reference.
	 * @see #setRecipientToken(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RecipientToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RecipientToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getRecipientToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientToken <em>Recipient Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Token</em>' containment reference.
	 * @see #getRecipientToken()
	 * @generated
	 */
	void setRecipientToken(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Rel Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.9 RelToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Token</em>' containment reference.
	 * @see #setRelToken(TokenAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RelToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelToken' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenAssertionType getRelToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRelToken <em>Rel Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Token</em>' containment reference.
	 * @see #getRelToken()
	 * @generated
	 */
	void setRelToken(TokenAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Appies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         10.1 Trust13 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Appies To</em>' containment reference.
	 * @see #setRequireAppiesTo(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireAppiesTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireAppiesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireAppiesTo();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireAppiesTo <em>Require Appies To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Appies To</em>' containment reference.
	 * @see #getRequireAppiesTo()
	 * @generated
	 */
	void setRequireAppiesTo(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Client Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.10 HttpsToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Client Certificate</em>' containment reference.
	 * @see #setRequireClientCertificate(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireClientCertificate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireClientCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireClientCertificate();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireClientCertificate <em>Require Client Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Client Certificate</em>' containment reference.
	 * @see #getRequireClientCertificate()
	 * @generated
	 */
	void setRequireClientCertificate(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Client Entropy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         10.1 Trust13 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Client Entropy</em>' containment reference.
	 * @see #setRequireClientEntropy(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireClientEntropy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireClientEntropy' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireClientEntropy();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireClientEntropy <em>Require Client Entropy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Client Entropy</em>' containment reference.
	 * @see #getRequireClientEntropy()
	 * @generated
	 */
	void setRequireClientEntropy(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Required Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         4.3.1 RequiredElements Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Elements</em>' containment reference.
	 * @see #setRequiredElements(SerElementsType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequiredElements()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequiredElements' namespace='##targetNamespace'"
	 * @generated
	 */
	SerElementsType getRequiredElements();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequiredElements <em>Required Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Elements</em>' containment reference.
	 * @see #getRequiredElements()
	 * @generated
	 */
	void setRequiredElements(SerElementsType value);

	/**
	 * Returns the value of the '<em><b>Require Derived Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.2 IssuedToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Derived Keys</em>' containment reference.
	 * @see #setRequireDerivedKeys(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireDerivedKeys()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireDerivedKeys' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireDerivedKeys();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireDerivedKeys <em>Require Derived Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Derived Keys</em>' containment reference.
	 * @see #getRequireDerivedKeys()
	 * @generated
	 */
	void setRequireDerivedKeys(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Embedded Token Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Embedded Token Reference</em>' containment reference.
	 * @see #setRequireEmbeddedTokenReference(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireEmbeddedTokenReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireEmbeddedTokenReference' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireEmbeddedTokenReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireEmbeddedTokenReference <em>Require Embedded Token Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Embedded Token Reference</em>' containment reference.
	 * @see #getRequireEmbeddedTokenReference()
	 * @generated
	 */
	void setRequireEmbeddedTokenReference(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Explicit Derived Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.2 IssuedToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Explicit Derived Keys</em>' containment reference.
	 * @see #setRequireExplicitDerivedKeys(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireExplicitDerivedKeys()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireExplicitDerivedKeys' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireExplicitDerivedKeys();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExplicitDerivedKeys <em>Require Explicit Derived Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Explicit Derived Keys</em>' containment reference.
	 * @see #getRequireExplicitDerivedKeys()
	 * @generated
	 */
	void setRequireExplicitDerivedKeys(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.2 IssuedToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require External Reference</em>' containment reference.
	 * @see #setRequireExternalReference(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireExternalReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireExternalReference' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireExternalReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExternalReference <em>Require External Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require External Reference</em>' containment reference.
	 * @see #getRequireExternalReference()
	 * @generated
	 */
	void setRequireExternalReference(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require External Uri Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.6 SecurityContextToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require External Uri Reference</em>' containment reference.
	 * @see #setRequireExternalUriReference(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireExternalUriReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireExternalUriReference' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireExternalUriReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExternalUriReference <em>Require External Uri Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require External Uri Reference</em>' containment reference.
	 * @see #getRequireExternalUriReference()
	 * @generated
	 */
	void setRequireExternalUriReference(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Implied Derived Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.2 IssuedToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Implied Derived Keys</em>' containment reference.
	 * @see #setRequireImpliedDerivedKeys(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireImpliedDerivedKeys()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireImpliedDerivedKeys' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireImpliedDerivedKeys();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireImpliedDerivedKeys <em>Require Implied Derived Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Implied Derived Keys</em>' containment reference.
	 * @see #getRequireImpliedDerivedKeys()
	 * @generated
	 */
	void setRequireImpliedDerivedKeys(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Internal Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.2 IssuedToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Internal Reference</em>' containment reference.
	 * @see #setRequireInternalReference(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireInternalReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireInternalReference' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireInternalReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireInternalReference <em>Require Internal Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Internal Reference</em>' containment reference.
	 * @see #getRequireInternalReference()
	 * @generated
	 */
	void setRequireInternalReference(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Issuer Serial Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Issuer Serial Reference</em>' containment reference.
	 * @see #setRequireIssuerSerialReference(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireIssuerSerialReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireIssuerSerialReference' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireIssuerSerialReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireIssuerSerialReference <em>Require Issuer Serial Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Issuer Serial Reference</em>' containment reference.
	 * @see #getRequireIssuerSerialReference()
	 * @generated
	 */
	void setRequireIssuerSerialReference(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Key Identifier Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Key Identifier Reference</em>' containment reference.
	 * @see #setRequireKeyIdentifierReference(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireKeyIdentifierReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireKeyIdentifierReference' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireKeyIdentifierReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireKeyIdentifierReference <em>Require Key Identifier Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Key Identifier Reference</em>' containment reference.
	 * @see #getRequireKeyIdentifierReference()
	 * @generated
	 */
	void setRequireKeyIdentifierReference(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Request Security Token Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         10.1 Trust13 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Request Security Token Collection</em>' containment reference.
	 * @see #setRequireRequestSecurityTokenCollection(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireRequestSecurityTokenCollection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireRequestSecurityTokenCollection' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireRequestSecurityTokenCollection();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireRequestSecurityTokenCollection <em>Require Request Security Token Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Request Security Token Collection</em>' containment reference.
	 * @see #getRequireRequestSecurityTokenCollection()
	 * @generated
	 */
	void setRequireRequestSecurityTokenCollection(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Server Entropy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         10.1 Trust13 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Server Entropy</em>' containment reference.
	 * @see #setRequireServerEntropy(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireServerEntropy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireServerEntropy' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireServerEntropy();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireServerEntropy <em>Require Server Entropy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Server Entropy</em>' containment reference.
	 * @see #getRequireServerEntropy()
	 * @generated
	 */
	void setRequireServerEntropy(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Signature Confirmation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         9.2 Wss11 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Signature Confirmation</em>' containment reference.
	 * @see #setRequireSignatureConfirmation(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireSignatureConfirmation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireSignatureConfirmation' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireSignatureConfirmation();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireSignatureConfirmation <em>Require Signature Confirmation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Signature Confirmation</em>' containment reference.
	 * @see #getRequireSignatureConfirmation()
	 * @generated
	 */
	void setRequireSignatureConfirmation(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Require Thumbprint Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Thumbprint Reference</em>' containment reference.
	 * @see #setRequireThumbprintReference(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RequireThumbprintReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequireThumbprintReference' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRequireThumbprintReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireThumbprintReference <em>Require Thumbprint Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Thumbprint Reference</em>' containment reference.
	 * @see #getRequireThumbprintReference()
	 * @generated
	 */
	void setRequireThumbprintReference(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Rsa Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.11 KeyValueToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rsa Key Value</em>' containment reference.
	 * @see #setRsaKeyValue(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_RsaKeyValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RsaKeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getRsaKeyValue();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRsaKeyValue <em>Rsa Key Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rsa Key Value</em>' containment reference.
	 * @see #getRsaKeyValue()
	 * @generated
	 */
	void setRsaKeyValue(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Saml Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.8 SamlToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Saml Token</em>' containment reference.
	 * @see #setSamlToken(TokenAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SamlToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SamlToken' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenAssertionType getSamlToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSamlToken <em>Saml Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saml Token</em>' containment reference.
	 * @see #getSamlToken()
	 * @generated
	 */
	void setSamlToken(TokenAssertionType value);

	/**
	 * Returns the value of the '<em><b>SC13 Security Context Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.6 SecurityContextToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC13 Security Context Token</em>' containment reference.
	 * @see #setSC13SecurityContextToken(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SC13SecurityContextToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SC13SecurityContextToken' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getSC13SecurityContextToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSC13SecurityContextToken <em>SC13 Security Context Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC13 Security Context Token</em>' containment reference.
	 * @see #getSC13SecurityContextToken()
	 * @generated
	 */
	void setSC13SecurityContextToken(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Secure Conversation Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.7 SecureConversationToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secure Conversation Token</em>' containment reference.
	 * @see #setSecureConversationToken(SecureConversationTokenType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SecureConversationToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecureConversationToken' namespace='##targetNamespace'"
	 * @generated
	 */
	SecureConversationTokenType getSecureConversationToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSecureConversationToken <em>Secure Conversation Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Conversation Token</em>' containment reference.
	 * @see #getSecureConversationToken()
	 * @generated
	 */
	void setSecureConversationToken(SecureConversationTokenType value);

	/**
	 * Returns the value of the '<em><b>Security Context Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.6 SecurityContextToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Context Token</em>' containment reference.
	 * @see #setSecurityContextToken(TokenAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SecurityContextToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecurityContextToken' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenAssertionType getSecurityContextToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSecurityContextToken <em>Security Context Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Context Token</em>' containment reference.
	 * @see #getSecurityContextToken()
	 * @generated
	 */
	void setSecurityContextToken(TokenAssertionType value);

	/**
	 * Returns the value of the '<em><b>Signature Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         8=7.4 SymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature Token</em>' containment reference.
	 * @see #setSignatureToken(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SignatureToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getSignatureToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignatureToken <em>Signature Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Token</em>' containment reference.
	 * @see #getSignatureToken()
	 * @generated
	 */
	void setSignatureToken(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Signed Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         4.1.2 SignedElements Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signed Elements</em>' containment reference.
	 * @see #setSignedElements(SerElementsType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SignedElements()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedElements' namespace='##targetNamespace'"
	 * @generated
	 */
	SerElementsType getSignedElements();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedElements <em>Signed Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed Elements</em>' containment reference.
	 * @see #getSignedElements()
	 * @generated
	 */
	void setSignedElements(SerElementsType value);

	/**
	 * Returns the value of the '<em><b>Signed Encrypted Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         8.5 SignedEncryptedSupportingTokens Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signed Encrypted Supporting Tokens</em>' containment reference.
	 * @see #setSignedEncryptedSupportingTokens(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SignedEncryptedSupportingTokens()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedEncryptedSupportingTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getSignedEncryptedSupportingTokens();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEncryptedSupportingTokens <em>Signed Encrypted Supporting Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed Encrypted Supporting Tokens</em>' containment reference.
	 * @see #getSignedEncryptedSupportingTokens()
	 * @generated
	 */
	void setSignedEncryptedSupportingTokens(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Signed Endorsing Encrypted Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         8.8 SignedEndorsingEncryptedSupportingTokens Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signed Endorsing Encrypted Supporting Tokens</em>' containment reference.
	 * @see #setSignedEndorsingEncryptedSupportingTokens(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SignedEndorsingEncryptedSupportingTokens()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedEndorsingEncryptedSupportingTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getSignedEndorsingEncryptedSupportingTokens();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEndorsingEncryptedSupportingTokens <em>Signed Endorsing Encrypted Supporting Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed Endorsing Encrypted Supporting Tokens</em>' containment reference.
	 * @see #getSignedEndorsingEncryptedSupportingTokens()
	 * @generated
	 */
	void setSignedEndorsingEncryptedSupportingTokens(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Signed Endorsing Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         8.4 SignedEndorsingSupportingTokens Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signed Endorsing Supporting Tokens</em>' containment reference.
	 * @see #setSignedEndorsingSupportingTokens(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SignedEndorsingSupportingTokens()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedEndorsingSupportingTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getSignedEndorsingSupportingTokens();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEndorsingSupportingTokens <em>Signed Endorsing Supporting Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed Endorsing Supporting Tokens</em>' containment reference.
	 * @see #getSignedEndorsingSupportingTokens()
	 * @generated
	 */
	void setSignedEndorsingSupportingTokens(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Signed Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         4.1.1 SignedParts Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signed Parts</em>' containment reference.
	 * @see #setSignedParts(SePartsType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SignedParts()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedParts' namespace='##targetNamespace'"
	 * @generated
	 */
	SePartsType getSignedParts();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedParts <em>Signed Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed Parts</em>' containment reference.
	 * @see #getSignedParts()
	 * @generated
	 */
	void setSignedParts(SePartsType value);

	/**
	 * Returns the value of the '<em><b>Signed Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         8.2 SignedSupportingTokens Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signed Supporting Tokens</em>' containment reference.
	 * @see #setSignedSupportingTokens(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SignedSupportingTokens()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedSupportingTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getSignedSupportingTokens();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedSupportingTokens <em>Signed Supporting Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed Supporting Tokens</em>' containment reference.
	 * @see #getSignedSupportingTokens()
	 * @generated
	 */
	void setSignedSupportingTokens(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>SOAP Normalization10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SOAP Normalization10</em>' containment reference.
	 * @see #setSOAPNormalization10(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SOAPNormalization10()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SOAPNormalization10' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getSOAPNormalization10();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSOAPNormalization10 <em>SOAP Normalization10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SOAP Normalization10</em>' containment reference.
	 * @see #getSOAPNormalization10()
	 * @generated
	 */
	void setSOAPNormalization10(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Spnego Context Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.5 SpnegoContextToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spnego Context Token</em>' containment reference.
	 * @see #setSpnegoContextToken(SpnegoContextTokenType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SpnegoContextToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SpnegoContextToken' namespace='##targetNamespace'"
	 * @generated
	 */
	SpnegoContextTokenType getSpnegoContextToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSpnegoContextToken <em>Spnego Context Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spnego Context Token</em>' containment reference.
	 * @see #getSpnegoContextToken()
	 * @generated
	 */
	void setSpnegoContextToken(SpnegoContextTokenType value);

	/**
	 * Returns the value of the '<em><b>Strict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.2 Layout Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strict</em>' containment reference.
	 * @see #setStrict(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Strict()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Strict' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getStrict();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getStrict <em>Strict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict</em>' containment reference.
	 * @see #getStrict()
	 * @generated
	 */
	void setStrict(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>STR Transform10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>STR Transform10</em>' containment reference.
	 * @see #setSTRTransform10(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_STRTransform10()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='STRTransform10' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getSTRTransform10();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSTRTransform10 <em>STR Transform10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STR Transform10</em>' containment reference.
	 * @see #getSTRTransform10()
	 * @generated
	 */
	void setSTRTransform10(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         8.1 SupportingTokens Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Tokens</em>' containment reference.
	 * @see #setSupportingTokens(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SupportingTokens()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupportingTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getSupportingTokens();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSupportingTokens <em>Supporting Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting Tokens</em>' containment reference.
	 * @see #getSupportingTokens()
	 * @generated
	 */
	void setSupportingTokens(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Symmetric Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.4 SymmetricBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symmetric Binding</em>' containment reference.
	 * @see #setSymmetricBinding(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_SymmetricBinding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymmetricBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getSymmetricBinding();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSymmetricBinding <em>Symmetric Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetric Binding</em>' containment reference.
	 * @see #getSymmetricBinding()
	 * @generated
	 */
	void setSymmetricBinding(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Transport Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.3 TransportBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Binding</em>' containment reference.
	 * @see #setTransportBinding(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_TransportBinding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransportBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getTransportBinding();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTransportBinding <em>Transport Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Binding</em>' containment reference.
	 * @see #getTransportBinding()
	 * @generated
	 */
	void setTransportBinding(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Transport Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.3 TransportBinding Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Token</em>' containment reference.
	 * @see #setTransportToken(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_TransportToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransportToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getTransportToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTransportToken <em>Transport Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Token</em>' containment reference.
	 * @see #getTransportToken()
	 * @generated
	 */
	void setTransportToken(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Triple Des</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triple Des</em>' containment reference.
	 * @see #setTripleDes(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_TripleDes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TripleDes' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getTripleDes();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDes <em>Triple Des</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triple Des</em>' containment reference.
	 * @see #getTripleDes()
	 * @generated
	 */
	void setTripleDes(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Triple Des Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triple Des Rsa15</em>' containment reference.
	 * @see #setTripleDesRsa15(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_TripleDesRsa15()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TripleDesRsa15' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getTripleDesRsa15();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesRsa15 <em>Triple Des Rsa15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triple Des Rsa15</em>' containment reference.
	 * @see #getTripleDesRsa15()
	 * @generated
	 */
	void setTripleDesRsa15(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Triple Des Sha256</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triple Des Sha256</em>' containment reference.
	 * @see #setTripleDesSha256(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_TripleDesSha256()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TripleDesSha256' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getTripleDesSha256();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesSha256 <em>Triple Des Sha256</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triple Des Sha256</em>' containment reference.
	 * @see #getTripleDesSha256()
	 * @generated
	 */
	void setTripleDesSha256(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Triple Des Sha256 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triple Des Sha256 Rsa15</em>' containment reference.
	 * @see #setTripleDesSha256Rsa15(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_TripleDesSha256Rsa15()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TripleDesSha256Rsa15' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getTripleDesSha256Rsa15();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesSha256Rsa15 <em>Triple Des Sha256 Rsa15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triple Des Sha256 Rsa15</em>' containment reference.
	 * @see #getTripleDesSha256Rsa15()
	 * @generated
	 */
	void setTripleDesSha256Rsa15(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Trust13</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         10.1 Trust13 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trust13</em>' containment reference.
	 * @see #setTrust13(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Trust13()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Trust13' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getTrust13();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTrust13 <em>Trust13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust13</em>' containment reference.
	 * @see #getTrust13()
	 * @generated
	 */
	void setTrust13(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Username Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.1 UsernameToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username Token</em>' containment reference.
	 * @see #setUsernameToken(TokenAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_UsernameToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UsernameToken' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenAssertionType getUsernameToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getUsernameToken <em>Username Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username Token</em>' containment reference.
	 * @see #getUsernameToken()
	 * @generated
	 */
	void setUsernameToken(TokenAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         9.1 Wss10 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss10</em>' containment reference.
	 * @see #setWss10(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Wss10()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Wss10' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getWss10();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWss10 <em>Wss10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss10</em>' containment reference.
	 * @see #getWss10()
	 * @generated
	 */
	void setWss10(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Wss11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         9.2 Wss11 Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss11</em>' containment reference.
	 * @see #setWss11(NestedPolicyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_Wss11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Wss11' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedPolicyType getWss11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWss11 <em>Wss11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss11</em>' containment reference.
	 * @see #getWss11()
	 * @generated
	 */
	void setWss11(NestedPolicyType value);

	/**
	 * Returns the value of the '<em><b>Wss Gss Kerberos V5 Ap Req Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.4 KerberosToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss Gss Kerberos V5 Ap Req Token11</em>' containment reference.
	 * @see #setWssGssKerberosV5ApReqToken11(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssGssKerberosV5ApReqToken11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssGssKerberosV5ApReqToken11' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssGssKerberosV5ApReqToken11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssGssKerberosV5ApReqToken11 <em>Wss Gss Kerberos V5 Ap Req Token11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss Gss Kerberos V5 Ap Req Token11</em>' containment reference.
	 * @see #getWssGssKerberosV5ApReqToken11()
	 * @generated
	 */
	void setWssGssKerberosV5ApReqToken11(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss Kerberos V5 Ap Req Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.4 KerberosToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss Kerberos V5 Ap Req Token11</em>' containment reference.
	 * @see #setWssKerberosV5ApReqToken11(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssKerberosV5ApReqToken11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssKerberosV5ApReqToken11' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssKerberosV5ApReqToken11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssKerberosV5ApReqToken11 <em>Wss Kerberos V5 Ap Req Token11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss Kerberos V5 Ap Req Token11</em>' containment reference.
	 * @see #getWssKerberosV5ApReqToken11()
	 * @generated
	 */
	void setWssKerberosV5ApReqToken11(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss Rel V10 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.9 RelToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss Rel V10 Token10</em>' containment reference.
	 * @see #setWssRelV10Token10(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssRelV10Token10()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssRelV10Token10' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssRelV10Token10();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV10Token10 <em>Wss Rel V10 Token10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss Rel V10 Token10</em>' containment reference.
	 * @see #getWssRelV10Token10()
	 * @generated
	 */
	void setWssRelV10Token10(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss Rel V10 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.9 RelToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss Rel V10 Token11</em>' containment reference.
	 * @see #setWssRelV10Token11(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssRelV10Token11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssRelV10Token11' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssRelV10Token11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV10Token11 <em>Wss Rel V10 Token11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss Rel V10 Token11</em>' containment reference.
	 * @see #getWssRelV10Token11()
	 * @generated
	 */
	void setWssRelV10Token11(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss Rel V20 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.9 RelToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss Rel V20 Token10</em>' containment reference.
	 * @see #setWssRelV20Token10(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssRelV20Token10()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssRelV20Token10' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssRelV20Token10();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV20Token10 <em>Wss Rel V20 Token10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss Rel V20 Token10</em>' containment reference.
	 * @see #getWssRelV20Token10()
	 * @generated
	 */
	void setWssRelV20Token10(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss Rel V20 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.9 RelToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss Rel V20 Token11</em>' containment reference.
	 * @see #setWssRelV20Token11(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssRelV20Token11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssRelV20Token11' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssRelV20Token11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV20Token11 <em>Wss Rel V20 Token11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss Rel V20 Token11</em>' containment reference.
	 * @see #getWssRelV20Token11()
	 * @generated
	 */
	void setWssRelV20Token11(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss Saml V11 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.8 SamlToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss Saml V11 Token10</em>' containment reference.
	 * @see #setWssSamlV11Token10(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssSamlV11Token10()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssSamlV11Token10' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssSamlV11Token10();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV11Token10 <em>Wss Saml V11 Token10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss Saml V11 Token10</em>' containment reference.
	 * @see #getWssSamlV11Token10()
	 * @generated
	 */
	void setWssSamlV11Token10(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss Saml V11 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.8 SamlToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss Saml V11 Token11</em>' containment reference.
	 * @see #setWssSamlV11Token11(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssSamlV11Token11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssSamlV11Token11' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssSamlV11Token11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV11Token11 <em>Wss Saml V11 Token11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss Saml V11 Token11</em>' containment reference.
	 * @see #getWssSamlV11Token11()
	 * @generated
	 */
	void setWssSamlV11Token11(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss Saml V20 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.8 SamlToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss Saml V20 Token11</em>' containment reference.
	 * @see #setWssSamlV20Token11(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssSamlV20Token11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssSamlV20Token11' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssSamlV20Token11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV20Token11 <em>Wss Saml V20 Token11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss Saml V20 Token11</em>' containment reference.
	 * @see #getWssSamlV20Token11()
	 * @generated
	 */
	void setWssSamlV20Token11(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss Username Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.1 UsernameToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss Username Token10</em>' containment reference.
	 * @see #setWssUsernameToken10(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssUsernameToken10()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssUsernameToken10' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssUsernameToken10();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssUsernameToken10 <em>Wss Username Token10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss Username Token10</em>' containment reference.
	 * @see #getWssUsernameToken10()
	 * @generated
	 */
	void setWssUsernameToken10(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss Username Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.1 UsernameToken Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss Username Token11</em>' containment reference.
	 * @see #setWssUsernameToken11(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssUsernameToken11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssUsernameToken11' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssUsernameToken11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssUsernameToken11 <em>Wss Username Token11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss Username Token11</em>' containment reference.
	 * @see #getWssUsernameToken11()
	 * @generated
	 */
	void setWssUsernameToken11(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss X509 Pkcs7 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss X509 Pkcs7 Token10</em>' containment reference.
	 * @see #setWssX509Pkcs7Token10(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssX509Pkcs7Token10()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssX509Pkcs7Token10' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssX509Pkcs7Token10();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509Pkcs7Token10 <em>Wss X509 Pkcs7 Token10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss X509 Pkcs7 Token10</em>' containment reference.
	 * @see #getWssX509Pkcs7Token10()
	 * @generated
	 */
	void setWssX509Pkcs7Token10(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss X509 Pkcs7 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss X509 Pkcs7 Token11</em>' containment reference.
	 * @see #setWssX509Pkcs7Token11(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssX509Pkcs7Token11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssX509Pkcs7Token11' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssX509Pkcs7Token11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509Pkcs7Token11 <em>Wss X509 Pkcs7 Token11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss X509 Pkcs7 Token11</em>' containment reference.
	 * @see #getWssX509Pkcs7Token11()
	 * @generated
	 */
	void setWssX509Pkcs7Token11(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss X509 Pki Path V1 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss X509 Pki Path V1 Token10</em>' containment reference.
	 * @see #setWssX509PkiPathV1Token10(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssX509PkiPathV1Token10()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssX509PkiPathV1Token10' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssX509PkiPathV1Token10();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509PkiPathV1Token10 <em>Wss X509 Pki Path V1 Token10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss X509 Pki Path V1 Token10</em>' containment reference.
	 * @see #getWssX509PkiPathV1Token10()
	 * @generated
	 */
	void setWssX509PkiPathV1Token10(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss X509 Pki Path V1 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss X509 Pki Path V1 Token11</em>' containment reference.
	 * @see #setWssX509PkiPathV1Token11(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssX509PkiPathV1Token11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssX509PkiPathV1Token11' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssX509PkiPathV1Token11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509PkiPathV1Token11 <em>Wss X509 Pki Path V1 Token11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss X509 Pki Path V1 Token11</em>' containment reference.
	 * @see #getWssX509PkiPathV1Token11()
	 * @generated
	 */
	void setWssX509PkiPathV1Token11(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss X509V1 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss X509V1 Token11</em>' containment reference.
	 * @see #setWssX509V1Token11(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssX509V1Token11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssX509V1Token11' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssX509V1Token11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V1Token11 <em>Wss X509V1 Token11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss X509V1 Token11</em>' containment reference.
	 * @see #getWssX509V1Token11()
	 * @generated
	 */
	void setWssX509V1Token11(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss X509V3 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss X509V3 Token10</em>' containment reference.
	 * @see #setWssX509V3Token10(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssX509V3Token10()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssX509V3Token10' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssX509V3Token10();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V3Token10 <em>Wss X509V3 Token10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss X509V3 Token10</em>' containment reference.
	 * @see #getWssX509V3Token10()
	 * @generated
	 */
	void setWssX509V3Token10(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Wss X509V3 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wss X509V3 Token11</em>' containment reference.
	 * @see #setWssX509V3Token11(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_WssX509V3Token11()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WssX509V3Token11' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getWssX509V3Token11();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V3Token11 <em>Wss X509V3 Token11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wss X509V3 Token11</em>' containment reference.
	 * @see #getWssX509V3Token11()
	 * @generated
	 */
	void setWssX509V3Token11(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>X509 Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.4.3 X509Token Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X509 Token</em>' containment reference.
	 * @see #setX509Token(TokenAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_X509Token()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509Token' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenAssertionType getX509Token();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getX509Token <em>X509 Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X509 Token</em>' containment reference.
	 * @see #getX509Token()
	 * @generated
	 */
	void setX509Token(TokenAssertionType value);

	/**
	 * Returns the value of the '<em><b>XPath10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPath10</em>' containment reference.
	 * @see #setXPath10(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_XPath10()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XPath10' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getXPath10();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXPath10 <em>XPath10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPath10</em>' containment reference.
	 * @see #getXPath10()
	 * @generated
	 */
	void setXPath10(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>XPath Filter20</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         7.1 AlgorithmSuite Assertion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPath Filter20</em>' containment reference.
	 * @see #setXPathFilter20(QNameAssertionType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_XPathFilter20()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XPathFilter20' namespace='##targetNamespace'"
	 * @generated
	 */
	QNameAssertionType getXPathFilter20();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXPathFilter20 <em>XPath Filter20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPath Filter20</em>' containment reference.
	 * @see #getXPathFilter20()
	 * @generated
	 */
	void setXPathFilter20(QNameAssertionType value);

	/**
	 * Returns the value of the '<em><b>Include Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.1 Token Inclusion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Token</em>' attribute.
	 * @see #setIncludeToken(Object)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getDocumentRoot_IncludeToken()
	 * @model dataType="org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenOpenType"
	 *        extendedMetaData="kind='attribute' name='IncludeToken' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getIncludeToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIncludeToken <em>Include Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Token</em>' attribute.
	 * @see #getIncludeToken()
	 * @generated
	 */
	void setIncludeToken(Object value);

} // DocumentRoot
