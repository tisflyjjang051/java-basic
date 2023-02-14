package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Practice04 {

  public static void main(String[] args) {
    try {
      File file = new File("c:\\windows\\system.ini");
      FileReader fr = new FileReader(file);
      Scanner scanner = new Scanner(fr);
      int lineNumber = 1;
      while (scanner.hasNext()) {
        String line = scanner.nextLine();
        System.out.println(lineNumber + " : " + line);
        lineNumber++;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
