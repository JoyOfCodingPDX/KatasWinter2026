package edu.pdx.cs.joy.pair7;

import com.google.common.annotations.VisibleForTesting;

public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {

    String example = "afsdoafdsoafsd adfsh huafs dhadfs ih afsihafsd ";

    if (args.length == 0) {
    System.err.println("Missing command line arguments");
    }

//    String[] collection = new String[]{};

    for (String ticket : args) {
      System.out.println(ticket);
      int[] startTime = new int[args.length / 4];
    }

    return;
  }
}
