import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingText extends JFrame {

  private JLabel label = new JLabel("hello");

  public FlyingText() {
    this.setTitle("Flying Text");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.addKeyListener(new MyKeyListener());
    contentPane.setLayout(null);
    label.setSize(100, 20);
    label.setLocation(100, 100);
    contentPane.add(label);
    this.setSize(500, 500);
    this.setVisible(true);

    this.setFocusable(true);
    this.requestFocus();
    contentPane.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          Container contentPane = (Container) e.getSource();
          contentPane.setFocusable(true);
          contentPane.requestFocus();
        }
      }
    );
  }

  class MyKeyListener extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();
      System.out.println(keyCode);
      if (keyCode == KeyEvent.VK_UP) {
        label.setLocation(label.getX(), label.getY() - 10);
      } else if (keyCode == KeyEvent.VK_DOWN) {
        label.setLocation(label.getX(), label.getY() + 10);
      } else if (keyCode == KeyEvent.VK_LEFT) {
        label.setLocation(label.getX() - 10, label.getY());
      } else if (keyCode == KeyEvent.VK_RIGHT) {
        label.setLocation(label.getX() + 10, label.getY());
      }
    }
  }

  public static void main(String[] args) {
    new FlyingText();
  }
}
