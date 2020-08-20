/*******************************************************************************
 * Copyright (c) 2020- UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Walsh - Initial implementation
 *******************************************************************************/
package org.eclipse.ice.dev.annotations.processors;

import java.io.IOException;
import java.util.List;

import javax.annotation.processing.ProcessingEnvironment;
import javax.tools.JavaFileObject;

/**
 * Abstract class for service classes that generate SourceWriters
 *
 */
public abstract class AbstractWriterGenerator implements WriterGenerator {
	
	/**
	 * Used to create JavaFileObjects
	 */
	protected ProcessingEnvironment processingEnv;
	
	AbstractWriterGenerator(ProcessingEnvironment processingEnv){
		this.processingEnv = processingEnv;
	}
	
	/**
	 * Generates object used for writing templated class to
	 * @param name
	 * @return JavaFileObject used to write generated class file to
	 * @throws IOException
	 */
	public JavaFileObject createFileObjectForName(String name) throws IOException {
		return processingEnv.getFiler()
				.createSourceFile(name);
	}
}
