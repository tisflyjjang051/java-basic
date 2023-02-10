package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Student0707 {

  private String name;
  private double score;

  public Student0707(String name, double score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getScore() {
    return this.score;
  }

  public void setScore(double score) {
    this.score = score;
  }
}

class Scholarship {

  private String title;
  private HashMap<String, Student0707> scoreMap = new HashMap<>();
  Scanner scanner = new Scanner(System.in);

  public Scholarship(String title) {
    this.title = title;
  }

  public void insertStudent() {
    System.out.println(title + "관리 시스템 입니다.");
    for (int i = 0; i < 5; i++) {
      System.out.println("이름과 학점 입력 >>");
      String name = scanner.next();
      double score = scanner.nextDouble();
      Student0707 student = new Student0707(name, score);
      scoreMap.put(name, student);
    }
  }

  public void selectStudent() {
    System.out.println("장학생 선발 기준 학점을 입력 >>");
    double cutline = scanner.nextDouble();
    System.out.println("장학생 명단은 아래와 같습니다.");
    Set<String> nameSet = scoreMap.keySet();
    Iterator<String> it = nameSet.iterator();
    while (it.hasNext()) {
      String name = it.next();
      Student0707 student = scoreMap.get(name);
      if (student.getScore() >= cutline) {
        System.out.print(student.getName() + "\t");
      }
    }
  }

  public void run() {
    insertStudent();
    selectStudent();
  }
}

public class Practice07 {

  public static void main(String[] args) {
    Scholarship scholarship = new Scholarship("미래 장학금");
    scholarship.run();
  }
}
