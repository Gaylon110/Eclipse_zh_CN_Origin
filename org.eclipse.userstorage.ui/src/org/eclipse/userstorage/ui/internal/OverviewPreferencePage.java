package org.eclipse.userstorage.ui.internal;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class OverviewPreferencePage extends PreferencePage implements IWorkbenchPreferencePage
{
  @Override
  public void init(IWorkbench workbench)
  {
  }

  @Override
  protected Control createContents(Composite parent)
  {
    Composite container = new Composite(parent, SWT.NONE);

    Label label = new Label(container, SWT.WRAP);
    //@formatter:off
    label.setText("The Eclipse User Storage Service (USS) allows Eclipse projects to store "
        + "user-specific project information on the Eclipse Foundation servers. "
        + "The USS does not hold private or confidential data.");
    //@formatter:on

    // cause the label to wrap and reflow
    GridDataFactory.fillDefaults().grab(true, true).hint(1, 1).applyTo(label);
    GridLayoutFactory.swtDefaults().applyTo(container);

    applyDialogFont(container);
    return container;
  }
}
