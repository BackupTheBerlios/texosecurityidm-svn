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
package test;

import servicelevelmodule.SecurityActionType;
import servicelevelmodule.SecurityRequirementLevel;
import net.texo.USDLSecurityEditor.SecurityOntology;
import net.texo.USDLSecurityEditor.SecurityProfile;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelTest.
 */
public class ModelTest {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		SecurityOntology secOnt = new SecurityOntology("http://www.fokus.fraunhofer.de/texo/ontologies/security.owl");
        SecurityProfile secProfile = new SecurityProfile("http://www.fokus.fraunhofer.de/texo/ontologies/security_profile.owl", secOnt);

//        SecurityModel model = new SecurityModel("test/RechnungspruefDienst.usdl3");
        
//        List<SecurityAspect> aspects = model.getSecurityAspects();
        
        String[] kindOfRegistrationInstance = null;
        String[] kindOfAuthenticationInstance = null;
        String messageAlgoSuite = "";
        String transportSecurityInstance = "";
        String sts = "";
        String encryptElements = "";
        String signedElements = "";
        boolean symmetric = false;
        boolean asymmetric = true;

		System.out.println(secProfile.getShortDescriptionOfInstance("SmartcardAuthN_X509v3_Smartcard"));
		System.out.println(secProfile.getInstancesOfSecurityAction(SecurityActionType.AUTHENTICATION));
		System.out.println(secProfile.getInstancesOfSecurityAction(SecurityActionType.AUTHENTICATION, SecurityRequirementLevel.MEDIUM));
		System.out.println(secProfile.getInstancesOfSecurityAction(SecurityActionType.AUTHENTICATION, true));
		System.out.println(secProfile.getInstancesOfSecurityAction(SecurityActionType.AUTHENTICATION, SecurityRequirementLevel.MEDIUM, true));

//        System.out.println(secProfile.getInstancesOfSecurityAction(SecurityActionType.ENCRYPTION));
//        System.out.println(secProfile.getInstancesOfSecurityAction((SecurityActionType.ENCRYPTION), SecurityRequirementLevel.NONE));
//        System.out.println(secProfile.getInstancesOfSecurityAction((SecurityActionType.ENCRYPTION), SecurityRequirementLevel.LOW));
//        System.out.println(secProfile.getInstancesOfSecurityAction((SecurityActionType.ENCRYPTION), SecurityRequirementLevel.MEDIUM));
//        System.out.println(secProfile.getInstancesOfSecurityAction((SecurityActionType.ENCRYPTION), SecurityRequirementLevel.HIGH));
//        System.out.println(secProfile.getInstancesOfSecurityAction((SecurityActionType.ENCRYPTION), SecurityRequirementLevel.UNDEFINED));
        
        /*
        for (SecurityAspect sa : aspects){
              List<SecurityAction> actions = sa.getRealizingActions();               
              System.out.println(actions);
              for (SecurityAction sm: actions){
                    if (sm instanceof SecurityMechanism){
                         List<String> secProList = secProfile.getInstancesOfSecurityAction(sm.getType()); //, ((SecurityMechanism)sm).getLevel());
                         if (sa.getType().equals(SecurityAspectType.IDENTIFIABILITY)){
                               if (sm.getType().equals(SecurityActionType.REGISTRATION)&& secProList.size() > 0){
                                     kindOfRegistrationInstance = new String[secProList.size()];
                                     for (int i = 0; i < secProList.size(); i++){
                                           kindOfRegistrationInstance[i] = secProList.get(i);
                                           if (i == 0)
                                                 sts = secProfile.getPropertyOfInstance(kindOfRegistrationInstance[i], "http://www.fokus.fraunhofer.de/texo/ontologies/security_profile.owl#STS_Adress");
                                     }
                               }
                               else if (sm.getType().equals(SecurityActionType.AUTHENTICATION)&& secProList.size() > 0){
                                     kindOfAuthenticationInstance = new String[secProList.size()];
                                     for (int i = 0; i < secProList.size(); i++)
                                           kindOfAuthenticationInstance[i] = secProList.get(i);
                               }
                         } else if (sa.getType().equals(SecurityAspectType.MESSAGE_SECURITY)){
                               if (sm.getType().equals(SecurityActionType.ENCRYPTION)){
                                     encryptElements = secProfile.getPropertyOfInstance("http://www.fokus.fraunhofer.de/texo/ontologies/security_profile.owl#messageEncryptionWithAlgSuiteBasic192",
                                                 "http://www.fokus.fraunhofer.de/texo/ontologies/security_profile.owl#isRelatedTo");
                                     if (encryptElements == null)
                                           encryptElements = "";
                                     messageAlgoSuite = secProfile.getPropertyOfInstance("http://www.fokus.fraunhofer.de/texo/ontologies/security_profile.owl#messageEncryptionWithAlgSuiteBasic192",
                                                 "http://www.fokus.fraunhofer.de/texo/ontologies/security_profile.owl#hasAlgorithmSuite");
                               } else if (sm.getType().equals(SecurityActionType.SIGNATURE)){
                                     signedElements = secProfile.getPropertyOfInstance("http://www.fokus.fraunhofer.de/texo/ontologies/security_profile.owl#noMessageSignature",
                                     "http://www.fokus.fraunhofer.de/texo/ontologies/security_profile.owl#isRelatedTo");
                                     if (signedElements == null)
                                           signedElements = "";
                               }
                         } else if (sa.getType().equals(SecurityAspectType.TRANSPORT_SECURITY)) {
                               if (sm.getType().equals(SecurityActionType.ENCRYPTION)&& secProList.size() > 0)
                                     transportSecurityInstance = secProList.get(0);
                         }
                    }
              }
        }
        */
	}

}
