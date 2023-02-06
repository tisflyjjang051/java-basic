public class ForEach {

  public static void main(String[] args) {
    int num[] = new int[5];
    num[0] = 3;
    num[1] = 3;
    num[2] = 3;
    num[3] = 3;
    num[4] = 3;
    int num02[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int i = 0; i < num02.length; i++) {
      System.out.print(num02[i] + "\t");
    }
    for (int item : num02) {
      System.out.print(item + "\t");
    }
    String fruits[] = { "berry", "apple", "melon", "orange" };
    for (int i = 0; i < fruits.length; i++) {
      System.out.print(fruits[i] + "\t");
    }
    for (String item : fruits) {
      System.out.print(item + "\t");
    }
  }
}
