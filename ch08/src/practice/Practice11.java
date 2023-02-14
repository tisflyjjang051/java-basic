package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

class WordSearch {

  private Vector<String> wordList = new Vector<String>();

  private void wordRead() {
    try {
      File file = new File("c:\\Temp\\words.txt");
      Scanner readWord = new Scanner(new FileReader(file));
      while (readWord.hasNext()) {
        String line = readWord.nextLine();
        wordList.add(line);
      }
      System.out.println(
        "프로젝트 폴더 밑의 " + file.getName() + " 파일을 읽었습니다...."
      );
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private void wordSearching() {
    Scanner scanner = new Scanner(System.in);
    int cnt = 0;
    while (true) {
      System.out.print("단어>> ");
      String Input = scanner.nextLine();
      if (Input.equals("그만")) {
        System.out.println("종료합니다....");

        break;
      }
      for (int i = 0; i < wordList.size(); i++) {
        if (wordList.get(i).startsWith(Input)) {
          System.out.println(wordList.get(i));
          cnt += 1;
        }
      }
      if (cnt == 0) {
        System.out.println("발견할 수 없음");
      }
    }
    scanner.close();
  }

  public void run() {
    wordRead();
    wordSearching();
  }
}

public class Practice11 {

  public static void main(String[] args) {
    WordSearch wordSearch = new WordSearch();
    wordSearch.run();
  }
}
