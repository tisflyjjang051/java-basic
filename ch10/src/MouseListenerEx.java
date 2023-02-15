import java.awt.Container;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * MouseListenerEx
 */
public class MouseListenerEx extends JFrame {

  private JLabel label = new JLabel("Hello");

  public MouseListenerEx() {
    this.setTitle("Action Event");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.addMouseListener(new MyMouseListener());
    contentPane.setLayout(null);
    label.setLocation(100, 100);
    label.setSize(50, 20);
    contentPane.add(label);
    this.setSize(300, 300);
    this.setVisible(true);
  }

  class MyMouseListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      label.setLocation(x, y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
  }

  public static void main(String[] args) {
    new MouseListenerEx();
  }
}
