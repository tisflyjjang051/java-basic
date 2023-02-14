package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FileWriter fw = null;
    File file = new File("c:\\Temp\\phone.txt");
    System.out.println("전화번호를 입력하시오.");
    try {
      fw = new FileWriter(file);
      while (true) {
        System.out.print("이름 전화번호 >>");
        String line = scanner.nextLine();
        if (line.equals("그만")) {
          break;
        }
        fw.write(line + "\r\n");
      }
      fw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
