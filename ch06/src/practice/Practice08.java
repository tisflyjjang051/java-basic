package practice;

import java.util.Scanner;

public class Practice08 {

  public static void main(String[] args) {
    System.out.println("글자를 입력하세요.");
    Scanner scanner = new Scanner(System.in);
    String txt = scanner.nextLine();
    int total = txt.length();
    for (int i = 0; i < total; i++) {
      String first = txt.substring(0, 1);
      String rest = txt.substring(1);
      txt = rest + first;
      System.out.println(txt);
    }
  }
}
