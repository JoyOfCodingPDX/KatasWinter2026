package edu.pdx.cs.joy.pair11;

import com.google.common.annotations.VisibleForTesting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;



public class Lags {

  public List<List<String>> flights;
  public String maxEff(){
    return this.flights.getFirst().get(0);
  }

  public Lags(){
    this.flights =  new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList("AF514", "0", "5", "10")),
            new ArrayList<>(Arrays.asList("C05", "3", "7", "14")),
            new ArrayList<>(Arrays.asList("AF515", "5", "9", "7")),
            new ArrayList<>(Arrays.asList("BA01", "6","9", "8"))
    ));
  }

  @VisibleForTesting
  public static void main(String[] args) {System.err.println("Missing command line arguments");}

}
