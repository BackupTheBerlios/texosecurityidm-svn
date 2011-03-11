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
package org.xmlsoap.schemas.ws._2004._09.wspolicy.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.util.PolicyAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyItemProviderAdapterFactory extends PolicyAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppliesToTypeItemProvider appliesToTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAppliesToTypeAdapter() {
		if (appliesToTypeItemProvider == null) {
			appliesToTypeItemProvider = new AppliesToTypeItemProvider(this);
		}

		return appliesToTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorContentTypeItemProvider operatorContentTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperatorContentTypeAdapter() {
		if (operatorContentTypeItemProvider == null) {
			operatorContentTypeItemProvider = new OperatorContentTypeItemProvider(this);
		}

		return operatorContentTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyAttachmentTypeItemProvider policyAttachmentTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolicyAttachmentTypeAdapter() {
		if (policyAttachmentTypeItemProvider == null) {
			policyAttachmentTypeItemProvider = new PolicyAttachmentTypeItemProvider(this);
		}

		return policyAttachmentTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyReferenceTypeItemProvider policyReferenceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolicyReferenceTypeAdapter() {
		if (policyReferenceTypeItemProvider == null) {
			policyReferenceTypeItemProvider = new PolicyReferenceTypeItemProvider(this);
		}

		return policyReferenceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyTypeItemProvider policyTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolicyTypeAdapter() {
		if (policyTypeItemProvider == null) {
			policyTypeItemProvider = new PolicyTypeItemProvider(this);
		}

		return policyTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (appliesToTypeItemProvider != null) appliesToTypeItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (operatorContentTypeItemProvider != null) operatorContentTypeItemProvider.dispose();
		if (policyAttachmentTypeItemProvider != null) policyAttachmentTypeItemProvider.dispose();
		if (policyReferenceTypeItemProvider != null) policyReferenceTypeItemProvider.dispose();
		if (policyTypeItemProvider != null) policyTypeItemProvider.dispose();
	}

}
