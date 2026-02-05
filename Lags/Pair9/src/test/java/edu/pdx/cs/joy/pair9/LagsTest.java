package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
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

  @Test
  void flightNoConflict() {
    Lags flight1 = new Lags("AF514", 0, 3, 10);
    Lags flight2 = new Lags("AF515", 3, 7, 14);
    assertFalse(flight1.hasConflict(flight2));
  }

  @Test
  void canCreateCombinationListOfNonConflictingFlights() {
    Lags flight1 = new Lags("AF514", 0, 3, 10);
    Lags flight2 = new Lags("C05", 3, 7, 14);
    Lags flight3 = new Lags("AF515", 5, 9, 7);
    Lags flight4 = new Lags("BA01", 6, 9, 8);
    ArrayList<ArrayList<Lags>> flightComboList = new ArrayList<ArrayList<Lags>>();
    flightComboList = Lags.createFlightCombination(flightComboList);
  }
}


