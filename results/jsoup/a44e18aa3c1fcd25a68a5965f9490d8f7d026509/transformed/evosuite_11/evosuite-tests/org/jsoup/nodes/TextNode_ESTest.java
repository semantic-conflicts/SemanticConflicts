/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 17:55:42 GMT 2020
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextNode_ESTest extends TextNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextNode textNode0 = new TextNode("     ", "Split offset must not be greater than current text length");
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : java.lang.ClassCastException@4b1b2fd8
      textNode0.childNodesCopy();
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "     ");
      char[] charArray0 = new char[7];
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     java.lang.StringIndexOutOfBoundsException : String index out of range: -922
      // Undeclared exception!
      try { 
        stringBuilder0.insert((-922), charArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -922
         //
         verifyException("java.lang.AbstractStringBuilder", e);
         assertTrue(e.getMessage().equals("String index out of range: -922"));   
      }
  }
}
