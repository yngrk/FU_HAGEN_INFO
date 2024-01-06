package OOP_1618.EA.KE5.AWT;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class EggTimerCanvas extends Canvas {
  private EggTimerModel model;

  public EggTimerCanvas(EggTimerModel model) {
    this.model = model;

    setBackground(Color.BLACK);
    setPreferredSize(new Dimension(320, 320));
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);

    int width = getWidth();
    int height = getHeight();

    int x = (width - 300) / 2;
    int y = (height - 300) / 2;

    double elapsedPart = model.getElapsedPart();

    int redStart = 90 - (int) Math.round(elapsedPart * 360);
    int greenStart = 90 - 0;

    int redAngle = -(360 - (int) Math.round(elapsedPart * 360));
    int greenAngle = (int) Math.round(elapsedPart * 360) * -1;

    g.setColor(Color.RED);
    g.fillArc(x, y, 300, 300, redStart, redAngle);

    g.setColor(Color.GREEN);
    g.fillArc(x, y, 300, 300, greenStart, greenAngle);
  }
}
