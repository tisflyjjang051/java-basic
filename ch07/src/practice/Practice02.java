package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice02 {

  public static void main(String[] args) {
    ArrayList<Character> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("6개의 학점을 빈칸으로 구분해서 넣어주세요.");
    for (int i = 0; i < 6; i++) {
      String str = scanner.next();
      char ch = str.charAt(0);
      System.out.println(ch);
      arrayList.add(ch);
    }
    double score = 0.0;
    for (int i = 0; i < 6; i++) {
      char ch = arrayList.get(i);
      //prettier-ignore
      if(ch=='A') score+=4.0;
      else if(ch=='B') score+=3.0;
      else if(ch=='C') score+=2.0;
      else if(ch=='D') score+=1.0;
      else if(ch=='F') score+=0.0;
    }
    System.out.println(score / arrayList.size());
  }
}
