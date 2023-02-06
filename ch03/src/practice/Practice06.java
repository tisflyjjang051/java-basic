package practice;

import java.util.Scanner;

public class Practice06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int unit[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
    System.out.println("돈 입력");
    int money = scanner.nextInt();
    for (int i = 0; i < unit.length; i++) {
      int remain = money / unit[i];
      System.out.println(unit[i] + "원 " + remain + "개");
      money = money % unit[i];
    }
  }
}
