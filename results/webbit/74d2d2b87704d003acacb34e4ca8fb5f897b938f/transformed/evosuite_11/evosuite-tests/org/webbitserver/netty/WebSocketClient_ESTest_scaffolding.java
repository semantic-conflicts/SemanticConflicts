/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 30 00:00:16 GMT 2020
 */

package org.webbitserver.netty;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class WebSocketClient_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.webbitserver.netty.WebSocketClient"; 
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
    java.lang.System.setProperty("user.dir", "/server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/webbit/74d2d2b87704d003acacb34e4ca8fb5f897b938f/evosuite_11"); 
    java.lang.System.setProperty("user.home", "/server"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "author-name"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(WebSocketClient_ESTest_scaffolding.class.getClassLoader() ,
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$9",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$8",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$7",
      "org.jboss.netty.channel.local.LocalChannel",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$6",
      "org.jboss.netty.channel.ChildChannelStateEvent",
      "org.jboss.netty.channel.DefaultChildChannelStateEvent",
      "org.webbitserver.wrapper.WebSocketConnectionWrapper",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.handler.codec.http.HttpMethod",
      "org.jboss.netty.channel.socket.nio.NioAcceptedSocketChannel",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$1",
      "org.webbitserver.netty.NettyWebSocketConnection",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.handler.codec.http.DefaultHttpMessage",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$5",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$4",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$3",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$2",
      "org.jboss.netty.channel.ChannelPipeline",
      "org.webbitserver.WebSocket",
      "org.jboss.netty.channel.ChannelFutureListener",
      "org.webbitserver.stub.StubConnection",
      "org.jboss.netty.buffer.DynamicChannelBuffer",
      "org.jboss.netty.channel.socket.oio.OioClientSocketChannel",
      "org.jboss.netty.logging.InternalLoggerFactory$1",
      "org.webbitserver.netty.contrib.EventSourceMessage",
      "org.jboss.netty.channel.ChannelHandlerLifeCycleException",
      "org.jboss.netty.channel.LifeCycleAwareChannelHandler",
      "org.jboss.netty.channel.UpstreamMessageEvent",
      "org.jboss.netty.channel.socket.oio.OioDatagramPipelineSink",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.buffer.ByteBufferBackedChannelBuffer",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "org.webbitserver.WebSocketHandler",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$10",
      "org.jboss.netty.channel.ChannelConfig",
      "org.jboss.netty.channel.socket.nio.NioSocketChannelConfig",
      "org.jboss.netty.buffer.ReadOnlyChannelBuffer",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.handler.codec.http.HttpVersion",
      "org.webbitserver.handler.ReconnectingWebSocketHandler",
      "org.jboss.netty.channel.ChannelEvent",
      "org.jboss.netty.util.DebugUtil",
      "org.jboss.netty.buffer.LittleEndianHeapChannelBuffer",
      "org.jboss.netty.util.internal.StackTraceSimplifier",
      "org.jboss.netty.channel.DownstreamMessageEvent",
      "org.webbitserver.WebSocketConnection",
      "org.jboss.netty.channel.local.LocalServerChannel",
      "org.jboss.netty.channel.SimpleChannelHandler",
      "org.jboss.netty.channel.socket.http.HttpTunnelingClientSocketChannel",
      "org.jboss.netty.channel.socket.ServerSocketChannelFactory",
      "org.jboss.netty.channel.DefaultWriteCompletionEvent",
      "org.webbitserver.WebbitException",
      "org.jboss.netty.handler.ssl.SslHandler$ClosingChannelFutureListener",
      "org.jboss.netty.channel.socket.DatagramChannel",
      "org.jboss.netty.channel.ServerChannel",
      "org.jboss.netty.channel.ChannelUpstreamHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap$HashEntry",
      "org.jboss.netty.channel.ChannelHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap",
      "org.jboss.netty.channel.socket.DatagramChannelFactory",
      "org.jboss.netty.logging.InternalLogLevel",
      "org.jboss.netty.handler.codec.http.HttpMessage",
      "org.jboss.netty.handler.codec.http.HttpHeaders",
      "org.jboss.netty.channel.socket.nio.NioDatagramChannelConfig",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.StaticChannelPipeline",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.SimpleChannelDownstreamHandler",
      "org.jboss.netty.handler.codec.embedder.AbstractCodecEmbedder$EmbeddedChannelSink",
      "org.jboss.netty.channel.Channel",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.handler.timeout.WriteTimeoutHandler$TimeoutCanceller",
      "org.webbitserver.helpers.QueryParameters",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannel",
      "org.jboss.netty.channel.WriteCompletionEvent",
      "org.jboss.netty.channel.FailedChannelFuture",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.webbitserver.netty.NettyHttpRequest",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.buffer.SlicedChannelBuffer",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.webbitserver.helpers.SslFactory",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.jboss.netty.buffer.TruncatedChannelBuffer",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.channel.ChannelFutureProgressListener",
      "org.jboss.netty.channel.local.LocalServerChannelFactory",
      "org.jboss.netty.buffer.ChannelBufferFactory",
      "org.jboss.netty.handler.codec.embedder.AbstractCodecEmbedder",
      "org.jboss.netty.buffer.ChannelBuffer",
      "org.webbitserver.netty.WebSocketClient$1",
      "org.jboss.netty.channel.socket.ServerSocketChannel",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.handler.codec.http.HttpRequest",
      "org.jboss.netty.buffer.DuplicatedChannelBuffer",
      "org.webbitserver.netty.WebSocketClient$2",
      "org.jboss.netty.channel.socket.ClientSocketChannelFactory",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.jboss.netty.util.internal.ConcurrentHashMap$Segment",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.channel.local.LocalAddress",
      "org.jboss.netty.channel.socket.SocketChannelConfig",
      "org.jboss.netty.handler.codec.embedder.EmbeddedChannel",
      "org.jboss.netty.channel.ExceptionEvent",
      "org.webbitserver.helpers.Base64",
      "org.jboss.netty.channel.socket.nio.NioServerSocketPipelineSink",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.jboss.netty.channel.socket.nio.NioDatagramPipelineSink",
      "org.jboss.netty.channel.ChannelFutureListener$2",
      "org.jboss.netty.channel.StaticChannelPipeline$StaticChannelHandlerContext",
      "org.jboss.netty.channel.socket.http.HttpTunnelingClientSocketPipelineSink",
      "org.jboss.netty.channel.socket.nio.NioDatagramWorker",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.webbitserver.stub.StubHttpRequest",
      "org.jboss.netty.channel.ChannelPipelineFactory",
      "org.jboss.netty.channel.ChannelFutureListener$1",
      "org.jboss.netty.handler.codec.embedder.CodecEmbedderException",
      "org.webbitserver.stub.StubDataHolder",
      "org.jboss.netty.channel.socket.oio.OioDatagramChannel",
      "org.webbitserver.handler.ReconnectingWebSocketHandler$1",
      "org.jboss.netty.channel.DefaultExceptionEvent",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannel",
      "org.jboss.netty.channel.socket.SocketChannel",
      "org.jboss.netty.logging.InternalLogger",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "org.jboss.netty.buffer.CompositeChannelBuffer",
      "org.jboss.netty.channel.socket.oio.OioClientSocketPipelineSink",
      "org.jboss.netty.channel.socket.nio.NioProviderMetadata",
      "org.jboss.netty.channel.socket.oio.OioSocketChannel",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink",
      "org.jboss.netty.channel.ReceiveBufferSizePredictorFactory",
      "org.webbitserver.HttpRequest",
      "org.jboss.netty.buffer.WrappedChannelBuffer",
      "org.jboss.netty.channel.ChannelFuture",
      "org.jboss.netty.channel.socket.nio.NioDatagramChannel",
      "org.jboss.netty.handler.codec.http.DefaultHttpRequest",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$Boss",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.channel.ReceiveBufferSizePredictor",
      "org.jboss.netty.channel.socket.oio.OioServerSocketChannel",
      "org.webbitserver.EventSourceConnection",
      "org.jboss.netty.buffer.DirectChannelBufferFactory",
      "org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress",
      "org.jboss.netty.channel.socket.http.HttpTunnelingSocketChannelConfig",
      "org.jboss.netty.channel.socket.ServerSocketChannelConfig",
      "org.webbitserver.netty.WebSocketClient",
      "org.jboss.netty.channel.ChannelSink",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.channel.ServerChannelFactory",
      "org.jboss.netty.channel.socket.DatagramChannelConfig",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.webbitserver.wrapper.HttpRequestWrapper",
      "org.jboss.netty.handler.codec.embedder.CodecEmbedder",
      "org.jboss.netty.channel.ChannelDownstreamHandler",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.MessageEvent",
      "org.jboss.netty.channel.ChannelStateEvent",
      "org.webbitserver.DataHolder",
      "org.jboss.netty.channel.local.LocalClientChannelFactory",
      "org.jboss.netty.channel.socket.oio.OioAcceptedSocketChannel",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.ChannelFactory"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(WebSocketClient_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.webbitserver.netty.WebSocketClient",
      "org.webbitserver.netty.WebSocketClient$1",
      "org.webbitserver.netty.WebSocketClient$2",
      "org.jboss.netty.handler.codec.http.HttpVersion",
      "org.jboss.netty.handler.codec.http.HttpMethod",
      "org.webbitserver.helpers.Base64",
      "org.webbitserver.helpers.SslFactory",
      "org.webbitserver.WebbitException"
    );
  }
}
