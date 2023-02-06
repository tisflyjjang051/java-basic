import java.util.Scanner;

/**
 * DivideZeroHandling
 */
public class DivideZeroHandling {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num01 = 0;
    while (true) {
      System.out.println("첫번째 숫자를 입력하세요.");
      try {
        num01 = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("정수가 아닙니다. 다시 입력하세요");
      }

      System.out.println("두번째 숫자를 입력하세요.");
      int num02 = scanner.nextInt();
      try {
        double result = (double) (num01 / num02);
        System.out.println(
          num01 + "을 " + num02 + "로 나누면 " + result + "입니다."
        );
        break;
      } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
        System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
      }
    }
  }
}
