package edu.pdx.cs.joy.mob2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

  //private static final Set<String> VALID_OPTIONS = Set.of('+', '-', '/', '*', '^', '%');
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  /**
   *
   * @param s
   * @return result
   */
  public double calculate(String s) {
    String input[] = s.split(" ");
    int num1 = Integer.parseInt(input[0]);
    int num2 = Integer.parseInt(input[1]);

    return num1 + num2;
  }
}