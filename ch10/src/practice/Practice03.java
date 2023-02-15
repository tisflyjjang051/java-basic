package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice03 extends JFrame {

  public Practice03() {
    this.setTitle("practice03");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    JLabel label = new JLabel("I LOVE JAVA");
    label.addKeyListener(
      new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            JLabel label = (JLabel) e.getSource();
            StringBuffer sb = new StringBuffer(label.getText());
            label.setText(sb.reverse().toString());
          }
        }
      }
    );
    contentPane.add(label);
    this.setSize(500, 500);
    this.setVisible(true);
    label.setFocusable(true);
    label.requestFocus();
  }

  public static void main(String[] args) {
    new Practice03();
  }
}
