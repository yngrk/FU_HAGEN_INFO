package OOP_1618.EA.KE4.Persistenz;

interface FullPersistence {
  AddressBook loadBook(String name) throws AddressBookException;

  void storeBook(AddressBook book, String name) throws AddressBookException;
}