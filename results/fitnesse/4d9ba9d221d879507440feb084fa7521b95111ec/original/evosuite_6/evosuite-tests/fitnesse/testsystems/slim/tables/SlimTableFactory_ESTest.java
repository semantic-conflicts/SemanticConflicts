/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 28 23:16:35 GMT 2020
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
import fitnesse.testsystems.slim.tables.DecisionTable;
import fitnesse.testsystems.slim.tables.ImportTable;
import fitnesse.testsystems.slim.tables.OrderedQueryTable;
import fitnesse.testsystems.slim.tables.QueryTable;
import fitnesse.testsystems.slim.tables.ScenarioTable;
import fitnesse.testsystems.slim.tables.ScriptTable;
import fitnesse.testsystems.slim.tables.SlimErrorTable;
import fitnesse.testsystems.slim.tables.SlimTable;
import fitnesse.testsystems.slim.tables.SlimTableFactory;
import fitnesse.testsystems.slim.tables.SubsetQueryTable;
import java.util.Hashtable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.htmlparser.Text;
import org.htmlparser.tags.LabelTag;
import org.htmlparser.tags.TableTag;
import org.htmlparser.util.NodeList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SlimTableFactory_ESTest extends SlimTableFactory_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "UX4:* +m&\"mVM=";
      Class<ImportTable> class0 = ImportTable.class;
      Table table0 = null;
      String string1 = "comment";
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      String string2 = slimTableFactory0.getFullTableName(string0);
      SlimTable slimTable0 = slimTableFactory0.newTableForType(class0, table0, string1, slimTestContextImpl0);
      String string3 = slimTableFactory1.makeTableType(string1);
      Class<? extends SlimTable> class1 = slimTableFactory1.getTableType(string0);
      String string4 = "5Md.0:~r`Ly\\i6q";
      SlimTable slimTable1 = slimTableFactory1.newTableForType(class1, table0, string1, slimTestContextImpl0);
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Table table0 = null;
      Map<String, String> map0 = slimTableFactory0.tableTypeArrays;
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
  public void test02()  throws Throwable  {
      Table.CellContentSubstitution table_CellContentSubstitution0 = mock(Table.CellContentSubstitution.class, new ViolatedAssumptionAnswer());
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "#)&(3?y-d}2'Ymvt";
      String string1 = slimTableFactory0.getFullTableName(string0);
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      Class<QueryTable> class0 = QueryTable.class;
      String string0 = "hR<|h\\(s]=Jt'=";
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = " o*\"aPH}0)VZ";
      String string1 = slimTableFactory0.makeTableType(string0);
      Table table0 = null;
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      slimTestContextImpl0.incrementErroredTestsCount();
      // Undeclared exception!
      try { 
        slimTableFactory0.makeSlimTable(table0, string1, slimTestContextImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "a=";
      String string1 = slimTableFactory0.getFullTableName(string0);
      Table table0 = null;
      int int0 = 1;
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
  public void test06()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "as";
      Map<String, String> map0 = slimTableFactory0.tableTypeArrays;
      slimTableFactory0.tableTypeArrays = map0;
      String string1 = slimTableFactory0.makeTableType(string0);
      String string2 = "V|;4U!3/D";
      String string3 = slimTableFactory0.makeTableType(string2);
      String string4 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.makeTableType(string4);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "subset query:";
      Class<OrderedQueryTable> class0 = OrderedQueryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory1.addTableType(string0, class0);
      } catch(IllegalStateException e) {
         //
         // A table type named 'subset query:' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      SlimTableFactory slimTableFactory2 = slimTableFactory1.copy();
      String string0 = "org.eclipse.jgit.api.DeleteBranchCommand";
      Class<? extends SlimTable> class0 = slimTableFactory2.getTableType(string0);
      String string1 = null;
      // Undeclared exception!
      try { 
        slimTableFactory1.makeTableType(string1);
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
  public void test10()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "{PPKD2}";
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string0);
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "UX4:* +m&\"mVM=";
      Class<ImportTable> class0 = ImportTable.class;
      Table table0 = null;
      String string1 = "comment";
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      SlimTable slimTable0 = slimTableFactory0.newTableForType(class0, table0, string1, slimTestContextImpl0);
      String string2 = slimTableFactory1.getFullTableName(string0);
      Class<? extends SlimTable> class1 = slimTableFactory1.getTableType(string0);
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Table table0 = null;
      int int0 = 620;
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
  public void test13()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
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
  public void test14()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "?E#c5r,d#]nmPb~";
      Class<SlimErrorTable> class0 = SlimErrorTable.class;
      slimTableFactory0.addTableType(string0, class0);
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "Errors have occurred. We won't tell you where or why. Lazy programmers.";
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string0);
      String string1 = "comment:";
      String string2 = slimTableFactory0.makeTableType(string1);
      boolean boolean0 = slimTableFactory0.hasColon(string1);
      boolean boolean1 = slimTableFactory0.hasColon(string1);
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = null;
      Class<ScriptTable> class0 = ScriptTable.class;
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
  public void test17()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      SlimTableFactory slimTableFactory2 = slimTableFactory0.copy();
      String string0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory2.getFullTableName(string0);
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
      String string0 = null;
      Hashtable<String, Class<OrderedQueryTable>> hashtable0 = new Hashtable<String, Class<OrderedQueryTable>>();
      slimTableFactory0.tableTypes = (Map<String, Class<? extends SlimTable>>) hashtable0;
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
  public void test19()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "subset query:";
      Class<OrderedQueryTable> class0 = OrderedQueryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory1.addTableType(string0, class0);
      } catch(IllegalStateException e) {
         //
         // A table type named 'subset query:' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "subset query:";
      Class<SubsetQueryTable> class0 = SubsetQueryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType(string0, class0);
      } catch(IllegalStateException e) {
         //
         // A table type named 'subset query:' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
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
  public void test22()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Table table0 = null;
      String string0 = "";
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      slimTableFactory0.tableTypeArrays = (Map<String, String>) hashtable0;
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
  public void test23()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Table table0 = null;
      Map<String, String> map0 = slimTableFactory0.tableTypeArrays;
      slimTableFactory0.tableTypeArrays = map0;
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
  public void test24()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = " o*\"aPH}0)VZ";
      String string1 = slimTableFactory0.makeTableType(string0);
      Class<OrderedQueryTable> class0 = OrderedQueryTable.class;
      Table table0 = null;
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      SlimTable slimTable0 = slimTableFactory0.newTableForType(class0, table0, string1, slimTestContextImpl0);
      // Undeclared exception!
      try { 
        slimTableFactory0.makeSlimTable(table0, string1, slimTestContextImpl0);
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
      String string0 = "&bosx#";
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string0);
      String string1 = ",@JI3vI5/V";
      String string2 = "E2/!\\u %_sjeF";
      String string3 = slimTableFactory0.getFullTableName(string2);
      Class<? extends SlimTable> class1 = slimTableFactory0.getTableType(string1);
      String string4 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.hasColon(string4);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Map<String, String> map0 = slimTableFactory0.tableTypeArrays;
      slimTableFactory0.tableTypeArrays = map0;
      String string0 = "org.eclipse.jgit.treewalk.filter.AndTreeFilter";
      String string1 = slimTableFactory0.getFullTableName(string0);
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      TableTag tableTag0 = new TableTag();
      char char0 = '`';
      NodeList nodeList0 = new NodeList();
      boolean boolean0 = false;
      String string2 = nodeList0.toHtml(boolean0);
      tableTag0.setChildren(nodeList0);
      tableTag0.setAttribute(string0, string0, char0);
      HtmlTable htmlTable0 = new HtmlTable(tableTag0);
      int int0 = 1939;
      // Undeclared exception!
      try { 
        slimTableFactory1.parseDefineTableTypeRow(htmlTable0, int0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1939, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 11000)
  public void test27()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "asxL1{^OBF/%rx^)";
      String string1 = slimTableFactory1.makeTableType(string0);
      String string2 = slimTableFactory0.makeTableType(string1);
      String string3 = "fitnesse.testsystems.slim.tables.SlimTableFactory";
      String string4 = slimTableFactory1.makeTableType(string3);
  }

  @Test(timeout = 11000)
  public void test28()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "UX4:* +m&\"mVM=";
      Class<ImportTable> class0 = ImportTable.class;
      Table table0 = null;
      String string1 = "comment";
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      String string2 = slimTableFactory0.getFullTableName(string0);
      SlimTable slimTable0 = slimTableFactory0.newTableForType(class0, table0, string1, slimTestContextImpl0);
      String string3 = slimTableFactory1.getFullTableName(string0);
      Class<? extends SlimTable> class1 = slimTableFactory1.getTableType(string0);
      String string4 = "5Md.0:~r`Ly\\i6q";
      SlimTable slimTable1 = slimTableFactory1.newTableForType(class1, table0, string4, slimTestContextImpl0);
  }

  @Test(timeout = 11000)
  public void test29()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Map<String, String> map0 = null;
      slimTableFactory0.tableTypeArrays = map0;
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
}
