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
package org.xmlsoap.schemas.ws._2004._09.wspolicy.presentation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot;

/**
 * The WSPolicyPage is separated in following three sections: Identifiablity,
 * MessageSecurity, TransportSecurity.
 * It visualizes the xml serialization of a policy.
 * @author tos
 *
 */
public class WSPolicyPage extends FormPage{

	private ScrolledForm form;
	private FormToolkit toolkit;
	private DocumentRoot documentRoot;
	private ReflectiveItemProvider reflProvider;
	private Section[] sections;
	private EcoreResourceHelper erh;
	public final String PLUGIN_ID = "de.fraunhofer.fokus.texo.ws.editor"; //$NON-NLS-1$


	
	public WSPolicyPage(PolicyEditor editor, DocumentRoot documentRoot, ReflectiveItemProvider reflProvider) {
		super(editor, "ws_security_policies__id", "WS-Security Policies");
		this.documentRoot = documentRoot;
		this.reflProvider = reflProvider;
		erh = new EcoreResourceHelper(this.reflProvider);
	}
	
	@Override
	protected void createFormContent(IManagedForm managedForm) {

		sections = new Section[3];
		
		form = managedForm.getForm();
		toolkit = managedForm.getToolkit();
		
//		WSPolicyToolkit.createFormActions(this, form.getToolBarManager());

		
		form.setText("WS-Security Policies");
		toolkit.decorateFormHeading(form.getForm());
		
		GuiBuilderToolkit.createFormLayout(form.getBody());
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		String xmlResource = "";
		try {
			((Resource)documentRoot.eResource()).save(os, null);
			xmlResource = new String(os.toByteArray(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String text = "";
		
		//Identifiability
		
		
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS);
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS);
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS);
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS);
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS);
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__SUPPORTING_TOKENS, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__SUPPORTING_TOKENS);
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS);
		
		String f= "</"+ _200702Package.eNS_PREFIX + ":" +  text + ">";
		
		String shownText = !text.equals("") ? xmlResource.substring(xmlResource.indexOf(text)-4,
				xmlResource.lastIndexOf(f)+ f.length()): "";
		
		sections[0] = FieldBuilder.createSection("Identifiability", toolkit, form.getBody(), shownText, 800, 300, new TextModifyListener((PolicyEditor)getEditor()));
		
		Control[] controls = ((Composite)sections[0].getClient()).getChildren();
		if (controls[0] instanceof StyledText){
			StyledTextCustomizer stc = new StyledTextCustomizer((StyledText)controls[0]);	
			stc.customizeText(new String[]{"<idm:Attribute"});	
		}
		
		
		//MessageSecurity
		text = "";
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__SYMMETRIC_BINDING, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__SYMMETRIC_BINDING);
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__ASYMMETRIC_BINDING, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__ASYMMETRIC_BINDING);
		shownText = "";
		f= "</"+ _200702Package.eNS_PREFIX + ":" +  text + ">";
		shownText = !text.equals("") ? xmlResource.substring(xmlResource.indexOf(text)-4,
				xmlResource.lastIndexOf(f)+ f.length()): "";
		
		text = "";
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_PARTS, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_PARTS);
		f= "</"+ _200702Package.eNS_PREFIX + ":" +  text + ">";
		
		shownText += "\n\t\t" + (!text.equals("") ? xmlResource.substring(xmlResource.indexOf(text)-4,
				xmlResource.lastIndexOf(f)+ f.length()): "");
		
		text = "";
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__SIGNED_PARTS, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_PARTS);
		f= "</"+ _200702Package.eNS_PREFIX + ":" +  text + ">";
		
		shownText += "\n\t\t" + (!text.equals("") ? xmlResource.substring(xmlResource.indexOf(text)-4,
				xmlResource.lastIndexOf(f)+ f.length()): "");
		
		sections[1] = FieldBuilder.createSection("MessageSecurity", toolkit, form.getBody(), shownText, 800, 300,new TextModifyListener((PolicyEditor)getEditor()));
		
		controls = ((Composite)sections[1].getClient()).getChildren();
		if (controls[0] instanceof StyledText){
			StyledTextCustomizer stc = new StyledTextCustomizer((StyledText)controls[0]);	
			stc.customizeText(new String[]{"<sp:EncryptedParts", "</sp:EncryptedParts", "<sp:SignedParts", "</sp:SignedParts", "<sp:AlgorithmSuite", "</sp:AlgorithmSuite"});
		}
		
		
		//TransportSecurity
		text = "";
		if (erh.hasEObject(erh.getElements(documentRoot), _200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_BINDING, false))
			text = ExtendedMetaData.INSTANCE.getName(_200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_BINDING);
		
		f= "</"+ _200702Package.eNS_PREFIX + ":" +  text + ">";
		
		sections[2] = FieldBuilder.createSection("TransportSecurity", toolkit, form.getBody(), !text.equals("") ? xmlResource.substring(xmlResource.indexOf(text)-4,
				xmlResource.lastIndexOf(f)+ f.length()) : "", 800, 300, new TextModifyListener((PolicyEditor)getEditor()));
		GuiBuilderToolkit.createSpacer(form.getBody(), 4);
		GuiBuilderToolkit.createSpacer(form.getBody(), 4);
		
	}
	
	public Section[] getSections(){
		return sections;
	}
	
	

}
