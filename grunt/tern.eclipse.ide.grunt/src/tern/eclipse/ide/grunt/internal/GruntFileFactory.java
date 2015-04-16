/**
 *  Copyright (c) 2013-2014 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package tern.eclipse.ide.grunt.internal;

import org.eclipse.core.resources.IFile;

import fr.opensagres.eclipse.jsbuild.core.IJSBuildFile;
import fr.opensagres.eclipse.jsbuild.core.IJSBuildFileFactory;

public class GruntFileFactory implements IJSBuildFileFactory {

	private static final String GRUNTFILE_JS = "Gruntfile.js";

	@Override
	public boolean isAdaptFor(IFile file) {
		return GRUNTFILE_JS.equals(file.getName());
	}

	@Override
	public IJSBuildFile create(IFile file, String factoryId) {
		return new GruntFile(file, factoryId);
	}
}
