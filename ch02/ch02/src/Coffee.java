import java.util.Scanner;

// 카푸치노 3500,
// 에스프레소 3200
// 카페라떼  4000
// 아메리카노 2000
// 메뉴에 없음.... switch
public class Coffee {

  public static void main(String[] args) {
    System.out.println("주문할 커피를 입력하세요.");
    Scanner scanner = new Scanner(System.in);
    String order = scanner.next();
    int price = 0;
    switch (order) {
      case "카푸치노":
        price = 3500;
        break;
      case "에스프레소":
        price = 3200;
        break;
      case "카페라떼":
        price = 4000;
        break;
      case "아메리카노":
        price = 2000;
        break;
      default:
        price = 0;
    }
    if (price == 0) {
      System.out.println("없는 메뉴입니다.");
    } else {
      System.out.println(order + "의 가격은 " + price + "입니다.");
    }
  }
}
