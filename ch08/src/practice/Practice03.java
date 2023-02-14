package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Practice03 {

  public static void main(String[] args) {
    try {
      File file = new File("c:\\windows\\system.ini");
      FileReader fr = new FileReader(file);
      int c;
      while ((c = fr.read()) != -1) {
        char ch = (char) c;
        // primitive type  8
        ch = Character.toUpperCase(ch);
        System.out.print((char) ch);
      }
      fr.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
