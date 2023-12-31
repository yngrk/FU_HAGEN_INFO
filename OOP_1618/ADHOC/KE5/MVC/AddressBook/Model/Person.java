package OOP_1618.ADHOC.KE5.MVC.AddressBook.Model;

import java.io.Serializable;

public class Person implements Serializable {
  private final String firstName;
  private final String lastName;
  private final String phone;

  public Person(String firstName, String lastName, String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getPhone() {
    return phone;
  }
}
