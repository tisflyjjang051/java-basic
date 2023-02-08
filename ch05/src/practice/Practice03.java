package practice;

import java.util.Scanner;

// 추상 클래스
abstract class Converter {

  protected abstract double convert(double src);

  protected abstract String getSrcString();

  protected abstract String getDestString();

  protected double ratio;

  public void run() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      getSrcString() + "을 " + getDestString() + "로 바꿉니다."
    );
    System.out.println(getSrcString() + "을 입력하세요.");
    double val = scanner.nextDouble();
    double res = convert(val);
    System.out.println("변환 결과 : " + res + getDestString() + "입니다.");
  }
}

class Won2Dollar extends Converter {

  public Won2Dollar(double ratio) {
    this.ratio = ratio;
  }

  @Override
  protected double convert(double src) {
    return src / ratio;
  }

  protected String getSrcString() {
    return "원";
  }

  protected String getDestString() {
    return "달러";
  }
}

class Km2Mile extends Converter {

  public Km2Mile(double ratio) {
    this.ratio = ratio;
  }

  protected double convert(double src) {
    return src / ratio;
  }

  protected String getSrcString() {
    return "Km";
  }

  protected String getDestString() {
    return "mile";
  }
}

public class Practice03 {

  public static void main(String[] args) {
    // Won2Dollar won2Dollar = new Won2Dollar(1260);
    // won2Dollar.run();

    Km2Mile km2Mile = new Km2Mile(1.6);
    km2Mile.run();
  }
}
