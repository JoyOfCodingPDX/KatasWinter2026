package edu.pdx.cs.joy.pair1;
import com.google.common.annotations.VisibleForTesting;
public class Diamond {
  private final String input;
  @VisibleForTesting
  public Diamond(String Arg) {
    input = Arg.toUpperCase();
  }
  @Override
  public String toString() {
    return diamondize();
  }
  public String diamondize() {
    String temp = "";
    char toValue = input.charAt(0);
    int interior = 0;
    for (char alphabet = toValue; alphabet >= 'A'; alphabet-- ){
      StringBuilder sb = new StringBuilder();
      sb.append(alphabet);
    }
    return input;
  }
  @VisibleForTesting
  public static void main(String[] args) {
    if (0 == args.length) {
      System.err.println("Missing command line arguments");
      return;
    }
    else if (1 < args.length) {
      System.err.println("Too many command line arguments");
      return;
    }
  }
}
