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
    // Base case: only an A
    if (letter == 'A') return "A\n";

    StringBuilder diamond = new StringBuilder();

    createDiamond(diamond, 'A', letter);
    return diamond.toString();
  }

  /*
  'C'
    A
   B
  C
   */
  private void createDiamond(StringBuilder diamond, char currentLetter, char maxLetter) {
    int precedingSpace = (maxLetter - currentLetter);
    diamond.append(" ".repeat(Math.max(0, precedingSpace)));
    diamond.append(currentLetter);
    diamond.append('\n');
    // Base case: reached the max letter
    if (currentLetter == maxLetter) {

      return;
    }
    createDiamond(diamond, currentLetter += 1, maxLetter);
  }
}
