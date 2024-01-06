package OOP_1618.EA.KE5.ModelUndController;

public class Main {
  public static void main(String[] args) {
    new EggTimerController(new EggTimerModel(10), new EventBasedTimer());
  }
}
