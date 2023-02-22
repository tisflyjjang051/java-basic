import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFileChooserEx extends JFrame {

  private JLabel imgLabel = new JLabel();

  JFileChooserEx() {
    this.setTitle("file");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.add(imgLabel);

    JMenuBar mb = new JMenuBar();
    JMenu fileMenu = new JMenu("file");
    JMenuItem openItem = new JMenuItem("Open");
    openItem.addActionListener(new OpenActionListener());
    fileMenu.add(openItem);
    mb.add(fileMenu);
    this.setJMenuBar(mb);

    this.setSize(800, 600);
    this.setVisible(true);
  }

  class OpenActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG&GIF&PNG",
        "jpg",
        "gif",
        "png"
      );
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setFileFilter(filter);
      int fileSelect = fileChooser.showOpenDialog(null);
      if (fileSelect != JFileChooser.APPROVE_OPTION) {
        JOptionPane.showMessageDialog(
          null,
          "파일을 선택하지 않았습니다.",
          "경고",
          JOptionPane.WARNING_MESSAGE
        );
        return;
      } // 파일을 선택하지 않고 강제로 닫았을때...
      String filePath = fileChooser.getSelectedFile().getPath();
      imgLabel.setIcon(new ImageIcon(filePath));
    }
  }

  public static void main(String[] args) {
    new JFileChooserEx();
  }
}
