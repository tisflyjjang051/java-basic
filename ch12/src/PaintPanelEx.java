import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintPanelEx extends JFrame {

  private MyPanel myPanel = new MyPanel();

  public PaintPanelEx() {
    this.setTitle("paingComponent");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(myPanel);
    this.setSize(300, 300);
    this.setVisible(true);
  }

  class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.BLUE);
      g.drawRect(10, 10, 50, 50);
      g.drawRect(50, 50, 50, 50);
      g.setColor(Color.MAGENTA);
      g.drawRect(90, 90, 50, 50);
    }
  }

  public static void main(String[] args) {
    new PaintPanelEx();
  }
}
