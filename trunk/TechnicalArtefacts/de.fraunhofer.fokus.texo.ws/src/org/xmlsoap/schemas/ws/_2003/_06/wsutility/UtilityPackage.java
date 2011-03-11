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
package org.xmlsoap.schemas.ws._2003._06.wsutility;

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
 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityFactory
 * @model kind="package"
 * @generated
 */
public interface UtilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wsutility";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.xmlsoap.org/ws/2003/06/utility";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wsu";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilityPackage eINSTANCE = org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.AttributedDateTimeImpl <em>Attributed Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.AttributedDateTimeImpl
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl#getAttributedDateTime()
	 * @generated
	 */
	int ATTRIBUTED_DATE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_DATE_TIME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_DATE_TIME__ID = 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_DATE_TIME__VALUE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_DATE_TIME__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Attributed Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_DATE_TIME_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.AttributedURIImpl <em>Attributed URI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.AttributedURIImpl
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl#getAttributedURI()
	 * @generated
	 */
	int ATTRIBUTED_URI = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI__ID = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Attributed URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.DocumentRootImpl
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATED = 3;

	/**
	 * The feature id for the '<em><b>Expires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPIRES = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIMESTAMP = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.TimestampTypeImpl <em>Timestamp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.TimestampTypeImpl
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl#getTimestampType()
	 * @generated
	 */
	int TIMESTAMP_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE__CREATED = 0;

	/**
	 * The feature id for the '<em><b>Expires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE__EXPIRES = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Timestamp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '<em>TTimestamp Fault</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.namespace.QName
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl#getTTimestampFault()
	 * @generated
	 */
	int TTIMESTAMP_FAULT = 4;


	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime <em>Attributed Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributed Date Time</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime
	 * @generated
	 */
	EClass getAttributedDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime#getValue()
	 * @see #getAttributedDateTime()
	 * @generated
	 */
	EAttribute getAttributedDateTime_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime#getId()
	 * @see #getAttributedDateTime()
	 * @generated
	 */
	EAttribute getAttributedDateTime_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime#getValueType()
	 * @see #getAttributedDateTime()
	 * @generated
	 */
	EAttribute getAttributedDateTime_ValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime#getAnyAttribute()
	 * @see #getAttributedDateTime()
	 * @generated
	 */
	EAttribute getAttributedDateTime_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedURI <em>Attributed URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributed URI</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedURI
	 * @generated
	 */
	EClass getAttributedURI();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedURI#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedURI#getValue()
	 * @see #getAttributedURI()
	 * @generated
	 */
	EAttribute getAttributedURI_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedURI#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedURI#getId()
	 * @see #getAttributedURI()
	 * @generated
	 */
	EAttribute getAttributedURI_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedURI#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedURI#getAnyAttribute()
	 * @see #getAttributedURI()
	 * @generated
	 */
	EAttribute getAttributedURI_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Created</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getCreated()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Created();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getExpires <em>Expires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expires</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getExpires()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Expires();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timestamp</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getTimestamp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType <em>Timestamp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp Type</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType
	 * @generated
	 */
	EClass getTimestampType();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Created</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getCreated()
	 * @see #getTimestampType()
	 * @generated
	 */
	EReference getTimestampType_Created();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getExpires <em>Expires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expires</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getExpires()
	 * @see #getTimestampType()
	 * @generated
	 */
	EReference getTimestampType_Expires();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getGroup()
	 * @see #getTimestampType()
	 * @generated
	 */
	EAttribute getTimestampType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getAny()
	 * @see #getTimestampType()
	 * @generated
	 */
	EAttribute getTimestampType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getId()
	 * @see #getTimestampType()
	 * @generated
	 */
	EAttribute getTimestampType_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getAnyAttribute()
	 * @see #getTimestampType()
	 * @generated
	 */
	EAttribute getTimestampType_AnyAttribute();

	/**
	 * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>TTimestamp Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TTimestamp Fault</em>'.
	 * @see javax.xml.namespace.QName
	 * @model instanceClass="javax.xml.namespace.QName"
	 *        extendedMetaData="name='tTimestampFault' baseType='http://www.eclipse.org/emf/2003/XMLType#QName' enumeration='{http://schemas.xmlsoap.org/ws/2003/06/utility}MessageExpired'"
	 * @generated
	 */
	EDataType getTTimestampFault();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilityFactory getUtilityFactory();

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
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.AttributedDateTimeImpl <em>Attributed Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.AttributedDateTimeImpl
		 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl#getAttributedDateTime()
		 * @generated
		 */
		EClass ATTRIBUTED_DATE_TIME = eINSTANCE.getAttributedDateTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_DATE_TIME__VALUE = eINSTANCE.getAttributedDateTime_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_DATE_TIME__ID = eINSTANCE.getAttributedDateTime_Id();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_DATE_TIME__VALUE_TYPE = eINSTANCE.getAttributedDateTime_ValueType();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_DATE_TIME__ANY_ATTRIBUTE = eINSTANCE.getAttributedDateTime_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.AttributedURIImpl <em>Attributed URI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.AttributedURIImpl
		 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl#getAttributedURI()
		 * @generated
		 */
		EClass ATTRIBUTED_URI = eINSTANCE.getAttributedURI();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_URI__VALUE = eINSTANCE.getAttributedURI_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_URI__ID = eINSTANCE.getAttributedURI_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_URI__ANY_ATTRIBUTE = eINSTANCE.getAttributedURI_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.DocumentRootImpl
		 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Created</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CREATED = eINSTANCE.getDocumentRoot_Created();

		/**
		 * The meta object literal for the '<em><b>Expires</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXPIRES = eINSTANCE.getDocumentRoot_Expires();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TIMESTAMP = eINSTANCE.getDocumentRoot_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_Id();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.TimestampTypeImpl <em>Timestamp Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.TimestampTypeImpl
		 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl#getTimestampType()
		 * @generated
		 */
		EClass TIMESTAMP_TYPE = eINSTANCE.getTimestampType();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESTAMP_TYPE__CREATED = eINSTANCE.getTimestampType_Created();

		/**
		 * The meta object literal for the '<em><b>Expires</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESTAMP_TYPE__EXPIRES = eINSTANCE.getTimestampType_Expires();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMP_TYPE__GROUP = eINSTANCE.getTimestampType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMP_TYPE__ANY = eINSTANCE.getTimestampType_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMP_TYPE__ID = eINSTANCE.getTimestampType_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMP_TYPE__ANY_ATTRIBUTE = eINSTANCE.getTimestampType_AnyAttribute();

		/**
		 * The meta object literal for the '<em>TTimestamp Fault</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.namespace.QName
		 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl#getTTimestampFault()
		 * @generated
		 */
		EDataType TTIMESTAMP_FAULT = eINSTANCE.getTTimestampFault();

	}

} //UtilityPackage
