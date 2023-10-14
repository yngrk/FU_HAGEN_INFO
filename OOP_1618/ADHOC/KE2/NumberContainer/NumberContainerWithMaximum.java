package OOP_1618.ADHOC.KE2.NumberContainer;

public class NumberContainerWithMaximum extends NumberContainer {
  private Number maximum;

  public void store(Number number) {
    super.store(number);
    if (maximum == null || number.doubleValue() > maximum.doubleValue()) {
      maximum = number;
    }
  }

  public Number getMaximum() {
    return maximum;
  }
}
