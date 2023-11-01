package OOP_1618.ADHOC.KE3.Klassifikation_und_Subtyping;

class PostalItem implements Weighable {
  private double weight;

  PostalItem(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }
}
