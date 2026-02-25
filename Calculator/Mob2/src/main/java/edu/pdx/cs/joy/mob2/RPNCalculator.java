package edu.pdx.cs.joy.mob2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 * Worked on by: Adan Hernandez, Ed Norris, Kaitlyn Harvey, Shanice Uwase
 */
public class RPNCalculator {

    //private static final Set<String> VALID_OPTIONS = "";
    @VisibleForTesting
    public static void main(String[] args) {
        System.err.println("Missing command line arguments");
    }

    /**
     *
     * @param s
     * @return result
     */
    public double calculate(String s) {
        String input[] = s.split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        String operator = input[2];
        if (isValidOperator(operator)) {
            // TBD
        }
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Unknown operator " + operator);
        }
    }

    public boolean isValidOperator(String op) {
        switch (op) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
        }
        return false;
    }
}