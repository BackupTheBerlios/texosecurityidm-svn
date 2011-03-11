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
package org.w3._2000._09.xmldsig.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2000._09.xmldsig.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmldsigFactoryImpl extends EFactoryImpl implements XmldsigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XmldsigFactory init() {
		try {
			XmldsigFactory theXmldsigFactory = (XmldsigFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.w3.org/2000/09/xmldsig#"); 
			if (theXmldsigFactory != null) {
				return theXmldsigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmldsigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmldsigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XmldsigPackage.CANONICALIZATION_METHOD_TYPE: return createCanonicalizationMethodType();
			case XmldsigPackage.CANONICALIZATION_METHOD_TYPE1: return createCanonicalizationMethodType1();
			case XmldsigPackage.DIGEST_METHOD_TYPE: return createDigestMethodType();
			case XmldsigPackage.DIGEST_METHOD_TYPE1: return createDigestMethodType1();
			case XmldsigPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case XmldsigPackage.DSA_KEY_VALUE_TYPE: return createDSAKeyValueType();
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1: return createDSAKeyValueType1();
			case XmldsigPackage.KEY_INFO_TYPE: return createKeyInfoType();
			case XmldsigPackage.KEY_INFO_TYPE1: return createKeyInfoType1();
			case XmldsigPackage.KEY_VALUE_TYPE: return createKeyValueType();
			case XmldsigPackage.KEY_VALUE_TYPE1: return createKeyValueType1();
			case XmldsigPackage.MANIFEST_TYPE: return createManifestType();
			case XmldsigPackage.MANIFEST_TYPE1: return createManifestType1();
			case XmldsigPackage.OBJECT_TYPE: return createObjectType();
			case XmldsigPackage.OBJECT_TYPE1: return createObjectType1();
			case XmldsigPackage.PGP_DATA_TYPE: return createPGPDataType();
			case XmldsigPackage.PGP_DATA_TYPE1: return createPGPDataType1();
			case XmldsigPackage.REFERENCE_TYPE: return createReferenceType();
			case XmldsigPackage.REFERENCE_TYPE1: return createReferenceType1();
			case XmldsigPackage.RETRIEVAL_METHOD_TYPE: return createRetrievalMethodType();
			case XmldsigPackage.RETRIEVAL_METHOD_TYPE1: return createRetrievalMethodType1();
			case XmldsigPackage.RSA_KEY_VALUE_TYPE: return createRSAKeyValueType();
			case XmldsigPackage.RSA_KEY_VALUE_TYPE1: return createRSAKeyValueType1();
			case XmldsigPackage.SIGNATURE_METHOD_TYPE: return createSignatureMethodType();
			case XmldsigPackage.SIGNATURE_METHOD_TYPE1: return createSignatureMethodType1();
			case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE: return createSignaturePropertiesType();
			case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE1: return createSignaturePropertiesType1();
			case XmldsigPackage.SIGNATURE_PROPERTY_TYPE: return createSignaturePropertyType();
			case XmldsigPackage.SIGNATURE_PROPERTY_TYPE1: return createSignaturePropertyType1();
			case XmldsigPackage.SIGNATURE_TYPE: return createSignatureType();
			case XmldsigPackage.SIGNATURE_TYPE1: return createSignatureType1();
			case XmldsigPackage.SIGNATURE_VALUE_TYPE: return createSignatureValueType();
			case XmldsigPackage.SIGNATURE_VALUE_TYPE1: return createSignatureValueType1();
			case XmldsigPackage.SIGNED_INFO_TYPE: return createSignedInfoType();
			case XmldsigPackage.SIGNED_INFO_TYPE1: return createSignedInfoType1();
			case XmldsigPackage.SPKI_DATA_TYPE: return createSPKIDataType();
			case XmldsigPackage.SPKI_DATA_TYPE1: return createSPKIDataType1();
			case XmldsigPackage.TRANSFORMS_TYPE: return createTransformsType();
			case XmldsigPackage.TRANSFORMS_TYPE1: return createTransformsType1();
			case XmldsigPackage.TRANSFORM_TYPE: return createTransformType();
			case XmldsigPackage.TRANSFORM_TYPE1: return createTransformType1();
			case XmldsigPackage.X509_DATA_TYPE: return createX509DataType();
			case XmldsigPackage.X509_DATA_TYPE1: return createX509DataType1();
			case XmldsigPackage.X509_ISSUER_SERIAL_TYPE: return createX509IssuerSerialType();
			case XmldsigPackage.X509_ISSUER_SERIAL_TYPE1: return createX509IssuerSerialType1();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XmldsigPackage.CRYPTO_BINARY:
				return createCryptoBinaryFromString(eDataType, initialValue);
			case XmldsigPackage.CRYPTO_BINARY1:
				return createCryptoBinary1FromString(eDataType, initialValue);
			case XmldsigPackage.DIGEST_VALUE_TYPE:
				return createDigestValueTypeFromString(eDataType, initialValue);
			case XmldsigPackage.DIGEST_VALUE_TYPE1:
				return createDigestValueType1FromString(eDataType, initialValue);
			case XmldsigPackage.HMAC_OUTPUT_LENGTH_TYPE:
				return createHMACOutputLengthTypeFromString(eDataType, initialValue);
			case XmldsigPackage.HMAC_OUTPUT_LENGTH_TYPE1:
				return createHMACOutputLengthType1FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XmldsigPackage.CRYPTO_BINARY:
				return convertCryptoBinaryToString(eDataType, instanceValue);
			case XmldsigPackage.CRYPTO_BINARY1:
				return convertCryptoBinary1ToString(eDataType, instanceValue);
			case XmldsigPackage.DIGEST_VALUE_TYPE:
				return convertDigestValueTypeToString(eDataType, instanceValue);
			case XmldsigPackage.DIGEST_VALUE_TYPE1:
				return convertDigestValueType1ToString(eDataType, instanceValue);
			case XmldsigPackage.HMAC_OUTPUT_LENGTH_TYPE:
				return convertHMACOutputLengthTypeToString(eDataType, instanceValue);
			case XmldsigPackage.HMAC_OUTPUT_LENGTH_TYPE1:
				return convertHMACOutputLengthType1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanonicalizationMethodType createCanonicalizationMethodType() {
		CanonicalizationMethodTypeImpl canonicalizationMethodType = new CanonicalizationMethodTypeImpl();
		return canonicalizationMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanonicalizationMethodType1 createCanonicalizationMethodType1() {
		CanonicalizationMethodType1Impl canonicalizationMethodType1 = new CanonicalizationMethodType1Impl();
		return canonicalizationMethodType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigestMethodType createDigestMethodType() {
		DigestMethodTypeImpl digestMethodType = new DigestMethodTypeImpl();
		return digestMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigestMethodType1 createDigestMethodType1() {
		DigestMethodType1Impl digestMethodType1 = new DigestMethodType1Impl();
		return digestMethodType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAKeyValueType createDSAKeyValueType() {
		DSAKeyValueTypeImpl dsaKeyValueType = new DSAKeyValueTypeImpl();
		return dsaKeyValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAKeyValueType1 createDSAKeyValueType1() {
		DSAKeyValueType1Impl dsaKeyValueType1 = new DSAKeyValueType1Impl();
		return dsaKeyValueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyInfoType createKeyInfoType() {
		KeyInfoTypeImpl keyInfoType = new KeyInfoTypeImpl();
		return keyInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyInfoType1 createKeyInfoType1() {
		KeyInfoType1Impl keyInfoType1 = new KeyInfoType1Impl();
		return keyInfoType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueType createKeyValueType() {
		KeyValueTypeImpl keyValueType = new KeyValueTypeImpl();
		return keyValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueType1 createKeyValueType1() {
		KeyValueType1Impl keyValueType1 = new KeyValueType1Impl();
		return keyValueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestType createManifestType() {
		ManifestTypeImpl manifestType = new ManifestTypeImpl();
		return manifestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestType1 createManifestType1() {
		ManifestType1Impl manifestType1 = new ManifestType1Impl();
		return manifestType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType createObjectType() {
		ObjectTypeImpl objectType = new ObjectTypeImpl();
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType1 createObjectType1() {
		ObjectType1Impl objectType1 = new ObjectType1Impl();
		return objectType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGPDataType createPGPDataType() {
		PGPDataTypeImpl pgpDataType = new PGPDataTypeImpl();
		return pgpDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGPDataType1 createPGPDataType1() {
		PGPDataType1Impl pgpDataType1 = new PGPDataType1Impl();
		return pgpDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType1 createReferenceType1() {
		ReferenceType1Impl referenceType1 = new ReferenceType1Impl();
		return referenceType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetrievalMethodType createRetrievalMethodType() {
		RetrievalMethodTypeImpl retrievalMethodType = new RetrievalMethodTypeImpl();
		return retrievalMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetrievalMethodType1 createRetrievalMethodType1() {
		RetrievalMethodType1Impl retrievalMethodType1 = new RetrievalMethodType1Impl();
		return retrievalMethodType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSAKeyValueType createRSAKeyValueType() {
		RSAKeyValueTypeImpl rsaKeyValueType = new RSAKeyValueTypeImpl();
		return rsaKeyValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSAKeyValueType1 createRSAKeyValueType1() {
		RSAKeyValueType1Impl rsaKeyValueType1 = new RSAKeyValueType1Impl();
		return rsaKeyValueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureMethodType createSignatureMethodType() {
		SignatureMethodTypeImpl signatureMethodType = new SignatureMethodTypeImpl();
		return signatureMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureMethodType1 createSignatureMethodType1() {
		SignatureMethodType1Impl signatureMethodType1 = new SignatureMethodType1Impl();
		return signatureMethodType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaturePropertiesType createSignaturePropertiesType() {
		SignaturePropertiesTypeImpl signaturePropertiesType = new SignaturePropertiesTypeImpl();
		return signaturePropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaturePropertiesType1 createSignaturePropertiesType1() {
		SignaturePropertiesType1Impl signaturePropertiesType1 = new SignaturePropertiesType1Impl();
		return signaturePropertiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaturePropertyType createSignaturePropertyType() {
		SignaturePropertyTypeImpl signaturePropertyType = new SignaturePropertyTypeImpl();
		return signaturePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaturePropertyType1 createSignaturePropertyType1() {
		SignaturePropertyType1Impl signaturePropertyType1 = new SignaturePropertyType1Impl();
		return signaturePropertyType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureType createSignatureType() {
		SignatureTypeImpl signatureType = new SignatureTypeImpl();
		return signatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureType1 createSignatureType1() {
		SignatureType1Impl signatureType1 = new SignatureType1Impl();
		return signatureType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureValueType createSignatureValueType() {
		SignatureValueTypeImpl signatureValueType = new SignatureValueTypeImpl();
		return signatureValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureValueType1 createSignatureValueType1() {
		SignatureValueType1Impl signatureValueType1 = new SignatureValueType1Impl();
		return signatureValueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedInfoType createSignedInfoType() {
		SignedInfoTypeImpl signedInfoType = new SignedInfoTypeImpl();
		return signedInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedInfoType1 createSignedInfoType1() {
		SignedInfoType1Impl signedInfoType1 = new SignedInfoType1Impl();
		return signedInfoType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPKIDataType createSPKIDataType() {
		SPKIDataTypeImpl spkiDataType = new SPKIDataTypeImpl();
		return spkiDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPKIDataType1 createSPKIDataType1() {
		SPKIDataType1Impl spkiDataType1 = new SPKIDataType1Impl();
		return spkiDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformsType createTransformsType() {
		TransformsTypeImpl transformsType = new TransformsTypeImpl();
		return transformsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformsType1 createTransformsType1() {
		TransformsType1Impl transformsType1 = new TransformsType1Impl();
		return transformsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformType createTransformType() {
		TransformTypeImpl transformType = new TransformTypeImpl();
		return transformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformType1 createTransformType1() {
		TransformType1Impl transformType1 = new TransformType1Impl();
		return transformType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509DataType createX509DataType() {
		X509DataTypeImpl x509DataType = new X509DataTypeImpl();
		return x509DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509DataType1 createX509DataType1() {
		X509DataType1Impl x509DataType1 = new X509DataType1Impl();
		return x509DataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509IssuerSerialType createX509IssuerSerialType() {
		X509IssuerSerialTypeImpl x509IssuerSerialType = new X509IssuerSerialTypeImpl();
		return x509IssuerSerialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509IssuerSerialType1 createX509IssuerSerialType1() {
		X509IssuerSerialType1Impl x509IssuerSerialType1 = new X509IssuerSerialType1Impl();
		return x509IssuerSerialType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createCryptoBinaryFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCryptoBinaryToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createCryptoBinary1FromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCryptoBinary1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createDigestValueTypeFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigestValueTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createDigestValueType1FromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigestValueType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createHMACOutputLengthTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHMACOutputLengthTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createHMACOutputLengthType1FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHMACOutputLengthType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmldsigPackage getXmldsigPackage() {
		return (XmldsigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmldsigPackage getPackage() {
		return XmldsigPackage.eINSTANCE;
	}

} //XmldsigFactoryImpl
