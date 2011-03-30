/**
* This file is part of net.texo.idm.USDLSecurityEditor.
* Copyright (c) 2011 Fraunhofer FOKUS. All Rights Reserved
* Authors: rda
* 
 * net.texo.idm.USDLSecurityEditor is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* any later version.

* net.texo.idm.USDLSecurityEditor is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero General Public License for more details.
* 
 * You should have received a copy of the GNU Affero General Public License
* along with net.texo.idm.USDLSecurityEditor.  If not, see <http://www.gnu.org/licenses/>.
* 
 * For more information, please contact Fraunhofer FOKUS at this
* address: elankontakt [at] fokus [dot] fraunhofer [dot] de
* http://www.fokus.fraunhofer.de
*/

package net.texo.USDLSecurityEditor;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import com.sap.usdl3.xml.USDL3ModelXMLFactory;

import foundation.ExpressionElement;
import foundation.FoundationFactory;
import foundation.impl.FoundationPackageImpl;

import servicelevelmodule.Security;
import servicelevelmodule.SecurityAction;
import servicelevelmodule.SecurityAspect;
import servicelevelmodule.SecurityAspectType;
import servicelevelmodule.SecurityMechanism;
import servicelevelmodule.SecurityActionType;
import servicelevelmodule.SecurityRequirementLevel;
import servicelevelmodule.ServiceLevel;
import servicelevelmodule.ServiceLevelElement;
import servicelevelmodule.ServiceLevelProfile;
import servicelevelmodule.ServicelevelmoduleFactory;
import servicelevelmodule.impl.ServicelevelmodulePackageImpl;
import servicemodule.ServiceWrapper;
import usdl3.ServiceDescription;

public class SecurityModel {

	ServiceDescription serviceDescription;
	File usdlFile = null;

	
	public SecurityModel() {
		ServicelevelmodulePackageImpl.init();
		FoundationPackageImpl.init();
	}

	
	/**
	 * Instantiates a new security model.
	 *
	 * @param input the input
	 */
	public SecurityModel(String input) {
		loadUSDL(input);
	}
	
	
	public void loadUSDL(String input) {
//		System.out.println("loading file " + input);
		
		// the file that holds the USDLv3 document
		usdlFile = new File(input);

		// de-serialize the XML in the file into Ecore
		serviceDescription = (ServiceDescription) USDL3ModelXMLFactory
		        .getInstance().loadUSDL3(usdlFile.getAbsolutePath());
	}
	
	
	public void saveUSDL() {
		USDL3ModelXMLFactory.getInstance().saveUSDL3(serviceDescription, usdlFile.getAbsolutePath());
	}

	
	public List<SecurityAspect> getSecurityAspects() {
		
		List<SecurityAspect> list = new ArrayList<SecurityAspect>();
		
		ServiceWrapper s = serviceDescription.getService();
		ServiceLevelElement sle = s.getServiceLevelElements();
		EList<ServiceLevelProfile> slps = sle.getServiceLevelProfiles();
		ServiceLevelProfile slp = slps.get(0);
		EList<ServiceLevel> sls = slp.getServiceLevels();
		ServiceLevel sl = sls.get(0);
		
		for (TreeIterator<EObject> i = sl.eAllContents(); i.hasNext();) {
			EObject o = i.next();
			
			if (o instanceof SecurityAspect) {
				list.add((SecurityAspect)o);
			}
		}

		return list;
	}

	
	public SecurityAspect getSecurityAspect(SecurityAspectType type) {

		ServicelevelmoduleFactory factory = ServicelevelmoduleFactory.eINSTANCE;
		
		ServiceWrapper s = serviceDescription.getService();
		ServiceLevelElement sle = s.getServiceLevelElements();
		EList<ServiceLevelProfile> slps = sle.getServiceLevelProfiles();
		ServiceLevelProfile slp = slps.get(0);
		EList<ServiceLevel> sls = slp.getServiceLevels();
		Security securitySL = null;
		for (Iterator<ServiceLevel> i = sls.iterator(); i.hasNext();) {
			ServiceLevel sl = i.next();
			
			if (sl instanceof Security) securitySL = (Security)sl;
		}

		if (securitySL == null) {
			securitySL = factory.createSecurity();
			sls.add(securitySL);
		}
		
		EList<SecurityAspect> sas = securitySL.getSecurityAttributes();
		for (Iterator<SecurityAspect> i = sas.iterator(); i.hasNext();) {
			SecurityAspect sa = i.next();
			
			if (sa.getType() == type) {
				return sa;
			}
		}

		// security aspect is not mentioned in usdl,
		// however one has to create it in order to display it in the editor

		SecurityAspect secAspect = factory.createSecurityAspect();
		secAspect.setLevel(SecurityRequirementLevel.UNDEFINED);
		secAspect.setType(type);
		sas.add(secAspect);
		
		return secAspect;
	}

	
	public SecurityAction getRealizingAction(SecurityAspectType aspectType, SecurityActionType actionType) {

		SecurityAspect aspect = getSecurityAspect(aspectType);
		
		for (Iterator<SecurityAction> i = aspect.getRealizingActions().iterator(); i.hasNext();) {
			SecurityAction action = (SecurityAction)i.next();
			if (action.getType() == actionType) {
				return action;
			}
		}
		
		// security mechanism is not mentioned in usdl,
		// however one has to create it in order to display it in the editor

		ServicelevelmoduleFactory factory = ServicelevelmoduleFactory.eINSTANCE;
		SecurityAction secAction;
		EList<SecurityAction> actionList = aspect.getRealizingActions();

		if (actionType == SecurityActionType.AUTHORIZATION) {
			secAction = factory.createAuthorizationMechanism();
		} else {
			secAction = factory.createSecurityMechanism();
			((SecurityMechanism)secAction).setLevel(SecurityRequirementLevel.UNDEFINED);
		}
		secAction.setType(actionType);
		actionList.add(secAction);
		
		return secAction;
	}

	
	public void setSecurityExpression(SecurityAspectType aspectType, SecurityActionType secActionType,
			String expression, String language) {

		FoundationFactory factory = FoundationFactory.eINSTANCE;
		SecurityAction secAction = getRealizingAction(aspectType, secActionType);
		ExpressionElement expressionElement = factory.createExpressionElement();

		expressionElement.setExpression(expression);
		expressionElement.setLanguage(language);
		secAction.setSecurityExpression(expressionElement);
	}

	
	public void setSecurityExpressionForSecurityAction(SecurityAction action, String expression, String language) {

		FoundationFactory factory = FoundationFactory.eINSTANCE;
		ExpressionElement expressionElement = factory.createExpressionElement();

		expressionElement.setExpression(expression);
		expressionElement.setLanguage(language);
		action.setSecurityExpression(expressionElement);
	}
}
