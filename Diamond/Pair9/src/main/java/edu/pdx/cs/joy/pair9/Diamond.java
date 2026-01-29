package edu.pdx.cs.joy.pair9;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  @VisibleForTesting
  public String createDiamond(char letter)
  {
    if (letter == 'A') return "A\n";
    StringBuilder diamond = new StringBuilder();
    createDiamond(diamond, letter, letter);
    return diamond.toString();
  }

  /*
  'C'
    A
   B
  C
   */
  private void createDiamond(StringBuilder diamond, char currentLetter, char maxLetter) {

  }
}
