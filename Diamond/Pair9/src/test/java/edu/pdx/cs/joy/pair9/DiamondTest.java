package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void letterPrintsPrecedingSpaces() {
    Diamond testDiamond = new Diamond();
    testDiamond.printLine('A');
  }

}


