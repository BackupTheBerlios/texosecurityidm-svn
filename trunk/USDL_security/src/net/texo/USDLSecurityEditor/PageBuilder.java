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

import net.texo.USDLSecurityEditor.listener.AuthZExprLangListener;
import net.texo.USDLSecurityEditor.listener.AuthZExpressionListener;
import net.texo.USDLSecurityEditor.listener.AuthZMechanismListener;
import net.texo.USDLSecurityEditor.listener.ReqLevelForActionListener;
import net.texo.USDLSecurityEditor.listener.ReqLevelForAspectListener;
import net.texo.USDLSecurityEditor.proxies.AuthZMechanismProxy;
import net.texo.USDLSecurityEditor.proxies.SecurityAspectProxy;
import net.texo.USDLSecurityEditor.proxies.SecurityActionProxy;
import net.texo.USDLSecurityEditor.proxies.SecurityMechanismProxy;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.RowLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import servicelevelmodule.AuthorizationMechanism;
import servicelevelmodule.AuthorizationMechanismType;
import servicelevelmodule.SecurityAction;
import servicelevelmodule.SecurityActionType;
import servicelevelmodule.SecurityAspect;
import servicelevelmodule.SecurityAspectType;
import servicelevelmodule.SecurityMechanism;
import servicelevelmodule.SecurityRequirementLevel;

// TODO: Auto-generated Javadoc
/**
 * The Class PageBuilder.
 */
public class PageBuilder {

	/** The sec ont. */
	SecurityOntology secOnt = null;
	
	/** The sec profile. */
	SecurityProfile secProfile = null;
	
	/** The editor. */
	SecurityEditor editor = null;
	
	/** The page. */
	IFormPage page = null;
	
	/** The toolkit. */
	FormToolkit toolkit = null;

	/** The Constant colors. */
	public static final int colors[][][] = new int[][][] {
		{/* technical colors: */{ 0, 25, 51 }, { 130, 151, 182 },
				{ 60, 60, 60 }, { 0, 0, 0 } },
		{/* operational colors: */{ 120, 80, 0 }, { 250, 220, 130 },
				{ 60, 60, 60 }, { 0, 0, 0 } },
		{/* business colors: */{ 60, 0, 0 }, { 220, 160, 160 },
				{ 60, 60, 60 }, { 0, 0, 0 } },
		{/* default colors: */{ 181, 189, 210 }, { 233, 236, 242 },
				{ 31, 62, 94 }, { 120, 139, 158 } },
		{/* marked colors: */{ 80, 130, 80 }, { 150, 200, 140 },
				{ 60, 60, 60 }, { 0, 0, 0 } } };
	
	/** The Constant EDGE. */
	public static final int EDGE = 0;
	
	/** The Constant FILL. */
	public static final int FILL = 1;
	
	/** The Constant FONT_NORMAL. */
	public static final int FONT_NORMAL = 2;
	
	/** The Constant FONT_HOVER. */
	public static final int FONT_HOVER = 3;
	
	/** The Constant RED. */
	private static final int RED = 0;
	
	/** The Constant GREEN. */
	private static final int GREEN = 1;
	
	/** The Constant BLUE. */
	private static final int BLUE = 2;
	
	/** The Constant DEFAULT. */
	private static final int DEFAULT = 3;


	/**
	 * Change page.
	 */
	public void changePage(){
		page.getManagedForm().getForm().layout();
		page.getManagedForm().reflow(true);
	}

	
	/**
	 * Gets the color.
	 *
	 * @param key the key
	 * @param device the device
	 * @param colorType the color type
	 * @return the color
	 */
	public static Color getColor(int key, Device device, int colorType) {
		
		if (key == -1) {
			return new Color(device, colors[DEFAULT][colorType][RED],
					colors[DEFAULT][colorType][GREEN],
					colors[DEFAULT][colorType][BLUE]);
		} else {
			return new Color(device, colors[key][colorType][RED],
					colors[key][colorType][GREEN],
					colors[key][colorType][BLUE]);
		}
	}


	/**
	 * Color section.
	 *
	 * @param key the key
	 * @param section the section
	 */
	public static void colorSection(int key, final Section section) {
		Display dis = section.getDisplay();
		section.setTitleBarBackground(getColor(key, dis, FILL));
		section.setTitleBarBorderColor(getColor(key, dis, EDGE));
		section.setTitleBarForeground(getColor(key, dis, FONT_NORMAL));
		section.setToggleColor(getColor(key, dis, FONT_NORMAL));
		section.setActiveToggleColor(getColor(key, dis, FONT_HOVER));
	}

	
	/**
	 * Creates the security mechanism group.
	 *
	 * @param parent the parent
	 * @param aspect the aspect
	 * @param action the action
	 * @return the group
	 */
	public Group createSecurityMechanismGroup(
			final Composite parent,
			final SecurityAspect aspect,
			final SecurityMechanism action) {
		
		if (parent == null) return null;
		if (aspect == null) return null;
		if (action == null) return null;

		Group gAction = new Group(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(gAction);
		gAction.setText(action.getType().getLiteral());

		Font font = gAction.getFont();
		FontData[] fd = font.getFontData();
		for (int i = 0; i < fd.length; ++i) {
			fd[i].setStyle(SWT.BOLD);			
		}
		Font newFont = new Font(parent.getDisplay(), fd);
		gAction.setFont(newFont);
		
		toolkit.createLabel(gAction, "Requirement Level: ");
		Composite cReqLvlMarker = toolkit.createComposite(gAction);
		RowLayoutFactory.swtDefaults().applyTo(cReqLvlMarker);
		
		ComboViewer cvReqLevel = new ComboViewer(cReqLvlMarker, SWT.READ_ONLY);
		cvReqLevel.setContentProvider(ArrayContentProvider.getInstance());
		ArrayList<String> list = new ArrayList<String>();
		for(Iterator<SecurityRequirementLevel> j = SecurityRequirementLevel.VALUES.iterator(); j.hasNext();) {
			list.add(j.next().getLiteral());
		}
		cvReqLevel.setInput(list);
		cvReqLevel.addSelectionChangedListener(new ReqLevelForActionListener(editor, aspect, action));
		cvReqLevel.setSelection(new StructuredSelection(((SecurityMechanism)editor.model.getRealizingAction(aspect.getType(), action.getType())).getLevel().getName()));

		Label lMarker = toolkit.createLabel(cReqLvlMarker, "");
		lMarker.setVisible(false);
		//lMarker.setImage(Activator.getImageDescriptor(ISharedImages.IMG_OBJS_WARN_TSK).createImage());
		lMarker.setImage(Activator.getImageDescriptor("icons/warning.png").createImage());
		
		toolkit.createLabel(gAction, "Supported Mechanisms: ");
		List lMechanisms = new List(gAction, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		GridDataFactory.swtDefaults().hint(300, 45).applyTo(lMechanisms);
		lMechanisms.setEnabled(true);
	
		/** TODO **/
		SecurityMechanismProxy pAction = new SecurityMechanismProxy(editor, aspect, (SecurityMechanism)action, gAction, cvReqLevel, lMarker, lMechanisms);
		editor.ActionProxies.put(action, pAction);
		/****/

		return gAction;
	}

	
	/**
	 * Creates the auth z mechanism group.
	 *
	 * @param parent the parent
	 * @param aspect the aspect
	 * @param action the action
	 * @return the group
	 */
	public Group createAuthZMechanismGroup(
			final Composite parent,
			final SecurityAspect aspect,
			final AuthorizationMechanism action) {

		if (parent == null) return null;
		if (aspect == null) return null;
		if (action == null) return null;

		Group gAction = new Group(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(gAction);
		GridDataFactory.swtDefaults().span(2, 1).applyTo(gAction);
		gAction.setText(action.getType().getLiteral());
		
		toolkit.createLabel(gAction, "Authorization Method: ");
		ComboViewer cvAuthZMethod = new ComboViewer(gAction, SWT.READ_ONLY);
		cvAuthZMethod.setContentProvider(ArrayContentProvider.getInstance());
		ArrayList<String> list = new ArrayList<String>();
		for(Iterator<AuthorizationMechanismType> j = AuthorizationMechanismType.VALUES.iterator(); j.hasNext();) {
			list.add(j.next().getLiteral());
		}
		cvAuthZMethod.setInput(list);
		
		toolkit.createLabel(gAction, "Authorization Expression: ");
		final Text tExpression = toolkit.createText(gAction, "", SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
		GridDataFactory.swtDefaults().hint(300, 45).applyTo(tExpression);

		toolkit.createLabel(gAction, "Authorization Language: ");
		final ComboViewer cvExprLang = new ComboViewer(gAction, SWT.READ_ONLY);
		cvExprLang.setContentProvider(ArrayContentProvider.getInstance());
		cvExprLang.setInput(secProfile.retrieveExpressionLanguages());
		cvExprLang.getCombo().setEnabled(false);

		/** TODO **/
		AuthZMechanismProxy pAction = new AuthZMechanismProxy(editor, aspect, action, gAction, cvAuthZMethod, tExpression, cvExprLang);
		editor.ActionProxies.put(action, pAction);
		/****/

		cvAuthZMethod.addSelectionChangedListener(new AuthZMechanismListener(editor, aspect, action));
		cvAuthZMethod.setSelection(new StructuredSelection(pAction.getAuthZType()), true);
		
		tExpression.addModifyListener(new AuthZExpressionListener(editor, aspect, action));
		tExpression.setText(pAction.getExpression());

		cvExprLang.addSelectionChangedListener(new AuthZExprLangListener(editor, aspect, action));
		cvExprLang.setSelection(new StructuredSelection(pAction.getExprLang()));

		return gAction;
	}
	
	
	/**
	 * Creates the security aspect composite.
	 *
	 * @param parent the parent
	 * @param aspect the aspect
	 * @return the composite
	 */
	public Composite createSecurityAspectComposite(
			final Composite parent,
			final SecurityAspect aspect) {
		
		ComboViewer cvReqLevel;
		ArrayList<String> list;
		
		final Composite cAspect = toolkit.createComposite(parent);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(cAspect);

		toolkit.createLabel(cAspect, "Requirement Level: ");
		cvReqLevel = new ComboViewer(cAspect, SWT.READ_ONLY);
		cvReqLevel.setContentProvider(ArrayContentProvider.getInstance());
		list = new ArrayList<String>();
		for(Iterator<SecurityRequirementLevel> i = SecurityRequirementLevel.VALUES.iterator(); i.hasNext();) {
			list.add(i.next().getLiteral());
		}
		cvReqLevel.setInput(list);

		/** TODO **/
		SecurityAspectProxy pAspect = new SecurityAspectProxy(editor, aspect, cvReqLevel);
		editor.AspectProxies.put(aspect, pAspect);
		/****/

		cvReqLevel.setSelection(new StructuredSelection(aspect.getLevel().getName()));
		cvReqLevel.addSelectionChangedListener(new ReqLevelForAspectListener(editor, aspect));

		java.util.List<SecurityActionType> mechTypes = secOnt.getSupportingSecurityActionTypes(aspect.getType());
		for(Iterator<SecurityActionType> i = mechTypes.iterator(); i.hasNext();) {

			SecurityActionType actionType = i.next();
			SecurityAction action = editor.model.getRealizingAction(aspect.getType(), actionType);

			Group gAction;
			if (action instanceof AuthorizationMechanism) {
				gAction = createAuthZMechanismGroup(cAspect, aspect, (AuthorizationMechanism)action);
			} else {
				gAction = createSecurityMechanismGroup(cAspect, aspect, (SecurityMechanism)action);
			}
			GridDataFactory.swtDefaults().span(2, 1).applyTo(gAction);
			
			/** TODO **/
			pAspect.addAction(action);
			/****/
		}

		return cAspect;
	}
	
	
	/**
	 * Builds the page.
	 *
	 * @param <T> the generic type
	 * @param editor the editor
	 * @param page the page
	 * @param toolkit the toolkit
	 * @param parent the parent
	 * @param sectionName the section name
	 * @param expanded the expanded
	 * @return the composite
	 * @throws CoreException the core exception
	 */
	public <T extends EObject> Composite buildPage(
			final SecurityEditor editor,
			final IFormPage page,
			final FormToolkit toolkit,
			final Composite parent,
			final String sectionName,
			boolean expanded) throws CoreException {
		
		this.editor = editor;
		this.page = page;
		this.toolkit = toolkit;
		
		/**** Setup ****/

		/* TODO */
		secOnt = new SecurityOntology(Activator.getDefault().getPreferenceStore().getString(SecurityEditor.SECURITY_ONTOLOGY_KEY));
		secProfile = new SecurityProfile(Activator.getDefault().getPreferenceStore().getString(SecurityEditor.SECURITY_PROFILE_KEY), secOnt);

		editor.ontology = secOnt;
		editor.profile = secProfile;
		editor.AspectProxies = new HashMap<SecurityAspect, SecurityAspectProxy>();
		editor.ActionProxies = new HashMap<SecurityAction, SecurityActionProxy>();
		
		/**** Security ****/
		
		final Section sSecurity = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		sSecurity.setText(sectionName);
		sSecurity.setExpanded(expanded);
		sSecurity.setDescription("The Service Level Security covers major aspects of service security to ensure the integrity, authenticity and confidentiality of the provided service and the communication between the actors.");

		final Composite cSecurity = toolkit.createComposite(sSecurity);
		//RowLayoutFactory.swtDefaults().type(SWT.VERTICAL).applyTo(cSecurity);
		GridLayoutFactory.swtDefaults().numColumns(3).applyTo(cSecurity);
		sSecurity.setClient(cSecurity);

		/**** >>> General ****/
		
		/*
		toolkit.createLabel(cSecurity, "Security Profile: ");
		final Text tProfile = toolkit.createText(cSecurity, Activator.getDefault().getPreferenceStore().getString(SecurityEditor.SECURITY_PROFILE_KEY));

		Button bLoadProfile = toolkit.createButton(cSecurity, "load", SWT.PUSH);
		bLoadProfile.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				try {
					secProfile = new SecurityProfile(tProfile.getText(), secOnt);
					editor.profile = secProfile;
				} catch(Exception E) {
				}
			}
		});
		*/
		
		/**** Security Aspects ****/

		for (Iterator<SecurityAspectType> i = SecurityAspectType.VALUES.iterator(); i.hasNext();) {

			SecurityAspectType aspectType = i.next();

			switch (aspectType) {
				case ADDRESSABILITY: continue;
				case PRIVACY: continue; 
				case TRACEABILITY: continue;
				case OTHER: continue;
				case UNDEFINED: continue;
			}
			
			final Section ecAspect = toolkit.createSection(cSecurity, Section.TITLE_BAR | ExpandableComposite.TWISTIE);
			GridDataFactory.swtDefaults().align(SWT.FILL, SWT.BEGINNING).grab(true, false).span(3, 1).applyTo(ecAspect);
			ecAspect.setText(aspectType.getLiteral());
			ecAspect.addExpansionListener(new ExpansionAdapter() {
				public void expansionStateChanged(ExpansionEvent e) {
				    changePage();
				}
			});

			switch (aspectType) {
				case IDENTIFIABILITY:		colorSection(0, ecAspect); break;
				case ACCESS_PROTECTION:		colorSection(1, ecAspect); break;
				case MESSAGE_SECURITY:		colorSection(4, ecAspect); break;
				case TRANSPORT_SECURITY:	colorSection(2, ecAspect); break;
				case NON_REPUDATION:		colorSection(3, ecAspect); break;
				default: break;
			}
			
			final Composite cAspect = createSecurityAspectComposite(ecAspect, editor.model.getSecurityAspect(aspectType));
			ecAspect.setClient(cAspect);
		}

		changePage();
		
		return sSecurity;
	}
}
