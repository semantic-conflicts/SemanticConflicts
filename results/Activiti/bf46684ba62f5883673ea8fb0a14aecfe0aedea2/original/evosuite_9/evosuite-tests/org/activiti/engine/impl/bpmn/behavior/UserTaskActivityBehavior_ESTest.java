/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 09:16:25 GMT 2020
 */

package org.activiti.engine.impl.bpmn.behavior;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.List;
import org.activiti.bpmn.model.ExtensionElement;
import org.activiti.bpmn.model.IntermediateCatchEvent;
import org.activiti.bpmn.model.StringDataObject;
import org.activiti.bpmn.model.UserTask;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.form.TaskFormData;
import org.activiti.engine.impl.bpmn.behavior.IntermediateCatchEventActivityBehavior;
import org.activiti.engine.impl.bpmn.behavior.MailActivityBehavior;
import org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior;
import org.activiti.engine.impl.bpmn.parser.factory.DefaultActivityBehaviorFactory;
import org.activiti.engine.impl.form.DefaultStartFormHandler;
import org.activiti.engine.impl.form.DefaultTaskFormHandler;
import org.activiti.engine.impl.form.TaskFormHandler;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.pvm.process.TransitionImpl;
import org.activiti.engine.impl.pvm.runtime.ExecutionImpl;
import org.activiti.engine.impl.task.TaskDefinition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UserTaskActivityBehavior_ESTest extends UserTaskActivityBehavior_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      DefaultActivityBehaviorFactory defaultActivityBehaviorFactory0 = new DefaultActivityBehaviorFactory();
      UserTask userTask0 = new UserTask();
      UserTask userTask1 = userTask0.clone();
      TaskDefinition taskDefinition0 = null;
      UserTaskActivityBehavior userTaskActivityBehavior0 = defaultActivityBehaviorFactory0.createUserTaskActivityBehavior(userTask1, taskDefinition0);
      TaskDefinition taskDefinition1 = userTaskActivityBehavior0.getTaskDefinition();
      ExecutionEntity executionEntity0 = new ExecutionEntity();
      try { 
        userTaskActivityBehavior0.execute(executionEntity0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.entity.TaskEntity", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      String string0 = "C*~d<w|:<";
      TaskEntity taskEntity0 = new TaskEntity(string0);
      ActivityExecution activityExecution0 = null;
      userTaskActivityBehavior0.handleAssignments(taskEntity0, activityExecution0);
      TaskEntity taskEntity1 = null;
      ActivityExecution activityExecution1 = null;
      userTaskActivityBehavior0.handleAssignments(taskEntity1, activityExecution1);
      try { 
        userTaskActivityBehavior0.signal(activityExecution1, string0, taskEntity1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      TaskEntity taskEntity0 = new TaskEntity();
      TaskDefinition taskDefinition0 = taskEntity0.getTaskDefinition();
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      List<String> list0 = userTaskActivityBehavior0.extractCandidates(taskEntity0.DELETE_REASON_COMPLETED);
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      DefaultStartFormHandler defaultStartFormHandler0 = new DefaultStartFormHandler();
      Expression expression0 = defaultStartFormHandler0.getFormKey();
      taskDefinition0.addCandidateGroupIdExpression(expression0);
      EvoSuiteFile evoSuiteFile0 = null;
      ActivityExecution activityExecution0 = null;
      TaskEntity taskEntity0 = null;
      ActivityExecution activityExecution1 = null;
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.handleAssignments(taskEntity0, activityExecution1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      String string0 = "C*~d<w|:<";
      DefaultStartFormHandler defaultStartFormHandler0 = new DefaultStartFormHandler();
      Expression expression0 = defaultStartFormHandler0.getFormKey();
      taskDefinition0.addCandidateGroupIdExpression(expression0);
      ActivityExecution activityExecution0 = null;
      TaskEntity taskEntity0 = null;
      ActivityExecution activityExecution1 = null;
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.handleAssignments(taskEntity0, activityExecution1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      DefaultActivityBehaviorFactory defaultActivityBehaviorFactory0 = new DefaultActivityBehaviorFactory();
      UserTask userTask0 = new UserTask();
      UserTask userTask1 = userTask0.clone();
      Date date0 = null;
      TaskEntity taskEntity0 = TaskEntity.create(date0);
      TaskDefinition taskDefinition0 = taskEntity0.getTaskDefinition();
      UserTaskActivityBehavior userTaskActivityBehavior0 = defaultActivityBehaviorFactory0.createUserTaskActivityBehavior(userTask1, taskDefinition0);
      ExecutionEntity executionEntity0 = new ExecutionEntity();
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.handleAssignments(taskEntity0, executionEntity0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      MockDate mockDate0 = new MockDate();
      TaskEntity taskEntity0 = new TaskEntity();
      TaskFormData taskFormData0 = defaultTaskFormHandler0.createTaskForm(taskEntity0);
      TaskEntity taskEntity1 = TaskEntity.create(mockDate0);
      ExecutionImpl executionImpl0 = new ExecutionImpl();
      ExecutionImpl executionImpl1 = executionImpl0.getSubProcessInstance();
      userTaskActivityBehavior0.handleAssignments(taskEntity1, executionImpl1);
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      DefaultActivityBehaviorFactory defaultActivityBehaviorFactory0 = new DefaultActivityBehaviorFactory();
      UserTask userTask0 = null;
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = defaultActivityBehaviorFactory0.createUserTaskActivityBehavior(userTask0, taskDefinition0);
      TaskDefinition taskDefinition1 = userTaskActivityBehavior0.getTaskDefinition();
      Date date0 = null;
      TaskEntity taskEntity0 = TaskEntity.create(date0);
      ActivityExecution activityExecution0 = null;
      userTaskActivityBehavior0.handleAssignments(taskEntity0, activityExecution0);
      try { 
        userTaskActivityBehavior0.execute(activityExecution0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.entity.TaskEntity", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      TaskEntity taskEntity0 = new TaskEntity();
      TaskDefinition taskDefinition0 = taskEntity0.getTaskDefinition();
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      ProcessDefinitionEntity processDefinitionEntity0 = new ProcessDefinitionEntity();
      TransitionImpl transitionImpl0 = new TransitionImpl(taskEntity0.DELETE_REASON_DELETED, processDefinitionEntity0);
      ActivityImpl activityImpl0 = transitionImpl0.getDestination();
      ExecutionImpl executionImpl0 = new ExecutionImpl(activityImpl0);
      ExecutionImpl executionImpl1 = executionImpl0.getSuperExecution();
      try { 
        userTaskActivityBehavior0.signal(executionImpl1, taskEntity0.DELETE_REASON_DELETED, executionImpl1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      TaskFormHandler taskFormHandler0 = null;
      TaskDefinition taskDefinition0 = new TaskDefinition(taskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      String string0 = null;
      ProcessDefinitionEntity processDefinitionEntity0 = new ProcessDefinitionEntity();
      ActivityImpl activityImpl0 = new ActivityImpl(string0, processDefinitionEntity0);
      ExecutionImpl executionImpl0 = new ExecutionImpl(activityImpl0);
      ExecutionImpl executionImpl1 = executionImpl0.getSuperExecution();
      int int0 = 0;
      Integer integer0 = new Integer(int0);
      try { 
        userTaskActivityBehavior0.signal(executionImpl1, string0, integer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      DefaultActivityBehaviorFactory defaultActivityBehaviorFactory0 = new DefaultActivityBehaviorFactory();
      UserTask userTask0 = new UserTask();
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = defaultActivityBehaviorFactory0.createUserTaskActivityBehavior(userTask0, taskDefinition0);
      String string0 = null;
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.extractCandidates(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      ExecutionImpl executionImpl0 = new ExecutionImpl();
      String string0 = "9PNt4i{[4 k>]Stn_hv";
      try { 
        userTaskActivityBehavior0.signal(executionImpl0, string0, defaultTaskFormHandler0);
      } catch(ClassCastException e) {
         //
         // org.activiti.engine.impl.pvm.runtime.ExecutionImpl cannot be cast to org.activiti.engine.impl.persistence.entity.ExecutionEntity
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      String string0 = "C*~d<w|:<";
      DefaultStartFormHandler defaultStartFormHandler0 = new DefaultStartFormHandler();
      Expression expression0 = defaultStartFormHandler0.getFormKey();
      taskDefinition0.addCandidateGroupIdExpression(expression0);
      TaskEntity taskEntity0 = new TaskEntity(string0);
      ActivityExecution activityExecution0 = null;
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.handleAssignments(taskEntity0, activityExecution0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }
}
