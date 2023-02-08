package practice;

class Point04 {

  private int x;
  private int y;

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public Point04(int x, int y) {
    this.x = x;
    this.y = y;
  }

  protected void move(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class PositivePoint extends Point04 {

  public PositivePoint(int x, int y) {
    super(x, y);
    if (x < 0 || y < 0) {
      super.move(0, 0);
    }
  }

  protected void move(int x, int y) {
    if (x > 0 && y > 0) {
      super.move(x, y);
    } else {
      return;
    }
  }

  public String toString() {
    return "(" + getX() + "," + getY() + ")";
  }
}

public class Practice08 {

  public static void main(String[] args) {
    PositivePoint pp = new PositivePoint(10, 10);
    System.out.println(pp.toString());
    pp.move(-100, 100);
    System.out.println(pp.toString());
  }
}
