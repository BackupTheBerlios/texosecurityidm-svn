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
package org.w3._2000._09.xmldsig.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.w3._2000._09.xmldsig.DocumentRoot;
import org.w3._2000._09.xmldsig.XmldsigFactory;
import org.w3._2000._09.xmldsig.XmldsigPackage;

import org.xmlsoap.schemas.soap.soapenvelope.provider.WssecurityEditPlugin;

/**
 * This is the item provider adapter for a {@link org.w3._2000._09.xmldsig.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

			addDigestValuePropertyDescriptor(object);
			addKeyNamePropertyDescriptor(object);
			addMgmtDataPropertyDescriptor(object);
			addDigestValue1PropertyDescriptor(object);
			addKeyName1PropertyDescriptor(object);
			addMgmtData1PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Digest Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDigestValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_digestValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_digestValue_feature", "_UI_DocumentRoot_type"),
				 XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_keyName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_keyName_feature", "_UI_DocumentRoot_type"),
				 XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mgmt Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMgmtDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_mgmtData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_mgmtData_feature", "_UI_DocumentRoot_type"),
				 XmldsigPackage.Literals.DOCUMENT_ROOT__MGMT_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Digest Value1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDigestValue1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_digestValue1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_digestValue1_feature", "_UI_DocumentRoot_type"),
				 XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_VALUE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Name1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyName1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_keyName1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_keyName1_feature", "_UI_DocumentRoot_type"),
				 XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_NAME1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mgmt Data1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMgmtData1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_mgmtData1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_mgmtData1_feature", "_UI_DocumentRoot_type"),
				 XmldsigPackage.Literals.DOCUMENT_ROOT__MGMT_DATA1,
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
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS1);
			childrenFeatures.add(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA1);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DocumentRoot)object).getKeyName();
		return label == null || label.length() == 0 ?
			getString("_UI_DocumentRoot_type") :
			getString("_UI_DocumentRoot_type") + " " + label;
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE:
			case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME:
			case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA:
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE1:
			case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME1:
			case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA1:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD:
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD:
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE:
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO:
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE:
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST:
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT:
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA:
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE:
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD:
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO:
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA:
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM:
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS:
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA:
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD1:
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD1:
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE1:
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO1:
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE1:
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST1:
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT1:
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA1:
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE1:
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD1:
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE1:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE1:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD1:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY1:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE1:
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO1:
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA1:
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM1:
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS1:
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA1:
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
				(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD,
				 XmldsigFactory.eINSTANCE.createCanonicalizationMethodType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD,
				 XmldsigFactory.eINSTANCE.createDigestMethodType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE,
				 XmldsigFactory.eINSTANCE.createDSAKeyValueType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO,
				 XmldsigFactory.eINSTANCE.createKeyInfoType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE,
				 XmldsigFactory.eINSTANCE.createKeyValueType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST,
				 XmldsigFactory.eINSTANCE.createManifestType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT,
				 XmldsigFactory.eINSTANCE.createObjectType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA,
				 XmldsigFactory.eINSTANCE.createPGPDataType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE,
				 XmldsigFactory.eINSTANCE.createReferenceType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD,
				 XmldsigFactory.eINSTANCE.createRetrievalMethodType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE,
				 XmldsigFactory.eINSTANCE.createRSAKeyValueType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE,
				 XmldsigFactory.eINSTANCE.createSignatureType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD,
				 XmldsigFactory.eINSTANCE.createSignatureMethodType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES,
				 XmldsigFactory.eINSTANCE.createSignaturePropertiesType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY,
				 XmldsigFactory.eINSTANCE.createSignaturePropertyType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE,
				 XmldsigFactory.eINSTANCE.createSignatureValueType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO,
				 XmldsigFactory.eINSTANCE.createSignedInfoType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA,
				 XmldsigFactory.eINSTANCE.createSPKIDataType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM,
				 XmldsigFactory.eINSTANCE.createTransformType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS,
				 XmldsigFactory.eINSTANCE.createTransformsType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA,
				 XmldsigFactory.eINSTANCE.createX509DataType1()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD1,
				 XmldsigFactory.eINSTANCE.createCanonicalizationMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD1,
				 XmldsigFactory.eINSTANCE.createDigestMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE1,
				 XmldsigFactory.eINSTANCE.createDSAKeyValueType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO1,
				 XmldsigFactory.eINSTANCE.createKeyInfoType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE1,
				 XmldsigFactory.eINSTANCE.createKeyValueType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST1,
				 XmldsigFactory.eINSTANCE.createManifestType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT1,
				 XmldsigFactory.eINSTANCE.createObjectType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA1,
				 XmldsigFactory.eINSTANCE.createPGPDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE1,
				 XmldsigFactory.eINSTANCE.createReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD1,
				 XmldsigFactory.eINSTANCE.createRetrievalMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE1,
				 XmldsigFactory.eINSTANCE.createRSAKeyValueType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE1,
				 XmldsigFactory.eINSTANCE.createSignatureType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD1,
				 XmldsigFactory.eINSTANCE.createSignatureMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1,
				 XmldsigFactory.eINSTANCE.createSignaturePropertiesType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY1,
				 XmldsigFactory.eINSTANCE.createSignaturePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE1,
				 XmldsigFactory.eINSTANCE.createSignatureValueType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO1,
				 XmldsigFactory.eINSTANCE.createSignedInfoType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA1,
				 XmldsigFactory.eINSTANCE.createSPKIDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM1,
				 XmldsigFactory.eINSTANCE.createTransformType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS1,
				 XmldsigFactory.eINSTANCE.createTransformsType()));

		newChildDescriptors.add
			(createChildParameter
				(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA1,
				 XmldsigFactory.eINSTANCE.createX509DataType()));
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
