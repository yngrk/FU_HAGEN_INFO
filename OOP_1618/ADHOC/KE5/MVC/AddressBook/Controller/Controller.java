package OOP_1618.ADHOC.KE5.MVC.AddressBook.Controller;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import OOP_1618.ADHOC.KE5.MVC.AddressBook.Model.AddressBookDataModel;
import OOP_1618.ADHOC.KE5.MVC.AddressBook.Model.AddressBookException;
import OOP_1618.ADHOC.KE5.MVC.AddressBook.Model.FullPersistence;
import OOP_1618.ADHOC.KE5.MVC.AddressBook.Model.Person;
import OOP_1618.ADHOC.KE5.MVC.AddressBook.View.PersonPanel;

public class Controller extends WindowAdapter implements ActionListener {
  private PersonPanel view;
  private Frame mainFrame;
  private AddressBookDataModel model;
  private FullPersistence persistence;

  public Controller(AddressBookDataModel model, FullPersistence persistence, PersonPanel view, Frame mainFrame) {
    this.model = model;
    this.persistence = persistence;
    this.view = view;
    this.mainFrame = mainFrame;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    createAndShowNewpersonDialog();
  }

  @Override
  public void windowClosing(WindowEvent e) {
    try {
      persistence.storeBook(model);
      System.out.println("Addressbuch gespeichert.");
    } catch (AddressBookException abe) {
      System.out.println("Addressbuch konnte nicht gespeichert werden.");
      abe.printStackTrace();
    } finally {
      System.exit(0);
    }
  }

  public void createAndShowNewpersonDialog() {
    Dialog newPersonDialog = new Dialog(mainFrame, "Neue Person", true);
    Panel dataPanel = new Panel(new GridLayout(4, 2));

    TextField firstNameField = new TextField(30);
    TextField lastNameField = new TextField(30);
    TextField phoneField = new TextField(30);

    dataPanel.add(new Label("Vorname: "));
    dataPanel.add(firstNameField);

    dataPanel.add(new Label("Nachname: "));
    dataPanel.add(lastNameField);

    dataPanel.add(new Label("Telefon: "));
    dataPanel.add(phoneField);

    newPersonDialog.add(dataPanel);

    Button okButton = new Button("OK");
    okButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Person newPerson = new Person(firstNameField.getText(), lastNameField.getText(), phoneField.getText());
        model.addPerson(newPerson);
        view.refresh();
        newPersonDialog.dispose();
      }
    });

    Panel southPanel = new Panel();
    southPanel.add(okButton);
    newPersonDialog.add(southPanel, BorderLayout.SOUTH);

    newPersonDialog.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent e) {
        newPersonDialog.dispose();
      }
    });

    newPersonDialog.pack();
    newPersonDialog.setLocationRelativeTo(mainFrame);
    newPersonDialog.setVisible(true);
  }
}
