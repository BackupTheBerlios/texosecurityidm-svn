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
 * <!-- begin-model-doc -->
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Factory
 * @model kind="package"
 * @generated
 */
public interface _200512Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wstrust";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wst";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_200512Package eINSTANCE = org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.AllowPostdatingTypeImpl <em>Allow Postdating Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.AllowPostdatingTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getAllowPostdatingType()
	 * @generated
	 */
	int ALLOW_POSTDATING_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Allow Postdating Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_POSTDATING_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.AuthenticatorTypeImpl <em>Authenticator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.AuthenticatorTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getAuthenticatorType()
	 * @generated
	 */
	int AUTHENTICATOR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Combined Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR_TYPE__COMBINED_HASH = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR_TYPE__ANY = 1;

	/**
	 * The number of structural features of the '<em>Authenticator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.BinaryExchangeTypeImpl <em>Binary Exchange Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.BinaryExchangeTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getBinaryExchangeType()
	 * @generated
	 */
	int BINARY_EXCHANGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXCHANGE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Encoding Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXCHANGE_TYPE__ENCODING_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXCHANGE_TYPE__VALUE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXCHANGE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Binary Exchange Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXCHANGE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.BinarySecretTypeImpl <em>Binary Secret Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.BinarySecretTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getBinarySecretType()
	 * @generated
	 */
	int BINARY_SECRET_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SECRET_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SECRET_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SECRET_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Binary Secret Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SECRET_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.CancelTargetTypeImpl <em>Cancel Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.CancelTargetTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getCancelTargetType()
	 * @generated
	 */
	int CANCEL_TARGET_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TARGET_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Cancel Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TARGET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ClaimsTypeImpl <em>Claims Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ClaimsTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getClaimsType()
	 * @generated
	 */
	int CLAIMS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIMS_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIMS_TYPE__DIALECT = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIMS_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Claims Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIMS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DelegateToTypeImpl <em>Delegate To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DelegateToTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getDelegateToType()
	 * @generated
	 */
	int DELEGATE_TO_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_TO_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Delegate To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_TO_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

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
	 * The feature id for the '<em><b>Allow Postdating</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALLOW_POSTDATING = 3;

	/**
	 * The feature id for the '<em><b>Authentication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHENTICATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHENTICATOR = 5;

	/**
	 * The feature id for the '<em><b>Binary Exchange</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINARY_EXCHANGE = 6;

	/**
	 * The feature id for the '<em><b>Binary Secret</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINARY_SECRET = 7;

	/**
	 * The feature id for the '<em><b>Cancel Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CANCEL_TARGET = 8;

	/**
	 * The feature id for the '<em><b>Canonicalization Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CANONICALIZATION_ALGORITHM = 9;

	/**
	 * The feature id for the '<em><b>Challenge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHALLENGE = 10;

	/**
	 * The feature id for the '<em><b>Claims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLAIMS = 11;

	/**
	 * The feature id for the '<em><b>Combined Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMBINED_HASH = 12;

	/**
	 * The feature id for the '<em><b>Computed Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPUTED_KEY = 13;

	/**
	 * The feature id for the '<em><b>Computed Key Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPUTED_KEY_ALGORITHM = 14;

	/**
	 * The feature id for the '<em><b>Delegatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELEGATABLE = 15;

	/**
	 * The feature id for the '<em><b>Delegate To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELEGATE_TO = 16;

	/**
	 * The feature id for the '<em><b>Encryption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTION = 17;

	/**
	 * The feature id for the '<em><b>Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTION_ALGORITHM = 18;

	/**
	 * The feature id for the '<em><b>Encrypt With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPT_WITH = 19;

	/**
	 * The feature id for the '<em><b>Entropy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTROPY = 20;

	/**
	 * The feature id for the '<em><b>Forwardable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORWARDABLE = 21;

	/**
	 * The feature id for the '<em><b>Issued Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISSUED_TOKENS = 22;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISSUER = 23;

	/**
	 * The feature id for the '<em><b>Key Exchange Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN = 24;

	/**
	 * The feature id for the '<em><b>Key Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_SIZE = 25;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Key Wrap Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_WRAP_ALGORITHM = 27;

	/**
	 * The feature id for the '<em><b>Lifetime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIFETIME = 28;

	/**
	 * The feature id for the '<em><b>On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ON_BEHALF_OF = 29;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARTICIPANTS = 30;

	/**
	 * The feature id for the '<em><b>Proof Encryption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROOF_ENCRYPTION = 31;

	/**
	 * The feature id for the '<em><b>Renewing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RENEWING = 32;

	/**
	 * The feature id for the '<em><b>Renew Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RENEW_TARGET = 33;

	/**
	 * The feature id for the '<em><b>Requested Attached Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE = 34;

	/**
	 * The feature id for the '<em><b>Requested Proof Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN = 35;

	/**
	 * The feature id for the '<em><b>Requested Security Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN = 36;

	/**
	 * The feature id for the '<em><b>Requested Token Cancelled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED = 37;

	/**
	 * The feature id for the '<em><b>Requested Unattached Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE = 38;

	/**
	 * The feature id for the '<em><b>Request KET</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUEST_KET = 39;

	/**
	 * The feature id for the '<em><b>Request Security Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN = 40;

	/**
	 * The feature id for the '<em><b>Request Security Token Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION = 41;

	/**
	 * The feature id for the '<em><b>Request Security Token Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE = 42;

	/**
	 * The feature id for the '<em><b>Request Security Token Response Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION = 43;

	/**
	 * The feature id for the '<em><b>Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUEST_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE_ALGORITHM = 45;

	/**
	 * The feature id for the '<em><b>Sign Challenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGN_CHALLENGE = 46;

	/**
	 * The feature id for the '<em><b>Sign Challenge Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE = 47;

	/**
	 * The feature id for the '<em><b>Sign With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGN_WITH = 48;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATUS = 49;

	/**
	 * The feature id for the '<em><b>Token Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOKEN_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Use Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE_KEY = 51;

	/**
	 * The feature id for the '<em><b>Validate Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATE_TARGET = 52;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 53;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.EncryptionTypeImpl <em>Encryption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.EncryptionTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getEncryptionType()
	 * @generated
	 */
	int ENCRYPTION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Encryption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.EntropyTypeImpl <em>Entropy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.EntropyTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getEntropyType()
	 * @generated
	 */
	int ENTROPY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTROPY_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTROPY_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Entropy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTROPY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.KeyExchangeTokenTypeImpl <em>Key Exchange Token Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.KeyExchangeTokenTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getKeyExchangeTokenType()
	 * @generated
	 */
	int KEY_EXCHANGE_TOKEN_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EXCHANGE_TOKEN_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Key Exchange Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EXCHANGE_TOKEN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.LifetimeTypeImpl <em>Lifetime Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.LifetimeTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getLifetimeType()
	 * @generated
	 */
	int LIFETIME_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFETIME_TYPE__CREATED = 0;

	/**
	 * The feature id for the '<em><b>Expires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFETIME_TYPE__EXPIRES = 1;

	/**
	 * The number of structural features of the '<em>Lifetime Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFETIME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.OnBehalfOfTypeImpl <em>On Behalf Of Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.OnBehalfOfTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getOnBehalfOfType()
	 * @generated
	 */
	int ON_BEHALF_OF_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_BEHALF_OF_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>On Behalf Of Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_BEHALF_OF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ParticipantsTypeImpl <em>Participants Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ParticipantsTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getParticipantsType()
	 * @generated
	 */
	int PARTICIPANTS_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANTS_TYPE__PRIMARY = 0;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANTS_TYPE__PARTICIPANT = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANTS_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>Participants Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ParticipantTypeImpl <em>Participant Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ParticipantTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getParticipantType()
	 * @generated
	 */
	int PARTICIPANT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Participant Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ProofEncryptionTypeImpl <em>Proof Encryption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ProofEncryptionTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getProofEncryptionType()
	 * @generated
	 */
	int PROOF_ENCRYPTION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ENCRYPTION_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Proof Encryption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ENCRYPTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RenewingTypeImpl <em>Renewing Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RenewingTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRenewingType()
	 * @generated
	 */
	int RENEWING_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Allow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWING_TYPE__ALLOW = 0;

	/**
	 * The feature id for the '<em><b>OK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWING_TYPE__OK = 1;

	/**
	 * The number of structural features of the '<em>Renewing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RenewTargetTypeImpl <em>Renew Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RenewTargetTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRenewTargetType()
	 * @generated
	 */
	int RENEW_TARGET_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEW_TARGET_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Renew Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEW_TARGET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedProofTokenTypeImpl <em>Requested Proof Token Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedProofTokenTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestedProofTokenType()
	 * @generated
	 */
	int REQUESTED_PROOF_TOKEN_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_PROOF_TOKEN_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Requested Proof Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_PROOF_TOKEN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedReferenceTypeImpl <em>Requested Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedReferenceTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestedReferenceType()
	 * @generated
	 */
	int REQUESTED_REFERENCE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Security Token Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Requested Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_REFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedSecurityTokenTypeImpl <em>Requested Security Token Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedSecurityTokenTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestedSecurityTokenType()
	 * @generated
	 */
	int REQUESTED_SECURITY_TOKEN_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SECURITY_TOKEN_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Requested Security Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SECURITY_TOKEN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedTokenCancelledTypeImpl <em>Requested Token Cancelled Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedTokenCancelledTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestedTokenCancelledType()
	 * @generated
	 */
	int REQUESTED_TOKEN_CANCELLED_TYPE = 21;

	/**
	 * The number of structural features of the '<em>Requested Token Cancelled Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_TOKEN_CANCELLED_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestKETTypeImpl <em>Request KET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestKETTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestKETType()
	 * @generated
	 */
	int REQUEST_KET_TYPE = 22;

	/**
	 * The number of structural features of the '<em>Request KET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_KET_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenCollectionTypeImpl <em>Request Security Token Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenCollectionTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestSecurityTokenCollectionType()
	 * @generated
	 */
	int REQUEST_SECURITY_TOKEN_COLLECTION_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Request Security Token</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN = 0;

	/**
	 * The number of structural features of the '<em>Request Security Token Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_COLLECTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenResponseCollectionTypeImpl <em>Request Security Token Response Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenResponseCollectionTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestSecurityTokenResponseCollectionType()
	 * @generated
	 */
	int REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Request Security Token Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN_RESPONSE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Request Security Token Response Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenResponseTypeImpl <em>Request Security Token Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenResponseTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestSecurityTokenResponseType()
	 * @generated
	 */
	int REQUEST_SECURITY_TOKEN_RESPONSE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_RESPONSE_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_RESPONSE_TYPE__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_RESPONSE_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Request Security Token Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_RESPONSE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenTypeImpl <em>Request Security Token Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestSecurityTokenType()
	 * @generated
	 */
	int REQUEST_SECURITY_TOKEN_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_TYPE__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Request Security Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SECURITY_TOKEN_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.SignChallengeTypeImpl <em>Sign Challenge Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.SignChallengeTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getSignChallengeType()
	 * @generated
	 */
	int SIGN_CHALLENGE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Challenge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_CHALLENGE_TYPE__CHALLENGE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_CHALLENGE_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_CHALLENGE_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Sign Challenge Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_CHALLENGE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.StatusTypeImpl <em>Status Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.StatusTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__REASON = 1;

	/**
	 * The number of structural features of the '<em>Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.UseKeyTypeImpl <em>Use Key Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.UseKeyTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getUseKeyType()
	 * @generated
	 */
	int USE_KEY_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_KEY_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Sig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_KEY_TYPE__SIG = 1;

	/**
	 * The number of structural features of the '<em>Use Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_KEY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ValidateTargetTypeImpl <em>Validate Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ValidateTargetTypeImpl
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getValidateTargetType()
	 * @generated
	 */
	int VALIDATE_TARGET_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_TARGET_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Validate Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_TARGET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum <em>Binary Secret Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getBinarySecretTypeEnum()
	 * @generated
	 */
	int BINARY_SECRET_TYPE_ENUM = 31;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum <em>Computed Key Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getComputedKeyEnum()
	 * @generated
	 */
	int COMPUTED_KEY_ENUM = 32;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum <em>Key Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getKeyTypeEnum()
	 * @generated
	 */
	int KEY_TYPE_ENUM = 33;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum <em>Request Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestTypeEnum()
	 * @generated
	 */
	int REQUEST_TYPE_ENUM = 34;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum <em>Status Code Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getStatusCodeEnum()
	 * @generated
	 */
	int STATUS_CODE_ENUM = 35;

	/**
	 * The meta object id for the '<em>Binary Secret Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getBinarySecretTypeEnumObject()
	 * @generated
	 */
	int BINARY_SECRET_TYPE_ENUM_OBJECT = 36;

	/**
	 * The meta object id for the '<em>Binary Secret Type Open Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getBinarySecretTypeOpenEnum()
	 * @generated
	 */
	int BINARY_SECRET_TYPE_OPEN_ENUM = 37;

	/**
	 * The meta object id for the '<em>Computed Key Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getComputedKeyEnumObject()
	 * @generated
	 */
	int COMPUTED_KEY_ENUM_OBJECT = 38;

	/**
	 * The meta object id for the '<em>Computed Key Open Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getComputedKeyOpenEnum()
	 * @generated
	 */
	int COMPUTED_KEY_OPEN_ENUM = 39;

	/**
	 * The meta object id for the '<em>Key Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getKeyTypeEnumObject()
	 * @generated
	 */
	int KEY_TYPE_ENUM_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Key Type Open Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getKeyTypeOpenEnum()
	 * @generated
	 */
	int KEY_TYPE_OPEN_ENUM = 41;

	/**
	 * The meta object id for the '<em>Request Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestTypeEnumObject()
	 * @generated
	 */
	int REQUEST_TYPE_ENUM_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Request Type Open Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestTypeOpenEnum()
	 * @generated
	 */
	int REQUEST_TYPE_OPEN_ENUM = 43;

	/**
	 * The meta object id for the '<em>Status Code Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getStatusCodeEnumObject()
	 * @generated
	 */
	int STATUS_CODE_ENUM_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Status Code Open Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getStatusCodeOpenEnum()
	 * @generated
	 */
	int STATUS_CODE_OPEN_ENUM = 45;


	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.AllowPostdatingType <em>Allow Postdating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allow Postdating Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.AllowPostdatingType
	 * @generated
	 */
	EClass getAllowPostdatingType();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType <em>Authenticator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authenticator Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType
	 * @generated
	 */
	EClass getAuthenticatorType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType#getCombinedHash <em>Combined Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combined Hash</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType#getCombinedHash()
	 * @see #getAuthenticatorType()
	 * @generated
	 */
	EAttribute getAuthenticatorType_CombinedHash();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType#getAny()
	 * @see #getAuthenticatorType()
	 * @generated
	 */
	EAttribute getAuthenticatorType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType <em>Binary Exchange Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Exchange Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType
	 * @generated
	 */
	EClass getBinaryExchangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType#getValue()
	 * @see #getBinaryExchangeType()
	 * @generated
	 */
	EAttribute getBinaryExchangeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType#getEncodingType <em>Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType#getEncodingType()
	 * @see #getBinaryExchangeType()
	 * @generated
	 */
	EAttribute getBinaryExchangeType_EncodingType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType#getValueType()
	 * @see #getBinaryExchangeType()
	 * @generated
	 */
	EAttribute getBinaryExchangeType_ValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType#getAnyAttribute()
	 * @see #getBinaryExchangeType()
	 * @generated
	 */
	EAttribute getBinaryExchangeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType <em>Binary Secret Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Secret Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType
	 * @generated
	 */
	EClass getBinarySecretType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType#getValue()
	 * @see #getBinarySecretType()
	 * @generated
	 */
	EAttribute getBinarySecretType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType#getType()
	 * @see #getBinarySecretType()
	 * @generated
	 */
	EAttribute getBinarySecretType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType#getAnyAttribute()
	 * @see #getBinarySecretType()
	 * @generated
	 */
	EAttribute getBinarySecretType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.CancelTargetType <em>Cancel Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel Target Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.CancelTargetType
	 * @generated
	 */
	EClass getCancelTargetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.CancelTargetType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.CancelTargetType#getAny()
	 * @see #getCancelTargetType()
	 * @generated
	 */
	EAttribute getCancelTargetType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType <em>Claims Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claims Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType
	 * @generated
	 */
	EClass getClaimsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType#getAny()
	 * @see #getClaimsType()
	 * @generated
	 */
	EAttribute getClaimsType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType#getDialect <em>Dialect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialect</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType#getDialect()
	 * @see #getClaimsType()
	 * @generated
	 */
	EAttribute getClaimsType_Dialect();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType#getAnyAttribute()
	 * @see #getClaimsType()
	 * @generated
	 */
	EAttribute getClaimsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DelegateToType <em>Delegate To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegate To Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DelegateToType
	 * @generated
	 */
	EClass getDelegateToType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DelegateToType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DelegateToType#getAny()
	 * @see #getDelegateToType()
	 * @generated
	 */
	EAttribute getDelegateToType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAllowPostdating <em>Allow Postdating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allow Postdating</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAllowPostdating()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AllowPostdating();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAuthenticationType <em>Authentication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAuthenticationType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AuthenticationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAuthenticator <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authenticator</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getAuthenticator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Authenticator();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getBinaryExchange <em>Binary Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary Exchange</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getBinaryExchange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BinaryExchange();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getBinarySecret <em>Binary Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary Secret</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getBinarySecret()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BinarySecret();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCancelTarget <em>Cancel Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancel Target</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCancelTarget()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CancelTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCanonicalizationAlgorithm <em>Canonicalization Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canonicalization Algorithm</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCanonicalizationAlgorithm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CanonicalizationAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getChallenge <em>Challenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Challenge</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getChallenge()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Challenge();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getClaims <em>Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Claims</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getClaims()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Claims();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCombinedHash <em>Combined Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combined Hash</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getCombinedHash()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CombinedHash();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getComputedKey <em>Computed Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computed Key</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getComputedKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ComputedKey();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getComputedKeyAlgorithm <em>Computed Key Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computed Key Algorithm</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getComputedKeyAlgorithm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ComputedKeyAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#isDelegatable <em>Delegatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegatable</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#isDelegatable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Delegatable();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getDelegateTo <em>Delegate To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate To</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getDelegateTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DelegateTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryption <em>Encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encryption</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryption()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Encryption();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryptionAlgorithm <em>Encryption Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption Algorithm</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryptionAlgorithm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EncryptionAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryptWith <em>Encrypt With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypt With</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEncryptWith()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EncryptWith();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEntropy <em>Entropy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entropy</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getEntropy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Entropy();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#isForwardable <em>Forwardable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forwardable</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#isForwardable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Forwardable();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getIssuedTokens <em>Issued Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issued Tokens</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getIssuedTokens()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IssuedTokens();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issuer</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getIssuer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Issuer();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyExchangeToken <em>Key Exchange Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Exchange Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyExchangeToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KeyExchangeToken();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeySize <em>Key Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Size</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeySize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_KeySize();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_KeyType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyWrapAlgorithm <em>Key Wrap Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Wrap Algorithm</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getKeyWrapAlgorithm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_KeyWrapAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getLifetime <em>Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifetime</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getLifetime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Lifetime();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getOnBehalfOf <em>On Behalf Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Behalf Of</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getOnBehalfOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OnBehalfOf();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participants</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getParticipants()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Participants();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getProofEncryption <em>Proof Encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Proof Encryption</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getProofEncryption()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProofEncryption();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRenewing <em>Renewing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Renewing</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRenewing()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Renewing();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRenewTarget <em>Renew Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Renew Target</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRenewTarget()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RenewTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedAttachedReference <em>Requested Attached Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requested Attached Reference</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedAttachedReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestedAttachedReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedProofToken <em>Requested Proof Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requested Proof Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedProofToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestedProofToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedSecurityToken <em>Requested Security Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requested Security Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedSecurityToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestedSecurityToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedTokenCancelled <em>Requested Token Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requested Token Cancelled</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedTokenCancelled()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestedTokenCancelled();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedUnattachedReference <em>Requested Unattached Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requested Unattached Reference</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestedUnattachedReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestedUnattachedReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestKET <em>Request KET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request KET</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestKET()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestKET();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityToken <em>Request Security Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Security Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestSecurityToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenCollection <em>Request Security Token Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Security Token Collection</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestSecurityTokenCollection();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenResponse <em>Request Security Token Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Security Token Response</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestSecurityTokenResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenResponseCollection <em>Request Security Token Response Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Security Token Response Collection</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestSecurityTokenResponseCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestSecurityTokenResponseCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getRequestType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RequestType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignatureAlgorithm <em>Signature Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature Algorithm</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignatureAlgorithm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SignatureAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignChallenge <em>Sign Challenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sign Challenge</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignChallenge()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignChallenge();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignChallengeResponse <em>Sign Challenge Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sign Challenge Response</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignChallengeResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignChallengeResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignWith <em>Sign With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign With</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getSignWith()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SignWith();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getStatus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getTokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getTokenType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TokenType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getUseKey <em>Use Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use Key</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getUseKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UseKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getValidateTarget <em>Validate Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate Target</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot#getValidateTarget()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValidateTarget();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.EncryptionType <em>Encryption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encryption Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.EncryptionType
	 * @generated
	 */
	EClass getEncryptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.EncryptionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.EncryptionType#getAny()
	 * @see #getEncryptionType()
	 * @generated
	 */
	EAttribute getEncryptionType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.EntropyType <em>Entropy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entropy Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.EntropyType
	 * @generated
	 */
	EClass getEntropyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.EntropyType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.EntropyType#getAny()
	 * @see #getEntropyType()
	 * @generated
	 */
	EAttribute getEntropyType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.EntropyType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.EntropyType#getAnyAttribute()
	 * @see #getEntropyType()
	 * @generated
	 */
	EAttribute getEntropyType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyExchangeTokenType <em>Key Exchange Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Exchange Token Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyExchangeTokenType
	 * @generated
	 */
	EClass getKeyExchangeTokenType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyExchangeTokenType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyExchangeTokenType#getAny()
	 * @see #getKeyExchangeTokenType()
	 * @generated
	 */
	EAttribute getKeyExchangeTokenType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType <em>Lifetime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifetime Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType
	 * @generated
	 */
	EClass getLifetimeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Created</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType#getCreated()
	 * @see #getLifetimeType()
	 * @generated
	 */
	EReference getLifetimeType_Created();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType#getExpires <em>Expires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expires</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType#getExpires()
	 * @see #getLifetimeType()
	 * @generated
	 */
	EReference getLifetimeType_Expires();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.OnBehalfOfType <em>On Behalf Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Behalf Of Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.OnBehalfOfType
	 * @generated
	 */
	EClass getOnBehalfOfType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.OnBehalfOfType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.OnBehalfOfType#getAny()
	 * @see #getOnBehalfOfType()
	 * @generated
	 */
	EAttribute getOnBehalfOfType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType <em>Participants Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participants Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType
	 * @generated
	 */
	EClass getParticipantsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType#getPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType#getPrimary()
	 * @see #getParticipantsType()
	 * @generated
	 */
	EReference getParticipantsType_Primary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType#getParticipant()
	 * @see #getParticipantsType()
	 * @generated
	 */
	EReference getParticipantsType_Participant();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType#getAny()
	 * @see #getParticipantsType()
	 * @generated
	 */
	EAttribute getParticipantsType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantType <em>Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantType
	 * @generated
	 */
	EClass getParticipantType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantType#getAny()
	 * @see #getParticipantType()
	 * @generated
	 */
	EAttribute getParticipantType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ProofEncryptionType <em>Proof Encryption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proof Encryption Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ProofEncryptionType
	 * @generated
	 */
	EClass getProofEncryptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ProofEncryptionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ProofEncryptionType#getAny()
	 * @see #getProofEncryptionType()
	 * @generated
	 */
	EAttribute getProofEncryptionType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType <em>Renewing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renewing Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType
	 * @generated
	 */
	EClass getRenewingType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isAllow <em>Allow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isAllow()
	 * @see #getRenewingType()
	 * @generated
	 */
	EAttribute getRenewingType_Allow();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isOK <em>OK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OK</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isOK()
	 * @see #getRenewingType()
	 * @generated
	 */
	EAttribute getRenewingType_OK();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewTargetType <em>Renew Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renew Target Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewTargetType
	 * @generated
	 */
	EClass getRenewTargetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewTargetType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewTargetType#getAny()
	 * @see #getRenewTargetType()
	 * @generated
	 */
	EAttribute getRenewTargetType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedProofTokenType <em>Requested Proof Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requested Proof Token Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedProofTokenType
	 * @generated
	 */
	EClass getRequestedProofTokenType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedProofTokenType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedProofTokenType#getAny()
	 * @see #getRequestedProofTokenType()
	 * @generated
	 */
	EAttribute getRequestedProofTokenType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedReferenceType <em>Requested Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requested Reference Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedReferenceType
	 * @generated
	 */
	EClass getRequestedReferenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedReferenceType#getSecurityTokenReference <em>Security Token Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Token Reference</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedReferenceType#getSecurityTokenReference()
	 * @see #getRequestedReferenceType()
	 * @generated
	 */
	EReference getRequestedReferenceType_SecurityTokenReference();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedSecurityTokenType <em>Requested Security Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requested Security Token Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedSecurityTokenType
	 * @generated
	 */
	EClass getRequestedSecurityTokenType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedSecurityTokenType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedSecurityTokenType#getAny()
	 * @see #getRequestedSecurityTokenType()
	 * @generated
	 */
	EAttribute getRequestedSecurityTokenType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedTokenCancelledType <em>Requested Token Cancelled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requested Token Cancelled Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedTokenCancelledType
	 * @generated
	 */
	EClass getRequestedTokenCancelledType();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestKETType <em>Request KET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request KET Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestKETType
	 * @generated
	 */
	EClass getRequestKETType();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenCollectionType <em>Request Security Token Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Security Token Collection Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenCollectionType
	 * @generated
	 */
	EClass getRequestSecurityTokenCollectionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenCollectionType#getRequestSecurityToken <em>Request Security Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Security Token</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenCollectionType#getRequestSecurityToken()
	 * @see #getRequestSecurityTokenCollectionType()
	 * @generated
	 */
	EReference getRequestSecurityTokenCollectionType_RequestSecurityToken();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType <em>Request Security Token Response Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Security Token Response Collection Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType
	 * @generated
	 */
	EClass getRequestSecurityTokenResponseCollectionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType#getRequestSecurityTokenResponse <em>Request Security Token Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Security Token Response</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType#getRequestSecurityTokenResponse()
	 * @see #getRequestSecurityTokenResponseCollectionType()
	 * @generated
	 */
	EReference getRequestSecurityTokenResponseCollectionType_RequestSecurityTokenResponse();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType#getAnyAttribute()
	 * @see #getRequestSecurityTokenResponseCollectionType()
	 * @generated
	 */
	EAttribute getRequestSecurityTokenResponseCollectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType <em>Request Security Token Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Security Token Response Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType
	 * @generated
	 */
	EClass getRequestSecurityTokenResponseType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType#getAny()
	 * @see #getRequestSecurityTokenResponseType()
	 * @generated
	 */
	EAttribute getRequestSecurityTokenResponseType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType#getContext()
	 * @see #getRequestSecurityTokenResponseType()
	 * @generated
	 */
	EAttribute getRequestSecurityTokenResponseType_Context();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType#getAnyAttribute()
	 * @see #getRequestSecurityTokenResponseType()
	 * @generated
	 */
	EAttribute getRequestSecurityTokenResponseType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType <em>Request Security Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Security Token Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType
	 * @generated
	 */
	EClass getRequestSecurityTokenType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType#getAny()
	 * @see #getRequestSecurityTokenType()
	 * @generated
	 */
	EAttribute getRequestSecurityTokenType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType#getContext()
	 * @see #getRequestSecurityTokenType()
	 * @generated
	 */
	EAttribute getRequestSecurityTokenType_Context();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType#getAnyAttribute()
	 * @see #getRequestSecurityTokenType()
	 * @generated
	 */
	EAttribute getRequestSecurityTokenType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType <em>Sign Challenge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sign Challenge Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType
	 * @generated
	 */
	EClass getSignChallengeType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType#getChallenge <em>Challenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Challenge</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType#getChallenge()
	 * @see #getSignChallengeType()
	 * @generated
	 */
	EAttribute getSignChallengeType_Challenge();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType#getAny()
	 * @see #getSignChallengeType()
	 * @generated
	 */
	EAttribute getSignChallengeType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType#getAnyAttribute()
	 * @see #getSignChallengeType()
	 * @generated
	 */
	EAttribute getSignChallengeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusType
	 * @generated
	 */
	EClass getStatusType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusType#getCode()
	 * @see #getStatusType()
	 * @generated
	 */
	EAttribute getStatusType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusType#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusType#getReason()
	 * @see #getStatusType()
	 * @generated
	 */
	EAttribute getStatusType_Reason();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.UseKeyType <em>Use Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Key Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.UseKeyType
	 * @generated
	 */
	EClass getUseKeyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.UseKeyType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.UseKeyType#getAny()
	 * @see #getUseKeyType()
	 * @generated
	 */
	EAttribute getUseKeyType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.UseKeyType#getSig <em>Sig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sig</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.UseKeyType#getSig()
	 * @see #getUseKeyType()
	 * @generated
	 */
	EAttribute getUseKeyType_Sig();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ValidateTargetType <em>Validate Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Target Type</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ValidateTargetType
	 * @generated
	 */
	EClass getValidateTargetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ValidateTargetType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ValidateTargetType#getAny()
	 * @see #getValidateTargetType()
	 * @generated
	 */
	EAttribute getValidateTargetType_Any();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum <em>Binary Secret Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Secret Type Enum</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum
	 * @generated
	 */
	EEnum getBinarySecretTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum <em>Computed Key Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Computed Key Enum</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum
	 * @generated
	 */
	EEnum getComputedKeyEnum();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum <em>Key Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Key Type Enum</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum
	 * @generated
	 */
	EEnum getKeyTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum <em>Request Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Type Enum</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum
	 * @generated
	 */
	EEnum getRequestTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum <em>Status Code Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Code Enum</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum
	 * @generated
	 */
	EEnum getStatusCodeEnum();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum <em>Binary Secret Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Binary Secret Type Enum Object</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum
	 * @model instanceClass="org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum"
	 *        extendedMetaData="name='BinarySecretTypeEnum:Object' baseType='BinarySecretTypeEnum'"
	 * @generated
	 */
	EDataType getBinarySecretTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Binary Secret Type Open Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Binary Secret Type Open Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='BinarySecretTypeOpenEnum' memberTypes='BinarySecretTypeEnum http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getBinarySecretTypeOpenEnum();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum <em>Computed Key Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Computed Key Enum Object</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum
	 * @model instanceClass="org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum"
	 *        extendedMetaData="name='ComputedKeyEnum:Object' baseType='ComputedKeyEnum'"
	 * @generated
	 */
	EDataType getComputedKeyEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Computed Key Open Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Computed Key Open Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='ComputedKeyOpenEnum' memberTypes='ComputedKeyEnum http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getComputedKeyOpenEnum();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum <em>Key Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Key Type Enum Object</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum
	 * @model instanceClass="org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum"
	 *        extendedMetaData="name='KeyTypeEnum:Object' baseType='KeyTypeEnum'"
	 * @generated
	 */
	EDataType getKeyTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Key Type Open Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Key Type Open Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='KeyTypeOpenEnum' memberTypes='KeyTypeEnum http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getKeyTypeOpenEnum();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum <em>Request Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Request Type Enum Object</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum
	 * @model instanceClass="org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum"
	 *        extendedMetaData="name='RequestTypeEnum:Object' baseType='RequestTypeEnum'"
	 * @generated
	 */
	EDataType getRequestTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Request Type Open Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Request Type Open Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='RequestTypeOpenEnum' memberTypes='RequestTypeEnum http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getRequestTypeOpenEnum();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum <em>Status Code Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Status Code Enum Object</em>'.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum
	 * @model instanceClass="org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum"
	 *        extendedMetaData="name='StatusCodeEnum:Object' baseType='StatusCodeEnum'"
	 * @generated
	 */
	EDataType getStatusCodeEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Status Code Open Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Status Code Open Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='StatusCodeOpenEnum' memberTypes='StatusCodeEnum http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getStatusCodeOpenEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_200512Factory get_200512Factory();

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
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.AllowPostdatingTypeImpl <em>Allow Postdating Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.AllowPostdatingTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getAllowPostdatingType()
		 * @generated
		 */
		EClass ALLOW_POSTDATING_TYPE = eINSTANCE.getAllowPostdatingType();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.AuthenticatorTypeImpl <em>Authenticator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.AuthenticatorTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getAuthenticatorType()
		 * @generated
		 */
		EClass AUTHENTICATOR_TYPE = eINSTANCE.getAuthenticatorType();

		/**
		 * The meta object literal for the '<em><b>Combined Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATOR_TYPE__COMBINED_HASH = eINSTANCE.getAuthenticatorType_CombinedHash();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATOR_TYPE__ANY = eINSTANCE.getAuthenticatorType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.BinaryExchangeTypeImpl <em>Binary Exchange Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.BinaryExchangeTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getBinaryExchangeType()
		 * @generated
		 */
		EClass BINARY_EXCHANGE_TYPE = eINSTANCE.getBinaryExchangeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXCHANGE_TYPE__VALUE = eINSTANCE.getBinaryExchangeType_Value();

		/**
		 * The meta object literal for the '<em><b>Encoding Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXCHANGE_TYPE__ENCODING_TYPE = eINSTANCE.getBinaryExchangeType_EncodingType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXCHANGE_TYPE__VALUE_TYPE = eINSTANCE.getBinaryExchangeType_ValueType();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXCHANGE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getBinaryExchangeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.BinarySecretTypeImpl <em>Binary Secret Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.BinarySecretTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getBinarySecretType()
		 * @generated
		 */
		EClass BINARY_SECRET_TYPE = eINSTANCE.getBinarySecretType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_SECRET_TYPE__VALUE = eINSTANCE.getBinarySecretType_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_SECRET_TYPE__TYPE = eINSTANCE.getBinarySecretType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_SECRET_TYPE__ANY_ATTRIBUTE = eINSTANCE.getBinarySecretType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.CancelTargetTypeImpl <em>Cancel Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.CancelTargetTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getCancelTargetType()
		 * @generated
		 */
		EClass CANCEL_TARGET_TYPE = eINSTANCE.getCancelTargetType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL_TARGET_TYPE__ANY = eINSTANCE.getCancelTargetType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ClaimsTypeImpl <em>Claims Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ClaimsTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getClaimsType()
		 * @generated
		 */
		EClass CLAIMS_TYPE = eINSTANCE.getClaimsType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIMS_TYPE__ANY = eINSTANCE.getClaimsType_Any();

		/**
		 * The meta object literal for the '<em><b>Dialect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIMS_TYPE__DIALECT = eINSTANCE.getClaimsType_Dialect();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIMS_TYPE__ANY_ATTRIBUTE = eINSTANCE.getClaimsType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DelegateToTypeImpl <em>Delegate To Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DelegateToTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getDelegateToType()
		 * @generated
		 */
		EClass DELEGATE_TO_TYPE = eINSTANCE.getDelegateToType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_TO_TYPE__ANY = eINSTANCE.getDelegateToType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Allow Postdating</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ALLOW_POSTDATING = eINSTANCE.getDocumentRoot_AllowPostdating();

		/**
		 * The meta object literal for the '<em><b>Authentication Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AUTHENTICATION_TYPE = eINSTANCE.getDocumentRoot_AuthenticationType();

		/**
		 * The meta object literal for the '<em><b>Authenticator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTHENTICATOR = eINSTANCE.getDocumentRoot_Authenticator();

		/**
		 * The meta object literal for the '<em><b>Binary Exchange</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BINARY_EXCHANGE = eINSTANCE.getDocumentRoot_BinaryExchange();

		/**
		 * The meta object literal for the '<em><b>Binary Secret</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BINARY_SECRET = eINSTANCE.getDocumentRoot_BinarySecret();

		/**
		 * The meta object literal for the '<em><b>Cancel Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CANCEL_TARGET = eINSTANCE.getDocumentRoot_CancelTarget();

		/**
		 * The meta object literal for the '<em><b>Canonicalization Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CANONICALIZATION_ALGORITHM = eINSTANCE.getDocumentRoot_CanonicalizationAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Challenge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CHALLENGE = eINSTANCE.getDocumentRoot_Challenge();

		/**
		 * The meta object literal for the '<em><b>Claims</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLAIMS = eINSTANCE.getDocumentRoot_Claims();

		/**
		 * The meta object literal for the '<em><b>Combined Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COMBINED_HASH = eINSTANCE.getDocumentRoot_CombinedHash();

		/**
		 * The meta object literal for the '<em><b>Computed Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COMPUTED_KEY = eINSTANCE.getDocumentRoot_ComputedKey();

		/**
		 * The meta object literal for the '<em><b>Computed Key Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COMPUTED_KEY_ALGORITHM = eINSTANCE.getDocumentRoot_ComputedKeyAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Delegatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DELEGATABLE = eINSTANCE.getDocumentRoot_Delegatable();

		/**
		 * The meta object literal for the '<em><b>Delegate To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELEGATE_TO = eINSTANCE.getDocumentRoot_DelegateTo();

		/**
		 * The meta object literal for the '<em><b>Encryption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENCRYPTION = eINSTANCE.getDocumentRoot_Encryption();

		/**
		 * The meta object literal for the '<em><b>Encryption Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ENCRYPTION_ALGORITHM = eINSTANCE.getDocumentRoot_EncryptionAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Encrypt With</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ENCRYPT_WITH = eINSTANCE.getDocumentRoot_EncryptWith();

		/**
		 * The meta object literal for the '<em><b>Entropy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTROPY = eINSTANCE.getDocumentRoot_Entropy();

		/**
		 * The meta object literal for the '<em><b>Forwardable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FORWARDABLE = eINSTANCE.getDocumentRoot_Forwardable();

		/**
		 * The meta object literal for the '<em><b>Issued Tokens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ISSUED_TOKENS = eINSTANCE.getDocumentRoot_IssuedTokens();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ISSUER = eINSTANCE.getDocumentRoot_Issuer();

		/**
		 * The meta object literal for the '<em><b>Key Exchange Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN = eINSTANCE.getDocumentRoot_KeyExchangeToken();

		/**
		 * The meta object literal for the '<em><b>Key Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__KEY_SIZE = eINSTANCE.getDocumentRoot_KeySize();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__KEY_TYPE = eINSTANCE.getDocumentRoot_KeyType();

		/**
		 * The meta object literal for the '<em><b>Key Wrap Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__KEY_WRAP_ALGORITHM = eINSTANCE.getDocumentRoot_KeyWrapAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Lifetime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIFETIME = eINSTANCE.getDocumentRoot_Lifetime();

		/**
		 * The meta object literal for the '<em><b>On Behalf Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ON_BEHALF_OF = eINSTANCE.getDocumentRoot_OnBehalfOf();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARTICIPANTS = eINSTANCE.getDocumentRoot_Participants();

		/**
		 * The meta object literal for the '<em><b>Proof Encryption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROOF_ENCRYPTION = eINSTANCE.getDocumentRoot_ProofEncryption();

		/**
		 * The meta object literal for the '<em><b>Renewing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RENEWING = eINSTANCE.getDocumentRoot_Renewing();

		/**
		 * The meta object literal for the '<em><b>Renew Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RENEW_TARGET = eINSTANCE.getDocumentRoot_RenewTarget();

		/**
		 * The meta object literal for the '<em><b>Requested Attached Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE = eINSTANCE.getDocumentRoot_RequestedAttachedReference();

		/**
		 * The meta object literal for the '<em><b>Requested Proof Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN = eINSTANCE.getDocumentRoot_RequestedProofToken();

		/**
		 * The meta object literal for the '<em><b>Requested Security Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN = eINSTANCE.getDocumentRoot_RequestedSecurityToken();

		/**
		 * The meta object literal for the '<em><b>Requested Token Cancelled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED = eINSTANCE.getDocumentRoot_RequestedTokenCancelled();

		/**
		 * The meta object literal for the '<em><b>Requested Unattached Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE = eINSTANCE.getDocumentRoot_RequestedUnattachedReference();

		/**
		 * The meta object literal for the '<em><b>Request KET</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUEST_KET = eINSTANCE.getDocumentRoot_RequestKET();

		/**
		 * The meta object literal for the '<em><b>Request Security Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN = eINSTANCE.getDocumentRoot_RequestSecurityToken();

		/**
		 * The meta object literal for the '<em><b>Request Security Token Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION = eINSTANCE.getDocumentRoot_RequestSecurityTokenCollection();

		/**
		 * The meta object literal for the '<em><b>Request Security Token Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE = eINSTANCE.getDocumentRoot_RequestSecurityTokenResponse();

		/**
		 * The meta object literal for the '<em><b>Request Security Token Response Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION = eINSTANCE.getDocumentRoot_RequestSecurityTokenResponseCollection();

		/**
		 * The meta object literal for the '<em><b>Request Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REQUEST_TYPE = eINSTANCE.getDocumentRoot_RequestType();

		/**
		 * The meta object literal for the '<em><b>Signature Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SIGNATURE_ALGORITHM = eINSTANCE.getDocumentRoot_SignatureAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Sign Challenge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGN_CHALLENGE = eINSTANCE.getDocumentRoot_SignChallenge();

		/**
		 * The meta object literal for the '<em><b>Sign Challenge Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE = eINSTANCE.getDocumentRoot_SignChallengeResponse();

		/**
		 * The meta object literal for the '<em><b>Sign With</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SIGN_WITH = eINSTANCE.getDocumentRoot_SignWith();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STATUS = eINSTANCE.getDocumentRoot_Status();

		/**
		 * The meta object literal for the '<em><b>Token Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TOKEN_TYPE = eINSTANCE.getDocumentRoot_TokenType();

		/**
		 * The meta object literal for the '<em><b>Use Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE_KEY = eINSTANCE.getDocumentRoot_UseKey();

		/**
		 * The meta object literal for the '<em><b>Validate Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALIDATE_TARGET = eINSTANCE.getDocumentRoot_ValidateTarget();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.EncryptionTypeImpl <em>Encryption Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.EncryptionTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getEncryptionType()
		 * @generated
		 */
		EClass ENCRYPTION_TYPE = eINSTANCE.getEncryptionType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_TYPE__ANY = eINSTANCE.getEncryptionType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.EntropyTypeImpl <em>Entropy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.EntropyTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getEntropyType()
		 * @generated
		 */
		EClass ENTROPY_TYPE = eINSTANCE.getEntropyType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTROPY_TYPE__ANY = eINSTANCE.getEntropyType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTROPY_TYPE__ANY_ATTRIBUTE = eINSTANCE.getEntropyType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.KeyExchangeTokenTypeImpl <em>Key Exchange Token Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.KeyExchangeTokenTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getKeyExchangeTokenType()
		 * @generated
		 */
		EClass KEY_EXCHANGE_TOKEN_TYPE = eINSTANCE.getKeyExchangeTokenType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_EXCHANGE_TOKEN_TYPE__ANY = eINSTANCE.getKeyExchangeTokenType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.LifetimeTypeImpl <em>Lifetime Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.LifetimeTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getLifetimeType()
		 * @generated
		 */
		EClass LIFETIME_TYPE = eINSTANCE.getLifetimeType();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFETIME_TYPE__CREATED = eINSTANCE.getLifetimeType_Created();

		/**
		 * The meta object literal for the '<em><b>Expires</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFETIME_TYPE__EXPIRES = eINSTANCE.getLifetimeType_Expires();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.OnBehalfOfTypeImpl <em>On Behalf Of Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.OnBehalfOfTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getOnBehalfOfType()
		 * @generated
		 */
		EClass ON_BEHALF_OF_TYPE = eINSTANCE.getOnBehalfOfType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_BEHALF_OF_TYPE__ANY = eINSTANCE.getOnBehalfOfType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ParticipantsTypeImpl <em>Participants Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ParticipantsTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getParticipantsType()
		 * @generated
		 */
		EClass PARTICIPANTS_TYPE = eINSTANCE.getParticipantsType();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANTS_TYPE__PRIMARY = eINSTANCE.getParticipantsType_Primary();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANTS_TYPE__PARTICIPANT = eINSTANCE.getParticipantsType_Participant();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANTS_TYPE__ANY = eINSTANCE.getParticipantsType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ParticipantTypeImpl <em>Participant Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ParticipantTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getParticipantType()
		 * @generated
		 */
		EClass PARTICIPANT_TYPE = eINSTANCE.getParticipantType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_TYPE__ANY = eINSTANCE.getParticipantType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ProofEncryptionTypeImpl <em>Proof Encryption Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ProofEncryptionTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getProofEncryptionType()
		 * @generated
		 */
		EClass PROOF_ENCRYPTION_TYPE = eINSTANCE.getProofEncryptionType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROOF_ENCRYPTION_TYPE__ANY = eINSTANCE.getProofEncryptionType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RenewingTypeImpl <em>Renewing Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RenewingTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRenewingType()
		 * @generated
		 */
		EClass RENEWING_TYPE = eINSTANCE.getRenewingType();

		/**
		 * The meta object literal for the '<em><b>Allow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENEWING_TYPE__ALLOW = eINSTANCE.getRenewingType_Allow();

		/**
		 * The meta object literal for the '<em><b>OK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENEWING_TYPE__OK = eINSTANCE.getRenewingType_OK();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RenewTargetTypeImpl <em>Renew Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RenewTargetTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRenewTargetType()
		 * @generated
		 */
		EClass RENEW_TARGET_TYPE = eINSTANCE.getRenewTargetType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENEW_TARGET_TYPE__ANY = eINSTANCE.getRenewTargetType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedProofTokenTypeImpl <em>Requested Proof Token Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedProofTokenTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestedProofTokenType()
		 * @generated
		 */
		EClass REQUESTED_PROOF_TOKEN_TYPE = eINSTANCE.getRequestedProofTokenType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTED_PROOF_TOKEN_TYPE__ANY = eINSTANCE.getRequestedProofTokenType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedReferenceTypeImpl <em>Requested Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedReferenceTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestedReferenceType()
		 * @generated
		 */
		EClass REQUESTED_REFERENCE_TYPE = eINSTANCE.getRequestedReferenceType();

		/**
		 * The meta object literal for the '<em><b>Security Token Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE = eINSTANCE.getRequestedReferenceType_SecurityTokenReference();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedSecurityTokenTypeImpl <em>Requested Security Token Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedSecurityTokenTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestedSecurityTokenType()
		 * @generated
		 */
		EClass REQUESTED_SECURITY_TOKEN_TYPE = eINSTANCE.getRequestedSecurityTokenType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTED_SECURITY_TOKEN_TYPE__ANY = eINSTANCE.getRequestedSecurityTokenType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedTokenCancelledTypeImpl <em>Requested Token Cancelled Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestedTokenCancelledTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestedTokenCancelledType()
		 * @generated
		 */
		EClass REQUESTED_TOKEN_CANCELLED_TYPE = eINSTANCE.getRequestedTokenCancelledType();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestKETTypeImpl <em>Request KET Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestKETTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestKETType()
		 * @generated
		 */
		EClass REQUEST_KET_TYPE = eINSTANCE.getRequestKETType();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenCollectionTypeImpl <em>Request Security Token Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenCollectionTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestSecurityTokenCollectionType()
		 * @generated
		 */
		EClass REQUEST_SECURITY_TOKEN_COLLECTION_TYPE = eINSTANCE.getRequestSecurityTokenCollectionType();

		/**
		 * The meta object literal for the '<em><b>Request Security Token</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_SECURITY_TOKEN_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN = eINSTANCE.getRequestSecurityTokenCollectionType_RequestSecurityToken();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenResponseCollectionTypeImpl <em>Request Security Token Response Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenResponseCollectionTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestSecurityTokenResponseCollectionType()
		 * @generated
		 */
		EClass REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE = eINSTANCE.getRequestSecurityTokenResponseCollectionType();

		/**
		 * The meta object literal for the '<em><b>Request Security Token Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN_RESPONSE = eINSTANCE.getRequestSecurityTokenResponseCollectionType_RequestSecurityTokenResponse();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getRequestSecurityTokenResponseCollectionType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenResponseTypeImpl <em>Request Security Token Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenResponseTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestSecurityTokenResponseType()
		 * @generated
		 */
		EClass REQUEST_SECURITY_TOKEN_RESPONSE_TYPE = eINSTANCE.getRequestSecurityTokenResponseType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SECURITY_TOKEN_RESPONSE_TYPE__ANY = eINSTANCE.getRequestSecurityTokenResponseType_Any();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SECURITY_TOKEN_RESPONSE_TYPE__CONTEXT = eINSTANCE.getRequestSecurityTokenResponseType_Context();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SECURITY_TOKEN_RESPONSE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getRequestSecurityTokenResponseType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenTypeImpl <em>Request Security Token Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.RequestSecurityTokenTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestSecurityTokenType()
		 * @generated
		 */
		EClass REQUEST_SECURITY_TOKEN_TYPE = eINSTANCE.getRequestSecurityTokenType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SECURITY_TOKEN_TYPE__ANY = eINSTANCE.getRequestSecurityTokenType_Any();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SECURITY_TOKEN_TYPE__CONTEXT = eINSTANCE.getRequestSecurityTokenType_Context();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SECURITY_TOKEN_TYPE__ANY_ATTRIBUTE = eINSTANCE.getRequestSecurityTokenType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.SignChallengeTypeImpl <em>Sign Challenge Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.SignChallengeTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getSignChallengeType()
		 * @generated
		 */
		EClass SIGN_CHALLENGE_TYPE = eINSTANCE.getSignChallengeType();

		/**
		 * The meta object literal for the '<em><b>Challenge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_CHALLENGE_TYPE__CHALLENGE = eINSTANCE.getSignChallengeType_Challenge();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_CHALLENGE_TYPE__ANY = eINSTANCE.getSignChallengeType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_CHALLENGE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getSignChallengeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.StatusTypeImpl <em>Status Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.StatusTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getStatusType()
		 * @generated
		 */
		EClass STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_TYPE__CODE = eINSTANCE.getStatusType_Code();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_TYPE__REASON = eINSTANCE.getStatusType_Reason();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.UseKeyTypeImpl <em>Use Key Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.UseKeyTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getUseKeyType()
		 * @generated
		 */
		EClass USE_KEY_TYPE = eINSTANCE.getUseKeyType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_KEY_TYPE__ANY = eINSTANCE.getUseKeyType_Any();

		/**
		 * The meta object literal for the '<em><b>Sig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_KEY_TYPE__SIG = eINSTANCE.getUseKeyType_Sig();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ValidateTargetTypeImpl <em>Validate Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.ValidateTargetTypeImpl
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getValidateTargetType()
		 * @generated
		 */
		EClass VALIDATE_TARGET_TYPE = eINSTANCE.getValidateTargetType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATE_TARGET_TYPE__ANY = eINSTANCE.getValidateTargetType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum <em>Binary Secret Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getBinarySecretTypeEnum()
		 * @generated
		 */
		EEnum BINARY_SECRET_TYPE_ENUM = eINSTANCE.getBinarySecretTypeEnum();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum <em>Computed Key Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getComputedKeyEnum()
		 * @generated
		 */
		EEnum COMPUTED_KEY_ENUM = eINSTANCE.getComputedKeyEnum();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum <em>Key Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getKeyTypeEnum()
		 * @generated
		 */
		EEnum KEY_TYPE_ENUM = eINSTANCE.getKeyTypeEnum();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum <em>Request Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestTypeEnum()
		 * @generated
		 */
		EEnum REQUEST_TYPE_ENUM = eINSTANCE.getRequestTypeEnum();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum <em>Status Code Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getStatusCodeEnum()
		 * @generated
		 */
		EEnum STATUS_CODE_ENUM = eINSTANCE.getStatusCodeEnum();

		/**
		 * The meta object literal for the '<em>Binary Secret Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getBinarySecretTypeEnumObject()
		 * @generated
		 */
		EDataType BINARY_SECRET_TYPE_ENUM_OBJECT = eINSTANCE.getBinarySecretTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Binary Secret Type Open Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getBinarySecretTypeOpenEnum()
		 * @generated
		 */
		EDataType BINARY_SECRET_TYPE_OPEN_ENUM = eINSTANCE.getBinarySecretTypeOpenEnum();

		/**
		 * The meta object literal for the '<em>Computed Key Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getComputedKeyEnumObject()
		 * @generated
		 */
		EDataType COMPUTED_KEY_ENUM_OBJECT = eINSTANCE.getComputedKeyEnumObject();

		/**
		 * The meta object literal for the '<em>Computed Key Open Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getComputedKeyOpenEnum()
		 * @generated
		 */
		EDataType COMPUTED_KEY_OPEN_ENUM = eINSTANCE.getComputedKeyOpenEnum();

		/**
		 * The meta object literal for the '<em>Key Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getKeyTypeEnumObject()
		 * @generated
		 */
		EDataType KEY_TYPE_ENUM_OBJECT = eINSTANCE.getKeyTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Key Type Open Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getKeyTypeOpenEnum()
		 * @generated
		 */
		EDataType KEY_TYPE_OPEN_ENUM = eINSTANCE.getKeyTypeOpenEnum();

		/**
		 * The meta object literal for the '<em>Request Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestTypeEnumObject()
		 * @generated
		 */
		EDataType REQUEST_TYPE_ENUM_OBJECT = eINSTANCE.getRequestTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Request Type Open Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getRequestTypeOpenEnum()
		 * @generated
		 */
		EDataType REQUEST_TYPE_OPEN_ENUM = eINSTANCE.getRequestTypeOpenEnum();

		/**
		 * The meta object literal for the '<em>Status Code Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getStatusCodeEnumObject()
		 * @generated
		 */
		EDataType STATUS_CODE_ENUM_OBJECT = eINSTANCE.getStatusCodeEnumObject();

		/**
		 * The meta object literal for the '<em>Status Code Open Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl#getStatusCodeOpenEnum()
		 * @generated
		 */
		EDataType STATUS_CODE_OPEN_ENUM = eINSTANCE.getStatusCodeOpenEnum();

	}

} //_200512Package
