package edu.pdx.cs.joy.pair9;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
    }
  }

  @VisibleForTesting
  public boolean isLeapYear(String year) {
    Integer intYear = Integer.parseInt(year);

    return false;
  }
}
