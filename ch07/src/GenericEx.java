// 타입의 제한을 걸지
class GenericClass<E> {

  private E element;

  public E getElement() {
    return this.element;
  }

  public void setElement(E element) {
    this.element = element;
  }
}

public class GenericEx {

  public static void main(String[] args) {
    GenericClass<String> aa = new GenericClass<String>();
    GenericClass<Integer> bb = new GenericClass<>();
    aa.setElement("나는 스트링");
    bb.setElement(10);
  }
}
