package edu.pdx.cs.joy.mob2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {

  public static String one = "   " +
          "  |" +
          "  |";

  public static String two = " _ " +
          " _|" +
          "|_ ";

  public static String thr = " _ " +
          " _|" +
          " _|";

  public static String fou = "   " +
          "|_|" +
          "  |";

  public static String fiv = " _ " +
          "|_ " +
          " _|";

  public static String six = " _ " +
          "|_ " +
          "|_|";

  public static String sev = " _ " +
          "  |" +
          "  |";

  public static String eig = " _ " +
          "|_|" +
          "|_|";

  public static String nin = " _ " +
          "|_|" +
          " _|";
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public int parse(String number) {
    if (number.equals(one)) {
      return 1;
    }
    return 0;
  }
}
