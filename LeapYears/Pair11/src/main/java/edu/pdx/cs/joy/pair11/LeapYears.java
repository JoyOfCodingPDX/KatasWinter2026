package edu.pdx.cs.joy.pair11;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static boolean LeapYear(int num) {
      return num % 4 == 0;
  }

}