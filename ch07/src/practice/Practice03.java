package practice;

import java.util.HashMap;
import java.util.Scanner;

public class Practice03 {

  //나라 이름 인구  Map
  public static void main(String[] args) {
    HashMap<String, Integer> nations = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("나라이름과 인구 수 입력하기  ex) Korea 5000");
    while (true) {
      System.out.println("나라 이름, 인구 >>");
      String nation = scanner.next();
      if (nation.equals("그만")) break;
      int population = scanner.nextInt();
      nations.put(nation, population);
    }
    // 입력
    while (true) {
      System.out.println("나라 이름을 쓰면 인구수를 알려드립니다. >>");
      String nation = scanner.next();
      if (nation.equals("그만")) break;
      Integer population = nations.get(nation);
      if (population == null) {
        System.out.println("해당하는 나라가 없습니다.");
      } else {
        System.out.println(nation + "의 인구는 " + population);
      }
    }
  }
}
