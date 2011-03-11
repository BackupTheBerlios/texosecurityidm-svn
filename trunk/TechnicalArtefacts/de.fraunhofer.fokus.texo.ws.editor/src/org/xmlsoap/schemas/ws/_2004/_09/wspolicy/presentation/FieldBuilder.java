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

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

/**
 * The FieldBuilder offers methods to create a section containing
 * particular composite GUI elements.
 */
public class FieldBuilder {

	/**
	 * Creates a colored section containing a text area.
	 * 
	 * @param sectionName
	 * @param toolkit
	 * @param parent
	 * @param content
	 * @param textWidth
	 * @param textHeight
	 * @param modifyListener
	 * @return
	 */
	public static Section createSection(String sectionName, FormToolkit toolkit, Composite parent,
			String content, int textWidth, int textHeight, ModifyListener modifyListener){
		Section containmentSection = toolkit.createSection(
				parent, ExpandableComposite.TITLE_BAR
						| ExpandableComposite.TWISTIE |  SWT.BORDER);
		Composite composite = toolkit.createComposite(
				containmentSection, SWT.BORDER);
		containmentSection.setClient(composite);
		containmentSection.setText(sectionName);
		GuiBuilderToolkit.colorSection(sectionName, containmentSection);
//		ToolBar sectionToolbar = new ToolBar(containmentSection, SWT.PUSH
//				| SWT.HORIZONTAL);
//		containmentSection.setTextClient(sectionToolbar);
		containmentSection.setLayoutData(new GridData(SWT.LEFT, SWT.TOP,
				false, false, 1, 1));
		composite.setLayout(GuiBuilderToolkit.createSectionLayout());
		GuiBuilderToolkit.createStyledTextArea(composite, content, textWidth, textHeight, modifyListener);
		return containmentSection;
	}
	
	/**
	 * Creates a colored section.
	 * 
	 * @param sectionName
	 * @param toolkit
	 * @param parent
	 * @return
	 */
	public static Section createSectionWithoutText(String sectionName, FormToolkit toolkit, Composite parent){
		Section containmentSection = toolkit.createSection(
				parent, ExpandableComposite.TITLE_BAR
						| ExpandableComposite.TWISTIE | SWT.BORDER);
		Composite composite = toolkit.createComposite(
				containmentSection, SWT.BORDER);
		containmentSection.setClient(composite);
		containmentSection.setText(sectionName);
		GuiBuilderToolkit.colorSection(sectionName, containmentSection);
		ToolBar sectionToolbar = new ToolBar(containmentSection, SWT.FLAT
				| SWT.HORIZONTAL);
		containmentSection.setTextClient(sectionToolbar);
		containmentSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				false, false, 2, 1));
		composite.setLayout(GuiBuilderToolkit.createSectionLayout());
		return containmentSection;
	}
	

}
