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
package org.xmlsoap.schemas.ws._2004._09.wspolicy.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage
 * @generated
 */
public class PolicyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolicyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PolicyPackage.eINSTANCE;
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
	protected PolicySwitch<Adapter> modelSwitch =
		new PolicySwitch<Adapter>() {
			@Override
			public Adapter caseAppliesToType(AppliesToType object) {
				return createAppliesToTypeAdapter();
			}
			@Override
			public Adapter caseAppliesToType1(AppliesToType1 object) {
				return createAppliesToType1Adapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseOperatorContentType(OperatorContentType object) {
				return createOperatorContentTypeAdapter();
			}
			@Override
			public Adapter caseOperatorContentType1(OperatorContentType1 object) {
				return createOperatorContentType1Adapter();
			}
			@Override
			public Adapter casePolicyAttachmentType(PolicyAttachmentType object) {
				return createPolicyAttachmentTypeAdapter();
			}
			@Override
			public Adapter casePolicyAttachmentType1(PolicyAttachmentType1 object) {
				return createPolicyAttachmentType1Adapter();
			}
			@Override
			public Adapter casePolicyReferenceType(PolicyReferenceType object) {
				return createPolicyReferenceTypeAdapter();
			}
			@Override
			public Adapter casePolicyReferenceType1(PolicyReferenceType1 object) {
				return createPolicyReferenceType1Adapter();
			}
			@Override
			public Adapter casePolicyType(PolicyType object) {
				return createPolicyTypeAdapter();
			}
			@Override
			public Adapter casePolicyType1(PolicyType1 object) {
				return createPolicyType1Adapter();
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
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType <em>Applies To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType
	 * @generated
	 */
	public Adapter createAppliesToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType1 <em>Applies To Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType1
	 * @generated
	 */
	public Adapter createAppliesToType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType <em>Operator Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType
	 * @generated
	 */
	public Adapter createOperatorContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1 <em>Operator Content Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1
	 * @generated
	 */
	public Adapter createOperatorContentType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType <em>Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType
	 * @generated
	 */
	public Adapter createPolicyAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1 <em>Attachment Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1
	 * @generated
	 */
	public Adapter createPolicyAttachmentType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType
	 * @generated
	 */
	public Adapter createPolicyReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1 <em>Reference Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1
	 * @generated
	 */
	public Adapter createPolicyReferenceType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType
	 * @generated
	 */
	public Adapter createPolicyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1
	 * @generated
	 */
	public Adapter createPolicyType1Adapter() {
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

} //PolicyAdapterFactory
