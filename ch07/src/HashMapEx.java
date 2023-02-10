import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

  public static void main(String[] args) {
    HashMap<String, String> dic = new HashMap<>();
    dic.put("apple", "사과");
    dic.put("kiwi", "키위");
    dic.put("melon", "수박");
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("찾는 단어를 입력하세요.");
      String eng = scanner.next();
      if (eng.equals("exit")) {
        break;
      }
      String kor = dic.get(eng);
      if (kor == null) {
        System.out.println("없는 단어입니다.");
      } else {
        System.out.println(kor);
      }
    }
    //System.out.println(dic.get("melon"));
  }
}
