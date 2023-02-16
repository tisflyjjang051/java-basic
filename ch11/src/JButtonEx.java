import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonEx extends JFrame {

  public JButtonEx() {
    ImageIcon imgIcon = new ImageIcon("ch11/images/heart.png");
    ImageIcon imgOverIcon = new ImageIcon("ch11/images/heart-over.png");
    ImageIcon imgPressIcon = new ImageIcon("ch11/images/heart-press.png");
    JButton btn = new JButton("button");
    JButton imgBtn = new JButton(imgIcon);
    imgBtn.setBorderPainted(false);
    imgBtn.setContentAreaFilled(false);
    imgBtn.setFocusPainted(false);
    imgBtn.setPressedIcon(imgPressIcon);
    imgBtn.setRolloverIcon(imgOverIcon);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(btn);
    contentPane.add(imgBtn);

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JButtonEx();
  }
}
