package edu.pdx.cs.joy.mob3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }

  @Test
  void create2x2Array() {
    Minesweeper minesweeper = new Minesweeper();
    Character[][] expected = {{'0', '0'}, {'0', '0'}};

    Character[][] grid = minesweeper.createGrid(2, 2);
    System.err.println(Arrays.deepToString(grid));
    assertEquals(Arrays.deepToString(grid), Arrays.deepToString(expected));
  }

  @Test
  void noBombs() {
    Minesweeper minesweeper = new Minesweeper();

    Character[][] testEmpty = {{'.', '.'}, {'.', '.'}};
    Character[][] testEmptyZeroes = {{'0', '0'}, {'0', '0'}};

    assertThat(minesweeper.showHint(2,2, testEmpty), equalTo(testEmptyZeroes));

  }

  @Test
  void yesBombs() {
    Minesweeper minesweeper = new Minesweeper();

    Character[][] testEmpty = {{'.', '*'}, {'.', '.'}};
    Character[][] testEmptyZeroes = {{'1', '*'}, {'1', '1'}};

    assertThat(minesweeper.showHint(2,2, testEmpty), equalTo(testEmptyZeroes));

  }



}

