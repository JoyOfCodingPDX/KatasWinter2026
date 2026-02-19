package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

import java.util.Objects;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

  @VisibleForTesting
  public static void main(String[] args) {
//    System.err.println("Missing command line arguments");

    int a,b,c,i = 0;
    // Create new string[] and copy args into it then echo it out
    String[] newArgs = new String[args.length];
    for (i = 0; i < args.length; i++) {
      newArgs[i] = args[i];
      //System.out.print(newArgs[i]);
    }
    i = 0;
    while(i < newArgs.length){
      if (Objects.equals(newArgs[i], "+")){
        a = i;
        while (Integer.)
      }
    }
  }
}