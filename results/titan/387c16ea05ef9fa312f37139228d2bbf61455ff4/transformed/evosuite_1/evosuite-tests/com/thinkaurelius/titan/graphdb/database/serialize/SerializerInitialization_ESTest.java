/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 19:16:08 GMT 2020
 */

package com.thinkaurelius.titan.graphdb.database.serialize;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.thinkaurelius.titan.diskstorage.ReadBuffer;
import com.thinkaurelius.titan.diskstorage.StaticBuffer;
import com.thinkaurelius.titan.diskstorage.util.ReadByteBuffer;
import com.thinkaurelius.titan.graphdb.database.serialize.Serializer;
import com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization;
import com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SerializerInitialization_ESTest extends SerializerInitialization_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      SerializerInitialization serializerInitialization0 = new SerializerInitialization();
      serializerInitialization0.RESERVED_ID_OFFSET = serializerInitialization0.KRYO_OFFSET;
      boolean boolean0 = false;
      KryoSerializer kryoSerializer0 = null;
      try {
        kryoSerializer0 = new KryoSerializer(boolean0);
      } catch(IllegalArgumentException e) {
         //
         // ID allocation overflow!
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      boolean boolean0 = false;
      KryoSerializer kryoSerializer0 = new KryoSerializer(boolean0);
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      Serializer serializer0 = null;
      // Undeclared exception!
      try { 
        SerializerInitialization.initialize(serializer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization", e);
      }
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      boolean boolean0 = true;
      KryoSerializer kryoSerializer0 = new KryoSerializer(boolean0);
      // Undeclared exception!
      try { 
        SerializerInitialization.initialize(kryoSerializer0);
      } catch(IllegalArgumentException e) {
         //
         // ID has already been registered: 41
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test4()  throws Throwable  {
      SerializerInitialization serializerInitialization0 = new SerializerInitialization();
      boolean boolean0 = true;
      KryoSerializer kryoSerializer0 = new KryoSerializer(boolean0);
      // Undeclared exception!
      try { 
        SerializerInitialization.initialize(kryoSerializer0);
      } catch(IllegalArgumentException e) {
         //
         // ID has already been registered: 41
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
