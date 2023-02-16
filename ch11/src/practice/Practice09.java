package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice09 extends JFrame {

  Container contentPane = this.getContentPane();
  JPanel fights = new JPanel();
  JPanel options = new JPanel();
  JLabel computer;
  JLabel mine;
  JLabel judge;
  JLabel[] imgLabel = new JLabel[3];

  String gameImage[] = {
    "ch11/images/rock.png",
    "ch11/images/scissors.png",
    "ch11/images/paper.png",
  };
  String judgeMsg[] = { "ME!!!", "Computer!!!!", "Same!!!!" };

  class MyMouseListener implements MouseListener {

    public void mouseClicked(MouseEvent e) {
      JLabel jl = (JLabel) e.getSource();
      int randomNum = (int) (Math.random() * 3);

      //mine = jl;
      computer = new JLabel(new ImageIcon(gameImage[randomNum]));

      if (jl == imgLabel[0]) {
        System.out.println("바위" + randomNum);
        mine = new JLabel(new ImageIcon(gameImage[0]));
        if (randomNum == 0) {
          //System.out.println("비김");
          judge = new JLabel(judgeMsg[2]);
        } else if (randomNum == 1) {
          //System.out.println("이김");
          judge = new JLabel(judgeMsg[0]);
        } else if (randomNum == 2) {
          //System.out.println("짐");
          judge = new JLabel(judgeMsg[1]);
        }
      } else if (jl == imgLabel[1]) {
        System.out.println("가위" + randomNum);
        mine = new JLabel(new ImageIcon(gameImage[1]));
        if (randomNum == 0) {
          //System.out.println("짐");
          judge = new JLabel(judgeMsg[1]);
        } else if (randomNum == 1) {
          //System.out.println("비김");
          judge = new JLabel(judgeMsg[2]);
        } else if (randomNum == 2) {
          //System.out.println("이김");
          judge = new JLabel(judgeMsg[0]);
        }
      } else if (jl == imgLabel[2]) {
        System.out.println("보" + randomNum);
        mine = new JLabel(new ImageIcon(gameImage[2]));
        if (randomNum == 0) {
          //System.out.println("이김");
          judge = new JLabel(judgeMsg[0]);
        } else if (randomNum == 1) {
          //System.out.println("짐");
          judge = new JLabel(judgeMsg[1]);
        } else if (randomNum == 2) {
          //System.out.println("비김");
          judge = new JLabel(judgeMsg[2]);
        }
      }

      fights.removeAll();

      fights.add(mine);
      fights.add(computer);
      fights.add(judge);

      contentPane.add(fights, BorderLayout.CENTER);
      setSize(800, 600);
      setVisible(true);
    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}
  }

  public Practice09() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    options.setLayout(new FlowLayout());
    fights.setLayout(new FlowLayout());
    options.setBackground(Color.gray);
    fights.setBackground(Color.YELLOW);

    for (int i = 0; i < gameImage.length; i++) {
      imgLabel[i] = new JLabel(new ImageIcon(gameImage[i]));
      options.add(imgLabel[i]);
      imgLabel[i].addMouseListener(new MyMouseListener());
    }

    contentPane.add(options, BorderLayout.NORTH);
    contentPane.add(fights, BorderLayout.CENTER);

    this.setSize(800, 600);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice09();
  }
}
