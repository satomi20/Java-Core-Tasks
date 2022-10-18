package ConsoleHome;

import java.util.Scanner;

public abstract class RoomObject {
  private static String type;
  private boolean state = false;
  static Scanner scanner = new Scanner(System.in);
  public boolean isState() {
    return state;
  }

  public RoomObject setState(boolean state) {
    this.state = state;
    return this;
  }

  public String getType() {
    return type;
  }
  public abstract int switchState();
  public abstract void getInfo();
  public abstract String getID();
  public String state() {
    if (isState() == false) {
      return "OPEN";
    } else {
      return "CLOSE";
    }
  }

  public void invalidInput() {
    System.out.println("*******Invalid input! Try again.*******");
  }
}

