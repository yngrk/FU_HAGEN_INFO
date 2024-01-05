package OOP_1618.ADHOC.KE5.AWT.Layout.BorderLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HinweisFensterTest {
  public static void main(String[] args) {
    Frame f = new Frame();
    f.setSize(300, 300);
    f.setLocationRelativeTo(null);
    f.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    Button printBtn = new Button("print");
    printBtn.addActionListener((e) -> System.out.println("print clicked"));
    f.add(printBtn, BorderLayout.NORTH);

    Button tipBtn = new Button("tip");
    tipBtn.addActionListener(new ActionListener() {
      HinweisFenster hf = new HinweisFenster(f);

      @Override
      public void actionPerformed(ActionEvent e) {
        hf.setText("Alles praktisch erproben!");
        hf.setLocationRelativeTo(f);
        hf.setVisible(true);
      }
    });
    f.add(tipBtn, BorderLayout.CENTER);

    Button exitBtn = new Button("exit");
    exitBtn.addActionListener((e) -> System.exit(0));
    f.add(exitBtn, BorderLayout.SOUTH);

    f.setVisible(true);
  }
}
