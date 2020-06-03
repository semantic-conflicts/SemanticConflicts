/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 29 13:35:04 GMT 2020
 */

package retrofit;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RequestBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "retrofit.RequestBuilder"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RequestBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.gson.internal.bind.TimeTypeAdapter$1",
      "com.google.gson.reflect.TypeToken",
      "retrofit.mime.TypedFile",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters$24",
      "retrofit.converter.GsonConverter$JsonTypedOutput",
      "com.google.gson.TreeTypeAdapter$SingleTypeFactory",
      "com.google.gson.internal.bind.TypeAdapters$25",
      "com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.gson.internal.bind.TypeAdapters$20",
      "retrofit.mime.TypedByteArray",
      "retrofit.RequestBuilder$1",
      "com.google.gson.TypeAdapter",
      "com.google.gson.internal.bind.JsonTreeWriter",
      "com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.gson.JsonDeserializationContext",
      "com.google.gson.internal.bind.TypeAdapters$22",
      "retrofit.RequestBuilder",
      "com.google.gson.FieldNamingStrategy",
      "com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.gson.internal.bind.TypeAdapters$29",
      "com.google.gson.internal.bind.SqlDateTypeAdapter",
      "com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper",
      "com.google.gson.ExclusionStrategy",
      "com.google.gson.internal.bind.TimeTypeAdapter",
      "retrofit.RestMethodInfo$RequestType",
      "com.google.gson.internal.bind.TypeAdapters$30",
      "com.google.gson.internal.bind.TypeAdapters$31",
      "com.google.gson.JsonArray",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.internal.Excluder",
      "com.google.gson.annotations.Until",
      "com.google.gson.TypeAdapterFactory",
      "com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl",
      "com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter",
      "com.google.gson.internal.$Gson$Types",
      "retrofit.mime.FormUrlEncodedTypedOutput",
      "com.google.gson.stream.JsonReader",
      "com.google.gson.FieldAttributes",
      "retrofit.mime.TypedInput",
      "com.google.gson.InstanceCreator",
      "retrofit.mime.TypedString",
      "com.google.gson.internal.bind.MapTypeAdapterFactory",
      "com.google.gson.Gson$FutureTypeAdapter",
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.internal.bind.ArrayTypeAdapter$1",
      "com.google.gson.internal.$Gson$Preconditions",
      "com.google.gson.internal.Streams",
      "retrofit.Types$ParameterizedTypeImpl",
      "retrofit.Types$WildcardTypeImpl",
      "com.google.gson.internal.bind.TypeAdapters$12",
      "com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.gson.internal.Primitives",
      "com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.gson.stream.MalformedJsonException",
      "retrofit.converter.Converter",
      "com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.gson.stream.JsonToken",
      "com.google.gson.internal.ConstructorConstructor$3",
      "com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.gson.internal.ObjectConstructor",
      "com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.gson.internal.Streams$AppendableWriter$CurrentWrite",
      "com.google.gson.JsonNull",
      "com.google.gson.internal.bind.TypeAdapters$19",
      "com.google.gson.internal.bind.DateTypeAdapter$1",
      "com.google.gson.internal.LinkedHashTreeMap$Node",
      "retrofit.converter.GsonConverter",
      "com.google.gson.internal.ConstructorConstructor$8",
      "com.google.gson.LongSerializationPolicy$1",
      "retrofit.Types$GenericArrayTypeImpl",
      "com.google.gson.LongSerializationPolicy$2",
      "com.google.gson.internal.ConstructorConstructor$6",
      "com.google.gson.JsonObject",
      "com.google.gson.internal.bind.JsonTreeReader$1",
      "com.google.gson.TypeAdapter$1",
      "com.google.gson.internal.UnsafeAllocator$3",
      "com.google.gson.internal.UnsafeAllocator$4",
      "retrofit.mime.TypedOutput",
      "com.google.gson.internal.UnsafeAllocator$1",
      "com.google.gson.internal.UnsafeAllocator$2",
      "com.google.gson.Gson$2",
      "com.google.gson.Gson$3",
      "com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.google.gson.Gson$4",
      "com.google.gson.Gson$5",
      "com.google.gson.internal.bind.DateTypeAdapter",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter",
      "com.google.gson.Gson$1",
      "com.google.gson.internal.LinkedHashTreeMap",
      "retrofit.RestMethodInfo",
      "com.google.gson.internal.bind.TypeAdapters$22$1",
      "com.google.gson.Gson",
      "retrofit.mime.MultipartTypedOutput",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory",
      "retrofit.mime.MimeUtil",
      "com.google.gson.internal.$Gson$Types$WildcardTypeImpl",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1",
      "com.google.gson.annotations.SerializedName",
      "com.google.gson.internal.Excluder$1",
      "com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.gson.internal.bind.JsonTreeReader",
      "com.google.gson.internal.bind.TypeAdapters$1",
      "com.google.gson.internal.bind.JsonTreeWriter$1",
      "com.google.gson.internal.bind.SqlDateTypeAdapter$1",
      "com.google.gson.JsonIOException",
      "com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.gson.internal.bind.TypeAdapters$6",
      "com.google.gson.internal.bind.ObjectTypeAdapter$2",
      "com.google.gson.internal.LazilyParsedNumber",
      "com.google.gson.internal.bind.TypeAdapters$5",
      "com.google.gson.internal.bind.ObjectTypeAdapter$1",
      "com.google.gson.JsonParseException",
      "retrofit.client.Header",
      "com.google.gson.internal.ConstructorConstructor",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter",
      "com.google.gson.JsonElement",
      "com.google.gson.FieldNamingPolicy",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory",
      "com.google.gson.JsonSerializationContext",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.internal.UnsafeAllocator",
      "com.google.gson.internal.Streams$AppendableWriter",
      "com.google.gson.JsonSyntaxException",
      "com.google.gson.FieldNamingPolicy$4",
      "com.google.gson.FieldNamingPolicy$3",
      "retrofit.converter.ConversionException",
      "com.google.gson.annotations.Since",
      "com.google.gson.FieldNamingPolicy$5",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl",
      "com.google.gson.internal.LinkedHashTreeMap$1",
      "retrofit.client.Request",
      "com.google.gson.internal.ConstructorConstructor$10",
      "com.google.gson.FieldNamingPolicy$2",
      "com.google.gson.FieldNamingPolicy$1",
      "com.google.gson.internal.ConstructorConstructor$12"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RequestBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "retrofit.RequestBuilder",
      "retrofit.RestMethodInfo$RequestType",
      "retrofit.RequestBuilder$1",
      "com.google.gson.Gson",
      "com.google.gson.internal.Excluder",
      "com.google.gson.FieldNamingPolicy",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.Gson$1",
      "com.google.gson.Gson$2",
      "com.google.gson.internal.ConstructorConstructor",
      "com.google.gson.TypeAdapter",
      "com.google.gson.internal.bind.TypeAdapters$1",
      "com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.gson.internal.bind.TypeAdapters$29",
      "com.google.gson.internal.bind.TypeAdapters$5",
      "com.google.gson.internal.bind.TypeAdapters$6",
      "com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.gson.internal.bind.TypeAdapters$12",
      "com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.gson.internal.bind.TypeAdapters$19",
      "com.google.gson.internal.bind.TypeAdapters$20",
      "com.google.gson.internal.bind.TypeAdapters$31",
      "com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.gson.internal.bind.TypeAdapters$22",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters$30",
      "com.google.gson.internal.bind.TypeAdapters$24",
      "com.google.gson.internal.bind.TypeAdapters$25",
      "com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.google.gson.internal.bind.ObjectTypeAdapter$1",
      "com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.google.gson.Gson$3",
      "com.google.gson.Gson$4",
      "com.google.gson.internal.bind.DateTypeAdapter$1",
      "com.google.gson.internal.bind.DateTypeAdapter",
      "com.google.gson.internal.bind.TimeTypeAdapter$1",
      "com.google.gson.internal.bind.TimeTypeAdapter",
      "com.google.gson.internal.bind.SqlDateTypeAdapter$1",
      "com.google.gson.internal.bind.SqlDateTypeAdapter",
      "com.google.gson.internal.bind.ArrayTypeAdapter$1",
      "com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory",
      "com.google.gson.internal.bind.MapTypeAdapterFactory",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory",
      "retrofit.converter.GsonConverter",
      "com.google.gson.reflect.TypeToken",
      "com.google.gson.internal.$Gson$Preconditions",
      "com.google.gson.internal.$Gson$Types",
      "retrofit.converter.GsonConverter$JsonTypedOutput",
      "com.google.gson.internal.Streams",
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.Gson$FutureTypeAdapter",
      "com.google.gson.internal.ConstructorConstructor$3",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter",
      "com.google.gson.internal.Primitives",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1",
      "com.google.gson.internal.ConstructorConstructor$12",
      "com.google.gson.internal.UnsafeAllocator",
      "com.google.gson.internal.UnsafeAllocator$1",
      "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl",
      "com.google.gson.internal.$Gson$Types$WildcardTypeImpl",
      "com.google.gson.internal.ConstructorConstructor$10",
      "com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter",
      "com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper",
      "com.google.gson.internal.ConstructorConstructor$8",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter",
      "com.google.gson.internal.Excluder$1",
      "com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter",
      "com.google.gson.JsonElement",
      "com.google.gson.JsonArray",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.stream.JsonReader",
      "retrofit.mime.TypedFile",
      "retrofit.mime.MimeUtil",
      "retrofit.mime.TypedByteArray",
      "com.google.gson.stream.JsonToken",
      "com.google.gson.JsonParseException",
      "com.google.gson.JsonSyntaxException",
      "retrofit.converter.ConversionException",
      "retrofit.RestMethodInfo",
      "com.google.gson.internal.Streams$AppendableWriter",
      "com.google.gson.internal.Streams$AppendableWriter$CurrentWrite",
      "retrofit.client.Header",
      "com.google.gson.internal.bind.JsonTreeWriter$1",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.internal.bind.JsonTreeWriter",
      "com.google.gson.JsonNull",
      "retrofit.mime.TypedString",
      "com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl",
      "com.google.gson.internal.ConstructorConstructor$6",
      "com.google.gson.internal.bind.ObjectTypeAdapter$2",
      "retrofit.mime.FormUrlEncodedTypedOutput",
      "retrofit.mime.MultipartTypedOutput",
      "com.google.gson.JsonObject",
      "com.google.gson.internal.LinkedHashTreeMap$1",
      "com.google.gson.internal.LinkedHashTreeMap",
      "com.google.gson.internal.LinkedHashTreeMap$Node",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.internal.bind.JsonTreeReader$1",
      "com.google.gson.internal.bind.JsonTreeReader"
    );
  }
}
