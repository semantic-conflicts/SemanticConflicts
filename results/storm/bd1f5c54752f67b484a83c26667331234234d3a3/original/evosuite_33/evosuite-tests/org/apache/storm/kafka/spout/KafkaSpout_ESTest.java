/*
 * This file was automatically generated by EvoSuite
 * Sun May 03 08:47:33 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import clojure.lang.APersistentMap;
import clojure.lang.APersistentVector;
import clojure.lang.ArraySeq;
import clojure.lang.IPersistentVector;
import clojure.lang.ISeq;
import clojure.lang.PersistentArrayMap;
import clojure.lang.PersistentHashMap;
import clojure.lang.PersistentList;
import clojure.lang.PersistentTreeMap;
import java.security.Principal;
import java.sql.DataTruncation;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.hadoop.fs.DelegationTokenRenewer;
import org.apache.hadoop.hdfs.web.HsftpFileSystem;
import org.apache.hadoop.security.token.delegation.web.DelegationTokenIdentifier;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.header.internals.RecordHeaders;
import org.apache.kafka.common.record.TimestampType;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.storm.generated.Credentials;
import org.apache.storm.generated.StormTopology;
import org.apache.storm.kafka.spout.KafkaSpout;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.kafka.spout.KafkaSpoutMessageId;
import org.apache.storm.kafka.spout.KafkaSpoutStreams;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsNamedTopics;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsWildcardTopics;
import org.apache.storm.kafka.spout.internal.KafkaConsumerFactory;
import org.apache.storm.kafka.spout.internal.KafkaConsumerFactoryDefault;
import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.OutputFieldsGetter;
import org.apache.storm.tuple.Fields;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpout_ESTest extends KafkaSpout_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      KafkaSpoutConfig<OffsetAndMetadata, AbstractMap.SimpleEntry<TopicPartition, APersistentVector.SubVector>> kafkaSpoutConfig0 = null;
      KafkaSpout<OffsetAndMetadata, AbstractMap.SimpleEntry<TopicPartition, APersistentVector.SubVector>> kafkaSpout0 = null;
      try {
        kafkaSpout0 = new KafkaSpout<OffsetAndMetadata, AbstractMap.SimpleEntry<TopicPartition, APersistentVector.SubVector>>(kafkaSpoutConfig0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      KafkaSpoutConfig<String, HsftpFileSystem> kafkaSpoutConfig0 = (KafkaSpoutConfig<String, HsftpFileSystem>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      KafkaConsumerFactoryDefault<String, HsftpFileSystem> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<String, HsftpFileSystem>();
      KafkaSpoutConfig<String, HsftpFileSystem> kafkaSpoutConfig1 = (KafkaSpoutConfig<String, HsftpFileSystem>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((Map) null).when(kafkaSpoutConfig1).getKafkaProps();
      doReturn((Deserializer) null).when(kafkaSpoutConfig1).getKeyDeserializer();
      doReturn((Deserializer) null).when(kafkaSpoutConfig1).getValueDeserializer();
      // Undeclared exception!
      try { 
        kafkaConsumerFactoryDefault0.createConsumer(kafkaSpoutConfig1);
      } catch(RuntimeException e) {
         //
         // Missing required configuration \"key.deserializer\" which has no default value.
         //
         verifyException("org.apache.kafka.common.config.ConfigDef", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try { 
        KafkaSpoutConfig.FirstPollOffsetStrategy.valueOf(string0);
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, Principal> kafkaSpoutConfig0 = (KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, Principal>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<KafkaSpoutStreamsNamedTopics, Principal> kafkaSpout0 = new KafkaSpout<KafkaSpoutStreamsNamedTopics, Principal>(kafkaSpoutConfig0);
      String string0 = null;
      // Undeclared exception!
      try { 
        kafkaSpout0.ack(string0);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      KafkaSpoutConfig<APersistentVector.SubVector, TopicPartition> kafkaSpoutConfig0 = (KafkaSpoutConfig<APersistentVector.SubVector, TopicPartition>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<APersistentVector.SubVector, TopicPartition> kafkaSpout0 = new KafkaSpout<APersistentVector.SubVector, TopicPartition>(kafkaSpoutConfig0);
      // Undeclared exception!
      try { 
        kafkaSpout0.close();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpout<Object, Object>, TopicPartition> kafkaSpoutConfig0 = (KafkaSpoutConfig<KafkaSpout<Object, Object>, TopicPartition>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactory<KafkaSpout<Object, Object>, TopicPartition> kafkaConsumerFactory0 = null;
      KafkaSpout<KafkaSpout<Object, Object>, TopicPartition> kafkaSpout0 = new KafkaSpout<KafkaSpout<Object, Object>, TopicPartition>(kafkaSpoutConfig0, kafkaConsumerFactory0);
      String string0 = kafkaSpout0.toString();
      String string1 = "2':(VG.";
      // Undeclared exception!
      try { 
        KafkaSpoutConfig.FirstPollOffsetStrategy.valueOf(string1);
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.2':(VG.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      KafkaSpoutConfig<OffsetAndMetadata, KafkaSpout<TopicPartition, Integer>> kafkaSpoutConfig0 = (KafkaSpoutConfig<OffsetAndMetadata, KafkaSpout<TopicPartition, Integer>>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactory<OffsetAndMetadata, KafkaSpout<TopicPartition, Integer>> kafkaConsumerFactory0 = null;
      KafkaSpout<OffsetAndMetadata, KafkaSpout<TopicPartition, Integer>> kafkaSpout0 = new KafkaSpout<OffsetAndMetadata, KafkaSpout<TopicPartition, Integer>>(kafkaSpoutConfig0, kafkaConsumerFactory0);
      PersistentTreeMap persistentTreeMap0 = PersistentTreeMap.EMPTY;
      APersistentMap.ValSeq aPersistentMap_ValSeq0 = APersistentMap.ValSeq.createFromMap(persistentTreeMap0);
      PersistentHashMap persistentHashMap0 = PersistentHashMap.createWithCheck((ISeq) aPersistentMap_ValSeq0);
      StormTopology stormTopology0 = new StormTopology(persistentHashMap0, persistentTreeMap0, persistentTreeMap0);
      String string0 = "Gym.zSP@'f~|(O)Wt";
      String string1 = "Committed offsets [{}-{} = {}] for topic-partition [{}]. [{}] uncommitted offsets across all topic partitions";
      AtomicBoolean atomicBoolean0 = new AtomicBoolean();
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      KafkaSpoutConfig<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, TopicPartition> kafkaSpoutConfig0 = (KafkaSpoutConfig<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, TopicPartition>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactoryDefault<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, TopicPartition> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, TopicPartition>();
      KafkaSpout<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, TopicPartition> kafkaSpout0 = new KafkaSpout<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, TopicPartition>(kafkaSpoutConfig0, kafkaConsumerFactoryDefault0);
      ConsumerRecords<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, TopicPartition> consumerRecords0 = ConsumerRecords.empty();
      kafkaSpout0.setWaitingToEmit(consumerRecords0);
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      KafkaSpoutConfig<TopicPartition, AbstractMap.SimpleImmutableEntry<DelegationTokenIdentifier, DelegationTokenIdentifier>> kafkaSpoutConfig0 = (KafkaSpoutConfig<TopicPartition, AbstractMap.SimpleImmutableEntry<DelegationTokenIdentifier, DelegationTokenIdentifier>>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactory<TopicPartition, AbstractMap.SimpleImmutableEntry<DelegationTokenIdentifier, DelegationTokenIdentifier>> kafkaConsumerFactory0 = null;
      KafkaSpout<TopicPartition, AbstractMap.SimpleImmutableEntry<DelegationTokenIdentifier, DelegationTokenIdentifier>> kafkaSpout0 = new KafkaSpout<TopicPartition, AbstractMap.SimpleImmutableEntry<DelegationTokenIdentifier, DelegationTokenIdentifier>>(kafkaSpoutConfig0, kafkaConsumerFactory0);
      ConsumerRecords<TopicPartition, AbstractMap.SimpleImmutableEntry<DelegationTokenIdentifier, DelegationTokenIdentifier>> consumerRecords0 = ConsumerRecords.empty();
      kafkaSpout0.setWaitingToEmit(consumerRecords0);
      // Undeclared exception!
      try { 
        kafkaSpout0.ack(kafkaConsumerFactory0);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      KafkaSpoutConfig<Integer, OffsetAndMetadata> kafkaSpoutConfig0 = (KafkaSpoutConfig<Integer, OffsetAndMetadata>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<Integer, OffsetAndMetadata> kafkaSpout0 = new KafkaSpout<Integer, OffsetAndMetadata>(kafkaSpoutConfig0);
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig1 = (KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig1).getKafkaSpoutStreams();
      KafkaSpout<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpout1 = new KafkaSpout<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics>(kafkaSpoutConfig1);
      // Undeclared exception!
      try { 
        kafkaSpout1.fail(kafkaSpout0);
      } catch(ClassCastException e) {
         //
         // org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      KafkaSpoutConfig<Object, TopicPartition> kafkaSpoutConfig0 = (KafkaSpoutConfig<Object, TopicPartition>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactoryDefault<Object, TopicPartition> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<Object, TopicPartition>();
      KafkaSpout<Object, TopicPartition> kafkaSpout0 = new KafkaSpout<Object, TopicPartition>(kafkaSpoutConfig0, kafkaConsumerFactoryDefault0);
      OutputFieldsDeclarer outputFieldsDeclarer0 = null;
      // Undeclared exception!
      try { 
        kafkaSpout0.declareOutputFields(outputFieldsDeclarer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      KafkaSpoutConfig<Object, OffsetAndMetadata> kafkaSpoutConfig0 = (KafkaSpoutConfig<Object, OffsetAndMetadata>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<Object, OffsetAndMetadata> kafkaSpout0 = new KafkaSpout<Object, OffsetAndMetadata>(kafkaSpoutConfig0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        kafkaSpout0.fail(object0);
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, KafkaSpout<String, Object>> kafkaSpoutConfig0 = (KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, KafkaSpout<String, Object>>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<KafkaSpoutStreamsWildcardTopics, KafkaSpout<String, Object>> kafkaSpout0 = new KafkaSpout<KafkaSpoutStreamsWildcardTopics, KafkaSpout<String, Object>>(kafkaSpoutConfig0);
      KafkaSpoutConfig<ConsumerRecord<Integer, Object>, Object> kafkaSpoutConfig1 = null;
      KafkaConsumerFactoryDefault<ConsumerRecord<Integer, Object>, Object> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<ConsumerRecord<Integer, Object>, Object>();
      KafkaSpout<ConsumerRecord<Integer, Object>, Object> kafkaSpout1 = null;
      try {
        kafkaSpout1 = new KafkaSpout<ConsumerRecord<Integer, Object>, Object>(kafkaSpoutConfig1, kafkaConsumerFactoryDefault0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      KafkaSpoutConfig<String, OffsetAndMetadata> kafkaSpoutConfig0 = (KafkaSpoutConfig<String, OffsetAndMetadata>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(kafkaSpoutConfig0).getConsumerGroupId();
      doReturn((Map) null).when(kafkaSpoutConfig0).getKafkaProps();
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<String, OffsetAndMetadata> kafkaSpout0 = new KafkaSpout<String, OffsetAndMetadata>(kafkaSpoutConfig0);
      Map<String, Object> map0 = kafkaSpout0.getComponentConfiguration();
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      KafkaSpoutConfig<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, Object> kafkaSpoutConfig0 = (KafkaSpoutConfig<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, Object>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactory<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, Object> kafkaConsumerFactory0 = null;
      KafkaSpout<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, Object> kafkaSpout0 = new KafkaSpout<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, Object>(kafkaSpoutConfig0, kafkaConsumerFactory0);
      // Undeclared exception!
      try { 
        kafkaSpout0.activate();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      KafkaSpoutConfig<DelegationTokenIdentifier, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = (KafkaSpoutConfig<DelegationTokenIdentifier, KafkaSpoutStreamsWildcardTopics>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactory<DelegationTokenIdentifier, KafkaSpoutStreamsWildcardTopics> kafkaConsumerFactory0 = null;
      KafkaSpout<DelegationTokenIdentifier, KafkaSpoutStreamsWildcardTopics> kafkaSpout0 = new KafkaSpout<DelegationTokenIdentifier, KafkaSpoutStreamsWildcardTopics>(kafkaSpoutConfig0, kafkaConsumerFactory0);
      ArraySeq arraySeq0 = ArraySeq.create();
      PersistentTreeMap persistentTreeMap0 = PersistentTreeMap.create((ISeq) arraySeq0);
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      KafkaSpoutConfig<Object, Credentials._Fields> kafkaSpoutConfig0 = null;
      KafkaSpout<Object, Credentials._Fields> kafkaSpout0 = null;
      try {
        kafkaSpout0 = new KafkaSpout<Object, Credentials._Fields>(kafkaSpoutConfig0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      KafkaSpoutConfig<TopicPartition, Credentials._Fields> kafkaSpoutConfig0 = (KafkaSpoutConfig<TopicPartition, Credentials._Fields>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactoryDefault<TopicPartition, Credentials._Fields> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<TopicPartition, Credentials._Fields>();
      KafkaSpout<TopicPartition, Credentials._Fields> kafkaSpout0 = new KafkaSpout<TopicPartition, Credentials._Fields>(kafkaSpoutConfig0, kafkaConsumerFactoryDefault0);
      String string0 = kafkaSpout0.toString();
      KafkaSpoutConfig<Object, Object> kafkaSpoutConfig1 = (KafkaSpoutConfig<Object, Object>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig1).getKafkaSpoutStreams();
      KafkaConsumerFactoryDefault<Object, Object> kafkaConsumerFactoryDefault1 = new KafkaConsumerFactoryDefault<Object, Object>();
      KafkaSpout<Object, Object> kafkaSpout1 = new KafkaSpout<Object, Object>(kafkaSpoutConfig1, kafkaConsumerFactoryDefault1);
      String string1 = kafkaSpout1.toString();
      KafkaSpoutConfig<AbstractMap.SimpleEntry<KafkaSpoutStreamsNamedTopics, Integer>, TopicPartition> kafkaSpoutConfig2 = (KafkaSpoutConfig<AbstractMap.SimpleEntry<KafkaSpoutStreamsNamedTopics, Integer>, TopicPartition>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((Map) null).when(kafkaSpoutConfig2).getKafkaProps();
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig2).getKafkaSpoutStreams();
      doReturn((Deserializer) null).when(kafkaSpoutConfig2).getKeyDeserializer();
      doReturn((Deserializer) null).when(kafkaSpoutConfig2).getValueDeserializer();
      KafkaSpout<AbstractMap.SimpleEntry<KafkaSpoutStreamsNamedTopics, Integer>, TopicPartition> kafkaSpout2 = new KafkaSpout<AbstractMap.SimpleEntry<KafkaSpoutStreamsNamedTopics, Integer>, TopicPartition>(kafkaSpoutConfig2);
      // Undeclared exception!
      try { 
        kafkaSpout2.activate();
      } catch(RuntimeException e) {
         //
         // Missing required configuration \"key.deserializer\" which has no default value.
         //
         verifyException("org.apache.kafka.common.config.ConfigDef", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutMessageId, String> kafkaSpoutConfig0 = (KafkaSpoutConfig<KafkaSpoutMessageId, String>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<KafkaSpoutMessageId, String> kafkaSpout0 = new KafkaSpout<KafkaSpoutMessageId, String>(kafkaSpoutConfig0);
      // Undeclared exception!
      try { 
        kafkaSpout0.deactivate();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      KafkaSpoutConfig<AbstractMap.SimpleEntry<KafkaSpoutMessageId, DelegationTokenIdentifier>, Object> kafkaSpoutConfig0 = (KafkaSpoutConfig<AbstractMap.SimpleEntry<KafkaSpoutMessageId, DelegationTokenIdentifier>, Object>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<AbstractMap.SimpleEntry<KafkaSpoutMessageId, DelegationTokenIdentifier>, Object> kafkaSpout0 = new KafkaSpout<AbstractMap.SimpleEntry<KafkaSpoutMessageId, DelegationTokenIdentifier>, Object>(kafkaSpoutConfig0);
      ConsumerRecords<AbstractMap.SimpleEntry<KafkaSpoutMessageId, DelegationTokenIdentifier>, Object> consumerRecords0 = null;
      // Undeclared exception!
      try { 
        kafkaSpout0.setWaitingToEmit(consumerRecords0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      KafkaSpoutConfig<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, DataTruncation> kafkaSpoutConfig0 = (KafkaSpoutConfig<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, DataTruncation>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactoryDefault<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, DataTruncation> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, DataTruncation>();
      KafkaSpout<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, DataTruncation> kafkaSpout0 = new KafkaSpout<DelegationTokenRenewer.RenewAction<HsftpFileSystem>, DataTruncation>(kafkaSpoutConfig0, kafkaConsumerFactoryDefault0);
      kafkaSpout0.nextTuple();
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      KafkaSpoutConfig<APersistentVector.SubVector, OffsetAndMetadata> kafkaSpoutConfig0 = (KafkaSpoutConfig<APersistentVector.SubVector, OffsetAndMetadata>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactoryDefault<APersistentVector.SubVector, OffsetAndMetadata> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<APersistentVector.SubVector, OffsetAndMetadata>();
      KafkaSpout<APersistentVector.SubVector, OffsetAndMetadata> kafkaSpout0 = new KafkaSpout<APersistentVector.SubVector, OffsetAndMetadata>(kafkaSpoutConfig0, kafkaConsumerFactoryDefault0);
      // Undeclared exception!
      try { 
        kafkaSpout0.ack(kafkaConsumerFactoryDefault0);
      } catch(ClassCastException e) {
         //
         // org.apache.storm.kafka.spout.internal.KafkaConsumerFactoryDefault cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      String string0 = "topics";
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig0 = (KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsNamedTopics>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(kafkaSpoutConfig0).getConsumerGroupId();
      doReturn((Map) null).when(kafkaSpoutConfig0).getKafkaProps();
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsNamedTopics> kafkaSpout0 = new KafkaSpout<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsNamedTopics>(kafkaSpoutConfig0);
      // Undeclared exception!
      try { 
        kafkaSpout0.getComponentConfiguration();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, APersistentVector.SubVector> kafkaSpoutConfig0 = (KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, APersistentVector.SubVector>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      KafkaConsumerFactoryDefault<KafkaSpoutStreamsWildcardTopics, APersistentVector.SubVector> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<KafkaSpoutStreamsWildcardTopics, APersistentVector.SubVector>();
      Deserializer<KafkaSpoutStreamsWildcardTopics> deserializer0 = (Deserializer<KafkaSpoutStreamsWildcardTopics>) mock(Deserializer.class, new ViolatedAssumptionAnswer());
      Deserializer<APersistentVector.SubVector> deserializer1 = (Deserializer<APersistentVector.SubVector>) mock(Deserializer.class, new ViolatedAssumptionAnswer());
      OutputFieldsGetter outputFieldsGetter0 = new OutputFieldsGetter();
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, Object> kafkaSpoutConfig1 = (KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, Object>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig1).getKafkaSpoutStreams();
      KafkaSpout<KafkaSpoutStreamsWildcardTopics, Object> kafkaSpout0 = new KafkaSpout<KafkaSpoutStreamsWildcardTopics, Object>(kafkaSpoutConfig1);
      kafkaSpout0.nextTuple();
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig2 = (KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig2).getKafkaSpoutStreams();
      KafkaSpout<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpout1 = new KafkaSpout<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics>(kafkaSpoutConfig2);
      Object object0 = null;
      // Undeclared exception!
      try { 
        kafkaSpout1.fail(object0);
      } catch(NullPointerException e) {
      }
  }
}
