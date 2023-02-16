import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Practice extends JFrame {

  private int count = 2;

  public Practice() {
    String foodList[] = {
      "01.png",
      "02.png",
      "03.png",
      "04.png",
      "05.png",
      "06.png",
      "07.png",
      "08.png",
      "09.png",
      "10.png",
      "11.png",
      "12.png",
    };
    String foodNameList[] = {
      "Chicken Rice",
      "Sugar Doughnut",
      "Fried Potato",
      "Grilled Chicken",
      "Hamburger",
      "Unfinished Pot",
      "Pizza",
      "Ramen",
      "Spaghetti",
      "Steak with Vegitables",
      "Tom Yang Kum",
      "Raw Vegitables",
    };

    this.setTitle("제목");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cp = this.getContentPane();
    cp.setLayout(new BorderLayout());
    JLabel title = new JLabel("Which one do you prefer?");
    title.setFont(new Font("돋움", Font.BOLD, 24));
    title.setHorizontalAlignment(JLabel.CENTER);
    JPanel main = new JPanel();
    ImageIcon leftPic = new ImageIcon("namjin/images/" + foodList[0]);
    ImageIcon rightPic = new ImageIcon("namjin/images/" + foodList[1]);

    JLabel left = new JLabel(foodNameList[0], leftPic, SwingConstants.CENTER);
    left.setHorizontalTextPosition(JLabel.CENTER);
    left.setVerticalTextPosition(JLabel.BOTTOM);
    JLabel right = new JLabel(foodNameList[1], rightPic, SwingConstants.CENTER);
    right.setHorizontalTextPosition(JLabel.CENTER);
    right.setVerticalTextPosition(JLabel.BOTTOM);

    left.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          right.setIcon(new ImageIcon("namjin/images/" + foodList[count]));
          right.setText(foodNameList[count]);
          count++;
          if (count >= 11) {
            right.setVisible(false);
            left.removeMouseListener(this);
            title.setText(
              left.getText() + " must be one of your favorite food!"
            );
          }
        }
      }
    );
    right.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          left.setIcon(new ImageIcon("namjin/images/" + foodList[count]));
          left.setText(foodNameList[count]);
          count++;
          if (count >= 11) {
            left.setVisible(false);
            right.removeMouseListener(this);
            title.setText(
              right.getText() + " must be one of your favorite food!"
            );
          }
        }
      }
    );
    main.add(left);
    main.add(right);
    cp.add(title, BorderLayout.NORTH);
    cp.add(main, BorderLayout.CENTER);

    this.setSize(1500, 800);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice();
  }
}
