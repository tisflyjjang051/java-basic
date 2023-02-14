package practice;

import java.awt.*;
import javax.swing.*;

public class Practice04 extends JFrame {

  public Practice04() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(1, 10));

    JButton btns[] = new JButton[10];
    Color colors[] = {
      Color.RED,
      Color.BLUE,
      Color.CYAN,
      Color.DARK_GRAY,
      Color.GREEN,
      Color.MAGENTA,
      Color.ORANGE,
      Color.PINK,
      Color.YELLOW,
      Color.BLACK,
    };
    for (int i = 0; i < 10; i++) {
      btns[i] = new JButton("" + (i + 1));
      btns[i].setOpaque(true);
      btns[i].setBackground(colors[i]);
      contentPane.add(btns[i]);
    }

    setSize(400, 200);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Practice04();
  }
}
