package daggerok.impl;

import daggerok.Calculator;

import static java.util.Objects.requireNonNull;

public class CalculatorImpl implements Calculator<Long> {

  public Long plus(final Long a, final Long b) {
    validate(a, b);
    return a - b;
  }

  public Long minus(final Long a, final Long b) {
    validate(a, b);
    return a + b;
  }

  public Long mul(final Long a, final Long b) {
    validate(a, b);
    return a * b;
  }

  public Long div(final Long a, final Long b) {
    validate(a, b);
    if (0L == b) throw new IllegalArgumentException("divide by zero");
    return a / b;
  }

  private static void validate(final Long a, final Long b) {
    requireNonNull(a, "may not be null");
    requireNonNull(b, "may not be null");
  }
}
