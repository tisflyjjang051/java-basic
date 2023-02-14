import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class TextCopyEx {

  public static void main(String[] args) {
    File src = new File("c:\\windows\\system.ini");
    File destination = new File("c:\\Temp\\system.txt");
    int c;
    try {
      FileReader fr = new FileReader(src);
      FileWriter fw = new FileWriter(destination);
      while ((c = fr.read()) != -1) {
        fw.write((char) c);
      }
      fr.close();
      fw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
