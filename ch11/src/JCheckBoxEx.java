import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxEx extends JFrame {

  private JCheckBox fruits[] = new JCheckBox[3];
  private String fruitNames[] = { "사과", "딸기", "체리" };
  private JLabel sumLabel = new JLabel("합계 : 0");

  public JCheckBoxEx() {
    JLabel title = new JLabel("사과 1000, 딸기 8000, 체리 10000");
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(title);
    for (int i = 0; i < 3; i++) {
      fruits[i] = new JCheckBox(fruitNames[i]);
      contentPane.add(fruits[i]);
      fruits[i].addItemListener(new MyItemListener());
    }
    contentPane.add(sumLabel);
    this.setSize(500, 500);
    this.setVisible(true);
  }

  class MyItemListener implements ItemListener {

    private int sum = 0;

    @Override
    public void itemStateChanged(ItemEvent e) {
      if (e.getStateChange() == ItemEvent.SELECTED) {
        if (e.getItem() == fruits[0]) {
          sum += 1000;
        } else if (e.getItem() == fruits[1]) {
          sum += 8000;
        } else if (e.getItem() == fruits[2]) {
          sum += 10000;
        }
      } else {
        if (e.getItem() == fruits[0]) {
          sum -= 1000;
        } else if (e.getItem() == fruits[1]) {
          sum -= 8000;
        } else if (e.getItem() == fruits[2]) {
          sum -= 10000;
        }
      }
      sumLabel.setText("합계 : " + sum + "원");
    }
  }

  public static void main(String[] args) {
    new JCheckBoxEx();
  }
}
