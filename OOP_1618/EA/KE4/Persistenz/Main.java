package OOP_1618.EA.KE4.Persistenz;

public class Main {
  public static void main(String[] args) throws AddressBookException {
    ArrayListAddressBook ab = new ArrayListAddressBook(3);
    ab.addPerson(new Person("Harry Potter"));
    ab.addPerson(new Person("Ron Weasley"));
    ab.addPerson(new Person("Hermione Granger"));

    SerializationToFilePersistence serial = new SerializationToFilePersistence();
    serial.storeBook(ab, "data");

    ArrayListAddressBook fromFile = (ArrayListAddressBook) serial.loadBook("data");
    fromFile.print();
  }
}
