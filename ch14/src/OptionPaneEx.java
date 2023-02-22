import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneEx extends JFrame {

  private JButton inputBtn = new JButton("Input Name");
  private JButton confirmBtn = new JButton("confirm");

  OptionPaneEx() {
    this.setTitle("옵션 팬 연습");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 300);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(inputBtn);
    contentPane.add(confirmBtn);
    confirmBtn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          int result = JOptionPane.showConfirmDialog(
            null,
            "to be continue",
            "confirm",
            JOptionPane.YES_NO_OPTION
          );
          if (result == JOptionPane.YES_OPTION) {
            System.out.println("진행 시켜!!!!");
          } else if (result == JOptionPane.CLOSED_OPTION) {
            System.out.println("그냥 닫음");
          } else if (result == JOptionPane.NO_OPTION) {
            System.out.println("그만 해");
          }
        }
      }
    );
    inputBtn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          String name = JOptionPane.showInputDialog("이름을 입력하세요.");
          System.out.println(name);
        }
      }
    );
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new OptionPaneEx();
  }
}
