package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BankOCRTest
{

  Map<String, String> numberMap = Map.of(
      "one", ""
  );


  @Test
  void canInstantiateKataClass() {
    new BankOCR();
  }

  @Test
  void canParseOneNumber() {
    BankOCR bankOCR = new BankOCR();

    int parsedOne = bankOCR.parse(BankOCR.one);

    assertThat(parsedOne, equalTo(1));
  }

}
