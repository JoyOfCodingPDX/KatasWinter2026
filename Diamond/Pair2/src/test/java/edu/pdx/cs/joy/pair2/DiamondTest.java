package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import java.util.Collection;

public class DiamondTest {

  @Test
  void canInstantiateKataClass() {
    Diamond newPattern = new Diamond();
  }


  @Test
  void firstLetterHasToBeA()
  {
    Diamond diamond = new Diamond("A");
    assertThat(diamond.getLetter(), equalTo("A"));
  }

  @Test
  void verifyBuildPattern()
  {
    //Diamond diamond = new Diamond("C");
    Collection<String> pattern = new ArrayList<>();
    pattern.add("A B C");
    assertThat(pattern.size(), equalTo(3));
  }
}


/*
  @Test
  void diamondNeedsTwoOrMoreLetters()
  {
    Diamond letter = new Diamond("A");
    assert(letter, "A");

 */
