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
 * A representation of the model object '<em><b>Key Info Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType1#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType1#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType1#getKeyValue <em>Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType1#getRetrievalMethod <em>Retrieval Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType1#getX509Data <em>X509 Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType1#getPGPData <em>PGP Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType1#getSPKIData <em>SPKI Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType1#getMgmtData <em>Mgmt Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType1#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType1#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1()
 * @model extendedMetaData="name='KeyInfoType' kind='mixed'"
 * @generated
 */
public interface KeyInfoType1 extends EObject {
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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Key Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1_KeyName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyName' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<String> getKeyName();

	/**
	 * Returns the value of the '<em><b>Key Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.KeyValueType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1_KeyValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyValue' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<KeyValueType1> getKeyValue();

	/**
	 * Returns the value of the '<em><b>Retrieval Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.RetrievalMethodType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retrieval Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retrieval Method</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1_RetrievalMethod()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RetrievalMethod' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<RetrievalMethodType1> getRetrievalMethod();

	/**
	 * Returns the value of the '<em><b>X509 Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.X509DataType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509 Data</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1_X509Data()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509Data' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<X509DataType1> getX509Data();

	/**
	 * Returns the value of the '<em><b>PGP Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.PGPDataType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PGP Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PGP Data</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1_PGPData()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PGPData' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PGPDataType1> getPGPData();

	/**
	 * Returns the value of the '<em><b>SPKI Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.SPKIDataType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPKI Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPKI Data</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1_SPKIData()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPKIData' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SPKIDataType1> getSPKIData();

	/**
	 * Returns the value of the '<em><b>Mgmt Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mgmt Data</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mgmt Data</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1_MgmtData()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MgmtData' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<String> getMgmtData();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':9' processing='lax' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType1_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.KeyInfoType1#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // KeyInfoType1
