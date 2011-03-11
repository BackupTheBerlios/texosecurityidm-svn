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
package org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Factory;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package;

import org.w3._2000._09.xmldsig.XmldsigFactory;
import org.w3._2000._09.xmldsig.XmldsigPackage;

import org.w3._2005._08.wsaddressing.AddressingFactory;
import org.w3._2005._08.wsaddressing.AddressingPackage;

import org.xmlsoap.schemas.soap.soapenvelope.EnvelopeFactory;
import org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage;

import org.xmlsoap.schemas.soap.soapenvelope.provider.WssecurityEditPlugin;

import org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityFactory;
import org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyFactory;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage;

/**
 * This is the item provider adapter for a {@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KeyValueTokenTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueTokenTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIncludeTokenPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Include Token feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludeTokenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyValueTokenType_includeToken_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyValueTokenType_includeToken_feature", "_UI_KeyValueTokenType_type"),
				 _200702Package.Literals.KEY_VALUE_TOKEN_TYPE__INCLUDE_TOKEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY);
			childrenFeatures.add(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY_ATTRIBUTE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns KeyValueTokenType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KeyValueTokenType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((KeyValueTokenType)object).getIncludeToken();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_KeyValueTokenType_type") :
			getString("_UI_KeyValueTokenType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(KeyValueTokenType.class)) {
			case _200702Package.KEY_VALUE_TOKEN_TYPE__INCLUDE_TOKEN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _200702Package.KEY_VALUE_TOKEN_TYPE__ANY:
			case _200702Package.KEY_VALUE_TOKEN_TYPE__ANY_ATTRIBUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(EnvelopePackage.Literals.DOCUMENT_ROOT__BODY,
					 EnvelopeFactory.eINSTANCE.createBody())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(EnvelopePackage.Literals.DOCUMENT_ROOT__ENVELOPE,
					 EnvelopeFactory.eINSTANCE.createEnvelope())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(EnvelopePackage.Literals.DOCUMENT_ROOT__FAULT,
					 EnvelopeFactory.eINSTANCE.createFault())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(EnvelopePackage.Literals.DOCUMENT_ROOT__HEADER,
					 EnvelopeFactory.eINSTANCE.createHeader())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN,
					 _0Factory.eINSTANCE.createBinarySecurityTokenType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED,
					 _0Factory.eINSTANCE.createEmbeddedType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER,
					 _0Factory.eINSTANCE.createKeyIdentifierType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__NONCE,
					 _0Factory.eINSTANCE.createEncodedString1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__NONCE,
					 _0Factory.eINSTANCE.createBinarySecurityTokenType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__NONCE,
					 _0Factory.eINSTANCE.createKeyIdentifierType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__PASSWORD,
					 _0Factory.eINSTANCE.createPasswordString1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__REFERENCE,
					 _0Factory.eINSTANCE.createReferenceType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__SECURITY,
					 _0Factory.eINSTANCE.createSecurityHeaderType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE,
					 _0Factory.eINSTANCE.createSecurityTokenReferenceType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS,
					 _0Factory.eINSTANCE.createTransformationParametersType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN,
					 _0Factory.eINSTANCE.createUsernameTokenType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1,
					 _0Factory.eINSTANCE.createBinarySecurityTokenType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED1,
					 _0Factory.eINSTANCE.createEmbeddedType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER1,
					 _0Factory.eINSTANCE.createKeyIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__NONCE1,
					 _0Factory.eINSTANCE.createEncodedString())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__NONCE1,
					 _0Factory.eINSTANCE.createBinarySecurityTokenType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__NONCE1,
					 _0Factory.eINSTANCE.createKeyIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__PASSWORD1,
					 _0Factory.eINSTANCE.createPasswordString())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__REFERENCE1,
					 _0Factory.eINSTANCE.createReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__SECURITY1,
					 _0Factory.eINSTANCE.createSecurityHeaderType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1,
					 _0Factory.eINSTANCE.createSecurityTokenReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1,
					 _0Factory.eINSTANCE.createTransformationParametersType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN1,
					 _0Factory.eINSTANCE.createUsernameTokenType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD,
					 XmldsigFactory.eINSTANCE.createCanonicalizationMethodType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD,
					 XmldsigFactory.eINSTANCE.createDigestMethodType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_VALUE,
					 XmldsigFactory.eINSTANCE.createFromString(XmldsigPackage.Literals.DIGEST_VALUE_TYPE1, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE,
					 XmldsigFactory.eINSTANCE.createDSAKeyValueType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO,
					 XmldsigFactory.eINSTANCE.createKeyInfoType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_NAME,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE,
					 XmldsigFactory.eINSTANCE.createKeyValueType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST,
					 XmldsigFactory.eINSTANCE.createManifestType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__MGMT_DATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT,
					 XmldsigFactory.eINSTANCE.createObjectType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA,
					 XmldsigFactory.eINSTANCE.createPGPDataType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE,
					 XmldsigFactory.eINSTANCE.createReferenceType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD,
					 XmldsigFactory.eINSTANCE.createRetrievalMethodType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE,
					 XmldsigFactory.eINSTANCE.createRSAKeyValueType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE,
					 XmldsigFactory.eINSTANCE.createSignatureType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD,
					 XmldsigFactory.eINSTANCE.createSignatureMethodType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES,
					 XmldsigFactory.eINSTANCE.createSignaturePropertiesType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY,
					 XmldsigFactory.eINSTANCE.createSignaturePropertyType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE,
					 XmldsigFactory.eINSTANCE.createSignatureValueType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO,
					 XmldsigFactory.eINSTANCE.createSignedInfoType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA,
					 XmldsigFactory.eINSTANCE.createSPKIDataType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM,
					 XmldsigFactory.eINSTANCE.createTransformType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS,
					 XmldsigFactory.eINSTANCE.createTransformsType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA,
					 XmldsigFactory.eINSTANCE.createX509DataType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD1,
					 XmldsigFactory.eINSTANCE.createCanonicalizationMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD1,
					 XmldsigFactory.eINSTANCE.createDigestMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_VALUE1,
					 XmldsigFactory.eINSTANCE.createFromString(XmldsigPackage.Literals.DIGEST_VALUE_TYPE, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE1,
					 XmldsigFactory.eINSTANCE.createDSAKeyValueType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO1,
					 XmldsigFactory.eINSTANCE.createKeyInfoType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_NAME1,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE1,
					 XmldsigFactory.eINSTANCE.createKeyValueType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST1,
					 XmldsigFactory.eINSTANCE.createManifestType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__MGMT_DATA1,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT1,
					 XmldsigFactory.eINSTANCE.createObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA1,
					 XmldsigFactory.eINSTANCE.createPGPDataType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE1,
					 XmldsigFactory.eINSTANCE.createReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD1,
					 XmldsigFactory.eINSTANCE.createRetrievalMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE1,
					 XmldsigFactory.eINSTANCE.createRSAKeyValueType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE1,
					 XmldsigFactory.eINSTANCE.createSignatureType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD1,
					 XmldsigFactory.eINSTANCE.createSignatureMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1,
					 XmldsigFactory.eINSTANCE.createSignaturePropertiesType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY1,
					 XmldsigFactory.eINSTANCE.createSignaturePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE1,
					 XmldsigFactory.eINSTANCE.createSignatureValueType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO1,
					 XmldsigFactory.eINSTANCE.createSignedInfoType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA1,
					 XmldsigFactory.eINSTANCE.createSPKIDataType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM1,
					 XmldsigFactory.eINSTANCE.createTransformType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS1,
					 XmldsigFactory.eINSTANCE.createTransformsType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA1,
					 XmldsigFactory.eINSTANCE.createX509DataType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__CREATED,
					 org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Factory.eINSTANCE.createAttributedDateTime1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__EXPIRES,
					 org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Factory.eINSTANCE.createAttributedDateTime1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__TIMESTAMP,
					 org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Factory.eINSTANCE.createTimestampType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__CREATED1,
					 org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Factory.eINSTANCE.createAttributedDateTime())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__EXPIRES1,
					 org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Factory.eINSTANCE.createAttributedDateTime())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__TIMESTAMP1,
					 org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Factory.eINSTANCE.createTimestampType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(UtilityPackage.Literals.DOCUMENT_ROOT__CREATED,
					 UtilityFactory.eINSTANCE.createAttributedDateTime())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(UtilityPackage.Literals.DOCUMENT_ROOT__EXPIRES,
					 UtilityFactory.eINSTANCE.createAttributedDateTime())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(UtilityPackage.Literals.DOCUMENT_ROOT__TIMESTAMP,
					 UtilityFactory.eINSTANCE.createTimestampType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION,
					 AddressingFactory.eINSTANCE.createAttributedURIType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__FROM,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID,
					 AddressingFactory.eINSTANCE.createAttributedURIType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA,
					 AddressingFactory.eINSTANCE.createMetadataType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION,
					 AddressingFactory.eINSTANCE.createProblemActionType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME,
					 AddressingFactory.eINSTANCE.createAttributedQNameType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI,
					 AddressingFactory.eINSTANCE.createAttributedURIType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS,
					 AddressingFactory.eINSTANCE.createReferenceParametersType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO,
					 AddressingFactory.eINSTANCE.createRelatesToType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER,
					 AddressingFactory.eINSTANCE.createAttributedUnsignedLongType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__TO,
					 AddressingFactory.eINSTANCE.createAttributedURIType1())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION1,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE1,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO1,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__FROM1,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID1,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA1,
					 AddressingFactory.eINSTANCE.createMetadataType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION1,
					 AddressingFactory.eINSTANCE.createProblemActionType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1,
					 AddressingFactory.eINSTANCE.createAttributedQNameType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI1,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS1,
					 AddressingFactory.eINSTANCE.createReferenceParametersType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO1,
					 AddressingFactory.eINSTANCE.createRelatesToType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO1,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER1,
					 AddressingFactory.eINSTANCE.createAttributedUnsignedLongType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__TO1,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(PolicyPackage.Literals.DOCUMENT_ROOT__ALL,
					 PolicyFactory.eINSTANCE.createOperatorContentType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(PolicyPackage.Literals.DOCUMENT_ROOT__APPLIES_TO,
					 PolicyFactory.eINSTANCE.createAppliesToType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE,
					 PolicyFactory.eINSTANCE.createOperatorContentType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY,
					 PolicyFactory.eINSTANCE.createPolicyType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_ATTACHMENT,
					 PolicyFactory.eINSTANCE.createPolicyAttachmentType())));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.KEY_VALUE_TOKEN_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_REFERENCE,
					 PolicyFactory.eINSTANCE.createPolicyReferenceType())));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == _0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__NONCE ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1 ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__NONCE1 ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER1 ||
			childFeature == org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__CREATED ||
			childFeature == org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__EXPIRES ||
			childFeature == org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__CREATED1 ||
			childFeature == org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__EXPIRES1 ||
			childFeature == UtilityPackage.Literals.DOCUMENT_ROOT__CREATED ||
			childFeature == UtilityPackage.Literals.DOCUMENT_ROOT__EXPIRES ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ACTION ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FROM ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ACTION1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__TO1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FROM1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO1 ||
			childFeature == PolicyPackage.Literals.DOCUMENT_ROOT__ALL ||
			childFeature == PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WssecurityEditPlugin.INSTANCE;
	}

}
