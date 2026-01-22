package edu.pdx.cs.joy.pair8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

//  @Test
//  void yearReturned() {
//    assertEquals(LeapYears.leapYears(2000), 2000);
//  }

  @Test
  void divisibleBy400IsLeapYear() {
    assertEquals(LeapYears.leapYears(400), "Leap Year");
  }

}


