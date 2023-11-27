package OOP_1618.EA.KE4.ParametrisierteTypen;

public abstract class Obst implements Comparable<Obst> {
  private double weight;

  public Obst(double weight) {
    this.weight = weight;
  }

  public int compareTo(Obst o) {
    return weight > o.getWeight() ? 1 : -1;
  }

  public double getWeight() {
    return weight;
  }
}
