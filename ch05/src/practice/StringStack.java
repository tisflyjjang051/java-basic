package practice;

public class StringStack implements Stack {

  private String element[];
  private int end;

  public StringStack(int capacity) {
    element = new String[capacity];
    end = 0;
  }

  public int length() {
    return end - 1;
  }

  public int capacity() {
    return element.length;
  }

  public String pop() {
    String popStr = element[end];
    end--;
    return popStr;
  }

  public boolean push(String val) {
    if (end == element.length) {
      return false;
    } else {
      element[end] = val;
      end++;
      System.out.println("end===" + end);
      return true;
    }
  }
}
