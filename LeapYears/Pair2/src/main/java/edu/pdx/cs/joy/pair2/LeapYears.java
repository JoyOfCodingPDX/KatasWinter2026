package edu.pdx.cs.joy.pair2;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {
  public boolean isLeapYear(int year) {
    return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}