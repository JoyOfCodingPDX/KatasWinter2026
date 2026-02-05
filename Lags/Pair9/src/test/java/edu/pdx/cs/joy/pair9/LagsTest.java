package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LagsTest
{
  @Test
  void canInstantiateKataClass() {
    Lags flight1 = new Lags("AF514", 0, 5, 10);
  }

  @Test
  void flightHasConflict() {
    Lags flight1 = new Lags("AF514", 0, 5, 10);
    Lags flight2 = new Lags("AF515", 3, 7, 14);
    assertTrue(flight1.hasConflict(flight2));
  }
}


