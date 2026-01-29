package edu.pdx.cs.joy.pair12;

import com.google.common.annotations.VisibleForTesting;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Diamond {

  public static void printDiamond(List<Character> alphabet, char input){
    int char_as_ascii = (int) input;
    for(int i = 66; i <= char_as_ascii; i++)
    {
      printline();
    }
  }

  public static void printline(int num_space, int outer_space, char letter) {
    int i = 0;
    if (letter == 'A')
    {
      while (i < num_space) {
        System.out.println(" ");
        i++;
      }

      System.out.println(letter);
    }
    else {
      while (i < num_space) {
        System.out.println(" ");
        i++;
      }

      System.out.println(letter);

      i = 0;
      while (i < outer_space) {
        System.out.println(" ");
        i++;
      }

      System.out.println(letter);
    }
  }

  @VisibleForTesting
  public static void main(String[] args) {
    List<Character> alphabet = new ArrayList<>();
    for (int i = 65; i <= 90; i++) {
      alphabet.add((char) i);
    }
    System.out.println(alphabet);
  }
}
