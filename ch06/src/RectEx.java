class Rect {

  private int w, h;

  public Rect(int w, int h) {
    this.w = w;
    this.h = h;
  }

  @Override
  public boolean equals(Object obj) {
    Rect r = (Rect) obj;
    if (w * h == r.w * r.h) {
      return true;
    } else {
      return false;
    }
  }
}

public class RectEx {

  public static void main(String[] args) {
    Rect r01 = new Rect(10, 10);
    Rect r02 = new Rect(20, 5);
    if (r01.equals(r02)) {
      System.out.println("같다");
    } else {
      System.out.println("다르다");
    }
  }
}
