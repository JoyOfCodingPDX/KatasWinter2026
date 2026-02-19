package edu.pdx.cs.joy.mob1;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class RPNCalculatorIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invokingMainWithAddArgumentPrintsSuccessfully() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "20 5 +");
    assertThat(result.getTextWrittenToStandardOut(), containsString("25"));
  }
}
