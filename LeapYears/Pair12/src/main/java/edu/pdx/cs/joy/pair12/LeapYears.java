package edu.pdx.cs.joy.pair12;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {


    System.err.println("Missing command line arguments");
  }

  public static boolean isLeapYear(int number) {
    if (number % 400 == 0 || (number % 100 == 0 && number % 400 != 0) || number % 4 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
