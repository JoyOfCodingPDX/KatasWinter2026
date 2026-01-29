package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    cleanDiamonds('B');
    //System.err.println("Missing command line arguments");
  }

  public static void cleanDiamonds(char arg){
    int count = arg - 'A';
    int levels = count * 2 + 1;
    char space = ' ';

    for (int i = 0; i <= count; i++){
      for (int j = count; j > i; j--){
          System.out.print(" ");
      }
      System.out.print(arg - count + i);

      for (int k = 0; k < (i * 2) - 1; k++) {
        System.out.print(space);
      }

      if (i > 0){
        System.out.print(arg - count + i);
      }
      //system.out.print(current_char);
      //current_char += 1;
    }
  }

}
