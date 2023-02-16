import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldEx extends JFrame {

  private JTextField tf = new JTextField(20);
  private JTextArea ta = new JTextArea(10, 20);

  public JTextFieldEx() {
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(tf);
    contentPane.add(
      new JScrollPane(
        ta,
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
      )
    );
    tf.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          JTextField t = (JTextField) e.getSource();
          ta.append(t.getText() + "\n");
          t.setText("");
        }
      }
    );
    this.setSize(300, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JTextFieldEx();
  }
}
