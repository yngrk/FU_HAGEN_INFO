package OOP_1618.ADHOC.KE5.MVC.AddressBook.Model;

public interface FullPersistence {
  AddressBookDataModel loadBook() throws AddressBookException;

  void storeBook(AddressBookDataModel book) throws AddressBookException;
}
