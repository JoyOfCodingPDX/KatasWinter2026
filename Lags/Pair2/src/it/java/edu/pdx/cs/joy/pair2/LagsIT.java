package edu.pdx.cs.joy.pair2;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LagsIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void is1Argument() {
    String [] args = {"arg"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class, args);

    assertThat(result.getTextWrittenToStandardError(), containsString(""));
  }

  @Test
  void is1Argument_has2Args() {
    String [] args = {"arg", "arg2"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class, args);

    assertThat(result.getTextWrittenToStandardError(), containsString("Error: Should only have 1 argument"));
  }
}
