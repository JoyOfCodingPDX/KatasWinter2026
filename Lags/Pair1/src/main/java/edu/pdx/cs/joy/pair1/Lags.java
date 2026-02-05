package edu.pdx.cs.joy.pair1;

import com.google.common.annotations.VisibleForTesting;

public class Lags {
  String flight_id;
  int start;
  int end;
  int price;

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  Lags(String flight_id, int start, int end, int price) {
    this.flight_id = flight_id;
    this.start = start;
    this.end = end;
    this.price = price;
  }

  public static double maxProfit(Lags[] flight_list) {
    double maxProfit = 0.0;
    int min = flight_list[0].start;
    for (int i = 0; i < flight_list.length; i++) {
      min = Math.min(min, flight_list[i].start);
    }
  }
}