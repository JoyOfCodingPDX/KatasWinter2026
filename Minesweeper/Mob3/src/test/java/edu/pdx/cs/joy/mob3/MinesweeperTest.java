package edu.pdx.cs.joy.mob3;

import org.junit.jupiter.api.Test;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }

  @Test
  void create2x2Array() {
    Minesweeper minesweeper = new Minesweeper();

    Character[][] grid = minesweeper.createGrid(2, 2);

  }

}

