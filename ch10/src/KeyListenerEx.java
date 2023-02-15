import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerEx extends JFrame {

  private JLabel[] keyMessage;

  public KeyListenerEx() {
    this.setTitle("KeyListener");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.addKeyListener(new MyKeyListener());
    keyMessage = new JLabel[3];
    keyMessage[0] = new JLabel("getKeyCode");
    keyMessage[1] = new JLabel("getKeyChar");
    keyMessage[2] = new JLabel("getKeyText");
    for (int i = 0; i < 3; i++) {
      contentPane.add(keyMessage[i]);
      keyMessage[i].setOpaque(true);
      keyMessage[i].setBackground(Color.YELLOW);
    }
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
      int keyCode = e.getKeyCode();
      char keyChar = e.getKeyChar();
      keyMessage[0].setText(Integer.toString(keyCode));
      keyMessage[1].setText(Character.toString(keyChar));
      keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
    }

    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}
  }

  public static void main(String[] args) {
    new KeyListenerEx();
  }
}
