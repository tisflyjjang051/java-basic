import java.util.Vector;

class Point0701 {

  private int x;
  private int y;

  public Point0701(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "(" + x + "," + y + ")";
  }
}

public class PointVector {

  public static void main(String[] args) {
    Vector<Point0701> vec = new Vector<>();
    vec.add(new Point0701(1, 1));
    vec.add(new Point0701(2, 2));
    vec.add(new Point0701(3, 3));

    // Point0701 p = vec.get(0);
    // System.out.println(p);
    vec.remove(1);
    for (int i = 0; i < vec.size(); i++) {
      Point0701 p = vec.get(i);
      System.out.println(p);
    }
  }
}
