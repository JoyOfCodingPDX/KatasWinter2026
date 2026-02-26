package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

import java.util.List;
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
  }

  public static int evaluateExpression(List<Character> expressionElements) throws IllegalArgumentException {
    int result = 0;
    Stack<Integer> stack = new Stack<>();
    for (Character op : expressionElements) {

    }

    throw new IllegalArgumentException();
  }
  public boolean canTellIfOp() {
    return false;
  }
}

