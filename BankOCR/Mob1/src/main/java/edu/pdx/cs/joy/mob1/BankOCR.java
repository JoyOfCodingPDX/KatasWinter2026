package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {


  private final Reader reader;
  public TextParser(Reader reader){
    this.reader = reader;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    if(args.length == 1){
      System.out.println(args[0]);
      BufferedReader br = new BufferedReader(this.reader);
      String line1 = br.readline();
      String line2 = br.readline();
      String line3 = br.readline();
      String line4 = br.readline();
    }else{
      System.err.println("Invalid command line arguments");
    }

    //System.err.println("Missing command line arguments");
  }



}