package org.eclipse.emf.ecp.e4.emfstore;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecp.emfstore.internal.ui.handler.UpdateProjectHelper;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.swt.widgets.Shell;

public class UpdateToVersionHandler {
	@Execute
	public void execute(Shell shell,
		@Named(IServiceConstants.ACTIVE_SELECTION) @Optional InternalProject project) {
		if (project != null) {
			UpdateProjectHelper.updateToVersion(project, shell);
		}
	}

}