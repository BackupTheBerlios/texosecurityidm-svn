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

import java.io.StringReader;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.internal.util.BundleUtility;
import org.osgi.framework.Bundle;


/**
 * The WSPolicyToolkit provides helper methods to create SWT Gui elements.
 *
 */
@SuppressWarnings("restriction")
public class GuiBuilderToolkit {

	public static final String PLUGIN_ID = "de.fraunhofer.fokus.texo.ws.editor"; //$NON-NLS-1$


	public static PolicyEditor getActiveWSPolicyEditor() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		if (window.getActivePage() == null)
			return null;

		if (window.getActivePage().getActiveEditor() instanceof PolicyEditor)
			return (PolicyEditor) window.getActivePage().getActiveEditor();

		return null;
	}

	public static Layout createSectionLayout() {
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		return layout;
	}
	
	/**
	 * Creates a text fields and adds the modifyListener.
	 * 
	 * @param parent
	 * @param editor
	 * @param page
	 * @param object
	 *            Object
	 * @param readOnly
	 *            if true, the field is unmodifiable (e.g. for date selection)
	 * @return Text
	 */
	public static Text createTextField(Composite parent,
			PolicyEditor editor, IFormPage page, Object object,
			boolean readOnly, String input) {
		Text textField = new Text(parent, SWT.BORDER
				+ (readOnly ? SWT.READ_ONLY : SWT.NONE));
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
		// to constraint the maximum width
		gridData.widthHint = 100;
		textField.setLayoutData(gridData);

		textField.setText(input);
		return textField;
	}
	
	public static Section createSection(Composite parent,FormToolkit formToolkit, String title){
		Section section = new Section(parent, Section.TITLE_BAR | Section.TWISTIE  );
		section.setLayout(createSectionLayout());
		section.setText(title);
		GridData gridData = new GridData(SWT.LEFT, SWT.TOP, true, false);
		// to constraint the maximum width
		gridData.widthHint = 100;
		gridData.horizontalSpan = 2;
		
		section.setLayoutData(gridData);
		
		section.setClient(createSectionClient(section, formToolkit));
		return section;	
	}
	
	public static Composite createSectionClient(Section section, FormToolkit formToolkit){
		Composite sectionClient = formToolkit.createComposite(section);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 30;
		layout.horizontalSpacing = 15;
		
		sectionClient.setLayout(layout);
		return sectionClient;
	}
	

	public static Button createCheckbox(Composite parent, String text, boolean selected){
		Button checkbox = new Button(parent, SWT.CHECK);
		checkbox.setText(text);
		checkbox.setSelection(selected);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true,
				false);
		gridData.widthHint = 100;
		gridData.horizontalSpan = 2; 
		checkbox.setLayoutData(gridData);
		return checkbox;
	}
	
	
	public static Group createButtonGroup(Composite parent, String text){
		Group group = new Group(parent, SWT.SHADOW_IN);
        group.setLayout(new RowLayout(SWT.VERTICAL));
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true,
				false);
        gridData.widthHint = 100;
		gridData.horizontalSpan = 2;
		group.setLayoutData(gridData);
		return group;
	}
	
	/**
	 * Assigns the color scheme to a section header, according to it's title.
	 * Using the heading, the type of the object (business, operational,
	 * technical or non-specific) is determined and the appropriate colors are
	 * being set.
	 * 
	 * @param sectionName
	 *            the title of the section
	 * @param section
	 *            the section object itself
	 */
	public static void colorSection(final String sectionName,
			final Section section) {
		Display dis = section.getDisplay();
		section.setTitleBarBackground(ColorSelector_new.getColor(sectionName, dis,
				ColorSelector_new.FILL));
		section.setTitleBarBorderColor(ColorSelector_new.getColor(sectionName, dis,
				ColorSelector_new.EDGE));
		section.setTitleBarForeground(ColorSelector_new.getColor(sectionName, dis,
				ColorSelector_new.FONT_NORMAL));
		section.setToggleColor(ColorSelector_new.getColor(sectionName, dis,
				ColorSelector_new.FONT_NORMAL));
		section.setActiveToggleColor(ColorSelector_new.getColor(sectionName, dis,
				ColorSelector_new.FONT_HOVER));
	}
	
	
	
	public static ImageDescriptor getImageDescriptor(String pluginId, String imageFilePath){
	
		if (pluginId == null || imageFilePath == null) {
            throw new IllegalArgumentException();
        }

		IWorkbench workbench = PlatformUI.isWorkbenchRunning() ? PlatformUI.getWorkbench() : null;
		ImageDescriptor imageDescriptor = workbench == null ? null : workbench
				.getSharedImages().getImageDescriptor(imageFilePath);
		if (imageDescriptor != null)
			return imageDescriptor; // found in the shared images

        // if the bundle is not ready then there is no image
        Bundle bundle = Platform.getBundle(pluginId);
        if (!BundleUtility.isReady(bundle)) {
			return null;
		}

        // look for the image (this will check both the plugin and fragment folders
        URL fullPathString = BundleUtility.find(bundle, imageFilePath);
        if (fullPathString == null) {
            try {
                fullPathString = new URL(imageFilePath);
            } catch (MalformedURLException e) {
                return null;
            }
        }

        return ImageDescriptor.createFromURL(fullPathString);
	}
	
//	public static void createFormActions(IFormPage page,
//			IToolBarManager toolBarManager) {
//	
//		
//		toolBarManager.update(true);
//	}

	public static void createSpacer(Composite parent, int horizontalSpan) {

		GridData gridData = new GridData();
		gridData.horizontalSpan = horizontalSpan;
		gridData.grabExcessHorizontalSpace = true;
		
		Label spacer = new Label(parent, SWT.NONE);
		spacer.setLayoutData(gridData);
	}

	public static Text createTextArea(Composite parent, String content, int width, int height){
		Text textArea = new Text(parent, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		textArea.setText(content);
		GridData gd = new GridData(SWT.LEFT, SWT.NONE,
				false, false, 1, 1);
		gd.widthHint = width;
		gd.heightHint = height;
		textArea.setLayoutData(gd);
		return textArea;
	}
	
	public static StyledText createStyledTextArea(Composite parent, String content, int width, int height,
			ModifyListener modifyListener){
		StyledText textArea = new StyledText(parent, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		textArea.setText(content);
		GridData gd = new GridData(SWT.LEFT, SWT.NONE,
				false, false, 1, 1);
		gd.widthHint = width;
		gd.heightHint = height;
		textArea.setLayoutData(gd);
		textArea.addModifyListener(modifyListener);
		return textArea;
	}
	
	
	
	public static String[] getXmlTexts(IFormPage page, int numberOfTexts){
		String[] xmlText = new String[numberOfTexts];
		Section[] sections = null;
		if (page instanceof WSPolicyPage)
			sections = ((WSPolicyPage)page).getSections();
		for (int i = 0; i < sections.length; i++){
			if (((Composite)sections[i].getClient()).getChildren()[0] instanceof StyledText)
				xmlText[i] = ((StyledText)((Composite)sections[i].getClient()).getChildren()[0]).getText();
			else
				xmlText[i] = "";
		}
		return xmlText;
	}


	public static Label createLabel(Composite parent, String text, boolean visible) {
		Label label = new Label(parent,  SWT.WRAP);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
		// to constraint the maximum width
		gridData.widthHint = 100;
		gridData.horizontalSpan = 1;
		label.setLayoutData(gridData);
		label.setText(text);
		label.setVisible(visible);
		return label;
	}
	
	
	public static Label createImageLabel(Composite parent, Image image, int columns, int height, int width, int horSpan) {
		Label label = new Label(parent,  SWT.WRAP);
		GridData gridData = new GridData(SWT.RIGHT, SWT.TOP, false, false);
		// to constraint the maximum width
		gridData.horizontalSpan = columns;
		gridData.horizontalSpan = horSpan;
		gridData.widthHint = width;
		gridData.heightHint= height;
		label.setLayoutData(gridData);
		label.setImage(image);
		return label;
	}

	public static void createFormLayout(Composite parent) {
		GridLayout formLayout = new GridLayout();
		formLayout.numColumns = 1;
		parent.setLayout(formLayout);
	}
	
	public static String formatStringToXmlString(String input){
		StringWriter writer = new StringWriter();

//		transformer.setOutputProperty(OutputPropertiesFactory.S_KEY_INDENT_AMOUNT,"1");
		try {
			Transformer transformer = TransformerFactory.newInstance()
	        .newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
//			
			transformer.transform(new StreamSource(new StringReader(input)),
			        new StreamResult(writer));
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        StringBuffer buffer = writer.getBuffer();
        return (buffer.toString());

	}

}