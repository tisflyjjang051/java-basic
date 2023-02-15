import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DreamCar extends JFrame {

  private int current = 2;

  public DreamCar() {
    this.setTitle("당신이 꿈꾸는 드림카~~~");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new BorderLayout());

    JLabel title = new JLabel(
      "당신이 꿈꾸는 드림카 16강 원하는 자동차를 클릭해 주세요."
    );
    title.setFont(new Font("나눔스퀘어", Font.BOLD, 24));
    title.setHorizontalAlignment(JLabel.CENTER);

    JPanel mainPanel = new JPanel();
    JLabel leftLabel = new JLabel(new ImageIcon("ch11/images/car/car01.png"));
    JLabel rightLabel = new JLabel(new ImageIcon("ch11/images/car/car02.png"));
    String carList[] = {
      "car01.png",
      "car02.png",
      "car03.png",
      "car04.png",
      "car05.png",
      "car06.png",
      "car07.png",
      "car08.png",
      "car09.png",
      "car10.png",
      "car11.png",
      "car12.png",
      "car13.png",
      "car14.png",
      "car15.png",
      "car16.png",
    };
    leftLabel.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          rightLabel.setIcon(
            new ImageIcon("ch11/images/car/" + carList[current])
          );
          current++;
        }
      }
    );
    rightLabel.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          leftLabel.setIcon(
            new ImageIcon("ch11/images/car/" + carList[current])
          );
          current++;
        }
      }
    );

    mainPanel.add(leftLabel);
    mainPanel.add(rightLabel);

    contentPane.add(title, BorderLayout.NORTH);
    contentPane.add(mainPanel, BorderLayout.CENTER);

    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new DreamCar();
  }
}
