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
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.w3._2000._09.xmldsig.XmldsigFactory
 * @model kind="package"
 * @generated
 */
public interface XmldsigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmldsig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2000/09/xmldsig#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ds";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmldsigPackage eINSTANCE = org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.CanonicalizationMethodTypeImpl <em>Canonicalization Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.CanonicalizationMethodTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getCanonicalizationMethodType()
	 * @generated
	 */
	int CANONICALIZATION_METHOD_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICALIZATION_METHOD_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICALIZATION_METHOD_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICALIZATION_METHOD_TYPE__ALGORITHM = 2;

	/**
	 * The number of structural features of the '<em>Canonicalization Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICALIZATION_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.CanonicalizationMethodType1Impl <em>Canonicalization Method Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.CanonicalizationMethodType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getCanonicalizationMethodType1()
	 * @generated
	 */
	int CANONICALIZATION_METHOD_TYPE1 = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICALIZATION_METHOD_TYPE1__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICALIZATION_METHOD_TYPE1__ANY = 1;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICALIZATION_METHOD_TYPE1__ALGORITHM = 2;

	/**
	 * The number of structural features of the '<em>Canonicalization Method Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICALIZATION_METHOD_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.DigestMethodTypeImpl <em>Digest Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.DigestMethodTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDigestMethodType()
	 * @generated
	 */
	int DIGEST_METHOD_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_METHOD_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_METHOD_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_METHOD_TYPE__ALGORITHM = 2;

	/**
	 * The number of structural features of the '<em>Digest Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.DigestMethodType1Impl <em>Digest Method Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.DigestMethodType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDigestMethodType1()
	 * @generated
	 */
	int DIGEST_METHOD_TYPE1 = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_METHOD_TYPE1__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_METHOD_TYPE1__ANY = 1;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_METHOD_TYPE1__ALGORITHM = 2;

	/**
	 * The number of structural features of the '<em>Digest Method Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_METHOD_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.DocumentRootImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

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
	 * The feature id for the '<em><b>Canonicalization Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CANONICALIZATION_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Digest Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIGEST_METHOD = 4;

	/**
	 * The feature id for the '<em><b>Digest Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIGEST_VALUE = 5;

	/**
	 * The feature id for the '<em><b>DSA Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DSA_KEY_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_INFO = 7;

	/**
	 * The feature id for the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_NAME = 8;

	/**
	 * The feature id for the '<em><b>Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Manifest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MANIFEST = 10;

	/**
	 * The feature id for the '<em><b>Mgmt Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MGMT_DATA = 11;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT = 12;

	/**
	 * The feature id for the '<em><b>PGP Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PGP_DATA = 13;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Retrieval Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RETRIEVAL_METHOD = 15;

	/**
	 * The feature id for the '<em><b>RSA Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RSA_KEY_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE = 17;

	/**
	 * The feature id for the '<em><b>Signature Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE_METHOD = 18;

	/**
	 * The feature id for the '<em><b>Signature Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE_PROPERTIES = 19;

	/**
	 * The feature id for the '<em><b>Signature Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE_PROPERTY = 20;

	/**
	 * The feature id for the '<em><b>Signature Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Signed Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNED_INFO = 22;

	/**
	 * The feature id for the '<em><b>SPKI Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPKI_DATA = 23;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM = 24;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMS = 25;

	/**
	 * The feature id for the '<em><b>X509 Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__X509_DATA = 26;

	/**
	 * The feature id for the '<em><b>Canonicalization Method1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CANONICALIZATION_METHOD1 = 27;

	/**
	 * The feature id for the '<em><b>Digest Method1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIGEST_METHOD1 = 28;

	/**
	 * The feature id for the '<em><b>Digest Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIGEST_VALUE1 = 29;

	/**
	 * The feature id for the '<em><b>DSA Key Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DSA_KEY_VALUE1 = 30;

	/**
	 * The feature id for the '<em><b>Key Info1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_INFO1 = 31;

	/**
	 * The feature id for the '<em><b>Key Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_NAME1 = 32;

	/**
	 * The feature id for the '<em><b>Key Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_VALUE1 = 33;

	/**
	 * The feature id for the '<em><b>Manifest1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MANIFEST1 = 34;

	/**
	 * The feature id for the '<em><b>Mgmt Data1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MGMT_DATA1 = 35;

	/**
	 * The feature id for the '<em><b>Object1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT1 = 36;

	/**
	 * The feature id for the '<em><b>PGP Data1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PGP_DATA1 = 37;

	/**
	 * The feature id for the '<em><b>Reference1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCE1 = 38;

	/**
	 * The feature id for the '<em><b>Retrieval Method1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RETRIEVAL_METHOD1 = 39;

	/**
	 * The feature id for the '<em><b>RSA Key Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RSA_KEY_VALUE1 = 40;

	/**
	 * The feature id for the '<em><b>Signature1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE1 = 41;

	/**
	 * The feature id for the '<em><b>Signature Method1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE_METHOD1 = 42;

	/**
	 * The feature id for the '<em><b>Signature Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE_PROPERTIES1 = 43;

	/**
	 * The feature id for the '<em><b>Signature Property1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE_PROPERTY1 = 44;

	/**
	 * The feature id for the '<em><b>Signature Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE_VALUE1 = 45;

	/**
	 * The feature id for the '<em><b>Signed Info1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNED_INFO1 = 46;

	/**
	 * The feature id for the '<em><b>SPKI Data1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPKI_DATA1 = 47;

	/**
	 * The feature id for the '<em><b>Transform1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM1 = 48;

	/**
	 * The feature id for the '<em><b>Transforms1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMS1 = 49;

	/**
	 * The feature id for the '<em><b>X509 Data1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__X509_DATA1 = 50;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 51;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.DSAKeyValueTypeImpl <em>DSA Key Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.DSAKeyValueTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDSAKeyValueType()
	 * @generated
	 */
	int DSA_KEY_VALUE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE__P = 0;

	/**
	 * The feature id for the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE__Q = 1;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE__G = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE__Y = 3;

	/**
	 * The feature id for the '<em><b>J</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE__J = 4;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE__SEED = 5;

	/**
	 * The feature id for the '<em><b>Pgen Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE__PGEN_COUNTER = 6;

	/**
	 * The number of structural features of the '<em>DSA Key Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.DSAKeyValueType1Impl <em>DSA Key Value Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.DSAKeyValueType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDSAKeyValueType1()
	 * @generated
	 */
	int DSA_KEY_VALUE_TYPE1 = 6;

	/**
	 * The feature id for the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE1__P = 0;

	/**
	 * The feature id for the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE1__Q = 1;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE1__G = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE1__Y = 3;

	/**
	 * The feature id for the '<em><b>J</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE1__J = 4;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE1__SEED = 5;

	/**
	 * The feature id for the '<em><b>Pgen Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE1__PGEN_COUNTER = 6;

	/**
	 * The number of structural features of the '<em>DSA Key Value Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_KEY_VALUE_TYPE1_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl <em>Key Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getKeyInfoType()
	 * @generated
	 */
	int KEY_INFO_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Key Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE__KEY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Key Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE__KEY_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Retrieval Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE__RETRIEVAL_METHOD = 4;

	/**
	 * The feature id for the '<em><b>X509 Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE__X509_DATA = 5;

	/**
	 * The feature id for the '<em><b>PGP Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE__PGP_DATA = 6;

	/**
	 * The feature id for the '<em><b>SPKI Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE__SPKI_DATA = 7;

	/**
	 * The feature id for the '<em><b>Mgmt Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE__MGMT_DATA = 8;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE__ANY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE__ID = 10;

	/**
	 * The number of structural features of the '<em>Key Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl <em>Key Info Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getKeyInfoType1()
	 * @generated
	 */
	int KEY_INFO_TYPE1 = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Key Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1__KEY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Key Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1__KEY_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Retrieval Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1__RETRIEVAL_METHOD = 4;

	/**
	 * The feature id for the '<em><b>X509 Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1__X509_DATA = 5;

	/**
	 * The feature id for the '<em><b>PGP Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1__PGP_DATA = 6;

	/**
	 * The feature id for the '<em><b>SPKI Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1__SPKI_DATA = 7;

	/**
	 * The feature id for the '<em><b>Mgmt Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1__MGMT_DATA = 8;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1__ANY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1__ID = 10;

	/**
	 * The number of structural features of the '<em>Key Info Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_INFO_TYPE1_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.KeyValueTypeImpl <em>Key Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.KeyValueTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getKeyValueType()
	 * @generated
	 */
	int KEY_VALUE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>DSA Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE__DSA_KEY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>RSA Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE__RSA_KEY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE__ANY = 3;

	/**
	 * The number of structural features of the '<em>Key Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.KeyValueType1Impl <em>Key Value Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.KeyValueType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getKeyValueType1()
	 * @generated
	 */
	int KEY_VALUE_TYPE1 = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE1__MIXED = 0;

	/**
	 * The feature id for the '<em><b>DSA Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE1__DSA_KEY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>RSA Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE1__RSA_KEY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE1__ANY = 3;

	/**
	 * The number of structural features of the '<em>Key Value Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.ManifestTypeImpl <em>Manifest Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.ManifestTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getManifestType()
	 * @generated
	 */
	int MANIFEST_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_TYPE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Manifest Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.ManifestType1Impl <em>Manifest Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.ManifestType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getManifestType1()
	 * @generated
	 */
	int MANIFEST_TYPE1 = 12;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_TYPE1__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_TYPE1__ID = 1;

	/**
	 * The number of structural features of the '<em>Manifest Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.ObjectTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ENCODING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__MIME_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.ObjectType1Impl <em>Object Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.ObjectType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getObjectType1()
	 * @generated
	 */
	int OBJECT_TYPE1 = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE1__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE1__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE1__ANY = 2;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE1__ENCODING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE1__ID = 4;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE1__MIME_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Object Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE1_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.PGPDataTypeImpl <em>PGP Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.PGPDataTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getPGPDataType()
	 * @generated
	 */
	int PGP_DATA_TYPE = 15;

	/**
	 * The feature id for the '<em><b>PGP Key ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE__PGP_KEY_ID = 0;

	/**
	 * The feature id for the '<em><b>PGP Key Packet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE__PGP_KEY_PACKET = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>PGP Key Packet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE__PGP_KEY_PACKET1 = 3;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE__ANY1 = 4;

	/**
	 * The number of structural features of the '<em>PGP Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.PGPDataType1Impl <em>PGP Data Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.PGPDataType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getPGPDataType1()
	 * @generated
	 */
	int PGP_DATA_TYPE1 = 16;

	/**
	 * The feature id for the '<em><b>PGP Key ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE1__PGP_KEY_ID = 0;

	/**
	 * The feature id for the '<em><b>PGP Key Packet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE1__PGP_KEY_PACKET = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE1__ANY = 2;

	/**
	 * The feature id for the '<em><b>PGP Key Packet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE1__PGP_KEY_PACKET1 = 3;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE1__ANY1 = 4;

	/**
	 * The number of structural features of the '<em>PGP Data Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGP_DATA_TYPE1_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.ReferenceTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__TRANSFORMS = 0;

	/**
	 * The feature id for the '<em><b>Digest Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__DIGEST_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Digest Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__DIGEST_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__TYPE = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__URI = 5;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.ReferenceType1Impl <em>Reference Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.ReferenceType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getReferenceType1()
	 * @generated
	 */
	int REFERENCE_TYPE1 = 18;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE1__TRANSFORMS = 0;

	/**
	 * The feature id for the '<em><b>Digest Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE1__DIGEST_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Digest Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE1__DIGEST_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE1__ID = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE1__TYPE = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE1__URI = 5;

	/**
	 * The number of structural features of the '<em>Reference Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE1_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.RetrievalMethodTypeImpl <em>Retrieval Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.RetrievalMethodTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getRetrievalMethodType()
	 * @generated
	 */
	int RETRIEVAL_METHOD_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVAL_METHOD_TYPE__TRANSFORMS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVAL_METHOD_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVAL_METHOD_TYPE__URI = 2;

	/**
	 * The number of structural features of the '<em>Retrieval Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVAL_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.RetrievalMethodType1Impl <em>Retrieval Method Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.RetrievalMethodType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getRetrievalMethodType1()
	 * @generated
	 */
	int RETRIEVAL_METHOD_TYPE1 = 20;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVAL_METHOD_TYPE1__TRANSFORMS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVAL_METHOD_TYPE1__TYPE = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVAL_METHOD_TYPE1__URI = 2;

	/**
	 * The number of structural features of the '<em>Retrieval Method Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVAL_METHOD_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.RSAKeyValueTypeImpl <em>RSA Key Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.RSAKeyValueTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getRSAKeyValueType()
	 * @generated
	 */
	int RSA_KEY_VALUE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Modulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_KEY_VALUE_TYPE__MODULUS = 0;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_KEY_VALUE_TYPE__EXPONENT = 1;

	/**
	 * The number of structural features of the '<em>RSA Key Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_KEY_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.RSAKeyValueType1Impl <em>RSA Key Value Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.RSAKeyValueType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getRSAKeyValueType1()
	 * @generated
	 */
	int RSA_KEY_VALUE_TYPE1 = 22;

	/**
	 * The feature id for the '<em><b>Modulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_KEY_VALUE_TYPE1__MODULUS = 0;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_KEY_VALUE_TYPE1__EXPONENT = 1;

	/**
	 * The number of structural features of the '<em>RSA Key Value Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_KEY_VALUE_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignatureMethodTypeImpl <em>Signature Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignatureMethodTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureMethodType()
	 * @generated
	 */
	int SIGNATURE_METHOD_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_METHOD_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>HMAC Output Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_METHOD_TYPE__HMAC_OUTPUT_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_METHOD_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_METHOD_TYPE__ALGORITHM = 3;

	/**
	 * The number of structural features of the '<em>Signature Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_METHOD_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignatureMethodType1Impl <em>Signature Method Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignatureMethodType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureMethodType1()
	 * @generated
	 */
	int SIGNATURE_METHOD_TYPE1 = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_METHOD_TYPE1__MIXED = 0;

	/**
	 * The feature id for the '<em><b>HMAC Output Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_METHOD_TYPE1__HMAC_OUTPUT_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_METHOD_TYPE1__ANY = 2;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_METHOD_TYPE1__ALGORITHM = 3;

	/**
	 * The number of structural features of the '<em>Signature Method Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_METHOD_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignaturePropertiesTypeImpl <em>Signature Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignaturePropertiesTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignaturePropertiesType()
	 * @generated
	 */
	int SIGNATURE_PROPERTIES_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Signature Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTIES_TYPE__SIGNATURE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTIES_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Signature Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignaturePropertiesType1Impl <em>Signature Properties Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignaturePropertiesType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignaturePropertiesType1()
	 * @generated
	 */
	int SIGNATURE_PROPERTIES_TYPE1 = 26;

	/**
	 * The feature id for the '<em><b>Signature Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTIES_TYPE1__SIGNATURE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTIES_TYPE1__ID = 1;

	/**
	 * The number of structural features of the '<em>Signature Properties Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTIES_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignaturePropertyTypeImpl <em>Signature Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignaturePropertyTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignaturePropertyType()
	 * @generated
	 */
	int SIGNATURE_PROPERTY_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE__TARGET = 4;

	/**
	 * The number of structural features of the '<em>Signature Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignaturePropertyType1Impl <em>Signature Property Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignaturePropertyType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignaturePropertyType1()
	 * @generated
	 */
	int SIGNATURE_PROPERTY_TYPE1 = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE1__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE1__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE1__ANY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE1__ID = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE1__TARGET = 4;

	/**
	 * The number of structural features of the '<em>Signature Property Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_PROPERTY_TYPE1_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignatureTypeImpl <em>Signature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignatureTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureType()
	 * @generated
	 */
	int SIGNATURE_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Signed Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE__SIGNED_INFO = 0;

	/**
	 * The feature id for the '<em><b>Signature Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE__SIGNATURE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE__KEY_INFO = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE__OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Signature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignatureType1Impl <em>Signature Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignatureType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureType1()
	 * @generated
	 */
	int SIGNATURE_TYPE1 = 30;

	/**
	 * The feature id for the '<em><b>Signed Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE1__SIGNED_INFO = 0;

	/**
	 * The feature id for the '<em><b>Signature Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE1__SIGNATURE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE1__KEY_INFO = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE1__OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE1__ID = 4;

	/**
	 * The number of structural features of the '<em>Signature Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_TYPE1_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignatureValueTypeImpl <em>Signature Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignatureValueTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureValueType()
	 * @generated
	 */
	int SIGNATURE_VALUE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALUE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALUE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Signature Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignatureValueType1Impl <em>Signature Value Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignatureValueType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureValueType1()
	 * @generated
	 */
	int SIGNATURE_VALUE_TYPE1 = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALUE_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALUE_TYPE1__ID = 1;

	/**
	 * The number of structural features of the '<em>Signature Value Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALUE_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignedInfoTypeImpl <em>Signed Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignedInfoTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignedInfoType()
	 * @generated
	 */
	int SIGNED_INFO_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Canonicalization Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INFO_TYPE__CANONICALIZATION_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Signature Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INFO_TYPE__SIGNATURE_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INFO_TYPE__REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INFO_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Signed Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INFO_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SignedInfoType1Impl <em>Signed Info Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SignedInfoType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignedInfoType1()
	 * @generated
	 */
	int SIGNED_INFO_TYPE1 = 34;

	/**
	 * The feature id for the '<em><b>Canonicalization Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INFO_TYPE1__CANONICALIZATION_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Signature Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INFO_TYPE1__SIGNATURE_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INFO_TYPE1__REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INFO_TYPE1__ID = 3;

	/**
	 * The number of structural features of the '<em>Signed Info Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INFO_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SPKIDataTypeImpl <em>SPKI Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SPKIDataTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSPKIDataType()
	 * @generated
	 */
	int SPKI_DATA_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPKI_DATA_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPKI Sexp</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPKI_DATA_TYPE__SPKI_SEXP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPKI_DATA_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>SPKI Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPKI_DATA_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.SPKIDataType1Impl <em>SPKI Data Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.SPKIDataType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSPKIDataType1()
	 * @generated
	 */
	int SPKI_DATA_TYPE1 = 36;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPKI_DATA_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPKI Sexp</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPKI_DATA_TYPE1__SPKI_SEXP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPKI_DATA_TYPE1__ANY = 2;

	/**
	 * The number of structural features of the '<em>SPKI Data Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPKI_DATA_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.TransformsTypeImpl <em>Transforms Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.TransformsTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getTransformsType()
	 * @generated
	 */
	int TRANSFORMS_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMS_TYPE__TRANSFORM = 0;

	/**
	 * The number of structural features of the '<em>Transforms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.TransformsType1Impl <em>Transforms Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.TransformsType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getTransformsType1()
	 * @generated
	 */
	int TRANSFORMS_TYPE1 = 38;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMS_TYPE1__TRANSFORM = 0;

	/**
	 * The number of structural features of the '<em>Transforms Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.TransformTypeImpl <em>Transform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.TransformTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getTransformType()
	 * @generated
	 */
	int TRANSFORM_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>XPath</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__XPATH = 3;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__ALGORITHM = 4;

	/**
	 * The number of structural features of the '<em>Transform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.TransformType1Impl <em>Transform Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.TransformType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getTransformType1()
	 * @generated
	 */
	int TRANSFORM_TYPE1 = 40;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE1__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE1__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE1__ANY = 2;

	/**
	 * The feature id for the '<em><b>XPath</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE1__XPATH = 3;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE1__ALGORITHM = 4;

	/**
	 * The number of structural features of the '<em>Transform Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE1_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.X509DataTypeImpl <em>X509 Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.X509DataTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getX509DataType()
	 * @generated
	 */
	int X509_DATA_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>X509 Issuer Serial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE__X509_ISSUER_SERIAL = 1;

	/**
	 * The feature id for the '<em><b>X509SKI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE__X509_SKI = 2;

	/**
	 * The feature id for the '<em><b>X509 Subject Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE__X509_SUBJECT_NAME = 3;

	/**
	 * The feature id for the '<em><b>X509 Certificate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE__X509_CERTIFICATE = 4;

	/**
	 * The feature id for the '<em><b>X509CRL</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE__X509_CRL = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE__ANY = 6;

	/**
	 * The number of structural features of the '<em>X509 Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.X509DataType1Impl <em>X509 Data Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.X509DataType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getX509DataType1()
	 * @generated
	 */
	int X509_DATA_TYPE1 = 42;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>X509 Issuer Serial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE1__X509_ISSUER_SERIAL = 1;

	/**
	 * The feature id for the '<em><b>X509SKI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE1__X509_SKI = 2;

	/**
	 * The feature id for the '<em><b>X509 Subject Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE1__X509_SUBJECT_NAME = 3;

	/**
	 * The feature id for the '<em><b>X509 Certificate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE1__X509_CERTIFICATE = 4;

	/**
	 * The feature id for the '<em><b>X509CRL</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE1__X509_CRL = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE1__ANY = 6;

	/**
	 * The number of structural features of the '<em>X509 Data Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_DATA_TYPE1_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.X509IssuerSerialTypeImpl <em>X509 Issuer Serial Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.X509IssuerSerialTypeImpl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getX509IssuerSerialType()
	 * @generated
	 */
	int X509_ISSUER_SERIAL_TYPE = 43;

	/**
	 * The feature id for the '<em><b>X509 Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_SERIAL_TYPE__X509_ISSUER_NAME = 0;

	/**
	 * The feature id for the '<em><b>X509 Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_SERIAL_TYPE__X509_SERIAL_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>X509 Issuer Serial Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_SERIAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2000._09.xmldsig.impl.X509IssuerSerialType1Impl <em>X509 Issuer Serial Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.X509IssuerSerialType1Impl
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getX509IssuerSerialType1()
	 * @generated
	 */
	int X509_ISSUER_SERIAL_TYPE1 = 44;

	/**
	 * The feature id for the '<em><b>X509 Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_SERIAL_TYPE1__X509_ISSUER_NAME = 0;

	/**
	 * The feature id for the '<em><b>X509 Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_SERIAL_TYPE1__X509_SERIAL_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>X509 Issuer Serial Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_SERIAL_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>Crypto Binary</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getCryptoBinary()
	 * @generated
	 */
	int CRYPTO_BINARY = 45;

	/**
	 * The meta object id for the '<em>Crypto Binary1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getCryptoBinary1()
	 * @generated
	 */
	int CRYPTO_BINARY1 = 46;

	/**
	 * The meta object id for the '<em>Digest Value Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDigestValueType()
	 * @generated
	 */
	int DIGEST_VALUE_TYPE = 47;

	/**
	 * The meta object id for the '<em>Digest Value Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDigestValueType1()
	 * @generated
	 */
	int DIGEST_VALUE_TYPE1 = 48;

	/**
	 * The meta object id for the '<em>HMAC Output Length Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getHMACOutputLengthType()
	 * @generated
	 */
	int HMAC_OUTPUT_LENGTH_TYPE = 49;

	/**
	 * The meta object id for the '<em>HMAC Output Length Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getHMACOutputLengthType1()
	 * @generated
	 */
	int HMAC_OUTPUT_LENGTH_TYPE1 = 50;


	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType <em>Canonicalization Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canonicalization Method Type</em>'.
	 * @see org.w3._2000._09.xmldsig.CanonicalizationMethodType
	 * @generated
	 */
	EClass getCanonicalizationMethodType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.CanonicalizationMethodType#getMixed()
	 * @see #getCanonicalizationMethodType()
	 * @generated
	 */
	EAttribute getCanonicalizationMethodType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.CanonicalizationMethodType#getAny()
	 * @see #getCanonicalizationMethodType()
	 * @generated
	 */
	EAttribute getCanonicalizationMethodType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.w3._2000._09.xmldsig.CanonicalizationMethodType#getAlgorithm()
	 * @see #getCanonicalizationMethodType()
	 * @generated
	 */
	EAttribute getCanonicalizationMethodType_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType1 <em>Canonicalization Method Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canonicalization Method Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.CanonicalizationMethodType1
	 * @generated
	 */
	EClass getCanonicalizationMethodType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType1#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.CanonicalizationMethodType1#getMixed()
	 * @see #getCanonicalizationMethodType1()
	 * @generated
	 */
	EAttribute getCanonicalizationMethodType1_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.CanonicalizationMethodType1#getAny()
	 * @see #getCanonicalizationMethodType1()
	 * @generated
	 */
	EAttribute getCanonicalizationMethodType1_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType1#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.w3._2000._09.xmldsig.CanonicalizationMethodType1#getAlgorithm()
	 * @see #getCanonicalizationMethodType1()
	 * @generated
	 */
	EAttribute getCanonicalizationMethodType1_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.DigestMethodType <em>Digest Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digest Method Type</em>'.
	 * @see org.w3._2000._09.xmldsig.DigestMethodType
	 * @generated
	 */
	EClass getDigestMethodType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.DigestMethodType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.DigestMethodType#getMixed()
	 * @see #getDigestMethodType()
	 * @generated
	 */
	EAttribute getDigestMethodType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.DigestMethodType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.DigestMethodType#getAny()
	 * @see #getDigestMethodType()
	 * @generated
	 */
	EAttribute getDigestMethodType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DigestMethodType#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.w3._2000._09.xmldsig.DigestMethodType#getAlgorithm()
	 * @see #getDigestMethodType()
	 * @generated
	 */
	EAttribute getDigestMethodType_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.DigestMethodType1 <em>Digest Method Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digest Method Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.DigestMethodType1
	 * @generated
	 */
	EClass getDigestMethodType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.DigestMethodType1#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.DigestMethodType1#getMixed()
	 * @see #getDigestMethodType1()
	 * @generated
	 */
	EAttribute getDigestMethodType1_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.DigestMethodType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.DigestMethodType1#getAny()
	 * @see #getDigestMethodType1()
	 * @generated
	 */
	EAttribute getDigestMethodType1_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DigestMethodType1#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.w3._2000._09.xmldsig.DigestMethodType1#getAlgorithm()
	 * @see #getDigestMethodType1()
	 * @generated
	 */
	EAttribute getDigestMethodType1_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3._2000._09.xmldsig.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3._2000._09.xmldsig.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getCanonicalizationMethod <em>Canonicalization Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canonicalization Method</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getCanonicalizationMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CanonicalizationMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestMethod <em>Digest Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digest Method</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getDigestMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DigestMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestValue <em>Digest Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest Value</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getDigestValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DigestValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDSAKeyValue <em>DSA Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DSA Key Value</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getDSAKeyValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DSAKeyValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyInfo <em>Key Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Info</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getKeyInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KeyInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getKeyName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_KeyName();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Value</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getKeyValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KeyValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getManifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manifest</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getManifest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Manifest();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DocumentRoot#getMgmtData <em>Mgmt Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mgmt Data</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getMgmtData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MgmtData();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Object();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getPGPData <em>PGP Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PGP Data</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getPGPData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PGPData();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getRetrievalMethod <em>Retrieval Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retrieval Method</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getRetrievalMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RetrievalMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getRSAKeyValue <em>RSA Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RSA Key Value</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getRSAKeyValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RSAKeyValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignature()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Signature();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureMethod <em>Signature Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Method</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignatureMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignatureMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperties <em>Signature Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Properties</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignatureProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperty <em>Signature Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Property</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignatureProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureValue <em>Signature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Value</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignatureValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignatureValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignedInfo <em>Signed Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signed Info</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignedInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignedInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSPKIData <em>SPKI Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPKI Data</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSPKIData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SPKIData();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getTransform()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transform();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transforms</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getTransforms()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transforms();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getX509Data <em>X509 Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X509 Data</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getX509Data()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_X509Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getCanonicalizationMethod1 <em>Canonicalization Method1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canonicalization Method1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getCanonicalizationMethod1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CanonicalizationMethod1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestMethod1 <em>Digest Method1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digest Method1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getDigestMethod1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DigestMethod1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestValue1 <em>Digest Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest Value1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getDigestValue1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DigestValue1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDSAKeyValue1 <em>DSA Key Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DSA Key Value1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getDSAKeyValue1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DSAKeyValue1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyInfo1 <em>Key Info1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Info1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getKeyInfo1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KeyInfo1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyName1 <em>Key Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getKeyName1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_KeyName1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyValue1 <em>Key Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Value1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getKeyValue1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KeyValue1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getManifest1 <em>Manifest1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manifest1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getManifest1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Manifest1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DocumentRoot#getMgmtData1 <em>Mgmt Data1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mgmt Data1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getMgmtData1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MgmtData1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getObject1 <em>Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getObject1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Object1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getPGPData1 <em>PGP Data1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PGP Data1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getPGPData1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PGPData1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getReference1 <em>Reference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getReference1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Reference1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getRetrievalMethod1 <em>Retrieval Method1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retrieval Method1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getRetrievalMethod1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RetrievalMethod1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getRSAKeyValue1 <em>RSA Key Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RSA Key Value1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getRSAKeyValue1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RSAKeyValue1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignature1 <em>Signature1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignature1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Signature1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureMethod1 <em>Signature Method1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Method1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignatureMethod1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignatureMethod1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperties1 <em>Signature Properties1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Properties1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperties1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignatureProperties1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperty1 <em>Signature Property1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Property1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperty1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignatureProperty1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureValue1 <em>Signature Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Value1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignatureValue1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignatureValue1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignedInfo1 <em>Signed Info1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signed Info1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSignedInfo1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignedInfo1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSPKIData1 <em>SPKI Data1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPKI Data1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getSPKIData1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SPKIData1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransform1 <em>Transform1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getTransform1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transform1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransforms1 <em>Transforms1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transforms1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getTransforms1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transforms1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.DocumentRoot#getX509Data1 <em>X509 Data1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X509 Data1</em>'.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot#getX509Data1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_X509Data1();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.DSAKeyValueType <em>DSA Key Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSA Key Value Type</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType
	 * @generated
	 */
	EClass getDSAKeyValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType#getP()
	 * @see #getDSAKeyValueType()
	 * @generated
	 */
	EAttribute getDSAKeyValueType_P();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Q</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType#getQ()
	 * @see #getDSAKeyValueType()
	 * @generated
	 */
	EAttribute getDSAKeyValueType_Q();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType#getG()
	 * @see #getDSAKeyValueType()
	 * @generated
	 */
	EAttribute getDSAKeyValueType_G();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType#getY()
	 * @see #getDSAKeyValueType()
	 * @generated
	 */
	EAttribute getDSAKeyValueType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getJ <em>J</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>J</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType#getJ()
	 * @see #getDSAKeyValueType()
	 * @generated
	 */
	EAttribute getDSAKeyValueType_J();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType#getSeed()
	 * @see #getDSAKeyValueType()
	 * @generated
	 */
	EAttribute getDSAKeyValueType_Seed();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getPgenCounter <em>Pgen Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pgen Counter</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType#getPgenCounter()
	 * @see #getDSAKeyValueType()
	 * @generated
	 */
	EAttribute getDSAKeyValueType_PgenCounter();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.DSAKeyValueType1 <em>DSA Key Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSA Key Value Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType1
	 * @generated
	 */
	EClass getDSAKeyValueType1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType1#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType1#getP()
	 * @see #getDSAKeyValueType1()
	 * @generated
	 */
	EAttribute getDSAKeyValueType1_P();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType1#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Q</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType1#getQ()
	 * @see #getDSAKeyValueType1()
	 * @generated
	 */
	EAttribute getDSAKeyValueType1_Q();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType1#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType1#getG()
	 * @see #getDSAKeyValueType1()
	 * @generated
	 */
	EAttribute getDSAKeyValueType1_G();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType1#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType1#getY()
	 * @see #getDSAKeyValueType1()
	 * @generated
	 */
	EAttribute getDSAKeyValueType1_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType1#getJ <em>J</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>J</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType1#getJ()
	 * @see #getDSAKeyValueType1()
	 * @generated
	 */
	EAttribute getDSAKeyValueType1_J();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType1#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType1#getSeed()
	 * @see #getDSAKeyValueType1()
	 * @generated
	 */
	EAttribute getDSAKeyValueType1_Seed();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.DSAKeyValueType1#getPgenCounter <em>Pgen Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pgen Counter</em>'.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType1#getPgenCounter()
	 * @see #getDSAKeyValueType1()
	 * @generated
	 */
	EAttribute getDSAKeyValueType1_PgenCounter();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.KeyInfoType <em>Key Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Info Type</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType
	 * @generated
	 */
	EClass getKeyInfoType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyInfoType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType#getMixed()
	 * @see #getKeyInfoType()
	 * @generated
	 */
	EAttribute getKeyInfoType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyInfoType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType#getGroup()
	 * @see #getKeyInfoType()
	 * @generated
	 */
	EAttribute getKeyInfoType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyInfoType#getKeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Key Name</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType#getKeyName()
	 * @see #getKeyInfoType()
	 * @generated
	 */
	EAttribute getKeyInfoType_KeyName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.KeyInfoType#getKeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Value</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType#getKeyValue()
	 * @see #getKeyInfoType()
	 * @generated
	 */
	EReference getKeyInfoType_KeyValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.KeyInfoType#getRetrievalMethod <em>Retrieval Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Retrieval Method</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType#getRetrievalMethod()
	 * @see #getKeyInfoType()
	 * @generated
	 */
	EReference getKeyInfoType_RetrievalMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.KeyInfoType#getX509Data <em>X509 Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>X509 Data</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType#getX509Data()
	 * @see #getKeyInfoType()
	 * @generated
	 */
	EReference getKeyInfoType_X509Data();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.KeyInfoType#getPGPData <em>PGP Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PGP Data</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType#getPGPData()
	 * @see #getKeyInfoType()
	 * @generated
	 */
	EReference getKeyInfoType_PGPData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.KeyInfoType#getSPKIData <em>SPKI Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPKI Data</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType#getSPKIData()
	 * @see #getKeyInfoType()
	 * @generated
	 */
	EReference getKeyInfoType_SPKIData();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyInfoType#getMgmtData <em>Mgmt Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mgmt Data</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType#getMgmtData()
	 * @see #getKeyInfoType()
	 * @generated
	 */
	EAttribute getKeyInfoType_MgmtData();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyInfoType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType#getAny()
	 * @see #getKeyInfoType()
	 * @generated
	 */
	EAttribute getKeyInfoType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.KeyInfoType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType#getId()
	 * @see #getKeyInfoType()
	 * @generated
	 */
	EAttribute getKeyInfoType_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.KeyInfoType1 <em>Key Info Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Info Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1
	 * @generated
	 */
	EClass getKeyInfoType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1#getMixed()
	 * @see #getKeyInfoType1()
	 * @generated
	 */
	EAttribute getKeyInfoType1_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1#getGroup()
	 * @see #getKeyInfoType1()
	 * @generated
	 */
	EAttribute getKeyInfoType1_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getKeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Key Name</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1#getKeyName()
	 * @see #getKeyInfoType1()
	 * @generated
	 */
	EAttribute getKeyInfoType1_KeyName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getKeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Value</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1#getKeyValue()
	 * @see #getKeyInfoType1()
	 * @generated
	 */
	EReference getKeyInfoType1_KeyValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getRetrievalMethod <em>Retrieval Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Retrieval Method</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1#getRetrievalMethod()
	 * @see #getKeyInfoType1()
	 * @generated
	 */
	EReference getKeyInfoType1_RetrievalMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getX509Data <em>X509 Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>X509 Data</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1#getX509Data()
	 * @see #getKeyInfoType1()
	 * @generated
	 */
	EReference getKeyInfoType1_X509Data();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getPGPData <em>PGP Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PGP Data</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1#getPGPData()
	 * @see #getKeyInfoType1()
	 * @generated
	 */
	EReference getKeyInfoType1_PGPData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getSPKIData <em>SPKI Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPKI Data</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1#getSPKIData()
	 * @see #getKeyInfoType1()
	 * @generated
	 */
	EReference getKeyInfoType1_SPKIData();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getMgmtData <em>Mgmt Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mgmt Data</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1#getMgmtData()
	 * @see #getKeyInfoType1()
	 * @generated
	 */
	EAttribute getKeyInfoType1_MgmtData();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1#getAny()
	 * @see #getKeyInfoType1()
	 * @generated
	 */
	EAttribute getKeyInfoType1_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1#getId()
	 * @see #getKeyInfoType1()
	 * @generated
	 */
	EAttribute getKeyInfoType1_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.KeyValueType <em>Key Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Type</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyValueType
	 * @generated
	 */
	EClass getKeyValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyValueType#getMixed()
	 * @see #getKeyValueType()
	 * @generated
	 */
	EAttribute getKeyValueType_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.KeyValueType#getDSAKeyValue <em>DSA Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DSA Key Value</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyValueType#getDSAKeyValue()
	 * @see #getKeyValueType()
	 * @generated
	 */
	EReference getKeyValueType_DSAKeyValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.KeyValueType#getRSAKeyValue <em>RSA Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RSA Key Value</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyValueType#getRSAKeyValue()
	 * @see #getKeyValueType()
	 * @generated
	 */
	EReference getKeyValueType_RSAKeyValue();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyValueType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyValueType#getAny()
	 * @see #getKeyValueType()
	 * @generated
	 */
	EAttribute getKeyValueType_Any();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.KeyValueType1 <em>Key Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyValueType1
	 * @generated
	 */
	EClass getKeyValueType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyValueType1#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyValueType1#getMixed()
	 * @see #getKeyValueType1()
	 * @generated
	 */
	EAttribute getKeyValueType1_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.KeyValueType1#getDSAKeyValue <em>DSA Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DSA Key Value</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyValueType1#getDSAKeyValue()
	 * @see #getKeyValueType1()
	 * @generated
	 */
	EReference getKeyValueType1_DSAKeyValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.KeyValueType1#getRSAKeyValue <em>RSA Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RSA Key Value</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyValueType1#getRSAKeyValue()
	 * @see #getKeyValueType1()
	 * @generated
	 */
	EReference getKeyValueType1_RSAKeyValue();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.KeyValueType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.KeyValueType1#getAny()
	 * @see #getKeyValueType1()
	 * @generated
	 */
	EAttribute getKeyValueType1_Any();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.ManifestType <em>Manifest Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifest Type</em>'.
	 * @see org.w3._2000._09.xmldsig.ManifestType
	 * @generated
	 */
	EClass getManifestType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.ManifestType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.w3._2000._09.xmldsig.ManifestType#getReference()
	 * @see #getManifestType()
	 * @generated
	 */
	EReference getManifestType_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ManifestType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.ManifestType#getId()
	 * @see #getManifestType()
	 * @generated
	 */
	EAttribute getManifestType_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.ManifestType1 <em>Manifest Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifest Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.ManifestType1
	 * @generated
	 */
	EClass getManifestType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.ManifestType1#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.w3._2000._09.xmldsig.ManifestType1#getReference()
	 * @see #getManifestType1()
	 * @generated
	 */
	EReference getManifestType1_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ManifestType1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.ManifestType1#getId()
	 * @see #getManifestType1()
	 * @generated
	 */
	EAttribute getManifestType1_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.ObjectType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType#getMixed()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.ObjectType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType#getGroup()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.ObjectType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType#getAny()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ObjectType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType#getEncoding()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ObjectType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType#getId()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ObjectType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType#getMimeType()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_MimeType();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.ObjectType1 <em>Object Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType1
	 * @generated
	 */
	EClass getObjectType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.ObjectType1#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType1#getMixed()
	 * @see #getObjectType1()
	 * @generated
	 */
	EAttribute getObjectType1_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.ObjectType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType1#getGroup()
	 * @see #getObjectType1()
	 * @generated
	 */
	EAttribute getObjectType1_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.ObjectType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType1#getAny()
	 * @see #getObjectType1()
	 * @generated
	 */
	EAttribute getObjectType1_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ObjectType1#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType1#getEncoding()
	 * @see #getObjectType1()
	 * @generated
	 */
	EAttribute getObjectType1_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ObjectType1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType1#getId()
	 * @see #getObjectType1()
	 * @generated
	 */
	EAttribute getObjectType1_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ObjectType1#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.w3._2000._09.xmldsig.ObjectType1#getMimeType()
	 * @see #getObjectType1()
	 * @generated
	 */
	EAttribute getObjectType1_MimeType();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.PGPDataType <em>PGP Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PGP Data Type</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType
	 * @generated
	 */
	EClass getPGPDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.PGPDataType#getPGPKeyID <em>PGP Key ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PGP Key ID</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType#getPGPKeyID()
	 * @see #getPGPDataType()
	 * @generated
	 */
	EAttribute getPGPDataType_PGPKeyID();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.PGPDataType#getPGPKeyPacket <em>PGP Key Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PGP Key Packet</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType#getPGPKeyPacket()
	 * @see #getPGPDataType()
	 * @generated
	 */
	EAttribute getPGPDataType_PGPKeyPacket();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.PGPDataType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType#getAny()
	 * @see #getPGPDataType()
	 * @generated
	 */
	EAttribute getPGPDataType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.PGPDataType#getPGPKeyPacket1 <em>PGP Key Packet1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PGP Key Packet1</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType#getPGPKeyPacket1()
	 * @see #getPGPDataType()
	 * @generated
	 */
	EAttribute getPGPDataType_PGPKeyPacket1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.PGPDataType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType#getAny1()
	 * @see #getPGPDataType()
	 * @generated
	 */
	EAttribute getPGPDataType_Any1();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.PGPDataType1 <em>PGP Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PGP Data Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType1
	 * @generated
	 */
	EClass getPGPDataType1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyID <em>PGP Key ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PGP Key ID</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyID()
	 * @see #getPGPDataType1()
	 * @generated
	 */
	EAttribute getPGPDataType1_PGPKeyID();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyPacket <em>PGP Key Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PGP Key Packet</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyPacket()
	 * @see #getPGPDataType1()
	 * @generated
	 */
	EAttribute getPGPDataType1_PGPKeyPacket();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.PGPDataType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType1#getAny()
	 * @see #getPGPDataType1()
	 * @generated
	 */
	EAttribute getPGPDataType1_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyPacket1 <em>PGP Key Packet1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PGP Key Packet1</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyPacket1()
	 * @see #getPGPDataType1()
	 * @generated
	 */
	EAttribute getPGPDataType1_PGPKeyPacket1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.PGPDataType1#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.w3._2000._09.xmldsig.PGPDataType1#getAny1()
	 * @see #getPGPDataType1()
	 * @generated
	 */
	EAttribute getPGPDataType1_Any1();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.ReferenceType#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transforms</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType#getTransforms()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_Transforms();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.ReferenceType#getDigestMethod <em>Digest Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digest Method</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType#getDigestMethod()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_DigestMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ReferenceType#getDigestValue <em>Digest Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest Value</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType#getDigestValue()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_DigestValue();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ReferenceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType#getId()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ReferenceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType#getType()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ReferenceType#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType#getURI()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_URI();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.ReferenceType1 <em>Reference Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType1
	 * @generated
	 */
	EClass getReferenceType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.ReferenceType1#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transforms</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType1#getTransforms()
	 * @see #getReferenceType1()
	 * @generated
	 */
	EReference getReferenceType1_Transforms();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.ReferenceType1#getDigestMethod <em>Digest Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digest Method</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType1#getDigestMethod()
	 * @see #getReferenceType1()
	 * @generated
	 */
	EReference getReferenceType1_DigestMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ReferenceType1#getDigestValue <em>Digest Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest Value</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType1#getDigestValue()
	 * @see #getReferenceType1()
	 * @generated
	 */
	EAttribute getReferenceType1_DigestValue();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ReferenceType1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType1#getId()
	 * @see #getReferenceType1()
	 * @generated
	 */
	EAttribute getReferenceType1_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ReferenceType1#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType1#getType()
	 * @see #getReferenceType1()
	 * @generated
	 */
	EAttribute getReferenceType1_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.ReferenceType1#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.w3._2000._09.xmldsig.ReferenceType1#getURI()
	 * @see #getReferenceType1()
	 * @generated
	 */
	EAttribute getReferenceType1_URI();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.RetrievalMethodType <em>Retrieval Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retrieval Method Type</em>'.
	 * @see org.w3._2000._09.xmldsig.RetrievalMethodType
	 * @generated
	 */
	EClass getRetrievalMethodType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.RetrievalMethodType#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transforms</em>'.
	 * @see org.w3._2000._09.xmldsig.RetrievalMethodType#getTransforms()
	 * @see #getRetrievalMethodType()
	 * @generated
	 */
	EReference getRetrievalMethodType_Transforms();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.RetrievalMethodType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._2000._09.xmldsig.RetrievalMethodType#getType()
	 * @see #getRetrievalMethodType()
	 * @generated
	 */
	EAttribute getRetrievalMethodType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.RetrievalMethodType#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.w3._2000._09.xmldsig.RetrievalMethodType#getURI()
	 * @see #getRetrievalMethodType()
	 * @generated
	 */
	EAttribute getRetrievalMethodType_URI();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.RetrievalMethodType1 <em>Retrieval Method Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retrieval Method Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.RetrievalMethodType1
	 * @generated
	 */
	EClass getRetrievalMethodType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.RetrievalMethodType1#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transforms</em>'.
	 * @see org.w3._2000._09.xmldsig.RetrievalMethodType1#getTransforms()
	 * @see #getRetrievalMethodType1()
	 * @generated
	 */
	EReference getRetrievalMethodType1_Transforms();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.RetrievalMethodType1#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._2000._09.xmldsig.RetrievalMethodType1#getType()
	 * @see #getRetrievalMethodType1()
	 * @generated
	 */
	EAttribute getRetrievalMethodType1_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.RetrievalMethodType1#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.w3._2000._09.xmldsig.RetrievalMethodType1#getURI()
	 * @see #getRetrievalMethodType1()
	 * @generated
	 */
	EAttribute getRetrievalMethodType1_URI();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.RSAKeyValueType <em>RSA Key Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSA Key Value Type</em>'.
	 * @see org.w3._2000._09.xmldsig.RSAKeyValueType
	 * @generated
	 */
	EClass getRSAKeyValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.RSAKeyValueType#getModulus <em>Modulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulus</em>'.
	 * @see org.w3._2000._09.xmldsig.RSAKeyValueType#getModulus()
	 * @see #getRSAKeyValueType()
	 * @generated
	 */
	EAttribute getRSAKeyValueType_Modulus();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.RSAKeyValueType#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see org.w3._2000._09.xmldsig.RSAKeyValueType#getExponent()
	 * @see #getRSAKeyValueType()
	 * @generated
	 */
	EAttribute getRSAKeyValueType_Exponent();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.RSAKeyValueType1 <em>RSA Key Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSA Key Value Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.RSAKeyValueType1
	 * @generated
	 */
	EClass getRSAKeyValueType1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.RSAKeyValueType1#getModulus <em>Modulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulus</em>'.
	 * @see org.w3._2000._09.xmldsig.RSAKeyValueType1#getModulus()
	 * @see #getRSAKeyValueType1()
	 * @generated
	 */
	EAttribute getRSAKeyValueType1_Modulus();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.RSAKeyValueType1#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see org.w3._2000._09.xmldsig.RSAKeyValueType1#getExponent()
	 * @see #getRSAKeyValueType1()
	 * @generated
	 */
	EAttribute getRSAKeyValueType1_Exponent();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignatureMethodType <em>Signature Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Method Type</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType
	 * @generated
	 */
	EClass getSignatureMethodType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SignatureMethodType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType#getMixed()
	 * @see #getSignatureMethodType()
	 * @generated
	 */
	EAttribute getSignatureMethodType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignatureMethodType#getHMACOutputLength <em>HMAC Output Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HMAC Output Length</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType#getHMACOutputLength()
	 * @see #getSignatureMethodType()
	 * @generated
	 */
	EAttribute getSignatureMethodType_HMACOutputLength();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SignatureMethodType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType#getAny()
	 * @see #getSignatureMethodType()
	 * @generated
	 */
	EAttribute getSignatureMethodType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignatureMethodType#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType#getAlgorithm()
	 * @see #getSignatureMethodType()
	 * @generated
	 */
	EAttribute getSignatureMethodType_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignatureMethodType1 <em>Signature Method Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Method Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType1
	 * @generated
	 */
	EClass getSignatureMethodType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SignatureMethodType1#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType1#getMixed()
	 * @see #getSignatureMethodType1()
	 * @generated
	 */
	EAttribute getSignatureMethodType1_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignatureMethodType1#getHMACOutputLength <em>HMAC Output Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HMAC Output Length</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType1#getHMACOutputLength()
	 * @see #getSignatureMethodType1()
	 * @generated
	 */
	EAttribute getSignatureMethodType1_HMACOutputLength();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SignatureMethodType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType1#getAny()
	 * @see #getSignatureMethodType1()
	 * @generated
	 */
	EAttribute getSignatureMethodType1_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignatureMethodType1#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType1#getAlgorithm()
	 * @see #getSignatureMethodType1()
	 * @generated
	 */
	EAttribute getSignatureMethodType1_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignaturePropertiesType <em>Signature Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Properties Type</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertiesType
	 * @generated
	 */
	EClass getSignaturePropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.SignaturePropertiesType#getSignatureProperty <em>Signature Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature Property</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertiesType#getSignatureProperty()
	 * @see #getSignaturePropertiesType()
	 * @generated
	 */
	EReference getSignaturePropertiesType_SignatureProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignaturePropertiesType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertiesType#getId()
	 * @see #getSignaturePropertiesType()
	 * @generated
	 */
	EAttribute getSignaturePropertiesType_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignaturePropertiesType1 <em>Signature Properties Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Properties Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertiesType1
	 * @generated
	 */
	EClass getSignaturePropertiesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.SignaturePropertiesType1#getSignatureProperty <em>Signature Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature Property</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertiesType1#getSignatureProperty()
	 * @see #getSignaturePropertiesType1()
	 * @generated
	 */
	EReference getSignaturePropertiesType1_SignatureProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignaturePropertiesType1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertiesType1#getId()
	 * @see #getSignaturePropertiesType1()
	 * @generated
	 */
	EAttribute getSignaturePropertiesType1_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignaturePropertyType <em>Signature Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Property Type</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType
	 * @generated
	 */
	EClass getSignaturePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType#getMixed()
	 * @see #getSignaturePropertyType()
	 * @generated
	 */
	EAttribute getSignaturePropertyType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType#getGroup()
	 * @see #getSignaturePropertyType()
	 * @generated
	 */
	EAttribute getSignaturePropertyType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType#getAny()
	 * @see #getSignaturePropertyType()
	 * @generated
	 */
	EAttribute getSignaturePropertyType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType#getId()
	 * @see #getSignaturePropertyType()
	 * @generated
	 */
	EAttribute getSignaturePropertyType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType#getTarget()
	 * @see #getSignaturePropertyType()
	 * @generated
	 */
	EAttribute getSignaturePropertyType_Target();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignaturePropertyType1 <em>Signature Property Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Property Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType1
	 * @generated
	 */
	EClass getSignaturePropertyType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SignaturePropertyType1#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType1#getMixed()
	 * @see #getSignaturePropertyType1()
	 * @generated
	 */
	EAttribute getSignaturePropertyType1_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SignaturePropertyType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType1#getGroup()
	 * @see #getSignaturePropertyType1()
	 * @generated
	 */
	EAttribute getSignaturePropertyType1_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SignaturePropertyType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType1#getAny()
	 * @see #getSignaturePropertyType1()
	 * @generated
	 */
	EAttribute getSignaturePropertyType1_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignaturePropertyType1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType1#getId()
	 * @see #getSignaturePropertyType1()
	 * @generated
	 */
	EAttribute getSignaturePropertyType1_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignaturePropertyType1#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType1#getTarget()
	 * @see #getSignaturePropertyType1()
	 * @generated
	 */
	EAttribute getSignaturePropertyType1_Target();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignatureType <em>Signature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Type</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType
	 * @generated
	 */
	EClass getSignatureType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.SignatureType#getSignedInfo <em>Signed Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signed Info</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType#getSignedInfo()
	 * @see #getSignatureType()
	 * @generated
	 */
	EReference getSignatureType_SignedInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.SignatureType#getSignatureValue <em>Signature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Value</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType#getSignatureValue()
	 * @see #getSignatureType()
	 * @generated
	 */
	EReference getSignatureType_SignatureValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.SignatureType#getKeyInfo <em>Key Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Info</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType#getKeyInfo()
	 * @see #getSignatureType()
	 * @generated
	 */
	EReference getSignatureType_KeyInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.SignatureType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType#getObject()
	 * @see #getSignatureType()
	 * @generated
	 */
	EReference getSignatureType_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignatureType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType#getId()
	 * @see #getSignatureType()
	 * @generated
	 */
	EAttribute getSignatureType_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignatureType1 <em>Signature Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType1
	 * @generated
	 */
	EClass getSignatureType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.SignatureType1#getSignedInfo <em>Signed Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signed Info</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType1#getSignedInfo()
	 * @see #getSignatureType1()
	 * @generated
	 */
	EReference getSignatureType1_SignedInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.SignatureType1#getSignatureValue <em>Signature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Value</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType1#getSignatureValue()
	 * @see #getSignatureType1()
	 * @generated
	 */
	EReference getSignatureType1_SignatureValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.SignatureType1#getKeyInfo <em>Key Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Info</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType1#getKeyInfo()
	 * @see #getSignatureType1()
	 * @generated
	 */
	EReference getSignatureType1_KeyInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.SignatureType1#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType1#getObject()
	 * @see #getSignatureType1()
	 * @generated
	 */
	EReference getSignatureType1_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignatureType1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureType1#getId()
	 * @see #getSignatureType1()
	 * @generated
	 */
	EAttribute getSignatureType1_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignatureValueType <em>Signature Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Value Type</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureValueType
	 * @generated
	 */
	EClass getSignatureValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignatureValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureValueType#getValue()
	 * @see #getSignatureValueType()
	 * @generated
	 */
	EAttribute getSignatureValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignatureValueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureValueType#getId()
	 * @see #getSignatureValueType()
	 * @generated
	 */
	EAttribute getSignatureValueType_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignatureValueType1 <em>Signature Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Value Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureValueType1
	 * @generated
	 */
	EClass getSignatureValueType1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignatureValueType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureValueType1#getValue()
	 * @see #getSignatureValueType1()
	 * @generated
	 */
	EAttribute getSignatureValueType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignatureValueType1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.SignatureValueType1#getId()
	 * @see #getSignatureValueType1()
	 * @generated
	 */
	EAttribute getSignatureValueType1_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignedInfoType <em>Signed Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signed Info Type</em>'.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType
	 * @generated
	 */
	EClass getSignedInfoType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.SignedInfoType#getCanonicalizationMethod <em>Canonicalization Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canonicalization Method</em>'.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType#getCanonicalizationMethod()
	 * @see #getSignedInfoType()
	 * @generated
	 */
	EReference getSignedInfoType_CanonicalizationMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.SignedInfoType#getSignatureMethod <em>Signature Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Method</em>'.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType#getSignatureMethod()
	 * @see #getSignedInfoType()
	 * @generated
	 */
	EReference getSignedInfoType_SignatureMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.SignedInfoType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType#getReference()
	 * @see #getSignedInfoType()
	 * @generated
	 */
	EReference getSignedInfoType_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignedInfoType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType#getId()
	 * @see #getSignedInfoType()
	 * @generated
	 */
	EAttribute getSignedInfoType_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SignedInfoType1 <em>Signed Info Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signed Info Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType1
	 * @generated
	 */
	EClass getSignedInfoType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.SignedInfoType1#getCanonicalizationMethod <em>Canonicalization Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canonicalization Method</em>'.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType1#getCanonicalizationMethod()
	 * @see #getSignedInfoType1()
	 * @generated
	 */
	EReference getSignedInfoType1_CanonicalizationMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2000._09.xmldsig.SignedInfoType1#getSignatureMethod <em>Signature Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Method</em>'.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType1#getSignatureMethod()
	 * @see #getSignedInfoType1()
	 * @generated
	 */
	EReference getSignedInfoType1_SignatureMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.SignedInfoType1#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType1#getReference()
	 * @see #getSignedInfoType1()
	 * @generated
	 */
	EReference getSignedInfoType1_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.SignedInfoType1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType1#getId()
	 * @see #getSignedInfoType1()
	 * @generated
	 */
	EAttribute getSignedInfoType1_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SPKIDataType <em>SPKI Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPKI Data Type</em>'.
	 * @see org.w3._2000._09.xmldsig.SPKIDataType
	 * @generated
	 */
	EClass getSPKIDataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SPKIDataType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.SPKIDataType#getGroup()
	 * @see #getSPKIDataType()
	 * @generated
	 */
	EAttribute getSPKIDataType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SPKIDataType#getSPKISexp <em>SPKI Sexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SPKI Sexp</em>'.
	 * @see org.w3._2000._09.xmldsig.SPKIDataType#getSPKISexp()
	 * @see #getSPKIDataType()
	 * @generated
	 */
	EAttribute getSPKIDataType_SPKISexp();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SPKIDataType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.SPKIDataType#getAny()
	 * @see #getSPKIDataType()
	 * @generated
	 */
	EAttribute getSPKIDataType_Any();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.SPKIDataType1 <em>SPKI Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPKI Data Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.SPKIDataType1
	 * @generated
	 */
	EClass getSPKIDataType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SPKIDataType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.SPKIDataType1#getGroup()
	 * @see #getSPKIDataType1()
	 * @generated
	 */
	EAttribute getSPKIDataType1_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SPKIDataType1#getSPKISexp <em>SPKI Sexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SPKI Sexp</em>'.
	 * @see org.w3._2000._09.xmldsig.SPKIDataType1#getSPKISexp()
	 * @see #getSPKIDataType1()
	 * @generated
	 */
	EAttribute getSPKIDataType1_SPKISexp();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.SPKIDataType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.SPKIDataType1#getAny()
	 * @see #getSPKIDataType1()
	 * @generated
	 */
	EAttribute getSPKIDataType1_Any();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.TransformsType <em>Transforms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transforms Type</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformsType
	 * @generated
	 */
	EClass getTransformsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.TransformsType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformsType#getTransform()
	 * @see #getTransformsType()
	 * @generated
	 */
	EReference getTransformsType_Transform();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.TransformsType1 <em>Transforms Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transforms Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformsType1
	 * @generated
	 */
	EClass getTransformsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.TransformsType1#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformsType1#getTransform()
	 * @see #getTransformsType1()
	 * @generated
	 */
	EReference getTransformsType1_Transform();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.TransformType <em>Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Type</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType
	 * @generated
	 */
	EClass getTransformType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.TransformType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType#getMixed()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.TransformType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType#getGroup()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.TransformType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType#getAny()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.TransformType#getXPath <em>XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>XPath</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType#getXPath()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_XPath();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.TransformType#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType#getAlgorithm()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.TransformType1 <em>Transform Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType1
	 * @generated
	 */
	EClass getTransformType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.TransformType1#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType1#getMixed()
	 * @see #getTransformType1()
	 * @generated
	 */
	EAttribute getTransformType1_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.TransformType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType1#getGroup()
	 * @see #getTransformType1()
	 * @generated
	 */
	EAttribute getTransformType1_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.TransformType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType1#getAny()
	 * @see #getTransformType1()
	 * @generated
	 */
	EAttribute getTransformType1_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.TransformType1#getXPath <em>XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>XPath</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType1#getXPath()
	 * @see #getTransformType1()
	 * @generated
	 */
	EAttribute getTransformType1_XPath();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.TransformType1#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.w3._2000._09.xmldsig.TransformType1#getAlgorithm()
	 * @see #getTransformType1()
	 * @generated
	 */
	EAttribute getTransformType1_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.X509DataType <em>X509 Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X509 Data Type</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType
	 * @generated
	 */
	EClass getX509DataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType#getGroup()
	 * @see #getX509DataType()
	 * @generated
	 */
	EAttribute getX509DataType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.X509DataType#getX509IssuerSerial <em>X509 Issuer Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>X509 Issuer Serial</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType#getX509IssuerSerial()
	 * @see #getX509DataType()
	 * @generated
	 */
	EReference getX509DataType_X509IssuerSerial();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType#getX509SKI <em>X509SKI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>X509SKI</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType#getX509SKI()
	 * @see #getX509DataType()
	 * @generated
	 */
	EAttribute getX509DataType_X509SKI();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType#getX509SubjectName <em>X509 Subject Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>X509 Subject Name</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType#getX509SubjectName()
	 * @see #getX509DataType()
	 * @generated
	 */
	EAttribute getX509DataType_X509SubjectName();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType#getX509Certificate <em>X509 Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>X509 Certificate</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType#getX509Certificate()
	 * @see #getX509DataType()
	 * @generated
	 */
	EAttribute getX509DataType_X509Certificate();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType#getX509CRL <em>X509CRL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>X509CRL</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType#getX509CRL()
	 * @see #getX509DataType()
	 * @generated
	 */
	EAttribute getX509DataType_X509CRL();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType#getAny()
	 * @see #getX509DataType()
	 * @generated
	 */
	EAttribute getX509DataType_Any();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.X509DataType1 <em>X509 Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X509 Data Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType1
	 * @generated
	 */
	EClass getX509DataType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType1#getGroup()
	 * @see #getX509DataType1()
	 * @generated
	 */
	EAttribute getX509DataType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2000._09.xmldsig.X509DataType1#getX509IssuerSerial <em>X509 Issuer Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>X509 Issuer Serial</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType1#getX509IssuerSerial()
	 * @see #getX509DataType1()
	 * @generated
	 */
	EReference getX509DataType1_X509IssuerSerial();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType1#getX509SKI <em>X509SKI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>X509SKI</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType1#getX509SKI()
	 * @see #getX509DataType1()
	 * @generated
	 */
	EAttribute getX509DataType1_X509SKI();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType1#getX509SubjectName <em>X509 Subject Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>X509 Subject Name</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType1#getX509SubjectName()
	 * @see #getX509DataType1()
	 * @generated
	 */
	EAttribute getX509DataType1_X509SubjectName();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType1#getX509Certificate <em>X509 Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>X509 Certificate</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType1#getX509Certificate()
	 * @see #getX509DataType1()
	 * @generated
	 */
	EAttribute getX509DataType1_X509Certificate();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType1#getX509CRL <em>X509CRL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>X509CRL</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType1#getX509CRL()
	 * @see #getX509DataType1()
	 * @generated
	 */
	EAttribute getX509DataType1_X509CRL();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2000._09.xmldsig.X509DataType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2000._09.xmldsig.X509DataType1#getAny()
	 * @see #getX509DataType1()
	 * @generated
	 */
	EAttribute getX509DataType1_Any();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.X509IssuerSerialType <em>X509 Issuer Serial Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X509 Issuer Serial Type</em>'.
	 * @see org.w3._2000._09.xmldsig.X509IssuerSerialType
	 * @generated
	 */
	EClass getX509IssuerSerialType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.X509IssuerSerialType#getX509IssuerName <em>X509 Issuer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X509 Issuer Name</em>'.
	 * @see org.w3._2000._09.xmldsig.X509IssuerSerialType#getX509IssuerName()
	 * @see #getX509IssuerSerialType()
	 * @generated
	 */
	EAttribute getX509IssuerSerialType_X509IssuerName();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.X509IssuerSerialType#getX509SerialNumber <em>X509 Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X509 Serial Number</em>'.
	 * @see org.w3._2000._09.xmldsig.X509IssuerSerialType#getX509SerialNumber()
	 * @see #getX509IssuerSerialType()
	 * @generated
	 */
	EAttribute getX509IssuerSerialType_X509SerialNumber();

	/**
	 * Returns the meta object for class '{@link org.w3._2000._09.xmldsig.X509IssuerSerialType1 <em>X509 Issuer Serial Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X509 Issuer Serial Type1</em>'.
	 * @see org.w3._2000._09.xmldsig.X509IssuerSerialType1
	 * @generated
	 */
	EClass getX509IssuerSerialType1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.X509IssuerSerialType1#getX509IssuerName <em>X509 Issuer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X509 Issuer Name</em>'.
	 * @see org.w3._2000._09.xmldsig.X509IssuerSerialType1#getX509IssuerName()
	 * @see #getX509IssuerSerialType1()
	 * @generated
	 */
	EAttribute getX509IssuerSerialType1_X509IssuerName();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2000._09.xmldsig.X509IssuerSerialType1#getX509SerialNumber <em>X509 Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X509 Serial Number</em>'.
	 * @see org.w3._2000._09.xmldsig.X509IssuerSerialType1#getX509SerialNumber()
	 * @see #getX509IssuerSerialType1()
	 * @generated
	 */
	EAttribute getX509IssuerSerialType1_X509SerialNumber();

	/**
	 * Returns the meta object for data type '<em>Crypto Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Crypto Binary</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='CryptoBinary' baseType='http://www.eclipse.org/emf/2003/XMLType#base64Binary'"
	 * @generated
	 */
	EDataType getCryptoBinary();

	/**
	 * Returns the meta object for data type '<em>Crypto Binary1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Crypto Binary1</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='CryptoBinary' baseType='http://www.eclipse.org/emf/2003/XMLType#base64Binary'"
	 * @generated
	 */
	EDataType getCryptoBinary1();

	/**
	 * Returns the meta object for data type '<em>Digest Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Digest Value Type</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='DigestValueType' baseType='http://www.eclipse.org/emf/2003/XMLType#base64Binary'"
	 * @generated
	 */
	EDataType getDigestValueType();

	/**
	 * Returns the meta object for data type '<em>Digest Value Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Digest Value Type1</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='DigestValueType' baseType='http://www.eclipse.org/emf/2003/XMLType#base64Binary'"
	 * @generated
	 */
	EDataType getDigestValueType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>HMAC Output Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>HMAC Output Length Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='HMACOutputLengthType' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getHMACOutputLengthType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>HMAC Output Length Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>HMAC Output Length Type1</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='HMACOutputLengthType' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getHMACOutputLengthType1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmldsigFactory getXmldsigFactory();

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
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.CanonicalizationMethodTypeImpl <em>Canonicalization Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.CanonicalizationMethodTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getCanonicalizationMethodType()
		 * @generated
		 */
		EClass CANONICALIZATION_METHOD_TYPE = eINSTANCE.getCanonicalizationMethodType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANONICALIZATION_METHOD_TYPE__MIXED = eINSTANCE.getCanonicalizationMethodType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANONICALIZATION_METHOD_TYPE__ANY = eINSTANCE.getCanonicalizationMethodType_Any();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANONICALIZATION_METHOD_TYPE__ALGORITHM = eINSTANCE.getCanonicalizationMethodType_Algorithm();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.CanonicalizationMethodType1Impl <em>Canonicalization Method Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.CanonicalizationMethodType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getCanonicalizationMethodType1()
		 * @generated
		 */
		EClass CANONICALIZATION_METHOD_TYPE1 = eINSTANCE.getCanonicalizationMethodType1();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANONICALIZATION_METHOD_TYPE1__MIXED = eINSTANCE.getCanonicalizationMethodType1_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANONICALIZATION_METHOD_TYPE1__ANY = eINSTANCE.getCanonicalizationMethodType1_Any();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANONICALIZATION_METHOD_TYPE1__ALGORITHM = eINSTANCE.getCanonicalizationMethodType1_Algorithm();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.DigestMethodTypeImpl <em>Digest Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.DigestMethodTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDigestMethodType()
		 * @generated
		 */
		EClass DIGEST_METHOD_TYPE = eINSTANCE.getDigestMethodType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_METHOD_TYPE__MIXED = eINSTANCE.getDigestMethodType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_METHOD_TYPE__ANY = eINSTANCE.getDigestMethodType_Any();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_METHOD_TYPE__ALGORITHM = eINSTANCE.getDigestMethodType_Algorithm();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.DigestMethodType1Impl <em>Digest Method Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.DigestMethodType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDigestMethodType1()
		 * @generated
		 */
		EClass DIGEST_METHOD_TYPE1 = eINSTANCE.getDigestMethodType1();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_METHOD_TYPE1__MIXED = eINSTANCE.getDigestMethodType1_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_METHOD_TYPE1__ANY = eINSTANCE.getDigestMethodType1_Any();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_METHOD_TYPE1__ALGORITHM = eINSTANCE.getDigestMethodType1_Algorithm();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.DocumentRootImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Canonicalization Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CANONICALIZATION_METHOD = eINSTANCE.getDocumentRoot_CanonicalizationMethod();

		/**
		 * The meta object literal for the '<em><b>Digest Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIGEST_METHOD = eINSTANCE.getDocumentRoot_DigestMethod();

		/**
		 * The meta object literal for the '<em><b>Digest Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIGEST_VALUE = eINSTANCE.getDocumentRoot_DigestValue();

		/**
		 * The meta object literal for the '<em><b>DSA Key Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DSA_KEY_VALUE = eINSTANCE.getDocumentRoot_DSAKeyValue();

		/**
		 * The meta object literal for the '<em><b>Key Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEY_INFO = eINSTANCE.getDocumentRoot_KeyInfo();

		/**
		 * The meta object literal for the '<em><b>Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__KEY_NAME = eINSTANCE.getDocumentRoot_KeyName();

		/**
		 * The meta object literal for the '<em><b>Key Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEY_VALUE = eINSTANCE.getDocumentRoot_KeyValue();

		/**
		 * The meta object literal for the '<em><b>Manifest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MANIFEST = eINSTANCE.getDocumentRoot_Manifest();

		/**
		 * The meta object literal for the '<em><b>Mgmt Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MGMT_DATA = eINSTANCE.getDocumentRoot_MgmtData();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OBJECT = eINSTANCE.getDocumentRoot_Object();

		/**
		 * The meta object literal for the '<em><b>PGP Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PGP_DATA = eINSTANCE.getDocumentRoot_PGPData();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCE = eINSTANCE.getDocumentRoot_Reference();

		/**
		 * The meta object literal for the '<em><b>Retrieval Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RETRIEVAL_METHOD = eINSTANCE.getDocumentRoot_RetrievalMethod();

		/**
		 * The meta object literal for the '<em><b>RSA Key Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RSA_KEY_VALUE = eINSTANCE.getDocumentRoot_RSAKeyValue();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNATURE = eINSTANCE.getDocumentRoot_Signature();

		/**
		 * The meta object literal for the '<em><b>Signature Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNATURE_METHOD = eINSTANCE.getDocumentRoot_SignatureMethod();

		/**
		 * The meta object literal for the '<em><b>Signature Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNATURE_PROPERTIES = eINSTANCE.getDocumentRoot_SignatureProperties();

		/**
		 * The meta object literal for the '<em><b>Signature Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNATURE_PROPERTY = eINSTANCE.getDocumentRoot_SignatureProperty();

		/**
		 * The meta object literal for the '<em><b>Signature Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNATURE_VALUE = eINSTANCE.getDocumentRoot_SignatureValue();

		/**
		 * The meta object literal for the '<em><b>Signed Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNED_INFO = eINSTANCE.getDocumentRoot_SignedInfo();

		/**
		 * The meta object literal for the '<em><b>SPKI Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPKI_DATA = eINSTANCE.getDocumentRoot_SPKIData();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORM = eINSTANCE.getDocumentRoot_Transform();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORMS = eINSTANCE.getDocumentRoot_Transforms();

		/**
		 * The meta object literal for the '<em><b>X509 Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__X509_DATA = eINSTANCE.getDocumentRoot_X509Data();

		/**
		 * The meta object literal for the '<em><b>Canonicalization Method1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CANONICALIZATION_METHOD1 = eINSTANCE.getDocumentRoot_CanonicalizationMethod1();

		/**
		 * The meta object literal for the '<em><b>Digest Method1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIGEST_METHOD1 = eINSTANCE.getDocumentRoot_DigestMethod1();

		/**
		 * The meta object literal for the '<em><b>Digest Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIGEST_VALUE1 = eINSTANCE.getDocumentRoot_DigestValue1();

		/**
		 * The meta object literal for the '<em><b>DSA Key Value1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DSA_KEY_VALUE1 = eINSTANCE.getDocumentRoot_DSAKeyValue1();

		/**
		 * The meta object literal for the '<em><b>Key Info1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEY_INFO1 = eINSTANCE.getDocumentRoot_KeyInfo1();

		/**
		 * The meta object literal for the '<em><b>Key Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__KEY_NAME1 = eINSTANCE.getDocumentRoot_KeyName1();

		/**
		 * The meta object literal for the '<em><b>Key Value1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEY_VALUE1 = eINSTANCE.getDocumentRoot_KeyValue1();

		/**
		 * The meta object literal for the '<em><b>Manifest1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MANIFEST1 = eINSTANCE.getDocumentRoot_Manifest1();

		/**
		 * The meta object literal for the '<em><b>Mgmt Data1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MGMT_DATA1 = eINSTANCE.getDocumentRoot_MgmtData1();

		/**
		 * The meta object literal for the '<em><b>Object1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OBJECT1 = eINSTANCE.getDocumentRoot_Object1();

		/**
		 * The meta object literal for the '<em><b>PGP Data1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PGP_DATA1 = eINSTANCE.getDocumentRoot_PGPData1();

		/**
		 * The meta object literal for the '<em><b>Reference1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCE1 = eINSTANCE.getDocumentRoot_Reference1();

		/**
		 * The meta object literal for the '<em><b>Retrieval Method1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RETRIEVAL_METHOD1 = eINSTANCE.getDocumentRoot_RetrievalMethod1();

		/**
		 * The meta object literal for the '<em><b>RSA Key Value1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RSA_KEY_VALUE1 = eINSTANCE.getDocumentRoot_RSAKeyValue1();

		/**
		 * The meta object literal for the '<em><b>Signature1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNATURE1 = eINSTANCE.getDocumentRoot_Signature1();

		/**
		 * The meta object literal for the '<em><b>Signature Method1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNATURE_METHOD1 = eINSTANCE.getDocumentRoot_SignatureMethod1();

		/**
		 * The meta object literal for the '<em><b>Signature Properties1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNATURE_PROPERTIES1 = eINSTANCE.getDocumentRoot_SignatureProperties1();

		/**
		 * The meta object literal for the '<em><b>Signature Property1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNATURE_PROPERTY1 = eINSTANCE.getDocumentRoot_SignatureProperty1();

		/**
		 * The meta object literal for the '<em><b>Signature Value1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNATURE_VALUE1 = eINSTANCE.getDocumentRoot_SignatureValue1();

		/**
		 * The meta object literal for the '<em><b>Signed Info1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIGNED_INFO1 = eINSTANCE.getDocumentRoot_SignedInfo1();

		/**
		 * The meta object literal for the '<em><b>SPKI Data1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPKI_DATA1 = eINSTANCE.getDocumentRoot_SPKIData1();

		/**
		 * The meta object literal for the '<em><b>Transform1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORM1 = eINSTANCE.getDocumentRoot_Transform1();

		/**
		 * The meta object literal for the '<em><b>Transforms1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORMS1 = eINSTANCE.getDocumentRoot_Transforms1();

		/**
		 * The meta object literal for the '<em><b>X509 Data1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__X509_DATA1 = eINSTANCE.getDocumentRoot_X509Data1();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.DSAKeyValueTypeImpl <em>DSA Key Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.DSAKeyValueTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDSAKeyValueType()
		 * @generated
		 */
		EClass DSA_KEY_VALUE_TYPE = eINSTANCE.getDSAKeyValueType();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE__P = eINSTANCE.getDSAKeyValueType_P();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE__Q = eINSTANCE.getDSAKeyValueType_Q();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE__G = eINSTANCE.getDSAKeyValueType_G();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE__Y = eINSTANCE.getDSAKeyValueType_Y();

		/**
		 * The meta object literal for the '<em><b>J</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE__J = eINSTANCE.getDSAKeyValueType_J();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE__SEED = eINSTANCE.getDSAKeyValueType_Seed();

		/**
		 * The meta object literal for the '<em><b>Pgen Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE__PGEN_COUNTER = eINSTANCE.getDSAKeyValueType_PgenCounter();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.DSAKeyValueType1Impl <em>DSA Key Value Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.DSAKeyValueType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDSAKeyValueType1()
		 * @generated
		 */
		EClass DSA_KEY_VALUE_TYPE1 = eINSTANCE.getDSAKeyValueType1();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE1__P = eINSTANCE.getDSAKeyValueType1_P();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE1__Q = eINSTANCE.getDSAKeyValueType1_Q();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE1__G = eINSTANCE.getDSAKeyValueType1_G();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE1__Y = eINSTANCE.getDSAKeyValueType1_Y();

		/**
		 * The meta object literal for the '<em><b>J</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE1__J = eINSTANCE.getDSAKeyValueType1_J();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE1__SEED = eINSTANCE.getDSAKeyValueType1_Seed();

		/**
		 * The meta object literal for the '<em><b>Pgen Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_KEY_VALUE_TYPE1__PGEN_COUNTER = eINSTANCE.getDSAKeyValueType1_PgenCounter();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl <em>Key Info Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getKeyInfoType()
		 * @generated
		 */
		EClass KEY_INFO_TYPE = eINSTANCE.getKeyInfoType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE__MIXED = eINSTANCE.getKeyInfoType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE__GROUP = eINSTANCE.getKeyInfoType_Group();

		/**
		 * The meta object literal for the '<em><b>Key Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE__KEY_NAME = eINSTANCE.getKeyInfoType_KeyName();

		/**
		 * The meta object literal for the '<em><b>Key Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_INFO_TYPE__KEY_VALUE = eINSTANCE.getKeyInfoType_KeyValue();

		/**
		 * The meta object literal for the '<em><b>Retrieval Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_INFO_TYPE__RETRIEVAL_METHOD = eINSTANCE.getKeyInfoType_RetrievalMethod();

		/**
		 * The meta object literal for the '<em><b>X509 Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_INFO_TYPE__X509_DATA = eINSTANCE.getKeyInfoType_X509Data();

		/**
		 * The meta object literal for the '<em><b>PGP Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_INFO_TYPE__PGP_DATA = eINSTANCE.getKeyInfoType_PGPData();

		/**
		 * The meta object literal for the '<em><b>SPKI Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_INFO_TYPE__SPKI_DATA = eINSTANCE.getKeyInfoType_SPKIData();

		/**
		 * The meta object literal for the '<em><b>Mgmt Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE__MGMT_DATA = eINSTANCE.getKeyInfoType_MgmtData();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE__ANY = eINSTANCE.getKeyInfoType_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE__ID = eINSTANCE.getKeyInfoType_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl <em>Key Info Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.KeyInfoType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getKeyInfoType1()
		 * @generated
		 */
		EClass KEY_INFO_TYPE1 = eINSTANCE.getKeyInfoType1();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE1__MIXED = eINSTANCE.getKeyInfoType1_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE1__GROUP = eINSTANCE.getKeyInfoType1_Group();

		/**
		 * The meta object literal for the '<em><b>Key Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE1__KEY_NAME = eINSTANCE.getKeyInfoType1_KeyName();

		/**
		 * The meta object literal for the '<em><b>Key Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_INFO_TYPE1__KEY_VALUE = eINSTANCE.getKeyInfoType1_KeyValue();

		/**
		 * The meta object literal for the '<em><b>Retrieval Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_INFO_TYPE1__RETRIEVAL_METHOD = eINSTANCE.getKeyInfoType1_RetrievalMethod();

		/**
		 * The meta object literal for the '<em><b>X509 Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_INFO_TYPE1__X509_DATA = eINSTANCE.getKeyInfoType1_X509Data();

		/**
		 * The meta object literal for the '<em><b>PGP Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_INFO_TYPE1__PGP_DATA = eINSTANCE.getKeyInfoType1_PGPData();

		/**
		 * The meta object literal for the '<em><b>SPKI Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_INFO_TYPE1__SPKI_DATA = eINSTANCE.getKeyInfoType1_SPKIData();

		/**
		 * The meta object literal for the '<em><b>Mgmt Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE1__MGMT_DATA = eINSTANCE.getKeyInfoType1_MgmtData();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE1__ANY = eINSTANCE.getKeyInfoType1_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_INFO_TYPE1__ID = eINSTANCE.getKeyInfoType1_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.KeyValueTypeImpl <em>Key Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.KeyValueTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getKeyValueType()
		 * @generated
		 */
		EClass KEY_VALUE_TYPE = eINSTANCE.getKeyValueType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_TYPE__MIXED = eINSTANCE.getKeyValueType_Mixed();

		/**
		 * The meta object literal for the '<em><b>DSA Key Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_TYPE__DSA_KEY_VALUE = eINSTANCE.getKeyValueType_DSAKeyValue();

		/**
		 * The meta object literal for the '<em><b>RSA Key Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_TYPE__RSA_KEY_VALUE = eINSTANCE.getKeyValueType_RSAKeyValue();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_TYPE__ANY = eINSTANCE.getKeyValueType_Any();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.KeyValueType1Impl <em>Key Value Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.KeyValueType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getKeyValueType1()
		 * @generated
		 */
		EClass KEY_VALUE_TYPE1 = eINSTANCE.getKeyValueType1();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_TYPE1__MIXED = eINSTANCE.getKeyValueType1_Mixed();

		/**
		 * The meta object literal for the '<em><b>DSA Key Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_TYPE1__DSA_KEY_VALUE = eINSTANCE.getKeyValueType1_DSAKeyValue();

		/**
		 * The meta object literal for the '<em><b>RSA Key Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_TYPE1__RSA_KEY_VALUE = eINSTANCE.getKeyValueType1_RSAKeyValue();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_TYPE1__ANY = eINSTANCE.getKeyValueType1_Any();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.ManifestTypeImpl <em>Manifest Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.ManifestTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getManifestType()
		 * @generated
		 */
		EClass MANIFEST_TYPE = eINSTANCE.getManifestType();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST_TYPE__REFERENCE = eINSTANCE.getManifestType_Reference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST_TYPE__ID = eINSTANCE.getManifestType_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.ManifestType1Impl <em>Manifest Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.ManifestType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getManifestType1()
		 * @generated
		 */
		EClass MANIFEST_TYPE1 = eINSTANCE.getManifestType1();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST_TYPE1__REFERENCE = eINSTANCE.getManifestType1_Reference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST_TYPE1__ID = eINSTANCE.getManifestType1_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.ObjectTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getObjectType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__MIXED = eINSTANCE.getObjectType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__GROUP = eINSTANCE.getObjectType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__ANY = eINSTANCE.getObjectType_Any();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__ENCODING = eINSTANCE.getObjectType_Encoding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__ID = eINSTANCE.getObjectType_Id();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__MIME_TYPE = eINSTANCE.getObjectType_MimeType();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.ObjectType1Impl <em>Object Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.ObjectType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getObjectType1()
		 * @generated
		 */
		EClass OBJECT_TYPE1 = eINSTANCE.getObjectType1();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE1__MIXED = eINSTANCE.getObjectType1_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE1__GROUP = eINSTANCE.getObjectType1_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE1__ANY = eINSTANCE.getObjectType1_Any();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE1__ENCODING = eINSTANCE.getObjectType1_Encoding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE1__ID = eINSTANCE.getObjectType1_Id();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE1__MIME_TYPE = eINSTANCE.getObjectType1_MimeType();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.PGPDataTypeImpl <em>PGP Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.PGPDataTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getPGPDataType()
		 * @generated
		 */
		EClass PGP_DATA_TYPE = eINSTANCE.getPGPDataType();

		/**
		 * The meta object literal for the '<em><b>PGP Key ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PGP_DATA_TYPE__PGP_KEY_ID = eINSTANCE.getPGPDataType_PGPKeyID();

		/**
		 * The meta object literal for the '<em><b>PGP Key Packet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PGP_DATA_TYPE__PGP_KEY_PACKET = eINSTANCE.getPGPDataType_PGPKeyPacket();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PGP_DATA_TYPE__ANY = eINSTANCE.getPGPDataType_Any();

		/**
		 * The meta object literal for the '<em><b>PGP Key Packet1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PGP_DATA_TYPE__PGP_KEY_PACKET1 = eINSTANCE.getPGPDataType_PGPKeyPacket1();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PGP_DATA_TYPE__ANY1 = eINSTANCE.getPGPDataType_Any1();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.PGPDataType1Impl <em>PGP Data Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.PGPDataType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getPGPDataType1()
		 * @generated
		 */
		EClass PGP_DATA_TYPE1 = eINSTANCE.getPGPDataType1();

		/**
		 * The meta object literal for the '<em><b>PGP Key ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PGP_DATA_TYPE1__PGP_KEY_ID = eINSTANCE.getPGPDataType1_PGPKeyID();

		/**
		 * The meta object literal for the '<em><b>PGP Key Packet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PGP_DATA_TYPE1__PGP_KEY_PACKET = eINSTANCE.getPGPDataType1_PGPKeyPacket();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PGP_DATA_TYPE1__ANY = eINSTANCE.getPGPDataType1_Any();

		/**
		 * The meta object literal for the '<em><b>PGP Key Packet1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PGP_DATA_TYPE1__PGP_KEY_PACKET1 = eINSTANCE.getPGPDataType1_PGPKeyPacket1();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PGP_DATA_TYPE1__ANY1 = eINSTANCE.getPGPDataType1_Any1();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.ReferenceTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getReferenceType()
		 * @generated
		 */
		EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE__TRANSFORMS = eINSTANCE.getReferenceType_Transforms();

		/**
		 * The meta object literal for the '<em><b>Digest Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE__DIGEST_METHOD = eINSTANCE.getReferenceType_DigestMethod();

		/**
		 * The meta object literal for the '<em><b>Digest Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__DIGEST_VALUE = eINSTANCE.getReferenceType_DigestValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__ID = eINSTANCE.getReferenceType_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__TYPE = eINSTANCE.getReferenceType_Type();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__URI = eINSTANCE.getReferenceType_URI();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.ReferenceType1Impl <em>Reference Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.ReferenceType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getReferenceType1()
		 * @generated
		 */
		EClass REFERENCE_TYPE1 = eINSTANCE.getReferenceType1();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE1__TRANSFORMS = eINSTANCE.getReferenceType1_Transforms();

		/**
		 * The meta object literal for the '<em><b>Digest Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE1__DIGEST_METHOD = eINSTANCE.getReferenceType1_DigestMethod();

		/**
		 * The meta object literal for the '<em><b>Digest Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE1__DIGEST_VALUE = eINSTANCE.getReferenceType1_DigestValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE1__ID = eINSTANCE.getReferenceType1_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE1__TYPE = eINSTANCE.getReferenceType1_Type();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE1__URI = eINSTANCE.getReferenceType1_URI();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.RetrievalMethodTypeImpl <em>Retrieval Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.RetrievalMethodTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getRetrievalMethodType()
		 * @generated
		 */
		EClass RETRIEVAL_METHOD_TYPE = eINSTANCE.getRetrievalMethodType();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRIEVAL_METHOD_TYPE__TRANSFORMS = eINSTANCE.getRetrievalMethodType_Transforms();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRIEVAL_METHOD_TYPE__TYPE = eINSTANCE.getRetrievalMethodType_Type();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRIEVAL_METHOD_TYPE__URI = eINSTANCE.getRetrievalMethodType_URI();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.RetrievalMethodType1Impl <em>Retrieval Method Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.RetrievalMethodType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getRetrievalMethodType1()
		 * @generated
		 */
		EClass RETRIEVAL_METHOD_TYPE1 = eINSTANCE.getRetrievalMethodType1();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRIEVAL_METHOD_TYPE1__TRANSFORMS = eINSTANCE.getRetrievalMethodType1_Transforms();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRIEVAL_METHOD_TYPE1__TYPE = eINSTANCE.getRetrievalMethodType1_Type();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRIEVAL_METHOD_TYPE1__URI = eINSTANCE.getRetrievalMethodType1_URI();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.RSAKeyValueTypeImpl <em>RSA Key Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.RSAKeyValueTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getRSAKeyValueType()
		 * @generated
		 */
		EClass RSA_KEY_VALUE_TYPE = eINSTANCE.getRSAKeyValueType();

		/**
		 * The meta object literal for the '<em><b>Modulus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_KEY_VALUE_TYPE__MODULUS = eINSTANCE.getRSAKeyValueType_Modulus();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_KEY_VALUE_TYPE__EXPONENT = eINSTANCE.getRSAKeyValueType_Exponent();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.RSAKeyValueType1Impl <em>RSA Key Value Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.RSAKeyValueType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getRSAKeyValueType1()
		 * @generated
		 */
		EClass RSA_KEY_VALUE_TYPE1 = eINSTANCE.getRSAKeyValueType1();

		/**
		 * The meta object literal for the '<em><b>Modulus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_KEY_VALUE_TYPE1__MODULUS = eINSTANCE.getRSAKeyValueType1_Modulus();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_KEY_VALUE_TYPE1__EXPONENT = eINSTANCE.getRSAKeyValueType1_Exponent();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignatureMethodTypeImpl <em>Signature Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignatureMethodTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureMethodType()
		 * @generated
		 */
		EClass SIGNATURE_METHOD_TYPE = eINSTANCE.getSignatureMethodType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_METHOD_TYPE__MIXED = eINSTANCE.getSignatureMethodType_Mixed();

		/**
		 * The meta object literal for the '<em><b>HMAC Output Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_METHOD_TYPE__HMAC_OUTPUT_LENGTH = eINSTANCE.getSignatureMethodType_HMACOutputLength();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_METHOD_TYPE__ANY = eINSTANCE.getSignatureMethodType_Any();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_METHOD_TYPE__ALGORITHM = eINSTANCE.getSignatureMethodType_Algorithm();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignatureMethodType1Impl <em>Signature Method Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignatureMethodType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureMethodType1()
		 * @generated
		 */
		EClass SIGNATURE_METHOD_TYPE1 = eINSTANCE.getSignatureMethodType1();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_METHOD_TYPE1__MIXED = eINSTANCE.getSignatureMethodType1_Mixed();

		/**
		 * The meta object literal for the '<em><b>HMAC Output Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_METHOD_TYPE1__HMAC_OUTPUT_LENGTH = eINSTANCE.getSignatureMethodType1_HMACOutputLength();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_METHOD_TYPE1__ANY = eINSTANCE.getSignatureMethodType1_Any();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_METHOD_TYPE1__ALGORITHM = eINSTANCE.getSignatureMethodType1_Algorithm();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignaturePropertiesTypeImpl <em>Signature Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignaturePropertiesTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignaturePropertiesType()
		 * @generated
		 */
		EClass SIGNATURE_PROPERTIES_TYPE = eINSTANCE.getSignaturePropertiesType();

		/**
		 * The meta object literal for the '<em><b>Signature Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_PROPERTIES_TYPE__SIGNATURE_PROPERTY = eINSTANCE.getSignaturePropertiesType_SignatureProperty();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTIES_TYPE__ID = eINSTANCE.getSignaturePropertiesType_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignaturePropertiesType1Impl <em>Signature Properties Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignaturePropertiesType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignaturePropertiesType1()
		 * @generated
		 */
		EClass SIGNATURE_PROPERTIES_TYPE1 = eINSTANCE.getSignaturePropertiesType1();

		/**
		 * The meta object literal for the '<em><b>Signature Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_PROPERTIES_TYPE1__SIGNATURE_PROPERTY = eINSTANCE.getSignaturePropertiesType1_SignatureProperty();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTIES_TYPE1__ID = eINSTANCE.getSignaturePropertiesType1_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignaturePropertyTypeImpl <em>Signature Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignaturePropertyTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignaturePropertyType()
		 * @generated
		 */
		EClass SIGNATURE_PROPERTY_TYPE = eINSTANCE.getSignaturePropertyType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTY_TYPE__MIXED = eINSTANCE.getSignaturePropertyType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTY_TYPE__GROUP = eINSTANCE.getSignaturePropertyType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTY_TYPE__ANY = eINSTANCE.getSignaturePropertyType_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTY_TYPE__ID = eINSTANCE.getSignaturePropertyType_Id();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTY_TYPE__TARGET = eINSTANCE.getSignaturePropertyType_Target();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignaturePropertyType1Impl <em>Signature Property Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignaturePropertyType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignaturePropertyType1()
		 * @generated
		 */
		EClass SIGNATURE_PROPERTY_TYPE1 = eINSTANCE.getSignaturePropertyType1();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTY_TYPE1__MIXED = eINSTANCE.getSignaturePropertyType1_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTY_TYPE1__GROUP = eINSTANCE.getSignaturePropertyType1_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTY_TYPE1__ANY = eINSTANCE.getSignaturePropertyType1_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTY_TYPE1__ID = eINSTANCE.getSignaturePropertyType1_Id();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_PROPERTY_TYPE1__TARGET = eINSTANCE.getSignaturePropertyType1_Target();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignatureTypeImpl <em>Signature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignatureTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureType()
		 * @generated
		 */
		EClass SIGNATURE_TYPE = eINSTANCE.getSignatureType();

		/**
		 * The meta object literal for the '<em><b>Signed Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_TYPE__SIGNED_INFO = eINSTANCE.getSignatureType_SignedInfo();

		/**
		 * The meta object literal for the '<em><b>Signature Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_TYPE__SIGNATURE_VALUE = eINSTANCE.getSignatureType_SignatureValue();

		/**
		 * The meta object literal for the '<em><b>Key Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_TYPE__KEY_INFO = eINSTANCE.getSignatureType_KeyInfo();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_TYPE__OBJECT = eINSTANCE.getSignatureType_Object();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_TYPE__ID = eINSTANCE.getSignatureType_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignatureType1Impl <em>Signature Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignatureType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureType1()
		 * @generated
		 */
		EClass SIGNATURE_TYPE1 = eINSTANCE.getSignatureType1();

		/**
		 * The meta object literal for the '<em><b>Signed Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_TYPE1__SIGNED_INFO = eINSTANCE.getSignatureType1_SignedInfo();

		/**
		 * The meta object literal for the '<em><b>Signature Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_TYPE1__SIGNATURE_VALUE = eINSTANCE.getSignatureType1_SignatureValue();

		/**
		 * The meta object literal for the '<em><b>Key Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_TYPE1__KEY_INFO = eINSTANCE.getSignatureType1_KeyInfo();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_TYPE1__OBJECT = eINSTANCE.getSignatureType1_Object();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_TYPE1__ID = eINSTANCE.getSignatureType1_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignatureValueTypeImpl <em>Signature Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignatureValueTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureValueType()
		 * @generated
		 */
		EClass SIGNATURE_VALUE_TYPE = eINSTANCE.getSignatureValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_VALUE_TYPE__VALUE = eINSTANCE.getSignatureValueType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_VALUE_TYPE__ID = eINSTANCE.getSignatureValueType_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignatureValueType1Impl <em>Signature Value Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignatureValueType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignatureValueType1()
		 * @generated
		 */
		EClass SIGNATURE_VALUE_TYPE1 = eINSTANCE.getSignatureValueType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_VALUE_TYPE1__VALUE = eINSTANCE.getSignatureValueType1_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_VALUE_TYPE1__ID = eINSTANCE.getSignatureValueType1_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignedInfoTypeImpl <em>Signed Info Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignedInfoTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignedInfoType()
		 * @generated
		 */
		EClass SIGNED_INFO_TYPE = eINSTANCE.getSignedInfoType();

		/**
		 * The meta object literal for the '<em><b>Canonicalization Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNED_INFO_TYPE__CANONICALIZATION_METHOD = eINSTANCE.getSignedInfoType_CanonicalizationMethod();

		/**
		 * The meta object literal for the '<em><b>Signature Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNED_INFO_TYPE__SIGNATURE_METHOD = eINSTANCE.getSignedInfoType_SignatureMethod();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNED_INFO_TYPE__REFERENCE = eINSTANCE.getSignedInfoType_Reference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNED_INFO_TYPE__ID = eINSTANCE.getSignedInfoType_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SignedInfoType1Impl <em>Signed Info Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SignedInfoType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSignedInfoType1()
		 * @generated
		 */
		EClass SIGNED_INFO_TYPE1 = eINSTANCE.getSignedInfoType1();

		/**
		 * The meta object literal for the '<em><b>Canonicalization Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNED_INFO_TYPE1__CANONICALIZATION_METHOD = eINSTANCE.getSignedInfoType1_CanonicalizationMethod();

		/**
		 * The meta object literal for the '<em><b>Signature Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNED_INFO_TYPE1__SIGNATURE_METHOD = eINSTANCE.getSignedInfoType1_SignatureMethod();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNED_INFO_TYPE1__REFERENCE = eINSTANCE.getSignedInfoType1_Reference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNED_INFO_TYPE1__ID = eINSTANCE.getSignedInfoType1_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SPKIDataTypeImpl <em>SPKI Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SPKIDataTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSPKIDataType()
		 * @generated
		 */
		EClass SPKI_DATA_TYPE = eINSTANCE.getSPKIDataType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPKI_DATA_TYPE__GROUP = eINSTANCE.getSPKIDataType_Group();

		/**
		 * The meta object literal for the '<em><b>SPKI Sexp</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPKI_DATA_TYPE__SPKI_SEXP = eINSTANCE.getSPKIDataType_SPKISexp();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPKI_DATA_TYPE__ANY = eINSTANCE.getSPKIDataType_Any();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.SPKIDataType1Impl <em>SPKI Data Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.SPKIDataType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getSPKIDataType1()
		 * @generated
		 */
		EClass SPKI_DATA_TYPE1 = eINSTANCE.getSPKIDataType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPKI_DATA_TYPE1__GROUP = eINSTANCE.getSPKIDataType1_Group();

		/**
		 * The meta object literal for the '<em><b>SPKI Sexp</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPKI_DATA_TYPE1__SPKI_SEXP = eINSTANCE.getSPKIDataType1_SPKISexp();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPKI_DATA_TYPE1__ANY = eINSTANCE.getSPKIDataType1_Any();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.TransformsTypeImpl <em>Transforms Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.TransformsTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getTransformsType()
		 * @generated
		 */
		EClass TRANSFORMS_TYPE = eINSTANCE.getTransformsType();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMS_TYPE__TRANSFORM = eINSTANCE.getTransformsType_Transform();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.TransformsType1Impl <em>Transforms Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.TransformsType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getTransformsType1()
		 * @generated
		 */
		EClass TRANSFORMS_TYPE1 = eINSTANCE.getTransformsType1();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMS_TYPE1__TRANSFORM = eINSTANCE.getTransformsType1_Transform();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.TransformTypeImpl <em>Transform Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.TransformTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getTransformType()
		 * @generated
		 */
		EClass TRANSFORM_TYPE = eINSTANCE.getTransformType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__MIXED = eINSTANCE.getTransformType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__GROUP = eINSTANCE.getTransformType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__ANY = eINSTANCE.getTransformType_Any();

		/**
		 * The meta object literal for the '<em><b>XPath</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__XPATH = eINSTANCE.getTransformType_XPath();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__ALGORITHM = eINSTANCE.getTransformType_Algorithm();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.TransformType1Impl <em>Transform Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.TransformType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getTransformType1()
		 * @generated
		 */
		EClass TRANSFORM_TYPE1 = eINSTANCE.getTransformType1();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE1__MIXED = eINSTANCE.getTransformType1_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE1__GROUP = eINSTANCE.getTransformType1_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE1__ANY = eINSTANCE.getTransformType1_Any();

		/**
		 * The meta object literal for the '<em><b>XPath</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE1__XPATH = eINSTANCE.getTransformType1_XPath();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE1__ALGORITHM = eINSTANCE.getTransformType1_Algorithm();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.X509DataTypeImpl <em>X509 Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.X509DataTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getX509DataType()
		 * @generated
		 */
		EClass X509_DATA_TYPE = eINSTANCE.getX509DataType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE__GROUP = eINSTANCE.getX509DataType_Group();

		/**
		 * The meta object literal for the '<em><b>X509 Issuer Serial</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X509_DATA_TYPE__X509_ISSUER_SERIAL = eINSTANCE.getX509DataType_X509IssuerSerial();

		/**
		 * The meta object literal for the '<em><b>X509SKI</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE__X509_SKI = eINSTANCE.getX509DataType_X509SKI();

		/**
		 * The meta object literal for the '<em><b>X509 Subject Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE__X509_SUBJECT_NAME = eINSTANCE.getX509DataType_X509SubjectName();

		/**
		 * The meta object literal for the '<em><b>X509 Certificate</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE__X509_CERTIFICATE = eINSTANCE.getX509DataType_X509Certificate();

		/**
		 * The meta object literal for the '<em><b>X509CRL</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE__X509_CRL = eINSTANCE.getX509DataType_X509CRL();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE__ANY = eINSTANCE.getX509DataType_Any();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.X509DataType1Impl <em>X509 Data Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.X509DataType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getX509DataType1()
		 * @generated
		 */
		EClass X509_DATA_TYPE1 = eINSTANCE.getX509DataType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE1__GROUP = eINSTANCE.getX509DataType1_Group();

		/**
		 * The meta object literal for the '<em><b>X509 Issuer Serial</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X509_DATA_TYPE1__X509_ISSUER_SERIAL = eINSTANCE.getX509DataType1_X509IssuerSerial();

		/**
		 * The meta object literal for the '<em><b>X509SKI</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE1__X509_SKI = eINSTANCE.getX509DataType1_X509SKI();

		/**
		 * The meta object literal for the '<em><b>X509 Subject Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE1__X509_SUBJECT_NAME = eINSTANCE.getX509DataType1_X509SubjectName();

		/**
		 * The meta object literal for the '<em><b>X509 Certificate</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE1__X509_CERTIFICATE = eINSTANCE.getX509DataType1_X509Certificate();

		/**
		 * The meta object literal for the '<em><b>X509CRL</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE1__X509_CRL = eINSTANCE.getX509DataType1_X509CRL();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_DATA_TYPE1__ANY = eINSTANCE.getX509DataType1_Any();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.X509IssuerSerialTypeImpl <em>X509 Issuer Serial Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.X509IssuerSerialTypeImpl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getX509IssuerSerialType()
		 * @generated
		 */
		EClass X509_ISSUER_SERIAL_TYPE = eINSTANCE.getX509IssuerSerialType();

		/**
		 * The meta object literal for the '<em><b>X509 Issuer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_SERIAL_TYPE__X509_ISSUER_NAME = eINSTANCE.getX509IssuerSerialType_X509IssuerName();

		/**
		 * The meta object literal for the '<em><b>X509 Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_SERIAL_TYPE__X509_SERIAL_NUMBER = eINSTANCE.getX509IssuerSerialType_X509SerialNumber();

		/**
		 * The meta object literal for the '{@link org.w3._2000._09.xmldsig.impl.X509IssuerSerialType1Impl <em>X509 Issuer Serial Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.X509IssuerSerialType1Impl
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getX509IssuerSerialType1()
		 * @generated
		 */
		EClass X509_ISSUER_SERIAL_TYPE1 = eINSTANCE.getX509IssuerSerialType1();

		/**
		 * The meta object literal for the '<em><b>X509 Issuer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_SERIAL_TYPE1__X509_ISSUER_NAME = eINSTANCE.getX509IssuerSerialType1_X509IssuerName();

		/**
		 * The meta object literal for the '<em><b>X509 Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_SERIAL_TYPE1__X509_SERIAL_NUMBER = eINSTANCE.getX509IssuerSerialType1_X509SerialNumber();

		/**
		 * The meta object literal for the '<em>Crypto Binary</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getCryptoBinary()
		 * @generated
		 */
		EDataType CRYPTO_BINARY = eINSTANCE.getCryptoBinary();

		/**
		 * The meta object literal for the '<em>Crypto Binary1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getCryptoBinary1()
		 * @generated
		 */
		EDataType CRYPTO_BINARY1 = eINSTANCE.getCryptoBinary1();

		/**
		 * The meta object literal for the '<em>Digest Value Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDigestValueType()
		 * @generated
		 */
		EDataType DIGEST_VALUE_TYPE = eINSTANCE.getDigestValueType();

		/**
		 * The meta object literal for the '<em>Digest Value Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getDigestValueType1()
		 * @generated
		 */
		EDataType DIGEST_VALUE_TYPE1 = eINSTANCE.getDigestValueType1();

		/**
		 * The meta object literal for the '<em>HMAC Output Length Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getHMACOutputLengthType()
		 * @generated
		 */
		EDataType HMAC_OUTPUT_LENGTH_TYPE = eINSTANCE.getHMACOutputLengthType();

		/**
		 * The meta object literal for the '<em>HMAC Output Length Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl#getHMACOutputLengthType1()
		 * @generated
		 */
		EDataType HMAC_OUTPUT_LENGTH_TYPE1 = eINSTANCE.getHMACOutputLengthType1();

	}

} //XmldsigPackage
