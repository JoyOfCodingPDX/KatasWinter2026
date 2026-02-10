package edu.pdx.cs.joy.pair11;

import com.google.common.annotations.VisibleForTesting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.lang.String.valueOf;


public class Lags {

  public List<List<String>> flights;
  public String maxEff(){
    List<String> flight1  = this.flights.getFirst();
    for(int i = 0; i < this.flights.size(); ++i){
      if (valueOf(flight1.get(3)) <= this.flights.get(i + 1)) {


      }
    }
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
