package practice;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Practice04 {

  public static void showRainInfo(Vector<Integer> rains) {
    int sum = 0;
    Iterator<Integer> iterator = rains.iterator();
    while (iterator.hasNext()) {
      int num = iterator.next();
      System.out.print(num + " ");
      sum += num;
    }
    System.out.println("현재 평균은 " + sum / rains.size());
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Vector<Integer> rains = new Vector<>();
    while (true) {
      System.out.println("강수량 입력 0을 입력하면 종료합니다.");
      int num = scanner.nextInt();
      if (num == 0) break;
      rains.add(num);
      showRainInfo(rains);
    }
  }
}
