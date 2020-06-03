/*
 * This file was automatically generated by EvoSuite
 * Sun May 03 05:57:19 GMT 2020
 */

package com.thinkaurelius.titan.graphdb.database.serialize;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.thinkaurelius.titan.diskstorage.ReadBuffer;
import com.thinkaurelius.titan.diskstorage.util.ReadByteBuffer;
import com.thinkaurelius.titan.graphdb.database.serialize.attribute.CharacterSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SerializerInitialization_ESTest extends SerializerInitialization_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharacterSerializer characterSerializer0 = new CharacterSerializer();
      byte[] byteArray0 = new byte[1];
      ReadByteBuffer readByteBuffer0 = new ReadByteBuffer(byteArray0);
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      ReadBuffer readBuffer0 = readByteBuffer0.invert();
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     java.lang.ArrayIndexOutOfBoundsException : 1
      // Undeclared exception!
      try { 
        characterSerializer0.read(readBuffer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.thinkaurelius.titan.diskstorage.util.StaticArrayBuffer", e);
         assertTrue(e.getMessage().equals("1"));   
      }
  }
}
