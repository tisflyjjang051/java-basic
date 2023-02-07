package practice;

import java.util.Scanner;

public class Practice02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("수학 과학 영어 점수를  차례대로 입력하세요.");
    int math = scanner.nextInt();
    int science = scanner.nextInt();
    int english = scanner.nextInt();
    Grade grade = new Grade(math, science, english);
    int avg = grade.average();
    System.out.println("당신의 평균은 " + avg + "입니다.");
  }
}
