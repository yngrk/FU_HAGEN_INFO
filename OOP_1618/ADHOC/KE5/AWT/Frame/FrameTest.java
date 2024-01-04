package OOP_1618.ADHOC.KE5.AWT.Frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class FrameTest {
  public static void main(String[] args) {
    Frame f = new Frame();
    f.setSize(300, 300);
    f.setLocationRelativeTo(null);
    f.setLayout(new FlowLayout());
    f.add(new Label("Test"));

    FensterEvents fe = new FensterEvents();

    f.addWindowListener(fe);

    Button exitButton = new Button("Exit");
    exitButton.addActionListener(fe);

    f.add(exitButton);
    f.setVisible(true);
  }
}
