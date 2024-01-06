package OOP_1618.ADHOC.KE5.MVC.AddressBook.View;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class AddressBookMainFrame extends Frame {
  public AddressBookMainFrame(PersonPanel personPanel, Button newButton) {
    super("Addressbuch");
    setBackground(Color.LIGHT_GRAY);
    add(personPanel);

    Panel southPanel = new Panel();
    southPanel.add(newButton);
    add(southPanel, BorderLayout.SOUTH);
    setSize(500, 500);
    setLocationRelativeTo(null);
    setVisible(true);
  }
}
