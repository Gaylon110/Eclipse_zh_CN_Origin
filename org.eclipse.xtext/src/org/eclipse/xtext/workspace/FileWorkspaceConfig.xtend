/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.workspace

import java.io.File
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static extension org.eclipse.xtext.util.UriUtil.*
import org.eclipse.xtext.util.UriUtil
import org.eclipse.xtend.lib.annotations.Data

class FileProjectConfig implements IProjectConfig {
	val URI path
	val String name
	val Set<FileSourceFolder> sourceFolders = newHashSet
	
	new (URI path) {
		this(path, path.lastSegment)
	}
	
	new (URI path, String name) {
		this.path = path
		this.name = name
	}
	
	new (File root, String name) {
		this(UriUtil.createFolderURI(root), name)
	}
	
	new (File root) {
		this(UriUtil.createFolderURI(root), root.name)
	}

	def FileSourceFolder addSourceFolder(String relativePath) {
		val sourceFolder = new FileSourceFolder(this, relativePath)
		sourceFolders += sourceFolder
		sourceFolder
	}

	override FileSourceFolder findSourceFolderContaining(URI member) {
		sourceFolders.findFirst[source|source.path.isPrefixOf(member)]
	}

	override getName() {
		name
	}

	override getPath() {
		path
	}

	override Set<FileSourceFolder> getSourceFolders() {
		sourceFolders
	}

	override equals(Object obj) {
		if (obj instanceof FileProjectConfig) {
			return path == obj.path
		}
		return false
	}

	override hashCode() {
		path.hashCode
	}
	
	override toString() {
		'''Project ?name? (?path?)'''
	}
	
	override getWorkspaceConfig() {
		return new SingleProjectWorkspaceConfig(this)
	}

}

@FinalFieldsConstructor
class FileSourceFolder implements ISourceFolder {
	val FileProjectConfig parent
	val String name

	override getName() {
		name
	}

	override getPath() {
		val result = URI.createFileURI(name).resolve(parent.path)
		if (result.hasTrailingPathSeparator) {
		    return result
		} else {
		    return result.appendSegment("")
		}
	}

	override equals(Object obj) {
		if (obj instanceof FileSourceFolder) {
			return path == obj.path
		}
		return false
	}

	override hashCode() {
		path.hashCode
	}
	
	override toString() {
		'''?name? (?path?)'''
	}
	
}

@Data
class SingleProjectWorkspaceConfig implements IWorkspaceConfig {
	
	IProjectConfig projectConfig
	
	override findProjectByName(String name) {
		if (projectConfig.name == name)
			return projectConfig
	}
	
	override findProjectContaining(URI member) {
		if (projectConfig.path.isPrefixOf(member))
			return projectConfig
	}
	
	override getProjects() {
		return #{projectConfig}
	}
	
}