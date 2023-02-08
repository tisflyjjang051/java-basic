package practice;

class Point02 {

  private int x;
  private int y;

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public Point02(int x, int y) {
    this.x = x;
    this.y = y;
  }

  protected void move(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class ColorPoint02 extends Point02 {

  private String color;

  public ColorPoint02() {
    this(0, 0);
  }

  public ColorPoint02(int x, int y) {
    super(x, y);
    color = "black";
  }

  public void setXY(int x, int y) {
    move(x, y);
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    return color + "색의 (" + getX() + ", " + getY() + ")의 점";
  }
}

public class Practice06 {

  public static void main(String[] args) {
    ColorPoint02 zeroColorPoint = new ColorPoint02();
    ColorPoint02 colorPoint = new ColorPoint02(10, 10);
    colorPoint.setColor("red");
    colorPoint.setXY(100, 100);
    System.out.println(zeroColorPoint.toString());
    System.out.println(colorPoint.toString());
  }
}
