package OOP_1618.ADHOC.Toys;

public class Main {
  public static void main(String[] args) throws NoSuchToyException {
    Toy t = ToyFactory.getToy("Toy");
    t.print();
    Toy r = ToyFactory.getToy("RubberDuck");
    r.print();
    Toy p = ToyFactory.getToy("PlasticCar");
    p.print();
    Toy b = ToyFactory.getToy("TeddyBear");
    b.print();
    Toy x = ToyFactory.getToy("Blabla");
    x.print();
  }
}
