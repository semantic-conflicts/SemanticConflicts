/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri May 01 17:07:45 GMT 2020
 */

package org.springframework.boot.loader.archive;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ExplodedArchive_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.springframework.boot.loader.archive.ExplodedArchive"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/evosuite_21"); 
    java.lang.System.setProperty("user.home", "/server"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "author-name"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ExplodedArchive_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator$EntryComparator",
      "org.springframework.boot.loader.archive.JarFileArchive",
      "org.springframework.boot.loader.jar.Handler",
      "org.springframework.boot.loader.archive.JarFileArchive$JarFileEntry",
      "org.springframework.boot.loader.jar.JarFile$JarFileType",
      "org.springframework.boot.loader.jar.FileHeader",
      "org.springframework.boot.loader.data.RandomAccessData$ResourceAccess",
      "org.springframework.boot.loader.jar.CentralDirectoryVisitor",
      "org.springframework.boot.loader.jar.JarURLConnection",
      "org.springframework.boot.loader.data.RandomAccessData",
      "org.springframework.boot.loader.archive.Archive$EntryFilter",
      "org.springframework.boot.loader.jar.AsciiBytes",
      "org.springframework.boot.loader.archive.ExplodedArchive$1",
      "org.springframework.boot.loader.archive.ExplodedArchive",
      "org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator",
      "org.springframework.boot.loader.jar.JarEntryFilter",
      "org.springframework.boot.loader.data.RandomAccessDataFile",
      "org.springframework.boot.loader.data.RandomAccessDataFile$FilePool",
      "org.springframework.boot.loader.PropertiesLauncher$PrefixMatchingArchiveFilter",
      "org.springframework.boot.loader.archive.Archive",
      "org.springframework.boot.loader.PropertiesLauncher$ArchiveEntryFilter",
      "org.springframework.boot.loader.data.RandomAccessDataFile$DataInputStream",
      "org.springframework.boot.loader.jar.JarFile",
      "org.springframework.boot.loader.archive.ExplodedArchive$FileEntry",
      "org.springframework.boot.loader.jar.JarEntry",
      "org.springframework.boot.loader.archive.Archive$Entry",
      "org.springframework.boot.loader.jar.JarFileEntries"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.function.Consumer", false, ExplodedArchive_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.springframework.boot.loader.archive.Archive$Entry", false, ExplodedArchive_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.springframework.boot.loader.archive.Archive$EntryFilter", false, ExplodedArchive_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ExplodedArchive_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.springframework.boot.loader.archive.ExplodedArchive",
      "org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator",
      "org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator$EntryComparator",
      "org.springframework.boot.loader.archive.ExplodedArchive$FileEntry",
      "org.springframework.boot.loader.archive.JarFileArchive",
      "org.springframework.boot.loader.jar.AsciiBytes",
      "org.springframework.boot.loader.jar.JarFile",
      "org.springframework.boot.loader.data.RandomAccessDataFile",
      "org.springframework.boot.loader.data.RandomAccessDataFile$FilePool",
      "org.springframework.boot.loader.jar.JarFile$JarFileType",
      "org.springframework.boot.loader.jar.Handler"
    );
  }
}
