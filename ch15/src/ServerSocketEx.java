import java.net.*;

public class ServerSocketEx {

  public static void main(String[] args) {
    ServerSocket listener = null;
    Socket socket = null;
    try {
      listener = new ServerSocket(9999);
      System.out.println("서버가 클라이언트의 연결을 기다리고 있습니다.");
      socket = listener.accept();
      System.out.println("클라이언트 소케 연결 완료");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
