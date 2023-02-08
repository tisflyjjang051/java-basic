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

  String get(String key) {
    return "aa";
  }

  void put(String key, String value) {}

  String delete(String key) {
    return "";
  }

  int length() {
    return 0;
  }
}

public class Practice10 {

  public static void main(String[] args) {
    Dictionary dictionary = new Dictionary();
    dictionary.put("aa", "bb");
    System.out.println(dictionary.get("aa"));
    dictionary.delete("aa");
  }
}
