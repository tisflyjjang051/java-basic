import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawLineEx extends JFrame {

  private MyPanel myPanel = new MyPanel();

  DrawLineEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(myPanel);
    this.setSize(500, 500);
    this.setVisible(true);
  }

  class MyPanel extends JPanel {

    private Vector<Point> vStart = new Vector<>();
    private Vector<Point> vEnd = new Vector<>();
    private boolean isPressed = false;

    MyPanel() {
      vStart.add(new Point(100, 100));
      vStart.add(new Point(300, 150));
      vStart.add(new Point(200, 450));
      vEnd.add(new Point(200, 200));
      vEnd.add(new Point(200, 200));
      vEnd.add(new Point(200, 200));
      this.addMouseMotionListener(
          new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {}

            public void mouseDragged(MouseEvent e) {}
          }
        );
      this.addMouseListener(
          new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              Point startPoint = e.getPoint();
              vStart.add(startPoint);
              isPressed = true;
            }

            public void mouseReleased(MouseEvent e) {
              Point endPoint = e.getPoint();
              vEnd.add(endPoint);
              isPressed = false;
              repaint();
            }
          }
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.RED);
      for (int i = 0; i < vStart.size(); i++) {
        Point start = vStart.elementAt(i);
        Point end = vEnd.elementAt(i);
        g.drawLine(
          (int) start.getX(),
          (int) start.getY(),
          (int) end.getX(),
          (int) end.getY()
        );
      }
    }
  }

  public static void main(String[] args) {
    new DrawLineEx();
  }
}
