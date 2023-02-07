package practice;

public class Rectangle {

  private int x;
  private int y;
  private int width;
  private int height;

  public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public int square() {
    return width * height;
  }

  public void show() {
    System.out.println(
      "x : " + x + "y : " + y + " 넓이가 " + width + " 높이가 " + height
    );
  }

  public boolean contains(Rectangle r) {
    if (
      (r.x + r.width < this.x + this.width && r.x > this.x) &&
      (r.y + r.height < this.y + this.height && r.y > this.y)
    ) {
      return true;
    } else {
      return false;
    }
  }
}
