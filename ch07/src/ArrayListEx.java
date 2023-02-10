import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
      System.out.println("이름을 입력하세요.");
      String name = scanner.next();
      arrayList.add(name);
    }
    int longest = 0;
    for (int i = 0; i < 4; i++) {
      String name = arrayList.get(i);
      int len = arrayList.get(i).length();
      System.out.print(name + "\t" + len);
    }
    for (int i = 0; i < arrayList.size(); i++) {
      if (arrayList.get(longest).length() < arrayList.get(i).length()) {
        longest = i;
      }
    }
    System.out.println("이름이 제일 긴 사람은 " + arrayList.get(longest));
    // 이름이 제일 긴 사람 출력
  }
}
