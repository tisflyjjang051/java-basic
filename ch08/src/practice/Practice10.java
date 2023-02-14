package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

class PhoneExplorer {

  String fileName = "c:\\Temp\\phone.txt";
  HashMap<String, String> phoneMap = new HashMap<>();

  private void readFile() {
    try {
      Scanner scanner = new Scanner(new FileReader(new File(fileName)));
      while (scanner.hasNext()) {
        String name = scanner.next();
        String tel = scanner.next();
        phoneMap.put(name, tel);
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  private void searchNumber() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("이름을 쓰세요 >>");
      String name = scanner.next();
      if (name.equals("그만")) break;
      String tel = phoneMap.get(name);
      if (tel == null) {
        System.out.println("전화번호 없음");
      } else {
        System.out.println(tel);
      }
    }
  }

  public void run() {
    readFile();
    searchNumber();
  }
}

public class Practice10 {

  public static void main(String[] args) {
    PhoneExplorer phoneExplorer = new PhoneExplorer();
    phoneExplorer.run();
  }
}
