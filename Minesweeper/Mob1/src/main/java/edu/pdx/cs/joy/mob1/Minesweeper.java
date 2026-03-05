package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

  public Minesweeper() {

  }

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length < 3) {
      System.err.println("Missing command line arguments");
    }

  }

  public String[][] sweep(String[][] mineField){
    int numberOfRows = mineField.length;
    String[][] result = new String[numberOfRows][];
    for (int i = 0; i < numberOfRows; i++){
      for (int j = 0; j < mineField[i].length; j++){
        if (mineField[i][j].equals("*")){
          result[i][j] = "*";
        }
        else {
          String transResult = transmit(mineField, i, j);
          result[i][j] = transResult;
        }
      }
    }
    return result;
  }

  public String transmit(String[][] mineField, int row, int col){
    int countMines = 0;
    int numRows = mineField.length;
    int numCols = mineField[0].length;
    for (int i = -1; i <= 1; i++){
      if (row + i < 0 || row + i >= numRows) continue;
      for (int j = -1; j <= 1; j++){
        if (col + j < 0 || col + j >= numCols) continue;;
        if (mineField[row + i][col + j].equals("*")){
          ++countMines;
        }
      }
    }
    return String.valueOf(countMines);
  }
  /*
  *...
  ....
  ..*.
  *...
   */
}
