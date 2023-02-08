package practice;

public class StringStack implements Stack {

  private String element[];
  private int end;

  public StringStack(int capacity) {
    element = new String[capacity];
    end = 0;
  }

  public int length() {
    return 1;
  }

  public int capacity() {
    return 1;
  }

  public String pop() {
    return "aaa";
  }

  public boolean push(String val) {
    if (end == element.length) {
      return false;
    } else {
      element[end] = val;
      end++;
      return true;
    }
  }
}
