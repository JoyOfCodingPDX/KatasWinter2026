package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LagsTest
{

  @Test
  void canInstantiateKataClass() {
    new Lags();
  }

  @Test
  void getEndTimeFromStartTime() {
    int start = 0;
    int duration = 5;

    int end = Lags.getEndTimeFromStartTime(start, duration);

    assertEquals(end, 5);
  }


}
