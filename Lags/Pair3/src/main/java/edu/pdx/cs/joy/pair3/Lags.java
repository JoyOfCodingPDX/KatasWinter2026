package edu.pdx.cs.joy.pair3;

import com.google.common.annotations.VisibleForTesting;

public class Lags {



  @VisibleForTesting
  public static void main(String[] args) {
//    System.err.println("Missing command line arguments");
      int max = 0;
      for (int i = 0; i < args.length; i++){
        String flight1 = args[i];
        String parts[] = flight1.split(" ");
        int end = Integer.parseInt(parts[2]);
        int price1 = Integer.parseInt(parts[3]);

        for (int j = i + 1; j < args.length; j++){
          String flight2 = args[j];
          String parts2[] = flight1.split(" ");
          int end = Integer.parseInt(parts[2]);
          int price1 = Integer.parseInt(parts[3]);



        }
      }
  }

  /*
  AF514 0 5 10
  CO5 3 7 14
  AF515 5 9 7
  BA01 6 9 8
   */
}
