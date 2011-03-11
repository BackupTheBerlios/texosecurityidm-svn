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
package org.w3._2000._09.xmldsig.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.w3._2000._09.xmldsig.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.w3._2000._09.xmldsig.XmldsigPackage
 * @generated
 */
public class XmldsigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmldsigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmldsigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XmldsigPackage.eINSTANCE;
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
	protected XmldsigSwitch<Adapter> modelSwitch =
		new XmldsigSwitch<Adapter>() {
			@Override
			public Adapter caseCanonicalizationMethodType(CanonicalizationMethodType object) {
				return createCanonicalizationMethodTypeAdapter();
			}
			@Override
			public Adapter caseCanonicalizationMethodType1(CanonicalizationMethodType1 object) {
				return createCanonicalizationMethodType1Adapter();
			}
			@Override
			public Adapter caseDigestMethodType(DigestMethodType object) {
				return createDigestMethodTypeAdapter();
			}
			@Override
			public Adapter caseDigestMethodType1(DigestMethodType1 object) {
				return createDigestMethodType1Adapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDSAKeyValueType(DSAKeyValueType object) {
				return createDSAKeyValueTypeAdapter();
			}
			@Override
			public Adapter caseDSAKeyValueType1(DSAKeyValueType1 object) {
				return createDSAKeyValueType1Adapter();
			}
			@Override
			public Adapter caseKeyInfoType(KeyInfoType object) {
				return createKeyInfoTypeAdapter();
			}
			@Override
			public Adapter caseKeyInfoType1(KeyInfoType1 object) {
				return createKeyInfoType1Adapter();
			}
			@Override
			public Adapter caseKeyValueType(KeyValueType object) {
				return createKeyValueTypeAdapter();
			}
			@Override
			public Adapter caseKeyValueType1(KeyValueType1 object) {
				return createKeyValueType1Adapter();
			}
			@Override
			public Adapter caseManifestType(ManifestType object) {
				return createManifestTypeAdapter();
			}
			@Override
			public Adapter caseManifestType1(ManifestType1 object) {
				return createManifestType1Adapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter caseObjectType1(ObjectType1 object) {
				return createObjectType1Adapter();
			}
			@Override
			public Adapter casePGPDataType(PGPDataType object) {
				return createPGPDataTypeAdapter();
			}
			@Override
			public Adapter casePGPDataType1(PGPDataType1 object) {
				return createPGPDataType1Adapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType1(ReferenceType1 object) {
				return createReferenceType1Adapter();
			}
			@Override
			public Adapter caseRetrievalMethodType(RetrievalMethodType object) {
				return createRetrievalMethodTypeAdapter();
			}
			@Override
			public Adapter caseRetrievalMethodType1(RetrievalMethodType1 object) {
				return createRetrievalMethodType1Adapter();
			}
			@Override
			public Adapter caseRSAKeyValueType(RSAKeyValueType object) {
				return createRSAKeyValueTypeAdapter();
			}
			@Override
			public Adapter caseRSAKeyValueType1(RSAKeyValueType1 object) {
				return createRSAKeyValueType1Adapter();
			}
			@Override
			public Adapter caseSignatureMethodType(SignatureMethodType object) {
				return createSignatureMethodTypeAdapter();
			}
			@Override
			public Adapter caseSignatureMethodType1(SignatureMethodType1 object) {
				return createSignatureMethodType1Adapter();
			}
			@Override
			public Adapter caseSignaturePropertiesType(SignaturePropertiesType object) {
				return createSignaturePropertiesTypeAdapter();
			}
			@Override
			public Adapter caseSignaturePropertiesType1(SignaturePropertiesType1 object) {
				return createSignaturePropertiesType1Adapter();
			}
			@Override
			public Adapter caseSignaturePropertyType(SignaturePropertyType object) {
				return createSignaturePropertyTypeAdapter();
			}
			@Override
			public Adapter caseSignaturePropertyType1(SignaturePropertyType1 object) {
				return createSignaturePropertyType1Adapter();
			}
			@Override
			public Adapter caseSignatureType(SignatureType object) {
				return createSignatureTypeAdapter();
			}
			@Override
			public Adapter caseSignatureType1(SignatureType1 object) {
				return createSignatureType1Adapter();
			}
			@Override
			public Adapter caseSignatureValueType(SignatureValueType object) {
				return createSignatureValueTypeAdapter();
			}
			@Override
			public Adapter caseSignatureValueType1(SignatureValueType1 object) {
				return createSignatureValueType1Adapter();
			}
			@Override
			public Adapter caseSignedInfoType(SignedInfoType object) {
				return createSignedInfoTypeAdapter();
			}
			@Override
			public Adapter caseSignedInfoType1(SignedInfoType1 object) {
				return createSignedInfoType1Adapter();
			}
			@Override
			public Adapter caseSPKIDataType(SPKIDataType object) {
				return createSPKIDataTypeAdapter();
			}
			@Override
			public Adapter caseSPKIDataType1(SPKIDataType1 object) {
				return createSPKIDataType1Adapter();
			}
			@Override
			public Adapter caseTransformsType(TransformsType object) {
				return createTransformsTypeAdapter();
			}
			@Override
			public Adapter caseTransformsType1(TransformsType1 object) {
				return createTransformsType1Adapter();
			}
			@Override
			public Adapter caseTransformType(TransformType object) {
				return createTransformTypeAdapter();
			}
			@Override
			public Adapter caseTransformType1(TransformType1 object) {
				return createTransformType1Adapter();
			}
			@Override
			public Adapter caseX509DataType(X509DataType object) {
				return createX509DataTypeAdapter();
			}
			@Override
			public Adapter caseX509DataType1(X509DataType1 object) {
				return createX509DataType1Adapter();
			}
			@Override
			public Adapter caseX509IssuerSerialType(X509IssuerSerialType object) {
				return createX509IssuerSerialTypeAdapter();
			}
			@Override
			public Adapter caseX509IssuerSerialType1(X509IssuerSerialType1 object) {
				return createX509IssuerSerialType1Adapter();
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
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType <em>Canonicalization Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.CanonicalizationMethodType
	 * @generated
	 */
	public Adapter createCanonicalizationMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType1 <em>Canonicalization Method Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.CanonicalizationMethodType1
	 * @generated
	 */
	public Adapter createCanonicalizationMethodType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.DigestMethodType <em>Digest Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.DigestMethodType
	 * @generated
	 */
	public Adapter createDigestMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.DigestMethodType1 <em>Digest Method Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.DigestMethodType1
	 * @generated
	 */
	public Adapter createDigestMethodType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.DSAKeyValueType <em>DSA Key Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType
	 * @generated
	 */
	public Adapter createDSAKeyValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.DSAKeyValueType1 <em>DSA Key Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType1
	 * @generated
	 */
	public Adapter createDSAKeyValueType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.KeyInfoType <em>Key Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType
	 * @generated
	 */
	public Adapter createKeyInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.KeyInfoType1 <em>Key Info Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType1
	 * @generated
	 */
	public Adapter createKeyInfoType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.KeyValueType <em>Key Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.KeyValueType
	 * @generated
	 */
	public Adapter createKeyValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.KeyValueType1 <em>Key Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.KeyValueType1
	 * @generated
	 */
	public Adapter createKeyValueType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.ManifestType <em>Manifest Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.ManifestType
	 * @generated
	 */
	public Adapter createManifestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.ManifestType1 <em>Manifest Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.ManifestType1
	 * @generated
	 */
	public Adapter createManifestType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.ObjectType1 <em>Object Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.ObjectType1
	 * @generated
	 */
	public Adapter createObjectType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.PGPDataType <em>PGP Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.PGPDataType
	 * @generated
	 */
	public Adapter createPGPDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.PGPDataType1 <em>PGP Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.PGPDataType1
	 * @generated
	 */
	public Adapter createPGPDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.ReferenceType1 <em>Reference Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.ReferenceType1
	 * @generated
	 */
	public Adapter createReferenceType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.RetrievalMethodType <em>Retrieval Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.RetrievalMethodType
	 * @generated
	 */
	public Adapter createRetrievalMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.RetrievalMethodType1 <em>Retrieval Method Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.RetrievalMethodType1
	 * @generated
	 */
	public Adapter createRetrievalMethodType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.RSAKeyValueType <em>RSA Key Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.RSAKeyValueType
	 * @generated
	 */
	public Adapter createRSAKeyValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.RSAKeyValueType1 <em>RSA Key Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.RSAKeyValueType1
	 * @generated
	 */
	public Adapter createRSAKeyValueType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignatureMethodType <em>Signature Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType
	 * @generated
	 */
	public Adapter createSignatureMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignatureMethodType1 <em>Signature Method Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType1
	 * @generated
	 */
	public Adapter createSignatureMethodType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignaturePropertiesType <em>Signature Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertiesType
	 * @generated
	 */
	public Adapter createSignaturePropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignaturePropertiesType1 <em>Signature Properties Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertiesType1
	 * @generated
	 */
	public Adapter createSignaturePropertiesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignaturePropertyType <em>Signature Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType
	 * @generated
	 */
	public Adapter createSignaturePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignaturePropertyType1 <em>Signature Property Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType1
	 * @generated
	 */
	public Adapter createSignaturePropertyType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignatureType <em>Signature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignatureType
	 * @generated
	 */
	public Adapter createSignatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignatureType1 <em>Signature Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignatureType1
	 * @generated
	 */
	public Adapter createSignatureType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignatureValueType <em>Signature Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignatureValueType
	 * @generated
	 */
	public Adapter createSignatureValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignatureValueType1 <em>Signature Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignatureValueType1
	 * @generated
	 */
	public Adapter createSignatureValueType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignedInfoType <em>Signed Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType
	 * @generated
	 */
	public Adapter createSignedInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignedInfoType1 <em>Signed Info Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType1
	 * @generated
	 */
	public Adapter createSignedInfoType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SPKIDataType <em>SPKI Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SPKIDataType
	 * @generated
	 */
	public Adapter createSPKIDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SPKIDataType1 <em>SPKI Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SPKIDataType1
	 * @generated
	 */
	public Adapter createSPKIDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.TransformsType <em>Transforms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.TransformsType
	 * @generated
	 */
	public Adapter createTransformsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.TransformsType1 <em>Transforms Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.TransformsType1
	 * @generated
	 */
	public Adapter createTransformsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.TransformType <em>Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.TransformType
	 * @generated
	 */
	public Adapter createTransformTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.TransformType1 <em>Transform Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.TransformType1
	 * @generated
	 */
	public Adapter createTransformType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.X509DataType <em>X509 Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.X509DataType
	 * @generated
	 */
	public Adapter createX509DataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.X509DataType1 <em>X509 Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.X509DataType1
	 * @generated
	 */
	public Adapter createX509DataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.X509IssuerSerialType <em>X509 Issuer Serial Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.X509IssuerSerialType
	 * @generated
	 */
	public Adapter createX509IssuerSerialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.X509IssuerSerialType1 <em>X509 Issuer Serial Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.X509IssuerSerialType1
	 * @generated
	 */
	public Adapter createX509IssuerSerialType1Adapter() {
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

} //XmldsigAdapterFactory
