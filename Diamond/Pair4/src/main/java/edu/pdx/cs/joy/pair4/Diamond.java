package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public void cleanDiamonds(char arg){
    int count = arg - 'A';
    int levels = count * 2 + 1;
    char space = ' ';

    for (int i = 0; i <= count; i++){
      for (int j = count; j > i; j--){
          system.out.print(" ");
      }
      system.out.print(arg - count);

      for (int k = 0; k < (i * 2) - 1; k++) {
        system.out.print(space);
      }


      //system.out.print(current_char);
      current_char += 1;
    }
  }

}
