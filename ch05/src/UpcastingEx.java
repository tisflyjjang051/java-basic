public class UpcastingEx {

  public static void main(String[] args) {
    Person person;
    Student student = new Student("김남진");
    person = student;
    System.out.println(person.name);
    System.out.println(person.id);

    // 오버로딩
    // 오버라이딩  override
    // type casting을 쓰는 이유 메서드의 매개변수 타입을 좀더 효율적으로 받기 위해 쓴다.

    // instanceof
    Person person02 = new Student("김지은");
    Student student02 = (Student) person02;

    System.out.println(person02 instanceof Person);
    System.out.println(person02 instanceof Student);

    System.out.println("java" instanceof String);
  }
}
