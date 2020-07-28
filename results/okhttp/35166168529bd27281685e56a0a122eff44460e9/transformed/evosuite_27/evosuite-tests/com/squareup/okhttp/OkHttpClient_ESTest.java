/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 02:15:30 GMT 2020
 */

package com.squareup.okhttp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.squareup.okhttp.Address;
import com.squareup.okhttp.OkHttpClient;
import java.net.Proxy;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OkHttpClient_ESTest extends OkHttpClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      SSLSocketFactory sSLSocketFactory0 = HttpsURLConnection.getDefaultSSLSocketFactory();
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : transports == null
      Address address0 = null;
      try {
        address0 = new Address("", 4506, sSLSocketFactory0, (HostnameVerifier) null, okHttpClient0.authenticator, (Proxy) null, (List<String>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // authenticator == null
         //
         verifyException("com.squareup.okhttp.Address", e);
         assertTrue(e.getMessage().equals("authenticator == null"));   
      }
  }
}