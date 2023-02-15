package openChallenge;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame {

  private JLabel label[] = new JLabel[3];
  private JLabel resultLabel = new JLabel("시작합니다.");

  public Game() {
    this.setTitle("카지노");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.addKeyListener(
      new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            // System.out.println("enter");
            // random하게 값을 뽑아서 label에 표시하기...
            int num01 = (int) (Math.random() * 5);
            int num02 = (int) (Math.random() * 5);
            int num03 = (int) (Math.random() * 5);
            label[0].setText("" + num01);
            label[1].setText("" + num02);
            label[2].setText("" + num03);
            if (num01 == num02 && num02 == num03) {
              resultLabel.setText("축하합니다.");
            } else {
              resultLabel.setText("아쉽습니다.");
            }
          }
        }
      }
    );
    contentPane.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          Container contentPane = (Container) e.getSource();
          contentPane.requestFocus();
        }
      }
    );
    contentPane.setLayout(null);
    for (int i = 0; i < 3; i++) {
      label[i] = new JLabel("0");
      label[i].setSize(100, 50);
      label[i].setLocation(75 + 110 * i, 80);
      label[i].setOpaque(true);
      label[i].setBackground(Color.MAGENTA);
      label[i].setForeground(Color.YELLOW);
      label[i].setHorizontalAlignment(JLabel.CENTER);
      label[i].setFont(new Font("Arial", Font.BOLD, 36));
      contentPane.add(label[i]);
    }
    resultLabel.setSize(500, 50);
    resultLabel.setLocation(0, 200);
    resultLabel.setHorizontalAlignment(JLabel.CENTER);
    resultLabel.setFont(new Font("돋움", Font.BOLD, 24));
    contentPane.add(resultLabel);
    this.setSize(500, 300);
    this.setVisible(true);
    this.setFocusable(true);
    this.requestFocus();
  }

  public static void main(String[] args) {
    new Game();
  }
}
