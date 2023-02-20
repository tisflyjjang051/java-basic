public class Ball {

  public int x;
  public int y;
  public int width;
  public int height;
  public int speed;
  public boolean isLeft;
  public boolean isRight;
  public boolean isUp;
  public boolean isDown;
  public boolean isHide;
  public boolean isLive;
  public int count;

  public Ball() {
    this.x = 300;
    this.y = 300;
    this.width = 10;
    this.height = 10;
    this.speed = 10;
    this.isLeft = true;
    this.isDown = true;
    this.isHide = false;
    this.isLive = false;
    this.isUp = true;
    this.isDown = true;
    this.count = 3;
  }
}
