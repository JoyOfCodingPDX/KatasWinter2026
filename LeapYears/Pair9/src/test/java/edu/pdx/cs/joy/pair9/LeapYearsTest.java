package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @ParameterizedTest
  @ValueSource(strings = {"1700", "1800", "1900", "2017", "2018", "2019"})
  void isALeapYear(String year) {
    //boolean result = LeapYears.class.isLeapYear();
  }

  @ParameterizedTest
  @ValueSource(strings = {"1700", "1800", "1900", "2017", "2018", "2019"})
  void notALeapYear(String year) {

  }

}


