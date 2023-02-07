interface PhoneInterface {
  public abstract void sendCall();

  public abstract void receiveCall();
}

interface MobileInterface extends PhoneInterface {
  public abstract void sendSMS();

  public abstract void receiveSMS();
}

interface MP3Interface {
  public abstract void musicPlay();

  public abstract void musicStop();
}

class PDA {

  public int calc(int x, int y) {
    return x + y;
  }
}

class Samsung extends PDA implements MobileInterface, MP3Interface {

  public void sendCall() {}

  public void receiveCall() {}

  public void sendSMS() {}

  public void receiveSMS() {}

  public void musicPlay() {}

  public void musicStop() {}
}

public class InterfaceEx02 {}
