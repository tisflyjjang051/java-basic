public class Rectangle {

  public int width;
  public int height;

  public Rectangle() {
    System.out.println("나는 new를 통해 생성될때 호출됩니다.");
  }

  public int getArea() {
    return width * height;
  }

  public int getBound() {
    return width * 2 + height * 2;
  }
}
