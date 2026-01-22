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
  void year2000IsLeapYear() {
    assertEquals(LeapYears.leapYears(2000), "Leap Year");
  }

  @Test
  void year2004isLeapYear(){
    assertEquals(LeapYears.leapYears(2004), "Leap Year");
  }
}


