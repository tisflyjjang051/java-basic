public class StringEx {

  public static void main(String[] args) {
    String a = new String(" C#");
    String b = new String(",C++ ");
    System.out.println(a + "의 길이는 " + a.length());
    System.out.println(b + "의 길이는 " + b.length());
    a = a.concat(b);
    System.out.println(a);
    a = a.trim();
    System.out.println(a);
    System.out.println(a.contains("#"));
    a = a.replace("C#", "Java");
    System.out.println(a);
    String s[] = a.split(",");
    System.out.println(s[0]);
    System.out.println(s[1]);
    a = a.substring(2);
    System.out.println(a);
    char c = a.charAt(0);
    System.out.println(c);
    // 숫자, 문자
  }
}
