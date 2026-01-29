package edu.pdx.cs.joy.pair4;

import org.junit.jupiter.api.Disabled;
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
  void is100aLeapYear() {
    int year = 100;
    int expected = 0;
    int result = LeapYears.isLeapYear(year);
    assertThat(result, equalTo(expected));
  }

  @Disabled
  @Test
  void is400aleapyear() {
    int year = 400;
    int expected = 1;
    int result = LeapYears.isLeapYear(year);
    assertThat(result, equalTo(expected));
  }

  private static void assertLeapYear(int year, boolean expected){
    int num = LeapYears.isLeapYear(year);
    int expectedInt = expected ? 1 : 0;
    assertThat(num, equalTo(expectedInt));
  }
}

