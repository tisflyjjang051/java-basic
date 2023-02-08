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
    System.out.println(getSize() + "인치 " + color + "색 컬러");
  }
}

class IPTV extends ColorTV {

  private String ip;

  public IPTV(String ip, int size, int color) {
    super(size, color);
    this.ip = ip;
  }

  // this, super
  public void printProperty() {
    System.out.println("나의 IPTV는 " + ip);
    super.printProperty();
  }
}

public class Practice02 {

  public static void main(String[] args) {
    IPTV myIPTV = new IPTV("127.0.0.1", 55, 1024);
    myIPTV.printProperty();
  }
}
