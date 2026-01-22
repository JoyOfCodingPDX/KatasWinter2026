package edu.pdx.cs.joy.pair4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  void is100aleapyear() {
    int year = 100;
    boolean expected = false;
    assertThat(year, equalTo(expected));
  }

  private static void assertLeapYear(int year, boolean expected){
    int num = LeapYears.isLeapYear(year);
    assertThat(num, equalTo(expected));
  }

}


