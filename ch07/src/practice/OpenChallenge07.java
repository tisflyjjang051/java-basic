package p;

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

  private Vector<Word> vec = new Vector<>();
  Scanner sc = new Scanner(System.in);

  public WordQuiz() {
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

  public void gameInit() {
    System.out.println(
      "명품 영어의 단어 테스트 시작 \n현재 17개의 단어가 들어있습니다. -1 입력 시 종료.\n"
    );

    while (true) {
      // 난수가 중복없이 4개 저장되는 정수 배열 (1-17 중에서 4개 골라서)
      int[] seventeen = new int[17];
      for (int i = 0; i < 17; i++) {
        seventeen[i] = i;
      }

      int[] select = new int[4];
      for (int i = 0; i < 4; i++) {
        select[i] = seventeen[(int) (Math.random() * 17)];
        for (int j = 0; j < i; j++) {
          if (select[i] == select[j]) {
            i--;
          }
        }
      }

      // for (int item : select) {
      //   System.out.print(item + ", ");
      // }

      int randomSelect = (int) (Math.random() * 4);
      int answerSelect = select[randomSelect];
      Word wordAnswer = vec.get(answerSelect);

      System.out.println("<<<< " + wordAnswer.getEng() + " >>>>");

      for (int i = 0; i < 4; i++) {
        if (i == randomSelect) {
          System.out.print("(" + (i + 1) + ")" + wordAnswer.getKor() + " ");
        } else {
          Word wordRandom = vec.get(select[i]);
          System.out.print("(" + (i + 1) + ")" + wordRandom.getKor() + " ");
        }
      }

      System.out.print(" : >>>> ");
      int selectAnswer = sc.nextInt();

      if (selectAnswer == -1) {
        break;
      }

      Word wordResult = vec.get(select[selectAnswer - 1]);

      // prettier-ignore
      if (wordResult.getEng().equals(wordAnswer.getEng())) {
        System.out.println("Excellent!!");
      } else {
        System.out.println("No..........");
      }
      System.out.println();
    }
  }
}

public class OpenChallenge07 {

  public static void main(String[] args) {
    WordQuiz wq = new WordQuiz();
    wq.gameInit();
  }
}
