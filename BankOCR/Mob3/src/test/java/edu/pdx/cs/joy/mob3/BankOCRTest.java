package edu.pdx.cs.joy.mob3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankOCRTest
{

  @Test
  void canInstantiateKataClass() {
    new BankOCR();
  }

  @Test
  void canParseAll0s() {
    BankOCR bankOCR = new BankOCR();

    String result = bankOCR.parse(" _  _  _  _  _  _  _  _  _ ",
                                  "| || || || || || || || || |",
                                  "|_||_||_||_||_||_||_||_||_|");

    assertEquals("000000000", result);
  }



}
