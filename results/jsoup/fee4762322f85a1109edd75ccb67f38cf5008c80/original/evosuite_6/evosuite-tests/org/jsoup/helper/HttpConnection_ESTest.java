/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 04:52:01 GMT 2020
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.io.SyncFailedException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockRandomAccessFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpConnection_ESTest extends HttpConnection_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      String string0 = "~nRsS(K@B;";
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, string0, uRLStreamHandler0);
      Connection connection0 = HttpConnection.connect(uRL1);
      // Undeclared exception!
      try { 
        HttpConnection.connect(string0);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: ~nRsS(K@B;
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      String string0 = "Ov;Ry=";
      String string1 = "";
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1, (InputStream) mockFileInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.inputStream((InputStream) mockFileInputStream0);
      String string2 = "#[$";
      try { 
        fileDescriptor0.sync();
      } catch(SyncFailedException e) {
         //
         // sync failed
         //
         verifyException("java.io.FileDescriptor", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = ")yR$xF_M@j:D";
      String string1 = "Referer";
      Connection.Response connection_Response0 = httpConnection_Response0.header(string0, string1);
      Connection.Response connection_Response1 = httpConnection_Response0.removeCookie(string0);
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
  public void test03()  throws Throwable  {
      String string0 = "/";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string0);
      int int0 = 302;
      PipedInputStream pipedInputStream0 = new PipedInputStream(int0);
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal1.inputStream((InputStream) pipedInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal2.value(string0);
      HttpConnection.KeyVal httpConnection_KeyVal4 = httpConnection_KeyVal3.key(string0);
      String string1 = "org.jsoup.helper.HttpConnection$1";
      HttpConnection.KeyVal httpConnection_KeyVal5 = httpConnection_KeyVal0.value(string1);
      HttpConnection.KeyVal httpConnection_KeyVal6 = httpConnection_KeyVal3.value(string1);
      HttpConnection.KeyVal httpConnection_KeyVal7 = HttpConnection.KeyVal.create(string0, string0);
      boolean boolean0 = httpConnection_KeyVal3.hasInputStream();
      HttpConnection.KeyVal httpConnection_KeyVal8 = httpConnection_KeyVal0.inputStream((InputStream) pipedInputStream0);
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      String string0 = "*ucm>S\\";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      String string1 = "quirks";
      String string2 = "";
      HttpConnection.KeyVal httpConnection_KeyVal1 = HttpConnection.KeyVal.create(string1, string2);
      String string3 = null;
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string1, string3);
      } catch(IllegalArgumentException e) {
         //
         // Data value must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      Connection.Request connection_Request0 = null;
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.POST;
      Connection.Response connection_Response0 = httpConnection_Response0.method(connection_Method0);
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
  public void test06()  throws Throwable  {
      String string0 = "^ja6!fvIYX";
      EvoSuiteURL evoSuiteURL0 = null;
      String string1 = "E5|r3?tU";
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, string1);
      String string2 = "Al?N$2282";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string2);
      InputStream inputStream0 = null;
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.inputStream(inputStream0);
      String string3 = "org.jsoup.helper.HttpConnection$KeyVal";
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal1.key(string3);
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal1.key(string2);
      String string4 = "";
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string4, string0);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      String string0 = null;
      URL uRL0 = MockURL.getHttpExample();
      try { 
        MockURL.openStream(uRL0);
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      int int0 = httpConnection_Response0.statusCode();
      String string0 = null;
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string0, string0);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string0 = "m";
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      String string1 = "org.jsoup.helper.HttpConnection$KeyVal";
      String string2 = "mt";
      Locale locale0 = new Locale(string1, string2);
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Locale locale1 = Locale.KOREA;
      String string3 = locale0.getDisplayLanguage(locale1);
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      List<String> list1 = hashMap0.put(string0, list0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      String string4 = "Data key value pairs must not be null";
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
  public void test10()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.GET;
      Connection.Response connection_Response0 = httpConnection_Response0.method(connection_Method0);
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      String string0 = "\\^d(7_@xi[/Ed";
      // Undeclared exception!
      try { 
        HttpConnection.connect(string0);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: \\^d(7_@xi[/Ed
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      String string0 = "[Q6=";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.value(string0);
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      String string0 = "uJ%3F";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.value(string0);
      String string1 = "MsHJQOkon}:";
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal1.key(string1);
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal2.value(string1);
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = httpConnection_Response0.charset();
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      URL uRL0 = MockURL.getHttpExample();
      Connection.Response connection_Response0 = httpConnection_Response0.url(uRL0);
      String string0 = httpConnection_Response0.charset();
      String string1 = "Accept-Encoding";
      String string2 = "9y+;3Hm";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string1, string2);
      int int0 = 472;
      PipedInputStream pipedInputStream0 = new PipedInputStream(int0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.inputStream((InputStream) pipedInputStream0);
      InputStream inputStream0 = httpConnection_KeyVal1.inputStream();
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = null;
      String string1 = "";
      // Undeclared exception!
      try { 
        httpConnection_Response0.cookie(string0, string1);
      } catch(IllegalArgumentException e) {
         //
         // Cookie name must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      String string0 = "source";
      String string1 = "T.d,UnbfC{";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = httpConnection_KeyVal0.toString();
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
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
  public void test21()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "g";
      Connection.Response connection_Response0 = httpConnection_Response0.removeHeader(string0);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      httpConnection_Response0.processResponseHeaders(hashMap0);
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      String string0 = "embed";
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      int int0 = 4056;
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, int0);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0, (InputStream) bufferedInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.inputStream((InputStream) pipedInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal1.value(string0);
      String string1 = httpConnection_KeyVal2.key();
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Map<String, String> map0 = httpConnection_Response0.cookies;
      httpConnection_Response0.cookies = map0;
      int int0 = 0;
      float float0 = 1264.0F;
      HashMap<String, String> hashMap0 = new HashMap<String, String>(int0, float0);
      URL uRL0 = MockURL.getHttpExample();
      Connection.Response connection_Response0 = httpConnection_Response0.url(uRL0);
      String string0 = "!<s@s(D|~KinS";
      String string1 = "";
      String string2 = "e(s7;t@gW$R";
      String string3 = hashMap0.put(string1, string2);
      String string4 = hashMap0.put(string0, string0);
      httpConnection_Response0.cookies = (Map<String, String>) hashMap0;
      String string5 = httpConnection_Response0.contentType();
      String string6 = "";
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string6, string3, (InputStream) bufferedInputStream0);
      } catch(IllegalArgumentException e) {
         //
         // Data value must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string0 = "m";
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      String string1 = "org.jsoup.helper.HttpConnection$KeyVal";
      String string2 = "mt";
      Locale locale0 = new Locale(string1, string2);
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      List<String> list1 = hashMap0.put(string0, list0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      String string3 = "Data key value pairs must not be null";
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
  public void test25()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string0 = null;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string1 = "[/1pHhLUs(q.vK:";
      boolean boolean0 = linkedList0.add(string1);
      boolean boolean1 = linkedList0.add(string0);
      boolean boolean2 = linkedList0.add(string0);
      List<String> list0 = hashMap0.put(string0, linkedList0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      String string2 = "?";
      // Undeclared exception!
      try { 
        httpConnection_Response0.cookie(string0, string2);
      } catch(IllegalArgumentException e) {
         //
         // Cookie name must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      String string0 = "g+";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      InputStream inputStream0 = null;
      DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.inputStream((InputStream) dataInputStream0);
      String string1 = httpConnection_KeyVal0.value();
  }

  @Test(timeout = 11000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      String string0 = "vdF-#k;+wR/q:{;";
      String string1 = ";";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = "{K>)U9h)B5";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.value(string2);
      byte[] byteArray0 = new byte[0];
      String string3 = "Cookie map must not be null";
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal1.key(string3);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal2.inputStream((InputStream) byteArrayInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal4 = httpConnection_KeyVal1.inputStream((InputStream) byteArrayInputStream0);
      boolean boolean0 = httpConnection_KeyVal1.hasInputStream();
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      boolean boolean1 = httpConnection_KeyVal2.hasInputStream();
      String string4 = "sdvIe";
      HttpConnection.KeyVal httpConnection_KeyVal5 = HttpConnection.KeyVal.create(string4, string4);
  }

  @Test(timeout = 11000)
  public void test30()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = httpConnection_Response0.statusMessage();
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
  public void test31()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Map<String, String> map0 = httpConnection_Response0.cookies;
      httpConnection_Response0.headers = map0;
      String string0 = "RJisWyWV";
      String string1 = "";
      Connection.Response connection_Response0 = httpConnection_Response0.cookie(string0, string1);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      List<String> list0 = null;
      List<String> list1 = hashMap0.put(string1, list0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      int int0 = 1671;
      Locale.LanguageRange locale_LanguageRange0 = null;
      // Undeclared exception!
      try { 
        linkedList0.set(int0, locale_LanguageRange0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1671, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 11000)
  public void test32()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "set-cookie";
      int int0 = 1043;
      EvoSuiteURL evoSuiteURL0 = null;
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, string0);
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL(string0, string0, int0, string0, uRLStreamHandler0);
      String string1 = "m)h<P{O'";
      URLStreamHandler uRLStreamHandler1 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, string1, uRLStreamHandler1);
      Connection.Response connection_Response0 = httpConnection_Response0.removeHeader(string1);
      httpConnection_Response0.url = uRL1;
      String string2 = "ITsYEFqB[MOJ|[-C$";
      Connection.Response connection_Response1 = httpConnection_Response0.cookie(string0, string1);
      Connection.Response connection_Response2 = httpConnection_Response0.header(string2, string2);
      Connection.Method connection_Method0 = Connection.Method.GET;
      httpConnection_Response0.method = connection_Method0;
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
  public void test33()  throws Throwable  {
      String string0 = ";{QJH2gt+ dc_o%5*";
      String string1 = ">]m~&";
      int int0 = 4072;
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL(string0, string1, int0, string1, uRLStreamHandler0);
      Connection connection0 = HttpConnection.connect(uRL0);
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.POST;
      httpConnection_Response0.method = connection_Method0;
      int int1 = httpConnection_Response0.statusCode();
      String string2 = "esEc5vR:D";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string2);
      String string3 = "thead";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string3);
      String string4 = httpConnection_KeyVal1.value();
      String string5 = "F]jjn:aS&(3";
      String string6 = "org.jsoup.helper.HttpConnection";
      Connection connection1 = connection0.data(string5, string6);
  }

  @Test(timeout = 11000)
  public void test34()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = false;
      boolean boolean1 = true;
      EvoSuiteURL evoSuiteURL0 = null;
      String string0 = "Ss";
      boolean boolean2 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, string0);
      boolean boolean3 = FileSystemHandling.setPermissions(evoSuiteFile0, boolean0, boolean1, boolean0);
      String string1 = "{g3";
      String string2 = "rP<i_dE*DZ0$f";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string1, string2);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string2);
      boolean boolean4 = httpConnection_KeyVal1.hasInputStream();
  }
}
