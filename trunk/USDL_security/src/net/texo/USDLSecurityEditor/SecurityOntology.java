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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.ontology.UnionClass;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

import servicelevelmodule.AuthorizationMechanismType;
import servicelevelmodule.SecurityAspectType;
import servicelevelmodule.SecurityActionType;
import servicelevelmodule.SecurityRequirementLevel;


public class SecurityOntology extends OWLOntology {

	private String involvesPropertyName = "involvesSecurityMechanisms";
	
	private static Map<String, SecurityAspectType> secOntClassToSecAspectType = new HashMap<String, SecurityAspectType>();
	private static Map<String, SecurityActionType> secOntClassToSecActionType = new HashMap<String, SecurityActionType>();
	public static  Map<SecurityAspectType, List<SecurityActionType>> secAspectToSecMechanisms = new HashMap<SecurityAspectType, List<SecurityActionType>>();
	
	
	/**
	 * Instantiates a new security ontology.
	 *
	 * @param url the url
	 */
	public SecurityOntology(String url) {
		super(url);
		
		// configuration TODO
		
		// owl classes -> ecore classes for aspects
		secOntClassToSecAspectType.put("Identifiability", SecurityAspectType.IDENTIFIABILITY);
		secOntClassToSecAspectType.put("AccessProtection", SecurityAspectType.ACCESS_PROTECTION);
		secOntClassToSecAspectType.put("MessageSecurity", SecurityAspectType.MESSAGE_SECURITY);
		secOntClassToSecAspectType.put("TransportSecurity", SecurityAspectType.TRANSPORT_SECURITY);
		secOntClassToSecAspectType.put("NonRepudiation", SecurityAspectType.NON_REPUDATION);

		// owl classes -> ecore classes for mechanisms
		secOntClassToSecActionType.put("Authentication", SecurityActionType.AUTHENTICATION);
		secOntClassToSecActionType.put("Registration", SecurityActionType.REGISTRATION);
		secOntClassToSecActionType.put("Authorization", SecurityActionType.AUTHORIZATION);
		secOntClassToSecActionType.put("Signature", SecurityActionType.SIGNATURE);
		secOntClassToSecActionType.put("Encryption", SecurityActionType.ENCRYPTION);

		// map aspects -> {supported mechanisms}
		
		OntProperty involves = model.getOntProperty(getNS() + involvesPropertyName);
		
		if (involves == null) return;
		
		for (ExtendedIterator<? extends OntProperty> it = involves.listSubProperties(); it.hasNext(); ) {
			OntProperty subproperty = it.next();
			OntClass domain = subproperty.listDomain().next().asClass();
			OntClass range = subproperty.listRange().next().asClass(); 

			SecurityAspectType sa = secOntClassToSecAspectType.get(domain.getLocalName());
			
			if (range.isAnon()) {
				List<SecurityActionType> smlist = new ArrayList<SecurityActionType>();
				UnionClass union = range.asClass().asUnionClass();
				for (ExtendedIterator<? extends OntClass> op = union.listOperands(); op.hasNext();) {
					OntClass sub = op.next();
					SecurityActionType sm = secOntClassToSecActionType.get(sub.getLocalName());
					smlist.add(sm);
				}
				secAspectToSecMechanisms.put(sa, smlist);
			} else {
				SecurityActionType sm = secOntClassToSecActionType.get(range.getLocalName());
				List<SecurityActionType> smlist = new ArrayList<SecurityActionType>();
				smlist.add(sm);
				secAspectToSecMechanisms.put(sa, smlist);
			}
		}
	}
	
	
	public List<SecurityActionType> getSupportingSecurityActionTypes(SecurityAspectType type) {
		List<SecurityActionType> list = secAspectToSecMechanisms.get(type);
		
		if (list == null) {
			list = new ArrayList<SecurityActionType>();
		}

		return list;
	}

	
	public static SecurityRequirementLevel getSecReqLvlByString(String name) {

		for (Iterator<SecurityRequirementLevel> i = SecurityRequirementLevel.VALUES.iterator(); i.hasNext();) {
			SecurityRequirementLevel level = i.next();
			if (level.getName().equals(name)) {
				return level;
			}
		}
		
		return SecurityRequirementLevel.UNDEFINED;
	}


	public static SecurityActionType getActionTypeByString(String name) {
		SecurityActionType actionType = secOntClassToSecActionType.get(name);
		
		if (actionType == null) 
			return SecurityActionType.OTHER;
		else 
			return actionType;
	}
	
	
	public static String getOntClassNameBySecurityActionType(SecurityActionType actionType) {
		
		for (Iterator<String> i = secOntClassToSecActionType.keySet().iterator(); i.hasNext();) {
			String className = i.next();
			
			if (secOntClassToSecActionType.get(className).equals(actionType))
				return className;
		}
		
		return null;
	}

	
	public static AuthorizationMechanismType getAuthZMechTypeByString(String name) {
		for (Iterator<AuthorizationMechanismType> i = AuthorizationMechanismType.VALUES.iterator(); i.hasNext();) {
			AuthorizationMechanismType type = i.next();
			if (type.getName().equals(name)) {
				return type;
			}
		}
		
		return AuthorizationMechanismType.OTHER;
	}
}
