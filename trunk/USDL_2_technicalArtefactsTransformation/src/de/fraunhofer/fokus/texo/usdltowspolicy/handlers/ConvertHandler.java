/**
 * This file is part of SecurityPolicyGenerator.
 * Copyright (c) 2011 Fraunhofer FOKUS. All Rights Reserved
 * Authors: Tom Sattler
 * 
 * SecurityPolicyGenerator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * SecurityPolicyGenerator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with SecurityPolicyGenerator.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * For more information, please contact Fraunhofer FOKUS at this
 * address: elankontakt [at] fokus [dot] fraunhofer [dot] de
 * http://www.fokus.fraunhofer.de
 */
package de.fraunhofer.fokus.texo.usdltowspolicy.handlers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.List;
import java.util.ResourceBundle;

import net.texo.USDLSecurityEditor.Activator;
import net.texo.USDLSecurityEditor.SecurityEditor;
import net.texo.USDLSecurityEditor.SecurityModel;
import net.texo.USDLSecurityEditor.SecurityOntology;
import net.texo.USDLSecurityEditor.SecurityProfile;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.File;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import servicelevelmodule.AuthorizationMechanism;
import servicelevelmodule.SecurityAction;
import servicelevelmodule.SecurityActionType;
import servicelevelmodule.SecurityAspect;
import servicelevelmodule.SecurityAspectType;
import servicelevelmodule.SecurityMechanism;

/**
 * 
 *
 */
@SuppressWarnings("restriction")
public class ConvertHandler extends AbstractHandler {

		
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ResourceBundle CONFIG = ResourceBundle.getBundle("config");
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil
				.getActiveMenuSelection(event);
		final Object firstElement = selection.getFirstElement();

		Thread t = new Thread(new LoadAction(((File) firstElement)
				.getWorkspace().getRoot()));
		t.start();

		String fileLoc = ((File) firstElement).getWorkspace().getRoot()
				.getLocation().toPortableString()
				+ ((File) firstElement).getFullPath().toPortableString();
		SecurityModel model = new SecurityModel(fileLoc);
		SecurityOntology secOnt = new SecurityOntology(CONFIG.getString("URL")
				+ CONFIG.getString("SECURITY_ONTOLOGY_URL"));
		SecurityProfile secProfile = new SecurityProfile(CONFIG.getString("URL")
					+ CONFIG.getString("SECURITY_PROFILE_URL"), secOnt);
		List<SecurityAspect> aspects = model.getSecurityAspects();

		String[] kindOfRegistrationInstance = null;
		String[] kindOfAuthenticationInstance = null;
		String messageAlgoSuite = "";
		String sts = "";
		String encryptElements = "";
		String signedElements = "";
		String secMessageLevel = "";
		String transLevel = "";
		String roleCondition = "";
		String authorizationLanguage = "";
		String[] roles = null;

		for (SecurityAspect sa : aspects) {
			List<SecurityAction> actions = sa.getRealizingActions();
			// System.out.println(actions);
			for (SecurityAction sm : actions) {
				if (sm instanceof SecurityMechanism) {
					List<String> secProList = secProfile
							.getInstancesOfSecurityAction(sm.getType(),
									((SecurityMechanism) sm).getLevel());
					if (sa.getType().equals(SecurityAspectType.IDENTIFIABILITY)) {
						if (sm.getType()
								.equals(SecurityActionType.REGISTRATION)
								&& secProList.size() > 0) {
							kindOfRegistrationInstance = new String[secProList
									.size()];
							for (int i = 0; i < secProList.size(); i++) {
								kindOfRegistrationInstance[i] = secProList
										.get(i);
								if (i == 0){
									sts = secProfile
											.getPropertyOfInstance(
													kindOfRegistrationInstance[i],CONFIG.getString("URL")+
													CONFIG.getString("SECURITY_PROFILE_URL")
															+ CONFIG.getString("STS_Attribute"));}
							}
						} else if (sm.getType().equals(
								SecurityActionType.AUTHENTICATION)
								&& secProList.size() > 0) {
							kindOfAuthenticationInstance = new String[secProList
									.size()];
							for (int i = 0; i < secProList.size(); i++)
								kindOfAuthenticationInstance[i] = secProList
										.get(i);
						}
					} else if (sa.getType().equals(
							SecurityAspectType.MESSAGE_SECURITY)) {
						secMessageLevel = sa.getLevel().getName();
						if (sm.getType().equals(SecurityActionType.ENCRYPTION)
								&& secProList.size() > 0) {
							encryptElements = secProfile
									.getPropertyOfInstance(
											secProList.get(0),CONFIG.getString("URL")+
											CONFIG.getString("SECURITY_PROFILE_URL")
													+ CONFIG.getString("RelatedToElements_Relationship"));
							if (encryptElements == null)
								encryptElements = "";
							messageAlgoSuite = secProfile
									.getPropertyOfInstance(
											secProList.get(0),CONFIG.getString("URL")+
											CONFIG.getString("SECURITY_PROFILE_URL")
													+ CONFIG.getString("AlgorithmSuite_Relationship"));
						} else if (sm.getType().equals(
								SecurityActionType.SIGNATURE)
								&& secProList.size() > 0) {
							signedElements = secProfile
									.getPropertyOfInstance(
											secProList.get(0),CONFIG.getString("URL")+
											CONFIG.getString("SECURITY_PROFILE_URL")
													+ CONFIG.getString("RelatedToElements_Relationship"));
							if (signedElements == null)
								signedElements = "";
						}
					} else if (sa.getType().equals(
							SecurityAspectType.TRANSPORT_SECURITY)) {
						if (sm.getType().equals(SecurityActionType.ENCRYPTION))
							transLevel = ((SecurityMechanism) sm).getLevel()
									.getName();
						// if
						// (sm.getType().equals(SecurityActionType.ENCRYPTION)&&
						// secProList.size() > 0)
						// transportSecurityInstance = secProList.get(0);
					}
				} else if (sm instanceof AuthorizationMechanism) {
					if (sa.getType().equals(
							SecurityAspectType.ACCESS_PROTECTION)) {
						if (sm.getType().equals(
								SecurityActionType.AUTHORIZATION)) {
							roleCondition = sm.getSecurityExpression()
									.getExpression();
							authorizationLanguage = sm.getSecurityExpression()
									.getLanguage();
						}
					}
				}
			}
		}

		boolean containsOR = roleCondition.contains(CONFIG
				.getString("OrOperator_XACML"));
		// || roleCondition.contains("or") || roleCondition.contains("Or");
		if (roleCondition.contains(CONFIG.getString("OrOperator_XACML")))
			roles = roleCondition.split(CONFIG.getString("OrOperator_XACML"));
		// else if (roleCondition.contains("Or"))
		// roles =roleCondition.split("Or");
		// else if (roleCondition.contains("or"))
		// roles =roleCondition.split("or");
		else if (roleCondition.contains(CONFIG.getString("AndOperator_XACML")))
			roles = roleCondition.split(CONFIG.getString("AndOperator_XACML"));
		// else if (roleCondition.contains("And"))
		// roles =roleCondition.split("And");
		// else if (roleCondition.contains("and"))
		// roles =roleCondition.split("and");

		// for (String role : roles)
		// role= role.replace(" ", "");

		if (!roleCondition.equals("") && roles == null)
			roles = new String[] { roleCondition };

		if (roles == null)
			roles = new String[] {};

		String fileName = ((File) firstElement).getFullPath()
				.toPortableString();
		PrintWriter out = null;
		PrintWriter out2 = null;
		try {
			out = new PrintWriter(new FileWriter(((File) firstElement)
					.getWorkspace().getRoot().getLocation().toPortableString()
					+ fileName.substring(0, fileName.lastIndexOf("."))
					+ ".policy"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		SAXBuilder builder = new SAXBuilder();
		Document policy = null;
		try {
			policy = builder
					.build(new StringReader(
							getPolicyString(CONFIG.getString("URL")
									+ CONFIG.getString("SECURITY_PROFILE_URL"),
									fileName.split("\\.")[0].split("\\/")[fileName
									   .split("\\.")[0].split("\\/").length - 1],
									secMessageLevel.equalsIgnoreCase("NONE")
											|| secMessageLevel.equalsIgnoreCase("UNDEFINED") ? false
											: true,
									transLevel.equalsIgnoreCase("NONE")
											|| secMessageLevel.equalsIgnoreCase("UNDEFINED") ? false
											: true, encryptElements,
									signedElements, kindOfRegistrationInstance,
									kindOfAuthenticationInstance,
									messageAlgoSuite, sts)));
			new XMLOutputter(Format.getPrettyFormat()).output(policy, out);
		} catch (JDOMException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// out.print(getPolicyString(fileName, symmetric,
		// secMessageLevel.equalsIgnoreCase("NONE")? false : asymmetric,
		// transLevel.equalsIgnoreCase("NONE") ? false : true,
		// encryptElements,signedElements, kindOfRegistrationInstance,
		// kindOfAuthenticationInstance, messageAlgoSuite, sts));
		out.close();

		try {
			out2 = new PrintWriter(new FileWriter(((File) firstElement)
					.getWorkspace().getRoot().getLocation().toPortableString()
					+ fileName.substring(0, fileName.lastIndexOf("."))
					+ ".xacml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		builder = new SAXBuilder();
		Document xacml = null;
		if (!roleCondition.equalsIgnoreCase("")
				&& !authorizationLanguage.equalsIgnoreCase(""))
			try {
				xacml = builder
						.build(new StringReader(
								XacmlTemplates.GETXACML((CONFIG.getString("URL")
										+ CONFIG.getString("SECURITY_PROFILE_URL").replace(".", ":").replace("http://", "urn:")),
										fileName.split("\\.")[0].split("\\/")[fileName
												.split("\\.")[0].split("\\/").length - 1],
										roleCondition,
										containsOR,
										roles,
										authorizationLanguage.contains("RBAC") ? "RBAC"
												: (authorizationLanguage
														.contains("ABAC") ? "ABAC"
														: ""))));
				new XMLOutputter(Format.getPrettyFormat()).output(xacml, out2);
			} catch (JDOMException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		// out2.print(XacmlSchnipsel.GETXACML());
		out2.close();

		// try {
		// ((File)firstElement).getWorkspace().getRoot().getProject().refreshLocal(IResource.DEPTH_INFINITE,
		// null);
		// } catch (CoreException e1) {
		// e1.printStackTrace();
		// }
		return null;
	}

	private String getPolicyString(String profile_url, String id, boolean asymmetric_symmetric,
			boolean transport, String encryption,
			String signature, String[] kindOfRegistration,
			String[] kindOfAuthentication, String messageIntegrityInstance,
			String sts) {
		String secPolicy = PolicyTemplates.getPOLICYBEGIN(profile_url,id)
				+ PolicyTemplates.getBINDING(asymmetric_symmetric, transport,
						messageIntegrityInstance)
				+ PolicyTemplates.getENCRYPTEDELEMENTS(encryption)
				+ PolicyTemplates.getSIGNEDELEMENTS(signature)
				+ PolicyTemplates.getSUPPORTINGTOKEN(profile_url, kindOfRegistration,
						kindOfAuthentication, sts) + PolicyTemplates.getPOLICYEND();
		return secPolicy;
	}

}
