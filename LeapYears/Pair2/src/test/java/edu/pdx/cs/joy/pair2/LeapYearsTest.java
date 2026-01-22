package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears(5);
  }

  @Test
  void isItAYear() {
    LeapYears objectLeapYears = new LeapYears(5);
    assertEquals(objectLeapYears.yearsToCalculate.getClass(), Integer.class);
  }

  @Test
  void isItALeapYear() {
    LeapYears objectLeapYears = new LeapYears(30);
    assertEquals(objectLeapYears.isLeapYear(objectLeapYears), false);
  }
}
