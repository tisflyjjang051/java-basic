import java.util.Vector;

public class VectorEx {

  public static void main(String[] args) {
    Vector<Integer> vec = new Vector<>();
    vec.add(1);
    vec.add(2);
    vec.add(3);
    System.out.println(vec.size());
    vec.add(1, 30);
    System.out.println(vec.size());
    for (int i = 0; i < vec.size(); i++) {
      int num = vec.get(i);
      System.out.println(num);
    }
  }
}
