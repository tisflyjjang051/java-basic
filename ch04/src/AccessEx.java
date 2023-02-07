/**
 * InnerAccessEx
 */
class InnerAccessEx {

  public int a;
  private int b;
  int c;
  // 기본 생성자 자동 생성됨
}

public class AccessEx {

  public static void main(String[] args) {
    InnerAccessEx test = new InnerAccessEx();
    test.a = 10;
    test.c = 20;
  }

  static void aa() {
    System.out.println("aa를 출력합니다.");
  }
}
