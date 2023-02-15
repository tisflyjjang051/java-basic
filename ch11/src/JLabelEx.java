import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelEx extends JFrame {

  public JLabelEx() {
    this.setTitle("JComponent Common Method");
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JLabel txtLabel = new JLabel("I LOVE YOU");
    ImageIcon imgIcon = new ImageIcon("ch11/images/heart.png");
    JLabel imgLabel = new JLabel(new ImageIcon("ch11/images/heart.png"));
    JLabel imgLabel02 = new JLabel(imgIcon);
    JLabel imgLabel03 = new JLabel(
      "심장이 바운스 바운스~~",
      imgIcon,
      SwingConstants.CENTER
    );

    contentPane.add(txtLabel);
    contentPane.add(imgLabel);
    contentPane.add(imgLabel02);
    contentPane.add(imgLabel03);

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JLabelEx();
  }
}
