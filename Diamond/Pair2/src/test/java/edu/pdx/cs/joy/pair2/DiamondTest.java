package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class DiamondTest {

  @Test
  void canInstantiateKataClass() {
    Diamond newPattern = new Diamond();
  }


  @Test
  void firstLetterHasToBeA()
  {
    Diamond diamond = new Diamond("A");
    assertThat(diamond.getLetter(), "A");
  }

}


 /*
  @Test
  void diamondNeedsTwoOrMoreLetters()
  {
    Diamond letter = new Diamond("A");
    assert(letter, "A");

 */
