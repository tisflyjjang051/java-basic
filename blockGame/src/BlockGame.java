import javax.swing.JFrame;

public class BlockGame extends JFrame {

  BlockGame() {
    this.setTitle("벽돌깨기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GamePanel gamePanel = new GamePanel();
    this.setContentPane(gamePanel);
    this.setVisible(true);
    this.pack();
    this.setResizable(false);
  }

  public static void main(String[] args) {
    new BlockGame();
  }
}
