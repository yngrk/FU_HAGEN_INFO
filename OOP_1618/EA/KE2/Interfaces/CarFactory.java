package OOP_1618.EA.KE2.Interfaces;

public class CarFactory {
  public Car giveMeACar() {
    return new RealCar(98);
  }
}
