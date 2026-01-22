package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void canCallIsLeapYear() {
    new LeapYears().isLeapYear(3);
  }

  private static void assertLeapYear(int year, boolean result) {
    boolean one = LeapYears.isLeapYear(year);
    assertThat(one, equalTo(result));
  }

  @Test
  void isLeapYearTestone(){
    assertLeapYear(2400, true);
  }

  @Test
  void isLeapYearTestTwo(){
    assertLeapYear(1700, false);
  }

  @Test
  void isLeapYearTestThree(){
    assertLeapYear(2008, true);
  }

  @Test
  void isLeapYearTestFour(){
    assertLeapYear(2017, false);
  }
}


