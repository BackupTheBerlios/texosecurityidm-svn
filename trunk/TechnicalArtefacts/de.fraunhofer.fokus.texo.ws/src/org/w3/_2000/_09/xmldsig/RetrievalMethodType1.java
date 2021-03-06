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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retrieval Method Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.RetrievalMethodType1#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.RetrievalMethodType1#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.RetrievalMethodType1#getURI <em>URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getRetrievalMethodType1()
 * @model extendedMetaData="name='RetrievalMethodType' kind='elementOnly'"
 * @generated
 */
public interface RetrievalMethodType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transforms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transforms</em>' containment reference.
	 * @see #setTransforms(TransformsType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getRetrievalMethodType1_Transforms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Transforms' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformsType1 getTransforms();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.RetrievalMethodType1#getTransforms <em>Transforms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transforms</em>' containment reference.
	 * @see #getTransforms()
	 * @generated
	 */
	void setTransforms(TransformsType1 value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getRetrievalMethodType1_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.RetrievalMethodType1#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getRetrievalMethodType1_URI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='URI'"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.RetrievalMethodType1#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

} // RetrievalMethodType1
