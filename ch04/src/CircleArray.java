public class CircleArray {

  public static void main(String[] args) {
    Circle circleArray[] = new Circle[5];
    for (int i = 0; i < 5; i++) {
      circleArray[i] = new Circle(i);
    }
    double c01Area = circleArray[4].getArea();
    System.out.println(c01Area);
  }
}
