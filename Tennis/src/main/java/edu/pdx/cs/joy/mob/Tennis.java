package edu.pdx.cs.joy.mob;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Tennis {
  private final String name1;
  private final String name2;

  public Tennis(String name1, String name2) {
    this.name1 = name1;
    this.name2 = name2;
  }

  public String getPlayerOne() {
    return name1;
  }

  public String getPlayerTwo() {
    return name2;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}