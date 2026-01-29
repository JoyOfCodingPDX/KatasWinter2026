package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

/*
  @Test
  void canPrintA(){
    assertEquals("A", instantiateDiamond("A"));
  }

  @Test
  void canPrintB(){
    Diamond s = new Diamond();
    String d = s.printDiamond("B");
    assertEquals(" A\nB B\n A", d);
  }
*/
  @Test
  public String instantiateDiamond(char letter){
    Diamond s = new Diamond();
    return s.printDiamond(letter);
  }
/*
  @Test
  void asciiValueasInt(){
    Diamond s = new Diamond();
    int letter = s.asciiValue('A');
    assertEquals(65, letter);
  }
*/
  @Test
  void testLines(){
    assertEquals("9", instantiateDiamond('E'));
  }


}




