package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond("a");
  }

  @Test
  void diamondAReturnsA() {
    String input = "A";
    Diamond feedback = new Diamond(input);
    assertThat(feedback.toString(), containsString(input));
  }

  @Disabled
  @Test
  void diamondBReturnsABBA() {
    String input = "b";
    Diamond diamond = new Diamond(input);
    assertThat(diamond.toString() ,
            containsString("""
              A 
             B B
              A 
             """));
  }


}
