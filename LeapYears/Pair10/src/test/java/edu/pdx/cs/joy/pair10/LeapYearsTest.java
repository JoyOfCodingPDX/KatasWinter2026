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
    assert(isLeapYear(400) == True);
  }

}


