package org.eclipse.emf.facet.widgets.table.ui.internal.widget.emf.listener;

import java.util.Collection;

import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class RowDeleteCommand extends DeleteCommand {

	public RowDeleteCommand(final EditingDomain domain, final Collection<?> collection) {
		super(domain, collection);
	}

}
