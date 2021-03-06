/*
 * This file was automatically generated by EvoSuite
 * Mon May 25 21:33:24 GMT 2020
 */

package com.github.javafaker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javafaker.Address;
import com.github.javafaker.App;
import com.github.javafaker.Book;
import com.github.javafaker.Business;
import com.github.javafaker.Code;
import com.github.javafaker.Color;
import com.github.javafaker.Company;
import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;
import com.github.javafaker.Finance;
import com.github.javafaker.Hacker;
import com.github.javafaker.Internet;
import com.github.javafaker.Lorem;
import com.github.javafaker.Name;
import com.github.javafaker.Number;
import com.github.javafaker.Options;
import com.github.javafaker.PhoneNumber;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.FakeValuesServiceInterface;
import com.github.javafaker.service.RandomService;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Faker_ESTest extends Faker_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      Faker faker0 = new Faker(locale0);
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Faker faker0 = new Faker(mockRandom0);
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      MockRandom mockRandom0 = new MockRandom();
      RandomService randomService0 = new RandomService(mockRandom0);
      FakeValuesService fakeValuesService0 = new FakeValuesService(locale0, randomService0);
      Proxy proxy0 = (Proxy)Faker.createProxiedFakeValuesService(fakeValuesService0, fakeValuesService0);
      Faker faker0 = new Faker();
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      Faker faker0 = new Faker();
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      MockRandom mockRandom0 = new MockRandom();
      int int0 = (-181);
      int int1 = mockRandom0.nextInt(int0);
      Faker faker0 = new Faker(locale0, mockRandom0);
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.UK;
      String string0 = locale0.toLanguageTag();
      Faker faker0 = new Faker(locale0);
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      Faker faker0 = new Faker();
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      String string0 = "o`4 K*QU:Fyk*";
      Locale locale0 = new Locale(string0);
      long long0 = 1162L;
      String string1 = locale0.getDisplayCountry();
      MockRandom mockRandom0 = new MockRandom(long0);
      boolean boolean0 = mockRandom0.nextBoolean();
      Faker faker0 = null;
      try {
        faker0 = new Faker(locale0, mockRandom0);
      } catch(RuntimeException e) {
         //
         // o`4 k*qu:fyk* could not be found, does not have a corresponding yaml file
         //
         verifyException("com.github.javafaker.service.FakeValuesService", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      long long0 = 0L;
      MockRandom mockRandom0 = new MockRandom(long0);
      Faker faker0 = new Faker(mockRandom0);
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      String string0 = "";
      Locale locale0 = new Locale(string0);
      String string1 = locale0.getDisplayName();
      Faker faker0 = null;
      try {
        faker0 = new Faker(locale0);
      } catch(RuntimeException e) {
         //
         //  could not be found, does not have a corresponding yaml file
         //
         verifyException("com.github.javafaker.service.FakeValuesService", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      Faker faker0 = new Faker(locale0);
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      FakeValuesServiceInterface fakeValuesServiceInterface0 = null;
      Proxy proxy0 = (Proxy)Faker.createProxiedFakeValuesService(fakeValuesServiceInterface0, fakeValuesServiceInterface0);
      Locale locale0 = Locale.PRC;
      Faker faker0 = new Faker(locale0);
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      Locale locale0 = null;
      long long0 = (-1342L);
      MockRandom mockRandom0 = new MockRandom(long0);
      Faker faker0 = null;
      try {
        faker0 = new Faker(locale0, mockRandom0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.service.FakeValuesService", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale locale0 = Locale.lookup(linkedList0, linkedList1);
      Faker faker0 = null;
      try {
        faker0 = new Faker(locale0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.service.FakeValuesService", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      long long0 = (-1374L);
      MockRandom mockRandom0 = new MockRandom(long0);
      RandomService randomService0 = new RandomService(mockRandom0);
      FakeValuesService fakeValuesService0 = new FakeValuesService(locale0, randomService0);
      int int0 = 92;
      int int1 = randomService0.nextInt(int0);
      Proxy proxy0 = (Proxy)Faker.createProxiedFakeValuesService(fakeValuesService0, fakeValuesService0);
      Proxy proxy1 = (Proxy)Faker.createProxiedFakeValuesService((FakeValuesServiceInterface) proxy0, fakeValuesService0);
      Faker faker0 = new Faker(locale0, mockRandom0);
  }
}
