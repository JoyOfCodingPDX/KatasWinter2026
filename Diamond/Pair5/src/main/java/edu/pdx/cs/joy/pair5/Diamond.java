package edu.pdx.cs.joy.pair5;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
    } else {
      System.out.println();
    }
    System.out.println('C' - 'A');
    System.out.println('C' - 3);

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
