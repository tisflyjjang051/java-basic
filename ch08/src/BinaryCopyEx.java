import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class BinaryCopyEx {

  public static void main(String[] args) {
    File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
    File destination = new File("c:\\Temp\\copy.jpg");
    int c;
    try {
      FileInputStream fi = new FileInputStream(src);
      FileOutputStream fo = new FileOutputStream(destination);
      byte buffer[] = new byte[1024 * 10];
      while (true) {
        int n = fi.read(buffer);
        fo.write(buffer, 0, n);
        if (n < buffer.length) break;
      }
      fi.close();
      fo.close();
      System.out.println("이미지 복사 끝");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
