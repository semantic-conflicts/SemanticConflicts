/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 07:36:43 GMT 2020
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
      OkBuffer okBuffer1 = new OkBuffer();
      GzipSource gzipSource0 = new GzipSource(okBuffer1);
      long long0 = 1558L;
      okBuffer1.clear();
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
  public void test01()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = (-1889);
      OkBuffer okBuffer1 = okBuffer0.writeInt(int0);
      int int1 = 20;
      OkBuffer okBuffer2 = okBuffer1.writeShort(int1);
      int int2 = 0;
      OkBuffer okBuffer3 = okBuffer2.writeInt(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer3);
      Deadline deadline0 = new Deadline();
      try { 
        gzipSource0.read(okBuffer2, int1, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0xffffffff != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = (-1998);
      OkBuffer okBuffer1 = okBuffer0.writeInt(int0);
      int int1 = 0;
      OkBuffer okBuffer2 = okBuffer1.writeByte(int1);
      GzipSource gzipSource0 = new GzipSource(okBuffer2);
      Deadline deadline0 = Deadline.NONE;
      gzipSource0.close(deadline0);
      // Undeclared exception!
      try { 
        gzipSource0.read(okBuffer0, int0, deadline0);
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1998
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 1984;
      GzipSource gzipSource0 = new GzipSource(okBuffer0);
      Deadline deadline0 = Deadline.NONE;
      deadline0.throwIfReached();
      String string0 = "&*SBD5*g`f+t,-Vz<;L";
      okBuffer0.writeUtf8(string0);
      try { 
        gzipSource0.read(okBuffer0, int0, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0x00262a != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      GzipSource gzipSource0 = new GzipSource(okBuffer0);
      long long0 = 8L;
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      long long1 = 3717L;
      System.setCurrentTimeMillis(long0);
      TimeUnit timeUnit1 = TimeUnit.DAYS;
      TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
      long long2 = 0L;
      Deadline deadline0 = Deadline.NONE;
      long long3 = gzipSource0.read(okBuffer0, long2, deadline0);
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 2012;
      OkBuffer okBuffer1 = okBuffer0.writeInt(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer1);
      long long0 = 1583L;
      Deadline deadline0 = Deadline.NONE;
      String string0 = ";WC?;gnL}tsP";
      OkBuffer okBuffer2 = okBuffer1.writeShort(int0);
      okBuffer1.writeUtf8(string0);
      try { 
        gzipSource0.read(okBuffer1, long0, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0x000000 != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      GzipSource gzipSource0 = new GzipSource(okBuffer0);
      Deadline deadline0 = new Deadline();
      gzipSource0.close(deadline0);
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      GzipSource gzipSource0 = new GzipSource(okBuffer0);
      long long0 = 0L;
      Deadline deadline0 = Deadline.NONE;
      long long1 = gzipSource0.read(okBuffer0, long0, deadline0);
      gzipSource0.close(deadline0);
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 55;
      OkBuffer okBuffer1 = okBuffer0.writeShort(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer1);
      Deadline deadline0 = Deadline.NONE;
      try { 
        gzipSource0.read(okBuffer1, int0, deadline0);
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 966;
      OkBuffer okBuffer1 = okBuffer0.writeInt(int0);
      int int1 = 52;
      OkBuffer okBuffer2 = okBuffer1.writeShort(int1);
      OkBuffer okBuffer3 = okBuffer2.writeByte(int1);
      GzipSource gzipSource0 = new GzipSource(okBuffer3);
      long long0 = 1776L;
      Deadline deadline0 = Deadline.NONE;
      try { 
        gzipSource0.read(okBuffer3, long0, deadline0);
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 97;
      OkBuffer okBuffer1 = okBuffer0.writeByte(int0);
      OkBuffer okBuffer2 = okBuffer1.writeShort(int0);
      OkBuffer okBuffer3 = okBuffer2.writeInt(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer3);
      Deadline deadline0 = Deadline.NONE;
      gzipSource0.close(deadline0);
      long long0 = (-1291L);
      Deadline deadline1 = null;
      // Undeclared exception!
      try { 
        gzipSource0.read(okBuffer2, long0, deadline1);
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1291
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      okBuffer0.clear();
      String string0 = "_qBi-HCYn";
      ByteString byteString0 = ByteString.encodeUtf8(string0);
      okBuffer0.write(byteString0);
      int int0 = 0;
      OkBuffer okBuffer1 = okBuffer0.writeShort(int0);
      OkBuffer okBuffer2 = okBuffer1.writeInt(int0);
      Segment segment0 = new Segment();
      okBuffer2.head = segment0;
      String string1 = okBuffer1.readUtf8(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer2);
      short short0 = okBuffer2.readShort();
      Deadline deadline0 = new Deadline();
      long long0 = 10L;
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      Deadline deadline1 = deadline0.start(long0, timeUnit0);
      long long1 = gzipSource0.read(okBuffer2, int0, deadline0);
      long long2 = gzipSource0.read(okBuffer2, long1, deadline1);
      gzipSource0.close(deadline0);
      long long3 = 0L;
      long long4 = gzipSource0.read(okBuffer0, long3, deadline0);
      long long5 = 0L;
      long long6 = gzipSource0.read(okBuffer2, long5, deadline0);
      gzipSource0.close(deadline1);
      gzipSource0.close(deadline1);
      long long7 = 964L;
      // Undeclared exception!
      try { 
        gzipSource0.read(okBuffer2, long7, deadline1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.internal.bytes.Segment", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 2002;
      OkBuffer okBuffer1 = okBuffer0.writeInt(int0);
      GzipSource gzipSource0 = new GzipSource(okBuffer1);
      long long0 = 1583L;
      Deadline deadline0 = Deadline.NONE;
      deadline0.throwIfReached();
      String string0 = "&*SBD5*g`f+t,-Vz<;L";
      OkBuffer okBuffer2 = okBuffer1.writeShort(int0);
      okBuffer1.writeUtf8(string0);
      try { 
        gzipSource0.read(okBuffer1, long0, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0x000000 != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 0;
      OkBuffer okBuffer1 = okBuffer0.writeByte(int0);
      byte byte0 = okBuffer0.readByte();
      String string0 = "y~}a`:me$v[Rn[<w";
      okBuffer1.writeUtf8(string0);
      int int1 = 0;
      OkBuffer okBuffer2 = okBuffer1.writeInt(int1);
      GzipSource gzipSource0 = new GzipSource(okBuffer2);
      Deadline deadline0 = Deadline.NONE;
      int int2 = 0;
      OkBuffer okBuffer3 = okBuffer0.writeInt(int2);
      deadline0.throwIfReached();
      List<Integer> list0 = okBuffer2.segmentSizes();
      gzipSource0.close(deadline0);
      gzipSource0.close(deadline0);
      byte[] byteArray0 = null;
      int int3 = 9;
      okBuffer2.write(byteArray0, int3, int0);
      gzipSource0.close(deadline0);
      long long0 = 2L;
      try { 
        gzipSource0.read(okBuffer1, long0, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0x00797e != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = (-1087);
      OkBuffer okBuffer1 = okBuffer0.writeByte(int0);
      OkBuffer okBuffer2 = okBuffer1.writeInt(int0);
      int int1 = okBuffer0.readIntLe();
      long long0 = (-907L);
      okBuffer0.byteCount = long0;
      GzipSource gzipSource0 = new GzipSource(okBuffer2);
      long long1 = 1980L;
      Deadline deadline0 = null;
      // Undeclared exception!
      try { 
        gzipSource0.read(okBuffer2, long1, deadline0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.internal.Util", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      Inflater inflater0 = new Inflater();
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      int int0 = 0;
      inflater0.setInput(byteArray0, (int) byteArray0[4], int0);
      InflaterSource inflaterSource0 = new InflaterSource(okBuffer0, inflater0, okBuffer0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      Deadline deadline0 = null;
      long long0 = (-2769L);
      okBuffer0.byteCount = long0;
      boolean boolean0 = inflater0.finished();
      // Undeclared exception!
      try { 
        gzipSource0.close(deadline0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.internal.Util", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource(okBuffer0, inflater0);
      InflaterSource inflaterSource1 = new InflaterSource(inflaterSource0, inflater0, okBuffer0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource1);
      long long0 = 3L;
      Deadline deadline0 = new Deadline();
      long long1 = (-1998L);
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      Deadline deadline1 = deadline0.start(long1, timeUnit0);
      gzipSource0.close(deadline0);
      Deadline deadline2 = new Deadline();
      // Undeclared exception!
      try { 
        gzipSource0.read(okBuffer0, long0, deadline2);
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("com.squareup.okhttp.internal.bytes.InflaterSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 2002;
      OkBuffer okBuffer1 = okBuffer0.writeInt(int0);
      int int1 = okBuffer1.readShortLe();
      GzipSource gzipSource0 = new GzipSource(okBuffer1);
      long long0 = 1583L;
      Deadline deadline0 = Deadline.NONE;
      deadline0.throwIfReached();
      String string0 = "&*SBD5*g`f+t,-Vz<;L";
      OkBuffer okBuffer2 = okBuffer1.writeShort(int0);
      okBuffer1.writeUtf8(string0);
      try { 
        gzipSource0.read(okBuffer1, long0, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0x0007d2 != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      int int0 = 966;
      OkBuffer okBuffer1 = okBuffer0.writeInt(int0);
      int int1 = 67;
      OkBuffer okBuffer2 = okBuffer1.writeShort(int1);
      OkBuffer okBuffer3 = okBuffer1.writeInt(int1);
      GzipSource gzipSource0 = new GzipSource(okBuffer3);
      long long0 = 1776L;
      Deadline deadline0 = null;
      try { 
        gzipSource0.read(okBuffer3, int0, deadline0);
      } catch(IOException e) {
         //
         // ID1ID2: actual 0x000000 != expected 0x001f8b
         //
         verifyException("com.squareup.okhttp.internal.bytes.GzipSource", e);
      }
  }
}
