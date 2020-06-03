/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 08:46:55 GMT 2020
 */

package org.activiti.engine.impl.bpmn.behavior;

import org.junit.Test;
import static org.junit.Assert.*;
import org.activiti.bpmn.model.SendTask;
import org.activiti.engine.impl.bpmn.parser.factory.DefaultActivityBehaviorFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UserTaskActivityBehavior_ESTest extends UserTaskActivityBehavior_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultActivityBehaviorFactory defaultActivityBehaviorFactory0 = new DefaultActivityBehaviorFactory();
      SendTask sendTask0 = new SendTask();
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.ClassCastException : org.activiti.engine.impl.bpmn.behavior.MailActivityBehavior cannot be cast to org.activiti.engine.impl.bpmn.behavior.MailActivityBehavior
      defaultActivityBehaviorFactory0.createMailActivityBehavior(sendTask0);
  }
}
