import java.util.Scanner;

public class ScannerEx {
  public static void main(String[] args) {
    System.out.println("이름 , 도시, 나이, 체중, 결혼 유무를 빈칸으로 분리하여 입력하세요.");
    // 레퍼런스 타입  primitive type
    Scanner scanner = new Scanner(System.in);
    // String name = scanner.next();
    // System.out.println("당신의 이름은 "+name);
    // String city = scanner.next();
    // System.out.println("사는 곳은 "+city);
    // int age = scanner.nextInt();
    // System.out.println("당신의 나이는 "+age);
    // double weight = scanner.nextDouble();
    // System.out.println("당신의 몸무게는 "+weight);
    boolean isMarried = scanner.nextBoolean();
    System.out.println("결혼 유무는 ?"+isMarried);
    scanner.close();
    
  }
}
