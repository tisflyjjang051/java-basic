import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * PaintFontEx
 */
public class PaintFontEx extends JFrame {

  private MyPanel myPanel = new MyPanel();

  PaintFontEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setContentPane(myPanel);
    this.setSize(500, 500);
    this.setVisible(true);
  }

  class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.BLUE);
      g.drawString("I LOVE JAVA", 30, 30);
      g.setColor(new Color(255, 0, 0));
      g.setFont(new Font("Arial", Font.ITALIC, 30));
      g.drawString("I LOVE JAVA", 30, 70);
      g.setColor(new Color(0x3399cc));
      g.drawString("I LOVE JAVA", 30, 110);
      g.setColor(new Color(0x000000));
      g.drawLine(100, 100, 200, 100);
      g.drawLine(200, 100, 200, 200);
      g.drawLine(200, 200, 100, 200);
      g.drawLine(100, 200, 100, 100);
      g.setColor(new Color(0x99ccff));
      g.fillRect(250, 250, 100, 100);
      g.setColor(new Color(0x66ffcc));
      g.fillOval(250, 50, 100, 200);
      g.setColor(new Color(0x66ffcc));
      g.fillArc(50, 300, 100, 100, 0, 45);
      int x[] = { 30, 10, 30, 60 };
      int y[] = { 250, 300, 400, 300 };
      g.fillPolygon(x, y, 4);
    }
  }

  public static void main(String[] args) {
    new PaintFontEx();
  }
}
