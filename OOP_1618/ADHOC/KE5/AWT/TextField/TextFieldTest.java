package OOP_1618.ADHOC.KE5.AWT.TextField;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest {
  public static void main(String[] args) {
    Frame f = new Frame();
    f.setSize(300, 300);
    f.setLocationRelativeTo(null);
    f.setLayout(new FlowLayout());

    TextField textField = new TextField("", 20);
    textField.setEditable(true);
    textField.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String text = ((TextField) e.getSource()).getText();
        System.out.println(text);
        if (text.equals("quit")) {
          System.exit(0);
        }
      }
    });

    f.add(textField);
    f.setVisible(true);
  }
}
