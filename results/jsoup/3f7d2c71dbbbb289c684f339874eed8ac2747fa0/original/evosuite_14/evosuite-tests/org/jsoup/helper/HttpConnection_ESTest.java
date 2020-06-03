/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 19:08:36 GMT 2020
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
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
      String string0 = "V(k;";
      String string1 = "Et?Fuvu_PovNlFf`";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = "h`";
      String string3 = "";
      HttpConnection.KeyVal httpConnection_KeyVal1 = HttpConnection.KeyVal.create(string2, string3);
      String string4 = "$&7\\wPj6oY";
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal0.value(string4);
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal0.key(string1);
      String string5 = httpConnection_KeyVal0.value();
      Connection.Request connection_Request0 = null;
      String string6 = "Too many redirects occurred trying to load URL %s";
      String string7 = "";
      HttpConnection.KeyVal httpConnection_KeyVal4 = HttpConnection.KeyVal.create(string6, string7);
      String string8 = httpConnection_KeyVal3.toString();
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Map<String, String> map0 = httpConnection_Response0.cookies;
      httpConnection_Response0.headers = map0;
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
  public void test01()  throws Throwable  {
      String string0 = "ZRlx%oJ]";
      // Undeclared exception!
      try { 
        HttpConnection.connect(string0);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: ZRlx%oJ]
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      String string0 = "";
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
  public void test03()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      boolean boolean0 = true;
      Connection connection1 = connection0.ignoreHttpErrors(boolean0);
      String string0 = "Accept-Encoding";
      String string1 = "R ?6QLc";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = "button";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.value(string2);
      String string3 = "I{:F";
      Connection connection2 = connection0.referrer(string3);
      String string4 = "";
      // Undeclared exception!
      try { 
        httpConnection_KeyVal0.key(string4);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "Request must be executed (with .execute(), .get(), or .post() before parsing response";
      String string1 = "";
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string2 = null;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = hashMap0.put(string2, linkedList0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      Connection.Response connection_Response0 = httpConnection_Response0.header(string0, string1);
      Connection.Method connection_Method0 = Connection.Method.GET;
      Connection.Response connection_Response1 = httpConnection_Response0.method(connection_Method0);
      String string3 = httpConnection_Response0.contentType();
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
  public void test05()  throws Throwable  {
      String string0 = ":FPgx&Y/L\\L2";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      String string1 = "LV0L42JVc^~}";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string1);
      String string2 = httpConnection_KeyVal0.toString();
      String string3 = httpConnection_KeyVal0.toString();
      String string4 = "default";
      String string5 = httpConnection_KeyVal1.toString();
      HttpConnection.KeyVal httpConnection_KeyVal2 = HttpConnection.KeyVal.create(string1, string1);
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal1.value(string4);
      String string6 = "http";
      String string7 = httpConnection_KeyVal3.toString();
      String string8 = httpConnection_KeyVal1.toString();
      String string9 = "-Y=MHu@F{mryL+8'H";
      HttpConnection.KeyVal httpConnection_KeyVal4 = HttpConnection.KeyVal.create(string9, string3);
      HttpConnection.KeyVal httpConnection_KeyVal5 = httpConnection_KeyVal3.key(string4);
      String string10 = "text/";
      HttpConnection.KeyVal httpConnection_KeyVal6 = httpConnection_KeyVal3.key(string10);
      String string11 = "C'eD";
      HttpConnection.KeyVal httpConnection_KeyVal7 = HttpConnection.KeyVal.create(string11, string7);
      String string12 = "";
      HttpConnection.KeyVal httpConnection_KeyVal8 = httpConnection_KeyVal6.value(string12);
      String string13 = httpConnection_KeyVal3.toString();
      HttpConnection.KeyVal httpConnection_KeyVal9 = httpConnection_KeyVal3.value(string0);
      HttpConnection.KeyVal httpConnection_KeyVal10 = HttpConnection.KeyVal.create(string3, string4);
      String string14 = "}tOs";
      HttpConnection.KeyVal httpConnection_KeyVal11 = httpConnection_KeyVal3.key(string14);
      String string15 = "w>o_a`)0M}X.'";
      HttpConnection.KeyVal httpConnection_KeyVal12 = HttpConnection.KeyVal.create(string6, string15);
      String string16 = httpConnection_KeyVal3.key();
      String string17 = httpConnection_KeyVal1.key();
      String string18 = "*kU'i}r?t";
      HttpConnection.KeyVal httpConnection_KeyVal13 = httpConnection_KeyVal6.key(string18);
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "?";
      Connection.Response connection_Response0 = httpConnection_Response0.removeCookie(string0);
      Map<String, String> map0 = null;
      httpConnection_Response0.headers = map0;
      String string1 = httpConnection_Response0.charset();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      List<String> list0 = null;
      Connection.Method connection_Method0 = Connection.Method.POST;
      httpConnection_Response0.method = connection_Method0;
      List<String> list1 = hashMap0.put(string0, list0);
      // Undeclared exception!
      try { 
        httpConnection_Response0.processResponseHeaders(hashMap0);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      httpConnection_Response0.cookies = (Map<String, String>) hashMap0;
      String string0 = "Cookie map must not be null";
      String string1 = "Pp.tsMnl%t3";
      String string2 = hashMap0.put(string0, string1);
      String string3 = ",R8M@rZ_W";
      Connection.Response connection_Response0 = httpConnection_Response0.removeHeader(string3);
      int int0 = httpConnection_Response0.statusCode();
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "oure";
      String string1 = "barquee";
      String string2 = "ybd?!";
      Connection.Response connection_Response0 = httpConnection_Response0.removeCookie(string2);
      Attributes attributes0 = new Attributes();
      Map<String, String> map0 = attributes0.dataset();
      httpConnection_Response0.headers = map0;
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
  public void test09()  throws Throwable  {
      String string0 = "g#Xf#kO}s";
      String string1 = "qZ?";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = "tbody";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string2);
      String string3 = "2";
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal0.key(string3);
      String string4 = httpConnection_KeyVal0.toString();
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal0.key(string1);
      HttpConnection.KeyVal httpConnection_KeyVal4 = httpConnection_KeyVal0.key(string3);
      String string5 = httpConnection_KeyVal0.toString();
      String string6 = httpConnection_KeyVal0.toString();
      HttpConnection.KeyVal httpConnection_KeyVal5 = httpConnection_KeyVal0.value(string3);
      String string7 = httpConnection_KeyVal0.toString();
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "aE#1\"y;$1X<?VV";
      Connection.Response connection_Response0 = httpConnection_Response0.removeHeader(string0);
      String string1 = "y!.c*BqCe&8\"GQ\\bzDV";
      String string2 = ":\"s/]KAt1!;U\\J5";
      Connection.Response connection_Response1 = httpConnection_Response0.cookie(string1, string2);
      Connection.Response connection_Response2 = httpConnection_Response0.removeHeader(string0);
      String string3 = "";
      URL uRL0 = httpConnection_Response0.url;
      httpConnection_Response0.url = uRL0;
      int int0 = (-290);
      String string4 = "'(zj\"/!9WVNEOsRcW(";
      try { 
        MockURL.URL(string2, string3, int0, string4);
      } catch(MalformedURLException e) {
         //
         // Invalid port number :-290
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      URL uRL0 = MockURL.getFileExample();
      String string0 = httpConnection_Response0.charset();
      // Undeclared exception!
      try { 
        httpConnection_Response0.cookie(string0, string0);
      } catch(IllegalArgumentException e) {
         //
         // Cookie name must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "+?B*/pXm";
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
  public void test13()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.POST;
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      httpConnection_Response0.processResponseHeaders(hashMap0);
      httpConnection_Response0.method = connection_Method0;
      String string0 = httpConnection_Response0.contentType();
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
  public void test14()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      String string0 = "Cookie name must not be null";
      String string1 = "";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string0);
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "Referrer must not be null";
      Connection.Method connection_Method0 = Connection.Method.GET;
      Connection.Response connection_Response0 = httpConnection_Response0.method(connection_Method0);
      Connection.Response connection_Response1 = httpConnection_Response0.removeCookie(string0);
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
  public void test17()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
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
  public void test18()  throws Throwable  {
      String string0 = "`";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.value(string0);
      String string1 = httpConnection_KeyVal0.toString();
      String string2 = "X";
      // Undeclared exception!
      try { 
        HttpConnection.connect(string2);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: X
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "CommentEnd";
      Connection.Response connection_Response0 = httpConnection_Response0.removeCookie(string0);
      String string1 = "map";
      String string2 = "abbr";
      Connection.Response connection_Response1 = httpConnection_Response0.header(string1, string2);
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
  public void test20()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string0 = "allowfullscreen";
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.GERMAN;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      List<String> list1 = hashMap0.put(string0, list0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      String string1 = "";
      String string2 = null;
      // Undeclared exception!
      try { 
        httpConnection_Response0.header(string1, string2);
      } catch(IllegalArgumentException e) {
         //
         // Header name must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = httpConnection_Response0.statusMessage();
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "<F{JUiV/b`?exlS#b";
      String string1 = "hsiTc>FUd;3j!e@[cp";
      Connection.Response connection_Response0 = httpConnection_Response0.removeHeader(string1);
      Connection.Response connection_Response1 = httpConnection_Response0.removeCookie(string0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string2 = "";
      String string3 = hashMap0.put(string2, string0);
      BiFunction<String, String, String> biFunction0 = (BiFunction<String, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyString() , anyString());
      hashMap0.replaceAll(biFunction0);
      httpConnection_Response0.headers = (Map<String, String>) hashMap0;
      URL uRL0 = httpConnection_Response0.url;
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
  public void test23()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "ZrBIFQ\\Fl<Xew";
      Connection.Response connection_Response0 = httpConnection_Response0.header(string0, string0);
      String string1 = "e%yDO";
      Connection.Response connection_Response1 = httpConnection_Response0.removeCookie(string1);
      String string2 = "abbr";
      Connection.Response connection_Response2 = httpConnection_Response0.removeHeader(string2);
      HttpConnection.Response httpConnection_Response1 = new HttpConnection.Response();
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
  public void test24()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      String string0 = "org.jsoup.select.Evaluator$AllElements";
      String string1 = "mPeo";
      TextNode textNode0 = new TextNode(string0, string1);
      TextNode textNode1 = textNode0.text(string0);
      Attributes attributes0 = textNode1.attributes();
      Map<String, String> map0 = attributes0.dataset();
      Connection connection1 = connection0.cookies(map0);
      boolean boolean0 = true;
      Connection connection2 = connection0.ignoreHttpErrors(boolean0);
      String string2 = "Accept-Encoding";
      String string3 = "R ?6QLc";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string2, string3);
      String string4 = "button";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.value(string4);
      String string5 = "";
      // Undeclared exception!
      try { 
        httpConnection_KeyVal0.key(string5);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      boolean boolean0 = true;
      Connection connection1 = connection0.ignoreHttpErrors(boolean0);
      String string0 = "Accept-Encoding";
      String string1 = "R ?6QLc";
      String string2 = "button";
      String string3 = "";
      boolean boolean1 = true;
      Connection connection2 = connection1.ignoreContentType(boolean1);
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      boolean boolean0 = true;
      Connection connection1 = connection0.ignoreHttpErrors(boolean0);
      String string0 = "code";
      // Undeclared exception!
      try { 
        connection1.url(string0);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: code
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test27()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      boolean boolean0 = false;
      Connection connection1 = connection0.ignoreHttpErrors(boolean0);
      String string0 = "abbr";
      Connection connection2 = connection1.header(string0, string0);
      String string1 = "R ?6QLc";
      String string2 = "button";
  }
}
