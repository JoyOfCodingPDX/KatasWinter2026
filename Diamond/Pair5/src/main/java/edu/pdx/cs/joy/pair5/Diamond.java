package edu.pdx.cs.joy.pair5;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

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

      for (int i = letter - 'A'; i > 0; i--) {
        printSpaces(i);
        System.out.println(letter);
      }
    }
//    System.out.println('C' - 'A');
//    System.out.println('C' - 3);

    /*
    [spaces]A
    [spaces][Letter][spaces][Letter]

    C
    2A
    1B
    0C
    1B
    2A
     */
  }
}
