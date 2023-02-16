import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxEx extends JFrame {

  private String fruits[] = {
    "apple",
    "banana",
    "kiwi",
    "orange",
    "melon",
    "apple",
    "banana",
    "kiwi",
    "orange",
    "melon",
  };
  private ImageIcon images[] = {
    new ImageIcon("ch11/images/heart.png"),
    new ImageIcon("ch11/images/heart.png"),
    new ImageIcon("ch11/images/heart.png"),
    new ImageIcon("ch11/images/heart.png"),
  };

  public JComboBoxEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JComboBox<String> strComboBox = new JComboBox<>(fruits); // Vector
    contentPane.add(strComboBox);
    this.setSize(300, 500);

    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JComboBoxEx();
  }
}
