/*
 * This file was automatically generated by EvoSuite
 * Fri May 01 16:33:41 GMT 2020
 */

package org.springframework.boot.context.embedded.undertow;

import org.junit.Test;
import static org.junit.Assert.*;
import io.undertow.servlet.api.DeploymentInfo;
import io.undertow.servlet.core.DeploymentManagerImpl;
import io.undertow.servlet.core.ServletContainerImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UndertowEmbeddedServletContainerFactory_ESTest extends UndertowEmbeddedServletContainerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DeploymentInfo deploymentInfo0 = new DeploymentInfo();
      ServletContainerImpl servletContainerImpl0 = new ServletContainerImpl();
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     org.evosuite.testcase.execution.CodeUnderTestException : org.evosuite.testcase.execution.UncompilableCodeException: Cannot assign io.undertow.servlet.api.DeploymentInfo to class io.undertow.servlet.api.DeploymentInfo
      DeploymentManagerImpl deploymentManagerImpl0 = new DeploymentManagerImpl(deploymentInfo0, servletContainerImpl0);
  }
}