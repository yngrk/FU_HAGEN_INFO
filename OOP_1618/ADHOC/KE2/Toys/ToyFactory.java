package OOP_1618.ADHOC.KE2.Toys;

public class ToyFactory {
  public static Toy getToy(String toy) throws NoSuchToyException {
    switch (toy) {
      case "Toy":
        return new Toy();
      case "PlasticCar":
        return new PlasticCar();
      case "RubberDuck":
        return new RubberDuck();
      case "TeddyBear":
        return new TeddyBear();
      default:
        throw new NoSuchToyException("Toy name not found");
    }
  }
}
