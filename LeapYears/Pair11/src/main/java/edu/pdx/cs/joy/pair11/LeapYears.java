package edu.pdx.cs.joy.pair11;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static boolean leapYear(int num) {
    if(num % 4 == 0 && num % 100 == 0)
      return false;
    else if(num % 4 == 0)
      return true;
    else
      return true;
  }

}