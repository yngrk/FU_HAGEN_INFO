package OOP_1618.EA.KE5.MVC.View;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import OOP_1618.EA.KE5.MVC.Model.EggTimerModel;
import OOP_1618.EA.KE5.MVC.Model.EventBasedTimer;

public class EggTimerView {
  private EggTimerCanvas canvas;
  private Button startBtn;

  public EggTimerView(EggTimerModel model, EventBasedTimer timer) {
    canvas = new EggTimerCanvas(model);

    Frame f = new Frame();

    f.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    f.add(canvas, BorderLayout.CENTER);

    startBtn = new Button("Start");
    startBtn.addActionListener((e) -> {
      timer.start();
      startBtn.setEnabled(false);
    });

    f.add(startBtn, BorderLayout.SOUTH);

    f.pack();
    f.setLocationRelativeTo(null);
    f.setVisible(true);
  }

  public void repaint() {
    canvas.repaint();
  }
}
