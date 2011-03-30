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

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.RowDataFactory;
import org.eclipse.jface.layout.RowLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import servicelevelmodule.SecurityActionType;
import servicelevelmodule.SecurityAspectType;
import servicelevelmodule.SecurityRequirementLevel;


// TODO: Auto-generated Javadoc
/**
 * The Class UITest.
 */
public class UITest {
	
	//static IFormPage page = null;
	/** The toolkit. */
	static FormToolkit toolkit;
	
	/** The shell. */
	static Shell shell = null;
	
	
	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Display display = new Display ();
		shell = new Shell(display);

		toolkit = new FormToolkit(display);
		
		RowLayoutFactory.swtDefaults().type(SWT.VERTICAL).applyTo(shell);
		RowDataFactory.swtDefaults().applyTo(shell);

		//Composite c = buildPage(toolkit, shell, "Security", true);

		/****/
		
		Composite c = new Composite(shell, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(c);
		
		Label lOntology = new Label(c, SWT.NONE);
		lOntology.setText("Security Ontology: ");
		GridDataFactory.swtDefaults().span(2, 1).applyTo(lOntology);
		
		Text tOntology = new Text(c, SWT.BORDER);
		tOntology.setText("http://www.fokus.fraunhofer.de/texo/ontologies/security.owl");
		GridDataFactory.swtDefaults().hint(350, 15).applyTo(tOntology);

		Button bOntology = new Button(c, SWT.PUSH | SWT.CENTER);
		bOntology.setText("Load...");
		GridDataFactory.swtDefaults().applyTo(bOntology);
		
		/****/
		
		Label lProfile = new Label(c, SWT.NONE);
		lProfile.setText("Security Profile: ");
		GridDataFactory.swtDefaults().span(2, 1).applyTo(lProfile);
		
		Text tProfile = new Text(c, SWT.BORDER);
		tProfile.setText("http://www.fokus.fraunhofer.de/texo/ontologies/security_profile.owl");
		GridDataFactory.swtDefaults().hint(350, 15).applyTo(tProfile);

		Button bProfile = new Button(c, SWT.PUSH | SWT.CENTER);
		bProfile.setText("Load...");
		GridDataFactory.swtDefaults().applyTo(bProfile);

		/****/
		
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();

	}
	
	
	/**
	 * Change page.
	 */
	public static void changePage(){
		shell.layout();
	}


	/**
	 * Creates the security action composite.
	 *
	 * @param toolkit the toolkit
	 * @param parent the parent
	 * @param actionType the action type
	 * @return the composite
	 */
	public static Composite createSecurityActionComposite(
			final FormToolkit toolkit,
			final Composite parent,
			final SecurityActionType actionType) {

		final Group gAction = new Group(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(gAction);
		gAction.setText(actionType.getLiteral());

//		final Composite cGeneral = new Composite(gAction, SWT.NONE);
//		RowLayoutFactory.swtDefaults().type(SWT.HORIZONTAL).applyTo(cGeneral);
//		GridDataFactory.swtDefaults().grab(false, false).applyTo(cGeneral);
//
//		final Composite cRealizations = new Composite(gAction, SWT.NONE);
//		RowLayoutFactory.swtDefaults().type(SWT.HORIZONTAL).applyTo(cRealizations);
		
		toolkit.createLabel(gAction, "Requirement Level: ");
		ComboViewer comboViewer = new ComboViewer(gAction, SWT.READ_ONLY);
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		ArrayList<String> list = new ArrayList<String>();
		for(Iterator<SecurityRequirementLevel> j = SecurityRequirementLevel.VALUES.iterator(); j.hasNext();) {
			list.add(j.next().getLiteral());
		}
		comboViewer.setInput(list);
		comboViewer.setSelection(new StructuredSelection(SecurityRequirementLevel.NONE));
		
		toolkit.createLabel(gAction, "Supported Realization: ");
		List list1 = new List(gAction, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		list1.setEnabled(true);
		
		return gAction;
	}
	
	
	// for general security aspects relying on security mechanisms
	/**
	 * Creates the security aspect composite.
	 *
	 * @param toolkit the toolkit
	 * @param parent the parent
	 * @param aspectType the aspect type
	 * @return the composite
	 */
	public static Composite createSecurityAspectComposite(
			final FormToolkit toolkit,
			final Composite parent,
			final SecurityAspectType aspectType) {
		
		ComboViewer comboViewer;
		ArrayList<String> list;
		
		final Composite cAspect = toolkit.createComposite(parent);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(cAspect);

		toolkit.createLabel(cAspect, "Requirement Level: ");
		comboViewer = new ComboViewer(cAspect, SWT.READ_ONLY);
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		list = new ArrayList<String>();
		for(Iterator<SecurityRequirementLevel> i = SecurityRequirementLevel.VALUES.iterator(); i.hasNext();) {
			list.add(i.next().getLiteral());
		}
		comboViewer.setInput(list);
		try {
			comboViewer.setSelection(new StructuredSelection(SecurityRequirementLevel.NONE));
		} catch(Exception E) {
		}

		java.util.List<SecurityActionType> mechTypes = SecurityActionType.VALUES;
		for(Iterator<SecurityActionType> i = mechTypes.iterator(); i.hasNext();) {

			final SecurityActionType actionType = i.next();
			
			Composite cAction = createSecurityActionComposite(toolkit, cAspect, actionType);
			GridDataFactory.swtDefaults().span(2, 1).applyTo(cAction);
		}
		
		return cAspect;
	}
	
	
	/**
	 * Builds the page.
	 *
	 * @param <T> the generic type
	 * @param toolkit the toolkit
	 * @param parent the parent
	 * @param sectionName the section name
	 * @param expanded the expanded
	 * @return the composite
	 */
	public static <T extends EObject> Composite buildPage(
			FormToolkit toolkit,
			final Composite parent,
			final String sectionName,
			boolean expanded) {
		
		
		/**** Setup ****/

		/**** Security ****/
		
		final Section sSecurity = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);
		RowLayoutFactory.swtDefaults().applyTo(sSecurity);
		sSecurity.setText(sectionName);
		sSecurity.setExpanded(true);
		sSecurity.setDescription("TODO");

		final Composite cSecurity = toolkit.createComposite(sSecurity);
		RowLayoutFactory.swtDefaults().type(SWT.VERTICAL).applyTo(cSecurity);
		sSecurity.setClient(cSecurity);

		final Composite generalComp = toolkit.createComposite(cSecurity);
		RowLayoutFactory.swtDefaults().type(SWT.HORIZONTAL).applyTo(generalComp);

		/**** >>> General ****/

		toolkit.createLabel(generalComp, "Security Profile: ");
		toolkit.createText(generalComp, "", SWT.NONE);

		toolkit.createButton(generalComp, "load", SWT.PUSH);

		/**** Security Aspects ****/
		
		for (Iterator<SecurityAspectType> i = SecurityAspectType.VALUES.iterator(); i.hasNext();) {

			SecurityAspectType saType = i.next();

			switch (saType) {
				case ADDRESSABILITY: continue;
				case PRIVACY: continue; 
				case TRACEABILITY: continue;
				case OTHER: continue;
				case UNDEFINED: continue;
			}
			
			final ExpandableComposite saComp = toolkit.createExpandableComposite(
					cSecurity, ExpandableComposite.TWISTIE | ExpandableComposite.CLIENT_INDENT);
			saComp.setText(saType.getLiteral());
			saComp.addExpansionListener(new ExpansionAdapter() {
				public void expansionStateChanged(ExpansionEvent e) {
				    UITest.changePage();
				}
			});

			final Composite secAsp0Composite;
//			if (saType == SecurityAspectType.ACCESS_PROTECTION) {
//				secAsp0Composite = createAccessProtectionComposite(toolkit, saComp, saType);
//			} else {
				secAsp0Composite = createSecurityAspectComposite(toolkit, saComp, saType);
//			}
			saComp.setClient(secAsp0Composite);
		}

		return sSecurity;
	}
}
