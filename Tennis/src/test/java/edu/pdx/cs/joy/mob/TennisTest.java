package edu.pdx.cs.joy.mob;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TennisTest
{

  @Test
  void canInstantiateKataClass() {
    new Tennis();
  }

  @Test
  void canNameInitPlayersTest(){
    Tennis tennis = new Tennis("Name1", "Name2");
    String player1 = tennis.getPlayerOne();
    assertThat(player1, containsString("Name1"));
  }
}
