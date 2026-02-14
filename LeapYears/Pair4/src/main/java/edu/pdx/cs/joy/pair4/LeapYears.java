package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }


  // Return value of 1 == true
  // Any other value == false
  public static int isLeapYear(int year) {
    if (year % 400 == 0) {
      return 1;
    } else if (year % 100 != 0 && year % 4 == 0) {
      return 1;
    }
    return 0;
  }

}
