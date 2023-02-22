import javax.swing.*;

public class MenuEx extends JFrame {

  MenuEx() {
    this.setTitle("Menu 만들기");
    JMenuBar menuBar = new JMenuBar();
    JMenu screenMenu = new JMenu("Screen");
    screenMenu.add(new JMenuItem("Load"));
    screenMenu.add(new JMenuItem("Hide"));
    screenMenu.add(new JMenuItem("Reshow"));
    screenMenu.addSeparator();
    screenMenu.add(new JMenuItem("Exit"));
    menuBar.add(screenMenu);
    menuBar.add(new JMenu("Edit"));
    menuBar.add(new JMenu("Source"));
    menuBar.add(new JMenu("Project"));
    menuBar.add(new JMenu("Run"));
    this.setJMenuBar(menuBar);
    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new MenuEx();
  }
}
