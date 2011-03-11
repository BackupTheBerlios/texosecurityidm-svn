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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Factory
 * @model kind="package"
 * @generated
 */
public interface _200702Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wssecuritypolicy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_200702Package eINSTANCE = org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Abs XPath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABS_XPATH = 3;

	/**
	 * The feature id for the '<em><b>Algorithm Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALGORITHM_SUITE = 4;

	/**
	 * The feature id for the '<em><b>Asymmetric Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASYMMETRIC_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Basic128</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC128 = 6;

	/**
	 * The feature id for the '<em><b>Basic128 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC128_RSA15 = 7;

	/**
	 * The feature id for the '<em><b>Basic128 Sha256</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC128_SHA256 = 8;

	/**
	 * The feature id for the '<em><b>Basic128 Sha256 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC128_SHA256_RSA15 = 9;

	/**
	 * The feature id for the '<em><b>Basic192</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC192 = 10;

	/**
	 * The feature id for the '<em><b>Basic192 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC192_RSA15 = 11;

	/**
	 * The feature id for the '<em><b>Basic192 Sha256</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC192_SHA256 = 12;

	/**
	 * The feature id for the '<em><b>Basic192 Sha256 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC192_SHA256_RSA15 = 13;

	/**
	 * The feature id for the '<em><b>Basic256</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC256 = 14;

	/**
	 * The feature id for the '<em><b>Basic256 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC256_RSA15 = 15;

	/**
	 * The feature id for the '<em><b>Basic256 Sha256</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC256_SHA256 = 16;

	/**
	 * The feature id for the '<em><b>Basic256 Sha256 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC256_SHA256_RSA15 = 17;

	/**
	 * The feature id for the '<em><b>Bootstrap Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOTSTRAP_POLICY = 18;

	/**
	 * The feature id for the '<em><b>Encrypt Before Signing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING = 19;

	/**
	 * The feature id for the '<em><b>Encrypted Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTED_ELEMENTS = 20;

	/**
	 * The feature id for the '<em><b>Encrypted Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTED_PARTS = 21;

	/**
	 * The feature id for the '<em><b>Encrypted Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS = 22;

	/**
	 * The feature id for the '<em><b>Encryption Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTION_TOKEN = 23;

	/**
	 * The feature id for the '<em><b>Encrypt Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPT_SIGNATURE = 24;

	/**
	 * The feature id for the '<em><b>Endorsing Encrypted Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS = 25;

	/**
	 * The feature id for the '<em><b>Endorsing Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS = 26;

	/**
	 * The feature id for the '<em><b>Hash Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HASH_PASSWORD = 27;

	/**
	 * The feature id for the '<em><b>Http Basic Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION = 28;

	/**
	 * The feature id for the '<em><b>Http Digest Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION = 29;

	/**
	 * The feature id for the '<em><b>Https Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HTTPS_TOKEN = 30;

	/**
	 * The feature id for the '<em><b>Include Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INCLUDE_TIMESTAMP = 31;

	/**
	 * The feature id for the '<em><b>Inclusive C14N</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INCLUSIVE_C14N = 32;

	/**
	 * The feature id for the '<em><b>Initiator Encryption Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN = 33;

	/**
	 * The feature id for the '<em><b>Initiator Signature Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN = 34;

	/**
	 * The feature id for the '<em><b>Initiator Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INITIATOR_TOKEN = 35;

	/**
	 * The feature id for the '<em><b>Issued Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISSUED_TOKEN = 36;

	/**
	 * The feature id for the '<em><b>Kerberos Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KERBEROS_TOKEN = 37;

	/**
	 * The feature id for the '<em><b>Key Value Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_VALUE_TOKEN = 38;

	/**
	 * The feature id for the '<em><b>Lax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAX = 39;

	/**
	 * The feature id for the '<em><b>Lax Ts First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAX_TS_FIRST = 40;

	/**
	 * The feature id for the '<em><b>Lax Ts Last</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAX_TS_LAST = 41;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYOUT = 42;

	/**
	 * The feature id for the '<em><b>Must Not Send Amend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_NOT_SEND_AMEND = 43;

	/**
	 * The feature id for the '<em><b>Must Not Send Cancel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL = 44;

	/**
	 * The feature id for the '<em><b>Must Not Send Renew</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_NOT_SEND_RENEW = 45;

	/**
	 * The feature id for the '<em><b>Must Support Client Challenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE = 46;

	/**
	 * The feature id for the '<em><b>Must Support Issued Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS = 47;

	/**
	 * The feature id for the '<em><b>Must Support Ref Embedded Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN = 48;

	/**
	 * The feature id for the '<em><b>Must Support Ref Encrypted Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY = 49;

	/**
	 * The feature id for the '<em><b>Must Support Ref External URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI = 50;

	/**
	 * The feature id for the '<em><b>Must Support Ref Issuer Serial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL = 51;

	/**
	 * The feature id for the '<em><b>Must Support Ref Key Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER = 52;

	/**
	 * The feature id for the '<em><b>Must Support Ref Thumbprint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT = 53;

	/**
	 * The feature id for the '<em><b>Must Support Server Challenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE = 54;

	/**
	 * The feature id for the '<em><b>No Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NO_PASSWORD = 55;

	/**
	 * The feature id for the '<em><b>Only Sign Entire Headers And Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY = 56;

	/**
	 * The feature id for the '<em><b>Protection Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROTECTION_TOKEN = 57;

	/**
	 * The feature id for the '<em><b>Protect Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROTECT_TOKENS = 58;

	/**
	 * The feature id for the '<em><b>Recipient Encryption Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN = 59;

	/**
	 * The feature id for the '<em><b>Recipient Signature Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN = 60;

	/**
	 * The feature id for the '<em><b>Recipient Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECIPIENT_TOKEN = 61;

	/**
	 * The feature id for the '<em><b>Rel Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REL_TOKEN = 62;

	/**
	 * The feature id for the '<em><b>Require Appies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_APPIES_TO = 63;

	/**
	 * The feature id for the '<em><b>Require Client Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE = 64;

	/**
	 * The feature id for the '<em><b>Require Client Entropy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY = 65;

	/**
	 * The feature id for the '<em><b>Required Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRED_ELEMENTS = 66;

	/**
	 * The feature id for the '<em><b>Require Derived Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS = 67;

	/**
	 * The feature id for the '<em><b>Require Embedded Token Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE = 68;

	/**
	 * The feature id for the '<em><b>Require Explicit Derived Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS = 69;

	/**
	 * The feature id for the '<em><b>Require External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE = 70;

	/**
	 * The feature id for the '<em><b>Require External Uri Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE = 71;

	/**
	 * The feature id for the '<em><b>Require Implied Derived Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS = 72;

	/**
	 * The feature id for the '<em><b>Require Internal Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE = 73;

	/**
	 * The feature id for the '<em><b>Require Issuer Serial Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE = 74;

	/**
	 * The feature id for the '<em><b>Require Key Identifier Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE = 75;

	/**
	 * The feature id for the '<em><b>Require Request Security Token Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION = 76;

	/**
	 * The feature id for the '<em><b>Require Server Entropy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY = 77;

	/**
	 * The feature id for the '<em><b>Require Signature Confirmation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION = 78;

	/**
	 * The feature id for the '<em><b>Require Thumbprint Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE = 79;

	/**
	 * The feature id for the '<em><b>Rsa Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RSA_KEY_VALUE = 80;

	/**
	 * The feature id for the '<em><b>Saml Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SAML_TOKEN = 81;

	/**
	 * The feature id for the '<em><b>SC13 Security Context Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN = 82;

	/**
	 * The feature id for the '<em><b>Secure Conversation Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN = 83;

	/**
	 * The feature id for the '<em><b>Security Context Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN = 84;

	/**
	 * The feature id for the '<em><b>Signature Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE_TOKEN = 85;

	/**
	 * The feature id for the '<em><b>Signed Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNED_ELEMENTS = 86;

	/**
	 * The feature id for the '<em><b>Signed Encrypted Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS = 87;

	/**
	 * The feature id for the '<em><b>Signed Endorsing Encrypted Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS = 88;

	/**
	 * The feature id for the '<em><b>Signed Endorsing Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS = 89;

	/**
	 * The feature id for the '<em><b>Signed Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNED_PARTS = 90;

	/**
	 * The feature id for the '<em><b>Signed Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS = 91;

	/**
	 * The feature id for the '<em><b>SOAP Normalization10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOAP_NORMALIZATION10 = 92;

	/**
	 * The feature id for the '<em><b>Spnego Context Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN = 93;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRICT = 94;

	/**
	 * The feature id for the '<em><b>STR Transform10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STR_TRANSFORM10 = 95;

	/**
	 * The feature id for the '<em><b>Supporting Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPPORTING_TOKENS = 96;

	/**
	 * The feature id for the '<em><b>Symmetric Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYMMETRIC_BINDING = 97;

	/**
	 * The feature id for the '<em><b>Transport Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSPORT_BINDING = 98;

	/**
	 * The feature id for the '<em><b>Transport Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSPORT_TOKEN = 99;

	/**
	 * The feature id for the '<em><b>Triple Des</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRIPLE_DES = 100;

	/**
	 * The feature id for the '<em><b>Triple Des Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRIPLE_DES_RSA15 = 101;

	/**
	 * The feature id for the '<em><b>Triple Des Sha256</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRIPLE_DES_SHA256 = 102;

	/**
	 * The feature id for the '<em><b>Triple Des Sha256 Rsa15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15 = 103;

	/**
	 * The feature id for the '<em><b>Trust13</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRUST13 = 104;

	/**
	 * The feature id for the '<em><b>Username Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USERNAME_TOKEN = 105;

	/**
	 * The feature id for the '<em><b>Wss10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS10 = 106;

	/**
	 * The feature id for the '<em><b>Wss11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS11 = 107;

	/**
	 * The feature id for the '<em><b>Wss Gss Kerberos V5 Ap Req Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11 = 108;

	/**
	 * The feature id for the '<em><b>Wss Kerberos V5 Ap Req Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11 = 109;

	/**
	 * The feature id for the '<em><b>Wss Rel V10 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_REL_V10_TOKEN10 = 110;

	/**
	 * The feature id for the '<em><b>Wss Rel V10 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_REL_V10_TOKEN11 = 111;

	/**
	 * The feature id for the '<em><b>Wss Rel V20 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_REL_V20_TOKEN10 = 112;

	/**
	 * The feature id for the '<em><b>Wss Rel V20 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_REL_V20_TOKEN11 = 113;

	/**
	 * The feature id for the '<em><b>Wss Saml V11 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10 = 114;

	/**
	 * The feature id for the '<em><b>Wss Saml V11 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11 = 115;

	/**
	 * The feature id for the '<em><b>Wss Saml V20 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11 = 116;

	/**
	 * The feature id for the '<em><b>Wss Username Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_USERNAME_TOKEN10 = 117;

	/**
	 * The feature id for the '<em><b>Wss Username Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_USERNAME_TOKEN11 = 118;

	/**
	 * The feature id for the '<em><b>Wss X509 Pkcs7 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10 = 119;

	/**
	 * The feature id for the '<em><b>Wss X509 Pkcs7 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11 = 120;

	/**
	 * The feature id for the '<em><b>Wss X509 Pki Path V1 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10 = 121;

	/**
	 * The feature id for the '<em><b>Wss X509 Pki Path V1 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11 = 122;

	/**
	 * The feature id for the '<em><b>Wss X509V1 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_X509V1_TOKEN11 = 123;

	/**
	 * The feature id for the '<em><b>Wss X509V3 Token10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_X509V3_TOKEN10 = 124;

	/**
	 * The feature id for the '<em><b>Wss X509V3 Token11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WSS_X509V3_TOKEN11 = 125;

	/**
	 * The feature id for the '<em><b>X509 Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__X509_TOKEN = 126;

	/**
	 * The feature id for the '<em><b>XPath10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XPATH10 = 127;

	/**
	 * The feature id for the '<em><b>XPath Filter20</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XPATH_FILTER20 = 128;

	/**
	 * The feature id for the '<em><b>Include Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INCLUDE_TOKEN = 129;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 130;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.EmptyTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.HeaderTypeImpl <em>Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.HeaderTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getHeaderType()
	 * @generated
	 */
	int HEADER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.IssuedTokenTypeImpl <em>Issued Token Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.IssuedTokenTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getIssuedTokenType()
	 * @generated
	 */
	int ISSUED_TOKEN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_TOKEN_TYPE__ISSUER = 0;

	/**
	 * The feature id for the '<em><b>Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_TOKEN_TYPE__ISSUER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Request Security Token Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_TOKEN_TYPE__REQUEST_SECURITY_TOKEN_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_TOKEN_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Include Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_TOKEN_TYPE__INCLUDE_TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_TOKEN_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Issued Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_TOKEN_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.KeyValueTokenTypeImpl <em>Key Value Token Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.KeyValueTokenTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getKeyValueTokenType()
	 * @generated
	 */
	int KEY_VALUE_TOKEN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TOKEN_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Include Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TOKEN_TYPE__INCLUDE_TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TOKEN_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Key Value Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TOKEN_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.NestedPolicyTypeImpl <em>Nested Policy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.NestedPolicyTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getNestedPolicyType()
	 * @generated
	 */
	int NESTED_POLICY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_POLICY_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_POLICY_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Nested Policy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_POLICY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.QNameAssertionTypeImpl <em>QName Assertion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.QNameAssertionTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getQNameAssertionType()
	 * @generated
	 */
	int QNAME_ASSERTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_ASSERTION_TYPE__ANY_ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>QName Assertion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_ASSERTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.RequestSecurityTokenTemplateTypeImpl <em>Request Security Token Template Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.RequestSecurityTokenTemplateTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getRequestSecurityTokenTemplateType()
	 * @generated
	 */
	int REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Trust Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE__TRUST_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Request Security Token Template Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SecureConversationTokenTypeImpl <em>Secure Conversation Token Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SecureConversationTokenTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getSecureConversationTokenType()
	 * @generated
	 */
	int SECURE_CONVERSATION_TOKEN_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONVERSATION_TOKEN_TYPE__ISSUER = 0;

	/**
	 * The feature id for the '<em><b>Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONVERSATION_TOKEN_TYPE__ISSUER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONVERSATION_TOKEN_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Include Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONVERSATION_TOKEN_TYPE__INCLUDE_TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONVERSATION_TOKEN_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Secure Conversation Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONVERSATION_TOKEN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SePartsTypeImpl <em>Se Parts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SePartsTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getSePartsType()
	 * @generated
	 */
	int SE_PARTS_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_PARTS_TYPE__BODY = 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_PARTS_TYPE__HEADER = 1;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_PARTS_TYPE__ATTACHMENTS = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_PARTS_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_PARTS_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Se Parts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_PARTS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SerElementsTypeImpl <em>Ser Elements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SerElementsTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getSerElementsType()
	 * @generated
	 */
	int SER_ELEMENTS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>XPath</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SER_ELEMENTS_TYPE__XPATH = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SER_ELEMENTS_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>XPath Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SER_ELEMENTS_TYPE__XPATH_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SER_ELEMENTS_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Ser Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SER_ELEMENTS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SpnegoContextTokenTypeImpl <em>Spnego Context Token Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SpnegoContextTokenTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getSpnegoContextTokenType()
	 * @generated
	 */
	int SPNEGO_CONTEXT_TOKEN_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPNEGO_CONTEXT_TOKEN_TYPE__ISSUER = 0;

	/**
	 * The feature id for the '<em><b>Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPNEGO_CONTEXT_TOKEN_TYPE__ISSUER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPNEGO_CONTEXT_TOKEN_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Include Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPNEGO_CONTEXT_TOKEN_TYPE__INCLUDE_TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPNEGO_CONTEXT_TOKEN_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Spnego Context Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPNEGO_CONTEXT_TOKEN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.TokenAssertionTypeImpl <em>Token Assertion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.TokenAssertionTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getTokenAssertionType()
	 * @generated
	 */
	int TOKEN_ASSERTION_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ASSERTION_TYPE__ISSUER = 0;

	/**
	 * The feature id for the '<em><b>Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ASSERTION_TYPE__ISSUER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ASSERTION_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Include Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ASSERTION_TYPE__INCLUDE_TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ASSERTION_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Token Assertion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ASSERTION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType <em>Include Token Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getIncludeTokenType()
	 * @generated
	 */
	int INCLUDE_TOKEN_TYPE = 13;

	/**
	 * The meta object id for the '<em>Include Token Open Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getIncludeTokenOpenType()
	 * @generated
	 */
	int INCLUDE_TOKEN_OPEN_TYPE = 14;

	/**
	 * The meta object id for the '<em>Include Token Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getIncludeTokenTypeObject()
	 * @generated
	 */
	int INCLUDE_TOKEN_TYPE_OBJECT = 15;


	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAbsXPath <em>Abs XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abs XPath</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAbsXPath()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbsXPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAlgorithmSuite <em>Algorithm Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithm Suite</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAlgorithmSuite()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AlgorithmSuite();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAsymmetricBinding <em>Asymmetric Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asymmetric Binding</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getAsymmetricBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AsymmetricBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128 <em>Basic128</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic128</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic128();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Rsa15 <em>Basic128 Rsa15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic128 Rsa15</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Rsa15()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic128Rsa15();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Sha256 <em>Basic128 Sha256</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic128 Sha256</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Sha256()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic128Sha256();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Sha256Rsa15 <em>Basic128 Sha256 Rsa15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic128 Sha256 Rsa15</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic128Sha256Rsa15()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic128Sha256Rsa15();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192 <em>Basic192</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic192</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic192();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Rsa15 <em>Basic192 Rsa15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic192 Rsa15</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Rsa15()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic192Rsa15();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Sha256 <em>Basic192 Sha256</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic192 Sha256</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Sha256()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic192Sha256();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Sha256Rsa15 <em>Basic192 Sha256 Rsa15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic192 Sha256 Rsa15</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic192Sha256Rsa15()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic192Sha256Rsa15();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256 <em>Basic256</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic256</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic256();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Rsa15 <em>Basic256 Rsa15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic256 Rsa15</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Rsa15()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic256Rsa15();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Sha256 <em>Basic256 Sha256</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic256 Sha256</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Sha256()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic256Sha256();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Sha256Rsa15 <em>Basic256 Sha256 Rsa15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic256 Sha256 Rsa15</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBasic256Sha256Rsa15()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Basic256Sha256Rsa15();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBootstrapPolicy <em>Bootstrap Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bootstrap Policy</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getBootstrapPolicy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BootstrapPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptBeforeSigning <em>Encrypt Before Signing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encrypt Before Signing</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptBeforeSigning()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptBeforeSigning();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedElements <em>Encrypted Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encrypted Elements</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedElements()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptedElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedParts <em>Encrypted Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encrypted Parts</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedParts()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptedParts();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedSupportingTokens <em>Encrypted Supporting Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encrypted Supporting Tokens</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptedSupportingTokens()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptedSupportingTokens();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptionToken <em>Encryption Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encryption Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptionToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptionToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptSignature <em>Encrypt Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encrypt Signature</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEncryptSignature()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptSignature();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEndorsingEncryptedSupportingTokens <em>Endorsing Encrypted Supporting Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endorsing Encrypted Supporting Tokens</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEndorsingEncryptedSupportingTokens()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EndorsingEncryptedSupportingTokens();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEndorsingSupportingTokens <em>Endorsing Supporting Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endorsing Supporting Tokens</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getEndorsingSupportingTokens()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EndorsingSupportingTokens();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHashPassword <em>Hash Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hash Password</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHashPassword()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HashPassword();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpBasicAuthentication <em>Http Basic Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Http Basic Authentication</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpBasicAuthentication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HttpBasicAuthentication();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpDigestAuthentication <em>Http Digest Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Http Digest Authentication</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpDigestAuthentication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HttpDigestAuthentication();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpsToken <em>Https Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Https Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getHttpsToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HttpsToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIncludeTimestamp <em>Include Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include Timestamp</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIncludeTimestamp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IncludeTimestamp();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInclusiveC14N <em>Inclusive C14N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inclusive C14N</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInclusiveC14N()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InclusiveC14N();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorEncryptionToken <em>Initiator Encryption Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initiator Encryption Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorEncryptionToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InitiatorEncryptionToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorSignatureToken <em>Initiator Signature Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initiator Signature Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorSignatureToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InitiatorSignatureToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorToken <em>Initiator Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initiator Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getInitiatorToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InitiatorToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIssuedToken <em>Issued Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issued Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIssuedToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IssuedToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getKerberosToken <em>Kerberos Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kerberos Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getKerberosToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KerberosToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getKeyValueToken <em>Key Value Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Value Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getKeyValueToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KeyValueToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLax <em>Lax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lax</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLax()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Lax();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLaxTsFirst <em>Lax Ts First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lax Ts First</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLaxTsFirst()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LaxTsFirst();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLaxTsLast <em>Lax Ts Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lax Ts Last</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLaxTsLast()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LaxTsLast();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getLayout()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendAmend <em>Must Not Send Amend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Not Send Amend</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendAmend()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustNotSendAmend();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendCancel <em>Must Not Send Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Not Send Cancel</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendCancel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustNotSendCancel();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendRenew <em>Must Not Send Renew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Not Send Renew</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustNotSendRenew()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustNotSendRenew();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportClientChallenge <em>Must Support Client Challenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Support Client Challenge</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportClientChallenge()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustSupportClientChallenge();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportIssuedTokens <em>Must Support Issued Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Support Issued Tokens</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportIssuedTokens()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustSupportIssuedTokens();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefEmbeddedToken <em>Must Support Ref Embedded Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Support Ref Embedded Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefEmbeddedToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustSupportRefEmbeddedToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefEncryptedKey <em>Must Support Ref Encrypted Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Support Ref Encrypted Key</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefEncryptedKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustSupportRefEncryptedKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefExternalURI <em>Must Support Ref External URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Support Ref External URI</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefExternalURI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustSupportRefExternalURI();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefIssuerSerial <em>Must Support Ref Issuer Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Support Ref Issuer Serial</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefIssuerSerial()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustSupportRefIssuerSerial();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefKeyIdentifier <em>Must Support Ref Key Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Support Ref Key Identifier</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefKeyIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustSupportRefKeyIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefThumbprint <em>Must Support Ref Thumbprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Support Ref Thumbprint</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportRefThumbprint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustSupportRefThumbprint();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportServerChallenge <em>Must Support Server Challenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Support Server Challenge</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getMustSupportServerChallenge()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MustSupportServerChallenge();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getNoPassword <em>No Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Password</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getNoPassword()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NoPassword();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getOnlySignEntireHeadersAndBody <em>Only Sign Entire Headers And Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Only Sign Entire Headers And Body</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getOnlySignEntireHeadersAndBody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OnlySignEntireHeadersAndBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getProtectionToken <em>Protection Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protection Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getProtectionToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProtectionToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getProtectTokens <em>Protect Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protect Tokens</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getProtectTokens()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProtectTokens();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientEncryptionToken <em>Recipient Encryption Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipient Encryption Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientEncryptionToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RecipientEncryptionToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientSignatureToken <em>Recipient Signature Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipient Signature Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientSignatureToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RecipientSignatureToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientToken <em>Recipient Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipient Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRecipientToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RecipientToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRelToken <em>Rel Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rel Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRelToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RelToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireAppiesTo <em>Require Appies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Appies To</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireAppiesTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireAppiesTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireClientCertificate <em>Require Client Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Client Certificate</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireClientCertificate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireClientCertificate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireClientEntropy <em>Require Client Entropy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Client Entropy</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireClientEntropy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireClientEntropy();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequiredElements <em>Required Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Elements</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequiredElements()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequiredElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireDerivedKeys <em>Require Derived Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Derived Keys</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireDerivedKeys()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireDerivedKeys();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireEmbeddedTokenReference <em>Require Embedded Token Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Embedded Token Reference</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireEmbeddedTokenReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireEmbeddedTokenReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExplicitDerivedKeys <em>Require Explicit Derived Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Explicit Derived Keys</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExplicitDerivedKeys()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireExplicitDerivedKeys();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExternalReference <em>Require External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require External Reference</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExternalReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireExternalReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExternalUriReference <em>Require External Uri Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require External Uri Reference</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireExternalUriReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireExternalUriReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireImpliedDerivedKeys <em>Require Implied Derived Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Implied Derived Keys</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireImpliedDerivedKeys()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireImpliedDerivedKeys();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireInternalReference <em>Require Internal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Internal Reference</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireInternalReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireInternalReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireIssuerSerialReference <em>Require Issuer Serial Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Issuer Serial Reference</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireIssuerSerialReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireIssuerSerialReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireKeyIdentifierReference <em>Require Key Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Key Identifier Reference</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireKeyIdentifierReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireKeyIdentifierReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireRequestSecurityTokenCollection <em>Require Request Security Token Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Request Security Token Collection</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireRequestSecurityTokenCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireRequestSecurityTokenCollection();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireServerEntropy <em>Require Server Entropy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Server Entropy</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireServerEntropy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireServerEntropy();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireSignatureConfirmation <em>Require Signature Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Signature Confirmation</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireSignatureConfirmation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireSignatureConfirmation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireThumbprintReference <em>Require Thumbprint Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Thumbprint Reference</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRequireThumbprintReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequireThumbprintReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRsaKeyValue <em>Rsa Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rsa Key Value</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getRsaKeyValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RsaKeyValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSamlToken <em>Saml Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Saml Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSamlToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SamlToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSC13SecurityContextToken <em>SC13 Security Context Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SC13 Security Context Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSC13SecurityContextToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SC13SecurityContextToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSecureConversationToken <em>Secure Conversation Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Secure Conversation Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSecureConversationToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecureConversationToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSecurityContextToken <em>Security Context Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Context Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSecurityContextToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityContextToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignatureToken <em>Signature Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignatureToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignatureToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedElements <em>Signed Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signed Elements</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedElements()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignedElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEncryptedSupportingTokens <em>Signed Encrypted Supporting Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signed Encrypted Supporting Tokens</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEncryptedSupportingTokens()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignedEncryptedSupportingTokens();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEndorsingEncryptedSupportingTokens <em>Signed Endorsing Encrypted Supporting Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signed Endorsing Encrypted Supporting Tokens</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEndorsingEncryptedSupportingTokens()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignedEndorsingEncryptedSupportingTokens();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEndorsingSupportingTokens <em>Signed Endorsing Supporting Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signed Endorsing Supporting Tokens</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedEndorsingSupportingTokens()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignedEndorsingSupportingTokens();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedParts <em>Signed Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signed Parts</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedParts()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignedParts();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedSupportingTokens <em>Signed Supporting Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signed Supporting Tokens</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSignedSupportingTokens()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignedSupportingTokens();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSOAPNormalization10 <em>SOAP Normalization10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SOAP Normalization10</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSOAPNormalization10()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SOAPNormalization10();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSpnegoContextToken <em>Spnego Context Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spnego Context Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSpnegoContextToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpnegoContextToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strict</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getStrict()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Strict();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSTRTransform10 <em>STR Transform10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>STR Transform10</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSTRTransform10()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_STRTransform10();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSupportingTokens <em>Supporting Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supporting Tokens</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSupportingTokens()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SupportingTokens();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSymmetricBinding <em>Symmetric Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Symmetric Binding</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getSymmetricBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SymmetricBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTransportBinding <em>Transport Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Binding</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTransportBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransportBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTransportToken <em>Transport Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTransportToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransportToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDes <em>Triple Des</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triple Des</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDes()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TripleDes();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesRsa15 <em>Triple Des Rsa15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triple Des Rsa15</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesRsa15()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TripleDesRsa15();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesSha256 <em>Triple Des Sha256</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triple Des Sha256</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesSha256()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TripleDesSha256();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesSha256Rsa15 <em>Triple Des Sha256 Rsa15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triple Des Sha256 Rsa15</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTripleDesSha256Rsa15()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TripleDesSha256Rsa15();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTrust13 <em>Trust13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trust13</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getTrust13()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Trust13();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getUsernameToken <em>Username Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Username Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getUsernameToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UsernameToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWss10 <em>Wss10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss10</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWss10()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Wss10();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWss11 <em>Wss11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWss11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Wss11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssGssKerberosV5ApReqToken11 <em>Wss Gss Kerberos V5 Ap Req Token11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss Gss Kerberos V5 Ap Req Token11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssGssKerberosV5ApReqToken11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssGssKerberosV5ApReqToken11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssKerberosV5ApReqToken11 <em>Wss Kerberos V5 Ap Req Token11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss Kerberos V5 Ap Req Token11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssKerberosV5ApReqToken11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssKerberosV5ApReqToken11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV10Token10 <em>Wss Rel V10 Token10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss Rel V10 Token10</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV10Token10()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssRelV10Token10();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV10Token11 <em>Wss Rel V10 Token11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss Rel V10 Token11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV10Token11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssRelV10Token11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV20Token10 <em>Wss Rel V20 Token10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss Rel V20 Token10</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV20Token10()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssRelV20Token10();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV20Token11 <em>Wss Rel V20 Token11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss Rel V20 Token11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssRelV20Token11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssRelV20Token11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV11Token10 <em>Wss Saml V11 Token10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss Saml V11 Token10</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV11Token10()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssSamlV11Token10();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV11Token11 <em>Wss Saml V11 Token11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss Saml V11 Token11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV11Token11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssSamlV11Token11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV20Token11 <em>Wss Saml V20 Token11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss Saml V20 Token11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssSamlV20Token11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssSamlV20Token11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssUsernameToken10 <em>Wss Username Token10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss Username Token10</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssUsernameToken10()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssUsernameToken10();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssUsernameToken11 <em>Wss Username Token11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss Username Token11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssUsernameToken11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssUsernameToken11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509Pkcs7Token10 <em>Wss X509 Pkcs7 Token10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss X509 Pkcs7 Token10</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509Pkcs7Token10()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssX509Pkcs7Token10();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509Pkcs7Token11 <em>Wss X509 Pkcs7 Token11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss X509 Pkcs7 Token11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509Pkcs7Token11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssX509Pkcs7Token11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509PkiPathV1Token10 <em>Wss X509 Pki Path V1 Token10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss X509 Pki Path V1 Token10</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509PkiPathV1Token10()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssX509PkiPathV1Token10();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509PkiPathV1Token11 <em>Wss X509 Pki Path V1 Token11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss X509 Pki Path V1 Token11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509PkiPathV1Token11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssX509PkiPathV1Token11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V1Token11 <em>Wss X509V1 Token11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss X509V1 Token11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V1Token11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssX509V1Token11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V3Token10 <em>Wss X509V3 Token10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss X509V3 Token10</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V3Token10()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssX509V3Token10();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V3Token11 <em>Wss X509V3 Token11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wss X509V3 Token11</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getWssX509V3Token11()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WssX509V3Token11();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getX509Token <em>X509 Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X509 Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getX509Token()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_X509Token();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXPath10 <em>XPath10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XPath10</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXPath10()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XPath10();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXPathFilter20 <em>XPath Filter20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XPath Filter20</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getXPathFilter20()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XPathFilter20();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIncludeToken <em>Include Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot#getIncludeToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IncludeToken();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.EmptyType
	 * @generated
	 */
	EClass getEmptyType();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType
	 * @generated
	 */
	EClass getHeaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType#getName()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType#getNamespace()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Namespace();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType#getAnyAttribute()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType <em>Issued Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issued Token Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType
	 * @generated
	 */
	EClass getIssuedTokenType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issuer</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getIssuer()
	 * @see #getIssuedTokenType()
	 * @generated
	 */
	EReference getIssuedTokenType_Issuer();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getIssuerName <em>Issuer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer Name</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getIssuerName()
	 * @see #getIssuedTokenType()
	 * @generated
	 */
	EAttribute getIssuedTokenType_IssuerName();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getRequestSecurityTokenTemplate <em>Request Security Token Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Security Token Template</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getRequestSecurityTokenTemplate()
	 * @see #getIssuedTokenType()
	 * @generated
	 */
	EReference getIssuedTokenType_RequestSecurityTokenTemplate();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getAny()
	 * @see #getIssuedTokenType()
	 * @generated
	 */
	EAttribute getIssuedTokenType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getIncludeToken <em>Include Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getIncludeToken()
	 * @see #getIssuedTokenType()
	 * @generated
	 */
	EAttribute getIssuedTokenType_IncludeToken();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType#getAnyAttribute()
	 * @see #getIssuedTokenType()
	 * @generated
	 */
	EAttribute getIssuedTokenType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType <em>Key Value Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Token Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType
	 * @generated
	 */
	EClass getKeyValueTokenType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType#getAny()
	 * @see #getKeyValueTokenType()
	 * @generated
	 */
	EAttribute getKeyValueTokenType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType#getIncludeToken <em>Include Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType#getIncludeToken()
	 * @see #getKeyValueTokenType()
	 * @generated
	 */
	EAttribute getKeyValueTokenType_IncludeToken();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType#getAnyAttribute()
	 * @see #getKeyValueTokenType()
	 * @generated
	 */
	EAttribute getKeyValueTokenType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.NestedPolicyType <em>Nested Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Policy Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.NestedPolicyType
	 * @generated
	 */
	EClass getNestedPolicyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.NestedPolicyType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.NestedPolicyType#getAny()
	 * @see #getNestedPolicyType()
	 * @generated
	 */
	EAttribute getNestedPolicyType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.NestedPolicyType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.NestedPolicyType#getAnyAttribute()
	 * @see #getNestedPolicyType()
	 * @generated
	 */
	EAttribute getNestedPolicyType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.QNameAssertionType <em>QName Assertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QName Assertion Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.QNameAssertionType
	 * @generated
	 */
	EClass getQNameAssertionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.QNameAssertionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.QNameAssertionType#getAnyAttribute()
	 * @see #getQNameAssertionType()
	 * @generated
	 */
	EAttribute getQNameAssertionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.RequestSecurityTokenTemplateType <em>Request Security Token Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Security Token Template Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.RequestSecurityTokenTemplateType
	 * @generated
	 */
	EClass getRequestSecurityTokenTemplateType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.RequestSecurityTokenTemplateType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.RequestSecurityTokenTemplateType#getAny()
	 * @see #getRequestSecurityTokenTemplateType()
	 * @generated
	 */
	EAttribute getRequestSecurityTokenTemplateType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.RequestSecurityTokenTemplateType#getTrustVersion <em>Trust Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust Version</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.RequestSecurityTokenTemplateType#getTrustVersion()
	 * @see #getRequestSecurityTokenTemplateType()
	 * @generated
	 */
	EAttribute getRequestSecurityTokenTemplateType_TrustVersion();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.RequestSecurityTokenTemplateType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.RequestSecurityTokenTemplateType#getAnyAttribute()
	 * @see #getRequestSecurityTokenTemplateType()
	 * @generated
	 */
	EAttribute getRequestSecurityTokenTemplateType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType <em>Secure Conversation Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secure Conversation Token Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType
	 * @generated
	 */
	EClass getSecureConversationTokenType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issuer</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType#getIssuer()
	 * @see #getSecureConversationTokenType()
	 * @generated
	 */
	EReference getSecureConversationTokenType_Issuer();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType#getIssuerName <em>Issuer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer Name</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType#getIssuerName()
	 * @see #getSecureConversationTokenType()
	 * @generated
	 */
	EAttribute getSecureConversationTokenType_IssuerName();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType#getAny()
	 * @see #getSecureConversationTokenType()
	 * @generated
	 */
	EAttribute getSecureConversationTokenType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType#getIncludeToken <em>Include Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType#getIncludeToken()
	 * @see #getSecureConversationTokenType()
	 * @generated
	 */
	EAttribute getSecureConversationTokenType_IncludeToken();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType#getAnyAttribute()
	 * @see #getSecureConversationTokenType()
	 * @generated
	 */
	EAttribute getSecureConversationTokenType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType <em>Se Parts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Se Parts Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType
	 * @generated
	 */
	EClass getSePartsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getBody()
	 * @see #getSePartsType()
	 * @generated
	 */
	EReference getSePartsType_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getHeader()
	 * @see #getSePartsType()
	 * @generated
	 */
	EReference getSePartsType_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getAttachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachments</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getAttachments()
	 * @see #getSePartsType()
	 * @generated
	 */
	EReference getSePartsType_Attachments();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getAny()
	 * @see #getSePartsType()
	 * @generated
	 */
	EAttribute getSePartsType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getAnyAttribute()
	 * @see #getSePartsType()
	 * @generated
	 */
	EAttribute getSePartsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType <em>Ser Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ser Elements Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType
	 * @generated
	 */
	EClass getSerElementsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType#getXPath <em>XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>XPath</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType#getXPath()
	 * @see #getSerElementsType()
	 * @generated
	 */
	EAttribute getSerElementsType_XPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType#getAny()
	 * @see #getSerElementsType()
	 * @generated
	 */
	EAttribute getSerElementsType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType#getXPathVersion <em>XPath Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPath Version</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType#getXPathVersion()
	 * @see #getSerElementsType()
	 * @generated
	 */
	EAttribute getSerElementsType_XPathVersion();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType#getAnyAttribute()
	 * @see #getSerElementsType()
	 * @generated
	 */
	EAttribute getSerElementsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType <em>Spnego Context Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spnego Context Token Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType
	 * @generated
	 */
	EClass getSpnegoContextTokenType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issuer</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType#getIssuer()
	 * @see #getSpnegoContextTokenType()
	 * @generated
	 */
	EReference getSpnegoContextTokenType_Issuer();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType#getIssuerName <em>Issuer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer Name</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType#getIssuerName()
	 * @see #getSpnegoContextTokenType()
	 * @generated
	 */
	EAttribute getSpnegoContextTokenType_IssuerName();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType#getAny()
	 * @see #getSpnegoContextTokenType()
	 * @generated
	 */
	EAttribute getSpnegoContextTokenType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType#getIncludeToken <em>Include Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType#getIncludeToken()
	 * @see #getSpnegoContextTokenType()
	 * @generated
	 */
	EAttribute getSpnegoContextTokenType_IncludeToken();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType#getAnyAttribute()
	 * @see #getSpnegoContextTokenType()
	 * @generated
	 */
	EAttribute getSpnegoContextTokenType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType <em>Token Assertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Assertion Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType
	 * @generated
	 */
	EClass getTokenAssertionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issuer</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType#getIssuer()
	 * @see #getTokenAssertionType()
	 * @generated
	 */
	EReference getTokenAssertionType_Issuer();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType#getIssuerName <em>Issuer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer Name</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType#getIssuerName()
	 * @see #getTokenAssertionType()
	 * @generated
	 */
	EAttribute getTokenAssertionType_IssuerName();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType#getAny()
	 * @see #getTokenAssertionType()
	 * @generated
	 */
	EAttribute getTokenAssertionType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType#getIncludeToken <em>Include Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType#getIncludeToken()
	 * @see #getTokenAssertionType()
	 * @generated
	 */
	EAttribute getTokenAssertionType_IncludeToken();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType#getAnyAttribute()
	 * @see #getTokenAssertionType()
	 * @generated
	 */
	EAttribute getTokenAssertionType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType <em>Include Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Include Token Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType
	 * @generated
	 */
	EEnum getIncludeTokenType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Include Token Open Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Include Token Open Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='IncludeTokenOpenType' memberTypes='IncludeTokenType http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getIncludeTokenOpenType();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType <em>Include Token Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Include Token Type Object</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType
	 * @model instanceClass="org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType"
	 *        extendedMetaData="name='IncludeTokenType:Object' baseType='IncludeTokenType'"
	 * @generated
	 */
	EDataType getIncludeTokenTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_200702Factory get_200702Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.DocumentRootImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Abs XPath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABS_XPATH = eINSTANCE.getDocumentRoot_AbsXPath();

		/**
		 * The meta object literal for the '<em><b>Algorithm Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ALGORITHM_SUITE = eINSTANCE.getDocumentRoot_AlgorithmSuite();

		/**
		 * The meta object literal for the '<em><b>Asymmetric Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASYMMETRIC_BINDING = eINSTANCE.getDocumentRoot_AsymmetricBinding();

		/**
		 * The meta object literal for the '<em><b>Basic128</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC128 = eINSTANCE.getDocumentRoot_Basic128();

		/**
		 * The meta object literal for the '<em><b>Basic128 Rsa15</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC128_RSA15 = eINSTANCE.getDocumentRoot_Basic128Rsa15();

		/**
		 * The meta object literal for the '<em><b>Basic128 Sha256</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC128_SHA256 = eINSTANCE.getDocumentRoot_Basic128Sha256();

		/**
		 * The meta object literal for the '<em><b>Basic128 Sha256 Rsa15</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC128_SHA256_RSA15 = eINSTANCE.getDocumentRoot_Basic128Sha256Rsa15();

		/**
		 * The meta object literal for the '<em><b>Basic192</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC192 = eINSTANCE.getDocumentRoot_Basic192();

		/**
		 * The meta object literal for the '<em><b>Basic192 Rsa15</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC192_RSA15 = eINSTANCE.getDocumentRoot_Basic192Rsa15();

		/**
		 * The meta object literal for the '<em><b>Basic192 Sha256</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC192_SHA256 = eINSTANCE.getDocumentRoot_Basic192Sha256();

		/**
		 * The meta object literal for the '<em><b>Basic192 Sha256 Rsa15</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC192_SHA256_RSA15 = eINSTANCE.getDocumentRoot_Basic192Sha256Rsa15();

		/**
		 * The meta object literal for the '<em><b>Basic256</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC256 = eINSTANCE.getDocumentRoot_Basic256();

		/**
		 * The meta object literal for the '<em><b>Basic256 Rsa15</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC256_RSA15 = eINSTANCE.getDocumentRoot_Basic256Rsa15();

		/**
		 * The meta object literal for the '<em><b>Basic256 Sha256</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC256_SHA256 = eINSTANCE.getDocumentRoot_Basic256Sha256();

		/**
		 * The meta object literal for the '<em><b>Basic256 Sha256 Rsa15</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASIC256_SHA256_RSA15 = eINSTANCE.getDocumentRoot_Basic256Sha256Rsa15();

		/**
		 * The meta object literal for the '<em><b>Bootstrap Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOTSTRAP_POLICY = eINSTANCE.getDocumentRoot_BootstrapPolicy();

		/**
		 * The meta object literal for the '<em><b>Encrypt Before Signing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING = eINSTANCE.getDocumentRoot_EncryptBeforeSigning();

		/**
		 * The meta object literal for the '<em><b>Encrypted Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENCRYPTED_ELEMENTS = eINSTANCE.getDocumentRoot_EncryptedElements();

		/**
		 * The meta object literal for the '<em><b>Encrypted Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENCRYPTED_PARTS = eINSTANCE.getDocumentRoot_EncryptedParts();

		/**
		 * The meta object literal for the '<em><b>Encrypted Supporting Tokens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS = eINSTANCE.getDocumentRoot_EncryptedSupportingTokens();

		/**
		 * The meta object literal for the '<em><b>Encryption Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENCRYPTION_TOKEN = eINSTANCE.getDocumentRoot_EncryptionToken();

		/**
		 * The meta object literal for the '<em><b>Encrypt Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENCRYPT_SIGNATURE = eINSTANCE.getDocumentRoot_EncryptSignature();

		/**
		 * The meta object literal for the '<em><b>Endorsing Encrypted Supporting Tokens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS = eINSTANCE.getDocumentRoot_EndorsingEncryptedSupportingTokens();

		/**
		 * The meta object literal for the '<em><b>Endorsing Supporting Tokens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS = eINSTANCE.getDocumentRoot_EndorsingSupportingTokens();

		/**
		 * The meta object literal for the '<em><b>Hash Password</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HASH_PASSWORD = eINSTANCE.getDocumentRoot_HashPassword();

		/**
		 * The meta object literal for the '<em><b>Http Basic Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION = eINSTANCE.getDocumentRoot_HttpBasicAuthentication();

		/**
		 * The meta object literal for the '<em><b>Http Digest Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION = eINSTANCE.getDocumentRoot_HttpDigestAuthentication();

		/**
		 * The meta object literal for the '<em><b>Https Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HTTPS_TOKEN = eINSTANCE.getDocumentRoot_HttpsToken();

		/**
		 * The meta object literal for the '<em><b>Include Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INCLUDE_TIMESTAMP = eINSTANCE.getDocumentRoot_IncludeTimestamp();

		/**
		 * The meta object literal for the '<em><b>Inclusive C14N</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INCLUSIVE_C14N = eINSTANCE.getDocumentRoot_InclusiveC14N();

		/**
		 * The meta object literal for the '<em><b>Initiator Encryption Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN = eINSTANCE.getDocumentRoot_InitiatorEncryptionToken();

		/**
		 * The meta object literal for the '<em><b>Initiator Signature Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN = eINSTANCE.getDocumentRoot_InitiatorSignatureToken();

		/**
		 * The meta object literal for the '<em><b>Initiator Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INITIATOR_TOKEN = eINSTANCE.getDocumentRoot_InitiatorToken();

		/**
		 * The meta object literal for the '<em><b>Issued Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ISSUED_TOKEN = eINSTANCE.getDocumentRoot_IssuedToken();

		/**
		 * The meta object literal for the '<em><b>Kerberos Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KERBEROS_TOKEN = eINSTANCE.getDocumentRoot_KerberosToken();

		/**
		 * The meta object literal for the '<em><b>Key Value Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEY_VALUE_TOKEN = eINSTANCE.getDocumentRoot_KeyValueToken();

		/**
		 * The meta object literal for the '<em><b>Lax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LAX = eINSTANCE.getDocumentRoot_Lax();

		/**
		 * The meta object literal for the '<em><b>Lax Ts First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LAX_TS_FIRST = eINSTANCE.getDocumentRoot_LaxTsFirst();

		/**
		 * The meta object literal for the '<em><b>Lax Ts Last</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LAX_TS_LAST = eINSTANCE.getDocumentRoot_LaxTsLast();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LAYOUT = eINSTANCE.getDocumentRoot_Layout();

		/**
		 * The meta object literal for the '<em><b>Must Not Send Amend</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_NOT_SEND_AMEND = eINSTANCE.getDocumentRoot_MustNotSendAmend();

		/**
		 * The meta object literal for the '<em><b>Must Not Send Cancel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL = eINSTANCE.getDocumentRoot_MustNotSendCancel();

		/**
		 * The meta object literal for the '<em><b>Must Not Send Renew</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_NOT_SEND_RENEW = eINSTANCE.getDocumentRoot_MustNotSendRenew();

		/**
		 * The meta object literal for the '<em><b>Must Support Client Challenge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE = eINSTANCE.getDocumentRoot_MustSupportClientChallenge();

		/**
		 * The meta object literal for the '<em><b>Must Support Issued Tokens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS = eINSTANCE.getDocumentRoot_MustSupportIssuedTokens();

		/**
		 * The meta object literal for the '<em><b>Must Support Ref Embedded Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN = eINSTANCE.getDocumentRoot_MustSupportRefEmbeddedToken();

		/**
		 * The meta object literal for the '<em><b>Must Support Ref Encrypted Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY = eINSTANCE.getDocumentRoot_MustSupportRefEncryptedKey();

		/**
		 * The meta object literal for the '<em><b>Must Support Ref External URI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI = eINSTANCE.getDocumentRoot_MustSupportRefExternalURI();

		/**
		 * The meta object literal for the '<em><b>Must Support Ref Issuer Serial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL = eINSTANCE.getDocumentRoot_MustSupportRefIssuerSerial();

		/**
		 * The meta object literal for the '<em><b>Must Support Ref Key Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER = eINSTANCE.getDocumentRoot_MustSupportRefKeyIdentifier();

		/**
		 * The meta object literal for the '<em><b>Must Support Ref Thumbprint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT = eINSTANCE.getDocumentRoot_MustSupportRefThumbprint();

		/**
		 * The meta object literal for the '<em><b>Must Support Server Challenge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE = eINSTANCE.getDocumentRoot_MustSupportServerChallenge();

		/**
		 * The meta object literal for the '<em><b>No Password</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NO_PASSWORD = eINSTANCE.getDocumentRoot_NoPassword();

		/**
		 * The meta object literal for the '<em><b>Only Sign Entire Headers And Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY = eINSTANCE.getDocumentRoot_OnlySignEntireHeadersAndBody();

		/**
		 * The meta object literal for the '<em><b>Protection Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROTECTION_TOKEN = eINSTANCE.getDocumentRoot_ProtectionToken();

		/**
		 * The meta object literal for the '<em><b>Protect Tokens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROTECT_TOKENS = eINSTANCE.getDocumentRoot_ProtectTokens();

		/**
		 * The meta object literal for the '<em><b>Recipient Encryption Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN = eINSTANCE.getDocumentRoot_RecipientEncryptionToken();

		/**
		 * The meta object literal for the '<em><b>Recipient Signature Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN = eINSTANCE.getDocumentRoot_RecipientSignatureToken();

		/**
		 * The meta object literal for the '<em><b>Recipient Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RECIPIENT_TOKEN = eINSTANCE.getDocumentRoot_RecipientToken();

		/**
		 * The meta object literal for the '<em><b>Rel Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REL_TOKEN = eINSTANCE.getDocumentRoot_RelToken();

		/**
		 * The meta object literal for the '<em><b>Require Appies To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_APPIES_TO = eINSTANCE.getDocumentRoot_RequireAppiesTo();

		/**
		 * The meta object literal for the '<em><b>Require Client Certificate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE = eINSTANCE.getDocumentRoot_RequireClientCertificate();

		/**
		 * The meta object literal for the '<em><b>Require Client Entropy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY = eINSTANCE.getDocumentRoot_RequireClientEntropy();

		/**
		 * The meta object literal for the '<em><b>Required Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRED_ELEMENTS = eINSTANCE.getDocumentRoot_RequiredElements();

		/**
		 * The meta object literal for the '<em><b>Require Derived Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS = eINSTANCE.getDocumentRoot_RequireDerivedKeys();

		/**
		 * The meta object literal for the '<em><b>Require Embedded Token Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE = eINSTANCE.getDocumentRoot_RequireEmbeddedTokenReference();

		/**
		 * The meta object literal for the '<em><b>Require Explicit Derived Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS = eINSTANCE.getDocumentRoot_RequireExplicitDerivedKeys();

		/**
		 * The meta object literal for the '<em><b>Require External Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE = eINSTANCE.getDocumentRoot_RequireExternalReference();

		/**
		 * The meta object literal for the '<em><b>Require External Uri Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE = eINSTANCE.getDocumentRoot_RequireExternalUriReference();

		/**
		 * The meta object literal for the '<em><b>Require Implied Derived Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS = eINSTANCE.getDocumentRoot_RequireImpliedDerivedKeys();

		/**
		 * The meta object literal for the '<em><b>Require Internal Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE = eINSTANCE.getDocumentRoot_RequireInternalReference();

		/**
		 * The meta object literal for the '<em><b>Require Issuer Serial Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE = eINSTANCE.getDocumentRoot_RequireIssuerSerialReference();

		/**
		 * The meta object literal for the '<em><b>Require Key Identifier Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE = eINSTANCE.getDocumentRoot_RequireKeyIdentifierReference();

		/**
		 * The meta object literal for the '<em><b>Require Request Security Token Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION = eINSTANCE.getDocumentRoot_RequireRequestSecurityTokenCollection();

		/**
		 * The meta object literal for the '<em><b>Require Server Entropy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY = eINSTANCE.getDocumentRoot_RequireServerEntropy();

		/**
		 * The meta object literal for the '<em><b>Require Signature Confirmation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION = eINSTANCE.getDocumentRoot_RequireSignatureConfirmation();

		/**
		 * The meta object literal for the '<em><b>Require Thumbprint Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE = eINSTANCE.getDocumentRoot_RequireThumbprintReference();

		/**
		 * The meta object literal for the '<em><b>Rsa Key Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RSA_KEY_VALUE = eINSTANCE.getDocumentRoot_RsaKeyValue();

		/**
		 * The meta object literal for the '<em><b>Saml Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SAML_TOKEN = eINSTANCE.getDocumentRoot_SamlToken();

		/**
		 * The meta object literal for the '<em><b>SC13 Security Context Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN = eINSTANCE.getDocumentRoot_SC13SecurityContextToken();

		/**
		 * The meta object literal for the '<em><b>Secure Conversation Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN = eINSTANCE.getDocumentRoot_SecureConversationToken();

		/**
		 * The meta object literal for the '<em><b>Security Context Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN = eINSTANCE.getDocumentRoot_SecurityContextToken();

		/**
		 * The meta object literal for the '<em><b>Signature Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNATURE_TOKEN = eINSTANCE.getDocumentRoot_SignatureToken();

		/**
		 * The meta object literal for the '<em><b>Signed Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNED_ELEMENTS = eINSTANCE.getDocumentRoot_SignedElements();

		/**
		 * The meta object literal for the '<em><b>Signed Encrypted Supporting Tokens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS = eINSTANCE.getDocumentRoot_SignedEncryptedSupportingTokens();

		/**
		 * The meta object literal for the '<em><b>Signed Endorsing Encrypted Supporting Tokens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS = eINSTANCE.getDocumentRoot_SignedEndorsingEncryptedSupportingTokens();

		/**
		 * The meta object literal for the '<em><b>Signed Endorsing Supporting Tokens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS = eINSTANCE.getDocumentRoot_SignedEndorsingSupportingTokens();

		/**
		 * The meta object literal for the '<em><b>Signed Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNED_PARTS = eINSTANCE.getDocumentRoot_SignedParts();

		/**
		 * The meta object literal for the '<em><b>Signed Supporting Tokens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS = eINSTANCE.getDocumentRoot_SignedSupportingTokens();

		/**
		 * The meta object literal for the '<em><b>SOAP Normalization10</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOAP_NORMALIZATION10 = eINSTANCE.getDocumentRoot_SOAPNormalization10();

		/**
		 * The meta object literal for the '<em><b>Spnego Context Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN = eINSTANCE.getDocumentRoot_SpnegoContextToken();

		/**
		 * The meta object literal for the '<em><b>Strict</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRICT = eINSTANCE.getDocumentRoot_Strict();

		/**
		 * The meta object literal for the '<em><b>STR Transform10</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STR_TRANSFORM10 = eINSTANCE.getDocumentRoot_STRTransform10();

		/**
		 * The meta object literal for the '<em><b>Supporting Tokens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUPPORTING_TOKENS = eINSTANCE.getDocumentRoot_SupportingTokens();

		/**
		 * The meta object literal for the '<em><b>Symmetric Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SYMMETRIC_BINDING = eINSTANCE.getDocumentRoot_SymmetricBinding();

		/**
		 * The meta object literal for the '<em><b>Transport Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSPORT_BINDING = eINSTANCE.getDocumentRoot_TransportBinding();

		/**
		 * The meta object literal for the '<em><b>Transport Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSPORT_TOKEN = eINSTANCE.getDocumentRoot_TransportToken();

		/**
		 * The meta object literal for the '<em><b>Triple Des</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRIPLE_DES = eINSTANCE.getDocumentRoot_TripleDes();

		/**
		 * The meta object literal for the '<em><b>Triple Des Rsa15</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRIPLE_DES_RSA15 = eINSTANCE.getDocumentRoot_TripleDesRsa15();

		/**
		 * The meta object literal for the '<em><b>Triple Des Sha256</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRIPLE_DES_SHA256 = eINSTANCE.getDocumentRoot_TripleDesSha256();

		/**
		 * The meta object literal for the '<em><b>Triple Des Sha256 Rsa15</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15 = eINSTANCE.getDocumentRoot_TripleDesSha256Rsa15();

		/**
		 * The meta object literal for the '<em><b>Trust13</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRUST13 = eINSTANCE.getDocumentRoot_Trust13();

		/**
		 * The meta object literal for the '<em><b>Username Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USERNAME_TOKEN = eINSTANCE.getDocumentRoot_UsernameToken();

		/**
		 * The meta object literal for the '<em><b>Wss10</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS10 = eINSTANCE.getDocumentRoot_Wss10();

		/**
		 * The meta object literal for the '<em><b>Wss11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS11 = eINSTANCE.getDocumentRoot_Wss11();

		/**
		 * The meta object literal for the '<em><b>Wss Gss Kerberos V5 Ap Req Token11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11 = eINSTANCE.getDocumentRoot_WssGssKerberosV5ApReqToken11();

		/**
		 * The meta object literal for the '<em><b>Wss Kerberos V5 Ap Req Token11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11 = eINSTANCE.getDocumentRoot_WssKerberosV5ApReqToken11();

		/**
		 * The meta object literal for the '<em><b>Wss Rel V10 Token10</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_REL_V10_TOKEN10 = eINSTANCE.getDocumentRoot_WssRelV10Token10();

		/**
		 * The meta object literal for the '<em><b>Wss Rel V10 Token11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_REL_V10_TOKEN11 = eINSTANCE.getDocumentRoot_WssRelV10Token11();

		/**
		 * The meta object literal for the '<em><b>Wss Rel V20 Token10</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_REL_V20_TOKEN10 = eINSTANCE.getDocumentRoot_WssRelV20Token10();

		/**
		 * The meta object literal for the '<em><b>Wss Rel V20 Token11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_REL_V20_TOKEN11 = eINSTANCE.getDocumentRoot_WssRelV20Token11();

		/**
		 * The meta object literal for the '<em><b>Wss Saml V11 Token10</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10 = eINSTANCE.getDocumentRoot_WssSamlV11Token10();

		/**
		 * The meta object literal for the '<em><b>Wss Saml V11 Token11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11 = eINSTANCE.getDocumentRoot_WssSamlV11Token11();

		/**
		 * The meta object literal for the '<em><b>Wss Saml V20 Token11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11 = eINSTANCE.getDocumentRoot_WssSamlV20Token11();

		/**
		 * The meta object literal for the '<em><b>Wss Username Token10</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_USERNAME_TOKEN10 = eINSTANCE.getDocumentRoot_WssUsernameToken10();

		/**
		 * The meta object literal for the '<em><b>Wss Username Token11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_USERNAME_TOKEN11 = eINSTANCE.getDocumentRoot_WssUsernameToken11();

		/**
		 * The meta object literal for the '<em><b>Wss X509 Pkcs7 Token10</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10 = eINSTANCE.getDocumentRoot_WssX509Pkcs7Token10();

		/**
		 * The meta object literal for the '<em><b>Wss X509 Pkcs7 Token11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11 = eINSTANCE.getDocumentRoot_WssX509Pkcs7Token11();

		/**
		 * The meta object literal for the '<em><b>Wss X509 Pki Path V1 Token10</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10 = eINSTANCE.getDocumentRoot_WssX509PkiPathV1Token10();

		/**
		 * The meta object literal for the '<em><b>Wss X509 Pki Path V1 Token11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11 = eINSTANCE.getDocumentRoot_WssX509PkiPathV1Token11();

		/**
		 * The meta object literal for the '<em><b>Wss X509V1 Token11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_X509V1_TOKEN11 = eINSTANCE.getDocumentRoot_WssX509V1Token11();

		/**
		 * The meta object literal for the '<em><b>Wss X509V3 Token10</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_X509V3_TOKEN10 = eINSTANCE.getDocumentRoot_WssX509V3Token10();

		/**
		 * The meta object literal for the '<em><b>Wss X509V3 Token11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WSS_X509V3_TOKEN11 = eINSTANCE.getDocumentRoot_WssX509V3Token11();

		/**
		 * The meta object literal for the '<em><b>X509 Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__X509_TOKEN = eINSTANCE.getDocumentRoot_X509Token();

		/**
		 * The meta object literal for the '<em><b>XPath10</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XPATH10 = eINSTANCE.getDocumentRoot_XPath10();

		/**
		 * The meta object literal for the '<em><b>XPath Filter20</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XPATH_FILTER20 = eINSTANCE.getDocumentRoot_XPathFilter20();

		/**
		 * The meta object literal for the '<em><b>Include Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INCLUDE_TOKEN = eINSTANCE.getDocumentRoot_IncludeToken();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.EmptyTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getEmptyType()
		 * @generated
		 */
		EClass EMPTY_TYPE = eINSTANCE.getEmptyType();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.HeaderTypeImpl <em>Header Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.HeaderTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getHeaderType()
		 * @generated
		 */
		EClass HEADER_TYPE = eINSTANCE.getHeaderType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__NAME = eINSTANCE.getHeaderType_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__NAMESPACE = eINSTANCE.getHeaderType_Namespace();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__ANY_ATTRIBUTE = eINSTANCE.getHeaderType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.IssuedTokenTypeImpl <em>Issued Token Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.IssuedTokenTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getIssuedTokenType()
		 * @generated
		 */
		EClass ISSUED_TOKEN_TYPE = eINSTANCE.getIssuedTokenType();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUED_TOKEN_TYPE__ISSUER = eINSTANCE.getIssuedTokenType_Issuer();

		/**
		 * The meta object literal for the '<em><b>Issuer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUED_TOKEN_TYPE__ISSUER_NAME = eINSTANCE.getIssuedTokenType_IssuerName();

		/**
		 * The meta object literal for the '<em><b>Request Security Token Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUED_TOKEN_TYPE__REQUEST_SECURITY_TOKEN_TEMPLATE = eINSTANCE.getIssuedTokenType_RequestSecurityTokenTemplate();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUED_TOKEN_TYPE__ANY = eINSTANCE.getIssuedTokenType_Any();

		/**
		 * The meta object literal for the '<em><b>Include Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUED_TOKEN_TYPE__INCLUDE_TOKEN = eINSTANCE.getIssuedTokenType_IncludeToken();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUED_TOKEN_TYPE__ANY_ATTRIBUTE = eINSTANCE.getIssuedTokenType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.KeyValueTokenTypeImpl <em>Key Value Token Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.KeyValueTokenTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getKeyValueTokenType()
		 * @generated
		 */
		EClass KEY_VALUE_TOKEN_TYPE = eINSTANCE.getKeyValueTokenType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_TOKEN_TYPE__ANY = eINSTANCE.getKeyValueTokenType_Any();

		/**
		 * The meta object literal for the '<em><b>Include Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_TOKEN_TYPE__INCLUDE_TOKEN = eINSTANCE.getKeyValueTokenType_IncludeToken();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_TOKEN_TYPE__ANY_ATTRIBUTE = eINSTANCE.getKeyValueTokenType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.NestedPolicyTypeImpl <em>Nested Policy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.NestedPolicyTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getNestedPolicyType()
		 * @generated
		 */
		EClass NESTED_POLICY_TYPE = eINSTANCE.getNestedPolicyType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_POLICY_TYPE__ANY = eINSTANCE.getNestedPolicyType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_POLICY_TYPE__ANY_ATTRIBUTE = eINSTANCE.getNestedPolicyType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.QNameAssertionTypeImpl <em>QName Assertion Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.QNameAssertionTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getQNameAssertionType()
		 * @generated
		 */
		EClass QNAME_ASSERTION_TYPE = eINSTANCE.getQNameAssertionType();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QNAME_ASSERTION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getQNameAssertionType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.RequestSecurityTokenTemplateTypeImpl <em>Request Security Token Template Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.RequestSecurityTokenTemplateTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getRequestSecurityTokenTemplateType()
		 * @generated
		 */
		EClass REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE = eINSTANCE.getRequestSecurityTokenTemplateType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE__ANY = eINSTANCE.getRequestSecurityTokenTemplateType_Any();

		/**
		 * The meta object literal for the '<em><b>Trust Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE__TRUST_VERSION = eINSTANCE.getRequestSecurityTokenTemplateType_TrustVersion();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getRequestSecurityTokenTemplateType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SecureConversationTokenTypeImpl <em>Secure Conversation Token Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SecureConversationTokenTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getSecureConversationTokenType()
		 * @generated
		 */
		EClass SECURE_CONVERSATION_TOKEN_TYPE = eINSTANCE.getSecureConversationTokenType();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURE_CONVERSATION_TOKEN_TYPE__ISSUER = eINSTANCE.getSecureConversationTokenType_Issuer();

		/**
		 * The meta object literal for the '<em><b>Issuer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURE_CONVERSATION_TOKEN_TYPE__ISSUER_NAME = eINSTANCE.getSecureConversationTokenType_IssuerName();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURE_CONVERSATION_TOKEN_TYPE__ANY = eINSTANCE.getSecureConversationTokenType_Any();

		/**
		 * The meta object literal for the '<em><b>Include Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURE_CONVERSATION_TOKEN_TYPE__INCLUDE_TOKEN = eINSTANCE.getSecureConversationTokenType_IncludeToken();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURE_CONVERSATION_TOKEN_TYPE__ANY_ATTRIBUTE = eINSTANCE.getSecureConversationTokenType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SePartsTypeImpl <em>Se Parts Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SePartsTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getSePartsType()
		 * @generated
		 */
		EClass SE_PARTS_TYPE = eINSTANCE.getSePartsType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_PARTS_TYPE__BODY = eINSTANCE.getSePartsType_Body();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_PARTS_TYPE__HEADER = eINSTANCE.getSePartsType_Header();

		/**
		 * The meta object literal for the '<em><b>Attachments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_PARTS_TYPE__ATTACHMENTS = eINSTANCE.getSePartsType_Attachments();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SE_PARTS_TYPE__ANY = eINSTANCE.getSePartsType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SE_PARTS_TYPE__ANY_ATTRIBUTE = eINSTANCE.getSePartsType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SerElementsTypeImpl <em>Ser Elements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SerElementsTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getSerElementsType()
		 * @generated
		 */
		EClass SER_ELEMENTS_TYPE = eINSTANCE.getSerElementsType();

		/**
		 * The meta object literal for the '<em><b>XPath</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SER_ELEMENTS_TYPE__XPATH = eINSTANCE.getSerElementsType_XPath();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SER_ELEMENTS_TYPE__ANY = eINSTANCE.getSerElementsType_Any();

		/**
		 * The meta object literal for the '<em><b>XPath Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SER_ELEMENTS_TYPE__XPATH_VERSION = eINSTANCE.getSerElementsType_XPathVersion();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SER_ELEMENTS_TYPE__ANY_ATTRIBUTE = eINSTANCE.getSerElementsType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SpnegoContextTokenTypeImpl <em>Spnego Context Token Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.SpnegoContextTokenTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getSpnegoContextTokenType()
		 * @generated
		 */
		EClass SPNEGO_CONTEXT_TOKEN_TYPE = eINSTANCE.getSpnegoContextTokenType();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPNEGO_CONTEXT_TOKEN_TYPE__ISSUER = eINSTANCE.getSpnegoContextTokenType_Issuer();

		/**
		 * The meta object literal for the '<em><b>Issuer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPNEGO_CONTEXT_TOKEN_TYPE__ISSUER_NAME = eINSTANCE.getSpnegoContextTokenType_IssuerName();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPNEGO_CONTEXT_TOKEN_TYPE__ANY = eINSTANCE.getSpnegoContextTokenType_Any();

		/**
		 * The meta object literal for the '<em><b>Include Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPNEGO_CONTEXT_TOKEN_TYPE__INCLUDE_TOKEN = eINSTANCE.getSpnegoContextTokenType_IncludeToken();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPNEGO_CONTEXT_TOKEN_TYPE__ANY_ATTRIBUTE = eINSTANCE.getSpnegoContextTokenType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.TokenAssertionTypeImpl <em>Token Assertion Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl.TokenAssertionTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getTokenAssertionType()
		 * @generated
		 */
		EClass TOKEN_ASSERTION_TYPE = eINSTANCE.getTokenAssertionType();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_ASSERTION_TYPE__ISSUER = eINSTANCE.getTokenAssertionType_Issuer();

		/**
		 * The meta object literal for the '<em><b>Issuer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_ASSERTION_TYPE__ISSUER_NAME = eINSTANCE.getTokenAssertionType_IssuerName();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_ASSERTION_TYPE__ANY = eINSTANCE.getTokenAssertionType_Any();

		/**
		 * The meta object literal for the '<em><b>Include Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_ASSERTION_TYPE__INCLUDE_TOKEN = eINSTANCE.getTokenAssertionType_IncludeToken();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_ASSERTION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getTokenAssertionType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType <em>Include Token Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getIncludeTokenType()
		 * @generated
		 */
		EEnum INCLUDE_TOKEN_TYPE = eINSTANCE.getIncludeTokenType();

		/**
		 * The meta object literal for the '<em>Include Token Open Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getIncludeTokenOpenType()
		 * @generated
		 */
		EDataType INCLUDE_TOKEN_OPEN_TYPE = eINSTANCE.getIncludeTokenOpenType();

		/**
		 * The meta object literal for the '<em>Include Token Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType
		 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl#getIncludeTokenTypeObject()
		 * @generated
		 */
		EDataType INCLUDE_TOKEN_TYPE_OBJECT = eINSTANCE.getIncludeTokenTypeObject();

	}

} //_200702Package
