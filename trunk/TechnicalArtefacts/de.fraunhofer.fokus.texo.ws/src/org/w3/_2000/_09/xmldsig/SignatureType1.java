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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.SignatureType1#getSignedInfo <em>Signed Info</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.SignatureType1#getSignatureValue <em>Signature Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.SignatureType1#getKeyInfo <em>Key Info</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.SignatureType1#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.SignatureType1#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType1()
 * @model extendedMetaData="name='SignatureType' kind='elementOnly'"
 * @generated
 */
public interface SignatureType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Signed Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signed Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed Info</em>' containment reference.
	 * @see #setSignedInfo(SignedInfoType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType1_SignedInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SignedInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	SignedInfoType1 getSignedInfo();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignatureType1#getSignedInfo <em>Signed Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed Info</em>' containment reference.
	 * @see #getSignedInfo()
	 * @generated
	 */
	void setSignedInfo(SignedInfoType1 value);

	/**
	 * Returns the value of the '<em><b>Signature Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Value</em>' containment reference.
	 * @see #setSignatureValue(SignatureValueType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType1_SignatureValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SignatureValue' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureValueType1 getSignatureValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignatureType1#getSignatureValue <em>Signature Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Value</em>' containment reference.
	 * @see #getSignatureValue()
	 * @generated
	 */
	void setSignatureValue(SignatureValueType1 value);

	/**
	 * Returns the value of the '<em><b>Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Info</em>' containment reference.
	 * @see #setKeyInfo(KeyInfoType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType1_KeyInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeyInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyInfoType1 getKeyInfo();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignatureType1#getKeyInfo <em>Key Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Info</em>' containment reference.
	 * @see #getKeyInfo()
	 * @generated
	 */
	void setKeyInfo(KeyInfoType1 value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.ObjectType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType1_Object()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Object' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectType1> getObject();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType1_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignatureType1#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SignatureType1
