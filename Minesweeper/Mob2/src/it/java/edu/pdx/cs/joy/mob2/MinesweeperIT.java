package edu.pdx.cs.joy.mob2;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class MinesweeperIT extends InvokeMainTestCase {

  @Disabled
  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Minesweeper.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void echoesOutFieldShape() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Minesweeper.class, "3", "3");
    assertThat(result.getTextWrittenToStandardOut(), containsString("""
            ---
            ---
            ---"""));
  }

  @Test
  void echoInput() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Minesweeper.class, "3", "5",
            "..*..\n" +
            "*....\n" +
            ".....");
    assertThat(result.getTextWrittenToStandardOut(), containsString("..*..\n" +
            "*....\n" +
            "....."));
  }

}

