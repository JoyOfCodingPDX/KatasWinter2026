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

  @Test
  void characterAGivesArrayLengthOne () {
    Diamond diamond = new Diamond();
    assertEquals(1, diamond.getArrayFromChar('A').size());
  }

  @Test
  void characterBGivesArrayLengthThree() {
    Diamond diamond = new Diamond();
    assertEquals(3, diamond.getArrayFromChar('B').size());
  }
}

