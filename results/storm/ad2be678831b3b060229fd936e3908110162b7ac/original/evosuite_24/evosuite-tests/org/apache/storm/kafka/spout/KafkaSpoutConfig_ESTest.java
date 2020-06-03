/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 14:46:45 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import clojure.lang.Range;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpoutConfig_ESTest extends KafkaSpoutConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-491));
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     java.lang.ClassCastException : java.lang.String cannot be cast to java.lang.Number
      // Modified Version:
      //     java.lang.NoClassDefFoundError : Could not initialize class clojure.lang.Numbers
      // Undeclared exception!
      try { 
        Range.create((Object) integer0, (Object) "recur");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Number
         //
         verifyException("clojure.lang.Numbers", e);
         assertTrue(e.getMessage().equals("java.lang.String cannot be cast to java.lang.Number"));   
      }
  }
}
