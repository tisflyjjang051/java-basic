import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketEx {

  public static void main(String[] args) {
    ServerSocket listener = null;
    Socket socket = null;
    BufferedReader in = null;
    BufferedWriter out = null;
    Scanner scanner = new Scanner(System.in);
    try {
      listener = new ServerSocket(9999);
      System.out.println("서버가 클라이언트의 연결을 기다리고 있습니다.");
      socket = listener.accept();
      System.out.println("클라이언트 소케 연결 완료");
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      out =
        new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      while (true) {
        String inputMsg = in.readLine();
        System.out.println("서버에서 수신 << " + inputMsg);

        System.out.print("서버로 송신 >>");
        String outputMsg = scanner.nextLine();
        out.write(outputMsg + "\r\n");

        out.flush();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
