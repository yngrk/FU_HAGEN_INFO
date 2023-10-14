package OOP_1618.ADHOC.EA2.MaxWeightContainer;

public class MaxWeightContainer {
  private Weighable heaviest;

  public void store(Weighable element) {
    if (heaviest == null || heaviest.getWeight() < element.getWeight()) {
      heaviest = element;
    }
  }

  public Weighable getHeaviest() {
    return heaviest;
  }
}
