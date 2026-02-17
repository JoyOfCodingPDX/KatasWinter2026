package edu.pdx.cs.joy.mob;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class TennisTest
{
  @Test
  void canNameInitPlayersTest(){
    Tennis tennis = new Tennis("Name1", "Name2");
    String player1 = tennis.getPlayerOne();
    assertThat(player1, containsString("Name1"));
    String player2 = tennis.getPlayerTwo();
    assertThat(player2, containsString("Name2"));
  }

  @Test
  void scoreOfLoveLove() {
    Tennis tennis = new Tennis("Name1", "Name2");
    String score = tennis.getScore();
    assertThat(score, equalTo("Love-Love"));
  }

  @Test
  void playerOneScoresPointUpdatesScore() {
    Tennis tennis = new Tennis("Name1", "Name2");
    tennis.playerOneScores();
    String score = tennis.getScore();
    assertThat(score, equalTo("15-Love"));
  }

}
