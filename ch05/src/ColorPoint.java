public class ColorPoint extends Point {

  private String color;

  public void setColor(String color) {
    this.color = color;
  }

  public void showColorPoint() {
    showPoint();
    System.out.println(color);
  }
}
