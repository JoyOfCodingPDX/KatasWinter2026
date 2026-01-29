package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class DiamondTest
{

  @Disabled
  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void diamondAReturnsA() {
    String input = "A";
    String feedback = new Diamond(input);
    assertThat(feedback, equals(input));
  }
}
