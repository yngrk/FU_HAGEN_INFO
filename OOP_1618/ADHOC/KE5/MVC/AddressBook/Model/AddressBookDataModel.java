package OOP_1618.ADHOC.KE5.MVC.AddressBook.Model;

import java.util.Iterator;

public interface AddressBookDataModel {
  void addPerson(Person p);

  Iterator<Person> iterator();
}
