package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice01 extends JFrame {

  public Practice01() {
    this.setTitle("practice01");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    JLabel label = new JLabel("I LOVE JAVA");
    label.addMouseListener(
      new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
          JLabel label = (JLabel) e.getSource();
          label.setText("사랑해");
        }

        public void mouseExited(MouseEvent e) {
          JLabel label = (JLabel) e.getSource();
          label.setText("I LOVE JAVA");
        }
      }
    );
    contentPane.add(label);
    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice01();
  }
}
