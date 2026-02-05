package edu.pdx.cs.joy.pair12;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.StringContains.containsString;

class LagsIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invokingMainWithMissingFileThrowsException() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class, "nonexistent.txt");
    assertThat(result.getTextWrittenToStandardError(), containsString("missing file"));
  }

  @Test
  void invokingMainWithExistingFileWorks() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class, "flightInfo.txt");
    assertThat(result.getTextWrittenToStandardError(), is(emptyString()));
  }

  @Test
  void testMockFileCanBeRead()
  {
    InputStream flight = Flight.class.getResourceAsStream("flightInfo.txt");
    assertThat(flight, not(nullValue()));
  }

}


