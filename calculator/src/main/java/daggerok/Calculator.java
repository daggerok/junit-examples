package daggerok;

public interface Calculator<T> {
  T plus(final T a, final T b);
  T minus(final T a, final T b);
  T mul(final T a, final T b);
  T div(final T a, final T b);
}
