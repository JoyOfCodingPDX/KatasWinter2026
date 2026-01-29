package edu.pdx.cs.joy.pair3;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;

public class Diamond {
  private ArrayList<Character> letterList = new ArrayList<Character>();

  public ArrayList<Character> getArrayFromChar(char letter) {
    int length = (int) letter;
    length = (length - 65)*2 + 1;
    for(int i = 0; i < length; i++) {
      letterList.add(' ');
    }
    return letterList;
  }

  public String getMiddleRow () {
    return "A";
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}
