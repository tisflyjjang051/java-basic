package practice;

abstract class PairMap {

  protected String keyArray[];
  protected String valueArray[];

  abstract String get(String key);

  abstract void put(String key, String value);

  abstract String delete(String key);

  abstract int length();
}

class Dictionary extends PairMap {

  int count = 0;
  int i = 0;

  public Dictionary(int capacity) {
    keyArray = new String[capacity];
    valueArray = new String[capacity];
    // keyArray["a","b","c"];
    // valueArray["apple","boy","circle"];
  }

  String get(String key) {
    for (int i = 0; i < count; i++) {
      if (keyArray[i].equals(key)) {
        return valueArray[i];
      }
    }
    return null;
  }

  void put(String key, String value) {
    int i = 0;
    for (i = 0; i < count; i++) {
      if (keyArray[i].equals(key)) {
        break;
      }
    }
    System.out.println("i====" + i);

    if (i == count) { // 키가 발견이 안됐음....
      keyArray[i] = key;
      valueArray[i] = value;
      count++;
    } else {
      keyArray[i] = key;
      valueArray[i] = value;
    }
    // 키가 중복되면 value를 대치....
  }

  String delete(String key) {
    String result = null;
    for (int i = 0; i < count; i++) {
      if (keyArray[i].equals(key)) {
        keyArray[i] = null;
        valueArray[i] = null;
        result = valueArray[i];
      }
    }
    count--;
    return result;
  }

  int length() {
    return count;
  }
}

public class Practice10 {

  public static void main(String[] args) {
    Dictionary dictionary = new Dictionary(10);
    dictionary.put("황기태", "자바");
    dictionary.put("이재문", "파이썬");
    dictionary.put("이재문", "C++");
    System.out.println("황기태의 값은 " + dictionary.get("황기태"));
    System.out.println("이재문의 값은 " + dictionary.get("이재문"));
    System.out.println(dictionary.delete("황기태"));
  }
}
