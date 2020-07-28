/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 14:24:13 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import clojure.lang.Keyword;
import clojure.lang.PersistentArrayMap;
import clojure.lang.PersistentHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
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
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      PersistentHashMap persistentHashMap0 = PersistentHashMap.createWithCheck((Object[]) kafkaSpoutConfig_FirstPollOffsetStrategyArray0);
      String[] stringArray0 = new String[0];
      Fields fields0 = new Fields(stringArray0);
      String string0 = "clojure.lang.Agent$Action";
      Pattern pattern0 = Pattern.compile(string0);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics>(kafkaSpoutTupleBuilder0);
      long long0 = 3150L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.milliSeconds(long0);
      long long1 = 750L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval1 = KafkaSpoutRetryExponentialBackoff.TimeInterval.microSeconds(long1);
      int int0 = (-1121);
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval2 = KafkaSpoutRetryExponentialBackoff.TimeInterval.seconds(long1);
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval1, int0, kafkaSpoutRetryExponentialBackoff_TimeInterval2);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics>(persistentHashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0, kafkaSpoutRetryExponentialBackoff0);
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval3 = KafkaSpoutRetryExponentialBackoff.TimeInterval.seconds(long0);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setPollTimeoutMs(long1);
      long long2 = (-1982L);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setOffsetCommitPeriodMs(long2);
      KafkaSpoutTuplesBuilder<Object, Integer> kafkaSpoutTuplesBuilder0 = null;
      KafkaSpoutConfig.Builder<Object, Integer> kafkaSpoutConfig_Builder3 = null;
      try {
        kafkaSpoutConfig_Builder3 = new KafkaSpoutConfig.Builder<Object, Integer>(persistentHashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilder0, kafkaSpoutRetryExponentialBackoff0);
      } catch(IllegalArgumentException e) {
         //
         // Must specify at last one tuple builder per topic declared in KafkaSpoutStreams
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createWithCheck(kafkaSpoutConfig_FirstPollOffsetStrategyArray0);
      String[] stringArray0 = new String[7];
      String string0 = "org.apache.storm.kafka.spout.KafkaSpoutConfig$FirstPollOffsetStrategy";
      stringArray0[0] = string0;
      String string1 = "";
      stringArray0[1] = string1;
      String string2 = "group.id";
      String string3 = "FKPmmM]q_jP/%";
      stringArray0[3] = string3;
      String string4 = "@S~b`|9H{";
      stringArray0[4] = string4;
      String string5 = "clojure.lang.ArraySeq$ArraySeq_int";
      stringArray0[5] = string5;
      String string6 = "false";
      stringArray0[6] = string6;
      Fields fields0 = new Fields(stringArray0);
      Pattern pattern0 = Pattern.compile(stringArray0[1]);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<Object, Object> kafkaSpoutTupleBuilder0 = null;
      KafkaSpoutTuplesBuilderWildcardTopics<Object, Object> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, Object>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Object>(persistentArrayMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      SerializableDeserializer<Object> serializableDeserializer0 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setKeyDeserializer(serializableDeserializer0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      int int0 = 0;
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setMaxUncommittedOffsets(int0);
      SerializableDeserializer<Object> serializableDeserializer1 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder3.setKeyDeserializer(serializableDeserializer1);
      // Undeclared exception!
      try { 
        kafkaSpoutConfig_Builder3.build();
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createWithCheck(kafkaSpoutConfig_FirstPollOffsetStrategyArray0);
      String[] stringArray0 = new String[7];
      String string0 = "org.apache.storm.kafka.spout.KafkaSpoutConfig$FirstPollOffsetStrategy";
      stringArray0[0] = string0;
      String string1 = "";
      stringArray0[1] = string1;
      String string2 = "group.id";
      stringArray0[2] = string2;
      String string3 = "FKPmmM]q_jP/%";
      stringArray0[3] = string3;
      String string4 = "@S~b`|9H{";
      stringArray0[4] = string4;
      String string5 = "clojure.lang.ArraySeq$ArraySeq_int";
      stringArray0[5] = string5;
      String string6 = "false";
      stringArray0[6] = string6;
      Fields fields0 = new Fields(stringArray0);
      Pattern pattern0 = Pattern.compile(stringArray0[1]);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<Object, Object> kafkaSpoutTupleBuilder0 = null;
      KafkaSpoutTuplesBuilderWildcardTopics<Object, Object> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, Object>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Object>(persistentArrayMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      SerializableDeserializer<Object> serializableDeserializer0 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setKeyDeserializer(serializableDeserializer0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      int int0 = 0;
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setMaxUncommittedOffsets(int0);
      SerializableDeserializer<Object> serializableDeserializer1 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder3.setKeyDeserializer(serializableDeserializer1);
      KafkaSpoutTupleBuilder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutTupleBuilder1 = (KafkaSpoutTupleBuilder<String, KafkaSpoutStreamsNamedTopics>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutTuplesBuilderWildcardTopics1 = new KafkaSpoutTuplesBuilderWildcardTopics<String, KafkaSpoutStreamsNamedTopics>(kafkaSpoutTupleBuilder1);
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.milliSeconds(int0);
      int int1 = 3758;
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int1, kafkaSpoutRetryExponentialBackoff_TimeInterval0);
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder5 = new KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics>(persistentArrayMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics1, kafkaSpoutRetryExponentialBackoff0);
      SerializableDeserializer<KafkaSpoutStreamsNamedTopics> serializableDeserializer2 = (SerializableDeserializer<KafkaSpoutStreamsNamedTopics>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder6 = kafkaSpoutConfig_Builder5.setValueDeserializer(serializableDeserializer2);
      long long0 = 0L;
      SerializableDeserializer<KafkaSpoutStreamsNamedTopics> serializableDeserializer3 = (SerializableDeserializer<KafkaSpoutStreamsNamedTopics>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      PersistentHashMap persistentHashMap0 = PersistentHashMap.EMPTY;
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      KafkaSpoutTupleBuilder<Locale.FilteringMode, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<Locale.FilteringMode, KafkaSpoutStreamsWildcardTopics>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Locale.FilteringMode, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Locale.FilteringMode, KafkaSpoutStreamsWildcardTopics>(kafkaSpoutTupleBuilder0);
      long long0 = 10L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.seconds(long0);
      int int0 = 340;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval1 = KafkaSpoutRetryExponentialBackoff.TimeInterval.milliSeconds(long0);
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int0, kafkaSpoutRetryExponentialBackoff_TimeInterval1);
      KafkaSpoutConfig.Builder<Locale.FilteringMode, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Locale.FilteringMode, KafkaSpoutStreamsWildcardTopics>(persistentHashMap0, kafkaSpoutStreams0, kafkaSpoutTuplesBuilderWildcardTopics0, kafkaSpoutRetryExponentialBackoff0);
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class clojure.lang.RT
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      Map<String, Object> map0 = null;
      String[] stringArray0 = new String[7];
      String string0 = " ;7P ~O@i3^eCb~wJ9";
      stringArray0[0] = string0;
      String string1 = "#a0G";
      stringArray0[1] = string1;
      String string2 = "UY~N";
      stringArray0[2] = string2;
      String string3 = "%`Rk8/`6IetzFe!wh [";
      stringArray0[3] = string3;
      String string4 = "*xU)jQ#";
      stringArray0[4] = string4;
      String string5 = "==vSgZXC;Xi(";
      stringArray0[5] = string5;
      String string6 = "L:+EpVolpyf";
      stringArray0[6] = string6;
      Fields fields0 = new Fields(stringArray0);
      String string7 = "h\\}<eCEd.?-4~2H";
      String string8 = "bootstrap.servers";
      int int0 = (-31);
      Pattern pattern0 = Pattern.compile(string8, int0);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, string7, pattern0);
      Pattern pattern1 = kafkaSpoutStream0.getTopicWildcardPattern();
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<Object, Object> kafkaSpoutTupleBuilder0 = null;
      KafkaSpoutTuplesBuilderWildcardTopics<Object, Object> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, Object>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Object>(map0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
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
      String string0 = "EARLIEST";
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.valueOf(string0);
      PersistentHashMap persistentHashMap0 = PersistentHashMap.createWithCheck((Object[]) kafkaSpoutConfig_FirstPollOffsetStrategyArray0);
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, Object> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, Object>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, Object> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, Object>(kafkaSpoutTupleBuilder0);
      long long0 = (-2483L);
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.microSeconds(long0);
      int int0 = 10000000;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval1 = KafkaSpoutRetryExponentialBackoff.TimeInterval.microSeconds(long0);
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int0, kafkaSpoutRetryExponentialBackoff_TimeInterval0);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, Object> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, Object>(persistentHashMap0, kafkaSpoutStreams0, kafkaSpoutTuplesBuilderWildcardTopics0, kafkaSpoutRetryExponentialBackoff0);
      } catch(IllegalArgumentException e) {
         //
         // Must specify stream associated with each topic. Multiple topics can emit to the same stream
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      Map<String, Object> map0 = null;
      String[] stringArray0 = new String[7];
      String string0 = " ;7P ~O@i3^eCb~wJ9";
      stringArray0[0] = string0;
      String string1 = "#a0G";
      stringArray0[1] = string1;
      String string2 = "UY~N";
      stringArray0[2] = string2;
      String string3 = "%`Rk8/`6IetzFe!wh [";
      stringArray0[3] = string3;
      String string4 = "*xU)jQ#";
      stringArray0[4] = string4;
      String string5 = "==vSgZXC;Xi(";
      stringArray0[5] = string5;
      String string6 = "false";
      stringArray0[6] = string6;
      Fields fields0 = new Fields(stringArray0);
      String string7 = "h\\}<eCEd.?-4~2H";
      String string8 = "bootstrap.servers";
      int int0 = 0;
      Pattern pattern0 = Pattern.compile(string8, int0);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, string7, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<Object, Object> kafkaSpoutTupleBuilder0 = null;
      KafkaSpoutTuplesBuilderWildcardTopics<Object, Object> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, Object>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Object>(map0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: null
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
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
      Object object6 = new Object();
      objectArray0[6] = object6;
      Object object7 = new Object();
      objectArray0[7] = object7;
      Object object8 = new Object();
      objectArray0[8] = object8;
      PersistentArrayMap persistentArrayMap0 = new PersistentArrayMap(objectArray0);
      PersistentArrayMap persistentArrayMap1 = new PersistentArrayMap(persistentArrayMap0, objectArray0);
      PersistentArrayMap persistentArrayMap2 = persistentArrayMap0.withMeta(persistentArrayMap1);
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      KafkaSpoutTuplesBuilder<String, Locale.FilteringMode> kafkaSpoutTuplesBuilder0 = null;
      long long0 = 1264L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.milliSeconds(long0);
      int int0 = 1;
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int0, kafkaSpoutRetryExponentialBackoff_TimeInterval0);
      KafkaSpoutConfig.Builder<String, Locale.FilteringMode> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<String, Locale.FilteringMode>(persistentArrayMap2, kafkaSpoutStreams0, kafkaSpoutTuplesBuilder0, kafkaSpoutRetryExponentialBackoff0);
      } catch(IllegalArgumentException e) {
         //
         // Must specify stream associated with each topic. Multiple topics can emit to the same stream
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      PersistentHashMap persistentHashMap0 = PersistentHashMap.createWithCheck((Object[]) kafkaSpoutConfig_FirstPollOffsetStrategyArray0);
      String[] stringArray0 = new String[0];
      Fields fields0 = new Fields(stringArray0);
      String string0 = "clojure.lang.Agent$Action";
      Pattern pattern0 = Pattern.compile(string0);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics>(kafkaSpoutTupleBuilder0);
      long long0 = 3150L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.milliSeconds(long0);
      long long1 = 765L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval1 = KafkaSpoutRetryExponentialBackoff.TimeInterval.microSeconds(long1);
      int int0 = (-1121);
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval2 = KafkaSpoutRetryExponentialBackoff.TimeInterval.seconds(long1);
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval1, int0, kafkaSpoutRetryExponentialBackoff_TimeInterval2);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics>(persistentHashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0, kafkaSpoutRetryExponentialBackoff0);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setPollTimeoutMs(long1);
      long long2 = (-1982L);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setOffsetCommitPeriodMs(long2);
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      Object object2 = new Object();
      objectArray0[2] = object2;
      Object object3 = new Object();
      objectArray0[3] = object3;
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createAsIfByAssoc(objectArray0);
      String[] stringArray0 = new String[5];
      String string0 = "<~C/";
      stringArray0[0] = string0;
      String string1 = "6qXz";
      stringArray0[1] = string1;
      String string2 = "o@Q^NQzh6fV8'";
      stringArray0[2] = string2;
      String string3 = "PZYa%LY;";
      stringArray0[3] = string3;
      String string4 = "qd";
      stringArray0[4] = string4;
      Fields fields0 = new Fields(stringArray0);
      int int0 = (-2985);
      Pattern pattern0 = Pattern.compile(stringArray0[2], int0);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, Keyword> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, Keyword>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, Keyword> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, Keyword>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, Keyword> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, Keyword>(persistentArrayMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createWithCheck(kafkaSpoutConfig_FirstPollOffsetStrategyArray0);
      String[] stringArray0 = new String[7];
      String string0 = "org.apache.storm.kafka.spout.KafkaSpoutConfig$FirstPollOffsetStrategy";
      stringArray0[0] = string0;
      String string1 = "";
      stringArray0[1] = string1;
      String string2 = "group.id";
      stringArray0[2] = string2;
      String string3 = "FKPmmM]q_jP/%";
      stringArray0[3] = string3;
      String string4 = "@S~b`|9H{";
      stringArray0[4] = string4;
      String string5 = "clojure.lang.ArraySeq$ArraySeq_int";
      stringArray0[5] = string5;
      String string6 = "false";
      stringArray0[6] = string6;
      Fields fields0 = new Fields(stringArray0);
      Pattern pattern0 = Pattern.compile(stringArray0[1]);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<Object, Object> kafkaSpoutTupleBuilder0 = null;
      KafkaSpoutTuplesBuilderWildcardTopics<Object, Object> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, Object>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Object>(persistentArrayMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      SerializableDeserializer<Object> serializableDeserializer0 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setKeyDeserializer(serializableDeserializer0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      int int0 = 0;
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setMaxUncommittedOffsets(int0);
      SerializableDeserializer<Object> serializableDeserializer1 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder3.setKeyDeserializer(serializableDeserializer1);
      KafkaSpoutTupleBuilder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutTupleBuilder1 = (KafkaSpoutTupleBuilder<String, KafkaSpoutStreamsNamedTopics>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutTuplesBuilderWildcardTopics1 = new KafkaSpoutTuplesBuilderWildcardTopics<String, KafkaSpoutStreamsNamedTopics>(kafkaSpoutTupleBuilder1);
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.milliSeconds(int0);
      int int1 = 3758;
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int1, kafkaSpoutRetryExponentialBackoff_TimeInterval0);
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder5 = new KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics>(persistentArrayMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics1, kafkaSpoutRetryExponentialBackoff0);
      SerializableDeserializer<KafkaSpoutStreamsNamedTopics> serializableDeserializer2 = (SerializableDeserializer<KafkaSpoutStreamsNamedTopics>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder6 = kafkaSpoutConfig_Builder5.setValueDeserializer(serializableDeserializer2);
      SerializableDeserializer<String> serializableDeserializer3 = (SerializableDeserializer<String>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder7 = kafkaSpoutConfig_Builder6.setKeyDeserializer(serializableDeserializer3);
      long long0 = 0L;
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder8 = kafkaSpoutConfig_Builder7.setPollTimeoutMs(long0);
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder9 = kafkaSpoutConfig_Builder8.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder10 = kafkaSpoutConfig_Builder9.setMaxUncommittedOffsets(int1);
      SerializableDeserializer<KafkaSpoutStreamsNamedTopics> serializableDeserializer4 = (SerializableDeserializer<KafkaSpoutStreamsNamedTopics>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder11 = kafkaSpoutConfig_Builder10.setValueDeserializer(serializableDeserializer4);
  }
}