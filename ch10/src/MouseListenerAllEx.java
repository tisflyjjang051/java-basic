import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {

  private JLabel label = new JLabel("No Mouse Event");

  public MouseListenerAllEx() {
    this.setTitle("ALL MOUSE EVENT");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.addMouseListener(new MyMouseListener());
    contentPane.addMouseMotionListener(new MyMouseListener());
    contentPane.setLayout(new FlowLayout());
    contentPane.add(label);
    this.setSize(500, 500);
    this.setVisible(true);
  }

  class MyMouseListener implements MouseListener, MouseMotionListener {

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
      label.setText("mouse pressed" + e.getX() + "===" + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      label.setText("mouse released" + e.getX() + "===" + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      Container contentPane = (Container) e.getSource();
      contentPane.setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
      Container contentPane = (Container) e.getSource();
      contentPane.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
      label.setText("mouse dragged" + e.getX() + "===" + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
      label.setText("mouse moved" + e.getX() + "===" + e.getY());
    }
  }

  public static void main(String[] args) {
    new MouseListenerAllEx();
  }
}
