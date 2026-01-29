package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }


  @Test
  void canPrintA(){
    Diamond s = new Diamond();
    String s = Diamond.printDiamond();
    assertEquals("A", s)}
}




