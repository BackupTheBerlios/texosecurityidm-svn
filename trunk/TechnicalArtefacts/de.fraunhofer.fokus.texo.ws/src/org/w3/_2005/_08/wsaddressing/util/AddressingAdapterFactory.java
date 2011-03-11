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
package org.w3._2005._08.wsaddressing.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.w3._2005._08.wsaddressing.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.w3._2005._08.wsaddressing.AddressingPackage
 * @generated
 */
public class AddressingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AddressingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AddressingPackage.eINSTANCE;
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
	protected AddressingSwitch<Adapter> modelSwitch =
		new AddressingSwitch<Adapter>() {
			@Override
			public Adapter caseAttributedQNameType(AttributedQNameType object) {
				return createAttributedQNameTypeAdapter();
			}
			@Override
			public Adapter caseAttributedQNameType1(AttributedQNameType1 object) {
				return createAttributedQNameType1Adapter();
			}
			@Override
			public Adapter caseAttributedUnsignedLongType(AttributedUnsignedLongType object) {
				return createAttributedUnsignedLongTypeAdapter();
			}
			@Override
			public Adapter caseAttributedUnsignedLongType1(AttributedUnsignedLongType1 object) {
				return createAttributedUnsignedLongType1Adapter();
			}
			@Override
			public Adapter caseAttributedURIType(AttributedURIType object) {
				return createAttributedURITypeAdapter();
			}
			@Override
			public Adapter caseAttributedURIType1(AttributedURIType1 object) {
				return createAttributedURIType1Adapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEndpointReferenceType(EndpointReferenceType object) {
				return createEndpointReferenceTypeAdapter();
			}
			@Override
			public Adapter caseEndpointReferenceType1(EndpointReferenceType1 object) {
				return createEndpointReferenceType1Adapter();
			}
			@Override
			public Adapter caseMetadataType(MetadataType object) {
				return createMetadataTypeAdapter();
			}
			@Override
			public Adapter caseMetadataType1(MetadataType1 object) {
				return createMetadataType1Adapter();
			}
			@Override
			public Adapter caseProblemActionType(ProblemActionType object) {
				return createProblemActionTypeAdapter();
			}
			@Override
			public Adapter caseProblemActionType1(ProblemActionType1 object) {
				return createProblemActionType1Adapter();
			}
			@Override
			public Adapter caseReferenceParametersType(ReferenceParametersType object) {
				return createReferenceParametersTypeAdapter();
			}
			@Override
			public Adapter caseReferenceParametersType1(ReferenceParametersType1 object) {
				return createReferenceParametersType1Adapter();
			}
			@Override
			public Adapter caseRelatesToType(RelatesToType object) {
				return createRelatesToTypeAdapter();
			}
			@Override
			public Adapter caseRelatesToType1(RelatesToType1 object) {
				return createRelatesToType1Adapter();
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
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.AttributedQNameType <em>Attributed QName Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.AttributedQNameType
	 * @generated
	 */
	public Adapter createAttributedQNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.AttributedQNameType1 <em>Attributed QName Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.AttributedQNameType1
	 * @generated
	 */
	public Adapter createAttributedQNameType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.AttributedUnsignedLongType <em>Attributed Unsigned Long Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.AttributedUnsignedLongType
	 * @generated
	 */
	public Adapter createAttributedUnsignedLongTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.AttributedUnsignedLongType1 <em>Attributed Unsigned Long Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.AttributedUnsignedLongType1
	 * @generated
	 */
	public Adapter createAttributedUnsignedLongType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.AttributedURIType <em>Attributed URI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.AttributedURIType
	 * @generated
	 */
	public Adapter createAttributedURITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.AttributedURIType1 <em>Attributed URI Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.AttributedURIType1
	 * @generated
	 */
	public Adapter createAttributedURIType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType <em>Endpoint Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType
	 * @generated
	 */
	public Adapter createEndpointReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.EndpointReferenceType1 <em>Endpoint Reference Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.EndpointReferenceType1
	 * @generated
	 */
	public Adapter createEndpointReferenceType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.MetadataType
	 * @generated
	 */
	public Adapter createMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.MetadataType1 <em>Metadata Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.MetadataType1
	 * @generated
	 */
	public Adapter createMetadataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.ProblemActionType <em>Problem Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.ProblemActionType
	 * @generated
	 */
	public Adapter createProblemActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.ProblemActionType1 <em>Problem Action Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.ProblemActionType1
	 * @generated
	 */
	public Adapter createProblemActionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.ReferenceParametersType <em>Reference Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.ReferenceParametersType
	 * @generated
	 */
	public Adapter createReferenceParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.ReferenceParametersType1 <em>Reference Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.ReferenceParametersType1
	 * @generated
	 */
	public Adapter createReferenceParametersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.RelatesToType <em>Relates To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.RelatesToType
	 * @generated
	 */
	public Adapter createRelatesToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._08.wsaddressing.RelatesToType1 <em>Relates To Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._08.wsaddressing.RelatesToType1
	 * @generated
	 */
	public Adapter createRelatesToType1Adapter() {
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

} //AddressingAdapterFactory
