package practice;

import java.util.Scanner;

public class Practice04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("소문자 하나만 입력");
    String str = scanner.next(); // 문자열
    char ch = str.charAt(0);
    for (char i = ch; i >= 'a'; i--) {
      for (char j = 'a'; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
