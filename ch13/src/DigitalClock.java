import java.awt.*;
import java.util.Calendar;
import javax.swing.*;

class ClockLabel extends JLabel implements Runnable {

  private Thread thread;

  ClockLabel() {
    this.setText("시간이 노출 되는 곳");
    this.setFont(new Font("맑은 고딕", Font.BOLD, 48));
    thread = new Thread(this);
    thread.start();
  }

  @Override
  public void run() {
    while (true) {
      // 여기에 1초마다 한번씩 실행할 코드 작성
      Calendar cal = Calendar.getInstance(); // 달력구해옴...
      int hour = cal.get(Calendar.HOUR_OF_DAY);
      int min = cal.get(Calendar.MINUTE);
      int sec = cal.get(Calendar.SECOND);
      setText(hour + ":" + min + ":" + sec);
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        e.printStackTrace();
        return;
      }
    }
  }
}

public class DigitalClock extends JFrame {

  DigitalClock() {
    this.setTitle("시계");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.add(new ClockLabel());

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new DigitalClock();
  }
}
