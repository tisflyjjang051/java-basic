package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Practice02 {

  public static void main(String[] args) {
    FileReader fr = null;
    File file = new File("c:\\Temp\\phone.txt");
    try {
      fr = new FileReader(file);
      while (true) {
        int c = fr.read();
        if (c == -1) break;
        System.out.print((char) c);
      }
      fr.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
