public class ThreadMainEx {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getId());
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getState());
    System.out.println(Thread.currentThread().getPriority()); // 1~10
  }
}
