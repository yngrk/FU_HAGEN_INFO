package OOP_1618.ADHOC.KE5.Observer.WakeUp;

class WakeUpServiceTester {
  public static void main(String[] args) {
    WakeUpService service = new WakeUpService(14);

    WakeUpServiceClient client1 = new WakeUpServiceClient() {
      @Override
      public void wakeUp() {
        System.out.println("Client 1: Aufstehen!");
      }
    };

    service.register(client1);

    service.startService();
  }
}
