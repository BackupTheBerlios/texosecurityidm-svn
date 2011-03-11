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
package org.xmlsoap.schemas.ws._2004._09.wspolicy.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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

import org.w3._2005._08.wsaddressing.AddressingPackage;

import org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl;

import org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage;

import org.xmlsoap.schemas.soap.soapenvelope.impl.EnvelopePackageImpl;

import org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage;

import org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.AppliesToType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyFactory;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.util.PolicyValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyPackageImpl extends EPackageImpl implements PolicyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appliesToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appliesToType1EClass = null;

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
	private EClass operatorContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorContentType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyAttachmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyAttachmentType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyReferenceType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType policyURIsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType policyURIsType1EDataType = null;

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
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolicyPackageImpl() {
		super(eNS_URI, PolicyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PolicyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolicyPackage init() {
		if (isInited) return (PolicyPackage)EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);

		// Obtain or create and register package
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PolicyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PolicyPackageImpl());

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
		AddressingPackageImpl theAddressingPackage = (AddressingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) instanceof AddressingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) : AddressingPackage.eINSTANCE);
		_200702PackageImpl the_200702Package = (_200702PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) instanceof _200702PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) : _200702Package.eINSTANCE);
		_200512PackageImpl the_200512Package = (_200512PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) instanceof _200512PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) : _200512Package.eINSTANCE);

		// Create package meta-data objects
		thePolicyPackage.createPackageContents();
		theEnvelopePackage.createPackageContents();
		the_0Package.createPackageContents();
		theXmldsigPackage.createPackageContents();
		the_0Package_1.createPackageContents();
		theUtilityPackage.createPackageContents();
		theAddressingPackage.createPackageContents();
		the_200702Package.createPackageContents();
		the_200512Package.createPackageContents();

		// Initialize created meta-data
		thePolicyPackage.initializePackageContents();
		theEnvelopePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		the_0Package_1.initializePackageContents();
		theUtilityPackage.initializePackageContents();
		theAddressingPackage.initializePackageContents();
		the_200702Package.initializePackageContents();
		the_200512Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePolicyPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PolicyValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePolicyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolicyPackage.eNS_URI, thePolicyPackage);
		return thePolicyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppliesToType() {
		return appliesToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppliesToType_Any() {
		return (EAttribute)appliesToTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppliesToType_AnyAttribute() {
		return (EAttribute)appliesToTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppliesToType1() {
		return appliesToType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppliesToType1_Any() {
		return (EAttribute)appliesToType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppliesToType1_AnyAttribute() {
		return (EAttribute)appliesToType1EClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_All() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AppliesTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExactlyOne() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Policy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolicyAttachment() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolicyReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Optional() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PolicyURIs() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_All1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AppliesTo1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExactlyOne1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Policy1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolicyAttachment1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolicyReference1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Optional1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PolicyURIs1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorContentType() {
		return operatorContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatorContentType_Group() {
		return (EAttribute)operatorContentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorContentType_Policy() {
		return (EReference)operatorContentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorContentType_All() {
		return (EReference)operatorContentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorContentType_ExactlyOne() {
		return (EReference)operatorContentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorContentType_PolicyReference() {
		return (EReference)operatorContentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatorContentType_Any() {
		return (EAttribute)operatorContentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorContentType1() {
		return operatorContentType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatorContentType1_Group() {
		return (EAttribute)operatorContentType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorContentType1_Policy() {
		return (EReference)operatorContentType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorContentType1_All() {
		return (EReference)operatorContentType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorContentType1_ExactlyOne() {
		return (EReference)operatorContentType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorContentType1_PolicyReference() {
		return (EReference)operatorContentType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatorContentType1_Any() {
		return (EAttribute)operatorContentType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyAttachmentType() {
		return policyAttachmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyAttachmentType_AppliesTo() {
		return (EReference)policyAttachmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyAttachmentType_Group() {
		return (EAttribute)policyAttachmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyAttachmentType_Policy() {
		return (EReference)policyAttachmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyAttachmentType_PolicyReference() {
		return (EReference)policyAttachmentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyAttachmentType_Any() {
		return (EAttribute)policyAttachmentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyAttachmentType_AnyAttribute() {
		return (EAttribute)policyAttachmentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyAttachmentType1() {
		return policyAttachmentType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyAttachmentType1_AppliesTo() {
		return (EReference)policyAttachmentType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyAttachmentType1_Group() {
		return (EAttribute)policyAttachmentType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyAttachmentType1_Policy() {
		return (EReference)policyAttachmentType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyAttachmentType1_PolicyReference() {
		return (EReference)policyAttachmentType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyAttachmentType1_Any() {
		return (EAttribute)policyAttachmentType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyAttachmentType1_AnyAttribute() {
		return (EAttribute)policyAttachmentType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyReferenceType() {
		return policyReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyReferenceType_Digest() {
		return (EAttribute)policyReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyReferenceType_DigestAlgorithm() {
		return (EAttribute)policyReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyReferenceType_URI() {
		return (EAttribute)policyReferenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyReferenceType_AnyAttribute() {
		return (EAttribute)policyReferenceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyReferenceType1() {
		return policyReferenceType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyReferenceType1_Digest() {
		return (EAttribute)policyReferenceType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyReferenceType1_DigestAlgorithm() {
		return (EAttribute)policyReferenceType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyReferenceType1_URI() {
		return (EAttribute)policyReferenceType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyReferenceType1_AnyAttribute() {
		return (EAttribute)policyReferenceType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyType() {
		return policyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyType_Id() {
		return (EAttribute)policyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyType_Name() {
		return (EAttribute)policyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyType_AnyAttribute() {
		return (EAttribute)policyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyType1() {
		return policyType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyType1_Id() {
		return (EAttribute)policyType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyType1_Name() {
		return (EAttribute)policyType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyType1_AnyAttribute() {
		return (EAttribute)policyType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPolicyURIsType() {
		return policyURIsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPolicyURIsType1() {
		return policyURIsType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyFactory getPolicyFactory() {
		return (PolicyFactory)getEFactoryInstance();
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
		appliesToTypeEClass = createEClass(APPLIES_TO_TYPE);
		createEAttribute(appliesToTypeEClass, APPLIES_TO_TYPE__ANY);
		createEAttribute(appliesToTypeEClass, APPLIES_TO_TYPE__ANY_ATTRIBUTE);

		appliesToType1EClass = createEClass(APPLIES_TO_TYPE1);
		createEAttribute(appliesToType1EClass, APPLIES_TO_TYPE1__ANY);
		createEAttribute(appliesToType1EClass, APPLIES_TO_TYPE1__ANY_ATTRIBUTE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ALL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPLIES_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXACTLY_ONE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POLICY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POLICY_ATTACHMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POLICY_REFERENCE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__OPTIONAL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__POLICY_UR_IS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ALL1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPLIES_TO1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXACTLY_ONE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POLICY1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POLICY_ATTACHMENT1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POLICY_REFERENCE1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__OPTIONAL1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__POLICY_UR_IS1);

		operatorContentTypeEClass = createEClass(OPERATOR_CONTENT_TYPE);
		createEAttribute(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__GROUP);
		createEReference(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__POLICY);
		createEReference(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__ALL);
		createEReference(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__EXACTLY_ONE);
		createEReference(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__POLICY_REFERENCE);
		createEAttribute(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__ANY);

		operatorContentType1EClass = createEClass(OPERATOR_CONTENT_TYPE1);
		createEAttribute(operatorContentType1EClass, OPERATOR_CONTENT_TYPE1__GROUP);
		createEReference(operatorContentType1EClass, OPERATOR_CONTENT_TYPE1__POLICY);
		createEReference(operatorContentType1EClass, OPERATOR_CONTENT_TYPE1__ALL);
		createEReference(operatorContentType1EClass, OPERATOR_CONTENT_TYPE1__EXACTLY_ONE);
		createEReference(operatorContentType1EClass, OPERATOR_CONTENT_TYPE1__POLICY_REFERENCE);
		createEAttribute(operatorContentType1EClass, OPERATOR_CONTENT_TYPE1__ANY);

		policyAttachmentTypeEClass = createEClass(POLICY_ATTACHMENT_TYPE);
		createEReference(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__APPLIES_TO);
		createEAttribute(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__GROUP);
		createEReference(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__POLICY);
		createEReference(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE);
		createEAttribute(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__ANY);
		createEAttribute(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE);

		policyAttachmentType1EClass = createEClass(POLICY_ATTACHMENT_TYPE1);
		createEReference(policyAttachmentType1EClass, POLICY_ATTACHMENT_TYPE1__APPLIES_TO);
		createEAttribute(policyAttachmentType1EClass, POLICY_ATTACHMENT_TYPE1__GROUP);
		createEReference(policyAttachmentType1EClass, POLICY_ATTACHMENT_TYPE1__POLICY);
		createEReference(policyAttachmentType1EClass, POLICY_ATTACHMENT_TYPE1__POLICY_REFERENCE);
		createEAttribute(policyAttachmentType1EClass, POLICY_ATTACHMENT_TYPE1__ANY);
		createEAttribute(policyAttachmentType1EClass, POLICY_ATTACHMENT_TYPE1__ANY_ATTRIBUTE);

		policyReferenceTypeEClass = createEClass(POLICY_REFERENCE_TYPE);
		createEAttribute(policyReferenceTypeEClass, POLICY_REFERENCE_TYPE__DIGEST);
		createEAttribute(policyReferenceTypeEClass, POLICY_REFERENCE_TYPE__DIGEST_ALGORITHM);
		createEAttribute(policyReferenceTypeEClass, POLICY_REFERENCE_TYPE__URI);
		createEAttribute(policyReferenceTypeEClass, POLICY_REFERENCE_TYPE__ANY_ATTRIBUTE);

		policyReferenceType1EClass = createEClass(POLICY_REFERENCE_TYPE1);
		createEAttribute(policyReferenceType1EClass, POLICY_REFERENCE_TYPE1__DIGEST);
		createEAttribute(policyReferenceType1EClass, POLICY_REFERENCE_TYPE1__DIGEST_ALGORITHM);
		createEAttribute(policyReferenceType1EClass, POLICY_REFERENCE_TYPE1__URI);
		createEAttribute(policyReferenceType1EClass, POLICY_REFERENCE_TYPE1__ANY_ATTRIBUTE);

		policyTypeEClass = createEClass(POLICY_TYPE);
		createEAttribute(policyTypeEClass, POLICY_TYPE__ID);
		createEAttribute(policyTypeEClass, POLICY_TYPE__NAME);
		createEAttribute(policyTypeEClass, POLICY_TYPE__ANY_ATTRIBUTE);

		policyType1EClass = createEClass(POLICY_TYPE1);
		createEAttribute(policyType1EClass, POLICY_TYPE1__ID);
		createEAttribute(policyType1EClass, POLICY_TYPE1__NAME);
		createEAttribute(policyType1EClass, POLICY_TYPE1__ANY_ATTRIBUTE);

		// Create data types
		policyURIsTypeEDataType = createEDataType(POLICY_UR_IS_TYPE);
		policyURIsType1EDataType = createEDataType(POLICY_UR_IS_TYPE1);
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
		policyTypeEClass.getESuperTypes().add(this.getOperatorContentType());
		policyType1EClass.getESuperTypes().add(this.getOperatorContentType1());

		// Initialize classes and features; add operations and parameters
		initEClass(appliesToTypeEClass, AppliesToType.class, "AppliesToType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppliesToType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, AppliesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppliesToType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AppliesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appliesToType1EClass, AppliesToType1.class, "AppliesToType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppliesToType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, AppliesToType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppliesToType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AppliesToType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_All(), this.getOperatorContentType1(), null, "all", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AppliesTo(), this.getAppliesToType1(), null, "appliesTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExactlyOne(), this.getOperatorContentType1(), null, "exactlyOne", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Policy(), this.getPolicyType1(), null, "policy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PolicyAttachment(), this.getPolicyAttachmentType1(), null, "policyAttachment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PolicyReference(), this.getPolicyReferenceType1(), null, "policyReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Optional(), theXMLTypePackage.getBoolean(), "optional", "false", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PolicyURIs(), this.getPolicyURIsType1(), "policyURIs", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_All1(), this.getOperatorContentType(), null, "all1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AppliesTo1(), this.getAppliesToType(), null, "appliesTo1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExactlyOne1(), this.getOperatorContentType(), null, "exactlyOne1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Policy1(), this.getPolicyType(), null, "policy1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PolicyAttachment1(), this.getPolicyAttachmentType(), null, "policyAttachment1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PolicyReference1(), this.getPolicyReferenceType(), null, "policyReference1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Optional1(), theXMLTypePackage.getBoolean(), "optional1", "false", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PolicyURIs1(), this.getPolicyURIsType(), "policyURIs1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorContentTypeEClass, OperatorContentType.class, "OperatorContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatorContentType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OperatorContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorContentType_Policy(), this.getPolicyType(), null, "policy", null, 0, -1, OperatorContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorContentType_All(), this.getOperatorContentType(), null, "all", null, 0, -1, OperatorContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorContentType_ExactlyOne(), this.getOperatorContentType(), null, "exactlyOne", null, 0, -1, OperatorContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorContentType_PolicyReference(), this.getPolicyReferenceType(), null, "policyReference", null, 0, -1, OperatorContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatorContentType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, OperatorContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(operatorContentType1EClass, OperatorContentType1.class, "OperatorContentType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatorContentType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OperatorContentType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorContentType1_Policy(), this.getPolicyType1(), null, "policy", null, 0, -1, OperatorContentType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorContentType1_All(), this.getOperatorContentType1(), null, "all", null, 0, -1, OperatorContentType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorContentType1_ExactlyOne(), this.getOperatorContentType1(), null, "exactlyOne", null, 0, -1, OperatorContentType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorContentType1_PolicyReference(), this.getPolicyReferenceType1(), null, "policyReference", null, 0, -1, OperatorContentType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatorContentType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, OperatorContentType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(policyAttachmentTypeEClass, PolicyAttachmentType.class, "PolicyAttachmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyAttachmentType_AppliesTo(), this.getAppliesToType(), null, "appliesTo", null, 1, 1, PolicyAttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyAttachmentType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PolicyAttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyAttachmentType_Policy(), this.getPolicyType(), null, "policy", null, 0, -1, PolicyAttachmentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyAttachmentType_PolicyReference(), this.getPolicyReferenceType(), null, "policyReference", null, 0, -1, PolicyAttachmentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyAttachmentType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PolicyAttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyAttachmentType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PolicyAttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyAttachmentType1EClass, PolicyAttachmentType1.class, "PolicyAttachmentType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyAttachmentType1_AppliesTo(), this.getAppliesToType1(), null, "appliesTo", null, 1, 1, PolicyAttachmentType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyAttachmentType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PolicyAttachmentType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyAttachmentType1_Policy(), this.getPolicyType1(), null, "policy", null, 0, -1, PolicyAttachmentType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyAttachmentType1_PolicyReference(), this.getPolicyReferenceType1(), null, "policyReference", null, 0, -1, PolicyAttachmentType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyAttachmentType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PolicyAttachmentType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyAttachmentType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PolicyAttachmentType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyReferenceTypeEClass, PolicyReferenceType.class, "PolicyReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyReferenceType_Digest(), theXMLTypePackage.getBase64Binary(), "digest", null, 0, 1, PolicyReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyReferenceType_DigestAlgorithm(), theXMLTypePackage.getAnyURI(), "digestAlgorithm", "http://schemas.xmlsoap.org/ws/2004/09/policy/Sha1Exc", 0, 1, PolicyReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyReferenceType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 1, 1, PolicyReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyReferenceType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PolicyReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyReferenceType1EClass, PolicyReferenceType1.class, "PolicyReferenceType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyReferenceType1_Digest(), theXMLTypePackage.getBase64Binary(), "digest", null, 0, 1, PolicyReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyReferenceType1_DigestAlgorithm(), theXMLTypePackage.getAnyURI(), "digestAlgorithm", "http://schemas.xmlsoap.org/ws/2004/09/policy/Sha1Exc", 0, 1, PolicyReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyReferenceType1_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 1, 1, PolicyReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyReferenceType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PolicyReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyTypeEClass, PolicyType.class, "PolicyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PolicyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyType_Name(), theXMLTypePackage.getAnyURI(), "name", null, 0, 1, PolicyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PolicyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyType1EClass, PolicyType1.class, "PolicyType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PolicyType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyType1_Name(), theXMLTypePackage.getAnyURI(), "name", null, 0, 1, PolicyType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PolicyType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(policyURIsTypeEDataType, List.class, "PolicyURIsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(policyURIsType1EDataType, List.class, "PolicyURIsType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (appliesToTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AppliesTo_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAppliesToType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getAppliesToType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (appliesToType1EClass, 
		   source, 
		   new String[] {
			 "name", "AppliesTo_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAppliesToType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getAppliesToType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
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
		  (getDocumentRoot_All(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "All",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AppliesTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AppliesTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExactlyOne(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExactlyOne",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Policy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Policy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PolicyAttachment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolicyAttachment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PolicyReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolicyReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Optional(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Optional",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PolicyURIs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PolicyURIs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_All1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "All",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AppliesTo1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AppliesTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExactlyOne1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExactlyOne",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Policy1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Policy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PolicyAttachment1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolicyAttachment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PolicyReference1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolicyReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Optional1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Optional",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PolicyURIs1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PolicyURIs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (operatorContentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OperatorContentType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOperatorContentType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getOperatorContentType_Policy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Policy",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getOperatorContentType_All(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "All",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getOperatorContentType_ExactlyOne(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExactlyOne",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getOperatorContentType_PolicyReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolicyReference",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getOperatorContentType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "lax",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (operatorContentType1EClass, 
		   source, 
		   new String[] {
			 "name", "OperatorContentType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOperatorContentType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getOperatorContentType1_Policy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Policy",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getOperatorContentType1_All(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "All",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getOperatorContentType1_ExactlyOne(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExactlyOne",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getOperatorContentType1_PolicyReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolicyReference",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getOperatorContentType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "lax",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (policyAttachmentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PolicyAttachment_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPolicyAttachmentType_AppliesTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AppliesTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPolicyAttachmentType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getPolicyAttachmentType_Policy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Policy",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPolicyAttachmentType_PolicyReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolicyReference",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPolicyAttachmentType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getPolicyAttachmentType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":5",
			 "processing", "lax"
		   });		
		addAnnotation
		  (policyAttachmentType1EClass, 
		   source, 
		   new String[] {
			 "name", "PolicyAttachment_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPolicyAttachmentType1_AppliesTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AppliesTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPolicyAttachmentType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getPolicyAttachmentType1_Policy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Policy",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPolicyAttachmentType1_PolicyReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolicyReference",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPolicyAttachmentType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getPolicyAttachmentType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":5",
			 "processing", "lax"
		   });		
		addAnnotation
		  (policyReferenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PolicyReference_._1_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPolicyReferenceType_Digest(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Digest"
		   });		
		addAnnotation
		  (getPolicyReferenceType_DigestAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DigestAlgorithm"
		   });		
		addAnnotation
		  (getPolicyReferenceType_URI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "URI"
		   });		
		addAnnotation
		  (getPolicyReferenceType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (policyReferenceType1EClass, 
		   source, 
		   new String[] {
			 "name", "PolicyReference_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPolicyReferenceType1_Digest(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Digest"
		   });		
		addAnnotation
		  (getPolicyReferenceType1_DigestAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DigestAlgorithm"
		   });		
		addAnnotation
		  (getPolicyReferenceType1_URI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "URI"
		   });		
		addAnnotation
		  (getPolicyReferenceType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (policyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Policy_._1_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPolicyType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
		   });		
		addAnnotation
		  (getPolicyType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });		
		addAnnotation
		  (getPolicyType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (policyType1EClass, 
		   source, 
		   new String[] {
			 "name", "Policy_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPolicyType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
		   });		
		addAnnotation
		  (getPolicyType1_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });		
		addAnnotation
		  (getPolicyType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (policyURIsTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "PolicyURIs_._1_._type",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (policyURIsType1EDataType, 
		   source, 
		   new String[] {
			 "name", "PolicyURIs_._type",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });
	}

} //PolicyPackageImpl
