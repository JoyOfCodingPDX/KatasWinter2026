package edu.pdx.cs.joy.pair10;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {


    System.err.println("Missing command line arguments");
  }

  @VisibleForTesting
  public static boolean isLeapYear(int year) {
    if ((year % 400) == 0) {
      return true;
    } else if (((year % 4) == 0) && ((year % 100) != 0) ){
      return true;
    } else {
      return false;
    }
  }













}
