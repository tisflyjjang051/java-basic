package practice;

import java.awt.*;
import javax.swing.*;

public class Practice03 extends JFrame {

  public Practice03() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(1, 10));

    JButton btns[] = new JButton[10];
    for (int i = 0; i < 10; i++) {
      btns[i] = new JButton("" + (i + 1));
      contentPane.add(btns[i]);
    }

    setSize(400, 200);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Practice03();
  }
}
