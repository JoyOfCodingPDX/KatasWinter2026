package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Test;

public class DiamondTest
{

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
