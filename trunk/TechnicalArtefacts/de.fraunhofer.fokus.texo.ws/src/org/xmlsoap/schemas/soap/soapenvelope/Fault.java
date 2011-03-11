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
package org.xmlsoap.schemas.soap.soapenvelope;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	    Fault reporting structure
 * 	  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.soap.soapenvelope.Fault#getFaultcode <em>Faultcode</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.soap.soapenvelope.Fault#getFaultstring <em>Faultstring</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.soap.soapenvelope.Fault#getFaultactor <em>Faultactor</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.soap.soapenvelope.Fault#getDetail <em>Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage#getFault()
 * @model extendedMetaData="name='Fault' kind='elementOnly'"
 * @generated
 */
public interface Fault extends EObject {
	/**
	 * Returns the value of the '<em><b>Faultcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faultcode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faultcode</em>' attribute.
	 * @see #setFaultcode(QName)
	 * @see org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage#getFault_Faultcode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='element' name='faultcode'"
	 * @generated
	 */
	QName getFaultcode();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.soap.soapenvelope.Fault#getFaultcode <em>Faultcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faultcode</em>' attribute.
	 * @see #getFaultcode()
	 * @generated
	 */
	void setFaultcode(QName value);

	/**
	 * Returns the value of the '<em><b>Faultstring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faultstring</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faultstring</em>' attribute.
	 * @see #setFaultstring(String)
	 * @see org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage#getFault_Faultstring()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='faultstring'"
	 * @generated
	 */
	String getFaultstring();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.soap.soapenvelope.Fault#getFaultstring <em>Faultstring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faultstring</em>' attribute.
	 * @see #getFaultstring()
	 * @generated
	 */
	void setFaultstring(String value);

	/**
	 * Returns the value of the '<em><b>Faultactor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faultactor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faultactor</em>' attribute.
	 * @see #setFaultactor(String)
	 * @see org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage#getFault_Faultactor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='faultactor'"
	 * @generated
	 */
	String getFaultactor();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.soap.soapenvelope.Fault#getFaultactor <em>Faultactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faultactor</em>' attribute.
	 * @see #getFaultactor()
	 * @generated
	 */
	void setFaultactor(String value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(Detail)
	 * @see org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage#getFault_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail'"
	 * @generated
	 */
	Detail getDetail();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.soap.soapenvelope.Fault#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(Detail value);

} // Fault
