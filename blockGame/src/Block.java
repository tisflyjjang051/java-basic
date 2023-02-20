public class Block {

  public int x;
  public int y;
  public int width;
  public int height;
  public int color;
  public boolean isHide; // 블록을 보이고 안보이고 하는 속성

  public Block() {
    this.width = 60;
    this.height = 30;
    this.isHide = false;
    this.color = 0;
  }
}
