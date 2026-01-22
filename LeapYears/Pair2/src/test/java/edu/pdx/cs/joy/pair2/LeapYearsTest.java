package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearsTest
{
  LeapYears obj = new LeapYears();
  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isItAYear() {
    assertFalse(obj.isLeapYear(5));
  }

  @Test
  void isItALeapYear() {
    assertEquals(obj.isLeapYear(30), false);
  }

  @Test
  void isLeapYear() {
    assertEquals(obj.isLeapYear(400), true);
  }

  @Test
  void isNotLeapYear() {
    assertFalse(obj.isLeapYear(100));
  }

  @Test
  void isLeapYearMultiple4() {
    assertTrue(obj.isLeapYear(404));
  }

  @Test
  void isNotLeapYearNotDivisible4() {
    assertFalse(obj.isLeapYear(3));
  }
}
