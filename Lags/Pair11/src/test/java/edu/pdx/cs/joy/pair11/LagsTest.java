package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class LagsTest
{

  @Test
  void canInstantiateKataClass() {
    new Lags();
  }

  @Test
  void isValidList(){
    Lags Flights = new Lags();
    String flightOne = Flights.maxEff();

    assertThat(flightOne, containsString("AF514"));
  }
}




