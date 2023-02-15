import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDobleClickEx extends JFrame {

  public MouseDobleClickEx() {
    this.setTitle("더블클릭하면 배경색이 바뀝니다.");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.addMouseListener(new MyMouseListener());
    this.setSize(300, 300);
    this.setVisible(true);
  }

  class MyMouseListener extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {
      System.out.println(e.getClickCount());
      if (e.getClickCount() == 2) {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        Container contentPane = (Container) e.getSource();
        contentPane.setBackground(new Color(r, g, b));
      }
    }
  }

  public static void main(String[] args) {
    new MouseDobleClickEx();
  }
}
