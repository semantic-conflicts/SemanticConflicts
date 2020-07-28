/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 04:34:32 GMT 2020
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.URL;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpConnection_ESTest extends HttpConnection_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Map<String, String> map0 = httpConnection_Response0.cookies;
      httpConnection_Response0.cookies = map0;
      // Undeclared exception!
      try { 
        httpConnection_Response0.body();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "u";
      String string1 = "<= {,43e";
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string2 = "";
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedList1, locale_FilteringMode0);
      List<String> list1 = hashMap0.put(string2, list0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      Connection.Response connection_Response0 = httpConnection_Response0.header(string0, string1);
      int int0 = httpConnection_Response0.statusCode();
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      int int0 = httpConnection_Response0.statusCode();
      String string0 = httpConnection_Response0.charset();
      String string1 = "";
      InputStream inputStream0 = null;
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(inputStream0);
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-26);
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      try { 
        pushbackInputStream0.unread(byteArray0);
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      String string0 = null;
      String string1 = "(";
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string0, string1);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      String string0 = "Header value must not be null";
      String string1 = "W";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = "";
      String string3 = "";
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string2, string3);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      String string0 = "%7$ExoY5Jh";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string0);
      String string1 = httpConnection_KeyVal1.toString();
      byte[] byteArray0 = new byte[1];
      String string2 = httpConnection_KeyVal1.toString();
      byte byte0 = (byte) (-46);
      byteArray0[0] = byte0;
      int int0 = 80;
      String string3 = "org.jsoup.nodes.XmlDeclaration";
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal0.key(string3);
      int int1 = 47;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, int0, int1);
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal1.inputStream((InputStream) byteArrayInputStream0);
      String string4 = httpConnection_KeyVal3.toString();
      HttpConnection.KeyVal httpConnection_KeyVal4 = httpConnection_KeyVal3.key(string1);
      String string5 = "maxSize must be 0 (unlimited) or larger";
      HttpConnection.KeyVal httpConnection_KeyVal5 = HttpConnection.KeyVal.create(string5, string0);
      HttpConnection.KeyVal httpConnection_KeyVal6 = httpConnection_KeyVal3.value(string0);
      long long0 = byteArrayInputStream0.skip(int1);
      String string6 = httpConnection_KeyVal0.toString();
      String string7 = "";
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string7, string2, (InputStream) byteArrayInputStream0);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      String string0 = "";
      String string1 = null;
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      boolean boolean0 = sequenceInputStream0.markSupported();
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string0, string1, (InputStream) sequenceInputStream0);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      String string0 = "; filename=\"";
      String string1 = "-gQY[>`G0Y`#\"8;B";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.inputStream((InputStream) sequenceInputStream0);
      InputStream inputStream0 = null;
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal0.inputStream(inputStream0);
      String string2 = httpConnection_KeyVal2.key();
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream1 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream1);
      String string0 = "noresize";
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string1 = httpConnection_Response0.statusMessage();
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string0 = "CO";
      String string1 = "ya.tmQd$-b'yGNB";
      Connection.Response connection_Response0 = httpConnection_Response0.cookie(string0, string1);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      Connection.Method connection_Method0 = Connection.Method.GET;
      Connection.Method connection_Method1 = Connection.Method.GET;
      // Undeclared exception!
      try { 
        httpConnection_Response0.bodyAsBytes();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      String string0 = "input";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      // Undeclared exception!
      try { 
        HttpConnection.connect(string0);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: input
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "2G?[n]%?3eYJ[O>";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      String string1 = "truespeed";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string1);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal1.value(string1);
      String string2 = httpConnection_KeyVal1.toString();
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal1.inputStream((InputStream) mockFileInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal4 = httpConnection_KeyVal3.inputStream((InputStream) mockFileInputStream0);
      String string3 = httpConnection_KeyVal3.value();
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      String string0 = "org.jsoup.select.Evaluator$AttributeWithValueStarting";
      // Undeclared exception!
      try { 
        HttpConnection.connect(string0);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: org.jsoup.select.Evaluator$AttributeWithValueStarting
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        httpConnection_Response0.parse();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before parsing response
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      String string0 = "@K@0`|EtJPt,z";
      String string1 = "Y,%UQ8^ CY2<zN~";
      InputStream inputStream0 = null;
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1, inputStream0);
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.POST;
      httpConnection_Response0.method = connection_Method0;
      String string0 = "a.Gi";
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      HashMap<String, List<String>> hashMap1 = new HashMap<String, List<String>>(hashMap0);
      httpConnection_Response0.processResponseHeaders(hashMap1);
      String string1 = "|KV2^x";
      Connection.Response connection_Response0 = httpConnection_Response0.cookie(string0, string1);
      String string2 = "Referrer must not be null";
      Connection.Response connection_Response1 = httpConnection_Response0.removeCookie(string2);
      String string3 = httpConnection_Response0.statusMessage();
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.GET;
      Connection.Response connection_Response0 = httpConnection_Response0.method(connection_Method0);
      String string0 = "";
      Connection.Method connection_Method1 = Connection.Method.POST;
      Connection.Response connection_Response1 = httpConnection_Response0.method(connection_Method1);
      // Undeclared exception!
      try { 
        httpConnection_Response0.removeCookie(string0);
      } catch(IllegalArgumentException e) {
         //
         // Cookie name must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      String string0 = " />";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      String string1 = "b";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string1);
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal0.value(string0);
      InputStream inputStream0 = httpConnection_KeyVal2.inputStream();
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      URL uRL0 = null;
      // Undeclared exception!
      try { 
        HttpConnection.connect(uRL0);
      } catch(IllegalArgumentException e) {
         //
         // URL must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      Connection.Request connection_Request0 = null;
      // Undeclared exception!
      try { 
        HttpConnection.Response.execute(connection_Request0);
      } catch(IllegalArgumentException e) {
         //
         // Request must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      String string0 = "ZYzg>kg2;tqfWP!";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string0);
      boolean boolean0 = httpConnection_KeyVal1.hasInputStream();
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      Connection.Request connection_Request0 = null;
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        HttpConnection.Response.execute(connection_Request0, httpConnection_Response0);
      } catch(IllegalArgumentException e) {
         //
         // Request must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = httpConnection_Response0.contentType();
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      String string0 = "e;+If=)9LwNq2/<8@uU";
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)113;
      byteArray0[0] = byte0;
      byte byte1 = (byte)66;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-90);
      byteArray0[2] = byte2;
      byte byte3 = (byte)49;
      byteArray0[3] = byte3;
      byte byte4 = (byte)47;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-72);
      byteArray0[5] = byte5;
      byte byte6 = (byte)44;
      byteArray0[6] = byte6;
      byte byte7 = (byte)13;
      byteArray0[7] = byte7;
      byte byte8 = (byte) (-2);
      byteArray0[8] = byte8;
      int int0 = (-651);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, byteArray0[1], int0);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0, (InputStream) byteArrayInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string0);
      boolean boolean0 = httpConnection_KeyVal1.hasInputStream();
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = httpConnection_Response0.charset();
      String string1 = "";
      String string2 = null;
      int int0 = (-1249);
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream(int0);
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Map<String, String> map0 = httpConnection_Response0.cookies;
      String string0 = null;
      String string1 = "";
      // Undeclared exception!
      try { 
        httpConnection_Response0.bodyAsBytes();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = ":gy|pNgiWR--6,:{f";
      Connection.Response connection_Response0 = httpConnection_Response0.header(string0, string0);
      String string1 = "JW1@L0!5f/";
      Connection.Response connection_Response1 = httpConnection_Response0.removeHeader(string1);
      Map<String, List<String>> map0 = null;
      // Undeclared exception!
      try { 
        httpConnection_Response0.processResponseHeaders(map0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.HttpConnection$Response", e);
      }
  }

  @Test(timeout = 11000)
  public void test27()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      String string0 = null;
      EvoSuiteFile evoSuiteFile0 = null;
      String string1 = "Header name must not be null";
      InputStream inputStream0 = null;
      String string2 = "";
      // Undeclared exception!
      try { 
        connection0.data(string2, string0, inputStream0);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}