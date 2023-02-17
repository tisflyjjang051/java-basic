public class Paddle {

  public int x;
  public int y;
  public int width;
  public int height;
  public int speedX;
  public boolean isLeft;
  public boolean isRight;

  public Paddle() {
    this.width = 90;
    this.height = 10;
    this.speedX = 2;
    this.x = 100;
    this.y = 850;
  }
}
