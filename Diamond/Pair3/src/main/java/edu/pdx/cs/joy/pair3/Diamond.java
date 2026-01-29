package edu.pdx.cs.joy.pair3;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;

public class Diamond {
  private ArrayList<Character> letterList = new ArrayList<Character>();

  public ArrayList<Character> buildRow(char letter) {
    int length = (int) letter;
    length = (length - 65)*2 + 1;
    for(int i = 0; i < length; i++) {
      letterList.add(' ');
    }
    return letterList;
  }

  private void modifyRow(Character letter) {
  }

  public String getMiddleRow () {
    return "A";
  }

  public String diamondString(Character letter) {
    ArrayList<Character> list = buildRow(letter); // array of length
    StringBuilder result = new StringBuilder();
    list.set(list.size() / 2, letter);
    for (int i = 0; i <= list.size() / 2; i++) {
      result.append((list.get(i)).toString());
    }
    return result.toString();
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}
