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
package org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.provider;


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

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Factory;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package;

import org.xmlsoap.schemas.soap.soapenvelope.provider.WssecurityEditPlugin;

/**
 * This is the item provider adapter for a {@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot} object.
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

			addUsagePropertyDescriptor(object);
			addUsage1PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Usage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_usage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_usage_feature", "_UI_DocumentRoot_type"),
				 _0Package.Literals.DOCUMENT_ROOT__USAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usage1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsage1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_usage1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_usage1_feature", "_UI_DocumentRoot_type"),
				 _0Package.Literals.DOCUMENT_ROOT__USAGE1,
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
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__NONCE);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__PASSWORD);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__REFERENCE);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__SECURITY);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED1);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER1);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__NONCE1);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__PASSWORD1);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__REFERENCE1);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__SECURITY1);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1);
			childrenFeatures.add(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN1);
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
		List labelValue = ((DocumentRoot)object).getUsage();
		String label = labelValue == null ? null : labelValue.toString();
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
			case _0Package.DOCUMENT_ROOT__USAGE:
			case _0Package.DOCUMENT_ROOT__USAGE1:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN:
			case _0Package.DOCUMENT_ROOT__EMBEDDED:
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER:
			case _0Package.DOCUMENT_ROOT__NONCE:
			case _0Package.DOCUMENT_ROOT__PASSWORD:
			case _0Package.DOCUMENT_ROOT__REFERENCE:
			case _0Package.DOCUMENT_ROOT__SECURITY:
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE:
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS:
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN:
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1:
			case _0Package.DOCUMENT_ROOT__EMBEDDED1:
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER1:
			case _0Package.DOCUMENT_ROOT__NONCE1:
			case _0Package.DOCUMENT_ROOT__PASSWORD1:
			case _0Package.DOCUMENT_ROOT__REFERENCE1:
			case _0Package.DOCUMENT_ROOT__SECURITY1:
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1:
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1:
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN1:
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
				(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN,
				 _0Factory.eINSTANCE.createBinarySecurityTokenType1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED,
				 _0Factory.eINSTANCE.createEmbeddedType1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER,
				 _0Factory.eINSTANCE.createKeyIdentifierType1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__NONCE,
				 _0Factory.eINSTANCE.createEncodedString1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__NONCE,
				 _0Factory.eINSTANCE.createBinarySecurityTokenType1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__NONCE,
				 _0Factory.eINSTANCE.createKeyIdentifierType1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__PASSWORD,
				 _0Factory.eINSTANCE.createPasswordString1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__REFERENCE,
				 _0Factory.eINSTANCE.createReferenceType1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__SECURITY,
				 _0Factory.eINSTANCE.createSecurityHeaderType1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE,
				 _0Factory.eINSTANCE.createSecurityTokenReferenceType1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS,
				 _0Factory.eINSTANCE.createTransformationParametersType1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN,
				 _0Factory.eINSTANCE.createUsernameTokenType1()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1,
				 _0Factory.eINSTANCE.createBinarySecurityTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED1,
				 _0Factory.eINSTANCE.createEmbeddedType()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER1,
				 _0Factory.eINSTANCE.createKeyIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__NONCE1,
				 _0Factory.eINSTANCE.createEncodedString()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__NONCE1,
				 _0Factory.eINSTANCE.createBinarySecurityTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__NONCE1,
				 _0Factory.eINSTANCE.createKeyIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__PASSWORD1,
				 _0Factory.eINSTANCE.createPasswordString()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__REFERENCE1,
				 _0Factory.eINSTANCE.createReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__SECURITY1,
				 _0Factory.eINSTANCE.createSecurityHeaderType()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1,
				 _0Factory.eINSTANCE.createSecurityTokenReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1,
				 _0Factory.eINSTANCE.createTransformationParametersType()));

		newChildDescriptors.add
			(createChildParameter
				(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN1,
				 _0Factory.eINSTANCE.createUsernameTokenType()));
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

		boolean qualify =
			childFeature == _0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__NONCE ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1 ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__NONCE1 ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER1;

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
