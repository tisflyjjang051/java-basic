import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * FileInputSteamEx
 */
public class FileInputSteamEx {

  public static void main(String[] args) {
    byte b[] = new byte[6];
    try {
      FileInputStream fileInput = new FileInputStream("c:\\Temp\\test.out");
      int n = 0;
      int c = 0;
      while ((c = fileInput.read()) != -1) {
        b[n] = (byte) c;
        n++;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
