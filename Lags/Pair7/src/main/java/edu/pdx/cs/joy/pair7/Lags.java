package edu.pdx.cs.joy.pair7;

import com.google.common.annotations.VisibleForTesting;

public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {

    String example = "afsdoafdsoafsd adfsh huafs dhadfs ih afsihafsd ";

    if (args.length == 0) {
    System.err.println("Missing command line arguments");
    }
    int MAX_LEN = 10;

    String[] flightName = new String[MAX_LEN];
    Integer[] startTime = new Integer[MAX_LEN];
    Integer[] endTime = new Integer[MAX_LEN];
    Integer[] price = new Integer[MAX_LEN];
    Float[] value = new Float[MAX_LEN];

    String[] temp;

//    Integer i = 0;

    for (int i = 0; i < args.length; ++i) {
      System.out.println(args[i]);
      temp = args[i].split(" ");
      flightName[i] = temp[0];
      startTime[i] =  Integer.parseInt(temp[1]);
      endTime[i] = Integer.parseInt(temp[2]);
      price[i] = Integer.parseInt(temp[3]);
      value[i] = flightValue(startTime[i], endTime[i], price[i]);
      ++i;
    }

    return;
  }

  public static float flightValue(Integer startTime, Integer endTime, Integer price) {
    return (float)(price / (endTime - startTime));
  }
}
