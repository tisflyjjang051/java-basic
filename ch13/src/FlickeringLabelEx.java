import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {

  private int delay;

  public FlickeringLabel(String txt, int delay) {
    super(txt);
    this.delay = delay;
    this.setOpaque(true);
    Thread thread = new Thread(this);
    thread.start();
  }

  @Override
  public void run() {
    int num = 0;
    while (true) {
      if (num % 2 == 0) {
        setBackground(Color.YELLOW);
      } else {
        setBackground(Color.GREEN);
      }
      num++;
      try {
        Thread.sleep(delay);
      } catch (Exception e) {
        e.printStackTrace();
        return;
      }
    }
  }
}

public class FlickeringLabelEx extends JFrame {

  FlickeringLabelEx() {
    this.setTitle("Thread 연습");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    FlickeringLabel fLabel = new FlickeringLabel("깜빡", 500);
    JLabel label = new JLabel("나는 안깜빡");
    FlickeringLabel fLabel02 = new FlickeringLabel("깜빡", 300);
    contentPane.add(fLabel);
    contentPane.add(label);
    contentPane.add(fLabel02);

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new FlickeringLabelEx();
  }
}
