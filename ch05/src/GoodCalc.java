abstract class Calculator {

  public abstract int add(int a, int b);

  public abstract int subtract(int a, int b);

  public abstract double average(int a[]);
}

public class GoodCalc {

  public int add(int a, int b) {
    System.out.println("나는 팀원 김남진");
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public double average(int a[]) {
    double sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum / a.length;
  }

  public static void main(String[] args) {
    GoodCalc goodCalc = new GoodCalc();
    System.out.println(goodCalc.add(99, 43989));
    System.out.println(goodCalc.subtract(99, 43989));
    System.out.println(goodCalc.average(new int[] { 34, 45, 67 }));
  }
}
