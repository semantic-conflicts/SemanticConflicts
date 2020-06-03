/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri May 01 14:53:31 GMT 2020
 */

package org.atmosphere.cpr;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AtmosphereConfig_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.atmosphere.cpr.AtmosphereConfig"; 
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
    java.lang.System.setProperty("user.dir", "/server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/atmosphere/ffc0c6e274094c6423e29d1c45bab1593b8fac7d/evosuite_16"); 
    java.lang.System.setProperty("user.home", "/server"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "author-name"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AtmosphereConfig_ESTest_scaffolding.class.getClassLoader() ,
      "org.atmosphere.cpr.ClusterBroadcastFilter",
      "org.atmosphere.cpr.Deliver",
      "org.atmosphere.cpr.AtmosphereResourceEventListenerAdapter$OnHeartbeat",
      "org.atmosphere.lifecycle.BroadcasterLifecyclePolicyHandler",
      "org.atmosphere.cpr.DefaultAnnotationProcessor$2",
      "org.atmosphere.websocket.WebSocket",
      "org.atmosphere.interceptor.HeartbeatInterceptor",
      "org.atmosphere.cpr.DefaultAnnotationProcessor$1",
      "org.atmosphere.cpr.AtmosphereRequest$LazyComputation",
      "org.atmosphere.cpr.AtmosphereConfig",
      "org.atmosphere.cpr.HeartbeatAtmosphereResourceEvent",
      "org.atmosphere.interceptor.BroadcastOnPostAtmosphereInterceptor",
      "org.atmosphere.client.TrackMessageSizeInterceptor$Interceptor",
      "org.atmosphere.cpr.BroadcasterListener",
      "org.atmosphere.websocket.WebSocketHandshakeFilter",
      "org.atmosphere.handler.AbstractReflectorAtmosphereHandler$Default",
      "org.atmosphere.cpr.AtmosphereResourceEvent",
      "org.atmosphere.cpr.AtmosphereConfig$StartupHook",
      "org.atmosphere.util.ServletContextFactory",
      "org.atmosphere.util.IOUtils",
      "org.atmosphere.cpr.Broadcaster",
      "org.atmosphere.util.ExecutorsFactory",
      "org.atmosphere.interceptor.AndroidAtmosphereInterceptor",
      "org.atmosphere.config.service.AtmosphereService",
      "org.atmosphere.cpr.AtmosphereRequest$IS",
      "org.atmosphere.cache.DefaultBroadcasterCache",
      "org.atmosphere.config.service.WebSocketProcessorService",
      "org.atmosphere.container.version.JSR356WebSocket",
      "org.atmosphere.websocket.WebSocketProcessor$WebSocketHandlerProxy",
      "org.atmosphere.cpr.DefaultAtmosphereResourceFactory",
      "org.atmosphere.cpr.AsyncSupportListenerAdapter",
      "org.atmosphere.websocket.protocol.StreamingHttpProtocol",
      "org.atmosphere.cpr.AtmosphereResourceSessionFactory",
      "org.atmosphere.cpr.BroadcasterFuture",
      "org.atmosphere.container.Tomcat7Servlet30SupportWithWebSocket",
      "org.atmosphere.interceptor.AtmosphereResourceStateRecovery",
      "org.atmosphere.cpr.AtmosphereResourceHeartbeatEventListener",
      "org.atmosphere.inject.Injectable",
      "org.atmosphere.cpr.AtmosphereInterceptorWriter",
      "org.atmosphere.config.service.BroadcasterListenerService",
      "org.atmosphere.container.Jetty9AsyncSupportWithWebSocket",
      "org.atmosphere.interceptor.SSEAtmosphereInterceptor",
      "org.atmosphere.cpr.AtmosphereConfig$ShutdownHook",
      "org.atmosphere.cpr.AsyncSupportListener",
      "org.atmosphere.websocket.DefaultWebSocketProcessor$1",
      "org.atmosphere.config.service.WebSocketProtocolService",
      "org.atmosphere.cache.AbstractBroadcasterCache",
      "org.atmosphere.cpr.BroadcasterLifeCyclePolicyListenerAdapter",
      "org.atmosphere.util.ServletProxyFactory",
      "org.atmosphere.cpr.AtmosphereFramework$MetaServiceAction",
      "org.atmosphere.inject.InjectableObjectFactory",
      "org.atmosphere.util.ServletProxyFactory$EchoMethodHandler",
      "org.atmosphere.config.AtmosphereHandlerProperty",
      "org.atmosphere.handler.OnMessage",
      "org.atmosphere.cpr.DefaultAsyncSupportResolver",
      "org.atmosphere.cpr.DefaultBroadcaster$WriteOperation",
      "org.atmosphere.util.annotation.ClassFileBuffer",
      "org.atmosphere.websocket.DefaultWebSocketProcessor$1$1",
      "org.atmosphere.inject.AtmosphereFrameworkInjectable",
      "org.atmosphere.cpr.DefaultAtmosphereResourceSessionFactory$1",
      "org.atmosphere.container.Tomcat7BIOSupportWithWebSocket",
      "org.atmosphere.cpr.AtmosphereResponse$Builder",
      "org.atmosphere.cpr.SessionSupport",
      "org.atmosphere.cpr.AtmosphereFrameworkInitializer",
      "org.atmosphere.container.version.Grizzly2WebSocket",
      "org.atmosphere.cpr.AtmosphereRequest",
      "org.atmosphere.container.TomcatWebSocketUtil",
      "org.atmosphere.util.UUIDProvider",
      "org.atmosphere.websocket.protocol.EchoProtocol",
      "org.atmosphere.interceptor.CorsInterceptor",
      "org.atmosphere.websocket.WebSocketProtocol",
      "org.atmosphere.websocket.WebSocketProtocolStream",
      "org.atmosphere.interceptor.AtmosphereResourceStateRecovery$OnAlwaysSuspend",
      "org.atmosphere.cpr.AtmosphereResourceEventListenerAdapter",
      "org.atmosphere.config.service.AtmosphereResourceFactoryService",
      "org.atmosphere.config.service.BroadcasterFilterService",
      "org.atmosphere.cpr.BroadcasterLifeCyclePolicy",
      "org.atmosphere.cpr.AtmosphereResourceFactory$Async",
      "org.atmosphere.cpr.DefaultBroadcaster$WriteQueue",
      "org.atmosphere.cpr.AtmosphereResourceEventListenerAdapter$OnSuspend",
      "org.atmosphere.cpr.DefaultAnnotationProcessor$BytecodeBasedAnnotationProcessor$1",
      "org.atmosphere.config.service.UUIDProviderService",
      "org.atmosphere.util.annotation.AnnotationDetector$TypeReporter",
      "org.atmosphere.inject.AtmosphereConfigInjectable",
      "org.atmosphere.config.service.MeteorService",
      "org.atmosphere.interceptor.OldBrowserPaddingInterceptor",
      "org.atmosphere.config.service.BroadcasterService",
      "org.atmosphere.cpr.AtmosphereResource$TRANSPORT",
      "org.atmosphere.config.AtmosphereAnnotation",
      "org.atmosphere.config.service.AsyncSupportListenerService",
      "org.atmosphere.util.EndpointMapper",
      "org.atmosphere.cpr.Universe",
      "org.atmosphere.handler.AtmosphereHandlerAdapter",
      "org.atmosphere.util.annotation.ClassFileIterator",
      "org.atmosphere.config.AtmosphereHandlerConfig",
      "org.atmosphere.interceptor.SessionCreationInterceptor",
      "org.atmosphere.cache.UUIDBroadcasterCache",
      "org.atmosphere.cpr.MeteorServlet",
      "org.atmosphere.cpr.AtmosphereResourceEventListener",
      "org.atmosphere.cpr.AtmosphereResourceListener",
      "org.atmosphere.config.service.BroadcasterCacheListenerService",
      "org.atmosphere.config.service.BroadcasterCacheService",
      "org.atmosphere.config.service.DeliverTo",
      "org.atmosphere.cpr.AtmosphereResource",
      "org.atmosphere.cpr.AtmosphereResourceSession",
      "org.atmosphere.cpr.BroadcasterFactory",
      "org.atmosphere.cpr.DefaultAnnotationProcessor$ServletContainerInitializerAnnotationProcessor",
      "org.atmosphere.cpr.BroadcastFilter$BroadcastAction",
      "org.atmosphere.util.IOUtils$1",
      "org.atmosphere.cpr.AtmosphereFramework$2$1",
      "org.atmosphere.cpr.AsyncIOInterceptor",
      "org.atmosphere.util.annotation.AnnotationDetector$MethodReporter",
      "org.atmosphere.cpr.AtmosphereResourceEventListenerAdapter$OnBroadcast",
      "org.atmosphere.cpr.AtmosphereMappingException",
      "org.atmosphere.cpr.BroadcastFilter",
      "org.atmosphere.container.GlassFishv2CometSupport",
      "org.atmosphere.inject.BroadcasterFactoryInjectable",
      "org.atmosphere.container.JSR356AsyncSupport",
      "org.atmosphere.cpr.AnnotationProcessor",
      "org.atmosphere.cpr.AtmosphereFramework$InterceptorComparator",
      "org.atmosphere.container.TomcatWebSocketUtil$Delegate",
      "org.atmosphere.cpr.AtmosphereResourceEventListenerAdapter$OnPreSuspend",
      "org.atmosphere.container.version.JBossWebSocket",
      "org.atmosphere.cpr.AsyncIOWriter",
      "org.atmosphere.cpr.AtmosphereFramework$5",
      "org.atmosphere.interceptor.IdleResourceInterceptor",
      "org.atmosphere.cpr.AtmosphereFramework$4",
      "org.atmosphere.cpr.AtmosphereFramework$3",
      "org.atmosphere.interceptor.JSONPAtmosphereInterceptor",
      "org.atmosphere.cpr.AtmosphereFramework$2",
      "org.atmosphere.cpr.AtmosphereFramework$1",
      "org.atmosphere.cpr.AtmosphereResponse",
      "org.atmosphere.util.ExecutorsFactory$5",
      "org.atmosphere.cpr.AnnotationHandler",
      "org.atmosphere.inject.MetaBroadcasterInjectable",
      "org.atmosphere.util.ExecutorsFactory$4",
      "org.atmosphere.interceptor.AtmosphereResourceLifecycleInterceptor",
      "org.atmosphere.util.ExecutorsFactory$1",
      "org.atmosphere.container.GrizzlyServlet30WebSocketSupport",
      "org.atmosphere.cpr.AsyncIOInterceptorAdapter",
      "org.atmosphere.websocket.WebSocketHandlerAdapter",
      "org.atmosphere.container.GlassFishWebSocketSupport",
      "org.atmosphere.util.annotation.AnnotationDetector$FieldReporter",
      "org.atmosphere.cpr.DefaultBroadcaster",
      "org.atmosphere.websocket.DefaultWebSocketProcessor",
      "org.atmosphere.cpr.MetaBroadcaster$ThirtySecondsCache",
      "org.atmosphere.cpr.DefaultBroadcaster$1",
      "org.atmosphere.cpr.WebSocketProcessorFactory",
      "org.atmosphere.cpr.AtmosphereResourceListenerAdapter",
      "org.atmosphere.cpr.AtmosphereRequest$Body",
      "org.atmosphere.cpr.AtmosphereInterceptorAdapter",
      "org.atmosphere.interceptor.AtmosphereResourceStateRecovery$BroadcasterTracker",
      "org.atmosphere.container.version.WebLogicWebSocket",
      "org.atmosphere.cpr.DefaultAnnotationProcessor",
      "org.atmosphere.interceptor.TrackMessageSizeB64Interceptor$Interceptor",
      "org.atmosphere.util.ServletProxyFactory$MethodHandler",
      "org.atmosphere.cpr.BroadcasterConfig",
      "org.atmosphere.cpr.AsyncIOWriterAdapter",
      "org.atmosphere.cpr.AtmosphereFramework$AtmosphereHandlerWrapper",
      "org.atmosphere.cpr.AtmosphereHandler",
      "org.atmosphere.cpr.Action",
      "org.atmosphere.config.service.AsyncSupportService",
      "org.atmosphere.cpr.AsynchronousProcessor",
      "org.atmosphere.util.VoidExecutorService",
      "org.atmosphere.cpr.KeepOpenStreamAware",
      "org.atmosphere.container.Servlet30CometSupport",
      "org.atmosphere.cpr.BroadcasterLifeCyclePolicy$Builder",
      "org.atmosphere.container.EmbeddedWebSocketHandler$ArrayBaseWebSocket",
      "org.atmosphere.util.FilterConfigImpl",
      "org.atmosphere.cpr.AtmosphereResourceEventListenerAdapter$OnThrowable",
      "org.atmosphere.cpr.BroadcasterCacheListener",
      "org.atmosphere.cpr.DefaultBroadcasterFactory",
      "org.atmosphere.config.service.ManagedService",
      "org.atmosphere.cpr.AtmosphereServlet",
      "org.atmosphere.cpr.AtmosphereServletProcessor",
      "org.atmosphere.websocket.WebSocketProcessor",
      "org.atmosphere.container.GlassFishServlet30WebSocketSupport",
      "org.atmosphere.cpr.AtmosphereFrameworkListenerAdapter",
      "org.atmosphere.container.TomcatCometSupport",
      "org.atmosphere.cpr.DefaultAtmosphereResourceFactory$2",
      "org.atmosphere.cpr.DefaultAtmosphereResourceFactory$3",
      "org.atmosphere.cpr.DefaultAtmosphereResourceFactory$1",
      "org.atmosphere.container.NettyCometSupport",
      "org.atmosphere.cpr.AtmosphereInterceptor",
      "org.atmosphere.cpr.Action$TYPE",
      "org.atmosphere.handler.ReflectorServletProcessor",
      "org.atmosphere.util.AtmosphereFilterChain",
      "org.atmosphere.util.ServletProxyFactory$1",
      "org.atmosphere.util.ServletProxyFactory$2",
      "org.atmosphere.cpr.DefaultAtmosphereResourceSessionFactory",
      "org.atmosphere.cpr.AtmosphereResponse$2",
      "org.atmosphere.cpr.BroadcastFilterLifecycle",
      "org.atmosphere.cpr.AtmosphereResponse$3",
      "org.atmosphere.cpr.AtmosphereResponse$4",
      "org.atmosphere.config.service.BroadcasterFactoryService",
      "org.atmosphere.inject.AtmosphereResourceSessionFactoryInjectable",
      "org.atmosphere.config.service.AtmosphereResourceListenerService",
      "org.atmosphere.interceptor.PaddingAtmosphereInterceptor",
      "org.atmosphere.cpr.Deliver$TYPE",
      "org.atmosphere.cpr.BroadcasterConfig$FilterManipulator",
      "org.atmosphere.interceptor.NginxInterceptor",
      "org.atmosphere.cpr.AtmosphereResponse$1",
      "org.atmosphere.cpr.BroadcasterFactory$BroadcasterCreationException",
      "org.atmosphere.cpr.MetaBroadcaster$NoCache",
      "org.atmosphere.cpr.BroadcasterCache",
      "org.atmosphere.util.ByteArrayAsyncWriter",
      "org.atmosphere.cpr.AtmosphereResourceEventImpl",
      "org.atmosphere.container.version.Jetty9WebSocket",
      "org.atmosphere.config.service.AtmosphereHandlerService",
      "org.atmosphere.container.GlassFishServ30WebSocketSupport",
      "org.atmosphere.util.DefaultUUIDProvider",
      "org.atmosphere.cpr.AtmosphereResourceEventListenerAdapter$OnClose",
      "org.atmosphere.pool.PoolableProvider",
      "org.atmosphere.container.JettyServlet30AsyncSupportWithWebSocket",
      "org.atmosphere.cpr.MetaBroadcaster",
      "org.atmosphere.cpr.PerRequestBroadcastFilter",
      "org.atmosphere.container.GrizzlyCometSupport",
      "org.atmosphere.config.service.AtmosphereFrameworkListenerService",
      "org.atmosphere.handler.AbstractReflectorAtmosphereHandler",
      "org.atmosphere.container.Jetty7CometSupport",
      "org.atmosphere.config.service.BroadcasterCacheInspectorService",
      "org.atmosphere.cpr.FrameworkConfig",
      "org.atmosphere.websocket.WebSocketEventListener$WebSocketEvent",
      "org.atmosphere.interceptor.TrackMessageSizeB64Interceptor",
      "org.atmosphere.client.TrackMessageSizeFilter",
      "org.atmosphere.cache.BroadcastMessage",
      "org.atmosphere.cpr.AtmosphereRequest$NoOpsRequest",
      "org.atmosphere.annotation.Processor",
      "org.atmosphere.cpr.BroadcasterLifeCyclePolicy$ATMOSPHERE_RESOURCE_POLICY",
      "org.atmosphere.cpr.AtmosphereFrameworkListener",
      "org.atmosphere.websocket.WebSocketStreamingHandlerAdapter",
      "org.atmosphere.cpr.AtmosphereFramework$MetaServiceAction$MetaServiceProcedure",
      "org.atmosphere.interceptor.InvokationOrder",
      "org.atmosphere.cpr.Broadcaster$SCOPE",
      "org.atmosphere.container.WebLogicServlet30WithWebSocket",
      "org.atmosphere.config.service.WebSocketHandlerService",
      "org.atmosphere.util.Version",
      "org.atmosphere.cpr.DefaultAsyncSupportResolver$1",
      "org.atmosphere.cache.BroadcasterCacheInspector",
      "org.atmosphere.cpr.DefaultAsyncSupportResolver$2",
      "org.atmosphere.handler.ReflectorServletProcessor$FilterChainServletWrapper",
      "org.atmosphere.cpr.MetaBroadcaster$MetaBroadcasterCache",
      "org.atmosphere.handler.AnnotatedProxy",
      "org.atmosphere.util.ServletProxyFactory$UTF8Handler",
      "org.atmosphere.cpr.Broadcaster$POLICY",
      "org.atmosphere.util.QueryStringDecoder",
      "org.atmosphere.cpr.AtmosphereFilter",
      "org.atmosphere.inject.AtmosphereConfigAware",
      "org.atmosphere.interceptor.InvokationOrder$PRIORITY",
      "org.atmosphere.cpr.DefaultBroadcaster$AsyncWriteToken",
      "org.atmosphere.cpr.AtmosphereRequest$Builder",
      "org.atmosphere.cpr.AtmosphereObjectFactory",
      "org.atmosphere.container.version.GrizzlyWebSocket",
      "org.atmosphere.cpr.AtmosphereResourceEventListenerAdapter$OnResume",
      "org.atmosphere.interceptor.OnDisconnectInterceptor",
      "org.atmosphere.container.JBossAsyncSupportWithWebSocket",
      "org.atmosphere.cpr.AtmosphereFramework$MetaServiceAction$ExcludeMetaServiceProcedure",
      "org.atmosphere.config.service.EndpointMapperService",
      "org.atmosphere.interceptor.JavaScriptProtocol",
      "org.atmosphere.container.Grizzly2WebSocketSupport",
      "org.atmosphere.util.FakeHttpSession",
      "org.atmosphere.cpr.AsyncSupport",
      "org.atmosphere.cpr.DefaultAnnotationProcessor$BytecodeBasedAnnotationProcessor",
      "org.atmosphere.util.annotation.AnnotationDetector",
      "org.atmosphere.cache.UUIDBroadcasterCache$ClientQueue",
      "org.atmosphere.websocket.protocol.SimpleHttpProtocol",
      "org.atmosphere.cache.SessionBroadcasterCache",
      "org.atmosphere.cpr.AtmosphereFramework$MetaServiceAction$InstallMetaServiceProcedure",
      "org.atmosphere.cpr.AtmosphereResourceImpl",
      "org.atmosphere.container.version.Jetty8WebSocket",
      "org.atmosphere.util.DefaultEndpointMapper",
      "org.atmosphere.config.FrameworkConfiguration",
      "org.atmosphere.cpr.AtmosphereResourceFactory",
      "org.atmosphere.cpr.DefaultMetaBroadcaster",
      "org.atmosphere.cpr.AtmosphereFramework$DefaultAtmosphereObjectFactory",
      "org.atmosphere.cpr.BroadcasterLifeCyclePolicyListener",
      "org.atmosphere.cpr.Serializer",
      "org.atmosphere.cpr.DefaultMetaBroadcaster$MetaBroadcasterFuture",
      "org.atmosphere.container.BlockingIOCometSupport",
      "org.atmosphere.pool.PoolableBroadcasterFactory",
      "org.atmosphere.util.ReaderInputStream",
      "org.atmosphere.interceptor.SuspendTrackerInterceptor",
      "org.atmosphere.lifecycle.LifecycleHandler",
      "org.atmosphere.interceptor.CacheHeadersInterceptor",
      "org.atmosphere.cpr.Meteor",
      "org.atmosphere.websocket.WebSocketProcessor$WebSocketException",
      "org.atmosphere.cpr.BroadcasterListenerAdapter",
      "org.atmosphere.client.TrackMessageSizeInterceptor",
      "org.atmosphere.cpr.AsyncSupportResolver",
      "org.atmosphere.container.JettyCometSupport",
      "org.atmosphere.container.version.TomcatWebSocket",
      "org.atmosphere.cpr.AtmosphereRequest$ByteInputStream",
      "org.atmosphere.cpr.BroadcasterLifeCyclePolicy$1",
      "org.atmosphere.cpr.AtmosphereFramework",
      "org.atmosphere.websocket.WebSocketStreamingHandler",
      "org.atmosphere.cpr.BroadcastFilterAdapter",
      "org.atmosphere.interceptor.WebSocketMessageSuspendInterceptor",
      "org.atmosphere.util.annotation.AnnotationDetector$Reporter",
      "org.atmosphere.interceptor.AllowInterceptor",
      "org.atmosphere.cpr.BroadcastFilter$BroadcastAction$ACTION",
      "org.atmosphere.cpr.DefaultMetaBroadcaster$CompleteListener",
      "org.atmosphere.container.Grizzly2CometSupport",
      "org.atmosphere.cpr.AtmosphereResourceEventListenerAdapter$OnDisconnect",
      "org.atmosphere.config.service.DeliverTo$DELIVER_TO",
      "org.atmosphere.util.annotation.FileIterator",
      "org.atmosphere.container.JBossWebCometSupport",
      "org.atmosphere.inject.AtmosphereResourceFactoryInjectable",
      "org.atmosphere.cpr.AtmosphereRequest$1",
      "org.atmosphere.cache.CacheMessage",
      "org.atmosphere.websocket.WebSocketEventListener$WebSocketEvent$TYPE",
      "org.atmosphere.config.ApplicationConfiguration",
      "org.atmosphere.container.JettyAsyncSupportWithWebSocket",
      "org.atmosphere.config.service.AtmosphereInterceptorService",
      "org.atmosphere.websocket.WebSocketHandler"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AtmosphereConfig_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.atmosphere.cpr.AtmosphereConfig",
      "org.atmosphere.handler.AbstractReflectorAtmosphereHandler",
      "org.atmosphere.cpr.AtmosphereFramework$1",
      "org.atmosphere.cpr.AtmosphereFramework",
      "org.atmosphere.util.DefaultEndpointMapper",
      "org.atmosphere.cpr.AtmosphereFramework$DefaultAtmosphereObjectFactory",
      "org.atmosphere.util.DefaultUUIDProvider",
      "org.atmosphere.cpr.AtmosphereResourceListenerAdapter",
      "org.atmosphere.cpr.AtmosphereFilter",
      "org.atmosphere.cpr.AtmosphereServlet",
      "org.atmosphere.cpr.AtmosphereFrameworkInitializer",
      "org.atmosphere.websocket.WebSocketHandshakeFilter",
      "org.atmosphere.util.FilterConfigImpl",
      "org.atmosphere.cpr.MeteorServlet",
      "org.atmosphere.cpr.AtmosphereResourceImpl",
      "org.atmosphere.cpr.Action$TYPE",
      "org.atmosphere.cpr.Action",
      "org.atmosphere.cpr.DefaultBroadcasterFactory",
      "org.atmosphere.cpr.BroadcasterLifeCyclePolicy$Builder",
      "org.atmosphere.cpr.BroadcasterLifeCyclePolicy$ATMOSPHERE_RESOURCE_POLICY",
      "org.atmosphere.cpr.BroadcasterLifeCyclePolicy",
      "org.atmosphere.cpr.Broadcaster$POLICY",
      "org.atmosphere.cpr.BroadcasterListenerAdapter",
      "org.atmosphere.lifecycle.BroadcasterLifecyclePolicyHandler",
      "org.atmosphere.lifecycle.LifecycleHandler",
      "org.atmosphere.util.IOUtils$1",
      "org.atmosphere.util.IOUtils",
      "org.atmosphere.cpr.AtmosphereFramework$InterceptorComparator",
      "org.atmosphere.cpr.AtmosphereFramework$AtmosphereHandlerWrapper",
      "org.atmosphere.cpr.DefaultBroadcaster",
      "org.atmosphere.cpr.DefaultBroadcaster$WriteQueue",
      "org.atmosphere.util.AtmosphereFilterChain",
      "org.atmosphere.cpr.AtmosphereFramework$4",
      "org.atmosphere.util.ServletContextFactory",
      "org.atmosphere.cpr.AtmosphereRequest",
      "org.atmosphere.cpr.AtmosphereRequest$Body",
      "org.atmosphere.cpr.AtmosphereRequest$Builder",
      "org.atmosphere.cpr.AtmosphereRequest$NoOpsRequest",
      "org.atmosphere.cpr.AtmosphereRequest$IS",
      "org.atmosphere.cpr.AtmosphereResponse$1",
      "org.atmosphere.cpr.AtmosphereResponse",
      "org.atmosphere.cpr.AtmosphereResponse$Builder",
      "org.atmosphere.cpr.FrameworkConfig",
      "org.atmosphere.cpr.AsyncIOWriterAdapter",
      "org.atmosphere.cpr.AtmosphereInterceptorWriter",
      "org.atmosphere.websocket.WebSocket",
      "org.atmosphere.util.ServletProxyFactory$EchoMethodHandler",
      "org.atmosphere.util.ServletProxyFactory",
      "org.atmosphere.util.ServletProxyFactory$UTF8Handler",
      "org.atmosphere.util.ServletProxyFactory$2",
      "org.atmosphere.util.ServletProxyFactory$1",
      "org.atmosphere.cpr.AtmosphereResourceEventImpl",
      "org.atmosphere.cpr.HeartbeatAtmosphereResourceEvent",
      "org.atmosphere.cpr.BroadcasterFactory$BroadcasterCreationException",
      "org.atmosphere.cpr.BroadcastFilterAdapter",
      "org.atmosphere.cpr.DefaultAtmosphereResourceSessionFactory",
      "org.atmosphere.cpr.AtmosphereResourceEventListenerAdapter",
      "org.atmosphere.cpr.DefaultAtmosphereResourceSessionFactory$1",
      "org.atmosphere.util.QueryStringDecoder",
      "org.atmosphere.cpr.AtmosphereResponse$3",
      "org.atmosphere.cpr.AtmosphereFramework$2",
      "org.atmosphere.cpr.AtmosphereFramework$2$1",
      "org.atmosphere.cpr.AtmosphereFramework$MetaServiceAction$InstallMetaServiceProcedure",
      "org.atmosphere.cpr.AtmosphereFramework$MetaServiceAction$ExcludeMetaServiceProcedure",
      "org.atmosphere.cpr.AtmosphereFramework$MetaServiceAction",
      "org.atmosphere.cpr.SessionSupport",
      "org.atmosphere.inject.InjectableObjectFactory",
      "org.atmosphere.inject.AtmosphereConfigInjectable",
      "org.atmosphere.inject.AtmosphereFrameworkInjectable",
      "org.atmosphere.inject.AtmosphereResourceFactoryInjectable",
      "org.atmosphere.inject.AtmosphereResourceSessionFactoryInjectable",
      "org.atmosphere.inject.BroadcasterFactoryInjectable",
      "org.atmosphere.inject.MetaBroadcasterInjectable",
      "org.atmosphere.cpr.DefaultMetaBroadcaster$MetaBroadcasterFuture",
      "org.atmosphere.cpr.DefaultMetaBroadcaster",
      "org.atmosphere.cpr.MetaBroadcaster$NoCache",
      "org.atmosphere.cpr.DefaultAtmosphereResourceFactory$1",
      "org.atmosphere.cpr.BroadcasterConfig",
      "org.atmosphere.cpr.DefaultAtmosphereResourceFactory$2",
      "org.atmosphere.cpr.DefaultAtmosphereResourceFactory$3",
      "org.atmosphere.cpr.DefaultAtmosphereResourceFactory",
      "org.atmosphere.cpr.DefaultAnnotationProcessor",
      "org.atmosphere.cpr.DefaultAnnotationProcessor$1",
      "org.atmosphere.cpr.AnnotationHandler",
      "org.atmosphere.cpr.DefaultAnnotationProcessor$BytecodeBasedAnnotationProcessor",
      "org.atmosphere.util.annotation.AnnotationDetector",
      "org.atmosphere.util.annotation.ClassFileBuffer",
      "org.atmosphere.util.annotation.ClassFileIterator",
      "org.atmosphere.util.annotation.FileIterator",
      "org.atmosphere.cpr.DefaultAnnotationProcessor$2",
      "org.atmosphere.cpr.DefaultAnnotationProcessor$BytecodeBasedAnnotationProcessor$1",
      "org.atmosphere.websocket.protocol.SimpleHttpProtocol",
      "org.atmosphere.cpr.DefaultAsyncSupportResolver",
      "org.atmosphere.cpr.DefaultAsyncSupportResolver$2",
      "org.atmosphere.cpr.DefaultAsyncSupportResolver$1",
      "org.atmosphere.cpr.AsynchronousProcessor",
      "org.atmosphere.container.Servlet30CometSupport",
      "org.atmosphere.cpr.AtmosphereInterceptorAdapter",
      "org.atmosphere.interceptor.CorsInterceptor",
      "org.atmosphere.interceptor.CacheHeadersInterceptor",
      "org.atmosphere.interceptor.PaddingAtmosphereInterceptor",
      "org.atmosphere.interceptor.AndroidAtmosphereInterceptor",
      "org.atmosphere.interceptor.HeartbeatInterceptor",
      "org.atmosphere.interceptor.SSEAtmosphereInterceptor",
      "org.atmosphere.interceptor.JSONPAtmosphereInterceptor",
      "org.atmosphere.interceptor.JavaScriptProtocol",
      "org.atmosphere.client.TrackMessageSizeFilter",
      "org.atmosphere.interceptor.WebSocketMessageSuspendInterceptor",
      "org.atmosphere.interceptor.OnDisconnectInterceptor",
      "org.atmosphere.interceptor.IdleResourceInterceptor",
      "org.atmosphere.util.ExecutorsFactory",
      "org.atmosphere.util.ExecutorsFactory$5",
      "org.atmosphere.cpr.AtmosphereFramework$5",
      "org.atmosphere.cpr.AtmosphereFramework$3",
      "org.atmosphere.cache.DefaultBroadcasterCache",
      "org.atmosphere.cpr.BroadcasterCache",
      "org.atmosphere.util.ExecutorsFactory$1",
      "org.atmosphere.util.ExecutorsFactory$4",
      "org.atmosphere.cpr.DefaultBroadcaster$1",
      "org.atmosphere.cpr.WebSocketProcessorFactory",
      "org.atmosphere.websocket.DefaultWebSocketProcessor",
      "org.atmosphere.util.VoidExecutorService",
      "org.atmosphere.websocket.DefaultWebSocketProcessor$1",
      "org.atmosphere.util.Version",
      "org.atmosphere.cpr.Universe"
    );
  }
}
