import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CirclePanel extends JPanel implements Runnable {

  private int x = 100;
  private int y = 100;

  CirclePanel() {
    Thread thread = new Thread(this);
    //thread.start();
    this.addMouseListener(
        new MouseAdapter() {
          public void mouseReleased(MouseEvent e) {
            thread.start();
          }
        }
      );
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.MAGENTA);
    g.drawOval(x, y, 50, 50);
  }

  @Override
  public void run() {
    while (true) {
      x = (int) (Math.random() * 300);
      y = (int) (Math.random() * 300);
      repaint();
      try {
        Thread.sleep(500);
      } catch (Exception e) {
        e.printStackTrace();
        return;
      }
    }
  }
}

public class RandomCircle extends JFrame {

  RandomCircle() {
    this.setTitle("랜덤 볼");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setContentPane(new CirclePanel());

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new RandomCircle();
  }
}
