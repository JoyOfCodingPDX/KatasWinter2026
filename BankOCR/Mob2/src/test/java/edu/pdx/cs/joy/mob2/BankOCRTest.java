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
  void canParseZeroThroughNine() {
    BankOCR bankOCR = new BankOCR();

    int parsedOne = bankOCR.parse(BankOCR.one);
    int parsedTwo = bankOCR.parse(BankOCR.two);
    int parsedThree = bankOCR.parse(BankOCR.thr);
    int parsedFour = bankOCR.parse(BankOCR.fou);
    int parsedFive = bankOCR.parse(BankOCR.fiv);
    int parsedSix = bankOCR.parse(BankOCR.six);
    int parsedSeven = bankOCR.parse(BankOCR.sev);
    int parsedEight = bankOCR.parse(BankOCR.eig);
    int parsedNine = bankOCR.parse(BankOCR.nin);

    assertThat(parsedOne, equalTo(1));
    assertThat(parsedTwo, equalTo(2));
    assertThat(parsedThree, equalTo(3));
    assertThat(parsedFour, equalTo(4));
    assertThat(parsedFive, equalTo(5));
    assertThat(parsedSix, equalTo(6));
    assertThat(parsedSeven, equalTo(7));
    assertThat(parsedEight, equalTo(8));
    assertThat(parsedNine, equalTo(9));
  }

//  @Test
//  void canParseNumberTwo() {
//    BankOCR bankOCR = new
//  }

}
