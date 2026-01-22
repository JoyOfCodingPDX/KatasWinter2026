package edu.pdx.cs.joy.pairs;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest
{

  @Test
  void canInstantiateKataClass() {
    new FizzBuzz();
  }

  @Test
  void fizzBuzzOf1Is1() {
    int number = 1;
    String fizzBuzzResult = "1";
    assertFizzBuzz(number, fizzBuzzResult);
  }

  private static void assertFizzBuzz(int number, String fizzBuzzResult) {
    String one = FizzBuzz.fizzBuzz(number);
    assertThat(one, equalTo(fizzBuzzResult));
  }

  @Test
  void fizzBuzzOf2Is2() {
    assertFizzBuzz(2, "2");
  }

  @Test
  void fizzBuzzOf3IsFizz() {
    assertFizzBuzz(3, "Fizz");
  }

  @Test
  void fizzBuzzOf5IsBuzz() {
    assertFizzBuzz(5, "Buzz");
  }

  @Test
  void fizzBuzzOf15IsFizzBuzz() {
    assertFizzBuzz(15, "FizzBuzz");
  }



}

  @Test
void displaybuss()
  {

  }

