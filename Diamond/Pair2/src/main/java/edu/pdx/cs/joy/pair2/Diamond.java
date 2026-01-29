package edu.pdx.cs.joy.pair2;

import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;

public class Diamond {

  private final String letter;
  private final ArrayList<>();

  //constructor w/o args
  public Diamond()
  {
    this.letters = "";
  }

  //default constructor
  public Diamond(String letter)
  {
    this.letter = letter;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}