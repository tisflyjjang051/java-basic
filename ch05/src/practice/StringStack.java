package practice;

public class StringStack implements Stack {

  private String element[];
  private int end;

  public StringStack(int capacity) {
    element = new String[capacity];
    end = -1;
  }

  public int length() {
    return end + 1;
  }

  public int capacity() {
    return element.length;
  }

  public String pop() {
    if (end == -1) {
      return null;
    } else {
      String popStr = element[end];
      end--;
      return popStr;
    }
  }

  public boolean push(String val) {
    if (end == element.length - 1) {
      return false;
    } else {
      end++; //-1
      element[end] = val;
      System.out.println("end===" + end);
      return true;
    }
  }
}
// Map  {키 : 값}
