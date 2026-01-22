package edu.pdx.cs.joy.pairs;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class FizzBuzz {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static String fizzBuzz(int number) {
    if (number % 3 == 0) {
      return "Fizz";
    } else if (number % 5 == 0) {
      return "Buzz";
    }
    else {
      return String.valueOf(number);
    }

    /*
    if (number == 1) {
      return "1";
    } else if (number == 2) {
      return "2";
    } else {
      return "Fizz";
    }

     */
  }
}