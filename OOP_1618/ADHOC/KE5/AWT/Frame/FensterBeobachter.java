package OOP_1618.ADHOC.KE5.AWT.Frame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FensterBeobachter implements WindowListener {
  @Override
  public void windowClosing(WindowEvent e) {
    e.getWindow().dispose();
    System.out.println("Fenster wurde geschlossen.");
  }

  @Override
  public void windowOpened(WindowEvent e) {
  }

  @Override
  public void windowClosed(WindowEvent e) {
    System.out.println("Beende Programm.");
    System.exit(0);
  }

  @Override
  public void windowIconified(WindowEvent e) {
    // TODO Auto-generated method stub
  }

  @Override
  public void windowDeiconified(WindowEvent e) {
    // TODO Auto-generated method stub
  }

  @Override
  public void windowActivated(WindowEvent e) {
    // TODO Auto-generated method stub
  }

  @Override
  public void windowDeactivated(WindowEvent e) {
    // TODO Auto-generated method stub

  }

}
