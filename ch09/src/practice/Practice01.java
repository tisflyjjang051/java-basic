package practice;

import javax.swing.JFrame;

public class Practice01 extends JFrame {

  public Practice01() {
    setTitle("Let's Study JAVA");
    //super("Let's Study JAVA");
    setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Practice01();
  }
}
