/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 02:07:12 GMT 2020
 */

package cuke4duke.internal.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cuke4duke.internal.java.JavaLanguage;
import cuke4duke.internal.language.LanguageMixin;
import cuke4duke.internal.language.StepDefinition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaLanguage_ESTest extends JavaLanguage_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      LanguageMixin languageMixin0 = mock(LanguageMixin.class, new ViolatedAssumptionAnswer());
      JavaLanguage javaLanguage0 = null;
      try {
        javaLanguage0 = new JavaLanguage(languageMixin0);
      } catch(RuntimeException e) {
         //
         // Missing system property: cuke4duke.objectFactory
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      LanguageMixin languageMixin0 = null;
      JavaLanguage javaLanguage0 = null;
      try {
        javaLanguage0 = new JavaLanguage(languageMixin0);
      } catch(RuntimeException e) {
         //
         // Missing system property: cuke4duke.objectFactory
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }
}
