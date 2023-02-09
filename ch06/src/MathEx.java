public class MathEx {

  public static void main(String[] args) {
    System.out.println(Math.PI);
    System.out.println(Math.ceil(3.14));
    System.out.println(Math.floor(3.14));
    System.out.println(Math.sqrt(9));
    System.out.println(Math.exp(2));
    System.out.println(Math.round(3.14));
    for (int i = 0; i < 6; i++) {
      System.out.println((int) (Math.random() * 45 + 1));
    }
  }
}
