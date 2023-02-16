package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice0903 extends JFrame {

  public Practice0903() {
    this.setTitle("가위 바위 보 게임");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new BorderLayout());

    JButton btn1 = new JButton(new ImageIcon("ch11/images/rock.png"));
    JButton btn2 = new JButton(new ImageIcon("ch11/images/paper.png"));
    JButton btn3 = new JButton(new ImageIcon("ch11/images/scissors.png"));

    JLabel ME = new JLabel(" me    ");
    ME.setFont(new Font("나눔스퀘어", Font.BOLD, 24));
    JLabel COM = new JLabel(" com ");
    COM.setFont(new Font("나눔스퀘어", Font.BOLD, 24));
    JLabel Result_Label = new JLabel("");
    Result_Label.setFont(new Font("나눔스퀘어", Font.BOLD, 24));
    Result_Label.setForeground(Color.RED);
    JPanel mainPanel = new JPanel();
    JPanel topPanel = new JPanel();
    JLabel leftLabel = new JLabel(new ImageIcon("ch11/images/rock.png"));
    JLabel rightLabel = new JLabel(new ImageIcon("ch11/images/paper.png"));
    String imgList[] = { "rock.png", "paper.png", "scissors.png" };
    btn1.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          int com = (int) (Math.random() * 3);
          leftLabel.setIcon(new ImageIcon("ch11/images/" + imgList[0]));
          rightLabel.setIcon(new ImageIcon("ch11/images/" + imgList[com]));
          if (com == 0) {
            Result_Label.setText("   Same!!   ");
          } else if (com == 1) {
            Result_Label.setText("   Com WIN!!");
          } else {
            Result_Label.setText("   Me WIN!! ");
          }
        }
      }
    );
    btn2.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          int com = (int) (Math.random() * 3);
          leftLabel.setIcon(new ImageIcon("ch11/images/" + imgList[1]));
          rightLabel.setIcon(new ImageIcon("ch11/images/" + imgList[com]));
          if (com == 0) {
            Result_Label.setText("   Me WIN!! ");
          } else if (com == 1) {
            Result_Label.setText("   Same!!   ");
          } else {
            Result_Label.setText("   Com WIN!!");
          }
        }
      }
    );
    btn3.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          int com = (int) (Math.random() * 3);
          leftLabel.setIcon(new ImageIcon("ch11/images/" + imgList[2]));
          rightLabel.setIcon(new ImageIcon("ch11/images/" + imgList[com]));
          if (com == 0) {
            Result_Label.setText("   Com WIN!!");
          } else if (com == 1) {
            Result_Label.setText("   Me WIN!! ");
          } else {
            Result_Label.setText("   Same!!   ");
          }
        }
      }
    );

    mainPanel.setBackground(Color.YELLOW);
    mainPanel.add(leftLabel);
    mainPanel.add(ME);
    mainPanel.add(rightLabel);
    mainPanel.add(COM);
    mainPanel.add(Result_Label);
    topPanel.setLayout(new FlowLayout());
    topPanel.setBackground(Color.gray);
    topPanel.add(btn1);
    topPanel.add(btn2);
    topPanel.add(btn3);
    contentPane.add(topPanel, BorderLayout.NORTH);
    contentPane.add(mainPanel, BorderLayout.SOUTH);

    this.setSize(1000, 580);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setResizable(false);
  }

  public static void main(String[] args) {
    new Practice0903();
  }
}
