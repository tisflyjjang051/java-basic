package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice01 extends JFrame {

  MyPanel myPanel = new MyPanel();

  Practice01() {
    this.setTitle("그림 그리기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(myPanel);
    this.setSize(600, 800);
    this.setVisible(true);
  }

  class MyPanel extends JPanel {

    private ImageIcon icon = new ImageIcon("ch12/images/younjin.jpg");
    private Image img = icon.getImage();
    private boolean isDraw = true;
    JButton btn = new JButton("Hide/Show");

    MyPanel() {
      setLayout(new FlowLayout());
      add(btn);
      btn.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            isDraw = !isDraw;
            MyPanel.this.repaint();
          }
        }
      );
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      if (isDraw) {
        g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
      }
    }
  }

  public static void main(String[] args) {
    new Practice01();
  }
}
