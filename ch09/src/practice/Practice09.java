package practice;

import java.awt.*;
import javax.swing.*;

class BtnPanel extends JPanel {

  public BtnPanel() {
    this.setBackground(Color.LIGHT_GRAY);
    this.setLayout(new FlowLayout());

    this.add(new JButton("열기"));
    this.add(new JButton("닫기"));
    this.add(new JButton("나가기"));
  }
}

class StarPanel extends JPanel {

  public StarPanel() {
    this.setBackground(Color.WHITE);
    this.setLayout(null);
    for (int i = 0; i < 10; i++) {
      JLabel label = new JLabel("*");
      label.setForeground(Color.RED);
      int x = (int) (Math.random() * 350 + 50);
      int y = (int) (Math.random() * 350 + 50);
      label.setSize(20, 20);
      label.setLocation(x, y);
      this.add(label);
    }
  }
}

class InputPanel extends JPanel {

  public InputPanel() {
    this.setBackground(Color.LIGHT_GRAY);
    this.setLayout(new FlowLayout());

    this.add(new JButton("word input"));
    this.add(new JTextField(16));
  }
}

public class Practice09 extends JFrame {

  public Practice09() {
    setTitle("Calc");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
    BtnPanel btnPanel = new BtnPanel();
    StarPanel starPanel = new StarPanel();
    InputPanel inputPanel = new InputPanel();
    contentPane.add(btnPanel, BorderLayout.NORTH);
    contentPane.add(starPanel, BorderLayout.CENTER);
    contentPane.add(inputPanel, BorderLayout.SOUTH);

    setSize(500, 400);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Practice09();
  }
}
