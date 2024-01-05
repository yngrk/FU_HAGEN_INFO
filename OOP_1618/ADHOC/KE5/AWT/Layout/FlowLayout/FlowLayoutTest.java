package OOP_1618.ADHOC.KE5.AWT.Layout.FlowLayout;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import OOP_1618.ADHOC.KE5.AWT.BaseFrame;

public class FlowLayoutTest {
  public static void main(String[] args) throws IOException {
    Frame f = new BaseFrame();
    f.setTitle("Lorem ipsum dolor sit");
    Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
    f.add(p);

    BufferedReader br = new BufferedReader(
        new FileReader("/home/ubntu/code/FU_HAGEN_INFO/OOP_1618/ADHOC/KE5/AWT/Layout/FlowLayout/test.txt"));

    String line;
    while ((line = br.readLine()) != null) {
      StringTokenizer st = new StringTokenizer(line, " ");
      while (st.hasMoreTokens()) {
        String token = st.nextToken();
        p.add(new LabelCanvas(token));
      }
    }

    br.close();
    f.setVisible(true);
  }
}
