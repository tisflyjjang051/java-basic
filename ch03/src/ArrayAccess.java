import java.util.Scanner;

/**
 * ArrayAccess
 */
public class ArrayAccess {

  public static void main(String[] args) {
    int intArray[] = new int[5];
    System.out.println("양수 5개를 쓰세요.");
    Scanner scanner = new Scanner(System.in);
    int max = 0;
    double avg = 0;
    int sum = 0;
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = scanner.nextInt();
      if (intArray[i] > max) {
        max = intArray[i];
      }
      sum += intArray[i];
    }
    System.out.println("제일 큰 숫자는 " + max);
    avg = (double) sum / intArray.length;
    System.out.println("평균은 = " + avg);
  }
}
