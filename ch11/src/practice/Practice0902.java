package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice0902 extends JFrame {

  private JLabel choiceYour;
  private JLabel choiceOppo;
  private JLabel choiceWinn;
  private JButton[] r_s_p = new JButton[3];

  private ImageIcon scissor = new ImageIcon("ch11/images/scissors.png");
  private ImageIcon rock = new ImageIcon("ch11/images/rock.png");
  private ImageIcon paper = new ImageIcon("ch11/images/paper.png");

  public Practice0902() {
    setTitle("연습문제 9번 638p");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 400);
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    JPanel selectPanel = new JPanel();
    JPanel resultPanel = new JPanel();
    selectPanel.setLayout(new FlowLayout());
    selectPanel.setBackground(new Color(70, 60, 60));
    resultPanel.setLayout(new FlowLayout());
    resultPanel.setBackground(new Color(160, 160, 100));

    // r_s_p[0] = new JButton("가위");
    // r_s_p[1] = new JButton("바위");
    // r_s_p[2] = new JButton("보");
    r_s_p[0] = new JButton(scissor);
    r_s_p[1] = new JButton(rock);
    r_s_p[2] = new JButton(paper);
    StartR_S_P event = new StartR_S_P();
    for (JButton item : r_s_p) {
      item.setSize(100, 100);
      item.addActionListener(event);
      selectPanel.add(item);
    }
    choiceYour = new JLabel("");
    choiceOppo = new JLabel("");
    choiceWinn = new JLabel("승자는 누구?");
    choiceWinn.setFont(new Font("돋움", Font.BOLD, 20));
    choiceWinn.setHorizontalAlignment(JLabel.CENTER);

    resultPanel.add(new JLabel("당신의 선택"));
    resultPanel.add(choiceYour);
    resultPanel.add(new JLabel("컴퓨터의 선택"));
    resultPanel.add(choiceOppo);

    contentPane.add(selectPanel, BorderLayout.NORTH);
    contentPane.add(resultPanel, BorderLayout.CENTER);
    contentPane.add(choiceWinn, BorderLayout.SOUTH);
    setVisible(true);
  }

  class StartR_S_P implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      int resultOppo = (int) (Math.random() * 3);
      int resultYour = 0;
      if (e.getSource() == r_s_p[0]) {
        resultYour = 0;
      }
      if (e.getSource() == r_s_p[1]) {
        resultYour = 1;
      }
      if (e.getSource() == r_s_p[2]) {
        resultYour = 2;
      }

      // choiceOppo.setText(choice(resultOppo));
      // choiceYour.setText(choice(resultYour));
      choiceOppo.setIcon(choice(resultOppo));
      choiceYour.setIcon(choice(resultYour));
      if (resultOppo == resultYour) {
        choiceWinn.setText("무승부!!");
      }
      if (
        (resultOppo == 0 && resultYour == 2) ||
        (resultOppo == 1 && resultYour == 0) ||
        (resultOppo == 2 && resultYour == 1)
      ) {
        choiceWinn.setText("컴퓨터의 승리!!");
      }
      if (
        (resultOppo == 0 && resultYour == 1) ||
        (resultOppo == 1 && resultYour == 2) ||
        (resultOppo == 2 && resultYour == 0)
      ) {
        choiceWinn.setText("당신의 승리!!");
      }
    }

    // private String choice(int _num) {
    //   String result = "";
    //   switch (_num) {
    //     case 0:
    //       result = "가위";
    //       break;
    //     case 1:
    //       result = "바위";
    //       break;
    //     case 2:
    //       result = "보";
    //       break;
    //   }
    //   return result;
    // }
    private Icon choice(int _num) {
      Icon result = scissor;
      switch (_num) {
        case 0:
          result = scissor;
          break;
        case 1:
          result = rock;
          break;
        case 2:
          result = paper;
          break;
      }
      return result;
    }
  }

  public static void main(String[] args) {
    new Practice0902();
  }
}
