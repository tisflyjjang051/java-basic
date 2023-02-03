package practice;

import java.util.Scanner;

public class Practice05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("세개의 정수를 입력하시오.");
    int point01 = scanner.nextInt();
    int point02 = scanner.nextInt();
    int point03 = scanner.nextInt();
    if (
      (point01 + point02) > point03 ||
      (point01 + point03) > point02 ||
      (point02 + point03) > point01
    ) {
      System.out.println("삼각형이 맞습니다.");
    } else {
      System.out.println("삼각형이 안됩니다.");
    }
  }
  // 입력받은 세개의 정수가 삼각형을 이룰 수 있는지
}
