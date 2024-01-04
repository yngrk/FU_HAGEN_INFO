package OOP_1618.ADHOC.KE5.AWT.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FensterEvents extends WindowAdapter implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("exitButton clicked.");
    System.exit(0);
  }

  @Override
  public void windowClosing(WindowEvent e) {
    System.out.println("Beende Programm.");
    System.exit(0);
  }
}
