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
    int ticketCount = args.length;

    String[] flightName = new String[MAX_LEN];
    Integer[] startTime = new Integer[MAX_LEN];
    Integer[] endTime = new Integer[MAX_LEN];
    Integer[] price = new Integer[MAX_LEN];
    Float[] value = new Float[MAX_LEN];

    String[] temp;
    Integer latestTime = 0;

    for (int i = 0; i < ticketCount; ++i) {
      System.out.println(args[i]);
      temp = args[i].split(" ");
      flightName[i] = temp[0];
      startTime[i] =  Integer.parseInt(temp[1]);
      endTime[i] = Integer.parseInt(temp[2]);
      if (latestTime < endTime[i]) {
        latestTime = endTime[i];
      }
      price[i] = Integer.parseInt(temp[3]);
      value[i] = flightValue(startTime[i], endTime[i], price[i]);
    }

    float tempValue = 0;

    for (int j = 0; j < ticketCount; ++j) {

      if (endTime[j] == latestTime) {
//        if
      }


    }

  }


  public static float flightValue(Integer startTime, Integer endTime, Integer price) {
    return (float)(price / (endTime - startTime));
  }
}
