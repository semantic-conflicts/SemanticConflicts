/*
 * This file was automatically generated by EvoSuite
 * Fri May 01 15:59:22 GMT 2020
 */

package org.springframework.boot.context.embedded.undertow;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UndertowEmbeddedServletContainerFactory_ESTest extends UndertowEmbeddedServletContainerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new UndertowEmbeddedServletContainerFactory();
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      undertowEmbeddedServletContainerFactory0.getJspServlet();
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     java.lang.NumberFormatException : For input string: "E"
      try { 
        Integer.parseUnsignedInt("E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"E\"
         //
         verifyException("java.lang.NumberFormatException", e);
         assertTrue(e.getMessage().equals("For input string: \"E\""));   
      }
  }
}
