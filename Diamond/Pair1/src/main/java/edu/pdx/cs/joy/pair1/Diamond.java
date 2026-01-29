package edu.pdx.cs.joy.pair1;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  @VisibleForTesting
  public Diamond(String Arg) {
    String input = Arg.toUpperCase();

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