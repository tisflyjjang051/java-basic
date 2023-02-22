import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ChatClient extends JFrame {

  private JTextField sender;
  private Receiver receiver;
  private ServerSocket listener = null;
  private Socket socket = null;

  private BufferedReader in = null;
  private BufferedWriter out = null;

  ChatClient() {
    this.setTitle("채팅 클라이언트");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new BorderLayout());
    sender = new JTextField();
    receiver = new Receiver();

    contentPane.add(sender, BorderLayout.SOUTH);
    contentPane.add(new JScrollPane(receiver), BorderLayout.CENTER);
  }

  class Receiver extends JTextArea implements Runnable {

    @Override
    public void run() {
      String msg = null;
      while (true) {
        try {
          msg = in.readLine();
        } catch (IOException e) {
          e.printStackTrace();
        }
        this.append("\r\n 클라이언트 : " + msg);
      }
    }
  }

  public static void main(String[] args) {
    new ChatClient();
  }
}
