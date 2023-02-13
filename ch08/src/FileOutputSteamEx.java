import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputSteamEx {

  public static void main(String[] args) {
    byte b[] = { 7, 51, 3, 4, 24, -1 };
    try {
      FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
      for (int i = 0; i < b.length; i++) {
        fout.write(b[i]);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
