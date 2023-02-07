interface PhoneInterface {
  public abstract void sendCall();

  public abstract void receiveCall();

  public default void printLogo() {
    System.out.println("===phone===");
  }
}

class Samsung implements PhoneInterface {

  public void sendCall() {
    System.out.println("전화를 겁니다.");
  }

  public void receiveCall() {
    System.out.println("전화왔어요");
  }

  public void special() {
    System.out.println("삼성폰만의 특이한 기능");
  }
}

class Lg implements PhoneInterface {

  public void sendCall() {
    System.out.println("따르릉 따르릉 내가 니 오빠야!!!");
  }

  public void receiveCall() {
    System.out.println("전화왔어요. 안받으면 잡으러 간다.");
  }

  public void special() {
    System.out.println("엘지폰만의 특이한 기능");
  }
}

public class InterfaceEx {

  public static void main(String[] args) {
    Samsung samsung = new Samsung();
    samsung.sendCall();
    Lg lg = new Lg();
    lg.sendCall();
  }
}
