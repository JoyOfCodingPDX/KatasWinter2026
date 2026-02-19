package edu.pdx.cs.joy.mob3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class RPNCalculatorTest
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void oneOperator() {
    List<Character> expressionElements = new ArrayList<>();

    expressionElements.add('+');

    assertThrows(IllegalArgumentException.class, () -> {RPNCalculator.evaluateExpression(expressionElements)});
  }
}

