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
    Player player = new Player("장성호");
    player.turn();

    Computer computer = new Computer("컴퓨터");
    System.out.println(computer.turn());
  }
}
