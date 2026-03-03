package edu.pdx.cs.joy.mob4;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class RPNCalculatorIT extends InvokeMainTestCase {

  @Disabled
  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Disabled
  @Test
  void echoesOutArgsFromMain() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "1", "3", "+");
    assertThat(result.getTextWrittenToStandardOut(), containsString("13+"));
  }

  @Disabled
  @Test
  void onePlusThreeIsFour() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "1", "3", "+");
    assertThat(result.getTextWrittenToStandardOut(), containsString("4"));
  }
}

