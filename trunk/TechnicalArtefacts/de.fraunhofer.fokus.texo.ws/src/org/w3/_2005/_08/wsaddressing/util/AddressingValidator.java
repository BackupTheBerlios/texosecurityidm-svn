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

import java.util.Collection;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.w3._2005._08.wsaddressing.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.w3._2005._08.wsaddressing.AddressingPackage
 * @generated
 */
public class AddressingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AddressingValidator INSTANCE = new AddressingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.w3._2005._08.wsaddressing";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AddressingPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AddressingPackage.ATTRIBUTED_QNAME_TYPE:
				return validateAttributedQNameType((AttributedQNameType)value, diagnostics, context);
			case AddressingPackage.ATTRIBUTED_QNAME_TYPE1:
				return validateAttributedQNameType1((AttributedQNameType1)value, diagnostics, context);
			case AddressingPackage.ATTRIBUTED_UNSIGNED_LONG_TYPE:
				return validateAttributedUnsignedLongType((AttributedUnsignedLongType)value, diagnostics, context);
			case AddressingPackage.ATTRIBUTED_UNSIGNED_LONG_TYPE1:
				return validateAttributedUnsignedLongType1((AttributedUnsignedLongType1)value, diagnostics, context);
			case AddressingPackage.ATTRIBUTED_URI_TYPE:
				return validateAttributedURIType((AttributedURIType)value, diagnostics, context);
			case AddressingPackage.ATTRIBUTED_URI_TYPE1:
				return validateAttributedURIType1((AttributedURIType1)value, diagnostics, context);
			case AddressingPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE:
				return validateEndpointReferenceType((EndpointReferenceType)value, diagnostics, context);
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE1:
				return validateEndpointReferenceType1((EndpointReferenceType1)value, diagnostics, context);
			case AddressingPackage.METADATA_TYPE:
				return validateMetadataType((MetadataType)value, diagnostics, context);
			case AddressingPackage.METADATA_TYPE1:
				return validateMetadataType1((MetadataType1)value, diagnostics, context);
			case AddressingPackage.PROBLEM_ACTION_TYPE:
				return validateProblemActionType((ProblemActionType)value, diagnostics, context);
			case AddressingPackage.PROBLEM_ACTION_TYPE1:
				return validateProblemActionType1((ProblemActionType1)value, diagnostics, context);
			case AddressingPackage.REFERENCE_PARAMETERS_TYPE:
				return validateReferenceParametersType((ReferenceParametersType)value, diagnostics, context);
			case AddressingPackage.REFERENCE_PARAMETERS_TYPE1:
				return validateReferenceParametersType1((ReferenceParametersType1)value, diagnostics, context);
			case AddressingPackage.RELATES_TO_TYPE:
				return validateRelatesToType((RelatesToType)value, diagnostics, context);
			case AddressingPackage.RELATES_TO_TYPE1:
				return validateRelatesToType1((RelatesToType1)value, diagnostics, context);
			case AddressingPackage.RELATIONSHIP_TYPE:
				return validateRelationshipType((RelationshipType)value, diagnostics, context);
			case AddressingPackage.RELATIONSHIP_TYPE1:
				return validateRelationshipType1((RelationshipType1)value, diagnostics, context);
			case AddressingPackage.FAULT_CODES_OPEN_ENUM_TYPE:
				return validateFaultCodesOpenEnumType((QName)value, diagnostics, context);
			case AddressingPackage.FAULT_CODES_OPEN_ENUM_TYPE1:
				return validateFaultCodesOpenEnumType1((QName)value, diagnostics, context);
			case AddressingPackage.FAULT_CODES_TYPE:
				return validateFaultCodesType((QName)value, diagnostics, context);
			case AddressingPackage.FAULT_CODES_TYPE1:
				return validateFaultCodesType1((QName)value, diagnostics, context);
			case AddressingPackage.RELATIONSHIP_TYPE_OBJECT:
				return validateRelationshipTypeObject((RelationshipType)value, diagnostics, context);
			case AddressingPackage.RELATIONSHIP_TYPE_OBJECT1:
				return validateRelationshipTypeObject1((RelationshipType)value, diagnostics, context);
			case AddressingPackage.RELATIONSHIP_TYPE_OPEN_ENUM:
				return validateRelationshipTypeOpenEnum(value, diagnostics, context);
			case AddressingPackage.RELATIONSHIP_TYPE_OPEN_ENUM1:
				return validateRelationshipTypeOpenEnum1(value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributedQNameType(AttributedQNameType attributedQNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributedQNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributedQNameType1(AttributedQNameType1 attributedQNameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributedQNameType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributedUnsignedLongType(AttributedUnsignedLongType attributedUnsignedLongType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributedUnsignedLongType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributedUnsignedLongType1(AttributedUnsignedLongType1 attributedUnsignedLongType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributedUnsignedLongType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributedURIType(AttributedURIType attributedURIType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributedURIType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributedURIType1(AttributedURIType1 attributedURIType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributedURIType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointReferenceType(EndpointReferenceType endpointReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointReferenceType1(EndpointReferenceType1 endpointReferenceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointReferenceType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadataType(MetadataType metadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadataType1(MetadataType1 metadataType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadataType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActionType(ProblemActionType problemActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(problemActionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActionType1(ProblemActionType1 problemActionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(problemActionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceParametersType(ReferenceParametersType referenceParametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceParametersType1(ReferenceParametersType1 referenceParametersType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceParametersType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatesToType(RelatesToType relatesToType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatesToType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatesToType1(RelatesToType1 relatesToType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatesToType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipType(RelationshipType relationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipType1(RelationshipType1 relationshipType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesOpenEnumType(QName faultCodesOpenEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFaultCodesOpenEnumType_MemberTypes(faultCodesOpenEnumType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fault Codes Open Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesOpenEnumType_MemberTypes(QName faultCodesOpenEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (AddressingPackage.Literals.FAULT_CODES_TYPE.isInstance(faultCodesOpenEnumType)) {
				if (validateFaultCodesType(faultCodesOpenEnumType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.QNAME.isInstance(faultCodesOpenEnumType)) {
				if (xmlTypeValidator.validateQName(faultCodesOpenEnumType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (AddressingPackage.Literals.FAULT_CODES_TYPE.isInstance(faultCodesOpenEnumType)) {
				if (validateFaultCodesType(faultCodesOpenEnumType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.QNAME.isInstance(faultCodesOpenEnumType)) {
				if (xmlTypeValidator.validateQName(faultCodesOpenEnumType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesOpenEnumType1(QName faultCodesOpenEnumType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFaultCodesOpenEnumType1_MemberTypes(faultCodesOpenEnumType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fault Codes Open Enum Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesOpenEnumType1_MemberTypes(QName faultCodesOpenEnumType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (AddressingPackage.Literals.FAULT_CODES_TYPE.isInstance(faultCodesOpenEnumType1)) {
				if (validateFaultCodesType(faultCodesOpenEnumType1, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.QNAME.isInstance(faultCodesOpenEnumType1)) {
				if (xmlTypeValidator.validateQName(faultCodesOpenEnumType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (AddressingPackage.Literals.FAULT_CODES_TYPE.isInstance(faultCodesOpenEnumType1)) {
				if (validateFaultCodesType(faultCodesOpenEnumType1, null, context)) return true;
			}
			if (XMLTypePackage.Literals.QNAME.isInstance(faultCodesOpenEnumType1)) {
				if (xmlTypeValidator.validateQName(faultCodesOpenEnumType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesType(QName faultCodesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFaultCodesType_Enumeration(faultCodesType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFaultCodesType_Enumeration
	 */
	public static final Collection<Object> FAULT_CODES_TYPE__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}InvalidAddressingHeader"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}InvalidAddress"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}InvalidEPR"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}InvalidCardinality"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}MissingAddressInEPR"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}DuplicateMessageID"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}ActionMismatch"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}MessageAddressingHeaderRequired"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}DestinationUnreachable"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}ActionNotSupported"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}EndpointUnavailable")
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Fault Codes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesType_Enumeration(QName faultCodesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = FAULT_CODES_TYPE__ENUMERATION__VALUES.contains(faultCodesType);
		if (!result && diagnostics != null)
			reportEnumerationViolation(AddressingPackage.Literals.FAULT_CODES_TYPE, faultCodesType, FAULT_CODES_TYPE__ENUMERATION__VALUES, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesType1(QName faultCodesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFaultCodesType1_Enumeration(faultCodesType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFaultCodesType1_Enumeration
	 */
	public static final Collection<Object> FAULT_CODES_TYPE1__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType1(), "{http://www.w3.org/2005/08/addressing}InvalidAddressingHeader"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType1(), "{http://www.w3.org/2005/08/addressing}InvalidAddress"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType1(), "{http://www.w3.org/2005/08/addressing}InvalidEPR"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType1(), "{http://www.w3.org/2005/08/addressing}InvalidCardinality"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType1(), "{http://www.w3.org/2005/08/addressing}MissingAddressInEPR"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType1(), "{http://www.w3.org/2005/08/addressing}DuplicateMessageID"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType1(), "{http://www.w3.org/2005/08/addressing}ActionMismatch"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType1(), "{http://www.w3.org/2005/08/addressing}MessageAddressingHeaderRequired"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType1(), "{http://www.w3.org/2005/08/addressing}DestinationUnreachable"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType1(), "{http://www.w3.org/2005/08/addressing}ActionNotSupported"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType1(), "{http://www.w3.org/2005/08/addressing}EndpointUnavailable")
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Fault Codes Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesType1_Enumeration(QName faultCodesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = FAULT_CODES_TYPE1__ENUMERATION__VALUES.contains(faultCodesType1);
		if (!result && diagnostics != null)
			reportEnumerationViolation(AddressingPackage.Literals.FAULT_CODES_TYPE1, faultCodesType1, FAULT_CODES_TYPE1__ENUMERATION__VALUES, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeObject(RelationshipType relationshipTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeObject1(RelationshipType relationshipTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeOpenEnum(Object relationshipTypeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRelationshipTypeOpenEnum_MemberTypes(relationshipTypeOpenEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Relationship Type Open Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeOpenEnum_MemberTypes(Object relationshipTypeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (AddressingPackage.Literals.RELATIONSHIP_TYPE.isInstance(relationshipTypeOpenEnum)) {
				if (validateRelationshipType((RelationshipType)relationshipTypeOpenEnum, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(relationshipTypeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)relationshipTypeOpenEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (AddressingPackage.Literals.RELATIONSHIP_TYPE.isInstance(relationshipTypeOpenEnum)) {
				if (validateRelationshipType((RelationshipType)relationshipTypeOpenEnum, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(relationshipTypeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)relationshipTypeOpenEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeOpenEnum1(Object relationshipTypeOpenEnum1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRelationshipTypeOpenEnum1_MemberTypes(relationshipTypeOpenEnum1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Relationship Type Open Enum1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeOpenEnum1_MemberTypes(Object relationshipTypeOpenEnum1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (AddressingPackage.Literals.RELATIONSHIP_TYPE.isInstance(relationshipTypeOpenEnum1)) {
				if (validateRelationshipType((RelationshipType)relationshipTypeOpenEnum1, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(relationshipTypeOpenEnum1)) {
				if (xmlTypeValidator.validateAnyURI((String)relationshipTypeOpenEnum1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (AddressingPackage.Literals.RELATIONSHIP_TYPE.isInstance(relationshipTypeOpenEnum1)) {
				if (validateRelationshipType((RelationshipType)relationshipTypeOpenEnum1, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(relationshipTypeOpenEnum1)) {
				if (xmlTypeValidator.validateAnyURI((String)relationshipTypeOpenEnum1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AddressingValidator
