/**
 * InnerStaticEx
 */
class StaticSample {

  public static int m;
  public int n;

  public void g() {
    System.out.println("나는 static 메서드가 아닙니다.");
  }

  public static void f() {
    System.out.println("나는 static 메서드입니다.");
  }
}

public class StaticEx {

  public static void main(String[] args) {
    StaticSample sample = new StaticSample();
  }
}
