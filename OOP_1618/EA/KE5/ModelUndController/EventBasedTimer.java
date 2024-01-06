package OOP_1618.EA.KE5.ModelUndController;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class EventBasedTimer {
  private Timer internalTimer = new Timer();
  private List<TickListener> listeners = new ArrayList<TickListener>();

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
  }

  public void stop() {
    internalTimer.cancel();
  }
}
