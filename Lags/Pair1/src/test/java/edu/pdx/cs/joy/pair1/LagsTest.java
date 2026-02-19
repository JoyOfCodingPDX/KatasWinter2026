package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LagsTest
{
  @Test
  void takeOrSkipOneFlight() {
    Lags flight1 = new Lags("AF514", 0, 5, 10);
    Lags[] flights = new Lags[1];
    flights[0] = flight1;
    assertEquals(10, Lags.maxProfit(flights));
  }
}
