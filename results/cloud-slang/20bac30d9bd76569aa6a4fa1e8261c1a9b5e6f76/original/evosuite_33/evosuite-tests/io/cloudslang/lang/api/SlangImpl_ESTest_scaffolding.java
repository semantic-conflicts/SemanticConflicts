/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun May 03 06:36:38 GMT 2020
 */

package io.cloudslang.lang.api;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class SlangImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "io.cloudslang.lang.api.SlangImpl"; 
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
    java.lang.System.setProperty("user.dir", "/server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/cloud-slang/20bac30d9bd76569aa6a4fa1e8261c1a9b5e6f76/evosuite_33"); 
    java.lang.System.setProperty("user.home", "/server"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "author-name"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SlangImpl_ESTest_scaffolding.class.getClassLoader() ,
      "net.sf.cglib.core.Transformer",
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "ch.lambdaj.proxy.ProxyIterator",
      "org.springframework.beans.factory.annotation.Autowired",
      "ch.lambdaj.function.argument.ArgumentsFactory$1",
      "org.apache.commons.lang3.tuple.Pair",
      "org.apache.commons.lang3.builder.IDKey",
      "org.apache.commons.io.filefilter.EmptyFileFilter",
      "org.apache.log4j.Level",
      "ch.lambdaj.proxy.InvocationInterceptor",
      "org.apache.commons.lang3.builder.HashCodeBuilder",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "net.sf.cglib.core.KeyFactory$Generator",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "ch.lambdaj.function.argument.InvocationSequence",
      "net.sf.cglib.proxy.CallbackFilter",
      "io.cloudslang.score.api.TriggeringProperties",
      "org.apache.commons.io.output.ByteArrayOutputStream",
      "net.sf.cglib.asm.FieldWriter",
      "net.sf.cglib.core.CodeEmitter$State",
      "org.apache.commons.io.filefilter.DirectoryFileFilter",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "io.cloudslang.lang.systemtests.StepData",
      "net.sf.cglib.core.LocalVariablesSorter$State",
      "net.sf.cglib.core.Constants",
      "io.cloudslang.lang.compiler.SlangSource",
      "org.apache.commons.lang.Validate",
      "net.sf.cglib.core.AbstractClassGenerator",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "org.hamcrest.core.IsNot",
      "net.sf.cglib.proxy.Enhancer$1",
      "ch.lambdaj.function.argument.ProxyArgument",
      "org.apache.log4j.Hierarchy",
      "io.cloudslang.lang.runtime.events.LanguageEventData",
      "net.sf.cglib.proxy.MethodInterceptorGenerator",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "com.google.common.io.PatternFilenameFilter",
      "io.cloudslang.lang.compiler.modeller.model.Executable",
      "net.sf.cglib.asm.MethodWriter",
      "net.sf.cglib.core.ClassGenerator",
      "net.sf.cglib.proxy.DispatcherGenerator",
      "net.sf.cglib.proxy.InvocationHandlerGenerator",
      "org.apache.commons.lang3.builder.EqualsBuilder",
      "net.sf.cglib.core.ReflectUtils$4",
      "org.apache.commons.io.Charsets",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "net.sf.cglib.proxy.CallbackGenerator",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "net.sf.cglib.proxy.MethodInterceptorGenerator$1",
      "net.sf.cglib.core.ReflectUtils$1",
      "net.sf.cglib.core.ReflectUtils$2",
      "net.sf.cglib.core.ReflectUtils$3",
      "net.sf.cglib.core.ReflectUtils",
      "org.apache.commons.io.FileUtils",
      "org.apache.commons.lang3.Validate",
      "org.apache.commons.lang.builder.EqualsBuilder",
      "org.hamcrest.Matcher",
      "org.apache.commons.io.filefilter.WildcardFilter",
      "org.apache.commons.io.output.NullOutputStream",
      "net.sf.cglib.core.AbstractClassGenerator$1",
      "org.apache.commons.lang3.exception.CloneFailedException",
      "net.sf.cglib.core.ObjectSwitchCallback",
      "net.sf.cglib.core.LocalVariablesSorter",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.commons.io.filefilter.IOFileFilter",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "ch.lambdaj.function.aggregate.PairAggregator",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "org.python.core.packagecache.PathPackageManager$PackageExistsFileFilter",
      "org.apache.log4j.or.ObjectRenderer",
      "net.sf.cglib.core.DebuggingClassWriter$1",
      "net.sf.cglib.proxy.Dispatcher",
      "ch.lambdaj.function.argument.ArgumentsFactory",
      "ch.lambdaj.function.aggregate.Chooser",
      "org.apache.log4j.Category",
      "net.sf.cglib.proxy.Callback",
      "io.cloudslang.score.events.ScoreEventListener",
      "io.cloudslang.score.events.ScoreEvent",
      "net.sf.cglib.proxy.MethodInterceptor",
      "net.sf.cglib.proxy.LazyLoaderGenerator",
      "io.cloudslang.lang.systemtests.BranchAggregatorListener",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "ch.lambdaj.function.convert.Converter",
      "net.sf.cglib.core.KeyFactory$2",
      "net.sf.cglib.core.KeyFactory$1",
      "org.apache.commons.io.filefilter.HiddenFileFilter",
      "net.sf.cglib.core.ClassInfo",
      "net.sf.cglib.proxy.NoOpGenerator",
      "org.apache.commons.io.FileExistsException",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.commons.io.filefilter.FalseFileFilter",
      "org.apache.log4j.spi.Configurator",
      "net.sf.cglib.core.ClassEmitter$3",
      "org.hamcrest.SelfDescribing",
      "net.sf.cglib.core.EmitUtils$9",
      "net.sf.cglib.core.ClassEmitter$1",
      "net.sf.cglib.core.EmitUtils$8",
      "net.sf.cglib.core.EmitUtils$7",
      "ch.lambdaj.function.aggregate.Max",
      "net.sf.cglib.core.CodeEmitter",
      "net.sf.cglib.proxy.Enhancer$EnhancerKey",
      "net.sf.cglib.core.Predicate",
      "org.apache.commons.lang3.ObjectUtils$Null",
      "net.sf.cglib.core.ClassEmitter",
      "ch.lambdaj.function.aggregate.Concat",
      "org.apache.commons.lang3.ArrayUtils",
      "net.sf.cglib.core.ClassNameReader",
      "net.sf.cglib.core.ProcessSwitchCallback",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "net.sf.cglib.core.ClassNameReader$1",
      "io.cloudslang.lang.systemtests.JoinAggregatorListener",
      "net.sf.cglib.core.Local",
      "net.sf.cglib.asm.Edge",
      "io.cloudslang.lang.runtime.env.ContextStack",
      "io.cloudslang.lang.runtime.env.ParentFlowStack",
      "org.apache.log4j.spi.AppenderAttachable",
      "net.sf.cglib.asm.ClassWriter",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "org.apache.log4j.Priority",
      "ch.lambdaj.proxy.UnproxableClassException",
      "net.sf.cglib.core.AbstractClassGenerator$Source",
      "org.apache.log4j.LogManager",
      "net.sf.cglib.asm.AnnotationVisitor",
      "org.apache.commons.io.filefilter.CanWriteFileFilter",
      "io.cloudslang.lang.runtime.env.RunEnvironment",
      "net.sf.cglib.asm.FieldVisitor",
      "net.sf.cglib.asm.MethodVisitor",
      "io.cloudslang.lang.compiler.SlangCompiler",
      "net.sf.cglib.asm.ClassVisitor",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.or.RendererMap",
      "org.apache.commons.io.filefilter.NotFileFilter",
      "org.apache.commons.io.filefilter.ConditionalFileFilter",
      "net.sf.cglib.proxy.InvocationHandler",
      "net.sf.cglib.core.Customizer",
      "org.apache.commons.io.IOUtils",
      "org.apache.log4j.CategoryKey",
      "io.cloudslang.score.api.ExecutionPlan",
      "net.sf.cglib.proxy.CallbackInfo",
      "ch.lambdaj.util.NotUniqueItemException",
      "ch.lambdaj.function.argument.ArgumentConversionException",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "net.sf.cglib.proxy.LazyLoader",
      "ch.lambdaj.group.GroupCondition",
      "io.cloudslang.score.events.EventBus",
      "net.sf.cglib.core.KeyFactory",
      "io.cloudslang.lang.entities.CompilationArtifact",
      "net.sf.cglib.core.GeneratorStrategy",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "net.sf.cglib.proxy.FixedValue",
      "org.hamcrest.BaseMatcher",
      "net.sf.cglib.proxy.NoOp$1",
      "org.apache.commons.io.output.StringBuilderWriter",
      "net.sf.cglib.core.EmitUtils",
      "net.sf.cglib.core.CollectionUtils",
      "net.sf.cglib.core.TypeUtils",
      "ch.lambdaj.Lambda",
      "org.apache.log4j.spi.RootLogger",
      "io.cloudslang.score.api.Score",
      "io.cloudslang.lang.systemtests.RunDataAggregatorListener",
      "net.sf.cglib.asm.Type",
      "net.sf.cglib.core.MethodInfo",
      "org.apache.log4j.spi.RendererSupport",
      "io.cloudslang.lang.entities.bindings.InOutParam",
      "net.sf.cglib.asm.Opcodes",
      "org.apache.commons.io.filefilter.WildcardFileFilter",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "io.cloudslang.lang.runtime.events.LanguageEventData$StepType",
      "io.cloudslang.score.api.ControlActionMetadata",
      "org.hamcrest.core.IsNull",
      "ch.lambdaj.function.aggregate.Aggregator",
      "net.sf.cglib.proxy.FixedValueGenerator",
      "org.apache.log4j.Logger",
      "net.sf.cglib.core.EmitUtils$ParameterTyper",
      "net.sf.cglib.proxy.CallbackGenerator$Context",
      "net.sf.cglib.core.Signature",
      "ch.lambdaj.function.aggregate.Sum",
      "net.sf.cglib.asm.ByteVector",
      "org.apache.log4j.helpers.LogLog",
      "net.sf.cglib.proxy.ProxyRefDispatcher",
      "io.cloudslang.lang.api.SlangImpl",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.commons.io.filefilter.FileFileFilter",
      "io.cloudslang.lang.entities.bindings.Input",
      "ch.lambdaj.function.aggregate.Min",
      "net.sf.cglib.asm.Frame",
      "net.sf.cglib.core.NamingPolicy",
      "io.cloudslang.lang.runtime.env.ExecutionPath",
      "net.sf.cglib.asm.Item",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.commons.io.filefilter.CanReadFileFilter",
      "net.sf.cglib.asm.Attribute",
      "net.sf.cglib.asm.ClassAdapter",
      "org.apache.commons.io.IOCase",
      "net.sf.cglib.asm.MethodAdapter",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "ch.lambdaj.proxy.ProxyUtil",
      "org.apache.log4j.PropertyConfigurator",
      "io.cloudslang.score.api.ExecutionStep",
      "org.apache.commons.io.filefilter.SizeFileFilter",
      "io.cloudslang.lang.systemtests.AbstractAggregatorListener",
      "org.apache.log4j.Appender",
      "org.apache.commons.lang3.ObjectUtils",
      "net.sf.cglib.core.CodeGenerationException",
      "net.sf.cglib.proxy.Enhancer",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "org.apache.log4j.spi.HierarchyEventListener",
      "net.sf.cglib.core.ProcessArrayCallback",
      "org.hamcrest.Matchers",
      "org.apache.commons.lang3.tuple.ImmutablePair",
      "org.apache.commons.io.filefilter.PrefixFileFilter",
      "net.sf.cglib.asm.Label",
      "net.sf.cglib.asm.ClassReader",
      "net.sf.cglib.proxy.NoOp",
      "io.cloudslang.lang.api.Slang",
      "ch.lambdaj.function.aggregate.InitializedPairAggregator",
      "org.apache.commons.lang3.builder.Builder",
      "org.apache.log4j.spi.LoggerRepository"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("io.cloudslang.lang.compiler.SlangCompiler", false, SlangImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("io.cloudslang.lang.entities.CompilationArtifact", false, SlangImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("io.cloudslang.score.api.Score", false, SlangImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("io.cloudslang.score.events.EventBus", false, SlangImpl_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SlangImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "io.cloudslang.lang.api.SlangImpl",
      "io.cloudslang.score.api.ExecutionPlan",
      "io.cloudslang.lang.entities.CompilationArtifact",
      "org.apache.commons.lang.Validate",
      "io.cloudslang.lang.runtime.env.RunEnvironment",
      "io.cloudslang.lang.runtime.env.ContextStack",
      "io.cloudslang.lang.runtime.env.ParentFlowStack",
      "io.cloudslang.lang.runtime.env.ExecutionPath",
      "io.cloudslang.score.api.TriggeringProperties",
      "io.cloudslang.lang.systemtests.AbstractAggregatorListener",
      "io.cloudslang.lang.systemtests.BranchAggregatorListener",
      "io.cloudslang.score.events.ScoreEvent",
      "io.cloudslang.lang.systemtests.JoinAggregatorListener",
      "io.cloudslang.lang.systemtests.RunDataAggregatorListener",
      "io.cloudslang.lang.compiler.SlangSource",
      "org.apache.commons.lang3.Validate",
      "org.hamcrest.Matchers",
      "org.hamcrest.BaseMatcher",
      "org.hamcrest.core.IsNull",
      "org.hamcrest.core.IsNot",
      "ch.lambdaj.function.aggregate.PairAggregator",
      "ch.lambdaj.function.aggregate.InitializedPairAggregator",
      "ch.lambdaj.function.aggregate.Sum",
      "ch.lambdaj.function.aggregate.Chooser",
      "ch.lambdaj.function.aggregate.Min",
      "ch.lambdaj.function.aggregate.Max",
      "ch.lambdaj.function.aggregate.Concat",
      "ch.lambdaj.Lambda",
      "org.apache.commons.io.FileUtils",
      "org.apache.commons.io.output.StringBuilderWriter",
      "org.apache.commons.io.IOUtils",
      "ch.lambdaj.function.argument.ArgumentsFactory$1",
      "ch.lambdaj.function.argument.ArgumentsFactory",
      "ch.lambdaj.function.argument.InvocationSequence",
      "ch.lambdaj.proxy.InvocationInterceptor",
      "ch.lambdaj.function.argument.ProxyArgument",
      "ch.lambdaj.proxy.ProxyUtil",
      "net.sf.cglib.core.AbstractClassGenerator",
      "net.sf.cglib.proxy.Enhancer$1",
      "net.sf.cglib.core.AbstractClassGenerator$Source",
      "net.sf.cglib.core.CollectionUtils",
      "net.sf.cglib.core.TypeUtils",
      "net.sf.cglib.core.Signature",
      "net.sf.cglib.asm.Type",
      "net.sf.cglib.core.KeyFactory$1",
      "net.sf.cglib.core.KeyFactory$2",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.KeyFactory$Generator",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "net.sf.cglib.asm.ClassWriter",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.asm.ByteVector",
      "net.sf.cglib.asm.Item",
      "net.sf.cglib.asm.ClassAdapter",
      "net.sf.cglib.core.ClassEmitter",
      "net.sf.cglib.core.ReflectUtils$1",
      "net.sf.cglib.core.ReflectUtils$2",
      "net.sf.cglib.core.ReflectUtils",
      "net.sf.cglib.core.AbstractClassGenerator$1",
      "net.sf.cglib.core.ClassInfo",
      "net.sf.cglib.core.ClassEmitter$1",
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "net.sf.cglib.core.EmitUtils",
      "net.sf.cglib.asm.MethodWriter",
      "net.sf.cglib.asm.Label",
      "net.sf.cglib.core.Constants",
      "net.sf.cglib.asm.MethodAdapter",
      "net.sf.cglib.core.LocalVariablesSorter",
      "net.sf.cglib.core.CodeEmitter",
      "net.sf.cglib.core.LocalVariablesSorter$State",
      "net.sf.cglib.core.MethodInfo",
      "net.sf.cglib.core.CodeEmitter$State",
      "net.sf.cglib.asm.Frame",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "net.sf.cglib.asm.FieldWriter",
      "net.sf.cglib.asm.Edge",
      "net.sf.cglib.core.EmitUtils$7",
      "net.sf.cglib.core.Local",
      "net.sf.cglib.core.EmitUtils$8",
      "net.sf.cglib.core.EmitUtils$9",
      "net.sf.cglib.core.DebuggingClassWriter$1",
      "net.sf.cglib.asm.ClassReader",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "net.sf.cglib.core.ClassNameReader",
      "net.sf.cglib.core.ClassNameReader$1",
      "net.sf.cglib.proxy.Enhancer",
      "net.sf.cglib.proxy.NoOp$1",
      "net.sf.cglib.proxy.NoOp",
      "net.sf.cglib.proxy.NoOpGenerator",
      "net.sf.cglib.proxy.MethodInterceptorGenerator$1",
      "net.sf.cglib.proxy.MethodInterceptorGenerator",
      "net.sf.cglib.proxy.InvocationHandlerGenerator",
      "net.sf.cglib.proxy.LazyLoaderGenerator",
      "net.sf.cglib.proxy.DispatcherGenerator",
      "net.sf.cglib.proxy.FixedValueGenerator",
      "net.sf.cglib.proxy.CallbackInfo",
      "io.cloudslang.score.api.ExecutionStep",
      "org.apache.commons.io.Charsets",
      "org.apache.commons.lang3.builder.HashCodeBuilder",
      "org.apache.commons.lang.builder.EqualsBuilder",
      "org.apache.commons.lang3.builder.EqualsBuilder",
      "org.apache.commons.lang3.builder.IDKey",
      "org.apache.commons.lang3.tuple.Pair",
      "org.apache.commons.lang3.tuple.ImmutablePair",
      "org.apache.commons.lang3.ArrayUtils",
      "io.cloudslang.score.api.ControlActionMetadata",
      "io.cloudslang.lang.entities.bindings.InOutParam",
      "io.cloudslang.lang.entities.bindings.Input",
      "org.apache.commons.lang3.ObjectUtils$Null",
      "org.apache.commons.lang3.ObjectUtils"
    );
  }
}
