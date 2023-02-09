package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    /*
    while (true) {
      System.out.println(">>");
      String str = scanner.nextLine();
      if (str.equals("그만")) {
        break;
      }
      StringTokenizer st = new StringTokenizer(str, " ");
      System.out.println("총 단어의 갯수는 : " + st.countTokens());
    }
     */
    while (true) {
      System.out.println(">>");
      String str = scanner.nextLine();
      if (str.equals("그만")) {
        break;
      }
      String words[] = str.split(" ");
      System.out.println("총 단어의 갯수는 : " + words.length);
    }
  }
}
