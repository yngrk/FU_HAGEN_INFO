package OOP_1618.ADHOC.KE5.AWT;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BaseFrame extends Frame {
  public BaseFrame() {
    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.out.println("Fensterschließung angefordert.");
        e.getWindow().dispose();
      }

      @Override
      public void windowClosed(WindowEvent e) {
        System.out.println("Beende Programm.");
        System.exit(0);
      }
    });

    setSize(300, 300);
    setLocationRelativeTo(null);
  }
}
