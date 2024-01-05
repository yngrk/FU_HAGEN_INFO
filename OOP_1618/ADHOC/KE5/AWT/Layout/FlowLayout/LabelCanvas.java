package OOP_1618.ADHOC.KE5.AWT.Layout.FlowLayout;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class LabelCanvas extends Canvas {
  private String text;
  private Dimension calculatedSize;
  private int verticalOffset;

  public LabelCanvas(String text) {
    this.text = text;
    setFont(new Font("Serif", Font.PLAIN, 14));
    FontMetrics fontMetrics = getFontMetrics(getFont());
    int descent = fontMetrics.getMaxDescent();
    int height = fontMetrics.getHeight();
    int width = fontMetrics.stringWidth(text);
    verticalOffset = height - descent;
    calculatedSize = new Dimension(width, height);
  }

  @Override
  public void paint(Graphics g) {
    g.drawString(text, 0, verticalOffset);
  }

  @Override
  public Dimension getPreferredSize() {
    return calculatedSize;
  }

  @Override
  public Dimension getMinimumSize() {
    return calculatedSize;
  }
}
