public class App {

  public static void main(String[] args) throws Exception {
    Circle circle = new Circle(); // instance;

    Circle circle02 = new Circle(10);
    System.out.println(circle02.radius);

    Circle circle03 = new Circle("ball", 30);

    circle.name = "나만의 원";
    circle.width = 10;
    double area = circle.getArea();
    System.out.println(area);
    System.out.println(circle.name);

    Rectangle rect = new Rectangle();
    rect.width = 10;
    rect.height = 20;
    int rectArea = rect.getArea();
    int rectBound = rect.getBound();
    System.out.println(rectArea);
    System.out.println(rectBound);
  }
}
// Rectangle    width,height,  getArea();
// Book 클래스 만들기
// title,author를 필드를 가진다.
// 생성자 오버로딩을 통해
// 기본 생성자
// title을 입력받을 수 있는 생성자
// title과 author를 입력받을 수 있는 생성자 함수 만들어 보기...
