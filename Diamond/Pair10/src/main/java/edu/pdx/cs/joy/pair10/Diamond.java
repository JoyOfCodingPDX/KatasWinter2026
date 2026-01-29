package edu.pdx.cs.joy.pair10;

import com.google.common.annotations.VisibleForTesting;

import java.util.Arrays;
import java.util.List;

public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: java edu.pdx.cs.joy.pair10.Diamond <letter>");
      System.err.println("Example: java edu.pdx.cs.joy.pair10.Diamond C");
      System.exit(1);
    }

    String raw = args[0].trim().replace("'", "").replace("\"", "");
    if (raw.isEmpty()) {
      System.err.println("Please enter a letter between A and Z");
      System.exit(1);
    }

    char input = Character.toUpperCase(raw.charAt(0));

    if (input < 'A' || input > 'Z') {
      System.err.println("Please enter a letter between A and Z");
      System.exit(1);
    }

    System.out.print(printDiamond(input));
  }
  public static String printDiamond(char letter)
  {
    int n = letter - 'A';
    int totalRows = 2 * n + 1;
    StringBuilder sb = new StringBuilder();

    for (int row = 0; row < totalRows; row++) {
      int i = row <= n ? row : (2 * n - row);
      char ch = (char) ('A' + i);

      int outerSpaces = n - i;
      sb.append(" ".repeat(outerSpaces));

      if (i == 0) {
        sb.append(ch);
      } else {
        int innerSpaces = 2 * i - 1;
        sb.append(ch)
                .append(" ".repeat(innerSpaces))
                .append(ch);
      }

      if (row < totalRows - 1) {
        sb.append("\n");
      }
    }
    return sb.toString();
  }

}

