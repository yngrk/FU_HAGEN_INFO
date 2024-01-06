package OOP_1618.EA.KE5.MVC.Controller;

import OOP_1618.EA.KE5.MVC.Model.EggTimerModel;
import OOP_1618.EA.KE5.MVC.Model.EventBasedTimer;
import OOP_1618.EA.KE5.MVC.Model.TickListener;
import OOP_1618.EA.KE5.MVC.View.EggTimerView;

public class EggTimerController implements TickListener {
  private EggTimerModel model;
  private EventBasedTimer timer;
  private EggTimerView view;

  public EggTimerController(EggTimerModel model) {
    this.model = model;
    timer = new EventBasedTimer();

    view = new EggTimerView(model, timer);

    timer.addTickListener(this);
  }

  public void tickPerformed() {
    model.increaseElapsedTime();

    double elapsedPart = model.getElapsedPart();
    System.out.println(elapsedPart);

    view.repaint();

    if (elapsedPart == 1.0) {
      timer.stop();
    }
  }
}
