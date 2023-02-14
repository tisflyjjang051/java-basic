import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {

  public GridLayoutEx() {
    setTitle("GRID LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(4, 3, 10, 10));
    contentPane.add(new JButton("1"));
    contentPane.add(new JButton("2"));
    contentPane.add(new JButton("3"));
    contentPane.add(new JButton("4"));
    contentPane.add(new JButton("5"));
    contentPane.add(new JButton("6"));
    contentPane.add(new JButton("7"));
    contentPane.add(new JButton("8"));
    contentPane.add(new JButton("9"));
    contentPane.add(new JButton("0"));
  }

  public static void main(String[] args) {
    new GridLayoutEx();
  }
}
