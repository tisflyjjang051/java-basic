public class ForFor {

  public static void main(String[] args) {
    // continue , break
    for (int i = 2; i <= 9; i++) {
      if (i % 2 == 0) {
        continue;
      }
      for (int j = 1; j <= 9; j++) {
        // 구구단 찍기 print();
        // println();
        System.out.print(i + "x" + j + "=" + (i * j));
        System.out.print("\t");
      }
      System.out.println();
    }
  }
}
