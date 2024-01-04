package OOP_1618.ADHOC.KE5.Observer.WakeUp;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class WakeUpService {
  // Attribute
  private int wakeUpTime;
  private List<WakeUpServiceClient> clients;

  // Konstruktor
  WakeUpService(int wakeUpTime) {
    this.wakeUpTime = wakeUpTime;
    clients = new ArrayList<>();
  }

  // Methoden
  private void wakeUpAllClients() {
    for (WakeUpServiceClient c : clients) {
      c.wakeUp();
    }
  }

  public void register(WakeUpServiceClient client) {
    clients.add(client);
  }

  void startService() {
    boolean finished = false;
    System.out.println("Weckdienst für Weckzeit " + wakeUpTime + ":00 Uhr gestartet.");

    while (!finished) {
      int currentHour = LocalTime.now().getHour();

      if (currentHour == wakeUpTime) {
        wakeUpAllClients();
        finished = true;
      }

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
