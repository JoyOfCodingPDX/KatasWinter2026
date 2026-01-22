package edu.pdx.cs.joy.pair11;

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
  private static void assertLeapYear(int number, String leapYearResult){
    String one = LeapYears.leapYear(number);
    assertThat(one, equalTo(leapYearResult));

  }

}




