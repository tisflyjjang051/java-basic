package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice05 extends JFrame {

  public Practice05() {
    this.setTitle("practice05");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    JLabel label = new JLabel("I LOVE JAVA");
    label.addKeyListener(
      new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            JLabel label = (JLabel) e.getSource();
            String txt = label.getText();
            String firstTxt = txt.substring(0, 1); // 첫번쨰 글자
            String restTxt = txt.substring(1); // 첫번쨰를 제외한 나머지 글자
            label.setText(restTxt.concat(firstTxt));
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
    new Practice05();
  }
}
