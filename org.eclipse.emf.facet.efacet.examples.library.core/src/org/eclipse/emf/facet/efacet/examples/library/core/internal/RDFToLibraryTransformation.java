/*******************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 371367 - Hierarchical FacetSets
 *******************************************************************************/
package org.eclipse.emf.facet.efacet.examples.library.core.internal;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Book;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Library;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.LibraryFactory;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Writer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/** Transforms an RDF file (http://www.w3.org/RDF/) describing a library of books to a Library model */
public class RDFToLibraryTransformation extends DefaultHandler {

	private static final String LANGUAGE_FILTER = "fr"; //$NON-NLS-1$
	private static final String RDF_VALUE = "rdf:value"; //$NON-NLS-1$
	private static final String DC_LANGUAGE = "dc:language"; //$NON-NLS-1$
	private static final String DC_CREATOR = "dc:creator"; //$NON-NLS-1$
	private static final String DC_TITLE = "dc:title"; //$NON-NLS-1$
	private static final String LIBRARY_FILE_EXTENSION = "library"; //$NON-NLS-1$
	private static final String PGTERMS_ETEXT = "pgterms:etext"; //$NON-NLS-1$
	private static final String ENTITY_EXPANSION_LIMIT_KEY = "entityExpansionLimit"; //$NON-NLS-1$
	private static final String ENTITY_EXPANSION_LIMIT_VALUE = "1000000"; //$NON-NLS-1$
	
	private final File inputFile;
	private Library library;
	private Book currentBook;
	private StringBuilder lastText;
	private final Map<String, Writer> writers = new HashMap<String, Writer>();
	private boolean inLanguage;
	private String language;
	private String writerName;

	public RDFToLibraryTransformation(final File rdfFile) {
		this.inputFile = rdfFile;
		if (!rdfFile.exists()) {
			throw new IllegalArgumentException("the given file doesn't exist: " + rdfFile.toString()); //$NON-NLS-1$
		}
	}

	public void transform(final String outputPath) throws ParserConfigurationException, SAXException, IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(RDFToLibraryTransformation.LIBRARY_FILE_EXTENSION, new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createFileURI(outputPath));
		if (resource == null) {
			throw new RuntimeException("Couldn't create the model resource"); //$NON-NLS-1$
		}
		this.library = LibraryFactory.eINSTANCE.createLibrary();
		resource.getContents().add(this.library);

		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
		SAXParser parser = parserFactory.newSAXParser();
		parser.parse(this.inputFile, this);

		resource.save(null);
	}

	@Override
	public void startElement(final String uri, final String localName, final String qName, final Attributes attributes) throws SAXException {
		this.lastText = null;
		if (RDFToLibraryTransformation.DC_LANGUAGE.equals(qName)) {
			this.inLanguage = true;
		}
		if (RDFToLibraryTransformation.PGTERMS_ETEXT.equals(qName)) {
			this.currentBook = LibraryFactory.eINSTANCE.createBook();
		}
	}

	@Override
	public void characters(final char[] ch, final int start, final int length) throws SAXException {
		if (this.lastText == null) {
			this.lastText = new StringBuilder();
		}
		this.lastText.append(new String(ch, start, length));
	}

	@Override
	public void endElement(final String uri, final String localName, final String qName) throws SAXException {
		if (RDFToLibraryTransformation.DC_TITLE.equals(qName)) {
			this.currentBook.setName(this.lastText.toString());
		} else if (RDFToLibraryTransformation.DC_CREATOR.equals(qName)) {
			this.writerName = this.lastText.toString();
		} else if (RDFToLibraryTransformation.DC_LANGUAGE.equals(qName)) {
			this.inLanguage = false;
		} else if (RDFToLibraryTransformation.RDF_VALUE.equals(qName)) {
			if (this.inLanguage) {
				this.language = this.lastText.toString();
			}
		} else if (RDFToLibraryTransformation.PGTERMS_ETEXT.equals(qName)) {
			if (this.currentBook.getName() != null && RDFToLibraryTransformation.LANGUAGE_FILTER.equals(this.language)) {
				Writer writer = this.writers.get(this.writerName);
				if (writer == null) {
					writer = LibraryFactory.eINSTANCE.createWriter();
					writer.setName(this.writerName);
					this.library.getWriters().add(writer);
					this.writers.put(this.writerName, writer);
				}
				this.currentBook.setWriter(writer);
				this.library.getBooks().add(this.currentBook);
			}
			this.currentBook = null;
			this.language = null;
		}
	}

	public static void main(final String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("usage: java " + RDFToLibraryTransformation.class.getName() + " <rdfFile> <outputFile>"); //$NON-NLS-1$ //$NON-NLS-2$
			return;
		}
		System.setProperty(RDFToLibraryTransformation.ENTITY_EXPANSION_LIMIT_KEY, RDFToLibraryTransformation.ENTITY_EXPANSION_LIMIT_VALUE);
		File file = new File(args[0]);
		RDFToLibraryTransformation transformation = new RDFToLibraryTransformation(file);
		transformation.transform(args[1]);
		System.out.println("done"); //$NON-NLS-1$
	}
}
