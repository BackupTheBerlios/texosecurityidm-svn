package net.texo.USDLSecurityEditor;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;


public class SecurityPreferencePage extends PreferencePage implements IWorkbenchPreferencePage{

	Text tOntology = null;
	Text tProfile = null;
	Button bOntology = null;
	Button bProfile = null;
	
	String currentOntologyURL = "";
	String currentProfileURL = "";
	
	@Override
	public void init(IWorkbench wb) {
		//Initialize the preference store we wish to use
		setPreferenceStore(Activator.getDefault().getPreferenceStore());

		Activator.getDefault().getPreferenceStore().setDefault(SecurityEditor.SECURITY_ONTOLOGY_KEY, SecurityEditor.DEFAULT_SECURITY_ONTOLOGY_URL);
		Activator.getDefault().getPreferenceStore().setDefault(SecurityEditor.SECURITY_PROFILE_KEY, SecurityEditor.DEFAULT_SECURITY_PROFILE_URL);
		
		currentOntologyURL = Activator.getDefault().getPreferenceStore().getString(SecurityEditor.SECURITY_ONTOLOGY_KEY);
		currentProfileURL = Activator.getDefault().getPreferenceStore().getString(SecurityEditor.SECURITY_PROFILE_KEY);
	}

	
	public void initializeDefaults(IPreferenceStore store) {
		store.setDefault(SecurityEditor.SECURITY_ONTOLOGY_KEY, SecurityEditor.DEFAULT_SECURITY_ONTOLOGY_URL);
	}

	/** 
	 * Initializes a preference store with default preference values 
	 * for this plug-in.
	 */
	protected void performDefaults() {
		
		Activator.getDefault().getPreferenceStore().setValue(SecurityEditor.SECURITY_ONTOLOGY_KEY, SecurityEditor.DEFAULT_SECURITY_ONTOLOGY_URL);
		Activator.getDefault().getPreferenceStore().setValue(SecurityEditor.SECURITY_PROFILE_KEY, SecurityEditor.DEFAULT_SECURITY_PROFILE_URL);
		
		currentOntologyURL = Activator.getDefault().getPreferenceStore().getString(SecurityEditor.SECURITY_ONTOLOGY_KEY);
		currentProfileURL = Activator.getDefault().getPreferenceStore().getString(SecurityEditor.SECURITY_PROFILE_KEY);
		
		tOntology.setText(currentOntologyURL);
		tProfile.setText(currentProfileURL);
		bOntology.setEnabled(false);
		bProfile.setEnabled(false);
	}

	
	@Override
	protected Control createContents(Composite parent) {

		Composite c = new Composite(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(c);
		
		Label lOntology = new Label(c, SWT.NONE);
		lOntology.setText("Security Ontology: ");
		GridDataFactory.swtDefaults().span(2, 1).applyTo(lOntology);
		
		tOntology = new Text(c, SWT.BORDER);
		tOntology.setText(Activator.getDefault().getPreferenceStore().getString(SecurityEditor.SECURITY_ONTOLOGY_KEY));
		GridDataFactory.swtDefaults().hint(450, 15).applyTo(tOntology);

		bOntology = new Button(c, SWT.PUSH | SWT.CENTER);
		bOntology.setText("Load...");
		GridDataFactory.swtDefaults().applyTo(bOntology);
		bOntology.setEnabled(false);

		tOntology.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				bOntology.setEnabled(true);
			}
		});
		bOntology.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				try {
					currentOntologyURL = tOntology.getText();
					bOntology.setEnabled(false);
				} catch(Exception E) {
				}
			}
		});
		
		/****/
		
		Label lProfile = new Label(c, SWT.NONE);
		lProfile.setText("Security Profile: ");
		GridDataFactory.swtDefaults().span(2, 1).applyTo(lProfile);
		
		tProfile = new Text(c, SWT.BORDER);
		tProfile.setText(Activator.getDefault().getPreferenceStore().getString(SecurityEditor.SECURITY_PROFILE_KEY));
		GridDataFactory.swtDefaults().hint(450, 15).applyTo(tProfile);

		bProfile = new Button(c, SWT.PUSH | SWT.CENTER);
		bProfile.setText("Load...");
		GridDataFactory.swtDefaults().applyTo(bProfile);
		bProfile.setEnabled(false);
		
		tProfile.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				bProfile.setEnabled(true);
			}
		});
		bProfile.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				try {
					currentProfileURL = tProfile.getText();
					bProfile.setEnabled(false);
				} catch(Exception E) {
				}
			}
		});

		return c;
	}

	
	public boolean performOk() {
		
		Activator.getDefault().getPreferenceStore().setValue(SecurityEditor.SECURITY_ONTOLOGY_KEY, currentOntologyURL);
		Activator.getDefault().getPreferenceStore().setValue(SecurityEditor.SECURITY_PROFILE_KEY, currentProfileURL);

		return super.performOk();
	}
}
