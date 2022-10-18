package ConsoleHome;

public class Door extends RoomObject {

  private String type = "Doors";
  private int roomNumber;

  public Door(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public int switchState() {
    int s = 1;
    if (isState()) {
      System.out.println(
          "Door is closed! Are you want to open the door in room \"" + roomNumber + "\"?");
      System.out.println("Type YES or NO:");
      String in = scanner.nextLine();
      if (in.equalsIgnoreCase("yes")) {
        System.out.println("Room \"" + roomNumber + "\" is opened...");
        setState(false);
      } else if (in.equalsIgnoreCase("no")) {
        s = 0;
      } else {
        invalidInput();
      }
    } else {
      System.out.println(
          "Door is opened! Are you want to close the door in room \"" + roomNumber + "\"?");
      System.out.println("Type YES or NO:");
      String in = scanner.nextLine();
      if (in.equalsIgnoreCase("yes")) {
        System.out.println("Room \"" + roomNumber + "\" is closed...");
        setState(true);
      } else if (in.equalsIgnoreCase("no")) {
        s = 0;
      } else {
        invalidInput();
      }
    }
    return s;
  }

  public String state() {
    if (!isState()) {
      return "OPEN";
    } else {
      return "CLOSE";
    }
  }

  public void getInfo() {
    System.out.println("*******************************");
    System.out.println("Number room:" + roomNumber);
    System.out.println("Status: " + state());
    System.out.println("*******************************");
  }

  public String getID() {
    String s = Integer.toString(roomNumber);
    return s;
  }

  public String getType() {
    return type;
  }
}
