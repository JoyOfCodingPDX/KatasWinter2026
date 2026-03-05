package edu.pdx.cs.joy.mob1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }

  @Test
  void sweepBasicMinefield() {

    Minesweeper minesweeper = new Minesweeper();

    String[][] minefield = {{"*", ".", ".", "."}, {".", ".", ".", "."}, {".", "*", ".", "."}, {".", ".", ".", "."}};
    String[][] result = minesweeper.sweep(minefield);

    assertThat(result[0][0], is("*"));
  }
}

