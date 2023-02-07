class Weapon {

  int fire() {
    return 1;
  }
}

class Cannon extends Weapon {

  @Override
  int fire() {
    return 10;
  }
}

public class MethodOverride02 {

  public static void main(String[] args) {
    Weapon weapon;
    weapon = new Weapon();
    System.out.println("기본 무기의 데미지는 " + weapon.fire());
    weapon = new Cannon();
    System.out.println("업그레이드 된 무기의 데미지는 " + weapon.fire());
  }
}
