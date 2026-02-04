package edu.pdx.cs.joy.pair7;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static boolean isLeapYear(int year)
  {
    if (year % 400 == 0) return true;
    if (year % 4 == 0) return true;
    else return false;
  }
}
