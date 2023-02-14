import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {

  private JLabel label = new JLabel("hello");

  public MouseListenerEx() {
    this.setTitle("Mouse Event 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(null);
    label.setLocation(100, 100);
    label.setSize(50, 20);
    contentPane.add(label);
    contentPane.addMouseListener(null);
    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new MouseListenerEx();
  }
}
