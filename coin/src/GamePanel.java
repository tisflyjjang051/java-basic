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

  public int coinTx = 300;
  public int coinTy = 300;

  public int speedX = 10;
  public int speedY = 10;
  public Thread th;
  public Thread th02;
  public RandomThread randomThread = new RandomThread();
  public int score = 0;

  public GamePanel() {
    th = new Thread(this);
    th.start();

    th02 = new Thread(randomThread);
    th02.start();
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
    g.setColor(Color.WHITE);
    g.setFont(new Font("맑은 고딕", Font.BOLD, 24));
    g.drawString("SCORE : " + score, 100, 100);
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
      marioMove();
      checkCoin();
    }
  }

  // 시작화면 구현  s누르면 시작하게
  // 점수 구현 score
  // 너무 기다리지 말고 랜덤하게 위치이동

  // 확률을 정해서 arrow를 등장시키고 만약 그거랑 충돌하면 스피드가 올라가게....

  public void marioMove() {
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
    if (marioX < -32) {
      marioX = 1280;
    }
    if (marioX > 1280 + 32) {
      marioX = -32;
    }
    if (marioY < -32) {
      marioY = 720;
    }
    if (marioY > 720 + 32) {
      marioY = -32;
    }
  }

  public void checkCoin() {
    double distX = coinX - marioX;
    double distY = coinY - marioY;
    double dist = Math.sqrt(distX * distX + distY * distY);
    coinX += (coinTx - coinX) * 0.15;
    coinY += (coinTy - coinY) * 0.15;
    if (dist < 32) {
      coinTx = (int) (Math.random() * 1280);
      coinTy = (int) (Math.random() * 720);
      score++;
    }
  }

  class RandomThread implements Runnable {

    @Override
    public void run() {
      while (true) {
        coinTx = (int) (Math.random() * 1280);
        coinTy = (int) (Math.random() * 720);
        try {
          Thread.sleep(3000);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
}
// coin eat game
