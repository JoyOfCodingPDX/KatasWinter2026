package edu.pdx.cs.joy.pair3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  void DiamondMadeAnArray() {
    Diamond diamond = new Diamond();
    assertEquals(ArrayList.class, diamond.getArray().getClass());
  }

  void characterAGivesArrayLengthOne () {
    Diamond diamond = new Diamond();
  }
}

