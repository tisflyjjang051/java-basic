public class Point {

  private int x;
  private int y;

  //생성자 오버로딩
  public Point() {}

  public Point(int x, int y) {}

  public void set(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void showPoint() {
    System.out.println("x : " + x + " y : " + y);
  }
}
