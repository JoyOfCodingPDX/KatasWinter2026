package edu.pdx.cs.joy.pair8;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }



  @Test
  void isModOfFour() {
    int num = 4;
    assertLeapYear(num, true);
  }

}


