package OOP_1618.ADHOC.KE2.MaxWeightContainer;

public class Main {
  public static void main(String[] args) {
    MaxWeightContainer mwc = new MaxWeightContainer();

    mwc.store(new Apple(1));
    System.out.println(mwc.getHeaviest().getWeight());

    mwc.store(new Tire(10000));
    System.out.println(mwc.getHeaviest().getWeight());
  }
}
