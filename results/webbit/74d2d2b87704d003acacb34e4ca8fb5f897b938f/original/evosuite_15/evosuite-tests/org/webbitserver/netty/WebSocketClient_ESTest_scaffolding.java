/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri May 01 18:16:46 GMT 2020
 */

package org.webbitserver.netty;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class WebSocketClient_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

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

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(WebSocketClient_ESTest_scaffolding.class.getClassLoader() ,
      "org.webbitserver.handler.exceptions.SilentExceptionHandler",
      "org.jboss.netty.channel.AdaptiveReceiveBufferSizePredictorFactory",
      "org.jboss.netty.channel.local.LocalChannel",
      "org.jboss.netty.handler.codec.replay.ReplayingDecoderBuffer",
      "org.webbitserver.wrapper.WebSocketConnectionWrapper",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.handler.codec.http.HttpMethod",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.ChannelFutureListener",
      "org.jboss.netty.util.internal.ConcurrentHashMap$EntrySet",
      "org.webbitserver.stub.StubConnection",
      "org.jboss.netty.channel.socket.oio.OioClientSocketChannel",
      "org.jboss.netty.logging.InternalLoggerFactory$1",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler$1",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.buffer.ByteBufferBackedChannelBuffer",
      "org.webbitserver.WebSocketHandler",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$10",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$SendBuffer",
      "org.jboss.netty.handler.codec.http.HttpVersion",
      "org.webbitserver.handler.ReconnectingWebSocketHandler",
      "org.jboss.netty.util.internal.ExecutorUtil",
      "org.jboss.netty.channel.socket.DatagramChannel",
      "org.jboss.netty.handler.codec.http.HttpChunk",
      "org.jboss.netty.util.internal.ConcurrentHashMap$KeyIterator",
      "org.jboss.netty.channel.ChannelUpstreamHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap$HashEntry",
      "org.jboss.netty.channel.ChannelHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap",
      "org.jboss.netty.logging.InternalLogLevel",
      "org.jboss.netty.handler.codec.http.HttpHeaders",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.handler.codec.frame.TooLongFrameException",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.channel.WriteCompletionEvent",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.jboss.netty.util.CharsetUtil",
      "org.jboss.netty.util.CharsetUtil$1",
      "org.jboss.netty.util.CharsetUtil$2",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$2",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.channel.ChannelFutureProgressListener",
      "org.jboss.netty.handler.codec.embedder.AbstractCodecEmbedder",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.buffer.DuplicatedChannelBuffer",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$PreallocationRef",
      "org.jboss.netty.handler.codec.embedder.DecoderEmbedder",
      "org.jboss.netty.handler.codec.http.HttpResponseDecoder",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.handler.codec.embedder.EmbeddedChannel",
      "org.webbitserver.helpers.Base64",
      "org.jboss.netty.channel.ChannelFutureListener$2",
      "org.jboss.netty.channel.StaticChannelPipeline$StaticChannelHandlerContext",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel$WriteRequestQueue",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.webbitserver.stub.StubHttpRequest",
      "org.jboss.netty.channel.ChannelFutureListener$1",
      "org.webbitserver.stub.StubDataHolder",
      "org.jboss.netty.channel.socket.oio.OioDatagramChannel",
      "org.jboss.netty.handler.codec.http.HttpCodecUtil",
      "org.jboss.netty.util.internal.LinkedTransferQueue",
      "org.jboss.netty.channel.socket.SocketChannel",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "org.jboss.netty.channel.socket.oio.OioSocketChannel",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "org.webbitserver.HttpRequest",
      "org.jboss.netty.buffer.WrappedChannelBuffer",
      "org.jboss.netty.util.internal.ConcurrentHashMap$WriteThroughEntry",
      "org.jboss.netty.channel.ChannelFuture",
      "org.jboss.netty.channel.socket.nio.NioDatagramChannel",
      "org.jboss.netty.channel.Channels$1",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$Boss",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.ReceiveBufferSizePredictor",
      "org.webbitserver.EventSourceConnection",
      "org.jboss.netty.handler.codec.replay.UnreplayableOperationException",
      "org.jboss.netty.channel.socket.ServerSocketChannelConfig",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$PooledSendBuffer",
      "org.webbitserver.netty.WebSocketClient",
      "org.jboss.netty.channel.ChannelSink",
      "org.jboss.netty.channel.socket.nio.DefaultNioSocketChannelConfig",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "org.jboss.netty.handler.codec.http.HttpMessageDecoder$1",
      "org.jboss.netty.util.internal.ConcurrentHashMap$ValueIterator",
      "org.webbitserver.wrapper.HttpRequestWrapper",
      "org.jboss.netty.channel.ChannelDownstreamHandler",
      "org.jboss.netty.channel.MessageEvent",
      "org.webbitserver.DataHolder",
      "org.jboss.netty.channel.socket.oio.OioAcceptedSocketChannel",
      "org.jboss.netty.channel.ChannelFactory",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$9",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$8",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$7",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$6",
      "org.jboss.netty.channel.ChildChannelStateEvent",
      "org.jboss.netty.channel.socket.nio.NioAcceptedSocketChannel",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$1",
      "org.webbitserver.netty.NettyWebSocketConnection",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$UnpooledSendBuffer",
      "org.jboss.netty.handler.codec.http.DefaultHttpMessage",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$5",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$4",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$3",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder$2",
      "org.jboss.netty.channel.ChannelPipeline",
      "org.webbitserver.WebSocket",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$FileSendBuffer",
      "org.jboss.netty.buffer.DynamicChannelBuffer",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil",
      "org.jboss.netty.handler.codec.http.HttpMessageDecoder$State",
      "org.jboss.netty.channel.socket.DefaultSocketChannelConfig",
      "org.webbitserver.netty.contrib.EventSourceMessage",
      "org.jboss.netty.channel.ChannelHandlerLifeCycleException",
      "org.jboss.netty.channel.LifeCycleAwareChannelHandler",
      "org.jboss.netty.channel.UpstreamMessageEvent",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "org.jboss.netty.handler.codec.http.HttpChunk$1",
      "org.jboss.netty.channel.ChannelConfig",
      "org.jboss.netty.channel.socket.nio.NioSocketChannelConfig",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel$WriteTask",
      "org.jboss.netty.buffer.ReadOnlyChannelBuffer",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.util.internal.ReusableIterator",
      "org.jboss.netty.channel.ChannelEvent",
      "org.jboss.netty.util.DebugUtil",
      "org.jboss.netty.buffer.LittleEndianHeapChannelBuffer",
      "org.jboss.netty.util.internal.StackTraceSimplifier",
      "org.jboss.netty.channel.DownstreamMessageEvent",
      "org.webbitserver.WebSocketConnection",
      "org.jboss.netty.channel.local.LocalServerChannel",
      "org.jboss.netty.channel.socket.http.HttpTunnelingClientSocketChannel",
      "org.jboss.netty.buffer.ChannelBuffers",
      "org.jboss.netty.util.internal.ConcurrentHashMap$HashIterator",
      "org.webbitserver.WebbitException",
      "org.jboss.netty.handler.ssl.SslHandler$ClosingChannelFutureListener",
      "org.jboss.netty.channel.ServerChannel",
      "org.jboss.netty.handler.codec.http.HttpMessage",
      "org.jboss.netty.channel.socket.nio.NioDatagramChannelConfig",
      "org.jboss.netty.handler.codec.http.HttpMessageEncoder",
      "org.jboss.netty.handler.codec.http.HttpMessageDecoder",
      "org.jboss.netty.channel.Channel",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.handler.timeout.WriteTimeoutHandler$TimeoutCanceller",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler$1",
      "org.webbitserver.helpers.QueryParameters",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannel",
      "org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler$2",
      "org.jboss.netty.channel.FailedChannelFuture",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.webbitserver.netty.NettyHttpRequest",
      "org.jboss.netty.buffer.SlicedChannelBuffer",
      "org.webbitserver.helpers.SslFactory",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.buffer.TruncatedChannelBuffer",
      "org.webbitserver.netty.CatchingRunnable",
      "org.jboss.netty.buffer.ChannelBufferFactory",
      "org.jboss.netty.buffer.ChannelBuffer",
      "org.webbitserver.netty.WebSocketClient$1",
      "org.jboss.netty.channel.socket.ServerSocketChannel",
      "org.jboss.netty.util.internal.ConcurrentHashMap$Values",
      "org.jboss.netty.handler.codec.http.HttpRequest",
      "org.webbitserver.netty.WebSocketClient$2",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.jboss.netty.channel.socket.ClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$RegisterTask",
      "org.jboss.netty.util.internal.ConcurrentHashMap$Segment",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.util.internal.ConcurrentHashMap$SimpleEntry",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.channel.local.LocalAddress",
      "org.jboss.netty.channel.socket.SocketChannelConfig",
      "org.jboss.netty.channel.ExceptionEvent",
      "org.jboss.netty.util.internal.ConcurrentHashMap$KeySet",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.jboss.netty.handler.codec.replay.ReplayingDecoder",
      "org.jboss.netty.handler.codec.http.HttpContentDecompressor",
      "org.jboss.netty.handler.codec.http.HttpRequestEncoder",
      "org.webbitserver.handler.exceptions.PrintStackTraceExceptionHandler",
      "org.jboss.netty.util.internal.LinkedTransferQueue$Node",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.handler.codec.http.HttpHeaders$Entry",
      "org.jboss.netty.channel.ChannelPipelineFactory",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.webbitserver.handler.ReconnectingWebSocketHandler$1",
      "org.jboss.netty.channel.DefaultExceptionEvent",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannel",
      "org.jboss.netty.logging.InternalLogger",
      "org.jboss.netty.buffer.CompositeChannelBuffer",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferPool",
      "org.jboss.netty.channel.socket.nio.NioProviderMetadata",
      "org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.ReceiveBufferSizePredictorFactory",
      "org.jboss.netty.handler.codec.http.HttpContentDecoder",
      "org.jboss.netty.handler.codec.http.DefaultHttpRequest",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.handler.codec.replay.ReplayError",
      "org.jboss.netty.channel.socket.oio.OioServerSocketChannel",
      "org.jboss.netty.util.internal.ConcurrentHashMap$EntryIterator",
      "org.jboss.netty.buffer.DirectChannelBufferFactory",
      "org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress",
      "org.jboss.netty.channel.FileRegion",
      "org.jboss.netty.handler.codec.http.HttpChunkTrailer",
      "org.jboss.netty.channel.socket.http.HttpTunnelingSocketChannelConfig",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil$Node",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.channel.socket.DatagramChannelConfig",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.jboss.netty.handler.codec.embedder.CodecEmbedder",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.ChannelStateEvent",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.channel.DefaultChannelFuture"
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
      "org.jboss.netty.handler.codec.http.DefaultHttpMessage",
      "org.jboss.netty.handler.codec.http.DefaultHttpRequest",
      "org.jboss.netty.handler.codec.http.HttpHeaders",
      "org.jboss.netty.handler.codec.http.HttpHeaders$Entry",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.jboss.netty.buffer.ChannelBuffers",
      "org.jboss.netty.util.CharsetUtil$1",
      "org.jboss.netty.util.CharsetUtil$2",
      "org.jboss.netty.util.CharsetUtil",
      "org.jboss.netty.handler.codec.http.HttpCodecUtil",
      "org.webbitserver.handler.exceptions.PrintStackTraceExceptionHandler",
      "org.webbitserver.handler.exceptions.SilentExceptionHandler",
      "org.webbitserver.handler.ReconnectingWebSocketHandler",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.util.DebugUtil",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.jboss.netty.util.internal.StackTraceSimplifier",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.logging.InternalLoggerFactory$1",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$Boss",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil$Node",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil",
      "org.jboss.netty.util.internal.LinkedTransferQueue",
      "org.jboss.netty.channel.socket.nio.NioProviderMetadata",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.Channels$1",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "org.jboss.netty.handler.codec.replay.ReplayingDecoder",
      "org.jboss.netty.handler.codec.http.HttpMessageDecoder",
      "org.jboss.netty.handler.codec.http.HttpResponseDecoder",
      "org.jboss.netty.handler.codec.http.HttpMessageDecoder$State",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "org.jboss.netty.handler.codec.http.HttpMessageEncoder",
      "org.jboss.netty.handler.codec.http.HttpRequestEncoder",
      "org.jboss.netty.handler.codec.http.HttpContentDecoder",
      "org.jboss.netty.handler.codec.http.HttpContentDecompressor",
      "org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap",
      "org.jboss.netty.util.internal.ConcurrentHashMap$Segment",
      "org.jboss.netty.util.internal.ConcurrentHashMap$HashEntry",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel$WriteTask",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel$WriteRequestQueue",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.socket.DefaultSocketChannelConfig",
      "org.jboss.netty.channel.AdaptiveReceiveBufferSizePredictorFactory",
      "org.jboss.netty.channel.socket.nio.DefaultNioSocketChannelConfig",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler$1",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$2",
      "org.jboss.netty.channel.DefaultExceptionEvent",
      "org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler$1",
      "org.jboss.netty.handler.codec.replay.ReplayError",
      "org.jboss.netty.handler.codec.replay.ReplayingDecoderBuffer",
      "org.jboss.netty.util.internal.ExecutorUtil",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.webbitserver.WebbitException",
      "org.webbitserver.handler.ReconnectingWebSocketHandler$1",
      "org.webbitserver.helpers.SslFactory"
    );
  }
}
