package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    Diamond newPattern = new Diamond();
  }

  @Test
  void LetterCannotBeA(){}

  @Test
  void diamondNeedsTwoOrMoreLetters()
  {
    Diamond letters = new Diamond("A");
    assert(letters, "A");
}
