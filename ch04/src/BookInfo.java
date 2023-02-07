public class BookInfo {

  public static void main(String[] args) {
    Book book01 = new Book();
    Book book02 = book01;
    book01.setTitle("홍길동전");
    book02.setTitle("김길동전");
    String b01TItle = book01.getTitle();
    String b02Title = book02.getTitle();
    System.out.println(b01TItle + "===" + b02Title);
  }
}
