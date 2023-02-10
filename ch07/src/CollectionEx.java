import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionEx {

  public static void main(String[] args) {
    LinkedList<String> myList = new LinkedList<>();
    myList.add("백명현");
    myList.add("김남진");
    myList.add("김지은");
    myList.add("장성호");
    myList.add("권인호");
    //Collections.sort(myList);
    //Collections.reverse(myList);

    int idx = Collections.binarySearch(myList, "장성호");
    System.out.println(idx);
    /*
    Iterator<String> iterator = myList.iterator();
    while (iterator.hasNext()) {
      String seperator;
      if (iterator.hasNext()) {
        seperator = "=>";
      } else {
        seperator = "\n";
      }
      String element = iterator.next();
      System.out.print(element + seperator);
    }
     */
  }
}
