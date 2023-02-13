import java.io.File;

public class FileEx {

  public static void main(String[] args) {
    File file = new File("c:\\windows\\system.ini");
    System.out.println(file.getPath());
    System.out.println(file.getParent());
    System.out.println(file.getName());
    if (file.isFile()) {
      System.out.println("파일입니다.");
    } else {
      System.out.println("디렉토리입니다.");
    }
    File file02 = new File("c:\\Temp\\java");
    if (!file02.exists()) {
      file02.mkdir();
    }
    File file03 = new File("c:\\Temp");
    File subFiles[] = file03.listFiles();
    for (int i = 0; i < subFiles.length; i++) {
      File f = subFiles[i];
      System.out.println(f.getName());
      System.out.println(f.isFile() ? "파일" : "폴더");
    }
  }
}
