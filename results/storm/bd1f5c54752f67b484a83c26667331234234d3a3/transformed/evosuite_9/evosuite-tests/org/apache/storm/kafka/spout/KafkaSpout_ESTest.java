/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 09:09:28 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import clojure.lang.APersistentMap;
import clojure.lang.ISeq;
import clojure.lang.IteratorSeq;
import clojure.lang.PersistentHashMap;
import clojure.lang.PersistentTreeMap;
import clojure.lang.PersistentVector;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.internals.RecordHeaders;
import org.apache.kafka.common.record.TimestampType;
import org.apache.storm.generated.StormTopology;
import org.apache.storm.kafka.spout.KafkaSpout;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.kafka.spout.KafkaSpoutMessageId;
import org.apache.storm.kafka.spout.KafkaSpoutStreams;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsNamedTopics;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsWildcardTopics;
import org.apache.storm.kafka.spout.internal.KafkaConsumerFactory;
import org.apache.storm.kafka.spout.internal.KafkaConsumerFactoryDefault;
import org.apache.storm.task.TopologyContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpout_ESTest extends KafkaSpout_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      KafkaSpoutConfig<Object, Object> kafkaSpoutConfig0 = (KafkaSpoutConfig<Object, Object>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null, (KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactoryDefault<Object, Object> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<Object, Object>();
      KafkaSpout<Object, Object> kafkaSpout0 = new KafkaSpout<Object, Object>(kafkaSpoutConfig0, kafkaConsumerFactoryDefault0);
      KafkaSpout.Timer kafkaSpout_Timer0 = kafkaSpout0.new Timer();
      long long0 = 30L;
      kafkaSpout_Timer0.period = long0;
      long long1 = kafkaSpout_Timer0.period();
      KafkaConsumerFactoryDefault<KafkaSpoutStreamsWildcardTopics, KafkaSpout.OffsetEntry> kafkaConsumerFactoryDefault1 = new KafkaConsumerFactoryDefault<KafkaSpoutStreamsWildcardTopics, KafkaSpout.OffsetEntry>();
      KafkaSpout<KafkaSpoutStreamsWildcardTopics, KafkaSpout.OffsetEntry> kafkaSpout1 = new KafkaSpout<KafkaSpoutStreamsWildcardTopics, KafkaSpout.OffsetEntry>(kafkaSpout0.kafkaSpoutConfig, kafkaConsumerFactoryDefault1);
      // Undeclared exception!
      try { 
        kafkaSpout1.commitOffsetsForAckedTuples();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = (KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpout0 = new KafkaSpout<Object, KafkaSpoutStreamsWildcardTopics>(kafkaSpoutConfig0);
      long long0 = 0L;
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      OffsetAndMetadata offsetAndMetadata0 = new OffsetAndMetadata(kafkaSpoutConfig0.DEFAULT_MAX_RETRIES);
      // Undeclared exception!
      try { 
        kafkaSpout0.fail(offsetAndMetadata0);
      } catch(ClassCastException e) {
         //
         // org.apache.kafka.clients.consumer.OffsetAndMetadata cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutMessageId, Integer> kafkaSpoutConfig0 = null;
      KafkaSpout<KafkaSpoutMessageId, Integer> kafkaSpout0 = null;
      try {
        kafkaSpout0 = new KafkaSpout<KafkaSpoutMessageId, Integer>(kafkaSpoutConfig0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      KafkaSpoutConfig<Object, KafkaSpout.OffsetEntry> kafkaSpoutConfig0 = (KafkaSpoutConfig<Object, KafkaSpout.OffsetEntry>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<Object, KafkaSpout.OffsetEntry> kafkaSpout0 = new KafkaSpout<Object, KafkaSpout.OffsetEntry>(kafkaSpoutConfig0);
      // Undeclared exception!
      try { 
        kafkaSpout0.emit();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }
}
