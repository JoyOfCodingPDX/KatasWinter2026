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

  void isNotLeapYearNegative(){
    assertTrue(obj.isLeapYear(-1));
  }

  void isLeapYearNegative400(){
    assertTrue(obj.isLeapYear(-400));
  }

  @Test
  void is30NotaLeapYear() {
    assertFalse(obj.isLeapYear(30));
  }

  @Test
  void isLeapYear() {
    assertTrue(obj.isLeapYear(400));
  }

  @Test
  void is100NotLeapYear() {
    assertFalse(obj.isLeapYear(100));
  }

  @Test
  void is200NotLeapYear2() {
    assertFalse(obj.isLeapYear(200));
  }

  @Test
  void is404LeapYearMultiple4() {
    assertTrue(obj.isLeapYear(404));
  }

  @Test
  void isNotLeapYearNotDivisible4() {
    assertFalse(obj.isLeapYear(3));
  }
}
