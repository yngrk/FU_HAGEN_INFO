package OOP_1618.EA.KE4.Persistenz;

import java.io.Serializable;

class Person implements Serializable {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}