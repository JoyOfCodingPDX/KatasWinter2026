package edu.pdx.cs.joy.pair7;

import org.junit.jupiter.api.Test;

public class LeapYearsTest {

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isQualifyAsLeapYear()
  {
    assertThat(true, isLeapYear(400));
    assertThat(false, isLeapYear(401));
    assertThat(true, isLeapYear(4));
    assertThat(false, isLeapYear(5));
  }
}


