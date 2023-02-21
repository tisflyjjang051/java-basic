import javax.swing.JFrame;

public class Coin extends JFrame {

  Coin() {
    this.setTitle("코인 먹기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GamePanel gamePanel = new GamePanel();
    this.setContentPane(gamePanel);
    this.setVisible(true);
    this.pack();
    this.setResizable(true);
  }

  public static void main(String[] args) {
    new Coin();
  }
}
