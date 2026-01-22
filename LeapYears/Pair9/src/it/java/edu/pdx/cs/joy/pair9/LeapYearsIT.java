package edu.pdx.cs.joy.pair9;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.Matchers.equalTo;

class LeapYearsIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @ParameterizedTest
  @ValueSource(strings = {"400", "2000", "2008", "2012", "2016"})
  void invokingMainWithValidLeapYearPrintsIsALeapYear(String year) {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, year);
    assertThat(result.getTextWrittenToStandardError(), equalTo(""));
    assertThat(result.getTextWrittenToStandardOut(), containsString(year + " is a leap year"));
  }

  @ParameterizedTest
  @ValueSource(strings = {"1700", "1800", "1900", "2017", "2018", "2019"})
  void invokingMainWithInvalidLeapYearPrintsIsNotALeapYear(String year) {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, year);
    assertThat(result.getTextWrittenToStandardError(), equalTo(""));
    assertThat(result.getTextWrittenToStandardOut(), containsString(year + " is NOT a leap year"));
  }
}


