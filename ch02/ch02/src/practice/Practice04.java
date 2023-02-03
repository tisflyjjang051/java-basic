package practice;

import java.util.Scanner;

public class Practice04 {

  // 세개의 입력받은 수 가운데 중간값을 찾는
  // 30,40,20
  public static void main(String[] args) {
    System.out.println("정수 세개를 입력하면 중간값을 찾아드립니다.");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int center = a;
    if ((a >= b && a <= c) || (a >= c && a <= b)) {
      center = a;
    } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
      center = b;
    } else {
      center = c;
    }
    System.out.println("중간값은 " + center + "입니다.");
  }
}
