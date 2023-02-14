package practice;

import java.awt.*;
import javax.swing.*;

public class Practice05 extends JFrame {

  public Practice05() {
    setTitle("Grid Color");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(4, 4));

    JButton btns[] = new JButton[16];

    for (int i = 0; i < 16; i++) {
      btns[i] = new JButton("" + (i + 1));
      int r = (int) (Math.random() * 256);
      int g = (int) (Math.random() * 256);
      int b = (int) (Math.random() * 256);
      btns[i].setBackground(new Color(r, g, b));
      btns[i].setForeground(Color.WHITE);
      contentPane.add(btns[i]);
    }

    setSize(500, 200);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Practice05();
  }
}
