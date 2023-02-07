public class ColorPointEx {

  public static void main(String[] args) {
    Point point = new Point();
    point.set(10, 10);
    point.showPoint();

    //type casting ColorPoint  up casting   down casting

    ColorPoint colorPoint = new ColorPoint(10, 100, "blue");
    // colorPoint.set(20, 20);
    // colorPoint.setColor("red");
    colorPoint.showColorPoint();
  }
}
