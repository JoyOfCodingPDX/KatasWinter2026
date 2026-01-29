package edu.pdx.cs.joy.pair11;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  public String printDiamond(char letter){
    char start = 'A';
    int distance = ((int) letter - (int) start) + 1;
    int lines = (distance * 2) - 1;
    for(int i = 0; i < distance; i++){
      System.out.println(letter);
    }
    return
  }

  public int asciiValue(char letter){
    return (int) letter;
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