package OOP_1618.EA.KE4.ParametrisierteTypen;

public class MaximumContainer<ET extends Comparable<ET>> {
  ET element;

  public void store(ET element) {
    if (element == null) {
      return;
    }

    if (this.element == null) {
      this.element = element;
      return;
    }

    if (this.element.compareTo(element) < 0) {
      this.element = element;
      return;
    }
  }

  public ET get() {
    return element;
  }
}
