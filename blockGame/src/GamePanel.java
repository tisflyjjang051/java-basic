import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel {

  static int GAP = 2;
  public Paddle paddle;
  public Ball ball;
  public Block blocks[][];

  public GamePanel() {
    System.out.println("game panel 생정자");
    this.setBackground(Color.BLACK);
    this.setPreferredSize(new Dimension(800, 900));
    paddle = new Paddle();
    ball = new Ball();
    blocks = new Block[5][10];
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        blocks[i][j] = new Block();
        blocks[i][j].x = (60 + GAP) * j;
        blocks[i][j].y = (30 + GAP) * i;
        blocks[i][j].width = 60;
        blocks[i][j].height = 30;
      }
    }
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.WHITE);
    g.fillRect(paddle.x, paddle.y, paddle.width, paddle.height);
    g.fillOval(ball.x, ball.y, ball.width, ball.height);
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        g.fillRect(
          blocks[i][j].x,
          blocks[i][j].y,
          blocks[i][j].width,
          blocks[i][j].height
        );
      }
    }
  }
}
