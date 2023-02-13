import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx {

  public static void main(String[] args) {
    FileReader fio = null;
    try {
      fio = new FileReader("c:\\windows\\system.ini");
      int c;
      while ((c = fio.read()) != -1) {
        System.out.print((char) c);
      }
      fio.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
