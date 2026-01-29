package edu.pdx.cs.joy.pair12;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  public static void printline(int num_space, int outer_space, char letter)
  {
    int i = 0;
    while(i < num_space)
    {
      System.out.println(" ");
      i++;
    }

    System.out.println(letter);

    i = 0;
    while(i < outer_space)
    {
      System.out.println(" ");
    }
  }

  @VisibleForTesting
  public static void main(String[] args) {
    List<char> alphabet = Arrays.aslist();
    for (int i = 65; i < 90; i++)
    {
        alphabet.add((char) i);
    }
    System.out.println(alphabet);
}
