package OOP_1618.ADHOC.KE5.AWT.Layout.BorderLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;

public class HinweisFenster extends Dialog {
  private Label tipLabel;

  public HinweisFenster(Frame owner) {
    super(owner, true);
    tipLabel = new Label("", Label.CENTER);
    add(tipLabel);

    Button okBtn = new Button("OK");
    okBtn.addActionListener((e) -> {
      this.setVisible(false);
    });
    add(okBtn, BorderLayout.SOUTH);

    setSize(300, 200);
  }

  public void setText(String text) {
    tipLabel.setText(text);
  }
}
