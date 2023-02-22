import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocketEx {

  public static void main(String[] args) {
    Socket socket = null;
    BufferedReader in = null;
    BufferedWriter out = null;
    Scanner scanner = new Scanner(System.in);
    try {
      socket = new Socket("localhost", 9999);
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      out =
        new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      while (true) {
        System.out.print("서버로 송신 >>");
        String outputMsg = scanner.nextLine();
        out.write(outputMsg + "\r\n");
        out.flush();
        String inputMsg = in.readLine();
        System.out.println("서버에서 수신 << " + inputMsg);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
