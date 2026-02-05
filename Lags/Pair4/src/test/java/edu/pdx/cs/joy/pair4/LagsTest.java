package edu.pdx.cs.joy.pair4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LagsTest
{

  @Test
  void canInstantiateKataClass() {
    new Lags();
  }

  @Test
  void works() {
    String[] flights = {
            "AF514 0 5 10",
            "CO5 3 7 14",
            "AF515 5 9 7",
            "BA01 6 9 8"
    };

    int result = Lags.bestRoute(flights);
    assertThat(result, equalTo(18));
  }

}
