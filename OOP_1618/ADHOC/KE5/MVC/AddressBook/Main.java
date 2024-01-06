package OOP_1618.ADHOC.KE5.MVC.AddressBook;

import java.awt.Button;
import java.awt.Frame;
import java.io.File;

import OOP_1618.ADHOC.KE5.MVC.AddressBook.Controller.Controller;
import OOP_1618.ADHOC.KE5.MVC.AddressBook.Model.AddressBookDataModel;
import OOP_1618.ADHOC.KE5.MVC.AddressBook.Model.AddressBookException;
import OOP_1618.ADHOC.KE5.MVC.AddressBook.Model.ArrayListAddressBookDataModel;
import OOP_1618.ADHOC.KE5.MVC.AddressBook.Model.SerializationToFilePersistence;
import OOP_1618.ADHOC.KE5.MVC.AddressBook.View.AddressBookMainFrame;
import OOP_1618.ADHOC.KE5.MVC.AddressBook.View.PersonPanel;

public class Main {
  private static final String ADDRESSBOOK_DEFAULT_NAME = "addressbook.ab";
  private SerializationToFilePersistence persistence;
  private AddressBookDataModel model;
  private Frame mainFrame;
  private Controller controller;

  public static void main(String[] args) throws AddressBookException {
    new Main();
  }

  public Main() throws AddressBookException {
    init();
    PersonPanel personPanel = new PersonPanel(model);
    Button newPersonButton = new Button("Neuer Eintrag");
    mainFrame = new AddressBookMainFrame(personPanel, newPersonButton);
    controller = new Controller(model, persistence, personPanel, mainFrame);
    newPersonButton.addActionListener(controller);
    mainFrame.addWindowListener(controller);
    mainFrame.setVisible(true);
  }

  private void init() throws AddressBookException {
    String addressBookDirPath = System.getProperty("user.home") + "/.addressbooks";
    File addressBookDir = new File(addressBookDirPath);
    addressBookDir.mkdir();
    String addressBookPath = addressBookDirPath + "/" + ADDRESSBOOK_DEFAULT_NAME;
    persistence = new SerializationToFilePersistence(addressBookPath);
    File addressBookFile = new File(addressBookPath);
    if (addressBookFile.exists()) {
      System.out.println("Addressbuchdatei gefunden.");
      model = persistence.loadBook();
    } else {
      System.out.println("Keine Addressbuchdatei gefunden.");
      model = new ArrayListAddressBookDataModel();
    }
  }
}
