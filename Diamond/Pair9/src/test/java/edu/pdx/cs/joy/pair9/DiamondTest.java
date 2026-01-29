package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void letterPrintsPrecedingSpaces() {
    Diamond testDiamond = new Diamond();
    String result = testDiamond.printDiamond('C');
    assertThat(result, containsString("  A"));
    assertThat(result, containsString(" B"));
    assertThat(result, containsString("C"));
  }

}


