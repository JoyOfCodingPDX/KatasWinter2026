package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public Character[][] createGrid(int row, int column) {
    Character[][] grid = new Character[row][column];
    for (int i = 0; i < row; ++i) {
      for (int j = 0; j < column; ++j) {
        grid[i][j] = '0';
      }
    }
    return grid;
  }

  public Character[][] showHint(int row, int column, Character[][] grid){

    Character[][] resultGrid = createGrid(row,column);

    return resultGrid;



  }

  public Character[][] insertAndUpdateMine(int row, int column, Character[][] grid){

    for (int i = 0; i < row; ++i) {
      for (int j = 0; j < column; ++j) {
        //parse line by line
      }
    }
    return grid;
  }
}
