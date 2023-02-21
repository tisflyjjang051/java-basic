import java.awt.*;
import javax.swing.*;

class Shaking extends JLabel implements Runnable {

  private int x = 100;
  private int y = 100;
  private boolean state = false;

  Shaking() {
    Thread thread = new Thread(this);
    thread.start();
  }

  @Override
  public void run() {
    while (true) {
      setText("진동 레이블");
      setSize(80, 20);
      state = !state;
      if (state) {
        setLocation(100, 100);
      } else {
        setLocation(90, 90);
      }
      try {
        Thread.sleep(100);
      } catch (Exception e) {
        e.printStackTrace();
        return;
      }
    }
  }
}

public class ShakingEx extends JFrame {

  ShakingEx() {
    this.setTitle("글자 흔들기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(null);
    Shaking sk = new Shaking();
    contentPane.add(sk);

    this.setContentPane(sk);

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new ShakingEx();
  }
}
