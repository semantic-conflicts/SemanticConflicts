/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 05:51:32 GMT 2020
 */

package fitnesse.testsystems.slim.tables;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fitnesse.testsystems.ExecutionResult;
import fitnesse.testsystems.TestResult;
import fitnesse.testsystems.slim.HtmlTable;
import fitnesse.testsystems.slim.SlimTestContextImpl;
import fitnesse.testsystems.slim.Table;
import fitnesse.testsystems.slim.results.SlimTestResult;
import fitnesse.testsystems.slim.tables.DecisionTable;
import fitnesse.testsystems.slim.tables.ImportTable;
import fitnesse.testsystems.slim.tables.LibraryTable;
import fitnesse.testsystems.slim.tables.OrderedQueryTable;
import fitnesse.testsystems.slim.tables.QueryTable;
import fitnesse.testsystems.slim.tables.ScenarioTable;
import fitnesse.testsystems.slim.tables.ScriptTable;
import fitnesse.testsystems.slim.tables.SlimAssertion;
import fitnesse.testsystems.slim.tables.SlimTable;
import fitnesse.testsystems.slim.tables.SlimTableFactory;
import fitnesse.testsystems.slim.tables.SubsetQueryTable;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.htmlparser.tags.TableTag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SlimTableFactory_ESTest extends SlimTableFactory_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
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
  public void test01()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "A01JHfy- 7e}j_IS";
      String string1 = slimTableFactory1.makeTableType(string0);
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string0);
      Table table0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory1.parseDefineTableTypeTable(table0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Table table0 = null;
      String string0 = "";
      String string1 = "Qq";
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      ScenarioTable scenarioTable0 = null;
      try {
        scenarioTable0 = new ScenarioTable(table0, string1, slimTestContextImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.ScenarioTable", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      Class<DecisionTable> class0 = DecisionTable.class;
      Table table0 = null;
      String string0 = "";
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      SlimTable slimTable0 = slimTableFactory1.newTableForType(class0, table0, string0, slimTestContextImpl0);
      String string1 = "import";
      String string2 = slimTableFactory1.getFullTableName(string1);
      String string3 = "";
      String string4 = slimTableFactory0.getFullTableName(string3);
      SlimTableFactory slimTableFactory2 = slimTableFactory1.copy();
      slimTableFactory0.tableTypes = slimTableFactory1.tableTypes;
      String string5 = "Y2gG[QvzRD";
      slimTableFactory2.tableTypeArrays = slimTableFactory0.tableTypeArrays;
      slimTableFactory0.tableTypeArrays = slimTableFactory1.tableTypeArrays;
      Class<OrderedQueryTable> class1 = OrderedQueryTable.class;
      slimTableFactory2.addTableType(string5, class1);
      int int0 = 56;
      // Undeclared exception!
      try { 
        slimTableFactory1.parseDefineTableTypeRow(table0, int0);
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
  public void test05()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = ":";
      String string1 = slimTableFactory0.makeTableType(string0);
      Class<LibraryTable> class0 = LibraryTable.class;
      slimTableFactory0.addTableType(string1, class0);
      SlimTableFactory slimTableFactory2 = slimTableFactory0.copy();
      String string2 = "d<6>";
      String string3 = slimTableFactory0.getFullTableName(string2);
      String string4 = "SOFT";
      String string5 = slimTableFactory2.getFullTableName(string4);
      boolean boolean0 = slimTableFactory2.hasColon(string0);
      Table table0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory1.parseDefineTableTypeTable(table0);
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
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "";
      Class<LibraryTable> class0 = LibraryTable.class;
      slimTableFactory1.addTableType(string0, class0);
      String string1 = slimTableFactory0.getFullTableName(string0);
      Class<? extends SlimTable> class1 = slimTableFactory1.getTableType(string0);
      // Undeclared exception!
      try { 
        slimTableFactory1.addTableType(string1, class0);
      } catch(IllegalStateException e) {
         //
         // A table type named '' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
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
  public void test08()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = null;
      Table table0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory1.parseDefineTableTypeTable(table0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "Wv_`Ftb";
      String string1 = slimTableFactory0.makeTableType(string0);
      Table table0 = null;
      int int0 = (-1);
      HashMap<String, Class<QueryTable>> hashMap0 = new HashMap<String, Class<QueryTable>>();
      slimTableFactory0.tableTypes = (Map<String, Class<? extends SlimTable>>) hashMap0;
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      slimTableFactory0.tableTypeArrays = (Map<String, String>) hashMap1;
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
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      slimTableFactory0.tableTypeArrays = slimTableFactory1.tableTypeArrays;
      String string0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory1.hasColon(string0);
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
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
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
  public void test12()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "HISTOGRAM";
      String string1 = slimTableFactory0.makeTableType(string0);
      String string2 = "Fm7[B|1?&fWy>";
      String string3 = slimTableFactory0.getFullTableName(string2);
      String string4 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.getTableType(string4);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "LOK2L9oHU _5CaU";
      Map<String, Class<SubsetQueryTable>> map0 = null;
      slimTableFactory0.tableTypes = map0;
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      String string1 = hashtable0.put(string0, string0);
      String string2 = "mH3aM-dRcn*Atg";
      String string3 = "stopped-sha";
      String string4 = hashtable0.put(string3, string2);
      String string5 = slimTableFactory0.getFullTableName(string2);
      slimTableFactory0.tableTypeArrays = (Map<String, String>) hashtable0;
      boolean boolean0 = slimTableFactory0.hasColon(string0);
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
  public void test14()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = null;
      Class<ImportTable> class0 = ImportTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType(string0, class0);
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
  public void test16()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      Hashtable<String, Class<ScriptTable>> hashtable0 = new Hashtable<String, Class<ScriptTable>>();
      String string0 = "org.eclipse.jgit.storage.dfs.ReadAheadTask$BlockFuture";
      Class<? extends SlimTable> class0 = slimTableFactory1.getTableType(string0);
      slimTableFactory1.tableTypes = (Map<String, Class<? extends SlimTable>>) hashtable0;
      String string1 = "";
      Class<ScriptTable> class1 = ScriptTable.class;
      Class<ScriptTable> class2 = hashtable0.put(string1, class1);
      String string2 = "]Z}P(X3|tDK}";
      Class<ScriptTable> class3 = ScriptTable.class;
      Table table0 = null;
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      ScenarioTable scenarioTable0 = slimTestContextImpl0.getScenario(string2);
      slimTestContextImpl0.addScenario(string2, scenarioTable0);
      // Undeclared exception!
      try { 
        slimTableFactory1.makeSlimTable(table0, string2, slimTestContextImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "";
      SlimTableFactory slimTableFactory2 = slimTableFactory1.copy();
      String string1 = "comment:";
      String string2 = slimTableFactory1.makeTableType(string1);
      String string3 = slimTableFactory0.getFullTableName(string0);
      String string4 = "";
      SlimTableFactory slimTableFactory3 = slimTableFactory2.copy();
      Class<? extends SlimTable> class0 = slimTableFactory1.getTableType(string4);
      slimTableFactory0.addTableType(string3, class0);
      String string5 = slimTableFactory2.getFullTableName(string1);
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
  public void test18()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "ordered query:";
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string0);
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
}