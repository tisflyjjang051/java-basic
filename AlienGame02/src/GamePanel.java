import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

  // 그림 그리기...
  private Image bufferImage;
  private Graphics screenGraphics;

  private Image loadingImage = new ImageIcon(
    "AlienGame02/images/loading_page.jpg"
  )
    .getImage();
  private Image startImage = new ImageIcon("AlienGame02/images/start_page.jpg")
    .getImage();

  private Game game;

  private String isState = "start";

  GamePanel() {
    this.setPreferredSize(new Dimension(1200, 800));
    this.setOpaque(true);
    this.setBackground(Color.BLACK);
    gameInit();
  }

  public void gameInit() {
    game = new Game();
    this.setFocusable(true);
    this.requestFocus();
    this.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {}

          @Override
          public void keyReleased(KeyEvent e) {
            switch (e.getKeyCode()) {
              case KeyEvent.VK_LEFT:
                game.isLeft = false;
                break;
              case KeyEvent.VK_RIGHT:
                game.isRight = false;
                break;
              case KeyEvent.VK_UP:
                game.isUp = false;
                break;
              case KeyEvent.VK_DOWN:
                game.isDown = false;
                break;
              case KeyEvent.VK_SPACE:
                game.isShoot = false;
                break;
            }
          }

          @Override
          public void keyPressed(KeyEvent e) {
            // System.out.println(e.getKeyCode());
            switch (e.getKeyCode()) {
              case KeyEvent.VK_LEFT:
                game.isLeft = true;
                break;
              case KeyEvent.VK_RIGHT:
                game.isRight = true;
                break;
              case KeyEvent.VK_UP:
                game.isUp = true;
                break;
              case KeyEvent.VK_DOWN:
                game.isDown = true;
                break;
              case KeyEvent.VK_SPACE:
                game.isShoot = true;
                break;
              case KeyEvent.VK_ESCAPE:
                System.exit(0);
                break;
              case KeyEvent.VK_R:
                //game = new Game();
                //game.isOver= false;
                if (game.isOver) isState = "start";
                break;
              case KeyEvent.VK_ENTER:
                if (isState == "start") {
                  startGame();
                }
                break;
            }
          }
        }
      );
  }

  private void startGame() {
    isState = "loading";
    Timer loadingTimer = new Timer();
    TimerTask loadingTimerTask = new TimerTask() {
      @Override
      public void run() {
        isState = "gaming";
        game = new Game();
      }
    };
    loadingTimer.schedule(loadingTimerTask, 3000);
  }

  public void paintComponent(Graphics g) {
    // double buffering
    // 1. 버퍼 이미지 생성하고
    // 2. 메모리에 올리기
    // 3. graphics 가 그리기...
    bufferImage = this.createImage(1200, 800);
    screenGraphics = bufferImage.getGraphics();
    screenCapture(screenGraphics);
    g.drawImage(bufferImage, 0, 0, null);
  }

  public void screenCapture(Graphics g) {
    if (isState.equals("start")) {
      g.drawImage(startImage, 0, 0, null);
    } else if (isState.equals("loading")) {
      g.drawImage(loadingImage, 0, 0, null);
    } else {
      game.drawAll(g);
    }
    repaint();
  }
}
