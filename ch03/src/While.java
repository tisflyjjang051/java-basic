import java.util.Scanner;

public class While {

  public static void main(String[] args) {
    int i = 0;
    int sum = 0;
    // 정수를 계속 입력받기.... -1 빠져나가기
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "정수를 입력하고 마지막에 -1을 입력하면 평균을 구해 드리겠습니다."
    );
    int num = scanner.nextInt();
    while (num != -1) {
      sum = sum + num;
      i++;
      num = scanner.nextInt();
      System.out.println(num);
    }
    double avg = sum / i;
    System.out.println("평균은 " + avg);
  }
}
