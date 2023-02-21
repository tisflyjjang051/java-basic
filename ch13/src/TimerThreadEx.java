import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {

  // 카운트 증가...
  private JLabel timerLabel;

  public TimerThread(JLabel timerLabel) {
    this.timerLabel = timerLabel;
  }

  @Override
  public void run() {
    int num = 0;
    while (true) {
      timerLabel.setText("" + num);
      num++;
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

public class TimerThreadEx extends JFrame {

  public TimerThreadEx() {
    this.setTitle("Thread 연습");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JLabel timerLabel = new JLabel();
    timerLabel.setFont(new Font("맑은 고딕", Font.BOLD, 80));
    contentPane.add(timerLabel);

    TimerThread thread = new TimerThread(timerLabel);
    thread.start();

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new TimerThreadEx();
  }
}
