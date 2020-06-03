/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 21:20:29 GMT 2020
 */

package com.netflix.simianarmy.basic.janitor;

import org.junit.Test;
import static org.junit.Assert.*;
import com.amazonaws.ClientConfiguration;
import com.netflix.simianarmy.MonkeyCalendar;
import com.netflix.simianarmy.MonkeyConfiguration;
import com.netflix.simianarmy.MonkeyRecorder;
import com.netflix.simianarmy.aws.SimpleDBRecorder;
import com.netflix.simianarmy.aws.janitor.SimpleDBJanitorResourceTracker;
import com.netflix.simianarmy.aws.janitor.crawler.ASGJanitorCrawler;
import com.netflix.simianarmy.aws.janitor.crawler.EBSSnapshotJanitorCrawler;
import com.netflix.simianarmy.aws.janitor.crawler.EBSVolumeJanitorCrawler;
import com.netflix.simianarmy.aws.janitor.crawler.InstanceJanitorCrawler;
import com.netflix.simianarmy.aws.janitor.rule.snapshot.NoGeneratedAMIRule;
import com.netflix.simianarmy.basic.BasicCalendar;
import com.netflix.simianarmy.basic.BasicConfiguration;
import com.netflix.simianarmy.basic.LocalDbRecorder;
import com.netflix.simianarmy.basic.conformity.BasicConformityMonkeyContext;
import com.netflix.simianarmy.basic.janitor.BasicJanitorMonkey;
import com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext;
import com.netflix.simianarmy.basic.janitor.BasicJanitorRuleEngine;
import com.netflix.simianarmy.basic.janitor.BasicVolumeTaggingMonkeyContext;
import com.netflix.simianarmy.client.aws.AWSClient;
import com.netflix.simianarmy.client.vsphere.PropertyBasedTerminationStrategy;
import com.netflix.simianarmy.client.vsphere.VSphereClient;
import com.netflix.simianarmy.client.vsphere.VSphereServiceConnection;
import com.netflix.simianarmy.janitor.AbstractJanitor;
import com.netflix.simianarmy.janitor.JanitorCrawler;
import com.netflix.simianarmy.janitor.JanitorEmailNotifier;
import com.netflix.simianarmy.janitor.JanitorResourceTracker;
import com.netflix.simianarmy.janitor.JanitorRuleEngine;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jcp.xml.dsig.internal.dom.XMLDSigRI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicJanitorMonkeyContext_ESTest extends BasicJanitorMonkeyContext_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      BasicJanitorMonkey basicJanitorMonkey0 = new BasicJanitorMonkey(basicJanitorMonkeyContext0);
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      String string0 = "O8gx-mUIrkz|";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      ClientConfiguration clientConfiguration0 = null;
      AWSClient aWSClient0 = new AWSClient(basicJanitorMonkeyContext0.GLOBAL_OWNER_TAGKEY, clientConfiguration0);
      InstanceJanitorCrawler instanceJanitorCrawler0 = new InstanceJanitorCrawler(aWSClient0);
      MonkeyCalendar monkeyCalendar0 = basicJanitorMonkeyContext0.calendar();
      BasicVolumeTaggingMonkeyContext basicVolumeTaggingMonkeyContext0 = new BasicVolumeTaggingMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicVolumeTaggingMonkeyContext0.configuration();
      String string1 = "iScsiHbaDevice";
      SimpleDBRecorder simpleDBRecorder0 = new SimpleDBRecorder(aWSClient0, string1);
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, instanceJanitorCrawler0, janitorResourceTracker0, monkeyCalendar0, monkeyConfiguration0, simpleDBRecorder0);
      MonkeyRecorder monkeyRecorder0 = basicJanitorMonkeyContext_BasicJanitorContext0.recorder();
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      List<AbstractJanitor> list0 = basicJanitorMonkeyContext0.janitors();
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      String string0 = "cQ_rY}D";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      AWSClient aWSClient0 = new AWSClient(string0);
      EBSVolumeJanitorCrawler eBSVolumeJanitorCrawler0 = new EBSVolumeJanitorCrawler(aWSClient0);
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      BasicConformityMonkeyContext basicConformityMonkeyContext0 = new BasicConformityMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicConformityMonkeyContext0.configuration();
      BasicCalendar basicCalendar0 = new BasicCalendar(monkeyConfiguration0);
      MonkeyRecorder monkeyRecorder0 = basicJanitorMonkeyContext0.recorder();
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, eBSVolumeJanitorCrawler0, janitorResourceTracker0, basicCalendar0, monkeyConfiguration0, monkeyRecorder0);
      JanitorResourceTracker janitorResourceTracker1 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorResourceTracker();
  }

  @Test(timeout = 11000)
  public void test4()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorEmailNotifier janitorEmailNotifier0 = basicJanitorMonkeyContext0.emailNotifier();
      JanitorEmailNotifier.Context janitorEmailNotifier_Context0 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
  }

  @Test(timeout = 11000)
  public void test5()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      String string0 = "6FMTYXUoBg.A`Fa";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      BasicJanitorMonkeyContext basicJanitorMonkeyContext1 = new BasicJanitorMonkeyContext();
      AWSClient aWSClient0 = basicJanitorMonkeyContext1.awsClient();
      EBSSnapshotJanitorCrawler eBSSnapshotJanitorCrawler0 = new EBSSnapshotJanitorCrawler(aWSClient0);
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      BasicConformityMonkeyContext basicConformityMonkeyContext0 = new BasicConformityMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicConformityMonkeyContext0.configuration();
      BasicCalendar basicCalendar0 = new BasicCalendar(monkeyConfiguration0);
      MonkeyRecorder monkeyRecorder0 = basicJanitorMonkeyContext1.recorder();
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, eBSSnapshotJanitorCrawler0, janitorResourceTracker0, basicCalendar0, monkeyConfiguration0, monkeyRecorder0);
      String string1 = basicJanitorMonkeyContext_BasicJanitorContext0.region();
  }

  @Test(timeout = 11000)
  public void test6()  throws Throwable  {
      String string0 = "Q42";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      AWSClient aWSClient0 = basicJanitorMonkeyContext0.awsClient();
      ASGJanitorCrawler aSGJanitorCrawler0 = new ASGJanitorCrawler(aWSClient0);
      String string1 = " (T5$,2/@[";
      SimpleDBJanitorResourceTracker simpleDBJanitorResourceTracker0 = new SimpleDBJanitorResourceTracker(aWSClient0, string1);
      BasicVolumeTaggingMonkeyContext basicVolumeTaggingMonkeyContext0 = new BasicVolumeTaggingMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicVolumeTaggingMonkeyContext0.configuration();
      BasicCalendar basicCalendar0 = new BasicCalendar(monkeyConfiguration0);
      MonkeyRecorder monkeyRecorder0 = null;
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, aSGJanitorCrawler0, simpleDBJanitorResourceTracker0, basicCalendar0, monkeyConfiguration0, monkeyRecorder0);
      JanitorRuleEngine janitorRuleEngine0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorRuleEngine();
  }

  @Test(timeout = 11000)
  public void test7()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      String string0 = "simianarmy.janitor.rule.oldDetachedVolumeRule.enabled";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      JanitorCrawler janitorCrawler0 = null;
      int int0 = 0;
      int int1 = 0;
      TimeZone timeZone0 = null;
      BasicCalendar basicCalendar0 = new BasicCalendar(int0, int1, timeZone0);
      MonkeyConfiguration monkeyConfiguration0 = basicJanitorMonkeyContext0.configuration();
      MonkeyRecorder monkeyRecorder0 = basicJanitorMonkeyContext0.recorder();
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, janitorCrawler0, janitorResourceTracker0, basicCalendar0, monkeyConfiguration0, monkeyRecorder0);
      JanitorCrawler janitorCrawler1 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorCrawler();
  }

  @Test(timeout = 11000)
  public void test8()  throws Throwable  {
      String string0 = "mKJ;83^%0cE2*F";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      XMLDSigRI xMLDSigRI0 = new XMLDSigRI();
      BasicConfiguration basicConfiguration0 = new BasicConfiguration(xMLDSigRI0);
      BasicCalendar basicCalendar0 = new BasicCalendar(basicConfiguration0);
      int int0 = 1294;
      NoGeneratedAMIRule noGeneratedAMIRule0 = new NoGeneratedAMIRule(basicCalendar0, int0, int0);
      BasicJanitorRuleEngine basicJanitorRuleEngine1 = basicJanitorRuleEngine0.addRule(noGeneratedAMIRule0);
      PropertyBasedTerminationStrategy propertyBasedTerminationStrategy0 = new PropertyBasedTerminationStrategy(basicConfiguration0);
      VSphereServiceConnection vSphereServiceConnection0 = new VSphereServiceConnection(basicConfiguration0);
      VSphereClient vSphereClient0 = new VSphereClient(propertyBasedTerminationStrategy0, vSphereServiceConnection0);
      InstanceJanitorCrawler instanceJanitorCrawler0 = new InstanceJanitorCrawler(vSphereClient0);
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      SimpleDBRecorder simpleDBRecorder0 = new SimpleDBRecorder(vSphereClient0, instanceJanitorCrawler0.INSTANCE_FIELD_ASG_NAME);
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine1, instanceJanitorCrawler0, janitorResourceTracker0, basicCalendar0, basicConfiguration0, simpleDBRecorder0);
      MonkeyCalendar monkeyCalendar0 = basicJanitorMonkeyContext_BasicJanitorContext0.calendar();
      JanitorResourceTracker janitorResourceTracker1 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorResourceTracker();
  }

  @Test(timeout = 11000)
  public void test9()  throws Throwable  {
      String string0 = "vD";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      ClientConfiguration clientConfiguration0 = new ClientConfiguration();
      AWSClient aWSClient0 = new AWSClient(string0, clientConfiguration0);
      EBSVolumeJanitorCrawler eBSVolumeJanitorCrawler0 = new EBSVolumeJanitorCrawler(aWSClient0);
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      MonkeyCalendar monkeyCalendar0 = basicJanitorMonkeyContext0.calendar();
      Properties properties0 = new Properties();
      BasicConfiguration basicConfiguration0 = new BasicConfiguration(properties0);
      LocalDbRecorder localDbRecorder0 = new LocalDbRecorder(basicConfiguration0);
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, eBSVolumeJanitorCrawler0, janitorResourceTracker0, monkeyCalendar0, basicConfiguration0, localDbRecorder0);
      MonkeyConfiguration monkeyConfiguration0 = basicJanitorMonkeyContext_BasicJanitorContext0.configuration();
      String string1 = basicJanitorMonkeyContext_BasicJanitorContext0.region();
  }
}
