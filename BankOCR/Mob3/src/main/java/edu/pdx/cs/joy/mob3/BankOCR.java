package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {

  static String zero = " _ | ||_|";
  static String one = "     |  |";

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
  public static String parse(String str1, String str2, String str3){

    String toReturn = "";

    //for loop
    for (int i = 0; i < 27; i += 3) {

      String temp = "";
      temp += str1.charAt(i);
      temp += str1.charAt(i+1);
      temp += str1.charAt(i+2);

      temp += str2.charAt(i);
      temp += str2.charAt(i+1);
      temp += str2.charAt(i+2);

      temp += str3.charAt(i);
      temp += str3.charAt(i+1);
      temp += str3.charAt(i+2);

      if (temp.equals(zero)) {
        toReturn += "0";
      } else if (temp.equals(one)) {
        toReturn += "1";
      }
    }

    return toReturn;
  }
}