package edu.pdx.cs.joy.pairs;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class FizzBuzzIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FizzBuzz.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void tenPrintsFirst10FizzBuzz() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FizzBuzz.class, "10");
    assertThat(result.getTextWrittenToStandardOut(),
      containsString(
        "1\n" +
        "2\n" +
        "Fizz\n" +
        "4\n" +
        "Buzz\n" +
        "Fizz\n" +
        "7\n" +
        "8\n" +
        "Fizz\n" +
        "Buzz"));
  }

}
