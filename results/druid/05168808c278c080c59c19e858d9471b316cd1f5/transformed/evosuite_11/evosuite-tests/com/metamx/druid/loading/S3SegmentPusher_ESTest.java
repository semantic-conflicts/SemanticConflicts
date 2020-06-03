/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 21:43:20 GMT 2020
 */

package com.metamx.druid.loading;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.URI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class S3SegmentPusher_ESTest extends S3SegmentPusher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Configuration configuration0 = new Configuration();
          URI uRI0 = FileSystem.getDefaultUri(configuration0);
          // EXCEPTION DIFF:
          // The original version did not exhibit this exception:
          //     java.lang.ClassCastException : org.apache.hadoop.fs.LocalFileSystem cannot be cast to org.apache.hadoop.fs.FileSystem
          FileSystem.get(uRI0, configuration0);
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
