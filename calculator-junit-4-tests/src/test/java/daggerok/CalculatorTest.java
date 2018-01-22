package daggerok;

import daggerok.impl.CalculatorImpl;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  public final Calculator calculator = new CalculatorImpl();

  @Test
  public void testAdd() {
    assertEquals("7 = 2 + 5", 7L, calculator.plus(2L, 5L));
    assertThat("9 = 3 + 6", calculator.plus(3L, 6L), is(9L));
  }
}
