package edu.pdx.cs.joy.pair3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
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
    assertEquals(1, diamond.buildRow('A').size());
  }

  @Test
  void characterBGivesArrayLengthThree() {
    Diamond diamond = new Diamond();
    assertEquals(3, diamond.buildRow('B').size());
  }

  @Test
  void middleArrayEqualsA() {
    Diamond diamond = new Diamond();
    String result= diamond.getMiddleRow();
    assertEquals('A', result.charAt(0));
  }

  @Test
  void canGetDiamondStringSimple() {
    Diamond diamond = new Diamond();
    String result = diamond.diamondString('A');
    assertThat(result, containsString("A"));
  }

  @Test
  void canGetDiamondStringC() {
    Diamond diamond = new Diamond();
    String result = diamond.diamondString('A');
    assertThat(result, containsString("A"));
    assertThat(result, containsString("B B"));
    assertThat(result, containsString("C   C"));
  }
}

