package daggerok;

import daggerok.impl.CalculatorImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  private final Calculator calculator = new CalculatorImpl();

  @Rule public ExpectedException exception = ExpectedException.none();

  @Test
  public void testAdd() {
    assertEquals("7 = 2 + 5", 7L, calculator.plus(2L, 5L));
    assertThat("9 = 3 + 6", calculator.plus(3L, 6L), is(9L));
  }

  @Test
  public void testDiv() {
    assertEquals("3 = 30 / 10", 3L, calculator.plus(30L, 10L));
    assertThat("1 = 4 / 4", calculator.div(4L, 4L), is(1L));
  }

  @Test
  public void testDivNegative() {
    exception.expect(IllegalArgumentException.class);
    exception.expectMessage("divide by zero");
    calculator.div(3L, 0L);
  }
}
