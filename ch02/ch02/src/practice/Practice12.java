package practice;

import java.util.Scanner;

public class Practice12 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("연산을 시작합니다.");
    int num01 = scanner.nextInt();
    String operator = scanner.next();
    int num02 = scanner.nextInt();
    int result = 0;
    if (operator.equals("+")) {
      result = num01 + num02;
    } else if (operator.equals("-")) {
      result = num01 - num02;
    } else if (operator.equals("*")) {
      result = num01 * num02;
    } else if (operator.equals("/")) {
      result = num01 / num02;
    }
    System.out.println(num01 + operator + num02 + "=" + result);
  }
}
