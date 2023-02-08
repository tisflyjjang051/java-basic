package practice;

import java.util.Scanner;

public class Practice09 {

  public static void main(String[] args) {
    System.out.println(" 스택 공간을 정수로 입력하시오 ");
    Scanner scanner = new Scanner(System.in);
    int total = scanner.nextInt();
    StringStack ss = new StringStack(total);
    while (true) {
      System.out.print("문자열 입력 >>");
      String str = scanner.next();
      boolean response = ss.push(str);
      if (str.equals("그만")) {
        break;
      }
      if (response == false) {
        System.out.println("스택이 가득 찼습니");
      }
    }
  }
}
