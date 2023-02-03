package practice;

import java.util.Scanner;

public class Practice02 {

  // 두자리수 정수를 입력받아서 10의 자리와 1의 자리가 같은지 확인
  // 78 다르다
  // 33 같다.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("두자리수 정수를 입력하세요.");
    int num = scanner.nextInt();
    int ten = num / 10;
    int one = num % 10;
    if (ten == one) {
      System.out.println("같다");
    } else {
      System.out.println("다르다");
    }
    scanner.close();
  }
}
