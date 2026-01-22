package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isItAYear() {
    LeapYears objectLeapYears = new LeapYears();
    assertEquals(objectLeapYears.isLeapYear(5), false);
  }

  @Test
  void isItALeapYear() {
    LeapYears objectLeapYears = new LeapYears();
    assertEquals(objectLeapYears.isLeapYear(30), false);
  }

  @Test
  void isLeapYear() {
    LeapYears obj = new LeapYears();
    assertEquals(obj.isLeapYear(400), true);
  }

  @Test
  void isNotLeapYear(){
  }
}
