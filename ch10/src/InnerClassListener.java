import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame {

  public InnerClassListener() {
    this.setTitle("Action Event");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    JButton btn = new JButton("Action");
    btn.addActionListener(new MyActionListener());

    contentPane.add(btn);
    this.setSize(400, 300);
    this.setVisible(true);
  }

  class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      JButton btn = (JButton) e.getSource(); // Object
      //System.out.println(btn.getText());
      if (btn.getText().equals("Action")) {
        btn.setText("액션");
      } else {
        btn.setText("Action");
      }
      InnerClassListener.this.setTitle("액션 이벤트");
    }
  }

  public static void main(String[] args) {
    new InnerClassListener();
  }
}
