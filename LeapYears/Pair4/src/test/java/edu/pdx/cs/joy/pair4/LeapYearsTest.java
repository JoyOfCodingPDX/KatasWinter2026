package edu.pdx.cs.joy.pair4;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
<<<<<<< HEAD

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

=======
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
>>>>>>> 24ee2af0b8d3099b1eb9d737bd0ebc9fe307fc3a
public class LeapYearsTest
{
  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

<<<<<<< HEAD
  void is100aLeapYear() {
    int year = 100;
    boolean expected = false;
    assertThat(year, equalTo(expected));
  }

  private static void assertLeapYear(int year, boolean expected){
    int num = LeapYears.isLeapYear(year);
    assertThat(num, equalTo(expected));
  }

}
=======
  @Test
  void is100aleapyear() {
    int year = 100;
    int expected = 0;
    assertThat(LeapYears.isLeapYear(year), equalTo(expected));  // Is that right?
  }
>>>>>>> 24ee2af0b8d3099b1eb9d737bd0ebc9fe307fc3a

  @Disabled
  @Test
  void is400aleapyear() {
    int year = 400;
    int expected = 1;
    assertThat(year, equalTo(expected));
  }

  private static void assertLeapYear(int year, boolean expected){
    int num = LeapYears.isLeapYear(year);
    assertThat(num, equalTo(expected));
  }
}