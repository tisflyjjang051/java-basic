import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

  public MyFrame() {
    setTitle("300 X 300으로 스윙 프레임 만들기");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // 받기 버튼 눌었을때 메모리상에서 삭제
    setSize(300, 300);
    setVisible(true);

    Container contentPane = getContentPane(); // 기본 컨테이너 생략 가능
    contentPane.setLayout(new FlowLayout());
    contentPane.add(new JButton("OK"));
    contentPane.add(new JButton("CANCEL"));
    contentPane.add(new JButton("IGNORE"));
    contentPane.add(new JButton("IGNORE"));
    contentPane.add(new JButton("IGNORE"));
    contentPane.add(new JButton("IGNORE"));
    // JFrame은 기본적으로 Container를 하나 들고 있음...
    // Component는 Container에 포함되어야 한다.
  }

  public static void main(String[] args) {
    MyFrame myFrame = new MyFrame();
  }
}
