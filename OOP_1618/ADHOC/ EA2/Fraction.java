package OOP_1618.ADHOC.EA2;

class Fraction {
  private int numerator;
  private int denominator;

  public Fraction(int numerator, int denominator) throws IllegalArgumentException {
    if (denominator == 0) {
      throw new IllegalArgumentException();
    }

    this.numerator = numerator;
    this.denominator = denominator;
  }

  public Fraction getProductOfThisAnd(Fraction f) {
    return new Fraction(numerator * f.numerator, denominator * f.denominator);
  }

  public String toString() {
    return numerator + "/" + denominator;
  }
}