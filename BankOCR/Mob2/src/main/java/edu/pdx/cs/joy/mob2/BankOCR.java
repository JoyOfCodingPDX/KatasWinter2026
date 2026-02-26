package edu.pdx.cs.joy.mob2;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {

    public static final String one = "   " +
            "  |" +
            "  |";

    public static final String two = " _ " +
            " _|" +
            "|_ ";

    public static final String thr = " _ " +
            " _|" +
            " _|";

    public static final String fou = "   " +
            "|_|" +
            "  |";

    public static final String fiv = " _ " +
            "|_ " +
            " _|";

    public static final String six = " _ " +
            "|_ " +
            "|_|";

    public static final String sev = " _ " +
            "  |" +
            "  |";

    public static final String eig = " _ " +
            "|_|" +
            "|_|";

    public static final String nin = " _ " +
            "|_|" +
            " _|";

    @VisibleForTesting
    public static void main(String[] args) {
        System.err.println("Missing command line arguments");
    }

    public int parse(String number) {
        return switch (number) {
            case one -> 1;
            case two -> 2;
            case thr -> 3;
            case fou -> 4;
            case fiv -> 5;
            case six -> 6;
            case sev -> 7;
            case eig -> 8;
            case nin -> 9;
            default -> -1;
        };
    }

    public List<Integer> parseAccount(String number) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        return list;
    }
}
