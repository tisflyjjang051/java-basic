import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog extends JDialog {

  private JTextField tf = new JTextField(10);
  private JButton btn = new JButton("OK");

  MyDialog(JFrame frame, String title) {
    super(frame, title, true);
    this.setLayout(new FlowLayout());
    this.add(tf);
    this.add(btn);
    this.setSize(300, 300);
    btn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          setVisible(false);
        }
      }
    );
  }
}

public class DialogEx extends JFrame {

  private MyDialog myDialog;

  DialogEx() {
    this.setTitle("Menu 만들기");
    Container contentPane = this.getContentPane();
    JButton btn = new JButton("클릭하면 팝업 뜸");
    contentPane.add(btn);
    myDialog = new MyDialog(this, "dialog");
    btn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          myDialog.setVisible(true);
        }
      }
    );
    this.setSize(800, 600);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new DialogEx();
  }
}
