package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {

  public String zero = " _ | ||_|";
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");


  }
  public static String parse(String str1, String str2, String str3){
    String result = str1 + str2 + str3;


    return result;
  }
}