package OOP_1618.EA.KE5.MVC.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class EventBasedTimer {
  private Timer internalTimer = new Timer();
  private List<TickListener> listeners = new ArrayList<TickListener>();
  private boolean isRunning;

  public void addTickListener(TickListener listener) {
    listeners.add(listener);
  }

  public void start() {
    internalTimer.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        for (TickListener tickListener : listeners) {
          tickListener.tickPerformed();
        }
      }
    }, 1000, 1000);
    isRunning = true;
    System.out.println("Timer gestartet.");
  }

  public void stop() {
    internalTimer.cancel();
    isRunning = false;
    System.out.println("Timer gestoppt.");
  }

  public boolean isRunning() {
    return isRunning;
  }
}
