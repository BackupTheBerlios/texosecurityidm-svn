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

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2005._08.wsaddressing.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressingFactoryImpl extends EFactoryImpl implements AddressingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AddressingFactory init() {
		try {
			AddressingFactory theAddressingFactory = (AddressingFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.w3.org/2005/08/addressing"); 
			if (theAddressingFactory != null) {
				return theAddressingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AddressingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingFactoryImpl() {
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
			case AddressingPackage.ATTRIBUTED_QNAME_TYPE: return createAttributedQNameType();
			case AddressingPackage.ATTRIBUTED_QNAME_TYPE1: return createAttributedQNameType1();
			case AddressingPackage.ATTRIBUTED_UNSIGNED_LONG_TYPE: return createAttributedUnsignedLongType();
			case AddressingPackage.ATTRIBUTED_UNSIGNED_LONG_TYPE1: return createAttributedUnsignedLongType1();
			case AddressingPackage.ATTRIBUTED_URI_TYPE: return createAttributedURIType();
			case AddressingPackage.ATTRIBUTED_URI_TYPE1: return createAttributedURIType1();
			case AddressingPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE: return createEndpointReferenceType();
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1: return createEndpointReferenceType1();
			case AddressingPackage.METADATA_TYPE: return createMetadataType();
			case AddressingPackage.METADATA_TYPE1: return createMetadataType1();
			case AddressingPackage.PROBLEM_ACTION_TYPE: return createProblemActionType();
			case AddressingPackage.PROBLEM_ACTION_TYPE1: return createProblemActionType1();
			case AddressingPackage.REFERENCE_PARAMETERS_TYPE: return createReferenceParametersType();
			case AddressingPackage.REFERENCE_PARAMETERS_TYPE1: return createReferenceParametersType1();
			case AddressingPackage.RELATES_TO_TYPE: return createRelatesToType();
			case AddressingPackage.RELATES_TO_TYPE1: return createRelatesToType1();
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
			case AddressingPackage.RELATIONSHIP_TYPE:
				return createRelationshipTypeFromString(eDataType, initialValue);
			case AddressingPackage.RELATIONSHIP_TYPE1:
				return createRelationshipType1FromString(eDataType, initialValue);
			case AddressingPackage.FAULT_CODES_OPEN_ENUM_TYPE:
				return createFaultCodesOpenEnumTypeFromString(eDataType, initialValue);
			case AddressingPackage.FAULT_CODES_OPEN_ENUM_TYPE1:
				return createFaultCodesOpenEnumType1FromString(eDataType, initialValue);
			case AddressingPackage.FAULT_CODES_TYPE:
				return createFaultCodesTypeFromString(eDataType, initialValue);
			case AddressingPackage.FAULT_CODES_TYPE1:
				return createFaultCodesType1FromString(eDataType, initialValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OBJECT:
				return createRelationshipTypeObjectFromString(eDataType, initialValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OBJECT1:
				return createRelationshipTypeObject1FromString(eDataType, initialValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OPEN_ENUM:
				return createRelationshipTypeOpenEnumFromString(eDataType, initialValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OPEN_ENUM1:
				return createRelationshipTypeOpenEnum1FromString(eDataType, initialValue);
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
			case AddressingPackage.RELATIONSHIP_TYPE:
				return convertRelationshipTypeToString(eDataType, instanceValue);
			case AddressingPackage.RELATIONSHIP_TYPE1:
				return convertRelationshipType1ToString(eDataType, instanceValue);
			case AddressingPackage.FAULT_CODES_OPEN_ENUM_TYPE:
				return convertFaultCodesOpenEnumTypeToString(eDataType, instanceValue);
			case AddressingPackage.FAULT_CODES_OPEN_ENUM_TYPE1:
				return convertFaultCodesOpenEnumType1ToString(eDataType, instanceValue);
			case AddressingPackage.FAULT_CODES_TYPE:
				return convertFaultCodesTypeToString(eDataType, instanceValue);
			case AddressingPackage.FAULT_CODES_TYPE1:
				return convertFaultCodesType1ToString(eDataType, instanceValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OBJECT:
				return convertRelationshipTypeObjectToString(eDataType, instanceValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OBJECT1:
				return convertRelationshipTypeObject1ToString(eDataType, instanceValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OPEN_ENUM:
				return convertRelationshipTypeOpenEnumToString(eDataType, instanceValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OPEN_ENUM1:
				return convertRelationshipTypeOpenEnum1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedQNameType createAttributedQNameType() {
		AttributedQNameTypeImpl attributedQNameType = new AttributedQNameTypeImpl();
		return attributedQNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedQNameType1 createAttributedQNameType1() {
		AttributedQNameType1Impl attributedQNameType1 = new AttributedQNameType1Impl();
		return attributedQNameType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedUnsignedLongType createAttributedUnsignedLongType() {
		AttributedUnsignedLongTypeImpl attributedUnsignedLongType = new AttributedUnsignedLongTypeImpl();
		return attributedUnsignedLongType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedUnsignedLongType1 createAttributedUnsignedLongType1() {
		AttributedUnsignedLongType1Impl attributedUnsignedLongType1 = new AttributedUnsignedLongType1Impl();
		return attributedUnsignedLongType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType createAttributedURIType() {
		AttributedURITypeImpl attributedURIType = new AttributedURITypeImpl();
		return attributedURIType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType1 createAttributedURIType1() {
		AttributedURIType1Impl attributedURIType1 = new AttributedURIType1Impl();
		return attributedURIType1;
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
	public EndpointReferenceType createEndpointReferenceType() {
		EndpointReferenceTypeImpl endpointReferenceType = new EndpointReferenceTypeImpl();
		return endpointReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType1 createEndpointReferenceType1() {
		EndpointReferenceType1Impl endpointReferenceType1 = new EndpointReferenceType1Impl();
		return endpointReferenceType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType createMetadataType() {
		MetadataTypeImpl metadataType = new MetadataTypeImpl();
		return metadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType1 createMetadataType1() {
		MetadataType1Impl metadataType1 = new MetadataType1Impl();
		return metadataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemActionType createProblemActionType() {
		ProblemActionTypeImpl problemActionType = new ProblemActionTypeImpl();
		return problemActionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemActionType1 createProblemActionType1() {
		ProblemActionType1Impl problemActionType1 = new ProblemActionType1Impl();
		return problemActionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceParametersType createReferenceParametersType() {
		ReferenceParametersTypeImpl referenceParametersType = new ReferenceParametersTypeImpl();
		return referenceParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceParametersType1 createReferenceParametersType1() {
		ReferenceParametersType1Impl referenceParametersType1 = new ReferenceParametersType1Impl();
		return referenceParametersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatesToType createRelatesToType() {
		RelatesToTypeImpl relatesToType = new RelatesToTypeImpl();
		return relatesToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatesToType1 createRelatesToType1() {
		RelatesToType1Impl relatesToType1 = new RelatesToType1Impl();
		return relatesToType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		RelationshipType result = RelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType1 createRelationshipType1FromString(EDataType eDataType, String initialValue) {
		RelationshipType1 result = RelationshipType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createFaultCodesOpenEnumTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		QName result = null;
		RuntimeException exception = null;
		try {
			result = createFaultCodesTypeFromString(AddressingPackage.Literals.FAULT_CODES_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultCodesOpenEnumTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (AddressingPackage.Literals.FAULT_CODES_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertFaultCodesTypeToString(AddressingPackage.Literals.FAULT_CODES_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.QNAME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createFaultCodesOpenEnumType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		QName result = null;
		RuntimeException exception = null;
		try {
			result = createFaultCodesTypeFromString(AddressingPackage.Literals.FAULT_CODES_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultCodesOpenEnumType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (AddressingPackage.Literals.FAULT_CODES_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertFaultCodesTypeToString(AddressingPackage.Literals.FAULT_CODES_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.QNAME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createFaultCodesTypeFromString(EDataType eDataType, String initialValue) {
		return (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultCodesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createFaultCodesType1FromString(EDataType eDataType, String initialValue) {
		return (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultCodesType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRelationshipTypeFromString(AddressingPackage.Literals.RELATIONSHIP_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelationshipTypeToString(AddressingPackage.Literals.RELATIONSHIP_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createRelationshipTypeFromString(AddressingPackage.Literals.RELATIONSHIP_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertRelationshipTypeToString(AddressingPackage.Literals.RELATIONSHIP_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRelationshipTypeOpenEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createRelationshipTypeFromString(AddressingPackage.Literals.RELATIONSHIP_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeOpenEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (AddressingPackage.Literals.RELATIONSHIP_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertRelationshipTypeToString(AddressingPackage.Literals.RELATIONSHIP_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRelationshipTypeOpenEnum1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createRelationshipTypeFromString(AddressingPackage.Literals.RELATIONSHIP_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeOpenEnum1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (AddressingPackage.Literals.RELATIONSHIP_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertRelationshipTypeToString(AddressingPackage.Literals.RELATIONSHIP_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingPackage getAddressingPackage() {
		return (AddressingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AddressingPackage getPackage() {
		return AddressingPackage.eINSTANCE;
	}

} //AddressingFactoryImpl
