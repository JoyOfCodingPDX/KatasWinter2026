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
    
  }
}

