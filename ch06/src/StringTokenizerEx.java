import java.util.StringTokenizer;

/**
 * StringTokenizerEx
 */
public class StringTokenizerEx {

  public static void main(String[] args) {
    String txt = "홍길동/장화/홍련/콩쥐/팥쥐:고길동:둘리";
    StringTokenizer st = new StringTokenizer(txt, "/:");
    // System.out.println(st.nextToken());
    // System.out.println(st.nextToken());
    // System.out.println(st.nextToken());
    //st.nextToken();
    //System.out.println(st.countTokens());
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
    // String txt02 = "홍길동/장화/홍련/콩쥐/팥쥐";
    // txt02.split("/"); //배열을 리턴한다.
    System.out.println(txt);
  }
}
