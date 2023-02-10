class GStack<T> {

  int tos;
  Object stack[];

  public GStack() {
    tos = 0;
    stack = new Object[10];
  }

  public void push(T item) {
    if (tos == 10) {
      return;
    } else {
      stack[tos] = item;
      tos++;
    }
  }

  public T pop() {
    if (tos == 0) {
      return null;
    } else {
      tos--;
      return (T) stack[tos];
    }
  }
}

public class GenericStackEx {

  public static void main(String[] args) {
    GStack<String> stringStack = new GStack<>();
    stringStack.push("장성호");
    stringStack.push("장동건");
    stringStack.push("정형돈");
    System.out.println(stringStack.pop());

    GStack<Integer> intStack = new GStack<>();
    intStack.push(0);
    intStack.push(1);
    intStack.push(2);
    System.out.println(intStack.pop());
  }
}
