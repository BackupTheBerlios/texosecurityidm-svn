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
package org.open.oasis.docs.ws.sx.ws.trust.wstrust;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renewing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isAllow <em>Allow</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isOK <em>OK</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRenewingType()
 * @model extendedMetaData="name='RenewingType' kind='empty'"
 * @generated
 */
public interface RenewingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Allow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow</em>' attribute.
	 * @see #isSetAllow()
	 * @see #unsetAllow()
	 * @see #setAllow(boolean)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRenewingType_Allow()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Allow'"
	 * @generated
	 */
	boolean isAllow();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isAllow <em>Allow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow</em>' attribute.
	 * @see #isSetAllow()
	 * @see #unsetAllow()
	 * @see #isAllow()
	 * @generated
	 */
	void setAllow(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isAllow <em>Allow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllow()
	 * @see #isAllow()
	 * @see #setAllow(boolean)
	 * @generated
	 */
	void unsetAllow();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isAllow <em>Allow</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow</em>' attribute is set.
	 * @see #unsetAllow()
	 * @see #isAllow()
	 * @see #setAllow(boolean)
	 * @generated
	 */
	boolean isSetAllow();

	/**
	 * Returns the value of the '<em><b>OK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OK</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OK</em>' attribute.
	 * @see #isSetOK()
	 * @see #unsetOK()
	 * @see #setOK(boolean)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRenewingType_OK()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='OK'"
	 * @generated
	 */
	boolean isOK();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isOK <em>OK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OK</em>' attribute.
	 * @see #isSetOK()
	 * @see #unsetOK()
	 * @see #isOK()
	 * @generated
	 */
	void setOK(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isOK <em>OK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOK()
	 * @see #isOK()
	 * @see #setOK(boolean)
	 * @generated
	 */
	void unsetOK();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType#isOK <em>OK</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>OK</em>' attribute is set.
	 * @see #unsetOK()
	 * @see #isOK()
	 * @see #setOK(boolean)
	 * @generated
	 */
	boolean isSetOK();

} // RenewingType
