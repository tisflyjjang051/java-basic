package practice;

import java.util.Scanner;
import java.util.Vector;

class Word {

  private String eng;
  private String kor;

  public Word(String eng, String kor) {
    this.eng = eng;
    this.kor = kor;
  }

  public String getEng() {
    return this.eng;
  }

  public String getKor() {
    return this.kor;
  }
}

class WordQuiz {

  private String title;
  private Vector<Word> vec = new Vector<>();
  Scanner sc = new Scanner(System.in);

  public WordQuiz(String title) {
    this.title = title;

    vec.add(new Word("love", "사랑"));
    vec.add(new Word("animal", "동물"));
    vec.add(new Word("emotion", "감정"));
    vec.add(new Word("human", "인간"));
    vec.add(new Word("stock", "주식"));
    vec.add(new Word("trade", "거래"));
    vec.add(new Word("society", "사회"));
    vec.add(new Word("baby", "아기"));
    vec.add(new Word("honey", "꿀"));
    vec.add(new Word("doll", "인형"));
    vec.add(new Word("bear", "곰"));
    vec.add(new Word("picture", "사진"));
    vec.add(new Word("painting", "그림"));
    vec.add(new Word("fault", "오류"));
    vec.add(new Word("example", "보기"));
    vec.add(new Word("eye", "눈"));
    vec.add(new Word("statue", "조각상"));
  }

  // 메서드(함수)를 정의하는 이유....
  // 기능을 단순화  자판기

  private int makeExample(int example[], int answerIndex) {
    //배열하나 만들어서 집어넣기 , 정답도 넣어놓기....
    int nums[] = { -1, -1, -1, -1 }; // 배열을 생성하면서 값을 넘기는 방법
    int index;
    for (int i = 0; i < 4; i++) {
      while (true) {
        index = (int) (Math.random() * vec.size()); // 3,5,7,8
        // 배열안에는 정다없어야만 함, 중복도 없어야 함....
        if (!(exist(nums, index) || index == answerIndex)) {
          nums[i] = index;
          break;
        }
      }
    }
    for (int i = 0; i < nums.length; i++) {
      example[i] = nums[i];
    }
    return (int) (Math.random() * nums.length);
  }

  private boolean exist(int nums[], int index) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == index) {
        return true;
      }
    }
    return false;
  }

  //exist(nums[0,1,2,3],2)
  public void run() {
    // 문제 네개를 끄집어 내기 (중복없이);
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "영어 단어 맞추기 퀴즈를 시작합니다. -1을 누르면 종료합니다."
    );
    System.out.println("현재 " + vec.size() + "개의 단어가 있습니다.");
    while (true) {
      int answerIndex = (int) (Math.random() * vec.size()); //0~16 3
      String eng = vec.get(answerIndex).getEng(); //human

      int example[] = new int[4];
      makeExample(example, answerIndex); // 문제만들기.... 정답 꽂아 넣기...
      System.out.println(eng + "?");
      for (int i = 0; i < example.length; i++) {
        System.out.print(
          "(" + (i + 1) + ")" + vec.get(example[i]).getKor() + "   "
        );
      }
    }
  }
}

public class OpenChallenge07 {

  public static void main(String[] args) {
    WordQuiz wordQuiz = new WordQuiz("명품영어단어 퀴즈");
    wordQuiz.run();
  }
}
