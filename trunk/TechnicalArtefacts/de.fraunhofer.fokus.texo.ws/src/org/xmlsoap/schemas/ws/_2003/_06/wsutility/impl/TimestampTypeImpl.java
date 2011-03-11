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
package org.xmlsoap.schemas.ws._2003._06.wsutility.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime;
import org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType;
import org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timestamp Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.TimestampTypeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.TimestampTypeImpl#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.TimestampTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.TimestampTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.TimestampTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._06.wsutility.impl.TimestampTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimestampTypeImpl extends EObjectImpl implements TimestampType {
	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected AttributedDateTime created;

	/**
	 * The cached value of the '{@link #getExpires() <em>Expires</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected AttributedDateTime expires;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimestampTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilityPackage.Literals.TIMESTAMP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedDateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(AttributedDateTime newCreated, NotificationChain msgs) {
		AttributedDateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UtilityPackage.TIMESTAMP_TYPE__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(AttributedDateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UtilityPackage.TIMESTAMP_TYPE__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UtilityPackage.TIMESTAMP_TYPE__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.TIMESTAMP_TYPE__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedDateTime getExpires() {
		return expires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpires(AttributedDateTime newExpires, NotificationChain msgs) {
		AttributedDateTime oldExpires = expires;
		expires = newExpires;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UtilityPackage.TIMESTAMP_TYPE__EXPIRES, oldExpires, newExpires);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpires(AttributedDateTime newExpires) {
		if (newExpires != expires) {
			NotificationChain msgs = null;
			if (expires != null)
				msgs = ((InternalEObject)expires).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UtilityPackage.TIMESTAMP_TYPE__EXPIRES, null, msgs);
			if (newExpires != null)
				msgs = ((InternalEObject)newExpires).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UtilityPackage.TIMESTAMP_TYPE__EXPIRES, null, msgs);
			msgs = basicSetExpires(newExpires, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.TIMESTAMP_TYPE__EXPIRES, newExpires, newExpires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, UtilityPackage.TIMESTAMP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(UtilityPackage.Literals.TIMESTAMP_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.TIMESTAMP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, UtilityPackage.TIMESTAMP_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UtilityPackage.TIMESTAMP_TYPE__CREATED:
				return basicSetCreated(null, msgs);
			case UtilityPackage.TIMESTAMP_TYPE__EXPIRES:
				return basicSetExpires(null, msgs);
			case UtilityPackage.TIMESTAMP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case UtilityPackage.TIMESTAMP_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case UtilityPackage.TIMESTAMP_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilityPackage.TIMESTAMP_TYPE__CREATED:
				return getCreated();
			case UtilityPackage.TIMESTAMP_TYPE__EXPIRES:
				return getExpires();
			case UtilityPackage.TIMESTAMP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case UtilityPackage.TIMESTAMP_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case UtilityPackage.TIMESTAMP_TYPE__ID:
				return getId();
			case UtilityPackage.TIMESTAMP_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UtilityPackage.TIMESTAMP_TYPE__CREATED:
				setCreated((AttributedDateTime)newValue);
				return;
			case UtilityPackage.TIMESTAMP_TYPE__EXPIRES:
				setExpires((AttributedDateTime)newValue);
				return;
			case UtilityPackage.TIMESTAMP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case UtilityPackage.TIMESTAMP_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case UtilityPackage.TIMESTAMP_TYPE__ID:
				setId((String)newValue);
				return;
			case UtilityPackage.TIMESTAMP_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UtilityPackage.TIMESTAMP_TYPE__CREATED:
				setCreated((AttributedDateTime)null);
				return;
			case UtilityPackage.TIMESTAMP_TYPE__EXPIRES:
				setExpires((AttributedDateTime)null);
				return;
			case UtilityPackage.TIMESTAMP_TYPE__GROUP:
				getGroup().clear();
				return;
			case UtilityPackage.TIMESTAMP_TYPE__ANY:
				getAny().clear();
				return;
			case UtilityPackage.TIMESTAMP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case UtilityPackage.TIMESTAMP_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UtilityPackage.TIMESTAMP_TYPE__CREATED:
				return created != null;
			case UtilityPackage.TIMESTAMP_TYPE__EXPIRES:
				return expires != null;
			case UtilityPackage.TIMESTAMP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case UtilityPackage.TIMESTAMP_TYPE__ANY:
				return !getAny().isEmpty();
			case UtilityPackage.TIMESTAMP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UtilityPackage.TIMESTAMP_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", id: ");
		result.append(id);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //TimestampTypeImpl
