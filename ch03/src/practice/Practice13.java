package practice;

public class Practice13 {

  public static void main(String[] args) {
    /*
    for (int i = 0; i < 100; i++) {
      int num01 = i % 10;
      int num02 = i / 10;
      if (
        (num01 == 3 || num01 == 6 || num01 == 9) &&
        (num02 == 3 || num02 == 6 || num02 == 9)
      ) {
        System.out.println(i + " 박수 짝짝");
      } else if (
        (num01 == 3 || num01 == 6 || num01 == 9) ||
        (num02 == 3 || num02 == 6 || num02 == 9)
      ) {
        System.out.println(i + " 박수 짝");
      }
    }
    */
    for (int i = 0; i < 100; i += 10) {
      for (int j = 0; j < 10; j += 1) {
        int sum = i + j;
        if (i % 3 == 0 && j % 3 == 0 && j != 0 && i != 0) {
          System.out.println(sum + " 박수 짝짝");
        } else if ((i % 3 == 0 && i != 0) || (j % 3 == 0 && j != 0)) {
          System.out.println(sum + " 박수 짝");
        }
      }
    }
  }
}
