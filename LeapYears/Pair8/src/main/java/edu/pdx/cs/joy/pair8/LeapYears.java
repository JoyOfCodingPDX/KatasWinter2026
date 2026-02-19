package edu.pdx.cs.joy.pair8;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static String leapYears( int year ){
    if (year % 400 == 0) {
      return "Leap Year";
    }else if(year % 4 == 0 && year % 100 != 0){
      return "Leap Year";
    }
    return "Not Leap Year";
  }

  public static String leapYears( int year ){
    if (year % 400 == 0) {
      return "Leap Year";
    }
    return "Not Leap Year";
  }
}
