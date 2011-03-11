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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl._0PackageImpl;

import org.w3._2000._09.xmldsig.XmldsigPackage;

import org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl;

import org.w3._2005._08.wsaddressing.AddressingFactory;
import org.w3._2005._08.wsaddressing.AddressingPackage;
import org.w3._2005._08.wsaddressing.AttributedQNameType;
import org.w3._2005._08.wsaddressing.AttributedQNameType1;
import org.w3._2005._08.wsaddressing.AttributedURIType;
import org.w3._2005._08.wsaddressing.AttributedURIType1;
import org.w3._2005._08.wsaddressing.AttributedUnsignedLongType;
import org.w3._2005._08.wsaddressing.AttributedUnsignedLongType1;
import org.w3._2005._08.wsaddressing.DocumentRoot;
import org.w3._2005._08.wsaddressing.EndpointReferenceType;
import org.w3._2005._08.wsaddressing.EndpointReferenceType1;
import org.w3._2005._08.wsaddressing.MetadataType;
import org.w3._2005._08.wsaddressing.MetadataType1;
import org.w3._2005._08.wsaddressing.ProblemActionType;
import org.w3._2005._08.wsaddressing.ProblemActionType1;
import org.w3._2005._08.wsaddressing.ReferenceParametersType;
import org.w3._2005._08.wsaddressing.ReferenceParametersType1;
import org.w3._2005._08.wsaddressing.RelatesToType;
import org.w3._2005._08.wsaddressing.RelatesToType1;
import org.w3._2005._08.wsaddressing.RelationshipType;
import org.w3._2005._08.wsaddressing.RelationshipType1;

import org.w3._2005._08.wsaddressing.util.AddressingValidator;

import org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage;

import org.xmlsoap.schemas.soap.soapenvelope.impl.EnvelopePackageImpl;

import org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage;

import org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressingPackageImpl extends EPackageImpl implements AddressingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedQNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedQNameType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedUnsignedLongTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedUnsignedLongType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedURITypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedURIType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointReferenceType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemActionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemActionType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceParametersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceParametersType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatesToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatesToType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType faultCodesOpenEnumTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType faultCodesOpenEnumType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType faultCodesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType faultCodesType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationshipTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationshipTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationshipTypeOpenEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationshipTypeOpenEnum1EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.w3._2005._08.wsaddressing.AddressingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AddressingPackageImpl() {
		super(eNS_URI, AddressingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AddressingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AddressingPackage init() {
		if (isInited) return (AddressingPackage)EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI);

		// Obtain or create and register package
		AddressingPackageImpl theAddressingPackage = (AddressingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AddressingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AddressingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EnvelopePackageImpl theEnvelopePackage = (EnvelopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvelopePackage.eNS_URI) instanceof EnvelopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvelopePackage.eNS_URI) : EnvelopePackage.eINSTANCE);
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) : _0Package.eINSTANCE);
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) instanceof XmldsigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) : XmldsigPackage.eINSTANCE);
		org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl the_0Package_1 = (org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) instanceof org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) : org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) instanceof PolicyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) : PolicyPackage.eINSTANCE);
		_200702PackageImpl the_200702Package = (_200702PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) instanceof _200702PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) : _200702Package.eINSTANCE);
		_200512PackageImpl the_200512Package = (_200512PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) instanceof _200512PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) : _200512Package.eINSTANCE);

		// Create package meta-data objects
		theAddressingPackage.createPackageContents();
		theEnvelopePackage.createPackageContents();
		the_0Package.createPackageContents();
		theXmldsigPackage.createPackageContents();
		the_0Package_1.createPackageContents();
		theUtilityPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		the_200702Package.createPackageContents();
		the_200512Package.createPackageContents();

		// Initialize created meta-data
		theAddressingPackage.initializePackageContents();
		theEnvelopePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		the_0Package_1.initializePackageContents();
		theUtilityPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		the_200702Package.initializePackageContents();
		the_200512Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAddressingPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AddressingValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAddressingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AddressingPackage.eNS_URI, theAddressingPackage);
		return theAddressingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedQNameType() {
		return attributedQNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedQNameType_Value() {
		return (EAttribute)attributedQNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedQNameType_AnyAttribute() {
		return (EAttribute)attributedQNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedQNameType1() {
		return attributedQNameType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedQNameType1_Value() {
		return (EAttribute)attributedQNameType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedQNameType1_AnyAttribute() {
		return (EAttribute)attributedQNameType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedUnsignedLongType() {
		return attributedUnsignedLongTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedUnsignedLongType_Value() {
		return (EAttribute)attributedUnsignedLongTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedUnsignedLongType_AnyAttribute() {
		return (EAttribute)attributedUnsignedLongTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedUnsignedLongType1() {
		return attributedUnsignedLongType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedUnsignedLongType1_Value() {
		return (EAttribute)attributedUnsignedLongType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedUnsignedLongType1_AnyAttribute() {
		return (EAttribute)attributedUnsignedLongType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedURIType() {
		return attributedURITypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedURIType_Value() {
		return (EAttribute)attributedURITypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedURIType_AnyAttribute() {
		return (EAttribute)attributedURITypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedURIType1() {
		return attributedURIType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedURIType1_Value() {
		return (EAttribute)attributedURIType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedURIType1_AnyAttribute() {
		return (EAttribute)attributedURIType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Action() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndpointReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FaultTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_From() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageID() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Metadata() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProblemAction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProblemHeaderQName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProblemIRI() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceParameters() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelatesTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReplyTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RetryAfter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_To() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IsReferenceParameter() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Action1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndpointReference1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FaultTo1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_From1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageID1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Metadata1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProblemAction1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProblemHeaderQName1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProblemIRI1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceParameters1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelatesTo1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReplyTo1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RetryAfter1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_To1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IsReferenceParameter1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointReferenceType() {
		return endpointReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointReferenceType_Address() {
		return (EReference)endpointReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointReferenceType_ReferenceParameters() {
		return (EReference)endpointReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointReferenceType_Metadata() {
		return (EReference)endpointReferenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointReferenceType_Any() {
		return (EAttribute)endpointReferenceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointReferenceType_AnyAttribute() {
		return (EAttribute)endpointReferenceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointReferenceType1() {
		return endpointReferenceType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointReferenceType1_Address() {
		return (EReference)endpointReferenceType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointReferenceType1_ReferenceParameters() {
		return (EReference)endpointReferenceType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointReferenceType1_Metadata() {
		return (EReference)endpointReferenceType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointReferenceType1_Any() {
		return (EAttribute)endpointReferenceType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointReferenceType1_AnyAttribute() {
		return (EAttribute)endpointReferenceType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataType() {
		return metadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_Any() {
		return (EAttribute)metadataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_AnyAttribute() {
		return (EAttribute)metadataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataType1() {
		return metadataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType1_Any() {
		return (EAttribute)metadataType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType1_AnyAttribute() {
		return (EAttribute)metadataType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemActionType() {
		return problemActionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemActionType_Action() {
		return (EReference)problemActionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblemActionType_SoapAction() {
		return (EAttribute)problemActionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblemActionType_AnyAttribute() {
		return (EAttribute)problemActionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemActionType1() {
		return problemActionType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemActionType1_Action() {
		return (EReference)problemActionType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblemActionType1_SoapAction() {
		return (EAttribute)problemActionType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblemActionType1_AnyAttribute() {
		return (EAttribute)problemActionType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceParametersType() {
		return referenceParametersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceParametersType_Any() {
		return (EAttribute)referenceParametersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceParametersType_AnyAttribute() {
		return (EAttribute)referenceParametersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceParametersType1() {
		return referenceParametersType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceParametersType1_Any() {
		return (EAttribute)referenceParametersType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceParametersType1_AnyAttribute() {
		return (EAttribute)referenceParametersType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatesToType() {
		return relatesToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatesToType_Value() {
		return (EAttribute)relatesToTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatesToType_RelationshipType() {
		return (EAttribute)relatesToTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatesToType_AnyAttribute() {
		return (EAttribute)relatesToTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatesToType1() {
		return relatesToType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatesToType1_Value() {
		return (EAttribute)relatesToType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatesToType1_RelationshipType() {
		return (EAttribute)relatesToType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatesToType1_AnyAttribute() {
		return (EAttribute)relatesToType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationshipType() {
		return relationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationshipType1() {
		return relationshipType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFaultCodesOpenEnumType() {
		return faultCodesOpenEnumTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFaultCodesOpenEnumType1() {
		return faultCodesOpenEnumType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFaultCodesType() {
		return faultCodesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFaultCodesType1() {
		return faultCodesType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelationshipTypeObject() {
		return relationshipTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelationshipTypeObject1() {
		return relationshipTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelationshipTypeOpenEnum() {
		return relationshipTypeOpenEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelationshipTypeOpenEnum1() {
		return relationshipTypeOpenEnum1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingFactory getAddressingFactory() {
		return (AddressingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributedQNameTypeEClass = createEClass(ATTRIBUTED_QNAME_TYPE);
		createEAttribute(attributedQNameTypeEClass, ATTRIBUTED_QNAME_TYPE__VALUE);
		createEAttribute(attributedQNameTypeEClass, ATTRIBUTED_QNAME_TYPE__ANY_ATTRIBUTE);

		attributedQNameType1EClass = createEClass(ATTRIBUTED_QNAME_TYPE1);
		createEAttribute(attributedQNameType1EClass, ATTRIBUTED_QNAME_TYPE1__VALUE);
		createEAttribute(attributedQNameType1EClass, ATTRIBUTED_QNAME_TYPE1__ANY_ATTRIBUTE);

		attributedUnsignedLongTypeEClass = createEClass(ATTRIBUTED_UNSIGNED_LONG_TYPE);
		createEAttribute(attributedUnsignedLongTypeEClass, ATTRIBUTED_UNSIGNED_LONG_TYPE__VALUE);
		createEAttribute(attributedUnsignedLongTypeEClass, ATTRIBUTED_UNSIGNED_LONG_TYPE__ANY_ATTRIBUTE);

		attributedUnsignedLongType1EClass = createEClass(ATTRIBUTED_UNSIGNED_LONG_TYPE1);
		createEAttribute(attributedUnsignedLongType1EClass, ATTRIBUTED_UNSIGNED_LONG_TYPE1__VALUE);
		createEAttribute(attributedUnsignedLongType1EClass, ATTRIBUTED_UNSIGNED_LONG_TYPE1__ANY_ATTRIBUTE);

		attributedURITypeEClass = createEClass(ATTRIBUTED_URI_TYPE);
		createEAttribute(attributedURITypeEClass, ATTRIBUTED_URI_TYPE__VALUE);
		createEAttribute(attributedURITypeEClass, ATTRIBUTED_URI_TYPE__ANY_ATTRIBUTE);

		attributedURIType1EClass = createEClass(ATTRIBUTED_URI_TYPE1);
		createEAttribute(attributedURIType1EClass, ATTRIBUTED_URI_TYPE1__VALUE);
		createEAttribute(attributedURIType1EClass, ATTRIBUTED_URI_TYPE1__ANY_ATTRIBUTE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENDPOINT_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FAULT_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FROM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MESSAGE_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__METADATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROBLEM_ACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROBLEM_HEADER_QNAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROBLEM_IRI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE_PARAMETERS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELATES_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REPLY_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RETRY_AFTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TO);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IS_REFERENCE_PARAMETER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTION1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENDPOINT_REFERENCE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FAULT_TO1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FROM1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MESSAGE_ID1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__METADATA1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROBLEM_ACTION1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROBLEM_HEADER_QNAME1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROBLEM_IRI1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE_PARAMETERS1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELATES_TO1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REPLY_TO1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RETRY_AFTER1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TO1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IS_REFERENCE_PARAMETER1);

		endpointReferenceTypeEClass = createEClass(ENDPOINT_REFERENCE_TYPE);
		createEReference(endpointReferenceTypeEClass, ENDPOINT_REFERENCE_TYPE__ADDRESS);
		createEReference(endpointReferenceTypeEClass, ENDPOINT_REFERENCE_TYPE__REFERENCE_PARAMETERS);
		createEReference(endpointReferenceTypeEClass, ENDPOINT_REFERENCE_TYPE__METADATA);
		createEAttribute(endpointReferenceTypeEClass, ENDPOINT_REFERENCE_TYPE__ANY);
		createEAttribute(endpointReferenceTypeEClass, ENDPOINT_REFERENCE_TYPE__ANY_ATTRIBUTE);

		endpointReferenceType1EClass = createEClass(ENDPOINT_REFERENCE_TYPE1);
		createEReference(endpointReferenceType1EClass, ENDPOINT_REFERENCE_TYPE1__ADDRESS);
		createEReference(endpointReferenceType1EClass, ENDPOINT_REFERENCE_TYPE1__REFERENCE_PARAMETERS);
		createEReference(endpointReferenceType1EClass, ENDPOINT_REFERENCE_TYPE1__METADATA);
		createEAttribute(endpointReferenceType1EClass, ENDPOINT_REFERENCE_TYPE1__ANY);
		createEAttribute(endpointReferenceType1EClass, ENDPOINT_REFERENCE_TYPE1__ANY_ATTRIBUTE);

		metadataTypeEClass = createEClass(METADATA_TYPE);
		createEAttribute(metadataTypeEClass, METADATA_TYPE__ANY);
		createEAttribute(metadataTypeEClass, METADATA_TYPE__ANY_ATTRIBUTE);

		metadataType1EClass = createEClass(METADATA_TYPE1);
		createEAttribute(metadataType1EClass, METADATA_TYPE1__ANY);
		createEAttribute(metadataType1EClass, METADATA_TYPE1__ANY_ATTRIBUTE);

		problemActionTypeEClass = createEClass(PROBLEM_ACTION_TYPE);
		createEReference(problemActionTypeEClass, PROBLEM_ACTION_TYPE__ACTION);
		createEAttribute(problemActionTypeEClass, PROBLEM_ACTION_TYPE__SOAP_ACTION);
		createEAttribute(problemActionTypeEClass, PROBLEM_ACTION_TYPE__ANY_ATTRIBUTE);

		problemActionType1EClass = createEClass(PROBLEM_ACTION_TYPE1);
		createEReference(problemActionType1EClass, PROBLEM_ACTION_TYPE1__ACTION);
		createEAttribute(problemActionType1EClass, PROBLEM_ACTION_TYPE1__SOAP_ACTION);
		createEAttribute(problemActionType1EClass, PROBLEM_ACTION_TYPE1__ANY_ATTRIBUTE);

		referenceParametersTypeEClass = createEClass(REFERENCE_PARAMETERS_TYPE);
		createEAttribute(referenceParametersTypeEClass, REFERENCE_PARAMETERS_TYPE__ANY);
		createEAttribute(referenceParametersTypeEClass, REFERENCE_PARAMETERS_TYPE__ANY_ATTRIBUTE);

		referenceParametersType1EClass = createEClass(REFERENCE_PARAMETERS_TYPE1);
		createEAttribute(referenceParametersType1EClass, REFERENCE_PARAMETERS_TYPE1__ANY);
		createEAttribute(referenceParametersType1EClass, REFERENCE_PARAMETERS_TYPE1__ANY_ATTRIBUTE);

		relatesToTypeEClass = createEClass(RELATES_TO_TYPE);
		createEAttribute(relatesToTypeEClass, RELATES_TO_TYPE__VALUE);
		createEAttribute(relatesToTypeEClass, RELATES_TO_TYPE__RELATIONSHIP_TYPE);
		createEAttribute(relatesToTypeEClass, RELATES_TO_TYPE__ANY_ATTRIBUTE);

		relatesToType1EClass = createEClass(RELATES_TO_TYPE1);
		createEAttribute(relatesToType1EClass, RELATES_TO_TYPE1__VALUE);
		createEAttribute(relatesToType1EClass, RELATES_TO_TYPE1__RELATIONSHIP_TYPE);
		createEAttribute(relatesToType1EClass, RELATES_TO_TYPE1__ANY_ATTRIBUTE);

		// Create enums
		relationshipTypeEEnum = createEEnum(RELATIONSHIP_TYPE);
		relationshipType1EEnum = createEEnum(RELATIONSHIP_TYPE1);

		// Create data types
		faultCodesOpenEnumTypeEDataType = createEDataType(FAULT_CODES_OPEN_ENUM_TYPE);
		faultCodesOpenEnumType1EDataType = createEDataType(FAULT_CODES_OPEN_ENUM_TYPE1);
		faultCodesTypeEDataType = createEDataType(FAULT_CODES_TYPE);
		faultCodesType1EDataType = createEDataType(FAULT_CODES_TYPE1);
		relationshipTypeObjectEDataType = createEDataType(RELATIONSHIP_TYPE_OBJECT);
		relationshipTypeObject1EDataType = createEDataType(RELATIONSHIP_TYPE_OBJECT1);
		relationshipTypeOpenEnumEDataType = createEDataType(RELATIONSHIP_TYPE_OPEN_ENUM);
		relationshipTypeOpenEnum1EDataType = createEDataType(RELATIONSHIP_TYPE_OPEN_ENUM1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(attributedQNameTypeEClass, AttributedQNameType.class, "AttributedQNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedQNameType_Value(), theXMLTypePackage.getQName(), "value", null, 0, 1, AttributedQNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedQNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedQNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedQNameType1EClass, AttributedQNameType1.class, "AttributedQNameType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedQNameType1_Value(), theXMLTypePackage.getQName(), "value", null, 0, 1, AttributedQNameType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedQNameType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedQNameType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedUnsignedLongTypeEClass, AttributedUnsignedLongType.class, "AttributedUnsignedLongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedUnsignedLongType_Value(), theXMLTypePackage.getUnsignedLong(), "value", null, 0, 1, AttributedUnsignedLongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedUnsignedLongType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedUnsignedLongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedUnsignedLongType1EClass, AttributedUnsignedLongType1.class, "AttributedUnsignedLongType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedUnsignedLongType1_Value(), theXMLTypePackage.getUnsignedLong(), "value", null, 0, 1, AttributedUnsignedLongType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedUnsignedLongType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedUnsignedLongType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedURITypeEClass, AttributedURIType.class, "AttributedURIType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedURIType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, AttributedURIType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedURIType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedURIType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedURIType1EClass, AttributedURIType1.class, "AttributedURIType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedURIType1_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, AttributedURIType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedURIType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedURIType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Action(), this.getAttributedURIType1(), null, "action", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EndpointReference(), this.getEndpointReferenceType1(), null, "endpointReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FaultTo(), this.getEndpointReferenceType1(), null, "faultTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_From(), this.getEndpointReferenceType1(), null, "from", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MessageID(), this.getAttributedURIType1(), null, "messageID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Metadata(), this.getMetadataType1(), null, "metadata", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProblemAction(), this.getProblemActionType1(), null, "problemAction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProblemHeaderQName(), this.getAttributedQNameType1(), null, "problemHeaderQName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProblemIRI(), this.getAttributedURIType1(), null, "problemIRI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReferenceParameters(), this.getReferenceParametersType1(), null, "referenceParameters", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RelatesTo(), this.getRelatesToType1(), null, "relatesTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReplyTo(), this.getEndpointReferenceType1(), null, "replyTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RetryAfter(), this.getAttributedUnsignedLongType1(), null, "retryAfter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_To(), this.getAttributedURIType1(), null, "to", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IsReferenceParameter(), theXMLTypePackage.getBoolean(), "isReferenceParameter", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Action1(), this.getAttributedURIType(), null, "action1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EndpointReference1(), this.getEndpointReferenceType(), null, "endpointReference1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FaultTo1(), this.getEndpointReferenceType(), null, "faultTo1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_From1(), this.getEndpointReferenceType(), null, "from1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MessageID1(), this.getAttributedURIType(), null, "messageID1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Metadata1(), this.getMetadataType(), null, "metadata1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProblemAction1(), this.getProblemActionType(), null, "problemAction1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProblemHeaderQName1(), this.getAttributedQNameType(), null, "problemHeaderQName1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProblemIRI1(), this.getAttributedURIType(), null, "problemIRI1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReferenceParameters1(), this.getReferenceParametersType(), null, "referenceParameters1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RelatesTo1(), this.getRelatesToType(), null, "relatesTo1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReplyTo1(), this.getEndpointReferenceType(), null, "replyTo1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RetryAfter1(), this.getAttributedUnsignedLongType(), null, "retryAfter1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_To1(), this.getAttributedURIType(), null, "to1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IsReferenceParameter1(), theXMLTypePackage.getBoolean(), "isReferenceParameter1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointReferenceTypeEClass, EndpointReferenceType.class, "EndpointReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndpointReferenceType_Address(), this.getAttributedURIType(), null, "address", null, 1, 1, EndpointReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpointReferenceType_ReferenceParameters(), this.getReferenceParametersType(), null, "referenceParameters", null, 0, 1, EndpointReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpointReferenceType_Metadata(), this.getMetadataType(), null, "metadata", null, 0, 1, EndpointReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointReferenceType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, EndpointReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointReferenceType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, EndpointReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointReferenceType1EClass, EndpointReferenceType1.class, "EndpointReferenceType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndpointReferenceType1_Address(), this.getAttributedURIType1(), null, "address", null, 1, 1, EndpointReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpointReferenceType1_ReferenceParameters(), this.getReferenceParametersType1(), null, "referenceParameters", null, 0, 1, EndpointReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpointReferenceType1_Metadata(), this.getMetadataType1(), null, "metadata", null, 0, 1, EndpointReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointReferenceType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, EndpointReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointReferenceType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, EndpointReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataTypeEClass, MetadataType.class, "MetadataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadataType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataType1EClass, MetadataType1.class, "MetadataType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadataType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, MetadataType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, MetadataType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(problemActionTypeEClass, ProblemActionType.class, "ProblemActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProblemActionType_Action(), this.getAttributedURIType(), null, "action", null, 0, 1, ProblemActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProblemActionType_SoapAction(), theXMLTypePackage.getAnyURI(), "soapAction", null, 0, 1, ProblemActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProblemActionType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ProblemActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(problemActionType1EClass, ProblemActionType1.class, "ProblemActionType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProblemActionType1_Action(), this.getAttributedURIType1(), null, "action", null, 0, 1, ProblemActionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProblemActionType1_SoapAction(), theXMLTypePackage.getAnyURI(), "soapAction", null, 0, 1, ProblemActionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProblemActionType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ProblemActionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceParametersTypeEClass, ReferenceParametersType.class, "ReferenceParametersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceParametersType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ReferenceParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceParametersType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ReferenceParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceParametersType1EClass, ReferenceParametersType1.class, "ReferenceParametersType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceParametersType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ReferenceParametersType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceParametersType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ReferenceParametersType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatesToTypeEClass, RelatesToType.class, "RelatesToType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelatesToType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, RelatesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelatesToType_RelationshipType(), this.getRelationshipTypeOpenEnum(), "relationshipType", "http://www.w3.org/2005/08/addressing/reply", 0, 1, RelatesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelatesToType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RelatesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatesToType1EClass, RelatesToType1.class, "RelatesToType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelatesToType1_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, RelatesToType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelatesToType1_RelationshipType(), this.getRelationshipTypeOpenEnum1(), "relationshipType", "http://www.w3.org/2005/08/addressing/reply", 0, 1, RelatesToType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelatesToType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RelatesToType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(relationshipTypeEEnum, RelationshipType.class, "RelationshipType");
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.HTTP_WWW_W3_ORG200508_ADDRESSING_REPLY);

		initEEnum(relationshipType1EEnum, RelationshipType1.class, "RelationshipType1");
		addEEnumLiteral(relationshipType1EEnum, RelationshipType1.HTTP_WWW_W3_ORG200508_ADDRESSING_REPLY);

		// Initialize data types
		initEDataType(faultCodesOpenEnumTypeEDataType, QName.class, "FaultCodesOpenEnumType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(faultCodesOpenEnumType1EDataType, QName.class, "FaultCodesOpenEnumType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(faultCodesTypeEDataType, QName.class, "FaultCodesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(faultCodesType1EDataType, QName.class, "FaultCodesType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relationshipTypeObjectEDataType, RelationshipType.class, "RelationshipTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relationshipTypeObject1EDataType, RelationshipType.class, "RelationshipTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relationshipTypeOpenEnumEDataType, Object.class, "RelationshipTypeOpenEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relationshipTypeOpenEnum1EDataType, Object.class, "RelationshipTypeOpenEnum1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (attributedQNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AttributedQNameType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedQNameType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedQNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (attributedQNameType1EClass, 
		   source, 
		   new String[] {
			 "name", "AttributedQNameType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedQNameType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedQNameType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (attributedUnsignedLongTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AttributedUnsignedLongType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedUnsignedLongType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedUnsignedLongType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (attributedUnsignedLongType1EClass, 
		   source, 
		   new String[] {
			 "name", "AttributedUnsignedLongType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedUnsignedLongType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedUnsignedLongType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (attributedURITypeEClass, 
		   source, 
		   new String[] {
			 "name", "AttributedURIType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedURIType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedURIType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (attributedURIType1EClass, 
		   source, 
		   new String[] {
			 "name", "AttributedURIType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedURIType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedURIType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Action",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EndpointReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EndpointReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FaultTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FaultTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_From(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "From",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MessageID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MessageID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Metadata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProblemAction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProblemAction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProblemHeaderQName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProblemHeaderQName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProblemIRI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProblemIRI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ReferenceParameters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReferenceParameters",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RelatesTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RelatesTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ReplyTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReplyTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RetryAfter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RetryAfter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_To(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "To",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IsReferenceParameter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IsReferenceParameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Action1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Action",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EndpointReference1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EndpointReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FaultTo1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FaultTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_From1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "From",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MessageID1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MessageID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Metadata1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Metadata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProblemAction1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProblemAction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProblemHeaderQName1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProblemHeaderQName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProblemIRI1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProblemIRI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ReferenceParameters1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReferenceParameters",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RelatesTo1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RelatesTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ReplyTo1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReplyTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RetryAfter1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RetryAfter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_To1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "To",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IsReferenceParameter1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IsReferenceParameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (endpointReferenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EndpointReferenceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEndpointReferenceType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEndpointReferenceType_ReferenceParameters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReferenceParameters",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEndpointReferenceType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Metadata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEndpointReferenceType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getEndpointReferenceType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });		
		addAnnotation
		  (endpointReferenceType1EClass, 
		   source, 
		   new String[] {
			 "name", "EndpointReferenceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEndpointReferenceType1_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEndpointReferenceType1_ReferenceParameters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReferenceParameters",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEndpointReferenceType1_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Metadata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEndpointReferenceType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getEndpointReferenceType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });		
		addAnnotation
		  (faultCodesOpenEnumTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "FaultCodesOpenEnumType",
			 "memberTypes", "FaultCodesType http://www.eclipse.org/emf/2003/XMLType#QName"
		   });		
		addAnnotation
		  (faultCodesOpenEnumType1EDataType, 
		   source, 
		   new String[] {
			 "name", "FaultCodesOpenEnumType",
			 "memberTypes", "FaultCodesType http://www.eclipse.org/emf/2003/XMLType#QName"
		   });		
		addAnnotation
		  (faultCodesTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "FaultCodesType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#QName",
			 "enumeration", "{http://www.w3.org/2005/08/addressing}InvalidAddressingHeader {http://www.w3.org/2005/08/addressing}InvalidAddress {http://www.w3.org/2005/08/addressing}InvalidEPR {http://www.w3.org/2005/08/addressing}InvalidCardinality {http://www.w3.org/2005/08/addressing}MissingAddressInEPR {http://www.w3.org/2005/08/addressing}DuplicateMessageID {http://www.w3.org/2005/08/addressing}ActionMismatch {http://www.w3.org/2005/08/addressing}MessageAddressingHeaderRequired {http://www.w3.org/2005/08/addressing}DestinationUnreachable {http://www.w3.org/2005/08/addressing}ActionNotSupported {http://www.w3.org/2005/08/addressing}EndpointUnavailable"
		   });		
		addAnnotation
		  (faultCodesType1EDataType, 
		   source, 
		   new String[] {
			 "name", "FaultCodesType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#QName",
			 "enumeration", "{http://www.w3.org/2005/08/addressing}InvalidAddressingHeader {http://www.w3.org/2005/08/addressing}InvalidAddress {http://www.w3.org/2005/08/addressing}InvalidEPR {http://www.w3.org/2005/08/addressing}InvalidCardinality {http://www.w3.org/2005/08/addressing}MissingAddressInEPR {http://www.w3.org/2005/08/addressing}DuplicateMessageID {http://www.w3.org/2005/08/addressing}ActionMismatch {http://www.w3.org/2005/08/addressing}MessageAddressingHeaderRequired {http://www.w3.org/2005/08/addressing}DestinationUnreachable {http://www.w3.org/2005/08/addressing}ActionNotSupported {http://www.w3.org/2005/08/addressing}EndpointUnavailable"
		   });		
		addAnnotation
		  (metadataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MetadataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMetadataType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getMetadataType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (metadataType1EClass, 
		   source, 
		   new String[] {
			 "name", "MetadataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMetadataType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getMetadataType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (problemActionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProblemActionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProblemActionType_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Action",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProblemActionType_SoapAction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SoapAction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProblemActionType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (problemActionType1EClass, 
		   source, 
		   new String[] {
			 "name", "ProblemActionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProblemActionType1_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Action",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProblemActionType1_SoapAction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SoapAction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProblemActionType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (referenceParametersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ReferenceParametersType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReferenceParametersType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getReferenceParametersType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (referenceParametersType1EClass, 
		   source, 
		   new String[] {
			 "name", "ReferenceParametersType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReferenceParametersType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getReferenceParametersType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (relatesToTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RelatesToType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getRelatesToType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getRelatesToType_RelationshipType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "RelationshipType"
		   });		
		addAnnotation
		  (getRelatesToType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (relatesToType1EClass, 
		   source, 
		   new String[] {
			 "name", "RelatesToType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getRelatesToType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getRelatesToType1_RelationshipType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "RelationshipType"
		   });		
		addAnnotation
		  (getRelatesToType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (relationshipTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "RelationshipType"
		   });		
		addAnnotation
		  (relationshipType1EEnum, 
		   source, 
		   new String[] {
			 "name", "RelationshipType"
		   });		
		addAnnotation
		  (relationshipTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "RelationshipType:Object",
			 "baseType", "RelationshipType"
		   });		
		addAnnotation
		  (relationshipTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "RelationshipType:Object",
			 "baseType", "RelationshipType"
		   });		
		addAnnotation
		  (relationshipTypeOpenEnumEDataType, 
		   source, 
		   new String[] {
			 "name", "RelationshipTypeOpenEnum",
			 "memberTypes", "RelationshipType http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (relationshipTypeOpenEnum1EDataType, 
		   source, 
		   new String[] {
			 "name", "RelationshipTypeOpenEnum",
			 "memberTypes", "RelationshipType http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });
	}

} //AddressingPackageImpl
