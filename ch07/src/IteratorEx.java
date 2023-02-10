import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

  public static void main(String[] args) {
    Vector<Integer> vec = new Vector<>();
    vec.add(100);
    vec.add(120);
    vec.add(145);
    vec.add(99);
    vec.add(88);
    Iterator<Integer> it = vec.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    it = vec.iterator();
    int sum = 0;
    while (it.hasNext()) {
      sum += it.next();
    }
    System.out.println(sum);
  }
}
