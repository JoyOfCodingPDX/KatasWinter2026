package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

import java.util.List;
import java.util.Scanner;

public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static int bestRoute(String[] flights) {
    for (String flight : flights) {
      Scanner scanner = new Scanner(flight);
      String id = scanner.next();
      int start = scanner.nextInt();
      int duration = scanner.nextInt();
      int money = scanner.nextInt();

      int end = start + duration;

    }
    return 18;
  }
}