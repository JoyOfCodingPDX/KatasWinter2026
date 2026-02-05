package edu.pdx.cs.joy.pair12;

import com.google.common.annotations.VisibleForTesting;

import java.io.File;

public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {
    if(args.length == 0)
    {
      System.err.println("Missing command line arguments");
    }
    else
    {
      File f = new File(args[0]);
      if(!f.exists())
      {
        System.err.println("missing file");
      }
    }

  }
}
