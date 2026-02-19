package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

  @VisibleForTesting
  public static void main(String[] args) {
//    System.err.println("Missing command line arguments");

    // Create new string[] and copy args into it then echo it out
    String[] newArgs = new String[args.length];
    for (int i = 0; i < args.length; i++) {
      newArgs[i] = args[i];
      System.out.print(newArgs[i]);
    }
  }
}