package practice;

/**
 * Practice01
 */
public class Practice01 {

  public static void main(String[] args) {
    int sum = 0;
    int i = 0;
    int sum02 = 0;
    while (i < 100) {
      sum += i;
      i += 2;
    }
    for (int j = 0; j < 100; j += 2) {
      sum02 += j;
    }
    System.out.println(sum + "===" + sum02);
  }
}
