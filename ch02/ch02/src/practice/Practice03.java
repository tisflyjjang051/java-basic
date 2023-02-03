package practice;

import java.util.Scanner;

public class Practice03 {

  public static void main(String[] args) {
    System.out.println("갖고 있는 돈을 입력하세요.");
    Scanner scanner = new Scanner(System.in);
    int money = scanner.nextInt();
    int money50000 = money / 50000;
    money = money % 50000;
    int money10000 = money / 10000;
    money = money % 10000;
    int money5000 = money / 5000;
    money = money % 5000;
    int money1000 = money / 1000;
    money = money % 1000;
    int money500 = money / 500;
    money = money % 500;
    int money100 = money / 100;
    money = money % 100;
    int money50 = money / 50;
    money = money % 50;
    int money10 = money / 10;
    //prettier-ignore
    System.out.println(
      "오만원권 : "+money50000+"\n"+
      "만원권 : "+money10000+"\n"+
      "오천원권 : "+money5000+"\n"+
      "천원권 : "+money1000+"\n"+
      "오백원 : "+money500+"\n"+
      "백원 : "+money100+"\n"+
      "십원 : "+money10+"\n"
    );
  }
}
