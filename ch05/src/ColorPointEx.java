public class ColorPointEx {

  public static void main(String[] args) {
    Point point = new Point();
    point.set(10, 10);
    point.showPoint();

    ColorPoint colorPoint = new ColorPoint();
    colorPoint.set(20, 20);
    colorPoint.setColor("red");
    colorPoint.showColorPoint();
  }
}
