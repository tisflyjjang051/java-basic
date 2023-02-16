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
    JPanel leftPanel = new JPanel();
    JPanel rightPanel = new JPanel();
    JLabel leftTitleLabel = new JLabel("포르쉐");
    JLabel rightTitleLabel = new JLabel("람보르기니");
    JLabel leftLabel = new JLabel(new ImageIcon("ch11/images/car/car01.png"));
    JLabel rightLabel = new JLabel(new ImageIcon("ch11/images/car/car02.png"));
    leftTitleLabel.setHorizontalAlignment(JLabel.CENTER);
    rightTitleLabel.setHorizontalAlignment(JLabel.CENTER);

    leftPanel.setLayout(new BorderLayout());
    rightPanel.setLayout(new BorderLayout());
    leftPanel.add(leftLabel, BorderLayout.NORTH);
    leftPanel.add(leftTitleLabel, BorderLayout.SOUTH);

    rightPanel.add(rightLabel, BorderLayout.NORTH);
    rightPanel.add(rightTitleLabel, BorderLayout.SOUTH);

    mainPanel.add(leftPanel);
    mainPanel.add(rightPanel);

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
    String carTitle[] = {
      "포르쉐",
      "람보르기니",
      "아이오닉",
      "빠른차",
      "더 빠른차",
      "열라 빠른차",
      "진짜 빠른 차",
      "JAVA",
      "HELLO",
      "우르스",
      "모닝",
      "쉐보레",
      "g80",
      "gv70",
      "마이카",
      "너의 카",
    };

    leftLabel.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          rightLabel.setIcon(
            new ImageIcon("ch11/images/car/" + carList[current])
          );
          rightTitleLabel.setText(carTitle[current]);

          current++;
          if (current >= 16) {
            title.setText("당신의 드림카는 " + leftTitleLabel.getText());
            rightPanel.setVisible(false);
            leftLabel.removeMouseListener(this);
          }
        }
      }
    );
    rightLabel.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          leftLabel.setIcon(
            new ImageIcon("ch11/images/car/" + carList[current])
          );
          leftTitleLabel.setText(carTitle[current]);
          current++;
          if (current >= 16) {
            leftPanel.setVisible(false);
            rightLabel.removeMouseListener(this);
            title.setText("당신의 드림카는 " + rightTitleLabel.getText());
          }
        }
      }
    );

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
