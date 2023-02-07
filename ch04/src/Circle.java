public class Circle {

  // 속성
  public int radius;
  public String name;
  public int width;

  // 생성자에는 type을 붙이지 않는다.
  // 여러개 만들 수 있다. (오버로딩)
  // 반드시 만들어야 하고
  // 만약 만들지 않으면 기본 생성자가
  // 만들어져서 삽입된다.
  public Circle() {
    System.out.println("나는 Circle");
  }

  public Circle(int _radius) {
    radius = _radius;
  }

  public Circle(String _name, int _radius) {
    name = _name;
    radius = _radius;
  }

  // 메서드
  public double getArea() {
    return 3.14 * radius * radius;
  }

  public void destroy() {}
}
