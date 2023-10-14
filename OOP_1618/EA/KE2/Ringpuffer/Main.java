package OOP_1618.EA.KE2.Ringpuffer;

public class Main {
  public static void main(String[] args) {
    Buffer b = new Buffer(4);
    b.insert("hello");
    b.insert("world");
    b.insert("whatever");
    b.insert("another");
    b.insert("ups");

    b.print();
  }
}
