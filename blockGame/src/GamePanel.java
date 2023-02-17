import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel {

  public Paddle paddle;
  public Block blocks[][];

  public GamePanel() {
    System.out.println("game panel 생정자");
    this.setBackground(Color.BLACK);
    this.setPreferredSize(new Dimension(800, 900));
    paddle = new Paddle();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.WHITE);
    g.fillRect(paddle.x, paddle.y, paddle.width, paddle.height);
  }
}
