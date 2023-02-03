public class Logical {

  public static void main(String[] args) {
    System.out.println(3 > 2);
    System.out.println(3 < 2);
    System.out.println(3 == 2);
    System.out.println(3 != 2);
    System.out.println(!(3 != 2));
    System.out.println(3 > 2 || 3 > 4);
    System.out.println(3 > 2 && 3 > 4);
    System.out.println(3 > 2 ^ 3 < 4);
    //삼항연산자....
    int a = 10; // 절대값 구하기
    int b = 5;
    int s = a > b ? 1 : -1;
    int s2 = a > b ? a - b : b - a;
    if (a > b) {
      s = a - b;
    } else {
      s = b - a;
    }
    System.out.println(s);
    System.out.println(s2);
  }
}
