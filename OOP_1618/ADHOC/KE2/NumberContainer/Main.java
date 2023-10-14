package OOP_1618.ADHOC.KE2.NumberContainer;

public class Main {
  public static void main(String[] args) {
    NumberContainerWithMaximum cm = new NumberContainerWithMaximum();
    cm.store(42);
    System.out.println(cm.getMaximum());
    cm.store(67);
    System.out.println(cm.getMaximum());
    cm.store(12);
    System.out.println(cm.getMaximum());
  }
}
