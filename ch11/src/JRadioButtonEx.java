import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButtonEx extends JFrame {

  private JRadioButton fruits[] = new JRadioButton[3];
  private String fruitNames[] = { "사과", "딸기", "체리" };
  private JLabel sumLabel = new JLabel("합계 : 0");

  public JRadioButtonEx() {
    JLabel title = new JLabel("사과 1000, 딸기 8000, 체리 10000");
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(title);
    MyItemListener myItemListener = new MyItemListener();
    ButtonGroup btnGroup = new ButtonGroup();
    for (int i = 0; i < 3; i++) {
      fruits[i] = new JRadioButton(fruitNames[i]);
      btnGroup.add(fruits[i]);
      contentPane.add(fruits[i]);
      fruits[i].addItemListener(myItemListener);
    }
    contentPane.add(sumLabel);
    this.setSize(500, 500);
    this.setVisible(true);
  }

  class MyItemListener implements ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {
      if (e.getStateChange() == ItemEvent.SELECTED) {
        if (e.getItem() == fruits[0]) {
          System.out.println("radio01");
        } else if (e.getItem() == fruits[1]) {
          System.out.println("radio02");
        } else if (e.getItem() == fruits[2]) {
          System.out.println("radio03");
        }
      } else {
        if (e.getItem() == fruits[0]) {} else if (
          e.getItem() == fruits[1]
        ) {} else if (e.getItem() == fruits[2]) {}
      }
    }
  }

  public static void main(String[] args) {
    new JRadioButtonEx();
  }
}
