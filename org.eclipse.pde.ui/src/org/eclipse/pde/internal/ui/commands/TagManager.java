/*******************************************************************************
 *  Copyright (c) 2006, 2016 IBM Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.pde.internal.ui.commands;

import java.util.*;
import org.eclipse.core.commands.Command;
import org.eclipse.core.runtime.ListenerList;

public class TagManager {

	private Hashtable<Command, String> fCommandToTags = new Hashtable<>();
	private ListenerList<Listener> fListeners = new ListenerList<>();

	public void update(Command command, String tags) {
		if ((tags == null) || ("".equals(tags))) { //$NON-NLS-1$
			fCommandToTags.remove(command);
		} else {
			fCommandToTags.put(command, tags);
		}
		fireTagManagerChanged();
	}

	private boolean hasTag(String tags, String tag) {
		String[] tagArray = tags.split(","); //$NON-NLS-1$
		for (String string : tagArray) {
			String trimTag = string.trim();
			if (tag.equalsIgnoreCase(trimTag))
				return true;
		}

		return false;
	}

	public String[] getTags() {
		HashSet<String> tagSet = new HashSet<>();
		for (String tags : fCommandToTags.values()) {
			String[] tagArray = tags.split(","); //$NON-NLS-1$
			for (String string : tagArray) {
				String trimTag = string.trim();
				tagSet.add(trimTag);
			}
		}

		return tagSet.toArray(new String[tagSet.size()]);
	}

	public String getTags(Command command) {
		String tags = fCommandToTags.get(command);
		if (tags == null)
			return ""; //$NON-NLS-1$
		return tags;
	}

	public Command[] getCommands(String tag) {
		ArrayList<Command> list = new ArrayList<>();

		for (Command command : fCommandToTags.keySet()) {
			String tags = fCommandToTags.get(command);
			if (hasTag(tags, tag)) {
				list.add(command);
			}
		}

		return list.toArray(new Command[list.size()]);
	}

	public interface Listener {
		void tagManagerChanged();
	}

	public void addListener(Listener listener) {
		fListeners.add(listener);
	}

	public void removeListener(Listener listener) {
		fListeners.remove(listener);
	}

	private void fireTagManagerChanged() {
		for (Listener listener : fListeners) {
			listener.tagManagerChanged();
		}
	}

}
