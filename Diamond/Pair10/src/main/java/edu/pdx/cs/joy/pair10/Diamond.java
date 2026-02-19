package edu.pdx.cs.joy.pair10;

import com.google.common.annotations.VisibleForTesting;

import java.util.Arrays;
import java.util.List;

public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    List<String> argsList = Arrays.asList(args);
    String[] storeDiamondShape = new String[]{};
    if (argsList.size() != 3) {
      return;
    }
    else {
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
          if ((i == 0 || i == 4) && j == 2) {
            System.out.print("A");
          } else if ((i == 1 || i == 3) && (j == 1 || j == 3)) {
            System.out.print("B");
          } else if (i == 2 && (j == 0 || j == 4)) {
            System.out.print("C");
          } else {
            System.out.print(" ");
          }
        }
      }
    }
  }
}
