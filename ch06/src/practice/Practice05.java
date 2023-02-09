package practice;

import java.util.Calendar;

public class Practice05 {

  public static void main(String[] args) {
    Calendar now = Calendar.getInstance();
    int hour = now.get(Calendar.HOUR_OF_DAY);
    int min = now.get(Calendar.MINUTE);
    System.out.println(hour + ":" + min);
    if (hour > 4 && hour < 12) {
      System.out.println("굳모닝");
    } else if (hour >= 12 && hour < 18) {
      System.out.println("굳 에프터눈");
    } else if (hour >= 18 && hour < 22) {
      System.out.println("굳 이브닝");
    } else {
      System.out.println("굳 나잇");
    }
  }
}
