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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>X509 Data Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.X509DataType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.X509DataType1#getX509IssuerSerial <em>X509 Issuer Serial</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.X509DataType1#getX509SKI <em>X509SKI</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.X509DataType1#getX509SubjectName <em>X509 Subject Name</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.X509DataType1#getX509Certificate <em>X509 Certificate</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.X509DataType1#getX509CRL <em>X509CRL</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.X509DataType1#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType1()
 * @model extendedMetaData="name='X509DataType' kind='elementOnly'"
 * @generated
 */
public interface X509DataType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>X509 Issuer Serial</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.X509IssuerSerialType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Issuer Serial</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509 Issuer Serial</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType1_X509IssuerSerial()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509IssuerSerial' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<X509IssuerSerialType1> getX509IssuerSerial();

	/**
	 * Returns the value of the '<em><b>X509SKI</b></em>' attribute list.
	 * The list contents are of type {@link byte}[].
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509SKI</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509SKI</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType1_X509SKI()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509SKI' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<byte[]> getX509SKI();

	/**
	 * Returns the value of the '<em><b>X509 Subject Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Subject Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509 Subject Name</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType1_X509SubjectName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509SubjectName' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getX509SubjectName();

	/**
	 * Returns the value of the '<em><b>X509 Certificate</b></em>' attribute list.
	 * The list contents are of type {@link byte}[].
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Certificate</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509 Certificate</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType1_X509Certificate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509Certificate' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<byte[]> getX509Certificate();

	/**
	 * Returns the value of the '<em><b>X509CRL</b></em>' attribute list.
	 * The list contents are of type {@link byte}[].
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509CRL</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509CRL</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType1_X509CRL()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509CRL' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<byte[]> getX509CRL();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType1_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':6' processing='lax' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

} // X509DataType1
