package edu.pdx.cs.joy.pair5;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {

  public static Boolean isLeap(int year){
    if((year % 400) == 0)
      return true;
    else if (((year % 4) ==0) && ((year % 100) != 0))
    return true;
      else
    return false;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");

  }
}