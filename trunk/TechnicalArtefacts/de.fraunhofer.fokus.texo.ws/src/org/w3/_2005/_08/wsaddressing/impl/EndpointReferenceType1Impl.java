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
package org.w3._2005._08.wsaddressing.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2005._08.wsaddressing.AddressingPackage;
import org.w3._2005._08.wsaddressing.AttributedURIType1;
import org.w3._2005._08.wsaddressing.EndpointReferenceType1;
import org.w3._2005._08.wsaddressing.MetadataType1;
import org.w3._2005._08.wsaddressing.ReferenceParametersType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Reference Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.EndpointReferenceType1Impl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.EndpointReferenceType1Impl#getReferenceParameters <em>Reference Parameters</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.EndpointReferenceType1Impl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.EndpointReferenceType1Impl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2005._08.wsaddressing.impl.EndpointReferenceType1Impl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndpointReferenceType1Impl extends EObjectImpl implements EndpointReferenceType1 {
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected AttributedURIType1 address;

	/**
	 * The cached value of the '{@link #getReferenceParameters() <em>Reference Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceParameters()
	 * @generated
	 * @ordered
	 */
	protected ReferenceParametersType1 referenceParameters;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected MetadataType1 metadata;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

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
	protected EndpointReferenceType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressingPackage.Literals.ENDPOINT_REFERENCE_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType1 getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AttributedURIType1 newAddress, NotificationChain msgs) {
		AttributedURIType1 oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(AttributedURIType1 newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceParametersType1 getReferenceParameters() {
		return referenceParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceParameters(ReferenceParametersType1 newReferenceParameters, NotificationChain msgs) {
		ReferenceParametersType1 oldReferenceParameters = referenceParameters;
		referenceParameters = newReferenceParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AddressingPackage.ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS, oldReferenceParameters, newReferenceParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceParameters(ReferenceParametersType1 newReferenceParameters) {
		if (newReferenceParameters != referenceParameters) {
			NotificationChain msgs = null;
			if (referenceParameters != null)
				msgs = ((InternalEObject)referenceParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AddressingPackage.ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS, null, msgs);
			if (newReferenceParameters != null)
				msgs = ((InternalEObject)newReferenceParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AddressingPackage.ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS, null, msgs);
			msgs = basicSetReferenceParameters(newReferenceParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressingPackage.ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS, newReferenceParameters, newReferenceParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType1 getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(MetadataType1 newMetadata, NotificationChain msgs) {
		MetadataType1 oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AddressingPackage.ENDPOINT_REFERENCE_TYPE1__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(MetadataType1 newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AddressingPackage.ENDPOINT_REFERENCE_TYPE1__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AddressingPackage.ENDPOINT_REFERENCE_TYPE1__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressingPackage.ENDPOINT_REFERENCE_TYPE1__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY_ATTRIBUTE);
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
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ADDRESS:
				return basicSetAddress(null, msgs);
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS:
				return basicSetReferenceParameters(null, msgs);
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__METADATA:
				return basicSetMetadata(null, msgs);
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY_ATTRIBUTE:
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
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ADDRESS:
				return getAddress();
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS:
				return getReferenceParameters();
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__METADATA:
				return getMetadata();
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY_ATTRIBUTE:
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
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ADDRESS:
				setAddress((AttributedURIType1)newValue);
				return;
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS:
				setReferenceParameters((ReferenceParametersType1)newValue);
				return;
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__METADATA:
				setMetadata((MetadataType1)newValue);
				return;
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY_ATTRIBUTE:
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
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ADDRESS:
				setAddress((AttributedURIType1)null);
				return;
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS:
				setReferenceParameters((ReferenceParametersType1)null);
				return;
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__METADATA:
				setMetadata((MetadataType1)null);
				return;
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY:
				getAny().clear();
				return;
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY_ATTRIBUTE:
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
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ADDRESS:
				return address != null;
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS:
				return referenceParameters != null;
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__METADATA:
				return metadata != null;
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY:
				return any != null && !any.isEmpty();
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1__ANY_ATTRIBUTE:
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
		result.append(" (any: ");
		result.append(any);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //EndpointReferenceType1Impl
