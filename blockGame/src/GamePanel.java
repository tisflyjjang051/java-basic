import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {

  static int GAP = 2;
  public Paddle paddle;
  public Ball ball;
  public Block blocks[][];
  public Thread th;

  public GamePanel() {
    this.setBackground(Color.BLACK);
    this.setPreferredSize(new Dimension(60 * 10 + GAP * 9, 900));

    th = new Thread(this);
    th.start();
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
    this.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {}

          @Override
          public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              paddle.isLeft = true;
              paddle.isRight = false;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              paddle.isLeft = false;
              paddle.isRight = true;
            }
          }

          @Override
          public void keyReleased(KeyEvent e) {
            paddle.isLeft = false;
            paddle.isRight = false;
          }
        }
      );
    this.setFocusable(true);
    this.requestFocus();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.WHITE);
    g.fillRect(paddle.x, paddle.y, paddle.width, paddle.height);
    g.fillOval(ball.x, ball.y, ball.width, ball.height);
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        if (blocks[i][j].isHide) {
          continue;
        }
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

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(20);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      repaint();
      paddleMove();
      ballMove();
      checkBlock();
    }
  }

  public void checkBlock() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        Block block = blocks[i][j];
        if (!block.isHide) {
          if (
            hitObject(
              new Rectangle(ball.x, ball.y, ball.width, ball.height),
              new Rectangle(block.x, block.y, block.width, block.height)
            )
          ) {
            //System.out.println("충돌");
            block.isHide = true;
          }
        }
      }
    }
  }

  public void paddleMove() {
    if (paddle.isLeft) {
      paddle.x -= 10;
    } else if (paddle.isRight) {
      paddle.x += 10;
    }
  }

  public void ballMove() {
    if (ball.x >= 618 - 10) {
      ball.isLeft = true;
      ball.isRight = false;
    } else if (ball.x <= 0) {
      ball.isLeft = false;
      ball.isRight = true;
    }
    if (ball.y >= 890) {
      ball.isUp = true;
      ball.isDown = false;
    } else if (ball.y <= 0) {
      ball.isUp = false;
      ball.isDown = true;
    }

    if (ball.isUp) {
      ball.y -= 5;
    } else if (ball.isDown) {
      ball.y += 5;
    }
    if (ball.isLeft) {
      ball.x -= 5;
    } else if (ball.isRight) {
      ball.x += 5;
    }
  }

  public boolean hitObject(Rectangle ball, Rectangle rect) {
    return ball.intersects(rect);
  }
}
