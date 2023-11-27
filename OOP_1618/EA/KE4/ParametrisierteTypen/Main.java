package OOP_1618.EA.KE4.ParametrisierteTypen;

public class Main {
  public static void main(String[] args) {
    MaximumContainer<Obst> mc = new MaximumContainer<>();

    mc.store(new Apfel(12));
    System.out.println(mc.get().getWeight());

    mc.store(new Birne(14));
    System.out.println(mc.get().getWeight());

    mc.store(new Apfel(11));
    System.out.println(mc.get().getWeight());
  }
}
