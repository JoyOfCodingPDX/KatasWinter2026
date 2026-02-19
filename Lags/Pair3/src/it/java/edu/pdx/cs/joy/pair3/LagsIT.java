package edu.pdx.cs.joy.pair3;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LagsIT extends InvokeMainTestCase {

  @Disabled
  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void baseCase(){
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class, "AF514 0 5 10", "CO5 3 7 14", "AF515 5 9 7", "BA01 6 9 8");
    assertThat(result.getTextWrittenToStandardOut(), containsString("18"));
  }

  @Disabled
  @Test
  void multipleFLights() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class, "AF514 0 5 10", "CO5 5 7 14", "AF515 5 9 7", "BA01 12 13 8");
    assertThat(result.getTextWrittenToStandardOut(), containsString("32"));

  }


}

