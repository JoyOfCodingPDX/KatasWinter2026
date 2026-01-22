package edu.pdx.cs.joy.pair1;

import com.google.common.annotations.VisibleForTesting;

public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {




    System.err.println("Missing command line arguments");
  }

  public static void isLeapYear(int number){
    if(number %400 == 0 || (number % 100 == 0 && number % 400 != 0) || number % 4 == 0) {
      print("Leap Year");
    }
    else{
      print("Not a Leap Year");
    }
  }
