public class Book {

  private String title;
  private String author;

  // getter / setter
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Book() {
    //System.out.println("저자 미상,제목 미상");
    // 객체를 가리키는 this
    this("작자미상", "제목 미상");
  }

  public Book(String title) {
    this(title, "작자미상");
    this.title = title;
    this.author = "작자 미상";
  }

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public void showInfo() {
    System.out.println("책의 제목은 " + title + " 저자는 " + author);
  }
}
