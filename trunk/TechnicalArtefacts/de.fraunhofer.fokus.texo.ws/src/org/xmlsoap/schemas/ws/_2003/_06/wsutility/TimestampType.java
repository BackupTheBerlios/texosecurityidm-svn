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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * This complex type ties together the timestamp related elements into a composite type.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getCreated <em>Created</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getAny <em>Any</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getId <em>Id</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage#getTimestampType()
 * @model extendedMetaData="name='TimestampType' kind='elementOnly'"
 * @generated
 */
public interface TimestampType extends EObject {
	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * This element allows a creation time to be applied anywhere element wildcards are present.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(AttributedDateTime)
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage#getTimestampType_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Created' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedDateTime getCreated();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(AttributedDateTime value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * This element allows an expiration time to be applied anywhere element wildcards are present.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expires</em>' containment reference.
	 * @see #setExpires(AttributedDateTime)
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage#getTimestampType_Expires()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Expires' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedDateTime getExpires();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getExpires <em>Expires</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' containment reference.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(AttributedDateTime value);

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
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage#getTimestampType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:2'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage#getTimestampType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax' group='#group:2'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * This global attribute supports annotating arbitrary elements with an ID.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage#getTimestampType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage#getTimestampType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // TimestampType
