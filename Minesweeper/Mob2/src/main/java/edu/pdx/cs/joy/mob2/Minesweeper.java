package edu.pdx.cs.joy.mob2;

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
//    System.err.println("Missing command line arguments")
    int rows = 0;
    int cols = 0;

    // TODO Parsing these guys is proving to be an error
    try {
      rows = Integer.parseInt(args[0]);
      cols = Integer.parseInt(args[1]);
    } catch (Exception ex) {
      System.err.println("Parse error");
      return;
    }
    StringBuilder sb = new StringBuilder();

    System.out.println("Number of args: " + args.length);

    // For each row n
    for (int i = 0; i < rows; ++i) {
      // Create col m of dashes
      for (int j = 0; j < cols; ++j) {
        sb.append("-");
      }
      sb.append('\n');
    }
    System.out.println(sb);
  }
}
