/*******************************************************************************
 * Copyright (c) 2010, 2017 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.xtext.essentialocl.utilities;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.EnumerationLiteral;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.Feature;
import org.eclipse.ocl.pivot.LetExp;
import org.eclipse.ocl.pivot.LoopExp;
import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.Namespace;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.internal.complete.StandardLibraryInternal;
import org.eclipse.ocl.pivot.internal.context.AbstractParserContext;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.resource.ASResourceFactory;
import org.eclipse.ocl.pivot.internal.resource.ASResourceImpl;
import org.eclipse.ocl.pivot.internal.resource.AbstractASResourceFactory;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.internal.utilities.IllegalLibraryException;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.pivot.resource.ProjectManager;
import org.eclipse.ocl.pivot.util.DerivedConstants;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.eclipse.ocl.pivot.utilities.ParserContext;
import org.eclipse.ocl.pivot.utilities.PivotConstants;
import org.eclipse.ocl.xtext.base.as2cs.AS2CS;
import org.eclipse.ocl.xtext.base.cs2as.CS2AS;
import org.eclipse.ocl.xtext.base.cs2as.ImportDiagnostic;
import org.eclipse.ocl.xtext.base.cs2as.LibraryDiagnostic;
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.xtext.base.utilities.CSI2ASMapping;
import org.eclipse.ocl.xtext.base.utilities.ElementUtil;
import org.eclipse.ocl.xtext.base.utilities.ExtendedParserContext;
import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.PathElementCS;
import org.eclipse.ocl.xtext.basecs.PathElementWithURICS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.essentialocl.as2cs.EssentialOCLAS2CS;
import org.eclipse.ocl.xtext.essentialocl.attributes.NavigationUtil;
import org.eclipse.ocl.xtext.essentialocl.cs2as.EssentialOCLCS2AS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.impl.XtextLinkingDiagnostic;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.Triple;

public class EssentialOCLCSResource extends LazyLinkingResource implements BaseCSResource
{
	protected static final class UnixOutputStream extends OutputStream // FIXME Workaround for Bug 439440
	{
		protected final @NonNull OutputStream outputStream;

		protected UnixOutputStream(@NonNull OutputStream outputStream) {
			this.outputStream = outputStream;
		}

		@Override
		public void write(int b) throws IOException {
			if (b != '\r') {
				outputStream.write(b);
			}
		}
	}

	protected static class RenamedDiagnostic extends AbstractDiagnostic
	{
		private final SyntaxErrorMessage syntaxErrorMessage;
		private final INode error;
		private final String newMessage;

		protected RenamedDiagnostic(SyntaxErrorMessage syntaxErrorMessage, INode error, String newMessage) {
			this.syntaxErrorMessage = syntaxErrorMessage;
			this.error = error;
			this.newMessage = newMessage;
		}

		@Override
		public String getCode() {
			return syntaxErrorMessage.getIssueCode();
		}

		@Override
		public int getColumn() {
			return -1;
		}

		@Override
		public String[] getData() {
			return syntaxErrorMessage.getIssueData();
		}

		@Override
		public String getMessage() {
			return newMessage;
		}

		@Override
		protected INode getNode() {
			return error;
		}
	}

	public static class TransientASResourceFactory extends AbstractASResourceFactory
	{
		public static @NonNull TransientASResourceFactory INSTANCE = new TransientASResourceFactory();

		public TransientASResourceFactory() {
			super("transient");
		}

		@Override
		public @NonNull ASResourceFactory getASResourceFactory() {
			return INSTANCE;
		}
	}

	/**
	 * A TransientASResource acts as the ASResource while parsing the body of an ExpressionInOCL. It enables
	 * the parsing to behave as if it has a Resource within a ResourceSet without disturbing the ResourceSet
	 * which may provoke Bug 451268.
	 */
	public static class TransientASResource extends ASResourceImpl
	{
		protected final @NonNull ResourceSet asResourceSet;

		public TransientASResource(@NonNull ResourceSet asResourceSet, @NonNull URI asURI) {
			super(asURI, TransientASResourceFactory.INSTANCE);
			this.asResourceSet = asResourceSet;
		}

		@Override
		public @NonNull ResourceSet getResourceSet() {
			return asResourceSet;
		}
	}

	private static final String NO_VIABLE_ALTERNATIVE_AT_INPUT_EOF = "no viable alternative at input '<EOF>'";
	private static final String NO_VIABLE_ALTERNATIVE_FOLLOWING = "no viable alternative following input ";
	private static final String NO_VIABLE_ALTERNATIVE_AT = "no viable alternative at ";
	private static final String MISSING_EOF_AT = "missing EOF at ";

	private static final Logger logger = Logger.getLogger(EssentialOCLCSResource.class);

	private @Nullable ParserContext parserContext = null;
	private @Nullable ProjectManager projectMap = null;
	private boolean isDerived = false;		// True if this CSResource is the derived form of an edited ASResource.

	public EssentialOCLCSResource() {
		super();
		//		PivotUtilInternal.debugPrintln("Create " + NameUtil.debugSimpleName(this));
	}

	protected void addLibraryError(List<Diagnostic> errors, IllegalLibraryException e) {
		String message = e.getMessage();
		for (Resource.Diagnostic diagnostic : errors) {
			if (diagnostic instanceof LibraryDiagnostic) {
				Exception exception = ((LibraryDiagnostic)diagnostic).getException();
				if (exception instanceof IllegalLibraryException) {
					if (message.equals(exception.getMessage())) {
						return;
					}
				}
			}
		}
		errors.add(new LibraryDiagnostic(e));
	}

	@Override		// FIXME This workaround should be eliminated by a BUG 404438 fix
	protected void addSyntaxErrors() {
		if (isValidationDisabled()) {
			return;
		}
		IParseResult parseResult = getParseResult();
		if (parseResult == null) {
			return;
		}
		List<Diagnostic> errors2 = getErrors();
		for (final INode error : parseResult.getSyntaxErrors()) {
			AbstractDiagnostic diagnostic = null;
			final SyntaxErrorMessage syntaxErrorMessage = error.getSyntaxErrorMessage();
			if (syntaxErrorMessage != null) {
				String message = syntaxErrorMessage.getMessage();
				// BUG 404438 "no viable alternative at input '<EOF>'" message is unhelpful.
				if ((message != null) && message.contains(NO_VIABLE_ALTERNATIVE_AT_INPUT_EOF)){
					int index = message.indexOf(NO_VIABLE_ALTERNATIVE_AT_INPUT_EOF);
					if (index >= 0) {
						String tokenText = NodeModelUtils.getTokenText(error);
						if (tokenText != null) {
							final String newMessage = message.substring(0, index) + NO_VIABLE_ALTERNATIVE_FOLLOWING + "'" + tokenText + "'" + message.substring(index+NO_VIABLE_ALTERNATIVE_AT_INPUT_EOF.length());
							diagnostic = new RenamedDiagnostic(syntaxErrorMessage, error, newMessage);
						}
					}
				}
				else if ((message != null) && message.contains(MISSING_EOF_AT)){
					int index = message.indexOf(MISSING_EOF_AT);
					if (index >= 0) {
						String tokenText = NodeModelUtils.getTokenText(error);
						if (tokenText != null) {
							final String newMessage = message.substring(0, index) + NO_VIABLE_ALTERNATIVE_AT + message.substring(index+MISSING_EOF_AT.length());
							diagnostic = new RenamedDiagnostic(syntaxErrorMessage, error, newMessage);
						}
					}
				}
			}
			if (diagnostic == null) {
				diagnostic = new XtextSyntaxDiagnostic(error);
			}
			errors2.add(diagnostic);
		}
	}

	@Override
	public NotificationChain basicSetResourceSet(ResourceSet resourceSet, NotificationChain notifications) {
		//		if (resourceSet != null) {
		//			PivotMetamodelManager metamodelManager = PivotMetamodelManager.findAdapter(resourceSet);
		//FIXME This assertion is broken. It perhaps once tested for OCL-in-ResourceSet, but now is flaky depending on
		// the lazy construction time of the metamodelManager
		//			assert metamodelManager == null;
		//		}
		return super.basicSetResourceSet(resourceSet, notifications);
	}

	protected @NonNull ASResource createASResource(@NonNull ResourceSet asResourceSet) {
		URI uri = ClassUtil.nonNullState(getURI());
		URI asURI = getASURI(uri);
		if (uri.fileExtension().equals(PivotConstants.ESSENTIAL_OCL_FILE_EXTENSION)) {	// FIXME use csResource.getASResource(metamodelManager);
			return new TransientASResource(asResourceSet, asURI);
		}
		ASResource asResource = (ASResource) asResourceSet.getResource(asURI, false);
		if (asResource != null) {
			return asResource;
		}
		@SuppressWarnings("null")@NonNull Resource asResource2 = asResourceSet.createResource(asURI, getASContentType());
		return (ASResource) asResource2;
	}

	@Override
	public void createAndAddDiagnostic(Triple<EObject, EReference, INode> triple) {
		if (isValidationDisabled())
			return;
		EObject context = triple.getFirst();
		if (context instanceof ElementCS) {
			if (!hasError((ElementCS)context)) {
				super.createAndAddDiagnostic(triple);
				setHasError((ElementCS)context);
			}
		}
		else {
			super.createAndAddDiagnostic(triple);
		}
	}

	@Override
	public @NonNull CS2AS createCS2AS(@NonNull EnvironmentFactoryInternal environmentFactory, @NonNull ASResource asResource) {
		return new EssentialOCLCS2AS(environmentFactory, this, asResource);
	}

	@Override			// FIXME Bug 380232 workaround
	protected Diagnostic createDiagnostic(Triple<EObject, EReference, INode> triple, DiagnosticMessage message) {
		EObject first = triple.getFirst();
		if (first instanceof PathElementWithURICS) {
			return new ImportDiagnostic(triple.getThird(), message.getMessage(), message.getIssueCode(), message.getIssueData());
		}
		else {
			return new XtextLinkingDiagnostic(triple.getThird(), message.getMessage(), message.getIssueCode(), message.getIssueData())
			{
				@Override
				public int getColumn() {
					return -1;
				}
			};
		}
	}

	@Override
	public @NonNull AS2CS createAS2CS(@NonNull Map<? extends BaseCSResource, ? extends ASResource> cs2asResourceMap,
			@NonNull EnvironmentFactoryInternal environmentFactory) {
		return new EssentialOCLAS2CS(cs2asResourceMap, environmentFactory);
	}


	@Override
	public void dispose() {
		try {
			Method method = getClass().getMethod("clearLazyProxyInformation");		// Xtext 2.7 method
			if (method != null) {
				method.invoke(this);
			}
		}
		catch (Exception e) {}
		CS2AS cs2as = findCS2AS();
		if (cs2as != null) {
			cs2as.dispose();
		}
		//		unload();
	}

	@Override
	protected void doLinking() {
		//		CS2AS.printDiagnostic(getClass().getSimpleName() + ".doLinking start", false, +1);
		List<Diagnostic> errors = getErrors();
		if (errors.size() > 0) {
			for (int i = errors.size(); --i >= 0; ) {
				Diagnostic error = errors.get(i);
				if (error instanceof LibraryDiagnostic) {
					errors.remove(i);
				}
			}
		}
		super.doLinking();
		//		CS2AS.printDiagnostic(getClass().getSimpleName() + ".doLinking end", false, -1);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		//		CS2AS.printDiagnostic(getClass().getSimpleName() + ".doLoad start", false, +1);
		try {
			super.doLoad(inputStream, options);
		}
		finally {
			//			CS2AS.printDiagnostic(getClass().getSimpleName() + ".doLoad end", true, -1);
		}
	}

	@Override
	public void doSave(final OutputStream outputStream, Map<?, ?> options) throws IOException {	// FIXME Workaround Bug 439440
		if ((options != null) && "\n".equals(options.get(DerivedConstants.RESOURCE_OPTION_LINE_DELIMITER)) && (outputStream != null)) {
			super.doSave(new UnixOutputStream(outputStream), options);
		}
		else {
			super.doSave(outputStream, options);
		}
	}

	@Override
	public final @Nullable CS2AS findCS2AS() {
		EnvironmentFactoryInternal environmentFactory = PivotUtilInternal.findEnvironmentFactory(this);
		if (environmentFactory == null) {
			return null;
		}
		CSI2ASMapping csi2asMapping = CSI2ASMapping.basicGetCSI2ASMapping(environmentFactory);
		if (csi2asMapping == null) {
			return null;
		}
		return csi2asMapping.getCS2AS(this);
	}

	@Override
	public @NonNull String getASContentType() {
		return ASResource.ESSENTIALOCL_CONTENT_TYPE;
	}

	@Override
	public final @NonNull ASResource getASResource() {
		CS2AS cs2as = getCS2AS();
		ASResource asResource = cs2as.getASResource();
		return asResource;
	}

	@Override
	public @NonNull ASResourceFactory getASResourceFactory() {
		return EssentialOCLASResourceFactory.getInstance();
	}

	@Override
	public @NonNull URI getASURI(@NonNull URI csURI) {
		return csURI.appendFileExtension(PivotConstants.OCL_AS_FILE_EXTENSION);
	}

	@Override
	public @NonNull CS2AS getCS2AS() {
		EnvironmentFactoryInternal environmentFactory = PivotUtilInternal.getEnvironmentFactory(this);
		CSI2ASMapping csi2asMapping = CSI2ASMapping.basicGetCSI2ASMapping(environmentFactory);
		if (csi2asMapping != null) {
			CS2AS cs2as = csi2asMapping.getCS2AS(this);
			if (cs2as != null) {
				return cs2as;
			}
		}
		PivotMetamodelManager metamodelManager = environmentFactory.getMetamodelManager();
		ClassLoader classLoader = getClass().getClassLoader();
		if (classLoader != null) {
			metamodelManager.addClassLoader(classLoader);
		}
		ResourceSet asResourceSet = metamodelManager.getASResourceSet();
		@SuppressWarnings("null")@NonNull Registry resourceFactoryRegistry = asResourceSet.getResourceFactoryRegistry();
		initializeResourceFactory(resourceFactoryRegistry);
		ASResource asResource = createASResource(asResourceSet);
		CS2AS cs2as = null;
		if (parserContext instanceof ExtendedParserContext) {
			cs2as = ((ExtendedParserContext)parserContext).createCS2AS(this, asResource);
		}
		if (cs2as == null) {
			cs2as = createCS2AS(environmentFactory, asResource);
		}
		return cs2as;
	}
	/*	@Override
	public @NonNull MetamodelManager createMetamodelManager() {
		ResourceSet resourceSet = getResourceSet();
		if (resourceSet != null) {
			EnvironmentFactoryAdapter resourceSetAdapter = OCL.find(resourceSet);
			if (resourceSetAdapter != null) {
				return resourceSetAdapter.getMetamodelManager();
			}
		}
		return OCL.createEnvironmentFactory(projectMap).getMetamodelManager();
	} */

	@Override
	public final @NonNull CS2AS getCS2AS(@NonNull EnvironmentFactoryInternal environmentFactory, @NonNull ASResource asResource) {
		@SuppressWarnings("null")@NonNull Registry resourceFactoryRegistry = environmentFactory.getMetamodelManager().getASResourceSet().getResourceFactoryRegistry();
		initializeResourceFactory(resourceFactoryRegistry);
		CS2AS cs2as = findCS2AS();
		assert cs2as == null;
		//		if (cs2as == null) {
		cs2as = createCS2AS(environmentFactory, asResource);
		//		}
		return cs2as;
	}

	@Override
	public @NonNull String getEditorName() {
		return "Essential OCL";
	}

	@Override
	public final @Nullable ParserContext getParserContext() {		// FIXME only non-null for API compatibility
		if (parserContext == null) {
			parserContext = new AbstractParserContext(getEnvironmentFactory(), uri) {};
		}
		return parserContext;
	}

	@Override
	public @NonNull EnvironmentFactory getEnvironmentFactory() {
		CS2AS csAdapter = getCS2AS();
		return csAdapter.getEnvironmentFactory();
	}

	@Override
	public @Nullable ProjectManager getProjectManager() {
		return projectMap ;
	}

	protected boolean hasError(ElementCS csElement) {
		while ((csElement instanceof PathElementCS) || (csElement instanceof PathNameCS)) {
			csElement = csElement.getParent();
		}
		while (csElement instanceof ExpCS) {
			if (((ExpCS) csElement).isHasError()) {
				return true;
			}
			csElement = csElement.getParent();
			if (!NavigationUtil.isNavigationInfixExp(csElement) && !(csElement instanceof NameExpCS)) {
				break;
			}
		}
		return false;
	}

	/**
	 * Install any required extension/content-type registrations to enable AS Resources
	 * to be created satisfactorily.
	 */
	protected void initializeResourceFactory(Resource.Factory.@NonNull Registry resourceFactoryRegistry) {}

	@Override
	public boolean isDerived() {
		return isDerived;
	}

	@Override
	public @Nullable NamedElement isPathable(@NonNull EObject element) {
		if (element instanceof Feature) {
			return (Feature)element;
		}
		else if (element instanceof Type) {
			return (Type)element;
		}
		else if (element instanceof Namespace) {
			return (Namespace)element;
		}
		else if (element instanceof EnumerationLiteral) {
			return (EnumerationLiteral)element;
		}
		else if ((element instanceof Variable) && (element.eContainer() instanceof LoopExp)) {
			return (Variable)element;
		}
		else if ((element instanceof Variable) && (element.eContainer() instanceof LetExp)) {
			return (Variable)element;
		}
		else if ((element instanceof Variable) && (element.eContainer() instanceof ExpressionInOCL)) {
			return (Variable)element;
		}
		// ?? Constraint, Signal, ...
		else {
			return null;
		}
	}

	@Override
	public void reparse(String newContent) throws IOException {
		try {
			super.reparse(newContent);
		}
		catch (IllegalArgumentException e) {
			logger.error("Failed to reparse", e);
		}
	}

	@Override
	public final @NonNull URI resolve(@NonNull URI uri) {
		URI csURI = getURI();
		if (csURI.isRelative()) {
			File csRelative = new File(csURI.toFileString());
			File csAbsolute = csRelative.getAbsoluteFile();
			csURI = URI.createFileURI(csAbsolute.toString());
		}
		URI resolvedURI = uri.resolve(csURI);
		assert resolvedURI != null;
		return resolvedURI;
	}

	@Override
	public void resolveLazyCrossReferences(CancelIndicator mon) {	// FIXME move to Validation rules
		List<Diagnostic> errors = getErrors();
		assert errors != null;
		if (ElementUtil.hasSyntaxError(errors)) {
			return;
		}
		EnvironmentFactoryInternal environmentFactory = PivotUtilInternal.findEnvironmentFactory(this);
		if (environmentFactory != null) {
			StandardLibraryInternal standardLibrary = environmentFactory.getStandardLibrary();
			//			if (metamodelManager.getLibraryResource() != org.eclipse.ocl.library.oclstdlib.OCLstdlib.INSTANCE) {
			//				metamodelManager.resetLibrary();		// FIXME is this needed; if so test it
			//			}
			try {
				standardLibrary.getOclAnyType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getOclElementType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getOclVoidType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getOclInvalidType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getClassType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getBooleanType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getRealType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getIntegerType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getUnlimitedNaturalType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getStringType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getCollectionType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getBagType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getSequenceType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getSetType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getOrderedSetType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getOclEnumerationType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getOclTupleType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
			try {
				standardLibrary.getOclLambdaType();
			} catch (IllegalLibraryException e) {
				addLibraryError(errors, e);
			}
		}
		super.resolveLazyCrossReferences(mon);
	}

	@Override
	public void setDerived(boolean isDerived) {
		this.isDerived = isDerived;
	}

	protected void setHasError(ElementCS csElement) {
		while ((csElement instanceof PathElementCS) || (csElement instanceof PathNameCS)) {
			csElement = csElement.getParent();
		}
		while (csElement instanceof ExpCS) {
			((ExpCS) csElement).setHasError(true);
			csElement = csElement.getParent();
			if (!NavigationUtil.isNavigationInfixExp(csElement)) {
				break;
			}
		}
	}

	@Override
	public final void setParserContext(@Nullable ParserContext parserContext) {
		this.parserContext = parserContext;
	}

	@Override
	public void setProjectManager(@Nullable ProjectManager projectMap) {
		this.projectMap = projectMap;
	}

	//	@Override
	//	public void setURI(URI uri) {
	//		assert uri != null;
	//		assert !PivotUtilInternal.isASURI(uri);
	//		super.setURI(uri);
	//	}

	@Override
	public void update(@NonNull IDiagnosticConsumer diagnosticsConsumer) {
		CS2AS cs2as = getCS2AS();
		cs2as.update(diagnosticsConsumer);
	}

	@Override
	public void updateFrom(@NonNull ASResource asResource, @NonNull EnvironmentFactory environmentFactory) {
		Map<BaseCSResource, ASResource> cs2asResourceMap = new HashMap<BaseCSResource, ASResource>();
		cs2asResourceMap.put(this, asResource);
		AS2CS as2cs = createAS2CS(cs2asResourceMap, (EnvironmentFactoryInternal) environmentFactory);
		as2cs.update();
	}
}
