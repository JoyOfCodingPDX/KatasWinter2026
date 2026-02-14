package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      return;
    }
    cleanDiamonds('D');
  }

  public static void cleanDiamonds(char arg){
    int count = arg - 'A';
    int levels = count * 2 + 1;

    for (int i = 0; i <= count; i++){
      for (int j = count; j > i; j--){
          System.out.print(" ");
      }
      System.out.print((char) (arg - count + i));

      for (int k = 0; k < (i * 2) - 1; k++) {
        System.out.print(" ");
      }

      if (i > 0){
        System.out.print((char) (arg - count + i));
      }
      System.out.println();
    }

    for (int i = 0; i < count; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }

      System.out.print((char)(arg - i - 1));

      for (int k = 0; k < 2 * (count - i) - 3; k++){
        System.out.print(" ");
      }

      if (i < count - 1){
        System.out.print((char) (arg - i - 1));
      }

      System.out.println();
    }
  }

}
