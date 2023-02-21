import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {

  Image bg = new ImageIcon("img/smw-bg-hills.png").getImage();
  Image coin = new ImageIcon("img/coin.png").getImage();
  Image mario = new ImageIcon("img/super-mario.png").getImage();
  Image mushroom = new ImageIcon("img/mushroom.png").getImage();
  Image shell = new ImageIcon("img/pngegg.png").getImage();

  private boolean isLeft, isRight, isUp, isDown;
  public int marioX = 500;
  public int marioY = 500;
  public int coinX = 300;
  public int coinY = 300;
  public int mushroomX = 600;
  public int mushroomY = 600;
  public int shellX = 700;
  public int shellY = 500;
  public int shelldX = 5;
  public int shelldY = 5;
  public int speedX = 10;
  public int speedY = 10;
  public Thread th;
  public int count = 0;
  private int timecount = 0;
  public int Miltime = 0;

  public boolean isMRshow = true;

  public GamePanel() {
    this.setPreferredSize(new Dimension(1280, 720));
    th = new Thread(this);
    this.th.start();

    this.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub

          }

          @Override
          public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              isLeft = true;
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
              isUp = true;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              isDown = true;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              isRight = true;
            }
          }

          @Override
          public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              isLeft = false;
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
              isUp = false;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              isDown = false;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              isRight = false;
            }
          }
        }
      );
    this.setFocusable(true);
    this.requestFocus();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    g.drawImage(coin, coinX, coinY, null);
    g.drawImage(mario, marioX, marioY, null);
    g.drawImage(mushroom, mushroomX, mushroomY, null);
    g.drawImage(shell, shellX, shellY, null);
    g.setColor(Color.WHITE);
    g.setFont(new Font("맑은 고딕", Font.BOLD, 18));
    g.drawString("SCORE : " + count, 500, 30);
    g.drawString("TIME : " + (Miltime / 1000), 1000, 30);
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      repaint();
      marioMove();
      checkCoin();
      shell();
      timecount += 10;
      Miltime += 10;
      mushRoom();
      checkShell();
      if (timecount >= 5000) {
        timecount = 0;
        isMRshow = true;
        mushroomX = (int) (Math.random() * 1200);
        mushroomY = (int) (Math.random() * 700);
      }
    }
  }

  private void shell() {
    shellX += shelldX;
    shellY -= shelldY;
    if (shellX < 0 || shellX > getWidth() - 32) {
      shelldX = -shelldX;
    }
    if (shellY < 0 || shellY > getHeight() - 32) {
      shelldY = -shelldY;
    }
  }

  public void mushRoom() {
    double distX = mushroomX - marioX;
    double distY = mushroomY - marioY;
    double dist = Math.sqrt(distX * distX + distY * distY);
    if (dist < 32) {
      timecount = 0;
      count = count + 5;
      mushroomX = 1800;
      mushroomY = 1500;
      isMRshow = false;
      shelldX = shelldX + 10;
      shelldY = shelldY + 10;
    }
    if (timecount >= 2000 && isMRshow == true) {
      timecount = 0;
      mushroomX = 1800;
      mushroomY = 1500;
      isMRshow = false;
    }
  }

  private void marioMove() {
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

    if (marioX < 0) {
      marioX = 1280;
    } else if (marioX > 1280) {
      marioX = 0;
    }
    if (marioY < 0) {
      marioY = 720;
    } else if (marioY > 720) {
      marioY = 0;
    }
  }

  public void checkShell() {
    double distX = shellX - marioX;
    double distY = shellY - marioY;
    double dist = Math.sqrt(distX * distX + distY * distY);
    if (dist < 50) {
      count = count - 10;
      shellX = (int) (Math.random() * 1200);
      shellY = (int) (Math.random() * 700);
    }
  }

  public void checkCoin() {
    double distX = coinX - marioX;
    double distY = coinY - marioY;
    double dist = Math.sqrt(distX * distX + distY * distY);
    if (dist < 32) {
      count++;
      coinX = (int) (Math.random() * 1200);
      coinY = (int) (Math.random() * 700);
    }
  }
}
