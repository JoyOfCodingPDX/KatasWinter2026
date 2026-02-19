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
      return (this.start + this.duration) > (other.start);
  }

  public static ArrayList<ArrayList<Lags>> createFlightCombination(ArrayList<Lags> myList) {
    ArrayList<ArrayList<Lags>> flightCombinationList = new ArrayList<ArrayList<Lags>>();
    for(int i = 0; i < myList.size(); i++) {
      for(int j = i + 1; j < myList.size(); j++) {
        if(!myList.get(i).hasConflict(myList.get(j))) {
          ArrayList<Lags> combo = new ArrayList<Lags>();
          combo.add(myList.get(i));
          combo.add(myList.get(j));
          flightCombinationList.add(combo);
        }
      }
    }
    return flightCombinationList;
  }


}