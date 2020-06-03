/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 21:56:48 GMT 2020
 */

package com.netflix.simianarmy.basic.janitor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.netflix.simianarmy.aws.janitor.VolumeTaggingMonkey;
import com.netflix.simianarmy.basic.janitor.BasicVolumeTaggingMonkeyContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicJanitorMonkeyContext_ESTest extends BasicJanitorMonkeyContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVolumeTaggingMonkeyContext basicVolumeTaggingMonkeyContext0 = new BasicVolumeTaggingMonkeyContext();
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     com.amazonaws.AmazonClientException : Unable to load AWS credentials from any provider in the chain
      VolumeTaggingMonkey volumeTaggingMonkey0 = null;
      try {
        volumeTaggingMonkey0 = new VolumeTaggingMonkey(basicVolumeTaggingMonkeyContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to load AWS credentials from any provider in the chain
         //
         verifyException("com.amazonaws.auth.AWSCredentialsProviderChain", e);
         assertTrue(e.getMessage().equals("Unable to load AWS credentials from any provider in the chain"));   
      }
  }
}
