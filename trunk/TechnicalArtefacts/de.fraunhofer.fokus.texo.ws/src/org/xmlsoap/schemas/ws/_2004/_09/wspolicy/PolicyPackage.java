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
 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyFactory
 * @model kind="package"
 * @generated
 */
public interface PolicyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wspolicy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.xmlsoap.org/ws/2004/09/policy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wsp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyPackage eINSTANCE = org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.AppliesToTypeImpl <em>Applies To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.AppliesToTypeImpl
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getAppliesToType()
	 * @generated
	 */
	int APPLIES_TO_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIES_TO_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIES_TO_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Applies To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIES_TO_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.AppliesToType1Impl <em>Applies To Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.AppliesToType1Impl
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getAppliesToType1()
	 * @generated
	 */
	int APPLIES_TO_TYPE1 = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIES_TO_TYPE1__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIES_TO_TYPE1__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Applies To Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIES_TO_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALL = 3;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLIES_TO = 4;

	/**
	 * The feature id for the '<em><b>Exactly One</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXACTLY_ONE = 5;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLICY = 6;

	/**
	 * The feature id for the '<em><b>Policy Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLICY_ATTACHMENT = 7;

	/**
	 * The feature id for the '<em><b>Policy Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLICY_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPTIONAL = 9;

	/**
	 * The feature id for the '<em><b>Policy UR Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLICY_UR_IS = 10;

	/**
	 * The feature id for the '<em><b>All1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALL1 = 11;

	/**
	 * The feature id for the '<em><b>Applies To1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLIES_TO1 = 12;

	/**
	 * The feature id for the '<em><b>Exactly One1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXACTLY_ONE1 = 13;

	/**
	 * The feature id for the '<em><b>Policy1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLICY1 = 14;

	/**
	 * The feature id for the '<em><b>Policy Attachment1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLICY_ATTACHMENT1 = 15;

	/**
	 * The feature id for the '<em><b>Policy Reference1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLICY_REFERENCE1 = 16;

	/**
	 * The feature id for the '<em><b>Optional1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPTIONAL1 = 17;

	/**
	 * The feature id for the '<em><b>Policy UR Is1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLICY_UR_IS1 = 18;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentTypeImpl <em>Operator Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentTypeImpl
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getOperatorContentType()
	 * @generated
	 */
	int OPERATOR_CONTENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE__POLICY = 1;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE__ALL = 2;

	/**
	 * The feature id for the '<em><b>Exactly One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE__EXACTLY_ONE = 3;

	/**
	 * The feature id for the '<em><b>Policy Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE__POLICY_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE__ANY = 5;

	/**
	 * The number of structural features of the '<em>Operator Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentType1Impl <em>Operator Content Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentType1Impl
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getOperatorContentType1()
	 * @generated
	 */
	int OPERATOR_CONTENT_TYPE1 = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE1__POLICY = 1;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE1__ALL = 2;

	/**
	 * The feature id for the '<em><b>Exactly One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE1__EXACTLY_ONE = 3;

	/**
	 * The feature id for the '<em><b>Policy Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE1__POLICY_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE1__ANY = 5;

	/**
	 * The number of structural features of the '<em>Operator Content Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CONTENT_TYPE1_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentTypeImpl <em>Attachment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentTypeImpl
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyAttachmentType()
	 * @generated
	 */
	int POLICY_ATTACHMENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE__APPLIES_TO = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE__POLICY = 2;

	/**
	 * The feature id for the '<em><b>Policy Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Attachment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentType1Impl <em>Attachment Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentType1Impl
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyAttachmentType1()
	 * @generated
	 */
	int POLICY_ATTACHMENT_TYPE1 = 6;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE1__APPLIES_TO = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE1__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE1__POLICY = 2;

	/**
	 * The feature id for the '<em><b>Policy Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE1__POLICY_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE1__ANY = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE1__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Attachment Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTACHMENT_TYPE1_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceTypeImpl
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyReferenceType()
	 * @generated
	 */
	int POLICY_REFERENCE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REFERENCE_TYPE__DIGEST = 0;

	/**
	 * The feature id for the '<em><b>Digest Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REFERENCE_TYPE__DIGEST_ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REFERENCE_TYPE__URI = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REFERENCE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REFERENCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceType1Impl <em>Reference Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceType1Impl
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyReferenceType1()
	 * @generated
	 */
	int POLICY_REFERENCE_TYPE1 = 8;

	/**
	 * The feature id for the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REFERENCE_TYPE1__DIGEST = 0;

	/**
	 * The feature id for the '<em><b>Digest Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REFERENCE_TYPE1__DIGEST_ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REFERENCE_TYPE1__URI = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REFERENCE_TYPE1__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Reference Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REFERENCE_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyTypeImpl
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyType()
	 * @generated
	 */
	int POLICY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE__GROUP = OPERATOR_CONTENT_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE__POLICY = OPERATOR_CONTENT_TYPE__POLICY;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE__ALL = OPERATOR_CONTENT_TYPE__ALL;

	/**
	 * The feature id for the '<em><b>Exactly One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE__EXACTLY_ONE = OPERATOR_CONTENT_TYPE__EXACTLY_ONE;

	/**
	 * The feature id for the '<em><b>Policy Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE__POLICY_REFERENCE = OPERATOR_CONTENT_TYPE__POLICY_REFERENCE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE__ANY = OPERATOR_CONTENT_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE__ID = OPERATOR_CONTENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE__NAME = OPERATOR_CONTENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE__ANY_ATTRIBUTE = OPERATOR_CONTENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE_FEATURE_COUNT = OPERATOR_CONTENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyType1Impl <em>Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyType1Impl
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyType1()
	 * @generated
	 */
	int POLICY_TYPE1 = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE1__GROUP = OPERATOR_CONTENT_TYPE1__GROUP;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE1__POLICY = OPERATOR_CONTENT_TYPE1__POLICY;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE1__ALL = OPERATOR_CONTENT_TYPE1__ALL;

	/**
	 * The feature id for the '<em><b>Exactly One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE1__EXACTLY_ONE = OPERATOR_CONTENT_TYPE1__EXACTLY_ONE;

	/**
	 * The feature id for the '<em><b>Policy Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE1__POLICY_REFERENCE = OPERATOR_CONTENT_TYPE1__POLICY_REFERENCE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE1__ANY = OPERATOR_CONTENT_TYPE1__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE1__ID = OPERATOR_CONTENT_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE1__NAME = OPERATOR_CONTENT_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE1__ANY_ATTRIBUTE = OPERATOR_CONTENT_TYPE1_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE1_FEATURE_COUNT = OPERATOR_CONTENT_TYPE1_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '<em>UR Is Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyURIsType()
	 * @generated
	 */
	int POLICY_UR_IS_TYPE = 11;

	/**
	 * The meta object id for the '<em>UR Is Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyURIsType1()
	 * @generated
	 */
	int POLICY_UR_IS_TYPE1 = 12;


	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType <em>Applies To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applies To Type</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType
	 * @generated
	 */
	EClass getAppliesToType();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType#getAny()
	 * @see #getAppliesToType()
	 * @generated
	 */
	EAttribute getAppliesToType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType#getAnyAttribute()
	 * @see #getAppliesToType()
	 * @generated
	 */
	EAttribute getAppliesToType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType1 <em>Applies To Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applies To Type1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType1
	 * @generated
	 */
	EClass getAppliesToType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType1#getAny()
	 * @see #getAppliesToType1()
	 * @generated
	 */
	EAttribute getAppliesToType1_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType1#getAnyAttribute()
	 * @see #getAppliesToType1()
	 * @generated
	 */
	EAttribute getAppliesToType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAll()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_All();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applies To</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAppliesTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AppliesTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getExactlyOne <em>Exactly One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exactly One</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getExactlyOne()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExactlyOne();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Policy();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyAttachment <em>Policy Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Attachment</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyAttachment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PolicyAttachment();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyReference <em>Policy Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Reference</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PolicyReference();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyURIs <em>Policy UR Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy UR Is</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyURIs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PolicyURIs();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAll1 <em>All1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAll1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_All1();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAppliesTo1 <em>Applies To1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applies To1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getAppliesTo1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AppliesTo1();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getExactlyOne1 <em>Exactly One1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exactly One1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getExactlyOne1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExactlyOne1();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicy1 <em>Policy1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicy1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Policy1();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyAttachment1 <em>Policy Attachment1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Attachment1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyAttachment1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PolicyAttachment1();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyReference1 <em>Policy Reference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Reference1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyReference1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PolicyReference1();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional1 <em>Optional1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#isOptional1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Optional1();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyURIs1 <em>Policy UR Is1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy UR Is1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot#getPolicyURIs1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PolicyURIs1();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType <em>Operator Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Content Type</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType
	 * @generated
	 */
	EClass getOperatorContentType();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getGroup()
	 * @see #getOperatorContentType()
	 * @generated
	 */
	EAttribute getOperatorContentType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getPolicy()
	 * @see #getOperatorContentType()
	 * @generated
	 */
	EReference getOperatorContentType_Policy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getAll()
	 * @see #getOperatorContentType()
	 * @generated
	 */
	EReference getOperatorContentType_All();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getExactlyOne <em>Exactly One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exactly One</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getExactlyOne()
	 * @see #getOperatorContentType()
	 * @generated
	 */
	EReference getOperatorContentType_ExactlyOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getPolicyReference <em>Policy Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Reference</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getPolicyReference()
	 * @see #getOperatorContentType()
	 * @generated
	 */
	EReference getOperatorContentType_PolicyReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType#getAny()
	 * @see #getOperatorContentType()
	 * @generated
	 */
	EAttribute getOperatorContentType_Any();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1 <em>Operator Content Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Content Type1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1
	 * @generated
	 */
	EClass getOperatorContentType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getGroup()
	 * @see #getOperatorContentType1()
	 * @generated
	 */
	EAttribute getOperatorContentType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getPolicy()
	 * @see #getOperatorContentType1()
	 * @generated
	 */
	EReference getOperatorContentType1_Policy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getAll()
	 * @see #getOperatorContentType1()
	 * @generated
	 */
	EReference getOperatorContentType1_All();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getExactlyOne <em>Exactly One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exactly One</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getExactlyOne()
	 * @see #getOperatorContentType1()
	 * @generated
	 */
	EReference getOperatorContentType1_ExactlyOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getPolicyReference <em>Policy Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Reference</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getPolicyReference()
	 * @see #getOperatorContentType1()
	 * @generated
	 */
	EReference getOperatorContentType1_PolicyReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getAny()
	 * @see #getOperatorContentType1()
	 * @generated
	 */
	EAttribute getOperatorContentType1_Any();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType <em>Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Type</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType
	 * @generated
	 */
	EClass getPolicyAttachmentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applies To</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getAppliesTo()
	 * @see #getPolicyAttachmentType()
	 * @generated
	 */
	EReference getPolicyAttachmentType_AppliesTo();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getGroup()
	 * @see #getPolicyAttachmentType()
	 * @generated
	 */
	EAttribute getPolicyAttachmentType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getPolicy()
	 * @see #getPolicyAttachmentType()
	 * @generated
	 */
	EReference getPolicyAttachmentType_Policy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getPolicyReference <em>Policy Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Reference</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getPolicyReference()
	 * @see #getPolicyAttachmentType()
	 * @generated
	 */
	EReference getPolicyAttachmentType_PolicyReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getAny()
	 * @see #getPolicyAttachmentType()
	 * @generated
	 */
	EAttribute getPolicyAttachmentType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType#getAnyAttribute()
	 * @see #getPolicyAttachmentType()
	 * @generated
	 */
	EAttribute getPolicyAttachmentType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1 <em>Attachment Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Type1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1
	 * @generated
	 */
	EClass getPolicyAttachmentType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applies To</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getAppliesTo()
	 * @see #getPolicyAttachmentType1()
	 * @generated
	 */
	EReference getPolicyAttachmentType1_AppliesTo();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getGroup()
	 * @see #getPolicyAttachmentType1()
	 * @generated
	 */
	EAttribute getPolicyAttachmentType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getPolicy()
	 * @see #getPolicyAttachmentType1()
	 * @generated
	 */
	EReference getPolicyAttachmentType1_Policy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getPolicyReference <em>Policy Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Reference</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getPolicyReference()
	 * @see #getPolicyAttachmentType1()
	 * @generated
	 */
	EReference getPolicyAttachmentType1_PolicyReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getAny()
	 * @see #getPolicyAttachmentType1()
	 * @generated
	 */
	EAttribute getPolicyAttachmentType1_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getAnyAttribute()
	 * @see #getPolicyAttachmentType1()
	 * @generated
	 */
	EAttribute getPolicyAttachmentType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType
	 * @generated
	 */
	EClass getPolicyReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType#getDigest <em>Digest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType#getDigest()
	 * @see #getPolicyReferenceType()
	 * @generated
	 */
	EAttribute getPolicyReferenceType_Digest();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType#getDigestAlgorithm <em>Digest Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest Algorithm</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType#getDigestAlgorithm()
	 * @see #getPolicyReferenceType()
	 * @generated
	 */
	EAttribute getPolicyReferenceType_DigestAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType#getURI()
	 * @see #getPolicyReferenceType()
	 * @generated
	 */
	EAttribute getPolicyReferenceType_URI();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType#getAnyAttribute()
	 * @see #getPolicyReferenceType()
	 * @generated
	 */
	EAttribute getPolicyReferenceType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1 <em>Reference Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1
	 * @generated
	 */
	EClass getPolicyReferenceType1();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getDigest <em>Digest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getDigest()
	 * @see #getPolicyReferenceType1()
	 * @generated
	 */
	EAttribute getPolicyReferenceType1_Digest();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getDigestAlgorithm <em>Digest Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest Algorithm</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getDigestAlgorithm()
	 * @see #getPolicyReferenceType1()
	 * @generated
	 */
	EAttribute getPolicyReferenceType1_DigestAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getURI()
	 * @see #getPolicyReferenceType1()
	 * @generated
	 */
	EAttribute getPolicyReferenceType1_URI();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getAnyAttribute()
	 * @see #getPolicyReferenceType1()
	 * @generated
	 */
	EAttribute getPolicyReferenceType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType
	 * @generated
	 */
	EClass getPolicyType();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType#getId()
	 * @see #getPolicyType()
	 * @generated
	 */
	EAttribute getPolicyType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType#getName()
	 * @see #getPolicyType()
	 * @generated
	 */
	EAttribute getPolicyType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType#getAnyAttribute()
	 * @see #getPolicyType()
	 * @generated
	 */
	EAttribute getPolicyType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type1</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1
	 * @generated
	 */
	EClass getPolicyType1();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1#getId()
	 * @see #getPolicyType1()
	 * @generated
	 */
	EAttribute getPolicyType1_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1#getName()
	 * @see #getPolicyType1()
	 * @generated
	 */
	EAttribute getPolicyType1_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1#getAnyAttribute()
	 * @see #getPolicyType1()
	 * @generated
	 */
	EAttribute getPolicyType1_AnyAttribute();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>UR Is Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UR Is Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='PolicyURIs_._1_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getPolicyURIsType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>UR Is Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UR Is Type1</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='PolicyURIs_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getPolicyURIsType1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolicyFactory getPolicyFactory();

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
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.AppliesToTypeImpl <em>Applies To Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.AppliesToTypeImpl
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getAppliesToType()
		 * @generated
		 */
		EClass APPLIES_TO_TYPE = eINSTANCE.getAppliesToType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLIES_TO_TYPE__ANY = eINSTANCE.getAppliesToType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLIES_TO_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAppliesToType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.AppliesToType1Impl <em>Applies To Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.AppliesToType1Impl
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getAppliesToType1()
		 * @generated
		 */
		EClass APPLIES_TO_TYPE1 = eINSTANCE.getAppliesToType1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLIES_TO_TYPE1__ANY = eINSTANCE.getAppliesToType1_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLIES_TO_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getAppliesToType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.DocumentRootImpl
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ALL = eINSTANCE.getDocumentRoot_All();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLIES_TO = eINSTANCE.getDocumentRoot_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Exactly One</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXACTLY_ONE = eINSTANCE.getDocumentRoot_ExactlyOne();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POLICY = eINSTANCE.getDocumentRoot_Policy();

		/**
		 * The meta object literal for the '<em><b>Policy Attachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POLICY_ATTACHMENT = eINSTANCE.getDocumentRoot_PolicyAttachment();

		/**
		 * The meta object literal for the '<em><b>Policy Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POLICY_REFERENCE = eINSTANCE.getDocumentRoot_PolicyReference();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__OPTIONAL = eINSTANCE.getDocumentRoot_Optional();

		/**
		 * The meta object literal for the '<em><b>Policy UR Is</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__POLICY_UR_IS = eINSTANCE.getDocumentRoot_PolicyURIs();

		/**
		 * The meta object literal for the '<em><b>All1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ALL1 = eINSTANCE.getDocumentRoot_All1();

		/**
		 * The meta object literal for the '<em><b>Applies To1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLIES_TO1 = eINSTANCE.getDocumentRoot_AppliesTo1();

		/**
		 * The meta object literal for the '<em><b>Exactly One1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXACTLY_ONE1 = eINSTANCE.getDocumentRoot_ExactlyOne1();

		/**
		 * The meta object literal for the '<em><b>Policy1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POLICY1 = eINSTANCE.getDocumentRoot_Policy1();

		/**
		 * The meta object literal for the '<em><b>Policy Attachment1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POLICY_ATTACHMENT1 = eINSTANCE.getDocumentRoot_PolicyAttachment1();

		/**
		 * The meta object literal for the '<em><b>Policy Reference1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POLICY_REFERENCE1 = eINSTANCE.getDocumentRoot_PolicyReference1();

		/**
		 * The meta object literal for the '<em><b>Optional1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__OPTIONAL1 = eINSTANCE.getDocumentRoot_Optional1();

		/**
		 * The meta object literal for the '<em><b>Policy UR Is1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__POLICY_UR_IS1 = eINSTANCE.getDocumentRoot_PolicyURIs1();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentTypeImpl <em>Operator Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentTypeImpl
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getOperatorContentType()
		 * @generated
		 */
		EClass OPERATOR_CONTENT_TYPE = eINSTANCE.getOperatorContentType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_CONTENT_TYPE__GROUP = eINSTANCE.getOperatorContentType_Group();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_CONTENT_TYPE__POLICY = eINSTANCE.getOperatorContentType_Policy();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_CONTENT_TYPE__ALL = eINSTANCE.getOperatorContentType_All();

		/**
		 * The meta object literal for the '<em><b>Exactly One</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_CONTENT_TYPE__EXACTLY_ONE = eINSTANCE.getOperatorContentType_ExactlyOne();

		/**
		 * The meta object literal for the '<em><b>Policy Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_CONTENT_TYPE__POLICY_REFERENCE = eINSTANCE.getOperatorContentType_PolicyReference();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_CONTENT_TYPE__ANY = eINSTANCE.getOperatorContentType_Any();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentType1Impl <em>Operator Content Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.OperatorContentType1Impl
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getOperatorContentType1()
		 * @generated
		 */
		EClass OPERATOR_CONTENT_TYPE1 = eINSTANCE.getOperatorContentType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_CONTENT_TYPE1__GROUP = eINSTANCE.getOperatorContentType1_Group();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_CONTENT_TYPE1__POLICY = eINSTANCE.getOperatorContentType1_Policy();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_CONTENT_TYPE1__ALL = eINSTANCE.getOperatorContentType1_All();

		/**
		 * The meta object literal for the '<em><b>Exactly One</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_CONTENT_TYPE1__EXACTLY_ONE = eINSTANCE.getOperatorContentType1_ExactlyOne();

		/**
		 * The meta object literal for the '<em><b>Policy Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_CONTENT_TYPE1__POLICY_REFERENCE = eINSTANCE.getOperatorContentType1_PolicyReference();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_CONTENT_TYPE1__ANY = eINSTANCE.getOperatorContentType1_Any();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentTypeImpl <em>Attachment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentTypeImpl
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyAttachmentType()
		 * @generated
		 */
		EClass POLICY_ATTACHMENT_TYPE = eINSTANCE.getPolicyAttachmentType();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTACHMENT_TYPE__APPLIES_TO = eINSTANCE.getPolicyAttachmentType_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_ATTACHMENT_TYPE__GROUP = eINSTANCE.getPolicyAttachmentType_Group();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTACHMENT_TYPE__POLICY = eINSTANCE.getPolicyAttachmentType_Policy();

		/**
		 * The meta object literal for the '<em><b>Policy Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE = eINSTANCE.getPolicyAttachmentType_PolicyReference();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_ATTACHMENT_TYPE__ANY = eINSTANCE.getPolicyAttachmentType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE = eINSTANCE.getPolicyAttachmentType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentType1Impl <em>Attachment Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyAttachmentType1Impl
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyAttachmentType1()
		 * @generated
		 */
		EClass POLICY_ATTACHMENT_TYPE1 = eINSTANCE.getPolicyAttachmentType1();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTACHMENT_TYPE1__APPLIES_TO = eINSTANCE.getPolicyAttachmentType1_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_ATTACHMENT_TYPE1__GROUP = eINSTANCE.getPolicyAttachmentType1_Group();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTACHMENT_TYPE1__POLICY = eINSTANCE.getPolicyAttachmentType1_Policy();

		/**
		 * The meta object literal for the '<em><b>Policy Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTACHMENT_TYPE1__POLICY_REFERENCE = eINSTANCE.getPolicyAttachmentType1_PolicyReference();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_ATTACHMENT_TYPE1__ANY = eINSTANCE.getPolicyAttachmentType1_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_ATTACHMENT_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getPolicyAttachmentType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceTypeImpl
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyReferenceType()
		 * @generated
		 */
		EClass POLICY_REFERENCE_TYPE = eINSTANCE.getPolicyReferenceType();

		/**
		 * The meta object literal for the '<em><b>Digest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_REFERENCE_TYPE__DIGEST = eINSTANCE.getPolicyReferenceType_Digest();

		/**
		 * The meta object literal for the '<em><b>Digest Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_REFERENCE_TYPE__DIGEST_ALGORITHM = eINSTANCE.getPolicyReferenceType_DigestAlgorithm();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_REFERENCE_TYPE__URI = eINSTANCE.getPolicyReferenceType_URI();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_REFERENCE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getPolicyReferenceType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceType1Impl <em>Reference Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyReferenceType1Impl
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyReferenceType1()
		 * @generated
		 */
		EClass POLICY_REFERENCE_TYPE1 = eINSTANCE.getPolicyReferenceType1();

		/**
		 * The meta object literal for the '<em><b>Digest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_REFERENCE_TYPE1__DIGEST = eINSTANCE.getPolicyReferenceType1_Digest();

		/**
		 * The meta object literal for the '<em><b>Digest Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_REFERENCE_TYPE1__DIGEST_ALGORITHM = eINSTANCE.getPolicyReferenceType1_DigestAlgorithm();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_REFERENCE_TYPE1__URI = eINSTANCE.getPolicyReferenceType1_URI();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_REFERENCE_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getPolicyReferenceType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyTypeImpl
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyType()
		 * @generated
		 */
		EClass POLICY_TYPE = eINSTANCE.getPolicyType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_TYPE__ID = eINSTANCE.getPolicyType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_TYPE__NAME = eINSTANCE.getPolicyType_Name();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_TYPE__ANY_ATTRIBUTE = eINSTANCE.getPolicyType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyType1Impl <em>Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyType1Impl
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyType1()
		 * @generated
		 */
		EClass POLICY_TYPE1 = eINSTANCE.getPolicyType1();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_TYPE1__ID = eINSTANCE.getPolicyType1_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_TYPE1__NAME = eINSTANCE.getPolicyType1_Name();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getPolicyType1_AnyAttribute();

		/**
		 * The meta object literal for the '<em>UR Is Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyURIsType()
		 * @generated
		 */
		EDataType POLICY_UR_IS_TYPE = eINSTANCE.getPolicyURIsType();

		/**
		 * The meta object literal for the '<em>UR Is Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl#getPolicyURIsType1()
		 * @generated
		 */
		EDataType POLICY_UR_IS_TYPE1 = eINSTANCE.getPolicyURIsType1();

	}

} //PolicyPackage
