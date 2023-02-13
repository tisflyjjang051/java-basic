package practice;

import java.util.Scanner;
import java.util.Vector;

class Word {

  private String eng;
  private String kor;

  public Word(String _eng, String _kor) {
    eng = _eng;
    kor = _kor;
  }

  public String getEng() {
    return eng;
  }

  public String getKor() {
    return kor;
  }
}

class WordQuiz {

  private Vector<Word> vec;

  public WordQuiz(Vector<Word> vec) {
    vec = new Vector<Word>();
    vec.add(new Word("love", "사랑"));
    vec.add(new Word("animal", "동물"));
    vec.add(new Word("emotion", "감정"));
    vec.add(new Word("human", "인간"));
    vec.add(new Word("stock", "주식"));
    vec.add(new Word("trade", "거래"));
    vec.add(new Word("society", "사회"));
    vec.add(new Word("baby", "아기"));
    vec.add(new Word("honey", "꿀"));
    vec.add(new Word("dall", "인형"));
    vec.add(new Word("bear", "곰"));
    vec.add(new Word("picture", "사진"));
    vec.add(new Word("painting", "그림"));
    vec.add(new Word("fault", "오류"));
    vec.add(new Word("example", "보기"));
    vec.add(new Word("eye", "눈"));
    vec.add(new Word("statue", "조각상"));
  }
}

public class OpenChallengeKwon {

  public static void main(String[] args) {
    println("*** 영어단어 테스트 프로그램 \"명품 영어\" 입니다. ***");
    Vector<Word> word = new Vector<>();
    WordQuiz quiz = new WordQuiz(word);
    Scanner input = new Scanner(System.in);
    while (true) {
      print("단어 테스트:1, 단어 삽입:2, 종료:3 >>");
      int choise = input.nextInt();
      if (choise == 3) {
        break;
      }
      if (choise == 1) {
        println(
          "현재 " +
          word.size() +
          "개의 영어단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다."
        );
        while (true) {
          int answer = (int) (Math.random() * word.size());
          int[] answerList = setTest(answer, word.size());
          Word thisWord = word.get(answer);
          println(thisWord.getEng() + "?");
          for (int i = 0; i < 4; i++) {
            print("(" + (i + 1) + ")");
            Word fakeWord = word.get(answerList[i]);
            print(fakeWord.getKor() + "  ");
          }
          int choiseTest = input.nextInt();
          if (choiseTest == -1) {
            break;
          }
          Word chooseWord = word.get(answerList[choiseTest - 1]);
          println(chooseWord.getKor() + "" + thisWord.getKor());
          if (chooseWord.getKor().equals(thisWord.getKor())) {
            println("정답입니다!");
          } else {
            println("안타깝습니다.");
          }
        }
      }
      if (choise == 2) {
        println("영어 단어에 \"그만\"을 입력하시면 종료합니다.");
        while (true) {
          print("영어 한글 입력>>");
          String eng = input.next();
          if (eng.equals("그만")) {
            break;
          }
          String kor = input.next();
          word.add(new Word(eng, kor));
        }
      }
    }
  }

  static int[] setTest(int _answer, int _max) {
    int[] arrayReturn = new int[4];
    for (int item : arrayReturn) {
      item = (int) (Math.random() * _max);
    }

    while (true) {
      int count = 0;
      for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
          if (arrayReturn[j] == arrayReturn[i] && j != i) {
            arrayReturn[j] = (int) (Math.random() * _max);
            count++;
          }
        }
        // print("count:" + count + " ");
      }
      if (count == 0) {
        break;
      }
    }
    boolean checker = false;
    for (int item : arrayReturn) {
      if (checker == false) {
        checker = (item == _answer);
      }
    }
    if (!checker) {
      int answer = (int) (Math.random() * 3 + 1);
      arrayReturn[answer] = _answer;
    }
    return arrayReturn;
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
