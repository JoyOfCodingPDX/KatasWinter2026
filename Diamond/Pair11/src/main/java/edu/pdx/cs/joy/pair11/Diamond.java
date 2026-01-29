package edu.pdx.cs.joy.pair11;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  public String printDiamond(){
    return "A";
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

}


/*
   A
  B
 C
D
 C
  B
   A
 */