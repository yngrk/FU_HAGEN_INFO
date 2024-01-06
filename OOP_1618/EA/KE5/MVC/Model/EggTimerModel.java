package OOP_1618.EA.KE5.MVC.Model;

public class EggTimerModel {
  private int totalTimeInSeconds;
  private int elapsedTimeInSeconds;

  public EggTimerModel(int totalTimeInSeconds) {
    this.totalTimeInSeconds = totalTimeInSeconds;
  }

  public double getElapsedPart() {
    return (double) elapsedTimeInSeconds / totalTimeInSeconds;
  }

  public void increaseElapsedTime() {
    elapsedTimeInSeconds += 1;
  }
}
