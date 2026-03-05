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
    System.err.println("Missing command line arguments");
  }

  public String[][] sweep(String[][] mineField){
    int numberOfRows = mineField.length;
    String[][] result = new String[numberOfRows][];
    for (int i = 0; i < numberOfRows; i++){
      for (int j = 0; j < mineField[i].length; j++){

      }
    }
  }

  public String transmit(String[][] mineField, int row, int col){
    String topLeft;
    String top;
    String topRight;
  }
  /*
  *...
  ....
  ..*.
  *...
   */
}
