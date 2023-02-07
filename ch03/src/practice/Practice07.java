package practice;

public class Practice07 {

  public static void main(String[] args) {
    int nums[] = new int[10];
    System.out.println(Math.random());
    for (int i = 0; i < 10; i++) {
      int num = (int) (Math.random() * 10 + 1);
      nums[i] = num;
    }
    int sum = 0;
    for (int i = 0; i < 10; i++) {
      System.out.print(nums[i] + " ");
      sum += nums[i];
    }
    System.out.println((double) sum / 10);
  }
}
