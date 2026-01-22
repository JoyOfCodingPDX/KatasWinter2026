package edu.pdx.cs.joy.pair10;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void yearDivisible400IsLeap(){
    assert(LeapYears.isLeapYear(400));
  }

  @Test
  void yearDivisible100NotLeap() {
    assert(LeapYears.isLeapYear(100) == false);
  }

  @Test
  void is2008LeapIsTrue() {
    assert(LeapYears.isLeapYear(2008) == true);
  }

  @Test
  void is2012LeapIsTrue() {
    assert(LeapYears.isLeapYear(2012) == true);
  }

}