package OOP_1618.ADHOC.EA2.ObjectContainer;

public class Main {
  public static void main(String[] args) {
    ObjectContainer c = new ObjectContainer();
    c.store(new Person("Max", "Mustermann"));
    Person p = (Person) c.get();
    System.out.println(p.getFirstName());
  }
}
