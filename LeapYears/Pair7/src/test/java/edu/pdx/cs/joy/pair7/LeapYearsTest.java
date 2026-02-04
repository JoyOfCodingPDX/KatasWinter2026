package edu.pdx.cs.joy.pair7;

import org.junit.jupiter.api.Test;

import static edu.pdx.cs.joy.pair7.LeapYears.isLeapYear;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest {

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isQualifyAsLeapYear()
  {
    assertThat(true, equalTo(isLeapYear(400)));
    assertThat(false, equalTo(isLeapYear(401)));
    assertThat(true, equalTo(isLeapYear(4)));
    assertThat(false, equalTo(isLeapYear(5)));
  }
}


