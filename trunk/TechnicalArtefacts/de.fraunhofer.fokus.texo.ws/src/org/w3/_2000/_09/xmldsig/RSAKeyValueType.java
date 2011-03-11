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
 * A representation of the model object '<em><b>RSA Key Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.RSAKeyValueType#getModulus <em>Modulus</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.RSAKeyValueType#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getRSAKeyValueType()
 * @model extendedMetaData="name='RSAKeyValueType' kind='elementOnly'"
 * @generated
 */
public interface RSAKeyValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Modulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulus</em>' attribute.
	 * @see #setModulus(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getRSAKeyValueType_Modulus()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary" required="true"
	 *        extendedMetaData="kind='element' name='Modulus' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getModulus();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.RSAKeyValueType#getModulus <em>Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulus</em>' attribute.
	 * @see #getModulus()
	 * @generated
	 */
	void setModulus(byte[] value);

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getRSAKeyValueType_Exponent()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary" required="true"
	 *        extendedMetaData="kind='element' name='Exponent' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getExponent();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.RSAKeyValueType#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(byte[] value);

} // RSAKeyValueType
