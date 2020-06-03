/*
 * This file was automatically generated by EvoSuite
 * Sun May 03 08:26:25 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.storm.kafka.spout.KafkaSpout;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsNamedTopics;
import org.apache.storm.kafka.spout.internal.KafkaConsumerFactoryDefault;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpout_ESTest extends KafkaSpout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KafkaConsumerFactoryDefault<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsNamedTopics> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsNamedTopics>();
      KafkaSpout<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsNamedTopics> kafkaSpout0 = null;
      try {
        kafkaSpout0 = new KafkaSpout<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsNamedTopics>((KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsNamedTopics>) null, kafkaConsumerFactoryDefault0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }
}
