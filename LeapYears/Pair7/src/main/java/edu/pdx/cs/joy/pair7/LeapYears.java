package edu.pdx.cs.joy.pair7;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public boolean isLeapYear(int year)
  {
    if (year % 400) return true;
    else return false;
  }
}
