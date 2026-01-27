package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Disabled
  //The AI summary lied to us -_- 1000 is not a leap year -SH
  @ParameterizedTest
  @ValueSource(strings = {"400", "1000", "2000", "2008", "2012", "2016"})
  void isALeapYear(String year) {
    LeapYears newLeapYear = new LeapYears();
    boolean result = newLeapYear.isLeapYear(year);
    assertThat(result, equalTo(true));
  }

  @ParameterizedTest
  @ValueSource(strings = {"1700", "1800", "1900", "2017", "2018", "2019"})
  void notALeapYear(String year) {
    LeapYears newLeapYear = new LeapYears();
    boolean result = newLeapYear.isLeapYear(year);
    assertThat(result, equalTo(false));
  }

}


