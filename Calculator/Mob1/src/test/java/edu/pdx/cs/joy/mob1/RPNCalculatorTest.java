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
    int num1 = 20;
    int num2 = 5;
    assertEquals((20 + 5), 25);
  }
}
