package practice;

import java.util.Scanner;

class Player10 {

  private String name;
  private Scanner scanner = new Scanner(System.in);

  public Player10(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public boolean turn() {
    System.out.println(name + "님 <Enter>");
    scanner.nextLine();
    int nums[] = new int[3];
    for (int i = 0; i < 3; i++) {
      nums[i] = (int) (Math.random() * 3 + 1);
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + "\t");
    }

    boolean result = true;
    for (int i = 0; i < nums.length; i++) {
      if (nums[0] != nums[i]) {
        result = false;
        break;
      }
    }
    return result;
  }
}

class Game10 {

  private Player10 players[] = new Player10[3];
  private Scanner scanner = new Scanner(System.in);

  public Game10() {
    for (int i = 0; i < players.length; i++) {
      System.out.println((i + 1) + "번째 선수 이름을 입력하세요. >>");
      String name = scanner.nextLine();
      players[i] = new Player10(name);
    }
  }

  public void run() {
    int next = 0;
    while (true) {
      if (players[next].turn()) {
        System.out.println(players[next].getName() + "님이 이겼습니다.");
        break;
      } else {
        System.out.println("아쉽네요...");
        next++;
        next = next % players.length;
      }
    }
  }
}

public class Practice10 {

  public static void main(String[] args) {
    Game10 game = new Game10();
    game.run();
  }
}
