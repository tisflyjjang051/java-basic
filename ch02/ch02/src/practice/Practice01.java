package practice;

import java.util.Scanner;

public class Practice01 {

  // 원화를 입력하면 달러로 바꾸기... 1100
  // 4400 4달라.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("원화를 입력하면 달러로 환전해 드립니다.");
    final double rate = 1100;
    int won = scanner.nextInt();
    double dollar = won / rate;
    System.out.println(
      "입력한 원화 " + won + "은 달러로 바꾸면 " + dollar + "입니다."
    );
    scanner.close();
  }
}
