package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  static final Object[][] testCases = {
      {0, "FizzBuzz"},
      {4, "4"},
      {6, "Fizz"},
      {1, "Buzz"},
      {15, "FizzBuzz"},
      {101, "101"}
  };

  @Test
  void getFizzBuzz() {
    for (Object[] testCase : testCases) {
      int value = (Integer) testCase[0];
      String expected = (String) testCase[1];
      String actual = FizzBuzz.getFizzBuzz(value);
      assertEquals(expected, actual);
    }
  }

}