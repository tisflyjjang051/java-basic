package practice;

import java.util.Scanner;

public class Practice06 {

  //입력받은 숫자에 맞춰 3,6,9 가 있으면 박수 짝 박수짝짝 박수 없을 나타내기
  // ex 3 박쑤짝 , 36 박수 짝짝 45 작수 없음
  public static void main(String[] args) {
    System.out.println("1~99사이의 정수를 입력하시오.");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int ten = num / 10;
    int one = num % 10;
    int count = 0;
    if (ten % 3 == 0) {
      count++;
    }
    if (one % 3 == 0) {
      count++;
    }
    if (count == 1) {
      System.out.println("박수짝");
    } else if (count == 2) {
      System.out.println("박수짝짝");
    } else {
      System.out.println("박수치면 손짜른다.");
    }
  }
}
