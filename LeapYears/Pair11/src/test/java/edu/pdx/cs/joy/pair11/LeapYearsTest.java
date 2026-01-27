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



  private static void assertLeapYear(int number, boolean leapYearResult){
    boolean one = LeapYears.leapYear(number);
    assertThat(one, equalTo(leapYearResult));
  }

  @Test
  void TestFour(){
    assertLeapYear(4, true);
  }

  @Test
  void Testmodhundred(){
    assertLeapYear(100, false);
  }
}




