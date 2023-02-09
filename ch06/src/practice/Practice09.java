package practice;

import java.util.Scanner;

class Player {

  private String name;
  private Scanner scanner = new Scanner(System.in);

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int turn() {
    System.out.println(name + "[가위(1), 바위(2), 보(3),  끝내기(4)]");
    return scanner.nextInt();
  }
}

class Computer extends Player {

  public Computer(String name) {
    super(name);
  }

  // Annotation
  @Override
  public int turn() {
    int result = (int) (Math.random() * 3 + 1);
    return result;
  }
}

public class Practice09 {

  public static void main(String[] args) {
    String str[] = { "가위", "바위", "보" };
    int userChoice, computerChoice;
    Player player = new Player("장성호");
    userChoice = player.turn();
    System.out.println(player.getName() + " : " + str[userChoice - 1]);
    Computer computer = new Computer("컴퓨터");
    computerChoice = computer.turn();
    System.out.println(computer.getName() + " : " + str[computerChoice - 1]);
    if (userChoice == computerChoice) {
      System.out.println("비겼습니다.");
    } else if (
      (userChoice == 1 && computerChoice == 2) ||
      (userChoice == 2 && computerChoice == 3) ||
      (userChoice == 3 && computerChoice == 1)
    ) {
      System.out.println(computer.getName() + "가 이겼습니다.");
    } else {
      System.out.println(player.getName() + "가 이겼습니다.");
    }
  }
}
