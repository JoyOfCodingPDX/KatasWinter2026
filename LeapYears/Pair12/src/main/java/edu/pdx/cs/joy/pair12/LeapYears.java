package edu.pdx.cs.joy.pair12;
//Alexander Novitchkov-Burbank
//Molly Diaz
//son phan

import com.google.common.annotations.VisibleForTesting;

import java.util.Arrays;
import java.util.List;

public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    List<String> argnew = Arrays.stream(args).toList();

    for (String s : argnew){
      if(isLeapYear(Integer.parseInt(s))){
        System.out.println("leap");
      } else {
        System.out.println("no leap");
      }
    }

    System.err.println("Missing command line arguments");
  }

  public static boolean isLeapYear(int number) {
    if (number % 400 == 0 || (number % 100 == 0 && number % 400 != 0) || number % 4 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
