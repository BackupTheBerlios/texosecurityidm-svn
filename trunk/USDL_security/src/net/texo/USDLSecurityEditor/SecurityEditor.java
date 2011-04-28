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

import java.util.Map;

import net.texo.USDLSecurityEditor.proxies.SecurityActionProxy;
import net.texo.USDLSecurityEditor.proxies.SecurityAspectProxy;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.IFileEditorInput;

import servicelevelmodule.SecurityAction;
import servicelevelmodule.SecurityAspect;


// TODO: Auto-generated Javadoc
/**
 * The Class SecurityEditor.
 *
 * @author rda
 */
public class SecurityEditor extends FormEditor {

	public static final String SECURITY_ONTOLOGY_KEY = "net.texo.USDLSecurityEditor.SecurityOntology";
	public static final String SECURITY_PROFILE_KEY = "net.texo.USDLSecurityEditor.SecurityProfile";

	public static final String DEFAULT_SECURITY_ONTOLOGY_URL = "http://texosecurityidm.berlios.de/ontologies/security.owl";
	public static final String DEFAULT_SECURITY_PROFILE_URL = "http://texosecurityidm.berlios.de/ontologies/security_profile.owl";

	/** The dirty flag. */
	boolean dirtyFlag;
	
	/** The file loc. */
	String fileLoc;
	
	/** The file. */
	IFile file = null;
	
	/** The model. */
	public SecurityModel model = null;
	
	/** The ontology. */
	public SecurityOntology ontology = null;
	
	/** The profile. */
	public SecurityProfile profile = null;
	
	/** The security page. */
	public SecurityPage securityPage = null;
	
	/** The Action proxies. */
	public Map<SecurityAction, SecurityActionProxy> ActionProxies;
	
	/** The Aspect proxies. */
	public Map<SecurityAspect, SecurityAspectProxy> AspectProxies;
	
	
	/**
	 * Instantiates a new security editor.
	 */
	public SecurityEditor() {
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.editor.FormEditor#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
		
		setPartName(editorInput.getName());

		file = ((IFileEditorInput) editorInput).getFile();
		fileLoc = file.getLocation().toPortableString();
		model = new SecurityModel(fileLoc);
	}

	
	/**
	 * Sets the page dirty and updates the removes all messages (added by XML parser) from the pages.
	 *
	 * @param dirty the new dirty
	 */
	public void setDirty(boolean dirty) {
		dirtyFlag = dirty;
		super.editorDirtyStateChanged();
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.editor.FormEditor#addPages()
	 */
	@Override
	protected void addPages() {
		try {
			addPage(new GenericPage(this, "Service"));
			addPage(new GenericPage(this, "Functional"));
			addPage(new GenericPage(this, "Interaction"));
			addPage(new GenericPage(this, "Pricing"));
			addPage(new GenericPage(this, "Participants"));
			addPage(new GenericPage(this, "Imports"));
			addPage(new GenericPage(this, "Legal"));

			securityPage = new SecurityPage(this);
			addPage(securityPage);
			setActivePage(7);
			
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Saves the resource if there is no error on each page. Otherwise an <code>MessageDialog</code> will be shown.
	 * Parses the stored XML document and adds a message to the <code>MessageManager</code> (error or success message).
	 *
	 * @param monitor the monitor
	 */
	public void doSave(IProgressMonitor monitor) {

//		System.out.println("SecurityEditor::doSave()");
		
		String errorMessage = "";
		boolean save = true;
		
		ScrolledForm activeForm = this.getActivePageInstance().getManagedForm().getForm();
		activeForm.setBusy(true);
		
		// save data and validate XML document
		if(save){
			model.saveUSDL();
			setDirty(false);
		} else {
			// open dialog with all value error messages
			MessageDialog.openError(activeForm.getShell(), "Error occured", "Document not saved.\n\n" + errorMessage);
		}
		
		activeForm.setBusy(false);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
        throw new UnsupportedOperationException();
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.editor.FormEditor#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return dirtyFlag;
	}

	
	/**
	 * Renew page.
	 *
	 * @param id the id
	 */
	public void renewPage(String id) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.editor.FormEditor#dispose()
	 */
	public void dispose() {
		super.dispose();
	}
}
