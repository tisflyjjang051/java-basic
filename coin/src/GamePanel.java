import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {

  Image bg = new ImageIcon("coin/images/bg.jpg").getImage();
  Image coin = new ImageIcon("coin/images/dollar.png").getImage();
  Image mario = new ImageIcon("coin/images/super-mario.png").getImage();
  public boolean isLeft, isRight, isUp, isDown;
  public int marioX = 500;
  public int marioY = 500;
  public int coinX = 300;
  public int coinY = 300;
  public int speedX = 10;
  public int speedY = 10;
  public Thread th;

  public GamePanel() {
    th = new Thread(this);
    th.start();
    this.setPreferredSize(new Dimension(1280, 720));
    this.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {}

          @Override
          public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              isLeft = true;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              isRight = true;
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
              isUp = true;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              isDown = true;
            }
          }

          @Override
          public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              isLeft = false;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              isRight = false;
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
              isUp = false;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              isDown = false;
            }
          }
        }
      );
    this.setFocusable(true);
    this.requestFocus();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // 그림 그리는 곳....
    g.drawImage(bg, 0, 0, null);
    g.drawImage(coin, coinX, coinY, null);
    g.drawImage(mario, marioX, marioY, null);
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
      marioMOve();
      checkCoin();
    }
  }

  public void marioMOve() {
    if (isLeft) {
      marioX -= speedX;
    }
    if (isRight) {
      marioX += speedX;
    }
    if (isUp) {
      marioY -= speedY;
    }
    if (isDown) {
      marioY += speedY;
    }
  }

  public void checkCoin() {
    double distX = coinX - marioX;
    double distY = coinY - marioY;
    double dist = Math.sqrt(distX * distX + distY * distY);
    if (dist < 32) {
      coinX = (int) (Math.random() * 1280);
      coinY = (int) (Math.random() * 720);
    }
  }
}
