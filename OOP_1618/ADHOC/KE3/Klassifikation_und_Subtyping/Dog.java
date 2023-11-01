package OOP_1618.ADHOC.KE3.Klassifikation_und_Subtyping;

class Dog implements Weighable {
  private String name;
  private double weight;

  Dog(double weight, String name) {
    this.weight = weight;
    this.name = name;
  }

  public double getWeight() {
    return weight;
  }

  public String getName() {
    return name;
  }
}
