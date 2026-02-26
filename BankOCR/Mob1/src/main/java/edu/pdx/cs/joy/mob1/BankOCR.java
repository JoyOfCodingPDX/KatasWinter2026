package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

import java.io.BufferedReader;
import java.io.Reader;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {


  private static final Reader reader;

  public BankOCR(Reader reader){
    this.reader = reader;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    if(args.length == 1){
      System.out.println(args[0]);
      BufferedReader br = new BufferedReader(reader);
      try {
        String line1 = br.readLine();
        String line2 = br.readLine();
        String line3 = br.readLine();
        String line4 = br.readLine();

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
      } catch (Exception ex) {
        System.err.println("Error while reading from file: " + ex.getMessage());
        return;
      }

    }
    else {
      System.err.println("Invalid command line arguments");
    }

    //System.err.println("Missing command line arguments");
  }



}