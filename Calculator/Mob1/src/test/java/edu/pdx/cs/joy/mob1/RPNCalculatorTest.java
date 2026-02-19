package edu.pdx.cs.joy.mob1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RPNCalculatorTest
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void canAdd() {
    RPNCalculator calc = new RPNCalculator();
    int num1 = 20;
    int num2 = 5;
    assertEquals(calc.addUp(20,5), 25);
  }

  @Test
  void canSubtract() {
    // Comment here
    RPNCalculator calc = new RPNCalculator();
    int num1 = 20;
    int num2 = 5;
    assertEquals(calc.subtract(num1, num2), 15);
  }
}
