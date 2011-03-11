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
package org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package
 * @generated
 */
public class _200702AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _200702Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _200702AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _200702Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _200702Switch<Adapter> modelSwitch =
		new _200702Switch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEmptyType(EmptyType object) {
				return createEmptyTypeAdapter();
			}
			@Override
			public Adapter caseHeaderType(HeaderType object) {
				return createHeaderTypeAdapter();
			}
			@Override
			public Adapter caseIssuedTokenType(IssuedTokenType object) {
				return createIssuedTokenTypeAdapter();
			}
			@Override
			public Adapter caseKeyValueTokenType(KeyValueTokenType object) {
				return createKeyValueTokenTypeAdapter();
			}
			@Override
			public Adapter caseNestedPolicyType(NestedPolicyType object) {
				return createNestedPolicyTypeAdapter();
			}
			@Override
			public Adapter caseQNameAssertionType(QNameAssertionType object) {
				return createQNameAssertionTypeAdapter();
			}
			@Override
			public Adapter caseRequestSecurityTokenTemplateType(RequestSecurityTokenTemplateType object) {
				return createRequestSecurityTokenTemplateTypeAdapter();
			}
			@Override
			public Adapter caseSecureConversationTokenType(SecureConversationTokenType object) {
				return createSecureConversationTokenTypeAdapter();
			}
			@Override
			public Adapter caseSePartsType(SePartsType object) {
				return createSePartsTypeAdapter();
			}
			@Override
			public Adapter caseSerElementsType(SerElementsType object) {
				return createSerElementsTypeAdapter();
			}
			@Override
			public Adapter caseSpnegoContextTokenType(SpnegoContextTokenType object) {
				return createSpnegoContextTokenTypeAdapter();
			}
			@Override
			public Adapter caseTokenAssertionType(TokenAssertionType object) {
				return createTokenAssertionTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.EmptyType
	 * @generated
	 */
	public Adapter createEmptyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType
	 * @generated
	 */
	public Adapter createHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType <em>Issued Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType
	 * @generated
	 */
	public Adapter createIssuedTokenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType <em>Key Value Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType
	 * @generated
	 */
	public Adapter createKeyValueTokenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.NestedPolicyType <em>Nested Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.NestedPolicyType
	 * @generated
	 */
	public Adapter createNestedPolicyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.QNameAssertionType <em>QName Assertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.QNameAssertionType
	 * @generated
	 */
	public Adapter createQNameAssertionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.RequestSecurityTokenTemplateType <em>Request Security Token Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.RequestSecurityTokenTemplateType
	 * @generated
	 */
	public Adapter createRequestSecurityTokenTemplateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType <em>Secure Conversation Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType
	 * @generated
	 */
	public Adapter createSecureConversationTokenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType <em>Se Parts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType
	 * @generated
	 */
	public Adapter createSePartsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType <em>Ser Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType
	 * @generated
	 */
	public Adapter createSerElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType <em>Spnego Context Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType
	 * @generated
	 */
	public Adapter createSpnegoContextTokenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType <em>Token Assertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType
	 * @generated
	 */
	public Adapter createTokenAssertionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_200702AdapterFactory
