package edu.pdx.cs.joy.pair7;

import com.google.common.annotations.VisibleForTesting;

public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {

    String example = "afsdoafdsoafsd adfsh huafs dhadfs ih afsihafsd ";

    if (args.length == 0) {
    System.err.println("Missing command line arguments");
    }

    String[] flightName = new String[9]{};
    Integer[] startTime = new Integer[9]{};
    Integer[] endTime = new Integer[9]{};
    Integer[] price = new Integer[9]{};

    String[] temp = new String[4]{};

    Integer i = 0;

    while (i < args.length) {
      System.out.println(args[i]);
      temp = args[i].split(" ");
      flightName[i] = temp[0];
      startTime[i] =  Integer.parseInt(temp[1]);
      endTime[i] = Integer.parseInt(temp[2]);
      price[i] = Integer.parseInt(temp[3]);
    }


    return;
  }
}
