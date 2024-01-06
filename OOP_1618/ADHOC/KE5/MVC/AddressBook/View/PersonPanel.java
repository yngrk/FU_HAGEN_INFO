package OOP_1618.ADHOC.KE5.MVC.AddressBook.View;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.util.Iterator;

import OOP_1618.ADHOC.KE5.MVC.AddressBook.Model.AddressBookDataModel;
import OOP_1618.ADHOC.KE5.MVC.AddressBook.Model.Person;

public class PersonPanel extends Panel {
  private AddressBookDataModel model;
  private static final Color EVEN_ROW_COLOR = new Color(240, 240, 255);
  private static final Color ODD_ROW_COLOR = new Color(255, 255, 240);

  public PersonPanel(AddressBookDataModel model) {
    this.model = model;
    setBackground(Color.BLACK);
    setLayout(new GridLayout(0, 3, 0, 1));
    refresh();
  }

  public void refresh() {
    removeAll();
    boolean isEvenRowNumber = true;
    Iterator<Person> it = model.iterator();
    while (it.hasNext()) {
      Person p = it.next();
      Color rowColor = isEvenRowNumber ? EVEN_ROW_COLOR : ODD_ROW_COLOR;

      Label firstNameLabel = new Label(p.getFirstName());
      firstNameLabel.setBackground(rowColor);
      add(firstNameLabel);

      Label lastNameLabel = new Label(p.getLastName());
      lastNameLabel.setBackground(rowColor);
      add(lastNameLabel);

      Label phoneLabel = new Label(p.getPhone());
      phoneLabel.setBackground(rowColor);
      add(phoneLabel);

      isEvenRowNumber = !isEvenRowNumber;
    }
  }
}
