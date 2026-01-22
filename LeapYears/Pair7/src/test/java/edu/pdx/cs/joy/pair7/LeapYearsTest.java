package edu.pdx.cs.joy.pair7;

import org.junit.jupiter.api.Test;

public class LeapYearsTest {

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isdivisibleby400()
  {
    assertThat(400, isLeapYear())
  }
}


