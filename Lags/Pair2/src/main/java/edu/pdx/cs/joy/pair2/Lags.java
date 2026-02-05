package edu.pdx.cs.joy.pair2;

import com.google.common.annotations.VisibleForTesting;

public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  

  public static int getEndTimeFromStartTime(int start, int duration) {
    return start + duration;
  }

}