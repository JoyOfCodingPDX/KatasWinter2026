package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isThisYearTheLeapYear(){
    assert(LeapYear.isLeapYear(2026));
  }
}
