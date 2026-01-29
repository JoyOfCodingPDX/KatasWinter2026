package edu.pdx.cs.joy.pair2;

import com.google.common.annotations.VisibleForTesting;
import java.util.Collection;
import java.util.ArrayList;

public class Diamond {

  private final String letter;
  private final Collection<Diamond> pattern = new ArrayList<>();

  //constructor w/o args
  public Diamond()
  {
    this.letter = "";
  }

  //default constructor
  public Diamond(String letter)
  {
    this.letter = letter;
  }

  public String getLetter()
  {
    return this.letter;
  }

  public Collection<Diamond> getPattern() {
    return pattern;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}