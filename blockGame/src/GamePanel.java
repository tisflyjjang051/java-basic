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
    this.setPreferredSize(new Dimension(60 * 10 + GAP * 9, 900));
    paddle = new Paddle();
    ball = new Ball();
    blocks = new Block[5][10];
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        blocks[i][j] = new Block();
        blocks[i][j].x = (60 + GAP) * j;
        blocks[i][j].y = (30 + GAP) * i + 50;
        blocks[i][j].width = 60;
        blocks[i][j].height = 30;
        blocks[i][j].color = i;
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
        if (blocks[i][j].color == 0) {
          g.setColor(Color.BLUE);
        } else if (blocks[i][j].color == 1) {
          g.setColor(Color.GREEN);
        } else if (blocks[i][j].color == 2) {
          g.setColor(Color.MAGENTA);
        } else if (blocks[i][j].color == 3) {
          g.setColor(Color.YELLOW);
        } else if (blocks[i][j].color == 4) {
          g.setColor(Color.ORANGE);
        }
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
