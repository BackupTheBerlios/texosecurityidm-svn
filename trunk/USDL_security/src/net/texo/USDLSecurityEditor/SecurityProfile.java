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
import java.util.Iterator;
import java.util.List;

import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.NodeIterator;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

import servicelevelmodule.SecurityActionType;
import servicelevelmodule.SecurityRequirementLevel;

public class SecurityProfile extends OWLOntology {
	
	SecurityOntology secOnt;
	
	private SecurityProfile(String url) {
		super(url);
	}


	/**
	 * Instantiates a new security profile.
	 *
	 * @param url the url
	 * @param secOnt the sec ont
	 */
	public SecurityProfile(String url, SecurityOntology secOnt) {
		super(url);
		this.secOnt = secOnt; 
	}

	
	public SecurityRequirementLevel getSecurityRequirementLevelOfInstance(String instanceName) {

		if (model == null) {
			return SecurityRequirementLevel.UNDEFINED;
		}

		// try to get instance with full uri
		Individual instance = model.getIndividual(instanceName);

		if (instance == null) {
			// try to get instance with short uri
			instance = model.getIndividual(getNS() + instanceName);
		}
		
		if (instance == null) {
			return SecurityRequirementLevel.UNDEFINED;
		}
		
        RDFNode level = instance.getPropertyValue(model.getProperty(secOnt.getNS() + "hasSecurityRequirementLevel"));

		if (level == null) {
			return SecurityRequirementLevel.UNDEFINED;
		}

        return SecurityOntology.getSecReqLvlByString(level.asNode().getLocalName());
	}

	
	public String getShortDescriptionOfInstance(String instanceName) {

		String shortDescr = getPropertyOfInstance(instanceName, "shortDescription");
		
		if (shortDescr == null) {
			return "";
		} else {
//			if (shortDescr.indexOf("^") > 0) {
//				return shortDescr.substring(0, shortDescr.indexOf("^"));
//			} else {
				return shortDescr;
			}
//		}
	}
	
	
	public SecurityActionType getSecurityActionTypeofInstance(String instanceName) {
		
		if (model == null) {
			return null;
		}

		// try to get instance with full uri
		Individual instance = model.getIndividual(instanceName);

		if (instance == null) {
			// try to get instance with short uri
			instance = model.getIndividual(getNS() + instanceName);
		}
		
		if (instance == null) {
			return SecurityActionType.UNDEFINED;
		}
		
		for (Iterator<SecurityActionType> i = SecurityActionType.VALUES.iterator(); i.hasNext();) {
			SecurityActionType actionType = i.next();
			String className = SecurityOntology.getOntClassNameBySecurityActionType(actionType);

			if (instance.hasOntClass(secOnt.getNS() + className)) {
				return actionType;
			}
		}
		
        return SecurityActionType.UNDEFINED;
	}

	
	public List<String> getInstancesOfSecurityAction(SecurityActionType actionType) {
		return getInstancesOfSecurityAction(actionType, false);
	}	
	
	
	public List<String> getInstancesOfSecurityAction(SecurityActionType actionType, boolean shortDescr) {
		
		List<String> list = new ArrayList<String>();
		
		if (model == null) {
			return list;
		}
		
	    OntClass mechanism = model.getOntClass(secOnt.getNS() + actionType.getName());
	    if (mechanism != null) {
	    	
	        for (ExtendedIterator<? extends OntResource> j = mechanism.listInstances(); j.hasNext(); ) {
	            OntResource instance = j.next();
	            if (shortDescr) {
	            	list.add(getShortDescriptionOfInstance(instance.getLocalName()));
	            } else {
	            	list.add(instance.getLocalName());
	            }
	        }
	    }

		return list;
	}

	
	public List<String> getInstancesOfSecurityAction(SecurityActionType actionType, SecurityRequirementLevel level) {
		return getInstancesOfSecurityAction(actionType, level, false);
	}	
		
	
	public List<String> getInstancesOfSecurityAction(SecurityActionType actionType, SecurityRequirementLevel level, boolean shortDescr) {

		List<String> list = new ArrayList<String>();
		
		if (model == null) {
			return list;
		}
		
	    OntClass mechanism = model.getOntClass(secOnt.getNS() + actionType.getName());
	    if (mechanism != null) {
	    	
	        for (ExtendedIterator<? extends OntResource> j = mechanism.listInstances(); j.hasNext(); ) {
	            OntResource instance = j.next();
	            RDFNode value = instance.getPropertyValue(model.getProperty(secOnt.getNS() + "hasSecurityRequirementLevel"));
	            
	            if (value == null) continue;
	            
	            if ((level == null) ||
	            	(value.asResource().getLocalName().equals(level.getName()))) {

		            if (shortDescr) {
		            	list.add(getShortDescriptionOfInstance(instance.getLocalName()));
		            } else {
		            	list.add(instance.getLocalName());
		            }
	            }
	    	}
	    }

		return list;
	}
	
	
	public String getPropertyOfInstance(String instanceName, String property) {
		
		if (model == null) {
			return null;
		}

		// try to get instance with full uri
		Individual instance = model.getIndividual(instanceName);

		if (instance == null) {
			// try to get instance with short uri
			instance = model.getIndividual(getNS() + instanceName);
		}
		
		if (instance == null) {
			return null;
		}
		
        RDFNode propertyValue = instance.getPropertyValue(model.getProperty(property));
		
		if (propertyValue == null) {
	        propertyValue = instance.getPropertyValue(model.getProperty(getNS() + property));
		}

		if (propertyValue == null) {
	        propertyValue = instance.getPropertyValue(model.getProperty(secOnt.getNS() + property));
		}
		
		if (propertyValue == null) {
			return null;
		}

		try {
			Node node = propertyValue.asNode();
			return node.getLocalName();
		} catch (Exception e) {
			try {
				Literal literal = propertyValue.asLiteral();
				return literal.toString();
			} catch (Exception E) {
				return null;
			}
		}
	}
	
	
	public List<String> getAllPropertiesOfInstance(String instanceName, String propertyName) {
		
		List<String> list = new ArrayList<String>();
		
		if (model == null) {
			return null;
		}

		// try to get instance with full uri
		Individual instance = model.getIndividual(instanceName);

		if (instance == null) {
			// try to get instance with short uri
			instance = model.getIndividual(getNS() + instanceName);
		}
		
		if (instance == null) {
			return null;
		}
		
		Property property = model.getProperty(propertyName);
		
		if (property == null) {
	        property = model.getProperty(getNS() + propertyName);
		}

		if (property == null) {
	        property = model.getProperty(secOnt.getNS() + propertyName);
		}
		
		if (property == null) {
			return null;
		}
			
		for (NodeIterator i = instance.listPropertyValues(property); i.hasNext();) {
			RDFNode propertyValue = i.next();
			list.add(propertyValue.asNode().getLocalName());
		}
		
        return list;
	}
	
	
	public List<String> retrieveExpressionLanguages() {
		
		List<String> list = new ArrayList<String>();
		
		if (model == null) {
			return null;
		}

		list.add("AccessControlExpressionLanguage#RBAC");
		list.add("AccessControlExpressionLanguage#ABAC");
		list.add("");
		
		return list;
	}
}
