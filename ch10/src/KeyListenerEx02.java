import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerEx02 extends JFrame {

  private JLabel label = new JLabel();

  public KeyListenerEx02() {
    this.setTitle("KeyListener");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.addKeyListener(new MyKeyListener());
    contentPane.add(label);
    this.setSize(300, 300);
    this.setVisible(true);
    contentPane.setFocusable(true);
    contentPane.requestFocus();
  }

  /*
  class MyKeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
  }
   */
  class MyKeyListener extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      Container contentPane = (Container) e.getSource();
      int keyCode = e.getKeyCode();
      char keyChar = e.getKeyChar();
      if (keyCode == KeyEvent.VK_F1) {
        contentPane.setBackground(Color.GREEN);
      } else if (keyCode == KeyEvent.VK_LEFT) {
        contentPane.setBackground(Color.YELLOW);
      }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}
  }

  public static void main(String[] args) {
    new KeyListenerEx02();
  }
}
