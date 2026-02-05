package edu.pdx.cs.joy.pair9;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;

public class Lags {
  public String name;
  public int start;
  public int duration;
  public int profit;
  public Lags(String name, int start, int duration, int profit) {
    this.name = name;
    this.start = start;
    this.duration = duration;
    this.profit = profit;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public Boolean hasConflict(Lags other) {
    if((this.start + this.duration) > (other.start)) {
      return true;
    }
    return false;
  }

  public static ArrayList<ArrayList<Lags>> createFlightCombination(ArrayList<Lags> myList) {
    ArrayList<ArrayList<Lags>> flightCombinationList = new ArrayList<ArrayList<Lags>>();
    for(int i = 0; i < myList.size(); i++) {
    }
    return flightCombinationList;
  }
}