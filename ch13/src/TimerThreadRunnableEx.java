import java.awt.*;
import javax.swing.*;

/**
 * TimerThreadRunnableEx
 */

class TimerThreadRunnable implements Runnable {

  private JLabel timerLabel;

  public TimerThreadRunnable(JLabel timerLabel) {
    this.timerLabel = timerLabel;
  }

  @Override
  public void run() {
    int num = 0;
    while (true) {
      timerLabel.setText("" + num);
      num++;
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

public class TimerThreadRunnableEx extends JFrame {

  public TimerThreadRunnableEx() {
    this.setTitle("Thread 연습");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JLabel timerLabel = new JLabel();
    timerLabel.setFont(new Font("맑은 고딕", Font.BOLD, 80));
    contentPane.add(timerLabel);

    TimerThreadRunnable runnable = new TimerThreadRunnable(timerLabel);
    Thread thread = new Thread(runnable);
    thread.start();

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new TimerThreadRunnableEx();
  }
}
