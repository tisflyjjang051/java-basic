package practice;

import java.util.Scanner;

public class Practice05 {

  public static void main(String[] args) {
    int intArray[] = new int[10];
    Scanner scanner = new Scanner(System.in);
    System.out.println("정수 10개를 넣으시오");
    for (int i = 0; i < 10; i++) {
      intArray[i] = scanner.nextInt();
    }
    System.out.println("입력한 것중 3의 배수는?");
    for (int i = 0; i < 10; i++) {
      if (intArray[i] % 3 == 0) {
        System.out.print(intArray[i] + "\t");
      }
    }
  }
}
