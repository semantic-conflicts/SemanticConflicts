/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 14:02:52 GMT 2020
 */

package retrofit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import java.io.File;
import java.io.Reader;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import retrofit.RequestBuilder;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;
import retrofit.mime.TypedFile;
import retrofit.mime.TypedOutput;
import retrofit.mime.TypedString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RequestBuilder_ESTest extends RequestBuilder_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) requestBuilder0;
      objectArray0[1] = (Object) requestBuilder0;
      objectArray0[2] = (Object) requestBuilder0;
      objectArray0[3] = (Object) requestBuilder0;
      objectArray0[4] = (Object) requestBuilder0;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        requestBuilder0.buildBody();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      Reader reader0 = null;
      String string0 = "s4M4X)2^uNecja|#=5";
      int int0 = (-46160863);
      Random.setNextRandom(int0);
      RequestBuilder requestBuilder0 = new RequestBuilder();
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      RequestBuilder requestBuilder2 = requestBuilder1.methodInfo(requestBuilder0.methodInfo);
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      RequestBuilder requestBuilder3 = requestBuilder2.headers(linkedList0);
      RequestBuilder requestBuilder4 = requestBuilder3.args(requestBuilder1.args);
      // Undeclared exception!
      try { 
        requestBuilder4.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      Object[] objectArray0 = new Object[0];
      String string0 = "_8/<T_}P9IV?B";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      RequestBuilder requestBuilder2 = requestBuilder0.args(objectArray0);
      requestBuilder1.args = objectArray0;
      requestBuilder2.methodInfo = requestBuilder0.methodInfo;
      // Undeclared exception!
      try { 
        requestBuilder0.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      String string0 = "6ZaV3UJ=lB`DINQ>";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      RequestBuilder requestBuilder2 = requestBuilder1.methodInfo(requestBuilder0.methodInfo);
      RequestBuilder requestBuilder3 = requestBuilder2.methodInfo(requestBuilder1.methodInfo);
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      // Undeclared exception!
      try { 
        requestBuilder0.buildRelativeUrl();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder();
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      RequestBuilder requestBuilder1 = requestBuilder0.headers(linkedList0);
      // Undeclared exception!
      try { 
        requestBuilder1.buildBody();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      int int0 = (-1073741822);
      Random.setNextRandom(int0);
      RequestBuilder requestBuilder0 = new RequestBuilder();
      String string0 = "u/";
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      RequestBuilder requestBuilder2 = requestBuilder1.args(requestBuilder0.args);
      RequestBuilder requestBuilder3 = requestBuilder2.headers(requestBuilder0.headers);
      requestBuilder3.converter = requestBuilder1.converter;
      // Undeclared exception!
      try { 
        requestBuilder3.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      RequestBuilder requestBuilder1 = requestBuilder0.headers(linkedList0);
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      RequestBuilder requestBuilder1 = requestBuilder0.args(objectArray0);
      RequestBuilder requestBuilder2 = requestBuilder1.methodInfo(requestBuilder0.methodInfo);
      String string0 = "{";
      RequestBuilder requestBuilder3 = requestBuilder2.headers(requestBuilder0.headers);
      RequestBuilder requestBuilder4 = requestBuilder2.apiUrl(string0);
      RequestBuilder requestBuilder5 = requestBuilder4.headers(requestBuilder2.headers);
      // Undeclared exception!
      try { 
        requestBuilder1.buildRelativeUrl();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      // Undeclared exception!
      try { 
        requestBuilder0.buildBody();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) requestBuilder0;
      objectArray0[1] = (Object) requestBuilder0;
      objectArray0[2] = (Object) requestBuilder0;
      RequestBuilder requestBuilder1 = requestBuilder0.args(objectArray0);
      RequestBuilder requestBuilder2 = requestBuilder0.args(objectArray0);
      // Undeclared exception!
      try { 
        requestBuilder1.buildBody();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      Converter converter0 = null;
      RequestBuilder requestBuilder0 = new RequestBuilder(converter0);
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      RequestBuilder requestBuilder1 = requestBuilder0.headers(linkedList0);
      RequestBuilder requestBuilder2 = requestBuilder1.apiUrl(requestBuilder0.apiUrl);
      requestBuilder2.converter = requestBuilder1.converter;
      String string0 = "";
      RequestBuilder requestBuilder3 = requestBuilder2.apiUrl(string0);
      RequestBuilder requestBuilder4 = requestBuilder3.apiUrl(requestBuilder2.apiUrl);
      requestBuilder4.args = requestBuilder2.args;
      RequestBuilder requestBuilder5 = requestBuilder2.args(requestBuilder0.args);
      RequestBuilder requestBuilder6 = requestBuilder5.methodInfo(requestBuilder0.methodInfo);
      RequestBuilder requestBuilder7 = requestBuilder6.methodInfo(requestBuilder2.methodInfo);
      String string1 = "[f8}YJDMVBq]5`I0";
      RequestBuilder requestBuilder8 = requestBuilder1.apiUrl(string1);
      // Undeclared exception!
      try { 
        requestBuilder6.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      int int0 = (-1073741822);
      Random.setNextRandom(int0);
      RequestBuilder requestBuilder0 = new RequestBuilder();
      String string0 = "u/";
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      RequestBuilder requestBuilder2 = requestBuilder1.args(requestBuilder0.args);
      RequestBuilder requestBuilder3 = requestBuilder2.headers(requestBuilder0.headers);
      requestBuilder3.converter = requestBuilder1.converter;
      // Undeclared exception!
      try { 
        requestBuilder3.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }
}