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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;


// TODO: Auto-generated Javadoc
/**
 * The Class SecurityPage.
 */
public class SecurityPage extends FormPage {

	/** The editor. */
	private SecurityEditor editor;
	
	/** The form. */
	private ScrolledForm form;
	
	/** The toolkit. */
	private FormToolkit toolkit;
	
	/** The page builder. */
	public 	PageBuilder pageBuilder = null;

	/**
	 * Instantiates a new security page.
	 *
	 * @param editor the editor
	 */
	public SecurityPage(SecurityEditor editor) {
		super(editor, "USDLSecurityPageID", "ServiceLevel/Security");
		this.editor = editor;
	}


	/**
	 * Creates the form layout.
	 *
	 * @param parent the parent
	 */
	public void createFormLayout(Composite parent) {
		GridLayout formLayout = new GridLayout();
		formLayout.numColumns = 2;
		formLayout.marginHeight = 10;
		formLayout.marginWidth = 6;
		formLayout.horizontalSpacing = 20;
		formLayout.makeColumnsEqualWidth = true;
		parent.setLayout(formLayout);
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.editor.FormPage#createFormContent(org.eclipse.ui.forms.IManagedForm)
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {

		form = managedForm.getForm();
		//ImageDescriptor imageDescriptor = Activator.getImageDescriptor(USDL.IMG_IOS_HEADER);
		//form.getBody().setBackgroundImage(imageDescriptor.createImage());
		toolkit = managedForm.getToolkit();
		
		// set heading text and style
		form.setText("USDL Service Level/Security");
		toolkit.decorateFormHeading(form.getForm());

		// set layout of the entire form
		createFormLayout(form.getBody());

		try {
			pageBuilder = new PageBuilder();
			pageBuilder.buildPage(
					editor,
					this,
					toolkit,
					form.getBody(),
					"Service Security",
					true);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		editor.setDirty(false);
	}
}
