package OOP_1618.EA.KE4.Persistenz;

import java.io.*;

public class SerializationToFilePersistence implements FullPersistence {
  public AddressBook loadBook(String name) throws AddressBookException {
    AddressBook fromFile;
    try {
      InputStream is = new FileInputStream(name);
      ObjectInputStream ois = new ObjectInputStream(is);
      fromFile = (AddressBook) ois.readObject();
      ois.close();
    } catch (Exception e) {
      throw new AddressBookException(e.getMessage());
    }
    return fromFile;
  }

  public void storeBook(AddressBook book, String name) throws AddressBookException {
    try {
      OutputStream os = new FileOutputStream(name);
      ObjectOutputStream oos = new ObjectOutputStream(os);
      oos.writeObject(book);
      oos.close();
    } catch (Exception e) {
      throw new AddressBookException("Fehler: " + e.getMessage());
    }
  }
}
