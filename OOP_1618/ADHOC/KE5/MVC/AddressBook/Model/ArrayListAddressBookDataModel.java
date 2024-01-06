package OOP_1618.ADHOC.KE5.MVC.AddressBook.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddressBookDataModel implements AddressBookDataModel, Serializable {
  private ArrayList<Person> persons;

  public ArrayListAddressBookDataModel() {
    persons = new ArrayList<Person>();
  }

  @Override
  public void addPerson(Person p) {
    persons.add(p);
  }

  @Override
  public Iterator<Person> iterator() {
    return persons.iterator();
  }
}
