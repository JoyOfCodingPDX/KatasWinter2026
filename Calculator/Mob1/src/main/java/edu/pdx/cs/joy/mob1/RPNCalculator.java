package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    Stack argStack = new Stack<>();
    for (int i = 0; i < args.length; ++i) {
       argStack.push(args[i]);
      switch (arg) {
        case "+":
      }
    }
  }

  public int addUp(int i, int i1) {
    return i + i1;
  }

  public int subtract(int num1, int num2) {
    return num1 - num2;
  }
}