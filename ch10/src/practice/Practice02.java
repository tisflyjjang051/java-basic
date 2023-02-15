package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice02 extends JFrame {

  public Practice02() {
    this.setTitle("practice02");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setBackground(Color.GREEN);
    contentPane.addMouseListener(new MyMouseListener());
    contentPane.addMouseMotionListener(new MyMouseListener());
    this.setSize(500, 500);
    this.setVisible(true);
  }

  // 연정
  /*
  class MyMouseListener implements MouseListener, MouseMotionListener {

    @Override
    public void mouseDragged(MouseEvent e) {
      Container contentPane = (Container) e.getSource();
      contentPane.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {
      Container contentPane = (Container) e.getSource();
      contentPane.setBackground(Color.GREEN);
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
  }
   */

  // 인호
  class MyMouseListener extends MouseAdapter {

    public void mouseDragged(MouseEvent e) {
      Container contentPane = (Container) e.getSource();
      contentPane.setBackground(Color.YELLOW);
    }

    public void mouseReleased(MouseEvent e) {
      Container contentPane = (Container) e.getSource();
      contentPane.setBackground(Color.GREEN);
    }
  }

  public static void main(String[] args) {
    new Practice02();
  }
}
