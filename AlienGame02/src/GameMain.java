import java.awt.Color;
import javax.swing.JFrame;

public class GameMain extends JFrame {

  public GameMain() {
    this.setTitle("Alien Game");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);

    GamePanel gamePanel = new GamePanel();
    this.setContentPane(gamePanel);

    //this.setLocationRelativeTo(null); //화면 중앙에 띄우기
    this.setVisible(true);
    this.pack(); // 크기를 내가 정하는게 아니라...
  }

  public static void main(String[] args) {
    new GameMain();
  }
}
