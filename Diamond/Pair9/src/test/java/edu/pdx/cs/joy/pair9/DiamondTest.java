package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void printAReturnsAOnly() {
    Diamond testDiamond = new Diamond();
    String result = testDiamond.createDiamond('A');
    assertThat(result, equalTo("A\n"));
  }

  @Test
  void letterPrintsPrecedingSpaces() {
    Diamond testDiamond = new Diamond();
    String result = testDiamond.createDiamond('C');
    assertThat(result, containsString("  A"));
    assertThat(result, containsString(" B"));
    assertThat(result, containsString("C"));
  }

}


