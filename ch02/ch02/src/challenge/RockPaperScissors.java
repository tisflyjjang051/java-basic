package challenge;

import java.util.Scanner;

public class RockPaperScissors {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("가위바위보 중에 하나를 입력하세요.");
    System.out.println("철수>>");
    String chulsu = scanner.next();
    System.out.println("영희>>");
    String younghee = scanner.next();
    if (chulsu.equals("가위")) {
      if (younghee.equals("바위")) {
        System.out.println("영희가 이겼음");
      } else if (younghee.equals("보")) {
        System.out.println("영희가 졌음");
      } else {
        System.out.println("비겼음");
      }
    } else if (chulsu.equals("바위")) {
      if (younghee.equals("보")) {
        System.out.println("영희가 이겼음");
      } else if (younghee.equals("가위")) {
        System.out.println("영희가 졌음");
      } else {
        System.out.println("비겼음");
      }
    } else {
      if (younghee.equals("가위")) {
        System.out.println("영희가 이겼음");
      } else if (younghee.equals("바위")) {
        System.out.println("영희가 졌음");
      } else {
        System.out.println("비겼음");
      }
    }
  }
}
