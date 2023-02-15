import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {

  public JComponentEx() {
    this.setTitle("JComponent Common Method");
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    JButton btn01 = new JButton("bg:Magenta / color:Yellow");
    btn01.setBackground(Color.MAGENTA);
    btn01.setForeground(Color.YELLOW);
    btn01.setFont(new Font("Arial", Font.PLAIN, 20));
    JButton btn02 = new JButton("Disable Button");
    btn02.setEnabled(false);
    btn02.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("click");
        }
      }
    );
    JButton btn03 = new JButton("TopLeventAncestor");
    btn03.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          JButton btn = (JButton) e.getSource();
          JComponentEx frame = (JComponentEx) btn.getTopLevelAncestor();
          frame.setTitle(btn.getX() + "===" + btn.getY());
          System.out.println(btn.getX() + "===" + btn.getY());
        }
      }
    );
    contentPane.add(btn01);
    contentPane.add(btn02);
    contentPane.add(btn03);
    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JComponentEx();
  }
}
