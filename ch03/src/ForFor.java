public class ForFor {

  public static void main(String[] args) {
    // continue , break 별찍기....
    for (int i = 0; i < 10; i++) {
      for (int j = i; j < 10; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
