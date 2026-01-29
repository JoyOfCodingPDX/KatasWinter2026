package edu.pdx.cs.joy.pair2;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  private final String letters;

  public Diamond()
  {
    this.letters = "";
  }
  public Diamond(String letters)
  {
    this.letters = letters;
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}