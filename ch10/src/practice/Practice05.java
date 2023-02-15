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
    label.setFont(new Font("Arial", Font.BOLD, 16));
    label.addKeyListener(
      new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          if (e.getKeyCode() == KeyEvent.VK_ADD || e.getKeyChar() == '+') {
            JLabel label = (JLabel) e.getSource();
            Font font = label.getFont();
            int size = font.getSize();
            label.setFont(new Font("Arial", Font.BOLD, size + 5));
          } else if (
            e.getKeyCode() == KeyEvent.VK_SUBTRACT || e.getKeyChar() == '-'
          ) {
            JLabel label = (JLabel) e.getSource();
            Font font = label.getFont();
            int size = font.getSize();
            label.setFont(new Font("Arial", Font.BOLD, size - 5));
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
