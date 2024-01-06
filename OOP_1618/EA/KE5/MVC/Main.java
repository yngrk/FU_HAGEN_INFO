package OOP_1618.EA.KE5.MVC;

import OOP_1618.EA.KE5.MVC.Controller.EggTimerController;
import OOP_1618.EA.KE5.MVC.Model.EggTimerModel;

public class Main {
  public static void main(String[] args) {
    new EggTimerController(new EggTimerModel(4));
  }
}
