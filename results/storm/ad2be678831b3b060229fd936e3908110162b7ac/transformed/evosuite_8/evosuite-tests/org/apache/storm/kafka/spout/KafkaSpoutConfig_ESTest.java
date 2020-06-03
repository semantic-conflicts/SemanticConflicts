/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 07:42:04 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import clojure.lang.PersistentHashMap;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsNamedTopics;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsWildcardTopics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpoutConfig_ESTest extends KafkaSpoutConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics>();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) kafkaSpoutConfig0;
      objectArray0[2] = (Object) kafkaSpoutConfig0;
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : Duplicate key: KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}
      // Modified Version:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : Duplicate key: KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}
      // Undeclared exception!
      try { 
        PersistentHashMap.createWithCheck(objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Duplicate key: KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}
         //
         verifyException("clojure.lang.PersistentHashMap", e);
         assertTrue(e.getMessage().equals("Duplicate key: KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));   
      }
  }
}
