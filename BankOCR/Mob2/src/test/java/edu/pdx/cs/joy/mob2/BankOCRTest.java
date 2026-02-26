package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
  }

}
