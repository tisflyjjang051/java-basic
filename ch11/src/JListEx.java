import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JListEx extends JFrame {

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

  public JListEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JList<String> strList = new JList<>(fruits); // Vector
    strList.setVisibleRowCount(5);
    strList.setFixedCellWidth(100);
    contentPane.add(new JScrollPane(strList));
    JList<ImageIcon> imgList = new JList<>();
    imgList.setListData(images);
    contentPane.add(imgList);
    this.setSize(300, 500);

    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JListEx();
  }
}
