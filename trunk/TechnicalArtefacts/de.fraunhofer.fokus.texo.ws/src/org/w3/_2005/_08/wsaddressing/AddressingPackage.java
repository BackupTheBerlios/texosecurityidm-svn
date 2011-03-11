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
 * @see org.w3._2005._08.wsaddressing.AddressingFactory
 * @model kind="package"
 * @generated
 */
public interface AddressingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wsaddressing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2005/08/addressing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wsa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AddressingPackage eINSTANCE = org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedQNameTypeImpl <em>Attributed QName Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.AttributedQNameTypeImpl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedQNameType()
	 * @generated
	 */
	int ATTRIBUTED_QNAME_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_QNAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_QNAME_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attributed QName Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_QNAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedQNameType1Impl <em>Attributed QName Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.AttributedQNameType1Impl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedQNameType1()
	 * @generated
	 */
	int ATTRIBUTED_QNAME_TYPE1 = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_QNAME_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_QNAME_TYPE1__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attributed QName Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_QNAME_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedUnsignedLongTypeImpl <em>Attributed Unsigned Long Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.AttributedUnsignedLongTypeImpl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedUnsignedLongType()
	 * @generated
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attributed Unsigned Long Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedUnsignedLongType1Impl <em>Attributed Unsigned Long Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.AttributedUnsignedLongType1Impl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedUnsignedLongType1()
	 * @generated
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE1 = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE1__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attributed Unsigned Long Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedURITypeImpl <em>Attributed URI Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.AttributedURITypeImpl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedURIType()
	 * @generated
	 */
	int ATTRIBUTED_URI_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attributed URI Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedURIType1Impl <em>Attributed URI Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.AttributedURIType1Impl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedURIType1()
	 * @generated
	 */
	int ATTRIBUTED_URI_TYPE1 = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI_TYPE1__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attributed URI Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.DocumentRootImpl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

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
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTION = 3;

	/**
	 * The feature id for the '<em><b>Endpoint Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Fault To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FAULT_TO = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FROM = 6;

	/**
	 * The feature id for the '<em><b>Message ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_ID = 7;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METADATA = 8;

	/**
	 * The feature id for the '<em><b>Problem Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROBLEM_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Problem Header QName</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROBLEM_HEADER_QNAME = 10;

	/**
	 * The feature id for the '<em><b>Problem IRI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROBLEM_IRI = 11;

	/**
	 * The feature id for the '<em><b>Reference Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCE_PARAMETERS = 12;

	/**
	 * The feature id for the '<em><b>Relates To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATES_TO = 13;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPLY_TO = 14;

	/**
	 * The feature id for the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RETRY_AFTER = 15;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TO = 16;

	/**
	 * The feature id for the '<em><b>Is Reference Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_REFERENCE_PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Action1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTION1 = 18;

	/**
	 * The feature id for the '<em><b>Endpoint Reference1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT_REFERENCE1 = 19;

	/**
	 * The feature id for the '<em><b>Fault To1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FAULT_TO1 = 20;

	/**
	 * The feature id for the '<em><b>From1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FROM1 = 21;

	/**
	 * The feature id for the '<em><b>Message ID1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_ID1 = 22;

	/**
	 * The feature id for the '<em><b>Metadata1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METADATA1 = 23;

	/**
	 * The feature id for the '<em><b>Problem Action1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROBLEM_ACTION1 = 24;

	/**
	 * The feature id for the '<em><b>Problem Header QName1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1 = 25;

	/**
	 * The feature id for the '<em><b>Problem IRI1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROBLEM_IRI1 = 26;

	/**
	 * The feature id for the '<em><b>Reference Parameters1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCE_PARAMETERS1 = 27;

	/**
	 * The feature id for the '<em><b>Relates To1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATES_TO1 = 28;

	/**
	 * The feature id for the '<em><b>Reply To1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPLY_TO1 = 29;

	/**
	 * The feature id for the '<em><b>Retry After1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RETRY_AFTER1 = 30;

	/**
	 * The feature id for the '<em><b>To1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TO1 = 31;

	/**
	 * The feature id for the '<em><b>Is Reference Parameter1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_REFERENCE_PARAMETER1 = 32;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 33;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.EndpointReferenceTypeImpl <em>Endpoint Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.EndpointReferenceTypeImpl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getEndpointReferenceType()
	 * @generated
	 */
	int ENDPOINT_REFERENCE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Reference Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE__REFERENCE_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Endpoint Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.EndpointReferenceType1Impl <em>Endpoint Reference Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.EndpointReferenceType1Impl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getEndpointReferenceType1()
	 * @generated
	 */
	int ENDPOINT_REFERENCE_TYPE1 = 8;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE1__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Reference Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE1__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE1__ANY = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE1__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Endpoint Reference Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE1_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.MetadataTypeImpl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getMetadataType()
	 * @generated
	 */
	int METADATA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.MetadataType1Impl <em>Metadata Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.MetadataType1Impl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getMetadataType1()
	 * @generated
	 */
	int METADATA_TYPE1 = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE1__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE1__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Metadata Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.ProblemActionTypeImpl <em>Problem Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.ProblemActionTypeImpl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getProblemActionType()
	 * @generated
	 */
	int PROBLEM_ACTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE__SOAP_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Problem Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.ProblemActionType1Impl <em>Problem Action Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.ProblemActionType1Impl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getProblemActionType1()
	 * @generated
	 */
	int PROBLEM_ACTION_TYPE1 = 12;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE1__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE1__SOAP_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE1__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Problem Action Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.ReferenceParametersTypeImpl <em>Reference Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.ReferenceParametersTypeImpl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getReferenceParametersType()
	 * @generated
	 */
	int REFERENCE_PARAMETERS_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PARAMETERS_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PARAMETERS_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Reference Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PARAMETERS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.ReferenceParametersType1Impl <em>Reference Parameters Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.ReferenceParametersType1Impl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getReferenceParametersType1()
	 * @generated
	 */
	int REFERENCE_PARAMETERS_TYPE1 = 14;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PARAMETERS_TYPE1__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PARAMETERS_TYPE1__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Reference Parameters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PARAMETERS_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.RelatesToTypeImpl <em>Relates To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.RelatesToTypeImpl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelatesToType()
	 * @generated
	 */
	int RELATES_TO_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE__RELATIONSHIP_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Relates To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.impl.RelatesToType1Impl <em>Relates To Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.impl.RelatesToType1Impl
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelatesToType1()
	 * @generated
	 */
	int RELATES_TO_TYPE1 = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE1__RELATIONSHIP_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE1__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Relates To Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.RelationshipType <em>Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.RelationshipType
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.w3._2005._08.wsaddressing.RelationshipType1 <em>Relationship Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.RelationshipType1
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipType1()
	 * @generated
	 */
	int RELATIONSHIP_TYPE1 = 18;

	/**
	 * The meta object id for the '<em>Fault Codes Open Enum Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.namespace.QName
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getFaultCodesOpenEnumType()
	 * @generated
	 */
	int FAULT_CODES_OPEN_ENUM_TYPE = 19;

	/**
	 * The meta object id for the '<em>Fault Codes Open Enum Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.namespace.QName
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getFaultCodesOpenEnumType1()
	 * @generated
	 */
	int FAULT_CODES_OPEN_ENUM_TYPE1 = 20;

	/**
	 * The meta object id for the '<em>Fault Codes Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.namespace.QName
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getFaultCodesType()
	 * @generated
	 */
	int FAULT_CODES_TYPE = 21;

	/**
	 * The meta object id for the '<em>Fault Codes Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.namespace.QName
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getFaultCodesType1()
	 * @generated
	 */
	int FAULT_CODES_TYPE1 = 22;

	/**
	 * The meta object id for the '<em>Relationship Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.RelationshipType
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipTypeObject()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_OBJECT = 23;

	/**
	 * The meta object id for the '<em>Relationship Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._08.wsaddressing.RelationshipType
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipTypeObject1()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_OBJECT1 = 24;

	/**
	 * The meta object id for the '<em>Relationship Type Open Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipTypeOpenEnum()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_OPEN_ENUM = 25;

	/**
	 * The meta object id for the '<em>Relationship Type Open Enum1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipTypeOpenEnum1()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_OPEN_ENUM1 = 26;


	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.AttributedQNameType <em>Attributed QName Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributed QName Type</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedQNameType
	 * @generated
	 */
	EClass getAttributedQNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.AttributedQNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedQNameType#getValue()
	 * @see #getAttributedQNameType()
	 * @generated
	 */
	EAttribute getAttributedQNameType_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.AttributedQNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedQNameType#getAnyAttribute()
	 * @see #getAttributedQNameType()
	 * @generated
	 */
	EAttribute getAttributedQNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.AttributedQNameType1 <em>Attributed QName Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributed QName Type1</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedQNameType1
	 * @generated
	 */
	EClass getAttributedQNameType1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.AttributedQNameType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedQNameType1#getValue()
	 * @see #getAttributedQNameType1()
	 * @generated
	 */
	EAttribute getAttributedQNameType1_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.AttributedQNameType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedQNameType1#getAnyAttribute()
	 * @see #getAttributedQNameType1()
	 * @generated
	 */
	EAttribute getAttributedQNameType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.AttributedUnsignedLongType <em>Attributed Unsigned Long Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributed Unsigned Long Type</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedUnsignedLongType
	 * @generated
	 */
	EClass getAttributedUnsignedLongType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.AttributedUnsignedLongType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedUnsignedLongType#getValue()
	 * @see #getAttributedUnsignedLongType()
	 * @generated
	 */
	EAttribute getAttributedUnsignedLongType_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.AttributedUnsignedLongType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedUnsignedLongType#getAnyAttribute()
	 * @see #getAttributedUnsignedLongType()
	 * @generated
	 */
	EAttribute getAttributedUnsignedLongType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.AttributedUnsignedLongType1 <em>Attributed Unsigned Long Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributed Unsigned Long Type1</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedUnsignedLongType1
	 * @generated
	 */
	EClass getAttributedUnsignedLongType1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.AttributedUnsignedLongType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedUnsignedLongType1#getValue()
	 * @see #getAttributedUnsignedLongType1()
	 * @generated
	 */
	EAttribute getAttributedUnsignedLongType1_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.AttributedUnsignedLongType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedUnsignedLongType1#getAnyAttribute()
	 * @see #getAttributedUnsignedLongType1()
	 * @generated
	 */
	EAttribute getAttributedUnsignedLongType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.AttributedURIType <em>Attributed URI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributed URI Type</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedURIType
	 * @generated
	 */
	EClass getAttributedURIType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.AttributedURIType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedURIType#getValue()
	 * @see #getAttributedURIType()
	 * @generated
	 */
	EAttribute getAttributedURIType_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.AttributedURIType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedURIType#getAnyAttribute()
	 * @see #getAttributedURIType()
	 * @generated
	 */
	EAttribute getAttributedURIType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.AttributedURIType1 <em>Attributed URI Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributed URI Type1</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedURIType1
	 * @generated
	 */
	EClass getAttributedURIType1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.AttributedURIType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedURIType1#getValue()
	 * @see #getAttributedURIType1()
	 * @generated
	 */
	EAttribute getAttributedURIType1_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.AttributedURIType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.AttributedURIType1#getAnyAttribute()
	 * @see #getAttributedURIType1()
	 * @generated
	 */
	EAttribute getAttributedURIType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getEndpointReference <em>Endpoint Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Reference</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getEndpointReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EndpointReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFaultTo <em>Fault To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault To</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getFaultTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FaultTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getFrom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMessageID <em>Message ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message ID</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getMessageID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageID();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemAction <em>Problem Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Problem Action</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getProblemAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProblemAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemHeaderQName <em>Problem Header QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Problem Header QName</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getProblemHeaderQName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProblemHeaderQName();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemIRI <em>Problem IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Problem IRI</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getProblemIRI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProblemIRI();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReferenceParameters <em>Reference Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Parameters</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getReferenceParameters()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReferenceParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRelatesTo <em>Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relates To</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getRelatesTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RelatesTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReplyTo <em>Reply To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply To</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getReplyTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReplyTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRetryAfter <em>Retry After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry After</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getRetryAfter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RetryAfter();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_To();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter <em>Is Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reference Parameter</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IsReferenceParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getAction1 <em>Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getAction1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Action1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getEndpointReference1 <em>Endpoint Reference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Reference1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getEndpointReference1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EndpointReference1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFaultTo1 <em>Fault To1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault To1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getFaultTo1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FaultTo1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getFrom1 <em>From1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getFrom1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_From1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMessageID1 <em>Message ID1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message ID1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getMessageID1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageID1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getMetadata1 <em>Metadata1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getMetadata1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Metadata1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemAction1 <em>Problem Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Problem Action1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getProblemAction1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProblemAction1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemHeaderQName1 <em>Problem Header QName1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Problem Header QName1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getProblemHeaderQName1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProblemHeaderQName1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getProblemIRI1 <em>Problem IRI1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Problem IRI1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getProblemIRI1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProblemIRI1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReferenceParameters1 <em>Reference Parameters1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Parameters1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getReferenceParameters1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReferenceParameters1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRelatesTo1 <em>Relates To1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relates To1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getRelatesTo1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RelatesTo1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getReplyTo1 <em>Reply To1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply To1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getReplyTo1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReplyTo1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getRetryAfter1 <em>Retry After1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry After1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getRetryAfter1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RetryAfter1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.DocumentRoot#getTo1 <em>To1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#getTo1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_To1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter1 <em>Is Reference Parameter1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reference Parameter1</em>'.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot#isIsReferenceParameter1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IsReferenceParameter1();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType <em>Endpoint Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Reference Type</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType
	 * @generated
	 */
	EClass getEndpointReferenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType#getAddress()
	 * @see #getEndpointReferenceType()
	 * @generated
	 */
	EReference getEndpointReferenceType_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType#getReferenceParameters <em>Reference Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Parameters</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType#getReferenceParameters()
	 * @see #getEndpointReferenceType()
	 * @generated
	 */
	EReference getEndpointReferenceType_ReferenceParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType#getMetadata()
	 * @see #getEndpointReferenceType()
	 * @generated
	 */
	EReference getEndpointReferenceType_Metadata();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType#getAny()
	 * @see #getEndpointReferenceType()
	 * @generated
	 */
	EAttribute getEndpointReferenceType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType#getAnyAttribute()
	 * @see #getEndpointReferenceType()
	 * @generated
	 */
	EAttribute getEndpointReferenceType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType1 <em>Endpoint Reference Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Reference Type1</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType1
	 * @generated
	 */
	EClass getEndpointReferenceType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType1#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType1#getAddress()
	 * @see #getEndpointReferenceType1()
	 * @generated
	 */
	EReference getEndpointReferenceType1_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType1#getReferenceParameters <em>Reference Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Parameters</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType1#getReferenceParameters()
	 * @see #getEndpointReferenceType1()
	 * @generated
	 */
	EReference getEndpointReferenceType1_ReferenceParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType1#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType1#getMetadata()
	 * @see #getEndpointReferenceType1()
	 * @generated
	 */
	EReference getEndpointReferenceType1_Metadata();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType1#getAny()
	 * @see #getEndpointReferenceType1()
	 * @generated
	 */
	EAttribute getEndpointReferenceType1_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType1#getAnyAttribute()
	 * @see #getEndpointReferenceType1()
	 * @generated
	 */
	EAttribute getEndpointReferenceType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Type</em>'.
	 * @see org.w3._2005._08.wsaddressing.MetadataType
	 * @generated
	 */
	EClass getMetadataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.MetadataType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2005._08.wsaddressing.MetadataType#getAny()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.MetadataType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.MetadataType#getAnyAttribute()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.MetadataType1 <em>Metadata Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Type1</em>'.
	 * @see org.w3._2005._08.wsaddressing.MetadataType1
	 * @generated
	 */
	EClass getMetadataType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.MetadataType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2005._08.wsaddressing.MetadataType1#getAny()
	 * @see #getMetadataType1()
	 * @generated
	 */
	EAttribute getMetadataType1_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.MetadataType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.MetadataType1#getAnyAttribute()
	 * @see #getMetadataType1()
	 * @generated
	 */
	EAttribute getMetadataType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.ProblemActionType <em>Problem Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Action Type</em>'.
	 * @see org.w3._2005._08.wsaddressing.ProblemActionType
	 * @generated
	 */
	EClass getProblemActionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.ProblemActionType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.w3._2005._08.wsaddressing.ProblemActionType#getAction()
	 * @see #getProblemActionType()
	 * @generated
	 */
	EReference getProblemActionType_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.ProblemActionType#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.w3._2005._08.wsaddressing.ProblemActionType#getSoapAction()
	 * @see #getProblemActionType()
	 * @generated
	 */
	EAttribute getProblemActionType_SoapAction();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.ProblemActionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.ProblemActionType#getAnyAttribute()
	 * @see #getProblemActionType()
	 * @generated
	 */
	EAttribute getProblemActionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.ProblemActionType1 <em>Problem Action Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Action Type1</em>'.
	 * @see org.w3._2005._08.wsaddressing.ProblemActionType1
	 * @generated
	 */
	EClass getProblemActionType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._08.wsaddressing.ProblemActionType1#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.w3._2005._08.wsaddressing.ProblemActionType1#getAction()
	 * @see #getProblemActionType1()
	 * @generated
	 */
	EReference getProblemActionType1_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.ProblemActionType1#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.w3._2005._08.wsaddressing.ProblemActionType1#getSoapAction()
	 * @see #getProblemActionType1()
	 * @generated
	 */
	EAttribute getProblemActionType1_SoapAction();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.ProblemActionType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.ProblemActionType1#getAnyAttribute()
	 * @see #getProblemActionType1()
	 * @generated
	 */
	EAttribute getProblemActionType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.ReferenceParametersType <em>Reference Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Parameters Type</em>'.
	 * @see org.w3._2005._08.wsaddressing.ReferenceParametersType
	 * @generated
	 */
	EClass getReferenceParametersType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.ReferenceParametersType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2005._08.wsaddressing.ReferenceParametersType#getAny()
	 * @see #getReferenceParametersType()
	 * @generated
	 */
	EAttribute getReferenceParametersType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.ReferenceParametersType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.ReferenceParametersType#getAnyAttribute()
	 * @see #getReferenceParametersType()
	 * @generated
	 */
	EAttribute getReferenceParametersType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.ReferenceParametersType1 <em>Reference Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Parameters Type1</em>'.
	 * @see org.w3._2005._08.wsaddressing.ReferenceParametersType1
	 * @generated
	 */
	EClass getReferenceParametersType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.ReferenceParametersType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2005._08.wsaddressing.ReferenceParametersType1#getAny()
	 * @see #getReferenceParametersType1()
	 * @generated
	 */
	EAttribute getReferenceParametersType1_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.ReferenceParametersType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.ReferenceParametersType1#getAnyAttribute()
	 * @see #getReferenceParametersType1()
	 * @generated
	 */
	EAttribute getReferenceParametersType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.RelatesToType <em>Relates To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relates To Type</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelatesToType
	 * @generated
	 */
	EClass getRelatesToType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.RelatesToType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelatesToType#getValue()
	 * @see #getRelatesToType()
	 * @generated
	 */
	EAttribute getRelatesToType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.RelatesToType#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelatesToType#getRelationshipType()
	 * @see #getRelatesToType()
	 * @generated
	 */
	EAttribute getRelatesToType_RelationshipType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.RelatesToType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelatesToType#getAnyAttribute()
	 * @see #getRelatesToType()
	 * @generated
	 */
	EAttribute getRelatesToType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._08.wsaddressing.RelatesToType1 <em>Relates To Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relates To Type1</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelatesToType1
	 * @generated
	 */
	EClass getRelatesToType1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.RelatesToType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelatesToType1#getValue()
	 * @see #getRelatesToType1()
	 * @generated
	 */
	EAttribute getRelatesToType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._08.wsaddressing.RelatesToType1#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelatesToType1#getRelationshipType()
	 * @see #getRelatesToType1()
	 * @generated
	 */
	EAttribute getRelatesToType1_RelationshipType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._08.wsaddressing.RelatesToType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelatesToType1#getAnyAttribute()
	 * @see #getRelatesToType1()
	 * @generated
	 */
	EAttribute getRelatesToType1_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link org.w3._2005._08.wsaddressing.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelationshipType
	 * @generated
	 */
	EEnum getRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.w3._2005._08.wsaddressing.RelationshipType1 <em>Relationship Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type1</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelationshipType1
	 * @generated
	 */
	EEnum getRelationshipType1();

	/**
	 * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>Fault Codes Open Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fault Codes Open Enum Type</em>'.
	 * @see javax.xml.namespace.QName
	 * @model instanceClass="javax.xml.namespace.QName"
	 *        extendedMetaData="name='FaultCodesOpenEnumType' memberTypes='FaultCodesType http://www.eclipse.org/emf/2003/XMLType#QName'"
	 * @generated
	 */
	EDataType getFaultCodesOpenEnumType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>Fault Codes Open Enum Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fault Codes Open Enum Type1</em>'.
	 * @see javax.xml.namespace.QName
	 * @model instanceClass="javax.xml.namespace.QName"
	 *        extendedMetaData="name='FaultCodesOpenEnumType' memberTypes='FaultCodesType http://www.eclipse.org/emf/2003/XMLType#QName'"
	 * @generated
	 */
	EDataType getFaultCodesOpenEnumType1();

	/**
	 * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>Fault Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fault Codes Type</em>'.
	 * @see javax.xml.namespace.QName
	 * @model instanceClass="javax.xml.namespace.QName"
	 *        extendedMetaData="name='FaultCodesType' baseType='http://www.eclipse.org/emf/2003/XMLType#QName' enumeration='{http://www.w3.org/2005/08/addressing}InvalidAddressingHeader {http://www.w3.org/2005/08/addressing}InvalidAddress {http://www.w3.org/2005/08/addressing}InvalidEPR {http://www.w3.org/2005/08/addressing}InvalidCardinality {http://www.w3.org/2005/08/addressing}MissingAddressInEPR {http://www.w3.org/2005/08/addressing}DuplicateMessageID {http://www.w3.org/2005/08/addressing}ActionMismatch {http://www.w3.org/2005/08/addressing}MessageAddressingHeaderRequired {http://www.w3.org/2005/08/addressing}DestinationUnreachable {http://www.w3.org/2005/08/addressing}ActionNotSupported {http://www.w3.org/2005/08/addressing}EndpointUnavailable'"
	 * @generated
	 */
	EDataType getFaultCodesType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>Fault Codes Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fault Codes Type1</em>'.
	 * @see javax.xml.namespace.QName
	 * @model instanceClass="javax.xml.namespace.QName"
	 *        extendedMetaData="name='FaultCodesType' baseType='http://www.eclipse.org/emf/2003/XMLType#QName' enumeration='{http://www.w3.org/2005/08/addressing}InvalidAddressingHeader {http://www.w3.org/2005/08/addressing}InvalidAddress {http://www.w3.org/2005/08/addressing}InvalidEPR {http://www.w3.org/2005/08/addressing}InvalidCardinality {http://www.w3.org/2005/08/addressing}MissingAddressInEPR {http://www.w3.org/2005/08/addressing}DuplicateMessageID {http://www.w3.org/2005/08/addressing}ActionMismatch {http://www.w3.org/2005/08/addressing}MessageAddressingHeaderRequired {http://www.w3.org/2005/08/addressing}DestinationUnreachable {http://www.w3.org/2005/08/addressing}ActionNotSupported {http://www.w3.org/2005/08/addressing}EndpointUnavailable'"
	 * @generated
	 */
	EDataType getFaultCodesType1();

	/**
	 * Returns the meta object for data type '{@link org.w3._2005._08.wsaddressing.RelationshipType <em>Relationship Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relationship Type Object</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelationshipType
	 * @model instanceClass="org.w3._2005._08.wsaddressing.RelationshipType"
	 *        extendedMetaData="name='RelationshipType:Object' baseType='RelationshipType'"
	 * @generated
	 */
	EDataType getRelationshipTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.w3._2005._08.wsaddressing.RelationshipType <em>Relationship Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relationship Type Object1</em>'.
	 * @see org.w3._2005._08.wsaddressing.RelationshipType
	 * @model instanceClass="org.w3._2005._08.wsaddressing.RelationshipType"
	 *        extendedMetaData="name='RelationshipType:Object' baseType='RelationshipType'"
	 * @generated
	 */
	EDataType getRelationshipTypeObject1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Relationship Type Open Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relationship Type Open Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='RelationshipTypeOpenEnum' memberTypes='RelationshipType http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getRelationshipTypeOpenEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Relationship Type Open Enum1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relationship Type Open Enum1</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='RelationshipTypeOpenEnum' memberTypes='RelationshipType http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getRelationshipTypeOpenEnum1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AddressingFactory getAddressingFactory();

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
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedQNameTypeImpl <em>Attributed QName Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.AttributedQNameTypeImpl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedQNameType()
		 * @generated
		 */
		EClass ATTRIBUTED_QNAME_TYPE = eINSTANCE.getAttributedQNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_QNAME_TYPE__VALUE = eINSTANCE.getAttributedQNameType_Value();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_QNAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAttributedQNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedQNameType1Impl <em>Attributed QName Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.AttributedQNameType1Impl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedQNameType1()
		 * @generated
		 */
		EClass ATTRIBUTED_QNAME_TYPE1 = eINSTANCE.getAttributedQNameType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_QNAME_TYPE1__VALUE = eINSTANCE.getAttributedQNameType1_Value();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_QNAME_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getAttributedQNameType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedUnsignedLongTypeImpl <em>Attributed Unsigned Long Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.AttributedUnsignedLongTypeImpl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedUnsignedLongType()
		 * @generated
		 */
		EClass ATTRIBUTED_UNSIGNED_LONG_TYPE = eINSTANCE.getAttributedUnsignedLongType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_UNSIGNED_LONG_TYPE__VALUE = eINSTANCE.getAttributedUnsignedLongType_Value();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_UNSIGNED_LONG_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAttributedUnsignedLongType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedUnsignedLongType1Impl <em>Attributed Unsigned Long Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.AttributedUnsignedLongType1Impl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedUnsignedLongType1()
		 * @generated
		 */
		EClass ATTRIBUTED_UNSIGNED_LONG_TYPE1 = eINSTANCE.getAttributedUnsignedLongType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_UNSIGNED_LONG_TYPE1__VALUE = eINSTANCE.getAttributedUnsignedLongType1_Value();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_UNSIGNED_LONG_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getAttributedUnsignedLongType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedURITypeImpl <em>Attributed URI Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.AttributedURITypeImpl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedURIType()
		 * @generated
		 */
		EClass ATTRIBUTED_URI_TYPE = eINSTANCE.getAttributedURIType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_URI_TYPE__VALUE = eINSTANCE.getAttributedURIType_Value();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_URI_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAttributedURIType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.AttributedURIType1Impl <em>Attributed URI Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.AttributedURIType1Impl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getAttributedURIType1()
		 * @generated
		 */
		EClass ATTRIBUTED_URI_TYPE1 = eINSTANCE.getAttributedURIType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_URI_TYPE1__VALUE = eINSTANCE.getAttributedURIType1_Value();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_URI_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getAttributedURIType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.DocumentRootImpl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACTION = eINSTANCE.getDocumentRoot_Action();

		/**
		 * The meta object literal for the '<em><b>Endpoint Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENDPOINT_REFERENCE = eINSTANCE.getDocumentRoot_EndpointReference();

		/**
		 * The meta object literal for the '<em><b>Fault To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FAULT_TO = eINSTANCE.getDocumentRoot_FaultTo();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FROM = eINSTANCE.getDocumentRoot_From();

		/**
		 * The meta object literal for the '<em><b>Message ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MESSAGE_ID = eINSTANCE.getDocumentRoot_MessageID();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METADATA = eINSTANCE.getDocumentRoot_Metadata();

		/**
		 * The meta object literal for the '<em><b>Problem Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROBLEM_ACTION = eINSTANCE.getDocumentRoot_ProblemAction();

		/**
		 * The meta object literal for the '<em><b>Problem Header QName</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROBLEM_HEADER_QNAME = eINSTANCE.getDocumentRoot_ProblemHeaderQName();

		/**
		 * The meta object literal for the '<em><b>Problem IRI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROBLEM_IRI = eINSTANCE.getDocumentRoot_ProblemIRI();

		/**
		 * The meta object literal for the '<em><b>Reference Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCE_PARAMETERS = eINSTANCE.getDocumentRoot_ReferenceParameters();

		/**
		 * The meta object literal for the '<em><b>Relates To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATES_TO = eINSTANCE.getDocumentRoot_RelatesTo();

		/**
		 * The meta object literal for the '<em><b>Reply To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REPLY_TO = eINSTANCE.getDocumentRoot_ReplyTo();

		/**
		 * The meta object literal for the '<em><b>Retry After</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RETRY_AFTER = eINSTANCE.getDocumentRoot_RetryAfter();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TO = eINSTANCE.getDocumentRoot_To();

		/**
		 * The meta object literal for the '<em><b>Is Reference Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IS_REFERENCE_PARAMETER = eINSTANCE.getDocumentRoot_IsReferenceParameter();

		/**
		 * The meta object literal for the '<em><b>Action1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACTION1 = eINSTANCE.getDocumentRoot_Action1();

		/**
		 * The meta object literal for the '<em><b>Endpoint Reference1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENDPOINT_REFERENCE1 = eINSTANCE.getDocumentRoot_EndpointReference1();

		/**
		 * The meta object literal for the '<em><b>Fault To1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FAULT_TO1 = eINSTANCE.getDocumentRoot_FaultTo1();

		/**
		 * The meta object literal for the '<em><b>From1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FROM1 = eINSTANCE.getDocumentRoot_From1();

		/**
		 * The meta object literal for the '<em><b>Message ID1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MESSAGE_ID1 = eINSTANCE.getDocumentRoot_MessageID1();

		/**
		 * The meta object literal for the '<em><b>Metadata1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METADATA1 = eINSTANCE.getDocumentRoot_Metadata1();

		/**
		 * The meta object literal for the '<em><b>Problem Action1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROBLEM_ACTION1 = eINSTANCE.getDocumentRoot_ProblemAction1();

		/**
		 * The meta object literal for the '<em><b>Problem Header QName1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1 = eINSTANCE.getDocumentRoot_ProblemHeaderQName1();

		/**
		 * The meta object literal for the '<em><b>Problem IRI1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROBLEM_IRI1 = eINSTANCE.getDocumentRoot_ProblemIRI1();

		/**
		 * The meta object literal for the '<em><b>Reference Parameters1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCE_PARAMETERS1 = eINSTANCE.getDocumentRoot_ReferenceParameters1();

		/**
		 * The meta object literal for the '<em><b>Relates To1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATES_TO1 = eINSTANCE.getDocumentRoot_RelatesTo1();

		/**
		 * The meta object literal for the '<em><b>Reply To1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REPLY_TO1 = eINSTANCE.getDocumentRoot_ReplyTo1();

		/**
		 * The meta object literal for the '<em><b>Retry After1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RETRY_AFTER1 = eINSTANCE.getDocumentRoot_RetryAfter1();

		/**
		 * The meta object literal for the '<em><b>To1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TO1 = eINSTANCE.getDocumentRoot_To1();

		/**
		 * The meta object literal for the '<em><b>Is Reference Parameter1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IS_REFERENCE_PARAMETER1 = eINSTANCE.getDocumentRoot_IsReferenceParameter1();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.EndpointReferenceTypeImpl <em>Endpoint Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.EndpointReferenceTypeImpl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getEndpointReferenceType()
		 * @generated
		 */
		EClass ENDPOINT_REFERENCE_TYPE = eINSTANCE.getEndpointReferenceType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_REFERENCE_TYPE__ADDRESS = eINSTANCE.getEndpointReferenceType_Address();

		/**
		 * The meta object literal for the '<em><b>Reference Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_REFERENCE_TYPE__REFERENCE_PARAMETERS = eINSTANCE.getEndpointReferenceType_ReferenceParameters();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_REFERENCE_TYPE__METADATA = eINSTANCE.getEndpointReferenceType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_REFERENCE_TYPE__ANY = eINSTANCE.getEndpointReferenceType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_REFERENCE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getEndpointReferenceType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.EndpointReferenceType1Impl <em>Endpoint Reference Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.EndpointReferenceType1Impl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getEndpointReferenceType1()
		 * @generated
		 */
		EClass ENDPOINT_REFERENCE_TYPE1 = eINSTANCE.getEndpointReferenceType1();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_REFERENCE_TYPE1__ADDRESS = eINSTANCE.getEndpointReferenceType1_Address();

		/**
		 * The meta object literal for the '<em><b>Reference Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS = eINSTANCE.getEndpointReferenceType1_ReferenceParameters();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_REFERENCE_TYPE1__METADATA = eINSTANCE.getEndpointReferenceType1_Metadata();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_REFERENCE_TYPE1__ANY = eINSTANCE.getEndpointReferenceType1_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_REFERENCE_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getEndpointReferenceType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.MetadataTypeImpl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getMetadataType()
		 * @generated
		 */
		EClass METADATA_TYPE = eINSTANCE.getMetadataType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ANY = eINSTANCE.getMetadataType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ANY_ATTRIBUTE = eINSTANCE.getMetadataType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.MetadataType1Impl <em>Metadata Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.MetadataType1Impl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getMetadataType1()
		 * @generated
		 */
		EClass METADATA_TYPE1 = eINSTANCE.getMetadataType1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE1__ANY = eINSTANCE.getMetadataType1_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getMetadataType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.ProblemActionTypeImpl <em>Problem Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.ProblemActionTypeImpl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getProblemActionType()
		 * @generated
		 */
		EClass PROBLEM_ACTION_TYPE = eINSTANCE.getProblemActionType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_ACTION_TYPE__ACTION = eINSTANCE.getProblemActionType_Action();

		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_ACTION_TYPE__SOAP_ACTION = eINSTANCE.getProblemActionType_SoapAction();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_ACTION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getProblemActionType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.ProblemActionType1Impl <em>Problem Action Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.ProblemActionType1Impl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getProblemActionType1()
		 * @generated
		 */
		EClass PROBLEM_ACTION_TYPE1 = eINSTANCE.getProblemActionType1();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_ACTION_TYPE1__ACTION = eINSTANCE.getProblemActionType1_Action();

		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_ACTION_TYPE1__SOAP_ACTION = eINSTANCE.getProblemActionType1_SoapAction();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_ACTION_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getProblemActionType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.ReferenceParametersTypeImpl <em>Reference Parameters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.ReferenceParametersTypeImpl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getReferenceParametersType()
		 * @generated
		 */
		EClass REFERENCE_PARAMETERS_TYPE = eINSTANCE.getReferenceParametersType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PARAMETERS_TYPE__ANY = eINSTANCE.getReferenceParametersType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PARAMETERS_TYPE__ANY_ATTRIBUTE = eINSTANCE.getReferenceParametersType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.ReferenceParametersType1Impl <em>Reference Parameters Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.ReferenceParametersType1Impl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getReferenceParametersType1()
		 * @generated
		 */
		EClass REFERENCE_PARAMETERS_TYPE1 = eINSTANCE.getReferenceParametersType1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PARAMETERS_TYPE1__ANY = eINSTANCE.getReferenceParametersType1_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PARAMETERS_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getReferenceParametersType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.RelatesToTypeImpl <em>Relates To Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.RelatesToTypeImpl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelatesToType()
		 * @generated
		 */
		EClass RELATES_TO_TYPE = eINSTANCE.getRelatesToType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATES_TO_TYPE__VALUE = eINSTANCE.getRelatesToType_Value();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATES_TO_TYPE__RELATIONSHIP_TYPE = eINSTANCE.getRelatesToType_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATES_TO_TYPE__ANY_ATTRIBUTE = eINSTANCE.getRelatesToType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.impl.RelatesToType1Impl <em>Relates To Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.impl.RelatesToType1Impl
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelatesToType1()
		 * @generated
		 */
		EClass RELATES_TO_TYPE1 = eINSTANCE.getRelatesToType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATES_TO_TYPE1__VALUE = eINSTANCE.getRelatesToType1_Value();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATES_TO_TYPE1__RELATIONSHIP_TYPE = eINSTANCE.getRelatesToType1_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATES_TO_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getRelatesToType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.RelationshipType <em>Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.RelationshipType
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipType()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '{@link org.w3._2005._08.wsaddressing.RelationshipType1 <em>Relationship Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.RelationshipType1
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipType1()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE1 = eINSTANCE.getRelationshipType1();

		/**
		 * The meta object literal for the '<em>Fault Codes Open Enum Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.namespace.QName
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getFaultCodesOpenEnumType()
		 * @generated
		 */
		EDataType FAULT_CODES_OPEN_ENUM_TYPE = eINSTANCE.getFaultCodesOpenEnumType();

		/**
		 * The meta object literal for the '<em>Fault Codes Open Enum Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.namespace.QName
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getFaultCodesOpenEnumType1()
		 * @generated
		 */
		EDataType FAULT_CODES_OPEN_ENUM_TYPE1 = eINSTANCE.getFaultCodesOpenEnumType1();

		/**
		 * The meta object literal for the '<em>Fault Codes Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.namespace.QName
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getFaultCodesType()
		 * @generated
		 */
		EDataType FAULT_CODES_TYPE = eINSTANCE.getFaultCodesType();

		/**
		 * The meta object literal for the '<em>Fault Codes Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.namespace.QName
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getFaultCodesType1()
		 * @generated
		 */
		EDataType FAULT_CODES_TYPE1 = eINSTANCE.getFaultCodesType1();

		/**
		 * The meta object literal for the '<em>Relationship Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.RelationshipType
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipTypeObject()
		 * @generated
		 */
		EDataType RELATIONSHIP_TYPE_OBJECT = eINSTANCE.getRelationshipTypeObject();

		/**
		 * The meta object literal for the '<em>Relationship Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._08.wsaddressing.RelationshipType
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipTypeObject1()
		 * @generated
		 */
		EDataType RELATIONSHIP_TYPE_OBJECT1 = eINSTANCE.getRelationshipTypeObject1();

		/**
		 * The meta object literal for the '<em>Relationship Type Open Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipTypeOpenEnum()
		 * @generated
		 */
		EDataType RELATIONSHIP_TYPE_OPEN_ENUM = eINSTANCE.getRelationshipTypeOpenEnum();

		/**
		 * The meta object literal for the '<em>Relationship Type Open Enum1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl#getRelationshipTypeOpenEnum1()
		 * @generated
		 */
		EDataType RELATIONSHIP_TYPE_OPEN_ENUM1 = eINSTANCE.getRelationshipTypeOpenEnum1();

	}

} //AddressingPackage
