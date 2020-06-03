/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 00:49:22 GMT 2020
 */

package org.elasticsearch.index.query.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import org.apache.lucene.index.LeafReaderContext;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.join.BitDocIdSetCachingWrapperFilter;
import org.apache.lucene.search.join.BitDocIdSetFilter;
import org.apache.lucene.util.BitDocIdSet;
import org.elasticsearch.Version;
import org.elasticsearch.action.exists.ExistsRequest;
import org.elasticsearch.action.support.QuerySourceBuilder;
import org.elasticsearch.cluster.metadata.MappingMetaData;
import org.elasticsearch.common.bytes.BytesArray;
import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.common.io.stream.NamedWriteableAwareStreamInput;
import org.elasticsearch.common.io.stream.NamedWriteableRegistry;
import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.joda.DateMathParser;
import org.elasticsearch.common.joda.FormatDateTimeFormatter;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.common.xcontent.json.JsonXContent;
import org.elasticsearch.common.xcontent.smile.SmileXContent;
import org.elasticsearch.common.xcontent.yaml.YamlXContent;
import org.elasticsearch.http.netty.NettyHttpRequest;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.VersionType;
import org.elasticsearch.index.mapper.Mapper;
import org.elasticsearch.index.mapper.core.BooleanFieldMapper;
import org.elasticsearch.index.mapper.core.DateFieldMapper;
import org.elasticsearch.index.mapper.core.LongFieldMapper;
import org.elasticsearch.index.mapper.internal.TimestampFieldMapper;
import org.elasticsearch.index.mapper.object.ObjectMapper;
import org.elasticsearch.index.query.MoreLikeThisQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryParseContext;
import org.elasticsearch.index.query.QueryParser;
import org.elasticsearch.index.query.QueryShardContext;
import org.elasticsearch.index.query.support.NestedInnerQueryParseSupport;
import org.elasticsearch.indices.query.IndicesQueriesRegistry;
import org.elasticsearch.search.fetch.FetchSubPhase;
import org.elasticsearch.search.internal.SearchContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.local.DefaultLocalServerChannelFactory;
import org.jboss.netty.channel.local.LocalServerChannel;
import org.jboss.netty.handler.codec.http.DefaultHttpRequest;
import org.jboss.netty.handler.codec.http.HttpMethod;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NestedInnerQueryParseSupport_ESTest extends NestedInnerQueryParseSupport_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = nestedInnerQueryParseSupport0.queryFound();
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
      nestedInnerQueryParseSupport0.queryFound = boolean0;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.filter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPathLevel();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = false;
      BitDocIdSetCachingWrapperFilter bitDocIdSetCachingWrapperFilter0 = new BitDocIdSetCachingWrapperFilter(nestedInnerQueryParseSupport0.childFilter);
      String string0 = "org.elasticsearch.index.query.support.NestedInnerQueryParseSupport";
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPath(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = false;
      nestedInnerQueryParseSupport0.queryFound = boolean0;
      boolean boolean1 = nestedInnerQueryParseSupport0.filterFound();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.resetPathLevel();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      String string0 = nestedInnerQueryParseSupport0.getPath();
      boolean boolean0 = false;
      nestedInnerQueryParseSupport0.queryFound = boolean0;
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
      boolean boolean1 = false;
      nestedInnerQueryParseSupport0.filterParsed = boolean1;
      boolean boolean2 = nestedInnerQueryParseSupport0.queryFound();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerFilter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-103);
      byteArray0[0] = byte0;
      byte byte1 = (byte)31;
      byteArray0[1] = byte1;
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String string0 = "M?d=')n/)|$kn)<|3Xw";
      boolean boolean1 = FileSystemHandling.appendStringToFile(evoSuiteFile0, string0);
      boolean boolean2 = FileSystemHandling.shouldAllThrowIOExceptions();
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      Query query0 = null;
      nestedInnerQueryParseSupport0.innerQuery = query0;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerQuery();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-113);
      byteArray0[0] = byte0;
      byte byte1 = (byte)19;
      byteArray0[1] = byte1;
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String string0 = "M?d=')n/)|$kn)<|3Xw";
      boolean boolean1 = FileSystemHandling.appendStringToFile(evoSuiteFile0, string0);
      boolean boolean2 = FileSystemHandling.shouldAllThrowIOExceptions();
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      Query query0 = null;
      nestedInnerQueryParseSupport0.innerQuery = (Query) nestedInnerQueryParseSupport0.childFilter;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerQuery();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      SmileXContent smileXContent0 = SmileXContent.smileXContent;
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)64;
      byteArray0[0] = byte0;
      byte byte1 = (byte)1;
      byteArray0[1] = byte1;
      byte byte2 = (byte)31;
      byteArray0[2] = byte2;
      byte byte3 = (byte)1;
      byteArray0[3] = byte3;
      byte byte4 = (byte)37;
      byteArray0[4] = byte4;
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      byte byte5 = (byte)1;
      byteArray0[5] = byte5;
      byte byte6 = (byte)20;
      byteArray0[6] = byte6;
      byte byte7 = (byte)20;
      byteArray0[7] = byte7;
      int int0 = 0;
      StreamInput streamInput0 = StreamInput.wrap(byteArray0, int0, (int) byte7);
      DataInputStream dataInputStream0 = new DataInputStream(streamInput0);
      XContentParser xContentParser0 = smileXContent0.createParser((InputStream) dataInputStream0);
      SearchContext searchContext0 = SearchContext.current();
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(xContentParser0, searchContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      boolean boolean1 = false;
      nestedInnerQueryParseSupport0.queryParsed = boolean1;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.query();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      BooleanFieldMapper.BooleanFieldType booleanFieldMapper_BooleanFieldType0 = new BooleanFieldMapper.BooleanFieldType();
      Term term0 = null;
      Query query0 = booleanFieldMapper_BooleanFieldType0.queryStringTermQuery(term0);
      nestedInnerQueryParseSupport0.innerFilter = query0;
      Query query1 = booleanFieldMapper_BooleanFieldType0.nullValueQuery();
      nestedInnerQueryParseSupport0.queryParsed = nestedInnerQueryParseSupport0.filterParsed;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerFilter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = null;
      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, string0);
      QueryShardContext queryShardContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(queryShardContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      ObjectMapper objectMapper0 = null;
      nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper0;
      ObjectMapper objectMapper1 = nestedInnerQueryParseSupport0.getParentObjectMapper();
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.filter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.query();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerQuery();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      XContentParser xContentParser0 = null;
      SearchContext searchContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(xContentParser0, searchContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.filterParsed = boolean0;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerQuery();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.query();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      JsonXContent jsonXContent0 = JsonXContent.jsonXContent;
      String string0 = "";
      BytesArray bytesArray0 = new BytesArray(string0);
      XContentParser xContentParser0 = jsonXContent0.createParser((BytesReference) bytesArray0);
      SearchContext searchContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(xContentParser0, searchContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerFilter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.filterFound = boolean0;
      boolean boolean1 = true;
      nestedInnerQueryParseSupport0.queryFound = boolean0;
      nestedInnerQueryParseSupport0.filterFound = boolean1;
      BitDocIdSetFilter bitDocIdSetFilter0 = nestedInnerQueryParseSupport0.childFilter;
      nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter0;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerQuery();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.resetPathLevel();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.filter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.queryFound = boolean0;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPathLevel();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      QueryShardContext queryShardContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(queryShardContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      String string0 = "]CI3tDb1pqRGJo";
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPath(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      QueryShardContext queryShardContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(queryShardContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      String string0 = "";
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPath(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test27()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = false;
      nestedInnerQueryParseSupport0.filterFound = boolean0;
      boolean boolean1 = nestedInnerQueryParseSupport0.filterFound();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPathLevel();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test28()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = false;
      nestedInnerQueryParseSupport0.queryFound = boolean0;
      boolean boolean1 = true;
      nestedInnerQueryParseSupport0.filterParsed = boolean1;
      Query query0 = nestedInnerQueryParseSupport0.getInnerFilter();
      String string0 = "X";
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPath(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test29()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.queryFound = boolean0;
      boolean boolean1 = false;
      nestedInnerQueryParseSupport0.filterParsed = boolean1;
      boolean boolean2 = nestedInnerQueryParseSupport0.queryFound();
      boolean boolean3 = false;
      nestedInnerQueryParseSupport0.filterFound = boolean3;
      String string0 = ">";
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPath(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test30()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.filterFound = boolean0;
      boolean boolean1 = nestedInnerQueryParseSupport0.filterFound();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.resetPathLevel();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test31()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getParentObjectMapper();
  }

  @Test(timeout = 11000)
  public void test32()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean1 = false;
      nestedInnerQueryParseSupport0.queryFound = boolean1;
      boolean boolean2 = true;
      nestedInnerQueryParseSupport0.queryParsed = boolean2;
      Query query0 = nestedInnerQueryParseSupport0.getInnerQuery();
  }
}
