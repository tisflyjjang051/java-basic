package practice;

public class TV {

  private String maker;
  private int year;
  private int size;

  public int a;
  int b;

  // getter/ setter
  public TV() {}

  public TV(String maker, int year, int size) {
    this.maker = maker;
    this.year = year;
    this.size = size;
  }

  public void show() {
    System.out.println(
      maker + "에서 만든" + year + "년형 " + size + "인치 tv입니다."
    );
  }
}
