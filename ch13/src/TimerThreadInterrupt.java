import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.SwingPropertyChangeSupport;

class TimerRunnable implements Runnable {

  private JLabel timerLabel;
  private boolean flag = false;

  TimerRunnable(JLabel timerLabel) {
    this.timerLabel = timerLabel;
  }

  public void finish() {
    flag = true;
  }

  @Override
  public void run() {
    int num = 0;
    while (true) {
      timerLabel.setText("" + num);
      num++;
      try {
        Thread.sleep(1000);
        if (flag) {
          return;
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
        return;
      }
    }
  }
}

public class TimerThreadInterrupt extends JFrame {

  TimerThreadInterrupt() {
    this.setTitle("Thread 연습");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JLabel timerLabel = new JLabel();
    timerLabel.setFont(new Font("맑은 고딕", Font.BOLD, 80));
    TimerRunnable runnable = new TimerRunnable(timerLabel);
    contentPane.add(timerLabel);
    JButton btn = new JButton("timer 종료");
    contentPane.add(btn);
    Thread thread = new Thread(runnable);
    thread.start();
    btn.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("클릭");
          runnable.finish();
        }
      }
    );

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new TimerThreadInterrupt();
  }
}
