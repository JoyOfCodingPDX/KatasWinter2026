package edu.pdx.cs.joy.pair7;

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
  void canReadArgsFromCommandLine() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class, "hi");
    assertThat(result.getTextWrittenToStandardOut(), containsString("hi"));
  }

  @Test
  void canAssignTicketFromCommandLine() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class, "PLANE1 0 5 12");


  }

}


