import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame {

  private JLabel label = new JLabel("hello");

  public MouseAdapterEx() {
    this.setTitle("MouseAdapter");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.addMouseListener(new MyMouseAdapter());
    contentPane.setLayout(null);
    label.setLocation(100, 100);
    label.setSize(50, 20);
    contentPane.add(label);
    this.setSize(300, 300);
    this.setVisible(true);
  }

  class MyMouseAdapter extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
      System.out.println("mouseAdapter로 연결");
      int x = e.getX();
      int y = e.getY();
      label.setLocation(x, y);
    }
  }

  public static void main(String[] args) {
    new MouseAdapterEx();
  }
}
