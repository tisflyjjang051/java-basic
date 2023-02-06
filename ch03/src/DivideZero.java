import java.util.Scanner;

public class DivideZero {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num01;
    int num02;
    System.out.println("첫번째 숫자를 입력하시오");
    num01 = scanner.nextInt();
    System.out.println("두번째 숫자를 입력하시오");
    num02 = scanner.nextInt();
    int result = num01 / num02;
    System.out.println(
      num01 + "을 " + num02 + "로 나누면 " + result + "입니다."
    );
  }
}
