package practice;

import java.awt.*;
import javax.swing.*;

public class Practice07 extends JFrame {

  public Practice07() {
    setTitle("Grid Color");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    JPanel northPanel = new JPanel(); // Container
    northPanel.setLayout(new FlowLayout());
    northPanel.setBackground(Color.GRAY);
    northPanel.add(new JLabel("수식입력"));
    northPanel.add(new JTextField(16));

    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new GridLayout(4, 4, 5, 5));
    for (int i = 0; i < 10; i++) {
      JButton btn = new JButton("" + i);
      centerPanel.add(btn);
    }
    centerPanel.add(new JButton("CE"));
    centerPanel.add(new JButton("계산"));

    String marks[] = { "+", "-", "x", "/" };
    for (int i = 0; i < marks.length; i++) {
      JButton btn = new JButton(marks[i]);
      btn.setBackground(Color.GREEN);
      centerPanel.add(btn);
    }

    JPanel southPanel = new JPanel();
    southPanel.setLayout(new FlowLayout());
    southPanel.setBackground(Color.GRAY);
    southPanel.add(new JLabel("계산결과"));
    southPanel.add(new JTextField(16));

    contentPane.add(northPanel, BorderLayout.NORTH);
    contentPane.add(centerPanel, BorderLayout.CENTER);
    contentPane.add(southPanel, BorderLayout.SOUTH);

    setSize(500, 400);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Practice07();
  }
}
