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

  public static int maxProfit(Lags[] flight_list) {
    int j = flight_list.length;
    int[] dp = new int[j];
    dp[0] = flight_list[0].price;
    for (int i = 1; i < j; i++) {
      int skip = dp[i - 1];
      int take = flight_list[i].price;

      for (int n = i - 1; n >= 0; n--) {
        if (flight_list[n].end <= flight_list[i].start) {
          //latest = j;
          //min = Math.min(min, flight_list[i].start);
          take += dp[n];
          break;
        }
      }
      dp[i] = Math.max(skip, take);
  }
    return dp[j - 1];
}