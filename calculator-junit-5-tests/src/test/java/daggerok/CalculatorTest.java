package daggerok;

import daggerok.impl.CalculatorImpl;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

  private final Calculator calculator = new CalculatorImpl();

  @Test
  void testAdd() {
    assertEquals(7L, calculator.plus(2L, 5L), "7 = 2 + 5");
    assertThat("9 = 3 + 6", calculator.plus(3L, 6L), is(9L));
  }

  @Test
  void testDiv() {
    assertEquals(3L, calculator.div(30L, 10L), "3 = 30 / 10");
    assertThat("1 = 4 / 4", calculator.div(4L, 4L), is(1L));
  }

  @Test
  void testDivNegative() {
    assertThrows(IllegalArgumentException.class,
                 () -> calculator.div(3L, 0L),
                 () -> "divide by zero");
  }
}
