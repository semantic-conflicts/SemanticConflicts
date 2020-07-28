/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 19:44:28 GMT 2020
 */

package com.thinkaurelius.titan.graphdb.database.serialize;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.thinkaurelius.titan.diskstorage.ReadBuffer;
import com.thinkaurelius.titan.diskstorage.util.ReadArrayBuffer;
import com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SerializerInitialization_ESTest extends SerializerInitialization_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KryoSerializer kryoSerializer0 = new KryoSerializer(false);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)90;
      ReadArrayBuffer readArrayBuffer0 = new ReadArrayBuffer(byteArray0);
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      ReadBuffer readBuffer0 = readArrayBuffer0.invert();
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     com.esotericsoftware.kryo.KryoException : Encountered unregistered class ID: -146186973
      // Undeclared exception!
      try { 
        kryoSerializer0.readClassAndObject(readBuffer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Encountered unregistered class ID: -93
         //
         verifyException("com.esotericsoftware.kryo.util.DefaultClassResolver", e);
         assertTrue(e.getMessage().equals("Encountered unregistered class ID: -93"));   
      }
  }
}