package edu.pdx.cs.joy.mob3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    assertThrows(IllegalArgumentException.class, () -> {RPNCalculator.evaluateExpression(expressionElements);});
  }

  @Test
  void simplePlusSuccess() {
    List<Character> expression = new ArrayList<>();
    expression.add('1');
    expression.add('2');
    expression.add('+');

    assert(RPNCalculator.evaluateExpression(expression) == 3);
  }


  @Test
  void simpleMinusSuccess() {

  }

  @Test
  void simpleTimesSuccess() {

  }

  @Test
  void simpleDivideSuccess() {

  }

  @Test void simpleSqrtSuccess() {

  }
}
