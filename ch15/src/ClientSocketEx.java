import java.net.Socket;

public class ClientSocketEx {

  public static void main(String[] args) {
    Socket socket = null;
    try {
      socket = new Socket("localhost", 9999);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
