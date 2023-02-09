class Point {

  private int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class ObjectProperty {

  public static void print(Object obj) {
    System.out.println(obj.getClass().getName());
    System.out.println(obj.hashCode());
    System.out.println(obj.toString());
    System.out.println(obj);
  }

  public static void main(String[] args) {
    Point point = new Point(0, 0);
    print(point);
  }
}
