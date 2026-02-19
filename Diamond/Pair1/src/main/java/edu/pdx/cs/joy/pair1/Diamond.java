package edu.pdx.cs.joy.pair1;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  private final String input;

  @VisibleForTesting
  public Diamond(String Arg) {
    input = Arg.toUpperCase();

  }
  @Override
  public String toString() {
    // TODO Implement diamond tool
    // Top half of diamond (recursive)

    // Bottom half of diamond
    for(char alphabet = input.charAt(0); alphabet >= 'A'; alphabet-- ){

    }
    return input;
  }





  @VisibleForTesting
  public static void main(String[] args) {
    if (0 == args.length) {
      System.err.println("Missing command line arguments");
      return;
    }
    else if (1 < args.length) {
      System.err.println("Too many command line arguments");
      return;
    }
    
  }
}