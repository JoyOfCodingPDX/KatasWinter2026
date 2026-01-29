package edu.pdx.cs.joy.pair10;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void checkUserInputIsValid(String letter) {
    assertThat(letter.length(), is(2));
  }
}


