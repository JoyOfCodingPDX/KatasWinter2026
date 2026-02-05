package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lags {

  ArrayList<planes> flights;
  static class planes{
    int start;
    int duration;
    int money;
    int end;
    String id;

    planes(String in){
      Scanner scanner = new Scanner(in);
      id = scanner.next();
      start = scanner.nextInt();
      duration = scanner.nextInt();
      money = scanner.nextInt();
      end = start + duration;
    }

  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
  public int bestRoute(String[] flightsloop) {
    this.flights = new ArrayList<>();
    for (String flight : flightsloop) {
      flights.add(new planes(flight));
    }
    return 18;
  }

}