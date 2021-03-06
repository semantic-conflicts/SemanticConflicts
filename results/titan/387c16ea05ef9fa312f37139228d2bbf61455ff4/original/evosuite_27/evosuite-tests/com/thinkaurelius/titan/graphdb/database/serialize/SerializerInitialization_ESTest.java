/*
 * This file was automatically generated by EvoSuite
 * Sun May 03 05:30:09 GMT 2020
 */

package com.thinkaurelius.titan.graphdb.database.serialize;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.thinkaurelius.titan.diskstorage.ReadBuffer;
import com.thinkaurelius.titan.diskstorage.util.ReadArrayBuffer;
import com.thinkaurelius.titan.diskstorage.util.ReadByteBuffer;
import com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SerializerInitialization_ESTest extends SerializerInitialization_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KryoSerializer kryoSerializer0 = new KryoSerializer(true);
      byte[] byteArray0 = new byte[4];
      ReadArrayBuffer readArrayBuffer0 = new ReadArrayBuffer(byteArray0);
      ByteBuffer byteBuffer0 = readArrayBuffer0.asRelativeByteBuffer();
      ReadByteBuffer readByteBuffer0 = new ReadByteBuffer(byteBuffer0);
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      ReadBuffer readBuffer0 = readByteBuffer0.invert();
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     com.esotericsoftware.kryo.KryoException : Encountered unregistered class ID: 9981
      // Undeclared exception!
      try { 
        kryoSerializer0.readClassAndObject(readBuffer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Buffer underflow.
         //
         verifyException("com.esotericsoftware.kryo.io.Input", e);
         assertTrue(e.getMessage().equals("Buffer underflow."));   
      }
  }
}
