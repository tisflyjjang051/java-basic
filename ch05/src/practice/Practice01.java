package practice;

class TV {

  private int size;

  public TV(int size) {
    this.size = size;
  }

  protected int getSize() {
    return size;
  }
}

class ColorTV extends TV {

  private int color;

  public ColorTV(int size, int color) {
    super(size);
    this.color = color;
  }

  public void printProperty() {
    System.err.println(getSize() + "인치 " + color + "색 컬러");
  }
}

public class Practice01 {

  public static void main(String[] args) {
    ColorTV colorTv = new ColorTV(32, 1024);
    colorTv.printProperty();
  }
}
