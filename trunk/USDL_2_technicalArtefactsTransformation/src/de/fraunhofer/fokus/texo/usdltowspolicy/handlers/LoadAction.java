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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;

import de.fraunhofer.fokus.texo.usdltowspolicy.Activator;

public class LoadAction implements Runnable {

	final IWorkspaceRoot root;

	public LoadAction(final IWorkspaceRoot root) {
		this.root = root;
	}

	@Override
	public void run() {

		final Shell dialog = new Shell(new Display());
		GridLayout gridLayout = new GridLayout(1, true);
		dialog.setLayout(gridLayout);
		dialog.setSize(400, 250);
		Monitor primary = dialog.getDisplay().getPrimaryMonitor();
		Rectangle bounds = primary.getBounds();
		Rectangle rect = dialog.getBounds();
		int x = bounds.x + (bounds.width - rect.width) / 2;
		int y = bounds.y + (bounds.height - rect.height) / 2;
		dialog.setLocation(x, y);
		dialog.setImage(Activator.getImageDescriptor("icons\\cogwheel.png")
				.createImage());
		dialog.setText("Generating Technical Security Policies");

		Label l = new Label(dialog, SWT.CENTER | SWT.FILL);
		l.setLayoutData(new GridData(400, 100));

		Label l2 = new Label(dialog, SWT.CENTER | SWT.FILL);

		l2.setText("ggggggggggg");
		l2.setLayoutData(new GridData(400, 25));

		l.setImage(Activator.getImageDescriptor(
				"icons\\TEXO_Logo_2009_positiv_de.jpg").createImage());

		final ProgressBar progressBar = new ProgressBar(dialog, SWT.CENTER
				| SWT.FILL | SWT.SMOOTH);

		// progressBar.setSize(300, 30);
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);
		GridData g = new GridData();
		g.horizontalAlignment = SWT.CENTER;
		g.widthHint = 300;
		g.heightHint = 30;
		progressBar.setLayoutData(g);
		

		String[] texts = new String[] { "", "Identifiability",
				"Transport Security", "Message Security", "Encryption",
				"Signature" };

		progressBar.addPaintListener(new PaintListener() {
			public void paintControl(PaintEvent e) {

				// string to draw.
				String string = Math.round(progressBar.getSelection() * 1.0
						/ (progressBar.getMaximum() - progressBar.getMinimum())
						* 100)
						+ "%";

				Point point = progressBar.getSize();
				Font font = new Font(dialog.getDisplay(), "Courier", 10,
						SWT.BOLD);
				e.gc.setFont(font);
				e.gc.setForeground(dialog.getDisplay().getSystemColor(
						SWT.COLOR_BLACK));

				FontMetrics fontMetrics = e.gc.getFontMetrics();
				int stringWidth = fontMetrics.getAverageCharWidth()
						* string.length();
				int stringHeight = fontMetrics.getHeight();

				e.gc.drawString(string, (point.x - stringWidth) / 2,
						(point.y - stringHeight) / 2, true);
				font.dispose();
			}
		});

		dialog.open();

		int k = 0;
		for (int i = 0; i <= 100; i++) {
			final int num = i;
			progressBar.setSelection(num);
			if (i % 20 == 0) {
				if (k == 0) {
					l2.setText("Loading platform specific security profile...");
					// dialog.redraw();
				} else if (i / 20 == 5)
					l2.setText("                                               ");
				else {
					l2.setText("Generating " + texts[k] + " policies...");
					// dialog.redraw();
				}
				k++;
			}
			try {
				Thread.sleep(70);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		try {
			ResourcesPlugin.getWorkspace().getRoot()
			.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e2) {
			e2.printStackTrace();
		}


	}

}
