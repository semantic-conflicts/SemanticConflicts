/*
 * This file was automatically generated by EvoSuite
 * Fri May 01 16:45:54 GMT 2020
 */

package org.springframework.boot.loader.archive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.jar.Manifest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.springframework.boot.loader.archive.Archive;
import org.springframework.boot.loader.archive.ExplodedArchive;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExplodedArchive_ESTest extends ExplodedArchive_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      String string0 = "\"//V_e=ATPq@o+c#";
      MockFile mockFile0 = new MockFile(string0, string0);
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(mockFile0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid source folder /server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/evosuite_13/\"/V_e=ATPq@o+c#/\"/V_e=ATPq@o+c#
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0);
      boolean boolean0 = mockFile0.delete();
      URL uRL0 = explodedArchive0.getUrl();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      explodedArchive0.forEach(consumer0);
      String string1 = explodedArchive0.toString();
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      String string0 = "jar archive";
      File file0 = MockFile.createTempFile(string0, string0);
      boolean boolean0 = false;
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(file0, boolean0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid source folder /tmp/jar archive0jar archive
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      boolean boolean0 = true;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      explodedArchive0.forEach(consumer0);
      URL uRL0 = explodedArchive0.getUrl();
      URL uRL1 = explodedArchive0.getUrl();
      boolean boolean1 = false;
      boolean boolean2 = true;
      boolean boolean3 = false;
      boolean boolean4 = true;
      Manifest manifest0 = explodedArchive0.getManifest();
      Iterator<Archive.Entry> iterator0 = explodedArchive0.iterator();
      boolean boolean5 = false;
      boolean boolean6 = false;
      boolean boolean7 = true;
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      Iterator<Archive.Entry> iterator1 = explodedArchive0.iterator();
      LinkedList<Archive> linkedList0 = new LinkedList<Archive>();
      boolean boolean8 = false;
      boolean boolean9 = false;
      boolean boolean10 = true;
      Iterator<Archive.Entry> iterator2 = explodedArchive0.iterator();
      String string1 = explodedArchive0.toString();
      URL uRL2 = explodedArchive0.getUrl();
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      String string0 = "org.springframework.boot.loader.archive.ExplodedArchive";
      String string1 = "|kGXBUJ|kan26Fb7R";
      MockFile mockFile0 = new MockFile(string0, string1);
      String string2 = "<O%J:^]h~{q ";
      Path path0 = mockFile0.toPath();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.springframework.boot.loader.archive.ExplodedArchive/|kGXBUJ|kan26Fb7R/META-INF/MANIFEST.MF");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      boolean boolean1 = false;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean1);
      Iterator<Archive.Entry> iterator0 = explodedArchive0.iterator();
      URL uRL0 = explodedArchive0.getUrl();
      String string3 = mockFile0.getAbsolutePath();
      Manifest manifest0 = explodedArchive0.getManifest();
      String string4 = explodedArchive0.toString();
      Manifest manifest1 = explodedArchive0.getManifest();
      URL uRL1 = MockURL.getHttpExample();
      boolean boolean2 = true;
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean2, boolean2).when(archive_EntryFilter0).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      String string5 = explodedArchive0.toString();
      try { 
        explodedArchive0.getNestedArchives(archive_EntryFilter0);
      } catch(FileNotFoundException e) {
         //
         // /server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/evosuite_13/org.springframework.boot.loader.archive.ExplodedArchive/|kGXBUJ|kan26Fb7R/META-INF/MANIFEST.MF (Arquivo ou diret\u00F3rio n\u00E3o encontrado)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      boolean boolean0 = true;
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      File file0 = null;
      boolean boolean0 = false;
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(file0, boolean0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      String string0 = ";l.i";
      MockFile mockFile0 = new MockFile(string0);
      boolean boolean0 = true;
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid source folder ;l.i
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      String string0 = "$O %&~\"@";
      MockFile mockFile0 = new MockFile(string0);
      boolean boolean0 = mockFile0.mkdir();
      boolean boolean1 = false;
      boolean boolean2 = mockFile0.setWritable(boolean1);
      boolean boolean3 = false;
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(mockFile0, boolean3);
      } catch(IllegalArgumentException e) {
         //
         // Invalid source folder $O %&~\"@
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      File file0 = null;
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(file0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      String string0 = "%@&mr@~";
      MockFile mockFile0 = new MockFile(string0, string0);
      boolean boolean0 = mockFile0.setReadOnly();
      File file0 = mockFile0.getAbsoluteFile();
      URL uRL0 = mockFile0.toURL();
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(mockFile0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid source folder /server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/evosuite_13/%@&mr@~/%@&mr@~
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0);
      URL uRL0 = explodedArchive0.getUrl();
      Iterator<Archive.Entry> iterator0 = explodedArchive0.iterator();
      URL uRL1 = explodedArchive0.getUrl();
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      String string0 = "";
      String string1 = "";
      MockFile mockFile0 = new MockFile(string0, string1);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0);
      Manifest manifest0 = explodedArchive0.getManifest();
      Archive.Entry archive_Entry0 = mock(Archive.Entry.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchive(archive_Entry0);
      } catch(ClassCastException e) {
         //
         // org.springframework.boot.loader.archive.Archive$Entry$MockitoMock$1205100659 cannot be cast to org.springframework.boot.loader.archive.ExplodedArchive$FileEntry
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0);
      String string1 = "";
      MockFile mockFile1 = new MockFile(mockFile0, string1);
      boolean boolean0 = mockFile0.createNewFile();
      boolean boolean1 = true;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile1, boolean1);
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      List<Archive> list0 = explodedArchive0.getNestedArchives(archive_EntryFilter0);
      String string2 = explodedArchive0.toString();
      String string3 = explodedArchive0.toString();
      Manifest manifest0 = explodedArchive0.getManifest();
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0);
      MockFile mockFile1 = new MockFile(mockFile0, string0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile1);
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      String string1 = mockFile1.getCanonicalPath();
      explodedArchive0.forEach(consumer0);
      boolean boolean0 = false;
      boolean boolean1 = true;
      boolean boolean2 = mockFile0.setWritable(boolean0, boolean1);
      Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      String string2 = explodedArchive0.toString();
      explodedArchive0.forEach(consumer1);
      List<Archive> list0 = explodedArchive0.getNestedArchives(archive_EntryFilter0);
      Manifest manifest0 = explodedArchive0.getManifest();
      boolean boolean3 = false;
      boolean boolean4 = mockFile0.setWritable(boolean3);
      Archive.Entry archive_Entry0 = mock(Archive.Entry.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchive(archive_Entry0);
      } catch(ClassCastException e) {
         //
         // org.springframework.boot.loader.archive.Archive$Entry$MockitoMock$1205100659 cannot be cast to org.springframework.boot.loader.archive.ExplodedArchive$FileEntry
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      File file0 = null;
      boolean boolean0 = true;
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(file0, boolean0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      boolean boolean0 = false;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      Iterator<Archive.Entry> iterator0 = explodedArchive0.iterator();
      URL uRL0 = explodedArchive0.getUrl();
      URL uRL1 = explodedArchive0.getUrl();
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      String string0 = "aO=Hui|{xNN<";
      MockFile mockFile0 = new MockFile(string0);
      boolean boolean0 = mockFile0.mkdirs();
      boolean boolean1 = true;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean1);
      URL uRL0 = mockFile0.toURL();
      Archive.Entry archive_Entry0 = null;
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      explodedArchive0.forEach(consumer0);
      Spliterator<Archive.Entry> spliterator0 = explodedArchive0.spliterator();
      String string1 = mockFile0.getAbsolutePath();
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchive(archive_Entry0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      String string0 = "f";
      MockFile mockFile0 = new MockFile(string0);
      String string1 = "l)`p2No$Rr.";
      File file0 = MockFile.createTempFile(string1, string1, (File) mockFile0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0);
      URI uRI0 = mockFile0.toURI();
      URL uRL0 = explodedArchive0.getUrl();
      URL uRL1 = explodedArchive0.getUrl();
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(archive_EntryFilter0).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list0 = explodedArchive0.getNestedArchives(archive_EntryFilter0);
      URL uRL2 = explodedArchive0.getUrl();
      String string2 = explodedArchive0.toString();
      URL uRL3 = explodedArchive0.getUrl();
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      String string0 = "";
      String string1 = "";
      MockFile mockFile0 = new MockFile(string0, string1);
      boolean boolean0 = false;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      Iterator<Archive.Entry> iterator0 = explodedArchive0.iterator();
      String string2 = explodedArchive0.toString();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      explodedArchive0.forEach(consumer0);
      boolean boolean1 = mockFile0.setWritable(boolean0);
      URL uRL0 = explodedArchive0.getUrl();
      Iterator<Archive.Entry> iterator1 = explodedArchive0.iterator();
      Iterator<Archive.Entry> iterator2 = explodedArchive0.iterator();
      Manifest manifest0 = explodedArchive0.getManifest();
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      boolean boolean0 = true;
      boolean boolean1 = mockFile0.setReadable(boolean0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      boolean boolean2 = mockFile0.mkdir();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      String string1 = explodedArchive0.toString();
      explodedArchive0.forEach(consumer1);
      boolean boolean3 = mockFile0.setReadOnly();
      Path path0 = mockFile0.toPath();
      explodedArchive0.forEach(consumer0);
      URL uRL0 = explodedArchive0.getUrl();
      URL uRL1 = explodedArchive0.getUrl();
      boolean boolean4 = false;
      boolean boolean5 = false;
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean1, boolean0, boolean4, boolean2, boolean5).when(archive_EntryFilter0).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list0 = explodedArchive0.getNestedArchives(archive_EntryFilter0);
      String string2 = mockFile0.getAbsolutePath();
      boolean boolean6 = true;
      boolean boolean7 = false;
      Archive.EntryFilter archive_EntryFilter1 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean6, boolean7, boolean4, boolean6, boolean1).when(archive_EntryFilter1).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list1 = explodedArchive0.getNestedArchives(archive_EntryFilter1);
      Manifest manifest0 = explodedArchive0.getManifest();
      String string3 = explodedArchive0.toString();
      Iterator<Archive.Entry> iterator0 = explodedArchive0.iterator();
      boolean boolean8 = false;
      Archive.EntryFilter archive_EntryFilter2 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean5, boolean8, boolean6, boolean2, boolean2).when(archive_EntryFilter2).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list2 = explodedArchive0.getNestedArchives(archive_EntryFilter2);
      boolean boolean9 = false;
      boolean boolean10 = true;
      boolean boolean11 = false;
      boolean boolean12 = true;
      Archive.EntryFilter archive_EntryFilter3 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean9, boolean10, boolean11, boolean12, boolean6).when(archive_EntryFilter3).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      Iterator<Archive.Entry> iterator1 = explodedArchive0.iterator();
      List<Archive> list3 = explodedArchive0.getNestedArchives(archive_EntryFilter3);
      Archive.EntryFilter archive_EntryFilter4 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean3, boolean0, boolean6, boolean3, boolean11).when(archive_EntryFilter4).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list4 = explodedArchive0.getNestedArchives(archive_EntryFilter4);
      String string4 = explodedArchive0.toString();
      URL uRL2 = explodedArchive0.getUrl();
      URL uRL3 = explodedArchive0.getUrl();
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      String string0 = "org.springframework.boot.loader.archive.ExplodedArchive";
      String string1 = "|kGXBUJ|kan26Fb7R";
      MockFile mockFile0 = new MockFile(string0, string1);
      URI uRI0 = mockFile0.toURI();
      String string2 = "<]%J:M]h~{q ";
      File file0 = MockFile.createTempFile(string2, string2, (File) mockFile0);
      Path path0 = mockFile0.toPath();
      String string3 = mockFile0.getCanonicalPath();
      boolean boolean0 = false;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      Iterator<Archive.Entry> iterator0 = explodedArchive0.iterator();
      URL uRL0 = explodedArchive0.getUrl();
      String string4 = mockFile0.getAbsolutePath();
      Manifest manifest0 = explodedArchive0.getManifest();
      String string5 = explodedArchive0.toString();
      Manifest manifest1 = explodedArchive0.getManifest();
      URL uRL1 = explodedArchive0.getUrl();
      URL uRL2 = explodedArchive0.getUrl();
      boolean boolean1 = true;
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean1).when(archive_EntryFilter0).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      String string6 = explodedArchive0.toString();
      try { 
        explodedArchive0.getNestedArchives(archive_EntryFilter0);
      } catch(FileNotFoundException e) {
         //
         // /server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/evosuite_13/org.springframework.boot.loader.archive.ExplodedArchive/|kGXBUJ|kan26Fb7R/<]%J:M]h~{q 0<]%J:M]h~{q  (Arquivo ou diret\u00F3rio n\u00E3o encontrado)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      String string0 = "";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("META-INF/MANIFEST.MF");
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      MockFile mockFile0 = new MockFile(string0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      explodedArchive0.forEach(consumer0);
      Manifest manifest0 = explodedArchive0.getManifest();
      String string1 = explodedArchive0.toString();
      Archive.Entry archive_Entry0 = mock(Archive.Entry.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchive(archive_Entry0);
      } catch(ClassCastException e) {
         //
         // org.springframework.boot.loader.archive.Archive$Entry$MockitoMock$1205100659 cannot be cast to org.springframework.boot.loader.archive.ExplodedArchive$FileEntry
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("META-INF/MANIFEST.MF");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      explodedArchive0.forEach(consumer0);
      try { 
        explodedArchive0.getManifest();
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("META-INF/MANIFEST.MF");
      String string1 = "8%Q[53A+l";
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string1);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      explodedArchive0.forEach(consumer0);
      try { 
        explodedArchive0.getManifest();
      } catch(IOException e) {
         //
         // invalid header field
         //
         verifyException("java.util.jar.Attributes", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0);
      boolean boolean0 = mockFile0.delete();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      explodedArchive0.forEach(consumer0);
      Archive.Entry archive_Entry0 = mock(Archive.Entry.class, new ViolatedAssumptionAnswer());
      String string1 = explodedArchive0.toString();
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchive(archive_Entry0);
      } catch(ClassCastException e) {
         //
         // org.springframework.boot.loader.archive.Archive$Entry$MockitoMock$1205100659 cannot be cast to org.springframework.boot.loader.archive.ExplodedArchive$FileEntry
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      boolean boolean0 = true;
      boolean boolean1 = mockFile0.setReadable(boolean0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      boolean boolean2 = mockFile0.mkdir();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      String string1 = explodedArchive0.toString();
      explodedArchive0.forEach(consumer1);
      boolean boolean3 = FileSystemHandling.shouldAllThrowIOExceptions();
      Path path0 = mockFile0.toPath();
      explodedArchive0.forEach(consumer0);
      URL uRL0 = explodedArchive0.getUrl();
      URL uRL1 = explodedArchive0.getUrl();
      boolean boolean4 = false;
      boolean boolean5 = true;
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean4, boolean1, boolean2, boolean4, boolean5).when(archive_EntryFilter0).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list0 = explodedArchive0.getNestedArchives(archive_EntryFilter0);
      String string2 = mockFile0.getAbsolutePath();
      boolean boolean6 = false;
      boolean boolean7 = true;
      Archive.EntryFilter archive_EntryFilter1 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      Archive.EntryFilter archive_EntryFilter2 = null;
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchives(archive_EntryFilter2);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }
}
