package edu.pdx.cs.joy.pair10;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LagsIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void canReadEmptyFileAndPrintEmptyFileToStdErr(@TempDir File tempDir) throws IOException {
    File tempFile = new File(tempDir, "tempFile.txt");
    tempFile.createNewFile();
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class, tempFile.getAbsolutePath());
    assertThat(result.getTextWrittenToStandardError(), containsString("Empty file provided"));
  }

  @Test
  void canReadNonEmptyFile(@TempDir File tempDir) throws IOException {
    File tempFile = new File(tempDir, "tempFile.txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

    bw.write("AF514 0 5 10");
    tempFile.createNewFile();
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class, tempFile.getAbsolutePath());
  }
}


