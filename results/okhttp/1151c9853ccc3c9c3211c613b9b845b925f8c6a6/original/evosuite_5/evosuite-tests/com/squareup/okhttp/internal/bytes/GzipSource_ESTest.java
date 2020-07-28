/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 07:35:05 GMT 2020
 */

package com.squareup.okhttp.internal.bytes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.squareup.okhttp.internal.bytes.ByteString;
import com.squareup.okhttp.internal.bytes.Deadline;
import com.squareup.okhttp.internal.bytes.GzipSource;
import com.squareup.okhttp.internal.bytes.InflaterSource;
import com.squareup.okhttp.internal.bytes.OkBuffer;
import com.squareup.okhttp.internal.bytes.Segment;
import com.squareup.okhttp.internal.bytes.Source;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GzipSource_ESTest extends GzipSource_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      GzipSource gzipSource0 = new GzipSource(okBuffer0);
      Deadline deadline0 = new Deadline();
      gzipSource0.close(deadline0);
      long long0 = 1102L;
      try { 
        gzipSource0.read(okBuffer0, long0, deadline0);
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = (-2276);
      OkBuffer okBuffer1 = okBuffer0.writeShort(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer1);
      Deadline deadline0 = Deadline.NONE;
      long long0 = 0L;
      long long1 = gzipSource0.read(okBuffer1, long0, deadline0);
      // Undeclared exception!
      try { 
        gzipSource0.read(okBuffer0, int0, deadline0);
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -2276
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = (-138);
      OkBuffer okBuffer1 = okBuffer0.writeShort(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer1);
      String string0 = ":1GCFOY`";
      okBuffer1.writeUtf8(string0);
      long long0 = 1048576L;
      OkBuffer okBuffer2 = okBuffer1.writeInt(int0);
      Deadline deadline0 = new Deadline();
      try { 
        gzipSource0.read(okBuffer1, long0, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0xffffff76 != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 19;
      OkBuffer okBuffer1 = okBuffer0.writeByte(int0);
      int int1 = (-2040109455);
      OkBuffer okBuffer2 = okBuffer1.writeInt(int1);
      int int2 = 50;
      OkBuffer okBuffer3 = okBuffer2.writeShort(int2);
      GzipSource gzipSource0 = new GzipSource(okBuffer3);
      int int3 = 2146938324;
      OkBuffer okBuffer4 = okBuffer0.writeByte(int3);
      int int4 = (-996);
      OkBuffer okBuffer5 = okBuffer1.writeShort(int0);
      Deadline deadline0 = new Deadline();
      long long0 = 2684L;
      try { 
        gzipSource0.read(okBuffer5, long0, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0x001386 != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      GzipSource gzipSource0 = new GzipSource(okBuffer0);
      Deadline deadline0 = Deadline.NONE;
      gzipSource0.close(deadline0);
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      GzipSource gzipSource0 = new GzipSource(okBuffer0);
      long long0 = 2L;
      Deadline deadline0 = new Deadline();
      try { 
        gzipSource0.read(okBuffer0, long0, deadline0);
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 2155;
      OkBuffer okBuffer1 = okBuffer0.writeShort(int0);
      boolean boolean0 = true;
      Inflater inflater0 = new Inflater(boolean0);
      InflaterSource inflaterSource0 = new InflaterSource(okBuffer1, inflater0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      Deadline deadline0 = new Deadline();
      try { 
        gzipSource0.read(okBuffer0, int0, deadline0);
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("com.squareup.okhttp.internal.bytes.InflaterSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      Source source0 = null;
      GzipSource gzipSource0 = null;
      try {
        gzipSource0 = new GzipSource(source0);
      } catch(IllegalArgumentException e) {
         //
         // source == null
         //
         verifyException("com.squareup.okhttp.internal.bytes.InflaterSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 0;
      OkBuffer okBuffer1 = okBuffer0.writeInt(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer1);
      long long0 = 3804L;
      Deadline deadline0 = new Deadline();
      try { 
        gzipSource0.read(okBuffer0, long0, deadline0);
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = (-138);
      OkBuffer okBuffer1 = okBuffer0.writeShort(int0);
      int int1 = 8;
      OkBuffer okBuffer2 = okBuffer1.writeInt(int1);
      GzipSource gzipSource0 = new GzipSource(okBuffer2);
      String string0 = ":1GCFOY`";
      okBuffer1.writeUtf8(string0);
      long long0 = 1048576L;
      Deadline deadline0 = new Deadline();
      try { 
        gzipSource0.read(okBuffer0, long0, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0xffffff76 != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 0;
      OkBuffer okBuffer1 = okBuffer0.writeShort(int0);
      int int1 = (-188);
      OkBuffer okBuffer2 = okBuffer1.writeInt(int1);
      OkBuffer okBuffer3 = okBuffer2.writeByte(int1);
      GzipSource gzipSource0 = new GzipSource(okBuffer3);
      Deadline deadline0 = new Deadline();
      gzipSource0.close(deadline0);
      OkBuffer okBuffer4 = new OkBuffer();
      long long0 = gzipSource0.read(okBuffer4, int0, deadline0);
      String string0 = "x=u";
      okBuffer4.writeUtf8(string0);
      gzipSource0.close(deadline0);
      long long1 = (-57L);
      // Undeclared exception!
      try { 
        gzipSource0.read(okBuffer4, long1, deadline0);
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -57
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      String string0 = okBuffer0.toString();
      int int0 = 1824;
      OkBuffer okBuffer1 = okBuffer0.writeInt(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer1);
      Segment segment0 = new Segment();
      okBuffer1.head = segment0;
      Deadline deadline0 = Deadline.NONE;
      // Undeclared exception!
      try { 
        gzipSource0.read(okBuffer0, int0, deadline0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.internal.bytes.Segment", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      boolean boolean0 = true;
      Inflater inflater0 = new Inflater(boolean0);
      InflaterSource inflaterSource0 = new InflaterSource(okBuffer0, inflater0, okBuffer0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      InflaterSource inflaterSource1 = new InflaterSource(gzipSource0, inflater0);
      GzipSource gzipSource1 = new GzipSource(inflaterSource1);
      Deadline deadline0 = Deadline.NONE;
      boolean boolean1 = inflater0.finished();
      gzipSource1.close(deadline0);
      long long0 = 0L;
      long long1 = gzipSource0.read(okBuffer0, long0, deadline0);
      long long2 = (-1L);
      long long3 = 2L;
      // Undeclared exception!
      try { 
        gzipSource0.read(okBuffer0, long3, deadline0);
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("com.squareup.okhttp.internal.bytes.InflaterSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 99;
      OkBuffer okBuffer1 = okBuffer0.writeShort(int0);
      OkBuffer okBuffer2 = okBuffer1.writeByte(int0);
      OkBuffer okBuffer3 = okBuffer2.writeInt(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer3);
      Deadline deadline0 = new Deadline();
      gzipSource0.close(deadline0);
      String string0 = "=nRBBpED^{ ]v*&mvk@";
      okBuffer3.writeUtf8(string0);
      long long0 = 0L;
      Segment segment0 = okBuffer1.writableSegment(int0);
      okBuffer1.head = segment0;
      int int1 = okBuffer1.readShortLe();
      Deadline deadline1 = Deadline.NONE;
      gzipSource0.close(deadline1);
      gzipSource0.close(deadline1);
      long long1 = 1102L;
      try { 
        gzipSource0.read(okBuffer3, long1, deadline1);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0x006300 != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      long long0 = (-3128L);
      okBuffer0.byteCount = long0;
      GzipSource gzipSource0 = new GzipSource(okBuffer0);
      long long1 = 0L;
      Deadline deadline0 = new Deadline();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      Deadline deadline1 = deadline0.start(long1, timeUnit0);
      long long2 = gzipSource0.read(okBuffer0, long1, deadline1);
      gzipSource0.close(deadline0);
      List<Integer> list0 = okBuffer0.segmentSizes();
      long long3 = 8L;
      // Undeclared exception!
      try { 
        gzipSource0.read(okBuffer0, long3, deadline0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.internal.Util", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 99;
      OkBuffer okBuffer1 = okBuffer0.writeShort(int0);
      OkBuffer okBuffer2 = okBuffer0.writeInt(int0);
      OkBuffer okBuffer3 = okBuffer2.writeInt(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer3);
      String string0 = "";
      okBuffer3.writeUtf8(string0);
      Deadline deadline0 = new Deadline();
      gzipSource0.close(deadline0);
      String string1 = "=nRBBpED^{ ]v*&mvk@";
      okBuffer3.writeUtf8(string1);
      long long0 = 0L;
      Segment segment0 = okBuffer1.writableSegment(int0);
      okBuffer1.head = segment0;
      int int1 = okBuffer1.readShortLe();
      Deadline deadline1 = Deadline.NONE;
      gzipSource0.close(deadline1);
      gzipSource0.close(deadline1);
      long long1 = 1102L;
      try { 
        gzipSource0.read(okBuffer3, long1, deadline1);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0x000000 != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = (-138);
      OkBuffer okBuffer1 = okBuffer0.writeShort(int0);
      int int1 = (-10);
      OkBuffer okBuffer2 = okBuffer1.writeInt(int1);
      GzipSource gzipSource0 = new GzipSource(okBuffer2);
      String string0 = ":1GCFOY`";
      okBuffer1.writeUtf8(string0);
      long long0 = 1048576L;
      Deadline deadline0 = new Deadline();
      try { 
        gzipSource0.read(okBuffer0, long0, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0xffffff76 != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = (-138);
      OkBuffer okBuffer1 = okBuffer0.writeShort(int0);
      int int1 = 8;
      GzipSource gzipSource0 = new GzipSource(okBuffer1);
      String string0 = ":1GCFOY`";
      okBuffer1.writeUtf8(string0);
      long long0 = 1048576L;
      Deadline deadline0 = Deadline.NONE;
      try { 
        gzipSource0.read(okBuffer0, long0, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0xffffff76 != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }
}