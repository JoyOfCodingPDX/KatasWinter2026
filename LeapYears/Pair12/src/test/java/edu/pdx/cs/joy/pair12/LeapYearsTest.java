package edu.pdx.cs.joy.pair12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest
{
  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isThisYearTheLeapYear(){
    assertEquals(false, LeapYears.isLeapYear(2026));
  }
}
