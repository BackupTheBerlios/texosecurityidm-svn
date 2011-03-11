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
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.EventObject;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.part.FileEditorInput;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.provider._200702ItemProviderAdapterFactory;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.provider._200512ItemProviderAdapterFactory;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.provider._0ItemProviderAdapterFactory;
import org.w3._2000._09.xmldsig.provider.XmldsigItemProviderAdapterFactory;
import org.w3._2005._08.wsaddressing.provider.AddressingItemProviderAdapterFactory;

import org.xmlsoap.schemas.soap.soapenvelope.provider.EnvelopeItemProviderAdapterFactory;
import org.xmlsoap.schemas.ws._2003._06.wsutility.provider.UtilityItemProviderAdapterFactory;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.provider.PolicyItemProviderAdapterFactory;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage;

/**
 * The Policy Editor visualizes a policy in different sections.
 * It checks the policy if it is conform to the following WS and OASIS standards:
 * SOAP-Envelope
 * WS-Adressing
 * WS-Policy
 * WS-SecurityPolicy
 * WS-Security Sec Extension
 * WS-Security Utility
 * WS-Utility
 * XML-Signatute Syntax and Processing
 */
public class PolicyEditor extends FormEditor{
	
	

	protected ComposedAdapterFactory adapterFactory;
	
	protected AdapterFactoryEditingDomain editingDomain;
	

	private boolean dirtyFlag;
	


		protected org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot documentRoot;
		
		
		protected ReflectiveItemProvider reflProvider;
		
		protected EcoreResourceHelper erh;
		
		
		public PolicyEditor() {
			super();
			initializeEditingDomain();
		}
		

	
	/**
	 * Sets the page dirty and updates the removes all messages (added by XML parser) from the pages 
	 * @param dirty
	 */
	public void setDirty(boolean dirty) {
		// remove all validate messages from all pages after first change through user
		if(!dirtyFlag) {
			/*
			if(securitypage.getManagedForm() != null){
				IMessageManager mmng = securitypage.getManagedForm().getMessageManager();
				mmng.removeMessage("validateType");
			}
			*/
		}
		dirtyFlag = dirty;
		super.editorDirtyStateChanged();
	}

	
	

	
	
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		// For this to work this plugin needs the dependency on the
		// EMF edit plugin generated from the ThetaML .ecore and .genmodel
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EnvelopeItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new _0ItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new XmldsigItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.provider._0ItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new UtilityItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new AddressingItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new PolicyItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new _200702ItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new _200512ItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());


		// command stack that will notify this editor as commands are executed
		BasicCommandStack commandStack = new BasicCommandStack();


		// Add a listener to set the editor dirty of commands have been executed
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				getContainer().getDisplay().asyncExec(new Runnable() {
					public void run() {
						editorDirtyStateChanged();
					}
				});
			}
		});


		// Create the editing domain with our adapterFactory and command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack, new HashMap<Resource, Boolean>());
		
		// These provide access to the model items, their property source and label
		reflProvider = new ReflectiveItemProvider(adapterFactory);
		erh = new EcoreResourceHelper(reflProvider);
	}
	
	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
		super.init(site, editorInput);
		setPartName(editorInput.getName());
		createModel();
		}
	
	/**
	 * Creates the model of the file input of the editor.
	 */
	public void createModel() {
		
		URI resourceURI = EditUIUtil.getURI(getEditorInput());
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					true);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					false);
		}


		if (resource != null) {
			
			this.documentRoot = (org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot) resource.getContents().get(0);
		}
	}
	
	
	public AdapterFactoryEditingDomain getEditingDomain() {
		return editingDomain;
	}

	public org.xmlsoap.schemas.ws._2004._09.wspolicy.DocumentRoot getDocumentRoot() {
		return documentRoot;
	}


	
	@Override
	public boolean isDirty() {
		return dirtyFlag;
	}

	
	@Override
	protected void addPages() {
		try {
			addPage(new WSPolicyPage(this, documentRoot, reflProvider));
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model file.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		
		ScrolledForm activeForm = this.getActivePageInstance().getManagedForm().getForm();
		activeForm.setBusy(true);
		
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
		boolean fehler =  false;
		boolean[] allCorrect = new boolean[]{true, true, true};
		String errorString = "";
		
		String[] xmlTexts = GuiBuilderToolkit.getXmlTexts(getActivePageInstance(), ((WSPolicyPage)getActivePageInstance()).getSections().length);

		if (!fehler){
			String dd = new String();
			String[] elementsList = xmlResource.split(">", 5);
			if (erh.hasEObject(erh.getElements(documentRoot), PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE, false))
				if (erh.hasEObject(erh.getElements(documentRoot), PolicyPackage.Literals.DOCUMENT_ROOT__ALL, false))	
				dd = elementsList[0]+ ">" + 
					elementsList[1] + ">" +
					elementsList[2] + ">" +
					elementsList[3] + ">";
				else
					dd = elementsList[0]+ ">" + 
					elementsList[1] + ">" +
					elementsList[2] + ">";
			else
				dd = elementsList[0]+ ">" + 
				elementsList[1] + ">";
			for (String sss :xmlTexts){
//				if (!sss.equals("")){
//				String s = xmlResource.substring(xmlResource.indexOf(sss.substring(0, sss.indexOf(">")+1)), xmlResource.lastIndexOf(sss.substring(sss.lastIndexOf("</"))) + sss.substring(sss.lastIndexOf("</")).length());
				dd = dd +  sss;
				}
			String[] elementsEndList = xmlResource.split(">");
			int listLength = elementsEndList.length;
			if (erh.hasEObject(erh.getElements(documentRoot), PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE, false))	
				if (erh.hasEObject(erh.getElements(documentRoot), PolicyPackage.Literals.DOCUMENT_ROOT__ALL, false))
					dd = dd + 
					elementsEndList[listLength- 3]+ ">" + 
					elementsEndList[listLength- 2]+ ">" + 
					elementsEndList[listLength- 1] + ">";
				else
					dd = dd + 
					elementsEndList[listLength- 2]+ ">" + 
					elementsEndList[listLength- 1] + ">";
			else
				dd = dd +
				elementsEndList[listLength- 1]+ ">";
		 try{
			 
			   // Create file 
			 
			 	java.io.File file = new java.io.File(Platform.getLocation() + ((Resource)documentRoot.eResource()).getURI().toPlatformString(true) );
			    FileWriter fstream = new FileWriter(file);
			    PrintWriter out = new PrintWriter(fstream);
			    out.write(dd);
			    //Close the output stream
			    out.close();
			    }catch (Exception e){//Catch exception if any
			      System.err.println("Error: " + e.getMessage());
			    }
		
		
		final Resource res = editingDomain.createResource(Platform.getLocation() + ((Resource)documentRoot.eResource()).getURI().toPlatformString(true));
//		
		

	
		
		// Do the work within an operation because this is a long running activity that modifies the workbench.
		//
		WorkspaceModifyOperation operation =
			new WorkspaceModifyOperation() {
				// This is the method that gets invoked when the operation runs.
				//
				@Override
				public void execute(IProgressMonitor monitor) {
					
				
					
					
					// Save the resources to the file system.
					//
					boolean first = true;
//					for (Resource resource : editingDomain.getResourceSet().getResources()) {
						if ((first || !res.getContents().isEmpty() || isPersisted(res)) && !editingDomain.isReadOnly(res)) {
							try {
								long timeStamp = res.getTimeStamp();
								
								if (res.getTimeStamp() != timeStamp) {
//									savedResources.add(res);
								}
							}
							catch (Exception exception) {
//								resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
							}
							first = false;
						}
					}
//				}
			};

//		updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
		catch (Exception exception) {
			// Something went wrong that shouldn't.
			//
//			WssecurityEditorPlugin.INSTANCE.log(exception);
		}
//		updateProblemIndication = true;
//		updateProblemIndication();
		} else{
			//SWT.ICON_QUESTION | SWT.YES | SWT.NO
    	String[] fehlerStrings = new String[]{"Identifiability", "Message Security", "Transport Security", };
    	MessageBox messageBox = new MessageBox(getEditorSite().getShell(), SWT.ICON_ERROR | SWT.OK);
    	if (errorString.equals("")){
    	for (int i = 0; i<allCorrect.length; i++)
    		if (!allCorrect[i])
    			errorString += "Error in " + fehlerStrings[i] + "\n";
    	}
    	if (errorString.equals(""))
    		errorString = "Please check security levels of security aspects and mechanisms in the USDL service description.\n" +
    		"The instance of the aspect/mechanism must be the same level specified in the USDL service description.";
    	messageBox.setMessage(errorString);
    	messageBox.open();}
		activeForm.setBusy(true);
		setDirty(false);
//		createModel();
//		addPages();
	}
	
	/**
	 * This returns whether something has been persisted to the URI of the specified resource.
	 * The implementation uses the URI converter from the editor's resource set to try to open an input stream. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet().getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		}
		catch (IOException e) {
			// Ignore
		}
		return result;
	}
	
	/**
	 * This always returns true because it is not currently supported.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * This also changes the editor's input.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
		saveAsDialog.open();
		IPath path = saveAsDialog.getResult();
		if (path != null) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null) {
				doSaveAs(URI.createPlatformResourceURI(file.getFullPath().toString(), true), new FileEditorInput(file));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void doSaveAs(URI uri, IEditorInput editorInput) {
		(editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor =
			getActionBars().getStatusLineManager() != null ?
				getActionBars().getStatusLineManager().getProgressMonitor() :
				new NullProgressMonitor();
		doSave(progressMonitor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor)getEditorSite().getActionBarContributor();
	}
	
}
