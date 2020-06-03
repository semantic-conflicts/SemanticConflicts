/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 14:05:56 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import clojure.lang.ISeq;
import clojure.lang.LongRange;
import clojure.lang.PersistentArrayMap;
import clojure.lang.PersistentHashMap;
import clojure.lang.PersistentTreeMap;
import clojure.lang.PersistentVector;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Pattern;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.kafka.spout.KafkaSpoutRetryExponentialBackoff;
import org.apache.storm.kafka.spout.KafkaSpoutStream;
import org.apache.storm.kafka.spout.KafkaSpoutStreams;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsNamedTopics;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsWildcardTopics;
import org.apache.storm.kafka.spout.KafkaSpoutTupleBuilder;
import org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder;
import org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilderWildcardTopics;
import org.apache.storm.kafka.spout.SerializableDeserializer;
import org.apache.storm.tuple.Fields;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpoutConfig_ESTest extends KafkaSpoutConfig_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      Object object2 = new Object();
      objectArray0[2] = object2;
      Object object3 = new Object();
      objectArray0[3] = object3;
      Object object4 = new Object();
      objectArray0[4] = object4;
      Object object5 = new Object();
      objectArray0[5] = object5;
      PersistentHashMap persistentHashMap0 = PersistentHashMap.createWithCheck(objectArray0);
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      KafkaSpoutTupleBuilder<KafkaSpoutConfig.FirstPollOffsetStrategy, String> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<KafkaSpoutConfig.FirstPollOffsetStrategy, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutConfig.FirstPollOffsetStrategy, String> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutConfig.FirstPollOffsetStrategy, String>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<KafkaSpoutConfig.FirstPollOffsetStrategy, String> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutConfig.FirstPollOffsetStrategy, String>(persistentHashMap0, kafkaSpoutStreams0, kafkaSpoutTuplesBuilderWildcardTopics0);
      } catch(IllegalArgumentException e) {
         //
         // Must specify stream associated with each topic. Multiple topics can emit to the same stream
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.EMPTY;
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      Vector<Object> vector0 = new Vector<Object>();
      KafkaSpoutTupleBuilder<String, Integer> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<String, Integer>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(kafkaSpoutTupleBuilder0).buildTuple(nullable(org.apache.kafka.clients.consumer.ConsumerRecord.class));
      KafkaSpoutTuplesBuilderWildcardTopics<String, Integer> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<String, Integer>(kafkaSpoutTupleBuilder0);
      ConsumerRecord<String, Integer> consumerRecord0 = null;
      List<Object> list0 = kafkaSpoutTuplesBuilderWildcardTopics0.buildTuple(consumerRecord0);
      KafkaSpoutConfig.Builder<String, Integer> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<String, Integer>(persistentArrayMap0, kafkaSpoutStreams0, kafkaSpoutTuplesBuilderWildcardTopics0);
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class clojure.lang.RT
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.EMPTY;
      PersistentHashMap persistentHashMap0 = PersistentHashMap.createWithCheck(objectArray0);
      PersistentArrayMap persistentArrayMap1 = persistentArrayMap0.withMeta(persistentHashMap0);
      String string0 = "g^X9^!\"6";
      int int0 = (-2820);
      Integer integer0 = new Integer(int0);
      PersistentVector persistentVector0 = PersistentVector.create(objectArray0);
      PersistentVector persistentVector1 = persistentVector0.cons(objectArray0[1]);
      int int1 = 64;
      Integer integer1 = new Integer(int1);
      Fields fields0 = null;
      try {
        fields0 = new Fields(persistentVector0);
      } catch(IllegalArgumentException e) {
         //
         // duplicate field 'null'
         //
         verifyException("org.apache.storm.tuple.Fields", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      Map<String, Object> map0 = null;
      String[] stringArray0 = null;
      String string0 = null;
      KafkaSpoutTupleBuilder<Object, String> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<Object, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Object, String> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, String>(kafkaSpoutTupleBuilder0);
      long long0 = 65L;
      long long1 = 10000000L;
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      Map<String, Object> map0 = null;
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      KafkaSpoutTuplesBuilder<Integer, Object> kafkaSpoutTuplesBuilder0 = null;
      long long0 = 0L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.seconds(long0);
      int int0 = (-1014);
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int0, kafkaSpoutRetryExponentialBackoff_TimeInterval0);
      KafkaSpoutConfig.Builder<Integer, Object> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Integer, Object>(map0, kafkaSpoutStreams0, kafkaSpoutTuplesBuilder0, kafkaSpoutRetryExponentialBackoff0);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: null
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      long long0 = 4575L;
      long long1 = 0L;
      ISeq iSeq0 = LongRange.create(long0, long1);
      // Undeclared exception!
      try { 
        PersistentTreeMap.create(iSeq0);
      } catch(NoClassDefFoundError e) {
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray1 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      PersistentHashMap persistentHashMap0 = PersistentHashMap.create((Object[]) kafkaSpoutConfig_FirstPollOffsetStrategyArray1);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) persistentHashMap0;
      objectArray0[1] = (Object) persistentHashMap0;
      objectArray0[2] = (Object) persistentHashMap0;
      objectArray0[3] = (Object) persistentHashMap0;
      objectArray0[4] = (Object) persistentHashMap0;
      Object object0 = new Object();
      objectArray0[5] = object0;
      PersistentArrayMap persistentArrayMap0 = new PersistentArrayMap(persistentHashMap0, objectArray0);
      String[] stringArray0 = new String[4];
      String string0 = "enable.auto.commit";
      stringArray0[0] = string0;
      String string1 = "a6Ej@!P4]PFS45*";
      stringArray0[1] = string1;
      String string2 = "h^o8HA5hA*";
      stringArray0[2] = string2;
      String string3 = "private";
      stringArray0[3] = string3;
      Fields fields0 = new Fields(stringArray0);
      int int0 = 0;
      Pattern pattern0 = Pattern.compile(string3, int0);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics>(kafkaSpoutTupleBuilder0);
      long long0 = 0L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.microSeconds(long0);
      int int1 = 0;
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int1, kafkaSpoutRetryExponentialBackoff_TimeInterval0);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics>(persistentArrayMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0, kafkaSpoutRetryExponentialBackoff0);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setPollTimeoutMs(int0);
      SerializableDeserializer<KafkaSpoutStreamsWildcardTopics> serializableDeserializer0 = (SerializableDeserializer<KafkaSpoutStreamsWildcardTopics>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setValueDeserializer(serializableDeserializer0);
      KafkaSpoutTupleBuilder<Integer, PersistentVector> kafkaSpoutTupleBuilder1 = (KafkaSpoutTupleBuilder<Integer, PersistentVector>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Integer, PersistentVector> kafkaSpoutTuplesBuilderWildcardTopics1 = new KafkaSpoutTuplesBuilderWildcardTopics<Integer, PersistentVector>(kafkaSpoutTupleBuilder1);
      KafkaSpoutConfig.Builder<Integer, PersistentVector> kafkaSpoutConfig_Builder3 = new KafkaSpoutConfig.Builder<Integer, PersistentVector>(persistentHashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics1);
      long long1 = 32L;
      KafkaSpoutConfig.Builder<Integer, PersistentVector> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder3.setPollTimeoutMs(long1);
      // Undeclared exception!
      try { 
        kafkaSpoutConfig_Builder4.build();
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      PersistentHashMap persistentHashMap0 = PersistentHashMap.create(objectArray0);
      String[] stringArray0 = new String[6];
      String string0 = "V?OG167+'3`$]+~52";
      stringArray0[5] = string0;
      String string1 = ",\"3iS!REh.V7ZB";
      stringArray0[1] = string1;
      String string2 = "kuS!V ";
      stringArray0[2] = string2;
      String string3 = "Can't change/establish root binding of: %s with set";
      stringArray0[3] = string3;
      String string4 = "Ve\"kOh4FN$j*(,";
      stringArray0[4] = string4;
      String string5 = "";
      stringArray0[5] = string5;
      Fields fields0 = new Fields(stringArray0);
      Pattern pattern0 = Pattern.compile(string2);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, stringArray0[1], pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<PersistentVector, KafkaSpoutStreamsNamedTopics>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<PersistentVector, KafkaSpoutStreamsNamedTopics>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics>(persistentHashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      int int0 = (-1812);
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setMaxUncommittedOffsets(int0);
      SerializableDeserializer<PersistentVector> serializableDeserializer0 = (SerializableDeserializer<PersistentVector>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setKeyDeserializer(serializableDeserializer0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy1 = KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder3.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy1);
      KafkaSpoutTupleBuilder<String, Object> kafkaSpoutTupleBuilder1 = (KafkaSpoutTupleBuilder<String, Object>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<String, Object> kafkaSpoutTuplesBuilderWildcardTopics1 = new KafkaSpoutTuplesBuilderWildcardTopics<String, Object>(kafkaSpoutTupleBuilder1);
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.seconds(int0);
      int int1 = (-3296);
      long long0 = 257L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval1 = KafkaSpoutRetryExponentialBackoff.TimeInterval.microSeconds(long0);
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int1, kafkaSpoutRetryExponentialBackoff_TimeInterval1);
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder5 = new KafkaSpoutConfig.Builder<String, Object>(persistentHashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics1, kafkaSpoutRetryExponentialBackoff0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy2 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder6 = kafkaSpoutConfig_Builder5.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy2);
      long long1 = 1898L;
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder7 = kafkaSpoutConfig_Builder6.setOffsetCommitPeriodMs(long1);
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      PersistentHashMap persistentHashMap0 = PersistentHashMap.create(objectArray0);
      String[] stringArray0 = new String[6];
      String string0 = "V?OG167+'3`$]+~52";
      stringArray0[0] = string0;
      String string1 = "\"3iS!REh.V7ZB";
      stringArray0[1] = string1;
      String string2 = "kuS!V ";
      stringArray0[2] = string2;
      String string3 = "Can't change/establish root binding of: %s with set";
      stringArray0[3] = string3;
      String string4 = "Ve\"kOh4FN$j*(,";
      objectArray0[0] = (Object) string4;
      String string5 = "";
      stringArray0[5] = string5;
      Fields fields0 = new Fields(stringArray0);
      Pattern pattern0 = Pattern.compile(string2);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, stringArray0[1], pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<PersistentVector, KafkaSpoutStreamsNamedTopics>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<PersistentVector, KafkaSpoutStreamsNamedTopics>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics>(persistentHashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      int int0 = (-1812);
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setMaxUncommittedOffsets(int0);
      SerializableDeserializer<PersistentVector> serializableDeserializer0 = (SerializableDeserializer<PersistentVector>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setKeyDeserializer(serializableDeserializer0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy1 = KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder3.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy1);
      KafkaSpoutTupleBuilder<Object, Object> kafkaSpoutTupleBuilder1 = (KafkaSpoutTupleBuilder<Object, Object>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Object, Object> kafkaSpoutTuplesBuilderWildcardTopics1 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, Object>(kafkaSpoutTupleBuilder1);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder5 = new KafkaSpoutConfig.Builder<Object, Object>(persistentHashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics1);
      SerializableDeserializer<Object> serializableDeserializer1 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder6 = kafkaSpoutConfig_Builder5.setValueDeserializer(serializableDeserializer1);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder7 = kafkaSpoutConfig_Builder6.setPollTimeoutMs(int0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy2 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder8 = kafkaSpoutConfig_Builder7.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy2);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder9 = kafkaSpoutConfig_Builder8.setMaxUncommittedOffsets(int0);
      // Undeclared exception!
      try { 
        kafkaSpoutConfig_Builder9.build();
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.EMPTY;
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, Object> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, Object>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, Object> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, Object>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, Object> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, Object>(persistentArrayMap0, kafkaSpoutStreams0, kafkaSpoutTuplesBuilderWildcardTopics0);
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class clojure.lang.RT
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      Object object2 = new Object();
      objectArray0[2] = object2;
      Object object3 = new Object();
      objectArray0[3] = object3;
      Object object4 = new Object();
      objectArray0[4] = object4;
      Object object5 = new Object();
      objectArray0[5] = object5;
      PersistentHashMap persistentHashMap0 = PersistentHashMap.createWithCheck(objectArray0);
      String[] stringArray0 = new String[1];
      String string0 = "";
      stringArray0[0] = string0;
      Fields fields0 = new Fields(stringArray0);
      List<String> list0 = fields0.toList();
      Fields fields1 = new Fields(list0);
      String string1 = "--unnamed--";
      String string2 = "$VALUES";
      Pattern pattern0 = Pattern.compile(string2);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields1, string1, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTuplesBuilder<Object, PersistentVector> kafkaSpoutTuplesBuilder0 = null;
      KafkaSpoutConfig.Builder<Object, PersistentVector> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, PersistentVector>(persistentHashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilder0);
      } catch(IllegalArgumentException e) {
         //
         // Must specify at last one tuple builder per topic declared in KafkaSpoutStreams
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      PersistentHashMap persistentHashMap0 = PersistentHashMap.create(objectArray0);
      String[] stringArray0 = new String[6];
      String string0 = "V?OG167+'3`$]+~52";
      stringArray0[0] = string0;
      String string1 = "\"3iS!REh.V7ZB";
      stringArray0[1] = string1;
      String string2 = "kuS!V ";
      stringArray0[2] = string2;
      String string3 = "Can't change/establish root binding of: %s with set";
      stringArray0[3] = string3;
      String string4 = "Ve\"kOh4FN$j*(,";
      stringArray0[4] = string4;
      String string5 = "";
      stringArray0[5] = string5;
      Fields fields0 = new Fields(stringArray0);
      Pattern pattern0 = Pattern.compile(string2);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, stringArray0[1], pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<PersistentVector, KafkaSpoutStreamsNamedTopics>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<PersistentVector, KafkaSpoutStreamsNamedTopics>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics>(persistentHashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      int int0 = (-1812);
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setMaxUncommittedOffsets(int0);
      SerializableDeserializer<PersistentVector> serializableDeserializer0 = (SerializableDeserializer<PersistentVector>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setKeyDeserializer(serializableDeserializer0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy1 = KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
      KafkaSpoutConfig.Builder<PersistentVector, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder3.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy1);
      KafkaSpoutTupleBuilder<Object, Object> kafkaSpoutTupleBuilder1 = (KafkaSpoutTupleBuilder<Object, Object>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Object, Object> kafkaSpoutTuplesBuilderWildcardTopics1 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, Object>(kafkaSpoutTupleBuilder1);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder5 = new KafkaSpoutConfig.Builder<Object, Object>(persistentHashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics1);
      SerializableDeserializer<Object> serializableDeserializer1 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder6 = kafkaSpoutConfig_Builder5.setValueDeserializer(serializableDeserializer1);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder7 = kafkaSpoutConfig_Builder6.setPollTimeoutMs(int0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy2 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder8 = kafkaSpoutConfig_Builder7.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy2);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder9 = kafkaSpoutConfig_Builder8.setMaxUncommittedOffsets(int0);
      // Undeclared exception!
      try { 
        kafkaSpoutConfig_Builder9.build();
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }
}
