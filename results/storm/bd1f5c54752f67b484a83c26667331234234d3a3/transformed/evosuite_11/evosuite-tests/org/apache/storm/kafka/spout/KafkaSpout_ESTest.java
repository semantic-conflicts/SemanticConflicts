/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 09:15:35 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import clojure.lang.PersistentTreeMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpout_ESTest extends KafkaSpout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.NoClassDefFoundError : Could not initialize class clojure.lang.PersistentTreeMap
      PersistentTreeMap persistentTreeMap0 = PersistentTreeMap.EMPTY;
  }
}