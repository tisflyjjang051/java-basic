import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuActionEventEx extends JFrame {

  private JLabel imgLabel = new JLabel();

  MenuActionEventEx() {
    this.setTitle("Menu 만들기");
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new BorderLayout());
    contentPane.add(imgLabel, BorderLayout.CENTER);
    JMenuBar menuBar = new JMenuBar();
    JMenu screenMenu = new JMenu("Screen");
    JMenuItem menuItems[] = new JMenuItem[4];
    String itemTitle[] = { "Load", "Hide", "Reshow", "Exit" };
    MenuActionListener menuActionListener = new MenuActionListener();
    for (int i = 0; i < 4; i++) {
      menuItems[i] = new JMenuItem(itemTitle[i]);
      menuItems[i].addActionListener(menuActionListener);
      screenMenu.add(menuItems[i]);
    }
    menuBar.add(screenMenu);
    this.setJMenuBar(menuBar);
    this.setSize(800, 600);
    this.setVisible(true);
  }

  class MenuActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      String command = e.getActionCommand();
      switch (command) {
        case "Load":
          imgLabel.setIcon(new ImageIcon("ch14/images/jun.jpg"));
          break;
        case "Hide":
          imgLabel.setVisible(false);
          break;
        case "Reshow":
          imgLabel.setVisible(true);
          break;
        case "Exit":
          System.exit(0);
          // 정상종료일때 0, 비정상 종료일때 1
          break;
      }
    }
  }

  public static void main(String[] args) {
    new MenuActionEventEx();
  }
}
