package OOP_1618.EA.KE5.ModelUndController;

public class EggTimerController implements TickListener {
  private EggTimerModel model;
  private EventBasedTimer timer;

  public EggTimerController(EggTimerModel model) {
    this.model = model;
    timer = new EventBasedTimer();

    timer.addTickListener(this);
    timer.start();
  }

  public void tickPerformed() {
    model.increaseElapsedTime();

    double elapsedPart = model.getElapsedPart();

    System.out.println(elapsedPart);

    if (elapsedPart == 1.0) {
      timer.stop();
    }
  }
}
