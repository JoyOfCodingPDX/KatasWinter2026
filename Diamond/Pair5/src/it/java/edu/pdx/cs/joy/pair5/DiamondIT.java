package edu.pdx.cs.joy.pair5;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class DiamondIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invokingMainWithAPrintsAnA() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "A");
    assertThat(result.getTextWrittenToStandardOut(), containsString("A"));
  }
//
//  @Test
//  void invokingMainWithBPrintsFirstTwoLines() {
//    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "B");
//    assertThat(result.getTextWrittenToStandardOut(), containsString(" A\nB B"));
//  }
//
//  @Test
//  void invokingMainWithDPrintsTopHalf() {
//    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "D");
//    assertThat(result.getTextWrittenToStandardOut(), containsString("   A\n  B B\n C   C\nD     D\n"));
//  }

  @Test
  void invokingMainWithDPrintsDiamond() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "D");
    assertThat(result.getTextWrittenToStandardOut(), containsString("   A\n  B B\n C   C\nD     D\n"));
  }


}


