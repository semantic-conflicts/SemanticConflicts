/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 28 22:58:44 GMT 2020
 */

package fitnesse.testsystems.slim.tables;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fitnesse.testsystems.TestResult;
import fitnesse.testsystems.slim.HtmlTable;
import fitnesse.testsystems.slim.SlimTestContext;
import fitnesse.testsystems.slim.SlimTestContextImpl;
import fitnesse.testsystems.slim.Table;
import fitnesse.testsystems.slim.results.SlimTestResult;
import fitnesse.testsystems.slim.tables.DecisionTable;
import fitnesse.testsystems.slim.tables.DynamicDecisionTable;
import fitnesse.testsystems.slim.tables.LibraryTable;
import fitnesse.testsystems.slim.tables.OrderedQueryTable;
import fitnesse.testsystems.slim.tables.QueryTable;
import fitnesse.testsystems.slim.tables.ScenarioTable;
import fitnesse.testsystems.slim.tables.SlimErrorTable;
import fitnesse.testsystems.slim.tables.SlimTable;
import fitnesse.testsystems.slim.tables.SlimTableFactory;
import fitnesse.testsystems.slim.tables.SubsetQueryTable;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.htmlparser.Node;
import org.htmlparser.tags.TableTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.SimpleNodeIterator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SlimTableFactory_ESTest extends SlimTableFactory_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      int int0 = 56;
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      String string0 = "'MbP\\7Rp>p4rSK*~S1";
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Class<ScenarioTable> class0 = ScenarioTable.class;
      Table table0 = null;
      int int0 = 0;
      String string1 = "org.eclipse.jgit.revwalk.filter.RevFilter$AllFilter";
      String string2 = "";
      TableTag tableTag0 = new TableTag();
      int int1 = tableTag0.getChildCount();
      HtmlTable htmlTable0 = null;
      try {
        htmlTable0 = new HtmlTable(tableTag0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.HtmlTable", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      SlimTableFactory slimTableFactory2 = slimTableFactory0.copy();
      String string0 = "aswC+P_Hz5";
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      String string1 = slimTableFactory0.makeTableType(string0);
      SlimTableFactory slimTableFactory3 = slimTableFactory1.copy();
      String string2 = "{[s0i3_4No_";
      String string3 = slimTableFactory0.getFullTableName(string2);
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string1);
      Table table0 = null;
      String string4 = null;
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      SlimTable slimTable0 = slimTableFactory3.newTableForType(class0, table0, string4, slimTestContextImpl0);
      int int0 = 4327;
      // Undeclared exception!
      try { 
        slimTableFactory3.parseDefineTableTypeRow(table0, int0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      Table table0 = null;
      String string0 = "";
      String string1 = slimTableFactory1.makeTableType(string0);
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      String string2 = "ddt:";
      SlimTestContextImpl slimTestContextImpl1 = new SlimTestContextImpl();
      // Undeclared exception!
      try { 
        slimTableFactory1.makeSlimTable(table0, string2, slimTestContextImpl1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      String string0 = "branch: Reset start-point to commit ";
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string0);
      slimTableFactory0.tableTypeArrays = map0;
      String string1 = "ddt:";
      String string2 = slimTableFactory0.getFullTableName(string1);
      String string3 = "processing instruction with no content";
      String string4 = slimTableFactory0.getFullTableName(string0);
      Class<? extends SlimTable> class1 = slimTableFactory0.getTableType(string3);
      String string5 = "pPl&awc";
      String string6 = slimTableFactory0.makeTableType(string5);
      String string7 = slimTableFactory0.makeTableType(string4);
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType(string1, class1);
      } catch(IllegalStateException e) {
         //
         // A table type named 'ddt:' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "@Ta)cO";
      String string1 = slimTableFactory0.getFullTableName(string0);
      SlimTableFactory slimTableFactory2 = slimTableFactory1.copy();
      Class<DecisionTable> class0 = DecisionTable.class;
      Table table0 = null;
      String string2 = null;
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      ScenarioTable scenarioTable0 = slimTestContextImpl0.getScenario(string2);
      slimTestContextImpl0.addScenario(string2, scenarioTable0);
      SlimTable slimTable0 = slimTableFactory2.newTableForType(class0, table0, string2, slimTestContextImpl0);
      // Undeclared exception!
      try { 
        slimTableFactory0.parseDefineTableTypeTable(table0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "7$Hs'dQc";
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string0);
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Table table0 = null;
      int int0 = (-239);
      // Undeclared exception!
      try { 
        slimTableFactory0.parseDefineTableTypeRow(table0, int0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "fOA~rm8_=Tz\"\"";
      String string1 = slimTableFactory0.makeTableType(string0);
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "org.eclipse.jgit.lib.FileMode$1";
      String string1 = "'MbP\\7Rp>p4rSK*~S1";
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string1);
      String string2 = slimTableFactory0.makeTableType(string0);
      Class<ScenarioTable> class1 = ScenarioTable.class;
      Table table0 = null;
      int int0 = 0;
      // Undeclared exception!
      try { 
        slimTableFactory0.parseDefineTableTypeRow(table0, int0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.makeTableType(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "BOUNDARY";
      boolean boolean0 = slimTableFactory0.hasColon(string0);
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "";
      Class<SubsetQueryTable> class0 = SubsetQueryTable.class;
      slimTableFactory0.addTableType(string0, class0);
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "mU9fwPU&WfjT]:";
      String string1 = slimTableFactory0.getFullTableName(string0);
      TableTag tableTag0 = new TableTag();
      HtmlTable htmlTable0 = null;
      try {
        htmlTable0 = new HtmlTable(tableTag0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.HtmlTable", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.hasColon(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      slimTableFactory0.tableTypeArrays = (Map<String, String>) hashtable0;
      String string0 = "cFt|&/v+fye9{";
      boolean boolean0 = slimTableFactory0.hasColon(string0);
      String string1 = "ddt:";
      Class<OrderedQueryTable> class0 = OrderedQueryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType(string1, class0);
      } catch(IllegalStateException e) {
         //
         // A table type named 'ddt:' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "1%fS1YxKrYZD";
      Hashtable<String, Class<SubsetQueryTable>> hashtable0 = new Hashtable<String, Class<SubsetQueryTable>>();
      slimTableFactory0.tableTypes = (Map<String, Class<? extends SlimTable>>) hashtable0;
      Class<SubsetQueryTable> class0 = SubsetQueryTable.class;
      Class<SubsetQueryTable> class1 = hashtable0.put(string0, class0);
      Class<LibraryTable> class2 = LibraryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType(string0, class2);
      } catch(IllegalStateException e) {
         //
         // A table type named '1%fS1YxKrYZD' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      slimTableFactory0.tableTypeArrays = (Map<String, String>) hashtable0;
      boolean boolean0 = hashtable0.remove((Object) slimTableFactory0.tableTypeArrays, (Object) slimTableFactory0);
      String string0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.getTableType(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "mU9fwPU&WfjT]:";
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      slimTableFactory0.tableTypeArrays = (Map<String, String>) hashMap0;
      String string1 = slimTableFactory0.getFullTableName(string0);
      String string2 = slimTableFactory0.getFullTableName(string0);
      TableTag tableTag0 = new TableTag();
      String string3 = slimTableFactory0.makeTableType(string1);
      HtmlTable htmlTable0 = null;
      try {
        htmlTable0 = new HtmlTable(tableTag0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.HtmlTable", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "";
      String string1 = slimTableFactory0.getFullTableName(string0);
      String string2 = null;
      Class<DecisionTable> class0 = DecisionTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType(string2, class0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Table table0 = null;
      String string0 = null;
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      // Undeclared exception!
      try { 
        slimTableFactory0.makeSlimTable(table0, string0, slimTestContextImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      SlimTableFactory slimTableFactory2 = slimTableFactory0.copy();
      Table table0 = null;
      String string0 = "*I->2qULR+S#'&f6";
      SlimTestContext slimTestContext0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.makeSlimTable(table0, string0, slimTestContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Table table0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.parseDefineTableTypeTable(table0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Class<DecisionTable> class0 = DecisionTable.class;
      String string0 = "QTxig@}Kp+";
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      String string1 = "subset query:";
      Class<? extends SlimTable> class1 = slimTableFactory0.getTableType(string1);
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.getFullTableName(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "\"dm6$\">h";
      Map<String, Class<LibraryTable>> map0 = null;
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      slimTableFactory0.tableTypes = map0;
      // Undeclared exception!
      try { 
        slimTableFactory0.copy();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      SlimTableFactory slimTableFactory2 = slimTableFactory0.copy();
      SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
      String string0 = "aswC+P_Hz5";
      String string1 = slimTableFactory0.makeTableType(string0);
      SlimTableFactory slimTableFactory4 = slimTableFactory2.copy();
      String string2 = "{[s0i3_4No_";
      String string3 = slimTableFactory1.getFullTableName(string2);
      Class<? extends SlimTable> class0 = slimTableFactory1.getTableType(string1);
  }
}
