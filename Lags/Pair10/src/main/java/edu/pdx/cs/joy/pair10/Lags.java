package edu.pdx.cs.joy.pair10;

import com.google.common.annotations.VisibleForTesting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {
    String line = "";
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      return;
    }

      try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
      line = br.readLine();
      if  (line == null) {
        System.err.println("Empty file provided");
      }
      while ((line = br.readLine()) != null){
        //empty
      }
    } catch (IOException e) {
      System.err.println(e.getMessage());
      throw new RuntimeException(e);
    }
  }
}
