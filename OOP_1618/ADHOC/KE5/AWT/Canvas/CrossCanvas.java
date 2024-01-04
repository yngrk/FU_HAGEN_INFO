package OOP_1618.ADHOC.KE5.AWT.Canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class CrossCanvas extends Canvas {
  @Override
  public void paint(Graphics g) {
    super.paint(g);
    g.setColor(Color.RED);
    g.drawLine(0, 0, getWidth(), getHeight());
    g.drawLine(getWidth(), 0, 0, getHeight());
  }
}
