package edu.pdx.cs.joy.pair7;

import org.junit.jupiter.api.Test;

public class LagsTest
{

  @Test
  void canInstantiateKataClass() {
    new Lags();
  }

  @Test
  void canCalculateFlightValue() {
    Lags lags = new Lags();
    float value = lags.flightValue(0, 5, 10);
    assert(value == 2.0f);
  }
}
