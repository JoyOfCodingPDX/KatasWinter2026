package edu.pdx.cs.joy.mob1;

import org.junit.jupiter.api.Test;

public class RPNCalculatorTest
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void canAdd(){
    int num1 = 20;
    int num2 = 5;
    assertEquals(add(20,5), 25);
  }
}
