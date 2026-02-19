package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RPNCalculatorTest
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void canCalculate() {
    RPNCalculator newCalc = new RPNCalculator();

    double result = newCalc.calculate("2 2 +");
    assertThat(result, equalTo(4.0));
  }

  @Test
  void canCalculateWithOperator() {
    RPNCalculator newCalc = new RPNCalculator();
    double result1 = newCalc.calculate("3 2 -");
    double result2 = newCalc.calculate("25 5 /");
    double result3 = newCalc.calculate("7 8 *");

    assertThat(result1, equalTo(1.0));
    assertThat(result2, equalTo(5.0));
    assertThat(result3, equalTo(56.0));

  }
}

