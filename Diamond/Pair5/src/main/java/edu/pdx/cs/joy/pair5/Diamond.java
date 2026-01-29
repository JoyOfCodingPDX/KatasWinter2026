package edu.pdx.cs.joy.pair5;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  private final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  private static void printSpaces(int spaces){
    for (int i = 0; i < spaces; i++){
      System.out.print(" ");
    }
  }
  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
    } else {
      char letter = args[0].charAt(0);
      int currentLetter = 0;

      for (int i = letter - 'A'; i >= 0; i--) {
        printSpaces(i);
        System.out.print(ALPHABET.charAt(currentLetter));
        if (currentLetter != 0) {
          printSpaces(i);
          System.out.print(ALPHABET.charAt(currentLetter));
        }
        System.out.println();
        currentLetter++;
      }
    }
//    System.out.println('C' - 'A');
//    System.out.println('C' - 3);

    /*
    [spaces]A
    [spaces][Letter][spaces][Letter]


    2A
    1B
    0C
    1B
    2A
     */
  }
}
