import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Game implements Runnable {

  public int threadDelay = 20; // 전체 화면 렌더링 속도.. 0.02
  public Player player = new Player(600, 700, 100); // player 생성
  public boolean isLeft = false;
  public boolean isRight = false;
  public boolean isUp = false;
  public boolean isDown = false;
  public boolean isShoot = false;

  private int count = 0;
  private int bulletDelay = 2;
  private int enemyDelay = 10;

  public PlayerBullet playerBullet;
  public int playerBulletDamage = 10;

  public Enemy enemy;
  private String enemyImageList[] = { "ufo01", "ufo02", "ufo03" };

  public ArrayList<PlayerBullet> playerBulletList = new ArrayList<>();
  public ArrayList<Enemy> enemyList = new ArrayList<>();

  public boolean isOver = false;
  private Thread th;
  private Image gameImage = new ImageIcon("AlienGame02/images/game_page.jpg")
    .getImage();
  private Image endingImage = new ImageIcon(
    "AlienGame02/images/ending_page.jpg"
  )
    .getImage();

  // space 키누르면 총알 생성해서 playerBulletList에 집어넣기....

  public Game() {
    isOver = false;
    playerBulletList.clear();
    enemyList.clear();
    count = 0;
    th = new Thread(this);
    th.start(); // thread 시작....
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(threadDelay);
      } catch (InterruptedException e) {
        // e.printStackTrace();
        return;
      }
      // 여기다가 움직임 제어.
      // 키를 누르면 player움직이기...
      count++;
      keyProcess(); // player 움직이기...
      playerBulletProcess();
      makeEnemy();
      enemyProcess();
    }
  }

  private void makeEnemy() {
    if (count % enemyDelay == 0) {
      String enemyImage = enemyImageList[(int) (Math.random() * 3)];
      int randomX = (int) (Math.random() * 800 + 200);
      enemy = new Enemy(randomX, -64, 30, enemyImage);
      enemyList.add(enemy);
    }
    // enemy.moveDown();
  }

  public void enemyProcess() {
    for (int i = 0; i < enemyList.size(); i++) {
      enemy = enemyList.get(i);
      enemy.moveDown();

      if (
        hitEnemy(
          new Rectangle(player.x, player.y, player.width, player.height),
          new Rectangle(enemy.x, enemy.y, enemy.width, enemy.height)
        )
      ) {
        enemyList.remove(enemy);
        player.hp -= enemy.damage;
        if (player.hp <= 0) {
          isOver = true;
          interrupt(); // Thread 종료
        }
      }
      if (enemy.y > 800 + 64) {
        player.hp -= enemy.damage; // 바닥에 충돌하면 damage깍임
        enemyList.remove(enemy);
        if (player.hp <= 0) {
          isOver = true;
          interrupt(); // Thread 종료
        }
      }
    }
  }

  public void playerBulletProcess() {
    for (int i = 0; i < playerBulletList.size(); i++) {
      playerBullet = playerBulletList.get(i);
      playerBullet.shoot();

      for (int j = 0; j < enemyList.size(); j++) {
        enemy = enemyList.get(j);
        if (
          hitEnemy(
            new Rectangle(
              playerBullet.x,
              playerBullet.y,
              playerBullet.width,
              playerBullet.height
            ),
            new Rectangle(enemy.x, enemy.y, enemy.width, enemy.height)
          )
        ) {
          playerBulletList.remove(playerBullet);
          enemy.hp -= playerBullet.damage;
        }
        if (enemy.hp <= 0) {
          enemyList.remove(enemy);
        }
      }

      if (playerBullet.y < -17) {
        playerBulletList.remove(playerBullet);
      }
    }
  }

  public void keyProcess() {
    if (isLeft) player.moveLeft();
    if (isRight) player.moveRight();
    if (isUp) player.moveUp();
    if (isDown) player.moveDown();
    if (isShoot && count % bulletDelay == 0) {
      playerBullet =
        new PlayerBullet(player.x + 27, player.y - 17, playerBulletDamage);
      playerBulletList.add(playerBullet);
    }
  }

  public boolean hitEnemy(Rectangle rect01, Rectangle rect02) {
    return rect01.intersects(rect02);
  }

  public void drawPlayer(Graphics g) {
    // 비행기 그리기....
    g.drawImage(player.image, player.x, player.y, null);
  }

  public void drawPlayerBullet(Graphics g) {
    for (int i = 0; i < playerBulletList.size(); i++) {
      playerBullet = playerBulletList.get(i);
      g.drawImage(playerBullet.image, playerBullet.x, playerBullet.y, null);
    }
  }

  public void drawEnemy(Graphics g) {
    for (int i = 0; i < enemyList.size(); i++) {
      enemy = enemyList.get(i);
      g.drawImage(enemy.image, enemy.x, enemy.y, null);
    }
  }

  public void drawInfo(Graphics g) {
    // player 정보
    g.setColor(Color.WHITE);
    g.setFont(new Font("Arial", Font.BOLD, 24));
    g.drawString("HP : " + player.hp, 30, 30);

    g.setColor(Color.WHITE);
    g.fillRect(130, 17, 300, 5);
    g.setColor(Color.RED);
    g.fillRect(130, 17, 300 * player.hp / 100, 5);

    g.setFont(new Font("Arial", Font.BOLD, 18));
    for (int i = 0; i < enemyList.size(); i++) {
      enemy = enemyList.get(i);
      // g.draw(""+enemy.hp,enemy.x+20,enemy.y-20);
      g.setColor(Color.WHITE);
      g.fillRect(enemy.x, enemy.y - 20, 64, 4);
      g.setColor(Color.RED);
      g.fillRect(enemy.x, enemy.y - 20, enemy.width * enemy.hp / 30, 4);
    }
  }

  public void drawEnding(Graphics g) {
    g.drawImage(endingImage, 0, 0, null);
  }

  public void drawGaming(Graphics g) {
    g.drawImage(gameImage, 0, 0, null);
  }

  public void drawAll(Graphics g) {
    if (isOver) drawEnding(g); else {
      drawGaming(g);
      drawPlayer(g);
      drawPlayerBullet(g);
      drawEnemy(g);
      drawInfo(g);
    }
  }
}
