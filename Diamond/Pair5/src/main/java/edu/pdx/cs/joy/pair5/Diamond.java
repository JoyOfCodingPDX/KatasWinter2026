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
      int innerSpaces = 1;

      for (int i = letter - 'A'; i >= 0; i--) {
        printSpaces(i);
        System.out.print(ALPHABET.charAt(currentLetter));
        if (currentLetter != 0) {
          printSpaces(innerSpaces);
          innerSpaces+=2;
          System.out.print(ALPHABET.charAt(currentLetter));
        }
        System.out.println();
        currentLetter++;
      }
      currentLetter -=2;
      innerSpaces -=4;
      for (int i = 1; i <= letter - 'A'; i++) {
        printSpaces(i);
        System.out.print(ALPHABET.charAt(currentLetter));
        if (currentLetter != 0) {
          printSpaces(innerSpaces);
          innerSpaces-=2;
          System.out.print(ALPHABET.charAt(currentLetter));
        }
        System.out.println();
        currentLetter--;
      }
    }
  }
}
